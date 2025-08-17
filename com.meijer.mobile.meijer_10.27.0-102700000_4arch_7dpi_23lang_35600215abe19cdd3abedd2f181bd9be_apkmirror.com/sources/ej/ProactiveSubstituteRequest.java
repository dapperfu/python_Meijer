package ej;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\rR\u001f\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0018\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u0014\u0010\u001e¨\u0006\u001f"}, d2 = {"Lej/y;", "", "Lmk/f;", "product", "", "substitutionNotes", "", "preferredProducts", "", "doNotSubstitute", "<init>", "(Lmk/f;Ljava/lang/String;Ljava/util/List;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lmk/f;", "c", "()Lmk/f;", "b", "Ljava/lang/String;", "d", "Ljava/util/List;", "()Ljava/util/List;", "Z", "()Z", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ej.y, reason: from toString */
/* loaded from: classes7.dex */
public final /* data */ class ProactiveSubstituteRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.f product;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String substitutionNotes;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<mk.f> preferredProducts;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean doNotSubstitute;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProactiveSubstituteRequest)) {
            return false;
        }
        ProactiveSubstituteRequest proactiveSubstituteRequest = (ProactiveSubstituteRequest) other;
        return Intrinsics.e(this.product, proactiveSubstituteRequest.product) && Intrinsics.e(this.substitutionNotes, proactiveSubstituteRequest.substitutionNotes) && Intrinsics.e(this.preferredProducts, proactiveSubstituteRequest.preferredProducts) && this.doNotSubstitute == proactiveSubstituteRequest.doNotSubstitute;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProactiveSubstituteRequest(mk.f product, String substitutionNotes, List<? extends mk.f> preferredProducts, boolean z10) {
        Intrinsics.j(product, "product");
        Intrinsics.j(substitutionNotes, "substitutionNotes");
        Intrinsics.j(preferredProducts, "preferredProducts");
        this.product = product;
        this.substitutionNotes = substitutionNotes;
        this.preferredProducts = preferredProducts;
        this.doNotSubstitute = z10;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getDoNotSubstitute() {
        return this.doNotSubstitute;
    }

    public final List<mk.f> b() {
        return this.preferredProducts;
    }

    /* renamed from: c, reason: from getter */
    public final mk.f getProduct() {
        return this.product;
    }

    /* renamed from: d, reason: from getter */
    public final String getSubstitutionNotes() {
        return this.substitutionNotes;
    }

    public int hashCode() {
        return (((((this.product.hashCode() * 31) + this.substitutionNotes.hashCode()) * 31) + this.preferredProducts.hashCode()) * 31) + Boolean.hashCode(this.doNotSubstitute);
    }

    public String toString() {
        return "ProactiveSubstituteRequest(product=" + this.product + ", substitutionNotes=" + this.substitutionNotes + ", preferredProducts=" + this.preferredProducts + ", doNotSubstitute=" + this.doNotSubstitute + ')';
    }
}
