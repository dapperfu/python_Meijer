package o6;

/* loaded from: classes4.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final String f153653a;

    /* renamed from: b, reason: collision with root package name */
    public final float f153654b;

    /* renamed from: c, reason: collision with root package name */
    public final float f153655c;

    public boolean a(String str) {
        if (this.f153653a.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.f153653a.endsWith("\r")) {
            String str2 = this.f153653a;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public h(String str, float f10, float f11) {
        this.f153653a = str;
        this.f153655c = f11;
        this.f153654b = f10;
    }
}
