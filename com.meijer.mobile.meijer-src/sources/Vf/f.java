package Vf;

import com.google.firebase.perf.config.RemoteConfigManager;
import xu.C18225c;
import xu.InterfaceC18226d;

/* loaded from: classes8.dex */
public final class f implements InterfaceC18226d {

    /* renamed from: a, reason: collision with root package name */
    private final a f39902a;

    public static f a(a aVar) {
        return new f(aVar);
    }

    @Override // gv.InterfaceC14411a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RemoteConfigManager get() {
        return c(this.f39902a);
    }

    public f(a aVar) {
        this.f39902a = aVar;
    }

    public static RemoteConfigManager c(a aVar) {
        return (RemoteConfigManager) C18225c.d(aVar.e());
    }
}
