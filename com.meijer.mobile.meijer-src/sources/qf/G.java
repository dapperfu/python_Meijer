package qf;

/* loaded from: classes8.dex */
public enum G {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);


    /* renamed from: a, reason: collision with root package name */
    private final int f158296a;

    public static G b(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    public int e() {
        return this.f158296a;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.f158296a);
    }

    G(int i10) {
        this.f158296a = i10;
    }
}
