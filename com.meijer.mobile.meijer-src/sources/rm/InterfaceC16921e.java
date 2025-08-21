package rm;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import sm.StoreDetails;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦@¢\u0006\u0004\b\u0004\u0010\u0005J8\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tH¦@¢\u0006\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lrm/e;", "", "", "Lsm/a;", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "latitude", "longitude", "", "searchRadiusInMiles", "maxStores", "c", "(DDIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "instoreshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: rm.e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC16921e {
    Object b(Continuation<? super List<StoreDetails>> continuation);

    Object c(double d10, double d11, int i10, int i11, Continuation<? super List<StoreDetails>> continuation);

    static /* synthetic */ Object a(InterfaceC16921e interfaceC16921e, double d10, double d11, int i10, int i11, Continuation continuation, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNearbyShopAndScanStores");
        }
        if ((i12 & 8) != 0) {
            i11 = 10;
        }
        return interfaceC16921e.c(d10, d11, i10, i11, continuation);
    }
}
