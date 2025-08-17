package ji;

import ji.q1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00010\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u001b"}, d2 = {"Lji/e1;", "", "Lji/q1$j;", "finalPrice", "regularPrice", "savingsAmount", "productHeading", "pricePerUnit", "<init>", "(Lji/q1$j;Lji/q1$j;Lji/q1$j;Lji/q1$j;Lji/q1$j;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lji/q1$j;", "()Lji/q1$j;", "b", "d", "c", "e", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ji.e1, reason: from toString */
/* loaded from: classes7.dex */
public final /* data */ class Labels {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.Label finalPrice;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.Label regularPrice;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.Label savingsAmount;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.Label productHeading;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.Label pricePerUnit;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Labels)) {
            return false;
        }
        Labels labels = (Labels) other;
        return Intrinsics.e(this.finalPrice, labels.finalPrice) && Intrinsics.e(this.regularPrice, labels.regularPrice) && Intrinsics.e(this.savingsAmount, labels.savingsAmount) && Intrinsics.e(this.productHeading, labels.productHeading) && Intrinsics.e(this.pricePerUnit, labels.pricePerUnit);
    }

    public Labels(q1.Label finalPrice, q1.Label regularPrice, q1.Label savingsAmount, q1.Label productHeading, q1.Label pricePerUnit) {
        Intrinsics.j(finalPrice, "finalPrice");
        Intrinsics.j(regularPrice, "regularPrice");
        Intrinsics.j(savingsAmount, "savingsAmount");
        Intrinsics.j(productHeading, "productHeading");
        Intrinsics.j(pricePerUnit, "pricePerUnit");
        this.finalPrice = finalPrice;
        this.regularPrice = regularPrice;
        this.savingsAmount = savingsAmount;
        this.productHeading = productHeading;
        this.pricePerUnit = pricePerUnit;
    }

    /* renamed from: a, reason: from getter */
    public final q1.Label getFinalPrice() {
        return this.finalPrice;
    }

    /* renamed from: b, reason: from getter */
    public final q1.Label getPricePerUnit() {
        return this.pricePerUnit;
    }

    /* renamed from: c, reason: from getter */
    public final q1.Label getProductHeading() {
        return this.productHeading;
    }

    /* renamed from: d, reason: from getter */
    public final q1.Label getRegularPrice() {
        return this.regularPrice;
    }

    /* renamed from: e, reason: from getter */
    public final q1.Label getSavingsAmount() {
        return this.savingsAmount;
    }

    public int hashCode() {
        return (((((((this.finalPrice.hashCode() * 31) + this.regularPrice.hashCode()) * 31) + this.savingsAmount.hashCode()) * 31) + this.productHeading.hashCode()) * 31) + this.pricePerUnit.hashCode();
    }

    public String toString() {
        return "Labels(finalPrice=" + this.finalPrice + ", regularPrice=" + this.regularPrice + ", savingsAmount=" + this.savingsAmount + ", productHeading=" + this.productHeading + ", pricePerUnit=" + this.pricePerUnit + ')';
    }
}
