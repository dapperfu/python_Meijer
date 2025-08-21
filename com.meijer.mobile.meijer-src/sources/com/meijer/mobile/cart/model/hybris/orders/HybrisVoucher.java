package com.meijer.mobile.cart.model.hybris.orders;

import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\f\b\u0003\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u000b\u001a\u00020\n\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u000e\u001a\u00020\r\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0082\u0001\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\f\b\u0003\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\b\b\u0003\u0010\b\u001a\u00020\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\u000b\u001a\u00020\n2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\u000e\u001a\u00020\r2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u001b\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b*\u0010\"\u001a\u0004\b*\u0010\u0017R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b.\u0010\"\u001a\u0004\b.\u0010\u0017R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b/\u0010\"\u001a\u0004\b/\u0010\u0017R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b0\u0010\"\u001a\u0004\b0\u0010\u0017¨\u00061"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/orders/HybrisVoucher;", "", "Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;", "appliedValue", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "code", "Lcom/meijer/mobile/cart/model/hybris/orders/HybrisCurrency;", "currency", "description", "", "freeShipping", "name", "", "value", "valueFormatted", "valueString", "voucherCode", "<init>", "(Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Ljava/lang/String;Lcom/meijer/mobile/cart/model/hybris/orders/HybrisCurrency;Ljava/lang/String;ZLjava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Ljava/lang/String;Lcom/meijer/mobile/cart/model/hybris/orders/HybrisCurrency;Ljava/lang/String;ZLjava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/cart/model/hybris/orders/HybrisVoucher;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;", "()Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;", "b", "Ljava/lang/String;", "c", "Lcom/meijer/mobile/cart/model/hybris/orders/HybrisCurrency;", "()Lcom/meijer/mobile/cart/model/hybris/orders/HybrisCurrency;", "d", "e", "Z", "()Z", "f", "g", "D", "()D", "h", "i", "j", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class HybrisVoucher {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice appliedValue;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String code;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisCurrency currency;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean freeShipping;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final double value;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String valueFormatted;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String valueString;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String voucherCode;

    public HybrisVoucher() {
        this(null, null, null, null, false, null, 0.0d, null, null, null, 1023, null);
    }

    public final HybrisVoucher copy(@g(name = "appliedValue") HybrisPrice appliedValue, @g(name = "code") String code, @g(name = "currency") HybrisCurrency currency, @g(name = "description") String description, @g(name = "freeShipping") boolean freeShipping, @g(name = "name") String name, @g(name = "value") double value, @g(name = "valueFormatted") String valueFormatted, @g(name = "valueString") String valueString, @g(name = "voucherCode") String voucherCode) {
        Intrinsics.j(appliedValue, "appliedValue");
        Intrinsics.j(code, "code");
        Intrinsics.j(currency, "currency");
        return new HybrisVoucher(appliedValue, code, currency, description, freeShipping, name, value, valueFormatted, valueString, voucherCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HybrisVoucher)) {
            return false;
        }
        HybrisVoucher hybrisVoucher = (HybrisVoucher) other;
        return Intrinsics.e(this.appliedValue, hybrisVoucher.appliedValue) && Intrinsics.e(this.code, hybrisVoucher.code) && Intrinsics.e(this.currency, hybrisVoucher.currency) && Intrinsics.e(this.description, hybrisVoucher.description) && this.freeShipping == hybrisVoucher.freeShipping && Intrinsics.e(this.name, hybrisVoucher.name) && Double.compare(this.value, hybrisVoucher.value) == 0 && Intrinsics.e(this.valueFormatted, hybrisVoucher.valueFormatted) && Intrinsics.e(this.valueString, hybrisVoucher.valueString) && Intrinsics.e(this.voucherCode, hybrisVoucher.voucherCode);
    }

    public int hashCode() {
        int iHashCode = ((((this.appliedValue.hashCode() * 31) + this.code.hashCode()) * 31) + this.currency.hashCode()) * 31;
        String str = this.description;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.freeShipping)) * 31;
        String str2 = this.name;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Double.hashCode(this.value)) * 31;
        String str3 = this.valueFormatted;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.valueString;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.voucherCode;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "HybrisVoucher(appliedValue=" + this.appliedValue + ", code=" + this.code + ", currency=" + this.currency + ", description=" + this.description + ", freeShipping=" + this.freeShipping + ", name=" + this.name + ", value=" + this.value + ", valueFormatted=" + this.valueFormatted + ", valueString=" + this.valueString + ", voucherCode=" + this.voucherCode + ')';
    }

    public HybrisVoucher(@g(name = "appliedValue") HybrisPrice appliedValue, @g(name = "code") String code, @g(name = "currency") HybrisCurrency currency, @g(name = "description") String str, @g(name = "freeShipping") boolean z10, @g(name = "name") String str2, @g(name = "value") double d10, @g(name = "valueFormatted") String str3, @g(name = "valueString") String str4, @g(name = "voucherCode") String str5) {
        Intrinsics.j(appliedValue, "appliedValue");
        Intrinsics.j(code, "code");
        Intrinsics.j(currency, "currency");
        this.appliedValue = appliedValue;
        this.code = code;
        this.currency = currency;
        this.description = str;
        this.freeShipping = z10;
        this.name = str2;
        this.value = d10;
        this.valueFormatted = str3;
        this.valueString = str4;
        this.voucherCode = str5;
    }

    /* renamed from: a, reason: from getter */
    public final HybrisPrice getAppliedValue() {
        return this.appliedValue;
    }

    /* renamed from: b, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: c, reason: from getter */
    public final HybrisCurrency getCurrency() {
        return this.currency;
    }

    /* renamed from: d, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getFreeShipping() {
        return this.freeShipping;
    }

    /* renamed from: f, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: g, reason: from getter */
    public final double getValue() {
        return this.value;
    }

    /* renamed from: h, reason: from getter */
    public final String getValueFormatted() {
        return this.valueFormatted;
    }

    /* renamed from: i, reason: from getter */
    public final String getValueString() {
        return this.valueString;
    }

    /* renamed from: j, reason: from getter */
    public final String getVoucherCode() {
        return this.voucherCode;
    }

    public /* synthetic */ HybrisVoucher(HybrisPrice hybrisPrice, String str, HybrisCurrency hybrisCurrency, String str2, boolean z10, String str3, double d10, String str4, String str5, String str6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new HybrisPrice(null, null, null, null, 0.0d, null, null, l3.f93324d, null) : hybrisPrice, (i10 & 2) != 0 ? "-1" : str, (i10 & 4) != 0 ? new HybrisCurrency(false, null, null, null, 15, null) : hybrisCurrency, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? null : str3, (i10 & 64) != 0 ? 0.0d : d10, (i10 & 128) != 0 ? null : str4, (i10 & 256) != 0 ? null : str5, (i10 & 512) != 0 ? null : str6);
    }
}
