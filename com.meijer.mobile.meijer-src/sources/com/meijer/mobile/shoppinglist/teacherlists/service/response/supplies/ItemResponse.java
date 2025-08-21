package com.meijer.mobile.shoppinglist.teacherlists.service.response.supplies;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import io.constructor.data.model.common.ResultData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/shoppinglist/teacherlists/service/response/supplies/ItemResponse;", "", "Lio/constructor/data/model/common/ResultData;", "data", "", "productName", "<init>", "(Lio/constructor/data/model/common/ResultData;Ljava/lang/String;)V", "copy", "(Lio/constructor/data/model/common/ResultData;Ljava/lang/String;)Lcom/meijer/mobile/shoppinglist/teacherlists/service/response/supplies/ItemResponse;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lio/constructor/data/model/common/ResultData;", "()Lio/constructor/data/model/common/ResultData;", "b", "Ljava/lang/String;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ItemResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final ResultData data;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productName;

    public final ItemResponse copy(@g(name = "data") ResultData data, @g(name = "value") String productName) {
        Intrinsics.j(data, "data");
        Intrinsics.j(productName, "productName");
        return new ItemResponse(data, productName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemResponse)) {
            return false;
        }
        ItemResponse itemResponse = (ItemResponse) other;
        return Intrinsics.e(this.data, itemResponse.data) && Intrinsics.e(this.productName, itemResponse.productName);
    }

    public int hashCode() {
        return (this.data.hashCode() * 31) + this.productName.hashCode();
    }

    public String toString() {
        return "ItemResponse(data=" + this.data + ", productName=" + this.productName + ')';
    }

    public ItemResponse(@g(name = "data") ResultData data, @g(name = "value") String productName) {
        Intrinsics.j(data, "data");
        Intrinsics.j(productName, "productName");
        this.data = data;
        this.productName = productName;
    }

    /* renamed from: a, reason: from getter */
    public final ResultData getData() {
        return this.data;
    }

    /* renamed from: b, reason: from getter */
    public final String getProductName() {
        return this.productName;
    }
}
