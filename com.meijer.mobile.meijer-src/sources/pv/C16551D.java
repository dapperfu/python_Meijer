package pv;

import kotlin.InterfaceC16783o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import mv.C0;
import ov.EnumC16325a;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u001f\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ-\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0016\u001a\u00020\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0096A¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00028\u00008\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lpv/D;", "T", "Lpv/P;", "", "Lqv/o;", "flow", "Lmv/C0;", "job", "<init>", "(Lpv/P;Lmv/C0;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lov/a;", "onBufferOverflow", "Lpv/f;", "a", "(Lkotlin/coroutines/CoroutineContext;ILov/a;)Lpv/f;", "Lpv/g;", "collector", "", "collect", "(Lpv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "Lmv/C0;", "getValue", "()Ljava/lang/Object;", "value", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: pv.D, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C16551D<T> implements P<T>, InterfaceC16561f, InterfaceC16783o<T> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ P<T> f157417a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C0 job;

    @Override // pv.InterfaceC16553F, pv.InterfaceC16561f
    public Object collect(InterfaceC16562g<? super T> interfaceC16562g, Continuation<?> continuation) {
        return this.f157417a.collect(interfaceC16562g, continuation);
    }

    @Override // pv.P
    public T getValue() {
        return this.f157417a.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C16551D(P<? extends T> p10, C0 c02) {
        this.f157417a = p10;
        this.job = c02;
    }

    @Override // kotlin.InterfaceC16783o
    public InterfaceC16561f<T> a(CoroutineContext context, int capacity, EnumC16325a onBufferOverflow) {
        return S.d(this, context, capacity, onBufferOverflow);
    }
}
