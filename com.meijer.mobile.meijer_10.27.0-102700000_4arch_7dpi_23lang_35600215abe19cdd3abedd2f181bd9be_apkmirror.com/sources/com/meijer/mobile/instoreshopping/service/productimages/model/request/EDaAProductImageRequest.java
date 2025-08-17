package com.meijer.mobile.instoreshopping.service.productimages.model.request;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u0007\u001a\u00020\u00002\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/instoreshopping/service/productimages/model/request/EDaAProductImageRequest;", "", "", "", "itemSku", "<init>", "(Ljava/util/List;)V", "copy", "(Ljava/util/List;)Lcom/meijer/mobile/instoreshopping/service/productimages/model/request/EDaAProductImageRequest;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "instoreshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class EDaAProductImageRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> itemSku;

    public final EDaAProductImageRequest copy(@g(name = "ItemSku") List<String> itemSku) {
        Intrinsics.j(itemSku, "itemSku");
        return new EDaAProductImageRequest(itemSku);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof EDaAProductImageRequest) && Intrinsics.e(this.itemSku, ((EDaAProductImageRequest) other).itemSku);
    }

    public int hashCode() {
        return this.itemSku.hashCode();
    }

    public String toString() {
        return "EDaAProductImageRequest(itemSku=" + this.itemSku + ')';
    }

    public EDaAProductImageRequest(@g(name = "ItemSku") List<String> itemSku) {
        Intrinsics.j(itemSku, "itemSku");
        this.itemSku = itemSku;
    }

    public final List<String> a() {
        return this.itemSku;
    }
}
