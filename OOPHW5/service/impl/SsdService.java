package OOPHW5.service.impl;

import OOPHW5.data.impl.Ssd;
import OOPHW5.service.PartsService;
import OOPHW5.service.ToCreateListAndSearchPartable;

import java.util.ArrayList;
import java.util.List;

public class SsdService extends PartsService<Ssd> implements ToCreateListAndSearchPartable<Ssd> {
    @Override
    public List<Ssd> toCreateList() {
        List<Ssd> list = new ArrayList<>();
        list.add(new Ssd("Kingston", "SA400S37", 120));
        list.add(new Ssd("Netac", "NT01N600S", 256));
        list.add(new Ssd("Netac", "NT01N930E", 256));
        list.add(new Ssd("Patriot", "P210S256G25", 256));
        return list;
    }
}
