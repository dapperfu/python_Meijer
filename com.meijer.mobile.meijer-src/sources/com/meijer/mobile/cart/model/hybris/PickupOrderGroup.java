package com.meijer.mobile.cart.model.hybris;

import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice;
import com.meijer.mobile.store.model.hybris.HybrisPointOfService;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0003\u0010\t\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJJ\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0003\u0010\t\u001a\u00020\u00042\b\b\u0003\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b#\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&¨\u0006'"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/PickupOrderGroup;", "", "Lcom/meijer/mobile/store/model/hybris/HybrisPointOfService;", "deliveryPointOfService", "", "distance", "", "Lcom/meijer/mobile/cart/model/hybris/EntryJson;", "entries", "quantity", "Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;", "totalPriceWithTax", "<init>", "(Lcom/meijer/mobile/store/model/hybris/HybrisPointOfService;DLjava/util/List;DLcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;)V", "copy", "(Lcom/meijer/mobile/store/model/hybris/HybrisPointOfService;DLjava/util/List;DLcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;)Lcom/meijer/mobile/cart/model/hybris/PickupOrderGroup;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/store/model/hybris/HybrisPointOfService;", "()Lcom/meijer/mobile/store/model/hybris/HybrisPointOfService;", "b", "D", "()D", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "e", "Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;", "()Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PickupOrderGroup {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPointOfService deliveryPointOfService;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final double distance;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<EntryJson> entries;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final double quantity;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice totalPriceWithTax;

    public PickupOrderGroup() {
        this(null, 0.0d, null, 0.0d, null, 31, null);
    }

    public final PickupOrderGroup copy(@g(name = "deliveryPointOfService") HybrisPointOfService deliveryPointOfService, @g(name = "distance") double distance, @g(name = "entries") List<EntryJson> entries, @g(name = "quantity") double quantity, @g(name = "totalPriceWithTax") HybrisPrice totalPriceWithTax) {
        Intrinsics.j(entries, "entries");
        Intrinsics.j(totalPriceWithTax, "totalPriceWithTax");
        return new PickupOrderGroup(deliveryPointOfService, distance, entries, quantity, totalPriceWithTax);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PickupOrderGroup)) {
            return false;
        }
        PickupOrderGroup pickupOrderGroup = (PickupOrderGroup) other;
        return Intrinsics.e(this.deliveryPointOfService, pickupOrderGroup.deliveryPointOfService) && Double.compare(this.distance, pickupOrderGroup.distance) == 0 && Intrinsics.e(this.entries, pickupOrderGroup.entries) && Double.compare(this.quantity, pickupOrderGroup.quantity) == 0 && Intrinsics.e(this.totalPriceWithTax, pickupOrderGroup.totalPriceWithTax);
    }

    public int hashCode() {
        HybrisPointOfService hybrisPointOfService = this.deliveryPointOfService;
        return ((((((((hybrisPointOfService == null ? 0 : hybrisPointOfService.hashCode()) * 31) + Double.hashCode(this.distance)) * 31) + this.entries.hashCode()) * 31) + Double.hashCode(this.quantity)) * 31) + this.totalPriceWithTax.hashCode();
    }

    public String toString() {
        return "PickupOrderGroup(deliveryPointOfService=" + this.deliveryPointOfService + ", distance=" + this.distance + ", entries=" + this.entries + ", quantity=" + this.quantity + ", totalPriceWithTax=" + this.totalPriceWithTax + ')';
    }

    public PickupOrderGroup(@g(name = "deliveryPointOfService") HybrisPointOfService hybrisPointOfService, @g(name = "distance") double d10, @g(name = "entries") List<EntryJson> entries, @g(name = "quantity") double d11, @g(name = "totalPriceWithTax") HybrisPrice totalPriceWithTax) {
        Intrinsics.j(entries, "entries");
        Intrinsics.j(totalPriceWithTax, "totalPriceWithTax");
        this.deliveryPointOfService = hybrisPointOfService;
        this.distance = d10;
        this.entries = entries;
        this.quantity = d11;
        this.totalPriceWithTax = totalPriceWithTax;
    }

    /* renamed from: a, reason: from getter */
    public final HybrisPointOfService getDeliveryPointOfService() {
        return this.deliveryPointOfService;
    }

    /* renamed from: b, reason: from getter */
    public final double getDistance() {
        return this.distance;
    }

    public final List<EntryJson> c() {
        return this.entries;
    }

    /* renamed from: d, reason: from getter */
    public final double getQuantity() {
        return this.quantity;
    }

    /* renamed from: e, reason: from getter */
    public final HybrisPrice getTotalPriceWithTax() {
        return this.totalPriceWithTax;
    }

    public /* synthetic */ PickupOrderGroup(HybrisPointOfService hybrisPointOfService, double d10, List list, double d11, HybrisPrice hybrisPrice, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : hybrisPointOfService, (i10 & 2) != 0 ? 0.0d : d10, (i10 & 4) != 0 ? CollectionsKt.m() : list, (i10 & 8) == 0 ? d11 : 0.0d, (i10 & 16) != 0 ? new HybrisPrice(null, null, null, null, 0.0d, null, null, l3.f93324d, null) : hybrisPrice);
    }
}
