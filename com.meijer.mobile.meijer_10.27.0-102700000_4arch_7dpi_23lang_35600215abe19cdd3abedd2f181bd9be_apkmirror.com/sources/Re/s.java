package Re;

import com.google.crypto.tink.internal.A;
import com.google.crypto.tink.internal.B;
import com.google.crypto.tink.internal.C11301j;
import com.google.crypto.tink.internal.D;
import com.google.crypto.tink.internal.F;
import com.google.crypto.tink.internal.InterfaceC11299h;
import com.google.crypto.tink.internal.InterfaceC11304m;
import java.security.GeneralSecurityException;

/* loaded from: classes7.dex */
public class s implements F<Ie.w, Ie.w> {

    /* renamed from: a, reason: collision with root package name */
    private static final s f32193a = new s();

    /* renamed from: b, reason: collision with root package name */
    private static final B<C11301j, Ie.w> f32194b = B.b(new B.b() { // from class: Re.r
        @Override // com.google.crypto.tink.internal.B.b
        public final Object a(Ie.j jVar) {
            return Se.n.c((C11301j) jVar);
        }
    }, C11301j.class, Ie.w.class);

    private static class c implements Ie.w {

        /* renamed from: a, reason: collision with root package name */
        private final b f32197a;

        /* renamed from: b, reason: collision with root package name */
        private final A<b> f32198b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC11304m.a f32199c;

        /* renamed from: d, reason: collision with root package name */
        private final InterfaceC11304m.a f32200d;

        private c(b bVar, A<b> a10, InterfaceC11304m.a aVar, InterfaceC11304m.a aVar2) {
            this.f32197a = bVar;
            this.f32198b = a10;
            this.f32199c = aVar;
            this.f32200d = aVar2;
        }

        @Override // Ie.w
        public void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            for (b bVar : this.f32198b.a(bArr)) {
                try {
                    bVar.f32195a.a(bArr, bArr2);
                    this.f32200d.a(bVar.f32196b, bArr2.length);
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.f32200d.b();
            throw new GeneralSecurityException("invalid MAC");
        }

        @Override // Ie.w
        public byte[] b(byte[] bArr) throws GeneralSecurityException {
            try {
                byte[] bArrB = this.f32197a.f32195a.b(bArr);
                this.f32199c.a(this.f32197a.f32196b, bArr.length);
                return bArrB;
            } catch (GeneralSecurityException e10) {
                this.f32199c.b();
                throw e10;
            }
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        public final Ie.w f32195a;

        /* renamed from: b, reason: collision with root package name */
        public final int f32196b;

        public b(Ie.w wVar, int i10) {
            this.f32195a = wVar;
            this.f32196b = i10;
        }
    }

    private static We.a d(Ie.j jVar) throws GeneralSecurityException {
        if (jVar instanceof p) {
            return ((p) jVar).b();
        }
        if (jVar instanceof C11301j) {
            return ((C11301j) jVar).d();
        }
        throw new GeneralSecurityException("Cannot get output prefix for key of class " + jVar.getClass().getName() + " with parameters " + jVar.a());
    }

    @Override // com.google.crypto.tink.internal.F
    public Class<Ie.w> a() {
        return Ie.w.class;
    }

    @Override // com.google.crypto.tink.internal.F
    public Class<Ie.w> c() {
        return Ie.w.class;
    }

    @Override // com.google.crypto.tink.internal.F
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Ie.w b(D<Ie.w> d10) throws GeneralSecurityException {
        InterfaceC11304m.a aVar;
        InterfaceC11304m.a aVarA;
        A.b bVar = new A.b();
        InterfaceC11299h interfaceC11299hE = d10.e();
        for (int i10 = 0; i10 < interfaceC11299hE.size(); i10++) {
            InterfaceC11299h.a aVarA2 = interfaceC11299hE.a(i10);
            bVar.b(d(aVarA2.getKey()), new b(d10.g(aVarA2), aVarA2.getId()));
        }
        if (d10.d().a()) {
            aVar = com.google.crypto.tink.internal.n.f88219a;
            aVarA = aVar;
        } else {
            InterfaceC11304m interfaceC11304mA = com.google.crypto.tink.internal.r.b().a();
            InterfaceC11304m.a aVarA3 = interfaceC11304mA.a(interfaceC11299hE, d10.d(), "mac", "compute");
            aVarA = interfaceC11304mA.a(interfaceC11299hE, d10.d(), "mac", "verify");
            aVar = aVarA3;
        }
        return new c(new b(d10.g(interfaceC11299hE.b()), interfaceC11299hE.b().getId()), bVar.a(), aVar, aVarA);
    }

    s() {
    }

    static void e() throws GeneralSecurityException {
        com.google.crypto.tink.internal.t.c().e(f32193a);
        com.google.crypto.tink.internal.t.c().d(f32194b);
    }
}
