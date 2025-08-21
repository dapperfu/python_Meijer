package d7;

import com.bumptech.glide.Registry;
import d7.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
public class s {

    /* renamed from: e, reason: collision with root package name */
    private static final c f128259e = new c();

    /* renamed from: f, reason: collision with root package name */
    private static final o<Object, Object> f128260f = new a();

    /* renamed from: a, reason: collision with root package name */
    private final List<b<?, ?>> f128261a;

    /* renamed from: b, reason: collision with root package name */
    private final c f128262b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<b<?, ?>> f128263c;

    /* renamed from: d, reason: collision with root package name */
    private final o2.f<List<Throwable>> f128264d;

    private static class b<Model, Data> {

        /* renamed from: a, reason: collision with root package name */
        private final Class<Model> f128265a;

        /* renamed from: b, reason: collision with root package name */
        final Class<Data> f128266b;

        /* renamed from: c, reason: collision with root package name */
        final p<? extends Model, ? extends Data> f128267c;

        public boolean a(Class<?> cls) {
            return this.f128265a.isAssignableFrom(cls);
        }

        public b(Class<Model> cls, Class<Data> cls2, p<? extends Model, ? extends Data> pVar) {
            this.f128265a = cls;
            this.f128266b = cls2;
            this.f128267c = pVar;
        }

        public boolean b(Class<?> cls, Class<?> cls2) {
            if (a(cls) && this.f128266b.isAssignableFrom(cls2)) {
                return true;
            }
            return false;
        }
    }

    static class c {
        public <Model, Data> r<Model, Data> a(List<o<Model, Data>> list, o2.f<List<Throwable>> fVar) {
            return new r<>(list, fVar);
        }

        c() {
        }
    }

    public s(o2.f<List<Throwable>> fVar) {
        this(fVar, f128259e);
    }

    synchronized <Model, Data> void b(Class<Model> cls, Class<Data> cls2, p<? extends Model, ? extends Data> pVar) {
        a(cls, cls2, pVar, true);
    }

    public synchronized <Model, Data> o<Model, Data> d(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z10 = false;
            for (b<?, ?> bVar : this.f128261a) {
                if (this.f128263c.contains(bVar)) {
                    z10 = true;
                } else if (bVar.b(cls, cls2)) {
                    this.f128263c.add(bVar);
                    arrayList.add(c(bVar));
                    this.f128263c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.f128262b.a(arrayList, this.f128264d);
            }
            if (arrayList.size() == 1) {
                return (o) arrayList.get(0);
            }
            if (!z10) {
                throw new Registry.NoModelLoaderAvailableException((Class<?>) cls, (Class<?>) cls2);
            }
            return f();
        } catch (Throwable th2) {
            this.f128263c.clear();
            throw th2;
        }
    }

    synchronized <Model> List<o<Model, ?>> e(Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b<?, ?> bVar : this.f128261a) {
                if (!this.f128263c.contains(bVar) && bVar.a(cls)) {
                    this.f128263c.add(bVar);
                    arrayList.add(c(bVar));
                    this.f128263c.remove(bVar);
                }
            }
        } finally {
        }
        return arrayList;
    }

    synchronized List<Class<?>> g(Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b<?, ?> bVar : this.f128261a) {
            if (!arrayList.contains(bVar.f128266b) && bVar.a(cls)) {
                arrayList.add(bVar.f128266b);
            }
        }
        return arrayList;
    }

    private static class a implements o<Object, Object> {
        @Override // d7.o
        public boolean a(Object obj) {
            return false;
        }

        @Override // d7.o
        public o.a<Object> b(Object obj, int i10, int i11, X6.g gVar) {
            return null;
        }

        a() {
        }
    }

    s(o2.f<List<Throwable>> fVar, c cVar) {
        this.f128261a = new ArrayList();
        this.f128263c = new HashSet();
        this.f128264d = fVar;
        this.f128262b = cVar;
    }

    private <Model, Data> void a(Class<Model> cls, Class<Data> cls2, p<? extends Model, ? extends Data> pVar, boolean z10) {
        b<?, ?> bVar = new b<>(cls, cls2, pVar);
        List<b<?, ?>> list = this.f128261a;
        list.add(z10 ? list.size() : 0, bVar);
    }

    private <Model, Data> o<Model, Data> c(b<?, ?> bVar) {
        return (o) r7.k.d(bVar.f128267c.d(this));
    }

    private static <Model, Data> o<Model, Data> f() {
        return (o<Model, Data>) f128260f;
    }
}
