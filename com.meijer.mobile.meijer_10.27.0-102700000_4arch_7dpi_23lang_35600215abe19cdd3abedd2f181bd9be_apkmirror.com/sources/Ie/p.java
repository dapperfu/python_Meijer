package Ie;

import Ue.C;
import Ue.I;
import com.google.crypto.tink.internal.AbstractC11295d;
import com.google.crypto.tink.internal.B;
import com.google.crypto.tink.internal.C11303l;
import com.google.crypto.tink.internal.D;
import com.google.crypto.tink.internal.G;
import com.google.crypto.tink.internal.InterfaceC11299h;
import com.google.crypto.tink.internal.M;
import com.google.crypto.tink.shaded.protobuf.AbstractC11312h;
import com.google.crypto.tink.shaded.protobuf.C11319o;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes7.dex */
public final class p implements InterfaceC11299h {

    /* renamed from: a, reason: collision with root package name */
    private final Ue.C f13847a;

    /* renamed from: b, reason: collision with root package name */
    private final List<c> f13848b;

    /* renamed from: c, reason: collision with root package name */
    private final C11303l f13849c;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final List<a> f13851a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private GeneralSecurityException f13852b = null;

        /* renamed from: c, reason: collision with root package name */
        private C11303l f13853c = C11303l.f88216b;

        /* renamed from: d, reason: collision with root package name */
        private boolean f13854d = false;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private boolean f13855a;

            /* renamed from: b, reason: collision with root package name */
            private l f13856b;

            /* renamed from: c, reason: collision with root package name */
            private final j f13857c;

            /* renamed from: d, reason: collision with root package name */
            private final x f13858d;

            /* renamed from: e, reason: collision with root package name */
            private C0218b f13859e;

            /* renamed from: f, reason: collision with root package name */
            private b f13860f;

            /* synthetic */ a(x xVar, a aVar) {
                this(xVar);
            }

            private a(x xVar) {
                this.f13856b = l.f13839b;
                this.f13859e = null;
                this.f13860f = null;
                this.f13857c = null;
                this.f13858d = xVar;
            }

            public a i() {
                b bVar = this.f13860f;
                if (bVar != null) {
                    bVar.e();
                }
                this.f13855a = true;
                return this;
            }

            public a j() {
                this.f13859e = C0218b.e();
                return this;
            }
        }

        /* renamed from: Ie.p$b$b, reason: collision with other inner class name */
        private static class C0218b {

            /* renamed from: b, reason: collision with root package name */
            private static final C0218b f13861b = new C0218b();

            /* renamed from: a, reason: collision with root package name */
            private final int f13862a = 0;

            /* JADX INFO: Access modifiers changed from: private */
            public int d() {
                return this.f13862a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static C0218b e() {
                return f13861b;
            }

            private C0218b() {
            }
        }

        private static void d(List<a> list) throws GeneralSecurityException {
            for (int i10 = 0; i10 < list.size() - 1; i10++) {
                if (list.get(i10).f13859e == C0218b.f13861b && list.get(i10 + 1).f13859e != C0218b.f13861b) {
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
            Iterator<a> it = this.f13851a.iterator();
            while (it.hasNext()) {
                it.next().f13855a = false;
            }
        }

        public p c() throws GeneralSecurityException {
            c cVar;
            C.c cVarH;
            if (this.f13852b != null) {
                throw new GeneralSecurityException("Cannot build keyset due to error in original", this.f13852b);
            }
            if (this.f13854d) {
                throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
            }
            this.f13854d = true;
            C.b bVarG0 = Ue.C.g0();
            ArrayList arrayList = new ArrayList(this.f13851a.size());
            d(this.f13851a);
            HashSet hashSet = new HashSet();
            a aVar = null;
            Integer numValueOf = null;
            for (a aVar2 : this.f13851a) {
                if (aVar2.f13856b == null) {
                    throw new GeneralSecurityException("Key Status not set.");
                }
                int iF = f(aVar2, hashSet);
                if (hashSet.contains(Integer.valueOf(iF))) {
                    throw new GeneralSecurityException("Id " + iF + " is used twice in the keyset");
                }
                hashSet.add(Integer.valueOf(iF));
                if (aVar2.f13857c != null) {
                    cVar = new c(aVar2.f13857c, aVar2.f13856b, iF, aVar2.f13855a, null);
                    cVarH = p.h(aVar2.f13857c, aVar2.f13856b, iF);
                } else {
                    j jVarC = com.google.crypto.tink.internal.p.f().c(aVar2.f13858d, aVar2.f13858d.a() ? Integer.valueOf(iF) : null);
                    cVar = new c(jVarC, aVar2.f13856b, iF, aVar2.f13855a, null);
                    cVarH = p.h(jVarC, aVar2.f13856b, iF);
                }
                bVarG0.x(cVarH);
                if (aVar2.f13855a) {
                    if (numValueOf != null) {
                        throw new GeneralSecurityException("Two primaries were set");
                    }
                    numValueOf = Integer.valueOf(iF);
                    if (aVar2.f13856b != l.f13839b) {
                        throw new GeneralSecurityException("Primary key is not enabled");
                    }
                }
                arrayList.add(cVar);
            }
            if (numValueOf == null) {
                throw new GeneralSecurityException("No primary was set");
            }
            bVarG0.y(numValueOf.intValue());
            Ue.C cBuild = bVarG0.build();
            p.g(cBuild);
            return new p(cBuild, arrayList, this.f13853c, aVar);
        }

        private static int f(a aVar, Set<Integer> set) throws GeneralSecurityException {
            if (aVar.f13859e != null) {
                if (aVar.f13859e != C0218b.f13861b) {
                    return aVar.f13859e.d();
                }
                return g(set);
            }
            throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
        }

        public b b(a aVar) {
            if (aVar.f13860f == null) {
                if (aVar.f13855a) {
                    e();
                }
                aVar.f13860f = this;
                this.f13851a.add(aVar);
                return this;
            }
            throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        }
    }

    public static final class c implements InterfaceC11299h.a {

        /* renamed from: a, reason: collision with root package name */
        private final j f13863a;

        /* renamed from: b, reason: collision with root package name */
        private final l f13864b;

        /* renamed from: c, reason: collision with root package name */
        private final int f13865c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f13866d;

        /* synthetic */ c(j jVar, l lVar, int i10, boolean z10, a aVar) {
            this(jVar, lVar, i10, z10);
        }

        private c(j jVar, l lVar, int i10, boolean z10) {
            this.f13863a = jVar;
            this.f13864b = lVar;
            this.f13865c = i10;
            this.f13866d = z10;
        }

        public l a() {
            return this.f13864b;
        }

        public boolean b() {
            return this.f13866d;
        }

        @Override // com.google.crypto.tink.internal.InterfaceC11299h.a
        public int getId() {
            return this.f13865c;
        }

        @Override // com.google.crypto.tink.internal.InterfaceC11299h.a
        public j getKey() {
            return this.f13863a;
        }
    }

    /* synthetic */ p(Ue.C c10, List list, C11303l c11303l, a aVar) {
        this(c10, list, c11303l);
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f13850a;

        static {
            int[] iArr = new int[Ue.z.values().length];
            f13850a = iArr;
            try {
                iArr[Ue.z.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13850a[Ue.z.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13850a[Ue.z.DESTROYED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private p(Ue.C c10, List<c> list) {
        this.f13847a = c10;
        this.f13848b = list;
        this.f13849c = C11303l.f88216b;
    }

    private static Ue.z A(l lVar) {
        if (l.f13839b.equals(lVar)) {
            return Ue.z.ENABLED;
        }
        if (l.f13840c.equals(lVar)) {
            return Ue.z.DISABLED;
        }
        if (l.f13841d.equals(lVar)) {
            return Ue.z.DESTROYED;
        }
        throw new IllegalStateException("Unknown key status");
    }

    private static void f(Ue.t tVar) throws GeneralSecurityException {
        if (tVar == null || tVar.a0().size() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(Ue.C c10) throws GeneralSecurityException {
        if (c10 == null || c10.d0() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    private c k(int i10) {
        if (this.f13848b.get(i10) != null) {
            return this.f13848b.get(i10);
        }
        throw new IllegalStateException("Keyset-Entry at position " + i10 + " has wrong status or key parsing failed");
    }

    public static b.a m(x xVar) {
        return new b.a(xVar, null);
    }

    private static List<c> q(Ue.C c10) {
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

    private <B, P> P w(final AbstractC11295d abstractC11295d, Class<P> cls, final Class<B> cls2) throws GeneralSecurityException {
        F.d(this.f13847a);
        D.b bVarH = com.google.crypto.tink.internal.D.h(cls2);
        bVarH.g(this.f13849c);
        for (int i10 = 0; i10 < size(); i10++) {
            C.c cVarC0 = this.f13847a.c0(i10);
            if (cVarC0.f0().equals(Ue.z.ENABLED)) {
                c cVar = this.f13848b.get(i10);
                if (cVar == null) {
                    throw new GeneralSecurityException("Key parsing of key with index " + i10 + " and type_url " + cVarC0.c0().d0() + " failed, unable to get primitive");
                }
                j key = cVar.getKey();
                if (cVarC0.d0() == this.f13847a.f0()) {
                    bVarH.d(key, cVarC0);
                } else {
                    bVarH.b(key, cVarC0);
                }
            }
        }
        bVarH.e(new B.b() { // from class: Ie.o
            @Override // com.google.crypto.tink.internal.B.b
            public final Object a(j jVar) {
                return abstractC11295d.b(jVar, cls2);
            }
        });
        return (P) abstractC11295d.c(bVarH.f(), cls);
    }

    public static b x() {
        return new b();
    }

    private static l y(Ue.z zVar) throws GeneralSecurityException {
        int i10 = a.f13850a[zVar.ordinal()];
        if (i10 == 1) {
            return l.f13839b;
        }
        if (i10 == 2) {
            return l.f13840c;
        }
        if (i10 == 3) {
            return l.f13841d;
        }
        throw new GeneralSecurityException("Unknown key status");
    }

    @Deprecated
    public void E(s sVar, InterfaceC3727a interfaceC3727a, byte[] bArr) throws GeneralSecurityException, IOException {
        sVar.b(j(this.f13847a, interfaceC3727a, bArr));
    }

    @Override // com.google.crypto.tink.internal.InterfaceC11299h
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public c a(int i10) {
        if (i10 >= 0 && i10 < size()) {
            return k(i10);
        }
        throw new IndexOutOfBoundsException("Invalid index " + i10 + " for keyset of size " + size());
    }

    Ue.C r() {
        return this.f13847a;
    }

    @Deprecated
    public Ue.D s() {
        return F.b(this.f13847a);
    }

    @Override // com.google.crypto.tink.internal.InterfaceC11299h
    public int size() {
        return this.f13848b.size();
    }

    @Override // com.google.crypto.tink.internal.InterfaceC11299h
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public c b() {
        for (c cVar : this.f13848b) {
            if (cVar != null && cVar.b()) {
                if (cVar.a() == l.f13839b) {
                    return cVar;
                }
                throw new IllegalStateException("Keyset has primary which isn't enabled");
            }
        }
        throw new IllegalStateException("Keyset has no valid primary");
    }

    public <P> P u(AbstractC3730d abstractC3730d, Class<P> cls) throws GeneralSecurityException {
        if (!(abstractC3730d instanceof AbstractC11295d)) {
            throw new GeneralSecurityException("Currently only subclasses of InternalConfiguration are accepted");
        }
        AbstractC11295d abstractC11295d = (AbstractC11295d) abstractC3730d;
        Class<?> clsA = abstractC11295d.a(cls);
        if (clsA != null) {
            return (P) w(abstractC11295d, cls, clsA);
        }
        throw new GeneralSecurityException("No wrapper found for " + cls.getName());
    }

    private static j B(C.c cVar) throws GeneralSecurityException {
        return com.google.crypto.tink.internal.w.c().g(D(cVar), i.a());
    }

    private static C.c C(int i10, Ue.z zVar, G g10) {
        return C.c.h0().x(Ue.y.f0().y(g10.f()).z(g10.g()).x(g10.d())).A(zVar).y(i10).z(g10.e()).build();
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

    private static Ue.C i(Ue.t tVar, InterfaceC3727a interfaceC3727a, byte[] bArr) throws GeneralSecurityException {
        try {
            Ue.C cI0 = Ue.C.i0(interfaceC3727a.b(tVar.a0().v(), bArr), C11319o.b());
            g(cI0);
            return cI0;
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    private static Ue.t j(Ue.C c10, InterfaceC3727a interfaceC3727a, byte[] bArr) throws GeneralSecurityException {
        return Ue.t.b0().x(AbstractC11312h.k(interfaceC3727a.a(c10.o(), bArr))).y(F.b(c10)).build();
    }

    static final p l(Ue.C c10) throws GeneralSecurityException {
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
    public static final p z(r rVar, InterfaceC3727a interfaceC3727a, byte[] bArr) throws GeneralSecurityException, IOException {
        Ue.t tVarA = rVar.a();
        f(tVarA);
        return l(i(tVarA, interfaceC3727a, bArr));
    }

    public String toString() {
        return s().toString();
    }

    @Deprecated
    public <P> P v(Class<P> cls) throws GeneralSecurityException {
        return (P) u(B.a(), cls);
    }

    private p(Ue.C c10, List<c> list, C11303l c11303l) {
        this.f13847a = c10;
        this.f13848b = list;
        this.f13849c = c11303l;
    }
}
