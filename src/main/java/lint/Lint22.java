package lint;

import java.util.*;

/**
 * @Author: 周秦春
 * @Description:
 * @Date: Create in 2018/4/5 20:43
 * @ModifyBy:
 */
public class Lint22 {

    public List<Integer> flatten(List<NestedInteger> nestedList) {
        // Write your code here
        if (null == nestedList) {
            return null;
        }

        int size = nestedList.size();
        List<Integer> resultList = new ArrayList<Integer>(Math.max(size, 16));

        NestedInteger currentNestInteger;
        Iterator<NestedInteger> currentIterator = nestedList.iterator();
        Deque<Iterator> lastIteratorsQueue = new ArrayDeque<>();
        do {

            while (currentIterator.hasNext()) {
                currentNestInteger = currentIterator.next();
                currentIterator.remove();

                if (currentNestInteger.isInteger()) {
                    resultList.add(currentNestInteger.getInteger());
                } else {
                    lastIteratorsQueue.addFirst(currentIterator);
                    currentIterator = currentNestInteger.getList().iterator();
                }
            }

            if (lastIteratorsQueue.isEmpty()) {
                return resultList;
            } else {
                currentIterator = lastIteratorsQueue.removeFirst();
            }
        } while (true);
    }
}

interface NestedInteger {

    // @return true if this NestedInteger holds a single integer,
    // rather than a nested list.
    public boolean isInteger();

    // @return the single integer that this NestedInteger holds,
    // if it holds a single integer
    // Return null if this NestedInteger holds a nested list
    public Integer getInteger();

    // @return the nested list that this NestedInteger holds,
    // if it holds a nested list
    // Return null if this NestedInteger holds a single integer
    public List<NestedInteger> getList();
}