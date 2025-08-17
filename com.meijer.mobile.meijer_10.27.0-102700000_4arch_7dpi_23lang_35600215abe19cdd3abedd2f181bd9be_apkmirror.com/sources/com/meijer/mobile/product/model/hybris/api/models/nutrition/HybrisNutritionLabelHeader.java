package com.meijer.mobile.product.model.hybris.api.models.nutrition;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\n\u0010\u000bJD\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001a\u0010\u000fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0019\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/meijer/mobile/product/model/hybris/api/models/nutrition/HybrisNutritionLabelHeader;", "", "", "name", "servingsPerContainer", "", "Lcom/meijer/mobile/product/model/hybris/api/models/nutrition/HybrisServingSize;", "servingSizes", "Lcom/meijer/mobile/product/model/hybris/api/models/nutrition/HybrisNutrient;", "nutrients", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lcom/meijer/mobile/product/model/hybris/api/models/nutrition/HybrisNutritionLabelHeader;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "d", "c", "Ljava/util/List;", "()Ljava/util/List;", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class HybrisNutritionLabelHeader {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String servingsPerContainer;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<HybrisServingSize> servingSizes;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<HybrisNutrient> nutrients;

    public HybrisNutritionLabelHeader() {
        this(null, null, null, null, 15, null);
    }

    public final HybrisNutritionLabelHeader copy(@g(name = "pn") String name, @g(name = "spc") String servingsPerContainer, @g(name = "ss") List<HybrisServingSize> servingSizes, @g(name = "n") List<HybrisNutrient> nutrients) {
        Intrinsics.j(name, "name");
        Intrinsics.j(servingsPerContainer, "servingsPerContainer");
        Intrinsics.j(servingSizes, "servingSizes");
        Intrinsics.j(nutrients, "nutrients");
        return new HybrisNutritionLabelHeader(name, servingsPerContainer, servingSizes, nutrients);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HybrisNutritionLabelHeader)) {
            return false;
        }
        HybrisNutritionLabelHeader hybrisNutritionLabelHeader = (HybrisNutritionLabelHeader) other;
        return Intrinsics.e(this.name, hybrisNutritionLabelHeader.name) && Intrinsics.e(this.servingsPerContainer, hybrisNutritionLabelHeader.servingsPerContainer) && Intrinsics.e(this.servingSizes, hybrisNutritionLabelHeader.servingSizes) && Intrinsics.e(this.nutrients, hybrisNutritionLabelHeader.nutrients);
    }

    public int hashCode() {
        return (((((this.name.hashCode() * 31) + this.servingsPerContainer.hashCode()) * 31) + this.servingSizes.hashCode()) * 31) + this.nutrients.hashCode();
    }

    public String toString() {
        return "HybrisNutritionLabelHeader(name=" + this.name + ", servingsPerContainer=" + this.servingsPerContainer + ", servingSizes=" + this.servingSizes + ", nutrients=" + this.nutrients + ')';
    }

    public HybrisNutritionLabelHeader(@g(name = "pn") String name, @g(name = "spc") String servingsPerContainer, @g(name = "ss") List<HybrisServingSize> servingSizes, @g(name = "n") List<HybrisNutrient> nutrients) {
        Intrinsics.j(name, "name");
        Intrinsics.j(servingsPerContainer, "servingsPerContainer");
        Intrinsics.j(servingSizes, "servingSizes");
        Intrinsics.j(nutrients, "nutrients");
        this.name = name;
        this.servingsPerContainer = servingsPerContainer;
        this.servingSizes = servingSizes;
        this.nutrients = nutrients;
    }

    /* renamed from: a, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final List<HybrisNutrient> b() {
        return this.nutrients;
    }

    public final List<HybrisServingSize> c() {
        return this.servingSizes;
    }

    /* renamed from: d, reason: from getter */
    public final String getServingsPerContainer() {
        return this.servingsPerContainer;
    }

    public /* synthetic */ HybrisNutritionLabelHeader(String str, String str2, List list, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? CollectionsKt.m() : list, (i10 & 8) != 0 ? CollectionsKt.m() : list2);
    }
}
