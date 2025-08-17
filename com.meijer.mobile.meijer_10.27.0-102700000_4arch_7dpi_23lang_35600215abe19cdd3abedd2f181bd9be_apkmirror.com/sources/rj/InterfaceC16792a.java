package rj;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.meijer.mobile.address.model.hybris.HybrisCustomerAddress;
import com.meijer.mobile.authentication.core.model.BearerToken;
import com.meijer.mobile.cart.model.hybris.Cart;
import com.meijer.mobile.cart.model.hybris.CartModification;
import com.meijer.mobile.cart.model.hybris.CartModifications;
import com.meijer.mobile.cart.model.hybris.DeliveryConfirmRequest;
import com.meijer.mobile.cart.model.hybris.HybrisBatchEntryUpdateRequest;
import com.meijer.mobile.cart.model.hybris.HybrisHighValuePromoRequest;
import com.meijer.mobile.cart.model.hybris.HybrisProactiveSubstituteRequest;
import com.meijer.mobile.cart.model.hybris.MultiTenderPaymentDetailsCreateRequest;
import com.meijer.mobile.cart.model.hybris.SubstitutionNotesRequest;
import com.meijer.mobile.cart.model.hybris.checkout.SubmitOrderRequest;
import com.meijer.mobile.cart.model.hybris.orderdetails.OrderDetailResponse;
import com.meijer.mobile.cart.model.hybris.promos.HybrisApplyPromoCodeResponse;
import com.meijer.mobile.cart.model.hybris.timeslots.HybrisPickupSlotInfo;
import com.meijer.mobile.gateway.common.api.Fields;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u0000 `2\u00020\u0001:\u0001`Jd\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u00022\f\b\u0003\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\f\b\u0001\u0010\t\u001a\u00060\u0007j\u0002`\b2\b\b\u0003\u0010\u000b\u001a\u00020\n2\b\b\u0003\u0010\r\u001a\u00020\f2\b\b\u0003\u0010\u000e\u001a\u00020\n2\b\b\u0003\u0010\u000f\u001a\u00020\nH§@¢\u0006\u0004\b\u0012\u0010\u0013JF\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u00022\f\b\u0003\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\f\b\u0001\u0010\t\u001a\u00060\u0007j\u0002`\b2\b\b\u0003\u0010\u000f\u001a\u00020\nH§@¢\u0006\u0004\b\u0014\u0010\u0015Jh\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u00022\f\b\u0001\u0010\u0017\u001a\u00060\u0004j\u0002`\u00162\b\b\u0003\u0010\u0019\u001a\u00020\u00182\f\b\u0003\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\f\b\u0001\u0010\t\u001a\u00060\u0007j\u0002`\b2\b\b\u0003\u0010\r\u001a\u00020\f2\b\b\u0003\u0010\u000f\u001a\u00020\nH§@¢\u0006\u0004\b\u001b\u0010\u001cJd\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u001d\u001a\u00020\u00072\f\b\u0001\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\b\b\u0001\u0010\u0019\u001a\u00020\u00182\f\b\u0001\u0010\t\u001a\u00060\u0007j\u0002`\b2\b\b\u0003\u0010\r\u001a\u00020\f2\b\b\u0003\u0010\u000f\u001a\u00020\nH§@¢\u0006\u0004\b\u001e\u0010\u001fJZ\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u001d\u001a\u00020\u00072\f\b\u0003\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\f\b\u0001\u0010\t\u001a\u00060\u0007j\u0002`\b2\b\b\u0003\u0010\r\u001a\u00020\f2\b\b\u0003\u0010\u000f\u001a\u00020\nH§@¢\u0006\u0004\b!\u0010\"JF\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u00022\f\b\u0001\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\f\b\u0001\u0010\t\u001a\u00060\u0007j\u0002`\b2\b\b\u0003\u0010\u000f\u001a\u00020\nH§@¢\u0006\u0004\b#\u0010\u0015JF\u0010$\u001a\b\u0012\u0004\u0012\u00020 0\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u00022\f\b\u0003\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\f\b\u0001\u0010\t\u001a\u00060\u0007j\u0002`\b2\b\b\u0003\u0010\u000f\u001a\u00020\nH§@¢\u0006\u0004\b$\u0010\u0015JP\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u00022\f\b\u0003\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\f\b\u0001\u0010\t\u001a\u00060\u0007j\u0002`\b2\b\b\u0003\u0010\r\u001a\u00020\f2\b\b\u0003\u0010\u000f\u001a\u00020\nH§@¢\u0006\u0004\b&\u0010'JZ\u0010)\u001a\b\u0012\u0004\u0012\u00020%0\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u00022\f\b\u0003\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\f\b\u0001\u0010\t\u001a\u00060\u0007j\u0002`\b2\b\b\u0003\u0010(\u001a\u00020\n2\b\b\u0003\u0010\r\u001a\u00020\f2\b\b\u0003\u0010\u000f\u001a\u00020\nH§@¢\u0006\u0004\b)\u0010*Jf\u0010.\u001a\b\u0012\u0004\u0012\u00020 0\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u00022\f\b\u0003\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\b\b\u0001\u0010,\u001a\u00020+2\f\b\u0001\u0010\t\u001a\u00060\u0007j\u0002`\b2\b\b\u0003\u0010(\u001a\u00020\n2\n\b\u0003\u0010-\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\u000f\u001a\u00020\nH§@¢\u0006\u0004\b.\u0010/Jh\u00105\u001a\b\u0012\u0004\u0012\u00020 0\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u00022\f\b\u0003\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\b\b\u0001\u00101\u001a\u0002002\f\b\u0001\u0010\t\u001a\u00060\u0007j\u0002`\b2\b\b\u0001\u00102\u001a\u00020\n2\f\b\u0001\u00104\u001a\u00060\u0004j\u0002`32\b\b\u0003\u0010\u000f\u001a\u00020\nH§@¢\u0006\u0004\b5\u00106JZ\u00109\u001a\b\u0012\u0004\u0012\u00020 0\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u00022\f\b\u0003\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\b\b\u0001\u0010\u001d\u001a\u00020\u00072\f\b\u0001\u0010\t\u001a\u00060\u0007j\u0002`\b2\b\b\u0001\u00108\u001a\u0002072\b\b\u0003\u0010\u000f\u001a\u00020\nH§@¢\u0006\u0004\b9\u0010:JL\u0010=\u001a\b\u0012\u0004\u0012\u00020 0\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u00022\f\b\u0003\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\b\b\u0001\u0010<\u001a\u00020;2\b\b\u0003\u0010\r\u001a\u00020\f2\b\b\u0003\u0010\u000f\u001a\u00020\nH§@¢\u0006\u0004\b=\u0010>JP\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u00022\f\b\u0003\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\f\b\u0001\u0010\t\u001a\u00060\u0007j\u0002`\b2\b\b\u0003\u0010\r\u001a\u00020\f2\b\b\u0001\u0010@\u001a\u00020?H§@¢\u0006\u0004\bA\u0010BJV\u0010G\u001a\b\u0012\u0004\u0012\u00020F0\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u00022\f\b\u0003\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\b\b\u0001\u0010D\u001a\u00020C2\b\b\u0003\u0010E\u001a\u00020\n2\b\b\u0003\u0010\r\u001a\u00020\f2\b\b\u0003\u0010\u000f\u001a\u00020\nH§@¢\u0006\u0004\bG\u0010HJZ\u0010K\u001a\b\u0012\u0004\u0012\u00020J0\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u00022\f\b\u0003\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\b\b\u0001\u0010I\u001a\u00020\u00042\f\b\u0001\u0010\t\u001a\u00060\u0007j\u0002`\b2\b\b\u0003\u0010\r\u001a\u00020\f2\b\b\u0003\u0010\u000f\u001a\u00020\nH§@¢\u0006\u0004\bK\u0010LJL\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u00022\f\b\u0003\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\b\b\u0001\u0010N\u001a\u00020M2\b\b\u0003\u0010\r\u001a\u00020\f2\b\b\u0003\u0010\u000f\u001a\u00020\nH§@¢\u0006\u0004\bO\u0010PJZ\u0010T\u001a\b\u0012\u0004\u0012\u00020%0\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u00022\f\b\u0003\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\b\b\u0003\u0010Q\u001a\u00020\n2\f\b\u0001\u0010\t\u001a\u00060\u0007j\u0002`\b2\b\b\u0001\u0010S\u001a\u00020R2\b\b\u0003\u0010\u000f\u001a\u00020\nH§@¢\u0006\u0004\bT\u0010UJZ\u0010W\u001a\b\u0012\u0004\u0012\u00020%0\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u00022\f\b\u0003\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\f\b\u0001\u0010\t\u001a\u00060\u0007j\u0002`\b2\b\b\u0003\u0010\r\u001a\u00020\f2\b\b\u0001\u0010V\u001a\u00020R2\b\b\u0003\u0010\u000f\u001a\u00020\nH§@¢\u0006\u0004\bW\u0010XJP\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u00022\f\b\u0003\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\f\b\u0001\u0010\t\u001a\u00060\u0007j\u0002`\b2\b\b\u0001\u0010Z\u001a\u00020Y2\b\b\u0003\u0010\u000f\u001a\u00020\nH§@¢\u0006\u0004\b[\u0010\\JP\u0010^\u001a\b\u0012\u0004\u0012\u00020 0\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u00022\f\b\u0003\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\b\b\u0001\u0010]\u001a\u00020\u00042\f\b\u0001\u0010\t\u001a\u00060\u0007j\u0002`\b2\b\b\u0003\u0010\u000f\u001a\u00020\nH§@¢\u0006\u0004\b^\u0010_ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006aÀ\u0006\u0001"}, d2 = {"Lrj/a;", "", "Lcom/meijer/mobile/authentication/core/model/BearerToken;", "authToken", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "cartId", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "", "calculateForLC", "Lcom/meijer/mobile/gateway/common/api/Fields;", "fields", "fetchCartModification", "retainItemsInCart", "Lretrofit2/Response;", "Lcom/meijer/mobile/cart/model/hybris/Cart;", "j", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Ljava/lang/String;IZLcom/meijer/mobile/gateway/common/api/Fields;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "k", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Ljava/lang/String;IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/core/models/products/ProductCode;", "upc", "", "quantity", "Lcom/meijer/mobile/cart/model/hybris/CartModification;", "M", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Ljava/lang/String;DLjava/lang/String;ILcom/meijer/mobile/gateway/common/api/Fields;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "entryNumber", "r", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;ILjava/lang/String;DILcom/meijer/mobile/gateway/common/api/Fields;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "L", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;ILjava/lang/String;ILcom/meijer/mobile/gateway/common/api/Fields;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "z", "N", "Lcom/meijer/mobile/cart/model/hybris/CartModifications;", "q", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Ljava/lang/String;ILcom/meijer/mobile/gateway/common/api/Fields;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deliveryAddressIsAlcoholEligible", "d", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Ljava/lang/String;IZLcom/meijer/mobile/gateway/common/api/Fields;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/address/model/hybris/HybrisCustomerAddress;", "deliveryAddress", "partnerEligibility", "O", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Ljava/lang/String;Lcom/meijer/mobile/address/model/hybris/HybrisCustomerAddress;IZLjava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/cart/model/hybris/DeliveryConfirmRequest;", "deliveryConfirmRequest", "isPartnerSelection", "Lcom/meijer/mobile/cart/model/common/principal/UserId;", "externalShopperId", "J", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Ljava/lang/String;Lcom/meijer/mobile/cart/model/hybris/DeliveryConfirmRequest;IZLjava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/cart/model/hybris/SubstitutionNotesRequest;", "notes", "G", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Ljava/lang/String;IILcom/meijer/mobile/cart/model/hybris/SubstitutionNotesRequest;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/cart/model/hybris/MultiTenderPaymentDetailsCreateRequest;", "paymentDetails", "P", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Ljava/lang/String;Lcom/meijer/mobile/cart/model/hybris/MultiTenderPaymentDetailsCreateRequest;Lcom/meijer/mobile/gateway/common/api/Fields;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/cart/model/hybris/timeslots/HybrisPickupSlotInfo;", "pickUpSlotInfo", "u", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Ljava/lang/String;ILcom/meijer/mobile/gateway/common/api/Fields;Lcom/meijer/mobile/cart/model/hybris/timeslots/HybrisPickupSlotInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/cart/model/hybris/checkout/SubmitOrderRequest;", "orderDetails", "refreshCart", "Lcom/meijer/mobile/cart/model/hybris/orderdetails/OrderDetailResponse;", "I", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Ljava/lang/String;Lcom/meijer/mobile/cart/model/hybris/checkout/SubmitOrderRequest;ZLcom/meijer/mobile/gateway/common/api/Fields;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "promoCode", "Lcom/meijer/mobile/cart/model/hybris/promos/HybrisApplyPromoCodeResponse;", "B", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Ljava/lang/String;Ljava/lang/String;ILcom/meijer/mobile/gateway/common/api/Fields;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/cart/model/hybris/HybrisHighValuePromoRequest;", "highValuePromoRequest", "F", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Ljava/lang/String;Lcom/meijer/mobile/cart/model/hybris/HybrisHighValuePromoRequest;Lcom/meijer/mobile/gateway/common/api/Fields;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "allowPartialUpdate", "Lcom/meijer/mobile/cart/model/hybris/HybrisBatchEntryUpdateRequest;", "batchEntryUpdateRequest", "h", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Ljava/lang/String;ZILcom/meijer/mobile/cart/model/hybris/HybrisBatchEntryUpdateRequest;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "entries", "s", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Ljava/lang/String;ILcom/meijer/mobile/gateway/common/api/Fields;Lcom/meijer/mobile/cart/model/hybris/HybrisBatchEntryUpdateRequest;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/cart/model/hybris/HybrisProactiveSubstituteRequest;", "substitutes", "i", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Ljava/lang/String;ILcom/meijer/mobile/cart/model/hybris/HybrisProactiveSubstituteRequest;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "productId", "D", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Ljava/lang/String;Ljava/lang/String;IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: rj.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC16792a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f158672a;

    @Headers({"Accept: application/json", "Content-Type: application/json"})
    @POST("carts/{cartId}/promos")
    Object B(@Header("Authorization") BearerToken bearerToken, @Path("cartId") String str, @Query("promoCode") String str2, @Query(PlaceTypes.STORE) int i10, @Query("fields") Fields fields, @Header("retainOutOfStock") boolean z10, Continuation<? super Response<HybrisApplyPromoCodeResponse>> continuation);

    @DELETE("carts/{cartId}/product/{productId}/delete-substitution-preference")
    @Headers({"Accept: application/json", "Content-Type: application/json"})
    Object D(@Header("Authorization") BearerToken bearerToken, @Path("cartId") String str, @Path("productId") String str2, @Query(PlaceTypes.STORE) int i10, @Header("retainOutOfStock") boolean z10, Continuation<? super Response<Unit>> continuation);

    @Headers({"Accept: application/json", "Content-Type: application/json"})
    @PUT("carts/{cartId}/highValueSelection/update")
    Object F(@Header("Authorization") BearerToken bearerToken, @Path("cartId") String str, @Body HybrisHighValuePromoRequest hybrisHighValuePromoRequest, @Query("fields") Fields fields, @Header("retainOutOfStock") boolean z10, Continuation<? super Response<Cart>> continuation);

    @Headers({"Accept: application/json", "Content-Type: application/json"})
    @PATCH("carts/{cartId}/entries/{entryNumber}/saveNotes")
    Object G(@Header("Authorization") BearerToken bearerToken, @Path("cartId") String str, @Path("entryNumber") int i10, @Query(PlaceTypes.STORE) int i11, @Body SubstitutionNotesRequest substitutionNotesRequest, @Header("retainOutOfStock") boolean z10, Continuation<? super Response<Unit>> continuation);

    @Headers({"Accept: application/json", "Content-Type: application/json", "READ_TIMEOUT_MILLIS:120000"})
    @POST("carts/{cartId}/submit-pretip")
    Object I(@Header("Authorization") BearerToken bearerToken, @Path("cartId") String str, @Body SubmitOrderRequest submitOrderRequest, @Query("refreshCart") boolean z10, @Query("fields") Fields fields, @Header("retainOutOfStock") boolean z11, Continuation<? super Response<OrderDetailResponse>> continuation);

    @Headers({"Accept: application/json", "Content-Type: application/json"})
    @POST("carts/{cartId}/fulfillment-method/delivery/confirm-partners")
    Object J(@Header("Authorization") BearerToken bearerToken, @Path("cartId") String str, @Body DeliveryConfirmRequest deliveryConfirmRequest, @Query(PlaceTypes.STORE) int i10, @Query("partnerSelection") boolean z10, @Query("userId") String str2, @Header("retainOutOfStock") boolean z11, Continuation<? super Response<Unit>> continuation);

    @Deprecated
    @DELETE("carts/{cartId}/entries/{entryNumber}")
    @Headers({"Accept: application/json"})
    Object L(@Header("Authorization") BearerToken bearerToken, @Path("entryNumber") int i10, @Path("cartId") String str, @Query(PlaceTypes.STORE) int i11, @Query("fields") Fields fields, @Header("retainOutOfStock") boolean z10, Continuation<? super Response<Unit>> continuation);

    @Deprecated
    @Headers({"Accept: application/json", "Content-Type: application/json"})
    @POST("carts/{cartId}/add/{upc}/{quantity}")
    Object M(@Header("Authorization") BearerToken bearerToken, @Path("upc") String str, @Path("quantity") double d10, @Path("cartId") String str2, @Query(PlaceTypes.STORE) int i10, @Query("fields") Fields fields, @Header("retainOutOfStock") boolean z10, Continuation<? super Response<CartModification>> continuation);

    @Headers({"Accept: application/json"})
    @POST("carts/{cartId}/fulfillment-method/pickup/confirm")
    Object N(@Header("Authorization") BearerToken bearerToken, @Path("cartId") String str, @Query(PlaceTypes.STORE) int i10, @Header("retainOutOfStock") boolean z10, Continuation<? super Response<Unit>> continuation);

    @Headers({"Accept: application/json", "Content-Type: application/json"})
    @POST("carts/{cartId}/fulfillment-method/delivery/confirm")
    Object O(@Header("Authorization") BearerToken bearerToken, @Path("cartId") String str, @Body HybrisCustomerAddress hybrisCustomerAddress, @Query(PlaceTypes.STORE) int i10, @Query("deliveryAddressIsAlcoholEligible") boolean z10, @Query("partnerEligibility") String str2, @Header("retainOutOfStock") boolean z11, Continuation<? super Response<Unit>> continuation);

    @Headers({"Accept: application/json", "Content-Type: application/json"})
    @POST("carts/{cartId}/payment/add/multi")
    Object P(@Header("Authorization") BearerToken bearerToken, @Path("cartId") String str, @Body MultiTenderPaymentDetailsCreateRequest multiTenderPaymentDetailsCreateRequest, @Query("fields") Fields fields, @Header("retainOutOfStock") boolean z10, Continuation<? super Response<Unit>> continuation);

    @Headers({"Accept: application/json"})
    @GET("carts/{cartId}/fulfillment-method/delivery/impact")
    Object d(@Header("Authorization") BearerToken bearerToken, @Path("cartId") String str, @Query(PlaceTypes.STORE) int i10, @Query("deliveryAddressIsAlcoholEligible") boolean z10, @Query("fields") Fields fields, @Header("retainOutOfStock") boolean z11, Continuation<? super Response<CartModifications>> continuation);

    @Headers({"Content-Type: application/json"})
    @POST("carts/{cartId}/multiadd/{allowPartialUpdate}")
    Object h(@Header("Authorization") BearerToken bearerToken, @Path("cartId") String str, @Path("allowPartialUpdate") boolean z10, @Query(PlaceTypes.STORE) int i10, @Body HybrisBatchEntryUpdateRequest hybrisBatchEntryUpdateRequest, @Header("retainOutOfStock") boolean z11, Continuation<? super Response<CartModifications>> continuation);

    @POST("carts/{cartId}/update-substitution-preference")
    Object i(@Header("Authorization") BearerToken bearerToken, @Path("cartId") String str, @Query(PlaceTypes.STORE) int i10, @Body HybrisProactiveSubstituteRequest hybrisProactiveSubstituteRequest, @Header("retainOutOfStock") boolean z10, Continuation<? super Response<Cart>> continuation);

    @Headers({"Accept: application/json"})
    @GET("carts/{cartId}")
    Object j(@Header("Authorization") BearerToken bearerToken, @Path("cartId") String str, @Query(PlaceTypes.STORE) int i10, @Query("calculateForLC") boolean z10, @Query("fields") Fields fields, @Query("fetchCartModifications") boolean z11, @Header("retainOutOfStock") boolean z12, Continuation<? super Response<Cart>> continuation);

    @Headers({"Accept: application/json", "Content-Type: application/json"})
    @PUT("carts/{cartId}/fulfillment-method/auto/confirm")
    Object k(@Header("Authorization") BearerToken bearerToken, @Path("cartId") String str, @Query(PlaceTypes.STORE) int i10, @Header("retainOutOfStock") boolean z10, Continuation<? super Response<Cart>> continuation);

    @Headers({"Accept: application/json"})
    @GET("carts/{cartId}/fulfillment-method/pickup/impact")
    Object q(@Header("Authorization") BearerToken bearerToken, @Path("cartId") String str, @Query(PlaceTypes.STORE) int i10, @Query("fields") Fields fields, @Header("retainOutOfStock") boolean z10, Continuation<? super Response<CartModifications>> continuation);

    @Deprecated
    @Headers({"Accept: application/json"})
    @PATCH("carts/{cartId}/entries/{entryNumber}")
    Object r(@Header("Authorization") BearerToken bearerToken, @Path("entryNumber") int i10, @Path("cartId") String str, @Query("qty") double d10, @Query(PlaceTypes.STORE) int i11, @Query("fields") Fields fields, @Header("retainOutOfStock") boolean z10, Continuation<? super Response<Cart>> continuation);

    @Headers({"Accept: application/json", "Content-Type: application/json"})
    @PATCH("carts/{cartId}")
    Object s(@Header("Authorization") BearerToken bearerToken, @Path("cartId") String str, @Query(PlaceTypes.STORE) int i10, @Query("fields") Fields fields, @Body HybrisBatchEntryUpdateRequest hybrisBatchEntryUpdateRequest, @Header("retainOutOfStock") boolean z10, Continuation<? super Response<CartModifications>> continuation);

    @Headers({"Accept: application/json", "Content-Type: application/json"})
    @PUT("carts/{cartId}/pickupslot")
    Object u(@Header("Authorization") BearerToken bearerToken, @Path("cartId") String str, @Query(PlaceTypes.STORE) int i10, @Query("fields") Fields fields, @Body HybrisPickupSlotInfo hybrisPickupSlotInfo, Continuation<? super Response<Cart>> continuation);

    @DELETE("carts/{cartId}")
    @Headers({"Accept: application/json"})
    Object z(@Header("Authorization") BearerToken bearerToken, @Path("cartId") String str, @Query(PlaceTypes.STORE) int i10, @Header("retainOutOfStock") boolean z10, Continuation<? super Response<Unit>> continuation);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrj/a$a;", "", "<init>", "()V", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: rj.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f158672a = new Companion();

        private Companion() {
        }
    }

    static /* synthetic */ Object A(InterfaceC16792a interfaceC16792a, BearerToken bearerToken, String str, int i10, int i11, SubstitutionNotesRequest substitutionNotesRequest, boolean z10, Continuation continuation, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateSubstitutionNotes");
        }
        if ((i12 & 2) != 0) {
            str = "current";
        }
        String str2 = str;
        if ((i12 & 32) != 0) {
            z10 = true;
        }
        return interfaceC16792a.G(bearerToken, str2, i10, i11, substitutionNotesRequest, z10, continuation);
    }

    static /* synthetic */ Object C(InterfaceC16792a interfaceC16792a, BearerToken bearerToken, String str, int i10, Fields fields, HybrisPickupSlotInfo hybrisPickupSlotInfo, Continuation continuation, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setPickupSlotToCart");
        }
        if ((i11 & 2) != 0) {
            str = "current";
        }
        String str2 = str;
        if ((i11 & 8) != 0) {
            fields = Fields.FULL;
        }
        return interfaceC16792a.u(bearerToken, str2, i10, fields, hybrisPickupSlotInfo, continuation);
    }

    static /* synthetic */ Object E(InterfaceC16792a interfaceC16792a, BearerToken bearerToken, String str, String str2, int i10, boolean z10, Continuation continuation, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteProactiveSubstitute");
        }
        if ((i11 & 2) != 0) {
            str = "current";
        }
        String str3 = str;
        if ((i11 & 16) != 0) {
            z10 = true;
        }
        return interfaceC16792a.D(bearerToken, str3, str2, i10, z10, continuation);
    }

    static /* synthetic */ Object H(InterfaceC16792a interfaceC16792a, BearerToken bearerToken, int i10, String str, int i11, Fields fields, boolean z10, Continuation continuation, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removeEntry");
        }
        if ((i12 & 4) != 0) {
            str = "current";
        }
        String str2 = str;
        if ((i12 & 16) != 0) {
            fields = Fields.FULL;
        }
        Fields fields2 = fields;
        if ((i12 & 32) != 0) {
            z10 = true;
        }
        return interfaceC16792a.L(bearerToken, i10, str2, i11, fields2, z10, continuation);
    }

    static /* synthetic */ Object K(InterfaceC16792a interfaceC16792a, BearerToken bearerToken, String str, SubmitOrderRequest submitOrderRequest, boolean z10, Fields fields, boolean z11, Continuation continuation, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitOrder");
        }
        if ((i10 & 2) != 0) {
            str = "current";
        }
        String str2 = str;
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        boolean z12 = z10;
        if ((i10 & 16) != 0) {
            fields = Fields.FULL;
        }
        Fields fields2 = fields;
        if ((i10 & 32) != 0) {
            z11 = true;
        }
        return interfaceC16792a.I(bearerToken, str2, submitOrderRequest, z12, fields2, z11, continuation);
    }

    static /* synthetic */ Object a(InterfaceC16792a interfaceC16792a, BearerToken bearerToken, String str, int i10, boolean z10, Continuation continuation, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setPickup");
        }
        if ((i11 & 2) != 0) {
            str = "current";
        }
        String str2 = str;
        if ((i11 & 8) != 0) {
            z10 = true;
        }
        return interfaceC16792a.N(bearerToken, str2, i10, z10, continuation);
    }

    static /* synthetic */ Object b(InterfaceC16792a interfaceC16792a, BearerToken bearerToken, String str, int i10, boolean z10, Fields fields, boolean z11, Continuation continuation, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getChangeToDeliveryImpact");
        }
        if ((i11 & 2) != 0) {
            str = "current";
        }
        String str2 = str;
        if ((i11 & 8) != 0) {
            z10 = false;
        }
        boolean z12 = z10;
        if ((i11 & 16) != 0) {
            fields = Fields.FULL;
        }
        Fields fields2 = fields;
        if ((i11 & 32) != 0) {
            z11 = true;
        }
        return interfaceC16792a.d(bearerToken, str2, i10, z12, fields2, z11, continuation);
    }

    static /* synthetic */ Object c(InterfaceC16792a interfaceC16792a, BearerToken bearerToken, String str, int i10, Fields fields, HybrisBatchEntryUpdateRequest hybrisBatchEntryUpdateRequest, boolean z10, Continuation continuation, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateCartItems");
        }
        if ((i11 & 2) != 0) {
            str = "current";
        }
        String str2 = str;
        if ((i11 & 8) != 0) {
            fields = Fields.FULL;
        }
        Fields fields2 = fields;
        if ((i11 & 32) != 0) {
            z10 = true;
        }
        return interfaceC16792a.s(bearerToken, str2, i10, fields2, hybrisBatchEntryUpdateRequest, z10, continuation);
    }

    static /* synthetic */ Object e(InterfaceC16792a interfaceC16792a, BearerToken bearerToken, String str, int i10, HybrisProactiveSubstituteRequest hybrisProactiveSubstituteRequest, boolean z10, Continuation continuation, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addProactiveSubstitute");
        }
        if ((i11 & 2) != 0) {
            str = "current";
        }
        String str2 = str;
        if ((i11 & 16) != 0) {
            z10 = true;
        }
        return interfaceC16792a.i(bearerToken, str2, i10, hybrisProactiveSubstituteRequest, z10, continuation);
    }

    static /* synthetic */ Object f(InterfaceC16792a interfaceC16792a, BearerToken bearerToken, String str, HybrisCustomerAddress hybrisCustomerAddress, int i10, boolean z10, String str2, boolean z11, Continuation continuation, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setDeliveryAddress");
        }
        if ((i11 & 2) != 0) {
            str = "current";
        }
        String str3 = str;
        if ((i11 & 16) != 0) {
            z10 = false;
        }
        return interfaceC16792a.O(bearerToken, str3, hybrisCustomerAddress, i10, z10, (i11 & 32) != 0 ? null : str2, (i11 & 64) != 0 ? true : z11, continuation);
    }

    static /* synthetic */ Object g(InterfaceC16792a interfaceC16792a, BearerToken bearerToken, String str, int i10, boolean z10, Fields fields, boolean z11, boolean z12, Continuation continuation, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCart");
        }
        if ((i11 & 2) != 0) {
            str = "current";
        }
        String str2 = str;
        if ((i11 & 8) != 0) {
            z10 = false;
        }
        boolean z13 = z10;
        if ((i11 & 16) != 0) {
            fields = Fields.FULL;
        }
        return interfaceC16792a.j(bearerToken, str2, i10, z13, fields, (i11 & 32) != 0 ? true : z11, (i11 & 64) != 0 ? true : z12, continuation);
    }

    static /* synthetic */ Object l(InterfaceC16792a interfaceC16792a, BearerToken bearerToken, String str, double d10, String str2, int i10, Fields fields, boolean z10, Continuation continuation, int i11, Object obj) {
        if (obj == null) {
            return interfaceC16792a.M(bearerToken, str, (i11 & 4) != 0 ? 1.0d : d10, (i11 & 8) != 0 ? "current" : str2, i10, (i11 & 32) != 0 ? Fields.FULL : fields, (i11 & 64) != 0 ? true : z10, continuation);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addItem");
    }

    static /* synthetic */ Object m(InterfaceC16792a interfaceC16792a, BearerToken bearerToken, String str, HybrisHighValuePromoRequest hybrisHighValuePromoRequest, Fields fields, boolean z10, Continuation continuation, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setHighValuePromos");
        }
        if ((i10 & 2) != 0) {
            str = "current";
        }
        String str2 = str;
        if ((i10 & 8) != 0) {
            fields = Fields.FULL;
        }
        Fields fields2 = fields;
        if ((i10 & 16) != 0) {
            z10 = true;
        }
        return interfaceC16792a.F(bearerToken, str2, hybrisHighValuePromoRequest, fields2, z10, continuation);
    }

    static /* synthetic */ Object n(InterfaceC16792a interfaceC16792a, BearerToken bearerToken, String str, int i10, Fields fields, boolean z10, Continuation continuation, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getChangeToPickupImpact");
        }
        if ((i11 & 2) != 0) {
            str = "current";
        }
        String str2 = str;
        if ((i11 & 8) != 0) {
            fields = Fields.FULL;
        }
        Fields fields2 = fields;
        if ((i11 & 16) != 0) {
            z10 = true;
        }
        return interfaceC16792a.q(bearerToken, str2, i10, fields2, z10, continuation);
    }

    static /* synthetic */ Object o(InterfaceC16792a interfaceC16792a, BearerToken bearerToken, String str, int i10, boolean z10, Continuation continuation, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setLastUsedFulfillmentMethod");
        }
        if ((i11 & 2) != 0) {
            str = "current";
        }
        String str2 = str;
        if ((i11 & 8) != 0) {
            z10 = true;
        }
        return interfaceC16792a.k(bearerToken, str2, i10, z10, continuation);
    }

    static /* synthetic */ Object p(InterfaceC16792a interfaceC16792a, BearerToken bearerToken, String str, String str2, int i10, Fields fields, boolean z10, Continuation continuation, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyPromoCode");
        }
        if ((i11 & 2) != 0) {
            str = "current";
        }
        String str3 = str;
        if ((i11 & 16) != 0) {
            fields = Fields.FULL;
        }
        Fields fields2 = fields;
        if ((i11 & 32) != 0) {
            z10 = true;
        }
        return interfaceC16792a.B(bearerToken, str3, str2, i10, fields2, z10, continuation);
    }

    static /* synthetic */ Object t(InterfaceC16792a interfaceC16792a, BearerToken bearerToken, String str, MultiTenderPaymentDetailsCreateRequest multiTenderPaymentDetailsCreateRequest, Fields fields, boolean z10, Continuation continuation, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setMultiTenderPaymentDetails");
        }
        if ((i10 & 2) != 0) {
            str = "current";
        }
        String str2 = str;
        if ((i10 & 8) != 0) {
            fields = Fields.FULL;
        }
        Fields fields2 = fields;
        if ((i10 & 16) != 0) {
            z10 = true;
        }
        return interfaceC16792a.P(bearerToken, str2, multiTenderPaymentDetailsCreateRequest, fields2, z10, continuation);
    }

    static /* synthetic */ Object v(InterfaceC16792a interfaceC16792a, BearerToken bearerToken, String str, int i10, boolean z10, Continuation continuation, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteCart");
        }
        if ((i11 & 8) != 0) {
            z10 = true;
        }
        return interfaceC16792a.z(bearerToken, str, i10, z10, continuation);
    }

    static /* synthetic */ Object w(InterfaceC16792a interfaceC16792a, BearerToken bearerToken, String str, boolean z10, int i10, HybrisBatchEntryUpdateRequest hybrisBatchEntryUpdateRequest, boolean z11, Continuation continuation, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addMultipleItemsToCart");
        }
        if ((i11 & 2) != 0) {
            str = "current";
        }
        String str2 = str;
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        boolean z12 = z10;
        if ((i11 & 32) != 0) {
            z11 = true;
        }
        return interfaceC16792a.h(bearerToken, str2, z12, i10, hybrisBatchEntryUpdateRequest, z11, continuation);
    }

    static /* synthetic */ Object x(InterfaceC16792a interfaceC16792a, BearerToken bearerToken, String str, DeliveryConfirmRequest deliveryConfirmRequest, int i10, boolean z10, String str2, boolean z11, Continuation continuation, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setDeliveryConfirmPartner");
        }
        if ((i11 & 2) != 0) {
            str = "current";
        }
        return interfaceC16792a.J(bearerToken, str, deliveryConfirmRequest, i10, z10, str2, (i11 & 64) != 0 ? true : z11, continuation);
    }

    static /* synthetic */ Object y(InterfaceC16792a interfaceC16792a, BearerToken bearerToken, int i10, String str, double d10, int i11, Fields fields, boolean z10, Continuation continuation, int i12, Object obj) {
        if (obj == null) {
            return interfaceC16792a.r(bearerToken, i10, str, d10, i11, (i12 & 32) != 0 ? Fields.FULL : fields, (i12 & 64) != 0 ? true : z10, continuation);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateEntryQuantity");
    }
}
