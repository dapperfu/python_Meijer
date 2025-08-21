package v7;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import u8.InterfaceC17360a;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\n¨\u0006\u000b"}, d2 = {"Lv7/c;", "Lu8/a;", "LT7/c;", "oneAgentLifecycleManager", "<init>", "(LT7/c;)V", "", "a", "()V", "b", "LT7/c;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: v7.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17646c implements InterfaceC17360a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final T7.c oneAgentLifecycleManager;

    public C17646c(T7.c oneAgentLifecycleManager) {
        Intrinsics.j(oneAgentLifecycleManager, "oneAgentLifecycleManager");
        this.oneAgentLifecycleManager = oneAgentLifecycleManager;
    }

    @Override // u8.InterfaceC17360a
    public void a() {
        z8.f.a("dtxLifecycle", "onAppStart");
        this.oneAgentLifecycleManager.b();
    }

    @Override // u8.InterfaceC17360a
    public void b() {
        z8.f.a("dtxStartStop", "stop OneAgent, unregister lifecycle callbacks");
        this.oneAgentLifecycleManager.a();
    }
}
