package com.meijer.mobile.digitalshopping.api.orders.model.tipandrate;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pl.TipData;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001aB\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/orders/model/tipandrate/TipNotificationResponse;", "", "Lcom/meijer/mobile/digitalshopping/api/orders/model/tipandrate/TipNotificationResponse$TipDataResponse;", "tipData", "", "timeStamp", "<init>", "(Lcom/meijer/mobile/digitalshopping/api/orders/model/tipandrate/TipNotificationResponse$TipDataResponse;J)V", "copy", "(Lcom/meijer/mobile/digitalshopping/api/orders/model/tipandrate/TipNotificationResponse$TipDataResponse;J)Lcom/meijer/mobile/digitalshopping/api/orders/model/tipandrate/TipNotificationResponse;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/digitalshopping/api/orders/model/tipandrate/TipNotificationResponse$TipDataResponse;", "b", "()Lcom/meijer/mobile/digitalshopping/api/orders/model/tipandrate/TipNotificationResponse$TipDataResponse;", "J", "()J", "TipDataResponse", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class TipNotificationResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final TipDataResponse tipData;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long timeStamp;

    @i(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00020\u0001Bm\u0012\f\b\u0001\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\f\b\u0001\u0010\u0006\u001a\u00060\u0002j\u0002`\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\u0002\u0012\b\b\u0001\u0010\n\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\f\u001a\u00020\u0002\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012Jv\u0010\u0013\u001a\u00020\u00002\f\b\u0003\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\f\b\u0003\u0010\u0006\u001a\u00060\u0002j\u0002`\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u00022\b\b\u0003\u0010\t\u001a\u00020\u00022\b\b\u0003\u0010\n\u001a\u00020\u00022\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\f\u001a\u00020\u00022\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0016R\u001b\u0010\u0006\u001a\u00060\u0002j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b!\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010\u0016R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b\u001e\u0010\u0016R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b\"\u0010\u0016R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b$\u0010\u0016R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001f\u001a\u0004\b'\u0010\u0016R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010\u0016¨\u0006("}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/orders/model/tipandrate/TipNotificationResponse$TipDataResponse;", "", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "Lcom/meijer/mobile/core/model/common/ExternalShopperId;", "externalShopperId", "modalState", "tipAmount", "displayCounter", "finalOrderAmount", "finalOrderDate", "shopperName", "shopperImageURL", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lpl/a;", "j", "()Lpl/a;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/digitalshopping/api/orders/model/tipandrate/TipNotificationResponse$TipDataResponse;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "c", "e", "d", "i", "g", "h", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TipDataResponse {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String orderId;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String externalShopperId;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String modalState;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String tipAmount;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String displayCounter;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String finalOrderAmount;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final String finalOrderDate;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final String shopperName;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final String shopperImageURL;

        public final TipDataResponse copy(@g(name = "orderId") String orderId, @g(name = "externalShopperId") String externalShopperId, @g(name = "modalState") String modalState, @g(name = "tipAmount") String tipAmount, @g(name = "displayCounter") String displayCounter, @g(name = "finalOrderAmount") String finalOrderAmount, @g(name = "finalOrderDate") String finalOrderDate, @g(name = "shopperName") String shopperName, @g(name = "shopperImageURL") String shopperImageURL) {
            Intrinsics.j(orderId, "orderId");
            Intrinsics.j(externalShopperId, "externalShopperId");
            Intrinsics.j(modalState, "modalState");
            Intrinsics.j(tipAmount, "tipAmount");
            Intrinsics.j(displayCounter, "displayCounter");
            Intrinsics.j(finalOrderAmount, "finalOrderAmount");
            Intrinsics.j(shopperName, "shopperName");
            return new TipDataResponse(orderId, externalShopperId, modalState, tipAmount, displayCounter, finalOrderAmount, finalOrderDate, shopperName, shopperImageURL);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TipDataResponse)) {
                return false;
            }
            TipDataResponse tipDataResponse = (TipDataResponse) other;
            return Intrinsics.e(this.orderId, tipDataResponse.orderId) && Intrinsics.e(this.externalShopperId, tipDataResponse.externalShopperId) && Intrinsics.e(this.modalState, tipDataResponse.modalState) && Intrinsics.e(this.tipAmount, tipDataResponse.tipAmount) && Intrinsics.e(this.displayCounter, tipDataResponse.displayCounter) && Intrinsics.e(this.finalOrderAmount, tipDataResponse.finalOrderAmount) && Intrinsics.e(this.finalOrderDate, tipDataResponse.finalOrderDate) && Intrinsics.e(this.shopperName, tipDataResponse.shopperName) && Intrinsics.e(this.shopperImageURL, tipDataResponse.shopperImageURL);
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.orderId.hashCode() * 31) + this.externalShopperId.hashCode()) * 31) + this.modalState.hashCode()) * 31) + this.tipAmount.hashCode()) * 31) + this.displayCounter.hashCode()) * 31) + this.finalOrderAmount.hashCode()) * 31;
            String str = this.finalOrderDate;
            int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.shopperName.hashCode()) * 31;
            String str2 = this.shopperImageURL;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "TipDataResponse(orderId=" + this.orderId + ", externalShopperId=" + this.externalShopperId + ", modalState=" + this.modalState + ", tipAmount=" + this.tipAmount + ", displayCounter=" + this.displayCounter + ", finalOrderAmount=" + this.finalOrderAmount + ", finalOrderDate=" + this.finalOrderDate + ", shopperName=" + this.shopperName + ", shopperImageURL=" + this.shopperImageURL + ')';
        }

        public TipDataResponse(@g(name = "orderId") String orderId, @g(name = "externalShopperId") String externalShopperId, @g(name = "modalState") String modalState, @g(name = "tipAmount") String tipAmount, @g(name = "displayCounter") String displayCounter, @g(name = "finalOrderAmount") String finalOrderAmount, @g(name = "finalOrderDate") String str, @g(name = "shopperName") String shopperName, @g(name = "shopperImageURL") String str2) {
            Intrinsics.j(orderId, "orderId");
            Intrinsics.j(externalShopperId, "externalShopperId");
            Intrinsics.j(modalState, "modalState");
            Intrinsics.j(tipAmount, "tipAmount");
            Intrinsics.j(displayCounter, "displayCounter");
            Intrinsics.j(finalOrderAmount, "finalOrderAmount");
            Intrinsics.j(shopperName, "shopperName");
            this.orderId = orderId;
            this.externalShopperId = externalShopperId;
            this.modalState = modalState;
            this.tipAmount = tipAmount;
            this.displayCounter = displayCounter;
            this.finalOrderAmount = finalOrderAmount;
            this.finalOrderDate = str;
            this.shopperName = shopperName;
            this.shopperImageURL = str2;
        }

        /* renamed from: a, reason: from getter */
        public final String getDisplayCounter() {
            return this.displayCounter;
        }

        /* renamed from: b, reason: from getter */
        public final String getExternalShopperId() {
            return this.externalShopperId;
        }

        /* renamed from: c, reason: from getter */
        public final String getFinalOrderAmount() {
            return this.finalOrderAmount;
        }

        /* renamed from: d, reason: from getter */
        public final String getFinalOrderDate() {
            return this.finalOrderDate;
        }

        /* renamed from: e, reason: from getter */
        public final String getModalState() {
            return this.modalState;
        }

        /* renamed from: f, reason: from getter */
        public final String getOrderId() {
            return this.orderId;
        }

        /* renamed from: g, reason: from getter */
        public final String getShopperImageURL() {
            return this.shopperImageURL;
        }

        /* renamed from: h, reason: from getter */
        public final String getShopperName() {
            return this.shopperName;
        }

        /* renamed from: i, reason: from getter */
        public final String getTipAmount() {
            return this.tipAmount;
        }

        public final TipData j() {
            String str;
            String str2 = this.orderId;
            String str3 = this.externalShopperId;
            String str4 = this.modalState;
            String str5 = this.tipAmount;
            String str6 = this.displayCounter;
            String str7 = this.finalOrderAmount;
            String str8 = this.finalOrderDate;
            if (str8 == null) {
                str8 = "";
                str = str8;
            } else {
                str = "";
            }
            String str9 = this.shopperName;
            String str10 = this.shopperImageURL;
            if (str10 != null) {
                str = str10;
            }
            return new TipData(str2, str3, str4, str5, str6, str7, str8, str9, str);
        }
    }

    public final TipNotificationResponse copy(@g(name = "data") TipDataResponse tipData, @g(name = "_ts") long timeStamp) {
        Intrinsics.j(tipData, "tipData");
        return new TipNotificationResponse(tipData, timeStamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TipNotificationResponse)) {
            return false;
        }
        TipNotificationResponse tipNotificationResponse = (TipNotificationResponse) other;
        return Intrinsics.e(this.tipData, tipNotificationResponse.tipData) && this.timeStamp == tipNotificationResponse.timeStamp;
    }

    public int hashCode() {
        return (this.tipData.hashCode() * 31) + Long.hashCode(this.timeStamp);
    }

    public String toString() {
        return "TipNotificationResponse(tipData=" + this.tipData + ", timeStamp=" + this.timeStamp + ')';
    }

    public TipNotificationResponse(@g(name = "data") TipDataResponse tipData, @g(name = "_ts") long j10) {
        Intrinsics.j(tipData, "tipData");
        this.tipData = tipData;
        this.timeStamp = j10;
    }

    /* renamed from: a, reason: from getter */
    public final long getTimeStamp() {
        return this.timeStamp;
    }

    /* renamed from: b, reason: from getter */
    public final TipDataResponse getTipData() {
        return this.tipData;
    }
}
