package OOPHW5.service.impl;

import OOPHW5.data.impl.ComputerCase;
import OOPHW5.service.PartsService;
import OOPHW5.service.ToCreateListAndSearchPartable;

import java.util.ArrayList;
import java.util.List;

public class ComputerCaseService extends PartsService<ComputerCase> implements ToCreateListAndSearchPartable<ComputerCase> {
    @Override
    public List<ComputerCase> toCreateList() {
        List<ComputerCase> list = new ArrayList<>();
        list.add(new ComputerCase("Code", "GC-MX3", "Slim Desktop"));
        list.add(new ComputerCase("HIPER", "ORO-4PGB", "Midi-Tower"));
        list.add(new ComputerCase("Cooler Master", "Elite 130", "HTPC"));
        return list;
    }
}
