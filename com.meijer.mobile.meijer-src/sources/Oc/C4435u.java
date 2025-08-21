package Oc;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.internal.ads.AbstractBinderC7615ah;
import com.google.android.gms.internal.ads.AbstractBinderC8041eh;
import com.google.android.gms.internal.ads.C7267Rn;
import com.google.android.gms.internal.ads.C8784lf;
import com.google.android.gms.internal.ads.InterfaceC8148fh;

/* renamed from: Oc.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C4435u extends AbstractC4444x {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ FrameLayout f23532b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ FrameLayout f23533c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Context f23534d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C4441w f23535e;

    C4435u(C4441w c4441w, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.f23532b = frameLayout;
        this.f23533c = frameLayout2;
        this.f23534d = context;
        this.f23535e = c4441w;
    }

    @Override // Oc.AbstractC4444x
    protected final /* bridge */ /* synthetic */ Object a() {
        C4441w.q(this.f23534d, "native_ad_view_delegate");
        return new F1();
    }

    @Override // Oc.AbstractC4444x
    public final /* bridge */ /* synthetic */ Object b(InterfaceC4410l0 interfaceC4410l0) throws RemoteException {
        return interfaceC4410l0.P2(com.google.android.gms.dynamic.d.I2(this.f23532b), com.google.android.gms.dynamic.d.I2(this.f23533c));
    }

    @Override // Oc.AbstractC4444x
    public final /* bridge */ /* synthetic */ Object c() throws RemoteException {
        C8784lf.a(this.f23534d);
        if (!((Boolean) A.c().a(C8784lf.f76751Ba)).booleanValue()) {
            C4441w c4441w = this.f23535e;
            return c4441w.f23542d.a(this.f23534d, this.f23532b, this.f23533c);
        }
        try {
            return AbstractBinderC7615ah.B9(((InterfaceC8148fh) Sc.s.b(this.f23534d, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl", new Sc.r() { // from class: Oc.t
                @Override // Sc.r
                public final Object zza(Object obj) {
                    return AbstractBinderC8041eh.B9((IBinder) obj);
                }
            })).M4(com.google.android.gms.dynamic.d.I2(this.f23534d), com.google.android.gms.dynamic.d.I2(this.f23532b), com.google.android.gms.dynamic.d.I2(this.f23533c), 244410000));
        } catch (RemoteException | zzr | NullPointerException e10) {
            this.f23535e.f23545g = C7267Rn.c(this.f23534d);
            this.f23535e.f23545g.b(e10, "ClientApiBroker.createNativeAdViewDelegate");
            return null;
        }
    }
}
