package O5;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f23224a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC0380a f23225b;

    /* renamed from: O5.a$a, reason: collision with other inner class name */
    public enum EnumC0380a {
        INVALID_SOURCE,
        ZIP_EXTRACTION_FAILED,
        CANNOT_CREATE_TEMP_DIR,
        CANNOT_STORE_IN_TEMP_DIR,
        NOT_MODIFIED,
        NO_DATA,
        SUCCESS
    }

    public String a() {
        return this.f23224a;
    }

    public EnumC0380a b() {
        return this.f23225b;
    }

    public a(String str, EnumC0380a enumC0380a) {
        this.f23224a = str;
        this.f23225b = enumC0380a;
    }
}
