package androidx.fragment.app;

import androidx.view.g0;
import java.util.Collection;
import java.util.Map;

@Deprecated
/* loaded from: classes.dex */
public class H {

    /* renamed from: a, reason: collision with root package name */
    private final Collection<Fragment> f55071a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, H> f55072b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, g0> f55073c;

    Map<String, H> a() {
        return this.f55072b;
    }

    Collection<Fragment> b() {
        return this.f55071a;
    }

    Map<String, g0> c() {
        return this.f55073c;
    }

    H(Collection<Fragment> collection, Map<String, H> map, Map<String, g0> map2) {
        this.f55071a = collection;
        this.f55072b = map;
        this.f55073c = map2;
    }
}
