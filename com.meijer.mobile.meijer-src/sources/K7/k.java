package K7;

import c8.C6492b;
import c8.InterfaceC6491a;
import d8.C13642g;
import f8.C13967a;
import f8.C13968b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mv.InterfaceC15783O;
import y7.InterfaceC18294a;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LK7/k;", "", "Lmv/O;", "coroutineScope", "Ly7/a;", "timeProvider", "Lu7/h;", "rumEventDispatcher", "LK7/j;", "sessionInformationProvider", "<init>", "(Lmv/O;Ly7/a;Lu7/h;LK7/j;)V", "Lc8/a;", "a", "()Lc8/a;", "Lmv/O;", "b", "Ly7/a;", "c", "Lu7/h;", "d", "LK7/j;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15783O coroutineScope;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC18294a timeProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final u7.h rumEventDispatcher;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final j sessionInformationProvider;

    public k(InterfaceC15783O coroutineScope, InterfaceC18294a timeProvider, u7.h rumEventDispatcher, j sessionInformationProvider) {
        Intrinsics.j(coroutineScope, "coroutineScope");
        Intrinsics.j(timeProvider, "timeProvider");
        Intrinsics.j(rumEventDispatcher, "rumEventDispatcher");
        Intrinsics.j(sessionInformationProvider, "sessionInformationProvider");
        this.coroutineScope = coroutineScope;
        this.timeProvider = timeProvider;
        this.rumEventDispatcher = rumEventDispatcher;
        this.sessionInformationProvider = sessionInformationProvider;
    }

    public final InterfaceC6491a a() {
        return new C6492b(new C13642g(this.coroutineScope, new C13967a(), new C13968b(this.rumEventDispatcher, this.sessionInformationProvider, this.timeProvider), new e8.h(new e8.j(), new e8.f())));
    }
}
