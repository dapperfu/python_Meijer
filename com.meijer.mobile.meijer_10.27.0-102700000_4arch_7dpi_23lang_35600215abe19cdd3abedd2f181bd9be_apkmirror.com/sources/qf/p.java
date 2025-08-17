package qf;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import of.C16041i;
import qf.p;
import rf.AbstractC16777F;

/* loaded from: classes7.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    private final g f157268a;

    /* renamed from: b, reason: collision with root package name */
    private final pf.i f157269b;

    /* renamed from: c, reason: collision with root package name */
    private String f157270c;

    /* renamed from: d, reason: collision with root package name */
    private final a f157271d = new a(false);

    /* renamed from: e, reason: collision with root package name */
    private final a f157272e = new a(true);

    /* renamed from: f, reason: collision with root package name */
    private final k f157273f = new k(128);

    /* renamed from: g, reason: collision with root package name */
    private final AtomicMarkableReference<String> f157274g = new AtomicMarkableReference<>(null, false);

    /* JADX INFO: Access modifiers changed from: private */
    class a {

        /* renamed from: a, reason: collision with root package name */
        final AtomicMarkableReference<e> f157275a;

        /* renamed from: b, reason: collision with root package name */
        private final AtomicReference<Runnable> f157276b = new AtomicReference<>(null);

        /* renamed from: c, reason: collision with root package name */
        private final boolean f157277c;

        private void d() throws Throwable {
            Map<String, String> mapA;
            synchronized (this) {
                try {
                    if (this.f157275a.isMarked()) {
                        mapA = this.f157275a.getReference().a();
                        AtomicMarkableReference<e> atomicMarkableReference = this.f157275a;
                        atomicMarkableReference.set(atomicMarkableReference.getReference(), false);
                    } else {
                        mapA = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (mapA != null) {
                p.this.f157268a.r(p.this.f157270c, mapA, this.f157277c);
            }
        }

        public boolean e(String str, String str2) {
            synchronized (this) {
                try {
                    if (!this.f157275a.getReference().d(str, str2)) {
                        return false;
                    }
                    AtomicMarkableReference<e> atomicMarkableReference = this.f157275a;
                    atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
                    c();
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public a(boolean z10) {
            this.f157277c = z10;
            this.f157275a = new AtomicMarkableReference<>(new e(64, z10 ? 8192 : 1024), false);
        }

        public static /* synthetic */ void a(a aVar) throws Throwable {
            aVar.f157276b.set(null);
            aVar.d();
        }

        private void c() {
            Runnable runnable = new Runnable() { // from class: qf.o
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    p.a.a(this.f157267a);
                }
            };
            if (U.d.a(this.f157276b, null, runnable)) {
                p.this.f157269b.diskWrite.d(runnable);
            }
        }

        public Map<String, String> b() {
            return this.f157275a.getReference().a();
        }
    }

    public static p k(String str, uf.g gVar, pf.i iVar) {
        g gVar2 = new g(gVar);
        p pVar = new p(str, gVar, iVar);
        pVar.f157271d.f157275a.getReference().e(gVar2.i(str, false));
        pVar.f157272e.f157275a.getReference().e(gVar2.i(str, true));
        pVar.f157274g.set(gVar2.k(str), false);
        pVar.f157273f.c(gVar2.j(str));
        return pVar;
    }

    public static String l(String str, uf.g gVar) {
        return new g(gVar).k(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() throws Throwable {
        boolean z10;
        String strJ;
        synchronized (this.f157274g) {
            try {
                z10 = false;
                if (this.f157274g.isMarked()) {
                    strJ = j();
                    this.f157274g.set(strJ, false);
                    z10 = true;
                } else {
                    strJ = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            this.f157268a.t(this.f157270c, strJ);
        }
    }

    public Map<String, String> h() {
        return this.f157272e.b();
    }

    public List<AbstractC16777F.e.d.AbstractC2462e> i() {
        return this.f157273f.a();
    }

    public String j() {
        return this.f157274g.getReference();
    }

    public boolean n(String str, String str2) {
        return this.f157271d.e(str, str2);
    }

    public boolean o(String str, String str2) {
        return this.f157272e.e(str, str2);
    }

    public void p(final String str) {
        synchronized (this.f157270c) {
            this.f157270c = str;
            final Map<String, String> mapB = this.f157271d.b();
            final List<j> listB = this.f157273f.b();
            this.f157269b.diskWrite.d(new Runnable() { // from class: qf.l
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    p.c(this.f157260a, str, mapB, listB);
                }
            });
        }
    }

    public void q(String str) {
        String strC = e.c(str, 1024);
        synchronized (this.f157274g) {
            try {
                if (C16041i.z(strC, this.f157274g.getReference())) {
                    return;
                }
                this.f157274g.set(strC, true);
                this.f157269b.diskWrite.d(new Runnable() { // from class: qf.m
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        this.f157264a.m();
                    }
                });
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean r(List<j> list) {
        synchronized (this.f157273f) {
            try {
                if (!this.f157273f.c(list)) {
                    return false;
                }
                final List<j> listB = this.f157273f.b();
                this.f157269b.diskWrite.d(new Runnable() { // from class: qf.n
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        p pVar = this.f157265a;
                        pVar.f157268a.s(pVar.f157270c, listB);
                    }
                });
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public p(String str, uf.g gVar, pf.i iVar) {
        this.f157270c = str;
        this.f157268a = new g(gVar);
        this.f157269b = iVar;
    }

    public static /* synthetic */ void c(p pVar, String str, Map map, List list) throws Throwable {
        if (pVar.j() != null) {
            pVar.f157268a.t(str, pVar.j());
        }
        if (!map.isEmpty()) {
            pVar.f157268a.q(str, map);
        }
        if (!list.isEmpty()) {
            pVar.f157268a.s(str, list);
        }
    }

    public Map<String, String> g(Map<String, String> map) {
        if (map.isEmpty()) {
            return this.f157271d.b();
        }
        HashMap map2 = new HashMap(this.f157271d.b());
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
            lf.g.f().k("Ignored " + i10 + " keys when adding event specific keys. Maximum allowable: 1024");
        }
        return Collections.unmodifiableMap(map2);
    }
}
