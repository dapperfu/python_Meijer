package t7;

import Z7.ServerConfigurationV4;
import Z7.h;
import j8.InterfaceC14875b;
import k8.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import y7.AbstractC18186a;
import y7.InterfaceC18187b;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lt7/e;", "Ly7/b;", "Lj8/b;", "legacyServerConfigurationListener", "LZ7/h;", "serverConfigurationDataSource", "LY7/a;", "dynamicConfigDataSource", "<init>", "(Lj8/b;LZ7/h;LY7/a;)V", "Ly7/a;", "agentState", "LZ7/j;", "configurationV4", "", "b", "(Ly7/a;LZ7/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lk8/q;", "configurationV3", "a", "(Lk8/q;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lj8/b;", "LZ7/h;", "c", "LY7/a;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements InterfaceC18187b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14875b legacyServerConfigurationListener;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h serverConfigurationDataSource;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Y7.a dynamicConfigDataSource;

    public e(InterfaceC14875b legacyServerConfigurationListener, h serverConfigurationDataSource, Y7.a dynamicConfigDataSource) {
        Intrinsics.j(legacyServerConfigurationListener, "legacyServerConfigurationListener");
        Intrinsics.j(serverConfigurationDataSource, "serverConfigurationDataSource");
        Intrinsics.j(dynamicConfigDataSource, "dynamicConfigDataSource");
        this.legacyServerConfigurationListener = legacyServerConfigurationListener;
        this.serverConfigurationDataSource = serverConfigurationDataSource;
        this.dynamicConfigDataSource = dynamicConfigDataSource;
    }

    @Override // y7.InterfaceC18187b
    public Object a(q qVar, Continuation<? super Unit> continuation) {
        this.legacyServerConfigurationListener.a(qVar);
        return Unit.f142422a;
    }

    @Override // y7.InterfaceC18187b
    public Object b(AbstractC18186a abstractC18186a, ServerConfigurationV4 serverConfigurationV4, Continuation<? super Unit> continuation) {
        this.legacyServerConfigurationListener.b(abstractC18186a);
        this.dynamicConfigDataSource.a(abstractC18186a);
        Object objC = this.serverConfigurationDataSource.c(serverConfigurationV4, continuation);
        return objC == IntrinsicsKt.f() ? objC : Unit.f142422a;
    }
}
