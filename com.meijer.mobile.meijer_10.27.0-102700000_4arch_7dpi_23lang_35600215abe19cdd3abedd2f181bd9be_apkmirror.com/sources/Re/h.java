package Re;

import com.google.crypto.tink.internal.A;
import com.google.crypto.tink.internal.C11301j;
import com.google.crypto.tink.internal.D;
import com.google.crypto.tink.internal.F;
import com.google.crypto.tink.internal.InterfaceC11299h;
import java.security.GeneralSecurityException;

/* loaded from: classes7.dex */
public class h implements F<g, g> {

    /* renamed from: a, reason: collision with root package name */
    private static final h f32154a = new h();

    private static class b implements g {

        /* renamed from: a, reason: collision with root package name */
        private final A<g> f32155a;

        /* renamed from: b, reason: collision with root package name */
        private final g f32156b;

        private b(A<g> a10, g gVar) {
            this.f32155a = a10;
            this.f32156b = gVar;
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
    public Class<g> a() {
        return g.class;
    }

    @Override // com.google.crypto.tink.internal.F
    public Class<g> c() {
        return g.class;
    }

    @Override // com.google.crypto.tink.internal.F
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public g b(D<g> d10) throws GeneralSecurityException {
        if (d10 == null) {
            throw new GeneralSecurityException("primitive set must be non-null");
        }
        InterfaceC11299h interfaceC11299hE = d10.e();
        InterfaceC11299h.a aVarB = interfaceC11299hE.b();
        if (aVarB == null) {
            throw new GeneralSecurityException("no primary in primitive set");
        }
        A.b bVar = new A.b();
        for (int i10 = 0; i10 < interfaceC11299hE.size(); i10++) {
            InterfaceC11299h.a aVarA = interfaceC11299hE.a(i10);
            bVar.b(d(aVarA.getKey()), d10.g(aVarA));
        }
        return new b(bVar.a(), d10.g(aVarB));
    }

    private h() {
    }

    static void e() throws GeneralSecurityException {
        com.google.crypto.tink.internal.t.c().e(f32154a);
    }
}
