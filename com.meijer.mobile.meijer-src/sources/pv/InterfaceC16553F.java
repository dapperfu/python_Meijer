package pv;

import java.util.List;
import kotlin.Metadata;
import kotlin.SubclassOptInRequired;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\bg\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u001e\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H¦@¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lpv/F;", "T", "Lpv/f;", "Lpv/g;", "collector", "", "collect", "(Lpv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "d", "()Ljava/util/List;", "replayCache", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SubclassOptInRequired
/* renamed from: pv.F, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC16553F<T> extends InterfaceC16561f<T> {
    @Override // pv.InterfaceC16561f
    Object collect(InterfaceC16562g<? super T> interfaceC16562g, Continuation<?> continuation);

    List<T> d();
}
