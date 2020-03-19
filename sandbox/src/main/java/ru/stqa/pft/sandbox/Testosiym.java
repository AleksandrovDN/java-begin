package ru.stqa.pft.sandbox;

import java.io.File;
import java.io.IOException;

public class Testosiym {

    public static void main(String[] args) {

        // определяем объект для каталога
        /*File dir = new File("E:/Devel/NewDir");
        boolean created = dir.mkdir();
        if(created)
            System.out.println("Folder has been created");/*
        // переименуем каталог
       /* File newDir = new File("C://SomeDir//NewDirRenamed");
        dir.renameTo(newDir);
        // удалим каталог
        boolean deleted = newDir.delete();
        if(deleted)
            System.out.println("Folder has been deleted");*/
        // создадим новый файл

        // определяем объект для каталога
        File myFile = new File("E:/Devel/NewDir/notes.txt");
        System.out.println("File name: " + myFile.getName());
        System.out.println("Parent folder: " + myFile.getParent());
        if(myFile.exists())
            System.out.println("File exists");
        else
            System.out.println("File not found");

        System.out.println("File size: " + myFile.length());
        if(myFile.canRead())
            System.out.println("File can be read");
        else
            System.out.println("File can not be read");

        if(myFile.canWrite())
            System.out.println("File can be written");
        else
            System.out.println("File can not be written");

        // создадим новый файл
        File newFile = new File("E:/Devel/NewDir/notes2.txt");
        try
        {
            boolean created = newFile.createNewFile();
            if(created)
                System.out.println("File has been created");
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

    }
}