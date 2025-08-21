package com.google.firebase.installations;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public static final long f89597b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f89598c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d, reason: collision with root package name */
    private static h f89599d;

    /* renamed from: a, reason: collision with root package name */
    private final Pf.a f89600a;

    public static h d(Pf.a aVar) {
        if (f89599d == null) {
            f89599d = new h(aVar);
        }
        return f89599d;
    }

    static boolean g(String str) {
        return f89598c.matcher(str).matches();
    }

    static boolean h(String str) {
        return str.contains(":");
    }

    public long a() {
        return this.f89600a.a();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    private h(Pf.a aVar) {
        this.f89600a = aVar;
    }

    public static h c() {
        return d(Pf.b.b());
    }

    public long e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean f(Nf.d dVar) {
        if (TextUtils.isEmpty(dVar.b()) || dVar.h() + dVar.c() < b() + f89597b) {
            return true;
        }
        return false;
    }
}
