package Qe;

import Ke.InterfaceC3891f;
import com.google.crypto.tink.internal.A;
import com.google.crypto.tink.internal.B;
import com.google.crypto.tink.internal.C11426j;
import com.google.crypto.tink.internal.D;
import com.google.crypto.tink.internal.F;
import com.google.crypto.tink.internal.InterfaceC11424h;
import com.google.crypto.tink.internal.InterfaceC11429m;
import com.google.crypto.tink.internal.n;
import com.google.crypto.tink.internal.r;
import com.google.crypto.tink.internal.t;
import java.security.GeneralSecurityException;

/* loaded from: classes8.dex */
public class j implements F<InterfaceC3891f, InterfaceC3891f> {

    /* renamed from: a, reason: collision with root package name */
    private static final j f28106a = new j();

    /* renamed from: b, reason: collision with root package name */
    private static final B<C11426j, InterfaceC3891f> f28107b = B.b(new B.b() { // from class: Qe.i
        @Override // com.google.crypto.tink.internal.B.b
        public final Object a(Ke.j jVar) {
            return Re.f.c((C11426j) jVar);
        }
    }, C11426j.class, InterfaceC3891f.class);

    private static class b implements InterfaceC3891f {

        /* renamed from: a, reason: collision with root package name */
        private final a f28110a;

        /* renamed from: b, reason: collision with root package name */
        private final A<a> f28111b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC11429m.a f28112c;

        /* renamed from: d, reason: collision with root package name */
        private final InterfaceC11429m.a f28113d;

        @Override // Ke.InterfaceC3891f
        public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            try {
                byte[] bArrA = this.f28110a.f28108a.a(bArr, bArr2);
                this.f28112c.a(this.f28110a.f28109b, bArr.length);
                return bArrA;
            } catch (GeneralSecurityException e10) {
                this.f28112c.b();
                throw e10;
            }
        }

        @Override // Ke.InterfaceC3891f
        public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            for (a aVar : this.f28111b.a(bArr)) {
                try {
                    byte[] bArrB = aVar.f28108a.b(bArr, bArr2);
                    this.f28113d.a(aVar.f28109b, bArr.length);
                    return bArrB;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.f28113d.b();
            throw new GeneralSecurityException("decryption failed");
        }

        public b(a aVar, A<a> a10, InterfaceC11429m.a aVar2, InterfaceC11429m.a aVar3) {
            this.f28110a = aVar;
            this.f28111b = a10;
            this.f28112c = aVar2;
            this.f28113d = aVar3;
        }
    }

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC3891f f28108a;

        /* renamed from: b, reason: collision with root package name */
        public final int f28109b;

        public a(InterfaceC3891f interfaceC3891f, int i10) {
            this.f28108a = interfaceC3891f;
            this.f28109b = i10;
        }
    }

    private static Ye.a d(Ke.j jVar) throws GeneralSecurityException {
        if (jVar instanceof g) {
            return ((g) jVar).b();
        }
        if (jVar instanceof C11426j) {
            return ((C11426j) jVar).d();
        }
        throw new GeneralSecurityException("Cannot get output prefix for key of class " + jVar.getClass().getName() + " with parameters " + jVar.a());
    }

    @Override // com.google.crypto.tink.internal.F
    public Class<InterfaceC3891f> a() {
        return InterfaceC3891f.class;
    }

    @Override // com.google.crypto.tink.internal.F
    public Class<InterfaceC3891f> c() {
        return InterfaceC3891f.class;
    }

    @Override // com.google.crypto.tink.internal.F
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public InterfaceC3891f b(D<InterfaceC3891f> d10) throws GeneralSecurityException {
        InterfaceC11429m.a aVarA;
        InterfaceC11429m.a aVarA2;
        A.b bVar = new A.b();
        InterfaceC11424h interfaceC11424hE = d10.e();
        for (int i10 = 0; i10 < interfaceC11424hE.size(); i10++) {
            InterfaceC11424h.a aVarA3 = interfaceC11424hE.a(i10);
            bVar.b(d(aVarA3.getKey()), new a(d10.g(aVarA3), aVarA3.getId()));
        }
        if (d10.d().a()) {
            aVarA = n.f89059a;
            aVarA2 = aVarA;
        } else {
            InterfaceC11429m interfaceC11429mA = r.b().a();
            aVarA = interfaceC11429mA.a(interfaceC11424hE, d10.d(), "daead", "encrypt");
            aVarA2 = interfaceC11429mA.a(interfaceC11424hE, d10.d(), "daead", "decrypt");
        }
        return new b(new a(d10.g(interfaceC11424hE.b()), interfaceC11424hE.b().getId()), bVar.a(), aVarA, aVarA2);
    }

    j() {
    }

    public static void e() throws GeneralSecurityException {
        t.c().e(f28106a);
        t.c().d(f28107b);
    }
}
