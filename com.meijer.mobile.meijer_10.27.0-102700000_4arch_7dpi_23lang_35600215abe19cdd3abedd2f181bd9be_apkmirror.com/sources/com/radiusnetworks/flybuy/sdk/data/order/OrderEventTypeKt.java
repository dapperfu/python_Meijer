package com.radiusnetworks.flybuy.sdk.data.order;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0000¨\u0006\u0004"}, d2 = {"toApiOrderEventType", "Lcom/radiusnetworks/flybuy/api/model/OrderEventType;", "Lcom/radiusnetworks/flybuy/sdk/data/order/OrderEventType;", "toOrderEventType", "core_defaultRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OrderEventTypeKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[OrderEventType.values().length];
            try {
                iArr[OrderEventType.LOCATION_UPDATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderEventType.STATE_CHANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OrderEventType.PERMISSION_UPDATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OrderEventType.CUSTOMER_RATING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OrderEventType.PICKUP_TYPE_CHANGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.radiusnetworks.flybuy.api.model.OrderEventType.values().length];
            try {
                iArr2[com.radiusnetworks.flybuy.api.model.OrderEventType.locationUpdate.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.radiusnetworks.flybuy.api.model.OrderEventType.stateChange.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[com.radiusnetworks.flybuy.api.model.OrderEventType.permissionUpdate.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[com.radiusnetworks.flybuy.api.model.OrderEventType.customerRating.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[com.radiusnetworks.flybuy.api.model.OrderEventType.pickupTypeChange.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final com.radiusnetworks.flybuy.api.model.OrderEventType toApiOrderEventType(OrderEventType orderEventType) {
        Intrinsics.j(orderEventType, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[orderEventType.ordinal()];
        if (i10 == 1) {
            return com.radiusnetworks.flybuy.api.model.OrderEventType.locationUpdate;
        }
        if (i10 == 2) {
            return com.radiusnetworks.flybuy.api.model.OrderEventType.stateChange;
        }
        if (i10 == 3) {
            return com.radiusnetworks.flybuy.api.model.OrderEventType.permissionUpdate;
        }
        if (i10 == 4) {
            return com.radiusnetworks.flybuy.api.model.OrderEventType.customerRating;
        }
        if (i10 == 5) {
            return com.radiusnetworks.flybuy.api.model.OrderEventType.pickupTypeChange;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final OrderEventType toOrderEventType(com.radiusnetworks.flybuy.api.model.OrderEventType orderEventType) {
        Intrinsics.j(orderEventType, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$1[orderEventType.ordinal()];
        if (i10 == 1) {
            return OrderEventType.LOCATION_UPDATE;
        }
        if (i10 == 2) {
            return OrderEventType.STATE_CHANGE;
        }
        if (i10 == 3) {
            return OrderEventType.PERMISSION_UPDATE;
        }
        if (i10 == 4) {
            return OrderEventType.CUSTOMER_RATING;
        }
        if (i10 == 5) {
            return OrderEventType.PICKUP_TYPE_CHANGE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
