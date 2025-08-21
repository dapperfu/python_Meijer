package Te;

import com.google.crypto.tink.internal.A;
import com.google.crypto.tink.internal.C11426j;
import com.google.crypto.tink.internal.D;
import com.google.crypto.tink.internal.F;
import com.google.crypto.tink.internal.InterfaceC11424h;
import java.security.GeneralSecurityException;

/* loaded from: classes8.dex */
public class h implements F<g, g> {

    /* renamed from: a, reason: collision with root package name */
    private static final h f36154a = new h();

    private static class b implements g {

        /* renamed from: a, reason: collision with root package name */
        private final A<g> f36155a;

        /* renamed from: b, reason: collision with root package name */
        private final g f36156b;

        private b(A<g> a10, g gVar) {
            this.f36155a = a10;
            this.f36156b = gVar;
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
        InterfaceC11424h interfaceC11424hE = d10.e();
        InterfaceC11424h.a aVarB = interfaceC11424hE.b();
        if (aVarB == null) {
            throw new GeneralSecurityException("no primary in primitive set");
        }
        A.b bVar = new A.b();
        for (int i10 = 0; i10 < interfaceC11424hE.size(); i10++) {
            InterfaceC11424h.a aVarA = interfaceC11424hE.a(i10);
            bVar.b(d(aVarA.getKey()), d10.g(aVarA));
        }
        return new b(bVar.a(), d10.g(aVarB));
    }

    private h() {
    }

    static void e() throws GeneralSecurityException {
        com.google.crypto.tink.internal.t.c().e(f36154a);
    }
}
