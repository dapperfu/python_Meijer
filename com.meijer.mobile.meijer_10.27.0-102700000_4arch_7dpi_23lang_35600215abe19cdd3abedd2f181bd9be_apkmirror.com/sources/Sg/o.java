package Sg;

/* loaded from: classes7.dex */
final class o extends q {

    /* renamed from: b, reason: collision with root package name */
    private final String f33626b;

    /* renamed from: c, reason: collision with root package name */
    private final int f33627c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f33628d;

    o(int i10, String str) {
        super(i10);
        this.f33626b = str;
        this.f33628d = false;
        this.f33627c = 0;
    }

    String b() {
        return this.f33626b;
    }

    int c() {
        return this.f33627c;
    }

    boolean d() {
        return this.f33628d;
    }

    o(int i10, String str, int i11) {
        super(i10);
        this.f33628d = true;
        this.f33627c = i11;
        this.f33626b = str;
    }
}
