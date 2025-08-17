package Z7;

import W7.EndPointInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0006H¦@¢\u0006\u0004\b\t\u0010\u0004¨\u0006\n"}, d2 = {"LZ7/b;", "", "LW7/a;", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "endPointInfo", "", "c", "(LW7/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface b {
    Object a(Continuation<? super Unit> continuation);

    Object b(Continuation<? super EndPointInfo> continuation);

    Object c(EndPointInfo endPointInfo, Continuation<? super Unit> continuation);
}
