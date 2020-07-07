package com.example.refactoring.chapter6.MoveStatementsToCallers;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    void renderPerson(OutputStream outStream, Person person) throws IOException {
        outStream.write("<p>${person.name}</p>\n".getBytes());
        renderPhoto(outStream, person.photo);
        emitPhotoData(outStream, person.photo);
    }

    private void renderPhoto(OutputStream outStream, Photo photo) {

    }

    void listRecentPhotos(OutputStream outStream, List<Photo> photos) throws IOException {

        photos.stream()
                .filter(p -> p.date > recentDateCutoff())
                .forEach(p -> {
                    try {
                        outStream.write("<div>\n".getBytes());
                        emitPhotoData(outStream, p);
                        outStream.write("</div>\n".getBytes());
                    }catch (Exception e){

                    }
                });
    }

    private int recentDateCutoff() {
        return -1;
    }

    void emitPhotoData(OutputStream outStream, Photo photo) throws IOException {
        outStream.write("<p>title: ${photo.title}</p>\n".getBytes());
        outStream.write("<p>date: ${photo.date.toDateString()}</p>\n".getBytes());
        outStream.write("<p>location: ${photo.location}</p>\n".getBytes());
    }
}
