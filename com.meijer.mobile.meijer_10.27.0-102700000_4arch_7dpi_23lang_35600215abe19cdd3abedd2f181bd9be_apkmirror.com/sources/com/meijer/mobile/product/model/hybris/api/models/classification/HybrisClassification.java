package com.meijer.mobile.product.model.hybris.api.models.classification;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/product/model/hybris/api/models/classification/HybrisClassification;", "", "", "code", "", "Lcom/meijer/mobile/product/model/hybris/api/models/classification/HybrisClassificationFeature;", "features", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/meijer/mobile/product/model/hybris/api/models/classification/HybrisClassification;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/List;", "()Ljava/util/List;", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class HybrisClassification {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String code;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<HybrisClassificationFeature> features;

    /* JADX WARN: Multi-variable type inference failed */
    public HybrisClassification() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final HybrisClassification copy(@g(name = "code") String code, @g(name = "features") List<HybrisClassificationFeature> features) {
        Intrinsics.j(code, "code");
        Intrinsics.j(features, "features");
        return new HybrisClassification(code, features);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HybrisClassification)) {
            return false;
        }
        HybrisClassification hybrisClassification = (HybrisClassification) other;
        return Intrinsics.e(this.code, hybrisClassification.code) && Intrinsics.e(this.features, hybrisClassification.features);
    }

    public int hashCode() {
        return (this.code.hashCode() * 31) + this.features.hashCode();
    }

    public String toString() {
        return "HybrisClassification(code=" + this.code + ", features=" + this.features + ')';
    }

    public HybrisClassification(@g(name = "code") String code, @g(name = "features") List<HybrisClassificationFeature> features) {
        Intrinsics.j(code, "code");
        Intrinsics.j(features, "features");
        this.code = code;
        this.features = features;
    }

    /* renamed from: a, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    public final List<HybrisClassificationFeature> b() {
        return this.features;
    }

    public /* synthetic */ HybrisClassification(String str, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? CollectionsKt.m() : list);
    }
}
