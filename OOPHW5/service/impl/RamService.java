package OOPHW5.service.impl;

import OOPHW5.data.impl.Ram;
import OOPHW5.service.PartsService;
import OOPHW5.service.ToCreateListAndSearchPartable;

import java.util.ArrayList;
import java.util.List;

public class RamService extends PartsService<Ram> implements ToCreateListAndSearchPartable<Ram> {
    @Override
    public List<Ram> toCreateList() {
        List<Ram> list = new ArrayList<>();
        list.add(new Ram("Hikvision", "HKED4081CBA1D0ZA1", 8));
        list.add(new Ram("Kingston", "KVR26N19S6", 4));
        list.add(new Ram("Transcend", "JM2666HSH", 4));
        return list;
    }
}
