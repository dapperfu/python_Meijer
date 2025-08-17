package gj;

import Co.ProductFullDetails;
import Tq.PointOfService;
import ej.DeliveryMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b%\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\b\u0002\u0010\n\u001a\u00060\bj\u0002`\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001b\u0010\n\u001a\u00060\bj\u0002`\t8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0018R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010\u001d\u001a\u0004\b4\u0010\u001fR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108¨\u00069"}, d2 = {"Lgj/d;", "", "Lmk/b;", "basePrice", "Lej/h;", "deliveryMode", "LTq/c;", "deliveryPointOfService", "", "Lcom/meijer/mobile/cart/model/common/EntryNumber;", "entryNumber", "LCo/h;", "product", "", "quantity", "totalPrice", "", "updateable", "<init>", "(Lmk/b;Lej/h;LTq/c;ILCo/h;JLmk/b;Z)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lmk/b;", "getBasePrice", "()Lmk/b;", "b", "Lej/h;", "getDeliveryMode", "()Lej/h;", "c", "LTq/c;", "getDeliveryPointOfService", "()LTq/c;", "d", "I", "getEntryNumber", "e", "LCo/h;", "getProduct", "()LCo/h;", "f", "J", "getQuantity", "()J", "g", "getTotalPrice", "h", "Z", "getUpdateable", "()Z", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gj.d, reason: case insensitive filesystem and from toString */
/* loaded from: classes7.dex */
public final /* data */ class OrderEntry {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.b basePrice;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final DeliveryMode deliveryMode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final PointOfService deliveryPointOfService;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int entryNumber;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductFullDetails product;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final long quantity;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.b totalPrice;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean updateable;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderEntry)) {
            return false;
        }
        OrderEntry orderEntry = (OrderEntry) other;
        return Intrinsics.e(this.basePrice, orderEntry.basePrice) && Intrinsics.e(this.deliveryMode, orderEntry.deliveryMode) && Intrinsics.e(this.deliveryPointOfService, orderEntry.deliveryPointOfService) && this.entryNumber == orderEntry.entryNumber && Intrinsics.e(this.product, orderEntry.product) && this.quantity == orderEntry.quantity && Intrinsics.e(this.totalPrice, orderEntry.totalPrice) && this.updateable == orderEntry.updateable;
    }

    public OrderEntry(mk.b basePrice, DeliveryMode deliveryMode, PointOfService pointOfService, int i10, ProductFullDetails product, long j10, mk.b totalPrice, boolean z10) {
        Intrinsics.j(basePrice, "basePrice");
        Intrinsics.j(product, "product");
        Intrinsics.j(totalPrice, "totalPrice");
        this.basePrice = basePrice;
        this.deliveryMode = deliveryMode;
        this.deliveryPointOfService = pointOfService;
        this.entryNumber = i10;
        this.product = product;
        this.quantity = j10;
        this.totalPrice = totalPrice;
        this.updateable = z10;
    }

    public int hashCode() {
        int iHashCode = this.basePrice.hashCode() * 31;
        DeliveryMode deliveryMode = this.deliveryMode;
        int iHashCode2 = (iHashCode + (deliveryMode == null ? 0 : deliveryMode.hashCode())) * 31;
        PointOfService pointOfService = this.deliveryPointOfService;
        return ((((((((((iHashCode2 + (pointOfService != null ? pointOfService.hashCode() : 0)) * 31) + Integer.hashCode(this.entryNumber)) * 31) + this.product.hashCode()) * 31) + Long.hashCode(this.quantity)) * 31) + this.totalPrice.hashCode()) * 31) + Boolean.hashCode(this.updateable);
    }

    public String toString() {
        return "OrderEntry(basePrice=" + this.basePrice + ", deliveryMode=" + this.deliveryMode + ", deliveryPointOfService=" + this.deliveryPointOfService + ", entryNumber=" + this.entryNumber + ", product=" + this.product + ", quantity=" + this.quantity + ", totalPrice=" + this.totalPrice + ", updateable=" + this.updateable + ')';
    }
}
