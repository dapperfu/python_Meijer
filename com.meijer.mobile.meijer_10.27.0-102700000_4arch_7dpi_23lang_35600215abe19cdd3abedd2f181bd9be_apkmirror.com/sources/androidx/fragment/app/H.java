package androidx.fragment.app;

import androidx.view.g0;
import java.util.Collection;
import java.util.Map;

@Deprecated
/* loaded from: classes.dex */
public class H {

    /* renamed from: a, reason: collision with root package name */
    private final Collection<Fragment> f54847a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, H> f54848b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, g0> f54849c;

    Map<String, H> a() {
        return this.f54848b;
    }

    Collection<Fragment> b() {
        return this.f54847a;
    }

    Map<String, g0> c() {
        return this.f54849c;
    }

    H(Collection<Fragment> collection, Map<String, H> map, Map<String, g0> map2) {
        this.f54847a = collection;
        this.f54848b = map;
        this.f54849c = map2;
    }
}
