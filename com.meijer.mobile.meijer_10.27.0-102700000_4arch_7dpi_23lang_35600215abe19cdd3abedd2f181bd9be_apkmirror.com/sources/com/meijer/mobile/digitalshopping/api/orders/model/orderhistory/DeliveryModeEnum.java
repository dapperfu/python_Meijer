package com.meijer.mobile.digitalshopping.api.orders.model.orderhistory;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@i(generateAdapter = false)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/orders/model/orderhistory/DeliveryModeEnum;", "", "<init>", "(Ljava/lang/String;I)V", "DELIVERY", "PICKUP", "NONE", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DeliveryModeEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DeliveryModeEnum[] $VALUES;

    @g(name = "delivery")
    public static final DeliveryModeEnum DELIVERY = new DeliveryModeEnum("DELIVERY", 0);

    @g(name = "pickup")
    public static final DeliveryModeEnum PICKUP = new DeliveryModeEnum("PICKUP", 1);
    public static final DeliveryModeEnum NONE = new DeliveryModeEnum("NONE", 2);

    private static final /* synthetic */ DeliveryModeEnum[] a() {
        return new DeliveryModeEnum[]{DELIVERY, PICKUP, NONE};
    }

    static {
        DeliveryModeEnum[] deliveryModeEnumArrA = a();
        $VALUES = deliveryModeEnumArrA;
        $ENTRIES = EnumEntriesKt.a(deliveryModeEnumArrA);
    }

    public static DeliveryModeEnum valueOf(String str) {
        return (DeliveryModeEnum) Enum.valueOf(DeliveryModeEnum.class, str);
    }

    public static DeliveryModeEnum[] values() {
        return (DeliveryModeEnum[]) $VALUES.clone();
    }

    private DeliveryModeEnum(String str, int i10) {
    }
}
