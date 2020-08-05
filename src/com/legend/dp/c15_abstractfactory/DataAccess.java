package com.legend.dp.c15_abstractfactory;

import java.util.Locale;
import java.util.ResourceBundle;

public class DataAccess {
    public static String db = ResourceBundle.getBundle("c15.abstractfactory.config", Locale.ENGLISH).getString("db");
    public static String pkgName = "c15.abstractfactory.";

    public static IUser createUser() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return (IUser) Class.forName(pkgName + db + "User").newInstance();
    }

    public static IDepartment createDepartment() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return (IDepartment) Class.forName(pkgName + db + "Department").newInstance();
    }
}
