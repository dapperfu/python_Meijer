package com.meijer.mobile.shoppinglist.teacherlists.ux;

import android.graphics.Rect;
import com.meijer.mobile.shoppinglist.teacherlists.ux.v1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/shoppinglist/teacherlists/ux/q1;", "", "", "productCode", "", "quantityToUpdate", "Landroid/graphics/Rect;", "stepperHitRect", "<init>", "(Ljava/lang/String;DLandroid/graphics/Rect;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "D", "getQuantityToUpdate", "()D", "c", "Landroid/graphics/Rect;", "()Landroid/graphics/Rect;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.q1, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class StepperStateChangedAction implements v1.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productCode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final double quantityToUpdate;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Rect stepperHitRect;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StepperStateChangedAction)) {
            return false;
        }
        StepperStateChangedAction stepperStateChangedAction = (StepperStateChangedAction) other;
        return Intrinsics.e(this.productCode, stepperStateChangedAction.productCode) && Double.compare(this.quantityToUpdate, stepperStateChangedAction.quantityToUpdate) == 0 && Intrinsics.e(this.stepperHitRect, stepperStateChangedAction.stepperHitRect);
    }

    public int hashCode() {
        String str = this.productCode;
        return ((((str == null ? 0 : str.hashCode()) * 31) + Double.hashCode(this.quantityToUpdate)) * 31) + this.stepperHitRect.hashCode();
    }

    public String toString() {
        return "StepperStateChangedAction(productCode=" + this.productCode + ", quantityToUpdate=" + this.quantityToUpdate + ", stepperHitRect=" + this.stepperHitRect + ')';
    }

    public StepperStateChangedAction(String str, double d10, Rect stepperHitRect) {
        Intrinsics.j(stepperHitRect, "stepperHitRect");
        this.productCode = str;
        this.quantityToUpdate = d10;
        this.stepperHitRect = stepperHitRect;
    }

    /* renamed from: a, reason: from getter */
    public final String getProductCode() {
        return this.productCode;
    }

    /* renamed from: b, reason: from getter */
    public final Rect getStepperHitRect() {
        return this.stepperHitRect;
    }
}
