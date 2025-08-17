package Tf;

import com.google.firebase.perf.config.RemoteConfigManager;

/* loaded from: classes7.dex */
public final class f implements Bu.d {

    /* renamed from: a, reason: collision with root package name */
    private final a f34969a;

    public static f a(a aVar) {
        return new f(aVar);
    }

    @Override // kv.InterfaceC15323a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RemoteConfigManager get() {
        return c(this.f34969a);
    }

    public f(a aVar) {
        this.f34969a = aVar;
    }

    public static RemoteConfigManager c(a aVar) {
        return (RemoteConfigManager) Bu.c.d(aVar.e());
    }
}
