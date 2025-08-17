package Mc;

import android.app.Activity;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.internal.ads.AbstractBinderC9423sn;
import com.google.android.gms.internal.ads.AbstractBinderC9744vn;
import com.google.android.gms.internal.ads.C7142Rn;
import com.google.android.gms.internal.ads.C8659lf;
import com.google.android.gms.internal.ads.InterfaceC9851wn;

/* renamed from: Mc.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C4110e extends AbstractC4166x {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f19228b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C4163w f19229c;

    C4110e(C4163w c4163w, Activity activity) {
        this.f19228b = activity;
        this.f19229c = c4163w;
    }

    @Override // Mc.AbstractC4166x
    protected final /* bridge */ /* synthetic */ Object a() {
        C4163w.q(this.f19228b, "ad_overlay");
        return null;
    }

    @Override // Mc.AbstractC4166x
    public final /* bridge */ /* synthetic */ Object b(InterfaceC4132l0 interfaceC4132l0) throws RemoteException {
        return interfaceC4132l0.y(com.google.android.gms.dynamic.d.F2(this.f19228b));
    }

    @Override // Mc.AbstractC4166x
    public final /* bridge */ /* synthetic */ Object c() throws RemoteException {
        C8659lf.a(this.f19228b);
        if (!((Boolean) A.c().a(C8659lf.f75911Ba)).booleanValue()) {
            C4163w c4163w = this.f19229c;
            return c4163w.f19356e.a(this.f19228b);
        }
        try {
            return AbstractBinderC9423sn.B9(((InterfaceC9851wn) Qc.s.b(this.f19228b, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", new Qc.r() { // from class: Mc.d
                @Override // Qc.r
                public final Object zza(Object obj) {
                    return AbstractBinderC9744vn.B9((IBinder) obj);
                }
            })).zze(com.google.android.gms.dynamic.d.F2(this.f19228b)));
        } catch (RemoteException | zzr | NullPointerException e10) {
            this.f19229c.f19358g = C7142Rn.c(this.f19228b.getApplicationContext());
            this.f19229c.f19358g.b(e10, "ClientApiBroker.createAdOverlay");
            return null;
        }
    }
}
