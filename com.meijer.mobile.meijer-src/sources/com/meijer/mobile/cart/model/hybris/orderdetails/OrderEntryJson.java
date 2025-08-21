package com.meijer.mobile.cart.model.hybris.orderdetails;

import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.cart.model.hybris.HybrisDeliveryMode;
import com.meijer.mobile.product.model.hybris.api.models.HybrisProduct;
import com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice;
import com.meijer.mobile.store.model.hybris.HybrisPointOfService;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\b\u0003\u0010\n\u001a\u00060\bj\u0002`\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\b\b\u0003\u0010\u000e\u001a\u00020\r\u0012\b\b\u0003\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013Jh\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\b\u0003\u0010\n\u001a\u00060\bj\u0002`\t2\b\b\u0003\u0010\f\u001a\u00020\u000b2\b\b\u0003\u0010\u000e\u001a\u00020\r2\b\b\u0003\u0010\u000f\u001a\u00020\u00022\b\b\u0003\u0010\u0011\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u001b\u0010\n\u001a\u00060\bj\u0002`\t8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010\u001aR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010\u001f\u001a\u0004\b/\u0010 R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b0\u00102¨\u00063"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/orderdetails/OrderEntryJson;", "", "Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;", "basePrice", "Lcom/meijer/mobile/cart/model/hybris/HybrisDeliveryMode;", "deliveryMode", "Lcom/meijer/mobile/store/model/hybris/HybrisPointOfService;", "deliveryPointOfService", "", "Lcom/meijer/mobile/cart/model/common/EntryNumber;", "entryNumber", "Lcom/meijer/mobile/product/model/hybris/api/models/HybrisProduct;", "product", "", "quantity", "totalPrice", "", "updateable", "<init>", "(Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/cart/model/hybris/HybrisDeliveryMode;Lcom/meijer/mobile/store/model/hybris/HybrisPointOfService;ILcom/meijer/mobile/product/model/hybris/api/models/HybrisProduct;JLcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Z)V", "copy", "(Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/cart/model/hybris/HybrisDeliveryMode;Lcom/meijer/mobile/store/model/hybris/HybrisPointOfService;ILcom/meijer/mobile/product/model/hybris/api/models/HybrisProduct;JLcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Z)Lcom/meijer/mobile/cart/model/hybris/orderdetails/OrderEntryJson;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;", "()Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;", "b", "Lcom/meijer/mobile/cart/model/hybris/HybrisDeliveryMode;", "()Lcom/meijer/mobile/cart/model/hybris/HybrisDeliveryMode;", "c", "Lcom/meijer/mobile/store/model/hybris/HybrisPointOfService;", "()Lcom/meijer/mobile/store/model/hybris/HybrisPointOfService;", "d", "I", "e", "Lcom/meijer/mobile/product/model/hybris/api/models/HybrisProduct;", "()Lcom/meijer/mobile/product/model/hybris/api/models/HybrisProduct;", "f", "J", "()J", "g", "h", "Z", "()Z", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class OrderEntryJson {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice basePrice;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisDeliveryMode deliveryMode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPointOfService deliveryPointOfService;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int entryNumber;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisProduct product;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final long quantity;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice totalPrice;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean updateable;

    public OrderEntryJson(@g(name = "basePrice") HybrisPrice basePrice, @g(name = "deliveryMode") HybrisDeliveryMode hybrisDeliveryMode, @g(name = "deliveryPointOfService") HybrisPointOfService hybrisPointOfService, @g(name = "entryNumber") int i10, @g(name = "product") HybrisProduct product, @g(name = "quantity") long j10, @g(name = "totalPrice") HybrisPrice totalPrice, @g(name = "updateable") boolean z10) {
        Intrinsics.j(basePrice, "basePrice");
        Intrinsics.j(product, "product");
        Intrinsics.j(totalPrice, "totalPrice");
        this.basePrice = basePrice;
        this.deliveryMode = hybrisDeliveryMode;
        this.deliveryPointOfService = hybrisPointOfService;
        this.entryNumber = i10;
        this.product = product;
        this.quantity = j10;
        this.totalPrice = totalPrice;
        this.updateable = z10;
    }

    public final OrderEntryJson copy(@g(name = "basePrice") HybrisPrice basePrice, @g(name = "deliveryMode") HybrisDeliveryMode deliveryMode, @g(name = "deliveryPointOfService") HybrisPointOfService deliveryPointOfService, @g(name = "entryNumber") int entryNumber, @g(name = "product") HybrisProduct product, @g(name = "quantity") long quantity, @g(name = "totalPrice") HybrisPrice totalPrice, @g(name = "updateable") boolean updateable) {
        Intrinsics.j(basePrice, "basePrice");
        Intrinsics.j(product, "product");
        Intrinsics.j(totalPrice, "totalPrice");
        return new OrderEntryJson(basePrice, deliveryMode, deliveryPointOfService, entryNumber, product, quantity, totalPrice, updateable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderEntryJson)) {
            return false;
        }
        OrderEntryJson orderEntryJson = (OrderEntryJson) other;
        return Intrinsics.e(this.basePrice, orderEntryJson.basePrice) && Intrinsics.e(this.deliveryMode, orderEntryJson.deliveryMode) && Intrinsics.e(this.deliveryPointOfService, orderEntryJson.deliveryPointOfService) && this.entryNumber == orderEntryJson.entryNumber && Intrinsics.e(this.product, orderEntryJson.product) && this.quantity == orderEntryJson.quantity && Intrinsics.e(this.totalPrice, orderEntryJson.totalPrice) && this.updateable == orderEntryJson.updateable;
    }

    public int hashCode() {
        int iHashCode = this.basePrice.hashCode() * 31;
        HybrisDeliveryMode hybrisDeliveryMode = this.deliveryMode;
        int iHashCode2 = (iHashCode + (hybrisDeliveryMode == null ? 0 : hybrisDeliveryMode.hashCode())) * 31;
        HybrisPointOfService hybrisPointOfService = this.deliveryPointOfService;
        return ((((((((((iHashCode2 + (hybrisPointOfService != null ? hybrisPointOfService.hashCode() : 0)) * 31) + Integer.hashCode(this.entryNumber)) * 31) + this.product.hashCode()) * 31) + Long.hashCode(this.quantity)) * 31) + this.totalPrice.hashCode()) * 31) + Boolean.hashCode(this.updateable);
    }

    public String toString() {
        return "OrderEntryJson(basePrice=" + this.basePrice + ", deliveryMode=" + this.deliveryMode + ", deliveryPointOfService=" + this.deliveryPointOfService + ", entryNumber=" + this.entryNumber + ", product=" + this.product + ", quantity=" + this.quantity + ", totalPrice=" + this.totalPrice + ", updateable=" + this.updateable + ')';
    }

    /* renamed from: a, reason: from getter */
    public final HybrisPrice getBasePrice() {
        return this.basePrice;
    }

    /* renamed from: b, reason: from getter */
    public final HybrisDeliveryMode getDeliveryMode() {
        return this.deliveryMode;
    }

    /* renamed from: c, reason: from getter */
    public final HybrisPointOfService getDeliveryPointOfService() {
        return this.deliveryPointOfService;
    }

    /* renamed from: d, reason: from getter */
    public final int getEntryNumber() {
        return this.entryNumber;
    }

    /* renamed from: e, reason: from getter */
    public final HybrisProduct getProduct() {
        return this.product;
    }

    /* renamed from: f, reason: from getter */
    public final long getQuantity() {
        return this.quantity;
    }

    /* renamed from: g, reason: from getter */
    public final HybrisPrice getTotalPrice() {
        return this.totalPrice;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getUpdateable() {
        return this.updateable;
    }

    public /* synthetic */ OrderEntryJson(HybrisPrice hybrisPrice, HybrisDeliveryMode hybrisDeliveryMode, HybrisPointOfService hybrisPointOfService, int i10, HybrisProduct hybrisProduct, long j10, HybrisPrice hybrisPrice2, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new HybrisPrice(null, null, null, null, 0.0d, null, null, l3.f93324d, null) : hybrisPrice, (i11 & 2) != 0 ? null : hybrisDeliveryMode, (i11 & 4) != 0 ? null : hybrisPointOfService, (i11 & 8) != 0 ? -1 : i10, hybrisProduct, (i11 & 32) != 0 ? 0L : j10, (i11 & 64) != 0 ? new HybrisPrice(null, null, null, null, 0.0d, null, null, l3.f93324d, null) : hybrisPrice2, (i11 & 128) != 0 ? false : z10);
    }
}
