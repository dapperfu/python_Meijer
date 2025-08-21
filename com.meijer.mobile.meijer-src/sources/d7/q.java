package d7;

import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    private final s f128246a;

    /* renamed from: b, reason: collision with root package name */
    private final a f128247b;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Map<Class<?>, C2018a<?>> f128248a = new HashMap();

        /* renamed from: d7.q$a$a, reason: collision with other inner class name */
        private static class C2018a<Model> {

            /* renamed from: a, reason: collision with root package name */
            final List<o<Model, ?>> f128249a;

            public C2018a(List<o<Model, ?>> list) {
                this.f128249a = list;
            }
        }

        public void a() {
            this.f128248a.clear();
        }

        public <Model> List<o<Model, ?>> b(Class<Model> cls) {
            C2018a<?> c2018a = this.f128248a.get(cls);
            if (c2018a == null) {
                return null;
            }
            return (List<o<Model, ?>>) c2018a.f128249a;
        }

        public <Model> void c(Class<Model> cls, List<o<Model, ?>> list) {
            if (this.f128248a.put(cls, new C2018a<>(list)) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }

        a() {
        }
    }

    public q(o2.f<List<Throwable>> fVar) {
        this(new s(fVar));
    }

    private synchronized <A> List<o<A, ?>> e(Class<A> cls) {
        List<o<A, ?>> listB;
        listB = this.f128247b.b(cls);
        if (listB == null) {
            listB = Collections.unmodifiableList(this.f128246a.e(cls));
            this.f128247b.c(cls, listB);
        }
        return listB;
    }

    public synchronized <Model, Data> void a(Class<Model> cls, Class<Data> cls2, p<? extends Model, ? extends Data> pVar) {
        this.f128246a.b(cls, cls2, pVar);
        this.f128247b.a();
    }

    public synchronized List<Class<?>> c(Class<?> cls) {
        return this.f128246a.g(cls);
    }

    private q(s sVar) {
        this.f128247b = new a();
        this.f128246a = sVar;
    }

    private static <A> Class<A> b(A a10) {
        return (Class<A>) a10.getClass();
    }

    public <A> List<o<A, ?>> d(A a10) {
        List<o<A, ?>> listE = e(b(a10));
        if (!listE.isEmpty()) {
            int size = listE.size();
            List<o<A, ?>> arrayList = Collections.EMPTY_LIST;
            boolean z10 = true;
            for (int i10 = 0; i10 < size; i10++) {
                o<A, ?> oVar = listE.get(i10);
                if (oVar.a(a10)) {
                    if (z10) {
                        arrayList = new ArrayList<>(size - i10);
                        z10 = false;
                    }
                    arrayList.add(oVar);
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
            throw new Registry.NoModelLoaderAvailableException(a10, listE);
        }
        throw new Registry.NoModelLoaderAvailableException(a10);
    }
}
