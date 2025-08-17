package com.bugsnag.android;

import android.content.Context;
import java.io.File;
import java.util.Set;

/* renamed from: com.bugsnag.android.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6496u {

    /* renamed from: a, reason: collision with root package name */
    final C6494t f63612a;

    public boolean A() {
        return this.f63612a.getSendLaunchCrashesSynchronously();
    }

    public b1 B() {
        return this.f63612a.getSendThreads();
    }

    public Set<Y0> C() {
        return this.f63612a.E();
    }

    public h1 D() {
        return this.f63612a.getUser();
    }

    public Integer E() {
        return this.f63612a.getVersionCode();
    }

    public boolean F() {
        return this.f63612a.getAttemptDeliveryOnCrash();
    }

    public void J(String str) {
        this.f63612a.I(str);
    }

    public void K(String str) {
        this.f63612a.J(str);
    }

    public void L(boolean z10) {
        this.f63612a.K(z10);
    }

    public void M(boolean z10) {
        this.f63612a.L(z10);
    }

    public void N(boolean z10) {
        this.f63612a.M(z10);
    }

    public void O(D d10) {
        if (d10 != null) {
            this.f63612a.N(d10);
        } else {
            I("delivery");
        }
    }

    public void Q(Set<String> set) {
        this.f63612a.P(set);
    }

    public void R(Q q10) {
        if (q10 != null) {
            this.f63612a.Q(q10);
        } else {
            I("endpoints");
        }
    }

    public void S(long j10) {
        if (j10 >= 0) {
            this.f63612a.R(j10);
            return;
        }
        n().e("Invalid configuration value detected. Option launchDurationMillis should be a positive long value.Supplied value is " + j10);
    }

    public void T(InterfaceC6495t0 interfaceC6495t0) {
        this.f63612a.S(interfaceC6495t0);
    }

    public void U(int i10) {
        if (i10 >= 0 && i10 <= 500) {
            this.f63612a.T(i10);
            return;
        }
        n().e("Invalid configuration value detected. Option maxBreadcrumbs should be an integer between 0-500. Supplied value is " + i10);
    }

    public void V(int i10) {
        if (i10 >= 0) {
            this.f63612a.U(i10);
            return;
        }
        n().e("Invalid configuration value detected. Option maxPersistedEvents should be a positive integer.Supplied value is " + i10);
    }

    public void W(int i10) {
        if (i10 >= 0) {
            this.f63612a.V(i10);
            return;
        }
        n().e("Invalid configuration value detected. Option maxPersistedSessions should be a positive integer.Supplied value is " + i10);
    }

    public void X(int i10) {
        if (i10 >= 0) {
            this.f63612a.W(i10);
            return;
        }
        n().e("Invalid configuration value detected. Option maxReportedThreads should be a positive integer.Supplied value is " + i10);
    }

    public void Y(boolean z10) {
        this.f63612a.X(z10);
    }

    public String a() {
        return this.f63612a.getApiKey();
    }

    public String b() {
        return this.f63612a.getAppType();
    }

    public void b0(String str) {
        this.f63612a.a0(str);
    }

    public String c() {
        return this.f63612a.getAppVersion();
    }

    public void c0(boolean z10) {
        this.f63612a.b0(z10);
    }

    public boolean d() {
        return this.f63612a.getAutoDetectErrors();
    }

    public void d0(b1 b1Var) {
        if (b1Var != null) {
            this.f63612a.c0(b1Var);
        } else {
            I("sendThreads");
        }
    }

    public boolean e() {
        return this.f63612a.getAutoTrackSessions();
    }

    public void e0(Integer num) {
        this.f63612a.d0(num);
    }

    public String f() {
        return this.f63612a.getContext();
    }

    public D g() {
        return this.f63612a.getDelivery();
    }

    public Set<String> h() {
        return this.f63612a.j();
    }

    public Set<BreadcrumbType> i() {
        return this.f63612a.k();
    }

    public U j() {
        return this.f63612a.getEnabledErrorTypes();
    }

    public Set<String> k() {
        return this.f63612a.m();
    }

    public Q l() {
        return this.f63612a.getEndpoints();
    }

    public long m() {
        return this.f63612a.getLaunchDurationMillis();
    }

    public InterfaceC6495t0 n() {
        return this.f63612a.getLogger();
    }

    public int o() {
        return this.f63612a.getMaxBreadcrumbs();
    }

    public int p() {
        return this.f63612a.getMaxPersistedEvents();
    }

    public int q() {
        return this.f63612a.getMaxPersistedSessions();
    }

    public int r() {
        return this.f63612a.getMaxReportedThreads();
    }

    public int s() {
        return this.f63612a.getMaxStringValueLength();
    }

    B0 t() {
        return this.f63612a.getNotifier();
    }

    public boolean u() {
        return this.f63612a.getPersistUser();
    }

    public File v() {
        return this.f63612a.getPersistenceDirectory();
    }

    Set<I0> w() {
        return this.f63612a.y();
    }

    public Set<String> x() {
        return this.f63612a.z();
    }

    public Set<String> y() {
        return this.f63612a.A();
    }

    public String z() {
        return this.f63612a.getReleaseStage();
    }

    public C6496u(String str) {
        f0(str);
        this.f63612a = new C6494t(str);
    }

    static boolean G(String str) {
        if (!C6480l0.a(str)) {
            if (str.length() != 32) {
                return true;
            }
            for (int i10 = 0; i10 < 32; i10++) {
                char cCharAt = str.charAt(i10);
                if (!Character.isDigit(cCharAt) && (cCharAt < 'a' || cCharAt > 'f')) {
                    return true;
                }
            }
            return false;
        }
        throw new IllegalArgumentException("No Bugsnag API Key set");
    }

    public static C6496u H(Context context) {
        return C6494t.H(context);
    }

    private void I(String str) {
        n().e("Invalid null value supplied to config." + str + ", ignoring");
    }

    private void f0(String str) {
        if (G(str)) {
            B.f63051a.g("Invalid configuration. apiKey should be a 32-character hexademical string, got " + str);
        }
    }

    public void P(Set<String> set) {
        if (C6492s.a(set)) {
            I("discardClasses");
        } else {
            this.f63612a.O(set);
        }
    }

    public void Z(Set<String> set) {
        if (C6492s.a(set)) {
            I("projectPackages");
        } else {
            this.f63612a.Y(set);
        }
    }

    public void a0(Set<String> set) {
        if (C6492s.a(set)) {
            I("redactedKeys");
        } else {
            this.f63612a.Z(set);
        }
    }
}
