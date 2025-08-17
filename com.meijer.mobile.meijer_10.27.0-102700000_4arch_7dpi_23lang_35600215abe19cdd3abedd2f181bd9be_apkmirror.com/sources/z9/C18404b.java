package z9;

import e9.AbstractC13636a;

/* renamed from: z9.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C18404b extends AbstractC13636a {

    /* renamed from: a, reason: collision with root package name */
    private final String f171662a;

    @Override // e9.AbstractC13636a, e9.d
    public String K() {
        return "url LIKE ?";
    }

    @Override // e9.AbstractC13636a, e9.d
    public String[] f() {
        return new String[]{this.f171662a};
    }

    public C18404b(String str) {
        G9.b.c(str, "Pattern must not be null!");
        this.f171662a = str;
    }
}
