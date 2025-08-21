package com.meijer.mobile.cart.model.hybris.orderdetails;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import hj.EbtTransaction;
import j$.time.OffsetDateTime;
import kj.r;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import wk.C17898a;
import wk.d;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0002\u0019\u0013B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/orderdetails/EbtTransactionResponse;", "", "", "key", "Lcom/meijer/mobile/cart/model/hybris/orderdetails/EbtTransactionResponse$EbtDetailsResponse;", "ebtDetails", "<init>", "(Ljava/lang/String;Lcom/meijer/mobile/cart/model/hybris/orderdetails/EbtTransactionResponse$EbtDetailsResponse;)V", "copy", "(Ljava/lang/String;Lcom/meijer/mobile/cart/model/hybris/orderdetails/EbtTransactionResponse$EbtDetailsResponse;)Lcom/meijer/mobile/cart/model/hybris/orderdetails/EbtTransactionResponse;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/meijer/mobile/cart/model/hybris/orderdetails/EbtTransactionResponse$EbtDetailsResponse;", "()Lcom/meijer/mobile/cart/model/hybris/orderdetails/EbtTransactionResponse$EbtDetailsResponse;", "c", "EbtDetailsResponse", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class EbtTransactionResponse {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String key;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final EbtDetailsResponse ebtDetails;

    @i(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0004\u0012\b\b\u0001\u0010\t\u001a\u00020\u0004\u0012\b\b\u0001\u0010\n\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJj\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u00042\b\b\u0003\u0010\t\u001a\u00020\u00042\b\b\u0003\u0010\n\u001a\u00020\u00042\b\b\u0003\u0010\u000b\u001a\u00020\u00022\b\b\u0003\u0010\f\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b \u0010\u0012R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b!\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b\"\u0010\u001eR\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b#\u0010\u001eR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b$\u0010\u0012R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b%\u0010\u0012¨\u0006&"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/orderdetails/EbtTransactionResponse$EbtDetailsResponse;", "", "", "cartID", "", "ebtBalanceAmount", "ebtCaptureTime", "ebtCaptureTransactionId", "ebtCapturedAmount", "ebtNewChargeAmount", "ebtRefundAmount", "ebtRefundTime", "ebtRefundTransactionId", "<init>", "(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;DDDLjava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;DDDLjava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/cart/model/hybris/orderdetails/EbtTransactionResponse$EbtDetailsResponse;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "D", "()D", "c", "d", "e", "f", "g", "h", "i", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class EbtDetailsResponse {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String cartID;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final double ebtBalanceAmount;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String ebtCaptureTime;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String ebtCaptureTransactionId;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final double ebtCapturedAmount;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final double ebtNewChargeAmount;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final double ebtRefundAmount;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final String ebtRefundTime;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final String ebtRefundTransactionId;

        public final EbtDetailsResponse copy(@g(name = "cartID") String cartID, @g(name = "ebtBalanceAmount") double ebtBalanceAmount, @g(name = "ebtCaptureDateTime") String ebtCaptureTime, @g(name = "ebtCaptureTransactionId") String ebtCaptureTransactionId, @g(name = "ebtCapturedAmount") double ebtCapturedAmount, @g(name = "ebtNewChargeAmount") double ebtNewChargeAmount, @g(name = "ebtRefundAmount") double ebtRefundAmount, @g(name = "ebtRefundDateTime") String ebtRefundTime, @g(name = "ebtRefundTransactionId") String ebtRefundTransactionId) {
            Intrinsics.j(cartID, "cartID");
            Intrinsics.j(ebtCaptureTime, "ebtCaptureTime");
            Intrinsics.j(ebtCaptureTransactionId, "ebtCaptureTransactionId");
            Intrinsics.j(ebtRefundTime, "ebtRefundTime");
            Intrinsics.j(ebtRefundTransactionId, "ebtRefundTransactionId");
            return new EbtDetailsResponse(cartID, ebtBalanceAmount, ebtCaptureTime, ebtCaptureTransactionId, ebtCapturedAmount, ebtNewChargeAmount, ebtRefundAmount, ebtRefundTime, ebtRefundTransactionId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EbtDetailsResponse)) {
                return false;
            }
            EbtDetailsResponse ebtDetailsResponse = (EbtDetailsResponse) other;
            return Intrinsics.e(this.cartID, ebtDetailsResponse.cartID) && Double.compare(this.ebtBalanceAmount, ebtDetailsResponse.ebtBalanceAmount) == 0 && Intrinsics.e(this.ebtCaptureTime, ebtDetailsResponse.ebtCaptureTime) && Intrinsics.e(this.ebtCaptureTransactionId, ebtDetailsResponse.ebtCaptureTransactionId) && Double.compare(this.ebtCapturedAmount, ebtDetailsResponse.ebtCapturedAmount) == 0 && Double.compare(this.ebtNewChargeAmount, ebtDetailsResponse.ebtNewChargeAmount) == 0 && Double.compare(this.ebtRefundAmount, ebtDetailsResponse.ebtRefundAmount) == 0 && Intrinsics.e(this.ebtRefundTime, ebtDetailsResponse.ebtRefundTime) && Intrinsics.e(this.ebtRefundTransactionId, ebtDetailsResponse.ebtRefundTransactionId);
        }

        public int hashCode() {
            return (((((((((((((((this.cartID.hashCode() * 31) + Double.hashCode(this.ebtBalanceAmount)) * 31) + this.ebtCaptureTime.hashCode()) * 31) + this.ebtCaptureTransactionId.hashCode()) * 31) + Double.hashCode(this.ebtCapturedAmount)) * 31) + Double.hashCode(this.ebtNewChargeAmount)) * 31) + Double.hashCode(this.ebtRefundAmount)) * 31) + this.ebtRefundTime.hashCode()) * 31) + this.ebtRefundTransactionId.hashCode();
        }

        public String toString() {
            return "EbtDetailsResponse(cartID=" + this.cartID + ", ebtBalanceAmount=" + this.ebtBalanceAmount + ", ebtCaptureTime=" + this.ebtCaptureTime + ", ebtCaptureTransactionId=" + this.ebtCaptureTransactionId + ", ebtCapturedAmount=" + this.ebtCapturedAmount + ", ebtNewChargeAmount=" + this.ebtNewChargeAmount + ", ebtRefundAmount=" + this.ebtRefundAmount + ", ebtRefundTime=" + this.ebtRefundTime + ", ebtRefundTransactionId=" + this.ebtRefundTransactionId + ')';
        }

        public EbtDetailsResponse(@g(name = "cartID") String cartID, @g(name = "ebtBalanceAmount") double d10, @g(name = "ebtCaptureDateTime") String ebtCaptureTime, @g(name = "ebtCaptureTransactionId") String ebtCaptureTransactionId, @g(name = "ebtCapturedAmount") double d11, @g(name = "ebtNewChargeAmount") double d12, @g(name = "ebtRefundAmount") double d13, @g(name = "ebtRefundDateTime") String ebtRefundTime, @g(name = "ebtRefundTransactionId") String ebtRefundTransactionId) {
            Intrinsics.j(cartID, "cartID");
            Intrinsics.j(ebtCaptureTime, "ebtCaptureTime");
            Intrinsics.j(ebtCaptureTransactionId, "ebtCaptureTransactionId");
            Intrinsics.j(ebtRefundTime, "ebtRefundTime");
            Intrinsics.j(ebtRefundTransactionId, "ebtRefundTransactionId");
            this.cartID = cartID;
            this.ebtBalanceAmount = d10;
            this.ebtCaptureTime = ebtCaptureTime;
            this.ebtCaptureTransactionId = ebtCaptureTransactionId;
            this.ebtCapturedAmount = d11;
            this.ebtNewChargeAmount = d12;
            this.ebtRefundAmount = d13;
            this.ebtRefundTime = ebtRefundTime;
            this.ebtRefundTransactionId = ebtRefundTransactionId;
        }

        /* renamed from: a, reason: from getter */
        public final String getCartID() {
            return this.cartID;
        }

        /* renamed from: b, reason: from getter */
        public final double getEbtBalanceAmount() {
            return this.ebtBalanceAmount;
        }

        /* renamed from: c, reason: from getter */
        public final String getEbtCaptureTime() {
            return this.ebtCaptureTime;
        }

        /* renamed from: d, reason: from getter */
        public final String getEbtCaptureTransactionId() {
            return this.ebtCaptureTransactionId;
        }

        /* renamed from: e, reason: from getter */
        public final double getEbtCapturedAmount() {
            return this.ebtCapturedAmount;
        }

        /* renamed from: f, reason: from getter */
        public final double getEbtNewChargeAmount() {
            return this.ebtNewChargeAmount;
        }

        /* renamed from: g, reason: from getter */
        public final double getEbtRefundAmount() {
            return this.ebtRefundAmount;
        }

        /* renamed from: h, reason: from getter */
        public final String getEbtRefundTime() {
            return this.ebtRefundTime;
        }

        /* renamed from: i, reason: from getter */
        public final String getEbtRefundTransactionId() {
            return this.ebtRefundTransactionId;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/orderdetails/EbtTransactionResponse$a;", "", "<init>", "()V", "Lcom/meijer/mobile/cart/model/hybris/orderdetails/EbtTransactionResponse;", "Lhj/b;", "a", "(Lcom/meijer/mobile/cart/model/hybris/orderdetails/EbtTransactionResponse;)Lhj/b;", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.cart.model.hybris.orderdetails.EbtTransactionResponse$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final EbtTransaction a(EbtTransactionResponse ebtTransactionResponse) {
            Intrinsics.j(ebtTransactionResponse, "<this>");
            String key = ebtTransactionResponse.getKey();
            String cartID = ebtTransactionResponse.getEbtDetails().getCartID();
            double ebtBalanceAmount = ebtTransactionResponse.getEbtDetails().getEbtBalanceAmount();
            String ebtCaptureTime = ebtTransactionResponse.getEbtDetails().getEbtCaptureTime();
            C17898a c17898a = C17898a.f167225a;
            Object objA = d.a(ebtCaptureTime, c17898a.s(), new r());
            Intrinsics.i(objA, "toDateTime(...)");
            String ebtCaptureTransactionId = ebtTransactionResponse.getEbtDetails().getEbtCaptureTransactionId();
            double ebtCapturedAmount = ebtTransactionResponse.getEbtDetails().getEbtCapturedAmount();
            double ebtNewChargeAmount = ebtTransactionResponse.getEbtDetails().getEbtNewChargeAmount();
            double ebtRefundAmount = ebtTransactionResponse.getEbtDetails().getEbtRefundAmount();
            Object objA2 = d.a(ebtTransactionResponse.getEbtDetails().getEbtCaptureTime(), c17898a.s(), new r());
            Intrinsics.i(objA2, "toDateTime(...)");
            return new EbtTransaction(key, new EbtTransaction.EbtDetails(cartID, ebtBalanceAmount, (OffsetDateTime) objA, ebtCaptureTransactionId, ebtCapturedAmount, ebtNewChargeAmount, ebtRefundAmount, (OffsetDateTime) objA2, ebtTransactionResponse.getEbtDetails().getEbtRefundTransactionId()));
        }
    }

    public final EbtTransactionResponse copy(@g(name = "key") String key, @g(name = "value") EbtDetailsResponse ebtDetails) {
        Intrinsics.j(key, "key");
        Intrinsics.j(ebtDetails, "ebtDetails");
        return new EbtTransactionResponse(key, ebtDetails);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EbtTransactionResponse)) {
            return false;
        }
        EbtTransactionResponse ebtTransactionResponse = (EbtTransactionResponse) other;
        return Intrinsics.e(this.key, ebtTransactionResponse.key) && Intrinsics.e(this.ebtDetails, ebtTransactionResponse.ebtDetails);
    }

    public int hashCode() {
        return (this.key.hashCode() * 31) + this.ebtDetails.hashCode();
    }

    public String toString() {
        return "EbtTransactionResponse(key=" + this.key + ", ebtDetails=" + this.ebtDetails + ')';
    }

    public EbtTransactionResponse(@g(name = "key") String key, @g(name = "value") EbtDetailsResponse ebtDetails) {
        Intrinsics.j(key, "key");
        Intrinsics.j(ebtDetails, "ebtDetails");
        this.key = key;
        this.ebtDetails = ebtDetails;
    }

    /* renamed from: a, reason: from getter */
    public final EbtDetailsResponse getEbtDetails() {
        return this.ebtDetails;
    }

    /* renamed from: b, reason: from getter */
    public final String getKey() {
        return this.key;
    }
}
