package com.meijer.mobile.meijer.activity.checkout.confirmation;

import ak.AbstractC5607a;
import androidx.recyclerview.widget.RecyclerView;
import ci.CustomerAddress;
import com.bazaarvoice.bvandroidsdk.BasicRequestFactory;
import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.meijer.activity.checkout.review.CartItemsDecorator;
import com.meijer.mobile.meijer.activity.checkout.review.z1;
import ej.CardType;
import ej.PaymentDetailItem;
import gj.OrderDetail;
import gj.TipAndRateDetails;
import j$.time.OffsetDateTime;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b`\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u0093\u00012\u00020\u0001:\u0005?OMQKBÅ\u0003\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u001d\u001a\u00020\t\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0019\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,\u0012\b\b\u0002\u0010.\u001a\u00020\u0019\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u00100\u001a\u00020\u0019\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u00103\u001a\u00020\u0019\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b6\u00107J\u0011\u00108\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b8\u00109J\u001f\u0010<\u001a\u00020\r2\u0006\u0010:\u001a\u00020\u00022\u0006\u0010;\u001a\u00020\u0002H\u0002¢\u0006\u0004\b<\u0010=J\u001b\u0010?\u001a\u0004\u0018\u00010\r2\b\u0010>\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bA\u0010BJ\u0010\u0010D\u001a\u00020CHÖ\u0001¢\u0006\u0004\bD\u0010EJ\u001a\u0010G\u001a\u00020\u00192\b\u0010F\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bG\u0010HR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b?\u0010I\u001a\u0004\bJ\u0010BR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bK\u0010I\u001a\u0004\bL\u0010BR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bM\u0010I\u001a\u0004\bN\u0010BR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bO\u0010I\u001a\u0004\bP\u0010BR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bQ\u0010I\u001a\u0004\bR\u0010BR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bS\u0010I\u001a\u0004\bT\u0010BR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bU\u0010P\u001a\u0004\bV\u0010WR\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bX\u0010P\u001a\u0004\bY\u0010WR\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bZ\u0010P\u001a\u0004\b[\u0010WR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u00109R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bV\u0010I\u001a\u0004\b_\u0010BR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bJ\u0010`\u001a\u0004\ba\u0010bR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\bM\u0010eR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bf\u0010I\u001a\u0004\bg\u0010BR\u001f\u0010\u0016\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00158\u0006¢\u0006\f\n\u0004\bh\u0010I\u001a\u0004\bi\u0010BR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010mR\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bc\u0010pR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bq\u0010I\u001a\u0004\br\u0010BR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bs\u0010I\u001a\u0004\bt\u0010BR\u0017\u0010\u001d\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bu\u0010P\u001a\u0004\bv\u0010WR\u0017\u0010\u001e\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\bw\u0010o\u001a\u0004\b\u001e\u0010pR\u0017\u0010\u001f\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\bi\u0010o\u001a\u0004\bx\u0010pR\u0019\u0010!\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\by\u0010z\u001a\u0004\b{\u0010|R\u001a\u0010#\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\r\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R\u001c\u0010%\u001a\u0004\u0018\u00010$8\u0006¢\u0006\u000f\n\u0005\b^\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001b\u0010&\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000e\n\u0005\b{\u0010\u0084\u0001\u001a\u0005\bj\u0010\u0085\u0001R\u001a\u0010'\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\r\n\u0005\b\u0082\u0001\u0010]\u001a\u0004\bn\u00109R\u0019\u0010(\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\br\u0010]\u001a\u0004\bh\u00109R\u0019\u0010)\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u007f\u0010]\u001a\u0004\bf\u00109R\u0019\u0010*\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\bP\u0010]\u001a\u0004\b\\\u00109R\u0019\u0010+\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\bg\u0010]\u001a\u0004\bK\u00109R\u001c\u0010-\u001a\u0004\u0018\u00010,8\u0006¢\u0006\u000f\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0005\bZ\u0010\u0088\u0001R\u0018\u0010.\u001a\u00020\u00198\u0006¢\u0006\r\n\u0004\ba\u0010o\u001a\u0005\b\u0089\u0001\u0010pR\u001a\u0010/\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b<\u0010I\u001a\u0005\b\u008a\u0001\u0010BR\u0018\u00100\u001a\u00020\u00198\u0006¢\u0006\r\n\u0004\b8\u0010o\u001a\u0005\b\u008b\u0001\u0010pR\u0019\u00101\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b_\u0010I\u001a\u0004\bu\u0010BR\u001a\u00102\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\r\n\u0004\b[\u0010]\u001a\u0005\b\u0086\u0001\u00109R\u0017\u00103\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\bv\u0010o\u001a\u0004\b3\u0010pR\u001a\u00104\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\bY\u0010I\u001a\u0005\b\u008c\u0001\u0010BR\u001b\u00105\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010I\u001a\u0005\b\u008e\u0001\u0010BR\u001f\u0010\u0091\u0001\u001a\u0004\u0018\u00010C8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bt\u0010\u008f\u0001\u001a\u0005\bw\u0010\u0090\u0001R\u001b\u0010\u0092\u0001\u001a\u00020C8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bx\u00108\u001a\u0004\bO\u0010ER\u0016\u0010\u0094\u0001\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0093\u0001\u0010pR\u0016\u0010\u0096\u0001\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0095\u0001\u0010pR\u0013\u0010\u0098\u0001\u001a\u00020\u00198F¢\u0006\u0007\u001a\u0005\b\u0097\u0001\u0010pR\u0013\u0010\u009a\u0001\u001a\u00020\u00198F¢\u0006\u0007\u001a\u0005\b\u0099\u0001\u0010pR\u0013\u0010\u009c\u0001\u001a\u00020\u00198F¢\u0006\u0007\u001a\u0005\b\u009b\u0001\u0010pR\u0013\u0010\u009e\u0001\u001a\u00020\u00198F¢\u0006\u0007\u001a\u0005\b\u009d\u0001\u0010pR\u0012\u0010\u009f\u0001\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b}\u00109R\u0014\u0010 \u0001\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\by\u00109R\u0014\u0010¡\u0001\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\bs\u00109R\u0012\u0010¢\u0001\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bX\u00109R\u0014\u0010£\u0001\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\bQ\u00109R\u001c\u0010§\u0001\u001a\n\u0012\u0005\u0012\u00030¥\u00010¤\u00018F¢\u0006\b\u001a\u0006\b\u008d\u0001\u0010¦\u0001R\u001b\u0010©\u0001\u001a\n\u0012\u0005\u0012\u00030¨\u00010¤\u00018F¢\u0006\u0007\u001a\u0005\bq\u0010¦\u0001R\u0012\u0010ª\u0001\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bS\u00109R\u0014\u0010«\u0001\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\bU\u00109¨\u0006¬\u0001"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/confirmation/p;", "", "", "deliveryMode", BasicRequestFactory.kEMAIL_USER, "storeName", "storeId", "pickupHelpNumber", "fulfillmentPartner", "", "deliveryCost", "totalTax", "totalPriceWithTax", "Lak/a;", "orderTotalAtCheckout", "totalPriceCurrency", "Lcom/meijer/mobile/meijer/activity/checkout/confirmation/j0;", "timeSlot", "Lcom/meijer/mobile/meijer/activity/checkout/review/u;", "cartItems", "substitutionPreference", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderNumber", "Lci/c;", "deliveryAddress", "", "earlyDelivery", "phoneNumber", "zipCode", "totalSavings", "isBopasEnabled", "isBopasSlot", "Lej/u;", "paymentDetails", "Lcom/meijer/mobile/meijer/activity/checkout/confirmation/p$d;", "preTipAndRateDetails", "Lcom/meijer/mobile/meijer/activity/checkout/confirmation/p$c;", "paymentStatusWidget", "ebtDesiredChargeAmount", "ebtTotal", "ebtCardEndingNumber", "ebtCardBalance", "creditDebitCardTotal", "cardEndingNumber", "Lej/d;", "creditCardType", "isEBTOrder", "partnerEligibility", "isEZCDOrder", "fulfillmentEligibility", "temporaryHold", "isBunchaEnabled", "firstName", "lastName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDLak/a;Ljava/lang/String;Lcom/meijer/mobile/meijer/activity/checkout/confirmation/j0;Lcom/meijer/mobile/meijer/activity/checkout/review/u;Ljava/lang/String;Ljava/lang/String;Lci/c;ZLjava/lang/String;Ljava/lang/String;DZZLej/u;Lcom/meijer/mobile/meijer/activity/checkout/confirmation/p$d;Lcom/meijer/mobile/meijer/activity/checkout/confirmation/p$c;Ljava/lang/Double;Lak/a;Lak/a;Lak/a;Lak/a;Lak/a;Lej/d;ZLjava/lang/String;ZLjava/lang/String;Lak/a;ZLjava/lang/String;Ljava/lang/String;)V", "I", "()Lak/a;", "start", "end", "H", "(Ljava/lang/String;Ljava/lang/String;)Lak/a;", "startTime", "a", "(Ljava/lang/String;)Lak/a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "l", "b", "getUserEmail", "c", "getStoreName", "d", "D", "e", "getPickupHelpNumber", "f", "getFulfillmentPartner", "g", "k", "()D", "h", "M", "i", "K", "j", "Lak/a;", "y", "J", "Lcom/meijer/mobile/meijer/activity/checkout/confirmation/j0;", "G", "()Lcom/meijer/mobile/meijer/activity/checkout/confirmation/j0;", "m", "Lcom/meijer/mobile/meijer/activity/checkout/review/u;", "()Lcom/meijer/mobile/meijer/activity/checkout/review/u;", "n", "E", "o", "v", "p", "Lci/c;", "getDeliveryAddress", "()Lci/c;", "q", "Z", "()Z", "r", "B", "s", "O", "t", "L", "u", "P", "w", "Lej/u;", "z", "()Lej/u;", "x", "Lcom/meijer/mobile/meijer/activity/checkout/confirmation/p$d;", "C", "()Lcom/meijer/mobile/meijer/activity/checkout/confirmation/p$d;", "Lcom/meijer/mobile/meijer/activity/checkout/confirmation/p$c;", "A", "()Lcom/meijer/mobile/meijer/activity/checkout/confirmation/p$c;", "Ljava/lang/Double;", "()Ljava/lang/Double;", "F", "Lej/d;", "()Lej/d;", "U", "getPartnerEligibility", "V", "getFirstName", "N", "getLastName", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "imageResourceId", "cartSummaryImageResourceId", "Q", "isDeliveryBunchaOrder", "S", "isDeliveryOrder", "W", "isPickUpMeijerOrder", "X", "isPickUpShiptOrder", "T", "isDeliveryShiptOrder", "R", "isDeliveryInstacartOrder", "orderTitle", "orderNumberTitle", "fulfillmentCenter", "contentDescription", "confirmationDecoratorSlotDetails", "", "Lcom/meijer/mobile/meijer/activity/checkout/confirmation/p$e;", "()Ljava/util/List;", "whatsNextItems", "Lcom/meijer/mobile/meijer/activity/checkout/confirmation/p$b;", "faqItems", "confirmationEmail", "confirmationOrderNumber", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.meijer.activity.checkout.confirmation.p, reason: case insensitive filesystem and from toString */
/* loaded from: classes9.dex */
public final /* data */ class OrderConfirmationDecorator {

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: R, reason: collision with root package name */
    public static final int f102212R = 8;

    /* renamed from: A, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a ebtTotal;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a ebtCardEndingNumber;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a ebtCardBalance;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a creditDebitCardTotal;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a cardEndingNumber;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata and from toString */
    private final CardType creditCardType;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isEBTOrder;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata and from toString */
    private final String partnerEligibility;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isEZCDOrder;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fulfillmentEligibility;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a temporaryHold;

    /* renamed from: L, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isBunchaEnabled;

    /* renamed from: M, reason: collision with root package name and from kotlin metadata and from toString */
    private final String firstName;

    /* renamed from: N, reason: collision with root package name and from kotlin metadata and from toString */
    private final String lastName;

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final Integer imageResourceId;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private final int cartSummaryImageResourceId;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deliveryMode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String userEmail;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String storeName;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String storeId;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pickupHelpNumber;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fulfillmentPartner;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final double deliveryCost;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final double totalTax;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final double totalPriceWithTax;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a orderTotalAtCheckout;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String totalPriceCurrency;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final OrderDetailsPickUpTimeDecorator timeSlot;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final CartItemsDecorator cartItems;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final String substitutionPreference;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final String orderNumber;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final CustomerAddress deliveryAddress;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean earlyDelivery;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final String phoneNumber;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final String zipCode;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final double totalSavings;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isBopasEnabled;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isBopasSlot;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
    private final PaymentDetailItem paymentDetails;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
    private final PreTipDecorator preTipAndRateDetails;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
    private final PaymentStatusWidgetDecorator paymentStatusWidget;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double ebtDesiredChargeAmount;

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ=\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/confirmation/p$a;", "", "<init>", "()V", "Lgj/n;", "tipAndRateDetails", "j$/time/OffsetDateTime", "created", "Lcom/meijer/mobile/meijer/activity/checkout/confirmation/p$d;", "g", "(Lgj/n;Lj$/time/OffsetDateTime;)Lcom/meijer/mobile/meijer/activity/checkout/confirmation/p$d;", "Lej/u;", "paymentDetails", "Lcom/meijer/mobile/meijer/activity/checkout/confirmation/p$c;", "f", "(Lej/u;)Lcom/meijer/mobile/meijer/activity/checkout/confirmation/p$c;", "Lgj/c;", "order", "", "isBopasEnabled", "addSurchargeToTotalPrice", "isEZCDEnabled", "isBunchaEnabled", "Lcom/meijer/mobile/meijer/activity/checkout/confirmation/p;", "b", "(Lgj/c;ZZZZ)Lcom/meijer/mobile/meijer/activity/checkout/confirmation/p;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$k;", "information", "e", "(Lcom/meijer/mobile/meijer/activity/checkout/review/z1$k;)Lcom/meijer/mobile/meijer/activity/checkout/confirmation/p;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.confirmation.p$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double d() {
            return 0.0d;
        }

        private final PaymentStatusWidgetDecorator f(PaymentDetailItem paymentDetails) {
            if (paymentDetails == null || !paymentDetails.getIsPaymentDeclined()) {
                AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
                return new PaymentStatusWidgetDecorator(companion.d(com.meijer.mobile.meijer.Y.f100389w1, new Object[0]), companion.d(com.meijer.mobile.meijer.Y.f100369v1, new Object[0]), companion.d(com.meijer.mobile.meijer.Y.f100349u1, new Object[0]));
            }
            AbstractC5607a.Companion companion2 = AbstractC5607a.INSTANCE;
            return new PaymentStatusWidgetDecorator(companion2.d(com.meijer.mobile.meijer.Y.f100329t1, new Object[0]), companion2.d(com.meijer.mobile.meijer.Y.f100309s1, new Object[0]), companion2.d(com.meijer.mobile.meijer.Y.f100289r1, new Object[0]));
        }

        public final OrderConfirmationDecorator e(z1.OrderConfirmationInfo information) {
            String deliveryMode = information != null ? information.getDeliveryMode() : null;
            String str = deliveryMode == null ? "" : deliveryMode;
            String userEmail = information != null ? information.getUserEmail() : null;
            String str2 = userEmail == null ? "" : userEmail;
            String fulfillmentPartner = information != null ? information.getFulfillmentPartner() : null;
            String str3 = fulfillmentPartner == null ? "" : fulfillmentPartner;
            String pickupHelpNumber = information != null ? information.getPickupHelpNumber() : null;
            String str4 = pickupHelpNumber == null ? "" : pickupHelpNumber;
            String storeName = information != null ? information.getStoreName() : null;
            return new OrderConfirmationDecorator(str, str2, storeName == null ? "" : storeName, null, str4, str3, 0.0d, 0.0d, 0.0d, null, null, null, null, null, null, null, false, null, null, 0.0d, false, false, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, false, null, null, -56, l3.f92484c, null);
        }

        private Companion() {
        }

        public static /* synthetic */ OrderConfirmationDecorator c(Companion companion, OrderDetail orderDetail, boolean z10, boolean z11, boolean z12, boolean z13, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            if ((i10 & 4) != 0) {
                z11 = false;
            }
            if ((i10 & 8) != 0) {
                z12 = false;
            }
            if ((i10 & 16) != 0) {
                z13 = false;
            }
            return companion.b(orderDetail, z10, z11, z12, z13);
        }

        private final PreTipDecorator g(TipAndRateDetails tipAndRateDetails, OffsetDateTime created) {
            return new PreTipDecorator(tipAndRateDetails.getTipDetails().getTipped(), tipAndRateDetails.getTipDetails().getTipAmount().getValue(), tipAndRateDetails.getTipDetails().getPercent(), created);
        }

        /* JADX WARN: Removed duplicated region for block: B:121:0x01ba  */
        /* JADX WARN: Removed duplicated region for block: B:122:0x01bf  */
        /* JADX WARN: Removed duplicated region for block: B:124:0x01c2  */
        /* JADX WARN: Removed duplicated region for block: B:125:0x01c5  */
        /* JADX WARN: Removed duplicated region for block: B:128:0x0237  */
        /* JADX WARN: Removed duplicated region for block: B:130:0x023e  */
        /* JADX WARN: Removed duplicated region for block: B:133:0x024a  */
        /* JADX WARN: Removed duplicated region for block: B:134:0x024f  */
        /* JADX WARN: Removed duplicated region for block: B:136:0x0252  */
        /* JADX WARN: Removed duplicated region for block: B:139:0x0259  */
        /* JADX WARN: Removed duplicated region for block: B:140:0x025e  */
        /* JADX WARN: Removed duplicated region for block: B:142:0x0262  */
        /* JADX WARN: Removed duplicated region for block: B:147:0x0270  */
        /* JADX WARN: Removed duplicated region for block: B:149:0x0276  */
        /* JADX WARN: Removed duplicated region for block: B:150:0x027b  */
        /* JADX WARN: Removed duplicated region for block: B:152:0x027f  */
        /* JADX WARN: Removed duplicated region for block: B:155:0x0287  */
        /* JADX WARN: Removed duplicated region for block: B:156:0x0290  */
        /* JADX WARN: Removed duplicated region for block: B:159:0x02da  */
        /* JADX WARN: Removed duplicated region for block: B:160:0x02df  */
        /* JADX WARN: Removed duplicated region for block: B:163:0x02fa  */
        /* JADX WARN: Removed duplicated region for block: B:164:0x02ff  */
        /* JADX WARN: Removed duplicated region for block: B:167:0x0306  */
        /* JADX WARN: Removed duplicated region for block: B:174:0x0353  */
        /* JADX WARN: Removed duplicated region for block: B:185:0x038b  */
        /* JADX WARN: Removed duplicated region for block: B:189:0x03a0  */
        /* JADX WARN: Removed duplicated region for block: B:191:0x03a3  */
        /* JADX WARN: Removed duplicated region for block: B:193:0x03ba  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.meijer.mobile.meijer.activity.checkout.confirmation.OrderConfirmationDecorator b(gj.OrderDetail r54, boolean r55, boolean r56, boolean r57, boolean r58) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 1000
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.confirmation.OrderConfirmationDecorator.Companion.b(gj.c, boolean, boolean, boolean, boolean):com.meijer.mobile.meijer.activity.checkout.confirmation.p");
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0007\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/confirmation/p$b;", "", "Lak/a;", "title", "content", "secondContent", "", "isUrlIncluded", "<init>", "(Lak/a;Lak/a;Lak/a;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lak/a;", "c", "()Lak/a;", "b", "d", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.confirmation.p$b, reason: from toString */
    public static final /* data */ class FaqItemDecorator {

        /* renamed from: e, reason: collision with root package name */
        public static final int f102255e = AbstractC5607a.f45514b;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC5607a title;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC5607a content;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC5607a secondContent;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isUrlIncluded;

        public FaqItemDecorator(AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, AbstractC5607a abstractC5607a3, boolean z10) {
            this.title = abstractC5607a;
            this.content = abstractC5607a2;
            this.secondContent = abstractC5607a3;
            this.isUrlIncluded = z10;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FaqItemDecorator)) {
                return false;
            }
            FaqItemDecorator faqItemDecorator = (FaqItemDecorator) other;
            return Intrinsics.e(this.title, faqItemDecorator.title) && Intrinsics.e(this.content, faqItemDecorator.content) && Intrinsics.e(this.secondContent, faqItemDecorator.secondContent) && this.isUrlIncluded == faqItemDecorator.isUrlIncluded;
        }

        public int hashCode() {
            AbstractC5607a abstractC5607a = this.title;
            int iHashCode = (abstractC5607a == null ? 0 : abstractC5607a.hashCode()) * 31;
            AbstractC5607a abstractC5607a2 = this.content;
            int iHashCode2 = (iHashCode + (abstractC5607a2 == null ? 0 : abstractC5607a2.hashCode())) * 31;
            AbstractC5607a abstractC5607a3 = this.secondContent;
            return ((iHashCode2 + (abstractC5607a3 != null ? abstractC5607a3.hashCode() : 0)) * 31) + Boolean.hashCode(this.isUrlIncluded);
        }

        public String toString() {
            return "FaqItemDecorator(title=" + this.title + ", content=" + this.content + ", secondContent=" + this.secondContent + ", isUrlIncluded=" + this.isUrlIncluded + ')';
        }

        /* renamed from: a, reason: from getter */
        public final AbstractC5607a getContent() {
            return this.content;
        }

        /* renamed from: b, reason: from getter */
        public final AbstractC5607a getSecondContent() {
            return this.secondContent;
        }

        /* renamed from: c, reason: from getter */
        public final AbstractC5607a getTitle() {
            return this.title;
        }

        public /* synthetic */ FaqItemDecorator(AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, AbstractC5607a abstractC5607a3, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(abstractC5607a, abstractC5607a2, (i10 & 4) != 0 ? null : abstractC5607a3, (i10 & 8) != 0 ? false : z10);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/confirmation/p$c;", "", "Lak/a;", "title", "content", "buttonLabel", "<init>", "(Lak/a;Lak/a;Lak/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lak/a;", "c", "()Lak/a;", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.confirmation.p$c, reason: from toString */
    public static final /* data */ class PaymentStatusWidgetDecorator {

        /* renamed from: d, reason: collision with root package name */
        public static final int f102260d = AbstractC5607a.f45514b;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC5607a title;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC5607a content;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC5607a buttonLabel;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaymentStatusWidgetDecorator)) {
                return false;
            }
            PaymentStatusWidgetDecorator paymentStatusWidgetDecorator = (PaymentStatusWidgetDecorator) other;
            return Intrinsics.e(this.title, paymentStatusWidgetDecorator.title) && Intrinsics.e(this.content, paymentStatusWidgetDecorator.content) && Intrinsics.e(this.buttonLabel, paymentStatusWidgetDecorator.buttonLabel);
        }

        public int hashCode() {
            AbstractC5607a abstractC5607a = this.title;
            int iHashCode = (abstractC5607a == null ? 0 : abstractC5607a.hashCode()) * 31;
            AbstractC5607a abstractC5607a2 = this.content;
            int iHashCode2 = (iHashCode + (abstractC5607a2 == null ? 0 : abstractC5607a2.hashCode())) * 31;
            AbstractC5607a abstractC5607a3 = this.buttonLabel;
            return iHashCode2 + (abstractC5607a3 != null ? abstractC5607a3.hashCode() : 0);
        }

        public String toString() {
            return "PaymentStatusWidgetDecorator(title=" + this.title + ", content=" + this.content + ", buttonLabel=" + this.buttonLabel + ')';
        }

        /* renamed from: a, reason: from getter */
        public final AbstractC5607a getButtonLabel() {
            return this.buttonLabel;
        }

        /* renamed from: b, reason: from getter */
        public final AbstractC5607a getContent() {
            return this.content;
        }

        /* renamed from: c, reason: from getter */
        public final AbstractC5607a getTitle() {
            return this.title;
        }

        public PaymentStatusWidgetDecorator(AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, AbstractC5607a abstractC5607a3) {
            this.title = abstractC5607a;
            this.content = abstractC5607a2;
            this.buttonLabel = abstractC5607a3;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001c\u001a\u0004\b\u0018\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/confirmation/p$d;", "", "", "isPreTipped", "", "amount", "percentage", "j$/time/OffsetDateTime", "date", "<init>", "(ZDDLj$/time/OffsetDateTime;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "d", "()Z", "b", "D", "()D", "c", "Lj$/time/OffsetDateTime;", "()Lj$/time/OffsetDateTime;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.confirmation.p$d, reason: from toString */
    public static final /* data */ class PreTipDecorator {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isPreTipped;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final double amount;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final double percentage;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final OffsetDateTime date;

        public PreTipDecorator() {
            this(false, 0.0d, 0.0d, null, 15, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PreTipDecorator)) {
                return false;
            }
            PreTipDecorator preTipDecorator = (PreTipDecorator) other;
            return this.isPreTipped == preTipDecorator.isPreTipped && Double.compare(this.amount, preTipDecorator.amount) == 0 && Double.compare(this.percentage, preTipDecorator.percentage) == 0 && Intrinsics.e(this.date, preTipDecorator.date);
        }

        public int hashCode() {
            int iHashCode = ((((Boolean.hashCode(this.isPreTipped) * 31) + Double.hashCode(this.amount)) * 31) + Double.hashCode(this.percentage)) * 31;
            OffsetDateTime offsetDateTime = this.date;
            return iHashCode + (offsetDateTime == null ? 0 : offsetDateTime.hashCode());
        }

        public String toString() {
            return "PreTipDecorator(isPreTipped=" + this.isPreTipped + ", amount=" + this.amount + ", percentage=" + this.percentage + ", date=" + this.date + ')';
        }

        public PreTipDecorator(boolean z10, double d10, double d11, OffsetDateTime offsetDateTime) {
            this.isPreTipped = z10;
            this.amount = d10;
            this.percentage = d11;
            this.date = offsetDateTime;
        }

        /* renamed from: a, reason: from getter */
        public final double getAmount() {
            return this.amount;
        }

        /* renamed from: b, reason: from getter */
        public final OffsetDateTime getDate() {
            return this.date;
        }

        /* renamed from: c, reason: from getter */
        public final double getPercentage() {
            return this.percentage;
        }

        /* renamed from: d, reason: from getter */
        public final boolean getIsPreTipped() {
            return this.isPreTipped;
        }

        public /* synthetic */ PreTipDecorator(boolean z10, double d10, double d11, OffsetDateTime offsetDateTime, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? 0.0d : d10, (i10 & 4) != 0 ? 0.0d : d11, (i10 & 8) != 0 ? null : offsetDateTime);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/confirmation/p$e;", "", "Lak/a;", "stepNumber", "instruction", "stepNumberContentDescription", "", "isUrlIncluded", "<init>", "(Lak/a;Lak/a;Lak/a;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lak/a;", "b", "()Lak/a;", "c", "d", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.confirmation.p$e, reason: from toString */
    public static final /* data */ class WhatsNextItemDecorator {

        /* renamed from: e, reason: collision with root package name */
        public static final int f102268e = AbstractC5607a.f45514b;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC5607a stepNumber;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC5607a instruction;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC5607a stepNumberContentDescription;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isUrlIncluded;

        public WhatsNextItemDecorator(AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, AbstractC5607a abstractC5607a3, boolean z10) {
            this.stepNumber = abstractC5607a;
            this.instruction = abstractC5607a2;
            this.stepNumberContentDescription = abstractC5607a3;
            this.isUrlIncluded = z10;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WhatsNextItemDecorator)) {
                return false;
            }
            WhatsNextItemDecorator whatsNextItemDecorator = (WhatsNextItemDecorator) other;
            return Intrinsics.e(this.stepNumber, whatsNextItemDecorator.stepNumber) && Intrinsics.e(this.instruction, whatsNextItemDecorator.instruction) && Intrinsics.e(this.stepNumberContentDescription, whatsNextItemDecorator.stepNumberContentDescription) && this.isUrlIncluded == whatsNextItemDecorator.isUrlIncluded;
        }

        public int hashCode() {
            AbstractC5607a abstractC5607a = this.stepNumber;
            int iHashCode = (abstractC5607a == null ? 0 : abstractC5607a.hashCode()) * 31;
            AbstractC5607a abstractC5607a2 = this.instruction;
            int iHashCode2 = (iHashCode + (abstractC5607a2 == null ? 0 : abstractC5607a2.hashCode())) * 31;
            AbstractC5607a abstractC5607a3 = this.stepNumberContentDescription;
            return ((iHashCode2 + (abstractC5607a3 != null ? abstractC5607a3.hashCode() : 0)) * 31) + Boolean.hashCode(this.isUrlIncluded);
        }

        public String toString() {
            return "WhatsNextItemDecorator(stepNumber=" + this.stepNumber + ", instruction=" + this.instruction + ", stepNumberContentDescription=" + this.stepNumberContentDescription + ", isUrlIncluded=" + this.isUrlIncluded + ')';
        }

        /* renamed from: a, reason: from getter */
        public final AbstractC5607a getInstruction() {
            return this.instruction;
        }

        /* renamed from: b, reason: from getter */
        public final AbstractC5607a getStepNumber() {
            return this.stepNumber;
        }

        /* renamed from: c, reason: from getter */
        public final AbstractC5607a getStepNumberContentDescription() {
            return this.stepNumberContentDescription;
        }

        /* renamed from: d, reason: from getter */
        public final boolean getIsUrlIncluded() {
            return this.isUrlIncluded;
        }

        public /* synthetic */ WhatsNextItemDecorator(AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, AbstractC5607a abstractC5607a3, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(abstractC5607a, abstractC5607a2, abstractC5607a3, (i10 & 8) != 0 ? false : z10);
        }
    }

    public OrderConfirmationDecorator(String deliveryMode, String userEmail, String storeName, String str, String pickupHelpNumber, String fulfillmentPartner, double d10, double d11, double d12, AbstractC5607a abstractC5607a, String str2, OrderDetailsPickUpTimeDecorator orderDetailsPickUpTimeDecorator, CartItemsDecorator cartItemsDecorator, String str3, String str4, CustomerAddress customerAddress, boolean z10, String str5, String str6, double d13, boolean z11, boolean z12, PaymentDetailItem paymentDetailItem, PreTipDecorator preTipDecorator, PaymentStatusWidgetDecorator paymentStatusWidgetDecorator, Double d14, AbstractC5607a abstractC5607a2, AbstractC5607a abstractC5607a3, AbstractC5607a abstractC5607a4, AbstractC5607a abstractC5607a5, AbstractC5607a abstractC5607a6, CardType cardType, boolean z13, String str7, boolean z14, String str8, AbstractC5607a abstractC5607a7, boolean z15, String str9, String str10) {
        Intrinsics.j(deliveryMode, "deliveryMode");
        Intrinsics.j(userEmail, "userEmail");
        Intrinsics.j(storeName, "storeName");
        Intrinsics.j(pickupHelpNumber, "pickupHelpNumber");
        Intrinsics.j(fulfillmentPartner, "fulfillmentPartner");
        this.deliveryMode = deliveryMode;
        this.userEmail = userEmail;
        this.storeName = storeName;
        this.storeId = str;
        this.pickupHelpNumber = pickupHelpNumber;
        this.fulfillmentPartner = fulfillmentPartner;
        this.deliveryCost = d10;
        this.totalTax = d11;
        this.totalPriceWithTax = d12;
        this.orderTotalAtCheckout = abstractC5607a;
        this.totalPriceCurrency = str2;
        this.timeSlot = orderDetailsPickUpTimeDecorator;
        this.cartItems = cartItemsDecorator;
        this.substitutionPreference = str3;
        this.orderNumber = str4;
        this.deliveryAddress = customerAddress;
        this.earlyDelivery = z10;
        this.phoneNumber = str5;
        this.zipCode = str6;
        this.totalSavings = d13;
        this.isBopasEnabled = z11;
        this.isBopasSlot = z12;
        this.paymentDetails = paymentDetailItem;
        this.preTipAndRateDetails = preTipDecorator;
        this.paymentStatusWidget = paymentStatusWidgetDecorator;
        this.ebtDesiredChargeAmount = d14;
        this.ebtTotal = abstractC5607a2;
        this.ebtCardEndingNumber = abstractC5607a3;
        this.ebtCardBalance = abstractC5607a4;
        this.creditDebitCardTotal = abstractC5607a5;
        this.cardEndingNumber = abstractC5607a6;
        this.creditCardType = cardType;
        this.isEBTOrder = z13;
        this.partnerEligibility = str7;
        this.isEZCDOrder = z14;
        this.fulfillmentEligibility = str8;
        this.temporaryHold = abstractC5607a7;
        this.isBunchaEnabled = z15;
        this.firstName = str9;
        this.lastName = str10;
        Integer numValueOf = W() ? Integer.valueOf(Bj.i.f2644C0) : null;
        if (numValueOf == null) {
            numValueOf = X() ? Integer.valueOf(Bj.i.f2641B0) : null;
            if (numValueOf == null) {
                numValueOf = R() ? Integer.valueOf(Bj.i.f2801z0) : null;
                if (numValueOf == null) {
                    numValueOf = T() ? Integer.valueOf(Bj.i.f2638A0) : null;
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(Bj.i.f2798y0);
                        if (!Q()) {
                            numValueOf = null;
                        }
                    }
                }
            }
        }
        this.imageResourceId = numValueOf;
        Integer numValueOf2 = T() ? Integer.valueOf(Bj.i.f2685Q) : null;
        this.cartSummaryImageResourceId = numValueOf2 != null ? numValueOf2.intValue() : Bj.i.f2698U0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderConfirmationDecorator)) {
            return false;
        }
        OrderConfirmationDecorator orderConfirmationDecorator = (OrderConfirmationDecorator) other;
        return Intrinsics.e(this.deliveryMode, orderConfirmationDecorator.deliveryMode) && Intrinsics.e(this.userEmail, orderConfirmationDecorator.userEmail) && Intrinsics.e(this.storeName, orderConfirmationDecorator.storeName) && Intrinsics.e(this.storeId, orderConfirmationDecorator.storeId) && Intrinsics.e(this.pickupHelpNumber, orderConfirmationDecorator.pickupHelpNumber) && Intrinsics.e(this.fulfillmentPartner, orderConfirmationDecorator.fulfillmentPartner) && Double.compare(this.deliveryCost, orderConfirmationDecorator.deliveryCost) == 0 && Double.compare(this.totalTax, orderConfirmationDecorator.totalTax) == 0 && Double.compare(this.totalPriceWithTax, orderConfirmationDecorator.totalPriceWithTax) == 0 && Intrinsics.e(this.orderTotalAtCheckout, orderConfirmationDecorator.orderTotalAtCheckout) && Intrinsics.e(this.totalPriceCurrency, orderConfirmationDecorator.totalPriceCurrency) && Intrinsics.e(this.timeSlot, orderConfirmationDecorator.timeSlot) && Intrinsics.e(this.cartItems, orderConfirmationDecorator.cartItems) && Intrinsics.e(this.substitutionPreference, orderConfirmationDecorator.substitutionPreference) && Intrinsics.e(this.orderNumber, orderConfirmationDecorator.orderNumber) && Intrinsics.e(this.deliveryAddress, orderConfirmationDecorator.deliveryAddress) && this.earlyDelivery == orderConfirmationDecorator.earlyDelivery && Intrinsics.e(this.phoneNumber, orderConfirmationDecorator.phoneNumber) && Intrinsics.e(this.zipCode, orderConfirmationDecorator.zipCode) && Double.compare(this.totalSavings, orderConfirmationDecorator.totalSavings) == 0 && this.isBopasEnabled == orderConfirmationDecorator.isBopasEnabled && this.isBopasSlot == orderConfirmationDecorator.isBopasSlot && Intrinsics.e(this.paymentDetails, orderConfirmationDecorator.paymentDetails) && Intrinsics.e(this.preTipAndRateDetails, orderConfirmationDecorator.preTipAndRateDetails) && Intrinsics.e(this.paymentStatusWidget, orderConfirmationDecorator.paymentStatusWidget) && Intrinsics.e(this.ebtDesiredChargeAmount, orderConfirmationDecorator.ebtDesiredChargeAmount) && Intrinsics.e(this.ebtTotal, orderConfirmationDecorator.ebtTotal) && Intrinsics.e(this.ebtCardEndingNumber, orderConfirmationDecorator.ebtCardEndingNumber) && Intrinsics.e(this.ebtCardBalance, orderConfirmationDecorator.ebtCardBalance) && Intrinsics.e(this.creditDebitCardTotal, orderConfirmationDecorator.creditDebitCardTotal) && Intrinsics.e(this.cardEndingNumber, orderConfirmationDecorator.cardEndingNumber) && Intrinsics.e(this.creditCardType, orderConfirmationDecorator.creditCardType) && this.isEBTOrder == orderConfirmationDecorator.isEBTOrder && Intrinsics.e(this.partnerEligibility, orderConfirmationDecorator.partnerEligibility) && this.isEZCDOrder == orderConfirmationDecorator.isEZCDOrder && Intrinsics.e(this.fulfillmentEligibility, orderConfirmationDecorator.fulfillmentEligibility) && Intrinsics.e(this.temporaryHold, orderConfirmationDecorator.temporaryHold) && this.isBunchaEnabled == orderConfirmationDecorator.isBunchaEnabled && Intrinsics.e(this.firstName, orderConfirmationDecorator.firstName) && Intrinsics.e(this.lastName, orderConfirmationDecorator.lastName);
    }

    public int hashCode() {
        int iHashCode = ((((this.deliveryMode.hashCode() * 31) + this.userEmail.hashCode()) * 31) + this.storeName.hashCode()) * 31;
        String str = this.storeId;
        int iHashCode2 = (((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.pickupHelpNumber.hashCode()) * 31) + this.fulfillmentPartner.hashCode()) * 31) + Double.hashCode(this.deliveryCost)) * 31) + Double.hashCode(this.totalTax)) * 31) + Double.hashCode(this.totalPriceWithTax)) * 31;
        AbstractC5607a abstractC5607a = this.orderTotalAtCheckout;
        int iHashCode3 = (iHashCode2 + (abstractC5607a == null ? 0 : abstractC5607a.hashCode())) * 31;
        String str2 = this.totalPriceCurrency;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        OrderDetailsPickUpTimeDecorator orderDetailsPickUpTimeDecorator = this.timeSlot;
        int iHashCode5 = (iHashCode4 + (orderDetailsPickUpTimeDecorator == null ? 0 : orderDetailsPickUpTimeDecorator.hashCode())) * 31;
        CartItemsDecorator cartItemsDecorator = this.cartItems;
        int iHashCode6 = (iHashCode5 + (cartItemsDecorator == null ? 0 : cartItemsDecorator.hashCode())) * 31;
        String str3 = this.substitutionPreference;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.orderNumber;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        CustomerAddress customerAddress = this.deliveryAddress;
        int iHashCode9 = (((iHashCode8 + (customerAddress == null ? 0 : customerAddress.hashCode())) * 31) + Boolean.hashCode(this.earlyDelivery)) * 31;
        String str5 = this.phoneNumber;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.zipCode;
        int iHashCode11 = (((((((iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31) + Double.hashCode(this.totalSavings)) * 31) + Boolean.hashCode(this.isBopasEnabled)) * 31) + Boolean.hashCode(this.isBopasSlot)) * 31;
        PaymentDetailItem paymentDetailItem = this.paymentDetails;
        int iHashCode12 = (iHashCode11 + (paymentDetailItem == null ? 0 : paymentDetailItem.hashCode())) * 31;
        PreTipDecorator preTipDecorator = this.preTipAndRateDetails;
        int iHashCode13 = (iHashCode12 + (preTipDecorator == null ? 0 : preTipDecorator.hashCode())) * 31;
        PaymentStatusWidgetDecorator paymentStatusWidgetDecorator = this.paymentStatusWidget;
        int iHashCode14 = (iHashCode13 + (paymentStatusWidgetDecorator == null ? 0 : paymentStatusWidgetDecorator.hashCode())) * 31;
        Double d10 = this.ebtDesiredChargeAmount;
        int iHashCode15 = (iHashCode14 + (d10 == null ? 0 : d10.hashCode())) * 31;
        AbstractC5607a abstractC5607a2 = this.ebtTotal;
        int iHashCode16 = (iHashCode15 + (abstractC5607a2 == null ? 0 : abstractC5607a2.hashCode())) * 31;
        AbstractC5607a abstractC5607a3 = this.ebtCardEndingNumber;
        int iHashCode17 = (iHashCode16 + (abstractC5607a3 == null ? 0 : abstractC5607a3.hashCode())) * 31;
        AbstractC5607a abstractC5607a4 = this.ebtCardBalance;
        int iHashCode18 = (iHashCode17 + (abstractC5607a4 == null ? 0 : abstractC5607a4.hashCode())) * 31;
        AbstractC5607a abstractC5607a5 = this.creditDebitCardTotal;
        int iHashCode19 = (iHashCode18 + (abstractC5607a5 == null ? 0 : abstractC5607a5.hashCode())) * 31;
        AbstractC5607a abstractC5607a6 = this.cardEndingNumber;
        int iHashCode20 = (iHashCode19 + (abstractC5607a6 == null ? 0 : abstractC5607a6.hashCode())) * 31;
        CardType cardType = this.creditCardType;
        int iHashCode21 = (((iHashCode20 + (cardType == null ? 0 : cardType.hashCode())) * 31) + Boolean.hashCode(this.isEBTOrder)) * 31;
        String str7 = this.partnerEligibility;
        int iHashCode22 = (((iHashCode21 + (str7 == null ? 0 : str7.hashCode())) * 31) + Boolean.hashCode(this.isEZCDOrder)) * 31;
        String str8 = this.fulfillmentEligibility;
        int iHashCode23 = (iHashCode22 + (str8 == null ? 0 : str8.hashCode())) * 31;
        AbstractC5607a abstractC5607a7 = this.temporaryHold;
        int iHashCode24 = (((iHashCode23 + (abstractC5607a7 == null ? 0 : abstractC5607a7.hashCode())) * 31) + Boolean.hashCode(this.isBunchaEnabled)) * 31;
        String str9 = this.firstName;
        int iHashCode25 = (iHashCode24 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.lastName;
        return iHashCode25 + (str10 != null ? str10.hashCode() : 0);
    }

    public String toString() {
        return "OrderConfirmationDecorator(deliveryMode=" + this.deliveryMode + ", userEmail=" + this.userEmail + ", storeName=" + this.storeName + ", storeId=" + this.storeId + ", pickupHelpNumber=" + this.pickupHelpNumber + ", fulfillmentPartner=" + this.fulfillmentPartner + ", deliveryCost=" + this.deliveryCost + ", totalTax=" + this.totalTax + ", totalPriceWithTax=" + this.totalPriceWithTax + ", orderTotalAtCheckout=" + this.orderTotalAtCheckout + ", totalPriceCurrency=" + this.totalPriceCurrency + ", timeSlot=" + this.timeSlot + ", cartItems=" + this.cartItems + ", substitutionPreference=" + this.substitutionPreference + ", orderNumber=" + this.orderNumber + ", deliveryAddress=" + this.deliveryAddress + ", earlyDelivery=" + this.earlyDelivery + ", phoneNumber=" + this.phoneNumber + ", zipCode=" + this.zipCode + ", totalSavings=" + this.totalSavings + ", isBopasEnabled=" + this.isBopasEnabled + ", isBopasSlot=" + this.isBopasSlot + ", paymentDetails=" + this.paymentDetails + ", preTipAndRateDetails=" + this.preTipAndRateDetails + ", paymentStatusWidget=" + this.paymentStatusWidget + ", ebtDesiredChargeAmount=" + this.ebtDesiredChargeAmount + ", ebtTotal=" + this.ebtTotal + ", ebtCardEndingNumber=" + this.ebtCardEndingNumber + ", ebtCardBalance=" + this.ebtCardBalance + ", creditDebitCardTotal=" + this.creditDebitCardTotal + ", cardEndingNumber=" + this.cardEndingNumber + ", creditCardType=" + this.creditCardType + ", isEBTOrder=" + this.isEBTOrder + ", partnerEligibility=" + this.partnerEligibility + ", isEZCDOrder=" + this.isEZCDOrder + ", fulfillmentEligibility=" + this.fulfillmentEligibility + ", temporaryHold=" + this.temporaryHold + ", isBunchaEnabled=" + this.isBunchaEnabled + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ')';
    }

    private final AbstractC5607a H(String start, String end) {
        return Intrinsics.e(this.deliveryMode, "delivery") ? AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f99483B9, start, end) : AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f99597H9, start, end);
    }

    private final AbstractC5607a I() {
        OrderDetailsPickUpTimeDecorator orderDetailsPickUpTimeDecorator = this.timeSlot;
        if (orderDetailsPickUpTimeDecorator == null) {
            return null;
        }
        String startTime = orderDetailsPickUpTimeDecorator.getStartTime();
        if (startTime != null) {
            String endTime = orderDetailsPickUpTimeDecorator.getEndTime();
            AbstractC5607a abstractC5607aH = endTime != null ? H(startTime, endTime) : null;
            if (abstractC5607aH != null) {
                return abstractC5607aH;
            }
        }
        return a(orderDetailsPickUpTimeDecorator.getStartTime());
    }

    private final boolean Q() {
        return this.isBunchaEnabled && Intrinsics.e(this.deliveryMode, "delivery") && Intrinsics.e(this.partnerEligibility, ej.o.f128952f.getPartnerName());
    }

    private final AbstractC5607a a(String startTime) {
        String startTime2;
        String endTime;
        AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
        int i10 = com.meijer.mobile.meijer.Y.f99673L9;
        if (startTime == null) {
            startTime = "";
        }
        AbstractC5607a abstractC5607aD = companion.d(i10, startTime);
        if (!this.isBopasEnabled || !this.isBopasSlot) {
            abstractC5607aD = null;
        }
        if (abstractC5607aD != null) {
            return abstractC5607aD;
        }
        OrderDetailsPickUpTimeDecorator orderDetailsPickUpTimeDecorator = this.timeSlot;
        if (orderDetailsPickUpTimeDecorator == null || (startTime2 = orderDetailsPickUpTimeDecorator.getStartTime()) == null || (endTime = this.timeSlot.getEndTime()) == null) {
            return null;
        }
        return companion.d(com.meijer.mobile.meijer.Y.f99597H9, startTime2, endTime);
    }

    /* renamed from: A, reason: from getter */
    public final PaymentStatusWidgetDecorator getPaymentStatusWidget() {
        return this.paymentStatusWidget;
    }

    /* renamed from: B, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* renamed from: C, reason: from getter */
    public final PreTipDecorator getPreTipAndRateDetails() {
        return this.preTipAndRateDetails;
    }

    /* renamed from: D, reason: from getter */
    public final String getStoreId() {
        return this.storeId;
    }

    /* renamed from: E, reason: from getter */
    public final String getSubstitutionPreference() {
        return this.substitutionPreference;
    }

    /* renamed from: F, reason: from getter */
    public final AbstractC5607a getTemporaryHold() {
        return this.temporaryHold;
    }

    /* renamed from: G, reason: from getter */
    public final OrderDetailsPickUpTimeDecorator getTimeSlot() {
        return this.timeSlot;
    }

    /* renamed from: J, reason: from getter */
    public final String getTotalPriceCurrency() {
        return this.totalPriceCurrency;
    }

    /* renamed from: K, reason: from getter */
    public final double getTotalPriceWithTax() {
        return this.totalPriceWithTax;
    }

    /* renamed from: L, reason: from getter */
    public final double getTotalSavings() {
        return this.totalSavings;
    }

    /* renamed from: M, reason: from getter */
    public final double getTotalTax() {
        return this.totalTax;
    }

    public final List<WhatsNextItemDecorator> N() {
        if (W()) {
            AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
            AbstractC5607a abstractC5607aD = companion.d(com.meijer.mobile.meijer.Y.f100098h9, new Object[0]);
            Integer numValueOf = Integer.valueOf(com.meijer.mobile.meijer.Y.f100126ii);
            if (!this.isBopasEnabled || !this.isBopasSlot) {
                numValueOf = null;
            }
            return CollectionsKt.p(new WhatsNextItemDecorator(abstractC5607aD, companion.d(numValueOf != null ? numValueOf.intValue() : com.meijer.mobile.meijer.Y.f100107hi, this.userEmail), companion.d(com.meijer.mobile.meijer.Y.f100383vf, new Object[0]), false, 8, null), new WhatsNextItemDecorator(companion.d(com.meijer.mobile.meijer.Y.f100118i9, new Object[0]), this.pickupHelpNumber.length() > 0 ? companion.d(com.meijer.mobile.meijer.Y.f100146ji, Fk.a.f10894a.a(this.pickupHelpNumber)) : companion.d(com.meijer.mobile.meijer.Y.f100166ki, new Object[0]), companion.d(com.meijer.mobile.meijer.Y.f100403wf, new Object[0]), this.pickupHelpNumber.length() > 0), new WhatsNextItemDecorator(companion.d(com.meijer.mobile.meijer.Y.f100137j9, new Object[0]), companion.d(com.meijer.mobile.meijer.Y.f100186li, new Object[0]), companion.d(com.meijer.mobile.meijer.Y.f100423xf, new Object[0]), false, 8, null), new WhatsNextItemDecorator(companion.d(com.meijer.mobile.meijer.Y.f100157k9, new Object[0]), companion.d(com.meijer.mobile.meijer.Y.f100206mi, new Object[0]), companion.d(com.meijer.mobile.meijer.Y.f100443yf, new Object[0]), false, 8, null));
        }
        if (X()) {
            AbstractC5607a.Companion companion2 = AbstractC5607a.INSTANCE;
            return CollectionsKt.p(new WhatsNextItemDecorator(companion2.d(com.meijer.mobile.meijer.Y.f100098h9, new Object[0]), companion2.d(com.meijer.mobile.meijer.Y.f100226ni, new Object[0]), companion2.d(com.meijer.mobile.meijer.Y.f100383vf, new Object[0]), false, 8, null), new WhatsNextItemDecorator(companion2.d(com.meijer.mobile.meijer.Y.f100118i9, new Object[0]), companion2.d(com.meijer.mobile.meijer.Y.f100246oi, new Object[0]), companion2.d(com.meijer.mobile.meijer.Y.f100403wf, new Object[0]), true), new WhatsNextItemDecorator(companion2.d(com.meijer.mobile.meijer.Y.f100137j9, new Object[0]), companion2.d(com.meijer.mobile.meijer.Y.f100266pi, this.storeName), companion2.d(com.meijer.mobile.meijer.Y.f100423xf, new Object[0]), false, 8, null), new WhatsNextItemDecorator(companion2.d(com.meijer.mobile.meijer.Y.f100157k9, new Object[0]), companion2.d(com.meijer.mobile.meijer.Y.f100286qi, new Object[0]), companion2.d(com.meijer.mobile.meijer.Y.f100443yf, new Object[0]), false, 8, null), new WhatsNextItemDecorator(companion2.d(com.meijer.mobile.meijer.Y.f100177l9, new Object[0]), companion2.d(com.meijer.mobile.meijer.Y.f100306ri, new Object[0]), companion2.d(com.meijer.mobile.meijer.Y.f100463zf, new Object[0]), false, 8, null));
        }
        if (R()) {
            AbstractC5607a.Companion companion3 = AbstractC5607a.INSTANCE;
            return CollectionsKt.p(new WhatsNextItemDecorator(companion3.d(com.meijer.mobile.meijer.Y.f100098h9, new Object[0]), companion3.d(com.meijer.mobile.meijer.Y.f99967ai, new Object[0]), companion3.d(com.meijer.mobile.meijer.Y.f100383vf, new Object[0]), false, 8, null), new WhatsNextItemDecorator(companion3.d(com.meijer.mobile.meijer.Y.f100118i9, new Object[0]), companion3.d(com.meijer.mobile.meijer.Y.f99987bi, new Object[0]), companion3.d(com.meijer.mobile.meijer.Y.f100403wf, new Object[0]), false, 8, null), new WhatsNextItemDecorator(companion3.d(com.meijer.mobile.meijer.Y.f100137j9, new Object[0]), companion3.d(com.meijer.mobile.meijer.Y.f100007ci, new Object[0]), companion3.d(com.meijer.mobile.meijer.Y.f100423xf, new Object[0]), false, 8, null), new WhatsNextItemDecorator(companion3.d(com.meijer.mobile.meijer.Y.f100157k9, new Object[0]), companion3.d(com.meijer.mobile.meijer.Y.f100027di, new Object[0]), companion3.d(com.meijer.mobile.meijer.Y.f100443yf, new Object[0]), false, 8, null));
        }
        if (T()) {
            AbstractC5607a.Companion companion4 = AbstractC5607a.INSTANCE;
            return CollectionsKt.p(new WhatsNextItemDecorator(companion4.d(com.meijer.mobile.meijer.Y.f100098h9, new Object[0]), companion4.d(com.meijer.mobile.meijer.Y.f100047ei, new Object[0]), companion4.d(com.meijer.mobile.meijer.Y.f100383vf, new Object[0]), false, 8, null), new WhatsNextItemDecorator(companion4.d(com.meijer.mobile.meijer.Y.f100118i9, new Object[0]), companion4.d(com.meijer.mobile.meijer.Y.f100067fi, new Object[0]), companion4.d(com.meijer.mobile.meijer.Y.f100403wf, new Object[0]), false, 8, null), new WhatsNextItemDecorator(companion4.d(com.meijer.mobile.meijer.Y.f100137j9, new Object[0]), companion4.d(com.meijer.mobile.meijer.Y.f100087gi, new Object[0]), companion4.d(com.meijer.mobile.meijer.Y.f100423xf, new Object[0]), false, 8, null));
        }
        if (!Q()) {
            return CollectionsKt.m();
        }
        AbstractC5607a.Companion companion5 = AbstractC5607a.INSTANCE;
        return CollectionsKt.p(new WhatsNextItemDecorator(companion5.d(com.meijer.mobile.meijer.Y.f100098h9, new Object[0]), companion5.d(com.meijer.mobile.meijer.Y.f99909Xh, new Object[0]), companion5.d(com.meijer.mobile.meijer.Y.f100383vf, new Object[0]), false, 8, null), new WhatsNextItemDecorator(companion5.d(com.meijer.mobile.meijer.Y.f100118i9, new Object[0]), companion5.d(com.meijer.mobile.meijer.Y.f99928Yh, new Object[0]), companion5.d(com.meijer.mobile.meijer.Y.f100403wf, new Object[0]), false, 8, null), new WhatsNextItemDecorator(companion5.d(com.meijer.mobile.meijer.Y.f100137j9, new Object[0]), companion5.d(com.meijer.mobile.meijer.Y.f99947Zh, new Object[0]), companion5.d(com.meijer.mobile.meijer.Y.f100423xf, new Object[0]), false, 8, null));
    }

    /* renamed from: O, reason: from getter */
    public final String getZipCode() {
        return this.zipCode;
    }

    /* renamed from: P, reason: from getter */
    public final boolean getIsBopasSlot() {
        return this.isBopasSlot;
    }

    public final boolean R() {
        return Intrinsics.e(this.deliveryMode, "delivery") && Intrinsics.e(this.partnerEligibility, ej.o.f128950d.getPartnerName());
    }

    public final boolean T() {
        return Intrinsics.e(this.deliveryMode, "delivery") && Intrinsics.e(this.partnerEligibility, ej.o.f128951e.getPartnerName());
    }

    /* renamed from: U, reason: from getter */
    public final boolean getIsEBTOrder() {
        return this.isEBTOrder;
    }

    /* renamed from: V, reason: from getter */
    public final boolean getIsEZCDOrder() {
        return this.isEZCDOrder;
    }

    public final boolean W() {
        if (Intrinsics.e(this.deliveryMode, "pickup")) {
            return Intrinsics.e(this.fulfillmentPartner, "MEIJER") || Intrinsics.e(this.fulfillmentPartner, "MI9") || Intrinsics.e(this.fulfillmentPartner, "MFC");
        }
        return false;
    }

    public final boolean X() {
        return Intrinsics.e(this.deliveryMode, "pickup") && Intrinsics.e(this.fulfillmentPartner, "SHIPT");
    }

    /* renamed from: b, reason: from getter */
    public final AbstractC5607a getCardEndingNumber() {
        return this.cardEndingNumber;
    }

    /* renamed from: c, reason: from getter */
    public final CartItemsDecorator getCartItems() {
        return this.cartItems;
    }

    /* renamed from: d, reason: from getter */
    public final int getCartSummaryImageResourceId() {
        return this.cartSummaryImageResourceId;
    }

    public final AbstractC5607a e() {
        String weekDay;
        String date;
        String startTime;
        String endTime;
        OrderDetailsPickUpTimeDecorator orderDetailsPickUpTimeDecorator = this.timeSlot;
        if (Intrinsics.e(orderDetailsPickUpTimeDecorator != null ? orderDetailsPickUpTimeDecorator.getWeekDay() : null, "Today")) {
            return I();
        }
        OrderDetailsPickUpTimeDecorator orderDetailsPickUpTimeDecorator2 = this.timeSlot;
        if (orderDetailsPickUpTimeDecorator2 == null || (weekDay = orderDetailsPickUpTimeDecorator2.getWeekDay()) == null || (date = this.timeSlot.getDate()) == null || (startTime = this.timeSlot.getStartTime()) == null || (endTime = this.timeSlot.getEndTime()) == null) {
            return null;
        }
        return Intrinsics.e(this.deliveryMode, "delivery") ? AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f99464A9, weekDay, date, startTime, endTime) : AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f99578G9, weekDay, date, startTime, endTime);
    }

    public final AbstractC5607a f() {
        return AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f100269q1, this.userEmail);
    }

    public final AbstractC5607a g() {
        String str = this.orderNumber;
        if (str != null) {
            return AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f99637Jb, str);
        }
        return null;
    }

    public final AbstractC5607a h() {
        AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
        AbstractC5607a abstractC5607aD = companion.d(com.meijer.mobile.meijer.Y.f99540E9, new Object[0]);
        if (!W()) {
            abstractC5607aD = null;
        }
        if (abstractC5607aD == null) {
            abstractC5607aD = companion.d(com.meijer.mobile.meijer.Y.f99559F9, new Object[0]);
            if (!X()) {
                abstractC5607aD = null;
            }
            if (abstractC5607aD == null) {
                abstractC5607aD = companion.d(com.meijer.mobile.meijer.Y.f99502C9, new Object[0]);
                if (!R()) {
                    abstractC5607aD = null;
                }
                if (abstractC5607aD == null) {
                    abstractC5607aD = companion.d(com.meijer.mobile.meijer.Y.f99521D9, new Object[0]);
                    if (!T()) {
                        abstractC5607aD = null;
                    }
                    if (abstractC5607aD == null) {
                        AbstractC5607a abstractC5607aD2 = Q() ? companion.d(com.meijer.mobile.meijer.Y.f100457z9, new Object[0]) : null;
                        return abstractC5607aD2 == null ? companion.d(com.meijer.mobile.meijer.Y.f99559F9, new Object[0]) : abstractC5607aD2;
                    }
                }
            }
        }
        return abstractC5607aD;
    }

    /* renamed from: i, reason: from getter */
    public final CardType getCreditCardType() {
        return this.creditCardType;
    }

    /* renamed from: j, reason: from getter */
    public final AbstractC5607a getCreditDebitCardTotal() {
        return this.creditDebitCardTotal;
    }

    /* renamed from: k, reason: from getter */
    public final double getDeliveryCost() {
        return this.deliveryCost;
    }

    /* renamed from: l, reason: from getter */
    public final String getDeliveryMode() {
        return this.deliveryMode;
    }

    /* renamed from: m, reason: from getter */
    public final boolean getEarlyDelivery() {
        return this.earlyDelivery;
    }

    /* renamed from: n, reason: from getter */
    public final AbstractC5607a getEbtCardBalance() {
        return this.ebtCardBalance;
    }

    /* renamed from: o, reason: from getter */
    public final AbstractC5607a getEbtCardEndingNumber() {
        return this.ebtCardEndingNumber;
    }

    /* renamed from: p, reason: from getter */
    public final Double getEbtDesiredChargeAmount() {
        return this.ebtDesiredChargeAmount;
    }

    /* renamed from: q, reason: from getter */
    public final AbstractC5607a getEbtTotal() {
        return this.ebtTotal;
    }

    /* renamed from: t, reason: from getter */
    public final String getFulfillmentEligibility() {
        return this.fulfillmentEligibility;
    }

    /* renamed from: u, reason: from getter */
    public final Integer getImageResourceId() {
        return this.imageResourceId;
    }

    /* renamed from: v, reason: from getter */
    public final String getOrderNumber() {
        return this.orderNumber;
    }

    public final AbstractC5607a w() {
        String str = this.orderNumber;
        if (str != null) {
            return AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f99711N9, str);
        }
        return null;
    }

    public final AbstractC5607a x() {
        AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
        return companion.d(com.meijer.mobile.meijer.Y.f99730O9, companion.d(Intrinsics.e(this.deliveryMode, "pickup") ? com.meijer.mobile.meijer.Y.f99561Fb : com.meijer.mobile.meijer.Y.f99799S2, new Object[0]));
    }

    /* renamed from: y, reason: from getter */
    public final AbstractC5607a getOrderTotalAtCheckout() {
        return this.orderTotalAtCheckout;
    }

    /* renamed from: z, reason: from getter */
    public final PaymentDetailItem getPaymentDetails() {
        return this.paymentDetails;
    }

    private final boolean S() {
        if (!T() && !R() && !Q()) {
            return false;
        }
        return true;
    }

    public final List<FaqItemDecorator> r() {
        if (W()) {
            AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
            return CollectionsKt.p(new FaqItemDecorator(companion.d(com.meijer.mobile.meijer.Y.f100096h7, new Object[0]), companion.d(com.meijer.mobile.meijer.Y.f100216n8, new Object[0]), companion.d(com.meijer.mobile.meijer.Y.f100236o8, new Object[0]), true), new FaqItemDecorator(companion.d(com.meijer.mobile.meijer.Y.f100265ph, new Object[0]), companion.d(com.meijer.mobile.meijer.Y.f100256p8, new Object[0]), null, false, 12, null), new FaqItemDecorator(companion.d(com.meijer.mobile.meijer.Y.f100346ti, new Object[0]), companion.d(com.meijer.mobile.meijer.Y.f100276q8, new Object[0]), null, false, 12, null));
        }
        if (X()) {
            AbstractC5607a.Companion companion2 = AbstractC5607a.INSTANCE;
            return CollectionsKt.p(new FaqItemDecorator(companion2.d(com.meijer.mobile.meijer.Y.f100096h7, new Object[0]), companion2.d(com.meijer.mobile.meijer.Y.f100382ve, new Object[0]), companion2.d(com.meijer.mobile.meijer.Y.f100402we, new Object[0]), false, 8, null), new FaqItemDecorator(companion2.d(com.meijer.mobile.meijer.Y.f100265ph, new Object[0]), companion2.d(com.meijer.mobile.meijer.Y.f100245oh, new Object[0]), null, false, 12, null), new FaqItemDecorator(companion2.d(com.meijer.mobile.meijer.Y.f100346ti, new Object[0]), companion2.d(com.meijer.mobile.meijer.Y.f100422xe, new Object[0]), null, false, 12, null));
        }
        if (R()) {
            AbstractC5607a.Companion companion3 = AbstractC5607a.INSTANCE;
            return CollectionsKt.p(new FaqItemDecorator(companion3.d(com.meijer.mobile.meijer.Y.f100096h7, new Object[0]), companion3.d(com.meijer.mobile.meijer.Y.f99913Y2, new Object[0]), companion3.d(com.meijer.mobile.meijer.Y.f99932Z2, new Object[0]), false, 8, null), new FaqItemDecorator(companion3.d(com.meijer.mobile.meijer.Y.f100175l7, new Object[0]), companion3.d(com.meijer.mobile.meijer.Y.f99894X2, new Object[0]), null, false, 12, null), new FaqItemDecorator(companion3.d(com.meijer.mobile.meijer.Y.f100265ph, new Object[0]), companion3.d(com.meijer.mobile.meijer.Y.f100245oh, new Object[0]), null, false, 12, null), new FaqItemDecorator(companion3.d(com.meijer.mobile.meijer.Y.f100346ti, new Object[0]), companion3.d(com.meijer.mobile.meijer.Y.f99952a3, new Object[0]), null, false, 12, null));
        }
        if (Q()) {
            AbstractC5607a.Companion companion4 = AbstractC5607a.INSTANCE;
            return CollectionsKt.p(new FaqItemDecorator(companion4.d(com.meijer.mobile.meijer.Y.f100096h7, new Object[0]), companion4.d(com.meijer.mobile.meijer.Y.f99913Y2, new Object[0]), companion4.d(com.meijer.mobile.meijer.Y.f99856V2, new Object[0]), false, 8, null), new FaqItemDecorator(companion4.d(com.meijer.mobile.meijer.Y.f100175l7, new Object[0]), companion4.d(com.meijer.mobile.meijer.Y.f99837U2, new Object[0]), null, false, 12, null), new FaqItemDecorator(companion4.d(com.meijer.mobile.meijer.Y.f100265ph, new Object[0]), companion4.d(com.meijer.mobile.meijer.Y.f100245oh, new Object[0]), null, false, 12, null), new FaqItemDecorator(companion4.d(com.meijer.mobile.meijer.Y.f100346ti, new Object[0]), companion4.d(com.meijer.mobile.meijer.Y.f99875W2, new Object[0]), null, false, 12, null));
        }
        if (T()) {
            AbstractC5607a.Companion companion5 = AbstractC5607a.INSTANCE;
            return CollectionsKt.p(new FaqItemDecorator(companion5.d(com.meijer.mobile.meijer.Y.f100096h7, new Object[0]), companion5.d(com.meijer.mobile.meijer.Y.f100032e3, new Object[0]), companion5.d(com.meijer.mobile.meijer.Y.f100052f3, new Object[0]), false, 8, null), new FaqItemDecorator(companion5.d(com.meijer.mobile.meijer.Y.f100362ue, new Object[0]), companion5.d(com.meijer.mobile.meijer.Y.f100012d3, new Object[0]), null, false, 12, null), new FaqItemDecorator(companion5.d(com.meijer.mobile.meijer.Y.f100265ph, new Object[0]), companion5.d(com.meijer.mobile.meijer.Y.f100245oh, new Object[0]), null, false, 12, null), new FaqItemDecorator(companion5.d(com.meijer.mobile.meijer.Y.f100346ti, new Object[0]), companion5.d(com.meijer.mobile.meijer.Y.f100072g3, new Object[0]), null, false, 12, null));
        }
        return CollectionsKt.m();
    }

    public final AbstractC5607a s() {
        if (S()) {
            CustomerAddress customerAddress = this.deliveryAddress;
            if (customerAddress == null) {
                return null;
            }
            return AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f100417x9, customerAddress.getLine1());
        }
        String str = this.storeName;
        if (StringsKt.r0(str)) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        return AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f100437y9, str);
    }

    public /* synthetic */ OrderConfirmationDecorator(String str, String str2, String str3, String str4, String str5, String str6, double d10, double d11, double d12, AbstractC5607a abstractC5607a, String str7, OrderDetailsPickUpTimeDecorator orderDetailsPickUpTimeDecorator, CartItemsDecorator cartItemsDecorator, String str8, String str9, CustomerAddress customerAddress, boolean z10, String str10, String str11, double d13, boolean z11, boolean z12, PaymentDetailItem paymentDetailItem, PreTipDecorator preTipDecorator, PaymentStatusWidgetDecorator paymentStatusWidgetDecorator, Double d14, AbstractC5607a abstractC5607a2, AbstractC5607a abstractC5607a3, AbstractC5607a abstractC5607a4, AbstractC5607a abstractC5607a5, AbstractC5607a abstractC5607a6, CardType cardType, boolean z13, String str12, boolean z14, String str13, AbstractC5607a abstractC5607a7, boolean z15, String str14, String str15, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i10 & 8) != 0 ? null : str4, str5, str6, (i10 & 64) != 0 ? 0.0d : d10, (i10 & 128) != 0 ? 0.0d : d11, (i10 & 256) != 0 ? 0.0d : d12, (i10 & 512) != 0 ? null : abstractC5607a, (i10 & 1024) != 0 ? null : str7, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? null : orderDetailsPickUpTimeDecorator, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : cartItemsDecorator, (i10 & 8192) != 0 ? null : str8, (i10 & 16384) != 0 ? null : str9, (32768 & i10) != 0 ? null : customerAddress, (65536 & i10) != 0 ? false : z10, (131072 & i10) != 0 ? null : str10, (262144 & i10) != 0 ? null : str11, (524288 & i10) != 0 ? 0.0d : d13, (1048576 & i10) != 0 ? false : z11, (2097152 & i10) != 0 ? false : z12, (4194304 & i10) != 0 ? null : paymentDetailItem, (8388608 & i10) != 0 ? null : preTipDecorator, (16777216 & i10) != 0 ? null : paymentStatusWidgetDecorator, (33554432 & i10) != 0 ? null : d14, (67108864 & i10) != 0 ? null : abstractC5607a2, (134217728 & i10) != 0 ? null : abstractC5607a3, (268435456 & i10) != 0 ? null : abstractC5607a4, (536870912 & i10) != 0 ? null : abstractC5607a5, (1073741824 & i10) != 0 ? null : abstractC5607a6, (i10 & Integer.MIN_VALUE) != 0 ? null : cardType, (i11 & 1) != 0 ? false : z13, (i11 & 2) != 0 ? null : str12, (i11 & 4) != 0 ? false : z14, (i11 & 8) != 0 ? null : str13, (i11 & 16) != 0 ? null : abstractC5607a7, (i11 & 32) != 0 ? false : z15, (i11 & 64) != 0 ? null : str14, (i11 & 128) != 0 ? null : str15);
    }
}
