package OOPHW5.service.impl;

import OOPHW5.data.impl.Cpu;
import OOPHW5.service.PartsService;
import OOPHW5.service.ToCreateListAndSearchPartable;

import java.util.ArrayList;
import java.util.List;

public class CpuService extends PartsService<Cpu> implements ToCreateListAndSearchPartable<Cpu> {

    @Override
    public List<Cpu> toCreateList() {
        List<Cpu> cpu = new ArrayList<>();
        cpu.add(new Cpu("Intel", "CORE", "i5"));
        cpu.add(new Cpu("Intel", "Pentium", "G6405"));
        cpu.add(new Cpu("AMD", "Ryzen", "5"));
        return cpu;
    }
}
