package com.google.crypto.tink.internal;

import Ie.C3731e;
import Ue.C;
import com.google.crypto.tink.internal.B;
import com.google.crypto.tink.internal.D;
import com.google.crypto.tink.internal.InterfaceC11299h;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public final class D<P> {

    /* renamed from: a, reason: collision with root package name */
    private final Map<We.a, List<c<P>>> f88145a;

    /* renamed from: b, reason: collision with root package name */
    private final List<c<P>> f88146b;

    /* renamed from: c, reason: collision with root package name */
    private final c<P> f88147c;

    /* renamed from: d, reason: collision with root package name */
    private final Class<P> f88148d;

    /* renamed from: e, reason: collision with root package name */
    private final C11303l f88149e;

    /* renamed from: f, reason: collision with root package name */
    private final B.b<Ie.j, P> f88150f;

    public static class b<P> {

        /* renamed from: a, reason: collision with root package name */
        private final Class<P> f88151a;

        /* renamed from: b, reason: collision with root package name */
        private Map<We.a, List<c<P>>> f88152b;

        /* renamed from: c, reason: collision with root package name */
        private final List<c<P>> f88153c;

        /* renamed from: d, reason: collision with root package name */
        private c<P> f88154d;

        /* renamed from: e, reason: collision with root package name */
        private C11303l f88155e;

        /* renamed from: f, reason: collision with root package name */
        private B.b<Ie.j, P> f88156f;

        public b<P> b(Ie.j jVar, C.c cVar) throws GeneralSecurityException {
            return c(jVar, cVar, false);
        }

        public b<P> d(Ie.j jVar, C.c cVar) throws GeneralSecurityException {
            return c(jVar, cVar, true);
        }

        private b(Class<P> cls) {
            this.f88152b = new HashMap();
            this.f88153c = new ArrayList();
            this.f88156f = new B.b() { // from class: com.google.crypto.tink.internal.E
                @Override // com.google.crypto.tink.internal.B.b
                public final Object a(Ie.j jVar) {
                    return D.b.a(jVar);
                }
            };
            this.f88151a = cls;
            this.f88155e = C11303l.f88216b;
        }

        public static /* synthetic */ Object a(Ie.j jVar) throws GeneralSecurityException {
            throw new GeneralSecurityException("No PrimitiveConstructionFunction specified");
        }

        private b<P> c(Ie.j jVar, C.c cVar, boolean z10) throws GeneralSecurityException {
            if (this.f88152b == null) {
                throw new IllegalStateException("addEntry cannot be called after build");
            }
            if (cVar.f0() != Ue.z.ENABLED) {
                throw new GeneralSecurityException("only ENABLED key is allowed");
            }
            c<P> cVar2 = new c<>(We.a.a(C3731e.a(cVar)), Ie.l.f13839b, cVar.d0(), jVar, z10);
            D.i(cVar2, this.f88152b, this.f88153c);
            if (!z10) {
                return this;
            }
            if (this.f88154d != null) {
                throw new IllegalStateException("you cannot set two primary primitives");
            }
            this.f88154d = cVar2;
            return this;
        }

        public b<P> e(B.b<Ie.j, P> bVar) {
            this.f88156f = bVar;
            return this;
        }

        public D<P> f() throws GeneralSecurityException {
            Map<We.a, List<c<P>>> map = this.f88152b;
            if (map == null) {
                throw new IllegalStateException("build cannot be called twice");
            }
            D<P> d10 = new D<>(map, this.f88153c, this.f88154d, this.f88155e, this.f88156f, this.f88151a);
            this.f88152b = null;
            return d10;
        }

        public b<P> g(C11303l c11303l) {
            if (this.f88152b == null) {
                throw new IllegalStateException("setAnnotations cannot be called after build");
            }
            this.f88155e = c11303l;
            return this;
        }
    }

    public static final class c<P> implements InterfaceC11299h.a {

        /* renamed from: a, reason: collision with root package name */
        private final We.a f88157a;

        /* renamed from: b, reason: collision with root package name */
        private final Ie.l f88158b;

        /* renamed from: c, reason: collision with root package name */
        private final int f88159c;

        /* renamed from: d, reason: collision with root package name */
        private final Ie.j f88160d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f88161e;

        private c(We.a aVar, Ie.l lVar, int i10, Ie.j jVar, boolean z10) {
            this.f88157a = aVar;
            this.f88158b = lVar;
            this.f88159c = i10;
            this.f88160d = jVar;
            this.f88161e = z10;
        }

        final We.a a() {
            return this.f88157a;
        }

        @Override // com.google.crypto.tink.internal.InterfaceC11299h.a
        public int getId() {
            return this.f88159c;
        }

        @Override // com.google.crypto.tink.internal.InterfaceC11299h.a
        public Ie.j getKey() {
            return this.f88160d;
        }
    }

    private class d implements InterfaceC11299h {
        private d() {
        }

        @Override // com.google.crypto.tink.internal.InterfaceC11299h
        public InterfaceC11299h.a a(int i10) {
            return (InterfaceC11299h.a) D.this.f88146b.get(i10);
        }

        @Override // com.google.crypto.tink.internal.InterfaceC11299h
        public InterfaceC11299h.a b() {
            return D.this.f88147c;
        }

        @Override // com.google.crypto.tink.internal.InterfaceC11299h
        public int size() {
            return D.this.f88146b.size();
        }
    }

    private D(Map<We.a, List<c<P>>> map, List<c<P>> list, c<P> cVar, C11303l c11303l, B.b<Ie.j, P> bVar, Class<P> cls) {
        this.f88145a = map;
        this.f88146b = list;
        this.f88147c = cVar;
        this.f88150f = bVar;
        this.f88148d = cls;
        this.f88149e = c11303l;
    }

    public static <P> b<P> h(Class<P> cls) {
        return new b<>(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <P> void i(c<P> cVar, Map<We.a, List<c<P>>> map, List<c<P>> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar);
        List<c<P>> listPut = map.put(cVar.a(), Collections.unmodifiableList(arrayList));
        if (listPut != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(listPut);
            arrayList2.add(cVar);
            map.put(cVar.a(), Collections.unmodifiableList(arrayList2));
        }
        list.add(cVar);
    }

    public C11303l d() {
        return this.f88149e;
    }

    public InterfaceC11299h e() {
        return new d();
    }

    public Class<P> f() {
        return this.f88148d;
    }

    public P g(InterfaceC11299h.a aVar) throws GeneralSecurityException {
        return this.f88150f.a(aVar.getKey());
    }
}
