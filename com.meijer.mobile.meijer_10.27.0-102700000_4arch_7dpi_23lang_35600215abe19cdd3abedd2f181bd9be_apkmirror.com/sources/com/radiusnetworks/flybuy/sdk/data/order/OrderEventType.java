package com.radiusnetworks.flybuy.sdk.data.order;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/order/OrderEventType;", "", "(Ljava/lang/String;I)V", "LOCATION_UPDATE", "STATE_CHANGE", "PERMISSION_UPDATE", "CUSTOMER_RATING", "PICKUP_TYPE_CHANGE", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OrderEventType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OrderEventType[] $VALUES;
    public static final OrderEventType LOCATION_UPDATE = new OrderEventType("LOCATION_UPDATE", 0);
    public static final OrderEventType STATE_CHANGE = new OrderEventType("STATE_CHANGE", 1);
    public static final OrderEventType PERMISSION_UPDATE = new OrderEventType("PERMISSION_UPDATE", 2);
    public static final OrderEventType CUSTOMER_RATING = new OrderEventType("CUSTOMER_RATING", 3);
    public static final OrderEventType PICKUP_TYPE_CHANGE = new OrderEventType("PICKUP_TYPE_CHANGE", 4);

    private static final /* synthetic */ OrderEventType[] $values() {
        return new OrderEventType[]{LOCATION_UPDATE, STATE_CHANGE, PERMISSION_UPDATE, CUSTOMER_RATING, PICKUP_TYPE_CHANGE};
    }

    public static EnumEntries<OrderEventType> getEntries() {
        return $ENTRIES;
    }

    public static OrderEventType valueOf(String str) {
        return (OrderEventType) Enum.valueOf(OrderEventType.class, str);
    }

    public static OrderEventType[] values() {
        return (OrderEventType[]) $VALUES.clone();
    }

    static {
        OrderEventType[] orderEventTypeArr$values = $values();
        $VALUES = orderEventTypeArr$values;
        $ENTRIES = EnumEntriesKt.a(orderEventTypeArr$values);
    }

    private OrderEventType(String str, int i10) {
    }
}
