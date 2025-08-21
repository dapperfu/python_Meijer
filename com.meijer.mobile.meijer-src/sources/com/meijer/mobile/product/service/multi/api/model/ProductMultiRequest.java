package com.meijer.mobile.product.service.multi.api.model;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0010\b\u0003\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\u0014\b\u0003\u0010\b\u001a\u000e\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ8\u0010\u000b\u001a\u00020\u00002\u0010\b\u0003\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00032\u0014\b\u0003\u0010\b\u001a\u000e\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R#\u0010\b\u001a\u000e\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/meijer/mobile/product/service/multi/api/model/ProductMultiRequest;", "", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "", "", "Lcom/meijer/mobile/core/models/products/ProductCode;", "upcs", "<init>", "(Ljava/lang/Integer;Ljava/util/List;)V", "copy", "(Ljava/lang/Integer;Ljava/util/List;)Lcom/meijer/mobile/product/service/multi/api/model/ProductMultiRequest;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "b", "Ljava/util/List;", "()Ljava/util/List;", "multi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ProductMultiRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer storeId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> upcs;

    /* JADX WARN: Multi-variable type inference failed */
    public ProductMultiRequest() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final ProductMultiRequest copy(@g(name = "unitId") Integer storeId, @g(name = "upcs") List<String> upcs) {
        return new ProductMultiRequest(storeId, upcs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductMultiRequest)) {
            return false;
        }
        ProductMultiRequest productMultiRequest = (ProductMultiRequest) other;
        return Intrinsics.e(this.storeId, productMultiRequest.storeId) && Intrinsics.e(this.upcs, productMultiRequest.upcs);
    }

    public int hashCode() {
        Integer num = this.storeId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<String> list = this.upcs;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "ProductMultiRequest(storeId=" + this.storeId + ", upcs=" + this.upcs + ')';
    }

    public ProductMultiRequest(@g(name = "unitId") Integer num, @g(name = "upcs") List<String> list) {
        this.storeId = num;
        this.upcs = list;
    }

    /* renamed from: a, reason: from getter */
    public final Integer getStoreId() {
        return this.storeId;
    }

    public final List<String> b() {
        return this.upcs;
    }

    public /* synthetic */ ProductMultiRequest(Integer num, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? CollectionsKt.m() : list);
    }
}
