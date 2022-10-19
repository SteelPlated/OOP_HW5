package OOPHW5.service.impl;

import OOPHW5.data.impl.GraphicsCard;
import OOPHW5.service.PartsService;
import OOPHW5.service.ToCreateListAndSearchPartable;

import java.util.ArrayList;
import java.util.List;

public class GraphicsCardService extends PartsService<GraphicsCard> implements ToCreateListAndSearchPartable<GraphicsCard> {
    @Override
    public List<GraphicsCard> toCreateList() {
        List<GraphicsCard> list = new ArrayList<>();
        list.add(new GraphicsCard("GIGABYTE", "GeForce", "RTX 3060"));
        list.add(new GraphicsCard("MSI", "GeForce", "RTX 3050"));
        list.add(new GraphicsCard("GIGABYTE", "Radeon", "RX6600XT"));
        return list;
    }
}
