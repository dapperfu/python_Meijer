package zt;

import android.location.Location;
import android.location.LocationManager;
import kb.C15115a;
import ut.C17467a;
import ut.InterfaceC17468b;
import ut.InterfaceC17469c;

/* renamed from: zt.e, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C18551e implements InterfaceC17469c {

    /* renamed from: a, reason: collision with root package name */
    private final Dt.c f173231a;

    /* renamed from: b, reason: collision with root package name */
    private C17467a f173232b;

    /* renamed from: c, reason: collision with root package name */
    private C15115a f173233c;

    /* renamed from: d, reason: collision with root package name */
    private LocationManager f173234d;

    /* renamed from: e, reason: collision with root package name */
    private Nb.c f173235e;

    @Override // ut.InterfaceC17469c
    public final synchronized C17467a a() {
        try {
            C17467a c17467a = this.f173232b;
            if (c17467a != null) {
                return c17467a;
            }
            if (this.f173234d == null) {
                this.f173234d = this.f173233c.a();
            } else if (this.f173235e.b()) {
                Location lastKnownLocation = this.f173234d.getLastKnownLocation("network");
                if (lastKnownLocation != null) {
                    return new C17467a(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude(), lastKnownLocation.getAccuracy(), lastKnownLocation.getProvider(), lastKnownLocation.getTime());
                }
            } else {
                this.f173234d = null;
            }
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // ut.InterfaceC17469c
    public final void e(InterfaceC17468b interfaceC17468b) {
        if (interfaceC17468b != null) {
            this.f173231a.e(interfaceC17468b);
        }
    }

    public C18551e(Dt.c cVar, C15115a c15115a, Nb.c cVar2) {
        this.f173231a = cVar;
        this.f173233c = c15115a;
        this.f173235e = cVar2;
    }

    @Override // ut.InterfaceC17468b
    public final synchronized void a(C17467a c17467a) {
        this.f173232b = c17467a;
    }
}
