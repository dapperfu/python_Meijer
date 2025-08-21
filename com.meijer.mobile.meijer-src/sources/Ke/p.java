package Ke;

import We.C;
import We.I;
import com.google.crypto.tink.internal.AbstractC11420d;
import com.google.crypto.tink.internal.B;
import com.google.crypto.tink.internal.C11428l;
import com.google.crypto.tink.internal.D;
import com.google.crypto.tink.internal.G;
import com.google.crypto.tink.internal.InterfaceC11424h;
import com.google.crypto.tink.internal.M;
import com.google.crypto.tink.shaded.protobuf.AbstractC11437h;
import com.google.crypto.tink.shaded.protobuf.C11444o;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes8.dex */
public final class p implements InterfaceC11424h {

    /* renamed from: a, reason: collision with root package name */
    private final We.C f16593a;

    /* renamed from: b, reason: collision with root package name */
    private final List<c> f16594b;

    /* renamed from: c, reason: collision with root package name */
    private final C11428l f16595c;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final List<a> f16597a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private GeneralSecurityException f16598b = null;

        /* renamed from: c, reason: collision with root package name */
        private C11428l f16599c = C11428l.f89056b;

        /* renamed from: d, reason: collision with root package name */
        private boolean f16600d = false;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private boolean f16601a;

            /* renamed from: b, reason: collision with root package name */
            private l f16602b;

            /* renamed from: c, reason: collision with root package name */
            private final j f16603c;

            /* renamed from: d, reason: collision with root package name */
            private final x f16604d;

            /* renamed from: e, reason: collision with root package name */
            private C0278b f16605e;

            /* renamed from: f, reason: collision with root package name */
            private b f16606f;

            /* synthetic */ a(x xVar, a aVar) {
                this(xVar);
            }

            private a(x xVar) {
                this.f16602b = l.f16585b;
                this.f16605e = null;
                this.f16606f = null;
                this.f16603c = null;
                this.f16604d = xVar;
            }

            public a i() {
                b bVar = this.f16606f;
                if (bVar != null) {
                    bVar.e();
                }
                this.f16601a = true;
                return this;
            }

            public a j() {
                this.f16605e = C0278b.e();
                return this;
            }
        }

        /* renamed from: Ke.p$b$b, reason: collision with other inner class name */
        private static class C0278b {

            /* renamed from: b, reason: collision with root package name */
            private static final C0278b f16607b = new C0278b();

            /* renamed from: a, reason: collision with root package name */
            private final int f16608a = 0;

            /* JADX INFO: Access modifiers changed from: private */
            public int d() {
                return this.f16608a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static C0278b e() {
                return f16607b;
            }

            private C0278b() {
            }
        }

        private static void d(List<a> list) throws GeneralSecurityException {
            for (int i10 = 0; i10 < list.size() - 1; i10++) {
                if (list.get(i10).f16605e == C0278b.f16607b && list.get(i10 + 1).f16605e != C0278b.f16607b) {
                    throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                }
            }
        }

        private static int g(Set<Integer> set) {
            int iF = 0;
            while (true) {
                if (iF != 0 && !set.contains(Integer.valueOf(iF))) {
                    return iF;
                }
                iF = M.f();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e() {
            Iterator<a> it = this.f16597a.iterator();
            while (it.hasNext()) {
                it.next().f16601a = false;
            }
        }

        public p c() throws GeneralSecurityException {
            c cVar;
            C.c cVarH;
            if (this.f16598b != null) {
                throw new GeneralSecurityException("Cannot build keyset due to error in original", this.f16598b);
            }
            if (this.f16600d) {
                throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
            }
            this.f16600d = true;
            C.b bVarG0 = We.C.g0();
            ArrayList arrayList = new ArrayList(this.f16597a.size());
            d(this.f16597a);
            HashSet hashSet = new HashSet();
            a aVar = null;
            Integer numValueOf = null;
            for (a aVar2 : this.f16597a) {
                if (aVar2.f16602b == null) {
                    throw new GeneralSecurityException("Key Status not set.");
                }
                int iF = f(aVar2, hashSet);
                if (hashSet.contains(Integer.valueOf(iF))) {
                    throw new GeneralSecurityException("Id " + iF + " is used twice in the keyset");
                }
                hashSet.add(Integer.valueOf(iF));
                if (aVar2.f16603c != null) {
                    cVar = new c(aVar2.f16603c, aVar2.f16602b, iF, aVar2.f16601a, null);
                    cVarH = p.h(aVar2.f16603c, aVar2.f16602b, iF);
                } else {
                    j jVarC = com.google.crypto.tink.internal.p.f().c(aVar2.f16604d, aVar2.f16604d.a() ? Integer.valueOf(iF) : null);
                    cVar = new c(jVarC, aVar2.f16602b, iF, aVar2.f16601a, null);
                    cVarH = p.h(jVarC, aVar2.f16602b, iF);
                }
                bVarG0.x(cVarH);
                if (aVar2.f16601a) {
                    if (numValueOf != null) {
                        throw new GeneralSecurityException("Two primaries were set");
                    }
                    numValueOf = Integer.valueOf(iF);
                    if (aVar2.f16602b != l.f16585b) {
                        throw new GeneralSecurityException("Primary key is not enabled");
                    }
                }
                arrayList.add(cVar);
            }
            if (numValueOf == null) {
                throw new GeneralSecurityException("No primary was set");
            }
            bVarG0.y(numValueOf.intValue());
            We.C cBuild = bVarG0.build();
            p.g(cBuild);
            return new p(cBuild, arrayList, this.f16599c, aVar);
        }

        private static int f(a aVar, Set<Integer> set) throws GeneralSecurityException {
            if (aVar.f16605e != null) {
                if (aVar.f16605e != C0278b.f16607b) {
                    return aVar.f16605e.d();
                }
                return g(set);
            }
            throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
        }

        public b b(a aVar) {
            if (aVar.f16606f == null) {
                if (aVar.f16601a) {
                    e();
                }
                aVar.f16606f = this;
                this.f16597a.add(aVar);
                return this;
            }
            throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        }
    }

    public static final class c implements InterfaceC11424h.a {

        /* renamed from: a, reason: collision with root package name */
        private final j f16609a;

        /* renamed from: b, reason: collision with root package name */
        private final l f16610b;

        /* renamed from: c, reason: collision with root package name */
        private final int f16611c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f16612d;

        /* synthetic */ c(j jVar, l lVar, int i10, boolean z10, a aVar) {
            this(jVar, lVar, i10, z10);
        }

        private c(j jVar, l lVar, int i10, boolean z10) {
            this.f16609a = jVar;
            this.f16610b = lVar;
            this.f16611c = i10;
            this.f16612d = z10;
        }

        public l a() {
            return this.f16610b;
        }

        public boolean b() {
            return this.f16612d;
        }

        @Override // com.google.crypto.tink.internal.InterfaceC11424h.a
        public int getId() {
            return this.f16611c;
        }

        @Override // com.google.crypto.tink.internal.InterfaceC11424h.a
        public j getKey() {
            return this.f16609a;
        }
    }

    /* synthetic */ p(We.C c10, List list, C11428l c11428l, a aVar) {
        this(c10, list, c11428l);
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16596a;

        static {
            int[] iArr = new int[We.z.values().length];
            f16596a = iArr;
            try {
                iArr[We.z.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16596a[We.z.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16596a[We.z.DESTROYED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private p(We.C c10, List<c> list) {
        this.f16593a = c10;
        this.f16594b = list;
        this.f16595c = C11428l.f89056b;
    }

    private static We.z A(l lVar) {
        if (l.f16585b.equals(lVar)) {
            return We.z.ENABLED;
        }
        if (l.f16586c.equals(lVar)) {
            return We.z.DISABLED;
        }
        if (l.f16587d.equals(lVar)) {
            return We.z.DESTROYED;
        }
        throw new IllegalStateException("Unknown key status");
    }

    private static void f(We.t tVar) throws GeneralSecurityException {
        if (tVar == null || tVar.a0().size() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(We.C c10) throws GeneralSecurityException {
        if (c10 == null || c10.d0() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    private c k(int i10) {
        if (this.f16594b.get(i10) != null) {
            return this.f16594b.get(i10);
        }
        throw new IllegalStateException("Keyset-Entry at position " + i10 + " has wrong status or key parsing failed");
    }

    public static b.a m(x xVar) {
        return new b.a(xVar, null);
    }

    private static List<c> q(We.C c10) {
        ArrayList arrayList = new ArrayList(c10.d0());
        for (C.c cVar : c10.e0()) {
            int iD0 = cVar.d0();
            try {
                arrayList.add(new c(B(cVar), y(cVar.f0()), iD0, iD0 == c10.f0(), null));
            } catch (GeneralSecurityException unused) {
                arrayList.add(null);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private <B, P> P w(final AbstractC11420d abstractC11420d, Class<P> cls, final Class<B> cls2) throws GeneralSecurityException {
        F.d(this.f16593a);
        D.b bVarH = com.google.crypto.tink.internal.D.h(cls2);
        bVarH.g(this.f16595c);
        for (int i10 = 0; i10 < size(); i10++) {
            C.c cVarC0 = this.f16593a.c0(i10);
            if (cVarC0.f0().equals(We.z.ENABLED)) {
                c cVar = this.f16594b.get(i10);
                if (cVar == null) {
                    throw new GeneralSecurityException("Key parsing of key with index " + i10 + " and type_url " + cVarC0.c0().d0() + " failed, unable to get primitive");
                }
                j key = cVar.getKey();
                if (cVarC0.d0() == this.f16593a.f0()) {
                    bVarH.d(key, cVarC0);
                } else {
                    bVarH.b(key, cVarC0);
                }
            }
        }
        bVarH.e(new B.b() { // from class: Ke.o
            @Override // com.google.crypto.tink.internal.B.b
            public final Object a(j jVar) {
                return abstractC11420d.b(jVar, cls2);
            }
        });
        return (P) abstractC11420d.c(bVarH.f(), cls);
    }

    public static b x() {
        return new b();
    }

    private static l y(We.z zVar) throws GeneralSecurityException {
        int i10 = a.f16596a[zVar.ordinal()];
        if (i10 == 1) {
            return l.f16585b;
        }
        if (i10 == 2) {
            return l.f16586c;
        }
        if (i10 == 3) {
            return l.f16587d;
        }
        throw new GeneralSecurityException("Unknown key status");
    }

    @Deprecated
    public void E(s sVar, InterfaceC3886a interfaceC3886a, byte[] bArr) throws GeneralSecurityException, IOException {
        sVar.a(j(this.f16593a, interfaceC3886a, bArr));
    }

    @Override // com.google.crypto.tink.internal.InterfaceC11424h
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public c a(int i10) {
        if (i10 >= 0 && i10 < size()) {
            return k(i10);
        }
        throw new IndexOutOfBoundsException("Invalid index " + i10 + " for keyset of size " + size());
    }

    We.C r() {
        return this.f16593a;
    }

    @Deprecated
    public We.D s() {
        return F.b(this.f16593a);
    }

    @Override // com.google.crypto.tink.internal.InterfaceC11424h
    public int size() {
        return this.f16594b.size();
    }

    @Override // com.google.crypto.tink.internal.InterfaceC11424h
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public c b() {
        for (c cVar : this.f16594b) {
            if (cVar != null && cVar.b()) {
                if (cVar.a() == l.f16585b) {
                    return cVar;
                }
                throw new IllegalStateException("Keyset has primary which isn't enabled");
            }
        }
        throw new IllegalStateException("Keyset has no valid primary");
    }

    public <P> P u(AbstractC3889d abstractC3889d, Class<P> cls) throws GeneralSecurityException {
        if (!(abstractC3889d instanceof AbstractC11420d)) {
            throw new GeneralSecurityException("Currently only subclasses of InternalConfiguration are accepted");
        }
        AbstractC11420d abstractC11420d = (AbstractC11420d) abstractC3889d;
        Class<?> clsA = abstractC11420d.a(cls);
        if (clsA != null) {
            return (P) w(abstractC11420d, cls, clsA);
        }
        throw new GeneralSecurityException("No wrapper found for " + cls.getName());
    }

    private static j B(C.c cVar) throws GeneralSecurityException {
        return com.google.crypto.tink.internal.w.c().g(D(cVar), i.a());
    }

    private static C.c C(int i10, We.z zVar, G g10) {
        return C.c.h0().x(We.y.f0().y(g10.f()).z(g10.g()).x(g10.d())).A(zVar).y(i10).z(g10.e()).build();
    }

    private static G D(C.c cVar) throws GeneralSecurityException {
        Integer numValueOf;
        int iD0 = cVar.d0();
        if (cVar.e0() == I.RAW) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(iD0);
        }
        return G.b(cVar.c0().d0(), cVar.c0().e0(), cVar.c0().c0(), cVar.e0(), numValueOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C.c h(j jVar, l lVar, int i10) throws GeneralSecurityException {
        G g10 = (G) com.google.crypto.tink.internal.w.c().n(jVar, G.class, i.a());
        Integer numC = g10.c();
        if (numC != null && numC.intValue() != i10) {
            throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
        }
        return C(i10, A(lVar), g10);
    }

    private static We.C i(We.t tVar, InterfaceC3886a interfaceC3886a, byte[] bArr) throws GeneralSecurityException {
        try {
            We.C cI0 = We.C.i0(interfaceC3886a.b(tVar.a0().v(), bArr), C11444o.b());
            g(cI0);
            return cI0;
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    private static We.t j(We.C c10, InterfaceC3886a interfaceC3886a, byte[] bArr) throws GeneralSecurityException {
        return We.t.b0().x(AbstractC11437h.k(interfaceC3886a.a(c10.o(), bArr))).y(F.b(c10)).build();
    }

    static final p l(We.C c10) throws GeneralSecurityException {
        g(c10);
        return new p(c10, q(c10));
    }

    public static final p n(m mVar) throws GeneralSecurityException {
        return o(mVar.d());
    }

    public static final p o(x xVar) throws GeneralSecurityException {
        return x().b(m(xVar).j().i()).c();
    }

    @Deprecated
    public static final p z(r rVar, InterfaceC3886a interfaceC3886a, byte[] bArr) throws GeneralSecurityException, IOException {
        We.t tVarA = rVar.a();
        f(tVarA);
        return l(i(tVarA, interfaceC3886a, bArr));
    }

    public String toString() {
        return s().toString();
    }

    @Deprecated
    public <P> P v(Class<P> cls) throws GeneralSecurityException {
        return (P) u(B.a(), cls);
    }

    private p(We.C c10, List<c> list, C11428l c11428l) {
        this.f16593a = c10;
        this.f16594b = list;
        this.f16595c = c11428l;
    }
}
