package N5;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f21451a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC0338a f21452b;

    /* renamed from: N5.a$a, reason: collision with other inner class name */
    public enum EnumC0338a {
        INVALID_SOURCE,
        ZIP_EXTRACTION_FAILED,
        CANNOT_CREATE_TEMP_DIR,
        CANNOT_STORE_IN_TEMP_DIR,
        NOT_MODIFIED,
        NO_DATA,
        SUCCESS
    }

    public String a() {
        return this.f21451a;
    }

    public EnumC0338a b() {
        return this.f21452b;
    }

    public a(String str, EnumC0338a enumC0338a) {
        this.f21451a = str;
        this.f21452b = enumC0338a;
    }
}
