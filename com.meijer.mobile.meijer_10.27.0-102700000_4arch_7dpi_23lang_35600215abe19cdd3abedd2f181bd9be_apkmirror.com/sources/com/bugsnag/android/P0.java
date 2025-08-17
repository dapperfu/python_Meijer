package com.bugsnag.android;

import com.bugsnag.android.C6482m0;
import java.io.IOException;

/* loaded from: classes4.dex */
final class P0 implements C6482m0.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f63187a;

    /* renamed from: b, reason: collision with root package name */
    private final String f63188b;

    /* renamed from: c, reason: collision with root package name */
    private final String f63189c;

    /* renamed from: d, reason: collision with root package name */
    private final Severity f63190d;

    /* renamed from: e, reason: collision with root package name */
    private Severity f63191e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f63192f;

    /* renamed from: g, reason: collision with root package name */
    final boolean f63193g;

    static P0 h(String str) {
        return i(str, null, null);
    }

    static P0 i(String str, Severity severity, String str2) {
        if (str.equals("strictMode") && C6480l0.a(str2)) {
            throw new IllegalArgumentException("No reason supplied for strictmode");
        }
        if (!str.equals("strictMode") && !str.equals("log") && !C6480l0.a(str2)) {
            throw new IllegalArgumentException("attributeValue should not be supplied");
        }
        switch (str) {
            case "strictMode":
                return new P0(str, Severity.WARNING, true, true, str2, "violationType");
            case "userCallbackSetSeverity":
            case "userSpecifiedSeverity":
                return new P0(str, severity, false, false, null, null);
            case "unhandledException":
            case "anrError":
            case "unhandledPromiseRejection":
                return new P0(str, Severity.ERROR, true, true, null, null);
            case "handledError":
            case "handledException":
                return new P0(str, Severity.WARNING, false, false, null, null);
            case "log":
                return new P0(str, severity, false, false, str2, "level");
            default:
                throw new IllegalArgumentException("Invalid argument for severityReason: '" + str + '\'');
        }
    }

    String a() {
        return this.f63190d == this.f63191e ? this.f63187a : "userCallbackSetSeverity";
    }

    String b() {
        return this.f63188b;
    }

    String c() {
        return this.f63189c;
    }

    Severity d() {
        return this.f63191e;
    }

    String e() {
        return this.f63187a;
    }

    boolean f() {
        return this.f63192f;
    }

    boolean g() {
        return this.f63192f != this.f63193g;
    }

    P0(String str, Severity severity, boolean z10, boolean z11, String str2, String str3) {
        this.f63187a = str;
        this.f63192f = z10;
        this.f63193g = z11;
        this.f63190d = severity;
        this.f63191e = severity;
        this.f63189c = str2;
        this.f63188b = str3;
    }

    @Override // com.bugsnag.android.C6482m0.a
    public void toStream(C6482m0 c6482m0) throws IOException {
        c6482m0.d().l("type").O(a()).l("unhandledOverridden").R(g());
        if (this.f63188b != null && this.f63189c != null) {
            c6482m0.l("attributes").d().l(this.f63188b).O(this.f63189c).i();
        }
        c6482m0.i();
    }
}
