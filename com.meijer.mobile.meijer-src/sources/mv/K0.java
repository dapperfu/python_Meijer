package mv;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import sv.C17168a;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B8\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lmv/K0;", "Lmv/U0;", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "Lkotlin/Function2;", "Lmv/O;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)V", "Q0", "()V", "d", "Lkotlin/coroutines/Continuation;", "continuation", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
final class K0 extends U0 {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Continuation<Unit> continuation;

    public K0(CoroutineContext coroutineContext, Function2<? super InterfaceC15783O, ? super Continuation<? super Unit>, ? extends Object> function2) {
        super(coroutineContext, false);
        this.continuation = IntrinsicsKt.a(function2, this, this);
    }

    @Override // mv.H0
    protected void Q0() throws Throwable {
        C17168a.b(this.continuation, this);
    }
}
