package com.bugsnag.android;

import com.bugsnag.android.C6482m0;
import io.constructor.data.local.PreferencesHelper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class K0 implements C6482m0.a {

    /* renamed from: a, reason: collision with root package name */
    private final File f63130a;

    /* renamed from: b, reason: collision with root package name */
    private final B0 f63131b;

    /* renamed from: c, reason: collision with root package name */
    private String f63132c;

    /* renamed from: d, reason: collision with root package name */
    private Date f63133d;

    /* renamed from: e, reason: collision with root package name */
    private h1 f63134e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC6495t0 f63135f;

    /* renamed from: g, reason: collision with root package name */
    private C6461c f63136g;

    /* renamed from: h, reason: collision with root package name */
    private I f63137h;

    /* renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f63138i;

    /* renamed from: j, reason: collision with root package name */
    private final AtomicInteger f63139j;

    /* renamed from: k, reason: collision with root package name */
    private final AtomicInteger f63140k;

    /* renamed from: l, reason: collision with root package name */
    private final AtomicBoolean f63141l;

    /* renamed from: m, reason: collision with root package name */
    final AtomicBoolean f63142m;

    /* renamed from: n, reason: collision with root package name */
    private String f63143n;

    K0(Map<String, Object> map, InterfaceC6495t0 interfaceC6495t0, String str) {
        this(null, null, interfaceC6495t0, str);
        r((String) map.get(PreferencesHelper.PREF_ID));
        s(Q6.d.a((String) map.get("startedAt")));
        Map map2 = (Map) map.get("events");
        this.f63140k.set(((Number) map2.get("handled")).intValue());
        this.f63139j.set(((Number) map2.get("unhandled")).intValue());
    }

    static K0 a(K0 k02) {
        K0 k03 = new K0(k02.f63132c, k02.f63133d, k02.f63134e, k02.f63139j.get(), k02.f63140k.get(), k02.f63131b, k02.f63135f, k02.b());
        k03.f63141l.set(k02.f63141l.get());
        k03.f63138i.set(k02.i());
        return k03;
    }

    private void l(String str) {
        this.f63135f.e("Invalid null value supplied to session." + str + ", ignoring");
    }

    private void o(C6482m0 c6482m0) throws Throwable {
        c6482m0.c0(this.f63130a);
    }

    public String b() {
        return this.f63143n;
    }

    int c() {
        return this.f63140k.intValue();
    }

    public String d() {
        return this.f63132c;
    }

    public Date e() {
        return this.f63133d;
    }

    int f() {
        return this.f63139j.intValue();
    }

    K0 g() {
        this.f63140k.incrementAndGet();
        return a(this);
    }

    K0 h() {
        this.f63139j.incrementAndGet();
        return a(this);
    }

    boolean i() {
        return this.f63138i.get();
    }

    AtomicBoolean j() {
        return this.f63141l;
    }

    boolean k() {
        File file = this.f63130a;
        return file != null && file.getName().endsWith("_v2.json");
    }

    void p(C6461c c6461c) {
        this.f63136g = c6461c;
    }

    void q(I i10) {
        this.f63137h = i10;
    }

    public void r(String str) {
        if (str != null) {
            this.f63132c = str;
        } else {
            l(PreferencesHelper.PREF_ID);
        }
    }

    public void s(Date date) {
        if (date != null) {
            this.f63133d = date;
        } else {
            l("startedAt");
        }
    }

    @Override // com.bugsnag.android.C6482m0.a
    public void toStream(C6482m0 c6482m0) throws Throwable {
        if (this.f63130a != null) {
            if (k()) {
                o(c6482m0);
                return;
            } else {
                n(c6482m0);
                return;
            }
        }
        c6482m0.d();
        c6482m0.l("notifier").e0(this.f63131b);
        c6482m0.l("app").e0(this.f63136g);
        c6482m0.l("device").e0(this.f63137h);
        c6482m0.l("sessions").c();
        m(c6482m0);
        c6482m0.h();
        c6482m0.i();
    }

    private void n(C6482m0 c6482m0) throws Throwable {
        c6482m0.d();
        c6482m0.l("notifier").e0(this.f63131b);
        c6482m0.l("app").e0(this.f63136g);
        c6482m0.l("device").e0(this.f63137h);
        c6482m0.l("sessions").c();
        c6482m0.c0(this.f63130a);
        c6482m0.h();
        c6482m0.i();
    }

    void m(C6482m0 c6482m0) throws IOException {
        c6482m0.d();
        c6482m0.l(PreferencesHelper.PREF_ID).O(this.f63132c);
        c6482m0.l("startedAt").e0(this.f63133d);
        c6482m0.l("user").e0(this.f63134e);
        c6482m0.i();
    }

    K0(String str, Date date, h1 h1Var, boolean z10, B0 b02, InterfaceC6495t0 interfaceC6495t0, String str2) {
        this(null, b02, interfaceC6495t0, str2);
        this.f63132c = str;
        this.f63133d = new Date(date.getTime());
        this.f63134e = h1Var;
        this.f63138i.set(z10);
        this.f63143n = str2;
    }

    K0(String str, Date date, h1 h1Var, int i10, int i11, B0 b02, InterfaceC6495t0 interfaceC6495t0, String str2) {
        this(str, date, h1Var, false, b02, interfaceC6495t0, str2);
        this.f63139j.set(i10);
        this.f63140k.set(i11);
        this.f63141l.set(true);
        this.f63143n = str2;
    }

    K0(File file, B0 b02, InterfaceC6495t0 interfaceC6495t0, String str) {
        this.f63138i = new AtomicBoolean(false);
        this.f63139j = new AtomicInteger();
        this.f63140k = new AtomicInteger();
        this.f63141l = new AtomicBoolean(false);
        this.f63142m = new AtomicBoolean(false);
        this.f63130a = file;
        this.f63135f = interfaceC6495t0;
        this.f63143n = SessionFilenameInfo.c(file, str);
        if (b02 != null) {
            B0 b03 = new B0(b02.getName(), b02.getVersion(), b02.getUrl());
            b03.e(new ArrayList(b02.a()));
            this.f63131b = b03;
            return;
        }
        this.f63131b = null;
    }
}
