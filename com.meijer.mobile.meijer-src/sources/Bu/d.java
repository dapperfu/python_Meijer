package Bu;

import io.constructor.data.memory.ConfigMemoryHolder;
import xu.C18225c;
import xu.InterfaceC18226d;

/* loaded from: classes8.dex */
public final class d implements InterfaceC18226d {

    /* renamed from: a, reason: collision with root package name */
    private final c f3672a;

    public static d a(c cVar) {
        return new d(cVar);
    }

    @Override // gv.InterfaceC14411a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConfigMemoryHolder get() {
        return c(this.f3672a);
    }

    public d(c cVar) {
        this.f3672a = cVar;
    }

    public static ConfigMemoryHolder c(c cVar) {
        return (ConfigMemoryHolder) C18225c.d(cVar.a());
    }
}
