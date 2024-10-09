package org.example;

import java.util.LinkedList;
import java.util.List;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class Main {
    public static void main(String[] args) {
        // TODO: add missing sections
        howAboutSomeStubbing();
        // TODO: add missing sections
        spyOnRealObjects();
        // TODO: add missing sections
    }

    private static void howAboutSomeStubbing() {
        // Mock a LinkedList
        LinkedList<String> mockedList = mock(LinkedList.class);

        // Stubbing
        when(mockedList.get(0)).thenReturn("first");
        when(mockedList.get(1)).thenThrow(new RuntimeException());

        // return the stubbed value
        System.out.println("mockedList.get(0): " + mockedList.get(0));

        try {
            // return the stubbed value == throws RuntimeException | this case
            System.out.println("mockedList.get(1): " + mockedList.get(1));
        } catch (RuntimeException e) {
            System.out.println("mockedList.get(1) threw RuntimeException");
        }

        // if a value is NOT stubbed -> return the wrapper value, that it's "null" | this case
        System.out.println("mockedList.get(999): " + mockedList.get(999));

        // Verifying that get(0) was called
        verify(mockedList).get(0);
    }

    private static void spyOnRealObjects() {
        List list = new LinkedList();
        List spy = spy(list);

        // 1. if you want to stub a spy -> sometimes it's NECESSARY to use `doReturn`|`Answer`|`Throw()` family
        //NOT stubbed yet & it's a spy -> real method is called, and since list is empty -> throws IndexOutOfBoundsException
        try {
            when(spy.get(0)).thenReturn("foo");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("spy.get(0) threw IndexOutOfBoundsException");
        }

        //You have to use doReturn() for stubbing
        doReturn("foo").when(spy).get(0);

        // 2. stub a spy
        when(spy.size()).thenReturn(100);

        // 3. spy can call *real* methods
        spy.add("one");
        spy.add("two");

        // 4. stub takes priority, ALTHOUGH you call real method afterward
        System.out.println(spy.get(0));
        System.out.println(spy.get(1));

        //size() method was stubbed -> NOT taking real ones
        System.out.println(spy.size());

        //optionally, you can verify
        verify(spy).add("one");
        verify(spy).add("two");
    }
}