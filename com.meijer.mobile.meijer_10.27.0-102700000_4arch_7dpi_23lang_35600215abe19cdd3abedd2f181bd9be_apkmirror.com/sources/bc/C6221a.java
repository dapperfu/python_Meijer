package bc;

import Lb.c;
import ac.InterfaceC5594a;
import android.location.Location;
import android.location.LocationManager;
import ib.C14712a;

/* renamed from: bc.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6221a implements InterfaceC5594a {

    /* renamed from: d, reason: collision with root package name */
    public static C6221a f60103d;

    /* renamed from: a, reason: collision with root package name */
    private C14712a f60104a;

    /* renamed from: b, reason: collision with root package name */
    private LocationManager f60105b;

    /* renamed from: c, reason: collision with root package name */
    private c f60106c;

    private static ac.c b(Location location) {
        return new ac.c(location);
    }

    @Override // ac.InterfaceC5594a
    public final ac.c a() {
        if (this.f60105b == null) {
            this.f60105b = this.f60104a.a();
            return null;
        }
        if (this.f60106c.b()) {
            Location lastKnownLocation = this.f60105b.getLastKnownLocation("passive");
            if (lastKnownLocation != null && lastKnownLocation.getAccuracy() < 300.0f) {
                return b(lastKnownLocation);
            }
            Location lastKnownLocation2 = this.f60105b.getLastKnownLocation("network");
            if (lastKnownLocation2 != null) {
                return b(lastKnownLocation2);
            }
        } else {
            this.f60105b = null;
        }
        return null;
    }

    public C6221a(C14712a c14712a, c cVar) {
        this.f60104a = c14712a;
        this.f60106c = cVar;
    }
}
