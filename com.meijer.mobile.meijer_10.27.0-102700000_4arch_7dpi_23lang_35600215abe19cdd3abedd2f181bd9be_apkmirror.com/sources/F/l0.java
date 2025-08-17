package F;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class l0 {

    /* renamed from: a, reason: collision with root package name */
    private final List<g0> f9983a;

    public static String d(l0 l0Var) {
        ArrayList arrayList = new ArrayList();
        Iterator<g0> it = l0Var.f9983a.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getClass().getSimpleName());
        }
        return k0.a(" | ", arrayList);
    }

    public boolean a(Class<? extends g0> cls) {
        Iterator<g0> it = this.f9983a.iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(it.next().getClass())) {
                return true;
            }
        }
        return false;
    }

    public <T extends g0> T b(Class<T> cls) {
        Iterator<g0> it = this.f9983a.iterator();
        while (it.hasNext()) {
            T t10 = (T) it.next();
            if (t10.getClass() == cls) {
                return t10;
            }
        }
        return null;
    }

    public <T extends g0> List<T> c(Class<T> cls) {
        ArrayList arrayList = new ArrayList();
        for (g0 g0Var : this.f9983a) {
            if (cls.isAssignableFrom(g0Var.getClass())) {
                arrayList.add(g0Var);
            }
        }
        return arrayList;
    }

    public l0(List<g0> list) {
        this.f9983a = new ArrayList(list);
    }
}
