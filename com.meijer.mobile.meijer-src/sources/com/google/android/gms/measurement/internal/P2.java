package com.google.android.gms.measurement.internal;

import Z.C5603a;
import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.collection.LruCache;
import com.google.android.gms.internal.measurement.A7;
import com.google.android.gms.internal.measurement.C10482a2;
import com.google.android.gms.internal.measurement.C10500c2;
import com.google.android.gms.internal.measurement.C10509d2;
import com.google.android.gms.internal.measurement.C10516e0;
import com.google.android.gms.internal.measurement.C10527f2;
import com.google.android.gms.internal.measurement.C10536g2;
import com.google.android.gms.internal.measurement.C10608o2;
import com.google.android.gms.internal.measurement.C10671v3;
import com.google.android.gms.internal.measurement.C10691x5;
import com.google.android.gms.internal.measurement.C10698y3;
import com.google.android.gms.internal.measurement.V7;
import com.google.android.gms.internal.measurement.W7;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.internal.measurement.zzmr;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.Callable;

/* loaded from: classes6.dex */
public final class P2 extends AbstractC11233b6 implements InterfaceC11305l {

    /* renamed from: d, reason: collision with root package name */
    private final Map f85994d;

    /* renamed from: e, reason: collision with root package name */
    final Map f85995e;

    /* renamed from: f, reason: collision with root package name */
    final Map f85996f;

    /* renamed from: g, reason: collision with root package name */
    final Map f85997g;

    /* renamed from: h, reason: collision with root package name */
    private final Map f85998h;

    /* renamed from: i, reason: collision with root package name */
    private final Map f85999i;

    /* renamed from: j, reason: collision with root package name */
    final LruCache f86000j;

    /* renamed from: k, reason: collision with root package name */
    final A7 f86001k;

    /* renamed from: l, reason: collision with root package name */
    private final Map f86002l;

    /* renamed from: m, reason: collision with root package name */
    private final Map f86003m;

    /* renamed from: n, reason: collision with root package name */
    private final Map f86004n;

    @Override // com.google.android.gms.measurement.internal.AbstractC11233b6
    protected final boolean j() {
        return false;
    }

    final /* synthetic */ Map n() {
        return this.f85994d;
    }

    private final void p(String str, C10527f2 c10527f2) {
        HashSet hashSet = new HashSet();
        C5603a c5603a = new C5603a();
        C5603a c5603a2 = new C5603a();
        C5603a c5603a3 = new C5603a();
        Iterator it = c10527f2.z().iterator();
        while (it.hasNext()) {
            hashSet.add(((C10500c2) it.next()).E());
        }
        for (int i10 = 0; i10 < c10527f2.t(); i10++) {
            C10509d2 c10509d2 = (C10509d2) c10527f2.u(i10).q();
            if (c10509d2.t().isEmpty()) {
                this.f85708a.a().p().a("EventConfig contained null event name");
            } else {
                String strT = c10509d2.t();
                String strB = Qd.w.b(c10509d2.t());
                if (!TextUtils.isEmpty(strB)) {
                    c10509d2.u(strB);
                    c10527f2.v(i10, c10509d2);
                }
                if (c10509d2.v() && c10509d2.w()) {
                    c5603a.put(strT, Boolean.TRUE);
                }
                if (c10509d2.x() && c10509d2.y()) {
                    c5603a2.put(c10509d2.t(), Boolean.TRUE);
                }
                if (c10509d2.z()) {
                    if (c10509d2.A() < 2 || c10509d2.A() > 65535) {
                        this.f85708a.a().p().c("Invalid sampling rate. Event name, sample rate", c10509d2.t(), Integer.valueOf(c10509d2.A()));
                    } else {
                        c5603a3.put(c10509d2.t(), Integer.valueOf(c10509d2.A()));
                    }
                }
            }
        }
        this.f85995e.put(str, hashSet);
        this.f85996f.put(str, c5603a);
        this.f85997g.put(str, c5603a2);
        this.f85999i.put(str, c5603a3);
    }

    private final C10536g2 r(String str, byte[] bArr) {
        if (bArr == null) {
            return C10536g2.V();
        }
        try {
            C10536g2 c10536g2 = (C10536g2) ((C10527f2) u6.U(C10536g2.U(), bArr)).q();
            this.f85708a.a().u().c("Parsed config. version, gmp_app_id", c10536g2.E() ? Long.valueOf(c10536g2.F()) : null, c10536g2.G() ? c10536g2.H() : null);
            return c10536g2;
        } catch (zzmr e10) {
            this.f85708a.a().p().c("Unable to merge remote config. appId", C11343q2.v(str), e10);
            return C10536g2.V();
        } catch (RuntimeException e11) {
            this.f85708a.a().p().c("Unable to merge remote config. appId", C11343q2.v(str), e11);
            return C10536g2.V();
        }
    }

    private static final Map s(C10536g2 c10536g2) {
        C5603a c5603a = new C5603a();
        if (c10536g2 != null) {
            for (C10608o2 c10608o2 : c10536g2.I()) {
                c5603a.put(c10608o2.E(), c10608o2.F());
            }
        }
        return c5603a;
    }

    private static final Qd.v t(int i10) {
        int i11 = i10 - 1;
        if (i11 == 1) {
            return Qd.v.AD_STORAGE;
        }
        if (i11 == 2) {
            return Qd.v.ANALYTICS_STORAGE;
        }
        if (i11 == 3) {
            return Qd.v.AD_USER_DATA;
        }
        if (i11 != 4) {
            return null;
        }
        return Qd.v.AD_PERSONALIZATION;
    }

    final boolean F(String str) {
        return "1".equals(d(str, "measurement.upload.blacklist_internal"));
    }

    final boolean G(String str) {
        return "1".equals(d(str, "measurement.upload.blacklist_public"));
    }

    P2(q6 q6Var) {
        super(q6Var);
        this.f85994d = new C5603a();
        this.f85995e = new C5603a();
        this.f85996f = new C5603a();
        this.f85997g = new C5603a();
        this.f85998h = new C5603a();
        this.f86002l = new C5603a();
        this.f86003m = new C5603a();
        this.f86004n = new C5603a();
        this.f85999i = new C5603a();
        this.f86000j = new I2(this, 20);
        this.f86001k = new J2(this);
    }

    private final void o(String str) throws Throwable {
        h();
        f();
        com.google.android.gms.common.internal.r.f(str);
        Map map = this.f85998h;
        if (map.get(str) == null) {
            C11333p c11333pL0 = this.f86107b.D0().L0(str);
            if (c11333pL0 == null) {
                this.f85994d.put(str, null);
                this.f85996f.put(str, null);
                this.f85995e.put(str, null);
                this.f85997g.put(str, null);
                map.put(str, null);
                this.f86002l.put(str, null);
                this.f86003m.put(str, null);
                this.f86004n.put(str, null);
                this.f85999i.put(str, null);
                return;
            }
            C10527f2 c10527f2 = (C10527f2) r(str, c11333pL0.f86582a).q();
            p(str, c10527f2);
            this.f85994d.put(str, s((C10536g2) c10527f2.q()));
            map.put(str, (C10536g2) c10527f2.q());
            q(str, (C10536g2) c10527f2.q());
            this.f86002l.put(str, c10527f2.A());
            this.f86003m.put(str, c11333pL0.f86583b);
            this.f86004n.put(str, c11333pL0.f86584c);
        }
    }

    private final void q(final String str, C10536g2 c10536g2) {
        if (c10536g2.N() != 0) {
            X2 x22 = this.f85708a;
            x22.a().u().b("EES programs found", Integer.valueOf(c10536g2.N()));
            C10698y3 c10698y3 = (C10698y3) c10536g2.M().get(0);
            try {
                C10516e0 c10516e0 = new C10516e0();
                c10516e0.a("internal.remoteConfig", new Callable() { // from class: com.google.android.gms.measurement.internal.O2
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        return new C10691x5("internal.remoteConfig", new K2(this.f85982a, str));
                    }
                });
                c10516e0.a("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.L2
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        final P2 p22 = this.f85938a;
                        final String str2 = str;
                        return new W7("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.N2
                            @Override // java.util.concurrent.Callable
                            public final /* synthetic */ Object call() {
                                P2 p23 = p22;
                                C11367u c11367uD0 = p23.f86107b.D0();
                                String str3 = str2;
                                C11384w2 c11384w2H0 = c11367uD0.H0(str3);
                                HashMap map = new HashMap();
                                map.put("platform", "android");
                                map.put("package_name", str3);
                                p23.f85708a.u().y();
                                map.put("gmp_version", 133005L);
                                if (c11384w2H0 != null) {
                                    String strD0 = c11384w2H0.D0();
                                    if (strD0 != null) {
                                        map.put("app_version", strD0);
                                    }
                                    map.put("app_version_int", Long.valueOf(c11384w2H0.F0()));
                                    map.put("dynamite_version", Long.valueOf(c11384w2H0.b()));
                                }
                                return map;
                            }
                        });
                    }
                });
                c10516e0.a("internal.logger", new Callable() { // from class: com.google.android.gms.measurement.internal.M2
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        return new V7(this.f85949a.f86001k);
                    }
                });
                c10516e0.f(c10698y3);
                this.f86000j.f(str, c10516e0);
                x22.a().u().c("EES program loaded for appId, activities", str, Integer.valueOf(c10698y3.F().F()));
                Iterator it = c10698y3.F().E().iterator();
                while (it.hasNext()) {
                    x22.a().u().b("EES program activity", ((C10671v3) it.next()).E());
                }
                return;
            } catch (zzd unused) {
                this.f85708a.a().m().b("Failed to load EES program. appId", str);
                return;
            }
        }
        this.f86000j.g(str);
    }

    protected final boolean A(String str, byte[] bArr, String str2, String str3) throws Throwable {
        h();
        f();
        com.google.android.gms.common.internal.r.f(str);
        C10527f2 c10527f2 = (C10527f2) r(str, bArr).q();
        p(str, c10527f2);
        q(str, (C10536g2) c10527f2.q());
        this.f85998h.put(str, (C10536g2) c10527f2.q());
        this.f86002l.put(str, c10527f2.A());
        this.f86003m.put(str, str2);
        this.f86004n.put(str, str3);
        this.f85994d.put(str, s((C10536g2) c10527f2.q()));
        this.f86107b.D0().W(str, new ArrayList(c10527f2.w()));
        try {
            c10527f2.x();
            bArr = ((C10536g2) c10527f2.q()).g();
        } catch (RuntimeException e10) {
            this.f85708a.a().p().c("Unable to serialize reduced-size config. Storing full config instead. appId", C11343q2.v(str), e10);
        }
        C11367u c11367uD0 = this.f86107b.D0();
        com.google.android.gms.common.internal.r.f(str);
        c11367uD0.f();
        c11367uD0.h();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (c11367uD0.s0().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                c11367uD0.f85708a.a().m().b("Failed to update remote config (got 0). appId", C11343q2.v(str));
            }
        } catch (SQLiteException e11) {
            c11367uD0.f85708a.a().m().c("Error storing remote config. appId", C11343q2.v(str), e11);
        }
        c10527f2.y();
        this.f85998h.put(str, (C10536g2) c10527f2.q());
        return true;
    }

    final boolean B(String str, String str2) throws Throwable {
        Boolean bool;
        f();
        o(str);
        if (F(str) && z6.L(str2)) {
            return true;
        }
        if (G(str) && z6.p0(str2)) {
            return true;
        }
        Map map = (Map) this.f85996f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    final boolean C(String str, String str2) throws Throwable {
        Boolean bool;
        f();
        o(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f85997g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    final Set D(String str) {
        f();
        o(str);
        return (Set) this.f85995e.get(str);
    }

    final int E(String str, String str2) throws Throwable {
        Integer num;
        f();
        o(str);
        Map map = (Map) this.f85999i.get(str);
        if (map != null && (num = (Integer) map.get(str2)) != null) {
            return num.intValue();
        }
        return 1;
    }

    final boolean H(String str) throws Throwable {
        f();
        o(str);
        Map map = this.f85995e;
        if (map.get(str) == null) {
            return false;
        }
        if (!((Set) map.get(str)).contains("device_model") && !((Set) map.get(str)).contains("device_info")) {
            return false;
        }
        return true;
    }

    final boolean I(String str) throws Throwable {
        f();
        o(str);
        Map map = this.f85995e;
        if (map.get(str) == null) {
            return false;
        }
        if (!((Set) map.get(str)).contains("os_version") && !((Set) map.get(str)).contains("device_info")) {
            return false;
        }
        return true;
    }

    final boolean J(String str) throws Throwable {
        f();
        o(str);
        Map map = this.f85995e;
        if (map.get(str) != null && ((Set) map.get(str)).contains("user_id")) {
            return true;
        }
        return false;
    }

    final boolean K(String str) throws Throwable {
        f();
        o(str);
        Map map = this.f85995e;
        if (map.get(str) != null && ((Set) map.get(str)).contains("google_signals")) {
            return true;
        }
        return false;
    }

    final boolean L(String str) throws Throwable {
        f();
        o(str);
        Map map = this.f85995e;
        if (map.get(str) != null && ((Set) map.get(str)).contains("app_instance_id")) {
            return true;
        }
        return false;
    }

    final boolean M(String str) throws Throwable {
        f();
        o(str);
        Map map = this.f85995e;
        if (map.get(str) != null && ((Set) map.get(str)).contains("enhanced_user_id")) {
            return true;
        }
        return false;
    }

    final boolean N(String str, Qd.v vVar) throws Throwable {
        f();
        o(str);
        C10482a2 c10482a2P = P(str);
        if (c10482a2P == null) {
            return false;
        }
        Iterator it = c10482a2P.E().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.google.android.gms.internal.measurement.O1 o12 = (com.google.android.gms.internal.measurement.O1) it.next();
            if (vVar == t(o12.F())) {
                if (o12.G() == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    final Qd.v O(String str, Qd.v vVar) {
        f();
        o(str);
        C10482a2 c10482a2P = P(str);
        if (c10482a2P != null) {
            for (com.google.android.gms.internal.measurement.Q1 q12 : c10482a2P.F()) {
                if (vVar == t(q12.F())) {
                    return t(q12.G());
                }
            }
            return null;
        }
        return null;
    }

    final C10482a2 P(String str) {
        f();
        o(str);
        C10536g2 c10536g2U = u(str);
        if (c10536g2U != null && c10536g2U.Q()) {
            return c10536g2U.R();
        }
        return null;
    }

    final boolean Q(String str) {
        f();
        o(str);
        C10482a2 c10482a2P = P(str);
        if (c10482a2P == null || !c10482a2P.H() || c10482a2P.I()) {
            return true;
        }
        return false;
    }

    final SortedSet R(String str) {
        f();
        o(str);
        TreeSet treeSet = new TreeSet();
        C10482a2 c10482a2P = P(str);
        if (c10482a2P != null) {
            Iterator it = c10482a2P.G().iterator();
            while (it.hasNext()) {
                treeSet.add(((com.google.android.gms.internal.measurement.X1) it.next()).E());
            }
        }
        return treeSet;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC11305l
    public final String d(String str, String str2) throws Throwable {
        f();
        o(str);
        Map map = (Map) this.f85994d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    final Qd.u k(String str, Qd.v vVar) {
        f();
        o(str);
        C10482a2 c10482a2P = P(str);
        if (c10482a2P == null) {
            return Qd.u.UNINITIALIZED;
        }
        for (com.google.android.gms.internal.measurement.O1 o12 : c10482a2P.J()) {
            if (t(o12.F()) == vVar) {
                int iG = o12.G() - 1;
                if (iG != 1) {
                    if (iG != 2) {
                        return Qd.u.UNINITIALIZED;
                    }
                    return Qd.u.DENIED;
                }
                return Qd.u.GRANTED;
            }
        }
        return Qd.u.UNINITIALIZED;
    }

    final boolean l(String str) throws Throwable {
        f();
        o(str);
        C10482a2 c10482a2P = P(str);
        if (c10482a2P == null) {
            return false;
        }
        for (com.google.android.gms.internal.measurement.O1 o12 : c10482a2P.E()) {
            if (o12.F() == 3 && o12.H() == 3) {
                return true;
            }
        }
        return false;
    }

    final /* synthetic */ C10516e0 m(String str) throws Throwable {
        h();
        com.google.android.gms.common.internal.r.f(str);
        C11333p c11333pL0 = this.f86107b.D0().L0(str);
        if (c11333pL0 == null) {
            return null;
        }
        this.f85708a.a().u().b("Populate EES config from database on cache miss. appId", str);
        q(str, r(str, c11333pL0.f86582a));
        return (C10516e0) this.f86000j.snapshot().get(str);
    }

    protected final C10536g2 u(String str) {
        h();
        f();
        com.google.android.gms.common.internal.r.f(str);
        o(str);
        return (C10536g2) this.f85998h.get(str);
    }

    final String v(String str) {
        f();
        o(str);
        return (String) this.f86002l.get(str);
    }

    protected final String w(String str) {
        f();
        return (String) this.f86003m.get(str);
    }

    protected final String x(String str) {
        f();
        return (String) this.f86004n.get(str);
    }

    protected final void y(String str) {
        f();
        this.f86003m.put(str, null);
    }

    final void z(String str) {
        f();
        this.f85998h.remove(str);
    }
}
