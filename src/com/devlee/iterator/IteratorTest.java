package com.devlee.iterator;

import java.util.*;

public class IteratorTest {

    // collection interface 내부 요소에 접근할 수 있다.
    public void addLinkedList() {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(4);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(1);

        // iterator 사용
        Iterator<Integer> iterator = linkedList.iterator();
        System.out.println("iterator 를 사용한 경우");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        // for-each 문을 사용한 경우
        System.out.println("\nEnhanced for 문을 사용한 경우");
        for (int t : linkedList) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    public void addSet() {
        Set<String> cars = new HashSet<>();

        cars.add("benz");
        cars.add("lamborghini");
        cars.add("rolls royce");
        cars.add("ferrari");

        // while 문 사용 시
        Iterator<String> iterator = cars.iterator();
        // hasNext() : 해당 이터레이션(iteration)이 다음 요소를 가지고 있으면 true 를 반환하고,
        // 더 이상 다음 요소를 가지고 있지 않으면 false 를 반환합니다.
        while (iterator.hasNext()) {
            // next() : 이터레이션(iteration)의 다음 요소를 반환합니다.
            System.out.println("car : " + iterator.next());
        }

        // for-each 문 사용 시
        for (String car : cars) {
            System.out.println("car : " + car);
        }
    }

    public void updateArrayList() {
        // 컬렉션 생성
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        System.out.println("while문 지나기 전 리스트에 들어있던 값 : " + list);

        // 리스트에 들어있는 값에 각각 '+' 붙이기
        ListIterator<String> listIterator = list.listIterator();
        while(listIterator.hasNext()) {
            Object element = listIterator.next();
            listIterator.set(element + "+");
        }
        System.out.println("while문 지난 후 수정된 결과 : " + list);

        // 리스트에 들어있는 값을 역순으로 표시
        System.out.print("역순 출력 결과 : ");
        while(listIterator.hasPrevious()) {
            Object element = listIterator.previous();
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // for-each 문으로 자료구조를 돌다가 값을 수정, 삭제해야 한다면 ConcurrentModificationException 이 발생합니다.
    public void removeSet() {
        Set<String> numbers = new HashSet<>();

        numbers.add("first");
        numbers.add("second");
        numbers.add("third");
        numbers.add("fourth");

        try {
            for (String num : numbers) {
                numbers.remove(num);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        IteratorTest iteratorTest = new IteratorTest();

        iteratorTest.removeSet();
    }
}
