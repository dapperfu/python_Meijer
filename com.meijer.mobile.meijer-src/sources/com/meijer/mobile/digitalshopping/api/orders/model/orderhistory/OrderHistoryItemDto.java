package com.meijer.mobile.digitalshopping.api.orders.model.orderhistory;

import androidx.recyclerview.widget.RecyclerView;
import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.cart.model.hybris.PaymentDetails;
import com.meijer.mobile.cart.model.hybris.orderdetails.HybrisTipAmount;
import com.meijer.mobile.cart.model.hybris.orderdetails.TipAndRateDetailsResponse;
import com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b.\b\u0081\b\u0018\u00002\u00020\u0001BÇ\u0001\u0012\f\b\u0003\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\b\u0003\u0010\b\u001a\u00060\u0002j\u0002`\u0007\u0012\b\b\u0003\u0010\n\u001a\u00020\t\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\f\u001a\u00020\u0002\u0012\b\b\u0003\u0010\r\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0003\u0010\u0015\u001a\u00020\u0013\u0012\b\b\u0003\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0003\u0010\u0019\u001a\u00020\u0018\u0012\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0003\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJÐ\u0001\u0010 \u001a\u00020\u00002\f\b\u0003\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\b\u0003\u0010\b\u001a\u00060\u0002j\u0002`\u00072\b\b\u0003\u0010\n\u001a\u00020\t2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\f\u001a\u00020\u00022\b\b\u0003\u0010\r\u001a\u00020\u00022\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0014\u001a\u00020\u00132\b\b\u0003\u0010\u0015\u001a\u00020\u00132\b\b\u0003\u0010\u0017\u001a\u00020\u00162\b\b\u0003\u0010\u0019\u001a\u00020\u00182\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\b\u0003\u0010\u001d\u001a\u00020\u001cHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\u00132\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010#R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-R\u001b\u0010\b\u001a\u00060\u0002j\u0002`\u00078\u0006¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b.\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b1\u0010*\u001a\u0004\b3\u0010#R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010*\u001a\u0004\b4\u0010#R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010*\u001a\u0004\b5\u0010#R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b7\u0010*\u001a\u0004\b9\u0010#R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b:\u0010*\u001a\u0004\b;\u0010#R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b9\u0010*\u001a\u0004\b<\u0010#R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b;\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\u0015\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b@\u0010?R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b>\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b@\u0010D\u001a\u0004\bE\u0010%R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\bB\u0010F\u001a\u0004\b:\u0010GR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\bE\u0010H\u001a\u0004\b/\u0010I¨\u0006J"}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/orders/model/orderhistory/OrderHistoryItemDto;", "", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "code", "Lcom/meijer/mobile/digitalshopping/api/orders/model/orderhistory/DeliveryModeEnum;", "deliveryMode", "Lcom/meijer/mobile/core/model/common/Guid;", "guid", "Lcom/meijer/mobile/digitalshopping/api/orders/model/orderhistory/PickUpSlotInfoDto;", "pickUpSlotInfo", "placed", "status", "statusDisplay", "Lcom/meijer/mobile/cart/model/hybris/orderdetails/HybrisTipAmount;", "tipAmount", "tipAuthCode", "tipCode", "tipDate", "", "tippablePartner", "tippedAndRated", "Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;", "total", "", "totalItems", "Lcom/meijer/mobile/cart/model/hybris/orderdetails/TipAndRateDetailsResponse;", "tipAndRateDetails", "Lcom/meijer/mobile/cart/model/hybris/PaymentDetails;", "paymentInfo", "<init>", "(Ljava/lang/String;Lcom/meijer/mobile/digitalshopping/api/orders/model/orderhistory/DeliveryModeEnum;Ljava/lang/String;Lcom/meijer/mobile/digitalshopping/api/orders/model/orderhistory/PickUpSlotInfoDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/cart/model/hybris/orderdetails/HybrisTipAmount;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;ILcom/meijer/mobile/cart/model/hybris/orderdetails/TipAndRateDetailsResponse;Lcom/meijer/mobile/cart/model/hybris/PaymentDetails;)V", "copy", "(Ljava/lang/String;Lcom/meijer/mobile/digitalshopping/api/orders/model/orderhistory/DeliveryModeEnum;Ljava/lang/String;Lcom/meijer/mobile/digitalshopping/api/orders/model/orderhistory/PickUpSlotInfoDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/cart/model/hybris/orderdetails/HybrisTipAmount;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;ILcom/meijer/mobile/cart/model/hybris/orderdetails/TipAndRateDetailsResponse;Lcom/meijer/mobile/cart/model/hybris/PaymentDetails;)Lcom/meijer/mobile/digitalshopping/api/orders/model/orderhistory/OrderHistoryItemDto;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/meijer/mobile/digitalshopping/api/orders/model/orderhistory/DeliveryModeEnum;", "()Lcom/meijer/mobile/digitalshopping/api/orders/model/orderhistory/DeliveryModeEnum;", "c", "d", "Lcom/meijer/mobile/digitalshopping/api/orders/model/orderhistory/PickUpSlotInfoDto;", "e", "()Lcom/meijer/mobile/digitalshopping/api/orders/model/orderhistory/PickUpSlotInfoDto;", "f", "g", "h", "Lcom/meijer/mobile/cart/model/hybris/orderdetails/HybrisTipAmount;", "i", "()Lcom/meijer/mobile/cart/model/hybris/orderdetails/HybrisTipAmount;", "k", "j", "l", "m", "Z", "n", "()Z", "o", "Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;", "p", "()Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;", "I", "q", "Lcom/meijer/mobile/cart/model/hybris/orderdetails/TipAndRateDetailsResponse;", "()Lcom/meijer/mobile/cart/model/hybris/orderdetails/TipAndRateDetailsResponse;", "Lcom/meijer/mobile/cart/model/hybris/PaymentDetails;", "()Lcom/meijer/mobile/cart/model/hybris/PaymentDetails;", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class OrderHistoryItemDto {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String code;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final DeliveryModeEnum deliveryMode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String guid;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final PickUpSlotInfoDto pickUpSlotInfo;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String placed;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String status;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String statusDisplay;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisTipAmount tipAmount;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String tipAuthCode;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String tipCode;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String tipDate;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean tippablePartner;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean tippedAndRated;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice total;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final int totalItems;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final TipAndRateDetailsResponse tipAndRateDetails;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final PaymentDetails paymentInfo;

    public OrderHistoryItemDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, false, false, null, 0, null, null, 131071, null);
    }

    public final OrderHistoryItemDto copy(@g(name = "code") String code, @g(name = "deliveryMode") DeliveryModeEnum deliveryMode, @g(name = "guid") String guid, @g(name = "pickUpSlotInfo") PickUpSlotInfoDto pickUpSlotInfo, @g(name = "placed") String placed, @g(name = "status") String status, @g(name = "statusDisplay") String statusDisplay, @g(name = "tipAmount") HybrisTipAmount tipAmount, @g(name = "tipAuthCode") String tipAuthCode, @g(name = "tipCode") String tipCode, @g(name = "tipDate") String tipDate, @g(name = "tippablePartner") boolean tippablePartner, @g(name = "tippedAndRated") boolean tippedAndRated, @g(name = "total") HybrisPrice total, @g(name = "totalItems") int totalItems, @g(name = "tipAndRateDetails") TipAndRateDetailsResponse tipAndRateDetails, @g(name = "paymentInfo") PaymentDetails paymentInfo) {
        Intrinsics.j(code, "code");
        Intrinsics.j(guid, "guid");
        Intrinsics.j(pickUpSlotInfo, "pickUpSlotInfo");
        Intrinsics.j(status, "status");
        Intrinsics.j(statusDisplay, "statusDisplay");
        Intrinsics.j(total, "total");
        Intrinsics.j(paymentInfo, "paymentInfo");
        return new OrderHistoryItemDto(code, deliveryMode, guid, pickUpSlotInfo, placed, status, statusDisplay, tipAmount, tipAuthCode, tipCode, tipDate, tippablePartner, tippedAndRated, total, totalItems, tipAndRateDetails, paymentInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderHistoryItemDto)) {
            return false;
        }
        OrderHistoryItemDto orderHistoryItemDto = (OrderHistoryItemDto) other;
        return Intrinsics.e(this.code, orderHistoryItemDto.code) && this.deliveryMode == orderHistoryItemDto.deliveryMode && Intrinsics.e(this.guid, orderHistoryItemDto.guid) && Intrinsics.e(this.pickUpSlotInfo, orderHistoryItemDto.pickUpSlotInfo) && Intrinsics.e(this.placed, orderHistoryItemDto.placed) && Intrinsics.e(this.status, orderHistoryItemDto.status) && Intrinsics.e(this.statusDisplay, orderHistoryItemDto.statusDisplay) && Intrinsics.e(this.tipAmount, orderHistoryItemDto.tipAmount) && Intrinsics.e(this.tipAuthCode, orderHistoryItemDto.tipAuthCode) && Intrinsics.e(this.tipCode, orderHistoryItemDto.tipCode) && Intrinsics.e(this.tipDate, orderHistoryItemDto.tipDate) && this.tippablePartner == orderHistoryItemDto.tippablePartner && this.tippedAndRated == orderHistoryItemDto.tippedAndRated && Intrinsics.e(this.total, orderHistoryItemDto.total) && this.totalItems == orderHistoryItemDto.totalItems && Intrinsics.e(this.tipAndRateDetails, orderHistoryItemDto.tipAndRateDetails) && Intrinsics.e(this.paymentInfo, orderHistoryItemDto.paymentInfo);
    }

    public int hashCode() {
        int iHashCode = this.code.hashCode() * 31;
        DeliveryModeEnum deliveryModeEnum = this.deliveryMode;
        int iHashCode2 = (((((iHashCode + (deliveryModeEnum == null ? 0 : deliveryModeEnum.hashCode())) * 31) + this.guid.hashCode()) * 31) + this.pickUpSlotInfo.hashCode()) * 31;
        String str = this.placed;
        int iHashCode3 = (((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.status.hashCode()) * 31) + this.statusDisplay.hashCode()) * 31;
        HybrisTipAmount hybrisTipAmount = this.tipAmount;
        int iHashCode4 = (iHashCode3 + (hybrisTipAmount == null ? 0 : hybrisTipAmount.hashCode())) * 31;
        String str2 = this.tipAuthCode;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tipCode;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.tipDate;
        int iHashCode7 = (((((((((iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31) + Boolean.hashCode(this.tippablePartner)) * 31) + Boolean.hashCode(this.tippedAndRated)) * 31) + this.total.hashCode()) * 31) + Integer.hashCode(this.totalItems)) * 31;
        TipAndRateDetailsResponse tipAndRateDetailsResponse = this.tipAndRateDetails;
        return ((iHashCode7 + (tipAndRateDetailsResponse != null ? tipAndRateDetailsResponse.hashCode() : 0)) * 31) + this.paymentInfo.hashCode();
    }

    public String toString() {
        return "OrderHistoryItemDto(code=" + this.code + ", deliveryMode=" + this.deliveryMode + ", guid=" + this.guid + ", pickUpSlotInfo=" + this.pickUpSlotInfo + ", placed=" + this.placed + ", status=" + this.status + ", statusDisplay=" + this.statusDisplay + ", tipAmount=" + this.tipAmount + ", tipAuthCode=" + this.tipAuthCode + ", tipCode=" + this.tipCode + ", tipDate=" + this.tipDate + ", tippablePartner=" + this.tippablePartner + ", tippedAndRated=" + this.tippedAndRated + ", total=" + this.total + ", totalItems=" + this.totalItems + ", tipAndRateDetails=" + this.tipAndRateDetails + ", paymentInfo=" + this.paymentInfo + ')';
    }

    public OrderHistoryItemDto(@g(name = "code") String code, @g(name = "deliveryMode") DeliveryModeEnum deliveryModeEnum, @g(name = "guid") String guid, @g(name = "pickUpSlotInfo") PickUpSlotInfoDto pickUpSlotInfo, @g(name = "placed") String str, @g(name = "status") String status, @g(name = "statusDisplay") String statusDisplay, @g(name = "tipAmount") HybrisTipAmount hybrisTipAmount, @g(name = "tipAuthCode") String str2, @g(name = "tipCode") String str3, @g(name = "tipDate") String str4, @g(name = "tippablePartner") boolean z10, @g(name = "tippedAndRated") boolean z11, @g(name = "total") HybrisPrice total, @g(name = "totalItems") int i10, @g(name = "tipAndRateDetails") TipAndRateDetailsResponse tipAndRateDetailsResponse, @g(name = "paymentInfo") PaymentDetails paymentInfo) {
        Intrinsics.j(code, "code");
        Intrinsics.j(guid, "guid");
        Intrinsics.j(pickUpSlotInfo, "pickUpSlotInfo");
        Intrinsics.j(status, "status");
        Intrinsics.j(statusDisplay, "statusDisplay");
        Intrinsics.j(total, "total");
        Intrinsics.j(paymentInfo, "paymentInfo");
        this.code = code;
        this.deliveryMode = deliveryModeEnum;
        this.guid = guid;
        this.pickUpSlotInfo = pickUpSlotInfo;
        this.placed = str;
        this.status = status;
        this.statusDisplay = statusDisplay;
        this.tipAmount = hybrisTipAmount;
        this.tipAuthCode = str2;
        this.tipCode = str3;
        this.tipDate = str4;
        this.tippablePartner = z10;
        this.tippedAndRated = z11;
        this.total = total;
        this.totalItems = i10;
        this.tipAndRateDetails = tipAndRateDetailsResponse;
        this.paymentInfo = paymentInfo;
    }

    /* renamed from: a, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: b, reason: from getter */
    public final DeliveryModeEnum getDeliveryMode() {
        return this.deliveryMode;
    }

    /* renamed from: c, reason: from getter */
    public final String getGuid() {
        return this.guid;
    }

    /* renamed from: d, reason: from getter */
    public final PaymentDetails getPaymentInfo() {
        return this.paymentInfo;
    }

    /* renamed from: e, reason: from getter */
    public final PickUpSlotInfoDto getPickUpSlotInfo() {
        return this.pickUpSlotInfo;
    }

    /* renamed from: f, reason: from getter */
    public final String getPlaced() {
        return this.placed;
    }

    /* renamed from: g, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* renamed from: h, reason: from getter */
    public final String getStatusDisplay() {
        return this.statusDisplay;
    }

    /* renamed from: i, reason: from getter */
    public final HybrisTipAmount getTipAmount() {
        return this.tipAmount;
    }

    /* renamed from: j, reason: from getter */
    public final TipAndRateDetailsResponse getTipAndRateDetails() {
        return this.tipAndRateDetails;
    }

    /* renamed from: k, reason: from getter */
    public final String getTipAuthCode() {
        return this.tipAuthCode;
    }

    /* renamed from: l, reason: from getter */
    public final String getTipCode() {
        return this.tipCode;
    }

    /* renamed from: m, reason: from getter */
    public final String getTipDate() {
        return this.tipDate;
    }

    /* renamed from: n, reason: from getter */
    public final boolean getTippablePartner() {
        return this.tippablePartner;
    }

    /* renamed from: o, reason: from getter */
    public final boolean getTippedAndRated() {
        return this.tippedAndRated;
    }

    /* renamed from: p, reason: from getter */
    public final HybrisPrice getTotal() {
        return this.total;
    }

    /* renamed from: q, reason: from getter */
    public final int getTotalItems() {
        return this.totalItems;
    }

    public /* synthetic */ OrderHistoryItemDto(String str, DeliveryModeEnum deliveryModeEnum, String str2, PickUpSlotInfoDto pickUpSlotInfoDto, String str3, String str4, String str5, HybrisTipAmount hybrisTipAmount, String str6, String str7, String str8, boolean z10, boolean z11, HybrisPrice hybrisPrice, int i10, TipAndRateDetailsResponse tipAndRateDetailsResponse, PaymentDetails paymentDetails, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "-1" : str, (i11 & 2) != 0 ? null : deliveryModeEnum, (i11 & 4) != 0 ? "" : str2, (i11 & 8) != 0 ? new PickUpSlotInfoDto(null, null, null, false, null, null, null, null, null, 511, null) : pickUpSlotInfoDto, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? "" : str4, (i11 & 64) == 0 ? str5 : "", (i11 & 128) != 0 ? null : hybrisTipAmount, (i11 & 256) != 0 ? null : str6, (i11 & 512) != 0 ? null : str7, (i11 & 1024) != 0 ? null : str8, (i11 & RecyclerView.m.FLAG_MOVED) != 0 ? false : z10, (i11 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? false : z11, (i11 & 8192) != 0 ? new HybrisPrice(null, null, null, null, 0.0d, null, null, l3.f93324d, null) : hybrisPrice, (i11 & 16384) != 0 ? 0 : i10, (i11 & 32768) != 0 ? null : tipAndRateDetailsResponse, (i11 & 65536) != 0 ? new PaymentDetails(null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, false, 65535, null) : paymentDetails);
    }
}
