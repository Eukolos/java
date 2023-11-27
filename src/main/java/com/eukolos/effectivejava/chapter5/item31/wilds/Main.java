package com.eukolos.effectivejava.chapter5.item31.wilds;

import java.util.List;

public class Main {

        public static void main(String[] args) {

            // PECS
            // Producer extend

            List<? extends MusicProducer> musicProducers;
            musicProducers = List.of(new RockProducer(), new MusicProducer());

            for (MusicProducer musicProducer : musicProducers) {
                musicProducer.produce();
            }

            List<? extends  Producer> producers;

            producers = List.of(new RockProducer(), new MusicProducer(), new Producer());


            // Consumer super

            List<? super ConsumerOfEverythingThatBurns>  consumerOfEverythingThatBurns;
            consumerOfEverythingThatBurns = List.of(new ConsumerOfEverythingThatBurns());
            consumerOfEverythingThatBurns.add(new ConsumerOfVegetables());
            consumerOfEverythingThatBurns.add(new ConsumerOfBamboo());

            List<? super ConsumerOfVegetables> consumerOfVegetables;
            consumerOfVegetables = List.of(new ConsumerOfVegetables());
            consumerOfVegetables.add(new ConsumerOfBamboo());


        }
}
