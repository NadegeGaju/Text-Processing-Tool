package com.example.textprocessing.Modules;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class DataManagementModule {
    private ArrayList<String> dataList = new ArrayList<>();
    private HashSet<String> dataSet = new HashSet<>();
    private HashMap<Integer, String> dataMap = new HashMap<>();

    public void addToList(String data) {
        dataList.add(data);
    }

    public void addToSet(String data) {
        dataSet.add(data);
    }

    public void addToMap(Integer key, String data) {
        dataMap.put(key, data);
    }

    public ArrayList<String> getList() {
        return dataList;
    }

    public HashSet<String> getSet() {
        return dataSet;
    }

    public HashMap<Integer, String> getMap() {
        return dataMap;
    }
}