package utilities.autotest;


import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

public class DataFileReader {
    Yaml yaml;

    public Iterable<Object> getDataFromFile(String fileName) {


        yaml = new Yaml();
        Iterable<Object> iterable = null;

        try(InputStream inputStream = DataFileReader.class.getResourceAsStream("../../..resources/DataFiles/" + fileName + ".yml")) {
            iterable = yaml.loadAll(inputStream);

            Map<String, String> yamlParsers = (Map<String, String>) yaml.load(inputStream);

            System.out.println(yamlParsers);
        } catch (IOException e) {
            System.out.println("Exception Occured!!!!");
        }

        return iterable;
    }
}
