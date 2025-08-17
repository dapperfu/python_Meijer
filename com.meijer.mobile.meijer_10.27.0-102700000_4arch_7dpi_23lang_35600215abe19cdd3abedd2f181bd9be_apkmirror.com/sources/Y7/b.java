package Y7;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import y7.AbstractC18186a;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\n\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\u0005\u0010\t¨\u0006\u000b"}, d2 = {"LY7/b;", "LY7/a;", "<init>", "()V", "Ly7/a;", "a", "Ly7/a;", "b", "()Ly7/a;", "(Ly7/a;)V", "agentState", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private AbstractC18186a agentState = new AbstractC18186a.Enabled(false);

    @Override // Y7.a
    public void a(AbstractC18186a abstractC18186a) {
        Intrinsics.j(abstractC18186a, "<set-?>");
        this.agentState = abstractC18186a;
    }

    @Override // Y7.a
    /* renamed from: b, reason: from getter */
    public AbstractC18186a getAgentState() {
        return this.agentState;
    }
}
