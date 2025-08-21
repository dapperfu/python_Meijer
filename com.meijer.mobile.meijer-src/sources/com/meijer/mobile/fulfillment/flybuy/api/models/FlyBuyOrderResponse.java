package com.meijer.mobile.fulfillment.flybuy.api.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\t\u001a\u00020\u00002\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/meijer/mobile/fulfillment/flybuy/api/models/FlyBuyOrderResponse;", "", "", "Lcom/meijer/mobile/fulfillment/flybuy/api/models/FlyBuyOrderData;", "flyBuyOrderData", "Lcom/meijer/mobile/fulfillment/flybuy/api/models/PagesResponse;", "flyBuyOrderPages", "<init>", "(Ljava/util/List;Lcom/meijer/mobile/fulfillment/flybuy/api/models/PagesResponse;)V", "copy", "(Ljava/util/List;Lcom/meijer/mobile/fulfillment/flybuy/api/models/PagesResponse;)Lcom/meijer/mobile/fulfillment/flybuy/api/models/FlyBuyOrderResponse;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Lcom/meijer/mobile/fulfillment/flybuy/api/models/PagesResponse;", "()Lcom/meijer/mobile/fulfillment/flybuy/api/models/PagesResponse;", "flybuy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class FlyBuyOrderResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<FlyBuyOrderData> flyBuyOrderData;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final PagesResponse flyBuyOrderPages;

    public FlyBuyOrderResponse(@g(name = "data") List<FlyBuyOrderData> flyBuyOrderData, @g(name = "pages") PagesResponse pagesResponse) {
        Intrinsics.j(flyBuyOrderData, "flyBuyOrderData");
        this.flyBuyOrderData = flyBuyOrderData;
        this.flyBuyOrderPages = pagesResponse;
    }

    public final FlyBuyOrderResponse copy(@g(name = "data") List<FlyBuyOrderData> flyBuyOrderData, @g(name = "pages") PagesResponse flyBuyOrderPages) {
        Intrinsics.j(flyBuyOrderData, "flyBuyOrderData");
        return new FlyBuyOrderResponse(flyBuyOrderData, flyBuyOrderPages);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlyBuyOrderResponse)) {
            return false;
        }
        FlyBuyOrderResponse flyBuyOrderResponse = (FlyBuyOrderResponse) other;
        return Intrinsics.e(this.flyBuyOrderData, flyBuyOrderResponse.flyBuyOrderData) && Intrinsics.e(this.flyBuyOrderPages, flyBuyOrderResponse.flyBuyOrderPages);
    }

    public int hashCode() {
        int iHashCode = this.flyBuyOrderData.hashCode() * 31;
        PagesResponse pagesResponse = this.flyBuyOrderPages;
        return iHashCode + (pagesResponse == null ? 0 : pagesResponse.hashCode());
    }

    public String toString() {
        return "FlyBuyOrderResponse(flyBuyOrderData=" + this.flyBuyOrderData + ", flyBuyOrderPages=" + this.flyBuyOrderPages + ')';
    }

    public final List<FlyBuyOrderData> a() {
        return this.flyBuyOrderData;
    }

    /* renamed from: b, reason: from getter */
    public final PagesResponse getFlyBuyOrderPages() {
        return this.flyBuyOrderPages;
    }

    public /* synthetic */ FlyBuyOrderResponse(List list, PagesResponse pagesResponse, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? CollectionsKt.m() : list, pagesResponse);
    }
}
