package com.meijer.mobile.receipt.service.api.models;

import androidx.recyclerview.widget.RecyclerView;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import j$.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import vk.C17590a;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0081\b\u0018\u00002\u00020\u0001B¥\u0001\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u000e\u001a\u00020\r\u0012\b\b\u0003\u0010\u000f\u001a\u00020\u0006\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0014\u0010\u0015J®\u0001\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\u000e\u001a\u00020\r2\b\b\u0003\u0010\u000f\u001a\u00020\u00062\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010%\u001a\u0004\b,\u0010\u0019R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b,\u0010%\u001a\u0004\b-\u0010\u0019R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b-\u0010%\u001a\u0004\b.\u0010\u0019R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b/\u0010\u0019R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b+\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u000f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b.\u0010(\u001a\u0004\b'\u0010\u001bR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b/\u0010%\u001a\u0004\b$\u0010\u0019R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b1\u0010%\u001a\u0004\b*\u0010\u0019R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b&\u0010%\u001a\u0004\b \u0010\u0019R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b3\u0010%\u001a\u0004\b3\u0010\u0019¨\u00064"}, d2 = {"Lcom/meijer/mobile/receipt/service/api/models/DigitalReceiptJson;", "", "", "receiptId", "", "transactionDate", "", "storeId", "storeName", "storeAddress", "storeCity", "storeState", "storeZipCodeValidator", "", "totalSpent", "numberOfItems", "laneNumber", "processingStatus", "homeDeliveryUrl", "transactionType", "<init>", "(JLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(JLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/receipt/service/api/models/DigitalReceiptJson;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "e", "()J", "b", "Ljava/lang/String;", "m", "c", "I", "h", "d", "i", "f", "g", "j", "k", "D", "l", "()D", "n", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DigitalReceiptJson {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long receiptId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String transactionDate;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int storeId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String storeName;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String storeAddress;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String storeCity;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String storeState;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String storeZipCodeValidator;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final double totalSpent;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final int numberOfItems;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String laneNumber;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final String processingStatus;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final String homeDeliveryUrl;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final String transactionType;

    public DigitalReceiptJson() {
        this(0L, null, 0, null, null, null, null, null, 0.0d, 0, null, null, null, null, 16383, null);
    }

    public final DigitalReceiptJson copy(@g(name = "receiptId") long receiptId, @g(name = "transactionDate") String transactionDate, @g(name = "storeId") int storeId, @g(name = "storeName") String storeName, @g(name = "storeAddress") String storeAddress, @g(name = "storeCity") String storeCity, @g(name = "storeState") String storeState, @g(name = "storeZipCode") String storeZipCodeValidator, @g(name = "totalSpent") double totalSpent, @g(name = "numberOfItems") int numberOfItems, @g(name = "laneNumber") String laneNumber, @g(name = "processingStatus") String processingStatus, @g(name = "homeDeliveryUrl") String homeDeliveryUrl, @g(name = "transactionType") String transactionType) {
        Intrinsics.j(transactionDate, "transactionDate");
        return new DigitalReceiptJson(receiptId, transactionDate, storeId, storeName, storeAddress, storeCity, storeState, storeZipCodeValidator, totalSpent, numberOfItems, laneNumber, processingStatus, homeDeliveryUrl, transactionType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DigitalReceiptJson)) {
            return false;
        }
        DigitalReceiptJson digitalReceiptJson = (DigitalReceiptJson) other;
        return this.receiptId == digitalReceiptJson.receiptId && Intrinsics.e(this.transactionDate, digitalReceiptJson.transactionDate) && this.storeId == digitalReceiptJson.storeId && Intrinsics.e(this.storeName, digitalReceiptJson.storeName) && Intrinsics.e(this.storeAddress, digitalReceiptJson.storeAddress) && Intrinsics.e(this.storeCity, digitalReceiptJson.storeCity) && Intrinsics.e(this.storeState, digitalReceiptJson.storeState) && Intrinsics.e(this.storeZipCodeValidator, digitalReceiptJson.storeZipCodeValidator) && Double.compare(this.totalSpent, digitalReceiptJson.totalSpent) == 0 && this.numberOfItems == digitalReceiptJson.numberOfItems && Intrinsics.e(this.laneNumber, digitalReceiptJson.laneNumber) && Intrinsics.e(this.processingStatus, digitalReceiptJson.processingStatus) && Intrinsics.e(this.homeDeliveryUrl, digitalReceiptJson.homeDeliveryUrl) && Intrinsics.e(this.transactionType, digitalReceiptJson.transactionType);
    }

    public int hashCode() {
        int iHashCode = ((((Long.hashCode(this.receiptId) * 31) + this.transactionDate.hashCode()) * 31) + Integer.hashCode(this.storeId)) * 31;
        String str = this.storeName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.storeAddress;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.storeCity;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.storeState;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.storeZipCodeValidator;
        int iHashCode6 = (((((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + Double.hashCode(this.totalSpent)) * 31) + Integer.hashCode(this.numberOfItems)) * 31;
        String str6 = this.laneNumber;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.processingStatus;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.homeDeliveryUrl;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.transactionType;
        return iHashCode9 + (str9 != null ? str9.hashCode() : 0);
    }

    public String toString() {
        return "DigitalReceiptJson(receiptId=" + this.receiptId + ", transactionDate=" + this.transactionDate + ", storeId=" + this.storeId + ", storeName=" + this.storeName + ", storeAddress=" + this.storeAddress + ", storeCity=" + this.storeCity + ", storeState=" + this.storeState + ", storeZipCodeValidator=" + this.storeZipCodeValidator + ", totalSpent=" + this.totalSpent + ", numberOfItems=" + this.numberOfItems + ", laneNumber=" + this.laneNumber + ", processingStatus=" + this.processingStatus + ", homeDeliveryUrl=" + this.homeDeliveryUrl + ", transactionType=" + this.transactionType + ')';
    }

    public DigitalReceiptJson(@g(name = "receiptId") long j10, @g(name = "transactionDate") String transactionDate, @g(name = "storeId") int i10, @g(name = "storeName") String str, @g(name = "storeAddress") String str2, @g(name = "storeCity") String str3, @g(name = "storeState") String str4, @g(name = "storeZipCode") String str5, @g(name = "totalSpent") double d10, @g(name = "numberOfItems") int i11, @g(name = "laneNumber") String str6, @g(name = "processingStatus") String str7, @g(name = "homeDeliveryUrl") String str8, @g(name = "transactionType") String str9) {
        Intrinsics.j(transactionDate, "transactionDate");
        this.receiptId = j10;
        this.transactionDate = transactionDate;
        this.storeId = i10;
        this.storeName = str;
        this.storeAddress = str2;
        this.storeCity = str3;
        this.storeState = str4;
        this.storeZipCodeValidator = str5;
        this.totalSpent = d10;
        this.numberOfItems = i11;
        this.laneNumber = str6;
        this.processingStatus = str7;
        this.homeDeliveryUrl = str8;
        this.transactionType = str9;
    }

    /* renamed from: a, reason: from getter */
    public final String getHomeDeliveryUrl() {
        return this.homeDeliveryUrl;
    }

    /* renamed from: b, reason: from getter */
    public final String getLaneNumber() {
        return this.laneNumber;
    }

    /* renamed from: c, reason: from getter */
    public final int getNumberOfItems() {
        return this.numberOfItems;
    }

    /* renamed from: d, reason: from getter */
    public final String getProcessingStatus() {
        return this.processingStatus;
    }

    /* renamed from: e, reason: from getter */
    public final long getReceiptId() {
        return this.receiptId;
    }

    /* renamed from: f, reason: from getter */
    public final String getStoreAddress() {
        return this.storeAddress;
    }

    /* renamed from: g, reason: from getter */
    public final String getStoreCity() {
        return this.storeCity;
    }

    /* renamed from: h, reason: from getter */
    public final int getStoreId() {
        return this.storeId;
    }

    /* renamed from: i, reason: from getter */
    public final String getStoreName() {
        return this.storeName;
    }

    /* renamed from: j, reason: from getter */
    public final String getStoreState() {
        return this.storeState;
    }

    /* renamed from: k, reason: from getter */
    public final String getStoreZipCodeValidator() {
        return this.storeZipCodeValidator;
    }

    /* renamed from: l, reason: from getter */
    public final double getTotalSpent() {
        return this.totalSpent;
    }

    /* renamed from: m, reason: from getter */
    public final String getTransactionDate() {
        return this.transactionDate;
    }

    /* renamed from: n, reason: from getter */
    public final String getTransactionType() {
        return this.transactionType;
    }

    public /* synthetic */ DigitalReceiptJson(long j10, String str, int i10, String str2, String str3, String str4, String str5, String str6, double d10, int i11, String str7, String str8, String str9, String str10, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0L : j10, (i12 & 2) != 0 ? LocalDateTime.MIN.format(C17590a.ISO_LOCAL_DATE_TIME) : str, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? null : str2, (i12 & 16) != 0 ? null : str3, (i12 & 32) != 0 ? null : str4, (i12 & 64) != 0 ? null : str5, (i12 & 128) != 0 ? null : str6, (i12 & 256) != 0 ? 0.0d : d10, (i12 & 512) == 0 ? i11 : 0, (i12 & 1024) != 0 ? null : str7, (i12 & RecyclerView.m.FLAG_MOVED) != 0 ? null : str8, (i12 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : str9, (i12 & 8192) != 0 ? null : str10);
    }
}
