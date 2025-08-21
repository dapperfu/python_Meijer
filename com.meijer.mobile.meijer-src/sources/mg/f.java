package mg;

import gv.InterfaceC14411a;
import jg.ApplicationInfo;
import kotlin.coroutines.CoroutineContext;
import lg.InterfaceC15490b;

/* loaded from: classes8.dex */
public final class f implements InterfaceC15490b<C15717e> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC14411a<ApplicationInfo> f151027a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC14411a<CoroutineContext> f151028b;

    public static f a(InterfaceC14411a<ApplicationInfo> interfaceC14411a, InterfaceC14411a<CoroutineContext> interfaceC14411a2) {
        return new f(interfaceC14411a, interfaceC14411a2);
    }

    public static C15717e c(ApplicationInfo applicationInfo, CoroutineContext coroutineContext) {
        return new C15717e(applicationInfo, coroutineContext);
    }

    @Override // gv.InterfaceC14411a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C15717e get() {
        return c(this.f151027a.get(), this.f151028b.get());
    }

    public f(InterfaceC14411a<ApplicationInfo> interfaceC14411a, InterfaceC14411a<CoroutineContext> interfaceC14411a2) {
        this.f151027a = interfaceC14411a;
        this.f151028b = interfaceC14411a2;
    }
}
