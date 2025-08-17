package jb;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public final class g<T> implements d<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, C14879a<T>> f139560a = new ConcurrentHashMap();

    @Override // jb.d
    public final C14879a<T> a(String str) {
        return this.f139560a.get(str);
    }

    @Override // jb.d
    public final void b() {
        this.f139560a.clear();
    }

    @Override // jb.d
    public final void a(String str, C14879a<T> c14879a) {
        c14879a.m(str);
        this.f139560a.put(str, c14879a);
    }

    @Override // jb.d
    public final void b(String str) {
        this.f139560a.remove(str);
    }

    @Override // jb.d
    public final Collection<C14879a<T>> c() {
        return this.f139560a.values();
    }

    @Override // jb.d
    public final int a() {
        return this.f139560a.size();
    }
}
