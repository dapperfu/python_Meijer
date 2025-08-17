package com.google.firebase.perf.config;

import android.content.Context;
import com.google.firebase.perf.BuildConfig;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    private static final Uf.a f89012d = Uf.a.e();

    /* renamed from: e, reason: collision with root package name */
    private static volatile a f89013e;

    /* renamed from: a, reason: collision with root package name */
    private final RemoteConfigManager f89014a;

    /* renamed from: b, reason: collision with root package name */
    private ag.f f89015b;

    /* renamed from: c, reason: collision with root package name */
    private x f89016c;

    private boolean H(long j10) {
        return j10 >= 0;
    }

    private boolean J(long j10) {
        return j10 >= 0;
    }

    private boolean L(double d10) {
        return 0.0d <= d10 && d10 <= 1.0d;
    }

    private boolean M(long j10) {
        return j10 > 0;
    }

    private boolean N(long j10) {
        return j10 > 0;
    }

    private ag.g<Boolean> b(v<Boolean> vVar) {
        return this.f89016c.b(vVar.a());
    }

    private ag.g<Double> c(v<Double> vVar) {
        return this.f89016c.c(vVar.a());
    }

    private ag.g<Long> d(v<Long> vVar) {
        return this.f89016c.f(vVar.a());
    }

    private ag.g<String> e(v<String> vVar) {
        return this.f89016c.g(vVar.a());
    }

    public static synchronized a g() {
        try {
            if (f89013e == null) {
                f89013e = new a(null, null, null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f89013e;
    }

    private ag.g<Boolean> n(v<Boolean> vVar) {
        return this.f89015b.b(vVar.b());
    }

    private ag.g<Double> o(v<Double> vVar) {
        return this.f89015b.c(vVar.b());
    }

    private ag.g<Long> p(v<Long> vVar) {
        return this.f89015b.e(vVar.b());
    }

    private ag.g<Boolean> u(v<Boolean> vVar) {
        return this.f89014a.getBoolean(vVar.c());
    }

    private ag.g<Double> v(v<Double> vVar) {
        return this.f89014a.getDouble(vVar.c());
    }

    private ag.g<Long> w(v<Long> vVar) {
        return this.f89014a.getLong(vVar.c());
    }

    private ag.g<String> x(v<String> vVar) {
        return this.f89014a.getString(vVar.c());
    }

    public void O(Context context) {
        f89012d.i(ag.o.b(context));
        this.f89016c.h(context);
    }

    public void P(ag.f fVar) {
        this.f89015b = fVar;
    }

    public a(RemoteConfigManager remoteConfigManager, ag.f fVar, x xVar) {
        this.f89014a = remoteConfigManager == null ? RemoteConfigManager.getInstance() : remoteConfigManager;
        this.f89015b = fVar == null ? new ag.f() : fVar;
        this.f89016c = xVar == null ? x.e() : xVar;
    }

    private boolean I(String str) {
        if (str.trim().isEmpty()) {
            return false;
        }
        for (String str2 : str.split(";")) {
            if (str2.trim().equals(BuildConfig.FIREPERF_VERSION_NAME)) {
                return true;
            }
        }
        return false;
    }

    private boolean k() {
        l lVarE = l.e();
        ag.g<Boolean> gVarB = b(lVarE);
        ag.g<Boolean> gVarU = u(lVarE);
        if (gVarU.d()) {
            if (this.f89014a.isLastFetchFailed()) {
                return false;
            }
            Boolean boolC = gVarU.c();
            if (gVarB == null || !gVarB.d() || gVarB.c() != boolC) {
                this.f89016c.l(lVarE.a(), boolC.booleanValue());
            }
            return boolC.booleanValue();
        }
        if (gVarB.d()) {
            return gVarB.c().booleanValue();
        }
        return lVarE.d().booleanValue();
    }

    private boolean l() {
        k kVarE = k.e();
        ag.g<String> gVarE = e(kVarE);
        ag.g<String> gVarX = x(kVarE);
        if (gVarX.d()) {
            String strC = gVarX.c();
            if (gVarE == null || !gVarE.d() || !gVarE.c().equals(strC)) {
                this.f89016c.k(kVarE.a(), strC);
            }
            return I(strC);
        }
        if (gVarE.d()) {
            return I(gVarE.c());
        }
        return I(kVarE.d());
    }

    public long A() {
        o oVarE = o.e();
        ag.g<Long> gVarP = p(oVarE);
        if (gVarP.d() && M(gVarP.c().longValue())) {
            return gVarP.c().longValue();
        }
        ag.g<Long> gVarW = w(oVarE);
        if (gVarW.d() && M(gVarW.c().longValue())) {
            this.f89016c.j(oVarE.a(), gVarW.c().longValue());
            return gVarW.c().longValue();
        }
        ag.g<Long> gVarD = d(oVarE);
        if (gVarD.d() && M(gVarD.c().longValue())) {
            return gVarD.c().longValue();
        }
        return oVarE.d().longValue();
    }

    public long B() {
        p pVarE = p.e();
        ag.g<Long> gVarP = p(pVarE);
        if (gVarP.d() && J(gVarP.c().longValue())) {
            return gVarP.c().longValue();
        }
        ag.g<Long> gVarW = w(pVarE);
        if (gVarW.d() && J(gVarW.c().longValue())) {
            this.f89016c.j(pVarE.a(), gVarW.c().longValue());
            return gVarW.c().longValue();
        }
        ag.g<Long> gVarD = d(pVarE);
        if (gVarD.d() && J(gVarD.c().longValue())) {
            return gVarD.c().longValue();
        }
        return pVarE.d().longValue();
    }

    public long C() {
        q qVarF = q.f();
        ag.g<Long> gVarP = p(qVarF);
        if (gVarP.d() && J(gVarP.c().longValue())) {
            return gVarP.c().longValue();
        }
        ag.g<Long> gVarW = w(qVarF);
        if (gVarW.d() && J(gVarW.c().longValue())) {
            this.f89016c.j(qVarF.a(), gVarW.c().longValue());
            return gVarW.c().longValue();
        }
        ag.g<Long> gVarD = d(qVarF);
        if (gVarD.d() && J(gVarD.c().longValue())) {
            return gVarD.c().longValue();
        }
        if (this.f89014a.isLastFetchFailed()) {
            return qVarF.e().longValue();
        }
        return qVarF.d().longValue();
    }

    public double D() {
        r rVarF = r.f();
        ag.g<Double> gVarO = o(rVarF);
        if (gVarO.d()) {
            double dDoubleValue = gVarO.c().doubleValue() / 100.0d;
            if (L(dDoubleValue)) {
                return dDoubleValue;
            }
        }
        ag.g<Double> gVarV = v(rVarF);
        if (gVarV.d() && L(gVarV.c().doubleValue())) {
            this.f89016c.i(rVarF.a(), gVarV.c().doubleValue());
            return gVarV.c().doubleValue();
        }
        ag.g<Double> gVarC = c(rVarF);
        if (gVarC.d() && L(gVarC.c().doubleValue())) {
            return gVarC.c().doubleValue();
        }
        if (this.f89014a.isLastFetchFailed()) {
            return rVarF.e().doubleValue();
        }
        return rVarF.d().doubleValue();
    }

    public long E() {
        s sVarE = s.e();
        ag.g<Long> gVarW = w(sVarE);
        if (gVarW.d() && H(gVarW.c().longValue())) {
            this.f89016c.j(sVarE.a(), gVarW.c().longValue());
            return gVarW.c().longValue();
        }
        ag.g<Long> gVarD = d(sVarE);
        if (gVarD.d() && H(gVarD.c().longValue())) {
            return gVarD.c().longValue();
        }
        return sVarE.d().longValue();
    }

    public long F() {
        t tVarE = t.e();
        ag.g<Long> gVarW = w(tVarE);
        if (gVarW.d() && H(gVarW.c().longValue())) {
            this.f89016c.j(tVarE.a(), gVarW.c().longValue());
            return gVarW.c().longValue();
        }
        ag.g<Long> gVarD = d(tVarE);
        if (gVarD.d() && H(gVarD.c().longValue())) {
            return gVarD.c().longValue();
        }
        return tVarE.d().longValue();
    }

    public double G() {
        u uVarF = u.f();
        ag.g<Double> gVarV = v(uVarF);
        if (gVarV.d() && L(gVarV.c().doubleValue())) {
            this.f89016c.i(uVarF.a(), gVarV.c().doubleValue());
            return gVarV.c().doubleValue();
        }
        ag.g<Double> gVarC = c(uVarF);
        if (gVarC.d() && L(gVarC.c().doubleValue())) {
            return gVarC.c().doubleValue();
        }
        if (this.f89014a.isLastFetchFailed()) {
            return uVarF.e().doubleValue();
        }
        return uVarF.d().doubleValue();
    }

    public boolean K() {
        Boolean boolJ = j();
        if ((boolJ == null || boolJ.booleanValue()) && m()) {
            return true;
        }
        return false;
    }

    public String a() {
        String strF;
        f fVarE = f.e();
        if (BuildConfig.ENFORCE_DEFAULT_LOG_SRC.booleanValue()) {
            return fVarE.d();
        }
        String strC = fVarE.c();
        long jLongValue = -1;
        if (strC != null) {
            jLongValue = ((Long) this.f89014a.getRemoteConfigValueOrDefault(strC, -1L)).longValue();
        }
        String strA = fVarE.a();
        if (f.g(jLongValue) && (strF = f.f(jLongValue)) != null) {
            this.f89016c.k(strA, strF);
            return strF;
        }
        ag.g<String> gVarE = e(fVarE);
        if (gVarE.d()) {
            return gVarE.c();
        }
        return fVarE.d();
    }

    public double f() {
        e eVarE = e.e();
        ag.g<Double> gVarO = o(eVarE);
        if (gVarO.d()) {
            double dDoubleValue = gVarO.c().doubleValue() / 100.0d;
            if (L(dDoubleValue)) {
                return dDoubleValue;
            }
        }
        ag.g<Double> gVarV = v(eVarE);
        if (gVarV.d() && L(gVarV.c().doubleValue())) {
            this.f89016c.i(eVarE.a(), gVarV.c().doubleValue());
            return gVarV.c().doubleValue();
        }
        ag.g<Double> gVarC = c(eVarE);
        if (gVarC.d() && L(gVarC.c().doubleValue())) {
            return gVarC.c().doubleValue();
        }
        return eVarE.d().doubleValue();
    }

    public boolean h() {
        d dVarE = d.e();
        ag.g<Boolean> gVarN = n(dVarE);
        if (gVarN.d()) {
            return gVarN.c().booleanValue();
        }
        ag.g<Boolean> gVarU = u(dVarE);
        if (gVarU.d()) {
            this.f89016c.l(dVarE.a(), gVarU.c().booleanValue());
            return gVarU.c().booleanValue();
        }
        ag.g<Boolean> gVarB = b(dVarE);
        if (gVarB.d()) {
            return gVarB.c().booleanValue();
        }
        return dVarE.d().booleanValue();
    }

    public Boolean i() {
        b bVarE = b.e();
        ag.g<Boolean> gVarN = n(bVarE);
        if (gVarN.d()) {
            return gVarN.c();
        }
        return bVarE.d();
    }

    public Boolean j() {
        if (i().booleanValue()) {
            return Boolean.FALSE;
        }
        c cVarD = c.d();
        ag.g<Boolean> gVarB = b(cVarD);
        if (gVarB.d()) {
            return gVarB.c();
        }
        ag.g<Boolean> gVarN = n(cVarD);
        if (gVarN.d()) {
            return gVarN.c();
        }
        return null;
    }

    public boolean m() {
        if (k() && !l()) {
            return true;
        }
        return false;
    }

    public long q() {
        g gVarE = g.e();
        ag.g<Long> gVarW = w(gVarE);
        if (gVarW.d() && H(gVarW.c().longValue())) {
            this.f89016c.j(gVarE.a(), gVarW.c().longValue());
            return gVarW.c().longValue();
        }
        ag.g<Long> gVarD = d(gVarE);
        if (gVarD.d() && H(gVarD.c().longValue())) {
            return gVarD.c().longValue();
        }
        return gVarE.d().longValue();
    }

    public long r() {
        h hVarE = h.e();
        ag.g<Long> gVarW = w(hVarE);
        if (gVarW.d() && H(gVarW.c().longValue())) {
            this.f89016c.j(hVarE.a(), gVarW.c().longValue());
            return gVarW.c().longValue();
        }
        ag.g<Long> gVarD = d(hVarE);
        if (gVarD.d() && H(gVarD.c().longValue())) {
            return gVarD.c().longValue();
        }
        return hVarE.d().longValue();
    }

    public double s() {
        i iVarF = i.f();
        ag.g<Double> gVarV = v(iVarF);
        if (gVarV.d() && L(gVarV.c().doubleValue())) {
            this.f89016c.i(iVarF.a(), gVarV.c().doubleValue());
            return gVarV.c().doubleValue();
        }
        ag.g<Double> gVarC = c(iVarF);
        if (gVarC.d() && L(gVarC.c().doubleValue())) {
            return gVarC.c().doubleValue();
        }
        if (this.f89014a.isLastFetchFailed()) {
            return iVarF.e().doubleValue();
        }
        return iVarF.d().doubleValue();
    }

    public long t() {
        j jVarE = j.e();
        ag.g<Long> gVarW = w(jVarE);
        if (gVarW.d() && N(gVarW.c().longValue())) {
            this.f89016c.j(jVarE.a(), gVarW.c().longValue());
            return gVarW.c().longValue();
        }
        ag.g<Long> gVarD = d(jVarE);
        if (gVarD.d() && N(gVarD.c().longValue())) {
            return gVarD.c().longValue();
        }
        return jVarE.d().longValue();
    }

    public long y() {
        m mVarE = m.e();
        ag.g<Long> gVarP = p(mVarE);
        if (gVarP.d() && J(gVarP.c().longValue())) {
            return gVarP.c().longValue();
        }
        ag.g<Long> gVarW = w(mVarE);
        if (gVarW.d() && J(gVarW.c().longValue())) {
            this.f89016c.j(mVarE.a(), gVarW.c().longValue());
            return gVarW.c().longValue();
        }
        ag.g<Long> gVarD = d(mVarE);
        if (gVarD.d() && J(gVarD.c().longValue())) {
            return gVarD.c().longValue();
        }
        return mVarE.d().longValue();
    }

    public long z() {
        n nVarF = n.f();
        ag.g<Long> gVarP = p(nVarF);
        if (gVarP.d() && J(gVarP.c().longValue())) {
            return gVarP.c().longValue();
        }
        ag.g<Long> gVarW = w(nVarF);
        if (gVarW.d() && J(gVarW.c().longValue())) {
            this.f89016c.j(nVarF.a(), gVarW.c().longValue());
            return gVarW.c().longValue();
        }
        ag.g<Long> gVarD = d(nVarF);
        if (gVarD.d() && J(gVarD.c().longValue())) {
            return gVarD.c().longValue();
        }
        if (this.f89014a.isLastFetchFailed()) {
            return nVarF.e().longValue();
        }
        return nVarF.d().longValue();
    }
}
