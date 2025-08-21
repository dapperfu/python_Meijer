package B2;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import pv.InterfaceC16561f;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J4\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u001c\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003H¦@¢\u0006\u0004\b\u0006\u0010\u0007J:\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bH¦@¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH¦@¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\fH¦@¢\u0006\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"LB2/s;", "", "T", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "block", "b", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "", "d", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "e", "Lpv/f;", "", "c", "()Lpv/f;", "updateNotifications", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface s {
    Object a(Continuation<? super Integer> continuation);

    <T> Object b(Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super T> continuation);

    InterfaceC16561f<Unit> c();

    <T> Object d(Function2<? super Boolean, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation);

    Object e(Continuation<? super Integer> continuation);
}
