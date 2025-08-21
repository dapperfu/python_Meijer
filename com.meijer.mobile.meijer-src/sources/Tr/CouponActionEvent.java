package Tr;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0012\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"LTr/a;", "", "", "titleId", "descriptionId", "Landroid/content/Intent;", "nextIntent", "<init>", "(IILandroid/content/Intent;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "Landroid/content/Intent;", "()Landroid/content/Intent;", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Tr.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes12.dex */
public final /* data */ class CouponActionEvent {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int titleId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int descriptionId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Intent nextIntent;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CouponActionEvent)) {
            return false;
        }
        CouponActionEvent couponActionEvent = (CouponActionEvent) other;
        return this.titleId == couponActionEvent.titleId && this.descriptionId == couponActionEvent.descriptionId && Intrinsics.e(this.nextIntent, couponActionEvent.nextIntent);
    }

    /* renamed from: a, reason: from getter */
    public final int getDescriptionId() {
        return this.descriptionId;
    }

    /* renamed from: b, reason: from getter */
    public final Intent getNextIntent() {
        return this.nextIntent;
    }

    /* renamed from: c, reason: from getter */
    public final int getTitleId() {
        return this.titleId;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.titleId) * 31) + Integer.hashCode(this.descriptionId)) * 31;
        Intent intent = this.nextIntent;
        return iHashCode + (intent == null ? 0 : intent.hashCode());
    }

    public String toString() {
        return "CouponActionEvent(titleId=" + this.titleId + ", descriptionId=" + this.descriptionId + ", nextIntent=" + this.nextIntent + ')';
    }

    public CouponActionEvent(int i10, int i11, Intent intent) {
        this.titleId = i10;
        this.descriptionId = i11;
        this.nextIntent = intent;
    }
}
