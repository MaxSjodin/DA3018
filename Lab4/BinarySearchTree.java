/**
 * Store course information in a binary search tree
 * 
 */
public class BinarySearchTree {
	BSTNode root=null;
	
	public BinarySearchTree() {
		// Empty constructor?
	}
	
	/**
	 * Public interface for inserting data into the datastructure. Utilizes 
	 * a private, more technical method.
	 * @param courseCode, eg "DA3018"
	 * @param courseName, eg "Computer Science"
	 * @param courseCredits, eg 7,5
	 */
	public void insert(String courseCode, String courseName, double courseCredits) {
		BSTNode node = new BSTNode(courseCode, courseName, courseCredits);
		root = insert(root, node);
	}
	
	/**
	 * Insert 'node' into the tree pointed at by 'root'.
	 * @returns The node that should be the root of this subtree.
	 * @param root
	 * @param node
	 * 
	 * WARNING! This method has a bug, it does not behave according to specification!
	 */
	public BSTNode insert(BSTNode root, BSTNode node) {
		if (root==null) {
			return node; // The easy case. Let the current node be the root of a new (sub?)tree.
		} else {
			String currentKey = root.getCourseCode();
			BSTNode left = root.getLeftChild();
			BSTNode right = root.getRightChild();
			if (node.getCourseCode().compareTo(currentKey) < 0) { // left string "before" right string
				left = insert(left, node);
			} else if (node.getCourseCode().compareTo(currentKey) > 0) { // left string "after" right string
				right = insert(right, node);
			}
			
			root.setChildren(left, right);
			return root;
		}
	}
	
	/**
	 * size: Count the number of nodes in the search tree
	 */
	
	public int size() {
        return(size(root)); 
	}
	private int size(BSTNode node) { 
        if (node == null) return(0); 
        else { 
            return(size(node.getLeftChild()) + 1 + size(node.getRightChild())); 
        } 
    }
	/**
	 * find: Find a course given a course code
	 */
	public BSTNode find(String courseCode) {
	     return(find(root, courseCode)); 
	}
	private BSTNode find(BSTNode node, String courseCode) { 
        if(node.getCourseCode().compareTo(courseCode) < 0) { 
            if(node.getLeftChild() == null){
                return(node);
            }
            return(find(node.getLeftChild(), courseCode)); 
        }
        else if(node.getCourseCode().compareTo(courseCode) > 0) {
            if(node.getRightChild() == null){
                return(node);
            }
            return(find(node.getRightChild(), courseCode)); 
        }
        return(node);
    }
	
	
	/**
	 * Nodes in the search tree
	 * This class should be sufficient for the project.
	 * 
	 */
	public class BSTNode {
		private String courseCode;
		private String courseName;
		private double credits;
		private BSTNode left = null;
		private BSTNode right = null;
		
		/**
		 * Constructor
		 * 
		 */
		public BSTNode(String code, String name, double credits) {
			this.courseCode = code;
			this.courseName = name;
			this.credits = credits;
		}
		
		/**
		 * Specify the children of the current node
		 * @param left
		 * @param right
		 */
		public void setChildren(BSTNode left, BSTNode right) {
			this.left = left;
			this.right = right;
		}

		public String getCourseCode() {
			return courseCode;
		}

		public String getCourseName() {
			return courseName;
		}

		public double getCredits() {
			return credits;
		}

		public BSTNode getLeftChild() {
			return left;
		}

		public BSTNode getRightChild() {
			return right;
		}

		
		
	}
}
