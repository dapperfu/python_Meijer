package n6;

/* loaded from: classes4.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final String f151051a;

    /* renamed from: b, reason: collision with root package name */
    public final float f151052b;

    /* renamed from: c, reason: collision with root package name */
    public final float f151053c;

    public boolean a(String str) {
        if (this.f151051a.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.f151051a.endsWith("\r")) {
            String str2 = this.f151051a;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public h(String str, float f10, float f11) {
        this.f151051a = str;
        this.f151053c = f11;
        this.f151052b = f10;
    }
}
