package Je;

import Ie.InterfaceC3727a;
import com.google.crypto.tink.internal.A;
import com.google.crypto.tink.internal.B;
import com.google.crypto.tink.internal.C11301j;
import com.google.crypto.tink.internal.InterfaceC11299h;
import com.google.crypto.tink.internal.InterfaceC11304m;
import java.security.GeneralSecurityException;

/* renamed from: Je.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3785e implements com.google.crypto.tink.internal.F<InterfaceC3727a, InterfaceC3727a> {

    /* renamed from: a, reason: collision with root package name */
    private static final C3785e f14938a = new C3785e();

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.B<C11301j, InterfaceC3727a> f14939b = com.google.crypto.tink.internal.B.b(new B.b() { // from class: Je.d
        @Override // com.google.crypto.tink.internal.B.b
        public final Object a(Ie.j jVar) {
            return Ke.J.d((C11301j) jVar);
        }
    }, C11301j.class, InterfaceC3727a.class);

    /* renamed from: Je.e$c */
    private static class c implements InterfaceC3727a {

        /* renamed from: a, reason: collision with root package name */
        private final b f14942a;

        /* renamed from: b, reason: collision with root package name */
        private final com.google.crypto.tink.internal.A<b> f14943b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC11304m.a f14944c;

        /* renamed from: d, reason: collision with root package name */
        private final InterfaceC11304m.a f14945d;

        private c(b bVar, com.google.crypto.tink.internal.A<b> a10, InterfaceC11304m.a aVar, InterfaceC11304m.a aVar2) {
            this.f14942a = bVar;
            this.f14943b = a10;
            this.f14944c = aVar;
            this.f14945d = aVar2;
        }

        @Override // Ie.InterfaceC3727a
        public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            try {
                byte[] bArrA = this.f14942a.f14940a.a(bArr, bArr2);
                this.f14944c.a(this.f14942a.f14941b, bArr.length);
                return bArrA;
            } catch (GeneralSecurityException e10) {
                this.f14944c.b();
                throw e10;
            }
        }

        @Override // Ie.InterfaceC3727a
        public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            for (b bVar : this.f14943b.a(bArr)) {
                try {
                    byte[] bArrB = bVar.f14940a.b(bArr, bArr2);
                    this.f14945d.a(bVar.f14941b, bArr.length);
                    return bArrB;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.f14945d.b();
            throw new GeneralSecurityException("decryption failed");
        }
    }

    /* renamed from: Je.e$b */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC3727a f14940a;

        /* renamed from: b, reason: collision with root package name */
        public final int f14941b;

        public b(InterfaceC3727a interfaceC3727a, int i10) {
            this.f14940a = interfaceC3727a;
            this.f14941b = i10;
        }
    }

    private static We.a d(Ie.j jVar) throws GeneralSecurityException {
        if (jVar instanceof AbstractC3782b) {
            return ((AbstractC3782b) jVar).b();
        }
        if (jVar instanceof C11301j) {
            return ((C11301j) jVar).d();
        }
        throw new GeneralSecurityException("Cannot get output prefix for key of class " + jVar.getClass().getName() + " with parameters " + jVar.a());
    }

    @Override // com.google.crypto.tink.internal.F
    public Class<InterfaceC3727a> a() {
        return InterfaceC3727a.class;
    }

    @Override // com.google.crypto.tink.internal.F
    public Class<InterfaceC3727a> c() {
        return InterfaceC3727a.class;
    }

    @Override // com.google.crypto.tink.internal.F
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public InterfaceC3727a b(com.google.crypto.tink.internal.D<InterfaceC3727a> d10) throws GeneralSecurityException {
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
            InterfaceC11304m.a aVarA3 = interfaceC11304mA.a(interfaceC11299hE, d10.d(), "aead", "encrypt");
            aVarA = interfaceC11304mA.a(interfaceC11299hE, d10.d(), "aead", "decrypt");
            aVar = aVarA3;
        }
        return new c(new b(d10.g(interfaceC11299hE.b()), interfaceC11299hE.b().getId()), bVar.a(), aVar, aVarA);
    }

    C3785e() {
    }

    public static void e() throws GeneralSecurityException {
        com.google.crypto.tink.internal.t.c().e(f14938a);
        com.google.crypto.tink.internal.t.c().d(f14939b);
    }
}
