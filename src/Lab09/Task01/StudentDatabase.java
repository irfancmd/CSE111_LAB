package Lab09.Task01;
import java.io.File;
/**
 * Ei class ta database manage kore
 */

public class StudentDatabase {

    Student[] records;

    /**
     * Eita diye vaat khawa jai
     */
    void printDatabase() {
        int c = 0; /* jj*/
        while (c < records.length) { //5
            System.out.println(records[c].toString());
            ++c;
        }
    }

    /**
     * eita name diye sort kore dey
     * This takes no parameter
     */
    void sortByName() {
        //System.out.println("parina");

        Student tmp;
        for (int i = 0; i < records.length; i++) {
            for (int j = 1; j < records.length; j++) {// "batman".compareTo("badman")
                if (records[j - 1].id.compareToIgnoreCase(records[j].id) > 0) {
                    tmp = records[j - 1];
                    records[j - 1] = records[j];
                    records[j] = tmp;
                }
            }

        }

    }

    /**
     * Ricardo er moto strong code likhte pari ami.
     */
    void sortByID() {
        int i, j;
        Student tmp;
        i = 0;
        while (i < records.length) {
            j = 1;
            while (j < records.length) {// "batman".compareTo("badman")
                if (records[j - 1].id.compareTo(records[j].id) > 0) {
                    tmp = records[j - 1];
                    records[j - 1] = records[j];
                    records[j] = tmp;
                }
                ++j;
            }
            ++i;
        }
    }

    void sortBySection() {
        //System.out.println("parina");

        Student tmp;
        for (int i = 0; i < records.length; i++) {
            for (int j = 1; j < records.length; j++) {
                if (records[j - 1].mark > records[j].mark) {
                    tmp = records[j - 1];
                    records[j - 1] = records[j];
                    records[j] = tmp;
                }
            }
        }
    }

    void sortByMark() {
        int i, j;
        Student tmp;
        i = 0;
        while (i < records.length) {
            j = 1;
            while (j < records.length) {
                if (records[j - 1].mark > records[j].mark) {
                    tmp = records[j - 1];
                    records[j - 1] = records[j];
                    records[j] = tmp;
                }
                ++j;
            }
            ++i;
        }
    }
}
