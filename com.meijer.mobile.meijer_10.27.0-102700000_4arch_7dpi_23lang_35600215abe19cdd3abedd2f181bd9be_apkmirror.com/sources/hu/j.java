package hu;

/* loaded from: classes11.dex */
public enum j {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");


    /* renamed from: a, reason: collision with root package name */
    private final String f136397a;

    @Override // java.lang.Enum
    public String toString() {
        return this.f136397a;
    }

    j(String str) {
        this.f136397a = str;
    }
}
