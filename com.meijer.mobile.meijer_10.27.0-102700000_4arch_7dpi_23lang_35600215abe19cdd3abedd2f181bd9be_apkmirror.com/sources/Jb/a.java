package Jb;

import Bb.e;
import Bb.k;
import Eb.f;
import Lb.c;
import Lb.g;
import Ya.b;
import cb.C6382c;
import cb.C6383d;
import com.medallia.digital.mobilesdk.l8;
import java.util.Date;
import kb.C15129a;
import qb.C16489c;

/* loaded from: classes4.dex */
public final class a extends b implements k {

    /* renamed from: r, reason: collision with root package name */
    private static final C6382c f14745r = C6383d.a("GIMBAL");

    /* renamed from: n, reason: collision with root package name */
    private boolean f14746n;

    /* renamed from: o, reason: collision with root package name */
    private final e f14747o;

    /* renamed from: p, reason: collision with root package name */
    private final C15129a f14748p;

    /* renamed from: q, reason: collision with root package name */
    boolean f14749q;

    @Override // Ya.c
    public final void x() throws Exception {
        String str;
        this.f14749q = false;
        if (this.f14746n && this.f14747o.d()) {
            Eb.b bVarA = C16489c.a(this.f14748p.b());
            C6382c c6382c = f14745r;
            c6382c.d("----------------------------------------------- GIMBAL -----------------------------------------------", new Object[0]);
            c6382c.d("Gimbal API Key in use:          {} for package name {}{}", bVarA.c(), bVarA.d(), (bVarA.n() == null || !bVarA.n().booleanValue()) ? "" : "  (API key change in progress)");
            String strE = bVarA.e();
            if (bVarA.C()) {
                str = "  Registered @ " + new Date(bVarA.r()).toString();
            } else {
                str = "NOT registered";
            }
            c6382c.b("Gimbal App Instance Identifier: {}{}", strE, str);
            String strL = bVarA.l();
            if ("${project.version}".equals(strL)) {
                strL = "DEV";
            }
            c6382c.a("Gimbal Version:                 {}", strL);
            c6382c.a("Location:                       {}", bVarA.m() == null ? "Undetermined" : c.c(bVarA.m().intValue()) ? "Granted" : "NOT granted");
            c6382c.a("Geofenced Places:               {}", C(bVarA.z(), bVarA.x() || bVarA.A(), bVarA.k()));
            c6382c.a("Bluetooth:                      {}", bVarA.f() != null ? bVarA.f().booleanValue() ? "Permitted" : "NOT permitted" : "Undetermined");
            c6382c.a("Beacon Places:                  {}", C(bVarA.z(), bVarA.x() || bVarA.A(), bVarA.o()));
            c6382c.a("Communicate:                    {}", C(bVarA.i().booleanValue(), bVarA.u(), f.NOT_SET));
            c6382c.a("Established Locations:          {}", C(bVarA.w(), bVarA.v(), bVarA.j()));
            c6382c.a("Google Play Services Available: {}", bVarA.y() ? "Yes" : "No");
            if (bVarA.q() == null) {
                c6382c.a("Push (GCM) Sender ID:           {}", "Sender ID not set");
            } else {
                c6382c.a("Push (GCM) Sender ID:           {}", bVarA.q());
            }
            if (bVarA.p() == null) {
                c6382c.a("Push (GCM) Token:               {}", "No registration token");
            } else {
                c6382c.a("Push (GCM) Token:               {}", bVarA.p());
            }
            c6382c.a("Ad Id Management:               {}", C(true, bVarA.t(), bVarA.g()));
            if (bVarA.b() != null) {
                c6382c.b("Ad Id:                          {}{}", bVarA.b(), bVarA.s().booleanValue() ? " (Enabled)" : " (Disabled)");
            }
            c6382c.d("----------------------------------------------- GIMBAL -----------------------------------------------", new Object[0]);
        }
    }

    public a(Za.c cVar, Za.e eVar, g gVar, e eVar2, C15129a c15129a) {
        super(cVar, eVar, "Status Logger", l8.b.f92526c);
        this.f14749q = true;
        this.f14746n = gVar.f17945b;
        this.f14747o = eVar2;
        this.f14748p = c15129a;
        eVar2.h(this, "Status_Logs", "Registration_Properties");
    }

    private static String C(boolean z10, boolean z11, f fVar) {
        return fVar == f.ON ? "Enabled by Gimbal Server" : fVar == f.OFF ? "Disabled by Gimbal Server" : !z11 ? "Disabled by Gimbal Manager" : !z10 ? "Not enabled" : "Enabled";
    }

    @Override // Bb.k
    public final void a(String str, Object obj) {
        System.out.println("Key changed: " + str);
        if (this.f14746n) {
            if ("Status_Logs".equals(str)) {
                q();
            } else {
                u();
            }
        }
    }

    @Override // Ya.c
    public final long v() {
        if (this.f14746n && this.f14747o.d()) {
            return this.f14749q ? System.currentTimeMillis() : super.v();
        }
        return 4611686018427387903L;
    }
}
