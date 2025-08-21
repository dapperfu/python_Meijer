package pv;

import kotlin.AbstractC16772d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ov.EnumC16325a;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BT\u0012-\u0010\t\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0015\u001a\u00020\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0094@¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R;\u0010\t\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lpv/d;", "T", "Lqv/d;", "Lkotlin/Function2;", "Lov/t;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lov/a;", "onBufferOverflow", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/CoroutineContext;ILov/a;)V", "j", "(Lkotlin/coroutines/CoroutineContext;ILov/a;)Lqv/d;", "scope", "i", "(Lov/t;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "d", "Lkotlin/jvm/functions/Function2;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: pv.d, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C16559d<T> extends AbstractC16772d<T> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Function2<ov.t<? super T>, Continuation<? super Unit>, Object> block;

    public /* synthetic */ C16559d(Function2 function2, CoroutineContext coroutineContext, int i10, EnumC16325a enumC16325a, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2, (i11 & 2) != 0 ? EmptyCoroutineContext.f143553a : coroutineContext, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? EnumC16325a.f155824a : enumC16325a);
    }

    static /* synthetic */ <T> Object o(C16559d<T> c16559d, ov.t<? super T> tVar, Continuation<? super Unit> continuation) {
        Object objInvoke = ((C16559d) c16559d).block.invoke(tVar, continuation);
        return objInvoke == IntrinsicsKt.f() ? objInvoke : Unit.f143329a;
    }

    @Override // kotlin.AbstractC16772d
    protected AbstractC16772d<T> j(CoroutineContext context, int capacity, EnumC16325a onBufferOverflow) {
        return new C16559d(this.block, context, capacity, onBufferOverflow);
    }

    @Override // kotlin.AbstractC16772d
    public String toString() {
        return "block[" + this.block + "] -> " + super.toString();
    }

    @Override // kotlin.AbstractC16772d
    protected Object i(ov.t<? super T> tVar, Continuation<? super Unit> continuation) {
        return o(this, tVar, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C16559d(Function2<? super ov.t<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2, CoroutineContext coroutineContext, int i10, EnumC16325a enumC16325a) {
        super(coroutineContext, i10, enumC16325a);
        this.block = function2;
    }
}
