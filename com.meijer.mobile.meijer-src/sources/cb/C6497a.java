package cb;

import Db.e;
import Db.k;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Looper;
import com.medallia.digital.mobilesdk.l8;
import eb.C13784a;
import eb.C13785b;
import eb.C13786c;
import eb.C13787d;
import java.io.IOException;
import java.util.Comparator;
import kb.C15115a;

/* renamed from: cb.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6497a implements k {

    /* renamed from: j, reason: collision with root package name */
    private static final C13786c f61464j = C13787d.a(C6497a.class.getName());

    /* renamed from: k, reason: collision with root package name */
    private static final C13784a f61465k = C13785b.a(C6497a.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private Context f61466a;

    /* renamed from: b, reason: collision with root package name */
    private C15115a f61467b;

    /* renamed from: c, reason: collision with root package name */
    private Nb.c f61468c;

    /* renamed from: d, reason: collision with root package name */
    private LocationManager f61469d;

    /* renamed from: e, reason: collision with root package name */
    private b f61470e = new b();

    /* renamed from: f, reason: collision with root package name */
    Db.b f61471f;

    /* renamed from: g, reason: collision with root package name */
    private e f61472g;

    /* renamed from: h, reason: collision with root package name */
    C6498b f61473h;

    /* renamed from: i, reason: collision with root package name */
    Qb.c f61474i;

    /* renamed from: cb.a$a, reason: collision with other inner class name */
    final class C1229a implements Comparator<Qb.c> {
        C1229a() {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Qb.c cVar, Qb.c cVar2) {
            return (int) (cVar.b().b() - cVar2.b().b());
        }
    }

    /* renamed from: cb.a$b */
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
            C6497a c6497a = C6497a.this;
            Qb.c cVarA = Qb.c.a(location);
            if (c6497a.f61474i != null && Math.abs(cVarA.b().b() - c6497a.f61474i.b().b()) < Db.b.c(c6497a.f61471f.e().r(), l8.b.f93364b)) {
                Qb.c cVar = c6497a.f61474i;
                double dA = Db.b.a(c6497a.f61471f.e().q(), Float.valueOf(0.005f));
                double dAbs = Math.abs(cVar.b().c() - cVarA.b().c());
                double dAbs2 = Math.abs(cVar.b().d() - cVarA.b().d());
                if (dAbs <= dA && dAbs2 <= dA) {
                    return;
                }
            }
            c6497a.f61474i = cVarA;
            if (c6497a.f61473h != null) {
                try {
                    location.getLatitude();
                    location.getLongitude();
                    location.getAccuracy();
                    c6497a.f61473h.j(cVarA);
                } catch (IOException e10) {
                    e10.getMessage();
                }
            }
        }
    }

    private void b() {
        if (this.f61472g.v()) {
            try {
                Gb.e eVarX = this.f61472g.x();
                this.f61473h = new C6498b(eVarX.c(), this.f61466a.getSharedPreferences("bcState", 0));
            } catch (Exception unused) {
                f61464j.g("Unable to initialize bc repository", new Object[0]);
            }
        } else {
            this.f61466a.getSharedPreferences("bcState", 0).edit().clear().commit();
            this.f61473h = null;
        }
        c();
    }

    private void c() {
        if (!this.f61471f.w()) {
            d();
            return;
        }
        if (this.f61469d == null) {
            this.f61469d = this.f61467b.a();
        }
        if (this.f61469d == null || !this.f61468c.b()) {
            this.f61470e = null;
        } else {
            try {
                this.f61469d.requestLocationUpdates("passive", 0L, 0.0f, this.f61470e, Looper.getMainLooper());
            } catch (Exception unused) {
            }
        }
    }

    private void d() {
        b bVar = this.f61470e;
        if (bVar != null) {
            try {
                this.f61469d.removeUpdates(bVar);
            } catch (Exception unused) {
            }
            this.f61470e = null;
        }
    }

    @Override // Db.k
    public final void a(String str, Object obj) {
        if ("Registration_Properties".equals(str)) {
            b();
        } else if (!"Location_Permission".equals(str) || ((Boolean) obj).booleanValue()) {
            c();
        } else {
            d();
        }
    }

    public C6497a(Context context, C15115a c15115a, Nb.c cVar, Db.b bVar, e eVar) {
        this.f61466a = context;
        this.f61467b = c15115a;
        this.f61468c = cVar;
        this.f61471f = bVar;
        this.f61472g = eVar;
        eVar.h(this, "Registration_Properties", "Location_Permission");
        bVar.g(this, "collectBreadcrumb");
        b();
    }
}
