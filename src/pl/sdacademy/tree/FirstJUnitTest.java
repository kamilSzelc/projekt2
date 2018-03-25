package pl.sdacademy.tree;

import org.junit.Assert;
import org.junit.Test;

public class FirstJUnitTest {

    @Test
    public void testTree(){
        Tree tree = new Tree();
        tree.add(100);
        tree.add(200);
        tree.add(300);

        Assert.assertTrue(tree.search(100));
    }
}
