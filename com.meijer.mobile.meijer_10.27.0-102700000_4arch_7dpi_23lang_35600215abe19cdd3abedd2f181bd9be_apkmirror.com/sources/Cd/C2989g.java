package Cd;

/* renamed from: Cd.g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C2989g {

    /* renamed from: a, reason: collision with root package name */
    private final Object f3804a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f3805b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f3806c;

    final IllegalArgumentException a() {
        Object obj = this.f3806c;
        Object obj2 = this.f3805b;
        Object obj3 = this.f3804a;
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(obj3) + "=" + String.valueOf(obj2) + " and " + String.valueOf(obj3) + "=" + String.valueOf(obj));
    }

    C2989g(Object obj, Object obj2, Object obj3) {
        this.f3804a = obj;
        this.f3805b = obj2;
        this.f3806c = obj3;
    }
}
