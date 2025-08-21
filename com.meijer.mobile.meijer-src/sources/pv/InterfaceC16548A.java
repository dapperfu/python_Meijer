package pv;

import kotlin.Metadata;
import kotlin.SubclassOptInRequired;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H¦@¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0005H'¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lpv/A;", "T", "Lpv/F;", "Lpv/g;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "b", "(Ljava/lang/Object;)Z", "f", "()V", "Lpv/P;", "", "c", "()Lpv/P;", "subscriptionCount", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SubclassOptInRequired
/* renamed from: pv.A, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC16548A<T> extends InterfaceC16553F<T>, InterfaceC16562g<T> {
    boolean b(T value);

    P<Integer> c();

    @Override // pv.InterfaceC16562g
    Object emit(T t10, Continuation<? super Unit> continuation);

    void f();
}
