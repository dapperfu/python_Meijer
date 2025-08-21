package com.meijer.mobile.greenville.model.response.picklist;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\n\u001a\u00020\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\f\u001a\u00020\b\u0012\u000e\b\u0001\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010Jv\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\n\u001a\u00020\b2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\f\u001a\u00020\b2\u000e\b\u0003\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001a\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b \u0010\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b%\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b\u001d\u0010\u0014R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010#R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b$\u0010(¨\u0006)"}, d2 = {"Lcom/meijer/mobile/greenville/model/response/picklist/PicklistItemResponse;", "", "", "plu", "itemDescription", "customerFacingDescription", "", "tareCode", "", "quantityRequired", "weightRequired", "imageURL", "isAddedManual", "", "relatedPluList", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZZLjava/lang/String;ZLjava/util/List;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZZLjava/lang/String;ZLjava/util/List;)Lcom/meijer/mobile/greenville/model/response/picklist/PicklistItemResponse;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "c", "I", "g", "e", "Z", "()Z", "f", "h", "i", "Ljava/util/List;", "()Ljava/util/List;", "greenville_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class PicklistItemResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String plu;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String itemDescription;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String customerFacingDescription;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int tareCode;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean quantityRequired;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean weightRequired;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String imageURL;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAddedManual;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> relatedPluList;

    public final PicklistItemResponse copy(@g(name = "plu") String plu, @g(name = "itemDescription") String itemDescription, @g(name = "customerFacingDescription") String customerFacingDescription, @g(name = "tareCode") int tareCode, @g(name = "quantityRequired") boolean quantityRequired, @g(name = "weightRequired") boolean weightRequired, @g(name = "imageURL") String imageURL, @g(name = "isAddedManual") boolean isAddedManual, @g(name = "relatedPlus") List<String> relatedPluList) {
        Intrinsics.j(plu, "plu");
        Intrinsics.j(relatedPluList, "relatedPluList");
        return new PicklistItemResponse(plu, itemDescription, customerFacingDescription, tareCode, quantityRequired, weightRequired, imageURL, isAddedManual, relatedPluList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PicklistItemResponse)) {
            return false;
        }
        PicklistItemResponse picklistItemResponse = (PicklistItemResponse) other;
        return Intrinsics.e(this.plu, picklistItemResponse.plu) && Intrinsics.e(this.itemDescription, picklistItemResponse.itemDescription) && Intrinsics.e(this.customerFacingDescription, picklistItemResponse.customerFacingDescription) && this.tareCode == picklistItemResponse.tareCode && this.quantityRequired == picklistItemResponse.quantityRequired && this.weightRequired == picklistItemResponse.weightRequired && Intrinsics.e(this.imageURL, picklistItemResponse.imageURL) && this.isAddedManual == picklistItemResponse.isAddedManual && Intrinsics.e(this.relatedPluList, picklistItemResponse.relatedPluList);
    }

    public int hashCode() {
        int iHashCode = this.plu.hashCode() * 31;
        String str = this.itemDescription;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.customerFacingDescription;
        int iHashCode3 = (((((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.tareCode)) * 31) + Boolean.hashCode(this.quantityRequired)) * 31) + Boolean.hashCode(this.weightRequired)) * 31;
        String str3 = this.imageURL;
        return ((((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + Boolean.hashCode(this.isAddedManual)) * 31) + this.relatedPluList.hashCode();
    }

    public String toString() {
        return "PicklistItemResponse(plu=" + this.plu + ", itemDescription=" + this.itemDescription + ", customerFacingDescription=" + this.customerFacingDescription + ", tareCode=" + this.tareCode + ", quantityRequired=" + this.quantityRequired + ", weightRequired=" + this.weightRequired + ", imageURL=" + this.imageURL + ", isAddedManual=" + this.isAddedManual + ", relatedPluList=" + this.relatedPluList + ')';
    }

    public PicklistItemResponse(@g(name = "plu") String plu, @g(name = "itemDescription") String str, @g(name = "customerFacingDescription") String str2, @g(name = "tareCode") int i10, @g(name = "quantityRequired") boolean z10, @g(name = "weightRequired") boolean z11, @g(name = "imageURL") String str3, @g(name = "isAddedManual") boolean z12, @g(name = "relatedPlus") List<String> relatedPluList) {
        Intrinsics.j(plu, "plu");
        Intrinsics.j(relatedPluList, "relatedPluList");
        this.plu = plu;
        this.itemDescription = str;
        this.customerFacingDescription = str2;
        this.tareCode = i10;
        this.quantityRequired = z10;
        this.weightRequired = z11;
        this.imageURL = str3;
        this.isAddedManual = z12;
        this.relatedPluList = relatedPluList;
    }

    /* renamed from: a, reason: from getter */
    public final String getCustomerFacingDescription() {
        return this.customerFacingDescription;
    }

    /* renamed from: b, reason: from getter */
    public final String getImageURL() {
        return this.imageURL;
    }

    /* renamed from: c, reason: from getter */
    public final String getItemDescription() {
        return this.itemDescription;
    }

    /* renamed from: d, reason: from getter */
    public final String getPlu() {
        return this.plu;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getQuantityRequired() {
        return this.quantityRequired;
    }

    public final List<String> f() {
        return this.relatedPluList;
    }

    /* renamed from: g, reason: from getter */
    public final int getTareCode() {
        return this.tareCode;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getWeightRequired() {
        return this.weightRequired;
    }

    /* renamed from: i, reason: from getter */
    public final boolean getIsAddedManual() {
        return this.isAddedManual;
    }
}
