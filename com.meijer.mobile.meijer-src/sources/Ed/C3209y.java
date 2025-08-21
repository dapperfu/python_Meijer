package Ed;

import java.util.Arrays;

/* renamed from: Ed.y, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3209y {

    /* renamed from: a, reason: collision with root package name */
    private final String f7145a;

    /* renamed from: b, reason: collision with root package name */
    private final C3207w f7146b;

    /* renamed from: c, reason: collision with root package name */
    private C3207w f7147c;

    public final C3209y a(String str, Object obj) {
        C3207w c3207w = new C3207w();
        this.f7147c.f7144c = c3207w;
        this.f7147c = c3207w;
        c3207w.f7143b = obj;
        c3207w.f7142a = str;
        return this;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.f7145a);
        sb2.append('{');
        C3207w c3207w = this.f7146b.f7144c;
        String str = "";
        while (c3207w != null) {
            Object obj = c3207w.f7143b;
            sb2.append(str);
            String str2 = c3207w.f7142a;
            if (str2 != null) {
                sb2.append(str2);
                sb2.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r2.length() - 1);
            }
            c3207w = c3207w.f7144c;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }

    /* synthetic */ C3209y(String str, C3208x c3208x) {
        C3207w c3207w = new C3207w();
        this.f7146b = c3207w;
        this.f7147c = c3207w;
        str.getClass();
        this.f7145a = str;
    }
}
