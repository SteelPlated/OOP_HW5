package OOPHW5.service;

import OOPHW5.data.Parts;

import java.util.List;

public class PartsService<T extends Parts> {

    public T searchPartsBrand(String brand, List<T> list){
        for (T i: list) {
            if (i.getBrand().equals(brand)){
                return i;
            }
        }
        return null;
    }

    public T searchPartsModel(String model, List<T> list){
        for (T i: list) {
            if (i.getModel().equals(model)){
                return i;
            }
        }
        return null;
    }

    public String searchParts(int number, List<T> list) {
        for (int i = 0; i < list.size(); i++) {
            if (i + 1 == number){
                return list.get(i).toString();
            }
        }
        return "[ null ]";
    }

    public void print(List<T> list){
        for (int i = 0; i < list.size(); i++){
            System.out.printf("%s. %s\n", i+1, list.get(i));
        }
    }
}
