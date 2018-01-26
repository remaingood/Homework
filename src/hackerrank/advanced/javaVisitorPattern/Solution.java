package hackerrank.advanced.javaVisitorPattern;

import java.util.*;

/*
There are two parts to this challenge.

Part I: Implement Three Different Visitors
Each class has three methods you must write implementations for:

getResult(): Return an integer denoting the , which is different for each class:

The SumInLeavesVisitor implementation must return the sum of the values in the tree's leaves only.
The ProductRedNodesVisitor implementation must return the product of values stored in all red nodes, including leaves, computed modulo . Note that the product of zero values is equal to .
The FancyVisitor implementation must return the absolute difference between the sum of values stored in the tree's non-leaf nodes at even depth and the sum of values stored in the tree's green leaf nodes. Recall that zero is an even number.
visitNode(TreeNode node): Implement the logic responsible for visiting the tree's non-leaf nodes such that the getResult method returns the correct  for the implementing class' visitor.

visitLeaf(TreeLeaf leaf): Implement the logic responsible for visiting the tree's leaf nodes such that the getResult method returns the correct  for the implementing class' visitor.
Part II: Read and Build the Tree
Read the -node tree, where each node is numbered from  to . The tree is given as a list of node values (), a list of node colors (), and a list of edges. Construct this tree as an instance of the Tree class. The tree is always rooted at node number .

Your implementations of the three visitor classes will be tested on the tree you built from the given input.
 */
public class Solution {
    static int values[];
    static Color colors[];
    static Map<Integer, Set<Integer>> nodesMap = new HashMap<>();
    public static Tree solve() {
        Scanner in=new Scanner(System.in);
        int nnodes=in.nextInt();
        values= new int[nnodes];
        for(int i=0;i<nnodes;i++)values[i]=in.nextInt();
        colors = new Color[nnodes];
        for(int i=0;i<nnodes;i++)colors[i]=(in.nextInt()==0)?Color.RED:Color.GREEN;
        Tree rootNode;
        if(nnodes==1){
            rootNode=new TreeLeaf(values[0],colors[0],0);
        }else{
            rootNode=new TreeNode(values[0],colors[0],0);
            for(int i=0;i<(nnodes-1);i++) {
                int u = in.nextInt();
                int v = in.nextInt();
                Set<Integer> uEdges = nodesMap.get(u);
                if(uEdges==null)uEdges = new HashSet<>();
                uEdges.add(v);
                nodesMap.put(u, uEdges);
                Set<Integer> vEdges = nodesMap.get(v);
                if(vEdges==null)vEdges = new HashSet<>();
                vEdges.add(u);
                nodesMap.put(v, vEdges);
            }
            for(int nodeid:nodesMap.get(1)){
                nodesMap.get(nodeid).remove(1);
                createEdge(rootNode, nodeid);
            }
        }
        return rootNode;
    }

    private static void createEdge(Tree parent,int nodeid){
        Set<Integer> nodeEdges = nodesMap.get(nodeid);
        boolean hasChild = nodeEdges!=null && !nodeEdges.isEmpty();
        if(hasChild){
            TreeNode node = new TreeNode(values[nodeid-1],colors[nodeid-1],parent.getDepth()+1);
            ((TreeNode)parent).addChild(node);
            for(int neighborid:nodeEdges){
                nodesMap.get(neighborid).remove(nodeid);
                createEdge(node, neighborid);
            }
        }else{
            TreeLeaf leaf = new TreeLeaf(values[nodeid-1],colors[nodeid-1],parent.getDepth()+1);
            ((TreeNode)parent).addChild(leaf);
        }
        //read the tree from STDIN and return its root as a return value of this function
    }

    public static void main(String[] args) {
        Tree root = solve();
        SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
        ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
        FancyVisitor vis3 = new FancyVisitor();

        root.accept(vis1);
        root.accept(vis2);
        root.accept(vis3);

        int res1 = vis1.getResult();
        int res2 = vis2.getResult();
        int res3 = vis3.getResult();

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }
}

enum Color {
    RED, GREEN
}

abstract class Tree {

    private int value;
    private Color color;
    private int depth;

    public Tree(int value, Color color, int depth) {
        this.value = value;
        this.color = color;
        this.depth = depth;
    }

    public int getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }

    public int getDepth() {
        return depth;
    }

    public abstract void accept(TreeVis visitor);
}

class TreeNode extends Tree {

    private ArrayList<Tree> children = new ArrayList<>();

    public TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitNode(this);

        for (Tree child : children) {
            child.accept(visitor);
        }
    }

    public void addChild(Tree child) {
        children.add(child);
    }
}

class TreeLeaf extends Tree {

    public TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }
}

abstract class TreeVis
{
    public abstract int getResult();
    public abstract void visitNode(TreeNode node);
    public abstract void visitLeaf(TreeLeaf leaf);

}

class SumInLeavesVisitor extends TreeVis{
    int result=0;
    public int getResult(){
        return result;
    }
    public void visitNode(TreeNode node){
    }
    public void visitLeaf(TreeLeaf leaf){
        result+=leaf.getValue();
    }
}
class ProductOfRedNodesVisitor extends TreeVis{
    long result=1;
    final int M=1000000007;
    public int getResult(){
        return (int)result;
    }
    public void visitNode(TreeNode node){
        if(node.getColor()==Color.RED){
            result=(result*node.getValue())%M;
        }
    }
    public void visitLeaf(TreeLeaf leaf){
        if(leaf.getColor()==Color.RED){
            result=(result * leaf.getValue())%M;
        }
    }
}
class FancyVisitor extends TreeVis{
    int even=0;
    int green=0;
    public int getResult(){
        return Math.abs(even-green);
    }
    public void visitNode(TreeNode node){
        if(node.getDepth()%2==0){
            even+=node.getValue();
        }
    }
    public void visitLeaf(TreeLeaf leaf){
        if(leaf.getColor()==Color.GREEN){
            green+=leaf.getValue();
        }
    }
}


