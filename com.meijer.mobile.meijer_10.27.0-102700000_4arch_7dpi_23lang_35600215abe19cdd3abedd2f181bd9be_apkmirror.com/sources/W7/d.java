package W7;

import com.dynatrace.agent.storage.db.EventRecord;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000bH¦@¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH¦@¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\u001a\u001a\u00020\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH¦@¢\u0006\u0004\b\u001a\u0010\u0012J\u001e\u0010\u001b\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000bH¦@¢\u0006\u0004\b\u001b\u0010\u0012¨\u0006\u001c"}, d2 = {"LW7/d;", "", "Lcom/dynatrace/agent/storage/db/EventRecord;", "eventRecord", "", "b", "(Lcom/dynatrace/agent/storage/db/EventRecord;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isPriority", "", "limitRows", "", "LW7/f;", "d", "(ZILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "recordIds", "e", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "now", "retentionTime", "g", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "eventRecords", "a", "f", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface d {
    Object a(List<EventRecord> list, Continuation<? super Unit> continuation);

    Object b(EventRecord eventRecord, Continuation<? super Unit> continuation);

    Object c(Continuation<? super Unit> continuation);

    Object d(boolean z10, int i10, Continuation<? super List<EventMetadata>> continuation);

    Object e(List<Long> list, Continuation<? super List<EventRecord>> continuation);

    Object f(List<Long> list, Continuation<? super Unit> continuation);

    Object g(long j10, long j11, Continuation<? super Unit> continuation);
}
