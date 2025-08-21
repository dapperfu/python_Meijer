package androidx.fragment.app;

import Z.n0;
import androidx.fragment.app.Fragment;
import java.lang.reflect.InvocationTargetException;

/* renamed from: androidx.fragment.app.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6123w {
    private static final n0<ClassLoader, n0<String, Class<?>>> sClassCacheMap = new n0<>();

    private static Class<?> loadClass(ClassLoader classLoader, String str) throws ClassNotFoundException {
        n0<ClassLoader, n0<String, Class<?>>> n0Var = sClassCacheMap;
        n0<String, Class<?>> n0Var2 = n0Var.get(classLoader);
        if (n0Var2 == null) {
            n0Var2 = new n0<>();
            n0Var.put(classLoader, n0Var2);
        }
        Class<?> cls = n0Var2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        n0Var2.put(str, cls2);
        return cls2;
    }

    public static Class<? extends Fragment> loadFragmentClass(ClassLoader classLoader, String str) {
        try {
            return loadClass(classLoader, str);
        } catch (ClassCastException e10) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e10);
        } catch (ClassNotFoundException e11) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists", e11);
        }
    }

    public Fragment instantiate(ClassLoader classLoader, String str) {
        try {
            return loadFragmentClass(classLoader, str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e10) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e10);
        } catch (InstantiationException e11) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e11);
        } catch (NoSuchMethodException e12) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e12);
        } catch (InvocationTargetException e13) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e13);
        }
    }

    static boolean isFragmentClass(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(loadClass(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
