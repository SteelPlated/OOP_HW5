package OOPHW5.service.impl;

import OOPHW5.data.impl.MotherBoard;
import OOPHW5.service.PartsService;
import OOPHW5.service.ToCreateListAndSearchPartable;

import java.util.ArrayList;
import java.util.List;

public class MotherBoardService extends PartsService<MotherBoard> implements ToCreateListAndSearchPartable<MotherBoard> {
    @Override
    public List<MotherBoard> toCreateList() {
        List<MotherBoard> list = new ArrayList<>();
        list.add(new MotherBoard("MSI", "ATX MPG", 4));
        list.add(new MotherBoard("ASRock", "H510M-HDV", 2));
        list.add(new MotherBoard("MSI", "ATX Z590 PRO", 4));
        return list;
    }
}
