package N4;

import java.util.HashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class n {

    /* renamed from: c, reason: collision with root package name */
    private static final Set<n> f20583c = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    private final String f20584a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20585b;

    public static class a extends n {
        a(String str, String str2) {
            super(str, str2);
        }
    }

    public static class b extends n {
        b(String str, String str2) {
            super(str, str2);
        }
    }

    n(String str, String str2) {
        this.f20584a = str;
        this.f20585b = str2;
        f20583c.add(this);
    }
}
