package com.meijer.mobile.accounts.service.models.network;

import com.medallia.digital.mobilesdk.l3;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJp\u0010\r\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u0018\u0010\u0010R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001b\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u0010R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b\u001d\u0010\u0010R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u0010R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b \u0010\u0010¨\u0006!"}, d2 = {"Lcom/meijer/mobile/accounts/service/models/network/AndroidPayLoyaltyCardInfoResponseJson;", "", "", "barcodeType", "barcodeValue", "accountID", "accountName", "objectID", "classID", "issuerName", "programName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/accounts/service/models/network/AndroidPayLoyaltyCardInfoResponseJson;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "d", "e", "g", "f", "h", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AndroidPayLoyaltyCardInfoResponseJson {

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

    public AndroidPayLoyaltyCardInfoResponseJson() {
        this(null, null, null, null, null, null, null, null, l3.f92484c, null);
    }

    public final AndroidPayLoyaltyCardInfoResponseJson copy(@g(name = "barcodeType") String barcodeType, @g(name = "barcodeValue") String barcodeValue, @g(name = "accountID") String accountID, @g(name = "name") String accountName, @g(name = "objectID") String objectID, @g(name = "classID") String classID, @g(name = "issuerName") String issuerName, @g(name = "programName") String programName) {
        return new AndroidPayLoyaltyCardInfoResponseJson(barcodeType, barcodeValue, accountID, accountName, objectID, classID, issuerName, programName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AndroidPayLoyaltyCardInfoResponseJson)) {
            return false;
        }
        AndroidPayLoyaltyCardInfoResponseJson androidPayLoyaltyCardInfoResponseJson = (AndroidPayLoyaltyCardInfoResponseJson) other;
        return Intrinsics.e(this.barcodeType, androidPayLoyaltyCardInfoResponseJson.barcodeType) && Intrinsics.e(this.barcodeValue, androidPayLoyaltyCardInfoResponseJson.barcodeValue) && Intrinsics.e(this.accountID, androidPayLoyaltyCardInfoResponseJson.accountID) && Intrinsics.e(this.accountName, androidPayLoyaltyCardInfoResponseJson.accountName) && Intrinsics.e(this.objectID, androidPayLoyaltyCardInfoResponseJson.objectID) && Intrinsics.e(this.classID, androidPayLoyaltyCardInfoResponseJson.classID) && Intrinsics.e(this.issuerName, androidPayLoyaltyCardInfoResponseJson.issuerName) && Intrinsics.e(this.programName, androidPayLoyaltyCardInfoResponseJson.programName);
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
        return "AndroidPayLoyaltyCardInfoResponseJson(barcodeType=" + this.barcodeType + ", barcodeValue=" + this.barcodeValue + ", accountID=" + this.accountID + ", accountName=" + this.accountName + ", objectID=" + this.objectID + ", classID=" + this.classID + ", issuerName=" + this.issuerName + ", programName=" + this.programName + ')';
    }

    public AndroidPayLoyaltyCardInfoResponseJson(@g(name = "barcodeType") String str, @g(name = "barcodeValue") String str2, @g(name = "accountID") String str3, @g(name = "name") String str4, @g(name = "objectID") String str5, @g(name = "classID") String str6, @g(name = "issuerName") String str7, @g(name = "programName") String str8) {
        this.barcodeType = str;
        this.barcodeValue = str2;
        this.accountID = str3;
        this.accountName = str4;
        this.objectID = str5;
        this.classID = str6;
        this.issuerName = str7;
        this.programName = str8;
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

    public /* synthetic */ AndroidPayLoyaltyCardInfoResponseJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? null : str7, (i10 & 128) != 0 ? null : str8);
    }
}
