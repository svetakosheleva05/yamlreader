/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.yamlreader;

import java.io.InputStream;
import java.util.List;
import org.yaml.snakeyaml.Yaml;

/**
 *
 * @author svetl
 */
public class YamelManager {
    
    public void readYamel() {
    
    Yaml yaml = new Yaml();
    InputStream inputStream = this.getClass()
        .getClassLoader()
        .getResourceAsStream("yamlexample.yaml");
    
    List<Person> persons = yaml.load(inputStream);
    
    for (Person person : persons) {
        System.out.println(person.toString());
    }
    }
}
