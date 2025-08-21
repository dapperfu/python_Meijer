package Le;

import Ke.InterfaceC3886a;
import com.google.crypto.tink.internal.A;
import com.google.crypto.tink.internal.B;
import com.google.crypto.tink.internal.C11426j;
import com.google.crypto.tink.internal.InterfaceC11424h;
import com.google.crypto.tink.internal.InterfaceC11429m;
import java.security.GeneralSecurityException;

/* renamed from: Le.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C4029e implements com.google.crypto.tink.internal.F<InterfaceC3886a, InterfaceC3886a> {

    /* renamed from: a, reason: collision with root package name */
    private static final C4029e f18275a = new C4029e();

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.B<C11426j, InterfaceC3886a> f18276b = com.google.crypto.tink.internal.B.b(new B.b() { // from class: Le.d
        @Override // com.google.crypto.tink.internal.B.b
        public final Object a(Ke.j jVar) {
            return Me.J.d((C11426j) jVar);
        }
    }, C11426j.class, InterfaceC3886a.class);

    /* renamed from: Le.e$c */
    private static class c implements InterfaceC3886a {

        /* renamed from: a, reason: collision with root package name */
        private final b f18279a;

        /* renamed from: b, reason: collision with root package name */
        private final com.google.crypto.tink.internal.A<b> f18280b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC11429m.a f18281c;

        /* renamed from: d, reason: collision with root package name */
        private final InterfaceC11429m.a f18282d;

        private c(b bVar, com.google.crypto.tink.internal.A<b> a10, InterfaceC11429m.a aVar, InterfaceC11429m.a aVar2) {
            this.f18279a = bVar;
            this.f18280b = a10;
            this.f18281c = aVar;
            this.f18282d = aVar2;
        }

        @Override // Ke.InterfaceC3886a
        public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            try {
                byte[] bArrA = this.f18279a.f18277a.a(bArr, bArr2);
                this.f18281c.a(this.f18279a.f18278b, bArr.length);
                return bArrA;
            } catch (GeneralSecurityException e10) {
                this.f18281c.b();
                throw e10;
            }
        }

        @Override // Ke.InterfaceC3886a
        public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            for (b bVar : this.f18280b.a(bArr)) {
                try {
                    byte[] bArrB = bVar.f18277a.b(bArr, bArr2);
                    this.f18282d.a(bVar.f18278b, bArr.length);
                    return bArrB;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.f18282d.b();
            throw new GeneralSecurityException("decryption failed");
        }
    }

    /* renamed from: Le.e$b */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC3886a f18277a;

        /* renamed from: b, reason: collision with root package name */
        public final int f18278b;

        public b(InterfaceC3886a interfaceC3886a, int i10) {
            this.f18277a = interfaceC3886a;
            this.f18278b = i10;
        }
    }

    private static Ye.a d(Ke.j jVar) throws GeneralSecurityException {
        if (jVar instanceof AbstractC4026b) {
            return ((AbstractC4026b) jVar).b();
        }
        if (jVar instanceof C11426j) {
            return ((C11426j) jVar).d();
        }
        throw new GeneralSecurityException("Cannot get output prefix for key of class " + jVar.getClass().getName() + " with parameters " + jVar.a());
    }

    @Override // com.google.crypto.tink.internal.F
    public Class<InterfaceC3886a> a() {
        return InterfaceC3886a.class;
    }

    @Override // com.google.crypto.tink.internal.F
    public Class<InterfaceC3886a> c() {
        return InterfaceC3886a.class;
    }

    @Override // com.google.crypto.tink.internal.F
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public InterfaceC3886a b(com.google.crypto.tink.internal.D<InterfaceC3886a> d10) throws GeneralSecurityException {
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
            InterfaceC11429m.a aVarA3 = interfaceC11429mA.a(interfaceC11424hE, d10.d(), "aead", "encrypt");
            aVarA = interfaceC11429mA.a(interfaceC11424hE, d10.d(), "aead", "decrypt");
            aVar = aVarA3;
        }
        return new c(new b(d10.g(interfaceC11424hE.b()), interfaceC11424hE.b().getId()), bVar.a(), aVar, aVarA);
    }

    C4029e() {
    }

    public static void e() throws GeneralSecurityException {
        com.google.crypto.tink.internal.t.c().e(f18275a);
        com.google.crypto.tink.internal.t.c().d(f18276b);
    }
}
