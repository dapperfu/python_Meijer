package Cd;

import java.util.Arrays;

/* renamed from: Cd.y, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3006y {

    /* renamed from: a, reason: collision with root package name */
    private final String f3833a;

    /* renamed from: b, reason: collision with root package name */
    private final C3004w f3834b;

    /* renamed from: c, reason: collision with root package name */
    private C3004w f3835c;

    public final C3006y a(String str, Object obj) {
        C3004w c3004w = new C3004w();
        this.f3835c.f3832c = c3004w;
        this.f3835c = c3004w;
        c3004w.f3831b = obj;
        c3004w.f3830a = str;
        return this;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.f3833a);
        sb2.append('{');
        C3004w c3004w = this.f3834b.f3832c;
        String str = "";
        while (c3004w != null) {
            Object obj = c3004w.f3831b;
            sb2.append(str);
            String str2 = c3004w.f3830a;
            if (str2 != null) {
                sb2.append(str2);
                sb2.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r2.length() - 1);
            }
            c3004w = c3004w.f3832c;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }

    /* synthetic */ C3006y(String str, C3005x c3005x) {
        C3004w c3004w = new C3004w();
        this.f3834b = c3004w;
        this.f3835c = c3004w;
        str.getClass();
        this.f3833a = str;
    }
}
