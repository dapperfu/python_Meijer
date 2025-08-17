package T;

import C.AbstractC2967j;
import C.p0;
import C.r0;
import F.o0;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.view.AbstractC6023l;
import androidx.view.InterfaceC5990F;
import androidx.view.InterfaceC6029r;
import androidx.view.InterfaceC6030s;
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
    private final Object f34750a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Map<a, T.b> f34751b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map<b, Set<a>> f34752c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final ArrayDeque<InterfaceC6030s> f34753d = new ArrayDeque<>();

    /* renamed from: e, reason: collision with root package name */
    D.a f34754e;

    static abstract class a {
        public abstract CameraUseCaseAdapter.a b();

        public abstract InterfaceC6030s c();

        static a a(InterfaceC6030s interfaceC6030s, CameraUseCaseAdapter.a aVar) {
            return new T.a(interfaceC6030s, aVar);
        }

        a() {
        }
    }

    private static class b implements InterfaceC6029r {

        /* renamed from: a, reason: collision with root package name */
        private final c f34755a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC6030s f34756b;

        InterfaceC6030s a() {
            return this.f34756b;
        }

        @InterfaceC5990F(AbstractC6023l.a.ON_DESTROY)
        public void onDestroy(InterfaceC6030s interfaceC6030s) {
            this.f34755a.l(interfaceC6030s);
        }

        @InterfaceC5990F(AbstractC6023l.a.ON_START)
        public void onStart(InterfaceC6030s interfaceC6030s) {
            this.f34755a.h(interfaceC6030s);
        }

        @InterfaceC5990F(AbstractC6023l.a.ON_STOP)
        public void onStop(InterfaceC6030s interfaceC6030s) {
            this.f34755a.i(interfaceC6030s);
        }

        b(InterfaceC6030s interfaceC6030s, c cVar) {
            this.f34756b = interfaceC6030s;
            this.f34755a = cVar;
        }
    }

    private b d(InterfaceC6030s interfaceC6030s) {
        synchronized (this.f34750a) {
            try {
                for (b bVar : this.f34752c.keySet()) {
                    if (interfaceC6030s.equals(bVar.a())) {
                        return bVar;
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private boolean f(InterfaceC6030s interfaceC6030s) {
        synchronized (this.f34750a) {
            try {
                b bVarD = d(interfaceC6030s);
                if (bVarD == null) {
                    return false;
                }
                Iterator<a> it = this.f34752c.get(bVarD).iterator();
                while (it.hasNext()) {
                    if (!((T.b) i.g(this.f34751b.get(it.next()))).r().isEmpty()) {
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
        synchronized (this.f34750a) {
            try {
                InterfaceC6030s interfaceC6030sJ = bVar.j();
                a aVarA = a.a(interfaceC6030sJ, CameraUseCaseAdapter.A((o0) bVar.a(), (o0) bVar.q()));
                b bVarD = d(interfaceC6030sJ);
                Set<a> hashSet = bVarD != null ? this.f34752c.get(bVarD) : new HashSet<>();
                hashSet.add(aVarA);
                this.f34751b.put(aVarA, bVar);
                if (bVarD == null) {
                    b bVar2 = new b(interfaceC6030sJ, this);
                    this.f34752c.put(bVar2, hashSet);
                    interfaceC6030sJ.getLifecycle().a(bVar2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void j(InterfaceC6030s interfaceC6030s) {
        synchronized (this.f34750a) {
            try {
                b bVarD = d(interfaceC6030s);
                if (bVarD == null) {
                    return;
                }
                Iterator<a> it = this.f34752c.get(bVarD).iterator();
                while (it.hasNext()) {
                    ((T.b) i.g(this.f34751b.get(it.next()))).t();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void m(InterfaceC6030s interfaceC6030s) {
        synchronized (this.f34750a) {
            try {
                Iterator<a> it = this.f34752c.get(d(interfaceC6030s)).iterator();
                while (it.hasNext()) {
                    T.b bVar = this.f34751b.get(it.next());
                    if (!((T.b) i.g(bVar)).r().isEmpty()) {
                        bVar.v();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void a(T.b bVar, r0 r0Var, List<AbstractC2967j> list, Collection<p0> collection, D.a aVar) {
        synchronized (this.f34750a) {
            try {
                i.a(!collection.isEmpty());
                this.f34754e = aVar;
                InterfaceC6030s interfaceC6030sJ = bVar.j();
                b bVarD = d(interfaceC6030sJ);
                if (bVarD == null) {
                    return;
                }
                Set<a> set = this.f34752c.get(bVarD);
                D.a aVar2 = this.f34754e;
                if (aVar2 == null || aVar2.c() != 2) {
                    Iterator<a> it = set.iterator();
                    while (it.hasNext()) {
                        T.b bVar2 = (T.b) i.g(this.f34751b.get(it.next()));
                        if (!bVar2.equals(bVar) && !bVar2.r().isEmpty()) {
                            throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner.");
                        }
                    }
                }
                try {
                    bVar.e().a0(r0Var);
                    bVar.e().Y(list);
                    bVar.b(collection);
                    if (interfaceC6030sJ.getLifecycle().getState().b(AbstractC6023l.b.f55278d)) {
                        h(interfaceC6030sJ);
                    }
                } catch (CameraUseCaseAdapter.CameraException e10) {
                    throw new IllegalArgumentException(e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    T.b b(InterfaceC6030s interfaceC6030s, CameraUseCaseAdapter cameraUseCaseAdapter) {
        synchronized (this.f34750a) {
            try {
                i.b(this.f34751b.get(a.a(interfaceC6030s, cameraUseCaseAdapter.C())) == null, "LifecycleCamera already exists for the given LifecycleOwner and set of cameras");
                T.b bVar = new T.b(interfaceC6030s, cameraUseCaseAdapter);
                if (cameraUseCaseAdapter.I().isEmpty()) {
                    bVar.t();
                }
                if (interfaceC6030s.getLifecycle().getState() == AbstractC6023l.b.f55275a) {
                    return bVar;
                }
                g(bVar);
                return bVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    T.b c(InterfaceC6030s interfaceC6030s, CameraUseCaseAdapter.a aVar) {
        T.b bVar;
        synchronized (this.f34750a) {
            bVar = this.f34751b.get(a.a(interfaceC6030s, aVar));
        }
        return bVar;
    }

    Collection<T.b> e() {
        Collection<T.b> collectionUnmodifiableCollection;
        synchronized (this.f34750a) {
            collectionUnmodifiableCollection = Collections.unmodifiableCollection(this.f34751b.values());
        }
        return collectionUnmodifiableCollection;
    }

    void h(InterfaceC6030s interfaceC6030s) {
        synchronized (this.f34750a) {
            try {
                if (f(interfaceC6030s)) {
                    if (this.f34753d.isEmpty()) {
                        this.f34753d.push(interfaceC6030s);
                    } else {
                        D.a aVar = this.f34754e;
                        if (aVar == null || aVar.c() != 2) {
                            InterfaceC6030s interfaceC6030sPeek = this.f34753d.peek();
                            if (!interfaceC6030s.equals(interfaceC6030sPeek)) {
                                j(interfaceC6030sPeek);
                                this.f34753d.remove(interfaceC6030s);
                                this.f34753d.push(interfaceC6030s);
                            }
                        }
                    }
                    m(interfaceC6030s);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void i(InterfaceC6030s interfaceC6030s) {
        synchronized (this.f34750a) {
            try {
                this.f34753d.remove(interfaceC6030s);
                j(interfaceC6030s);
                if (!this.f34753d.isEmpty()) {
                    m(this.f34753d.peek());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void k() {
        synchronized (this.f34750a) {
            try {
                Iterator<a> it = this.f34751b.keySet().iterator();
                while (it.hasNext()) {
                    T.b bVar = this.f34751b.get(it.next());
                    bVar.u();
                    i(bVar.j());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void l(InterfaceC6030s interfaceC6030s) {
        synchronized (this.f34750a) {
            try {
                b bVarD = d(interfaceC6030s);
                if (bVarD == null) {
                    return;
                }
                i(interfaceC6030s);
                Iterator<a> it = this.f34752c.get(bVarD).iterator();
                while (it.hasNext()) {
                    this.f34751b.remove(it.next());
                }
                this.f34752c.remove(bVarD);
                bVarD.a().getLifecycle().d(bVarD);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    c() {
    }
}
