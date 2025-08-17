package Ed;

import android.content.Context;
import pc.AbstractC16280d;
import pc.C16279c;
import pc.InterfaceC16284h;
import pc.InterfaceC16285i;
import pc.InterfaceC16286j;

/* loaded from: classes6.dex */
public final class D5 implements InterfaceC3542q5 {

    /* renamed from: a, reason: collision with root package name */
    private If.b f7889a;

    /* renamed from: b, reason: collision with root package name */
    private final If.b f7890b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC3555s5 f7891c;

    @Override // Ed.InterfaceC3542q5
    public final void a(InterfaceC3535p5 interfaceC3535p5) {
        if (this.f7891c.a() != 0) {
            ((InterfaceC16285i) this.f7890b.get()).a(b(this.f7891c, interfaceC3535p5));
            return;
        }
        If.b bVar = this.f7889a;
        if (bVar != null) {
            ((InterfaceC16285i) bVar.get()).a(b(this.f7891c, interfaceC3535p5));
        }
    }

    public D5(Context context, AbstractC3555s5 abstractC3555s5) {
        this.f7891c = abstractC3555s5;
        com.google.android.datatransport.cct.a aVar = com.google.android.datatransport.cct.a.f64416g;
        rc.u.f(context);
        final InterfaceC16286j interfaceC16286jH = rc.u.c().h(aVar);
        if (aVar.a().contains(C16279c.b("json"))) {
            this.f7889a = new bf.t(new If.b() { // from class: Ed.A5
                @Override // If.b
                public final Object get() {
                    return interfaceC16286jH.a("FIREBASE_ML_SDK", byte[].class, C16279c.b("json"), new InterfaceC16284h() { // from class: Ed.C5
                        @Override // pc.InterfaceC16284h
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.f7890b = new bf.t(new If.b() { // from class: Ed.B5
            @Override // If.b
            public final Object get() {
                return interfaceC16286jH.a("FIREBASE_ML_SDK", byte[].class, C16279c.b("proto"), new InterfaceC16284h() { // from class: Ed.z5
                    @Override // pc.InterfaceC16284h
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    static AbstractC16280d b(AbstractC3555s5 abstractC3555s5, InterfaceC3535p5 interfaceC3535p5) {
        return AbstractC16280d.h(interfaceC3535p5.c(abstractC3555s5.a(), false));
    }
}
