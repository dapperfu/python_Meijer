package I7;

import a8.C5586b;
import a8.InterfaceC5585a;
import b8.C6211g;
import d8.C13494a;
import d8.C13495b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qv.InterfaceC16622O;
import w7.InterfaceC17801a;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LI7/k;", "", "Lqv/O;", "coroutineScope", "Lw7/a;", "timeProvider", "Ls7/h;", "rumEventDispatcher", "LI7/j;", "sessionInformationProvider", "<init>", "(Lqv/O;Lw7/a;Ls7/h;LI7/j;)V", "La8/a;", "a", "()La8/a;", "Lqv/O;", "b", "Lw7/a;", "c", "Ls7/h;", "d", "LI7/j;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16622O coroutineScope;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17801a timeProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final s7.h rumEventDispatcher;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final j sessionInformationProvider;

    public k(InterfaceC16622O coroutineScope, InterfaceC17801a timeProvider, s7.h rumEventDispatcher, j sessionInformationProvider) {
        Intrinsics.j(coroutineScope, "coroutineScope");
        Intrinsics.j(timeProvider, "timeProvider");
        Intrinsics.j(rumEventDispatcher, "rumEventDispatcher");
        Intrinsics.j(sessionInformationProvider, "sessionInformationProvider");
        this.coroutineScope = coroutineScope;
        this.timeProvider = timeProvider;
        this.rumEventDispatcher = rumEventDispatcher;
        this.sessionInformationProvider = sessionInformationProvider;
    }

    public final InterfaceC5585a a() {
        return new C5586b(new C6211g(this.coroutineScope, new C13494a(), new C13495b(this.rumEventDispatcher, this.sessionInformationProvider, this.timeProvider), new c8.h(new c8.j(), new c8.f())));
    }
}
