package il;

import fj.ShoppingCart;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import pv.InterfaceC16561f;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J$\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tR&\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n8&X§\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\t\u001a\u0004\b\r\u0010\u000eR \u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, d2 = {"Lil/f;", "", "", "setCalculate", "retainOutOfStockItems", "", "d", "(ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reset", "()V", "Lio/reactivex/l;", "Luk/c;", "Lfj/C;", "b", "()Lio/reactivex/l;", "getShoppingCartStream$annotations", "shoppingCartStream", "Lpv/f;", "c", "()Lpv/f;", "shoppingCartFlow", "", "a", "totalItemCountFlow", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: il.f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC14774f {
    InterfaceC16561f<Integer> a();

    io.reactivex.l<uk.c<ShoppingCart>> b();

    InterfaceC16561f<uk.c<ShoppingCart>> c();

    Object d(boolean z10, boolean z11, Continuation<? super Unit> continuation);

    void reset();

    static /* synthetic */ Object e(InterfaceC14774f interfaceC14774f, boolean z10, boolean z11, Continuation continuation, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadCart");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        return interfaceC14774f.d(z10, z11, continuation);
    }
}
