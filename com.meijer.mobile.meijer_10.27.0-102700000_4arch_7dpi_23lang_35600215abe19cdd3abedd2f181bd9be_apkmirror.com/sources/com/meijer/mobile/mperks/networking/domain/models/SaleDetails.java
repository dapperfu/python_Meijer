package com.meijer.mobile.mperks.networking.domain.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/mperks/networking/domain/models/SaleDetails;", "", "saleId", "", "partner", "partnerOrderId", "digitalOrderId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSaleId", "()Ljava/lang/String;", "getPartner", "getPartnerOrderId", "getDigitalOrderId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class SaleDetails {
    private final String digitalOrderId;
    private final String partner;
    private final String partnerOrderId;
    private final String saleId;

    public SaleDetails() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ SaleDetails copy$default(SaleDetails saleDetails, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = saleDetails.saleId;
        }
        if ((i10 & 2) != 0) {
            str2 = saleDetails.partner;
        }
        if ((i10 & 4) != 0) {
            str3 = saleDetails.partnerOrderId;
        }
        if ((i10 & 8) != 0) {
            str4 = saleDetails.digitalOrderId;
        }
        return saleDetails.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSaleId() {
        return this.saleId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPartner() {
        return this.partner;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPartnerOrderId() {
        return this.partnerOrderId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDigitalOrderId() {
        return this.digitalOrderId;
    }

    public final SaleDetails copy(@g(name = "saleId") String saleId, @g(name = "partner") String partner, @g(name = "partnerOrderId") String partnerOrderId, @g(name = "digitalOrderId") String digitalOrderId) {
        return new SaleDetails(saleId, partner, partnerOrderId, digitalOrderId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SaleDetails)) {
            return false;
        }
        SaleDetails saleDetails = (SaleDetails) other;
        return Intrinsics.e(this.saleId, saleDetails.saleId) && Intrinsics.e(this.partner, saleDetails.partner) && Intrinsics.e(this.partnerOrderId, saleDetails.partnerOrderId) && Intrinsics.e(this.digitalOrderId, saleDetails.digitalOrderId);
    }

    public int hashCode() {
        String str = this.saleId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.partner;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.partnerOrderId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.digitalOrderId;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "SaleDetails(saleId=" + this.saleId + ", partner=" + this.partner + ", partnerOrderId=" + this.partnerOrderId + ", digitalOrderId=" + this.digitalOrderId + ')';
    }

    public SaleDetails(@g(name = "saleId") String str, @g(name = "partner") String str2, @g(name = "partnerOrderId") String str3, @g(name = "digitalOrderId") String str4) {
        this.saleId = str;
        this.partner = str2;
        this.partnerOrderId = str3;
        this.digitalOrderId = str4;
    }

    public final String getDigitalOrderId() {
        return this.digitalOrderId;
    }

    public final String getPartner() {
        return this.partner;
    }

    public final String getPartnerOrderId() {
        return this.partnerOrderId;
    }

    public final String getSaleId() {
        return this.saleId;
    }

    public /* synthetic */ SaleDetails(String str, String str2, String str3, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4);
    }
}
