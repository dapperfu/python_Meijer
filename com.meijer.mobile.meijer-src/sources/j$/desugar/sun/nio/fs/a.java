package j$.desugar.sun.nio.fs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public Set f139136a;

    /* renamed from: b, reason: collision with root package name */
    public Map f139137b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f139138c;

    public final boolean b(String str) {
        return this.f139138c || ((HashSet) this.f139136a).contains(str);
    }

    public final void a(String str, Object obj) {
        ((HashMap) this.f139137b).put(str, obj);
    }
}
