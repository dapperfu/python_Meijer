package kl;

import com.meijer.mobile.cart.model.hybris.checkout.HybrisContactInformation;
import com.meijer.mobile.cart.model.hybris.checkout.HybrisPickupPerson;
import com.meijer.mobile.cart.model.hybris.checkout.SubmitOrderRequest;
import com.meijer.mobile.cart.model.hybris.timeslots.HybrisPickupSlotInfo;
import com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice;
import fj.DeliveryMode;
import fj.ShoppingCart;
import fj.SubstitutePreference;
import gj.ContactInformation;
import gj.PickupPerson;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import lj.C15512a;
import lj.C15513b;
import rj.C16914a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkl/v;", "Lcom/meijer/mobile/cart/model/hybris/checkout/SubmitOrderRequest;", "a", "(Lkl/v;)Lcom/meijer/mobile/cart/model/hybris/checkout/SubmitOrderRequest;", "digitalshopping_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class w {
    public static final SubmitOrderRequest a(CheckoutState checkoutState) {
        String phoneNumber;
        String str;
        String email;
        String str2;
        HybrisPrice hybrisPriceB;
        nk.b ebtApprovedAmount;
        Intrinsics.j(checkoutState, "<this>");
        ShoppingCart shoppingCartE = checkoutState.i().e();
        if ((shoppingCartE != null ? shoppingCartE.getOriginalOrderId() : null) != null) {
            return new SubmitOrderRequest(null, null, false, null, null, null, null, null, null, null, 1023, null);
        }
        String deliveryInstructions = checkoutState.getDeliveryInstructions();
        DeliveryMode deliveryModeE = checkoutState.m().e();
        if (Intrinsics.e(deliveryModeE != null ? deliveryModeE.getCode() : null, "delivery")) {
            ContactInformation contactInformationE = checkoutState.j().e();
            if (contactInformationE != null) {
                phoneNumber = contactInformationE.getPhoneNumber();
                str = phoneNumber;
            }
            str = null;
        } else {
            PickupPerson pickupPersonE = checkoutState.u().e();
            if (pickupPersonE != null) {
                phoneNumber = pickupPersonE.getPhoneNumber();
                str = phoneNumber;
            }
            str = null;
        }
        boolean earlyDelivery = checkoutState.getEarlyDelivery();
        DeliveryMode deliveryModeE2 = checkoutState.m().e();
        if (Intrinsics.e(deliveryModeE2 != null ? deliveryModeE2.getCode() : null, "delivery")) {
            ContactInformation contactInformationE2 = checkoutState.j().e();
            if (contactInformationE2 != null) {
                email = contactInformationE2.getEmailAddress();
                str2 = email;
            }
            str2 = null;
        } else {
            PickupPerson pickupPersonE2 = checkoutState.u().e();
            if (pickupPersonE2 != null) {
                email = pickupPersonE2.getEmail();
                str2 = email;
            }
            str2 = null;
        }
        PickupPerson pickupPersonE3 = checkoutState.u().e();
        HybrisPickupPerson hybrisPickupPersonB = pickupPersonE3 != null ? C15513b.b(pickupPersonE3) : null;
        HybrisPickupSlotInfo hybrisPickupSlotInfoB = C16914a.b(checkoutState.x().e());
        SubstitutePreference substitutePreferenceE = checkoutState.w().e();
        String code = substitutePreferenceE != null ? substitutePreferenceE.getCode() : null;
        if (code == null) {
            code = "";
        }
        String str3 = code;
        ContactInformation contactInformationE3 = checkoutState.j().e();
        HybrisContactInformation hybrisContactInformationA = contactInformationE3 != null ? C15512a.a(contactInformationE3) : null;
        if (checkoutState.p().e() == null || (ebtApprovedAmount = checkoutState.getEbtApprovedAmount()) == null || (hybrisPriceB = Lo.b.b(ebtApprovedAmount)) == null) {
            hybrisPriceB = Lo.b.b(Co.l.f("", null, 0.0d, "", 0.0d, null, 54, null));
        }
        return new SubmitOrderRequest(deliveryInstructions, str, earlyDelivery, str2, hybrisPickupPersonB, hybrisPickupSlotInfoB, hybrisContactInformationA, str3, null, hybrisPriceB, 256, null);
    }
}
