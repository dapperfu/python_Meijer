package S6;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes4.dex */
class f {

    /* renamed from: a, reason: collision with root package name */
    private final Set<String> f33325a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private final ClassLoader[] f33326b;

    synchronized boolean b(Class<?> cls, e<?> eVar) {
        Class<?> clsLoadClass;
        String name = cls.getName();
        if (!this.f33325a.add(name)) {
            return false;
        }
        String[] strArrA = a(name);
        for (ClassLoader classLoader : this.f33326b) {
            for (String str : strArrA) {
                try {
                    clsLoadClass = classLoader.loadClass(str);
                } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
                }
                if (d.class.isAssignableFrom(clsLoadClass)) {
                    ((d) clsLoadClass.getDeclaredConstructor(null).newInstance(null)).a(eVar);
                    return true;
                }
            }
        }
        return false;
    }

    private String[] a(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf == -1) {
            return new String[]{String.format("_%s_DslJsonConverter", str)};
        }
        String strSubstring = str.substring(0, iLastIndexOf);
        String strSubstring2 = str.substring(iLastIndexOf + 1);
        return new String[]{String.format("%s._%s_DslJsonConverter", strSubstring, strSubstring2), String.format("dsl_json.%s._%s_DslJsonConverter", strSubstring, strSubstring2), String.format("dsl_json.%s.%sDslJsonConverter", strSubstring, strSubstring2)};
    }

    f(Collection<ClassLoader> collection) {
        this.f33326b = (ClassLoader[]) collection.toArray(new ClassLoader[0]);
    }
}
