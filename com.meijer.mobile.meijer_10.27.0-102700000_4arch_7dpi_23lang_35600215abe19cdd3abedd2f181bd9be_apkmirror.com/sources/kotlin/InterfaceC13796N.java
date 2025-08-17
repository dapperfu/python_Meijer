package kotlin;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J0\u0010\b\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005H¦@¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\n\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lf0/N;", "Lf0/s;", "Lf0/E;", "", "initialVelocity", "Lkotlin/Function1;", "", "onRemainingDistanceUpdated", "c", "(Lf0/E;FLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "(Lf0/E;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: f0.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC13796N extends InterfaceC13820s {
    Object c(InterfaceC13787E interfaceC13787E, float f10, Function1<? super Float, Unit> function1, Continuation<? super Float> continuation);

    static /* synthetic */ Object b(InterfaceC13796N interfaceC13796N, InterfaceC13787E interfaceC13787E, float f10, Continuation<? super Float> continuation) {
        return interfaceC13796N.c(interfaceC13787E, f10, C13797O.f130277a, continuation);
    }

    @Override // kotlin.InterfaceC13820s
    default Object a(InterfaceC13787E interfaceC13787E, float f10, Continuation<? super Float> continuation) {
        return b(this, interfaceC13787E, f10, continuation);
    }
}
