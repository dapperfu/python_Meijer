package Oc;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.InterfaceC6756Cl;

/* renamed from: Oc.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C4412m extends AbstractC4444x {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f23493b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ d2 f23494c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f23495d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC6756Cl f23496e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C4441w f23497f;

    C4412m(C4441w c4441w, Context context, d2 d2Var, String str, InterfaceC6756Cl interfaceC6756Cl) {
        this.f23493b = context;
        this.f23494c = d2Var;
        this.f23495d = str;
        this.f23496e = interfaceC6756Cl;
        this.f23497f = c4441w;
    }

    @Override // Oc.AbstractC4444x
    public final /* bridge */ /* synthetic */ Object a() {
        C4441w.q(this.f23493b, "app_open");
        return new C1();
    }

    @Override // Oc.AbstractC4444x
    public final /* bridge */ /* synthetic */ Object b(InterfaceC4410l0 interfaceC4410l0) throws RemoteException {
        return interfaceC4410l0.r2(com.google.android.gms.dynamic.d.I2(this.f23493b), this.f23494c, this.f23495d, this.f23496e, 244410000);
    }

    @Override // Oc.AbstractC4444x
    public final /* bridge */ /* synthetic */ Object c() throws RemoteException {
        return this.f23497f.f23539a.a(this.f23493b, this.f23494c, this.f23495d, this.f23496e, 4);
    }
}
