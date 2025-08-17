package h8;

import java.util.List;
import java.util.Map;

/* renamed from: h8.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14387c {

    /* renamed from: a, reason: collision with root package name */
    public final int f134504a;

    /* renamed from: b, reason: collision with root package name */
    public final String f134505b;

    /* renamed from: c, reason: collision with root package name */
    public final String f134506c;

    /* renamed from: d, reason: collision with root package name */
    public final Map<String, List<String>> f134507d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C14387c c14387c = (C14387c) obj;
            if (this.f134504a != c14387c.f134504a) {
                return false;
            }
            String str = this.f134505b;
            if (str == null ? c14387c.f134505b != null : !str.equals(c14387c.f134505b)) {
                return false;
            }
            String str2 = this.f134506c;
            String str3 = c14387c.f134506c;
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
        int i10 = this.f134504a;
        return i10 >= 200 && i10 <= 299;
    }

    public C14387c(int i10, String str, String str2, Map<String, List<String>> map) {
        this.f134504a = i10;
        this.f134505b = str;
        this.f134506c = str2;
        this.f134507d = map;
    }
}
