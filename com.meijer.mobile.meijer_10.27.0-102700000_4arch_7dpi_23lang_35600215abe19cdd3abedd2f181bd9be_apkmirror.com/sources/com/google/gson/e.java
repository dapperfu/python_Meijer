package com.google.gson;

import java.util.Objects;

/* loaded from: classes7.dex */
public class e {

    /* renamed from: d, reason: collision with root package name */
    public static final e f89424d = new e("", "", false);

    /* renamed from: e, reason: collision with root package name */
    public static final e f89425e = new e("\n", "  ", true);

    /* renamed from: a, reason: collision with root package name */
    private final String f89426a;

    /* renamed from: b, reason: collision with root package name */
    private final String f89427b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f89428c;

    public String a() {
        return this.f89427b;
    }

    public String b() {
        return this.f89426a;
    }

    public boolean c() {
        return this.f89428c;
    }

    public e d(String str) {
        return new e(this.f89426a, str, this.f89428c);
    }

    private e(String str, String str2, boolean z10) {
        Objects.requireNonNull(str, "newline == null");
        Objects.requireNonNull(str2, "indent == null");
        if (str.matches("[\r\n]*")) {
            if (str2.matches("[ \t]*")) {
                this.f89426a = str;
                this.f89427b = str2;
                this.f89428c = z10;
                return;
            }
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
    }
}
