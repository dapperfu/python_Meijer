package pv;

import kotlin.InterfaceC16783o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import mv.C0;
import ov.EnumC16325a;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u001f\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ-\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0016\u001a\u00020\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0096A¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lpv/C;", "T", "Lpv/F;", "", "Lqv/o;", "flow", "Lmv/C0;", "job", "<init>", "(Lpv/F;Lmv/C0;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lov/a;", "onBufferOverflow", "Lpv/f;", "a", "(Lkotlin/coroutines/CoroutineContext;ILov/a;)Lpv/f;", "Lpv/g;", "collector", "", "collect", "(Lpv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "Lmv/C0;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: pv.C, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C16550C<T> implements InterfaceC16553F<T>, InterfaceC16561f, InterfaceC16783o<T> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ InterfaceC16553F<T> f157415a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C0 job;

    @Override // pv.InterfaceC16553F, pv.InterfaceC16561f
    public Object collect(InterfaceC16562g<? super T> interfaceC16562g, Continuation<?> continuation) {
        return this.f157415a.collect(interfaceC16562g, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C16550C(InterfaceC16553F<? extends T> interfaceC16553F, C0 c02) {
        this.f157415a = interfaceC16553F;
        this.job = c02;
    }

    @Override // kotlin.InterfaceC16783o
    public InterfaceC16561f<T> a(CoroutineContext context, int capacity, EnumC16325a onBufferOverflow) {
        return C16555H.e(this, context, capacity, onBufferOverflow);
    }
}
