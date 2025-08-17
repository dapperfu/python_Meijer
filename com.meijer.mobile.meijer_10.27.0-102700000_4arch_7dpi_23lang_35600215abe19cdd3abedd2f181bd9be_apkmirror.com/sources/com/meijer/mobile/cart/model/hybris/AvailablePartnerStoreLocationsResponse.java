package com.meijer.mobile.cart.model.hybris;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\t\u001a\u00020\u00002\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/AvailablePartnerStoreLocationsResponse;", "", "", "Lcom/meijer/mobile/cart/model/hybris/PartnerStoreLocationResponse;", "storeLocations", "", "isAlcoholDeliveryEnabled", "<init>", "(Ljava/util/List;Z)V", "copy", "(Ljava/util/List;Z)Lcom/meijer/mobile/cart/model/hybris/AvailablePartnerStoreLocationsResponse;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Z", "()Z", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AvailablePartnerStoreLocationsResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<PartnerStoreLocationResponse> storeLocations;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAlcoholDeliveryEnabled;

    /* JADX WARN: Multi-variable type inference failed */
    public AvailablePartnerStoreLocationsResponse() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public final AvailablePartnerStoreLocationsResponse copy(@g(name = "available_store_locations") List<PartnerStoreLocationResponse> storeLocations, @g(name = "address_allows_alcohol") boolean isAlcoholDeliveryEnabled) {
        Intrinsics.j(storeLocations, "storeLocations");
        return new AvailablePartnerStoreLocationsResponse(storeLocations, isAlcoholDeliveryEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvailablePartnerStoreLocationsResponse)) {
            return false;
        }
        AvailablePartnerStoreLocationsResponse availablePartnerStoreLocationsResponse = (AvailablePartnerStoreLocationsResponse) other;
        return Intrinsics.e(this.storeLocations, availablePartnerStoreLocationsResponse.storeLocations) && this.isAlcoholDeliveryEnabled == availablePartnerStoreLocationsResponse.isAlcoholDeliveryEnabled;
    }

    public int hashCode() {
        return (this.storeLocations.hashCode() * 31) + Boolean.hashCode(this.isAlcoholDeliveryEnabled);
    }

    public String toString() {
        return "AvailablePartnerStoreLocationsResponse(storeLocations=" + this.storeLocations + ", isAlcoholDeliveryEnabled=" + this.isAlcoholDeliveryEnabled + ')';
    }

    public AvailablePartnerStoreLocationsResponse(@g(name = "available_store_locations") List<PartnerStoreLocationResponse> storeLocations, @g(name = "address_allows_alcohol") boolean z10) {
        Intrinsics.j(storeLocations, "storeLocations");
        this.storeLocations = storeLocations;
        this.isAlcoholDeliveryEnabled = z10;
    }

    public final List<PartnerStoreLocationResponse> a() {
        return this.storeLocations;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getIsAlcoholDeliveryEnabled() {
        return this.isAlcoholDeliveryEnabled;
    }

    public /* synthetic */ AvailablePartnerStoreLocationsResponse(List list, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? CollectionsKt.m() : list, (i10 & 2) != 0 ? false : z10);
    }
}
