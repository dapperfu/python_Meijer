package com.meijer.mobile.cart.model.hybris;

import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0016B;\u0012\u0010\b\u0003\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJD\u0010\u000b\u001a\u00020\u00002\u0010\b\u0003\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001b\u0010\u000eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001c\u0010\u000eR\u0011\u0010\u001f\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/HybrisDeliveryMode;", "", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "code", "Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;", "deliveryCost", "description", "name", "<init>", "(Ljava/lang/String;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/cart/model/hybris/HybrisDeliveryMode;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;", "()Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;", "c", "d", "e", "()Z", "isDelivery", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class HybrisDeliveryMode {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String code;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice deliveryCost;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    public HybrisDeliveryMode() {
        this(null, null, null, null, 15, null);
    }

    public final HybrisDeliveryMode copy(@g(name = "code") String code, @g(name = "deliveryCost") HybrisPrice deliveryCost, @g(name = "description") String description, @g(name = "name") String name) {
        Intrinsics.j(deliveryCost, "deliveryCost");
        return new HybrisDeliveryMode(code, deliveryCost, description, name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HybrisDeliveryMode)) {
            return false;
        }
        HybrisDeliveryMode hybrisDeliveryMode = (HybrisDeliveryMode) other;
        return Intrinsics.e(this.code, hybrisDeliveryMode.code) && Intrinsics.e(this.deliveryCost, hybrisDeliveryMode.deliveryCost) && Intrinsics.e(this.description, hybrisDeliveryMode.description) && Intrinsics.e(this.name, hybrisDeliveryMode.name);
    }

    public int hashCode() {
        String str = this.code;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.deliveryCost.hashCode()) * 31;
        String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "HybrisDeliveryMode(code=" + this.code + ", deliveryCost=" + this.deliveryCost + ", description=" + this.description + ", name=" + this.name + ')';
    }

    public HybrisDeliveryMode(@g(name = "code") String str, @g(name = "deliveryCost") HybrisPrice deliveryCost, @g(name = "description") String str2, @g(name = "name") String str3) {
        Intrinsics.j(deliveryCost, "deliveryCost");
        this.code = str;
        this.deliveryCost = deliveryCost;
        this.description = str2;
        this.name = str3;
    }

    /* renamed from: a, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: b, reason: from getter */
    public final HybrisPrice getDeliveryCost() {
        return this.deliveryCost;
    }

    /* renamed from: c, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: d, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final boolean e() {
        return Intrinsics.e(this.code, "delivery");
    }

    public /* synthetic */ HybrisDeliveryMode(String str, HybrisPrice hybrisPrice, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? new HybrisPrice(null, null, null, null, 0.0d, null, null, l3.f93324d, null) : hybrisPrice, (i10 & 4) != 0 ? null : str2, (i10 & 8) == 0 ? str3 : null);
    }
}
