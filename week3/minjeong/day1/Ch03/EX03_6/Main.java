package day1.Ch03.EX03_6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Score> myarr = new ArrayList<>();

        myarr.add(new Score(80, 100));
        myarr.add(new Score(100, 50));
        myarr.add(new Score(70, 100));
        myarr.add(new Score(80, 90));

        // 1. Comparable 기준 정렬
        Collections.sort(myarr);
        // 영어 내림차순, 영어 같으면 수학 내림차순

        // 2. Comparator 기준 정렬
        Collections.sort(myarr, new ScoreComparator());
        // 수학 내림차순, 수학 같으면 영어 내림차순

        for (Score s : myarr) {
            System.out.println(s);
        }
    }
}

class Score implements Comparable<Score> {
    int english;
    int math;

    public Score(int english, int math) {
        this.english = english;
        this.math = math;
    }

    @Override
    public int compareTo(Score o) {
        if (this.english == o.english) {
            return o.math - this.math;
        }
        return o.english - this.english;
    }

    @Override
    public String toString() {
        return "Score{" + "english=" + english + ", math=" + math + "}";
    }
}

class ScoreComparator implements Comparator<Score> {
    @Override
    public int compare(Score o1, Score o2) {
        if (o1.math == o2.math) {
            return o2.english - o1.english;
        }
        return o2.math - o1.math;
    }
}