package co.com.screenplay.project.utils;

import java.io.File;

public class Files {

    private static String pathProject = new File("").getAbsolutePath();
    public static String getRouteUpload(String nameFile) {
        String pathResources = pathProject + "/src/test/resources/file/";
        return pathResources + nameFile;
    }
}
