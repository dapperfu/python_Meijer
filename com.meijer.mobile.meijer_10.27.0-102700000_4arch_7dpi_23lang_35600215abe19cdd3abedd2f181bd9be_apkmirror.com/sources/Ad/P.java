package Ad;

import Jd.C3767a;
import Jd.C3775i;
import Jd.C3776j;
import Td.AbstractC5223a;
import Td.AbstractC5232j;
import Td.C5233k;
import Td.InterfaceC5227e;
import Td.InterfaceC5230h;
import android.app.PendingIntent;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC6526h;
import com.google.android.gms.common.internal.C6523e;
import com.google.android.gms.common.internal.InterfaceC6530l;
import com.google.android.gms.location.LocationRequest;
import gd.C14244c;
import hd.C14409j;
import hd.C14410k;
import hd.InterfaceC14403d;
import hd.InterfaceC14412m;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class P extends AbstractC6526h {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f208e = 0;

    /* renamed from: a, reason: collision with root package name */
    private final Z.n0 f209a;

    /* renamed from: b, reason: collision with root package name */
    private final Z.n0 f210b;

    /* renamed from: c, reason: collision with root package name */
    private final Z.n0 f211c;

    /* renamed from: d, reason: collision with root package name */
    private final Z.n0 f212d;

    @Override // com.google.android.gms.common.internal.AbstractC6521c
    public final boolean usesClientTelemetry() {
        return true;
    }

    public P(Context context, Looper looper, C6523e c6523e, InterfaceC14403d interfaceC14403d, InterfaceC14412m interfaceC14412m) {
        super(context, looper, 23, c6523e, interfaceC14403d, interfaceC14412m);
        this.f209a = new Z.n0();
        this.f210b = new Z.n0();
        this.f211c = new Z.n0();
        this.f212d = new Z.n0();
    }

    public final void c(C3775i c3775i, PendingIntent pendingIntent, C5233k c5233k) throws RemoteException {
        if (e(Jd.F.f14794n)) {
            ((E0) getService()).Y4(c3775i, pendingIntent, new G(null, c5233k));
        } else {
            ((E0) getService()).A4(c3775i, pendingIntent, new D(c5233k));
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return iInterfaceQueryLocalInterface instanceof E0 ? (E0) iInterfaceQueryLocalInterface : new D0(iBinder);
    }

    public final void d(C2812e0 c2812e0, C5233k c5233k) throws RemoteException {
        if (e(Jd.F.f14794n)) {
            ((E0) getService()).N8(c2812e0, new G(null, c5233k));
        } else {
            ((E0) getService()).O8(c2812e0, new D(c5233k));
        }
    }

    public final void f(Jd.u uVar, C5233k c5233k) throws RemoteException {
        if (e(Jd.F.f14790j)) {
            ((E0) getService()).O6(uVar, new W(5, null, new I(c5233k), null, null));
        } else {
            c5233k.c(((E0) getService()).C(getContext().getPackageName()));
        }
    }

    public final void g(C3776j c3776j, C5233k c5233k) throws RemoteException {
        if (e(Jd.F.f14790j)) {
            ((E0) getService()).Q0(c3776j, W.c0(new H(c5233k)));
        } else if (e(Jd.F.f14786f)) {
            ((E0) getService()).S0(c3776j, new H(c5233k));
        } else {
            c5233k.c(((E0) getService()).zzs());
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c
    public final C14244c[] getApiFeatures() {
        return Jd.F.f14796p;
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c
    protected final String getStartServiceAction() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    public final void h(C3767a c3767a, AbstractC5223a abstractC5223a, final C5233k c5233k) throws RemoteException {
        if (e(Jd.F.f14790j)) {
            final InterfaceC6530l interfaceC6530lC6 = ((E0) getService()).C6(c3767a, W.c0(new H(c5233k)));
            if (abstractC5223a != null) {
                abstractC5223a.b(new InterfaceC5230h() { // from class: Ad.V
                    @Override // Td.InterfaceC5230h
                    public final /* synthetic */ void onCanceled() {
                        int i10 = P.f208e;
                        try {
                            interfaceC6530lC6.cancel();
                        } catch (RemoteException unused) {
                        }
                    }
                });
                return;
            }
            return;
        }
        if (e(Jd.F.f14785e)) {
            final InterfaceC6530l interfaceC6530lL8 = ((E0) getService()).l8(c3767a, new H(c5233k));
            if (abstractC5223a != null) {
                abstractC5223a.b(new InterfaceC5230h() { // from class: Ad.T
                    @Override // Td.InterfaceC5230h
                    public final /* synthetic */ void onCanceled() {
                        int i10 = P.f208e;
                        try {
                            interfaceC6530lL8.cancel();
                        } catch (RemoteException unused) {
                        }
                    }
                });
                return;
            }
            return;
        }
        C14409j c14409jB = C14410k.b(new E(this, c5233k), v0.a(), "GetCurrentLocation");
        final C14409j.a aVarB = c14409jB.b();
        Objects.requireNonNull(aVarB);
        F f10 = new F(this, c14409jB, c5233k);
        C5233k c5233k2 = new C5233k();
        LocationRequest.a aVar = new LocationRequest.a(c3767a.q0(), 0L);
        aVar.i(0L);
        aVar.b(c3767a.B());
        aVar.c(c3767a.T());
        aVar.e(c3767a.c0());
        aVar.m(c3767a.zza());
        aVar.l(c3767a.K0());
        aVar.k(true);
        aVar.n(c3767a.W0());
        i(f10, aVar.a(), c5233k2);
        c5233k2.a().c(new InterfaceC5227e() { // from class: Ad.S
            @Override // Td.InterfaceC5227e
            public final /* synthetic */ void onComplete(AbstractC5232j abstractC5232j) {
                int i10 = P.f208e;
                if (abstractC5232j.r()) {
                    return;
                }
                C5233k c5233k3 = c5233k;
                Exception excM = abstractC5232j.m();
                Objects.requireNonNull(excM);
                c5233k3.d(excM);
            }
        });
        if (abstractC5223a != null) {
            abstractC5223a.b(new InterfaceC5230h() { // from class: Ad.U
                @Override // Td.InterfaceC5230h
                public final /* synthetic */ void onCanceled() {
                    try {
                        this.f222a.k(aVarB, true, new C5233k());
                    } catch (RemoteException unused) {
                    }
                }
            });
        }
    }

    public final void i(K k10, LocationRequest locationRequest, C5233k c5233k) throws RemoteException {
        O o10;
        C14409j c14409jZza = k10.zza();
        C14409j.a aVarB = c14409jZza.b();
        Objects.requireNonNull(aVarB);
        boolean zE = e(Jd.F.f14790j);
        synchronized (this.f210b) {
            try {
                O o11 = (O) this.f210b.get(aVarB);
                if (o11 == null || zE) {
                    O o12 = new O(k10);
                    this.f210b.put(aVarB, o12);
                    o10 = o12;
                } else {
                    o11.b2(c14409jZza);
                    o10 = o11;
                    o11 = null;
                }
                if (zE) {
                    ((E0) getService()).D3(W.B(o11, o10, aVarB.a()), locationRequest, new G(null, c5233k));
                } else {
                    ((E0) getService()).z5(new C2804a0(1, Y.B(null, locationRequest), null, o10, null, new B(c5233k, o10), aVarB.a()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void j(PendingIntent pendingIntent, LocationRequest locationRequest, C5233k c5233k) throws RemoteException {
        if (e(Jd.F.f14790j)) {
            ((E0) getService()).D3(W.T(pendingIntent), locationRequest, new G(null, c5233k));
            return;
        }
        E0 e02 = (E0) getService();
        Y yB = Y.B(null, locationRequest);
        J j10 = new J(null, c5233k);
        int iHashCode = pendingIntent.hashCode();
        StringBuilder sb2 = new StringBuilder(String.valueOf(iHashCode).length() + 14);
        sb2.append("PendingIntent@");
        sb2.append(iHashCode);
        e02.z5(new C2804a0(1, yB, null, null, pendingIntent, j10, sb2.toString()));
    }

    public final void k(C14409j.a aVar, boolean z10, C5233k c5233k) throws RemoteException {
        synchronized (this.f210b) {
            try {
                O o10 = (O) this.f210b.remove(aVar);
                if (o10 == null) {
                    c5233k.c(Boolean.FALSE);
                    return;
                }
                o10.zzg();
                if (!z10) {
                    c5233k.c(Boolean.TRUE);
                } else if (e(Jd.F.f14790j)) {
                    E0 e02 = (E0) getService();
                    int iIdentityHashCode = System.identityHashCode(o10);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iIdentityHashCode).length() + 18);
                    sb2.append("ILocationCallback@");
                    sb2.append(iIdentityHashCode);
                    e02.b5(W.B(null, o10, sb2.toString()), new G(Boolean.TRUE, c5233k));
                } else {
                    ((E0) getService()).z5(new C2804a0(2, null, null, o10, null, new J(Boolean.TRUE, c5233k), null));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final boolean e(C14244c c14244c) {
        C14244c c14244c2;
        C14244c[] availableFeatures = getAvailableFeatures();
        if (availableFeatures != null) {
            int i10 = 0;
            while (true) {
                if (i10 < availableFeatures.length) {
                    c14244c2 = availableFeatures[i10];
                    if (c14244c.getName().equals(c14244c2.getName())) {
                        break;
                    }
                    i10++;
                } else {
                    c14244c2 = null;
                    break;
                }
            }
            if (c14244c2 != null && c14244c2.B() >= c14244c.B()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 11717000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c
    public final void onConnectionSuspended(int i10) {
        super.onConnectionSuspended(i10);
        synchronized (this.f209a) {
            this.f209a.clear();
        }
        synchronized (this.f210b) {
            this.f210b.clear();
        }
        synchronized (this.f211c) {
            this.f211c.clear();
        }
    }
}
