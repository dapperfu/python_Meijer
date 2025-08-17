package Ra;

/* loaded from: classes4.dex */
public enum c {
    FLYER("flyer"),
    ECOM("ecom");


    /* renamed from: a, reason: collision with root package name */
    private final String f31980a;

    c(String str) {
        this.f31980a = str;
    }

    public static c a(String str) {
        for (c cVar : values()) {
            if (cVar.f31980a.equals(str)) {
                return cVar;
            }
        }
        return null;
    }
}
