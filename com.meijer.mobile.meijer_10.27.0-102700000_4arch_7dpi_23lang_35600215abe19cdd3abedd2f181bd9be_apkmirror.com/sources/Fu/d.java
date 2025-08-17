package Fu;

import io.constructor.data.memory.ConfigMemoryHolder;

/* loaded from: classes7.dex */
public final class d implements Bu.d {

    /* renamed from: a, reason: collision with root package name */
    private final c f11077a;

    public static d a(c cVar) {
        return new d(cVar);
    }

    @Override // kv.InterfaceC15323a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConfigMemoryHolder get() {
        return c(this.f11077a);
    }

    public d(c cVar) {
        this.f11077a = cVar;
    }

    public static ConfigMemoryHolder c(c cVar) {
        return (ConfigMemoryHolder) Bu.c.d(cVar.a());
    }
}
