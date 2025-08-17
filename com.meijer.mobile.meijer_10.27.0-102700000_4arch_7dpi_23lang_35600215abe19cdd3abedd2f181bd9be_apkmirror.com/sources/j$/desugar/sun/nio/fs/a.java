package j$.desugar.sun.nio.fs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public Set f138547a;

    /* renamed from: b, reason: collision with root package name */
    public Map f138548b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f138549c;

    public final boolean b(String str) {
        return this.f138549c || ((HashSet) this.f138547a).contains(str);
    }

    public final void a(String str, Object obj) {
        ((HashMap) this.f138548b).put(str, obj);
    }
}
