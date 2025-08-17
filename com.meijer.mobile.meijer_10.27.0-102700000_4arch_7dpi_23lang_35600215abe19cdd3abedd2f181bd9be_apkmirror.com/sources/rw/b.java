package rw;

/* loaded from: classes13.dex */
public enum b {
    ERROR(40, "ERROR"),
    WARN(30, "WARN"),
    INFO(20, "INFO"),
    DEBUG(10, "DEBUG"),
    TRACE(0, "TRACE");


    /* renamed from: a, reason: collision with root package name */
    private final int f159808a;

    /* renamed from: b, reason: collision with root package name */
    private final String f159809b;

    @Override // java.lang.Enum
    public String toString() {
        return this.f159809b;
    }

    b(int i10, String str) {
        this.f159808a = i10;
        this.f159809b = str;
    }
}
