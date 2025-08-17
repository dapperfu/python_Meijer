package Dd;

import android.content.Context;
import pc.AbstractC16280d;
import pc.C16279c;
import pc.InterfaceC16284h;
import pc.InterfaceC16285i;
import pc.InterfaceC16286j;

/* loaded from: classes6.dex */
public final class V9 implements D9 {

    /* renamed from: a, reason: collision with root package name */
    private If.b f5554a;

    /* renamed from: b, reason: collision with root package name */
    private final If.b f5555b;

    /* renamed from: c, reason: collision with root package name */
    private final F9 f5556c;

    @Override // Dd.D9
    public final void a(C9 c92) {
        if (this.f5556c.a() != 0) {
            ((InterfaceC16285i) this.f5555b.get()).a(b(this.f5556c, c92));
            return;
        }
        If.b bVar = this.f5554a;
        if (bVar != null) {
            ((InterfaceC16285i) bVar.get()).a(b(this.f5556c, c92));
        }
    }

    public V9(Context context, F9 f92) {
        this.f5556c = f92;
        com.google.android.datatransport.cct.a aVar = com.google.android.datatransport.cct.a.f64416g;
        rc.u.f(context);
        final InterfaceC16286j interfaceC16286jH = rc.u.c().h(aVar);
        if (aVar.a().contains(C16279c.b("json"))) {
            this.f5554a = new bf.t(new If.b() { // from class: Dd.S9
                @Override // If.b
                public final Object get() {
                    return interfaceC16286jH.a("FIREBASE_ML_SDK", byte[].class, C16279c.b("json"), new InterfaceC16284h() { // from class: Dd.U9
                        @Override // pc.InterfaceC16284h
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.f5555b = new bf.t(new If.b() { // from class: Dd.T9
            @Override // If.b
            public final Object get() {
                return interfaceC16286jH.a("FIREBASE_ML_SDK", byte[].class, C16279c.b("proto"), new InterfaceC16284h() { // from class: Dd.R9
                    @Override // pc.InterfaceC16284h
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    static AbstractC16280d b(F9 f92, C9 c92) {
        int iA = f92.a();
        if (c92.zza() != 0) {
            return AbstractC16280d.f(c92.b(iA, false));
        }
        return AbstractC16280d.h(c92.b(iA, false));
    }
}
