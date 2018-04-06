package lint;

import java.util.List;

public class Lint30 {

    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {

        if (null == newInterval || null == intervals) {
            return intervals;
        } else if (intervals.isEmpty()) {

            intervals.add(newInterval);
            return intervals;
        }

        Interval currentInterval;
        int position;
        for (position = 0; position < intervals.size(); position++) {

            currentInterval = intervals.get(position);

            if (currentInterval.start > newInterval.end) {
                break;
            } else if (currentInterval.end < newInterval.start) {
                continue;
            } else {
                newInterval.start = Math.min(currentInterval.start, newInterval.start);
                newInterval.end = Math.max(currentInterval.end, newInterval.end);
                intervals.remove(position);
                position--;
            }
        }

        intervals.add(position, newInterval);
        return intervals;
    }
}

class Interval {
    int start, end;

    Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}
