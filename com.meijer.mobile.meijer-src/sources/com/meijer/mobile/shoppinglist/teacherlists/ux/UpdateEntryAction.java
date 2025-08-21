package com.meijer.mobile.shoppinglist.teacherlists.ux;

import Co.ProductFullDetails;
import android.graphics.Rect;
import com.meijer.mobile.shoppinglist.teacherlists.ux.v1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/meijer/mobile/shoppinglist/teacherlists/ux/s1;", "", "LCo/h;", "product", "", "quantityToUpdate", "Landroid/graphics/Rect;", "stepperHitRect", "<init>", "(LCo/h;DLandroid/graphics/Rect;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LCo/h;", "()LCo/h;", "b", "D", "()D", "c", "Landroid/graphics/Rect;", "getStepperHitRect", "()Landroid/graphics/Rect;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.s1, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class UpdateEntryAction implements v1.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductFullDetails product;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final double quantityToUpdate;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Rect stepperHitRect;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateEntryAction)) {
            return false;
        }
        UpdateEntryAction updateEntryAction = (UpdateEntryAction) other;
        return Intrinsics.e(this.product, updateEntryAction.product) && Double.compare(this.quantityToUpdate, updateEntryAction.quantityToUpdate) == 0 && Intrinsics.e(this.stepperHitRect, updateEntryAction.stepperHitRect);
    }

    public int hashCode() {
        return (((this.product.hashCode() * 31) + Double.hashCode(this.quantityToUpdate)) * 31) + this.stepperHitRect.hashCode();
    }

    public String toString() {
        return "UpdateEntryAction(product=" + this.product + ", quantityToUpdate=" + this.quantityToUpdate + ", stepperHitRect=" + this.stepperHitRect + ')';
    }

    public UpdateEntryAction(ProductFullDetails product, double d10, Rect stepperHitRect) {
        Intrinsics.j(product, "product");
        Intrinsics.j(stepperHitRect, "stepperHitRect");
        this.product = product;
        this.quantityToUpdate = d10;
        this.stepperHitRect = stepperHitRect;
    }

    /* renamed from: a, reason: from getter */
    public final ProductFullDetails getProduct() {
        return this.product;
    }

    /* renamed from: b, reason: from getter */
    public final double getQuantityToUpdate() {
        return this.quantityToUpdate;
    }
}
