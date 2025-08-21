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
    private final String f47530a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, b> f47531b = new LinkedHashMap();

    /* JADX INFO: Access modifiers changed from: private */
    interface a {
        boolean a(b bVar);
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final w f47532a;

        /* renamed from: b, reason: collision with root package name */
        private final D<?> f47533b;

        /* renamed from: c, reason: collision with root package name */
        private final x f47534c;

        /* renamed from: d, reason: collision with root package name */
        private final List<E.b> f47535d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f47536e = false;

        /* renamed from: f, reason: collision with root package name */
        private boolean f47537f = false;

        boolean a() {
            return this.f47537f;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean b() {
            return this.f47536e;
        }

        public List<E.b> c() {
            return this.f47535d;
        }

        public w d() {
            return this.f47532a;
        }

        public x e() {
            return this.f47534c;
        }

        public D<?> f() {
            return this.f47533b;
        }

        void g(boolean z10) {
            this.f47537f = z10;
        }

        void h(boolean z10) {
            this.f47536e = z10;
        }

        public String toString() {
            return "UseCaseAttachInfo{mSessionConfig=" + this.f47532a + ", mUseCaseConfig=" + this.f47533b + ", mStreamSpec=" + this.f47534c + ", mCaptureTypes=" + this.f47535d + ", mAttached=" + this.f47536e + ", mActive=" + this.f47537f + '}';
        }

        b(w wVar, D<?> d10, x xVar, List<E.b> list) {
            this.f47532a = wVar;
            this.f47533b = d10;
            this.f47534c = xVar;
            this.f47535d = list;
        }
    }

    private b k(String str, w wVar, D<?> d10, x xVar, List<E.b> list) {
        b bVar = this.f47531b.get(str);
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(wVar, d10, xVar, list);
        this.f47531b.put(str, bVar2);
        return bVar2;
    }

    private Collection<w> l(a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.f47531b.entrySet()) {
            if (aVar == null || aVar.a(entry.getValue())) {
                arrayList.add(entry.getValue().d());
            }
        }
        return arrayList;
    }

    private Collection<D<?>> m(a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.f47531b.entrySet()) {
            if (aVar == null || aVar.a(entry.getValue())) {
                arrayList.add(entry.getValue().f());
            }
        }
        return arrayList;
    }

    private Collection<b> n(a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.f47531b.entrySet()) {
            if (aVar == null || aVar.a(entry.getValue())) {
                arrayList.add(entry.getValue());
            }
        }
        return arrayList;
    }

    public w.h e() {
        w.h hVar = new w.h();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.f47531b.entrySet()) {
            b value = entry.getValue();
            if (value.a() && value.b()) {
                String key = entry.getKey();
                hVar.b(value.d());
                arrayList.add(key);
            }
        }
        P.a("UseCaseAttachState", "Active and attached use case: " + arrayList + " for camera: " + this.f47530a);
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
        for (Map.Entry<String, b> entry : this.f47531b.entrySet()) {
            b value = entry.getValue();
            if (value.b()) {
                hVar.b(value.d());
                arrayList.add(entry.getKey());
            }
        }
        P.a("UseCaseAttachState", "All use case: " + arrayList + " for camera: " + this.f47530a);
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
        if (this.f47531b.containsKey(str)) {
            return this.f47531b.get(str).b();
        }
        return false;
    }

    public void p(String str) {
        this.f47531b.remove(str);
    }

    public void s(String str) {
        if (this.f47531b.containsKey(str)) {
            b bVar = this.f47531b.get(str);
            bVar.h(false);
            if (bVar.a()) {
                return;
            }
            this.f47531b.remove(str);
        }
    }

    public void t(String str) {
        if (this.f47531b.containsKey(str)) {
            b bVar = this.f47531b.get(str);
            bVar.g(false);
            if (bVar.b()) {
                return;
            }
            this.f47531b.remove(str);
        }
    }

    public void u(String str, w wVar, D<?> d10, x xVar, List<E.b> list) {
        if (this.f47531b.containsKey(str)) {
            b bVar = new b(wVar, d10, xVar, list);
            b bVar2 = this.f47531b.get(str);
            bVar.h(bVar2.b());
            bVar.g(bVar2.a());
            this.f47531b.put(str, bVar);
        }
    }

    public C(String str) {
        this.f47530a = str;
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
