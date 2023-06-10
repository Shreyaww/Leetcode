class Solution {
    public String defangIPaddr(String address) {
        StringBuilder str = new StringBuilder(20);
        for(int i = 0; i < address.length(); i++){
            if(address.charAt(i) == '.'){
                str.append('[');
                str.append('.');
                str.append(']');
            }
            else{
                str.append(address.charAt(i));
            }
        }
        address = str.toString();
        System.out.println(str);
        return address;
    }
}