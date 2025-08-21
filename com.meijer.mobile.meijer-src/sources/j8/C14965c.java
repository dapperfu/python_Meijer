package j8;

import java.util.List;
import java.util.Map;

/* renamed from: j8.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14965c {

    /* renamed from: a, reason: collision with root package name */
    public final int f140191a;

    /* renamed from: b, reason: collision with root package name */
    public final String f140192b;

    /* renamed from: c, reason: collision with root package name */
    public final String f140193c;

    /* renamed from: d, reason: collision with root package name */
    public final Map<String, List<String>> f140194d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C14965c c14965c = (C14965c) obj;
            if (this.f140191a != c14965c.f140191a) {
                return false;
            }
            String str = this.f140192b;
            if (str == null ? c14965c.f140192b != null : !str.equals(c14965c.f140192b)) {
                return false;
            }
            String str2 = this.f140193c;
            String str3 = c14965c.f140193c;
            if (str2 != null) {
                return str2.equals(str3);
            }
            if (str3 == null) {
                return true;
            }
        }
        return false;
    }

    public boolean a() {
        int i10 = this.f140191a;
        return i10 >= 200 && i10 <= 299;
    }

    public C14965c(int i10, String str, String str2, Map<String, List<String>> map) {
        this.f140191a = i10;
        this.f140192b = str;
        this.f140193c = str2;
        this.f140194d = map;
    }
}
