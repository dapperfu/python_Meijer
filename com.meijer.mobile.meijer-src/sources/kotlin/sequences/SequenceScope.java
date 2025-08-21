package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.RestrictsSuspension;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

@SinceKotlin
@RestrictsSuspension
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B\t\b\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH¦@¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u000f\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lkotlin/sequences/SequenceScope;", "T", "", "<init>", "()V", "value", "", "c", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "iterator", "d", "(Ljava/util/Iterator;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/sequences/Sequence;", "sequence", "f", "(Lkotlin/sequences/Sequence;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class SequenceScope<T> {
    public abstract Object c(T t10, Continuation<? super Unit> continuation);

    public abstract Object d(Iterator<? extends T> it, Continuation<? super Unit> continuation);

    public final Object f(Sequence<? extends T> sequence, Continuation<? super Unit> continuation) {
        Object objD = d(sequence.iterator(), continuation);
        if (objD == IntrinsicsKt.f()) {
            return objD;
        }
        return Unit.f143329a;
    }
}
