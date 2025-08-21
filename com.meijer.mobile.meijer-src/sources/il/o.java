package il;

import Tq.PointOfService;
import fj.Entry;
import hj.OrderDetail;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import pp.CriteoCartEntry;
import pp.CriteoOrder;
import yk.C18328d;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhj/c;", "Lpp/b;", "b", "(Lhj/c;)Lpp/b;", "digitalshopping_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class o {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int c() {
        return 0;
    }

    public static final CriteoOrder b(OrderDetail orderDetail) {
        Intrinsics.j(orderDetail, "<this>");
        PointOfService pointOfService = orderDetail.getPointOfService();
        int iB = C18328d.b(pointOfService != null ? Integer.valueOf(pointOfService.getStoreId()) : null, new Function0() { // from class: il.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(o.c());
            }
        });
        String code = orderDetail.getCode();
        List<Entry> listU = orderDetail.u();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listU, 10));
        for (Entry entry : listU) {
            arrayList.add(new CriteoCartEntry(entry.m().getCode(), entry.getActualQuantity(), entry.m().getPrice(), entry.getTotalPrice()));
        }
        return new CriteoOrder(iB, code, arrayList);
    }
}
