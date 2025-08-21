package com.meijer.mobile.cart.model.hybris.orderdetails;

import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\f\b\u0003\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ2\u0010\n\u001a\u00020\u00002\f\b\u0003\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0017\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/orderdetails/HybrisTotalTaxValue;", "", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "code", "Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;", "value", "currencyIso", "<init>", "(Ljava/lang/String;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Ljava/lang/String;)Lcom/meijer/mobile/cart/model/hybris/orderdetails/HybrisTotalTaxValue;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;", "c", "()Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class HybrisTotalTaxValue {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String code;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice value;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String currencyIso;

    public HybrisTotalTaxValue() {
        this(null, null, null, 7, null);
    }

    public final HybrisTotalTaxValue copy(@g(name = "code") String code, @g(name = "value") HybrisPrice value, @g(name = "currencyIso") String currencyIso) {
        Intrinsics.j(code, "code");
        Intrinsics.j(value, "value");
        Intrinsics.j(currencyIso, "currencyIso");
        return new HybrisTotalTaxValue(code, value, currencyIso);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HybrisTotalTaxValue)) {
            return false;
        }
        HybrisTotalTaxValue hybrisTotalTaxValue = (HybrisTotalTaxValue) other;
        return Intrinsics.e(this.code, hybrisTotalTaxValue.code) && Intrinsics.e(this.value, hybrisTotalTaxValue.value) && Intrinsics.e(this.currencyIso, hybrisTotalTaxValue.currencyIso);
    }

    public int hashCode() {
        return (((this.code.hashCode() * 31) + this.value.hashCode()) * 31) + this.currencyIso.hashCode();
    }

    public String toString() {
        return "HybrisTotalTaxValue(code=" + this.code + ", value=" + this.value + ", currencyIso=" + this.currencyIso + ')';
    }

    public HybrisTotalTaxValue(@g(name = "code") String code, @g(name = "value") HybrisPrice value, @g(name = "currencyIso") String currencyIso) {
        Intrinsics.j(code, "code");
        Intrinsics.j(value, "value");
        Intrinsics.j(currencyIso, "currencyIso");
        this.code = code;
        this.value = value;
        this.currencyIso = currencyIso;
    }

    /* renamed from: a, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: b, reason: from getter */
    public final String getCurrencyIso() {
        return this.currencyIso;
    }

    /* renamed from: c, reason: from getter */
    public final HybrisPrice getValue() {
        return this.value;
    }

    public /* synthetic */ HybrisTotalTaxValue(String str, HybrisPrice hybrisPrice, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "-1" : str, (i10 & 2) != 0 ? new HybrisPrice(null, null, null, null, 0.0d, null, null, l3.f93324d, null) : hybrisPrice, (i10 & 4) != 0 ? "" : str2);
    }
}
