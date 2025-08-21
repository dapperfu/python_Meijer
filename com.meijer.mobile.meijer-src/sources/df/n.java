package df;

import com.fullstory.FS;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import com.google.firebase.components.MissingDependencyException;
import df.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes8.dex */
public class n implements InterfaceC13677d, Cf.a {

    /* renamed from: i, reason: collision with root package name */
    private static final Kf.b<Set<Object>> f128411i = new Kf.b() { // from class: df.j
        @Override // Kf.b
        public final Object get() {
            return Collections.EMPTY_SET;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final Map<C13676c<?>, Kf.b<?>> f128412a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<C13672A<?>, Kf.b<?>> f128413b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<C13672A<?>, u<?>> f128414c;

    /* renamed from: d, reason: collision with root package name */
    private final List<Kf.b<ComponentRegistrar>> f128415d;

    /* renamed from: e, reason: collision with root package name */
    private Set<String> f128416e;

    /* renamed from: f, reason: collision with root package name */
    private final s f128417f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicReference<Boolean> f128418g;

    /* renamed from: h, reason: collision with root package name */
    private final i f128419h;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Executor f128420a;

        /* renamed from: b, reason: collision with root package name */
        private final List<Kf.b<ComponentRegistrar>> f128421b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private final List<C13676c<?>> f128422c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        private i f128423d = i.f128404a;

        public static /* synthetic */ ComponentRegistrar a(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        public b b(C13676c<?> c13676c) {
            this.f128422c.add(c13676c);
            return this;
        }

        public b c(final ComponentRegistrar componentRegistrar) {
            this.f128421b.add(new Kf.b() { // from class: df.o
                @Override // Kf.b
                public final Object get() {
                    return n.b.a(componentRegistrar);
                }
            });
            return this;
        }

        public b d(Collection<Kf.b<ComponentRegistrar>> collection) {
            this.f128421b.addAll(collection);
            return this;
        }

        public n e() {
            return new n(this.f128420a, this.f128421b, this.f128422c, this.f128423d);
        }

        public b f(i iVar) {
            this.f128423d = iVar;
            return this;
        }

        b(Executor executor) {
            this.f128420a = executor;
        }
    }

    @Override // df.InterfaceC13677d
    public synchronized <T> Kf.b<Set<T>> d(C13672A<T> c13672a) {
        u<?> uVar = this.f128414c.get(c13672a);
        if (uVar != null) {
            return uVar;
        }
        return (Kf.b<Set<T>>) f128411i;
    }

    @Override // df.InterfaceC13677d
    public synchronized <T> Kf.b<T> f(C13672A<T> c13672a) {
        z.c(c13672a, "Null interface requested.");
        return (Kf.b) this.f128413b.get(c13672a);
    }

    private n(Executor executor, Iterable<Kf.b<ComponentRegistrar>> iterable, Collection<C13676c<?>> collection, i iVar) {
        this.f128412a = new HashMap();
        this.f128413b = new HashMap();
        this.f128414c = new HashMap();
        this.f128416e = new HashSet();
        this.f128418g = new AtomicReference<>();
        s sVar = new s(executor);
        this.f128417f = sVar;
        this.f128419h = iVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C13676c.q(sVar, s.class, Hf.d.class, Hf.c.class));
        arrayList.add(C13676c.q(this, Cf.a.class, new Class[0]));
        for (C13676c<?> c13676c : collection) {
            if (c13676c != null) {
                arrayList.add(c13676c);
            }
        }
        this.f128415d = q(iterable);
        n(arrayList);
    }

    public static b m(Executor executor) {
        return new b(executor);
    }

    private void n(List<C13676c<?>> list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<Kf.b<ComponentRegistrar>> it = this.f128415d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = it.next().get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f128419h.a(componentRegistrar));
                        it.remove();
                    }
                } catch (InvalidRegistrarException e10) {
                    it.remove();
                    FS.log_w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            Iterator<C13676c<?>> it2 = list.iterator();
            while (it2.hasNext()) {
                Object[] array = it2.next().j().toArray();
                int length = array.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        Object obj = array[i10];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f128416e.contains(obj.toString())) {
                                it2.remove();
                                break;
                            }
                            this.f128416e.add(obj.toString());
                        }
                        i10++;
                    }
                }
            }
            if (this.f128412a.isEmpty()) {
                p.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f128412a.keySet());
                arrayList2.addAll(list);
                p.a(arrayList2);
            }
            for (final C13676c<?> c13676c : list) {
                this.f128412a.put(c13676c, new t(new Kf.b() { // from class: df.k
                    @Override // Kf.b
                    public final Object get() {
                        return n.j(this.f128405a, c13676c);
                    }
                }));
            }
            arrayList.addAll(t(list));
            arrayList.addAll(u());
            s();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((Runnable) it3.next()).run();
        }
        r();
    }

    private static <T> List<T> q(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    private void r() {
        Boolean bool = this.f128418g.get();
        if (bool != null) {
            o(this.f128412a, bool.booleanValue());
        }
    }

    private void s() {
        for (C13676c<?> c13676c : this.f128412a.keySet()) {
            for (q qVar : c13676c.g()) {
                if (qVar.g() && !this.f128414c.containsKey(qVar.c())) {
                    this.f128414c.put(qVar.c(), u.b(Collections.EMPTY_SET));
                } else if (this.f128413b.containsKey(qVar.c())) {
                    continue;
                } else {
                    if (qVar.f()) {
                        throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", c13676c, qVar.c()));
                    }
                    if (!qVar.g()) {
                        this.f128413b.put(qVar.c(), y.e());
                    }
                }
            }
        }
    }

    private List<Runnable> t(List<C13676c<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (C13676c<?> c13676c : list) {
            if (c13676c.p()) {
                final Kf.b<?> bVar = this.f128412a.get(c13676c);
                for (C13672A<? super Object> c13672a : c13676c.j()) {
                    if (this.f128413b.containsKey(c13672a)) {
                        final y yVar = (y) this.f128413b.get(c13672a);
                        arrayList.add(new Runnable() { // from class: df.l
                            @Override // java.lang.Runnable
                            public final void run() {
                                yVar.g(bVar);
                            }
                        });
                    } else {
                        this.f128413b.put(c13672a, bVar);
                    }
                }
            }
        }
        return arrayList;
    }

    private List<Runnable> u() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry<C13676c<?>, Kf.b<?>> entry : this.f128412a.entrySet()) {
            C13676c<?> key = entry.getKey();
            if (!key.p()) {
                Kf.b<?> value = entry.getValue();
                for (C13672A<? super Object> c13672a : key.j()) {
                    if (!map.containsKey(c13672a)) {
                        map.put(c13672a, new HashSet());
                    }
                    ((Set) map.get(c13672a)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (this.f128414c.containsKey(entry2.getKey())) {
                final u<?> uVar = this.f128414c.get(entry2.getKey());
                for (final Kf.b bVar : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: df.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            uVar.a(bVar);
                        }
                    });
                }
            } else {
                this.f128414c.put((C13672A) entry2.getKey(), u.b((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }

    public void p(boolean z10) {
        HashMap map;
        if (U.d.a(this.f128418g, null, Boolean.valueOf(z10))) {
            synchronized (this) {
                map = new HashMap(this.f128412a);
            }
            o(map, z10);
        }
    }

    public static /* synthetic */ Object j(n nVar, C13676c c13676c) {
        nVar.getClass();
        return c13676c.h().a(new C13673B(c13676c, nVar));
    }

    private void o(Map<C13676c<?>, Kf.b<?>> map, boolean z10) {
        for (Map.Entry<C13676c<?>, Kf.b<?>> entry : map.entrySet()) {
            C13676c<?> key = entry.getKey();
            Kf.b<?> value = entry.getValue();
            if (key.n() || (key.o() && z10)) {
                value.get();
            }
        }
        this.f128417f.e();
    }

    @Override // df.InterfaceC13677d
    public <T> Kf.a<T> h(C13672A<T> c13672a) {
        Kf.b<T> bVarF = f(c13672a);
        if (bVarF == null) {
            return y.e();
        }
        if (bVarF instanceof y) {
            return (y) bVarF;
        }
        return y.f(bVarF);
    }
}
