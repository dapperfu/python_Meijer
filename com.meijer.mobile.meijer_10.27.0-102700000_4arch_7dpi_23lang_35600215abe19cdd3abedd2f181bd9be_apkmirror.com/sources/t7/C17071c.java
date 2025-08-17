package t7;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import s8.InterfaceC16913a;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\n¨\u0006\u000b"}, d2 = {"Lt7/c;", "Ls8/a;", "LR7/c;", "oneAgentLifecycleManager", "<init>", "(LR7/c;)V", "", "a", "()V", "b", "LR7/c;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: t7.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17071c implements InterfaceC16913a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final R7.c oneAgentLifecycleManager;

    public C17071c(R7.c oneAgentLifecycleManager) {
        Intrinsics.j(oneAgentLifecycleManager, "oneAgentLifecycleManager");
        this.oneAgentLifecycleManager = oneAgentLifecycleManager;
    }

    @Override // s8.InterfaceC16913a
    public void a() {
        x8.f.a("dtxLifecycle", "onAppStart");
        this.oneAgentLifecycleManager.b();
    }

    @Override // s8.InterfaceC16913a
    public void b() {
        x8.f.a("dtxStartStop", "stop OneAgent, unregister lifecycle callbacks");
        this.oneAgentLifecycleManager.a();
    }
}
