package nw;

/* loaded from: classes14.dex */
public enum b {
    ERROR(40, "ERROR"),
    WARN(30, "WARN"),
    INFO(20, "INFO"),
    DEBUG(10, "DEBUG"),
    TRACE(0, "TRACE");


    /* renamed from: a, reason: collision with root package name */
    private final int f153284a;

    /* renamed from: b, reason: collision with root package name */
    private final String f153285b;

    public int b() {
        return this.f153284a;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f153285b;
    }

    b(int i10, String str) {
        this.f153284a = i10;
        this.f153285b = str;
    }
}
