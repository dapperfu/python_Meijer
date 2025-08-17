package Mc;

import android.content.Context;
import android.os.RemoteException;

/* renamed from: Mc.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C4137n extends AbstractC4166x {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f19312b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ d2 f19313c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f19314d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C4163w f19315e;

    C4137n(C4163w c4163w, Context context, d2 d2Var, String str) {
        this.f19312b = context;
        this.f19313c = d2Var;
        this.f19314d = str;
        this.f19315e = c4163w;
    }

    @Override // Mc.AbstractC4166x
    public final /* bridge */ /* synthetic */ Object a() {
        C4163w.q(this.f19312b, "search");
        return new C1();
    }

    @Override // Mc.AbstractC4166x
    public final /* bridge */ /* synthetic */ Object b(InterfaceC4132l0 interfaceC4132l0) throws RemoteException {
        return interfaceC4132l0.x3(com.google.android.gms.dynamic.d.F2(this.f19312b), this.f19313c, this.f19314d, 244410000);
    }

    @Override // Mc.AbstractC4166x
    public final /* bridge */ /* synthetic */ Object c() throws RemoteException {
        return this.f19315e.f19352a.a(this.f19312b, this.f19313c, this.f19314d, null, 3);
    }
}
