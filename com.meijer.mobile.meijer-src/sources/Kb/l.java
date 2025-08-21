package Kb;

import java.util.Map;
import nt.InterfaceC16021c;

/* loaded from: classes4.dex */
public final class l<T> extends com.gimbal.internal.rest.context.a<T> {

    /* renamed from: d, reason: collision with root package name */
    private final h f16542d;

    @Override // com.gimbal.internal.rest.context.a
    protected final T b(String str, Map<String, String> map, Object obj, Class<T> cls) {
        return (T) this.f16542d.c(str, obj, cls);
    }

    public l(h hVar) {
        this.f16542d = hVar;
    }

    public final void i(String str, Object obj, Class<T> cls, InterfaceC16021c<T> interfaceC16021c) {
        d(str, obj, cls, interfaceC16021c);
    }
}
