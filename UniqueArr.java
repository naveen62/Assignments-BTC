package assignments;
class UniqueArr {
    public static void main(String args[]) {
        int empIds[] = {1,2,3,4,5,6,1};
        boolean dupPresent = false;

        for(int i=0;i<empIds.length;i++) {
            for(int j=0;j<empIds.length;j++) {
                if(j != i && empIds[i] == empIds[j]) {
                    dupPresent = true;
                }
            }
        }
        if(dupPresent) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        
    }
}