package com.meijer.mobile.shoppinglist.teacherlists.ux;

import android.graphics.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/meijer/mobile/shoppinglist/teacherlists/ux/b;", "", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "resourceId", "Landroid/graphics/Rect;", "stepperHitRect", "", "loadingState", "<init>", "(Ljava/lang/String;Landroid/graphics/Rect;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Landroid/graphics/Rect;", "getStepperHitRect", "()Landroid/graphics/Rect;", "c", "Z", "getLoadingState", "()Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.b, reason: case insensitive filesystem and from toString */
/* loaded from: classes12.dex */
public final /* data */ class EntryInQtyStepperInteraction {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String resourceId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Rect stepperHitRect;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean loadingState;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EntryInQtyStepperInteraction)) {
            return false;
        }
        EntryInQtyStepperInteraction entryInQtyStepperInteraction = (EntryInQtyStepperInteraction) other;
        return Intrinsics.e(this.resourceId, entryInQtyStepperInteraction.resourceId) && Intrinsics.e(this.stepperHitRect, entryInQtyStepperInteraction.stepperHitRect) && this.loadingState == entryInQtyStepperInteraction.loadingState;
    }

    public int hashCode() {
        return (((this.resourceId.hashCode() * 31) + this.stepperHitRect.hashCode()) * 31) + Boolean.hashCode(this.loadingState);
    }

    public String toString() {
        return "EntryInQtyStepperInteraction(resourceId=" + this.resourceId + ", stepperHitRect=" + this.stepperHitRect + ", loadingState=" + this.loadingState + ')';
    }

    public EntryInQtyStepperInteraction(String resourceId, Rect stepperHitRect, boolean z10) {
        Intrinsics.j(resourceId, "resourceId");
        Intrinsics.j(stepperHitRect, "stepperHitRect");
        this.resourceId = resourceId;
        this.stepperHitRect = stepperHitRect;
        this.loadingState = z10;
    }

    /* renamed from: a, reason: from getter */
    public final String getResourceId() {
        return this.resourceId;
    }
}
