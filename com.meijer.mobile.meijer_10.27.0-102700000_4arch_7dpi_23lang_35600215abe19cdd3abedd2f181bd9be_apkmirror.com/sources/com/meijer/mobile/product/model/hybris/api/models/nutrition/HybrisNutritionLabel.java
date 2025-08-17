package com.meijer.mobile.product.model.hybris.api.models.nutrition;

import com.meijer.mobile.core.util.moshi.Stringable;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\n\u0010\u000bJZ\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b\u001b\u0010\u001e¨\u0006!"}, d2 = {"Lcom/meijer/mobile/product/model/hybris/api/models/nutrition/HybrisNutritionLabel;", "", "Lcom/meijer/mobile/product/model/hybris/api/models/nutrition/HybrisNutritionLabelHeader;", "header", "", "Lcom/meijer/mobile/product/model/hybris/api/models/nutrition/HybrisNutrient;", "nutrients", "vitamins", "minerals", "micronutrients", "<init>", "(Lcom/meijer/mobile/product/model/hybris/api/models/nutrition/HybrisNutritionLabelHeader;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "copy", "(Lcom/meijer/mobile/product/model/hybris/api/models/nutrition/HybrisNutritionLabelHeader;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/meijer/mobile/product/model/hybris/api/models/nutrition/HybrisNutritionLabel;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/product/model/hybris/api/models/nutrition/HybrisNutritionLabelHeader;", "()Lcom/meijer/mobile/product/model/hybris/api/models/nutrition/HybrisNutritionLabelHeader;", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "c", "e", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class HybrisNutritionLabel {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisNutritionLabelHeader header;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<HybrisNutrient> nutrients;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<HybrisNutrient> vitamins;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<HybrisNutrient> minerals;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<HybrisNutrient> micronutrients;

    public HybrisNutritionLabel() {
        this(null, null, null, null, null, 31, null);
    }

    public final HybrisNutritionLabel copy(@g(name = "header") @Stringable HybrisNutritionLabelHeader header, @g(name = "main") @Stringable List<HybrisNutrient> nutrients, @g(name = "vitamins") @Stringable List<HybrisNutrient> vitamins, @g(name = "minerals") @Stringable List<HybrisNutrient> minerals, @g(name = "micronutrients") @Stringable List<HybrisNutrient> micronutrients) {
        Intrinsics.j(header, "header");
        Intrinsics.j(nutrients, "nutrients");
        Intrinsics.j(vitamins, "vitamins");
        Intrinsics.j(minerals, "minerals");
        Intrinsics.j(micronutrients, "micronutrients");
        return new HybrisNutritionLabel(header, nutrients, vitamins, minerals, micronutrients);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HybrisNutritionLabel)) {
            return false;
        }
        HybrisNutritionLabel hybrisNutritionLabel = (HybrisNutritionLabel) other;
        return Intrinsics.e(this.header, hybrisNutritionLabel.header) && Intrinsics.e(this.nutrients, hybrisNutritionLabel.nutrients) && Intrinsics.e(this.vitamins, hybrisNutritionLabel.vitamins) && Intrinsics.e(this.minerals, hybrisNutritionLabel.minerals) && Intrinsics.e(this.micronutrients, hybrisNutritionLabel.micronutrients);
    }

    public int hashCode() {
        return (((((((this.header.hashCode() * 31) + this.nutrients.hashCode()) * 31) + this.vitamins.hashCode()) * 31) + this.minerals.hashCode()) * 31) + this.micronutrients.hashCode();
    }

    public String toString() {
        return "HybrisNutritionLabel(header=" + this.header + ", nutrients=" + this.nutrients + ", vitamins=" + this.vitamins + ", minerals=" + this.minerals + ", micronutrients=" + this.micronutrients + ')';
    }

    public HybrisNutritionLabel(@g(name = "header") @Stringable HybrisNutritionLabelHeader header, @g(name = "main") @Stringable List<HybrisNutrient> nutrients, @g(name = "vitamins") @Stringable List<HybrisNutrient> vitamins, @g(name = "minerals") @Stringable List<HybrisNutrient> minerals, @g(name = "micronutrients") @Stringable List<HybrisNutrient> micronutrients) {
        Intrinsics.j(header, "header");
        Intrinsics.j(nutrients, "nutrients");
        Intrinsics.j(vitamins, "vitamins");
        Intrinsics.j(minerals, "minerals");
        Intrinsics.j(micronutrients, "micronutrients");
        this.header = header;
        this.nutrients = nutrients;
        this.vitamins = vitamins;
        this.minerals = minerals;
        this.micronutrients = micronutrients;
    }

    /* renamed from: a, reason: from getter */
    public final HybrisNutritionLabelHeader getHeader() {
        return this.header;
    }

    public final List<HybrisNutrient> b() {
        return this.micronutrients;
    }

    public final List<HybrisNutrient> c() {
        return this.minerals;
    }

    public final List<HybrisNutrient> d() {
        return this.nutrients;
    }

    public final List<HybrisNutrient> e() {
        return this.vitamins;
    }

    public /* synthetic */ HybrisNutritionLabel(HybrisNutritionLabelHeader hybrisNutritionLabelHeader, List list, List list2, List list3, List list4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new HybrisNutritionLabelHeader(null, null, null, null, 15, null) : hybrisNutritionLabelHeader, (i10 & 2) != 0 ? CollectionsKt.m() : list, (i10 & 4) != 0 ? CollectionsKt.m() : list2, (i10 & 8) != 0 ? CollectionsKt.m() : list3, (i10 & 16) != 0 ? CollectionsKt.m() : list4);
    }
}
