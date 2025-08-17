package kb;

import Bb.e;
import Bb.k;
import Ib.f;
import Ib.h;
import Lb.o;
import Vb.i;
import ac.InterfaceC5594a;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.LocationManager;
import android.os.Build;
import android.provider.Settings;
import cb.C6380a;
import cb.C6381b;
import nt.InterfaceC15945c;
import vb.C17537c;
import vb.C17538d;

/* renamed from: kb.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15129a implements k, i {

    /* renamed from: l, reason: collision with root package name */
    private static final C6380a f141784l = C6381b.a(C15129a.class.getName());

    /* renamed from: m, reason: collision with root package name */
    private static final String[] f141785m = {"geofencingAllowed", "proximityAllowed", "communicateAllowed", "establishedLocationsAllowed", "collectIDFAAllowed", "geofencingOverride", "proximityOverride", "establishedLocationsOverride", "collectIDFAOverride"};

    /* renamed from: a, reason: collision with root package name */
    Eb.b f141786a;

    /* renamed from: b, reason: collision with root package name */
    private C15132d f141787b;

    /* renamed from: c, reason: collision with root package name */
    public e f141788c;

    /* renamed from: d, reason: collision with root package name */
    private Lb.a f141789d;

    /* renamed from: e, reason: collision with root package name */
    public Vb.b f141790e;

    /* renamed from: f, reason: collision with root package name */
    public Context f141791f;

    /* renamed from: g, reason: collision with root package name */
    InterfaceC5594a f141792g;

    /* renamed from: h, reason: collision with root package name */
    Za.e f141793h;

    /* renamed from: i, reason: collision with root package name */
    f f141794i;

    /* renamed from: j, reason: collision with root package name */
    h f141795j;

    /* renamed from: k, reason: collision with root package name */
    public C15131c f141796k;

    /* renamed from: kb.a$a, reason: collision with other inner class name */
    final class C2241a implements InterfaceC15945c<Object> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC15945c f141797a;

        @Override // nt.InterfaceC15945c
        public final void a(Object obj) {
            C6380a unused = C15129a.f141784l;
            InterfaceC15945c interfaceC15945c = this.f141797a;
            if (interfaceC15945c != null) {
                interfaceC15945c.a(null);
            }
        }

        C2241a(InterfaceC15945c interfaceC15945c) {
            this.f141797a = interfaceC15945c;
        }

        @Override // nt.InterfaceC15945c
        public final void a(int i10, String str) {
            C6380a unused = C15129a.f141784l;
            InterfaceC15945c interfaceC15945c = this.f141797a;
            if (interfaceC15945c != null) {
                interfaceC15945c.a(i10, str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kb.a$b */
    public class b extends Gb.a {
        public b(e eVar, Context context) {
            super(eVar, context, new IntentFilter("android.location.MODE_CHANGED"));
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if ("android.location.MODE_CHANGED".equals(intent.getAction())) {
                C15129a.this.d();
            }
        }
    }

    @Override // Vb.i
    public final void a(int i10) {
        d();
    }

    public final synchronized Eb.b b() {
        d();
        return this.f141786a;
    }

    @Override // Bb.k
    public final void a(String str, Object obj) {
        if (obj != null) {
            if (str.compareTo("Registration_Properties") == 0) {
                if (this.f141788c.v() && this.f141789d.a()) {
                    this.f141796k.u();
                    return;
                }
                return;
            }
            if (str.compareTo("Changed_Api_Key") == 0) {
                this.f141786a.p0(Boolean.TRUE);
            } else if (str.compareTo("Places_Enabled") == 0) {
                this.f141786a.r0((Boolean) obj);
            } else if (str.compareTo("Established_Locations_Enabled") == 0) {
                this.f141786a.V((Boolean) obj);
            } else if (str.compareTo("Communicate_Enabled") == 0) {
                this.f141786a.R((Boolean) obj);
            } else if (str.compareTo("Beacon_Manager_Enabled") != 0) {
                return;
            } else {
                this.f141786a.J((Boolean) obj);
            }
            d();
        }
    }

    public final void d() {
        C15132d c15132d = this.f141787b;
        Eb.b bVar = this.f141786a;
        try {
            bVar.i0(Integer.valueOf(c15132d.f141806b.a("android.permission.ACCESS_FINE_LOCATION")));
            if (c15132d.f141815k == null) {
                c15132d.f141815k = c15132d.f141808d.a();
            }
            LocationManager locationManager = c15132d.f141815k;
            if (locationManager != null) {
                bVar.l0(Boolean.valueOf(locationManager.isProviderEnabled("network")));
                bVar.f0(Boolean.valueOf(locationManager.isProviderEnabled("gps")));
                bVar.o0(Boolean.valueOf(locationManager.isProviderEnabled("passive")));
                try {
                    bVar.Z(Boolean.valueOf(locationManager.isProviderEnabled("fused")));
                } catch (Exception unused) {
                }
            }
            try {
                bVar.h0(Integer.valueOf(Settings.Secure.getInt(c15132d.f141810f.getContentResolver(), "location_mode")));
            } catch (Settings.SettingNotFoundException unused2) {
                bVar.h0(null);
            }
            if (c15132d.f141812h.f17968a >= 18) {
                bVar.j0(Boolean.valueOf(c15132d.f141808d.c().isScanAlwaysAvailable()));
            }
            bVar.B0(Integer.valueOf(c15132d.f141808d.c().getWifiState()));
            bVar.L(c15132d.a());
            bVar.K(c15132d.d());
            bVar.m0(c15132d.f141807c.a());
            try {
                bVar.d0(Za.a.c());
                bVar.n0(String.valueOf(Build.VERSION.RELEASE));
                bVar.G(String.valueOf(c15132d.f141810f.getPackageManager().getPackageInfo(c15132d.f141810f.getPackageName(), 0).versionCode));
                bVar.S(String.valueOf(Build.MODEL));
            } catch (Exception unused3) {
            }
            bVar.z0(Integer.valueOf(c15132d.f141811g.b().getOffset(c15132d.f141811g.a())));
            bVar.U(Integer.valueOf(c15132d.f141809e.f().size()));
            bVar.F(c15132d.f141805a.g());
            bVar.s0(c15132d.f141805a.H());
            bVar.Q(c15132d.f141805a.J());
            bVar.X(c15132d.f141805a.I());
            Eb.e eVarX = c15132d.f141805a.x();
            boolean zV = c15132d.f141805a.v();
            bVar.x0(zV);
            if (zV) {
                bVar.y0(eVarX.g().longValue());
            }
            bVar.H(eVarX.b());
            bVar.I(eVarX.c());
            C15132d.c(bVar, c15132d.f141805a.L());
            C15132d.b(bVar, c15132d.f141805a.E());
            bVar.a0(c15132d.f141813i.p());
            bVar.t0(c15132d.f141813i.r());
            bVar.P(c15132d.f141813i.s());
            bVar.W(c15132d.f141813i.q());
            bVar.N(c15132d.f141813i.v());
            bVar.b0(c15132d.f141813i.x());
            bVar.u0(c15132d.f141813i.y());
            bVar.Y(c15132d.f141813i.z());
            bVar.O(c15132d.f141813i.A());
            bVar.M(Boolean.valueOf(c15132d.f141813i.w()));
            bVar.e0(c15132d.f141814j.b());
        } catch (Exception unused4) {
        }
        this.f141789d.f();
    }

    public C15129a(Context context, Za.e eVar, e eVar2, o oVar, C15132d c15132d, Vb.b bVar, InterfaceC5594a interfaceC5594a, f fVar, h hVar, C17538d c17538d) {
        boolean z10;
        this.f141787b = c15132d;
        this.f141788c = eVar2;
        this.f141790e = bVar;
        this.f141791f = context;
        this.f141792g = interfaceC5594a;
        this.f141793h = eVar;
        this.f141794i = fVar;
        this.f141795j = hVar;
        c17538d.a(new C17537c(Eb.b.class, f141785m), Eb.b.class);
        this.f141789d = oVar.a("client-state");
        Eb.b bVar2 = new Eb.b();
        if (this.f141788c.q() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        bVar2.p0(Boolean.valueOf(z10));
        bVar2.r0(Boolean.valueOf(this.f141788c.H()));
        bVar2.V(Boolean.valueOf(this.f141788c.I()));
        bVar2.R(Boolean.valueOf(this.f141788c.J()));
        bVar2.J(Boolean.valueOf(this.f141788c.K()));
        this.f141786a = bVar2;
    }
}
