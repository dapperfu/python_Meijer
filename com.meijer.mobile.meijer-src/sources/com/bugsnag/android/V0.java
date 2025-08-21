package com.bugsnag.android;

import com.bugsnag.android.C6624v0;
import com.bugsnag.android.G;
import io.constructor.data.local.PreferencesHelper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class V0 implements C6624v0.a, G {

    /* renamed from: a, reason: collision with root package name */
    private final File f64035a;

    /* renamed from: b, reason: collision with root package name */
    private final M0 f64036b;

    /* renamed from: c, reason: collision with root package name */
    private String f64037c;

    /* renamed from: d, reason: collision with root package name */
    private Date f64038d;

    /* renamed from: e, reason: collision with root package name */
    private s1 f64039e;

    /* renamed from: f, reason: collision with root package name */
    private final D0 f64040f;

    /* renamed from: g, reason: collision with root package name */
    private C6592f f64041g;

    /* renamed from: h, reason: collision with root package name */
    private M f64042h;

    /* renamed from: i, reason: collision with root package name */
    private volatile boolean f64043i;

    /* renamed from: j, reason: collision with root package name */
    private final AtomicInteger f64044j;

    /* renamed from: k, reason: collision with root package name */
    private final AtomicInteger f64045k;

    /* renamed from: l, reason: collision with root package name */
    private final AtomicBoolean f64046l;

    /* renamed from: m, reason: collision with root package name */
    private final AtomicBoolean f64047m;

    /* renamed from: n, reason: collision with root package name */
    private String f64048n;

    V0(Map<String, Object> map, D0 d02, String str) {
        this(null, null, d02, str);
        w((String) map.get(PreferencesHelper.PREF_ID));
        x(R6.g.a((String) map.get("startedAt")));
        Map map2 = (Map) map.get("events");
        this.f64045k.set(((Number) map2.get("handled")).intValue());
        this.f64044j.set(((Number) map2.get("unhandled")).intValue());
    }

    static V0 b(V0 v02) {
        V0 v03 = new V0(v02.f64037c, v02.f64038d, v02.f64039e, v02.f64044j.get(), v02.f64045k.get(), v02.f64036b, v02.f64040f, v02.c());
        v03.f64046l.set(v02.f64046l.get());
        v03.f64043i = v02.k();
        return v03;
    }

    private void n(String str) {
        this.f64040f.e("Invalid null value supplied to session." + str + ", ignoring");
    }

    private void s(C6624v0 c6624v0) throws Throwable {
        c6624v0.b0(this.f64035a);
    }

    @Override // com.bugsnag.android.G
    public byte[] a() throws IOException {
        return R6.q.f32021a.g(this);
    }

    public String c() {
        return this.f64048n;
    }

    int d() {
        return this.f64045k.intValue();
    }

    public String e() {
        return this.f64037c;
    }

    public Date g() {
        return this.f64038d;
    }

    int h() {
        return this.f64044j.intValue();
    }

    V0 i() {
        this.f64045k.incrementAndGet();
        return b(this);
    }

    V0 j() {
        this.f64044j.incrementAndGet();
        return b(this);
    }

    boolean k() {
        return this.f64043i;
    }

    boolean l() {
        File file = this.f64035a;
        if (file != null) {
            return (file.getName().endsWith("_v2.json") || this.f64035a.getName().endsWith("_v3.json")) ? false : true;
        }
        return true;
    }

    boolean m() {
        return this.f64047m.get();
    }

    void o() {
        this.f64047m.set(true);
    }

    boolean p() {
        return this.f64047m.compareAndSet(true, false);
    }

    boolean q() {
        return this.f64046l.compareAndSet(false, true);
    }

    @Override // com.bugsnag.android.C6624v0.a
    public void toStream(C6624v0 c6624v0) throws Throwable {
        if (this.f64035a != null) {
            if (l()) {
                r(c6624v0);
                return;
            } else {
                s(c6624v0);
                return;
            }
        }
        c6624v0.d();
        c6624v0.l("notifier").e0(this.f64036b);
        c6624v0.l("app").e0(this.f64041g);
        c6624v0.l("device").e0(this.f64042h);
        c6624v0.l("sessions").c();
        t(c6624v0);
        c6624v0.h();
        c6624v0.i();
    }

    void u(C6592f c6592f) {
        this.f64041g = c6592f;
    }

    void v(M m10) {
        this.f64042h = m10;
    }

    public void w(String str) {
        if (str != null) {
            this.f64037c = str;
        } else {
            n(PreferencesHelper.PREF_ID);
        }
    }

    public void x(Date date) {
        if (date != null) {
            this.f64038d = date;
        } else {
            n("startedAt");
        }
    }

    private void r(C6624v0 c6624v0) throws Throwable {
        c6624v0.d();
        c6624v0.l("notifier").e0(this.f64036b);
        c6624v0.l("app").e0(this.f64041g);
        c6624v0.l("device").e0(this.f64042h);
        c6624v0.l("sessions").c();
        c6624v0.b0(this.f64035a);
        c6624v0.h();
        c6624v0.i();
    }

    public String f() {
        return G.a.a(this);
    }

    void t(C6624v0 c6624v0) throws Throwable {
        c6624v0.d();
        c6624v0.l(PreferencesHelper.PREF_ID).O(this.f64037c);
        c6624v0.l("startedAt").e0(this.f64038d);
        c6624v0.l("user").e0(this.f64039e);
        c6624v0.i();
    }

    V0(String str, Date date, s1 s1Var, boolean z10, M0 m02, D0 d02, String str2) {
        this(null, m02, d02, str2);
        this.f64037c = str;
        this.f64038d = new Date(date.getTime());
        this.f64039e = s1Var;
        this.f64043i = z10;
        this.f64048n = str2;
    }

    V0(String str, Date date, s1 s1Var, int i10, int i11, M0 m02, D0 d02, String str2) {
        this(str, date, s1Var, false, m02, d02, str2);
        this.f64044j.set(i10);
        this.f64045k.set(i11);
        this.f64046l.set(true);
        this.f64048n = str2;
    }

    V0(File file, M0 m02, D0 d02, String str) {
        this.f64043i = false;
        this.f64044j = new AtomicInteger();
        this.f64045k = new AtomicInteger();
        this.f64046l = new AtomicBoolean(false);
        this.f64047m = new AtomicBoolean(false);
        this.f64035a = file;
        this.f64040f = d02;
        this.f64048n = SessionFilenameInfo.b(file, str);
        if (m02 != null) {
            M0 m03 = new M0(m02.getName(), m02.getVersion(), m02.getUrl());
            m03.e(new ArrayList(m02.a()));
            this.f64036b = m03;
            return;
        }
        this.f64036b = null;
    }
}
