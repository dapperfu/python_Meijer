package com.meijer.mobile.mperks.networking.domain.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/meijer/mobile/mperks/networking/domain/models/AdjustmentDetails;", "", "saleId", "", "partner", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getSaleId", "()Ljava/lang/String;", "getPartner", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class AdjustmentDetails {
    private final String partner;
    private final String saleId;

    /* JADX WARN: Multi-variable type inference failed */
    public AdjustmentDetails() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AdjustmentDetails copy$default(AdjustmentDetails adjustmentDetails, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = adjustmentDetails.saleId;
        }
        if ((i10 & 2) != 0) {
            str2 = adjustmentDetails.partner;
        }
        return adjustmentDetails.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSaleId() {
        return this.saleId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPartner() {
        return this.partner;
    }

    public final AdjustmentDetails copy(@g(name = "comments") String saleId, @g(name = "createdBy") String partner) {
        return new AdjustmentDetails(saleId, partner);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdjustmentDetails)) {
            return false;
        }
        AdjustmentDetails adjustmentDetails = (AdjustmentDetails) other;
        return Intrinsics.e(this.saleId, adjustmentDetails.saleId) && Intrinsics.e(this.partner, adjustmentDetails.partner);
    }

    public int hashCode() {
        String str = this.saleId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.partner;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "AdjustmentDetails(saleId=" + this.saleId + ", partner=" + this.partner + ')';
    }

    public AdjustmentDetails(@g(name = "comments") String str, @g(name = "createdBy") String str2) {
        this.saleId = str;
        this.partner = str2;
    }

    public final String getPartner() {
        return this.partner;
    }

    public final String getSaleId() {
        return this.saleId;
    }

    public /* synthetic */ AdjustmentDetails(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }
}
