package com.bugsnag.android;

import android.content.Context;
import java.io.File;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: com.bugsnag.android.x, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6627x {

    /* renamed from: a, reason: collision with root package name */
    final C6625w f64471a;

    public String A() {
        return this.f64471a.getReleaseStage();
    }

    public boolean B() {
        return this.f64471a.getSendLaunchCrashesSynchronously();
    }

    public m1 C() {
        return this.f64471a.getSendThreads();
    }

    public Set<j1> D() {
        return this.f64471a.F();
    }

    public long E() {
        return this.f64471a.getThreadCollectionTimeLimitMillis();
    }

    public s1 F() {
        return this.f64471a.getUser();
    }

    public Integer G() {
        return this.f64471a.getVersionCode();
    }

    public boolean H() {
        return this.f64471a.getAttemptDeliveryOnCrash();
    }

    public void K(String str) {
        this.f64471a.M(str);
    }

    public void L(String str) {
        this.f64471a.N(str);
    }

    public void M(boolean z10) {
        this.f64471a.O(z10);
    }

    public void N(boolean z10) {
        this.f64471a.P(z10);
    }

    public void O(boolean z10) {
        this.f64471a.Q(z10);
    }

    public void P(H h10) {
        if (h10 != null) {
            this.f64471a.R(h10);
        } else {
            J("delivery");
        }
    }

    public void R(Set<String> set) {
        this.f64471a.T(set);
    }

    public void S(X x10) {
        if (x10 != null) {
            this.f64471a.U(x10);
        } else {
            J("endpoints");
        }
    }

    public void T(boolean z10) {
        this.f64471a.V(z10);
    }

    public void U(long j10) {
        if (j10 >= 0) {
            this.f64471a.W(j10);
            return;
        }
        o().e("Invalid configuration value detected. Option launchDurationMillis should be a positive long value.Supplied value is " + j10);
    }

    public void V(D0 d02) {
        this.f64471a.X(d02);
    }

    public void W(int i10) {
        if (i10 >= 0 && i10 <= 500) {
            this.f64471a.Y(i10);
            return;
        }
        o().e("Invalid configuration value detected. Option maxBreadcrumbs should be an integer between 0-500. Supplied value is " + i10);
    }

    public void X(int i10) {
        if (i10 >= 0) {
            this.f64471a.Z(i10);
            return;
        }
        o().e("Invalid configuration value detected. Option maxPersistedEvents should be a positive integer.Supplied value is " + i10);
    }

    public void Y(int i10) {
        if (i10 >= 0) {
            this.f64471a.a0(i10);
            return;
        }
        o().e("Invalid configuration value detected. Option maxPersistedSessions should be a positive integer.Supplied value is " + i10);
    }

    public void Z(int i10) {
        if (i10 >= 0) {
            this.f64471a.b0(i10);
            return;
        }
        o().e("Invalid configuration value detected. Option maxReportedThreads should be a positive integer.Supplied value is " + i10);
    }

    public String a() {
        return this.f64471a.getApiKey();
    }

    public void a0(boolean z10) {
        this.f64471a.c0(z10);
    }

    public String b() {
        return this.f64471a.getAppType();
    }

    public String c() {
        return this.f64471a.getAppVersion();
    }

    public boolean d() {
        return this.f64471a.getAutoDetectErrors();
    }

    public void d0(String str) {
        this.f64471a.f0(str);
    }

    public boolean e() {
        return this.f64471a.getAutoTrackSessions();
    }

    public void e0(boolean z10) {
        this.f64471a.g0(z10);
    }

    public String f() {
        return this.f64471a.getContext();
    }

    public void f0(m1 m1Var) {
        if (m1Var != null) {
            this.f64471a.h0(m1Var);
        } else {
            J("sendThreads");
        }
    }

    public H g() {
        return this.f64471a.getDelivery();
    }

    public void g0(long j10) {
        if (j10 >= 0) {
            this.f64471a.i0(j10);
            return;
        }
        o().e("Invalid configuration value detected. Option threadCollectionTimeLimitMillis should be a positive integer.Supplied value is " + j10);
    }

    public Set<Pattern> h() {
        return this.f64471a.j();
    }

    public void h0(Integer num) {
        this.f64471a.j0(num);
    }

    public Set<BreadcrumbType> i() {
        return this.f64471a.k();
    }

    public C6583a0 j() {
        return this.f64471a.getEnabledErrorTypes();
    }

    public Set<String> k() {
        return this.f64471a.m();
    }

    public X l() {
        return this.f64471a.n();
    }

    public boolean m() {
        return this.f64471a.getGenerateAnonymousId();
    }

    public long n() {
        return this.f64471a.getLaunchDurationMillis();
    }

    public D0 o() {
        return this.f64471a.getLogger();
    }

    public int p() {
        return this.f64471a.getMaxBreadcrumbs();
    }

    public int q() {
        return this.f64471a.getMaxPersistedEvents();
    }

    public int r() {
        return this.f64471a.getMaxPersistedSessions();
    }

    public int s() {
        return this.f64471a.getMaxReportedThreads();
    }

    public int t() {
        return this.f64471a.getMaxStringValueLength();
    }

    M0 u() {
        return this.f64471a.getNotifier();
    }

    public boolean v() {
        return this.f64471a.getPersistUser();
    }

    public File w() {
        return this.f64471a.getPersistenceDirectory();
    }

    Set<T0> x() {
        return this.f64471a.z();
    }

    public Set<String> y() {
        return this.f64471a.A();
    }

    public Set<Pattern> z() {
        return this.f64471a.B();
    }

    public C6627x(String str) {
        this.f64471a = new C6625w(str);
    }

    public static C6627x I(Context context) {
        return C6625w.K(context);
    }

    private void J(String str) {
        o().e("Invalid null value supplied to config." + str + ", ignoring");
    }

    public void Q(Set<Pattern> set) {
        if (C6623v.a(set)) {
            J("discardClasses");
        } else {
            this.f64471a.S(set);
        }
    }

    public void b0(Set<String> set) {
        if (C6623v.a(set)) {
            J("projectPackages");
        } else {
            this.f64471a.d0(set);
        }
    }

    public void c0(Set<Pattern> set) {
        if (C6623v.a(set)) {
            J("redactedKeys");
        } else {
            this.f64471a.e0(set);
        }
    }
}
