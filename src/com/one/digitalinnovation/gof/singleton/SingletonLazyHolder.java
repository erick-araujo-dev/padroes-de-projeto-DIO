package com.one.digitalinnovation.gof.singleton;

/**Singleton "Lazy Holder".
*
 * @see <a href="https://stackoverflow.com/a/24018148">Referencia</a>
*@author erick-araujo-dev
*/
public class SingletonLazyHolder {
    private static class instaceHolder{
        public static SingletonLazyHolder instance= new SingletonLazyHolder();
    }
    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstance() {
        return instaceHolder.instance;
    }
}


