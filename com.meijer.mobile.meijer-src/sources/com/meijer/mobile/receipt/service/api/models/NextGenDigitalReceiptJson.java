package com.meijer.mobile.receipt.service.api.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import io.constructor.data.local.PreferencesHelper;
import j$.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import wk.C17898a;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\r\u001a\u00020\f\u0012\b\b\u0003\u0010\u000e\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u008c\u0001\u0010\u0012\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\r\u001a\u00020\f2\b\b\u0003\u0010\u000e\u001a\u00020\u00052\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u001f\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u0015R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001d\u001a\u0004\b#\u0010\u0015R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b%\u0010\u0015R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b&\u0010\u0015R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010\u0015R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u000e\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b)\u0010!\u001a\u0004\b\u001e\u0010\u0017R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u0015¨\u0006+"}, d2 = {"Lcom/meijer/mobile/receipt/service/api/models/NextGenDigitalReceiptJson;", "", "", "nextgenReceiptId", "transactionDateTime", "", "storeId", "storeName", "storeAddress", "storeCity", "storeState", "storeZipCodeValidator", "", "totalSpent", "numberOfItems", "processingStatus", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DILjava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DILjava/lang/String;)Lcom/meijer/mobile/receipt/service/api/models/NextGenDigitalReceiptJson;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "k", "c", "I", "f", "d", "g", "e", "h", "i", "D", "j", "()D", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class NextGenDigitalReceiptJson {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String nextgenReceiptId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String transactionDateTime;

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
    private final String processingStatus;

    public NextGenDigitalReceiptJson() {
        this(null, null, 0, null, null, null, null, null, 0.0d, 0, null, 2047, null);
    }

    public final NextGenDigitalReceiptJson copy(@g(name = PreferencesHelper.PREF_ID) String nextgenReceiptId, @g(name = "transactionDateTime") String transactionDateTime, @g(name = "storeId") int storeId, @g(name = "storeName") String storeName, @g(name = "storeAddress") String storeAddress, @g(name = "storeCity") String storeCity, @g(name = "storeState") String storeState, @g(name = "storeZipCode") String storeZipCodeValidator, @g(name = "totalSpent") double totalSpent, @g(name = "numberOfItems") int numberOfItems, @g(name = "processingStatus") String processingStatus) {
        Intrinsics.j(transactionDateTime, "transactionDateTime");
        return new NextGenDigitalReceiptJson(nextgenReceiptId, transactionDateTime, storeId, storeName, storeAddress, storeCity, storeState, storeZipCodeValidator, totalSpent, numberOfItems, processingStatus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NextGenDigitalReceiptJson)) {
            return false;
        }
        NextGenDigitalReceiptJson nextGenDigitalReceiptJson = (NextGenDigitalReceiptJson) other;
        return Intrinsics.e(this.nextgenReceiptId, nextGenDigitalReceiptJson.nextgenReceiptId) && Intrinsics.e(this.transactionDateTime, nextGenDigitalReceiptJson.transactionDateTime) && this.storeId == nextGenDigitalReceiptJson.storeId && Intrinsics.e(this.storeName, nextGenDigitalReceiptJson.storeName) && Intrinsics.e(this.storeAddress, nextGenDigitalReceiptJson.storeAddress) && Intrinsics.e(this.storeCity, nextGenDigitalReceiptJson.storeCity) && Intrinsics.e(this.storeState, nextGenDigitalReceiptJson.storeState) && Intrinsics.e(this.storeZipCodeValidator, nextGenDigitalReceiptJson.storeZipCodeValidator) && Double.compare(this.totalSpent, nextGenDigitalReceiptJson.totalSpent) == 0 && this.numberOfItems == nextGenDigitalReceiptJson.numberOfItems && Intrinsics.e(this.processingStatus, nextGenDigitalReceiptJson.processingStatus);
    }

    public int hashCode() {
        String str = this.nextgenReceiptId;
        int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.transactionDateTime.hashCode()) * 31) + Integer.hashCode(this.storeId)) * 31;
        String str2 = this.storeName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.storeAddress;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.storeCity;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.storeState;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.storeZipCodeValidator;
        int iHashCode6 = (((((iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31) + Double.hashCode(this.totalSpent)) * 31) + Integer.hashCode(this.numberOfItems)) * 31;
        String str7 = this.processingStatus;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        return "NextGenDigitalReceiptJson(nextgenReceiptId=" + this.nextgenReceiptId + ", transactionDateTime=" + this.transactionDateTime + ", storeId=" + this.storeId + ", storeName=" + this.storeName + ", storeAddress=" + this.storeAddress + ", storeCity=" + this.storeCity + ", storeState=" + this.storeState + ", storeZipCodeValidator=" + this.storeZipCodeValidator + ", totalSpent=" + this.totalSpent + ", numberOfItems=" + this.numberOfItems + ", processingStatus=" + this.processingStatus + ')';
    }

    public NextGenDigitalReceiptJson(@g(name = PreferencesHelper.PREF_ID) String str, @g(name = "transactionDateTime") String transactionDateTime, @g(name = "storeId") int i10, @g(name = "storeName") String str2, @g(name = "storeAddress") String str3, @g(name = "storeCity") String str4, @g(name = "storeState") String str5, @g(name = "storeZipCode") String str6, @g(name = "totalSpent") double d10, @g(name = "numberOfItems") int i11, @g(name = "processingStatus") String str7) {
        Intrinsics.j(transactionDateTime, "transactionDateTime");
        this.nextgenReceiptId = str;
        this.transactionDateTime = transactionDateTime;
        this.storeId = i10;
        this.storeName = str2;
        this.storeAddress = str3;
        this.storeCity = str4;
        this.storeState = str5;
        this.storeZipCodeValidator = str6;
        this.totalSpent = d10;
        this.numberOfItems = i11;
        this.processingStatus = str7;
    }

    /* renamed from: a, reason: from getter */
    public final String getNextgenReceiptId() {
        return this.nextgenReceiptId;
    }

    /* renamed from: b, reason: from getter */
    public final int getNumberOfItems() {
        return this.numberOfItems;
    }

    /* renamed from: c, reason: from getter */
    public final String getProcessingStatus() {
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
    public final int getStoreId() {
        return this.storeId;
    }

    /* renamed from: g, reason: from getter */
    public final String getStoreName() {
        return this.storeName;
    }

    /* renamed from: h, reason: from getter */
    public final String getStoreState() {
        return this.storeState;
    }

    /* renamed from: i, reason: from getter */
    public final String getStoreZipCodeValidator() {
        return this.storeZipCodeValidator;
    }

    /* renamed from: j, reason: from getter */
    public final double getTotalSpent() {
        return this.totalSpent;
    }

    /* renamed from: k, reason: from getter */
    public final String getTransactionDateTime() {
        return this.transactionDateTime;
    }

    public /* synthetic */ NextGenDigitalReceiptJson(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, double d10, int i11, String str8, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? LocalDateTime.MIN.format(C17898a.ISO_LOCAL_DATE_TIME) : str2, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? null : str3, (i12 & 16) != 0 ? null : str4, (i12 & 32) != 0 ? null : str5, (i12 & 64) != 0 ? null : str6, (i12 & 128) != 0 ? null : str7, (i12 & 256) != 0 ? 0.0d : d10, (i12 & 512) == 0 ? i11 : 0, (i12 & 1024) != 0 ? null : str8);
    }
}
