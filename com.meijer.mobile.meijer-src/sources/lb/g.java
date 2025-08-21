package lb;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public final class g<T> implements d<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, C15478a<T>> f149574a = new ConcurrentHashMap();

    @Override // lb.d
    public final C15478a<T> a(String str) {
        return this.f149574a.get(str);
    }

    @Override // lb.d
    public final void b() {
        this.f149574a.clear();
    }

    @Override // lb.d
    public final void a(String str, C15478a<T> c15478a) {
        c15478a.m(str);
        this.f149574a.put(str, c15478a);
    }

    @Override // lb.d
    public final void b(String str) {
        this.f149574a.remove(str);
    }

    @Override // lb.d
    public final Collection<C15478a<T>> c() {
        return this.f149574a.values();
    }

    @Override // lb.d
    public final int a() {
        return this.f149574a.size();
    }
}
