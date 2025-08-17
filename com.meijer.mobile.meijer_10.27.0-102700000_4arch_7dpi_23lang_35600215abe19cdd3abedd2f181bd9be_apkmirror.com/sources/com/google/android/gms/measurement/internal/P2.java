package com.google.android.gms.measurement.internal;

import Z.C5503a;
import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.collection.LruCache;
import com.google.android.gms.internal.measurement.A7;
import com.google.android.gms.internal.measurement.C10357a2;
import com.google.android.gms.internal.measurement.C10375c2;
import com.google.android.gms.internal.measurement.C10384d2;
import com.google.android.gms.internal.measurement.C10391e0;
import com.google.android.gms.internal.measurement.C10402f2;
import com.google.android.gms.internal.measurement.C10411g2;
import com.google.android.gms.internal.measurement.C10483o2;
import com.google.android.gms.internal.measurement.C10546v3;
import com.google.android.gms.internal.measurement.C10566x5;
import com.google.android.gms.internal.measurement.C10573y3;
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
public final class P2 extends AbstractC11108b6 implements InterfaceC11180l {

    /* renamed from: d, reason: collision with root package name */
    private final Map f85154d;

    /* renamed from: e, reason: collision with root package name */
    final Map f85155e;

    /* renamed from: f, reason: collision with root package name */
    final Map f85156f;

    /* renamed from: g, reason: collision with root package name */
    final Map f85157g;

    /* renamed from: h, reason: collision with root package name */
    private final Map f85158h;

    /* renamed from: i, reason: collision with root package name */
    private final Map f85159i;

    /* renamed from: j, reason: collision with root package name */
    final LruCache f85160j;

    /* renamed from: k, reason: collision with root package name */
    final A7 f85161k;

    /* renamed from: l, reason: collision with root package name */
    private final Map f85162l;

    /* renamed from: m, reason: collision with root package name */
    private final Map f85163m;

    /* renamed from: n, reason: collision with root package name */
    private final Map f85164n;

    @Override // com.google.android.gms.measurement.internal.AbstractC11108b6
    protected final boolean j() {
        return false;
    }

    final /* synthetic */ Map n() {
        return this.f85154d;
    }

    private final void p(String str, C10402f2 c10402f2) {
        HashSet hashSet = new HashSet();
        C5503a c5503a = new C5503a();
        C5503a c5503a2 = new C5503a();
        C5503a c5503a3 = new C5503a();
        Iterator it = c10402f2.z().iterator();
        while (it.hasNext()) {
            hashSet.add(((C10375c2) it.next()).E());
        }
        for (int i10 = 0; i10 < c10402f2.t(); i10++) {
            C10384d2 c10384d2 = (C10384d2) c10402f2.u(i10).q();
            if (c10384d2.t().isEmpty()) {
                this.f84868a.a().p().a("EventConfig contained null event name");
            } else {
                String strT = c10384d2.t();
                String strB = Od.w.b(c10384d2.t());
                if (!TextUtils.isEmpty(strB)) {
                    c10384d2.u(strB);
                    c10402f2.v(i10, c10384d2);
                }
                if (c10384d2.v() && c10384d2.w()) {
                    c5503a.put(strT, Boolean.TRUE);
                }
                if (c10384d2.x() && c10384d2.y()) {
                    c5503a2.put(c10384d2.t(), Boolean.TRUE);
                }
                if (c10384d2.z()) {
                    if (c10384d2.A() < 2 || c10384d2.A() > 65535) {
                        this.f84868a.a().p().c("Invalid sampling rate. Event name, sample rate", c10384d2.t(), Integer.valueOf(c10384d2.A()));
                    } else {
                        c5503a3.put(c10384d2.t(), Integer.valueOf(c10384d2.A()));
                    }
                }
            }
        }
        this.f85155e.put(str, hashSet);
        this.f85156f.put(str, c5503a);
        this.f85157g.put(str, c5503a2);
        this.f85159i.put(str, c5503a3);
    }

    private final C10411g2 r(String str, byte[] bArr) {
        if (bArr == null) {
            return C10411g2.V();
        }
        try {
            C10411g2 c10411g2 = (C10411g2) ((C10402f2) u6.U(C10411g2.U(), bArr)).q();
            this.f84868a.a().u().c("Parsed config. version, gmp_app_id", c10411g2.E() ? Long.valueOf(c10411g2.F()) : null, c10411g2.G() ? c10411g2.H() : null);
            return c10411g2;
        } catch (zzmr e10) {
            this.f84868a.a().p().c("Unable to merge remote config. appId", C11218q2.v(str), e10);
            return C10411g2.V();
        } catch (RuntimeException e11) {
            this.f84868a.a().p().c("Unable to merge remote config. appId", C11218q2.v(str), e11);
            return C10411g2.V();
        }
    }

    private static final Map s(C10411g2 c10411g2) {
        C5503a c5503a = new C5503a();
        if (c10411g2 != null) {
            for (C10483o2 c10483o2 : c10411g2.I()) {
                c5503a.put(c10483o2.E(), c10483o2.F());
            }
        }
        return c5503a;
    }

    private static final Od.v t(int i10) {
        int i11 = i10 - 1;
        if (i11 == 1) {
            return Od.v.AD_STORAGE;
        }
        if (i11 == 2) {
            return Od.v.ANALYTICS_STORAGE;
        }
        if (i11 == 3) {
            return Od.v.AD_USER_DATA;
        }
        if (i11 != 4) {
            return null;
        }
        return Od.v.AD_PERSONALIZATION;
    }

    final boolean F(String str) {
        return "1".equals(d(str, "measurement.upload.blacklist_internal"));
    }

    final boolean G(String str) {
        return "1".equals(d(str, "measurement.upload.blacklist_public"));
    }

    P2(q6 q6Var) {
        super(q6Var);
        this.f85154d = new C5503a();
        this.f85155e = new C5503a();
        this.f85156f = new C5503a();
        this.f85157g = new C5503a();
        this.f85158h = new C5503a();
        this.f85162l = new C5503a();
        this.f85163m = new C5503a();
        this.f85164n = new C5503a();
        this.f85159i = new C5503a();
        this.f85160j = new I2(this, 20);
        this.f85161k = new J2(this);
    }

    private final void o(String str) throws Throwable {
        h();
        f();
        com.google.android.gms.common.internal.r.f(str);
        Map map = this.f85158h;
        if (map.get(str) == null) {
            C11208p c11208pL0 = this.f85267b.D0().L0(str);
            if (c11208pL0 == null) {
                this.f85154d.put(str, null);
                this.f85156f.put(str, null);
                this.f85155e.put(str, null);
                this.f85157g.put(str, null);
                map.put(str, null);
                this.f85162l.put(str, null);
                this.f85163m.put(str, null);
                this.f85164n.put(str, null);
                this.f85159i.put(str, null);
                return;
            }
            C10402f2 c10402f2 = (C10402f2) r(str, c11208pL0.f85742a).q();
            p(str, c10402f2);
            this.f85154d.put(str, s((C10411g2) c10402f2.q()));
            map.put(str, (C10411g2) c10402f2.q());
            q(str, (C10411g2) c10402f2.q());
            this.f85162l.put(str, c10402f2.A());
            this.f85163m.put(str, c11208pL0.f85743b);
            this.f85164n.put(str, c11208pL0.f85744c);
        }
    }

    private final void q(final String str, C10411g2 c10411g2) {
        if (c10411g2.N() != 0) {
            X2 x22 = this.f84868a;
            x22.a().u().b("EES programs found", Integer.valueOf(c10411g2.N()));
            C10573y3 c10573y3 = (C10573y3) c10411g2.M().get(0);
            try {
                C10391e0 c10391e0 = new C10391e0();
                c10391e0.a("internal.remoteConfig", new Callable() { // from class: com.google.android.gms.measurement.internal.O2
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        return new C10566x5("internal.remoteConfig", new K2(this.f85142a, str));
                    }
                });
                c10391e0.a("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.L2
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        final P2 p22 = this.f85098a;
                        final String str2 = str;
                        return new W7("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.N2
                            @Override // java.util.concurrent.Callable
                            public final /* synthetic */ Object call() {
                                P2 p23 = p22;
                                C11242u c11242uD0 = p23.f85267b.D0();
                                String str3 = str2;
                                C11259w2 c11259w2H0 = c11242uD0.H0(str3);
                                HashMap map = new HashMap();
                                map.put("platform", "android");
                                map.put("package_name", str3);
                                p23.f84868a.u().y();
                                map.put("gmp_version", 133005L);
                                if (c11259w2H0 != null) {
                                    String strD0 = c11259w2H0.D0();
                                    if (strD0 != null) {
                                        map.put("app_version", strD0);
                                    }
                                    map.put("app_version_int", Long.valueOf(c11259w2H0.F0()));
                                    map.put("dynamite_version", Long.valueOf(c11259w2H0.b()));
                                }
                                return map;
                            }
                        });
                    }
                });
                c10391e0.a("internal.logger", new Callable() { // from class: com.google.android.gms.measurement.internal.M2
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        return new V7(this.f85109a.f85161k);
                    }
                });
                c10391e0.f(c10573y3);
                this.f85160j.f(str, c10391e0);
                x22.a().u().c("EES program loaded for appId, activities", str, Integer.valueOf(c10573y3.F().F()));
                Iterator it = c10573y3.F().E().iterator();
                while (it.hasNext()) {
                    x22.a().u().b("EES program activity", ((C10546v3) it.next()).E());
                }
                return;
            } catch (zzd unused) {
                this.f84868a.a().m().b("Failed to load EES program. appId", str);
                return;
            }
        }
        this.f85160j.g(str);
    }

    protected final boolean A(String str, byte[] bArr, String str2, String str3) throws Throwable {
        h();
        f();
        com.google.android.gms.common.internal.r.f(str);
        C10402f2 c10402f2 = (C10402f2) r(str, bArr).q();
        p(str, c10402f2);
        q(str, (C10411g2) c10402f2.q());
        this.f85158h.put(str, (C10411g2) c10402f2.q());
        this.f85162l.put(str, c10402f2.A());
        this.f85163m.put(str, str2);
        this.f85164n.put(str, str3);
        this.f85154d.put(str, s((C10411g2) c10402f2.q()));
        this.f85267b.D0().W(str, new ArrayList(c10402f2.w()));
        try {
            c10402f2.x();
            bArr = ((C10411g2) c10402f2.q()).g();
        } catch (RuntimeException e10) {
            this.f84868a.a().p().c("Unable to serialize reduced-size config. Storing full config instead. appId", C11218q2.v(str), e10);
        }
        C11242u c11242uD0 = this.f85267b.D0();
        com.google.android.gms.common.internal.r.f(str);
        c11242uD0.f();
        c11242uD0.h();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (c11242uD0.s0().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                c11242uD0.f84868a.a().m().b("Failed to update remote config (got 0). appId", C11218q2.v(str));
            }
        } catch (SQLiteException e11) {
            c11242uD0.f84868a.a().m().c("Error storing remote config. appId", C11218q2.v(str), e11);
        }
        c10402f2.y();
        this.f85158h.put(str, (C10411g2) c10402f2.q());
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
        Map map = (Map) this.f85156f.get(str);
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
        Map map = (Map) this.f85157g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    final Set D(String str) {
        f();
        o(str);
        return (Set) this.f85155e.get(str);
    }

    final int E(String str, String str2) throws Throwable {
        Integer num;
        f();
        o(str);
        Map map = (Map) this.f85159i.get(str);
        if (map != null && (num = (Integer) map.get(str2)) != null) {
            return num.intValue();
        }
        return 1;
    }

    final boolean H(String str) throws Throwable {
        f();
        o(str);
        Map map = this.f85155e;
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
        Map map = this.f85155e;
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
        Map map = this.f85155e;
        if (map.get(str) != null && ((Set) map.get(str)).contains("user_id")) {
            return true;
        }
        return false;
    }

    final boolean K(String str) throws Throwable {
        f();
        o(str);
        Map map = this.f85155e;
        if (map.get(str) != null && ((Set) map.get(str)).contains("google_signals")) {
            return true;
        }
        return false;
    }

    final boolean L(String str) throws Throwable {
        f();
        o(str);
        Map map = this.f85155e;
        if (map.get(str) != null && ((Set) map.get(str)).contains("app_instance_id")) {
            return true;
        }
        return false;
    }

    final boolean M(String str) throws Throwable {
        f();
        o(str);
        Map map = this.f85155e;
        if (map.get(str) != null && ((Set) map.get(str)).contains("enhanced_user_id")) {
            return true;
        }
        return false;
    }

    final boolean N(String str, Od.v vVar) throws Throwable {
        f();
        o(str);
        C10357a2 c10357a2P = P(str);
        if (c10357a2P == null) {
            return false;
        }
        Iterator it = c10357a2P.E().iterator();
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

    final Od.v O(String str, Od.v vVar) {
        f();
        o(str);
        C10357a2 c10357a2P = P(str);
        if (c10357a2P != null) {
            for (com.google.android.gms.internal.measurement.Q1 q12 : c10357a2P.F()) {
                if (vVar == t(q12.F())) {
                    return t(q12.G());
                }
            }
            return null;
        }
        return null;
    }

    final C10357a2 P(String str) {
        f();
        o(str);
        C10411g2 c10411g2U = u(str);
        if (c10411g2U != null && c10411g2U.Q()) {
            return c10411g2U.R();
        }
        return null;
    }

    final boolean Q(String str) {
        f();
        o(str);
        C10357a2 c10357a2P = P(str);
        if (c10357a2P == null || !c10357a2P.H() || c10357a2P.I()) {
            return true;
        }
        return false;
    }

    final SortedSet R(String str) {
        f();
        o(str);
        TreeSet treeSet = new TreeSet();
        C10357a2 c10357a2P = P(str);
        if (c10357a2P != null) {
            Iterator it = c10357a2P.G().iterator();
            while (it.hasNext()) {
                treeSet.add(((com.google.android.gms.internal.measurement.X1) it.next()).E());
            }
        }
        return treeSet;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC11180l
    public final String d(String str, String str2) throws Throwable {
        f();
        o(str);
        Map map = (Map) this.f85154d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    final Od.u k(String str, Od.v vVar) {
        f();
        o(str);
        C10357a2 c10357a2P = P(str);
        if (c10357a2P == null) {
            return Od.u.UNINITIALIZED;
        }
        for (com.google.android.gms.internal.measurement.O1 o12 : c10357a2P.J()) {
            if (t(o12.F()) == vVar) {
                int iG = o12.G() - 1;
                if (iG != 1) {
                    if (iG != 2) {
                        return Od.u.UNINITIALIZED;
                    }
                    return Od.u.DENIED;
                }
                return Od.u.GRANTED;
            }
        }
        return Od.u.UNINITIALIZED;
    }

    final boolean l(String str) throws Throwable {
        f();
        o(str);
        C10357a2 c10357a2P = P(str);
        if (c10357a2P == null) {
            return false;
        }
        for (com.google.android.gms.internal.measurement.O1 o12 : c10357a2P.E()) {
            if (o12.F() == 3 && o12.H() == 3) {
                return true;
            }
        }
        return false;
    }

    final /* synthetic */ C10391e0 m(String str) throws Throwable {
        h();
        com.google.android.gms.common.internal.r.f(str);
        C11208p c11208pL0 = this.f85267b.D0().L0(str);
        if (c11208pL0 == null) {
            return null;
        }
        this.f84868a.a().u().b("Populate EES config from database on cache miss. appId", str);
        q(str, r(str, c11208pL0.f85742a));
        return (C10391e0) this.f85160j.snapshot().get(str);
    }

    protected final C10411g2 u(String str) {
        h();
        f();
        com.google.android.gms.common.internal.r.f(str);
        o(str);
        return (C10411g2) this.f85158h.get(str);
    }

    final String v(String str) {
        f();
        o(str);
        return (String) this.f85162l.get(str);
    }

    protected final String w(String str) {
        f();
        return (String) this.f85163m.get(str);
    }

    protected final String x(String str) {
        f();
        return (String) this.f85164n.get(str);
    }

    protected final void y(String str) {
        f();
        this.f85163m.put(str, null);
    }

    final void z(String str) {
        f();
        this.f85158h.remove(str);
    }
}
