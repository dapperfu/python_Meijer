package j8;

import java.util.List;

/* renamed from: j8.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14966d {

    /* renamed from: a, reason: collision with root package name */
    public String f140195a;

    /* renamed from: b, reason: collision with root package name */
    public List<String> f140196b;

    public String a() {
        StringBuilder sb2 = new StringBuilder(this.f140195a);
        for (String str : this.f140196b) {
            sb2.append("&");
            sb2.append(str);
        }
        return sb2.toString();
    }

    public C14966d(String str, List<String> list) {
        this.f140195a = str;
        this.f140196b = list;
    }
}
