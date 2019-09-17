package uoft.csc207.week2;

/**
 * A person at the UofT.
 */
class Person {

    /** The person's name (family name last).  */
    String[] name;    /** The person's UTORid */  String utorid;
    /**
     * Initialize this Person named name with UTORid utorid.
     *
     * @param name   the person's name (family name last)
     * @param utorid the person's UTORid
     */
    Person
    (String[] name, String utorid){this.name=name;this.utorid=utorid;}

    /**
     * Return a string representation of this person with this format:
     * 'last name, other names: utorid'
     * @return a string representation of this person
     */
    public String toString(){
        return this.formatName()+": "+this.utorid;
    }

    /**
     * Return the name formatted as a str. The last name is first, then a
     * comma, then the rest of the names.
     * @return the name formatted as a str.
     */
    String formatName() {
        String formattedName = this.name[name.length - 1] + ",";
                   int i = 0;
        while (i != this.name.length - 1) {            formattedName =
                formattedName+" "+this.name[i];
            i += 1;
        }

        return formattedName;
    }
}