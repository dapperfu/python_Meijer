package com.google.crypto.tink.internal;

import Ke.C3890e;
import We.C;
import com.google.crypto.tink.internal.B;
import com.google.crypto.tink.internal.D;
import com.google.crypto.tink.internal.InterfaceC11424h;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class D<P> {

    /* renamed from: a, reason: collision with root package name */
    private final Map<Ye.a, List<c<P>>> f88985a;

    /* renamed from: b, reason: collision with root package name */
    private final List<c<P>> f88986b;

    /* renamed from: c, reason: collision with root package name */
    private final c<P> f88987c;

    /* renamed from: d, reason: collision with root package name */
    private final Class<P> f88988d;

    /* renamed from: e, reason: collision with root package name */
    private final C11428l f88989e;

    /* renamed from: f, reason: collision with root package name */
    private final B.b<Ke.j, P> f88990f;

    public static class b<P> {

        /* renamed from: a, reason: collision with root package name */
        private final Class<P> f88991a;

        /* renamed from: b, reason: collision with root package name */
        private Map<Ye.a, List<c<P>>> f88992b;

        /* renamed from: c, reason: collision with root package name */
        private final List<c<P>> f88993c;

        /* renamed from: d, reason: collision with root package name */
        private c<P> f88994d;

        /* renamed from: e, reason: collision with root package name */
        private C11428l f88995e;

        /* renamed from: f, reason: collision with root package name */
        private B.b<Ke.j, P> f88996f;

        public b<P> b(Ke.j jVar, C.c cVar) throws GeneralSecurityException {
            return c(jVar, cVar, false);
        }

        public b<P> d(Ke.j jVar, C.c cVar) throws GeneralSecurityException {
            return c(jVar, cVar, true);
        }

        private b(Class<P> cls) {
            this.f88992b = new HashMap();
            this.f88993c = new ArrayList();
            this.f88996f = new B.b() { // from class: com.google.crypto.tink.internal.E
                @Override // com.google.crypto.tink.internal.B.b
                public final Object a(Ke.j jVar) {
                    return D.b.a(jVar);
                }
            };
            this.f88991a = cls;
            this.f88995e = C11428l.f89056b;
        }

        public static /* synthetic */ Object a(Ke.j jVar) throws GeneralSecurityException {
            throw new GeneralSecurityException("No PrimitiveConstructionFunction specified");
        }

        private b<P> c(Ke.j jVar, C.c cVar, boolean z10) throws GeneralSecurityException {
            if (this.f88992b == null) {
                throw new IllegalStateException("addEntry cannot be called after build");
            }
            if (cVar.f0() != We.z.ENABLED) {
                throw new GeneralSecurityException("only ENABLED key is allowed");
            }
            c<P> cVar2 = new c<>(Ye.a.a(C3890e.a(cVar)), Ke.l.f16585b, cVar.d0(), jVar, z10);
            D.i(cVar2, this.f88992b, this.f88993c);
            if (!z10) {
                return this;
            }
            if (this.f88994d != null) {
                throw new IllegalStateException("you cannot set two primary primitives");
            }
            this.f88994d = cVar2;
            return this;
        }

        public b<P> e(B.b<Ke.j, P> bVar) {
            this.f88996f = bVar;
            return this;
        }

        public D<P> f() throws GeneralSecurityException {
            Map<Ye.a, List<c<P>>> map = this.f88992b;
            if (map == null) {
                throw new IllegalStateException("build cannot be called twice");
            }
            D<P> d10 = new D<>(map, this.f88993c, this.f88994d, this.f88995e, this.f88996f, this.f88991a);
            this.f88992b = null;
            return d10;
        }

        public b<P> g(C11428l c11428l) {
            if (this.f88992b == null) {
                throw new IllegalStateException("setAnnotations cannot be called after build");
            }
            this.f88995e = c11428l;
            return this;
        }
    }

    public static final class c<P> implements InterfaceC11424h.a {

        /* renamed from: a, reason: collision with root package name */
        private final Ye.a f88997a;

        /* renamed from: b, reason: collision with root package name */
        private final Ke.l f88998b;

        /* renamed from: c, reason: collision with root package name */
        private final int f88999c;

        /* renamed from: d, reason: collision with root package name */
        private final Ke.j f89000d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f89001e;

        private c(Ye.a aVar, Ke.l lVar, int i10, Ke.j jVar, boolean z10) {
            this.f88997a = aVar;
            this.f88998b = lVar;
            this.f88999c = i10;
            this.f89000d = jVar;
            this.f89001e = z10;
        }

        final Ye.a a() {
            return this.f88997a;
        }

        @Override // com.google.crypto.tink.internal.InterfaceC11424h.a
        public int getId() {
            return this.f88999c;
        }

        @Override // com.google.crypto.tink.internal.InterfaceC11424h.a
        public Ke.j getKey() {
            return this.f89000d;
        }
    }

    private class d implements InterfaceC11424h {
        private d() {
        }

        @Override // com.google.crypto.tink.internal.InterfaceC11424h
        public InterfaceC11424h.a a(int i10) {
            return (InterfaceC11424h.a) D.this.f88986b.get(i10);
        }

        @Override // com.google.crypto.tink.internal.InterfaceC11424h
        public InterfaceC11424h.a b() {
            return D.this.f88987c;
        }

        @Override // com.google.crypto.tink.internal.InterfaceC11424h
        public int size() {
            return D.this.f88986b.size();
        }
    }

    private D(Map<Ye.a, List<c<P>>> map, List<c<P>> list, c<P> cVar, C11428l c11428l, B.b<Ke.j, P> bVar, Class<P> cls) {
        this.f88985a = map;
        this.f88986b = list;
        this.f88987c = cVar;
        this.f88990f = bVar;
        this.f88988d = cls;
        this.f88989e = c11428l;
    }

    public static <P> b<P> h(Class<P> cls) {
        return new b<>(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <P> void i(c<P> cVar, Map<Ye.a, List<c<P>>> map, List<c<P>> list) {
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

    public C11428l d() {
        return this.f88989e;
    }

    public InterfaceC11424h e() {
        return new d();
    }

    public Class<P> f() {
        return this.f88988d;
    }

    public P g(InterfaceC11424h.a aVar) throws GeneralSecurityException {
        return this.f88990f.a(aVar.getKey());
    }
}
