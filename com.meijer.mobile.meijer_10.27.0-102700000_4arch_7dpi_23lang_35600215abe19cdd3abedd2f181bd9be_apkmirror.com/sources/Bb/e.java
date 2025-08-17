package Bb;

import Eb.e;
import cb.C6380a;
import cb.C6381b;
import cb.C6382c;
import cb.C6383d;
import com.gimbal.internal.json.JsonWriteException;
import java.util.ArrayList;
import java.util.List;
import vb.C17538d;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: s, reason: collision with root package name */
    private static C6380a f2126s = C6381b.a(e.class.getName());

    /* renamed from: t, reason: collision with root package name */
    private static C6382c f2127t = C6383d.a(e.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public l f2128a;

    /* renamed from: b, reason: collision with root package name */
    private Eb.e f2129b;

    /* renamed from: c, reason: collision with root package name */
    private Eb.d f2130c;

    /* renamed from: d, reason: collision with root package name */
    private Boolean f2131d;

    /* renamed from: e, reason: collision with root package name */
    private Boolean f2132e;

    /* renamed from: f, reason: collision with root package name */
    private Boolean f2133f;

    /* renamed from: g, reason: collision with root package name */
    private Boolean f2134g;

    /* renamed from: h, reason: collision with root package name */
    private Boolean f2135h;

    /* renamed from: i, reason: collision with root package name */
    private String f2136i;

    /* renamed from: j, reason: collision with root package name */
    private String f2137j;

    /* renamed from: k, reason: collision with root package name */
    private String f2138k;

    /* renamed from: l, reason: collision with root package name */
    private String f2139l;

    /* renamed from: m, reason: collision with root package name */
    private String f2140m;

    /* renamed from: n, reason: collision with root package name */
    private String f2141n;

    /* renamed from: o, reason: collision with root package name */
    private String f2142o;

    /* renamed from: p, reason: collision with root package name */
    private String f2143p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f2144q = false;

    /* renamed from: r, reason: collision with root package name */
    private String f2145r;

    public final synchronized void A() {
        if (D() == null) {
            Eb.c cVar = new Eb.c();
            cVar.c(System.currentTimeMillis());
            cVar.d(System.currentTimeMillis());
            this.f2128a.a("Instance_Status", cVar);
        }
    }

    public final synchronized void B(boolean z10) {
        this.f2128a.f("Place_State_Aggregate_Permission", Boolean.valueOf(z10));
        this.f2135h = Boolean.valueOf(z10);
    }

    public final synchronized Boolean C() {
        return this.f2128a.h("Instance_Status_Job_Run", Boolean.FALSE);
    }

    public final synchronized Eb.c D() {
        return (Eb.c) this.f2128a.b("Instance_Status", Eb.c.class);
    }

    public final synchronized Eb.a E() {
        return (Eb.a) this.f2128a.b("Advertising_Info", Eb.a.class);
    }

    public final synchronized Eb.a F() {
        return (Eb.a) this.f2128a.b("Advertising_Info_On_Server", Eb.a.class);
    }

    public final synchronized Ib.a G() {
        Ib.a aVar;
        try {
            aVar = (Ib.a) this.f2128a.b("Authentication_Properties", Ib.a.class);
            if (aVar == null) {
                aVar = new Ib.a();
                Eb.e eVarX = x();
                if (eVarX.k()) {
                    m(aVar, eVarX);
                }
            }
            if (!this.f2144q) {
                this.f2144q = true;
                Eb.e eVarX2 = x();
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
            if (this.f2131d == null) {
                this.f2131d = this.f2128a.h("Places_Enabled", Boolean.FALSE);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f2131d.booleanValue();
    }

    public final synchronized boolean I() {
        try {
            if (this.f2132e == null) {
                this.f2132e = this.f2128a.h("Established_Locations_Enabled", Boolean.FALSE);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f2132e.booleanValue();
    }

    public final synchronized boolean J() {
        try {
            if (this.f2133f == null) {
                this.f2133f = this.f2128a.h("Communicate_Enabled", Boolean.FALSE);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f2133f.booleanValue();
    }

    public final synchronized boolean K() {
        try {
            if (this.f2134g == null) {
                this.f2134g = this.f2128a.h("Beacon_Manager_Enabled", Boolean.FALSE);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f2134g.booleanValue();
    }

    public final synchronized Eb.d L() {
        try {
            if (this.f2130c == null) {
                Eb.d dVar = (Eb.d) this.f2128a.b("Push_Properties", Eb.d.class);
                this.f2130c = dVar;
                if (dVar == null) {
                    this.f2130c = new Eb.d();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f2130c;
    }

    public final synchronized boolean M() {
        return L().c() != null;
    }

    public final synchronized List<Long> N() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        String strI = this.f2128a.i("Time_Zone_Change_Times", null);
        if (strI != null) {
            try {
                for (Long l10 : (Long[]) new C17538d().c(Long[].class, strI)) {
                    arrayList.add(l10);
                }
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    public final synchronized String O() {
        return this.f2128a.i("User_Time_Zone", null);
    }

    public final synchronized String P() {
        try {
            if (this.f2145r == null) {
                this.f2145r = this.f2128a.i("Analytics_Base_Url", "https://analytics-server.gimbal.com/service/");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f2145r;
    }

    public final synchronized String Q() {
        try {
            if (this.f2139l == null) {
                this.f2139l = this.f2128a.i("Sighting_Base_Url", "https://sightings.gimbal.com/");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f2139l;
    }

    public final synchronized String R() {
        try {
            if (this.f2140m == null) {
                this.f2140m = this.f2128a.i("Registration_Base_Url", "https://registration.gimbal.com/service/");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f2140m;
    }

    public final synchronized String S() {
        try {
            if (this.f2141n == null) {
                this.f2141n = this.f2128a.i("Communicate_Search_Base_Url", "https://communicate.gimbal.com/service/");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f2141n;
    }

    public final synchronized String T() {
        try {
            if (this.f2142o == null) {
                this.f2142o = this.f2128a.i("Sdk_Configuration_Base_Url", "https://sdk-configuration.gimbal.com/service/");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f2142o;
    }

    public final synchronized String U() {
        try {
            if (this.f2143p == null) {
                this.f2143p = this.f2128a.i("Sdk_Info_Base_Url", "https://sdk-info.gimbal.com/service/");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f2143p;
    }

    public final synchronized String V() {
        try {
            if (this.f2136i == null) {
                this.f2136i = this.f2128a.i("Beacon_Resolve_Base_Url", "https://resolve.gimbal.com/");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f2136i;
    }

    public final synchronized String a() {
        try {
            if (this.f2137j == null) {
                this.f2137j = this.f2128a.i("Place_Bubble_Base_Url", "https://placebubble.gimbal.com/service/");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f2137j;
    }

    public final synchronized String b() {
        try {
            if (this.f2138k == null) {
                this.f2138k = this.f2128a.i("Encrypted_Server_Base_Url", "https://eds.gimbal.com");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f2138k;
    }

    public final synchronized boolean c() {
        try {
            if (this.f2135h == null) {
                this.f2135h = this.f2128a.h("Place_State_Aggregate_Permission", Boolean.TRUE);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f2135h.booleanValue();
    }

    public final synchronized boolean f() {
        return this.f2128a.h("Sightings_Logs", Boolean.FALSE).booleanValue();
    }

    public final synchronized String g() {
        return this.f2128a.i("Api_Key", null);
    }

    public final synchronized void i(Eb.a aVar) {
        this.f2128a.a("Advertising_Info", aVar);
    }

    public final synchronized void j(Eb.d dVar) {
        this.f2130c = dVar;
        this.f2128a.a("Push_Properties", dVar);
    }

    public final synchronized void k(Eb.e eVar) {
        this.f2129b = eVar;
        this.f2128a.a("Registration_Properties", eVar);
    }

    public final synchronized void l(Ib.a aVar) {
        if (aVar.a() == null) {
            f2127t.f("Username must not be null", new Object[0]);
            throw new IllegalArgumentException("Username must be set");
        }
        if (aVar.b() == null) {
            f2127t.f("Password must not be null", new Object[0]);
            throw new IllegalArgumentException("Password must be set");
        }
        this.f2128a.a("Authentication_Properties", aVar);
    }

    public final synchronized void n(String str) {
        this.f2128a.g("Api_Key", str);
    }

    public final synchronized void o(List<Long> list) {
        try {
            this.f2128a.g("Time_Zone_Change_Times", new C17538d().h(list.toArray()));
        } catch (JsonWriteException unused) {
        }
    }

    public final synchronized void p(boolean z10) {
        this.f2128a.f("Instance_Status_Job_Run", Boolean.valueOf(z10));
    }

    public final synchronized String q() {
        return this.f2128a.i("Changed_Api_Key", null);
    }

    public final synchronized void r(Eb.a aVar) {
        this.f2128a.a("Advertising_Info_On_Server", aVar);
    }

    public final synchronized void s(String str) {
        this.f2128a.g("Changed_Api_Key", str);
    }

    public final synchronized boolean t(boolean z10) {
        this.f2131d = null;
        return this.f2128a.f("Places_Enabled", Boolean.valueOf(z10));
    }

    public final synchronized void u(String str) {
        this.f2128a.g("User_Time_Zone", str);
    }

    public final synchronized boolean v() {
        Eb.e eVarX = x();
        if (eVarX == null) {
            return false;
        }
        return eVarX.k();
    }

    public final synchronized boolean w(boolean z10) {
        this.f2132e = null;
        return this.f2128a.f("Established_Locations_Enabled", Boolean.valueOf(z10));
    }

    public final synchronized Eb.e x() {
        try {
            if (this.f2129b == null) {
                Eb.e eVar = (Eb.e) this.f2128a.b("Registration_Properties", Eb.e.class);
                this.f2129b = eVar;
                if (eVar == null) {
                    Eb.e eVar2 = new Eb.e();
                    this.f2129b = eVar2;
                    eVar2.p(e.a.None);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f2129b;
    }

    public final synchronized boolean y(boolean z10) {
        this.f2133f = null;
        return this.f2128a.f("Communicate_Enabled", Boolean.valueOf(z10));
    }

    public final synchronized void z() {
        this.f2128a.a("Instance_Status", null);
    }

    public final boolean d() {
        return this.f2128a.h("Status_Logs", Boolean.FALSE).booleanValue();
    }

    public final boolean e() {
        return this.f2128a.h("Place_Logs", Boolean.FALSE).booleanValue();
    }

    public final void h(k kVar, String... strArr) {
        this.f2128a.e(kVar, strArr);
    }

    public e(l lVar) {
        this.f2128a = lVar;
        lVar.d("Client_State_Info");
    }

    private void m(Ib.a aVar, Eb.e eVar) {
        aVar.c(eVar.i());
        aVar.d(eVar.j());
        this.f2128a.a("Authentication_Properties", aVar);
    }
}
