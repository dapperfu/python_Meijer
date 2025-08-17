package Lm;

import hi.TrackingData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import zp.CustomerSavings;
import zp.DigitalReceipt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"LLm/a;", "", "<init>", "()V", "e", "d", "c", "f", "b", "a", "LLm/a$a;", "LLm/a$b;", "LLm/a$c;", "LLm/a$d;", "LLm/a$e;", "LLm/a$f;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class a {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LLm/a$a;", "LLm/a;", "Lhi/f;", "trackingData", "<init>", "(Lhi/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhi/f;", "()Lhi/f;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Lm.a$a, reason: collision with other inner class name and from toString */
    public static final /* data */ class AddTransaction extends a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final TrackingData trackingData;

        /* JADX WARN: Multi-variable type inference failed */
        public AddTransaction() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AddTransaction) && Intrinsics.e(this.trackingData, ((AddTransaction) other).trackingData);
        }

        public /* synthetic */ AddTransaction(TrackingData trackingData, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : trackingData);
        }

        /* renamed from: a, reason: from getter */
        public final TrackingData getTrackingData() {
            return this.trackingData;
        }

        public int hashCode() {
            TrackingData trackingData = this.trackingData;
            if (trackingData == null) {
                return 0;
            }
            return trackingData.hashCode();
        }

        public String toString() {
            return "AddTransaction(trackingData=" + this.trackingData + ')';
        }

        public AddTransaction(TrackingData trackingData) {
            super(null);
            this.trackingData = trackingData;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"LLm/a$b;", "LLm/a;", "", "Lcom/meijer/mobile/meijer/activity/orders/screens/orderhistory/OrderId;", "orderId", "Lhi/f;", "trackingData", "<init>", "(Ljava/lang/Long;Lhi/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Long;", "()Ljava/lang/Long;", "b", "Lhi/f;", "()Lhi/f;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Lm.a$b, reason: from toString */
    public static final /* data */ class DisplayOrderDetails extends a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Long orderId;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final TrackingData trackingData;

        public DisplayOrderDetails(Long l10, TrackingData trackingData) {
            super(null);
            this.orderId = l10;
            this.trackingData = trackingData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DisplayOrderDetails)) {
                return false;
            }
            DisplayOrderDetails displayOrderDetails = (DisplayOrderDetails) other;
            return Intrinsics.e(this.orderId, displayOrderDetails.orderId) && Intrinsics.e(this.trackingData, displayOrderDetails.trackingData);
        }

        /* renamed from: a, reason: from getter */
        public final Long getOrderId() {
            return this.orderId;
        }

        /* renamed from: b, reason: from getter */
        public final TrackingData getTrackingData() {
            return this.trackingData;
        }

        public int hashCode() {
            Long l10 = this.orderId;
            int iHashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
            TrackingData trackingData = this.trackingData;
            return iHashCode + (trackingData != null ? trackingData.hashCode() : 0);
        }

        public String toString() {
            return "DisplayOrderDetails(orderId=" + this.orderId + ", trackingData=" + this.trackingData + ')';
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"LLm/a$c;", "LLm/a;", "Lzp/b;", "receipt", "Lhi/f;", "trackingData", "<init>", "(Lzp/b;Lhi/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lzp/b;", "()Lzp/b;", "b", "Lhi/f;", "()Lhi/f;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Lm.a$c, reason: from toString */
    public static final /* data */ class DisplayReceiptsDetail extends a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final DigitalReceipt receipt;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final TrackingData trackingData;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DisplayReceiptsDetail)) {
                return false;
            }
            DisplayReceiptsDetail displayReceiptsDetail = (DisplayReceiptsDetail) other;
            return Intrinsics.e(this.receipt, displayReceiptsDetail.receipt) && Intrinsics.e(this.trackingData, displayReceiptsDetail.trackingData);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisplayReceiptsDetail(DigitalReceipt receipt, TrackingData trackingData) {
            super(null);
            Intrinsics.j(receipt, "receipt");
            this.receipt = receipt;
            this.trackingData = trackingData;
        }

        /* renamed from: a, reason: from getter */
        public final DigitalReceipt getReceipt() {
            return this.receipt;
        }

        /* renamed from: b, reason: from getter */
        public final TrackingData getTrackingData() {
            return this.trackingData;
        }

        public int hashCode() {
            int iHashCode = this.receipt.hashCode() * 31;
            TrackingData trackingData = this.trackingData;
            return iHashCode + (trackingData == null ? 0 : trackingData.hashCode());
        }

        public String toString() {
            return "DisplayReceiptsDetail(receipt=" + this.receipt + ", trackingData=" + this.trackingData + ')';
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"LLm/a$d;", "LLm/a;", "Lzp/a;", "savingsDetail", "Lhi/f;", "trackingData", "<init>", "(Lzp/a;Lhi/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lzp/a;", "()Lzp/a;", "b", "Lhi/f;", "()Lhi/f;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Lm.a$d, reason: from toString */
    public static final /* data */ class DisplaySavingsDetails extends a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final CustomerSavings savingsDetail;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final TrackingData trackingData;

        public DisplaySavingsDetails(CustomerSavings customerSavings, TrackingData trackingData) {
            super(null);
            this.savingsDetail = customerSavings;
            this.trackingData = trackingData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DisplaySavingsDetails)) {
                return false;
            }
            DisplaySavingsDetails displaySavingsDetails = (DisplaySavingsDetails) other;
            return Intrinsics.e(this.savingsDetail, displaySavingsDetails.savingsDetail) && Intrinsics.e(this.trackingData, displaySavingsDetails.trackingData);
        }

        /* renamed from: a, reason: from getter */
        public final CustomerSavings getSavingsDetail() {
            return this.savingsDetail;
        }

        /* renamed from: b, reason: from getter */
        public final TrackingData getTrackingData() {
            return this.trackingData;
        }

        public int hashCode() {
            CustomerSavings customerSavings = this.savingsDetail;
            int iHashCode = (customerSavings == null ? 0 : customerSavings.hashCode()) * 31;
            TrackingData trackingData = this.trackingData;
            return iHashCode + (trackingData != null ? trackingData.hashCode() : 0);
        }

        public String toString() {
            return "DisplaySavingsDetails(savingsDetail=" + this.savingsDetail + ", trackingData=" + this.trackingData + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LLm/a$e;", "LLm/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class e extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final e f18551a = new e();

        private e() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof e);
        }

        public String toString() {
            return "ReloadReceipts";
        }

        public int hashCode() {
            return -1665159282;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LLm/a$f;", "LLm/a;", "Lhi/f;", "trackingData", "<init>", "(Lhi/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhi/f;", "()Lhi/f;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Lm.a$f, reason: from toString */
    public static final /* data */ class ResubmitCustomerDetail extends a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final TrackingData trackingData;

        /* JADX WARN: Multi-variable type inference failed */
        public ResubmitCustomerDetail() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ResubmitCustomerDetail) && Intrinsics.e(this.trackingData, ((ResubmitCustomerDetail) other).trackingData);
        }

        public /* synthetic */ ResubmitCustomerDetail(TrackingData trackingData, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : trackingData);
        }

        /* renamed from: a, reason: from getter */
        public final TrackingData getTrackingData() {
            return this.trackingData;
        }

        public int hashCode() {
            TrackingData trackingData = this.trackingData;
            if (trackingData == null) {
                return 0;
            }
            return trackingData.hashCode();
        }

        public String toString() {
            return "ResubmitCustomerDetail(trackingData=" + this.trackingData + ')';
        }

        public ResubmitCustomerDetail(TrackingData trackingData) {
            super(null);
            this.trackingData = trackingData;
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private a() {
    }
}
