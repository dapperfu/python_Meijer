package Mc;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.internal.ads.AbstractBinderC7490ah;
import com.google.android.gms.internal.ads.AbstractBinderC7916eh;
import com.google.android.gms.internal.ads.C7142Rn;
import com.google.android.gms.internal.ads.C8659lf;
import com.google.android.gms.internal.ads.InterfaceC8023fh;

/* renamed from: Mc.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C4157u extends AbstractC4166x {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ FrameLayout f19345b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ FrameLayout f19346c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Context f19347d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C4163w f19348e;

    C4157u(C4163w c4163w, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.f19345b = frameLayout;
        this.f19346c = frameLayout2;
        this.f19347d = context;
        this.f19348e = c4163w;
    }

    @Override // Mc.AbstractC4166x
    protected final /* bridge */ /* synthetic */ Object a() {
        C4163w.q(this.f19347d, "native_ad_view_delegate");
        return new F1();
    }

    @Override // Mc.AbstractC4166x
    public final /* bridge */ /* synthetic */ Object b(InterfaceC4132l0 interfaceC4132l0) throws RemoteException {
        return interfaceC4132l0.K2(com.google.android.gms.dynamic.d.F2(this.f19345b), com.google.android.gms.dynamic.d.F2(this.f19346c));
    }

    @Override // Mc.AbstractC4166x
    public final /* bridge */ /* synthetic */ Object c() throws RemoteException {
        C8659lf.a(this.f19347d);
        if (!((Boolean) A.c().a(C8659lf.f75911Ba)).booleanValue()) {
            C4163w c4163w = this.f19348e;
            return c4163w.f19355d.a(this.f19347d, this.f19345b, this.f19346c);
        }
        try {
            return AbstractBinderC7490ah.B9(((InterfaceC8023fh) Qc.s.b(this.f19347d, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl", new Qc.r() { // from class: Mc.t
                @Override // Qc.r
                public final Object zza(Object obj) {
                    return AbstractBinderC7916eh.B9((IBinder) obj);
                }
            })).z4(com.google.android.gms.dynamic.d.F2(this.f19347d), com.google.android.gms.dynamic.d.F2(this.f19345b), com.google.android.gms.dynamic.d.F2(this.f19346c), 244410000));
        } catch (RemoteException | zzr | NullPointerException e10) {
            this.f19348e.f19358g = C7142Rn.c(this.f19347d);
            this.f19348e.f19358g.b(e10, "ClientApiBroker.createNativeAdViewDelegate");
            return null;
        }
    }
}
