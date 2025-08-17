package com.meijer.mobile.product.model.hybris.api.models.pricing;

import com.medallia.digital.mobilesdk.l3;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0001\u0018BW\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ`\u0010\r\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\b\u001a\u00020\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001b\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u0010R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\"\u001a\u0004\b\u0018\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b\u001d\u0010\u0010¨\u0006%"}, d2 = {"Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;", "", "", "currencyIso", "formattedValue", "priceType", "unit", "", "value", "averagePoundEach", "priceText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/Double;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/Double;Ljava/lang/String;)Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "e", "d", "f", "D", "g", "()D", "Ljava/lang/Double;", "()Ljava/lang/Double;", "h", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class HybrisPrice {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String currencyIso;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String formattedValue;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String priceType;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String unit;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final double value;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double averagePoundEach;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String priceText;

    public HybrisPrice() {
        this(null, null, null, null, 0.0d, null, null, l3.f92485d, null);
    }

    public final HybrisPrice copy(@g(name = "currencyIso") String currencyIso, @g(name = "formattedValue") String formattedValue, @g(name = "priceType") String priceType, @g(name = "unit") String unit, @g(name = "value") double value, @g(name = "averagePoundEach") Double averagePoundEach, @g(name = "priceText") String priceText) {
        Intrinsics.j(formattedValue, "formattedValue");
        return new HybrisPrice(currencyIso, formattedValue, priceType, unit, value, averagePoundEach, priceText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HybrisPrice)) {
            return false;
        }
        HybrisPrice hybrisPrice = (HybrisPrice) other;
        return Intrinsics.e(this.currencyIso, hybrisPrice.currencyIso) && Intrinsics.e(this.formattedValue, hybrisPrice.formattedValue) && Intrinsics.e(this.priceType, hybrisPrice.priceType) && Intrinsics.e(this.unit, hybrisPrice.unit) && Double.compare(this.value, hybrisPrice.value) == 0 && Intrinsics.e(this.averagePoundEach, hybrisPrice.averagePoundEach) && Intrinsics.e(this.priceText, hybrisPrice.priceText);
    }

    public int hashCode() {
        String str = this.currencyIso;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.formattedValue.hashCode()) * 31;
        String str2 = this.priceType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.unit;
        int iHashCode3 = (((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + Double.hashCode(this.value)) * 31;
        Double d10 = this.averagePoundEach;
        int iHashCode4 = (iHashCode3 + (d10 == null ? 0 : d10.hashCode())) * 31;
        String str4 = this.priceText;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "HybrisPrice(currencyIso=" + this.currencyIso + ", formattedValue=" + this.formattedValue + ", priceType=" + this.priceType + ", unit=" + this.unit + ", value=" + this.value + ", averagePoundEach=" + this.averagePoundEach + ", priceText=" + this.priceText + ')';
    }

    public HybrisPrice(@g(name = "currencyIso") String str, @g(name = "formattedValue") String formattedValue, @g(name = "priceType") String str2, @g(name = "unit") String str3, @g(name = "value") double d10, @g(name = "averagePoundEach") Double d11, @g(name = "priceText") String str4) {
        Intrinsics.j(formattedValue, "formattedValue");
        this.currencyIso = str;
        this.formattedValue = formattedValue;
        this.priceType = str2;
        this.unit = str3;
        this.value = d10;
        this.averagePoundEach = d11;
        this.priceText = str4;
    }

    /* renamed from: a, reason: from getter */
    public final Double getAveragePoundEach() {
        return this.averagePoundEach;
    }

    /* renamed from: b, reason: from getter */
    public final String getCurrencyIso() {
        return this.currencyIso;
    }

    /* renamed from: c, reason: from getter */
    public final String getFormattedValue() {
        return this.formattedValue;
    }

    /* renamed from: d, reason: from getter */
    public final String getPriceText() {
        return this.priceText;
    }

    /* renamed from: e, reason: from getter */
    public final String getPriceType() {
        return this.priceType;
    }

    /* renamed from: f, reason: from getter */
    public final String getUnit() {
        return this.unit;
    }

    /* renamed from: g, reason: from getter */
    public final double getValue() {
        return this.value;
    }

    public /* synthetic */ HybrisPrice(String str, String str2, String str3, String str4, double d10, Double d11, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "USD" : str, (i10 & 2) != 0 ? "$0.00" : str2, (i10 & 4) != 0 ? "BUY" : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? 0.0d : d10, (i10 & 32) != 0 ? Double.valueOf(0.0d) : d11, (i10 & 64) != 0 ? null : str5);
    }
}
