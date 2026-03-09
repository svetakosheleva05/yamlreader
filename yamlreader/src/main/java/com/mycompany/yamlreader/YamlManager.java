/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.yamlreader;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.yaml.snakeyaml.Yaml;

/**
 *
 * @author svetl
 */
public class YamlManager {
    
    public void readYamel() {
    
    Yaml yaml = new Yaml();
    InputStream inputStream = this.getClass()
        .getClassLoader()
        .getResourceAsStream("yamlexample.yaml");
    
    List<Map<String, Object>> personsRaw = yaml.load(inputStream);
    List<Person> persons = new ArrayList<>();
    for (Map map : personsRaw) {
        persons.add(new Person((String) map.get("name"), (String) map.get("surname"), (String) map.get("address")));
    }

    for (Person person : persons) {
        System.out.println(person);
    }
    }
}
