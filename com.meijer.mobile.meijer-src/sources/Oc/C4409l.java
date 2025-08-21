package Oc;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.InterfaceC6756Cl;

/* renamed from: Oc.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C4409l extends AbstractC4444x {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f23486b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ d2 f23487c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f23488d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC6756Cl f23489e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C4441w f23490f;

    C4409l(C4441w c4441w, Context context, d2 d2Var, String str, InterfaceC6756Cl interfaceC6756Cl) {
        this.f23486b = context;
        this.f23487c = d2Var;
        this.f23488d = str;
        this.f23489e = interfaceC6756Cl;
        this.f23490f = c4441w;
    }

    @Override // Oc.AbstractC4444x
    public final /* bridge */ /* synthetic */ Object a() {
        C4441w.q(this.f23486b, "banner");
        return new C1();
    }

    @Override // Oc.AbstractC4444x
    public final /* bridge */ /* synthetic */ Object b(InterfaceC4410l0 interfaceC4410l0) throws RemoteException {
        return interfaceC4410l0.T2(com.google.android.gms.dynamic.d.I2(this.f23486b), this.f23487c, this.f23488d, this.f23489e, 244410000);
    }

    @Override // Oc.AbstractC4444x
    public final /* bridge */ /* synthetic */ Object c() throws RemoteException {
        return this.f23490f.f23539a.a(this.f23486b, this.f23487c, this.f23488d, this.f23489e, 1);
    }
}
