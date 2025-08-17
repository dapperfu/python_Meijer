package Zb;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class a<T> implements f<T> {

    /* renamed from: a, reason: collision with root package name */
    private int f42580a = 0;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, T> f42581b = new LinkedHashMap();

    @Override // Zb.f
    public final void a(String str, T t10) {
        Map<String, T> map = this.f42581b;
        int i10 = this.f42580a;
        if (i10 > 0 && map != null && map.size() >= i10) {
            map.clear();
        }
        this.f42581b.put(str, t10);
    }

    @Override // Zb.f
    public final int b() {
        return this.f42581b.size();
    }

    @Override // Zb.f
    public final T b(String str, Class<T> cls) {
        return this.f42581b.get(str);
    }

    @Override // Zb.f
    public final List<T> c(Class<T> cls) {
        return new ArrayList(this.f42581b.values());
    }

    @Override // Zb.f
    public final void a(String str) {
        this.f42581b.remove(str);
    }

    @Override // Zb.f
    public final void a() {
        this.f42581b.clear();
    }
}
