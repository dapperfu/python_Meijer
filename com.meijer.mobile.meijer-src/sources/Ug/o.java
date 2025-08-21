package Ug;

/* loaded from: classes8.dex */
final class o extends q {

    /* renamed from: b, reason: collision with root package name */
    private final String f37502b;

    /* renamed from: c, reason: collision with root package name */
    private final int f37503c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f37504d;

    o(int i10, String str) {
        super(i10);
        this.f37502b = str;
        this.f37504d = false;
        this.f37503c = 0;
    }

    String b() {
        return this.f37502b;
    }

    int c() {
        return this.f37503c;
    }

    boolean d() {
        return this.f37504d;
    }

    o(int i10, String str, int i11) {
        super(i10);
        this.f37504d = true;
        this.f37503c = i11;
        this.f37502b = str;
    }
}
