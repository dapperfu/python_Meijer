package v7;

import a8.InterfaceC5667a;
import b8.ServerConfigurationV4;
import b8.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import l8.InterfaceC15474b;
import m8.q;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lv7/e;", "LA7/b;", "Ll8/b;", "legacyServerConfigurationListener", "Lb8/h;", "serverConfigurationDataSource", "La8/a;", "dynamicConfigDataSource", "<init>", "(Ll8/b;Lb8/h;La8/a;)V", "LA7/a;", "agentState", "Lb8/j;", "configurationV4", "", "b", "(LA7/a;Lb8/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lm8/q;", "configurationV3", "a", "(Lm8/q;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll8/b;", "Lb8/h;", "c", "La8/a;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements A7.b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15474b legacyServerConfigurationListener;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h serverConfigurationDataSource;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5667a dynamicConfigDataSource;

    public e(InterfaceC15474b legacyServerConfigurationListener, h serverConfigurationDataSource, InterfaceC5667a dynamicConfigDataSource) {
        Intrinsics.j(legacyServerConfigurationListener, "legacyServerConfigurationListener");
        Intrinsics.j(serverConfigurationDataSource, "serverConfigurationDataSource");
        Intrinsics.j(dynamicConfigDataSource, "dynamicConfigDataSource");
        this.legacyServerConfigurationListener = legacyServerConfigurationListener;
        this.serverConfigurationDataSource = serverConfigurationDataSource;
        this.dynamicConfigDataSource = dynamicConfigDataSource;
    }

    @Override // A7.b
    public Object a(q qVar, Continuation<? super Unit> continuation) {
        this.legacyServerConfigurationListener.b(qVar);
        return Unit.f143329a;
    }

    @Override // A7.b
    public Object b(A7.a aVar, ServerConfigurationV4 serverConfigurationV4, Continuation<? super Unit> continuation) {
        this.legacyServerConfigurationListener.a(aVar);
        this.dynamicConfigDataSource.b(aVar);
        Object objC = this.serverConfigurationDataSource.c(serverConfigurationV4, continuation);
        return objC == IntrinsicsKt.f() ? objC : Unit.f143329a;
    }
}
