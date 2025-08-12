
class AFactory{
    //write a factory method to produce A type objects
    static AAbstract getInstance(String type){
        if(type.equalsIgnoreCase("BB")){
            return new BB();
        }
        else if(type.equalsIgnoreCase("CC")){
            return new CC();
        }
        else{
            new IllegalArgumentException("Wrong A type object requested");
            return null;
        }

    }
}