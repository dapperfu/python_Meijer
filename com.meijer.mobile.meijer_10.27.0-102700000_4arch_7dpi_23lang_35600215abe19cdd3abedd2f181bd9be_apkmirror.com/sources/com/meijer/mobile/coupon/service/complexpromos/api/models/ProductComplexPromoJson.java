package com.meijer.mobile.coupon.service.complexpromos.api.models;

import com.medallia.digital.mobilesdk.l3;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import io.constructor.data.model.common.ResultData;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00020\u0001B[\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\t\u001a\u00020\b\u0012\b\b\u0003\u0010\n\u001a\u00020\b\u0012\u000e\b\u0003\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0003\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000f\u0010\u0010Jd\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\n\u001a\u00020\b2\u000e\b\u0003\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0003\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010%\u001a\u0004\b$\u0010'R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b!\u0010(\u001a\u0004\b\u001b\u0010)R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b&\u0010(\u001a\u0004\b\u001f\u0010)¨\u0006*"}, d2 = {"Lcom/meijer/mobile/coupon/service/complexpromos/api/models/ProductComplexPromoJson;", "", "", "promoId", "", "promoText", "", "promoBuyMinQty", "", "promoValue", "promoBuyMinSpend", "", "Lio/constructor/data/model/common/ResultData;", "buyProducts", "getProducts", "<init>", "(JLjava/lang/String;IDDLjava/util/List;Ljava/util/List;)V", "copy", "(JLjava/lang/String;IDDLjava/util/List;Ljava/util/List;)Lcom/meijer/mobile/coupon/service/complexpromos/api/models/ProductComplexPromoJson;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "e", "()J", "b", "Ljava/lang/String;", "f", "c", "I", "d", "D", "g", "()D", "Ljava/util/List;", "()Ljava/util/List;", "complexpromos_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ProductComplexPromoJson {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long promoId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String promoText;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int promoBuyMinQty;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final double promoValue;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final double promoBuyMinSpend;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ResultData> buyProducts;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ResultData> getProducts;

    public ProductComplexPromoJson() {
        this(0L, null, 0, 0.0d, 0.0d, null, null, l3.f92485d, null);
    }

    public final ProductComplexPromoJson copy(@g(name = "promoId") long promoId, @g(name = "promoText") String promoText, @g(name = "promoBuyMinQty") int promoBuyMinQty, @g(name = "promoValue") double promoValue, @g(name = "promoBuyMinSpend") double promoBuyMinSpend, @g(name = "buyProducts") List<ResultData> buyProducts, @g(name = "getProducts") List<ResultData> getProducts) {
        Intrinsics.j(buyProducts, "buyProducts");
        Intrinsics.j(getProducts, "getProducts");
        return new ProductComplexPromoJson(promoId, promoText, promoBuyMinQty, promoValue, promoBuyMinSpend, buyProducts, getProducts);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductComplexPromoJson)) {
            return false;
        }
        ProductComplexPromoJson productComplexPromoJson = (ProductComplexPromoJson) other;
        return this.promoId == productComplexPromoJson.promoId && Intrinsics.e(this.promoText, productComplexPromoJson.promoText) && this.promoBuyMinQty == productComplexPromoJson.promoBuyMinQty && Double.compare(this.promoValue, productComplexPromoJson.promoValue) == 0 && Double.compare(this.promoBuyMinSpend, productComplexPromoJson.promoBuyMinSpend) == 0 && Intrinsics.e(this.buyProducts, productComplexPromoJson.buyProducts) && Intrinsics.e(this.getProducts, productComplexPromoJson.getProducts);
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.promoId) * 31;
        String str = this.promoText;
        return ((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.promoBuyMinQty)) * 31) + Double.hashCode(this.promoValue)) * 31) + Double.hashCode(this.promoBuyMinSpend)) * 31) + this.buyProducts.hashCode()) * 31) + this.getProducts.hashCode();
    }

    public String toString() {
        return "ProductComplexPromoJson(promoId=" + this.promoId + ", promoText=" + this.promoText + ", promoBuyMinQty=" + this.promoBuyMinQty + ", promoValue=" + this.promoValue + ", promoBuyMinSpend=" + this.promoBuyMinSpend + ", buyProducts=" + this.buyProducts + ", getProducts=" + this.getProducts + ')';
    }

    public ProductComplexPromoJson(@g(name = "promoId") long j10, @g(name = "promoText") String str, @g(name = "promoBuyMinQty") int i10, @g(name = "promoValue") double d10, @g(name = "promoBuyMinSpend") double d11, @g(name = "buyProducts") List<ResultData> buyProducts, @g(name = "getProducts") List<ResultData> getProducts) {
        Intrinsics.j(buyProducts, "buyProducts");
        Intrinsics.j(getProducts, "getProducts");
        this.promoId = j10;
        this.promoText = str;
        this.promoBuyMinQty = i10;
        this.promoValue = d10;
        this.promoBuyMinSpend = d11;
        this.buyProducts = buyProducts;
        this.getProducts = getProducts;
    }

    public final List<ResultData> a() {
        return this.buyProducts;
    }

    public final List<ResultData> b() {
        return this.getProducts;
    }

    /* renamed from: c, reason: from getter */
    public final int getPromoBuyMinQty() {
        return this.promoBuyMinQty;
    }

    /* renamed from: d, reason: from getter */
    public final double getPromoBuyMinSpend() {
        return this.promoBuyMinSpend;
    }

    /* renamed from: e, reason: from getter */
    public final long getPromoId() {
        return this.promoId;
    }

    /* renamed from: f, reason: from getter */
    public final String getPromoText() {
        return this.promoText;
    }

    /* renamed from: g, reason: from getter */
    public final double getPromoValue() {
        return this.promoValue;
    }

    public /* synthetic */ ProductComplexPromoJson(long j10, String str, int i10, double d10, double d11, List list, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0L : j10, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? 0 : i10, (i11 & 8) != 0 ? 0.0d : d10, (i11 & 16) == 0 ? d11 : 0.0d, (i11 & 32) != 0 ? CollectionsKt.m() : list, (i11 & 64) != 0 ? CollectionsKt.m() : list2);
    }
}
