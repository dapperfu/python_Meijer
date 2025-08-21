package i8;

import android.os.SystemClock;

/* renamed from: i8.B, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14693B {

    /* renamed from: b, reason: collision with root package name */
    public static final s f137206b;

    /* renamed from: c, reason: collision with root package name */
    public static final C14693B f137207c;

    /* renamed from: a, reason: collision with root package name */
    private final s f137208a;

    static {
        s sVar = new s(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.elapsedRealtimeNanos());
        f137206b = sVar;
        f137207c = new C14693B(sVar);
    }

    public static long a() {
        return f137207c.c();
    }

    public static long b() {
        return f137207c.d();
    }

    public long c() {
        return this.f137208a.a() + SystemClock.elapsedRealtime();
    }

    public long d() {
        return this.f137208a.b() + SystemClock.elapsedRealtimeNanos();
    }

    private C14693B(s sVar) {
        this.f137208a = sVar;
    }
}
