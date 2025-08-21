package kotlin;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ov.EnumC16325a;
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0015\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0094@¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lqv/g;", "T", "Lqv/f;", "Lpv/f;", "flow", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lov/a;", "onBufferOverflow", "<init>", "(Lpv/f;Lkotlin/coroutines/CoroutineContext;ILov/a;)V", "Lqv/d;", "j", "(Lkotlin/coroutines/CoroutineContext;ILov/a;)Lqv/d;", "k", "()Lpv/f;", "Lpv/g;", "collector", "", "r", "(Lpv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: qv.g, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C16775g<T> extends AbstractC16774f<T, T> {
    public /* synthetic */ C16775g(InterfaceC16561f interfaceC16561f, CoroutineContext coroutineContext, int i10, EnumC16325a enumC16325a, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC16561f, (i11 & 2) != 0 ? EmptyCoroutineContext.f143553a : coroutineContext, (i11 & 4) != 0 ? -3 : i10, (i11 & 8) != 0 ? EnumC16325a.f155824a : enumC16325a);
    }

    @Override // kotlin.AbstractC16772d
    protected AbstractC16772d<T> j(CoroutineContext context, int capacity, EnumC16325a onBufferOverflow) {
        return new C16775g(this.flow, context, capacity, onBufferOverflow);
    }

    @Override // kotlin.AbstractC16772d
    public InterfaceC16561f<T> k() {
        return (InterfaceC16561f<T>) this.flow;
    }

    @Override // kotlin.AbstractC16774f
    protected Object r(InterfaceC16562g<? super T> interfaceC16562g, Continuation<? super Unit> continuation) {
        Object objCollect = this.flow.collect(interfaceC16562g, continuation);
        return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f143329a;
    }

    public C16775g(InterfaceC16561f<? extends T> interfaceC16561f, CoroutineContext coroutineContext, int i10, EnumC16325a enumC16325a) {
        super(interfaceC16561f, coroutineContext, i10, enumC16325a);
    }
}
