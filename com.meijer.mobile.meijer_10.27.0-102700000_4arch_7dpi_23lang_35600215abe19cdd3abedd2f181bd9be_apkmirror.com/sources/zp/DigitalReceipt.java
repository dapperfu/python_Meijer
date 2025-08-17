package zp;

import androidx.recyclerview.widget.RecyclerView;
import j$.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b'\b\u0086\b\u0018\u0000 I2\u00020\u0001:\u0003&-*BÁ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\r\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001f\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b5\u0010+\u001a\u0004\b6\u0010\u001eR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b6\u0010+\u001a\u0004\b1\u0010\u001eR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010 R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b:\u0010+\u001a\u0004\b5\u0010\u001eR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b;\u0010+\u001a\u0004\b7\u0010\u001eR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b:\u0010\u001eR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b;\u0010>R\u0017\u0010\u0014\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b?\u00108\u001a\u0004\b&\u0010 R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b@\u0010+\u001a\u0004\bA\u0010\u001eR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\b-\u0010DR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bE\u0010'\u001a\u0004\b*\u0010)R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\b<\u0010H¨\u0006J"}, d2 = {"Lzp/b;", "Lzp/g;", "", "receiptId", "", "Lcom/meijer/mobile/receipt/models/NextGenReceiptId;", "nextGenReceiptId", "j$/time/LocalDateTime", "transactionDateTime", "Lzp/f;", "identifier", "storeName", "storeAddress", "", "storeId", "storeCity", "storeState", "storeZipCode", "", "totalSpent", "numberOfItems", "laneNumber", "Lzp/b$b;", "processingStatus", "onlineOrderId", "Lzp/b$c;", "transactionType", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Lj$/time/LocalDateTime;Lzp/f;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;DILjava/lang/String;Lzp/b$b;Ljava/lang/Long;Lzp/b$c;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Long;", "getReceiptId", "()Ljava/lang/Long;", "b", "Ljava/lang/String;", "getNextGenReceiptId", "c", "Lj$/time/LocalDateTime;", "j", "()Lj$/time/LocalDateTime;", "d", "Lzp/f;", "getIdentifier", "()Lzp/f;", "e", "f", "g", "I", "getStoreId", "h", "i", "k", "D", "()D", "l", "m", "getLaneNumber", "n", "Lzp/b$b;", "()Lzp/b$b;", "o", "p", "Lzp/b$c;", "()Lzp/b$c;", "q", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: zp.b, reason: from toString */
/* loaded from: classes11.dex */
public final /* data */ class DigitalReceipt implements g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Long receiptId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String nextGenReceiptId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDateTime transactionDateTime;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final ReceiptIdentifier identifier;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String storeName;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String storeAddress;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final int storeId;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String storeCity;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String storeState;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String storeZipCode;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final double totalSpent;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final int numberOfItems;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final String laneNumber;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final EnumC2799b processingStatus;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final Long onlineOrderId;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final c transactionType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lzp/b$b;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "b", "c", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zp.b$b, reason: collision with other inner class name */
    public static final class EnumC2799b {

        /* renamed from: b, reason: collision with root package name */
        public static final EnumC2799b f173161b = new EnumC2799b("Pending", 0, "Pending");

        /* renamed from: c, reason: collision with root package name */
        public static final EnumC2799b f173162c = new EnumC2799b("Accepted", 1, "Accepted");

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ EnumC2799b[] f173163d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f173164e;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String value;

        public static EnumEntries<EnumC2799b> b() {
            return f173164e;
        }

        static {
            EnumC2799b[] enumC2799bArrA = a();
            f173163d = enumC2799bArrA;
            f173164e = EnumEntriesKt.a(enumC2799bArrA);
        }

        private static final /* synthetic */ EnumC2799b[] a() {
            return new EnumC2799b[]{f173161b, f173162c};
        }

        public static EnumC2799b valueOf(String str) {
            return (EnumC2799b) Enum.valueOf(EnumC2799b.class, str);
        }

        public static EnumC2799b[] values() {
            return (EnumC2799b[]) f173163d.clone();
        }

        /* renamed from: e, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        private EnumC2799b(String str, int i10, String str2) {
            this.value = str2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lzp/b$c;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "b", "c", "d", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zp.b$c */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f173166b = new c("InStorePurchase", 0, null);

        /* renamed from: c, reason: collision with root package name */
        public static final c f173167c = new c("CustomerResubmits", 1, "CustomerResubmits");

        /* renamed from: d, reason: collision with root package name */
        public static final c f173168d = new c("OnlineOrder", 2, "HomeDelivery");

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ c[] f173169e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f173170f;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String value;

        public static EnumEntries<c> b() {
            return f173170f;
        }

        static {
            c[] cVarArrA = a();
            f173169e = cVarArrA;
            f173170f = EnumEntriesKt.a(cVarArrA);
        }

        private static final /* synthetic */ c[] a() {
            return new c[]{f173166b, f173167c, f173168d};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f173169e.clone();
        }

        /* renamed from: e, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        private c(String str, int i10, String str2) {
            this.value = str2;
        }
    }

    public DigitalReceipt() {
        this(null, null, null, null, null, null, 0, null, null, null, 0.0d, 0, null, null, null, null, 65535, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DigitalReceipt)) {
            return false;
        }
        DigitalReceipt digitalReceipt = (DigitalReceipt) other;
        return Intrinsics.e(this.receiptId, digitalReceipt.receiptId) && Intrinsics.e(this.nextGenReceiptId, digitalReceipt.nextGenReceiptId) && Intrinsics.e(this.transactionDateTime, digitalReceipt.transactionDateTime) && Intrinsics.e(this.identifier, digitalReceipt.identifier) && Intrinsics.e(this.storeName, digitalReceipt.storeName) && Intrinsics.e(this.storeAddress, digitalReceipt.storeAddress) && this.storeId == digitalReceipt.storeId && Intrinsics.e(this.storeCity, digitalReceipt.storeCity) && Intrinsics.e(this.storeState, digitalReceipt.storeState) && Intrinsics.e(this.storeZipCode, digitalReceipt.storeZipCode) && Double.compare(this.totalSpent, digitalReceipt.totalSpent) == 0 && this.numberOfItems == digitalReceipt.numberOfItems && Intrinsics.e(this.laneNumber, digitalReceipt.laneNumber) && this.processingStatus == digitalReceipt.processingStatus && Intrinsics.e(this.onlineOrderId, digitalReceipt.onlineOrderId) && this.transactionType == digitalReceipt.transactionType;
    }

    public DigitalReceipt(Long l10, String str, LocalDateTime transactionDateTime, ReceiptIdentifier identifier, String str2, String str3, int i10, String str4, String str5, String str6, double d10, int i11, String str7, EnumC2799b enumC2799b, Long l11, c transactionType) {
        Intrinsics.j(transactionDateTime, "transactionDateTime");
        Intrinsics.j(identifier, "identifier");
        Intrinsics.j(transactionType, "transactionType");
        this.receiptId = l10;
        this.nextGenReceiptId = str;
        this.transactionDateTime = transactionDateTime;
        this.identifier = identifier;
        this.storeName = str2;
        this.storeAddress = str3;
        this.storeId = i10;
        this.storeCity = str4;
        this.storeState = str5;
        this.storeZipCode = str6;
        this.totalSpent = d10;
        this.numberOfItems = i11;
        this.laneNumber = str7;
        this.processingStatus = enumC2799b;
        this.onlineOrderId = l11;
        this.transactionType = transactionType;
    }

    /* renamed from: a, reason: from getter */
    public final int getNumberOfItems() {
        return this.numberOfItems;
    }

    /* renamed from: b, reason: from getter */
    public final Long getOnlineOrderId() {
        return this.onlineOrderId;
    }

    /* renamed from: c, reason: from getter */
    public final EnumC2799b getProcessingStatus() {
        return this.processingStatus;
    }

    /* renamed from: d, reason: from getter */
    public final String getStoreAddress() {
        return this.storeAddress;
    }

    /* renamed from: e, reason: from getter */
    public final String getStoreCity() {
        return this.storeCity;
    }

    /* renamed from: f, reason: from getter */
    public final String getStoreName() {
        return this.storeName;
    }

    /* renamed from: g, reason: from getter */
    public final String getStoreState() {
        return this.storeState;
    }

    @Override // zp.g
    public ReceiptIdentifier getIdentifier() {
        return this.identifier;
    }

    /* renamed from: h, reason: from getter */
    public final String getStoreZipCode() {
        return this.storeZipCode;
    }

    public int hashCode() {
        Long l10 = this.receiptId;
        int iHashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
        String str = this.nextGenReceiptId;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.transactionDateTime.hashCode()) * 31) + this.identifier.hashCode()) * 31;
        String str2 = this.storeName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.storeAddress;
        int iHashCode4 = (((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + Integer.hashCode(this.storeId)) * 31;
        String str4 = this.storeCity;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.storeState;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.storeZipCode;
        int iHashCode7 = (((((iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + Double.hashCode(this.totalSpent)) * 31) + Integer.hashCode(this.numberOfItems)) * 31;
        String str7 = this.laneNumber;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        EnumC2799b enumC2799b = this.processingStatus;
        int iHashCode9 = (iHashCode8 + (enumC2799b == null ? 0 : enumC2799b.hashCode())) * 31;
        Long l11 = this.onlineOrderId;
        return ((iHashCode9 + (l11 != null ? l11.hashCode() : 0)) * 31) + this.transactionType.hashCode();
    }

    /* renamed from: i, reason: from getter */
    public final double getTotalSpent() {
        return this.totalSpent;
    }

    /* renamed from: j, reason: from getter */
    public final LocalDateTime getTransactionDateTime() {
        return this.transactionDateTime;
    }

    /* renamed from: k, reason: from getter */
    public final c getTransactionType() {
        return this.transactionType;
    }

    public String toString() {
        return "DigitalReceipt(receiptId=" + this.receiptId + ", nextGenReceiptId=" + this.nextGenReceiptId + ", transactionDateTime=" + this.transactionDateTime + ", identifier=" + this.identifier + ", storeName=" + this.storeName + ", storeAddress=" + this.storeAddress + ", storeId=" + this.storeId + ", storeCity=" + this.storeCity + ", storeState=" + this.storeState + ", storeZipCode=" + this.storeZipCode + ", totalSpent=" + this.totalSpent + ", numberOfItems=" + this.numberOfItems + ", laneNumber=" + this.laneNumber + ", processingStatus=" + this.processingStatus + ", onlineOrderId=" + this.onlineOrderId + ", transactionType=" + this.transactionType + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DigitalReceipt(Long l10, String str, LocalDateTime localDateTime, ReceiptIdentifier receiptIdentifier, String str2, String str3, int i10, String str4, String str5, String str6, double d10, int i11, String str7, EnumC2799b enumC2799b, Long l11, c cVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        Long l12 = (i12 & 1) != 0 ? null : l10;
        String str8 = (i12 & 2) != 0 ? null : str;
        LocalDateTime localDateTime2 = (i12 & 4) != 0 ? LocalDateTime.MIN : localDateTime;
        this(l12, str8, localDateTime2, (i12 & 8) != 0 ? new ReceiptIdentifier(l12, str8, localDateTime2) : receiptIdentifier, (i12 & 16) != 0 ? null : str2, (i12 & 32) != 0 ? null : str3, (i12 & 64) != 0 ? 0 : i10, (i12 & 128) != 0 ? null : str4, (i12 & 256) != 0 ? null : str5, (i12 & 512) != 0 ? null : str6, (i12 & 1024) != 0 ? 0.0d : d10, (i12 & RecyclerView.m.FLAG_MOVED) == 0 ? i11 : 0, (i12 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : str7, (i12 & 8192) != 0 ? null : enumC2799b, (i12 & 16384) != 0 ? null : l11, (i12 & 32768) != 0 ? c.f173166b : cVar);
    }
}
