package l7;

import V6.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final List<String> f148695a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, List<a<?, ?>>> f148696b = new HashMap();

    private static class a<T, R> {

        /* renamed from: a, reason: collision with root package name */
        private final Class<T> f148697a;

        /* renamed from: b, reason: collision with root package name */
        final Class<R> f148698b;

        /* renamed from: c, reason: collision with root package name */
        final i<T, R> f148699c;

        public boolean a(Class<?> cls, Class<?> cls2) {
            return this.f148697a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f148698b);
        }

        public a(Class<T> cls, Class<R> cls2, i<T, R> iVar) {
            this.f148697a = cls;
            this.f148698b = cls2;
            this.f148699c = iVar;
        }
    }

    private synchronized List<a<?, ?>> c(String str) {
        List<a<?, ?>> arrayList;
        try {
            if (!this.f148695a.contains(str)) {
                this.f148695a.add(str);
            }
            arrayList = this.f148696b.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f148696b.put(str, arrayList);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    public synchronized <T, R> void a(String str, i<T, R> iVar, Class<T> cls, Class<R> cls2) {
        c(str).add(new a<>(cls, cls2, iVar));
    }

    public synchronized <T, R> List<i<T, R>> b(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<String> it = this.f148695a.iterator();
        while (it.hasNext()) {
            List<a<?, ?>> list = this.f148696b.get(it.next());
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.a(cls, cls2)) {
                        arrayList.add(aVar.f148699c);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized <T, R> List<Class<R>> d(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<String> it = this.f148695a.iterator();
        while (it.hasNext()) {
            List<a<?, ?>> list = this.f148696b.get(it.next());
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f148698b)) {
                        arrayList.add(aVar.f148698b);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized void e(List<String> list) {
        try {
            ArrayList<String> arrayList = new ArrayList(this.f148695a);
            this.f148695a.clear();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                this.f148695a.add(it.next());
            }
            for (String str : arrayList) {
                if (!list.contains(str)) {
                    this.f148695a.add(str);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
