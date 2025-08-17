package bf;

import bf.n;
import com.fullstory.FS;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import com.google.firebase.components.MissingDependencyException;
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

/* loaded from: classes7.dex */
public class n implements InterfaceC6246d, Af.a {

    /* renamed from: i, reason: collision with root package name */
    private static final If.b<Set<Object>> f60176i = new If.b() { // from class: bf.j
        @Override // If.b
        public final Object get() {
            return Collections.EMPTY_SET;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final Map<C6245c<?>, If.b<?>> f60177a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<C6241A<?>, If.b<?>> f60178b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<C6241A<?>, u<?>> f60179c;

    /* renamed from: d, reason: collision with root package name */
    private final List<If.b<ComponentRegistrar>> f60180d;

    /* renamed from: e, reason: collision with root package name */
    private Set<String> f60181e;

    /* renamed from: f, reason: collision with root package name */
    private final s f60182f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicReference<Boolean> f60183g;

    /* renamed from: h, reason: collision with root package name */
    private final i f60184h;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Executor f60185a;

        /* renamed from: b, reason: collision with root package name */
        private final List<If.b<ComponentRegistrar>> f60186b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private final List<C6245c<?>> f60187c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        private i f60188d = i.f60169a;

        public static /* synthetic */ ComponentRegistrar a(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        public b b(C6245c<?> c6245c) {
            this.f60187c.add(c6245c);
            return this;
        }

        public b c(final ComponentRegistrar componentRegistrar) {
            this.f60186b.add(new If.b() { // from class: bf.o
                @Override // If.b
                public final Object get() {
                    return n.b.a(componentRegistrar);
                }
            });
            return this;
        }

        public b d(Collection<If.b<ComponentRegistrar>> collection) {
            this.f60186b.addAll(collection);
            return this;
        }

        public n e() {
            return new n(this.f60185a, this.f60186b, this.f60187c, this.f60188d);
        }

        public b f(i iVar) {
            this.f60188d = iVar;
            return this;
        }

        b(Executor executor) {
            this.f60185a = executor;
        }
    }

    @Override // bf.InterfaceC6246d
    public synchronized <T> If.b<Set<T>> b(C6241A<T> c6241a) {
        u<?> uVar = this.f60179c.get(c6241a);
        if (uVar != null) {
            return uVar;
        }
        return (If.b<Set<T>>) f60176i;
    }

    @Override // bf.InterfaceC6246d
    public synchronized <T> If.b<T> g(C6241A<T> c6241a) {
        z.c(c6241a, "Null interface requested.");
        return (If.b) this.f60178b.get(c6241a);
    }

    private n(Executor executor, Iterable<If.b<ComponentRegistrar>> iterable, Collection<C6245c<?>> collection, i iVar) {
        this.f60177a = new HashMap();
        this.f60178b = new HashMap();
        this.f60179c = new HashMap();
        this.f60181e = new HashSet();
        this.f60183g = new AtomicReference<>();
        s sVar = new s(executor);
        this.f60182f = sVar;
        this.f60184h = iVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C6245c.q(sVar, s.class, Ff.d.class, Ff.c.class));
        arrayList.add(C6245c.q(this, Af.a.class, new Class[0]));
        for (C6245c<?> c6245c : collection) {
            if (c6245c != null) {
                arrayList.add(c6245c);
            }
        }
        this.f60180d = q(iterable);
        n(arrayList);
    }

    public static b m(Executor executor) {
        return new b(executor);
    }

    private void n(List<C6245c<?>> list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<If.b<ComponentRegistrar>> it = this.f60180d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = it.next().get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f60184h.a(componentRegistrar));
                        it.remove();
                    }
                } catch (InvalidRegistrarException e10) {
                    it.remove();
                    FS.log_w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            Iterator<C6245c<?>> it2 = list.iterator();
            while (it2.hasNext()) {
                Object[] array = it2.next().j().toArray();
                int length = array.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        Object obj = array[i10];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f60181e.contains(obj.toString())) {
                                it2.remove();
                                break;
                            }
                            this.f60181e.add(obj.toString());
                        }
                        i10++;
                    }
                }
            }
            if (this.f60177a.isEmpty()) {
                p.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f60177a.keySet());
                arrayList2.addAll(list);
                p.a(arrayList2);
            }
            for (final C6245c<?> c6245c : list) {
                this.f60177a.put(c6245c, new t(new If.b() { // from class: bf.k
                    @Override // If.b
                    public final Object get() {
                        return n.j(this.f60170a, c6245c);
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
        Boolean bool = this.f60183g.get();
        if (bool != null) {
            o(this.f60177a, bool.booleanValue());
        }
    }

    private void s() {
        for (C6245c<?> c6245c : this.f60177a.keySet()) {
            for (q qVar : c6245c.g()) {
                if (qVar.g() && !this.f60179c.containsKey(qVar.c())) {
                    this.f60179c.put(qVar.c(), u.b(Collections.EMPTY_SET));
                } else if (this.f60178b.containsKey(qVar.c())) {
                    continue;
                } else {
                    if (qVar.f()) {
                        throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", c6245c, qVar.c()));
                    }
                    if (!qVar.g()) {
                        this.f60178b.put(qVar.c(), y.e());
                    }
                }
            }
        }
    }

    private List<Runnable> t(List<C6245c<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (C6245c<?> c6245c : list) {
            if (c6245c.p()) {
                final If.b<?> bVar = this.f60177a.get(c6245c);
                for (C6241A<? super Object> c6241a : c6245c.j()) {
                    if (this.f60178b.containsKey(c6241a)) {
                        final y yVar = (y) this.f60178b.get(c6241a);
                        arrayList.add(new Runnable() { // from class: bf.l
                            @Override // java.lang.Runnable
                            public final void run() {
                                yVar.g(bVar);
                            }
                        });
                    } else {
                        this.f60178b.put(c6241a, bVar);
                    }
                }
            }
        }
        return arrayList;
    }

    private List<Runnable> u() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry<C6245c<?>, If.b<?>> entry : this.f60177a.entrySet()) {
            C6245c<?> key = entry.getKey();
            if (!key.p()) {
                If.b<?> value = entry.getValue();
                for (C6241A<? super Object> c6241a : key.j()) {
                    if (!map.containsKey(c6241a)) {
                        map.put(c6241a, new HashSet());
                    }
                    ((Set) map.get(c6241a)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (this.f60179c.containsKey(entry2.getKey())) {
                final u<?> uVar = this.f60179c.get(entry2.getKey());
                for (final If.b bVar : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: bf.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            uVar.a(bVar);
                        }
                    });
                }
            } else {
                this.f60179c.put((C6241A) entry2.getKey(), u.b((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }

    public void p(boolean z10) {
        HashMap map;
        if (U.d.a(this.f60183g, null, Boolean.valueOf(z10))) {
            synchronized (this) {
                map = new HashMap(this.f60177a);
            }
            o(map, z10);
        }
    }

    public static /* synthetic */ Object j(n nVar, C6245c c6245c) {
        nVar.getClass();
        return c6245c.h().a(new C6242B(c6245c, nVar));
    }

    private void o(Map<C6245c<?>, If.b<?>> map, boolean z10) {
        for (Map.Entry<C6245c<?>, If.b<?>> entry : map.entrySet()) {
            C6245c<?> key = entry.getKey();
            If.b<?> value = entry.getValue();
            if (key.n() || (key.o() && z10)) {
                value.get();
            }
        }
        this.f60182f.e();
    }

    @Override // bf.InterfaceC6246d
    public <T> If.a<T> e(C6241A<T> c6241a) {
        If.b<T> bVarG = g(c6241a);
        if (bVarG == null) {
            return y.e();
        }
        if (bVarG instanceof y) {
            return (y) bVarG;
        }
        return y.f(bVarG);
    }
}
