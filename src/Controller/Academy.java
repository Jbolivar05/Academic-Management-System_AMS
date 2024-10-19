/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.ComparableObject;
import Model.Student;
import Model.Teacher;
import Model.Tree;

/**
 *
 * @author Jorge
 */
public class Academy {

    Tree treeStudent;
    Tree treeTeacher;

    public Academy() {
        this.treeStudent = null;
        this.treeTeacher = null;
    }

    public void print(Tree tree) {
        if (tree != null) {
            print(tree.leftSon); // Recorre el subárbol izquierdo
            System.out.println(tree.data.toString()); // Imprime el dato del nodo actual (que será un estudiante)
            print(tree.rightSon); // Recorre el subárbol derecho
        }
    }
    

    public Tree addNode(Tree tree, ComparableObject object) {
        return addData(tree, object);
    }

    public Tree addData(Tree tree, ComparableObject newObject) {
        if (tree == null) {

            tree = new Tree(newObject);
            return tree;
        }

        if (newObject.compareTo(tree.data) < 0) {

            tree.leftSon = addData(tree.leftSon, newObject);

        } else if (newObject.compareTo(tree.data) > 0) {

            tree.rightSon = addData(tree.rightSon, newObject);
        }

        return tree;
    }

    public static void main(String[] args) {
        Student p1 = new Student("Jorge", "Jimenez", 1002, 01, null);
        Teacher t1 = new Teacher("Juan","Linares",123,02,null);
        Academy conf = new Academy();        
        conf.print(conf.treeStudent);
        conf.treeStudent = conf.addNode(conf.treeStudent,p1);
        conf.treeTeacher = conf.addNode(conf.treeTeacher,t1);
    }
}

