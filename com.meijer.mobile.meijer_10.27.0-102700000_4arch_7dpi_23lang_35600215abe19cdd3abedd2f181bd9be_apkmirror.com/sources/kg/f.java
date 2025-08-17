package kg;

import hg.ApplicationInfo;
import jg.InterfaceC14891b;
import kotlin.coroutines.CoroutineContext;
import kv.InterfaceC15323a;

/* loaded from: classes7.dex */
public final class f implements InterfaceC14891b<C15146e> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC15323a<ApplicationInfo> f141881a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC15323a<CoroutineContext> f141882b;

    public static f a(InterfaceC15323a<ApplicationInfo> interfaceC15323a, InterfaceC15323a<CoroutineContext> interfaceC15323a2) {
        return new f(interfaceC15323a, interfaceC15323a2);
    }

    public static C15146e c(ApplicationInfo applicationInfo, CoroutineContext coroutineContext) {
        return new C15146e(applicationInfo, coroutineContext);
    }

    @Override // kv.InterfaceC15323a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C15146e get() {
        return c(this.f141881a.get(), this.f141882b.get());
    }

    public f(InterfaceC15323a<ApplicationInfo> interfaceC15323a, InterfaceC15323a<CoroutineContext> interfaceC15323a2) {
        this.f141881a = interfaceC15323a;
        this.f141882b = interfaceC15323a2;
    }
}
