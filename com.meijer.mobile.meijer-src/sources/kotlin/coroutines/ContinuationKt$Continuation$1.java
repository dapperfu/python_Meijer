package kotlin.coroutines;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001d\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"kotlin/coroutines/ContinuationKt$Continuation$1", "Lkotlin/coroutines/Continuation;", "Lkotlin/Result;", "result", "", "resumeWith", "(Ljava/lang/Object;)V", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes8.dex */
public final class ContinuationKt$Continuation$1 implements Continuation<Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ CoroutineContext f143551a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<Result<Object>, Unit> f143552b;

    @Override // kotlin.coroutines.Continuation
    /* renamed from: getContext, reason: from getter */
    public CoroutineContext getF143551a() {
        return this.f143551a;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object result) {
        this.f143552b.invoke(Result.a(result));
    }
}
