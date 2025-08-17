package Oe;

import Ie.InterfaceC3732f;
import com.google.crypto.tink.internal.A;
import com.google.crypto.tink.internal.B;
import com.google.crypto.tink.internal.C11301j;
import com.google.crypto.tink.internal.D;
import com.google.crypto.tink.internal.F;
import com.google.crypto.tink.internal.InterfaceC11299h;
import com.google.crypto.tink.internal.InterfaceC11304m;
import com.google.crypto.tink.internal.n;
import com.google.crypto.tink.internal.r;
import com.google.crypto.tink.internal.t;
import java.security.GeneralSecurityException;

/* loaded from: classes7.dex */
public class j implements F<InterfaceC3732f, InterfaceC3732f> {

    /* renamed from: a, reason: collision with root package name */
    private static final j f23618a = new j();

    /* renamed from: b, reason: collision with root package name */
    private static final B<C11301j, InterfaceC3732f> f23619b = B.b(new B.b() { // from class: Oe.i
        @Override // com.google.crypto.tink.internal.B.b
        public final Object a(Ie.j jVar) {
            return Pe.f.c((C11301j) jVar);
        }
    }, C11301j.class, InterfaceC3732f.class);

    private static class b implements InterfaceC3732f {

        /* renamed from: a, reason: collision with root package name */
        private final a f23622a;

        /* renamed from: b, reason: collision with root package name */
        private final A<a> f23623b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC11304m.a f23624c;

        /* renamed from: d, reason: collision with root package name */
        private final InterfaceC11304m.a f23625d;

        @Override // Ie.InterfaceC3732f
        public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            try {
                byte[] bArrA = this.f23622a.f23620a.a(bArr, bArr2);
                this.f23624c.a(this.f23622a.f23621b, bArr.length);
                return bArrA;
            } catch (GeneralSecurityException e10) {
                this.f23624c.b();
                throw e10;
            }
        }

        @Override // Ie.InterfaceC3732f
        public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            for (a aVar : this.f23623b.a(bArr)) {
                try {
                    byte[] bArrB = aVar.f23620a.b(bArr, bArr2);
                    this.f23625d.a(aVar.f23621b, bArr.length);
                    return bArrB;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.f23625d.b();
            throw new GeneralSecurityException("decryption failed");
        }

        public b(a aVar, A<a> a10, InterfaceC11304m.a aVar2, InterfaceC11304m.a aVar3) {
            this.f23622a = aVar;
            this.f23623b = a10;
            this.f23624c = aVar2;
            this.f23625d = aVar3;
        }
    }

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC3732f f23620a;

        /* renamed from: b, reason: collision with root package name */
        public final int f23621b;

        public a(InterfaceC3732f interfaceC3732f, int i10) {
            this.f23620a = interfaceC3732f;
            this.f23621b = i10;
        }
    }

    private static We.a d(Ie.j jVar) throws GeneralSecurityException {
        if (jVar instanceof g) {
            return ((g) jVar).b();
        }
        if (jVar instanceof C11301j) {
            return ((C11301j) jVar).d();
        }
        throw new GeneralSecurityException("Cannot get output prefix for key of class " + jVar.getClass().getName() + " with parameters " + jVar.a());
    }

    @Override // com.google.crypto.tink.internal.F
    public Class<InterfaceC3732f> a() {
        return InterfaceC3732f.class;
    }

    @Override // com.google.crypto.tink.internal.F
    public Class<InterfaceC3732f> c() {
        return InterfaceC3732f.class;
    }

    @Override // com.google.crypto.tink.internal.F
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public InterfaceC3732f b(D<InterfaceC3732f> d10) throws GeneralSecurityException {
        InterfaceC11304m.a aVarA;
        InterfaceC11304m.a aVarA2;
        A.b bVar = new A.b();
        InterfaceC11299h interfaceC11299hE = d10.e();
        for (int i10 = 0; i10 < interfaceC11299hE.size(); i10++) {
            InterfaceC11299h.a aVarA3 = interfaceC11299hE.a(i10);
            bVar.b(d(aVarA3.getKey()), new a(d10.g(aVarA3), aVarA3.getId()));
        }
        if (d10.d().a()) {
            aVarA = n.f88219a;
            aVarA2 = aVarA;
        } else {
            InterfaceC11304m interfaceC11304mA = r.b().a();
            aVarA = interfaceC11304mA.a(interfaceC11299hE, d10.d(), "daead", "encrypt");
            aVarA2 = interfaceC11304mA.a(interfaceC11299hE, d10.d(), "daead", "decrypt");
        }
        return new b(new a(d10.g(interfaceC11299hE.b()), interfaceC11299hE.b().getId()), bVar.a(), aVarA, aVarA2);
    }

    j() {
    }

    public static void e() throws GeneralSecurityException {
        t.c().e(f23618a);
        t.c().d(f23619b);
    }
}
