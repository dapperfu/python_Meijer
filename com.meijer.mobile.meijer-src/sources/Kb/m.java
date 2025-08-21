package Kb;

import java.util.Map;
import nt.InterfaceC16021c;

/* loaded from: classes4.dex */
public final class m extends com.gimbal.internal.rest.context.a<Void> {

    /* renamed from: d, reason: collision with root package name */
    private final h f16543d;

    public final void i(String str, Object obj, InterfaceC16021c<Void> interfaceC16021c) {
        d(str, obj, null, interfaceC16021c);
    }

    @Override // com.gimbal.internal.rest.context.a
    protected final /* bridge */ /* synthetic */ Void b(String str, Map map, Object obj, Class<Void> cls) {
        this.f16543d.a(str, obj);
        return null;
    }

    public m(h hVar) {
        this.f16543d = hVar;
    }
}
