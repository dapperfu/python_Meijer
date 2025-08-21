package nl;

import com.meijer.mobile.digitalshopping.api.orders.model.orderhistory.DeliveryModeEnum;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0001\u001a\u00020\u0000*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/orders/model/orderhistory/DeliveryModeEnum;", "a", "(Lcom/meijer/mobile/digitalshopping/api/orders/model/orderhistory/DeliveryModeEnum;)Lcom/meijer/mobile/digitalshopping/api/orders/model/orderhistory/DeliveryModeEnum;", "digitalshopping_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: nl.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C15961a {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: nl.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C2356a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DeliveryModeEnum.values().length];
            try {
                iArr[DeliveryModeEnum.DELIVERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DeliveryModeEnum.PICKUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final DeliveryModeEnum a(DeliveryModeEnum deliveryModeEnum) {
        int i10 = deliveryModeEnum == null ? -1 : C2356a.$EnumSwitchMapping$0[deliveryModeEnum.ordinal()];
        return i10 != 1 ? i10 != 2 ? DeliveryModeEnum.NONE : DeliveryModeEnum.PICKUP : DeliveryModeEnum.DELIVERY;
    }
}
