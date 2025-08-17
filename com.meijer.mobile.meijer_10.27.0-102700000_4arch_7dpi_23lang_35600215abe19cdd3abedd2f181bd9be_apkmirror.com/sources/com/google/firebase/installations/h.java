package com.google.firebase.installations;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes7.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public static final long f88757b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f88758c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d, reason: collision with root package name */
    private static h f88759d;

    /* renamed from: a, reason: collision with root package name */
    private final Nf.a f88760a;

    public static h d(Nf.a aVar) {
        if (f88759d == null) {
            f88759d = new h(aVar);
        }
        return f88759d;
    }

    static boolean g(String str) {
        return f88758c.matcher(str).matches();
    }

    static boolean h(String str) {
        return str.contains(":");
    }

    public long a() {
        return this.f88760a.a();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    private h(Nf.a aVar) {
        this.f88760a = aVar;
    }

    public static h c() {
        return d(Nf.b.b());
    }

    public long e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean f(Lf.d dVar) {
        if (TextUtils.isEmpty(dVar.b()) || dVar.h() + dVar.c() < b() + f88757b) {
            return true;
        }
        return false;
    }
}
