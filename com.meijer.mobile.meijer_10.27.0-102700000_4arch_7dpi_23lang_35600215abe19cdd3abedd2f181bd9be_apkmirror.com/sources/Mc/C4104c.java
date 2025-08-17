package Mc;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C9107pp;
import com.google.android.gms.internal.ads.InterfaceC6631Cl;

/* renamed from: Mc.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C4104c extends AbstractC4166x {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f19208b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f19209c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ InterfaceC6631Cl f19210d;

    C4104c(C4163w c4163w, Context context, String str, InterfaceC6631Cl interfaceC6631Cl) {
        this.f19208b = context;
        this.f19209c = str;
        this.f19210d = interfaceC6631Cl;
    }

    @Override // Mc.AbstractC4166x
    protected final /* bridge */ /* synthetic */ Object a() {
        C4163w.q(this.f19208b, "rewarded");
        return new H1();
    }

    @Override // Mc.AbstractC4166x
    public final /* bridge */ /* synthetic */ Object b(InterfaceC4132l0 interfaceC4132l0) throws RemoteException {
        return interfaceC4132l0.D2(com.google.android.gms.dynamic.d.F2(this.f19208b), this.f19209c, this.f19210d, 244410000);
    }

    @Override // Mc.AbstractC4166x
    public final /* bridge */ /* synthetic */ Object c() throws RemoteException {
        return C9107pp.a(this.f19208b, this.f19209c, this.f19210d);
    }
}
