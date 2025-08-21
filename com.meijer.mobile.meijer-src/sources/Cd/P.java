package Cd;

import Ld.C4011a;
import Ld.C4019i;
import Ld.C4020j;
import Vd.AbstractC5507a;
import Vd.AbstractC5516j;
import Vd.C5517k;
import Vd.InterfaceC5511e;
import Vd.InterfaceC5514h;
import android.app.PendingIntent;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC6651h;
import com.google.android.gms.common.internal.C6648e;
import com.google.android.gms.common.internal.InterfaceC6655l;
import com.google.android.gms.location.LocationRequest;
import id.C14720c;
import java.util.Objects;
import jd.C14987j;
import jd.C14988k;
import jd.InterfaceC14981d;
import jd.InterfaceC14990m;

/* loaded from: classes6.dex */
public final class P extends AbstractC6651h {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f4204e = 0;

    /* renamed from: a, reason: collision with root package name */
    private final Z.n0 f4205a;

    /* renamed from: b, reason: collision with root package name */
    private final Z.n0 f4206b;

    /* renamed from: c, reason: collision with root package name */
    private final Z.n0 f4207c;

    /* renamed from: d, reason: collision with root package name */
    private final Z.n0 f4208d;

    @Override // com.google.android.gms.common.internal.AbstractC6646c
    public final boolean usesClientTelemetry() {
        return true;
    }

    public P(Context context, Looper looper, C6648e c6648e, InterfaceC14981d interfaceC14981d, InterfaceC14990m interfaceC14990m) {
        super(context, looper, 23, c6648e, interfaceC14981d, interfaceC14990m);
        this.f4205a = new Z.n0();
        this.f4206b = new Z.n0();
        this.f4207c = new Z.n0();
        this.f4208d = new Z.n0();
    }

    public final void c(C4019i c4019i, PendingIntent pendingIntent, C5517k c5517k) throws RemoteException {
        if (e(Ld.F.f18131n)) {
            ((E0) getService()).n2(c4019i, pendingIntent, new G(null, c5517k));
        } else {
            ((E0) getService()).Z4(c4019i, pendingIntent, new D(c5517k));
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return iInterfaceQueryLocalInterface instanceof E0 ? (E0) iInterfaceQueryLocalInterface : new D0(iBinder);
    }

    public final void d(C3050e0 c3050e0, C5517k c5517k) throws RemoteException {
        if (e(Ld.F.f18131n)) {
            ((E0) getService()).n8(c3050e0, new G(null, c5517k));
        } else {
            ((E0) getService()).l8(c3050e0, new D(c5517k));
        }
    }

    public final void f(Ld.u uVar, C5517k c5517k) throws RemoteException {
        if (e(Ld.F.f18127j)) {
            ((E0) getService()).b9(uVar, new W(5, null, new I(c5517k), null, null));
        } else {
            c5517k.c(((E0) getService()).C(getContext().getPackageName()));
        }
    }

    public final void g(C4020j c4020j, C5517k c5517k) throws RemoteException {
        if (e(Ld.F.f18127j)) {
            ((E0) getService()).G4(c4020j, W.b0(new H(c5517k)));
        } else if (e(Ld.F.f18123f)) {
            ((E0) getService()).Z5(c4020j, new H(c5517k));
        } else {
            c5517k.c(((E0) getService()).zzs());
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c
    public final C14720c[] getApiFeatures() {
        return Ld.F.f18133p;
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c
    protected final String getStartServiceAction() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    public final void h(C4011a c4011a, AbstractC5507a abstractC5507a, final C5517k c5517k) throws RemoteException {
        if (e(Ld.F.f18127j)) {
            final InterfaceC6655l interfaceC6655lA2 = ((E0) getService()).A2(c4011a, W.b0(new H(c5517k)));
            if (abstractC5507a != null) {
                abstractC5507a.b(new InterfaceC5514h() { // from class: Cd.V
                    @Override // Vd.InterfaceC5514h
                    public final /* synthetic */ void onCanceled() {
                        int i10 = P.f4204e;
                        try {
                            interfaceC6655lA2.cancel();
                        } catch (RemoteException unused) {
                        }
                    }
                });
                return;
            }
            return;
        }
        if (e(Ld.F.f18122e)) {
            final InterfaceC6655l interfaceC6655lT4 = ((E0) getService()).T4(c4011a, new H(c5517k));
            if (abstractC5507a != null) {
                abstractC5507a.b(new InterfaceC5514h() { // from class: Cd.T
                    @Override // Vd.InterfaceC5514h
                    public final /* synthetic */ void onCanceled() {
                        int i10 = P.f4204e;
                        try {
                            interfaceC6655lT4.cancel();
                        } catch (RemoteException unused) {
                        }
                    }
                });
                return;
            }
            return;
        }
        C14987j c14987jB = C14988k.b(new E(this, c5517k), v0.a(), "GetCurrentLocation");
        final C14987j.a aVarB = c14987jB.b();
        Objects.requireNonNull(aVarB);
        F f10 = new F(this, c14987jB, c5517k);
        C5517k c5517k2 = new C5517k();
        LocationRequest.a aVar = new LocationRequest.a(c4011a.r0(), 0L);
        aVar.i(0L);
        aVar.b(c4011a.B());
        aVar.c(c4011a.T());
        aVar.e(c4011a.b0());
        aVar.m(c4011a.zza());
        aVar.l(c4011a.I0());
        aVar.k(true);
        aVar.n(c4011a.U0());
        i(f10, aVar.a(), c5517k2);
        c5517k2.a().c(new InterfaceC5511e() { // from class: Cd.S
            @Override // Vd.InterfaceC5511e
            public final /* synthetic */ void onComplete(AbstractC5516j abstractC5516j) {
                int i10 = P.f4204e;
                if (abstractC5516j.r()) {
                    return;
                }
                C5517k c5517k3 = c5517k;
                Exception excM = abstractC5516j.m();
                Objects.requireNonNull(excM);
                c5517k3.d(excM);
            }
        });
        if (abstractC5507a != null) {
            abstractC5507a.b(new InterfaceC5514h() { // from class: Cd.U
                @Override // Vd.InterfaceC5514h
                public final /* synthetic */ void onCanceled() {
                    try {
                        this.f4218a.k(aVarB, true, new C5517k());
                    } catch (RemoteException unused) {
                    }
                }
            });
        }
    }

    public final void i(K k10, LocationRequest locationRequest, C5517k c5517k) throws RemoteException {
        O o10;
        C14987j c14987jZza = k10.zza();
        C14987j.a aVarB = c14987jZza.b();
        Objects.requireNonNull(aVarB);
        boolean zE = e(Ld.F.f18127j);
        synchronized (this.f4206b) {
            try {
                O o11 = (O) this.f4206b.get(aVarB);
                if (o11 == null || zE) {
                    O o12 = new O(k10);
                    this.f4206b.put(aVarB, o12);
                    o10 = o12;
                } else {
                    o11.c2(c14987jZza);
                    o10 = o11;
                    o11 = null;
                }
                if (zE) {
                    ((E0) getService()).i3(W.B(o11, o10, aVarB.a()), locationRequest, new G(null, c5517k));
                } else {
                    ((E0) getService()).c8(new C3042a0(1, Y.B(null, locationRequest), null, o10, null, new B(c5517k, o10), aVarB.a()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void j(PendingIntent pendingIntent, LocationRequest locationRequest, C5517k c5517k) throws RemoteException {
        if (e(Ld.F.f18127j)) {
            ((E0) getService()).i3(W.T(pendingIntent), locationRequest, new G(null, c5517k));
            return;
        }
        E0 e02 = (E0) getService();
        Y yB = Y.B(null, locationRequest);
        J j10 = new J(null, c5517k);
        int iHashCode = pendingIntent.hashCode();
        StringBuilder sb2 = new StringBuilder(String.valueOf(iHashCode).length() + 14);
        sb2.append("PendingIntent@");
        sb2.append(iHashCode);
        e02.c8(new C3042a0(1, yB, null, null, pendingIntent, j10, sb2.toString()));
    }

    public final void k(C14987j.a aVar, boolean z10, C5517k c5517k) throws RemoteException {
        synchronized (this.f4206b) {
            try {
                O o10 = (O) this.f4206b.remove(aVar);
                if (o10 == null) {
                    c5517k.c(Boolean.FALSE);
                    return;
                }
                o10.zzg();
                if (!z10) {
                    c5517k.c(Boolean.TRUE);
                } else if (e(Ld.F.f18127j)) {
                    E0 e02 = (E0) getService();
                    int iIdentityHashCode = System.identityHashCode(o10);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iIdentityHashCode).length() + 18);
                    sb2.append("ILocationCallback@");
                    sb2.append(iIdentityHashCode);
                    e02.i4(W.B(null, o10, sb2.toString()), new G(Boolean.TRUE, c5517k));
                } else {
                    ((E0) getService()).c8(new C3042a0(2, null, null, o10, null, new J(Boolean.TRUE, c5517k), null));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final boolean e(C14720c c14720c) {
        C14720c c14720c2;
        C14720c[] availableFeatures = getAvailableFeatures();
        if (availableFeatures != null) {
            int i10 = 0;
            while (true) {
                if (i10 < availableFeatures.length) {
                    c14720c2 = availableFeatures[i10];
                    if (c14720c.getName().equals(c14720c2.getName())) {
                        break;
                    }
                    i10++;
                } else {
                    c14720c2 = null;
                    break;
                }
            }
            if (c14720c2 != null && c14720c2.B() >= c14720c.B()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 11717000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c
    public final void onConnectionSuspended(int i10) {
        super.onConnectionSuspended(i10);
        synchronized (this.f4205a) {
            this.f4205a.clear();
        }
        synchronized (this.f4206b) {
            this.f4206b.clear();
        }
        synchronized (this.f4207c) {
            this.f4207c.clear();
        }
    }
}
