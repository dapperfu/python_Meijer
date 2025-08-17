package of;

/* loaded from: classes7.dex */
public enum G {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);


    /* renamed from: a, reason: collision with root package name */
    private final int f153444a;

    public static G b(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    public int e() {
        return this.f153444a;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.f153444a);
    }

    G(int i10) {
        this.f153444a = i10;
    }
}
