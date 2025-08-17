package g8;

import android.os.SystemClock;

/* renamed from: g8.B, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14217B {

    /* renamed from: b, reason: collision with root package name */
    public static final s f132990b;

    /* renamed from: c, reason: collision with root package name */
    public static final C14217B f132991c;

    /* renamed from: a, reason: collision with root package name */
    private final s f132992a;

    static {
        s sVar = new s(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.elapsedRealtimeNanos());
        f132990b = sVar;
        f132991c = new C14217B(sVar);
    }

    public static long a() {
        return f132991c.c();
    }

    public static long b() {
        return f132991c.d();
    }

    public long c() {
        return this.f132992a.a() + SystemClock.elapsedRealtime();
    }

    public long d() {
        return this.f132992a.b() + SystemClock.elapsedRealtimeNanos();
    }

    private C14217B(s sVar) {
        this.f132992a = sVar;
    }
}
