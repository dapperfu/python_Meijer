package com.google.gson;

import java.util.Objects;

/* loaded from: classes8.dex */
public class e {

    /* renamed from: d, reason: collision with root package name */
    public static final e f90266d = new e("", "", false);

    /* renamed from: e, reason: collision with root package name */
    public static final e f90267e = new e("\n", "  ", true);

    /* renamed from: a, reason: collision with root package name */
    private final String f90268a;

    /* renamed from: b, reason: collision with root package name */
    private final String f90269b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f90270c;

    public String a() {
        return this.f90269b;
    }

    public String b() {
        return this.f90268a;
    }

    public boolean c() {
        return this.f90270c;
    }

    public e d(String str) {
        return new e(this.f90268a, str, this.f90270c);
    }

    private e(String str, String str2, boolean z10) {
        Objects.requireNonNull(str, "newline == null");
        Objects.requireNonNull(str2, "indent == null");
        if (str.matches("[\r\n]*")) {
            if (str2.matches("[ \t]*")) {
                this.f90268a = str;
                this.f90269b = str2;
                this.f90270c = z10;
                return;
            }
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
    }
}
