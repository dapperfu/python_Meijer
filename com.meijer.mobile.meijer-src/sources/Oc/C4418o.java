package Oc;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.InterfaceC6756Cl;

/* renamed from: Oc.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C4418o extends AbstractC4444x {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f23503b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ d2 f23504c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f23505d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC6756Cl f23506e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C4441w f23507f;

    C4418o(C4441w c4441w, Context context, d2 d2Var, String str, InterfaceC6756Cl interfaceC6756Cl) {
        this.f23503b = context;
        this.f23504c = d2Var;
        this.f23505d = str;
        this.f23506e = interfaceC6756Cl;
        this.f23507f = c4441w;
    }

    @Override // Oc.AbstractC4444x
    public final /* bridge */ /* synthetic */ Object a() {
        C4441w.q(this.f23503b, "interstitial");
        return new C1();
    }

    @Override // Oc.AbstractC4444x
    public final /* bridge */ /* synthetic */ Object b(InterfaceC4410l0 interfaceC4410l0) throws RemoteException {
        return interfaceC4410l0.O7(com.google.android.gms.dynamic.d.I2(this.f23503b), this.f23504c, this.f23505d, this.f23506e, 244410000);
    }

    @Override // Oc.AbstractC4444x
    public final /* bridge */ /* synthetic */ Object c() throws RemoteException {
        return this.f23507f.f23539a.a(this.f23503b, this.f23504c, this.f23505d, this.f23506e, 2);
    }
}
