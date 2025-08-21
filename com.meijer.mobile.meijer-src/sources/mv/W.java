package mv;

import kotlin.Metadata;
import kotlin.SubclassOptInRequired;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u0010\u0010\u0003\u001a\u00028\u0000H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00028\u0000H'¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lmv/W;", "T", "Lmv/C0;", "H", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "i", "()Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SubclassOptInRequired
/* loaded from: classes14.dex */
public interface W<T> extends C0 {
    Object H(Continuation<? super T> continuation);

    T i();
}
