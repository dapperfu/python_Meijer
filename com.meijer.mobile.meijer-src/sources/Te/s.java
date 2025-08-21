package Te;

import com.google.crypto.tink.internal.A;
import com.google.crypto.tink.internal.B;
import com.google.crypto.tink.internal.C11426j;
import com.google.crypto.tink.internal.D;
import com.google.crypto.tink.internal.F;
import com.google.crypto.tink.internal.InterfaceC11424h;
import com.google.crypto.tink.internal.InterfaceC11429m;
import java.security.GeneralSecurityException;

/* loaded from: classes8.dex */
public class s implements F<Ke.w, Ke.w> {

    /* renamed from: a, reason: collision with root package name */
    private static final s f36193a = new s();

    /* renamed from: b, reason: collision with root package name */
    private static final B<C11426j, Ke.w> f36194b = B.b(new B.b() { // from class: Te.r
        @Override // com.google.crypto.tink.internal.B.b
        public final Object a(Ke.j jVar) {
            return Ue.n.c((C11426j) jVar);
        }
    }, C11426j.class, Ke.w.class);

    private static class c implements Ke.w {

        /* renamed from: a, reason: collision with root package name */
        private final b f36197a;

        /* renamed from: b, reason: collision with root package name */
        private final A<b> f36198b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC11429m.a f36199c;

        /* renamed from: d, reason: collision with root package name */
        private final InterfaceC11429m.a f36200d;

        private c(b bVar, A<b> a10, InterfaceC11429m.a aVar, InterfaceC11429m.a aVar2) {
            this.f36197a = bVar;
            this.f36198b = a10;
            this.f36199c = aVar;
            this.f36200d = aVar2;
        }

        @Override // Ke.w
        public void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            for (b bVar : this.f36198b.a(bArr)) {
                try {
                    bVar.f36195a.a(bArr, bArr2);
                    this.f36200d.a(bVar.f36196b, bArr2.length);
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.f36200d.b();
            throw new GeneralSecurityException("invalid MAC");
        }

        @Override // Ke.w
        public byte[] b(byte[] bArr) throws GeneralSecurityException {
            try {
                byte[] bArrB = this.f36197a.f36195a.b(bArr);
                this.f36199c.a(this.f36197a.f36196b, bArr.length);
                return bArrB;
            } catch (GeneralSecurityException e10) {
                this.f36199c.b();
                throw e10;
            }
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        public final Ke.w f36195a;

        /* renamed from: b, reason: collision with root package name */
        public final int f36196b;

        public b(Ke.w wVar, int i10) {
            this.f36195a = wVar;
            this.f36196b = i10;
        }
    }

    private static Ye.a d(Ke.j jVar) throws GeneralSecurityException {
        if (jVar instanceof p) {
            return ((p) jVar).b();
        }
        if (jVar instanceof C11426j) {
            return ((C11426j) jVar).d();
        }
        throw new GeneralSecurityException("Cannot get output prefix for key of class " + jVar.getClass().getName() + " with parameters " + jVar.a());
    }

    @Override // com.google.crypto.tink.internal.F
    public Class<Ke.w> a() {
        return Ke.w.class;
    }

    @Override // com.google.crypto.tink.internal.F
    public Class<Ke.w> c() {
        return Ke.w.class;
    }

    @Override // com.google.crypto.tink.internal.F
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Ke.w b(D<Ke.w> d10) throws GeneralSecurityException {
        InterfaceC11429m.a aVar;
        InterfaceC11429m.a aVarA;
        A.b bVar = new A.b();
        InterfaceC11424h interfaceC11424hE = d10.e();
        for (int i10 = 0; i10 < interfaceC11424hE.size(); i10++) {
            InterfaceC11424h.a aVarA2 = interfaceC11424hE.a(i10);
            bVar.b(d(aVarA2.getKey()), new b(d10.g(aVarA2), aVarA2.getId()));
        }
        if (d10.d().a()) {
            aVar = com.google.crypto.tink.internal.n.f89059a;
            aVarA = aVar;
        } else {
            InterfaceC11429m interfaceC11429mA = com.google.crypto.tink.internal.r.b().a();
            InterfaceC11429m.a aVarA3 = interfaceC11429mA.a(interfaceC11424hE, d10.d(), "mac", "compute");
            aVarA = interfaceC11429mA.a(interfaceC11424hE, d10.d(), "mac", "verify");
            aVar = aVarA3;
        }
        return new c(new b(d10.g(interfaceC11424hE.b()), interfaceC11424hE.b().getId()), bVar.a(), aVar, aVarA);
    }

    s() {
    }

    static void e() throws GeneralSecurityException {
        com.google.crypto.tink.internal.t.c().e(f36193a);
        com.google.crypto.tink.internal.t.c().d(f36194b);
    }
}
