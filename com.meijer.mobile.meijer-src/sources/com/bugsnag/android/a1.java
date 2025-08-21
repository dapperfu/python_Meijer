package com.bugsnag.android;

import com.bugsnag.android.C6624v0;
import java.io.IOException;

/* loaded from: classes4.dex */
final class a1 implements C6624v0.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f64087a;

    /* renamed from: b, reason: collision with root package name */
    private final String f64088b;

    /* renamed from: c, reason: collision with root package name */
    private final String f64089c;

    /* renamed from: d, reason: collision with root package name */
    private final Severity f64090d;

    /* renamed from: e, reason: collision with root package name */
    private Severity f64091e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f64092f;

    /* renamed from: g, reason: collision with root package name */
    final boolean f64093g;

    static a1 h(String str) {
        return i(str, null, null);
    }

    static a1 i(String str, Severity severity, String str2) {
        if (str.equals("strictMode") && C6622u0.a(str2)) {
            throw new IllegalArgumentException("No reason supplied for strictmode");
        }
        if (!str.equals("strictMode") && !str.equals("log") && !C6622u0.a(str2)) {
            throw new IllegalArgumentException("attributeValue should not be supplied");
        }
        switch (str) {
            case "strictMode":
                return new a1(str, Severity.WARNING, true, true, str2, "violationType");
            case "userCallbackSetSeverity":
            case "userSpecifiedSeverity":
                return new a1(str, severity, false, false, null, null);
            case "unhandledException":
            case "signal":
            case "anrError":
            case "unhandledPromiseRejection":
                return new a1(str, Severity.ERROR, true, true, null, null);
            case "handledError":
            case "handledException":
                return new a1(str, Severity.WARNING, false, false, null, null);
            case "log":
                return new a1(str, severity, false, false, str2, "level");
            default:
                throw new IllegalArgumentException("Invalid argument for severityReason: '" + str + '\'');
        }
    }

    String a() {
        return this.f64090d == this.f64091e ? this.f64087a : "userCallbackSetSeverity";
    }

    String b() {
        return this.f64088b;
    }

    String c() {
        return this.f64089c;
    }

    Severity d() {
        return this.f64091e;
    }

    String e() {
        return this.f64087a;
    }

    boolean f() {
        return this.f64092f;
    }

    boolean g() {
        return this.f64092f != this.f64093g;
    }

    a1(String str, Severity severity, boolean z10, boolean z11, String str2, String str3) {
        this.f64087a = str;
        this.f64092f = z10;
        this.f64093g = z11;
        this.f64090d = severity;
        this.f64091e = severity;
        this.f64089c = str2;
        this.f64088b = str3;
    }

    @Override // com.bugsnag.android.C6624v0.a
    public void toStream(C6624v0 c6624v0) throws IOException {
        c6624v0.d().l("type").O(a()).l("unhandledOverridden").R(g());
        if (this.f64088b != null && this.f64089c != null) {
            c6624v0.l("attributes").d().l(this.f64088b).O(this.f64089c).i();
        }
        c6624v0.i();
    }
}
