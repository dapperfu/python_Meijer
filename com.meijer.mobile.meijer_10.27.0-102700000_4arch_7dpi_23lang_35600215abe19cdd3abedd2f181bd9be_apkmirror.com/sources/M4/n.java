package M4;

import java.util.HashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class n {

    /* renamed from: c, reason: collision with root package name */
    private static final Set<n> f18920c = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    private final String f18921a;

    /* renamed from: b, reason: collision with root package name */
    private final String f18922b;

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
        this.f18921a = str;
        this.f18922b = str2;
        f18920c.add(this);
    }
}
