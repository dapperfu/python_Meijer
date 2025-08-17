package h8;

import java.util.List;

/* renamed from: h8.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14388d {

    /* renamed from: a, reason: collision with root package name */
    public String f134508a;

    /* renamed from: b, reason: collision with root package name */
    public List<String> f134509b;

    public String a() {
        StringBuilder sb2 = new StringBuilder(this.f134508a);
        for (String str : this.f134509b) {
            sb2.append("&");
            sb2.append(str);
        }
        return sb2.toString();
    }

    public C14388d(String str, List<String> list) {
        this.f134508a = str;
        this.f134509b = list;
    }
}
