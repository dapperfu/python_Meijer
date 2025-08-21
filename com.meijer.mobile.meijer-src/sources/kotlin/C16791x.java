package kotlin;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import ov.w;
import pv.InterfaceC16562g;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lqv/x;", "T", "Lpv/g;", "Lov/w;", "channel", "<init>", "(Lov/w;)V", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lov/w;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: qv.x, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C16791x<T> implements InterfaceC16562g<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final w<T> channel;

    @Override // pv.InterfaceC16562g
    public Object emit(T t10, Continuation<? super Unit> continuation) {
        Object objR = this.channel.r(t10, continuation);
        return objR == IntrinsicsKt.f() ? objR : Unit.f143329a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C16791x(w<? super T> wVar) {
        this.channel = wVar;
    }
}
