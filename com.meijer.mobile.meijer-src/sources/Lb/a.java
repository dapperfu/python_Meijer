package Lb;

import Db.e;
import Db.k;
import Gb.b;
import Gb.f;
import Nb.c;
import Nb.g;
import ab.AbstractC5677b;
import bb.C6346c;
import com.medallia.digital.mobilesdk.l8;
import eb.C13786c;
import eb.C13787d;
import java.util.Date;
import mb.C15700a;
import sb.C17037c;

/* loaded from: classes4.dex */
public final class a extends AbstractC5677b implements k {

    /* renamed from: r, reason: collision with root package name */
    private static final C13786c f18082r = C13787d.a("GIMBAL");

    /* renamed from: n, reason: collision with root package name */
    private boolean f18083n;

    /* renamed from: o, reason: collision with root package name */
    private final e f18084o;

    /* renamed from: p, reason: collision with root package name */
    private final C15700a f18085p;

    /* renamed from: q, reason: collision with root package name */
    boolean f18086q;

    @Override // ab.AbstractC5678c
    public final void x() throws Exception {
        String str;
        this.f18086q = false;
        if (this.f18083n && this.f18084o.d()) {
            b bVarA = C17037c.a(this.f18085p.b());
            C13786c c13786c = f18082r;
            c13786c.d("----------------------------------------------- GIMBAL -----------------------------------------------", new Object[0]);
            c13786c.d("Gimbal API Key in use:          {} for package name {}{}", bVarA.c(), bVarA.d(), (bVarA.n() == null || !bVarA.n().booleanValue()) ? "" : "  (API key change in progress)");
            String strE = bVarA.e();
            if (bVarA.C()) {
                str = "  Registered @ " + new Date(bVarA.r()).toString();
            } else {
                str = "NOT registered";
            }
            c13786c.b("Gimbal App Instance Identifier: {}{}", strE, str);
            String strL = bVarA.l();
            if ("${project.version}".equals(strL)) {
                strL = "DEV";
            }
            c13786c.a("Gimbal Version:                 {}", strL);
            c13786c.a("Location:                       {}", bVarA.m() == null ? "Undetermined" : c.c(bVarA.m().intValue()) ? "Granted" : "NOT granted");
            c13786c.a("Geofenced Places:               {}", C(bVarA.z(), bVarA.x() || bVarA.A(), bVarA.k()));
            c13786c.a("Bluetooth:                      {}", bVarA.f() != null ? bVarA.f().booleanValue() ? "Permitted" : "NOT permitted" : "Undetermined");
            c13786c.a("Beacon Places:                  {}", C(bVarA.z(), bVarA.x() || bVarA.A(), bVarA.o()));
            c13786c.a("Communicate:                    {}", C(bVarA.i().booleanValue(), bVarA.u(), f.NOT_SET));
            c13786c.a("Established Locations:          {}", C(bVarA.w(), bVarA.v(), bVarA.j()));
            c13786c.a("Google Play Services Available: {}", bVarA.y() ? "Yes" : "No");
            if (bVarA.q() == null) {
                c13786c.a("Push (GCM) Sender ID:           {}", "Sender ID not set");
            } else {
                c13786c.a("Push (GCM) Sender ID:           {}", bVarA.q());
            }
            if (bVarA.p() == null) {
                c13786c.a("Push (GCM) Token:               {}", "No registration token");
            } else {
                c13786c.a("Push (GCM) Token:               {}", bVarA.p());
            }
            c13786c.a("Ad Id Management:               {}", C(true, bVarA.t(), bVarA.g()));
            if (bVarA.b() != null) {
                c13786c.b("Ad Id:                          {}{}", bVarA.b(), bVarA.s().booleanValue() ? " (Enabled)" : " (Disabled)");
            }
            c13786c.d("----------------------------------------------- GIMBAL -----------------------------------------------", new Object[0]);
        }
    }

    public a(C6346c c6346c, bb.e eVar, g gVar, e eVar2, C15700a c15700a) {
        super(c6346c, eVar, "Status Logger", l8.b.f93365c);
        this.f18086q = true;
        this.f18083n = gVar.f20765b;
        this.f18084o = eVar2;
        this.f18085p = c15700a;
        eVar2.h(this, "Status_Logs", "Registration_Properties");
    }

    private static String C(boolean z10, boolean z11, f fVar) {
        return fVar == f.ON ? "Enabled by Gimbal Server" : fVar == f.OFF ? "Disabled by Gimbal Server" : !z11 ? "Disabled by Gimbal Manager" : !z10 ? "Not enabled" : "Enabled";
    }

    @Override // Db.k
    public final void a(String str, Object obj) {
        System.out.println("Key changed: " + str);
        if (this.f18083n) {
            if ("Status_Logs".equals(str)) {
                q();
            } else {
                u();
            }
        }
    }

    @Override // ab.AbstractC5678c
    public final long v() {
        if (this.f18083n && this.f18084o.d()) {
            return this.f18086q ? System.currentTimeMillis() : super.v();
        }
        return 4611686018427387903L;
    }
}
