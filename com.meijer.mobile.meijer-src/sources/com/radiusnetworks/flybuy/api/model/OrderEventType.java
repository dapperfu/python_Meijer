package com.radiusnetworks.flybuy.api.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import og.InterfaceC16127c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/radiusnetworks/flybuy/api/model/OrderEventType;", "", "(Ljava/lang/String;I)V", "locationUpdate", "stateChange", "permissionUpdate", "customerRating", "pickupTypeChange", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OrderEventType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OrderEventType[] $VALUES;

    @InterfaceC16127c("location_update")
    public static final OrderEventType locationUpdate = new OrderEventType("locationUpdate", 0);

    @InterfaceC16127c("state_change")
    public static final OrderEventType stateChange = new OrderEventType("stateChange", 1);

    @InterfaceC16127c("permission_update")
    public static final OrderEventType permissionUpdate = new OrderEventType("permissionUpdate", 2);

    @InterfaceC16127c("customer_rating")
    public static final OrderEventType customerRating = new OrderEventType("customerRating", 3);

    @InterfaceC16127c("pickup_type_change")
    public static final OrderEventType pickupTypeChange = new OrderEventType("pickupTypeChange", 4);

    private static final /* synthetic */ OrderEventType[] $values() {
        return new OrderEventType[]{locationUpdate, stateChange, permissionUpdate, customerRating, pickupTypeChange};
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
