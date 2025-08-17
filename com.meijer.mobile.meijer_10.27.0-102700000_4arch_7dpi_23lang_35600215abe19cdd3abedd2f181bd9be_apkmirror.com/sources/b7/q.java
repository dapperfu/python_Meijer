package b7;

import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    private final s f60011a;

    /* renamed from: b, reason: collision with root package name */
    private final a f60012b;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Map<Class<?>, C1185a<?>> f60013a = new HashMap();

        /* renamed from: b7.q$a$a, reason: collision with other inner class name */
        private static class C1185a<Model> {

            /* renamed from: a, reason: collision with root package name */
            final List<o<Model, ?>> f60014a;

            public C1185a(List<o<Model, ?>> list) {
                this.f60014a = list;
            }
        }

        public void a() {
            this.f60013a.clear();
        }

        public <Model> List<o<Model, ?>> b(Class<Model> cls) {
            C1185a<?> c1185a = this.f60013a.get(cls);
            if (c1185a == null) {
                return null;
            }
            return (List<o<Model, ?>>) c1185a.f60014a;
        }

        public <Model> void c(Class<Model> cls, List<o<Model, ?>> list) {
            if (this.f60013a.put(cls, new C1185a<>(list)) == null) {
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
        listB = this.f60012b.b(cls);
        if (listB == null) {
            listB = Collections.unmodifiableList(this.f60011a.e(cls));
            this.f60012b.c(cls, listB);
        }
        return listB;
    }

    public synchronized <Model, Data> void a(Class<Model> cls, Class<Data> cls2, p<? extends Model, ? extends Data> pVar) {
        this.f60011a.b(cls, cls2, pVar);
        this.f60012b.a();
    }

    public synchronized List<Class<?>> c(Class<?> cls) {
        return this.f60011a.g(cls);
    }

    private q(s sVar) {
        this.f60012b = new a();
        this.f60011a = sVar;
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
