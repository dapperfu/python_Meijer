package mb;

import Db.e;
import Db.k;
import Kb.f;
import Kb.h;
import Nb.o;
import Xb.i;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.LocationManager;
import android.os.Build;
import android.provider.Settings;
import bb.C6344a;
import cc.InterfaceC6500a;
import eb.C13784a;
import eb.C13785b;
import nt.InterfaceC16021c;
import xb.C18149c;
import xb.C18150d;

/* renamed from: mb.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15700a implements k, i {

    /* renamed from: l, reason: collision with root package name */
    private static final C13784a f150930l = C13785b.a(C15700a.class.getName());

    /* renamed from: m, reason: collision with root package name */
    private static final String[] f150931m = {"geofencingAllowed", "proximityAllowed", "communicateAllowed", "establishedLocationsAllowed", "collectIDFAAllowed", "geofencingOverride", "proximityOverride", "establishedLocationsOverride", "collectIDFAOverride"};

    /* renamed from: a, reason: collision with root package name */
    Gb.b f150932a;

    /* renamed from: b, reason: collision with root package name */
    private C15703d f150933b;

    /* renamed from: c, reason: collision with root package name */
    public e f150934c;

    /* renamed from: d, reason: collision with root package name */
    private Nb.a f150935d;

    /* renamed from: e, reason: collision with root package name */
    public Xb.b f150936e;

    /* renamed from: f, reason: collision with root package name */
    public Context f150937f;

    /* renamed from: g, reason: collision with root package name */
    InterfaceC6500a f150938g;

    /* renamed from: h, reason: collision with root package name */
    bb.e f150939h;

    /* renamed from: i, reason: collision with root package name */
    f f150940i;

    /* renamed from: j, reason: collision with root package name */
    h f150941j;

    /* renamed from: k, reason: collision with root package name */
    public C15702c f150942k;

    /* renamed from: mb.a$a, reason: collision with other inner class name */
    final class C2323a implements InterfaceC16021c<Object> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16021c f150943a;

        @Override // nt.InterfaceC16021c
        public final void a(Object obj) {
            C13784a unused = C15700a.f150930l;
            InterfaceC16021c interfaceC16021c = this.f150943a;
            if (interfaceC16021c != null) {
                interfaceC16021c.a(null);
            }
        }

        C2323a(InterfaceC16021c interfaceC16021c) {
            this.f150943a = interfaceC16021c;
        }

        @Override // nt.InterfaceC16021c
        public final void a(int i10, String str) {
            C13784a unused = C15700a.f150930l;
            InterfaceC16021c interfaceC16021c = this.f150943a;
            if (interfaceC16021c != null) {
                interfaceC16021c.a(i10, str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: mb.a$b */
    public class b extends Ib.a {
        public b(e eVar, Context context) {
            super(eVar, context, new IntentFilter("android.location.MODE_CHANGED"));
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if ("android.location.MODE_CHANGED".equals(intent.getAction())) {
                C15700a.this.d();
            }
        }
    }

    @Override // Xb.i
    public final void a(int i10) {
        d();
    }

    public final synchronized Gb.b b() {
        d();
        return this.f150932a;
    }

    @Override // Db.k
    public final void a(String str, Object obj) {
        if (obj != null) {
            if (str.compareTo("Registration_Properties") == 0) {
                if (this.f150934c.v() && this.f150935d.a()) {
                    this.f150942k.u();
                    return;
                }
                return;
            }
            if (str.compareTo("Changed_Api_Key") == 0) {
                this.f150932a.p0(Boolean.TRUE);
            } else if (str.compareTo("Places_Enabled") == 0) {
                this.f150932a.q0((Boolean) obj);
            } else if (str.compareTo("Established_Locations_Enabled") == 0) {
                this.f150932a.V((Boolean) obj);
            } else if (str.compareTo("Communicate_Enabled") == 0) {
                this.f150932a.R((Boolean) obj);
            } else if (str.compareTo("Beacon_Manager_Enabled") != 0) {
                return;
            } else {
                this.f150932a.J((Boolean) obj);
            }
            d();
        }
    }

    public final void d() {
        C15703d c15703d = this.f150933b;
        Gb.b bVar = this.f150932a;
        try {
            bVar.i0(Integer.valueOf(c15703d.f150952b.a("android.permission.ACCESS_FINE_LOCATION")));
            if (c15703d.f150961k == null) {
                c15703d.f150961k = c15703d.f150954d.a();
            }
            LocationManager locationManager = c15703d.f150961k;
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
                bVar.h0(Integer.valueOf(Settings.Secure.getInt(c15703d.f150956f.getContentResolver(), "location_mode")));
            } catch (Settings.SettingNotFoundException unused2) {
                bVar.h0(null);
            }
            if (c15703d.f150958h.f20788a >= 18) {
                bVar.j0(Boolean.valueOf(c15703d.f150954d.c().isScanAlwaysAvailable()));
            }
            bVar.B0(Integer.valueOf(c15703d.f150954d.c().getWifiState()));
            bVar.L(c15703d.a());
            bVar.K(c15703d.d());
            bVar.m0(c15703d.f150953c.a());
            try {
                bVar.d0(C6344a.c());
                bVar.n0(String.valueOf(Build.VERSION.RELEASE));
                bVar.G(String.valueOf(c15703d.f150956f.getPackageManager().getPackageInfo(c15703d.f150956f.getPackageName(), 0).versionCode));
                bVar.S(String.valueOf(Build.MODEL));
            } catch (Exception unused3) {
            }
            bVar.z0(Integer.valueOf(c15703d.f150957g.b().getOffset(c15703d.f150957g.a())));
            bVar.U(Integer.valueOf(c15703d.f150955e.f().size()));
            bVar.F(c15703d.f150951a.g());
            bVar.s0(c15703d.f150951a.H());
            bVar.Q(c15703d.f150951a.J());
            bVar.X(c15703d.f150951a.I());
            Gb.e eVarX = c15703d.f150951a.x();
            boolean zV = c15703d.f150951a.v();
            bVar.x0(zV);
            if (zV) {
                bVar.y0(eVarX.g().longValue());
            }
            bVar.H(eVarX.b());
            bVar.I(eVarX.c());
            C15703d.c(bVar, c15703d.f150951a.L());
            C15703d.b(bVar, c15703d.f150951a.E());
            bVar.a0(c15703d.f150959i.p());
            bVar.t0(c15703d.f150959i.r());
            bVar.P(c15703d.f150959i.s());
            bVar.W(c15703d.f150959i.q());
            bVar.N(c15703d.f150959i.v());
            bVar.c0(c15703d.f150959i.x());
            bVar.u0(c15703d.f150959i.y());
            bVar.Y(c15703d.f150959i.z());
            bVar.O(c15703d.f150959i.A());
            bVar.M(Boolean.valueOf(c15703d.f150959i.w()));
            bVar.e0(c15703d.f150960j.b());
        } catch (Exception unused4) {
        }
        this.f150935d.f();
    }

    public C15700a(Context context, bb.e eVar, e eVar2, o oVar, C15703d c15703d, Xb.b bVar, InterfaceC6500a interfaceC6500a, f fVar, h hVar, C18150d c18150d) {
        boolean z10;
        this.f150933b = c15703d;
        this.f150934c = eVar2;
        this.f150936e = bVar;
        this.f150937f = context;
        this.f150938g = interfaceC6500a;
        this.f150939h = eVar;
        this.f150940i = fVar;
        this.f150941j = hVar;
        c18150d.a(new C18149c(Gb.b.class, f150931m), Gb.b.class);
        this.f150935d = oVar.a("client-state");
        Gb.b bVar2 = new Gb.b();
        if (this.f150934c.q() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        bVar2.p0(Boolean.valueOf(z10));
        bVar2.q0(Boolean.valueOf(this.f150934c.H()));
        bVar2.V(Boolean.valueOf(this.f150934c.I()));
        bVar2.R(Boolean.valueOf(this.f150934c.J()));
        bVar2.J(Boolean.valueOf(this.f150934c.K()));
        this.f150932a = bVar2;
    }
}
