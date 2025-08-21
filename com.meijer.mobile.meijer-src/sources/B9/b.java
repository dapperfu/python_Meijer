package B9;

import g9.AbstractC14340a;

/* loaded from: classes4.dex */
public class b extends AbstractC14340a {

    /* renamed from: a, reason: collision with root package name */
    private final String f2576a;

    @Override // g9.AbstractC14340a, g9.d
    public String K() {
        return "url LIKE ?";
    }

    @Override // g9.AbstractC14340a, g9.d
    public String[] f() {
        return new String[]{this.f2576a};
    }

    public b(String str) {
        I9.b.c(str, "Pattern must not be null!");
        this.f2576a = str;
    }
}
