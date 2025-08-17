package Mc;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.InterfaceC6631Cl;

/* renamed from: Mc.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C4140o extends AbstractC4166x {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f19316b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ d2 f19317c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f19318d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC6631Cl f19319e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C4163w f19320f;

    C4140o(C4163w c4163w, Context context, d2 d2Var, String str, InterfaceC6631Cl interfaceC6631Cl) {
        this.f19316b = context;
        this.f19317c = d2Var;
        this.f19318d = str;
        this.f19319e = interfaceC6631Cl;
        this.f19320f = c4163w;
    }

    @Override // Mc.AbstractC4166x
    public final /* bridge */ /* synthetic */ Object a() {
        C4163w.q(this.f19316b, "interstitial");
        return new C1();
    }

    @Override // Mc.AbstractC4166x
    public final /* bridge */ /* synthetic */ Object b(InterfaceC4132l0 interfaceC4132l0) throws RemoteException {
        return interfaceC4132l0.w3(com.google.android.gms.dynamic.d.F2(this.f19316b), this.f19317c, this.f19318d, this.f19319e, 244410000);
    }

    @Override // Mc.AbstractC4166x
    public final /* bridge */ /* synthetic */ Object c() throws RemoteException {
        return this.f19320f.f19352a.a(this.f19316b, this.f19317c, this.f19318d, this.f19319e, 2);
    }
}
