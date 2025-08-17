package androidx.camera.core.impl;

import C.P;
import androidx.camera.core.impl.C;
import androidx.camera.core.impl.E;
import androidx.camera.core.impl.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    private final String f47306a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, b> f47307b = new LinkedHashMap();

    /* JADX INFO: Access modifiers changed from: private */
    interface a {
        boolean a(b bVar);
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final w f47308a;

        /* renamed from: b, reason: collision with root package name */
        private final D<?> f47309b;

        /* renamed from: c, reason: collision with root package name */
        private final x f47310c;

        /* renamed from: d, reason: collision with root package name */
        private final List<E.b> f47311d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f47312e = false;

        /* renamed from: f, reason: collision with root package name */
        private boolean f47313f = false;

        boolean a() {
            return this.f47313f;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean b() {
            return this.f47312e;
        }

        public List<E.b> c() {
            return this.f47311d;
        }

        public w d() {
            return this.f47308a;
        }

        public x e() {
            return this.f47310c;
        }

        public D<?> f() {
            return this.f47309b;
        }

        void g(boolean z10) {
            this.f47313f = z10;
        }

        void h(boolean z10) {
            this.f47312e = z10;
        }

        public String toString() {
            return "UseCaseAttachInfo{mSessionConfig=" + this.f47308a + ", mUseCaseConfig=" + this.f47309b + ", mStreamSpec=" + this.f47310c + ", mCaptureTypes=" + this.f47311d + ", mAttached=" + this.f47312e + ", mActive=" + this.f47313f + '}';
        }

        b(w wVar, D<?> d10, x xVar, List<E.b> list) {
            this.f47308a = wVar;
            this.f47309b = d10;
            this.f47310c = xVar;
            this.f47311d = list;
        }
    }

    private b k(String str, w wVar, D<?> d10, x xVar, List<E.b> list) {
        b bVar = this.f47307b.get(str);
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(wVar, d10, xVar, list);
        this.f47307b.put(str, bVar2);
        return bVar2;
    }

    private Collection<w> l(a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.f47307b.entrySet()) {
            if (aVar == null || aVar.a(entry.getValue())) {
                arrayList.add(entry.getValue().d());
            }
        }
        return arrayList;
    }

    private Collection<D<?>> m(a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.f47307b.entrySet()) {
            if (aVar == null || aVar.a(entry.getValue())) {
                arrayList.add(entry.getValue().f());
            }
        }
        return arrayList;
    }

    private Collection<b> n(a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.f47307b.entrySet()) {
            if (aVar == null || aVar.a(entry.getValue())) {
                arrayList.add(entry.getValue());
            }
        }
        return arrayList;
    }

    public w.h e() {
        w.h hVar = new w.h();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.f47307b.entrySet()) {
            b value = entry.getValue();
            if (value.a() && value.b()) {
                String key = entry.getKey();
                hVar.b(value.d());
                arrayList.add(key);
            }
        }
        P.a("UseCaseAttachState", "Active and attached use case: " + arrayList + " for camera: " + this.f47306a);
        return hVar;
    }

    public Collection<w> f() {
        return Collections.unmodifiableCollection(l(new a() { // from class: androidx.camera.core.impl.B
            @Override // androidx.camera.core.impl.C.a
            public final boolean a(C.b bVar) {
                return C.a(bVar);
            }
        }));
    }

    public w.h g() {
        w.h hVar = new w.h();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.f47307b.entrySet()) {
            b value = entry.getValue();
            if (value.b()) {
                hVar.b(value.d());
                arrayList.add(entry.getKey());
            }
        }
        P.a("UseCaseAttachState", "All use case: " + arrayList + " for camera: " + this.f47306a);
        return hVar;
    }

    public Collection<w> h() {
        return Collections.unmodifiableCollection(l(new a() { // from class: androidx.camera.core.impl.z
            @Override // androidx.camera.core.impl.C.a
            public final boolean a(C.b bVar) {
                return bVar.b();
            }
        }));
    }

    public Collection<D<?>> i() {
        return Collections.unmodifiableCollection(m(new a() { // from class: androidx.camera.core.impl.A
            @Override // androidx.camera.core.impl.C.a
            public final boolean a(C.b bVar) {
                return bVar.b();
            }
        }));
    }

    public Collection<b> j() {
        return Collections.unmodifiableCollection(n(new a() { // from class: androidx.camera.core.impl.y
            @Override // androidx.camera.core.impl.C.a
            public final boolean a(C.b bVar) {
                return bVar.b();
            }
        }));
    }

    public boolean o(String str) {
        if (this.f47307b.containsKey(str)) {
            return this.f47307b.get(str).b();
        }
        return false;
    }

    public void p(String str) {
        this.f47307b.remove(str);
    }

    public void s(String str) {
        if (this.f47307b.containsKey(str)) {
            b bVar = this.f47307b.get(str);
            bVar.h(false);
            if (bVar.a()) {
                return;
            }
            this.f47307b.remove(str);
        }
    }

    public void t(String str) {
        if (this.f47307b.containsKey(str)) {
            b bVar = this.f47307b.get(str);
            bVar.g(false);
            if (bVar.b()) {
                return;
            }
            this.f47307b.remove(str);
        }
    }

    public void u(String str, w wVar, D<?> d10, x xVar, List<E.b> list) {
        if (this.f47307b.containsKey(str)) {
            b bVar = new b(wVar, d10, xVar, list);
            b bVar2 = this.f47307b.get(str);
            bVar.h(bVar2.b());
            bVar.g(bVar2.a());
            this.f47307b.put(str, bVar);
        }
    }

    public C(String str) {
        this.f47306a = str;
    }

    public static /* synthetic */ boolean a(b bVar) {
        if (bVar.a() && bVar.b()) {
            return true;
        }
        return false;
    }

    public void q(String str, w wVar, D<?> d10, x xVar, List<E.b> list) {
        k(str, wVar, d10, xVar, list).g(true);
    }

    public void r(String str, w wVar, D<?> d10, x xVar, List<E.b> list) {
        k(str, wVar, d10, xVar, list).h(true);
        u(str, wVar, d10, xVar, list);
    }
}
