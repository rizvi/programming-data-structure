package nmn.geeks.driver;

import nmn.geeks.logger.LoggingDrive;
import nmn.geeks.tree.LeafOrderTraversal;
import nmn.geeks.tree.NodeLevel;
import nmn.geeks.tree.TreeNode;

/**
 * Created by naman.nigam on 09/02/16.
 */
public class DriveTree {
    public static LoggingDrive loggingDrive = new LoggingDrive();
    public static void LevelOne(){
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.left = new TreeNode(4);
        root1.right.left = new TreeNode(6);
        root1.right.right = new TreeNode(7);

        TreeNode root2 = new TreeNode(0);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(5);
        root2.left.right = new TreeNode(4);
        root2.right.left = new TreeNode(6);
        root2.right.right = new TreeNode(7);

        /***
         * http://www.geeksforgeeks.org/check-if-leaf-traversal-of-two-binary-trees-is-same/
         */
        if (LeafOrderTraversal.isSame(root1, root2))
            loggingDrive.logger.info("Same");
        else
            loggingDrive.logger.info("Not Same");

        AllowedDriver.nextProblem();
        /***
         * http://www.geeksforgeeks.org/get-level-of-a-node-in-a-binary-tree/
         */
        loggingDrive.logger.info(NodeLevel.getLevel(root1,3));

    }
}
