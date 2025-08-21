package sf;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import qf.C16649i;
import sf.p;
import tf.AbstractC17251F;

/* loaded from: classes8.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    private final g f160383a;

    /* renamed from: b, reason: collision with root package name */
    private final rf.i f160384b;

    /* renamed from: c, reason: collision with root package name */
    private String f160385c;

    /* renamed from: d, reason: collision with root package name */
    private final a f160386d = new a(false);

    /* renamed from: e, reason: collision with root package name */
    private final a f160387e = new a(true);

    /* renamed from: f, reason: collision with root package name */
    private final k f160388f = new k(128);

    /* renamed from: g, reason: collision with root package name */
    private final AtomicMarkableReference<String> f160389g = new AtomicMarkableReference<>(null, false);

    /* JADX INFO: Access modifiers changed from: private */
    class a {

        /* renamed from: a, reason: collision with root package name */
        final AtomicMarkableReference<e> f160390a;

        /* renamed from: b, reason: collision with root package name */
        private final AtomicReference<Runnable> f160391b = new AtomicReference<>(null);

        /* renamed from: c, reason: collision with root package name */
        private final boolean f160392c;

        private void d() throws Throwable {
            Map<String, String> mapA;
            synchronized (this) {
                try {
                    if (this.f160390a.isMarked()) {
                        mapA = this.f160390a.getReference().a();
                        AtomicMarkableReference<e> atomicMarkableReference = this.f160390a;
                        atomicMarkableReference.set(atomicMarkableReference.getReference(), false);
                    } else {
                        mapA = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (mapA != null) {
                p.this.f160383a.r(p.this.f160385c, mapA, this.f160392c);
            }
        }

        public boolean e(String str, String str2) {
            synchronized (this) {
                try {
                    if (!this.f160390a.getReference().d(str, str2)) {
                        return false;
                    }
                    AtomicMarkableReference<e> atomicMarkableReference = this.f160390a;
                    atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
                    c();
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public a(boolean z10) {
            this.f160392c = z10;
            this.f160390a = new AtomicMarkableReference<>(new e(64, z10 ? 8192 : 1024), false);
        }

        public static /* synthetic */ void a(a aVar) throws Throwable {
            aVar.f160391b.set(null);
            aVar.d();
        }

        private void c() {
            Runnable runnable = new Runnable() { // from class: sf.o
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    p.a.a(this.f160382a);
                }
            };
            if (U.d.a(this.f160391b, null, runnable)) {
                p.this.f160384b.diskWrite.d(runnable);
            }
        }

        public Map<String, String> b() {
            return this.f160390a.getReference().a();
        }
    }

    public static p k(String str, wf.g gVar, rf.i iVar) {
        g gVar2 = new g(gVar);
        p pVar = new p(str, gVar, iVar);
        pVar.f160386d.f160390a.getReference().e(gVar2.i(str, false));
        pVar.f160387e.f160390a.getReference().e(gVar2.i(str, true));
        pVar.f160389g.set(gVar2.k(str), false);
        pVar.f160388f.c(gVar2.j(str));
        return pVar;
    }

    public static String l(String str, wf.g gVar) {
        return new g(gVar).k(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() throws Throwable {
        boolean z10;
        String strJ;
        synchronized (this.f160389g) {
            try {
                z10 = false;
                if (this.f160389g.isMarked()) {
                    strJ = j();
                    this.f160389g.set(strJ, false);
                    z10 = true;
                } else {
                    strJ = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            this.f160383a.t(this.f160385c, strJ);
        }
    }

    public Map<String, String> h() {
        return this.f160387e.b();
    }

    public List<AbstractC17251F.e.d.AbstractC2568e> i() {
        return this.f160388f.a();
    }

    public String j() {
        return this.f160389g.getReference();
    }

    public boolean n(String str, String str2) {
        return this.f160386d.e(str, str2);
    }

    public boolean o(String str, String str2) {
        return this.f160387e.e(str, str2);
    }

    public void p(final String str) {
        synchronized (this.f160385c) {
            this.f160385c = str;
            final Map<String, String> mapB = this.f160386d.b();
            final List<j> listB = this.f160388f.b();
            this.f160384b.diskWrite.d(new Runnable() { // from class: sf.l
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    p.c(this.f160375a, str, mapB, listB);
                }
            });
        }
    }

    public void q(String str) {
        String strC = e.c(str, 1024);
        synchronized (this.f160389g) {
            try {
                if (C16649i.z(strC, this.f160389g.getReference())) {
                    return;
                }
                this.f160389g.set(strC, true);
                this.f160384b.diskWrite.d(new Runnable() { // from class: sf.m
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        this.f160379a.m();
                    }
                });
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean r(List<j> list) {
        synchronized (this.f160388f) {
            try {
                if (!this.f160388f.c(list)) {
                    return false;
                }
                final List<j> listB = this.f160388f.b();
                this.f160384b.diskWrite.d(new Runnable() { // from class: sf.n
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        p pVar = this.f160380a;
                        pVar.f160383a.s(pVar.f160385c, listB);
                    }
                });
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public p(String str, wf.g gVar, rf.i iVar) {
        this.f160385c = str;
        this.f160383a = new g(gVar);
        this.f160384b = iVar;
    }

    public static /* synthetic */ void c(p pVar, String str, Map map, List list) throws Throwable {
        if (pVar.j() != null) {
            pVar.f160383a.t(str, pVar.j());
        }
        if (!map.isEmpty()) {
            pVar.f160383a.q(str, map);
        }
        if (!list.isEmpty()) {
            pVar.f160383a.s(str, list);
        }
    }

    public Map<String, String> g(Map<String, String> map) {
        if (map.isEmpty()) {
            return this.f160386d.b();
        }
        HashMap map2 = new HashMap(this.f160386d.b());
        int i10 = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String strC = e.c(entry.getKey(), 1024);
            if (map2.size() >= 64 && !map2.containsKey(strC)) {
                i10++;
            } else {
                map2.put(strC, e.c(entry.getValue(), 1024));
            }
        }
        if (i10 > 0) {
            nf.g.f().k("Ignored " + i10 + " keys when adding event specific keys. Maximum allowable: 1024");
        }
        return Collections.unmodifiableMap(map2);
    }
}
