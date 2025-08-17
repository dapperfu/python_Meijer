package ec;

import Bb.e;
import Db.d;
import fc.C13870a;
import fc.C13871b;
import fc.C13872c;
import gc.C14232a;
import gc.C14233b;
import gc.c;
import java.util.List;
import sb.C16920c;
import tb.C17076a;
import tb.h;
import tb.n;
import vb.C17538d;

/* renamed from: ec.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13641b implements InterfaceC13640a {

    /* renamed from: a, reason: collision with root package name */
    private Hb.a f128656a;

    /* renamed from: b, reason: collision with root package name */
    private C16920c f128657b;

    /* renamed from: c, reason: collision with root package name */
    private C17538d f128658c;

    /* renamed from: d, reason: collision with root package name */
    private e f128659d;

    /* renamed from: e, reason: collision with root package name */
    private String f128660e;

    /* renamed from: f, reason: collision with root package name */
    private d f128661f;

    @Override // ec.InterfaceC13640a
    public final void a(String str, Integer num, Integer num2, Rb.a<List<Qb.b>> aVar) {
        c cVar = new c();
        cVar.g(str);
        cVar.e(num);
        cVar.f(num2);
        new h(this.f128656a, this.f128659d, this.f128660e, this.f128661f).d(cVar, aVar, this.f128657b, this.f128658c);
    }

    @Override // ec.InterfaceC13640a
    public final void b(gc.d dVar, Rb.a<gc.e> aVar) {
        new C13871b(this.f128656a).d(dVar, aVar, this.f128657b, this.f128658c);
    }

    @Override // ec.InterfaceC13640a
    public final void c(gc.d dVar, Rb.a<gc.e> aVar) {
        new C13870a(this.f128656a).d(dVar, aVar, this.f128657b, this.f128658c);
    }

    @Override // ec.InterfaceC13640a
    public final void d(C14233b c14233b, Rb.a<C14232a> aVar) {
        new C13872c(this.f128656a).d(c14233b, aVar, this.f128657b, this.f128658c);
    }

    @Override // ec.InterfaceC13640a
    public final void e(C17076a c17076a, Rb.a<C14232a> aVar) {
        new n(this.f128656a).d(c17076a, aVar, this.f128657b, this.f128658c);
    }

    public C13641b(C16920c c16920c, Hb.a aVar, C17538d c17538d, e eVar, String str, d dVar) {
        this.f128657b = c16920c;
        this.f128656a = aVar;
        this.f128658c = c17538d;
        this.f128659d = eVar;
        this.f128660e = str;
        this.f128661f = dVar;
    }
}
