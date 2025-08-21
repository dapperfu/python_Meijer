package com.meijer.mobile.cart.model.hybris;

import com.medallia.digital.mobilesdk.l3;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import fj.EntryChange;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@i(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0001\u001bBY\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0004\u0012\b\b\u0003\u0010\t\u001a\u00020\u0006\u0012\b\b\u0003\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJb\u0010\u0010\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\u00042\b\b\u0003\u0010\t\u001a\u00020\u00062\b\b\u0003\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\b\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010 \u001a\u0004\b'\u0010\"R\u001a\u0010\t\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010$\u001a\u0004\b(\u0010&R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0013R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b\u001f\u0010\"R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b#\u0010\"¨\u0006+"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/CartModification;", "", "Lcom/meijer/mobile/cart/model/hybris/EntryJson;", "entry", "", "quantityValue", "", "quantity", "quantityValueAdded", "quantityAdded", "", "statusCode", "actualQuantity", "actualQuantityAdded", "<init>", "(Lcom/meijer/mobile/cart/model/hybris/EntryJson;DJDJLjava/lang/String;DD)V", "copy", "(Lcom/meijer/mobile/cart/model/hybris/EntryJson;DJDJLjava/lang/String;DD)Lcom/meijer/mobile/cart/model/hybris/CartModification;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/cart/model/hybris/EntryJson;", "d", "()Lcom/meijer/mobile/cart/model/hybris/EntryJson;", "b", "D", "g", "()D", "c", "J", "e", "()J", "h", "f", "Ljava/lang/String;", "i", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final /* data */ class CartModification {

    /* renamed from: j, reason: collision with root package name */
    private static final List<String> f96328j = CollectionsKt.p(EntryChange.c.f131924f.getCode(), EntryChange.c.f131920b.getCode());

    /* renamed from: k, reason: collision with root package name */
    private static final List<String> f96329k = CollectionsKt.p(EntryChange.c.f131923e.getCode(), EntryChange.c.f131921c.getCode());

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final EntryJson entry;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final double quantityValue;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long quantity;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final double quantityValueAdded;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final long quantityAdded;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String statusCode;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final double actualQuantity;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final double actualQuantityAdded;

    public CartModification() {
        this(null, 0.0d, 0L, 0.0d, 0L, null, 0.0d, 0.0d, l3.f93323c, null);
    }

    public final CartModification copy(@g(name = "entry") EntryJson entry, @g(name = "quantityValue") double quantityValue, @g(name = "quantity") long quantity, @g(name = "quantityValueAdded") double quantityValueAdded, @g(name = "quantityAdded") long quantityAdded, @g(name = "statusCode") String statusCode, double actualQuantity, double actualQuantityAdded) {
        Intrinsics.j(statusCode, "statusCode");
        return new CartModification(entry, quantityValue, quantity, quantityValueAdded, quantityAdded, statusCode, actualQuantity, actualQuantityAdded);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartModification)) {
            return false;
        }
        CartModification cartModification = (CartModification) other;
        return Intrinsics.e(this.entry, cartModification.entry) && Double.compare(this.quantityValue, cartModification.quantityValue) == 0 && this.quantity == cartModification.quantity && Double.compare(this.quantityValueAdded, cartModification.quantityValueAdded) == 0 && this.quantityAdded == cartModification.quantityAdded && Intrinsics.e(this.statusCode, cartModification.statusCode) && Double.compare(this.actualQuantity, cartModification.actualQuantity) == 0 && Double.compare(this.actualQuantityAdded, cartModification.actualQuantityAdded) == 0;
    }

    public int hashCode() {
        EntryJson entryJson = this.entry;
        return ((((((((((((((entryJson == null ? 0 : entryJson.hashCode()) * 31) + Double.hashCode(this.quantityValue)) * 31) + Long.hashCode(this.quantity)) * 31) + Double.hashCode(this.quantityValueAdded)) * 31) + Long.hashCode(this.quantityAdded)) * 31) + this.statusCode.hashCode()) * 31) + Double.hashCode(this.actualQuantity)) * 31) + Double.hashCode(this.actualQuantityAdded);
    }

    public String toString() {
        return "CartModification(entry=" + this.entry + ", quantityValue=" + this.quantityValue + ", quantity=" + this.quantity + ", quantityValueAdded=" + this.quantityValueAdded + ", quantityAdded=" + this.quantityAdded + ", statusCode=" + this.statusCode + ", actualQuantity=" + this.actualQuantity + ", actualQuantityAdded=" + this.actualQuantityAdded + ')';
    }

    public CartModification(@g(name = "entry") EntryJson entryJson, @g(name = "quantityValue") double d10, @g(name = "quantity") long j10, @g(name = "quantityValueAdded") double d11, @g(name = "quantityAdded") long j11, @g(name = "statusCode") String statusCode, double d12, double d13) {
        Intrinsics.j(statusCode, "statusCode");
        this.entry = entryJson;
        this.quantityValue = d10;
        this.quantity = j10;
        this.quantityValueAdded = d11;
        this.quantityAdded = j11;
        this.statusCode = statusCode;
        this.actualQuantity = d12;
        this.actualQuantityAdded = d13;
    }

    /* renamed from: b, reason: from getter */
    public final double getActualQuantity() {
        return this.actualQuantity;
    }

    /* renamed from: c, reason: from getter */
    public final double getActualQuantityAdded() {
        return this.actualQuantityAdded;
    }

    /* renamed from: d, reason: from getter */
    public final EntryJson getEntry() {
        return this.entry;
    }

    /* renamed from: e, reason: from getter */
    public final long getQuantity() {
        return this.quantity;
    }

    /* renamed from: f, reason: from getter */
    public final long getQuantityAdded() {
        return this.quantityAdded;
    }

    /* renamed from: g, reason: from getter */
    public final double getQuantityValue() {
        return this.quantityValue;
    }

    /* renamed from: h, reason: from getter */
    public final double getQuantityValueAdded() {
        return this.quantityValueAdded;
    }

    /* renamed from: i, reason: from getter */
    public final String getStatusCode() {
        return this.statusCode;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CartModification(EntryJson entryJson, double d10, long j10, double d11, long j11, String str, double d12, double d13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        double d14;
        double dLongValue;
        EntryJson entryJson2 = (i10 & 1) != 0 ? null : entryJson;
        double d15 = (i10 & 2) != 0 ? 0.0d : d10;
        long j12 = (i10 & 4) != 0 ? 0L : j10;
        double d16 = (i10 & 8) == 0 ? d11 : 0.0d;
        long j13 = (i10 & 16) != 0 ? 0L : j11;
        String str2 = (i10 & 32) != 0 ? "success" : str;
        if ((i10 & 64) != 0) {
            Long lValueOf = Long.valueOf(j12);
            d14 = (lValueOf.longValue() == 0 ? null : lValueOf) != null ? r14.longValue() : d15;
        } else {
            d14 = d12;
        }
        if ((i10 & 128) != 0) {
            Long lValueOf2 = Long.valueOf(j13);
            dLongValue = (lValueOf2.longValue() != 0 ? lValueOf2 : null) != null ? r2.longValue() : d16;
        } else {
            dLongValue = d13;
        }
        this(entryJson2, d15, j12, d16, j13, str2, d14, dLongValue);
    }
}
