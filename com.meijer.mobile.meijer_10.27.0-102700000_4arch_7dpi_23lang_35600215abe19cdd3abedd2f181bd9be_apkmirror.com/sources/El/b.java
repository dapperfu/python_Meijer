package El;

import Gl.FlyBuyOrderDetail;
import com.meijer.mobile.fulfillment.flybuy.api.models.FlyBuyAreaJson;
import com.meijer.mobile.fulfillment.flybuy.api.models.FlyBuyOrderData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/fulfillment/flybuy/api/models/FlyBuyOrderData;", "LGl/b$c;", "a", "(Lcom/meijer/mobile/fulfillment/flybuy/api/models/FlyBuyOrderData;)LGl/b$c;", "flybuy_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class b {
    public static final FlyBuyOrderDetail.FlyBuyOrder a(FlyBuyOrderData flyBuyOrderData) {
        String str;
        List listM;
        Intrinsics.j(flyBuyOrderData, "<this>");
        String type = flyBuyOrderData.getType();
        Integer order_id = flyBuyOrderData.getOrder_id();
        FlyBuyOrderDetail.Companion.EnumC0175b enumC0175bB = c.b(flyBuyOrderData.getOrder_state());
        String redemption_url = flyBuyOrderData.getRedemption_url();
        FlyBuyOrderDetail.Companion.EnumC0174a enumC0174aA = c.a(flyBuyOrderData.getCustomer_state());
        Integer id2 = flyBuyOrderData.getId();
        String arrived_at = flyBuyOrderData.getArrived_at();
        String eta_at = flyBuyOrderData.getEta_at();
        String partner_identifier = flyBuyOrderData.getPartner_identifier();
        String partner_display_identifier = flyBuyOrderData.getPartner_display_identifier();
        String partner_identifier_for_crew = flyBuyOrderData.getPartner_identifier_for_crew();
        String partner_identifier_for_customer = flyBuyOrderData.getPartner_identifier_for_customer();
        String state = flyBuyOrderData.getState();
        String redemption_code = flyBuyOrderData.getRedemption_code();
        String created_at = flyBuyOrderData.getCreated_at();
        String updated_at = flyBuyOrderData.getUpdated_at();
        String area_name = flyBuyOrderData.getArea_name();
        List<FlyBuyAreaJson> listY = flyBuyOrderData.y();
        if (listY != null) {
            List<FlyBuyAreaJson> list = listY;
            str = type;
            listM = new ArrayList(CollectionsKt.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                listM.add(a.a((FlyBuyAreaJson) it.next()));
            }
        } else {
            str = type;
            listM = null;
        }
        if (listM == null) {
            listM = CollectionsKt.m();
        }
        return new FlyBuyOrderDetail.FlyBuyOrder(str, order_id, enumC0175bB, redemption_url, enumC0174aA, id2, arrived_at, eta_at, partner_identifier, partner_display_identifier, partner_identifier_for_crew, partner_identifier_for_customer, state, redemption_code, created_at, updated_at, area_name, listM, flyBuyOrderData.getCustomer_id(), flyBuyOrderData.getSite_id(), flyBuyOrderData.getSite_partner_identifier(), flyBuyOrderData.getSpot_identifier(), flyBuyOrderData.getCustomer_name(), flyBuyOrderData.getCustomer_car_type(), flyBuyOrderData.getCustomer_car_color(), flyBuyOrderData.getCustomer_license_plate(), flyBuyOrderData.getCustomer_rating_value(), flyBuyOrderData.getCustomer_rating_value_string(), flyBuyOrderData.getCustomer_rating_comments(), flyBuyOrderData.getPickup_window(), flyBuyOrderData.getPickup_type(), flyBuyOrderData.getPush_token(), flyBuyOrderData.G(), flyBuyOrderData.getDelivery_error_reviewed_at(), flyBuyOrderData.getDelivery_errored_at());
    }
}
