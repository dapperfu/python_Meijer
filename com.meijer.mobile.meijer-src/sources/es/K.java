package es;

import fj.MultiTenderPaymentInfo;
import fj.TendersItem;
import hj.OrderDetail;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0015\u0010\b\u001a\u00020\u0005*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0015\u0010\n\u001a\u00020\u0005*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0015\u0010\f\u001a\u00020\u0005*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0015\u0010\u000e\u001a\u00020\u0005*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0015\u0010\u0010\u001a\u00020\u0005*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007R\u0015\u0010\u0012\u001a\u00020\u0005*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0007R\u0017\u0010\u0016\u001a\u00020\u0005*\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Les/K;", "", "<init>", "()V", "Lhj/c;", "", "f", "(Lhj/c;)Z", "isOrderReadyForPickup", "e", "isOrderCompleted", "d", "isOrderCanceled", "g", "isOrderUnderModification", "a", "ebtRedLightStatuses", "b", "isEbtOrderNotCompleted", "Lfj/G;", "c", "(Lfj/G;)Z", "isEbtTender", "homescreen_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    public static final K f130659a = new K();

    public final boolean a(OrderDetail orderDetail) {
        Intrinsics.j(orderDetail, "<this>");
        return orderDetail.getOrderStatus() == hj.f.f135701r || orderDetail.getOrderStatus() == hj.f.f135699p;
    }

    public final boolean b(OrderDetail orderDetail) {
        List<TendersItem> listA;
        Intrinsics.j(orderDetail, "<this>");
        MultiTenderPaymentInfo multiTenderPaymentInfo = orderDetail.getMultiTenderPaymentInfo();
        if (multiTenderPaymentInfo == null || (listA = multiTenderPaymentInfo.a()) == null) {
            return false;
        }
        List<TendersItem> list = listA;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (f130659a.c((TendersItem) it.next())) {
                return !e(orderDetail);
            }
        }
        return false;
    }

    public final boolean c(TendersItem tendersItem) {
        return Intrinsics.e(tendersItem != null ? tendersItem.getTenderType() : null, "EBTSnap");
    }

    public final boolean d(OrderDetail orderDetail) {
        Intrinsics.j(orderDetail, "<this>");
        return orderDetail.getOrderStatus() == hj.f.f135699p;
    }

    public final boolean e(OrderDetail orderDetail) {
        Intrinsics.j(orderDetail, "<this>");
        return orderDetail.getOrderStatus() == hj.f.f135698o || orderDetail.getOrderStatus() == hj.f.f135696m || orderDetail.getOrderStatus() == hj.f.f135697n;
    }

    public final boolean f(OrderDetail orderDetail) {
        Intrinsics.j(orderDetail, "<this>");
        return orderDetail.getOrderStatus() == hj.f.f135695l || orderDetail.getOrderStatus() == hj.f.f135702s;
    }

    public final boolean g(OrderDetail orderDetail) {
        Intrinsics.j(orderDetail, "<this>");
        return orderDetail.getOrderStatus() == hj.f.f135689f;
    }

    private K() {
    }
}
