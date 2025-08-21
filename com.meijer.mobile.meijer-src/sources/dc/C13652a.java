package dc;

import Nb.c;
import android.location.Location;
import android.location.LocationManager;
import cc.InterfaceC6500a;
import kb.C15115a;

/* renamed from: dc.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13652a implements InterfaceC6500a {

    /* renamed from: d, reason: collision with root package name */
    public static C13652a f128338d;

    /* renamed from: a, reason: collision with root package name */
    private C15115a f128339a;

    /* renamed from: b, reason: collision with root package name */
    private LocationManager f128340b;

    /* renamed from: c, reason: collision with root package name */
    private c f128341c;

    private static cc.c b(Location location) {
        return new cc.c(location);
    }

    @Override // cc.InterfaceC6500a
    public final cc.c a() {
        if (this.f128340b == null) {
            this.f128340b = this.f128339a.a();
            return null;
        }
        if (this.f128341c.b()) {
            Location lastKnownLocation = this.f128340b.getLastKnownLocation("passive");
            if (lastKnownLocation != null && lastKnownLocation.getAccuracy() < 300.0f) {
                return b(lastKnownLocation);
            }
            Location lastKnownLocation2 = this.f128340b.getLastKnownLocation("network");
            if (lastKnownLocation2 != null) {
                return b(lastKnownLocation2);
            }
        } else {
            this.f128340b = null;
        }
        return null;
    }

    public C13652a(C15115a c15115a, c cVar) {
        this.f128339a = c15115a;
        this.f128341c = cVar;
    }
}
