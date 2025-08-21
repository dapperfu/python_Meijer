package com.meijer.mobile.cart.model.hybris;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ>\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u000eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0018\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u0015\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/HybrisProactiveSubstituteRequest;", "", "", "productCode", "substitutionNotes", "", "preferredProducts", "", "doNotSubstitute", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)Lcom/meijer/mobile/cart/model/hybris/HybrisProactiveSubstituteRequest;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "d", "Ljava/util/List;", "()Ljava/util/List;", "Z", "()Z", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class HybrisProactiveSubstituteRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productCode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String substitutionNotes;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> preferredProducts;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean doNotSubstitute;

    public HybrisProactiveSubstituteRequest(@g(name = "productCode") String productCode, @g(name = "substitutionNotes") String substitutionNotes, @g(name = "preferredProducts") List<String> preferredProducts, @g(name = "doNotSubstitute") boolean z10) {
        Intrinsics.j(productCode, "productCode");
        Intrinsics.j(substitutionNotes, "substitutionNotes");
        Intrinsics.j(preferredProducts, "preferredProducts");
        this.productCode = productCode;
        this.substitutionNotes = substitutionNotes;
        this.preferredProducts = preferredProducts;
        this.doNotSubstitute = z10;
    }

    public final HybrisProactiveSubstituteRequest copy(@g(name = "productCode") String productCode, @g(name = "substitutionNotes") String substitutionNotes, @g(name = "preferredProducts") List<String> preferredProducts, @g(name = "doNotSubstitute") boolean doNotSubstitute) {
        Intrinsics.j(productCode, "productCode");
        Intrinsics.j(substitutionNotes, "substitutionNotes");
        Intrinsics.j(preferredProducts, "preferredProducts");
        return new HybrisProactiveSubstituteRequest(productCode, substitutionNotes, preferredProducts, doNotSubstitute);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HybrisProactiveSubstituteRequest)) {
            return false;
        }
        HybrisProactiveSubstituteRequest hybrisProactiveSubstituteRequest = (HybrisProactiveSubstituteRequest) other;
        return Intrinsics.e(this.productCode, hybrisProactiveSubstituteRequest.productCode) && Intrinsics.e(this.substitutionNotes, hybrisProactiveSubstituteRequest.substitutionNotes) && Intrinsics.e(this.preferredProducts, hybrisProactiveSubstituteRequest.preferredProducts) && this.doNotSubstitute == hybrisProactiveSubstituteRequest.doNotSubstitute;
    }

    public int hashCode() {
        return (((((this.productCode.hashCode() * 31) + this.substitutionNotes.hashCode()) * 31) + this.preferredProducts.hashCode()) * 31) + Boolean.hashCode(this.doNotSubstitute);
    }

    public String toString() {
        return "HybrisProactiveSubstituteRequest(productCode=" + this.productCode + ", substitutionNotes=" + this.substitutionNotes + ", preferredProducts=" + this.preferredProducts + ", doNotSubstitute=" + this.doNotSubstitute + ')';
    }

    /* renamed from: a, reason: from getter */
    public final boolean getDoNotSubstitute() {
        return this.doNotSubstitute;
    }

    public final List<String> b() {
        return this.preferredProducts;
    }

    /* renamed from: c, reason: from getter */
    public final String getProductCode() {
        return this.productCode;
    }

    /* renamed from: d, reason: from getter */
    public final String getSubstitutionNotes() {
        return this.substitutionNotes;
    }

    public /* synthetic */ HybrisProactiveSubstituteRequest(String str, String str2, List list, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, list, (i10 & 8) != 0 ? false : z10);
    }
}
