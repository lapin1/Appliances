package com.tr.task03.appliance.dao.impl;

import com.tr.task03.appliance.Main;
import com.tr.task03.appliance.bean.*;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class XMLApllianceParser {

    List<Appliance> appliances = new ArrayList<>();
    private static final String FILE_NAME = Main.class.getClassLoader().getResource("appliances.xml").toString();

    public List<Appliance> parse() {

        try {

            SAXBuilder sax = new SAXBuilder();

            Document doc = sax.build(FILE_NAME);
            Element root = doc.getRootElement();

            List<Element> laptops = root.getChildren("laptop");
            List<Element> ovens = root.getChildren("oven");
            List<Element> refrigerators = root.getChildren("refrigerator");
            List<Element> tabletPCs = root.getChildren("tablet-pc");
            List<Element> speaker = root.getChildren("speakers");
            List<Element> vacuumCleaners = root.getChildren("vacuum-cleaner");



            for (Element ovenEl : ovens) {
                Oven oven = new Oven();
                oven.setCategory(Oven.class.getSimpleName());
                oven.setId(Integer.parseInt(ovenEl.getAttributeValue("id")));
                oven.setPrice(Double.parseDouble(ovenEl.getChildText("price")));
                oven.setPowerConsumption(Integer.parseInt(ovenEl.getChildText("power-consumption")));
                oven.setWeight(Integer.parseInt(ovenEl.getChildText("weight")));
                oven.setCapacity(Integer.parseInt(ovenEl.getChildText("capacity")));
                oven.setDepth(Double.parseDouble(ovenEl.getChildText("depth")));
                oven.setHeight(Double.parseDouble(ovenEl.getChildText("height")));
                oven.setWidth(Double.parseDouble(ovenEl.getChildText("width")));

                appliances.add(oven);
            }

            for (Element laptopEl : laptops) {
                Laptop laptop = new Laptop();
                laptop.setCategory(Laptop.class.getSimpleName());
                laptop.setId(Integer.parseInt(laptopEl.getAttributeValue("id")));
                laptop.setPrice(Double.parseDouble(laptopEl.getChildText("price")));
                laptop.setBatteryCapacity(Integer.parseInt(laptopEl.getChildText("battery-capacity")));
                laptop.setOs(laptopEl.getChildText("os"));
                laptop.setMemoryRom(Integer.parseInt(laptopEl.getChildText("memory-rom")));
                laptop.setSystemMemory(Integer.parseInt(laptopEl.getChildText("system-memory")));
                laptop.setCpu(laptopEl.getChildText("cpu"));
                laptop.setDisplayInches(Double.parseDouble(laptopEl.getChildText("display-inches")));

                appliances.add(laptop);
            }

            for (Element refrigeratorEl : refrigerators) {
                Refrigerator refrigerator = new Refrigerator();
                refrigerator.setCategory(Refrigerator.class.getSimpleName());
                refrigerator.setId(Integer.parseInt(refrigeratorEl.getAttributeValue("id")));
                refrigerator.setPrice(Double.parseDouble(refrigeratorEl.getChildText("price")));
                refrigerator.setPowerConsumption(Integer.parseInt(refrigeratorEl.getChildText("power-consumption")));
                refrigerator.setWeight(Integer.parseInt(refrigeratorEl.getChildText("weight")));
                refrigerator.setFreezerCapacity(Integer.parseInt(refrigeratorEl.getChildText("freezer-capacity")));
                refrigerator.setOverallCapacity(Integer.parseInt(refrigeratorEl.getChildText("overall-capacity")));
                refrigerator.setHeight(Double.parseDouble(refrigeratorEl.getChildText("height")));
                refrigerator.setWidth(Double.parseDouble(refrigeratorEl.getChildText("width")));

                appliances.add(refrigerator);
            }

            for (Element tabletPCEl : tabletPCs) {
                TabletPC tabletPC = new TabletPC();
                tabletPC.setCategory(TabletPC.class.getSimpleName());
                tabletPC.setId(Integer.parseInt(tabletPCEl.getAttributeValue("id")));
                tabletPC.setPrice(Double.parseDouble(tabletPCEl.getChildText("price")));
                tabletPC.setBatteryCapacity(Integer.parseInt(tabletPCEl.getChildText("battery-capacity")));
                tabletPC.setDisplayInches(Double.parseDouble(tabletPCEl.getChildText("display-inches")));
                tabletPC.setMemoryRom(Integer.parseInt(tabletPCEl.getChildText("memory-rom")));
                tabletPC.setFlashMemoryCapacity(Integer.parseInt(tabletPCEl.getChildText("flash-memory-capacity")));
                tabletPC.setColor(tabletPCEl.getChildText("color"));


                appliances.add(tabletPC);
            }

            for (Element speakersEl : speaker) {
                Speakers speakers = new Speakers();
                speakers.setCategory(Speakers.class.getSimpleName());
                speakers.setId(Integer.parseInt(speakersEl.getAttributeValue("id")));
                speakers.setPrice(Double.parseDouble(speakersEl.getChildText("price")));
                speakers.setPowerConsumption(Integer.parseInt(speakersEl.getChildText("power-consumption")));
                speakers.setNumberOfSpeakers(Integer.parseInt(speakersEl.getChildText("number-of-speakers")));
                speakers.setFrequencyRange(Integer.parseInt(speakersEl.getChildText("frequency-range")));
                speakers.setCordLength(Integer.parseInt(speakersEl.getChildText("cord-length")));



                appliances.add(speakers);
            }



        } catch (IOException e) {
            e.printStackTrace();
        } catch (JDOMException e) {
            e.printStackTrace();
        }
        return appliances;

    }

}
