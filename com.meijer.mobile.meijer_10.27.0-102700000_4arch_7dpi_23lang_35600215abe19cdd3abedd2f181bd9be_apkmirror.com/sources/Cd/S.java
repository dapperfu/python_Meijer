package Cd;

import android.content.Context;
import pc.C16279c;
import pc.InterfaceC16284h;
import pc.InterfaceC16286j;

/* loaded from: classes6.dex */
public final class S implements F {

    /* renamed from: a, reason: collision with root package name */
    private If.b f3789a;

    /* renamed from: b, reason: collision with root package name */
    private final If.b f3790b;

    /* renamed from: c, reason: collision with root package name */
    private final I f3791c;

    public S(Context context, I i10) {
        this.f3791c = i10;
        com.google.android.datatransport.cct.a aVar = com.google.android.datatransport.cct.a.f64416g;
        rc.u.f(context);
        final InterfaceC16286j interfaceC16286jH = rc.u.c().h(aVar);
        if (aVar.a().contains(C16279c.b("json"))) {
            this.f3789a = new bf.t(new If.b() { // from class: Cd.O
                @Override // If.b
                public final Object get() {
                    return interfaceC16286jH.a("FIREBASE_ML_SDK", byte[].class, C16279c.b("json"), new InterfaceC16284h() { // from class: Cd.Q
                        @Override // pc.InterfaceC16284h
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.f3790b = new bf.t(new If.b() { // from class: Cd.P
            @Override // If.b
            public final Object get() {
                return interfaceC16286jH.a("FIREBASE_ML_SDK", byte[].class, C16279c.b("proto"), new InterfaceC16284h() { // from class: Cd.N
                    @Override // pc.InterfaceC16284h
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }
}
