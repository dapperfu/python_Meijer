package Ed;

/* renamed from: Ed.g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C3192g {

    /* renamed from: a, reason: collision with root package name */
    private final Object f7116a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f7117b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f7118c;

    final IllegalArgumentException a() {
        Object obj = this.f7118c;
        Object obj2 = this.f7117b;
        Object obj3 = this.f7116a;
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(obj3) + "=" + String.valueOf(obj2) + " and " + String.valueOf(obj3) + "=" + String.valueOf(obj));
    }

    C3192g(Object obj, Object obj2, Object obj3) {
        this.f7116a = obj;
        this.f7117b = obj2;
        this.f7118c = obj3;
    }
}
