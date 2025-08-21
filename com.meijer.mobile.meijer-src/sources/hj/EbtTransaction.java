package hj;

import j$.time.OffsetDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, d2 = {"Lhj/b;", "", "", "key", "Lhj/b$a;", "ebtDetails", "<init>", "(Ljava/lang/String;Lhj/b$a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lhj/b$a;", "()Lhj/b$a;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hj.b, reason: case insensitive filesystem and from toString */
/* loaded from: classes8.dex */
public final /* data */ class EbtTransaction {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String key;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final EbtDetails ebtDetails;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001b\u0010!R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b\u001f\u0010\u0011R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010\u001eR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b#\u0010\u001eR\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b$\u0010!R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001a\u001a\u0004\b&\u0010\u0011¨\u0006)"}, d2 = {"Lhj/b$a;", "", "", "cartID", "", "ebtBalanceAmount", "j$/time/OffsetDateTime", "ebtCaptureTime", "ebtCaptureTransactionId", "ebtCapturedAmount", "ebtNewChargeAmount", "ebtRefundAmount", "ebtRefundTime", "ebtRefundTransactionId", "<init>", "(Ljava/lang/String;DLj$/time/OffsetDateTime;Ljava/lang/String;DDDLj$/time/OffsetDateTime;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "D", "getEbtBalanceAmount", "()D", "c", "Lj$/time/OffsetDateTime;", "()Lj$/time/OffsetDateTime;", "d", "e", "f", "getEbtNewChargeAmount", "g", "h", "i", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hj.b$a, reason: from toString */
    public static final /* data */ class EbtDetails {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String cartID;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final double ebtBalanceAmount;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final OffsetDateTime ebtCaptureTime;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String ebtCaptureTransactionId;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final double ebtCapturedAmount;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final double ebtNewChargeAmount;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final double ebtRefundAmount;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final OffsetDateTime ebtRefundTime;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final String ebtRefundTransactionId;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EbtDetails)) {
                return false;
            }
            EbtDetails ebtDetails = (EbtDetails) other;
            return Intrinsics.e(this.cartID, ebtDetails.cartID) && Double.compare(this.ebtBalanceAmount, ebtDetails.ebtBalanceAmount) == 0 && Intrinsics.e(this.ebtCaptureTime, ebtDetails.ebtCaptureTime) && Intrinsics.e(this.ebtCaptureTransactionId, ebtDetails.ebtCaptureTransactionId) && Double.compare(this.ebtCapturedAmount, ebtDetails.ebtCapturedAmount) == 0 && Double.compare(this.ebtNewChargeAmount, ebtDetails.ebtNewChargeAmount) == 0 && Double.compare(this.ebtRefundAmount, ebtDetails.ebtRefundAmount) == 0 && Intrinsics.e(this.ebtRefundTime, ebtDetails.ebtRefundTime) && Intrinsics.e(this.ebtRefundTransactionId, ebtDetails.ebtRefundTransactionId);
        }

        public EbtDetails(String cartID, double d10, OffsetDateTime ebtCaptureTime, String ebtCaptureTransactionId, double d11, double d12, double d13, OffsetDateTime ebtRefundTime, String ebtRefundTransactionId) {
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
        public final OffsetDateTime getEbtCaptureTime() {
            return this.ebtCaptureTime;
        }

        /* renamed from: c, reason: from getter */
        public final String getEbtCaptureTransactionId() {
            return this.ebtCaptureTransactionId;
        }

        /* renamed from: d, reason: from getter */
        public final double getEbtCapturedAmount() {
            return this.ebtCapturedAmount;
        }

        /* renamed from: e, reason: from getter */
        public final double getEbtRefundAmount() {
            return this.ebtRefundAmount;
        }

        /* renamed from: f, reason: from getter */
        public final OffsetDateTime getEbtRefundTime() {
            return this.ebtRefundTime;
        }

        /* renamed from: g, reason: from getter */
        public final String getEbtRefundTransactionId() {
            return this.ebtRefundTransactionId;
        }

        public int hashCode() {
            return (((((((((((((((this.cartID.hashCode() * 31) + Double.hashCode(this.ebtBalanceAmount)) * 31) + this.ebtCaptureTime.hashCode()) * 31) + this.ebtCaptureTransactionId.hashCode()) * 31) + Double.hashCode(this.ebtCapturedAmount)) * 31) + Double.hashCode(this.ebtNewChargeAmount)) * 31) + Double.hashCode(this.ebtRefundAmount)) * 31) + this.ebtRefundTime.hashCode()) * 31) + this.ebtRefundTransactionId.hashCode();
        }

        public String toString() {
            return "EbtDetails(cartID=" + this.cartID + ", ebtBalanceAmount=" + this.ebtBalanceAmount + ", ebtCaptureTime=" + this.ebtCaptureTime + ", ebtCaptureTransactionId=" + this.ebtCaptureTransactionId + ", ebtCapturedAmount=" + this.ebtCapturedAmount + ", ebtNewChargeAmount=" + this.ebtNewChargeAmount + ", ebtRefundAmount=" + this.ebtRefundAmount + ", ebtRefundTime=" + this.ebtRefundTime + ", ebtRefundTransactionId=" + this.ebtRefundTransactionId + ')';
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EbtTransaction)) {
            return false;
        }
        EbtTransaction ebtTransaction = (EbtTransaction) other;
        return Intrinsics.e(this.key, ebtTransaction.key) && Intrinsics.e(this.ebtDetails, ebtTransaction.ebtDetails);
    }

    public EbtTransaction(String key, EbtDetails ebtDetails) {
        Intrinsics.j(key, "key");
        Intrinsics.j(ebtDetails, "ebtDetails");
        this.key = key;
        this.ebtDetails = ebtDetails;
    }

    /* renamed from: a, reason: from getter */
    public final EbtDetails getEbtDetails() {
        return this.ebtDetails;
    }

    /* renamed from: b, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    public int hashCode() {
        return (this.key.hashCode() * 31) + this.ebtDetails.hashCode();
    }

    public String toString() {
        return "EbtTransaction(key=" + this.key + ", ebtDetails=" + this.ebtDetails + ')';
    }
}
