package Kb;

import java.util.Map;
import nt.InterfaceC16021c;

/* loaded from: classes4.dex */
public final class i extends com.gimbal.internal.rest.context.a<Void> {

    /* renamed from: d, reason: collision with root package name */
    private final h f16527d;

    public final void i(String str, InterfaceC16021c<Void> interfaceC16021c) {
        d(str, null, null, interfaceC16021c);
    }

    @Override // com.gimbal.internal.rest.context.a
    protected final /* bridge */ /* synthetic */ Void b(String str, Map map, Object obj, Class<Void> cls) {
        this.f16527d.a(str);
        return null;
    }

    public i(h hVar) {
        this.f16527d = hVar;
    }
}
