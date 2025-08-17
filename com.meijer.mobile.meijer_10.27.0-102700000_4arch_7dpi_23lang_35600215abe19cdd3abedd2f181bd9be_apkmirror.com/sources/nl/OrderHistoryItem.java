package nl;

import com.meijer.mobile.digitalshopping.api.orders.model.orderhistory.DeliveryModeEnum;
import ej.PaymentDetailItem;
import gj.TipAmount;
import gj.TipAndRateDetails;
import j$.time.LocalDate;
import j$.time.OffsetDateTime;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b6\b\u0086\b\u0018\u0000 U2\u00020\u0001:\u0001,BÁ\u0001\u0012\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\b\u0002\u0010\b\u001a\u00060\u0002j\u0002`\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00142\b\b\u0002\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u00020\u00142\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010&R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b.\u00100R\u001b\u0010\b\u001a\u00060\u0002j\u0002`\u00078\u0006¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b1\u0010&R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b4\u00106\u001a\u0004\b7\u00108R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u0010-\u001a\u0004\b9\u0010&R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b9\u0010-\u001a\u0004\b:\u0010&R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b>\u0010-\u001a\u0004\b?\u0010&R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b@\u0010-\u001a\u0004\bA\u0010&R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\bB\u00106\u001a\u0004\bC\u00108R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010\u0016\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bH\u0010E\u001a\u0004\b@\u0010GR\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b#\u0010I\u001a\u0004\bB\u0010JR\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bD\u0010(R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\b>\u0010OR\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\b2\u0010RR\u0017\u0010T\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bS\u0010E\u001a\u0004\bH\u0010G¨\u0006V"}, d2 = {"Lnl/b;", "", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "code", "Lcom/meijer/mobile/digitalshopping/api/orders/model/orderhistory/DeliveryModeEnum;", "deliveryMode", "Lcom/meijer/mobile/core/model/common/Guid;", "guid", "Lnl/c;", "pickUpSlotInfo", "j$/time/OffsetDateTime", "placed", "status", "statusDisplay", "Lgj/m;", "tipAmount", "tipAuthCode", "tipCode", "tipDate", "", "tippablePartner", "tippedAndRated", "Lmk/b;", "total", "", "totalItems", "Lgj/n;", "tipAndRateDetails", "Lej/u;", "paymentInfo", "<init>", "(Ljava/lang/String;Lcom/meijer/mobile/digitalshopping/api/orders/model/orderhistory/DeliveryModeEnum;Ljava/lang/String;Lnl/c;Lj$/time/OffsetDateTime;Ljava/lang/String;Ljava/lang/String;Lgj/m;Ljava/lang/String;Ljava/lang/String;Lj$/time/OffsetDateTime;ZZLmk/b;ILgj/n;Lej/u;)V", "j$/time/LocalDate", "now", "n", "(Lj$/time/LocalDate;)Z", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/meijer/mobile/digitalshopping/api/orders/model/orderhistory/DeliveryModeEnum;", "()Lcom/meijer/mobile/digitalshopping/api/orders/model/orderhistory/DeliveryModeEnum;", "c", "d", "Lnl/c;", "e", "()Lnl/c;", "Lj$/time/OffsetDateTime;", "f", "()Lj$/time/OffsetDateTime;", "g", "h", "Lgj/m;", "getTipAmount", "()Lgj/m;", "i", "getTipAuthCode", "j", "getTipCode", "k", "getTipDate", "l", "Z", "getTippablePartner", "()Z", "m", "Lmk/b;", "()Lmk/b;", "o", "I", "p", "Lgj/n;", "()Lgj/n;", "q", "Lej/u;", "()Lej/u;", "r", "isActive", "s", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: nl.b, reason: case insensitive filesystem and from toString */
/* loaded from: classes9.dex */
public final /* data */ class OrderHistoryItem {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String code;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final DeliveryModeEnum deliveryMode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String guid;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final OrdersPickUpSlotInfo pickUpSlotInfo;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime placed;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String status;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String statusDisplay;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final TipAmount tipAmount;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String tipAuthCode;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String tipCode;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime tipDate;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean tippablePartner;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean tippedAndRated;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.b total;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final int totalItems;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final TipAndRateDetails tipAndRateDetails;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final PaymentDetailItem paymentInfo;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final boolean isActive;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderHistoryItem)) {
            return false;
        }
        OrderHistoryItem orderHistoryItem = (OrderHistoryItem) other;
        return Intrinsics.e(this.code, orderHistoryItem.code) && this.deliveryMode == orderHistoryItem.deliveryMode && Intrinsics.e(this.guid, orderHistoryItem.guid) && Intrinsics.e(this.pickUpSlotInfo, orderHistoryItem.pickUpSlotInfo) && Intrinsics.e(this.placed, orderHistoryItem.placed) && Intrinsics.e(this.status, orderHistoryItem.status) && Intrinsics.e(this.statusDisplay, orderHistoryItem.statusDisplay) && Intrinsics.e(this.tipAmount, orderHistoryItem.tipAmount) && Intrinsics.e(this.tipAuthCode, orderHistoryItem.tipAuthCode) && Intrinsics.e(this.tipCode, orderHistoryItem.tipCode) && Intrinsics.e(this.tipDate, orderHistoryItem.tipDate) && this.tippablePartner == orderHistoryItem.tippablePartner && this.tippedAndRated == orderHistoryItem.tippedAndRated && Intrinsics.e(this.total, orderHistoryItem.total) && this.totalItems == orderHistoryItem.totalItems && Intrinsics.e(this.tipAndRateDetails, orderHistoryItem.tipAndRateDetails) && Intrinsics.e(this.paymentInfo, orderHistoryItem.paymentInfo);
    }

    public OrderHistoryItem(String code, DeliveryModeEnum deliveryMode, String guid, OrdersPickUpSlotInfo pickUpSlotInfo, OffsetDateTime offsetDateTime, String status, String statusDisplay, TipAmount tipAmount, String str, String str2, OffsetDateTime offsetDateTime2, boolean z10, boolean z11, mk.b total, int i10, TipAndRateDetails tipAndRateDetails, PaymentDetailItem paymentInfo) {
        Intrinsics.j(code, "code");
        Intrinsics.j(deliveryMode, "deliveryMode");
        Intrinsics.j(guid, "guid");
        Intrinsics.j(pickUpSlotInfo, "pickUpSlotInfo");
        Intrinsics.j(status, "status");
        Intrinsics.j(statusDisplay, "statusDisplay");
        Intrinsics.j(total, "total");
        Intrinsics.j(tipAndRateDetails, "tipAndRateDetails");
        Intrinsics.j(paymentInfo, "paymentInfo");
        this.code = code;
        this.deliveryMode = deliveryMode;
        this.guid = guid;
        this.pickUpSlotInfo = pickUpSlotInfo;
        this.placed = offsetDateTime;
        this.status = status;
        this.statusDisplay = statusDisplay;
        this.tipAmount = tipAmount;
        this.tipAuthCode = str;
        this.tipCode = str2;
        this.tipDate = offsetDateTime2;
        this.tippablePartner = z10;
        this.tippedAndRated = z11;
        this.total = total;
        this.totalItems = i10;
        this.tipAndRateDetails = tipAndRateDetails;
        this.paymentInfo = paymentInfo;
        this.isActive = !CollectionsKt.p("PROCESSING_ERROR", "CANCELLING").contains(status);
    }

    public static /* synthetic */ boolean o(OrderHistoryItem orderHistoryItem, LocalDate localDate, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            localDate = LocalDate.now();
        }
        return orderHistoryItem.n(localDate);
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
    public final PaymentDetailItem getPaymentInfo() {
        return this.paymentInfo;
    }

    /* renamed from: e, reason: from getter */
    public final OrdersPickUpSlotInfo getPickUpSlotInfo() {
        return this.pickUpSlotInfo;
    }

    /* renamed from: f, reason: from getter */
    public final OffsetDateTime getPlaced() {
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

    public int hashCode() {
        int iHashCode = ((((((this.code.hashCode() * 31) + this.deliveryMode.hashCode()) * 31) + this.guid.hashCode()) * 31) + this.pickUpSlotInfo.hashCode()) * 31;
        OffsetDateTime offsetDateTime = this.placed;
        int iHashCode2 = (((((iHashCode + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31) + this.status.hashCode()) * 31) + this.statusDisplay.hashCode()) * 31;
        TipAmount tipAmount = this.tipAmount;
        int iHashCode3 = (iHashCode2 + (tipAmount == null ? 0 : tipAmount.hashCode())) * 31;
        String str = this.tipAuthCode;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.tipCode;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        OffsetDateTime offsetDateTime2 = this.tipDate;
        return ((((((((((((iHashCode5 + (offsetDateTime2 != null ? offsetDateTime2.hashCode() : 0)) * 31) + Boolean.hashCode(this.tippablePartner)) * 31) + Boolean.hashCode(this.tippedAndRated)) * 31) + this.total.hashCode()) * 31) + Integer.hashCode(this.totalItems)) * 31) + this.tipAndRateDetails.hashCode()) * 31) + this.paymentInfo.hashCode();
    }

    /* renamed from: i, reason: from getter */
    public final TipAndRateDetails getTipAndRateDetails() {
        return this.tipAndRateDetails;
    }

    /* renamed from: j, reason: from getter */
    public final boolean getTippedAndRated() {
        return this.tippedAndRated;
    }

    /* renamed from: k, reason: from getter */
    public final mk.b getTotal() {
        return this.total;
    }

    /* renamed from: l, reason: from getter */
    public final int getTotalItems() {
        return this.totalItems;
    }

    /* renamed from: m, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    public final boolean n(LocalDate now) {
        LocalDate localDate;
        Intrinsics.j(now, "now");
        OffsetDateTime pickUpSlotDateTime = this.pickUpSlotInfo.getPickUpSlotDateTime();
        boolean z10 = false;
        if (pickUpSlotDateTime != null && (localDate = pickUpSlotDateTime.toLocalDate()) != null && localDate.isBefore(now.minusDays(1L))) {
            z10 = true;
        }
        return !z10;
    }

    public String toString() {
        return "OrderHistoryItem(code=" + this.code + ", deliveryMode=" + this.deliveryMode + ", guid=" + this.guid + ", pickUpSlotInfo=" + this.pickUpSlotInfo + ", placed=" + this.placed + ", status=" + this.status + ", statusDisplay=" + this.statusDisplay + ", tipAmount=" + this.tipAmount + ", tipAuthCode=" + this.tipAuthCode + ", tipCode=" + this.tipCode + ", tipDate=" + this.tipDate + ", tippablePartner=" + this.tippablePartner + ", tippedAndRated=" + this.tippedAndRated + ", total=" + this.total + ", totalItems=" + this.totalItems + ", tipAndRateDetails=" + this.tipAndRateDetails + ", paymentInfo=" + this.paymentInfo + ')';
    }
}
