package T;

import C.AbstractC3025j;
import C.p0;
import C.r0;
import F.o0;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.view.AbstractC6165l;
import androidx.view.InterfaceC6132F;
import androidx.view.InterfaceC6171r;
import androidx.view.InterfaceC6172s;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o2.i;

/* loaded from: classes.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Object f35845a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Map<a, T.b> f35846b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map<b, Set<a>> f35847c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final ArrayDeque<InterfaceC6172s> f35848d = new ArrayDeque<>();

    /* renamed from: e, reason: collision with root package name */
    D.a f35849e;

    static abstract class a {
        public abstract CameraUseCaseAdapter.a b();

        public abstract InterfaceC6172s c();

        static a a(InterfaceC6172s interfaceC6172s, CameraUseCaseAdapter.a aVar) {
            return new T.a(interfaceC6172s, aVar);
        }

        a() {
        }
    }

    private static class b implements InterfaceC6171r {

        /* renamed from: a, reason: collision with root package name */
        private final c f35850a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC6172s f35851b;

        InterfaceC6172s a() {
            return this.f35851b;
        }

        @InterfaceC6132F(AbstractC6165l.a.ON_DESTROY)
        public void onDestroy(InterfaceC6172s interfaceC6172s) {
            this.f35850a.l(interfaceC6172s);
        }

        @InterfaceC6132F(AbstractC6165l.a.ON_START)
        public void onStart(InterfaceC6172s interfaceC6172s) {
            this.f35850a.h(interfaceC6172s);
        }

        @InterfaceC6132F(AbstractC6165l.a.ON_STOP)
        public void onStop(InterfaceC6172s interfaceC6172s) {
            this.f35850a.i(interfaceC6172s);
        }

        b(InterfaceC6172s interfaceC6172s, c cVar) {
            this.f35851b = interfaceC6172s;
            this.f35850a = cVar;
        }
    }

    private b d(InterfaceC6172s interfaceC6172s) {
        synchronized (this.f35845a) {
            try {
                for (b bVar : this.f35847c.keySet()) {
                    if (interfaceC6172s.equals(bVar.a())) {
                        return bVar;
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private boolean f(InterfaceC6172s interfaceC6172s) {
        synchronized (this.f35845a) {
            try {
                b bVarD = d(interfaceC6172s);
                if (bVarD == null) {
                    return false;
                }
                Iterator<a> it = this.f35847c.get(bVarD).iterator();
                while (it.hasNext()) {
                    if (!((T.b) i.g(this.f35846b.get(it.next()))).r().isEmpty()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void g(T.b bVar) {
        synchronized (this.f35845a) {
            try {
                InterfaceC6172s interfaceC6172sJ = bVar.j();
                a aVarA = a.a(interfaceC6172sJ, CameraUseCaseAdapter.A((o0) bVar.a(), (o0) bVar.q()));
                b bVarD = d(interfaceC6172sJ);
                Set<a> hashSet = bVarD != null ? this.f35847c.get(bVarD) : new HashSet<>();
                hashSet.add(aVarA);
                this.f35846b.put(aVarA, bVar);
                if (bVarD == null) {
                    b bVar2 = new b(interfaceC6172sJ, this);
                    this.f35847c.put(bVar2, hashSet);
                    interfaceC6172sJ.getLifecycle().a(bVar2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void j(InterfaceC6172s interfaceC6172s) {
        synchronized (this.f35845a) {
            try {
                b bVarD = d(interfaceC6172s);
                if (bVarD == null) {
                    return;
                }
                Iterator<a> it = this.f35847c.get(bVarD).iterator();
                while (it.hasNext()) {
                    ((T.b) i.g(this.f35846b.get(it.next()))).t();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void m(InterfaceC6172s interfaceC6172s) {
        synchronized (this.f35845a) {
            try {
                Iterator<a> it = this.f35847c.get(d(interfaceC6172s)).iterator();
                while (it.hasNext()) {
                    T.b bVar = this.f35846b.get(it.next());
                    if (!((T.b) i.g(bVar)).r().isEmpty()) {
                        bVar.v();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void a(T.b bVar, r0 r0Var, List<AbstractC3025j> list, Collection<p0> collection, D.a aVar) {
        synchronized (this.f35845a) {
            try {
                i.a(!collection.isEmpty());
                this.f35849e = aVar;
                InterfaceC6172s interfaceC6172sJ = bVar.j();
                b bVarD = d(interfaceC6172sJ);
                if (bVarD == null) {
                    return;
                }
                Set<a> set = this.f35847c.get(bVarD);
                D.a aVar2 = this.f35849e;
                if (aVar2 == null || aVar2.c() != 2) {
                    Iterator<a> it = set.iterator();
                    while (it.hasNext()) {
                        T.b bVar2 = (T.b) i.g(this.f35846b.get(it.next()));
                        if (!bVar2.equals(bVar) && !bVar2.r().isEmpty()) {
                            throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner.");
                        }
                    }
                }
                try {
                    bVar.e().a0(r0Var);
                    bVar.e().Y(list);
                    bVar.b(collection);
                    if (interfaceC6172sJ.getLifecycle().getState().b(AbstractC6165l.b.f55502d)) {
                        h(interfaceC6172sJ);
                    }
                } catch (CameraUseCaseAdapter.CameraException e10) {
                    throw new IllegalArgumentException(e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    T.b b(InterfaceC6172s interfaceC6172s, CameraUseCaseAdapter cameraUseCaseAdapter) {
        synchronized (this.f35845a) {
            try {
                i.b(this.f35846b.get(a.a(interfaceC6172s, cameraUseCaseAdapter.C())) == null, "LifecycleCamera already exists for the given LifecycleOwner and set of cameras");
                T.b bVar = new T.b(interfaceC6172s, cameraUseCaseAdapter);
                if (cameraUseCaseAdapter.I().isEmpty()) {
                    bVar.t();
                }
                if (interfaceC6172s.getLifecycle().getState() == AbstractC6165l.b.f55499a) {
                    return bVar;
                }
                g(bVar);
                return bVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    T.b c(InterfaceC6172s interfaceC6172s, CameraUseCaseAdapter.a aVar) {
        T.b bVar;
        synchronized (this.f35845a) {
            bVar = this.f35846b.get(a.a(interfaceC6172s, aVar));
        }
        return bVar;
    }

    Collection<T.b> e() {
        Collection<T.b> collectionUnmodifiableCollection;
        synchronized (this.f35845a) {
            collectionUnmodifiableCollection = Collections.unmodifiableCollection(this.f35846b.values());
        }
        return collectionUnmodifiableCollection;
    }

    void h(InterfaceC6172s interfaceC6172s) {
        synchronized (this.f35845a) {
            try {
                if (f(interfaceC6172s)) {
                    if (this.f35848d.isEmpty()) {
                        this.f35848d.push(interfaceC6172s);
                    } else {
                        D.a aVar = this.f35849e;
                        if (aVar == null || aVar.c() != 2) {
                            InterfaceC6172s interfaceC6172sPeek = this.f35848d.peek();
                            if (!interfaceC6172s.equals(interfaceC6172sPeek)) {
                                j(interfaceC6172sPeek);
                                this.f35848d.remove(interfaceC6172s);
                                this.f35848d.push(interfaceC6172s);
                            }
                        }
                    }
                    m(interfaceC6172s);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void i(InterfaceC6172s interfaceC6172s) {
        synchronized (this.f35845a) {
            try {
                this.f35848d.remove(interfaceC6172s);
                j(interfaceC6172s);
                if (!this.f35848d.isEmpty()) {
                    m(this.f35848d.peek());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void k() {
        synchronized (this.f35845a) {
            try {
                Iterator<a> it = this.f35846b.keySet().iterator();
                while (it.hasNext()) {
                    T.b bVar = this.f35846b.get(it.next());
                    bVar.u();
                    i(bVar.j());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void l(InterfaceC6172s interfaceC6172s) {
        synchronized (this.f35845a) {
            try {
                b bVarD = d(interfaceC6172s);
                if (bVarD == null) {
                    return;
                }
                i(interfaceC6172s);
                Iterator<a> it = this.f35847c.get(bVarD).iterator();
                while (it.hasNext()) {
                    this.f35846b.remove(it.next());
                }
                this.f35847c.remove(bVarD);
                bVarD.a().getLifecycle().d(bVarD);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    c() {
    }
}
