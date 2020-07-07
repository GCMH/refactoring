package com.example.refactoring.chapter6.MoveStatementsIntoFunction;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

    }


    List<Object> renderPerson(OutputStream outStream, Persion person) {
        List<Object> result = new ArrayList<>();
        result.add("<p>${person.name}</p>");
        result.add(renderPhoto(person.photo));
        result.add("<p>title: ${person.photo.title}</p>");
        result.add(emitPhotoData(person.photo));
        result.add("\n");
        return result;
    }

    private Object renderPhoto(String photo) {
        return null;
    }

    String photoDiv(String p) {
        return "<div>" + "<p>title: ${p.title}</p>" +
                emitPhotoData(p) +
                "</div>" + "\n";
    }

    List<String> emitPhotoData(String p) {
        List<String> result = new ArrayList<>();
        result.add("<p>location: ${aPhoto.location}</p>");
        result.add("<p>date: ${aPhoto.date.toDateString()}</p>");
        result.add("\n");
        return result;
    }
}
