package polymorphism;

import org.w3c.dom.ls.LSOutput;

class KingdomAnimalia {
    String category=" is a taxonomic category ranking used in biological classification that is below family and above species.";
    String meaning="  consists of animals with very similar groups, but members of different groups usually cannot breed with one another. .";
    String bodyShape = "Dorsoventrally flattened body.";
    String tissues = "Tissues are differentiated from three layers of cells and are triploblastic.";
            String state = "multicellular Organism";
            String nucleus = "Eukaroyic";
            String modeOfNutrition = "Heterotrophic";
            void move(){
                System.out.println("They can move and so have locomotion.");
            }
            void reproduction(){
                System.out.println("Reproduction is generally sexual.");}
    void transport(){
        System.out.println("this is the Kingdom Animalia");
    }

}
class phylum extends KingdomAnimalia {
//            String bodyShape = "Dorsoventrally flattened body.";
//            String tissues = "Tissues are differentiated from three layers of cells and are triploblastic.";
            void transport(){
                System.out.println("this is the phylum");
            }
}

class main{
    public static void main(String[] args) {
        KingdomAnimalia Vedantu = new phylum();
        System.out.println(Vedantu.modeOfNutrition);
        System.out.println();
        Vedantu.transport();
        System.out.println(Vedantu.tissues);

        KingdomAnimalia organ = new Class();
        System.out.println(organ.bodyShape);
        System.out.println();
        organ.transport();
        System.out.println();
        organ.reproduction();

        KingdomAnimalia system=new genus();
        System.out.println(system.meaning);
        System.out.println(system.category);

        Class c = new Class();
        System.out.println(c.feautures);
    }
}

class Class extends KingdomAnimalia{
    String feautures = " All mammals produce and secrete milk from mammary glands to feed their offspring.";
    String adaptation = "adaptations have allowed mammals to survive in places like the cold polar zones and alpine mountain habitats where few other vertebrate animals can live. ";

    void movement(){
        System.out.println("They walk, hop, gallop, and swing from trees. They swim, dive, glide, and even fly!");
    }
    void reproduction(){
        System.out.println( "Monotremes can lay eggs, but most mammals give birth to live young.");
    }

}

class family{

}

class genus extends KingdomAnimalia{
    String category=" is a taxonomic category ranking used in biological classification that is below family and above species.";
    String meaning="  consists of animals with very similar groups, but members of different groups usually cannot breed with one another. ";
}

class species{

}
