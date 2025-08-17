package hm;

import Co.Image;
import Co.ProductFullDetails;
import ej.Entry;
import es.K;
import gj.OrderDetail;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import uo.OrderOutOfStockItem;
import wl.OrderSubstitutionsDetail;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0010\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\n\u001a\u00020\t2\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\r2\u0006\u0010\n\u001a\u00020\t2\u0010\u0010\u0018\u001a\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\r¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lhm/d;", "", "<init>", "()V", "Lwl/a;", "fetchedOrderWithSubstitution", "", "b", "(Lwl/a;)Z", "Lgj/c;", "fetchedOrder", "c", "(Lgj/c;Lwl/a;)Z", "", "Luo/a;", "listOutOfStockItems", "a", "(Lwl/a;Ljava/util/List;)Z", "", "Lcom/meijer/mobile/core/models/products/ProductCode;", "productCode", "LCo/h;", "e", "(Lgj/c;Ljava/lang/String;)LCo/h;", "productCodeList", "d", "(Lgj/c;Ljava/util/List;)Ljava/util/List;", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: hm.d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C14502d {

    /* renamed from: a, reason: collision with root package name */
    public static final C14502d f135708a = new C14502d();

    public final boolean b(OrderSubstitutionsDetail fetchedOrderWithSubstitution) {
        return (fetchedOrderWithSubstitution == null || fetchedOrderWithSubstitution.getHasUserConfirmedSubstitutionPreferences()) ? false : true;
    }

    public final boolean a(OrderSubstitutionsDetail fetchedOrderWithSubstitution, List<OrderOutOfStockItem> listOutOfStockItems) {
        Intrinsics.j(listOutOfStockItems, "listOutOfStockItems");
        return (b(fetchedOrderWithSubstitution) || listOutOfStockItems.isEmpty()) ? false : true;
    }

    public final boolean c(OrderDetail fetchedOrder, OrderSubstitutionsDetail fetchedOrderWithSubstitution) {
        List<OrderSubstitutionsDetail.LineItem> listB;
        Intrinsics.j(fetchedOrder, "fetchedOrder");
        if (!K.f129818a.f(fetchedOrder) || fetchedOrderWithSubstitution == null || (listB = fetchedOrderWithSubstitution.b()) == null) {
            return false;
        }
        List<OrderSubstitutionsDetail.LineItem> list = listB;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((OrderSubstitutionsDetail.LineItem) it.next()).getCustomerSubstitutionPreference() != null) {
                return true;
            }
        }
        return false;
    }

    public final List<ProductFullDetails> d(OrderDetail fetchedOrder, List<String> productCodeList) {
        Intrinsics.j(fetchedOrder, "fetchedOrder");
        Intrinsics.j(productCodeList, "productCodeList");
        ArrayList arrayList = new ArrayList();
        for (Entry entry : fetchedOrder.u()) {
            Iterator<T> it = productCodeList.iterator();
            while (it.hasNext()) {
                if (Intrinsics.e(entry.m().getCode(), (String) it.next())) {
                    List<Image> listJ = entry.m().j();
                    mk.b pricePerUnit = entry.getPricePerUnit();
                    arrayList.add(new ProductFullDetails(entry.m().getCode(), entry.m().getName(), 0, false, false, false, null, null, listJ, null, false, false, false, false, false, false, false, pricePerUnit, false, null, null, false, null, false, 0, null, entry.getActualQuantity(), null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, false, null, 0, -67240196, 268435455, null));
                }
            }
        }
        return arrayList;
    }

    public final ProductFullDetails e(OrderDetail fetchedOrder, String productCode) {
        Intrinsics.j(fetchedOrder, "fetchedOrder");
        Intrinsics.j(productCode, "productCode");
        for (Entry entry : fetchedOrder.u()) {
            if (Intrinsics.e(entry.m().getCode(), productCode)) {
                List<Image> listJ = entry.m().j();
                mk.b pricePerUnit = entry.getPricePerUnit();
                return new ProductFullDetails(entry.m().getCode(), entry.m().getName(), 0, false, false, false, null, null, listJ, null, false, false, false, false, false, false, false, pricePerUnit, false, null, null, false, null, false, 0, null, entry.getActualQuantity(), null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, false, null, 0, -67240196, 268435455, null);
            }
        }
        return null;
    }

    private C14502d() {
    }
}
