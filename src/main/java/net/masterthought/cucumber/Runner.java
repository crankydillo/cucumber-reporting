package net.masterthought.cucumber;


import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Runner {

    public static void main(String[] args) throws Exception {
        File rd = new File("reports");
        List<String> list = new ArrayList<String>();
        for (File f : rd.listFiles()) {
            list.add(f.getAbsolutePath());
        }

        File outputDir = new File("output");

        ReportBuilder reportBuilder = new ReportBuilder(list, outputDir, "", "97", "cucumber-jvm", false, false, 
                false, true, false, "", false);
        reportBuilder.generateReports();

    }

}
