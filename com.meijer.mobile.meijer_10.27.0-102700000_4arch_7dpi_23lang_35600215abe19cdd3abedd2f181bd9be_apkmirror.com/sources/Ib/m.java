package Ib;

import java.util.Map;
import nt.InterfaceC15945c;

/* loaded from: classes4.dex */
public final class m extends com.gimbal.internal.rest.context.a<Void> {

    /* renamed from: d, reason: collision with root package name */
    private final h f13797d;

    public final void i(String str, Object obj, InterfaceC15945c<Void> interfaceC15945c) {
        d(str, obj, null, interfaceC15945c);
    }

    @Override // com.gimbal.internal.rest.context.a
    protected final /* bridge */ /* synthetic */ Void b(String str, Map map, Object obj, Class<Void> cls) {
        this.f13797d.a(str, obj);
        return null;
    }

    public m(h hVar) {
        this.f13797d = hVar;
    }
}
