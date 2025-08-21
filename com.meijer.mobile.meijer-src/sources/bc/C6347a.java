package bc;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: bc.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6347a<T> implements InterfaceC6352f<T> {

    /* renamed from: a, reason: collision with root package name */
    private int f60247a = 0;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, T> f60248b = new LinkedHashMap();

    @Override // bc.InterfaceC6352f
    public final void a(String str, T t10) {
        Map<String, T> map = this.f60248b;
        int i10 = this.f60247a;
        if (i10 > 0 && map != null && map.size() >= i10) {
            map.clear();
        }
        this.f60248b.put(str, t10);
    }

    @Override // bc.InterfaceC6352f
    public final int b() {
        return this.f60248b.size();
    }

    @Override // bc.InterfaceC6352f
    public final T b(String str, Class<T> cls) {
        return this.f60248b.get(str);
    }

    @Override // bc.InterfaceC6352f
    public final List<T> c(Class<T> cls) {
        return new ArrayList(this.f60248b.values());
    }

    @Override // bc.InterfaceC6352f
    public final void a(String str) {
        this.f60248b.remove(str);
    }

    @Override // bc.InterfaceC6352f
    public final void a() {
        this.f60248b.clear();
    }
}
