package com.radiusnetworks.flybuy.sdk.data.order;

import androidx.view.AbstractC5985A;
import androidx.view.b0;
import com.radiusnetworks.flybuy.sdk.data.room.domain.Order;
import com.radiusnetworks.flybuy.sdk.data.room.domain.OrderKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/A;", "", "Lcom/radiusnetworks/flybuy/sdk/data/room/domain/Order;", "open", "(Landroidx/lifecycle/A;)Landroidx/lifecycle/A;", "core_defaultRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LocalOrdersDataStoreKt {
    public static final AbstractC5985A<List<Order>> open(AbstractC5985A<List<Order>> abstractC5985A) {
        Intrinsics.j(abstractC5985A, "<this>");
        return b0.d(abstractC5985A, new Function1<List<Order>, List<Order>>() { // from class: com.radiusnetworks.flybuy.sdk.data.order.LocalOrdersDataStoreKt.open.1
            @Override // kotlin.jvm.functions.Function1
            public final List<Order> invoke(List<Order> orders) {
                Intrinsics.j(orders, "orders");
                ArrayList arrayList = new ArrayList();
                for (Object obj : orders) {
                    if (OrderKt.open((Order) obj)) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }
        });
    }
}
