package J7;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import z7.LocalServerData;
import z7.j;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LJ7/d;", "", "LD7/a;", "requestBodyMapper", "Lz7/j;", "retryManager", "<init>", "(LD7/a;Lz7/j;)V", "LJ7/a;", "dispatchableData", "Lz7/f;", "serverData", "", "serverId", "LF7/b;", "a", "(LJ7/a;Lz7/f;Ljava/lang/Integer;)LF7/b;", "LD7/a;", "b", "Lz7/j;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final D7.a requestBodyMapper;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j retryManager;

    public d(D7.a requestBodyMapper, j retryManager) {
        Intrinsics.j(requestBodyMapper, "requestBodyMapper");
        Intrinsics.j(retryManager, "retryManager");
        this.requestBodyMapper = requestBodyMapper;
        this.retryManager = retryManager;
    }

    public final F7.b a(DispatchableData dispatchableData, LocalServerData serverData, Integer serverId) {
        Intrinsics.j(dispatchableData, "dispatchableData");
        Intrinsics.j(serverData, "serverData");
        return new F7.b(dispatchableData.getEndPoint(), this.requestBodyMapper.a(dispatchableData.a()), dispatchableData.getIsPriorityData(), serverData, this.retryManager.b(dispatchableData.getEndPoint()), serverId);
    }
}
