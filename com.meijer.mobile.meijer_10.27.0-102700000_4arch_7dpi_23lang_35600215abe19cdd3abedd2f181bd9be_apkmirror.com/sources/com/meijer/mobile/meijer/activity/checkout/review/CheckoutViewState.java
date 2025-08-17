package com.meijer.mobile.meijer.activity.checkout.review;

import ak.AbstractC5607a;
import androidx.recyclerview.widget.RecyclerView;
import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.meijer.activity.cart.CartOrderSummaryDecorator;
import com.meijer.mobile.meijer.activity.checkout.contactinformation.ContactInformationDecorator;
import com.meijer.mobile.meijer.activity.checkout.review.Q1;
import gk.MultiTenderPaymentOption;
import gk.PaymentOption;
import jl.CheckoutFlowState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b^\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001Bå\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\b\u0002\u0010\"\u001a\u00020!\u0012\b\b\u0002\u0010$\u001a\u00020#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\b\b\u0002\u0010'\u001a\u00020\u0014\u0012\b\b\u0002\u0010)\u001a\u00020(\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u00100\u001a\u00020/\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u000101\u0012\b\b\u0002\u00103\u001a\u00020\u0014\u0012\b\b\u0002\u00104\u001a\u00020\u0014\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u000105\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u000107\u0012\b\b\u0002\u00109\u001a\u00020\u0014\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u000105¢\u0006\u0004\b;\u0010<Jî\u0002\u0010=\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00102\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010$\u001a\u00020#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\b\b\u0002\u0010'\u001a\u00020\u00142\b\b\u0002\u0010)\u001a\u00020(2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u00100\u001a\u00020/2\n\b\u0002\u00102\u001a\u0004\u0018\u0001012\b\b\u0002\u00103\u001a\u00020\u00142\b\b\u0002\u00104\u001a\u00020\u00142\n\b\u0002\u00106\u001a\u0004\u0018\u0001052\n\b\u0002\u00108\u001a\u0004\u0018\u0001072\b\b\u0002\u00109\u001a\u00020\u00142\n\b\u0002\u0010:\u001a\u0004\u0018\u000105HÆ\u0001¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u000205HÖ\u0001¢\u0006\u0004\b?\u0010@J\u0010\u0010B\u001a\u00020AHÖ\u0001¢\u0006\u0004\bB\u0010CJ\u001a\u0010E\u001a\u00020\u00142\b\u0010D\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bE\u0010FR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b=\u0010G\u001a\u0004\bH\u0010IR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010mR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bn\u0010pR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\b^\u0010sR\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\bt\u0010u\u001a\u0004\bv\u0010wR\u0017\u0010\u001c\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bd\u0010c\u001a\u0004\bV\u0010eR\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\bh\u0010x\u001a\u0004\by\u0010zR\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~R\u0019\u0010\"\u001a\u00020!8\u0006¢\u0006\u000e\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0005\bZ\u0010\u0081\u0001R\u0019\u0010$\u001a\u00020#8\u0006¢\u0006\u000e\n\u0005\b}\u0010\u0082\u0001\u001a\u0005\bq\u0010\u0083\u0001R\u001c\u0010&\u001a\u0004\u0018\u00010%8\u0006¢\u0006\u000f\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0005\b\u007f\u0010\u0086\u0001R\u0019\u0010'\u001a\u00020\u00148\u0006¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010k\u001a\u0005\b\u0088\u0001\u0010mR'\u0010)\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bT\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001b\u0010+\u001a\u0004\u0018\u00010*8\u0006¢\u0006\u000e\n\u0005\bX\u0010\u008e\u0001\u001a\u0005\bj\u0010\u008f\u0001R\u001c\u0010-\u001a\u0004\u0018\u00010,8\u0006¢\u0006\u000f\n\u0006\b\u008a\u0001\u0010\u0090\u0001\u001a\u0005\bb\u0010\u0091\u0001R\u001c\u0010.\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\u000f\n\u0005\bL\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001a\u00100\u001a\u00020/8\u0006¢\u0006\u000f\n\u0005\b`\u0010\u0095\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R\u001c\u00102\u001a\u0004\u0018\u0001018\u0006¢\u0006\u000f\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0005\bR\u0010\u009a\u0001R\u0019\u00103\u001a\u00020\u00148\u0006¢\u0006\u000e\n\u0005\b\u0096\u0001\u0010k\u001a\u0005\b\u009b\u0001\u0010mR\u0018\u00104\u001a\u00020\u00148\u0006¢\u0006\r\n\u0004\bP\u0010k\u001a\u0005\b\u009c\u0001\u0010mR\u001b\u00106\u001a\u0004\u0018\u0001058\u0006¢\u0006\u000e\n\u0005\bH\u0010\u009d\u0001\u001a\u0005\b\u0084\u0001\u0010@R\u001c\u00108\u001a\u0004\u0018\u0001078\u0006¢\u0006\u000f\n\u0006\b\u009c\u0001\u0010\u009e\u0001\u001a\u0005\bf\u0010\u009f\u0001R\u0017\u00109\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\\\u0010k\u001a\u0004\b{\u0010mR\u001a\u0010:\u001a\u0004\u0018\u0001058\u0006¢\u0006\r\n\u0005\bv\u0010\u009d\u0001\u001a\u0004\bN\u0010@R\u001d\u0010£\u0001\u001a\u00030 \u00018\u0006¢\u0006\u0010\n\u0006\b\u0093\u0001\u0010¡\u0001\u001a\u0006\b\u0098\u0001\u0010¢\u0001R\u0015\u0010¤\u0001\u001a\u00030 \u00018F¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010¢\u0001R\u0014\u0010¥\u0001\u001a\u00030 \u00018F¢\u0006\u0007\u001a\u0005\bt\u0010¢\u0001¨\u0006¦\u0001"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/D1;", "", "Lgk/f;", "selectedPaymentOption", "Lgk/e;", "multiTenderPaymentOption", "Lcom/meijer/mobile/meijer/activity/cart/n0;", "pricingSummary", "Lcom/meijer/mobile/meijer/activity/checkout/review/Q1;", "fulfillmentMode", "Lcom/meijer/mobile/meijer/activity/checkout/review/R1;", "fulfillmentSlot", "Lcom/meijer/mobile/meijer/activity/checkout/review/X1;", "storeDecorator", "Lcom/meijer/mobile/meijer/activity/checkout/review/U1;", "pickupPerson", "Lcom/meijer/mobile/meijer/activity/checkout/review/a;", "deliveryAddress", "Lcom/meijer/mobile/meijer/activity/checkout/review/M1;", "deliveryInstructions", "", "earlyDelivery", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/a;", "contactInformation", "Lcom/meijer/mobile/meijer/activity/checkout/review/u;", "cartItems", "Lcom/meijer/mobile/meijer/activity/checkout/review/Y1;", "substitutionPreference", "billingAddress", "Lcom/meijer/mobile/meijer/activity/checkout/review/b;", "formAddress", "Lcom/meijer/mobile/meijer/activity/checkout/review/O1;", "ebtCardDetails", "Lcom/meijer/mobile/meijer/activity/checkout/review/q;", "cardDetails", "Lcom/meijer/mobile/meijer/activity/checkout/review/L1;", "creditCardCharges", "Lcom/meijer/mobile/meijer/activity/checkout/review/N1;", "ebtCardCharges", "isValid", "Lcom/meijer/mobile/meijer/activity/checkout/review/S1;", "loadingState", "Ljl/f;", "checkoutFlowState", "Lcom/meijer/mobile/meijer/activity/checkout/review/d0;", "checkoutAnimations", "isBopasEligibleCart", "Lcom/meijer/mobile/meijer/activity/checkout/review/V1;", "preTipDecorator", "Lcom/meijer/mobile/meijer/activity/checkout/review/p;", "adjustEbtPaymentDecorator", "isEbtPinPadProcessing", "showOrderCancellationWarning", "", "ebtTimerText", "Lcom/meijer/mobile/meijer/activity/checkout/review/e0;", "checkoutErrorDialogDecorator", "displayInstacartTermsOfServiceAgreement", "acculynkPostBody", "<init>", "(Lgk/f;Lgk/e;Lcom/meijer/mobile/meijer/activity/cart/n0;Lcom/meijer/mobile/meijer/activity/checkout/review/Q1;Lcom/meijer/mobile/meijer/activity/checkout/review/R1;Lcom/meijer/mobile/meijer/activity/checkout/review/X1;Lcom/meijer/mobile/meijer/activity/checkout/review/U1;Lcom/meijer/mobile/meijer/activity/checkout/review/a;Lcom/meijer/mobile/meijer/activity/checkout/review/M1;ZLcom/meijer/mobile/meijer/activity/checkout/contactinformation/a;Lcom/meijer/mobile/meijer/activity/checkout/review/u;Lcom/meijer/mobile/meijer/activity/checkout/review/Y1;Lcom/meijer/mobile/meijer/activity/checkout/review/a;Lcom/meijer/mobile/meijer/activity/checkout/review/b;Lcom/meijer/mobile/meijer/activity/checkout/review/O1;Lcom/meijer/mobile/meijer/activity/checkout/review/q;Lcom/meijer/mobile/meijer/activity/checkout/review/L1;Lcom/meijer/mobile/meijer/activity/checkout/review/N1;ZLcom/meijer/mobile/meijer/activity/checkout/review/S1;Ljl/f;Lcom/meijer/mobile/meijer/activity/checkout/review/d0;Ljava/lang/Boolean;Lcom/meijer/mobile/meijer/activity/checkout/review/V1;Lcom/meijer/mobile/meijer/activity/checkout/review/p;ZZLjava/lang/String;Lcom/meijer/mobile/meijer/activity/checkout/review/e0;ZLjava/lang/String;)V", "a", "(Lgk/f;Lgk/e;Lcom/meijer/mobile/meijer/activity/cart/n0;Lcom/meijer/mobile/meijer/activity/checkout/review/Q1;Lcom/meijer/mobile/meijer/activity/checkout/review/R1;Lcom/meijer/mobile/meijer/activity/checkout/review/X1;Lcom/meijer/mobile/meijer/activity/checkout/review/U1;Lcom/meijer/mobile/meijer/activity/checkout/review/a;Lcom/meijer/mobile/meijer/activity/checkout/review/M1;ZLcom/meijer/mobile/meijer/activity/checkout/contactinformation/a;Lcom/meijer/mobile/meijer/activity/checkout/review/u;Lcom/meijer/mobile/meijer/activity/checkout/review/Y1;Lcom/meijer/mobile/meijer/activity/checkout/review/a;Lcom/meijer/mobile/meijer/activity/checkout/review/b;Lcom/meijer/mobile/meijer/activity/checkout/review/O1;Lcom/meijer/mobile/meijer/activity/checkout/review/q;Lcom/meijer/mobile/meijer/activity/checkout/review/L1;Lcom/meijer/mobile/meijer/activity/checkout/review/N1;ZLcom/meijer/mobile/meijer/activity/checkout/review/S1;Ljl/f;Lcom/meijer/mobile/meijer/activity/checkout/review/d0;Ljava/lang/Boolean;Lcom/meijer/mobile/meijer/activity/checkout/review/V1;Lcom/meijer/mobile/meijer/activity/checkout/review/p;ZZLjava/lang/String;Lcom/meijer/mobile/meijer/activity/checkout/review/e0;ZLjava/lang/String;)Lcom/meijer/mobile/meijer/activity/checkout/review/D1;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lgk/f;", "C", "()Lgk/f;", "b", "Lgk/e;", "x", "()Lgk/e;", "c", "Lcom/meijer/mobile/meijer/activity/cart/n0;", "B", "()Lcom/meijer/mobile/meijer/activity/cart/n0;", "d", "Lcom/meijer/mobile/meijer/activity/checkout/review/Q1;", "u", "()Lcom/meijer/mobile/meijer/activity/checkout/review/Q1;", "e", "Lcom/meijer/mobile/meijer/activity/checkout/review/R1;", "v", "()Lcom/meijer/mobile/meijer/activity/checkout/review/R1;", "f", "Lcom/meijer/mobile/meijer/activity/checkout/review/X1;", "E", "()Lcom/meijer/mobile/meijer/activity/checkout/review/X1;", "g", "Lcom/meijer/mobile/meijer/activity/checkout/review/U1;", "y", "()Lcom/meijer/mobile/meijer/activity/checkout/review/U1;", "h", "Lcom/meijer/mobile/meijer/activity/checkout/review/a;", "n", "()Lcom/meijer/mobile/meijer/activity/checkout/review/a;", "i", "Lcom/meijer/mobile/meijer/activity/checkout/review/M1;", "o", "()Lcom/meijer/mobile/meijer/activity/checkout/review/M1;", "j", "Z", "getEarlyDelivery", "()Z", "k", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/a;", "()Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/a;", "l", "Lcom/meijer/mobile/meijer/activity/checkout/review/u;", "()Lcom/meijer/mobile/meijer/activity/checkout/review/u;", "m", "Lcom/meijer/mobile/meijer/activity/checkout/review/Y1;", "F", "()Lcom/meijer/mobile/meijer/activity/checkout/review/Y1;", "Lcom/meijer/mobile/meijer/activity/checkout/review/b;", "getFormAddress", "()Lcom/meijer/mobile/meijer/activity/checkout/review/b;", "p", "Lcom/meijer/mobile/meijer/activity/checkout/review/O1;", "r", "()Lcom/meijer/mobile/meijer/activity/checkout/review/O1;", "q", "Lcom/meijer/mobile/meijer/activity/checkout/review/q;", "()Lcom/meijer/mobile/meijer/activity/checkout/review/q;", "Lcom/meijer/mobile/meijer/activity/checkout/review/L1;", "()Lcom/meijer/mobile/meijer/activity/checkout/review/L1;", "s", "Lcom/meijer/mobile/meijer/activity/checkout/review/N1;", "()Lcom/meijer/mobile/meijer/activity/checkout/review/N1;", "t", "I", "Lcom/meijer/mobile/meijer/activity/checkout/review/S1;", "w", "()Lcom/meijer/mobile/meijer/activity/checkout/review/S1;", "setLoadingState", "(Lcom/meijer/mobile/meijer/activity/checkout/review/S1;)V", "Ljl/f;", "()Ljl/f;", "Lcom/meijer/mobile/meijer/activity/checkout/review/d0;", "()Lcom/meijer/mobile/meijer/activity/checkout/review/d0;", "Ljava/lang/Boolean;", "G", "()Ljava/lang/Boolean;", "Lcom/meijer/mobile/meijer/activity/checkout/review/V1;", "A", "()Lcom/meijer/mobile/meijer/activity/checkout/review/V1;", "z", "Lcom/meijer/mobile/meijer/activity/checkout/review/p;", "()Lcom/meijer/mobile/meijer/activity/checkout/review/p;", "H", "D", "Ljava/lang/String;", "Lcom/meijer/mobile/meijer/activity/checkout/review/e0;", "()Lcom/meijer/mobile/meijer/activity/checkout/review/e0;", "Lak/a;", "Lak/a;", "()Lak/a;", "placeOrderButtonText", "estimateTotalWithPreTip", "creditCardChargesWithPreTip", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.checkout.review.D1, reason: from toString */
/* loaded from: classes9.dex */
public final /* data */ class CheckoutViewState {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isEbtPinPadProcessing;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean showOrderCancellationWarning;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata and from toString */
    private final String ebtTimerText;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata and from toString */
    private final CheckoutErrorDialogDecorator checkoutErrorDialogDecorator;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean displayInstacartTermsOfServiceAgreement;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata and from toString */
    private final String acculynkPostBody;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private final AbstractC5607a placeOrderButtonText;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final PaymentOption selectedPaymentOption;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final MultiTenderPaymentOption multiTenderPaymentOption;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final CartOrderSummaryDecorator pricingSummary;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Q1 fulfillmentMode;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final FulfillmentSlotInfoDecorator fulfillmentSlot;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final StoreDecorator storeDecorator;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final PickupPersonDecorator pickupPerson;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final AddressDecorator deliveryAddress;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final DeliveryInstructionsDecorator deliveryInstructions;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean earlyDelivery;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final ContactInformationDecorator contactInformation;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final CartItemsDecorator cartItems;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final SubstitutionPreferenceDecorator substitutionPreference;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final AddressDecorator billingAddress;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final AddressFormDecorator formAddress;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final EbtCardDetailsDecorator ebtCardDetails;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final CardDetailsDecorator cardDetails;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final CreditCardChargesDecorator creditCardCharges;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final EbtCardChargesDecorator ebtCardCharges;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isValid;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private LoadingState loadingState;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    private final CheckoutFlowState checkoutFlowState;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
    private final CheckoutAnimations checkoutAnimations;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean isBopasEligibleCart;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
    private final PreTipDecorator preTipDecorator;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
    private final AdjustEbtPaymentDecorator adjustEbtPaymentDecorator;

    public CheckoutViewState() {
        this(null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, false, null, null, false, null, -1, null);
    }

    public static /* synthetic */ CheckoutViewState b(CheckoutViewState checkoutViewState, PaymentOption paymentOption, MultiTenderPaymentOption multiTenderPaymentOption, CartOrderSummaryDecorator c11756n0, Q1 q12, FulfillmentSlotInfoDecorator r12, StoreDecorator x12, PickupPersonDecorator u12, AddressDecorator c11938a, DeliveryInstructionsDecorator deliveryInstructionsDecorator, boolean z10, ContactInformationDecorator contactInformationDecorator, CartItemsDecorator c11997u, SubstitutionPreferenceDecorator substitutionPreferenceDecorator, AddressDecorator c11938a2, AddressFormDecorator addressFormDecorator, EbtCardDetailsDecorator ebtCardDetailsDecorator, CardDetailsDecorator c11986q, CreditCardChargesDecorator l12, EbtCardChargesDecorator n12, boolean z11, LoadingState loadingState, CheckoutFlowState fVar, CheckoutAnimations c11948d0, Boolean bool, PreTipDecorator preTipDecorator, AdjustEbtPaymentDecorator adjustEbtPaymentDecorator, boolean z12, boolean z13, String str, CheckoutErrorDialogDecorator checkoutErrorDialogDecorator, boolean z14, String str2, int i10, Object obj) {
        String str3;
        boolean z15;
        EbtCardDetailsDecorator ebtCardDetailsDecorator2;
        CardDetailsDecorator c11986q2;
        CreditCardChargesDecorator l13;
        EbtCardChargesDecorator n13;
        boolean z16;
        LoadingState loadingState2;
        CheckoutFlowState fVar2;
        CheckoutAnimations c11948d02;
        Boolean bool2;
        PreTipDecorator preTipDecorator2;
        AdjustEbtPaymentDecorator adjustEbtPaymentDecorator2;
        boolean z17;
        boolean z18;
        String str4;
        CheckoutErrorDialogDecorator checkoutErrorDialogDecorator2;
        AddressFormDecorator addressFormDecorator2;
        MultiTenderPaymentOption multiTenderPaymentOption2;
        CartOrderSummaryDecorator c11756n02;
        Q1 q13;
        FulfillmentSlotInfoDecorator r13;
        StoreDecorator x13;
        PickupPersonDecorator u13;
        AddressDecorator c11938a3;
        DeliveryInstructionsDecorator deliveryInstructionsDecorator2;
        boolean z19;
        ContactInformationDecorator contactInformationDecorator2;
        CartItemsDecorator c11997u2;
        SubstitutionPreferenceDecorator substitutionPreferenceDecorator2;
        AddressDecorator c11938a4;
        PaymentOption paymentOption2 = (i10 & 1) != 0 ? checkoutViewState.selectedPaymentOption : paymentOption;
        MultiTenderPaymentOption multiTenderPaymentOption3 = (i10 & 2) != 0 ? checkoutViewState.multiTenderPaymentOption : multiTenderPaymentOption;
        CartOrderSummaryDecorator c11756n03 = (i10 & 4) != 0 ? checkoutViewState.pricingSummary : c11756n0;
        Q1 q14 = (i10 & 8) != 0 ? checkoutViewState.fulfillmentMode : q12;
        FulfillmentSlotInfoDecorator r14 = (i10 & 16) != 0 ? checkoutViewState.fulfillmentSlot : r12;
        StoreDecorator x14 = (i10 & 32) != 0 ? checkoutViewState.storeDecorator : x12;
        PickupPersonDecorator u14 = (i10 & 64) != 0 ? checkoutViewState.pickupPerson : u12;
        AddressDecorator c11938a5 = (i10 & 128) != 0 ? checkoutViewState.deliveryAddress : c11938a;
        DeliveryInstructionsDecorator deliveryInstructionsDecorator3 = (i10 & 256) != 0 ? checkoutViewState.deliveryInstructions : deliveryInstructionsDecorator;
        boolean z20 = (i10 & 512) != 0 ? checkoutViewState.earlyDelivery : z10;
        ContactInformationDecorator contactInformationDecorator3 = (i10 & 1024) != 0 ? checkoutViewState.contactInformation : contactInformationDecorator;
        CartItemsDecorator c11997u3 = (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? checkoutViewState.cartItems : c11997u;
        SubstitutionPreferenceDecorator substitutionPreferenceDecorator3 = (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? checkoutViewState.substitutionPreference : substitutionPreferenceDecorator;
        AddressDecorator c11938a6 = (i10 & 8192) != 0 ? checkoutViewState.billingAddress : c11938a2;
        PaymentOption paymentOption3 = paymentOption2;
        AddressFormDecorator addressFormDecorator3 = (i10 & 16384) != 0 ? checkoutViewState.formAddress : addressFormDecorator;
        EbtCardDetailsDecorator ebtCardDetailsDecorator3 = (i10 & 32768) != 0 ? checkoutViewState.ebtCardDetails : ebtCardDetailsDecorator;
        CardDetailsDecorator c11986q3 = (i10 & 65536) != 0 ? checkoutViewState.cardDetails : c11986q;
        CreditCardChargesDecorator l14 = (i10 & 131072) != 0 ? checkoutViewState.creditCardCharges : l12;
        EbtCardChargesDecorator n14 = (i10 & 262144) != 0 ? checkoutViewState.ebtCardCharges : n12;
        boolean z21 = (i10 & 524288) != 0 ? checkoutViewState.isValid : z11;
        LoadingState loadingState3 = (i10 & 1048576) != 0 ? checkoutViewState.loadingState : loadingState;
        CheckoutFlowState fVar3 = (i10 & 2097152) != 0 ? checkoutViewState.checkoutFlowState : fVar;
        CheckoutAnimations c11948d03 = (i10 & 4194304) != 0 ? checkoutViewState.checkoutAnimations : c11948d0;
        Boolean bool3 = (i10 & 8388608) != 0 ? checkoutViewState.isBopasEligibleCart : bool;
        PreTipDecorator preTipDecorator3 = (i10 & 16777216) != 0 ? checkoutViewState.preTipDecorator : preTipDecorator;
        AdjustEbtPaymentDecorator adjustEbtPaymentDecorator3 = (i10 & 33554432) != 0 ? checkoutViewState.adjustEbtPaymentDecorator : adjustEbtPaymentDecorator;
        boolean z22 = (i10 & 67108864) != 0 ? checkoutViewState.isEbtPinPadProcessing : z12;
        boolean z23 = (i10 & 134217728) != 0 ? checkoutViewState.showOrderCancellationWarning : z13;
        String str5 = (i10 & 268435456) != 0 ? checkoutViewState.ebtTimerText : str;
        CheckoutErrorDialogDecorator checkoutErrorDialogDecorator3 = (i10 & 536870912) != 0 ? checkoutViewState.checkoutErrorDialogDecorator : checkoutErrorDialogDecorator;
        boolean z24 = (i10 & 1073741824) != 0 ? checkoutViewState.displayInstacartTermsOfServiceAgreement : z14;
        if ((i10 & Integer.MIN_VALUE) != 0) {
            z15 = z24;
            str3 = checkoutViewState.acculynkPostBody;
            c11986q2 = c11986q3;
            l13 = l14;
            n13 = n14;
            z16 = z21;
            loadingState2 = loadingState3;
            fVar2 = fVar3;
            c11948d02 = c11948d03;
            bool2 = bool3;
            preTipDecorator2 = preTipDecorator3;
            adjustEbtPaymentDecorator2 = adjustEbtPaymentDecorator3;
            z17 = z22;
            z18 = z23;
            str4 = str5;
            checkoutErrorDialogDecorator2 = checkoutErrorDialogDecorator3;
            addressFormDecorator2 = addressFormDecorator3;
            multiTenderPaymentOption2 = multiTenderPaymentOption3;
            c11756n02 = c11756n03;
            q13 = q14;
            r13 = r14;
            x13 = x14;
            u13 = u14;
            c11938a3 = c11938a5;
            deliveryInstructionsDecorator2 = deliveryInstructionsDecorator3;
            z19 = z20;
            contactInformationDecorator2 = contactInformationDecorator3;
            c11997u2 = c11997u3;
            substitutionPreferenceDecorator2 = substitutionPreferenceDecorator3;
            c11938a4 = c11938a6;
            ebtCardDetailsDecorator2 = ebtCardDetailsDecorator3;
        } else {
            str3 = str2;
            z15 = z24;
            ebtCardDetailsDecorator2 = ebtCardDetailsDecorator3;
            c11986q2 = c11986q3;
            l13 = l14;
            n13 = n14;
            z16 = z21;
            loadingState2 = loadingState3;
            fVar2 = fVar3;
            c11948d02 = c11948d03;
            bool2 = bool3;
            preTipDecorator2 = preTipDecorator3;
            adjustEbtPaymentDecorator2 = adjustEbtPaymentDecorator3;
            z17 = z22;
            z18 = z23;
            str4 = str5;
            checkoutErrorDialogDecorator2 = checkoutErrorDialogDecorator3;
            addressFormDecorator2 = addressFormDecorator3;
            multiTenderPaymentOption2 = multiTenderPaymentOption3;
            c11756n02 = c11756n03;
            q13 = q14;
            r13 = r14;
            x13 = x14;
            u13 = u14;
            c11938a3 = c11938a5;
            deliveryInstructionsDecorator2 = deliveryInstructionsDecorator3;
            z19 = z20;
            contactInformationDecorator2 = contactInformationDecorator3;
            c11997u2 = c11997u3;
            substitutionPreferenceDecorator2 = substitutionPreferenceDecorator3;
            c11938a4 = c11938a6;
        }
        return checkoutViewState.a(paymentOption3, multiTenderPaymentOption2, c11756n02, q13, r13, x13, u13, c11938a3, deliveryInstructionsDecorator2, z19, contactInformationDecorator2, c11997u2, substitutionPreferenceDecorator2, c11938a4, addressFormDecorator2, ebtCardDetailsDecorator2, c11986q2, l13, n13, z16, loadingState2, fVar2, c11948d02, bool2, preTipDecorator2, adjustEbtPaymentDecorator2, z17, z18, str4, checkoutErrorDialogDecorator2, z15, str3);
    }

    public final CheckoutViewState a(PaymentOption selectedPaymentOption, MultiTenderPaymentOption multiTenderPaymentOption, CartOrderSummaryDecorator pricingSummary, Q1 fulfillmentMode, FulfillmentSlotInfoDecorator fulfillmentSlot, StoreDecorator storeDecorator, PickupPersonDecorator pickupPerson, AddressDecorator deliveryAddress, DeliveryInstructionsDecorator deliveryInstructions, boolean earlyDelivery, ContactInformationDecorator contactInformation, CartItemsDecorator cartItems, SubstitutionPreferenceDecorator substitutionPreference, AddressDecorator billingAddress, AddressFormDecorator formAddress, EbtCardDetailsDecorator ebtCardDetails, CardDetailsDecorator cardDetails, CreditCardChargesDecorator creditCardCharges, EbtCardChargesDecorator ebtCardCharges, boolean isValid, LoadingState loadingState, CheckoutFlowState checkoutFlowState, CheckoutAnimations checkoutAnimations, Boolean isBopasEligibleCart, PreTipDecorator preTipDecorator, AdjustEbtPaymentDecorator adjustEbtPaymentDecorator, boolean isEbtPinPadProcessing, boolean showOrderCancellationWarning, String ebtTimerText, CheckoutErrorDialogDecorator checkoutErrorDialogDecorator, boolean displayInstacartTermsOfServiceAgreement, String acculynkPostBody) {
        Intrinsics.j(pricingSummary, "pricingSummary");
        Intrinsics.j(fulfillmentMode, "fulfillmentMode");
        Intrinsics.j(fulfillmentSlot, "fulfillmentSlot");
        Intrinsics.j(storeDecorator, "storeDecorator");
        Intrinsics.j(cartItems, "cartItems");
        Intrinsics.j(substitutionPreference, "substitutionPreference");
        Intrinsics.j(billingAddress, "billingAddress");
        Intrinsics.j(formAddress, "formAddress");
        Intrinsics.j(cardDetails, "cardDetails");
        Intrinsics.j(creditCardCharges, "creditCardCharges");
        Intrinsics.j(loadingState, "loadingState");
        Intrinsics.j(preTipDecorator, "preTipDecorator");
        return new CheckoutViewState(selectedPaymentOption, multiTenderPaymentOption, pricingSummary, fulfillmentMode, fulfillmentSlot, storeDecorator, pickupPerson, deliveryAddress, deliveryInstructions, earlyDelivery, contactInformation, cartItems, substitutionPreference, billingAddress, formAddress, ebtCardDetails, cardDetails, creditCardCharges, ebtCardCharges, isValid, loadingState, checkoutFlowState, checkoutAnimations, isBopasEligibleCart, preTipDecorator, adjustEbtPaymentDecorator, isEbtPinPadProcessing, showOrderCancellationWarning, ebtTimerText, checkoutErrorDialogDecorator, displayInstacartTermsOfServiceAgreement, acculynkPostBody);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckoutViewState)) {
            return false;
        }
        CheckoutViewState checkoutViewState = (CheckoutViewState) other;
        return Intrinsics.e(this.selectedPaymentOption, checkoutViewState.selectedPaymentOption) && Intrinsics.e(this.multiTenderPaymentOption, checkoutViewState.multiTenderPaymentOption) && Intrinsics.e(this.pricingSummary, checkoutViewState.pricingSummary) && Intrinsics.e(this.fulfillmentMode, checkoutViewState.fulfillmentMode) && Intrinsics.e(this.fulfillmentSlot, checkoutViewState.fulfillmentSlot) && Intrinsics.e(this.storeDecorator, checkoutViewState.storeDecorator) && Intrinsics.e(this.pickupPerson, checkoutViewState.pickupPerson) && Intrinsics.e(this.deliveryAddress, checkoutViewState.deliveryAddress) && Intrinsics.e(this.deliveryInstructions, checkoutViewState.deliveryInstructions) && this.earlyDelivery == checkoutViewState.earlyDelivery && Intrinsics.e(this.contactInformation, checkoutViewState.contactInformation) && Intrinsics.e(this.cartItems, checkoutViewState.cartItems) && Intrinsics.e(this.substitutionPreference, checkoutViewState.substitutionPreference) && Intrinsics.e(this.billingAddress, checkoutViewState.billingAddress) && Intrinsics.e(this.formAddress, checkoutViewState.formAddress) && Intrinsics.e(this.ebtCardDetails, checkoutViewState.ebtCardDetails) && Intrinsics.e(this.cardDetails, checkoutViewState.cardDetails) && Intrinsics.e(this.creditCardCharges, checkoutViewState.creditCardCharges) && Intrinsics.e(this.ebtCardCharges, checkoutViewState.ebtCardCharges) && this.isValid == checkoutViewState.isValid && Intrinsics.e(this.loadingState, checkoutViewState.loadingState) && Intrinsics.e(this.checkoutFlowState, checkoutViewState.checkoutFlowState) && Intrinsics.e(this.checkoutAnimations, checkoutViewState.checkoutAnimations) && Intrinsics.e(this.isBopasEligibleCart, checkoutViewState.isBopasEligibleCart) && Intrinsics.e(this.preTipDecorator, checkoutViewState.preTipDecorator) && Intrinsics.e(this.adjustEbtPaymentDecorator, checkoutViewState.adjustEbtPaymentDecorator) && this.isEbtPinPadProcessing == checkoutViewState.isEbtPinPadProcessing && this.showOrderCancellationWarning == checkoutViewState.showOrderCancellationWarning && Intrinsics.e(this.ebtTimerText, checkoutViewState.ebtTimerText) && Intrinsics.e(this.checkoutErrorDialogDecorator, checkoutViewState.checkoutErrorDialogDecorator) && this.displayInstacartTermsOfServiceAgreement == checkoutViewState.displayInstacartTermsOfServiceAgreement && Intrinsics.e(this.acculynkPostBody, checkoutViewState.acculynkPostBody);
    }

    public int hashCode() {
        PaymentOption paymentOption = this.selectedPaymentOption;
        int iHashCode = (paymentOption == null ? 0 : paymentOption.hashCode()) * 31;
        MultiTenderPaymentOption multiTenderPaymentOption = this.multiTenderPaymentOption;
        int iHashCode2 = (((((((((iHashCode + (multiTenderPaymentOption == null ? 0 : multiTenderPaymentOption.hashCode())) * 31) + this.pricingSummary.hashCode()) * 31) + this.fulfillmentMode.hashCode()) * 31) + this.fulfillmentSlot.hashCode()) * 31) + this.storeDecorator.hashCode()) * 31;
        PickupPersonDecorator u12 = this.pickupPerson;
        int iHashCode3 = (iHashCode2 + (u12 == null ? 0 : u12.hashCode())) * 31;
        AddressDecorator c11938a = this.deliveryAddress;
        int iHashCode4 = (iHashCode3 + (c11938a == null ? 0 : c11938a.hashCode())) * 31;
        DeliveryInstructionsDecorator deliveryInstructionsDecorator = this.deliveryInstructions;
        int iHashCode5 = (((iHashCode4 + (deliveryInstructionsDecorator == null ? 0 : deliveryInstructionsDecorator.hashCode())) * 31) + Boolean.hashCode(this.earlyDelivery)) * 31;
        ContactInformationDecorator contactInformationDecorator = this.contactInformation;
        int iHashCode6 = (((((((((iHashCode5 + (contactInformationDecorator == null ? 0 : contactInformationDecorator.hashCode())) * 31) + this.cartItems.hashCode()) * 31) + this.substitutionPreference.hashCode()) * 31) + this.billingAddress.hashCode()) * 31) + this.formAddress.hashCode()) * 31;
        EbtCardDetailsDecorator ebtCardDetailsDecorator = this.ebtCardDetails;
        int iHashCode7 = (((((iHashCode6 + (ebtCardDetailsDecorator == null ? 0 : ebtCardDetailsDecorator.hashCode())) * 31) + this.cardDetails.hashCode()) * 31) + this.creditCardCharges.hashCode()) * 31;
        EbtCardChargesDecorator n12 = this.ebtCardCharges;
        int iHashCode8 = (((((iHashCode7 + (n12 == null ? 0 : n12.hashCode())) * 31) + Boolean.hashCode(this.isValid)) * 31) + this.loadingState.hashCode()) * 31;
        CheckoutFlowState fVar = this.checkoutFlowState;
        int iHashCode9 = (iHashCode8 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        CheckoutAnimations c11948d0 = this.checkoutAnimations;
        int iHashCode10 = (iHashCode9 + (c11948d0 == null ? 0 : c11948d0.hashCode())) * 31;
        Boolean bool = this.isBopasEligibleCart;
        int iHashCode11 = (((iHashCode10 + (bool == null ? 0 : bool.hashCode())) * 31) + this.preTipDecorator.hashCode()) * 31;
        AdjustEbtPaymentDecorator adjustEbtPaymentDecorator = this.adjustEbtPaymentDecorator;
        int iHashCode12 = (((((iHashCode11 + (adjustEbtPaymentDecorator == null ? 0 : adjustEbtPaymentDecorator.hashCode())) * 31) + Boolean.hashCode(this.isEbtPinPadProcessing)) * 31) + Boolean.hashCode(this.showOrderCancellationWarning)) * 31;
        String str = this.ebtTimerText;
        int iHashCode13 = (iHashCode12 + (str == null ? 0 : str.hashCode())) * 31;
        CheckoutErrorDialogDecorator checkoutErrorDialogDecorator = this.checkoutErrorDialogDecorator;
        int iHashCode14 = (((iHashCode13 + (checkoutErrorDialogDecorator == null ? 0 : checkoutErrorDialogDecorator.hashCode())) * 31) + Boolean.hashCode(this.displayInstacartTermsOfServiceAgreement)) * 31;
        String str2 = this.acculynkPostBody;
        return iHashCode14 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "CheckoutViewState(selectedPaymentOption=" + this.selectedPaymentOption + ", multiTenderPaymentOption=" + this.multiTenderPaymentOption + ", pricingSummary=" + this.pricingSummary + ", fulfillmentMode=" + this.fulfillmentMode + ", fulfillmentSlot=" + this.fulfillmentSlot + ", storeDecorator=" + this.storeDecorator + ", pickupPerson=" + this.pickupPerson + ", deliveryAddress=" + this.deliveryAddress + ", deliveryInstructions=" + this.deliveryInstructions + ", earlyDelivery=" + this.earlyDelivery + ", contactInformation=" + this.contactInformation + ", cartItems=" + this.cartItems + ", substitutionPreference=" + this.substitutionPreference + ", billingAddress=" + this.billingAddress + ", formAddress=" + this.formAddress + ", ebtCardDetails=" + this.ebtCardDetails + ", cardDetails=" + this.cardDetails + ", creditCardCharges=" + this.creditCardCharges + ", ebtCardCharges=" + this.ebtCardCharges + ", isValid=" + this.isValid + ", loadingState=" + this.loadingState + ", checkoutFlowState=" + this.checkoutFlowState + ", checkoutAnimations=" + this.checkoutAnimations + ", isBopasEligibleCart=" + this.isBopasEligibleCart + ", preTipDecorator=" + this.preTipDecorator + ", adjustEbtPaymentDecorator=" + this.adjustEbtPaymentDecorator + ", isEbtPinPadProcessing=" + this.isEbtPinPadProcessing + ", showOrderCancellationWarning=" + this.showOrderCancellationWarning + ", ebtTimerText=" + this.ebtTimerText + ", checkoutErrorDialogDecorator=" + this.checkoutErrorDialogDecorator + ", displayInstacartTermsOfServiceAgreement=" + this.displayInstacartTermsOfServiceAgreement + ", acculynkPostBody=" + this.acculynkPostBody + ')';
    }

    public CheckoutViewState(PaymentOption paymentOption, MultiTenderPaymentOption multiTenderPaymentOption, CartOrderSummaryDecorator pricingSummary, Q1 fulfillmentMode, FulfillmentSlotInfoDecorator fulfillmentSlot, StoreDecorator storeDecorator, PickupPersonDecorator u12, AddressDecorator c11938a, DeliveryInstructionsDecorator deliveryInstructionsDecorator, boolean z10, ContactInformationDecorator contactInformationDecorator, CartItemsDecorator cartItems, SubstitutionPreferenceDecorator substitutionPreference, AddressDecorator billingAddress, AddressFormDecorator formAddress, EbtCardDetailsDecorator ebtCardDetailsDecorator, CardDetailsDecorator cardDetails, CreditCardChargesDecorator creditCardCharges, EbtCardChargesDecorator n12, boolean z11, LoadingState loadingState, CheckoutFlowState fVar, CheckoutAnimations c11948d0, Boolean bool, PreTipDecorator preTipDecorator, AdjustEbtPaymentDecorator adjustEbtPaymentDecorator, boolean z12, boolean z13, String str, CheckoutErrorDialogDecorator checkoutErrorDialogDecorator, boolean z14, String str2) {
        Intrinsics.j(pricingSummary, "pricingSummary");
        Intrinsics.j(fulfillmentMode, "fulfillmentMode");
        Intrinsics.j(fulfillmentSlot, "fulfillmentSlot");
        Intrinsics.j(storeDecorator, "storeDecorator");
        Intrinsics.j(cartItems, "cartItems");
        Intrinsics.j(substitutionPreference, "substitutionPreference");
        Intrinsics.j(billingAddress, "billingAddress");
        Intrinsics.j(formAddress, "formAddress");
        Intrinsics.j(cardDetails, "cardDetails");
        Intrinsics.j(creditCardCharges, "creditCardCharges");
        Intrinsics.j(loadingState, "loadingState");
        Intrinsics.j(preTipDecorator, "preTipDecorator");
        this.selectedPaymentOption = paymentOption;
        this.multiTenderPaymentOption = multiTenderPaymentOption;
        this.pricingSummary = pricingSummary;
        this.fulfillmentMode = fulfillmentMode;
        this.fulfillmentSlot = fulfillmentSlot;
        this.storeDecorator = storeDecorator;
        this.pickupPerson = u12;
        this.deliveryAddress = c11938a;
        this.deliveryInstructions = deliveryInstructionsDecorator;
        this.earlyDelivery = z10;
        this.contactInformation = contactInformationDecorator;
        this.cartItems = cartItems;
        this.substitutionPreference = substitutionPreference;
        this.billingAddress = billingAddress;
        this.formAddress = formAddress;
        this.ebtCardDetails = ebtCardDetailsDecorator;
        this.cardDetails = cardDetails;
        this.creditCardCharges = creditCardCharges;
        this.ebtCardCharges = n12;
        this.isValid = z11;
        this.loadingState = loadingState;
        this.checkoutFlowState = fVar;
        this.checkoutAnimations = c11948d0;
        this.isBopasEligibleCart = bool;
        this.preTipDecorator = preTipDecorator;
        this.adjustEbtPaymentDecorator = adjustEbtPaymentDecorator;
        this.isEbtPinPadProcessing = z12;
        this.showOrderCancellationWarning = z13;
        this.ebtTimerText = str;
        this.checkoutErrorDialogDecorator = checkoutErrorDialogDecorator;
        this.displayInstacartTermsOfServiceAgreement = z14;
        this.acculynkPostBody = str2;
        this.placeOrderButtonText = AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f99808Sb, new Object[0]);
    }

    /* renamed from: A, reason: from getter */
    public final PreTipDecorator getPreTipDecorator() {
        return this.preTipDecorator;
    }

    /* renamed from: B, reason: from getter */
    public final CartOrderSummaryDecorator getPricingSummary() {
        return this.pricingSummary;
    }

    /* renamed from: C, reason: from getter */
    public final PaymentOption getSelectedPaymentOption() {
        return this.selectedPaymentOption;
    }

    /* renamed from: D, reason: from getter */
    public final boolean getShowOrderCancellationWarning() {
        return this.showOrderCancellationWarning;
    }

    /* renamed from: E, reason: from getter */
    public final StoreDecorator getStoreDecorator() {
        return this.storeDecorator;
    }

    /* renamed from: F, reason: from getter */
    public final SubstitutionPreferenceDecorator getSubstitutionPreference() {
        return this.substitutionPreference;
    }

    /* renamed from: G, reason: from getter */
    public final Boolean getIsBopasEligibleCart() {
        return this.isBopasEligibleCart;
    }

    /* renamed from: H, reason: from getter */
    public final boolean getIsEbtPinPadProcessing() {
        return this.isEbtPinPadProcessing;
    }

    /* renamed from: I, reason: from getter */
    public final boolean getIsValid() {
        return this.isValid;
    }

    /* renamed from: c, reason: from getter */
    public final String getAcculynkPostBody() {
        return this.acculynkPostBody;
    }

    /* renamed from: d, reason: from getter */
    public final AdjustEbtPaymentDecorator getAdjustEbtPaymentDecorator() {
        return this.adjustEbtPaymentDecorator;
    }

    /* renamed from: e, reason: from getter */
    public final AddressDecorator getBillingAddress() {
        return this.billingAddress;
    }

    /* renamed from: f, reason: from getter */
    public final CardDetailsDecorator getCardDetails() {
        return this.cardDetails;
    }

    /* renamed from: g, reason: from getter */
    public final CartItemsDecorator getCartItems() {
        return this.cartItems;
    }

    /* renamed from: h, reason: from getter */
    public final CheckoutAnimations getCheckoutAnimations() {
        return this.checkoutAnimations;
    }

    /* renamed from: i, reason: from getter */
    public final CheckoutErrorDialogDecorator getCheckoutErrorDialogDecorator() {
        return this.checkoutErrorDialogDecorator;
    }

    /* renamed from: j, reason: from getter */
    public final CheckoutFlowState getCheckoutFlowState() {
        return this.checkoutFlowState;
    }

    /* renamed from: k, reason: from getter */
    public final ContactInformationDecorator getContactInformation() {
        return this.contactInformation;
    }

    /* renamed from: l, reason: from getter */
    public final CreditCardChargesDecorator getCreditCardCharges() {
        return this.creditCardCharges;
    }

    public final AbstractC5607a m() {
        return AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f99975b6, Double.valueOf(this.creditCardCharges.getAmountToChargeValue() + this.preTipDecorator.getConfirmedTipInfo().getTipAmount()));
    }

    /* renamed from: n, reason: from getter */
    public final AddressDecorator getDeliveryAddress() {
        return this.deliveryAddress;
    }

    /* renamed from: o, reason: from getter */
    public final DeliveryInstructionsDecorator getDeliveryInstructions() {
        return this.deliveryInstructions;
    }

    /* renamed from: p, reason: from getter */
    public final boolean getDisplayInstacartTermsOfServiceAgreement() {
        return this.displayInstacartTermsOfServiceAgreement;
    }

    /* renamed from: q, reason: from getter */
    public final EbtCardChargesDecorator getEbtCardCharges() {
        return this.ebtCardCharges;
    }

    /* renamed from: r, reason: from getter */
    public final EbtCardDetailsDecorator getEbtCardDetails() {
        return this.ebtCardDetails;
    }

    /* renamed from: s, reason: from getter */
    public final String getEbtTimerText() {
        return this.ebtTimerText;
    }

    public final AbstractC5607a t() {
        return AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f99975b6, Double.valueOf(this.pricingSummary.getEstimatedTotal().getValue() + this.preTipDecorator.getConfirmedTipInfo().getTipAmount()));
    }

    /* renamed from: u, reason: from getter */
    public final Q1 getFulfillmentMode() {
        return this.fulfillmentMode;
    }

    /* renamed from: v, reason: from getter */
    public final FulfillmentSlotInfoDecorator getFulfillmentSlot() {
        return this.fulfillmentSlot;
    }

    /* renamed from: w, reason: from getter */
    public final LoadingState getLoadingState() {
        return this.loadingState;
    }

    /* renamed from: x, reason: from getter */
    public final MultiTenderPaymentOption getMultiTenderPaymentOption() {
        return this.multiTenderPaymentOption;
    }

    /* renamed from: y, reason: from getter */
    public final PickupPersonDecorator getPickupPerson() {
        return this.pickupPerson;
    }

    /* renamed from: z, reason: from getter */
    public final AbstractC5607a getPlaceOrderButtonText() {
        return this.placeOrderButtonText;
    }

    public /* synthetic */ CheckoutViewState(PaymentOption paymentOption, MultiTenderPaymentOption multiTenderPaymentOption, CartOrderSummaryDecorator c11756n0, Q1 q12, FulfillmentSlotInfoDecorator r12, StoreDecorator x12, PickupPersonDecorator u12, AddressDecorator c11938a, DeliveryInstructionsDecorator deliveryInstructionsDecorator, boolean z10, ContactInformationDecorator contactInformationDecorator, CartItemsDecorator c11997u, SubstitutionPreferenceDecorator substitutionPreferenceDecorator, AddressDecorator c11938a2, AddressFormDecorator addressFormDecorator, EbtCardDetailsDecorator ebtCardDetailsDecorator, CardDetailsDecorator c11986q, CreditCardChargesDecorator l12, EbtCardChargesDecorator n12, boolean z11, LoadingState loadingState, CheckoutFlowState fVar, CheckoutAnimations c11948d0, Boolean bool, PreTipDecorator preTipDecorator, AdjustEbtPaymentDecorator adjustEbtPaymentDecorator, boolean z12, boolean z13, String str, CheckoutErrorDialogDecorator checkoutErrorDialogDecorator, boolean z14, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : paymentOption, (i10 & 2) != 0 ? null : multiTenderPaymentOption, (i10 & 4) != 0 ? new CartOrderSummaryDecorator(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, false, null, false, false, null, null, 134217727, null) : c11756n0, (i10 & 8) != 0 ? Q1.c.f104615f : q12, (i10 & 16) != 0 ? new FulfillmentSlotInfoDecorator(null, null, null, false, null, null, null, l3.f92485d, null) : r12, (i10 & 32) != 0 ? new StoreDecorator(null, null, null, null, null, null, null, null, null, 0.0d, 0.0d, null, l3.f92483b, null) : x12, (i10 & 64) != 0 ? null : u12, (i10 & 128) != 0 ? null : c11938a, (i10 & 256) != 0 ? null : deliveryInstructionsDecorator, (i10 & 512) != 0 ? false : z10, (i10 & 1024) != 0 ? null : contactInformationDecorator, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? new CartItemsDecorator(null, null, null, null, false, 31, null) : c11997u, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? new SubstitutionPreferenceDecorator(null, null, 3, null) : substitutionPreferenceDecorator, (i10 & 8192) != 0 ? new AddressDecorator(null, null, null, null, null, null, 63, null) : c11938a2, (i10 & 16384) != 0 ? new AddressFormDecorator(null, null, null, null, null, 31, null) : addressFormDecorator, (i10 & 32768) != 0 ? null : ebtCardDetailsDecorator, (i10 & 65536) != 0 ? new CardDetailsDecorator(null, null, null, null, 15, null) : c11986q, (i10 & 131072) != 0 ? new CreditCardChargesDecorator(null, 0.0d, null, null, null, null, 63, null) : l12, (i10 & 262144) != 0 ? null : n12, (i10 & 524288) != 0 ? false : z11, (i10 & 1048576) != 0 ? new LoadingState(false, null, null, false, 15, null) : loadingState, (i10 & 2097152) != 0 ? null : fVar, (i10 & 4194304) != 0 ? null : c11948d0, (i10 & 8388608) != 0 ? null : bool, (i10 & 16777216) != 0 ? new PreTipDecorator(null, 0.0d, null, null, 0.0d, null, false, l3.f92485d, null) : preTipDecorator, (i10 & 33554432) != 0 ? null : adjustEbtPaymentDecorator, (i10 & 67108864) != 0 ? false : z12, (i10 & 134217728) != 0 ? false : z13, (i10 & 268435456) != 0 ? null : str, (i10 & 536870912) != 0 ? null : checkoutErrorDialogDecorator, (i10 & 1073741824) != 0 ? false : z14, (i10 & Integer.MIN_VALUE) != 0 ? null : str2);
    }
}
