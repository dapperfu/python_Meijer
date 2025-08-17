package Mc;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.InterfaceC6631Cl;

/* renamed from: Mc.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C4134m extends AbstractC4166x {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f19306b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ d2 f19307c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f19308d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC6631Cl f19309e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C4163w f19310f;

    C4134m(C4163w c4163w, Context context, d2 d2Var, String str, InterfaceC6631Cl interfaceC6631Cl) {
        this.f19306b = context;
        this.f19307c = d2Var;
        this.f19308d = str;
        this.f19309e = interfaceC6631Cl;
        this.f19310f = c4163w;
    }

    @Override // Mc.AbstractC4166x
    public final /* bridge */ /* synthetic */ Object a() {
        C4163w.q(this.f19306b, "app_open");
        return new C1();
    }

    @Override // Mc.AbstractC4166x
    public final /* bridge */ /* synthetic */ Object b(InterfaceC4132l0 interfaceC4132l0) throws RemoteException {
        return interfaceC4132l0.D4(com.google.android.gms.dynamic.d.F2(this.f19306b), this.f19307c, this.f19308d, this.f19309e, 244410000);
    }

    @Override // Mc.AbstractC4166x
    public final /* bridge */ /* synthetic */ Object c() throws RemoteException {
        return this.f19310f.f19352a.a(this.f19306b, this.f19307c, this.f19308d, this.f19309e, 4);
    }
}
