package com.meijer.mobile.cart.model.hybris;

import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.address.model.hybris.HybrisCustomerAddress;
import com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007\u0012\b\b\u0003\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ@\u0010\r\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$¨\u0006%"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/DeliveryOrderGroup;", "", "Lcom/meijer/mobile/address/model/hybris/HybrisCustomerAddress;", "deliveryAddress", "", "Lcom/meijer/mobile/cart/model/hybris/EntryJson;", "entries", "", "quantity", "Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;", "totalPriceWithTax", "<init>", "(Lcom/meijer/mobile/address/model/hybris/HybrisCustomerAddress;Ljava/util/List;DLcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;)V", "copy", "(Lcom/meijer/mobile/address/model/hybris/HybrisCustomerAddress;Ljava/util/List;DLcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;)Lcom/meijer/mobile/cart/model/hybris/DeliveryOrderGroup;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/address/model/hybris/HybrisCustomerAddress;", "()Lcom/meijer/mobile/address/model/hybris/HybrisCustomerAddress;", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "D", "()D", "d", "Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;", "()Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class DeliveryOrderGroup {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisCustomerAddress deliveryAddress;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<EntryJson> entries;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final double quantity;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice totalPriceWithTax;

    public DeliveryOrderGroup() {
        this(null, null, 0.0d, null, 15, null);
    }

    public final DeliveryOrderGroup copy(@g(name = "deliveryAddress") HybrisCustomerAddress deliveryAddress, @g(name = "entries") List<EntryJson> entries, @g(name = "quantity") double quantity, @g(name = "totalPriceWithTax") HybrisPrice totalPriceWithTax) {
        Intrinsics.j(entries, "entries");
        Intrinsics.j(totalPriceWithTax, "totalPriceWithTax");
        return new DeliveryOrderGroup(deliveryAddress, entries, quantity, totalPriceWithTax);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryOrderGroup)) {
            return false;
        }
        DeliveryOrderGroup deliveryOrderGroup = (DeliveryOrderGroup) other;
        return Intrinsics.e(this.deliveryAddress, deliveryOrderGroup.deliveryAddress) && Intrinsics.e(this.entries, deliveryOrderGroup.entries) && Double.compare(this.quantity, deliveryOrderGroup.quantity) == 0 && Intrinsics.e(this.totalPriceWithTax, deliveryOrderGroup.totalPriceWithTax);
    }

    public int hashCode() {
        HybrisCustomerAddress hybrisCustomerAddress = this.deliveryAddress;
        return ((((((hybrisCustomerAddress == null ? 0 : hybrisCustomerAddress.hashCode()) * 31) + this.entries.hashCode()) * 31) + Double.hashCode(this.quantity)) * 31) + this.totalPriceWithTax.hashCode();
    }

    public String toString() {
        return "DeliveryOrderGroup(deliveryAddress=" + this.deliveryAddress + ", entries=" + this.entries + ", quantity=" + this.quantity + ", totalPriceWithTax=" + this.totalPriceWithTax + ')';
    }

    public DeliveryOrderGroup(@g(name = "deliveryAddress") HybrisCustomerAddress hybrisCustomerAddress, @g(name = "entries") List<EntryJson> entries, @g(name = "quantity") double d10, @g(name = "totalPriceWithTax") HybrisPrice totalPriceWithTax) {
        Intrinsics.j(entries, "entries");
        Intrinsics.j(totalPriceWithTax, "totalPriceWithTax");
        this.deliveryAddress = hybrisCustomerAddress;
        this.entries = entries;
        this.quantity = d10;
        this.totalPriceWithTax = totalPriceWithTax;
    }

    /* renamed from: a, reason: from getter */
    public final HybrisCustomerAddress getDeliveryAddress() {
        return this.deliveryAddress;
    }

    public final List<EntryJson> b() {
        return this.entries;
    }

    /* renamed from: c, reason: from getter */
    public final double getQuantity() {
        return this.quantity;
    }

    /* renamed from: d, reason: from getter */
    public final HybrisPrice getTotalPriceWithTax() {
        return this.totalPriceWithTax;
    }

    public /* synthetic */ DeliveryOrderGroup(HybrisCustomerAddress hybrisCustomerAddress, List list, double d10, HybrisPrice hybrisPrice, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : hybrisCustomerAddress, (i10 & 2) != 0 ? CollectionsKt.m() : list, (i10 & 4) != 0 ? 0.0d : d10, (i10 & 8) != 0 ? new HybrisPrice(null, null, null, null, 0.0d, null, null, l3.f93324d, null) : hybrisPrice);
    }
}
