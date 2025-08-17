package ab;

import Bb.e;
import Bb.k;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Looper;
import cb.C6380a;
import cb.C6381b;
import cb.C6382c;
import cb.C6383d;
import com.medallia.digital.mobilesdk.l8;
import ib.C14712a;
import java.io.IOException;
import java.util.Comparator;

/* renamed from: ab.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5591a implements k {

    /* renamed from: j, reason: collision with root package name */
    private static final C6382c f44449j = C6383d.a(C5591a.class.getName());

    /* renamed from: k, reason: collision with root package name */
    private static final C6380a f44450k = C6381b.a(C5591a.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private Context f44451a;

    /* renamed from: b, reason: collision with root package name */
    private C14712a f44452b;

    /* renamed from: c, reason: collision with root package name */
    private Lb.c f44453c;

    /* renamed from: d, reason: collision with root package name */
    private LocationManager f44454d;

    /* renamed from: e, reason: collision with root package name */
    private b f44455e = new b();

    /* renamed from: f, reason: collision with root package name */
    Bb.b f44456f;

    /* renamed from: g, reason: collision with root package name */
    private e f44457g;

    /* renamed from: h, reason: collision with root package name */
    C5592b f44458h;

    /* renamed from: i, reason: collision with root package name */
    Ob.c f44459i;

    /* renamed from: ab.a$a, reason: collision with other inner class name */
    final class C0946a implements Comparator<Ob.c> {
        C0946a() {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Ob.c cVar, Ob.c cVar2) {
            return (int) (cVar.b().b() - cVar2.b().b());
        }
    }

    /* renamed from: ab.a$b */
    class b implements LocationListener {
        @Override // android.location.LocationListener
        public final void onProviderDisabled(String str) {
        }

        @Override // android.location.LocationListener
        public final void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public final void onStatusChanged(String str, int i10, Bundle bundle) {
        }

        b() {
        }

        @Override // android.location.LocationListener
        public final void onLocationChanged(Location location) {
            C5591a c5591a = C5591a.this;
            Ob.c cVarA = Ob.c.a(location);
            if (c5591a.f44459i != null && Math.abs(cVarA.b().b() - c5591a.f44459i.b().b()) < Bb.b.c(c5591a.f44456f.e().r(), l8.b.f92525b)) {
                Ob.c cVar = c5591a.f44459i;
                double dA = Bb.b.a(c5591a.f44456f.e().q(), Float.valueOf(0.005f));
                double dAbs = Math.abs(cVar.b().c() - cVarA.b().c());
                double dAbs2 = Math.abs(cVar.b().d() - cVarA.b().d());
                if (dAbs <= dA && dAbs2 <= dA) {
                    return;
                }
            }
            c5591a.f44459i = cVarA;
            if (c5591a.f44458h != null) {
                try {
                    location.getLatitude();
                    location.getLongitude();
                    location.getAccuracy();
                    c5591a.f44458h.j(cVarA);
                } catch (IOException e10) {
                    e10.getMessage();
                }
            }
        }
    }

    private void b() {
        if (this.f44457g.v()) {
            try {
                Eb.e eVarX = this.f44457g.x();
                this.f44458h = new C5592b(eVarX.c(), this.f44451a.getSharedPreferences("bcState", 0));
            } catch (Exception unused) {
                f44449j.g("Unable to initialize bc repository", new Object[0]);
            }
        } else {
            this.f44451a.getSharedPreferences("bcState", 0).edit().clear().commit();
            this.f44458h = null;
        }
        c();
    }

    private void c() {
        if (!this.f44456f.w()) {
            d();
            return;
        }
        if (this.f44454d == null) {
            this.f44454d = this.f44452b.a();
        }
        if (this.f44454d == null || !this.f44453c.b()) {
            this.f44455e = null;
        } else {
            try {
                this.f44454d.requestLocationUpdates("passive", 0L, 0.0f, this.f44455e, Looper.getMainLooper());
            } catch (Exception unused) {
            }
        }
    }

    private void d() {
        b bVar = this.f44455e;
        if (bVar != null) {
            try {
                this.f44454d.removeUpdates(bVar);
            } catch (Exception unused) {
            }
            this.f44455e = null;
        }
    }

    @Override // Bb.k
    public final void a(String str, Object obj) {
        if ("Registration_Properties".equals(str)) {
            b();
        } else if (!"Location_Permission".equals(str) || ((Boolean) obj).booleanValue()) {
            c();
        } else {
            d();
        }
    }

    public C5591a(Context context, C14712a c14712a, Lb.c cVar, Bb.b bVar, e eVar) {
        this.f44451a = context;
        this.f44452b = c14712a;
        this.f44453c = cVar;
        this.f44456f = bVar;
        this.f44457g = eVar;
        eVar.h(this, "Registration_Properties", "Location_Permission");
        bVar.g(this, "collectBreadcrumb");
        b();
    }
}
