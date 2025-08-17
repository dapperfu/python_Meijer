package rc;

import pc.AbstractC16280d;
import pc.C16279c;
import pc.InterfaceC16284h;
import pc.InterfaceC16285i;
import pc.InterfaceC16287k;

/* loaded from: classes4.dex */
final class s<T> implements InterfaceC16285i<T> {

    /* renamed from: a, reason: collision with root package name */
    private final p f157989a;

    /* renamed from: b, reason: collision with root package name */
    private final String f157990b;

    /* renamed from: c, reason: collision with root package name */
    private final C16279c f157991c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC16284h<T, byte[]> f157992d;

    /* renamed from: e, reason: collision with root package name */
    private final t f157993e;

    public static /* synthetic */ void c(Exception exc) {
    }

    @Override // pc.InterfaceC16285i
    public void a(AbstractC16280d<T> abstractC16280d) {
        b(abstractC16280d, new InterfaceC16287k() { // from class: rc.r
            @Override // pc.InterfaceC16287k
            public final void a(Exception exc) {
                s.c(exc);
            }
        });
    }

    @Override // pc.InterfaceC16285i
    public void b(AbstractC16280d<T> abstractC16280d, InterfaceC16287k interfaceC16287k) {
        this.f157993e.a(o.a().e(this.f157989a).c(abstractC16280d).f(this.f157990b).d(this.f157992d).b(this.f157991c).a(), interfaceC16287k);
    }

    p d() {
        return this.f157989a;
    }

    s(p pVar, String str, C16279c c16279c, InterfaceC16284h<T, byte[]> interfaceC16284h, t tVar) {
        this.f157989a = pVar;
        this.f157990b = str;
        this.f157991c = c16279c;
        this.f157992d = interfaceC16284h;
        this.f157993e = tVar;
    }
}
