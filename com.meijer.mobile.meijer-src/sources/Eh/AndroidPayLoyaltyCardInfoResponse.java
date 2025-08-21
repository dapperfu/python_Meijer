package Eh;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0016\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u0019\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u000eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001b\u0010\u000eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u000eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001e\u0010\u000e¨\u0006\u001f"}, d2 = {"LEh/f;", "", "", "barcodeType", "barcodeValue", "accountID", "accountName", "objectID", "classID", "issuerName", "programName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "d", "e", "g", "f", "h", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Eh.f, reason: case insensitive filesystem and from toString */
/* loaded from: classes8.dex */
public final /* data */ class AndroidPayLoyaltyCardInfoResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String barcodeType;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String barcodeValue;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String accountID;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String accountName;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String objectID;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String classID;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String issuerName;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String programName;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AndroidPayLoyaltyCardInfoResponse)) {
            return false;
        }
        AndroidPayLoyaltyCardInfoResponse androidPayLoyaltyCardInfoResponse = (AndroidPayLoyaltyCardInfoResponse) other;
        return Intrinsics.e(this.barcodeType, androidPayLoyaltyCardInfoResponse.barcodeType) && Intrinsics.e(this.barcodeValue, androidPayLoyaltyCardInfoResponse.barcodeValue) && Intrinsics.e(this.accountID, androidPayLoyaltyCardInfoResponse.accountID) && Intrinsics.e(this.accountName, androidPayLoyaltyCardInfoResponse.accountName) && Intrinsics.e(this.objectID, androidPayLoyaltyCardInfoResponse.objectID) && Intrinsics.e(this.classID, androidPayLoyaltyCardInfoResponse.classID) && Intrinsics.e(this.issuerName, androidPayLoyaltyCardInfoResponse.issuerName) && Intrinsics.e(this.programName, androidPayLoyaltyCardInfoResponse.programName);
    }

    /* renamed from: a, reason: from getter */
    public final String getAccountID() {
        return this.accountID;
    }

    /* renamed from: b, reason: from getter */
    public final String getAccountName() {
        return this.accountName;
    }

    /* renamed from: c, reason: from getter */
    public final String getBarcodeType() {
        return this.barcodeType;
    }

    /* renamed from: d, reason: from getter */
    public final String getBarcodeValue() {
        return this.barcodeValue;
    }

    /* renamed from: e, reason: from getter */
    public final String getClassID() {
        return this.classID;
    }

    /* renamed from: f, reason: from getter */
    public final String getIssuerName() {
        return this.issuerName;
    }

    /* renamed from: g, reason: from getter */
    public final String getObjectID() {
        return this.objectID;
    }

    /* renamed from: h, reason: from getter */
    public final String getProgramName() {
        return this.programName;
    }

    public int hashCode() {
        String str = this.barcodeType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.barcodeValue;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.accountID;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.accountName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.objectID;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.classID;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.issuerName;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.programName;
        return iHashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    public String toString() {
        return "AndroidPayLoyaltyCardInfoResponse(barcodeType=" + this.barcodeType + ", barcodeValue=" + this.barcodeValue + ", accountID=" + this.accountID + ", accountName=" + this.accountName + ", objectID=" + this.objectID + ", classID=" + this.classID + ", issuerName=" + this.issuerName + ", programName=" + this.programName + ')';
    }

    public AndroidPayLoyaltyCardInfoResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.barcodeType = str;
        this.barcodeValue = str2;
        this.accountID = str3;
        this.accountName = str4;
        this.objectID = str5;
        this.classID = str6;
        this.issuerName = str7;
        this.programName = str8;
    }
}
