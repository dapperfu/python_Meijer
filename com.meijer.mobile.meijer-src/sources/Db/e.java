package Db;

import Gb.e;
import com.gimbal.internal.json.JsonWriteException;
import eb.C13784a;
import eb.C13785b;
import eb.C13786c;
import eb.C13787d;
import java.util.ArrayList;
import java.util.List;
import xb.C18150d;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: s, reason: collision with root package name */
    private static C13784a f6071s = C13785b.a(e.class.getName());

    /* renamed from: t, reason: collision with root package name */
    private static C13786c f6072t = C13787d.a(e.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public l f6073a;

    /* renamed from: b, reason: collision with root package name */
    private Gb.e f6074b;

    /* renamed from: c, reason: collision with root package name */
    private Gb.d f6075c;

    /* renamed from: d, reason: collision with root package name */
    private Boolean f6076d;

    /* renamed from: e, reason: collision with root package name */
    private Boolean f6077e;

    /* renamed from: f, reason: collision with root package name */
    private Boolean f6078f;

    /* renamed from: g, reason: collision with root package name */
    private Boolean f6079g;

    /* renamed from: h, reason: collision with root package name */
    private Boolean f6080h;

    /* renamed from: i, reason: collision with root package name */
    private String f6081i;

    /* renamed from: j, reason: collision with root package name */
    private String f6082j;

    /* renamed from: k, reason: collision with root package name */
    private String f6083k;

    /* renamed from: l, reason: collision with root package name */
    private String f6084l;

    /* renamed from: m, reason: collision with root package name */
    private String f6085m;

    /* renamed from: n, reason: collision with root package name */
    private String f6086n;

    /* renamed from: o, reason: collision with root package name */
    private String f6087o;

    /* renamed from: p, reason: collision with root package name */
    private String f6088p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f6089q = false;

    /* renamed from: r, reason: collision with root package name */
    private String f6090r;

    public final synchronized void A() {
        if (D() == null) {
            Gb.c cVar = new Gb.c();
            cVar.c(System.currentTimeMillis());
            cVar.d(System.currentTimeMillis());
            this.f6073a.a("Instance_Status", cVar);
        }
    }

    public final synchronized void B(boolean z10) {
        this.f6073a.e("Place_State_Aggregate_Permission", Boolean.valueOf(z10));
        this.f6080h = Boolean.valueOf(z10);
    }

    public final synchronized Boolean C() {
        return this.f6073a.g("Instance_Status_Job_Run", Boolean.FALSE);
    }

    public final synchronized Gb.c D() {
        return (Gb.c) this.f6073a.b("Instance_Status", Gb.c.class);
    }

    public final synchronized Gb.a E() {
        return (Gb.a) this.f6073a.b("Advertising_Info", Gb.a.class);
    }

    public final synchronized Gb.a F() {
        return (Gb.a) this.f6073a.b("Advertising_Info_On_Server", Gb.a.class);
    }

    public final synchronized Kb.a G() {
        Kb.a aVar;
        try {
            aVar = (Kb.a) this.f6073a.b("Authentication_Properties", Kb.a.class);
            if (aVar == null) {
                aVar = new Kb.a();
                Gb.e eVarX = x();
                if (eVarX.k()) {
                    m(aVar, eVarX);
                }
            }
            if (!this.f6089q) {
                this.f6089q = true;
                Gb.e eVarX2 = x();
                if (eVarX2.k() && (!eVarX2.i().equals(aVar.a()) || !eVarX2.j().equals(aVar.b()))) {
                    eVarX2.j();
                    m(aVar, eVarX2);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return aVar;
    }

    public final synchronized boolean H() {
        try {
            if (this.f6076d == null) {
                this.f6076d = this.f6073a.g("Places_Enabled", Boolean.FALSE);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f6076d.booleanValue();
    }

    public final synchronized boolean I() {
        try {
            if (this.f6077e == null) {
                this.f6077e = this.f6073a.g("Established_Locations_Enabled", Boolean.FALSE);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f6077e.booleanValue();
    }

    public final synchronized boolean J() {
        try {
            if (this.f6078f == null) {
                this.f6078f = this.f6073a.g("Communicate_Enabled", Boolean.FALSE);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f6078f.booleanValue();
    }

    public final synchronized boolean K() {
        try {
            if (this.f6079g == null) {
                this.f6079g = this.f6073a.g("Beacon_Manager_Enabled", Boolean.FALSE);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f6079g.booleanValue();
    }

    public final synchronized Gb.d L() {
        try {
            if (this.f6075c == null) {
                Gb.d dVar = (Gb.d) this.f6073a.b("Push_Properties", Gb.d.class);
                this.f6075c = dVar;
                if (dVar == null) {
                    this.f6075c = new Gb.d();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f6075c;
    }

    public final synchronized boolean M() {
        return L().c() != null;
    }

    public final synchronized List<Long> N() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        String strH = this.f6073a.h("Time_Zone_Change_Times", null);
        if (strH != null) {
            try {
                for (Long l10 : (Long[]) new C18150d().c(Long[].class, strH)) {
                    arrayList.add(l10);
                }
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    public final synchronized String O() {
        return this.f6073a.h("User_Time_Zone", null);
    }

    public final synchronized String P() {
        try {
            if (this.f6090r == null) {
                this.f6090r = this.f6073a.h("Analytics_Base_Url", "https://analytics-server.gimbal.com/service/");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f6090r;
    }

    public final synchronized String Q() {
        try {
            if (this.f6084l == null) {
                this.f6084l = this.f6073a.h("Sighting_Base_Url", "https://sightings.gimbal.com/");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f6084l;
    }

    public final synchronized String R() {
        try {
            if (this.f6085m == null) {
                this.f6085m = this.f6073a.h("Registration_Base_Url", "https://registration.gimbal.com/service/");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f6085m;
    }

    public final synchronized String S() {
        try {
            if (this.f6086n == null) {
                this.f6086n = this.f6073a.h("Communicate_Search_Base_Url", "https://communicate.gimbal.com/service/");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f6086n;
    }

    public final synchronized String T() {
        try {
            if (this.f6087o == null) {
                this.f6087o = this.f6073a.h("Sdk_Configuration_Base_Url", "https://sdk-configuration.gimbal.com/service/");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f6087o;
    }

    public final synchronized String U() {
        try {
            if (this.f6088p == null) {
                this.f6088p = this.f6073a.h("Sdk_Info_Base_Url", "https://sdk-info.gimbal.com/service/");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f6088p;
    }

    public final synchronized String V() {
        try {
            if (this.f6081i == null) {
                this.f6081i = this.f6073a.h("Beacon_Resolve_Base_Url", "https://resolve.gimbal.com/");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f6081i;
    }

    public final synchronized String a() {
        try {
            if (this.f6082j == null) {
                this.f6082j = this.f6073a.h("Place_Bubble_Base_Url", "https://placebubble.gimbal.com/service/");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f6082j;
    }

    public final synchronized String b() {
        try {
            if (this.f6083k == null) {
                this.f6083k = this.f6073a.h("Encrypted_Server_Base_Url", "https://eds.gimbal.com");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f6083k;
    }

    public final synchronized boolean c() {
        try {
            if (this.f6080h == null) {
                this.f6080h = this.f6073a.g("Place_State_Aggregate_Permission", Boolean.TRUE);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f6080h.booleanValue();
    }

    public final synchronized boolean f() {
        return this.f6073a.g("Sightings_Logs", Boolean.FALSE).booleanValue();
    }

    public final synchronized String g() {
        return this.f6073a.h("Api_Key", null);
    }

    public final synchronized void i(Gb.a aVar) {
        this.f6073a.a("Advertising_Info", aVar);
    }

    public final synchronized void j(Gb.d dVar) {
        this.f6075c = dVar;
        this.f6073a.a("Push_Properties", dVar);
    }

    public final synchronized void k(Gb.e eVar) {
        this.f6074b = eVar;
        this.f6073a.a("Registration_Properties", eVar);
    }

    public final synchronized void l(Kb.a aVar) {
        if (aVar.a() == null) {
            f6072t.f("Username must not be null", new Object[0]);
            throw new IllegalArgumentException("Username must be set");
        }
        if (aVar.b() == null) {
            f6072t.f("Password must not be null", new Object[0]);
            throw new IllegalArgumentException("Password must be set");
        }
        this.f6073a.a("Authentication_Properties", aVar);
    }

    public final synchronized void n(String str) {
        this.f6073a.f("Api_Key", str);
    }

    public final synchronized void o(List<Long> list) {
        try {
            this.f6073a.f("Time_Zone_Change_Times", new C18150d().h(list.toArray()));
        } catch (JsonWriteException unused) {
        }
    }

    public final synchronized void p(boolean z10) {
        this.f6073a.e("Instance_Status_Job_Run", Boolean.valueOf(z10));
    }

    public final synchronized String q() {
        return this.f6073a.h("Changed_Api_Key", null);
    }

    public final synchronized void r(Gb.a aVar) {
        this.f6073a.a("Advertising_Info_On_Server", aVar);
    }

    public final synchronized void s(String str) {
        this.f6073a.f("Changed_Api_Key", str);
    }

    public final synchronized boolean t(boolean z10) {
        this.f6076d = null;
        return this.f6073a.e("Places_Enabled", Boolean.valueOf(z10));
    }

    public final synchronized void u(String str) {
        this.f6073a.f("User_Time_Zone", str);
    }

    public final synchronized boolean v() {
        Gb.e eVarX = x();
        if (eVarX == null) {
            return false;
        }
        return eVarX.k();
    }

    public final synchronized boolean w(boolean z10) {
        this.f6077e = null;
        return this.f6073a.e("Established_Locations_Enabled", Boolean.valueOf(z10));
    }

    public final synchronized Gb.e x() {
        try {
            if (this.f6074b == null) {
                Gb.e eVar = (Gb.e) this.f6073a.b("Registration_Properties", Gb.e.class);
                this.f6074b = eVar;
                if (eVar == null) {
                    Gb.e eVar2 = new Gb.e();
                    this.f6074b = eVar2;
                    eVar2.p(e.a.None);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f6074b;
    }

    public final synchronized boolean y(boolean z10) {
        this.f6078f = null;
        return this.f6073a.e("Communicate_Enabled", Boolean.valueOf(z10));
    }

    public final synchronized void z() {
        this.f6073a.a("Instance_Status", null);
    }

    public final boolean d() {
        return this.f6073a.g("Status_Logs", Boolean.FALSE).booleanValue();
    }

    public final boolean e() {
        return this.f6073a.g("Place_Logs", Boolean.FALSE).booleanValue();
    }

    public final void h(k kVar, String... strArr) {
        this.f6073a.j(kVar, strArr);
    }

    public e(l lVar) {
        this.f6073a = lVar;
        lVar.d("Client_State_Info");
    }

    private void m(Kb.a aVar, Gb.e eVar) {
        aVar.c(eVar.i());
        aVar.d(eVar.j());
        this.f6073a.a("Authentication_Properties", aVar);
    }
}
