/**
 * Created by clint on 04-10-2016.
 */
public class IntTree {

    private IntTreeNode overallRoot;

        // pre : max >= 0 (throws IllegalArgumentException if not)
        // post: constructs a sequential tree with given number of
        // nodes

    public IntTree(int max)
    {
        if (max < 0)
        {
            throw new IllegalArgumentException("max: " + max);

        }
        overallRoot = buildTree(1, max);

    }
        // post: returns a sequential tree with n as its root unless
        // n is greater than max, in which case it returns an
        // empty tree

    private IntTreeNode buildTree(int n, int max)
    {
        if (n > max)
        {
            return null;

        }
        else
        {
            return new IntTreeNode(n, buildTree(2 * n, max), buildTree(2 * n + 1, max));
        }
    }

        // post: prints the tree contents using a preorder traversal

    public void printPreorder()
    {
        System.out.print("preorder:");
        printPreorder(overallRoot);
        System.out.println();
    }

    // post: prints in preorder the tree with given root

    private void printPreorder(IntTreeNode root)
    {
        if (root != null)
        {
            System.out.print(" " + root.data);
            printPreorder(root.left);
            printPreorder(root.right);
        }
    }

        // post: prints the tree contents using an inorder traversal

    public void printInorder()
    {
            System.out.print("inorder:");
        printInorder(overallRoot);
        System.out.println();
    }
         // post: prints in inorder the tree with given root

    private void printInorder(IntTreeNode root)
    {
        if (root != null)
        {
            printInorder(root.left);
            System.out.print(" " + root.data);
            printInorder(root.right);
        }
    }

        // post: prints the tree contents using a postorder traversal

    public void printPostorder()
        {
        System.out.print("postorder:");
        printPostorder(overallRoot);
        System.out.println();
        }

        // post: prints in postorder the tree with given root

    private void printPostorder(IntTreeNode root)
    {
        if (root != null)
        {
            printPostorder(root.left);
            printPostorder(root.right);
            System.out.print(" " + root.data);
        }
    }

    // post: prints the tree contents, one per line, following an
    // inorder traversal and using indentation to indicate
    // node depth; prints right to left so that it looks
    // correct when the output is rotated.

    public void printSideways()
    {
        printSideways(overallRoot, 0);
    }

    // post: prints in reversed preorder the tree with given
    // root, indenting each line to the given level

    private void printSideways(IntTreeNode root, int level) {
        if (root != null)
        {
            printSideways(root.right, level + 1);
            for (int i = 0; i < level; i++)
            {
                System.out.print(" ");
            }
            System.out.println(root.data);
            printSideways(root.left, level + 1);
        }

    }


    /////////////////////////////////////////// Opgave 1 ////////////////////////////

    public void countLeftNodes()
    {
        System.out.println(countLeftNodes(overallRoot));
    }

    private int countLeftNodes(IntTreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return 1 + (countLeftNodes(root.left));
        }
    }


    ////////////////////////////////////////////Opgave 2/////////////////////////////////////

    public void countEmpty()
    {
        System.out.println(countEmpty(overallRoot));
    }

    private int countEmpty(IntTreeNode root) {
        if(root == null)
            return 1;
        else
        {
            return countEmpty(root.left) + countEmpty(root.right);
        }
    }

    ///////////////////////////////////////Opgave 3 ///////////////////////////////////////

    public int depthSum()
    {
        int level = 1;
        return depthSum(overallRoot,level);


    }

    private int depthSum(IntTreeNode root, int level)
    {
        if(root == null)
        {
            return 0;
        }
        else
        {
            //System.out.println(level);
            //System.out.println(root.data);
            return level * root.data + (depthSum(root.left,level+1) + depthSum(root.right, level +1));
        }
    }

    /////////////////////Opgave 4///////////////////////////////////////////////
    public int countEvenBranches()
    {
       return  countEvenBranches(overallRoot);
    }

    private int countEvenBranches(IntTreeNode root) {
        if (root == null) {
            return 0;
        } else if (root.left != null && root.data % 2 == 0 || root.right != null && root.data % 2 == 0) {
            return 1 + countEvenBranches(root.left) + countEvenBranches(root.right);
        }
        else
        {
            return countEvenBranches(root.left) + countEvenBranches(root.right);
        }

    }



    ////////////////////////////////////opgave 5 ////////////////////////////////////
    public void printLevel(int n)
    {
        printLevel(overallRoot,n);
    }

    private void printLevel(IntTreeNode root, int level) {
        if (level < 1) {
            throw new IllegalArgumentException();
        }
        if(root == null) return;

        if(level ==1 )
        {
            System.out.println(root.data);
        }
        else
        {
            printLevel(root.left, level-1);
            printLevel(root.right, level -1);
        }
    }

    /////////////////////////////////////opgave 6 ////////////////////////////
    public void printLeaves()
    {
        printLeaves(overallRoot);
    }

    private void printLeaves(IntTreeNode root)
    {
        if(overallRoot == null)
        {
            System.out.println("No Leaves");
        }
        if(root == null)
        {
            return;
        }
        printLeaves(root.right);
        printLeaves(root.left);
        if(root.left == null && root.right == null)
        {
            System.out.println(root.data);
        }
    }


    /////////////////////////////////////opgave 7 /////////////////////////////
    public boolean isFull()
    {
        return isFull(overallRoot);
    }

    private boolean isFull(IntTreeNode root)
    {
        if(root == null)
        {
            return false;
        }

        if(root.left == null && root.right == null)
        {
            return true;
        }
        return isFull(root.right) && isFull(root.left);
    }

    ////////////////////////////opgave 8 /////////////////////////////////
    private String tooString(IntTreeNode root)
    {
        String result = "";

        if (root.left != null && root.right != null)
        {
            result += "(" + root.data + ", " + tooString(root.left) + ", " + tooString(root.right) + ")";
        }
        else if(root.left != null && root.right == null)
        {
            result += "(" + root.data + ", " + tooString(root.left) + ", empty)";
        }
        else if(root.left == null && root.right != null )
        {
            result += "(" + root.data + ", empty, " + tooString(root.right) + ")";
        }
        else
        {
            result += "" + root.data;
        }
        return result;
    }

    public String toString()
    {
        return tooString(overallRoot);
    }


    ///////////////////////////////////////opgave 9 ///////////////////////////////////////////




 }

