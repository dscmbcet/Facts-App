package com.example.factsapp.data

import com.example.factsapp.R
import com.example.factsapp.model.Fact
import com.example.factsapp.model.FactType

class Datasource {
    fun loadFacts(): List<Fact> {
        return listOf(
            Fact(
                info = "Armadillos can hold their breath for up to six minutes and are known to walk " +
                        "underwater to cross streams",
                source = "r/funfacts",
                imageId = R.drawable.armadillo,
                type = FactType.NATURE,
                submittedBy = "BenGeorgeNetto"
            ),
            Fact(
                info = "There once lived a Viking called Harald Bluetooth. " +
                        "He was called that because he loved blueberries. " +
                        "The Bluetooth technology we know nowadays, has been named after him. " +
                        "And the symbol are the runic H and B put together",
                source = "r/funfacts",
                imageId = R.drawable.bluetooth,
                type = FactType.FUN,
                submittedBy = "BenGeorgeNetto"
            ),
            Fact(
                info = "There are more trees on earth than stars in the Milky way",
                source = "www.nature.com",
                imageId = R.drawable.milky_trees,
                type = FactType.NATURE,
                submittedBy = "BenGeorgeNetto"
            ),
            Fact(
                info = "In Switzerland it is illegal to own just one guinea pig." +
                        " This is because guinea pigs are social animals, " +
                        "and they are considered victims of abuse if they are alone",
                source = "r/funfacts",
                imageId = R.drawable.guineapig,
                type = FactType.INTERESTING,
                submittedBy = "BenGeorgeNetto"
            ),
            Fact(
                info = "Bees sleep holding each other’s feet",
                source = "r/funfacts",
                imageId = R.drawable.bees,
                type = FactType.NATURE,
                submittedBy = "BenGeorgeNetto"
            ),
            Fact(
                info = "Researchers have found that during thunderstorms plants emit electric " +
                        "discharges along with hydroxyl (OH) and hydroperoxyl (HO2), " +
                        "which can change the surrounding air quality by altering molecules",
                source = "r/interestingasfuck",
                imageId = R.drawable.plants_lightning,
                type = FactType.SCIENCE,
                submittedBy = "BenGeorgeNetto"
            ),
            Fact(
                info = "Koalas have fingerprints that are almost indistinguishable from human fingerprints",
                source = "r/funfacts",
                imageId = R.drawable.koala,
                type = FactType.NATURE,
                submittedBy = "BenGeorgeNetto"
            ),
            Fact(
                info = "You can time travel at the south pole",
                source = "r/funfacts",
                imageId = R.drawable.time_south,
                type = FactType.SCIENCE,
                submittedBy = "BenGeorgeNetto"
            ),

            // Insert your fact here
            Fact(
                info = "The human circulatory system is more than 60,000 miles long (96,560 km!)",
                source = "www.rd.com",
                imageId = R.drawable.circulatory_system,
                type = FactType.SCIENCE,
                submittedBy = "mksiddiq"
            )

        )
    }
}

