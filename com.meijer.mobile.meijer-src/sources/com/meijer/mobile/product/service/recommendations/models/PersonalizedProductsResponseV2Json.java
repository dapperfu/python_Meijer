package com.meijer.mobile.product.service.recommendations.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import io.constructor.data.model.common.ResultData;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002\u0012\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJV\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00022\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u0013R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010 \u001a\u0004\b\u001e\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001b\u0010\u0011R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u0018\u0010\u0011¨\u0006\""}, d2 = {"Lcom/meijer/mobile/product/service/recommendations/models/PersonalizedProductsResponseV2Json;", "", "", "resultCode", "", "resultDescription", "totalProducts", "", "Lio/constructor/data/model/common/ResultData;", "products", "onViewBeacon", "onLoadBeacon", "<init>", "(ILjava/lang/String;ILjava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(ILjava/lang/String;ILjava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/product/service/recommendations/models/PersonalizedProductsResponseV2Json;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "d", "b", "Ljava/lang/String;", "e", "c", "f", "Ljava/util/List;", "()Ljava/util/List;", "recommendations_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PersonalizedProductsResponseV2Json {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int resultCode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String resultDescription;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int totalProducts;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ResultData> products;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String onViewBeacon;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String onLoadBeacon;

    public PersonalizedProductsResponseV2Json() {
        this(0, null, 0, null, null, null, 63, null);
    }

    public final PersonalizedProductsResponseV2Json copy(@g(name = "resultCode") int resultCode, @g(name = "resultDescription") String resultDescription, @g(name = "totalProducts") int totalProducts, @g(name = "products") List<ResultData> products, @g(name = "onViewBeacon") String onViewBeacon, @g(name = "onLoadBeacon") String onLoadBeacon) {
        Intrinsics.j(resultDescription, "resultDescription");
        Intrinsics.j(products, "products");
        return new PersonalizedProductsResponseV2Json(resultCode, resultDescription, totalProducts, products, onViewBeacon, onLoadBeacon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonalizedProductsResponseV2Json)) {
            return false;
        }
        PersonalizedProductsResponseV2Json personalizedProductsResponseV2Json = (PersonalizedProductsResponseV2Json) other;
        return this.resultCode == personalizedProductsResponseV2Json.resultCode && Intrinsics.e(this.resultDescription, personalizedProductsResponseV2Json.resultDescription) && this.totalProducts == personalizedProductsResponseV2Json.totalProducts && Intrinsics.e(this.products, personalizedProductsResponseV2Json.products) && Intrinsics.e(this.onViewBeacon, personalizedProductsResponseV2Json.onViewBeacon) && Intrinsics.e(this.onLoadBeacon, personalizedProductsResponseV2Json.onLoadBeacon);
    }

    public int hashCode() {
        int iHashCode = ((((((Integer.hashCode(this.resultCode) * 31) + this.resultDescription.hashCode()) * 31) + Integer.hashCode(this.totalProducts)) * 31) + this.products.hashCode()) * 31;
        String str = this.onViewBeacon;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.onLoadBeacon;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "PersonalizedProductsResponseV2Json(resultCode=" + this.resultCode + ", resultDescription=" + this.resultDescription + ", totalProducts=" + this.totalProducts + ", products=" + this.products + ", onViewBeacon=" + this.onViewBeacon + ", onLoadBeacon=" + this.onLoadBeacon + ')';
    }

    public PersonalizedProductsResponseV2Json(@g(name = "resultCode") int i10, @g(name = "resultDescription") String resultDescription, @g(name = "totalProducts") int i11, @g(name = "products") List<ResultData> products, @g(name = "onViewBeacon") String str, @g(name = "onLoadBeacon") String str2) {
        Intrinsics.j(resultDescription, "resultDescription");
        Intrinsics.j(products, "products");
        this.resultCode = i10;
        this.resultDescription = resultDescription;
        this.totalProducts = i11;
        this.products = products;
        this.onViewBeacon = str;
        this.onLoadBeacon = str2;
    }

    /* renamed from: a, reason: from getter */
    public final String getOnLoadBeacon() {
        return this.onLoadBeacon;
    }

    /* renamed from: b, reason: from getter */
    public final String getOnViewBeacon() {
        return this.onViewBeacon;
    }

    public final List<ResultData> c() {
        return this.products;
    }

    /* renamed from: d, reason: from getter */
    public final int getResultCode() {
        return this.resultCode;
    }

    /* renamed from: e, reason: from getter */
    public final String getResultDescription() {
        return this.resultDescription;
    }

    /* renamed from: f, reason: from getter */
    public final int getTotalProducts() {
        return this.totalProducts;
    }

    public /* synthetic */ PersonalizedProductsResponseV2Json(int i10, String str, int i11, List list, String str2, String str3, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? "Success" : str, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? CollectionsKt.m() : list, (i12 & 16) != 0 ? null : str2, (i12 & 32) != 0 ? null : str3);
    }
}
