package Gd;

import android.content.Context;
import rc.AbstractC16884d;
import rc.C16883c;
import rc.InterfaceC16888h;
import rc.InterfaceC16889i;
import rc.InterfaceC16890j;

/* loaded from: classes6.dex */
public final class D5 implements InterfaceC3734q5 {

    /* renamed from: a, reason: collision with root package name */
    private Kf.b f11441a;

    /* renamed from: b, reason: collision with root package name */
    private final Kf.b f11442b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC3747s5 f11443c;

    @Override // Gd.InterfaceC3734q5
    public final void a(InterfaceC3727p5 interfaceC3727p5) {
        if (this.f11443c.a() != 0) {
            ((InterfaceC16889i) this.f11442b.get()).b(b(this.f11443c, interfaceC3727p5));
            return;
        }
        Kf.b bVar = this.f11441a;
        if (bVar != null) {
            ((InterfaceC16889i) bVar.get()).b(b(this.f11443c, interfaceC3727p5));
        }
    }

    public D5(Context context, AbstractC3747s5 abstractC3747s5) {
        this.f11443c = abstractC3747s5;
        com.google.android.datatransport.cct.a aVar = com.google.android.datatransport.cct.a.f65256g;
        tc.u.f(context);
        final InterfaceC16890j interfaceC16890jH = tc.u.c().h(aVar);
        if (aVar.a().contains(C16883c.b("json"))) {
            this.f11441a = new df.t(new Kf.b() { // from class: Gd.A5
                @Override // Kf.b
                public final Object get() {
                    return interfaceC16890jH.a("FIREBASE_ML_SDK", byte[].class, C16883c.b("json"), new InterfaceC16888h() { // from class: Gd.C5
                        @Override // rc.InterfaceC16888h
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.f11442b = new df.t(new Kf.b() { // from class: Gd.B5
            @Override // Kf.b
            public final Object get() {
                return interfaceC16890jH.a("FIREBASE_ML_SDK", byte[].class, C16883c.b("proto"), new InterfaceC16888h() { // from class: Gd.z5
                    @Override // rc.InterfaceC16888h
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    static AbstractC16884d b(AbstractC3747s5 abstractC3747s5, InterfaceC3727p5 interfaceC3727p5) {
        return AbstractC16884d.h(interfaceC3727p5.a(abstractC3747s5.a(), false));
    }
}
