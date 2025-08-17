package Mb;

import Mb.o;
import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Looper;
import cb.C6380a;
import cb.C6381b;
import cb.C6382c;
import cb.C6383d;
import ib.C14712a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

/* loaded from: classes4.dex */
public class p implements Bb.k {

    /* renamed from: i, reason: collision with root package name */
    private static final C6382c f19114i = C6383d.a(p.class.getName());

    /* renamed from: j, reason: collision with root package name */
    private static final C6380a f19115j = C6381b.a(p.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private Context f19116a;

    /* renamed from: b, reason: collision with root package name */
    public Bb.e f19117b;

    /* renamed from: c, reason: collision with root package name */
    private Bb.b f19118c;

    /* renamed from: d, reason: collision with root package name */
    private final C14712a f19119d;

    /* renamed from: e, reason: collision with root package name */
    private Lb.c f19120e;

    /* renamed from: g, reason: collision with root package name */
    private volatile o f19122g;

    /* renamed from: f, reason: collision with root package name */
    private o.b f19121f = new o.b();

    /* renamed from: h, reason: collision with root package name */
    private a f19123h = new a();

    protected class a implements LocationListener {

        /* renamed from: a, reason: collision with root package name */
        LocationManager f19124a;

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
            LocationManager locationManager = this.f19124a;
            if (locationManager != null) {
                try {
                    locationManager.removeUpdates(this);
                } catch (Exception unused) {
                    C6380a unused2 = p.f19115j;
                }
                this.f19124a = null;
            }
        }

        public final boolean b() {
            return this.f19124a != null;
        }

        @Override // android.location.LocationListener
        public final void onLocationChanged(Location location) {
            try {
                o oVar = p.this.f19122g;
                if (oVar != null) {
                    oVar.g(p.b(location));
                }
            } catch (IOException unused) {
                C6380a unused2 = p.f19115j;
            }
        }
    }

    private synchronized void h() {
        if (this.f19117b.v()) {
            String strC = this.f19117b.x().c();
            try {
                this.f19122g = new o(new Bb.c(strC, this.f19116a.getSharedPreferences("EstablishedLocations", 0)), new t(strC, this.f19116a.getSharedPreferences("EstablishedLocationsState", 0)), this.f19121f);
            } catch (Exception e10) {
                f19114i.g("Unable to initialize established locations", e10);
            }
        } else {
            SharedPreferences.Editor editorEdit = this.f19116a.getSharedPreferences("EstablishedLocations", 0).edit();
            SharedPreferences.Editor editorEdit2 = this.f19116a.getSharedPreferences("EstablishedLocationsState", 0).edit();
            editorEdit.clear().commit();
            editorEdit2.clear().commit();
            this.f19122g = null;
        }
        j();
    }

    private synchronized void j() {
        try {
            if (i()) {
                if (!this.f19123h.b()) {
                    a aVar = this.f19123h;
                    if (aVar.f19124a == null) {
                        aVar.f19124a = p.this.f19119d.a();
                    }
                    if (aVar.f19124a == null || !p.this.f19120e.b()) {
                        aVar.f19124a = null;
                    } else {
                        try {
                            aVar.f19124a.requestLocationUpdates("passive", 0L, 0.0f, aVar, Looper.getMainLooper());
                        } catch (Exception unused) {
                        }
                    }
                }
            } else if (this.f19123h.b()) {
                this.f19123h.a();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void d() {
        this.f19117b.A();
        this.f19117b.w(true);
        j();
    }

    public final synchronized void e() {
        this.f19117b.w(false);
        j();
    }

    public final synchronized List<h> f() {
        if (this.f19122g != null && i()) {
            try {
                return this.f19122g.e();
            } catch (IOException e10) {
                f19114i.g("Unable to retrieve established locations {}", e10.getMessage());
            }
        }
        return new ArrayList();
    }

    protected static f b(Location location) {
        return new f(location.getLatitude(), location.getLongitude(), location.getAccuracy(), location.getTime(), TimeZone.getDefault().getID());
    }

    private boolean i() {
        Eb.f fVarX = this.f19118c.x();
        Eb.f fVar = Eb.f.ON;
        if ((fVarX != fVar && (fVarX != Eb.f.NOT_SET || !this.f19117b.I())) || !this.f19117b.v()) {
            return false;
        }
        Eb.f fVarZ = this.f19118c.z();
        if (fVarZ != fVar) {
            return fVarZ == Eb.f.NOT_SET && this.f19118c.q();
        }
        return true;
    }

    @Override // Bb.k
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
            this.f19123h.a();
        }
    }

    public p(Context context, Bb.e eVar, Bb.b bVar, C14712a c14712a, Lb.c cVar) {
        this.f19116a = context;
        this.f19117b = eVar;
        this.f19118c = bVar;
        this.f19119d = c14712a;
        this.f19120e = cVar;
        eVar.h(this, "Registration_Properties", "Location_Permission");
        bVar.g(this, "allowEstablishedLocations");
        bVar.g(this, "overrideEstablishedLocations");
        h();
    }
}
