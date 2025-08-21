package z7;

import Y7.EndPointInfo;
import com.dynatrace.agent.storage.db.EventRecord;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\t\u0010\nJ>\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH¦@¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lz7/h;", "", "LI7/d;", "configResponse", "LY7/a;", "targetEndpoint", "Lz7/j;", "retryManager", "Lz7/a;", "b", "(LI7/d;LY7/a;Lz7/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dataResponse", "", "Lcom/dynatrace/agent/storage/db/EventRecord;", "sentData", "", "moreDataPending", "a", "(LI7/d;LY7/a;Ljava/util/List;Lz7/j;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/time/Duration;", "c", "()J", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface h {
    Object a(I7.d dVar, EndPointInfo endPointInfo, List<EventRecord> list, j jVar, boolean z10, Continuation<? super CommunicationContext> continuation);

    Object b(I7.d dVar, EndPointInfo endPointInfo, j jVar, Continuation<? super CommunicationContext> continuation);

    long c();
}
