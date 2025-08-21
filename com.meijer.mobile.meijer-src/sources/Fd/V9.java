package Fd;

import android.content.Context;
import rc.AbstractC16884d;
import rc.C16883c;
import rc.InterfaceC16888h;
import rc.InterfaceC16889i;
import rc.InterfaceC16890j;

/* loaded from: classes6.dex */
public final class V9 implements D9 {

    /* renamed from: a, reason: collision with root package name */
    private Kf.b f9587a;

    /* renamed from: b, reason: collision with root package name */
    private final Kf.b f9588b;

    /* renamed from: c, reason: collision with root package name */
    private final F9 f9589c;

    @Override // Fd.D9
    public final void a(C9 c92) {
        if (this.f9589c.a() != 0) {
            ((InterfaceC16889i) this.f9588b.get()).b(b(this.f9589c, c92));
            return;
        }
        Kf.b bVar = this.f9587a;
        if (bVar != null) {
            ((InterfaceC16889i) bVar.get()).b(b(this.f9589c, c92));
        }
    }

    public V9(Context context, F9 f92) {
        this.f9589c = f92;
        com.google.android.datatransport.cct.a aVar = com.google.android.datatransport.cct.a.f65256g;
        tc.u.f(context);
        final InterfaceC16890j interfaceC16890jH = tc.u.c().h(aVar);
        if (aVar.a().contains(C16883c.b("json"))) {
            this.f9587a = new df.t(new Kf.b() { // from class: Fd.S9
                @Override // Kf.b
                public final Object get() {
                    return interfaceC16890jH.a("FIREBASE_ML_SDK", byte[].class, C16883c.b("json"), new InterfaceC16888h() { // from class: Fd.U9
                        @Override // rc.InterfaceC16888h
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.f9588b = new df.t(new Kf.b() { // from class: Fd.T9
            @Override // Kf.b
            public final Object get() {
                return interfaceC16890jH.a("FIREBASE_ML_SDK", byte[].class, C16883c.b("proto"), new InterfaceC16888h() { // from class: Fd.R9
                    @Override // rc.InterfaceC16888h
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    static AbstractC16884d b(F9 f92, C9 c92) {
        int iA = f92.a();
        if (c92.zza() != 0) {
            return AbstractC16884d.f(c92.b(iA, false));
        }
        return AbstractC16884d.h(c92.b(iA, false));
    }
}
