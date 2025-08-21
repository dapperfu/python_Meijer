package Ob;

import Ob.o;
import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Looper;
import eb.C13784a;
import eb.C13785b;
import eb.C13786c;
import eb.C13787d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import kb.C15115a;

/* loaded from: classes4.dex */
public class p implements Db.k {

    /* renamed from: i, reason: collision with root package name */
    private static final C13786c f23301i = C13787d.a(p.class.getName());

    /* renamed from: j, reason: collision with root package name */
    private static final C13784a f23302j = C13785b.a(p.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private Context f23303a;

    /* renamed from: b, reason: collision with root package name */
    public Db.e f23304b;

    /* renamed from: c, reason: collision with root package name */
    private Db.b f23305c;

    /* renamed from: d, reason: collision with root package name */
    private final C15115a f23306d;

    /* renamed from: e, reason: collision with root package name */
    private Nb.c f23307e;

    /* renamed from: g, reason: collision with root package name */
    private volatile o f23309g;

    /* renamed from: f, reason: collision with root package name */
    private o.b f23308f = new o.b();

    /* renamed from: h, reason: collision with root package name */
    private a f23310h = new a();

    protected class a implements LocationListener {

        /* renamed from: a, reason: collision with root package name */
        LocationManager f23311a;

        @Override // android.location.LocationListener
        public final void onProviderDisabled(String str) {
        }

        @Override // android.location.LocationListener
        public final void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public final void onStatusChanged(String str, int i10, Bundle bundle) {
        }

        public a() {
        }

        public final void a() {
            LocationManager locationManager = this.f23311a;
            if (locationManager != null) {
                try {
                    locationManager.removeUpdates(this);
                } catch (Exception unused) {
                    C13784a unused2 = p.f23302j;
                }
                this.f23311a = null;
            }
        }

        public final boolean b() {
            return this.f23311a != null;
        }

        @Override // android.location.LocationListener
        public final void onLocationChanged(Location location) {
            try {
                o oVar = p.this.f23309g;
                if (oVar != null) {
                    oVar.g(p.b(location));
                }
            } catch (IOException unused) {
                C13784a unused2 = p.f23302j;
            }
        }
    }

    private synchronized void h() {
        if (this.f23304b.v()) {
            String strC = this.f23304b.x().c();
            try {
                this.f23309g = new o(new Db.c(strC, this.f23303a.getSharedPreferences("EstablishedLocations", 0)), new t(strC, this.f23303a.getSharedPreferences("EstablishedLocationsState", 0)), this.f23308f);
            } catch (Exception e10) {
                f23301i.g("Unable to initialize established locations", e10);
            }
        } else {
            SharedPreferences.Editor editorEdit = this.f23303a.getSharedPreferences("EstablishedLocations", 0).edit();
            SharedPreferences.Editor editorEdit2 = this.f23303a.getSharedPreferences("EstablishedLocationsState", 0).edit();
            editorEdit.clear().commit();
            editorEdit2.clear().commit();
            this.f23309g = null;
        }
        j();
    }

    private synchronized void j() {
        try {
            if (i()) {
                if (!this.f23310h.b()) {
                    a aVar = this.f23310h;
                    if (aVar.f23311a == null) {
                        aVar.f23311a = p.this.f23306d.a();
                    }
                    if (aVar.f23311a == null || !p.this.f23307e.b()) {
                        aVar.f23311a = null;
                    } else {
                        try {
                            aVar.f23311a.requestLocationUpdates("passive", 0L, 0.0f, aVar, Looper.getMainLooper());
                        } catch (Exception unused) {
                        }
                    }
                }
            } else if (this.f23310h.b()) {
                this.f23310h.a();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void d() {
        this.f23304b.A();
        this.f23304b.w(true);
        j();
    }

    public final synchronized void e() {
        this.f23304b.w(false);
        j();
    }

    public final synchronized List<h> f() {
        if (this.f23309g != null && i()) {
            try {
                return this.f23309g.e();
            } catch (IOException e10) {
                f23301i.g("Unable to retrieve established locations {}", e10.getMessage());
            }
        }
        return new ArrayList();
    }

    protected static f b(Location location) {
        return new f(location.getLatitude(), location.getLongitude(), location.getAccuracy(), location.getTime(), TimeZone.getDefault().getID());
    }

    private boolean i() {
        Gb.f fVarX = this.f23305c.x();
        Gb.f fVar = Gb.f.ON;
        if ((fVarX != fVar && (fVarX != Gb.f.NOT_SET || !this.f23304b.I())) || !this.f23304b.v()) {
            return false;
        }
        Gb.f fVarZ = this.f23305c.z();
        if (fVarZ != fVar) {
            return fVarZ == Gb.f.NOT_SET && this.f23305c.q();
        }
        return true;
    }

    @Override // Db.k
    public final void a(String str, Object obj) {
        if ("Registration_Properties".equals(str)) {
            h();
            return;
        }
        if (!"Location_Permission".equals(str)) {
            if ("overrideEstablishedLocations".equals(str)) {
                j();
            }
        } else if (((Boolean) obj).booleanValue()) {
            j();
        } else {
            this.f23310h.a();
        }
    }

    public p(Context context, Db.e eVar, Db.b bVar, C15115a c15115a, Nb.c cVar) {
        this.f23303a = context;
        this.f23304b = eVar;
        this.f23305c = bVar;
        this.f23306d = c15115a;
        this.f23307e = cVar;
        eVar.h(this, "Registration_Properties", "Location_Permission");
        bVar.g(this, "allowEstablishedLocations");
        bVar.g(this, "overrideEstablishedLocations");
        h();
    }
}
