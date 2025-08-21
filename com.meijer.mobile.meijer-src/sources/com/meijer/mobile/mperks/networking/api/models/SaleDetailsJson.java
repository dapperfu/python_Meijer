package com.meijer.mobile.mperks.networking.api.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ@\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0017\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0018\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0014\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/mperks/networking/api/models/SaleDetailsJson;", "", "", "saleId", "partner", "partnerOrderId", "digitalOrderId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/mperks/networking/api/models/SaleDetailsJson;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "c", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class SaleDetailsJson {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String saleId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String partner;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String partnerOrderId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String digitalOrderId;

    public SaleDetailsJson() {
        this(null, null, null, null, 15, null);
    }

    public final SaleDetailsJson copy(@g(name = "saleId") String saleId, @g(name = "partner") String partner, @g(name = "partnerOrderId") String partnerOrderId, @g(name = "digitalOrderId") String digitalOrderId) {
        return new SaleDetailsJson(saleId, partner, partnerOrderId, digitalOrderId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SaleDetailsJson)) {
            return false;
        }
        SaleDetailsJson saleDetailsJson = (SaleDetailsJson) other;
        return Intrinsics.e(this.saleId, saleDetailsJson.saleId) && Intrinsics.e(this.partner, saleDetailsJson.partner) && Intrinsics.e(this.partnerOrderId, saleDetailsJson.partnerOrderId) && Intrinsics.e(this.digitalOrderId, saleDetailsJson.digitalOrderId);
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
        return "SaleDetailsJson(saleId=" + this.saleId + ", partner=" + this.partner + ", partnerOrderId=" + this.partnerOrderId + ", digitalOrderId=" + this.digitalOrderId + ')';
    }

    public SaleDetailsJson(@g(name = "saleId") String str, @g(name = "partner") String str2, @g(name = "partnerOrderId") String str3, @g(name = "digitalOrderId") String str4) {
        this.saleId = str;
        this.partner = str2;
        this.partnerOrderId = str3;
        this.digitalOrderId = str4;
    }

    /* renamed from: a, reason: from getter */
    public final String getDigitalOrderId() {
        return this.digitalOrderId;
    }

    /* renamed from: b, reason: from getter */
    public final String getPartner() {
        return this.partner;
    }

    /* renamed from: c, reason: from getter */
    public final String getPartnerOrderId() {
        return this.partnerOrderId;
    }

    /* renamed from: d, reason: from getter */
    public final String getSaleId() {
        return this.saleId;
    }

    public /* synthetic */ SaleDetailsJson(String str, String str2, String str3, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4);
    }
}
