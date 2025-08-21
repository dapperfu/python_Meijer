package com.meijer.mobile.digitalshopping.api.orders.model.tipandrate;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import pl.TipNotification;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u0004\u0018\u00010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "Lcom/meijer/mobile/digitalshopping/api/orders/model/tipandrate/TipNotificationResponse;", "Lpl/b;", "a", "(Ljava/util/List;)Lpl/b;", "digitalshopping_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a {
    public static final TipNotification a(List<TipNotificationResponse> list) {
        Intrinsics.j(list, "<this>");
        TipNotificationResponse tipNotificationResponse = (TipNotificationResponse) CollectionsKt.u0(list);
        if (tipNotificationResponse != null) {
            return new TipNotification(tipNotificationResponse.getTipData().j(), tipNotificationResponse.getTimeStamp());
        }
        return null;
    }
}
