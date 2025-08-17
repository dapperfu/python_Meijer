package zt;

import android.location.Location;
import android.location.LocationManager;
import ib.C14712a;
import ut.C17315a;
import ut.InterfaceC17316b;
import ut.InterfaceC17317c;

/* renamed from: zt.e, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C18575e implements InterfaceC17317c {

    /* renamed from: a, reason: collision with root package name */
    private final Dt.c f173270a;

    /* renamed from: b, reason: collision with root package name */
    private C17315a f173271b;

    /* renamed from: c, reason: collision with root package name */
    private C14712a f173272c;

    /* renamed from: d, reason: collision with root package name */
    private LocationManager f173273d;

    /* renamed from: e, reason: collision with root package name */
    private Lb.c f173274e;

    @Override // ut.InterfaceC17317c
    public final synchronized C17315a a() {
        try {
            C17315a c17315a = this.f173271b;
            if (c17315a != null) {
                return c17315a;
            }
            if (this.f173273d == null) {
                this.f173273d = this.f173272c.a();
            } else if (this.f173274e.b()) {
                Location lastKnownLocation = this.f173273d.getLastKnownLocation("network");
                if (lastKnownLocation != null) {
                    return new C17315a(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude(), lastKnownLocation.getAccuracy(), lastKnownLocation.getProvider(), lastKnownLocation.getTime());
                }
            } else {
                this.f173273d = null;
            }
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // ut.InterfaceC17317c
    public final void e(InterfaceC17316b interfaceC17316b) {
        if (interfaceC17316b != null) {
            this.f173270a.e(interfaceC17316b);
        }
    }

    public C18575e(Dt.c cVar, C14712a c14712a, Lb.c cVar2) {
        this.f173270a = cVar;
        this.f173272c = c14712a;
        this.f173274e = cVar2;
    }

    @Override // ut.InterfaceC17316b
    public final synchronized void a(C17315a c17315a) {
        this.f173271b = c17315a;
    }
}
