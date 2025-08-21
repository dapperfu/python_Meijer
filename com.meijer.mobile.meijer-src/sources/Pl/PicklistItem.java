package Pl;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b\u001c\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\u0019\u0010\u000e¨\u0006\""}, d2 = {"LPl/d;", "", "", "", "pluList", "description", "customerFacingDescription", "", "quantityRequired", "weightRequired", "imageUrl", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Ljava/lang/String;", "getDescription", "d", "Z", "getQuantityRequired", "()Z", "e", "f", "greenville_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Pl.d, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class PicklistItem {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> pluList;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String customerFacingDescription;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean quantityRequired;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean weightRequired;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String imageUrl;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PicklistItem)) {
            return false;
        }
        PicklistItem picklistItem = (PicklistItem) other;
        return Intrinsics.e(this.pluList, picklistItem.pluList) && Intrinsics.e(this.description, picklistItem.description) && Intrinsics.e(this.customerFacingDescription, picklistItem.customerFacingDescription) && this.quantityRequired == picklistItem.quantityRequired && this.weightRequired == picklistItem.weightRequired && Intrinsics.e(this.imageUrl, picklistItem.imageUrl);
    }

    public PicklistItem(List<String> pluList, String description, String customerFacingDescription, boolean z10, boolean z11, String str) {
        Intrinsics.j(pluList, "pluList");
        Intrinsics.j(description, "description");
        Intrinsics.j(customerFacingDescription, "customerFacingDescription");
        this.pluList = pluList;
        this.description = description;
        this.customerFacingDescription = customerFacingDescription;
        this.quantityRequired = z10;
        this.weightRequired = z11;
        this.imageUrl = str;
    }

    /* renamed from: a, reason: from getter */
    public final String getCustomerFacingDescription() {
        return this.customerFacingDescription;
    }

    /* renamed from: b, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final List<String> c() {
        return this.pluList;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getWeightRequired() {
        return this.weightRequired;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.pluList.hashCode() * 31) + this.description.hashCode()) * 31) + this.customerFacingDescription.hashCode()) * 31) + Boolean.hashCode(this.quantityRequired)) * 31) + Boolean.hashCode(this.weightRequired)) * 31;
        String str = this.imageUrl;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "PicklistItem(pluList=" + this.pluList + ", description=" + this.description + ", customerFacingDescription=" + this.customerFacingDescription + ", quantityRequired=" + this.quantityRequired + ", weightRequired=" + this.weightRequired + ", imageUrl=" + this.imageUrl + ')';
    }
}
