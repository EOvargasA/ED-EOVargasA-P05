/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedas;

/**
 *
 * @author Osiris
 */
public class Binaria extends Fetch {

    @Override
    int fetch(int n) {
        int start = 0, end = this.vector.length - 1, middle;
        boolean exist;
        do{
            exist = false;
            middle = (start + end)/2;
            if (n == this.vector[middle]){
                return middle;
            }
            if (n >= this.vector[start]&&n<= this.vector[middle]){
                exist = true;
                end = middle - 1;
            }else{
                if (n >= this.vector[middle]&&n<= this.vector[end]){
                    exist = true;
                    start = middle + 1;
                }
            }
        }while(exist == true);
        return -1;
    }
}
