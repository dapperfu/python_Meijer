package com.meijer.mobile.product.model.hybris.api.models.classification;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0003\u0010\t\u001a\u00020\u0002\u0012\b\b\u0003\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJH\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0003\u0010\t\u001a\u00020\u00022\b\b\u0003\u0010\n\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b\u001f\u0010\u0010R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b \u0010\u001b¨\u0006!"}, d2 = {"Lcom/meijer/mobile/product/model/hybris/api/models/classification/HybrisClassificationFeature;", "", "", "code", "", "comparable", "", "Lcom/meijer/mobile/product/model/hybris/api/models/classification/HybrisClassificationFeatureValue;", "featureValues", "name", "range", "<init>", "(Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Z)V", "copy", "(Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Z)Lcom/meijer/mobile/product/model/hybris/api/models/classification/HybrisClassificationFeature;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "e", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class HybrisClassificationFeature {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String code;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean comparable;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<HybrisClassificationFeatureValue> featureValues;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean range;

    public HybrisClassificationFeature() {
        this(null, false, null, null, false, 31, null);
    }

    public final HybrisClassificationFeature copy(@g(name = "code") String code, @g(name = "comparable") boolean comparable, @g(name = "featureValues") List<HybrisClassificationFeatureValue> featureValues, @g(name = "name") String name, @g(name = "range") boolean range) {
        Intrinsics.j(code, "code");
        Intrinsics.j(featureValues, "featureValues");
        Intrinsics.j(name, "name");
        return new HybrisClassificationFeature(code, comparable, featureValues, name, range);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HybrisClassificationFeature)) {
            return false;
        }
        HybrisClassificationFeature hybrisClassificationFeature = (HybrisClassificationFeature) other;
        return Intrinsics.e(this.code, hybrisClassificationFeature.code) && this.comparable == hybrisClassificationFeature.comparable && Intrinsics.e(this.featureValues, hybrisClassificationFeature.featureValues) && Intrinsics.e(this.name, hybrisClassificationFeature.name) && this.range == hybrisClassificationFeature.range;
    }

    public int hashCode() {
        return (((((((this.code.hashCode() * 31) + Boolean.hashCode(this.comparable)) * 31) + this.featureValues.hashCode()) * 31) + this.name.hashCode()) * 31) + Boolean.hashCode(this.range);
    }

    public String toString() {
        return "HybrisClassificationFeature(code=" + this.code + ", comparable=" + this.comparable + ", featureValues=" + this.featureValues + ", name=" + this.name + ", range=" + this.range + ')';
    }

    public HybrisClassificationFeature(@g(name = "code") String code, @g(name = "comparable") boolean z10, @g(name = "featureValues") List<HybrisClassificationFeatureValue> featureValues, @g(name = "name") String name, @g(name = "range") boolean z11) {
        Intrinsics.j(code, "code");
        Intrinsics.j(featureValues, "featureValues");
        Intrinsics.j(name, "name");
        this.code = code;
        this.comparable = z10;
        this.featureValues = featureValues;
        this.name = name;
        this.range = z11;
    }

    /* renamed from: a, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getComparable() {
        return this.comparable;
    }

    public final List<HybrisClassificationFeatureValue> c() {
        return this.featureValues;
    }

    /* renamed from: d, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getRange() {
        return this.range;
    }

    public /* synthetic */ HybrisClassificationFeature(String str, boolean z10, List list, String str2, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? CollectionsKt.m() : list, (i10 & 8) != 0 ? "" : str2, (i10 & 16) != 0 ? false : z11);
    }
}
