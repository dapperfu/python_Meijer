package tc;

import rc.AbstractC16884d;
import rc.C16883c;
import rc.InterfaceC16888h;
import rc.InterfaceC16889i;
import rc.InterfaceC16891k;

/* loaded from: classes4.dex */
final class s<T> implements InterfaceC16889i<T> {

    /* renamed from: a, reason: collision with root package name */
    private final p f162479a;

    /* renamed from: b, reason: collision with root package name */
    private final String f162480b;

    /* renamed from: c, reason: collision with root package name */
    private final C16883c f162481c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC16888h<T, byte[]> f162482d;

    /* renamed from: e, reason: collision with root package name */
    private final t f162483e;

    public static /* synthetic */ void c(Exception exc) {
    }

    @Override // rc.InterfaceC16889i
    public void a(AbstractC16884d<T> abstractC16884d, InterfaceC16891k interfaceC16891k) {
        this.f162483e.a(o.a().e(this.f162479a).c(abstractC16884d).f(this.f162480b).d(this.f162482d).b(this.f162481c).a(), interfaceC16891k);
    }

    @Override // rc.InterfaceC16889i
    public void b(AbstractC16884d<T> abstractC16884d) {
        a(abstractC16884d, new InterfaceC16891k() { // from class: tc.r
            @Override // rc.InterfaceC16891k
            public final void a(Exception exc) {
                s.c(exc);
            }
        });
    }

    p d() {
        return this.f162479a;
    }

    s(p pVar, String str, C16883c c16883c, InterfaceC16888h<T, byte[]> interfaceC16888h, t tVar) {
        this.f162479a = pVar;
        this.f162480b = str;
        this.f162481c = c16883c;
        this.f162482d = interfaceC16888h;
        this.f162483e = tVar;
    }
}
