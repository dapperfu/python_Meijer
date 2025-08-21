package Kb;

import java.util.Map;
import nt.InterfaceC16021c;

/* loaded from: classes4.dex */
public final class k<T> extends com.gimbal.internal.rest.context.a<T> {

    /* renamed from: d, reason: collision with root package name */
    private final h f16541d;

    public final void i(String str, Class<T> cls, InterfaceC16021c<T> interfaceC16021c) {
        d(str, null, cls, interfaceC16021c);
    }

    @Override // com.gimbal.internal.rest.context.a
    protected final T b(String str, Map<String, String> map, Object obj, Class<T> cls) {
        return map != null ? (T) this.f16541d.d(str, cls, map) : (T) this.f16541d.b(str, cls);
    }

    public k(h hVar) {
        this.f16541d = hVar;
    }
}
