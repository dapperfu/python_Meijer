package com.meijer.mobile.storeinfo.api.model;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import j$.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import pk.EnumC16456b;
import pk.FuelPrice;
import uh.j;
import wk.C17898a;
import wk.d;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0001\u0015B)\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ2\u0010\n\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u0015\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010\r¨\u0006\""}, d2 = {"Lcom/meijer/mobile/storeinfo/api/model/FuelPrices;", "", "Lpk/b;", "fuelType", "", "fuelPrice", "", "priceEffectiveDate", "<init>", "(Lpk/b;DLjava/lang/String;)V", "copy", "(Lpk/b;DLjava/lang/String;)Lcom/meijer/mobile/storeinfo/api/model/FuelPrices;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lpk/b;", "b", "()Lpk/b;", "setFuelType", "(Lpk/b;)V", "D", "()D", "setFuelPrice", "(D)V", "c", "Ljava/lang/String;", "d", "storeinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FuelPrices {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private EnumC16456b fuelType;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private double fuelPrice;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String priceEffectiveDate;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/meijer/mobile/storeinfo/api/model/FuelPrices$a;", "", "<init>", "()V", "Lcom/meijer/mobile/storeinfo/api/model/FuelPrices;", "Lpk/a;", "a", "(Lcom/meijer/mobile/storeinfo/api/model/FuelPrices;)Lpk/a;", "storeinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.storeinfo.api.model.FuelPrices$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final FuelPrice a(FuelPrices fuelPrices) {
            Intrinsics.j(fuelPrices, "<this>");
            double fuelPrice = fuelPrices.getFuelPrice();
            EnumC16456b fuelType = fuelPrices.getFuelType();
            String priceEffectiveDate = fuelPrices.getPriceEffectiveDate();
            return new FuelPrice(fuelPrice, fuelType, priceEffectiveDate != null ? (LocalDateTime) d.b(priceEffectiveDate, C17898a.f167225a.s(), new j()) : null);
        }
    }

    public FuelPrices() {
        this(null, 0.0d, null, 7, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuelPrices)) {
            return false;
        }
        FuelPrices fuelPrices = (FuelPrices) other;
        return this.fuelType == fuelPrices.fuelType && Double.compare(this.fuelPrice, fuelPrices.fuelPrice) == 0 && Intrinsics.e(this.priceEffectiveDate, fuelPrices.priceEffectiveDate);
    }

    public int hashCode() {
        EnumC16456b enumC16456b = this.fuelType;
        int iHashCode = (((enumC16456b == null ? 0 : enumC16456b.hashCode()) * 31) + Double.hashCode(this.fuelPrice)) * 31;
        String str = this.priceEffectiveDate;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "FuelPrices(fuelType=" + this.fuelType + ", fuelPrice=" + this.fuelPrice + ", priceEffectiveDate=" + this.priceEffectiveDate + ')';
    }

    public FuelPrices(@g(name = "FuelType") EnumC16456b enumC16456b, @g(name = "FuelPrice") double d10, @g(name = "PriceEffectiveDate") String str) {
        this.fuelType = enumC16456b;
        this.fuelPrice = d10;
        this.priceEffectiveDate = str;
    }

    /* renamed from: a, reason: from getter */
    public final double getFuelPrice() {
        return this.fuelPrice;
    }

    /* renamed from: b, reason: from getter */
    public final EnumC16456b getFuelType() {
        return this.fuelType;
    }

    /* renamed from: c, reason: from getter */
    public final String getPriceEffectiveDate() {
        return this.priceEffectiveDate;
    }

    public final FuelPrices copy(@g(name = "FuelType") EnumC16456b fuelType, @g(name = "FuelPrice") double fuelPrice, @g(name = "PriceEffectiveDate") String priceEffectiveDate) {
        return new FuelPrices(fuelType, fuelPrice, priceEffectiveDate);
    }

    public /* synthetic */ FuelPrices(EnumC16456b enumC16456b, double d10, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : enumC16456b, (i10 & 2) != 0 ? 0.0d : d10, (i10 & 4) != 0 ? "" : str);
    }
}
