package com.sohail.M11_Files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.*;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Exercise6 {
    public static void main(String[] args) {
        String path = "src/com/sohail/M11_Files/data.csv";
        File file = new File(path);

        if(file.canRead()) {
            System.out.println("The file " + file.getName() + " can be read.");
            System.out.println("Is file hidden? - " + file.isHidden());
        } else {
            System.out.println("The file " + file.getName() + " can't be read.");
        }


        try {
            Path file_path = Paths.get(path);

            FileOwnerAttributeView ownerView = Files.getFileAttributeView(file_path, FileOwnerAttributeView.class);
            BasicFileAttributeView basicView = Files.getFileAttributeView(file_path, BasicFileAttributeView.class);
            BasicFileAttributes attr = basicView.readAttributes();
            printDetails(ownerView, attr);

            // Change the creation, access, modified times.
            LocalDateTime time = LocalDateTime.now();
            FileTime fileTime = FileTime.from(time.atZone(ZoneId.systemDefault()).toInstant());

            basicView.setTimes(fileTime, fileTime, fileTime);
            printDetails(ownerView, attr);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void printDetails(FileOwnerAttributeView ownerView, BasicFileAttributes attr) {
        try {
            System.out.println("Owner: " + ownerView.getOwner());
            System.out.println("Creation Time: " + attr.creationTime());
            System.out.println("Last Access Time: " + attr.lastAccessTime());
            System.out.println("Last Modified Time: " + attr.lastModifiedTime());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
