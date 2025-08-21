package Oc;

import android.app.Activity;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.internal.ads.AbstractBinderC9548sn;
import com.google.android.gms.internal.ads.AbstractBinderC9869vn;
import com.google.android.gms.internal.ads.C7267Rn;
import com.google.android.gms.internal.ads.C8784lf;
import com.google.android.gms.internal.ads.InterfaceC9976wn;

/* renamed from: Oc.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C4388e extends AbstractC4444x {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f23415b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C4441w f23416c;

    C4388e(C4441w c4441w, Activity activity) {
        this.f23415b = activity;
        this.f23416c = c4441w;
    }

    @Override // Oc.AbstractC4444x
    protected final /* bridge */ /* synthetic */ Object a() {
        C4441w.q(this.f23415b, "ad_overlay");
        return null;
    }

    @Override // Oc.AbstractC4444x
    public final /* bridge */ /* synthetic */ Object b(InterfaceC4410l0 interfaceC4410l0) throws RemoteException {
        return interfaceC4410l0.y(com.google.android.gms.dynamic.d.I2(this.f23415b));
    }

    @Override // Oc.AbstractC4444x
    public final /* bridge */ /* synthetic */ Object c() throws RemoteException {
        C8784lf.a(this.f23415b);
        if (!((Boolean) A.c().a(C8784lf.f76751Ba)).booleanValue()) {
            C4441w c4441w = this.f23416c;
            return c4441w.f23543e.a(this.f23415b);
        }
        try {
            return AbstractBinderC9548sn.B9(((InterfaceC9976wn) Sc.s.b(this.f23415b, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", new Sc.r() { // from class: Oc.d
                @Override // Sc.r
                public final Object zza(Object obj) {
                    return AbstractBinderC9869vn.B9((IBinder) obj);
                }
            })).zze(com.google.android.gms.dynamic.d.I2(this.f23415b)));
        } catch (RemoteException | zzr | NullPointerException e10) {
            this.f23416c.f23545g = C7267Rn.c(this.f23415b.getApplicationContext());
            this.f23416c.f23545g.b(e10, "ClientApiBroker.createAdOverlay");
            return null;
        }
    }
}
