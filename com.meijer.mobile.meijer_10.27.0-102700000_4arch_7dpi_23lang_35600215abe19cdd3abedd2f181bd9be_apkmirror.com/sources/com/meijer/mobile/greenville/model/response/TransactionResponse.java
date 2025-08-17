package com.meijer.mobile.greenville.model.response;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJR\u0010\u000f\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010%\u001a\u0004\b\u001e\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b \u0010'\u001a\u0004\b\u001a\u0010\u0012¨\u0006("}, d2 = {"Lcom/meijer/mobile/greenville/model/response/TransactionResponse;", "", "Lcom/meijer/mobile/greenville/model/response/TransactionHeaderResponse;", "transactionHeader", "Lcom/meijer/mobile/greenville/model/response/TransactionObjectResponse;", "transactionObject", "", "Lcom/meijer/mobile/greenville/model/response/SpecialItemResponse;", "specialItems", "Lcom/meijer/mobile/greenville/model/response/RejectedBarcodeResponse;", "rejectedBarcode", "", "error", "<init>", "(Lcom/meijer/mobile/greenville/model/response/TransactionHeaderResponse;Lcom/meijer/mobile/greenville/model/response/TransactionObjectResponse;Ljava/util/List;Lcom/meijer/mobile/greenville/model/response/RejectedBarcodeResponse;Ljava/lang/String;)V", "copy", "(Lcom/meijer/mobile/greenville/model/response/TransactionHeaderResponse;Lcom/meijer/mobile/greenville/model/response/TransactionObjectResponse;Ljava/util/List;Lcom/meijer/mobile/greenville/model/response/RejectedBarcodeResponse;Ljava/lang/String;)Lcom/meijer/mobile/greenville/model/response/TransactionResponse;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/greenville/model/response/TransactionHeaderResponse;", "d", "()Lcom/meijer/mobile/greenville/model/response/TransactionHeaderResponse;", "b", "Lcom/meijer/mobile/greenville/model/response/TransactionObjectResponse;", "e", "()Lcom/meijer/mobile/greenville/model/response/TransactionObjectResponse;", "c", "Ljava/util/List;", "()Ljava/util/List;", "Lcom/meijer/mobile/greenville/model/response/RejectedBarcodeResponse;", "()Lcom/meijer/mobile/greenville/model/response/RejectedBarcodeResponse;", "Ljava/lang/String;", "greenville_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class TransactionResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final TransactionHeaderResponse transactionHeader;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final TransactionObjectResponse transactionObject;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<SpecialItemResponse> specialItems;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final RejectedBarcodeResponse rejectedBarcode;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String error;

    public TransactionResponse() {
        this(null, null, null, null, null, 31, null);
    }

    public final TransactionResponse copy(@g(name = "transactionHeader") TransactionHeaderResponse transactionHeader, @g(name = "transactionObject") TransactionObjectResponse transactionObject, @g(name = "specialItems") List<SpecialItemResponse> specialItems, @g(name = "customerMessage") RejectedBarcodeResponse rejectedBarcode, @g(name = "error") String error) {
        return new TransactionResponse(transactionHeader, transactionObject, specialItems, rejectedBarcode, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionResponse)) {
            return false;
        }
        TransactionResponse transactionResponse = (TransactionResponse) other;
        return Intrinsics.e(this.transactionHeader, transactionResponse.transactionHeader) && Intrinsics.e(this.transactionObject, transactionResponse.transactionObject) && Intrinsics.e(this.specialItems, transactionResponse.specialItems) && Intrinsics.e(this.rejectedBarcode, transactionResponse.rejectedBarcode) && Intrinsics.e(this.error, transactionResponse.error);
    }

    public int hashCode() {
        TransactionHeaderResponse transactionHeaderResponse = this.transactionHeader;
        int iHashCode = (transactionHeaderResponse == null ? 0 : transactionHeaderResponse.hashCode()) * 31;
        TransactionObjectResponse transactionObjectResponse = this.transactionObject;
        int iHashCode2 = (iHashCode + (transactionObjectResponse == null ? 0 : transactionObjectResponse.hashCode())) * 31;
        List<SpecialItemResponse> list = this.specialItems;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        RejectedBarcodeResponse rejectedBarcodeResponse = this.rejectedBarcode;
        int iHashCode4 = (iHashCode3 + (rejectedBarcodeResponse == null ? 0 : rejectedBarcodeResponse.hashCode())) * 31;
        String str = this.error;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "TransactionResponse(transactionHeader=" + this.transactionHeader + ", transactionObject=" + this.transactionObject + ", specialItems=" + this.specialItems + ", rejectedBarcode=" + this.rejectedBarcode + ", error=" + this.error + ')';
    }

    public TransactionResponse(@g(name = "transactionHeader") TransactionHeaderResponse transactionHeaderResponse, @g(name = "transactionObject") TransactionObjectResponse transactionObjectResponse, @g(name = "specialItems") List<SpecialItemResponse> list, @g(name = "customerMessage") RejectedBarcodeResponse rejectedBarcodeResponse, @g(name = "error") String str) {
        this.transactionHeader = transactionHeaderResponse;
        this.transactionObject = transactionObjectResponse;
        this.specialItems = list;
        this.rejectedBarcode = rejectedBarcodeResponse;
        this.error = str;
    }

    /* renamed from: a, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: b, reason: from getter */
    public final RejectedBarcodeResponse getRejectedBarcode() {
        return this.rejectedBarcode;
    }

    public final List<SpecialItemResponse> c() {
        return this.specialItems;
    }

    /* renamed from: d, reason: from getter */
    public final TransactionHeaderResponse getTransactionHeader() {
        return this.transactionHeader;
    }

    /* renamed from: e, reason: from getter */
    public final TransactionObjectResponse getTransactionObject() {
        return this.transactionObject;
    }

    public /* synthetic */ TransactionResponse(TransactionHeaderResponse transactionHeaderResponse, TransactionObjectResponse transactionObjectResponse, List list, RejectedBarcodeResponse rejectedBarcodeResponse, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : transactionHeaderResponse, (i10 & 2) != 0 ? null : transactionObjectResponse, (i10 & 4) != 0 ? null : list, (i10 & 8) != 0 ? null : rejectedBarcodeResponse, (i10 & 16) != 0 ? null : str);
    }
}
