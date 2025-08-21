package a8;

import A7.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\n\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"La8/b;", "La8/a;", "<init>", "()V", "LA7/a;", "a", "LA7/a;", "()LA7/a;", "b", "(LA7/a;)V", "agentState", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: a8.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5668b implements InterfaceC5667a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private A7.a agentState = new a.Enabled(false);

    @Override // a8.InterfaceC5667a
    /* renamed from: a, reason: from getter */
    public A7.a getAgentState() {
        return this.agentState;
    }

    @Override // a8.InterfaceC5667a
    public void b(A7.a aVar) {
        Intrinsics.j(aVar, "<set-?>");
        this.agentState = aVar;
    }
}
