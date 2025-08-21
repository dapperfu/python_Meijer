package Ed;

import android.content.Context;
import rc.C16883c;
import rc.InterfaceC16888h;
import rc.InterfaceC16890j;

/* loaded from: classes6.dex */
public final class S implements F {

    /* renamed from: a, reason: collision with root package name */
    private Kf.b f7101a;

    /* renamed from: b, reason: collision with root package name */
    private final Kf.b f7102b;

    /* renamed from: c, reason: collision with root package name */
    private final I f7103c;

    public S(Context context, I i10) {
        this.f7103c = i10;
        com.google.android.datatransport.cct.a aVar = com.google.android.datatransport.cct.a.f65256g;
        tc.u.f(context);
        final InterfaceC16890j interfaceC16890jH = tc.u.c().h(aVar);
        if (aVar.a().contains(C16883c.b("json"))) {
            this.f7101a = new df.t(new Kf.b() { // from class: Ed.O
                @Override // Kf.b
                public final Object get() {
                    return interfaceC16890jH.a("FIREBASE_ML_SDK", byte[].class, C16883c.b("json"), new InterfaceC16888h() { // from class: Ed.Q
                        @Override // rc.InterfaceC16888h
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.f7102b = new df.t(new Kf.b() { // from class: Ed.P
            @Override // Kf.b
            public final Object get() {
                return interfaceC16890jH.a("FIREBASE_ML_SDK", byte[].class, C16883c.b("proto"), new InterfaceC16888h() { // from class: Ed.N
                    @Override // rc.InterfaceC16888h
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }
}
