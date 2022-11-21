package main;

import decorator.SetDecorator;
import sets.RealWorldSetDecorator;
import sets.ZazerkalyeSetDecorator;
import implement.Set;

public class Main {
    public static void main(String[] args) {
        SetDecorator set = new RealWorldSetDecorator(new Set());
        SetDecorator PolyndromSet = new ZazerkalyeSetDecorator(new Set());
        PolyndromSet.add("Hello\n");//olleH
        PolyndromSet.add("TenET\n");//TEneT
        PolyndromSet.add("sator arepo tenet opera rotas\n");//rotas opera tenet arepo sator
        PolyndromSet.print();
        set.add("ропот");//ропот
        set.print();
        
    }
}
