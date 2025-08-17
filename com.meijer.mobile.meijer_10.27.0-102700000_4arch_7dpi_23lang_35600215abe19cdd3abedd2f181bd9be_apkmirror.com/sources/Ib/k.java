package Ib;

import java.util.Map;
import nt.InterfaceC15945c;

/* loaded from: classes4.dex */
public final class k<T> extends com.gimbal.internal.rest.context.a<T> {

    /* renamed from: d, reason: collision with root package name */
    private final h f13795d;

    public final void i(String str, Class<T> cls, InterfaceC15945c<T> interfaceC15945c) {
        d(str, null, cls, interfaceC15945c);
    }

    @Override // com.gimbal.internal.rest.context.a
    protected final T b(String str, Map<String, String> map, Object obj, Class<T> cls) {
        return map != null ? (T) this.f13795d.d(str, cls, map) : (T) this.f13795d.b(str, cls);
    }

    public k(h hVar) {
        this.f13795d = hVar;
    }
}
