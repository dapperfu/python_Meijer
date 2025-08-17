package kotlin;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sv.EnumC17050a;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0015\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0094@¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Luv/g;", "T", "Luv/f;", "Ltv/f;", "flow", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lsv/a;", "onBufferOverflow", "<init>", "(Ltv/f;Lkotlin/coroutines/CoroutineContext;ILsv/a;)V", "Luv/d;", "j", "(Lkotlin/coroutines/CoroutineContext;ILsv/a;)Luv/d;", "k", "()Ltv/f;", "Ltv/g;", "collector", "", "r", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: uv.g, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C17339g<T> extends AbstractC17338f<T, T> {
    public /* synthetic */ C17339g(InterfaceC17152f interfaceC17152f, CoroutineContext coroutineContext, int i10, EnumC17050a enumC17050a, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC17152f, (i11 & 2) != 0 ? EmptyCoroutineContext.f142646a : coroutineContext, (i11 & 4) != 0 ? -3 : i10, (i11 & 8) != 0 ? EnumC17050a.f161240a : enumC17050a);
    }

    @Override // kotlin.AbstractC17336d
    protected AbstractC17336d<T> j(CoroutineContext context, int capacity, EnumC17050a onBufferOverflow) {
        return new C17339g(this.flow, context, capacity, onBufferOverflow);
    }

    @Override // kotlin.AbstractC17336d
    public InterfaceC17152f<T> k() {
        return (InterfaceC17152f<T>) this.flow;
    }

    @Override // kotlin.AbstractC17338f
    protected Object r(InterfaceC17153g<? super T> interfaceC17153g, Continuation<? super Unit> continuation) {
        Object objCollect = this.flow.collect(interfaceC17153g, continuation);
        return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f142422a;
    }

    public C17339g(InterfaceC17152f<? extends T> interfaceC17152f, CoroutineContext coroutineContext, int i10, EnumC17050a enumC17050a) {
        super(interfaceC17152f, coroutineContext, i10, enumC17050a);
    }
}
