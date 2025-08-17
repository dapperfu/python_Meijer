package com.meijer.mobile.cart.model.hybris;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\f\b\u0001\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ2\u0010\n\u001a\u00020\u00002\f\b\u0003\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0014\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/PartnerStoreLocationResponse;", "", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "partnerStoreId", "", "storeId", "estimatedTimeToDeliver", "<init>", "(ILjava/lang/String;I)V", "copy", "(ILjava/lang/String;I)Lcom/meijer/mobile/cart/model/hybris/PartnerStoreLocationResponse;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/String;", "c", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PartnerStoreLocationResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int partnerStoreId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String storeId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int estimatedTimeToDeliver;

    public final PartnerStoreLocationResponse copy(@g(name = PreferencesHelper.PREF_ID) int partnerStoreId, @g(name = "retailer_location_id") String storeId, @g(name = "estimated_drive_time") int estimatedTimeToDeliver) {
        Intrinsics.j(storeId, "storeId");
        return new PartnerStoreLocationResponse(partnerStoreId, storeId, estimatedTimeToDeliver);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PartnerStoreLocationResponse)) {
            return false;
        }
        PartnerStoreLocationResponse partnerStoreLocationResponse = (PartnerStoreLocationResponse) other;
        return this.partnerStoreId == partnerStoreLocationResponse.partnerStoreId && Intrinsics.e(this.storeId, partnerStoreLocationResponse.storeId) && this.estimatedTimeToDeliver == partnerStoreLocationResponse.estimatedTimeToDeliver;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.partnerStoreId) * 31) + this.storeId.hashCode()) * 31) + Integer.hashCode(this.estimatedTimeToDeliver);
    }

    public String toString() {
        return "PartnerStoreLocationResponse(partnerStoreId=" + this.partnerStoreId + ", storeId=" + this.storeId + ", estimatedTimeToDeliver=" + this.estimatedTimeToDeliver + ')';
    }

    public PartnerStoreLocationResponse(@g(name = PreferencesHelper.PREF_ID) int i10, @g(name = "retailer_location_id") String storeId, @g(name = "estimated_drive_time") int i11) {
        Intrinsics.j(storeId, "storeId");
        this.partnerStoreId = i10;
        this.storeId = storeId;
        this.estimatedTimeToDeliver = i11;
    }

    /* renamed from: a, reason: from getter */
    public final int getEstimatedTimeToDeliver() {
        return this.estimatedTimeToDeliver;
    }

    /* renamed from: b, reason: from getter */
    public final int getPartnerStoreId() {
        return this.partnerStoreId;
    }

    /* renamed from: c, reason: from getter */
    public final String getStoreId() {
        return this.storeId;
    }
}
