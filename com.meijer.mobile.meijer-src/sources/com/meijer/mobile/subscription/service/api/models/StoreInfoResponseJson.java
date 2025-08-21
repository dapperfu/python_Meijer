package com.meijer.mobile.subscription.service.api.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\f\b\u0003\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\t\u001a\u00020\u00002\f\b\u0003\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/subscription/service/api/models/StoreInfoResponseJson;", "", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "", "storeName", "<init>", "(ILjava/lang/String;)V", "copy", "(ILjava/lang/String;)Lcom/meijer/mobile/subscription/service/api/models/StoreInfoResponseJson;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/String;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class StoreInfoResponseJson {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int storeId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String storeName;

    /* JADX WARN: Multi-variable type inference failed */
    public StoreInfoResponseJson() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public final StoreInfoResponseJson copy(@g(name = "storeId") int storeId, @g(name = "storeName") String storeName) {
        return new StoreInfoResponseJson(storeId, storeName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StoreInfoResponseJson)) {
            return false;
        }
        StoreInfoResponseJson storeInfoResponseJson = (StoreInfoResponseJson) other;
        return this.storeId == storeInfoResponseJson.storeId && Intrinsics.e(this.storeName, storeInfoResponseJson.storeName);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.storeId) * 31;
        String str = this.storeName;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "StoreInfoResponseJson(storeId=" + this.storeId + ", storeName=" + this.storeName + ')';
    }

    public StoreInfoResponseJson(@g(name = "storeId") int i10, @g(name = "storeName") String str) {
        this.storeId = i10;
        this.storeName = str;
    }

    /* renamed from: a, reason: from getter */
    public final int getStoreId() {
        return this.storeId;
    }

    /* renamed from: b, reason: from getter */
    public final String getStoreName() {
        return this.storeName;
    }

    public /* synthetic */ StoreInfoResponseJson(int i10, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? null : str);
    }
}
