package com.meijer.mobile.subscription.service.api.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\u0007\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0014\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/subscription/service/api/models/StoreInfoRequestJson;", "", "", "storeId", "storeName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/subscription/service/api/models/StoreInfoRequestJson;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class StoreInfoRequestJson {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String storeId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String storeName;

    public StoreInfoRequestJson(@g(name = "storeId") String storeId, @g(name = "storeName") String str) {
        Intrinsics.j(storeId, "storeId");
        this.storeId = storeId;
        this.storeName = str;
    }

    public final StoreInfoRequestJson copy(@g(name = "storeId") String storeId, @g(name = "storeName") String storeName) {
        Intrinsics.j(storeId, "storeId");
        return new StoreInfoRequestJson(storeId, storeName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StoreInfoRequestJson)) {
            return false;
        }
        StoreInfoRequestJson storeInfoRequestJson = (StoreInfoRequestJson) other;
        return Intrinsics.e(this.storeId, storeInfoRequestJson.storeId) && Intrinsics.e(this.storeName, storeInfoRequestJson.storeName);
    }

    public int hashCode() {
        int iHashCode = this.storeId.hashCode() * 31;
        String str = this.storeName;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "StoreInfoRequestJson(storeId=" + this.storeId + ", storeName=" + this.storeName + ')';
    }

    /* renamed from: a, reason: from getter */
    public final String getStoreId() {
        return this.storeId;
    }

    /* renamed from: b, reason: from getter */
    public final String getStoreName() {
        return this.storeName;
    }

    public /* synthetic */ StoreInfoRequestJson(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : str2);
    }
}
