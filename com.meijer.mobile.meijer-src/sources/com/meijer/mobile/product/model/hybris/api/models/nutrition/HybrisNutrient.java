package com.meijer.mobile.product.model.hybris.api.models.nutrition;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJH\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u001a\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0018\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/product/model/hybris/api/models/nutrition/HybrisNutrient;", "", "", "name", "value", "unitOfMeasure", "dailyPercentageValue", "", "index", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/meijer/mobile/product/model/hybris/api/models/nutrition/HybrisNutrient;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "e", "d", "I", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class HybrisNutrient {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String value;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String unitOfMeasure;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String dailyPercentageValue;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final int index;

    public HybrisNutrient() {
        this(null, null, null, null, 0, 31, null);
    }

    public final HybrisNutrient copy(@g(name = "n") String name, @g(name = "v") String value, @g(name = "u") String unitOfMeasure, @g(name = "p") String dailyPercentageValue, @g(name = "i") int index) {
        Intrinsics.j(name, "name");
        return new HybrisNutrient(name, value, unitOfMeasure, dailyPercentageValue, index);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HybrisNutrient)) {
            return false;
        }
        HybrisNutrient hybrisNutrient = (HybrisNutrient) other;
        return Intrinsics.e(this.name, hybrisNutrient.name) && Intrinsics.e(this.value, hybrisNutrient.value) && Intrinsics.e(this.unitOfMeasure, hybrisNutrient.unitOfMeasure) && Intrinsics.e(this.dailyPercentageValue, hybrisNutrient.dailyPercentageValue) && this.index == hybrisNutrient.index;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.value;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.unitOfMeasure;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dailyPercentageValue;
        return ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + Integer.hashCode(this.index);
    }

    public String toString() {
        return "HybrisNutrient(name=" + this.name + ", value=" + this.value + ", unitOfMeasure=" + this.unitOfMeasure + ", dailyPercentageValue=" + this.dailyPercentageValue + ", index=" + this.index + ')';
    }

    public HybrisNutrient(@g(name = "n") String name, @g(name = "v") String str, @g(name = "u") String str2, @g(name = "p") String str3, @g(name = "i") int i10) {
        Intrinsics.j(name, "name");
        this.name = name;
        this.value = str;
        this.unitOfMeasure = str2;
        this.dailyPercentageValue = str3;
        this.index = i10;
    }

    /* renamed from: a, reason: from getter */
    public final String getDailyPercentageValue() {
        return this.dailyPercentageValue;
    }

    /* renamed from: b, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* renamed from: c, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: d, reason: from getter */
    public final String getUnitOfMeasure() {
        return this.unitOfMeasure;
    }

    /* renamed from: e, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public /* synthetic */ HybrisNutrient(String str, String str2, String str3, String str4, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? 0 : i10);
    }
}
