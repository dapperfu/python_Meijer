package Mc;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.InterfaceC6631Cl;

/* renamed from: Mc.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C4131l extends AbstractC4166x {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f19299b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ d2 f19300c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f19301d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC6631Cl f19302e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C4163w f19303f;

    C4131l(C4163w c4163w, Context context, d2 d2Var, String str, InterfaceC6631Cl interfaceC6631Cl) {
        this.f19299b = context;
        this.f19300c = d2Var;
        this.f19301d = str;
        this.f19302e = interfaceC6631Cl;
        this.f19303f = c4163w;
    }

    @Override // Mc.AbstractC4166x
    public final /* bridge */ /* synthetic */ Object a() {
        C4163w.q(this.f19299b, "banner");
        return new C1();
    }

    @Override // Mc.AbstractC4166x
    public final /* bridge */ /* synthetic */ Object b(InterfaceC4132l0 interfaceC4132l0) throws RemoteException {
        return interfaceC4132l0.S4(com.google.android.gms.dynamic.d.F2(this.f19299b), this.f19300c, this.f19301d, this.f19302e, 244410000);
    }

    @Override // Mc.AbstractC4166x
    public final /* bridge */ /* synthetic */ Object c() throws RemoteException {
        return this.f19303f.f19352a.a(this.f19299b, this.f19300c, this.f19301d, this.f19302e, 1);
    }
}
