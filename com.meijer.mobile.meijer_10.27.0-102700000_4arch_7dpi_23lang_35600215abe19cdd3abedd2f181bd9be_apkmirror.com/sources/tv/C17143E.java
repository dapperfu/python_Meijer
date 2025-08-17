package tv;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B6\u0012-\u0010\t\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\r\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0096@¢\u0006\u0004\b\r\u0010\u000eR;\u0010\t\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ltv/E;", "T", "Ltv/a;", "Lkotlin/Function2;", "Ltv/g;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "collector", "g", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lkotlin/jvm/functions/Function2;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: tv.E, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C17143E<T> extends AbstractC17147a<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function2<InterfaceC17153g<? super T>, Continuation<? super Unit>, Object> block;

    @Override // tv.AbstractC17147a
    public Object g(InterfaceC17153g<? super T> interfaceC17153g, Continuation<? super Unit> continuation) {
        Object objInvoke = this.block.invoke(interfaceC17153g, continuation);
        return objInvoke == IntrinsicsKt.f() ? objInvoke : Unit.f142422a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C17143E(Function2<? super InterfaceC17153g<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        this.block = function2;
    }
}
