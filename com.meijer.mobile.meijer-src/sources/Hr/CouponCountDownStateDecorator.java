package Hr;

import androidx.compose.runtime.InterfaceC5872l0;
import bk.AbstractC6392a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import zi.EnumC18490a;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0016\u0010\u0019¨\u0006\u001a"}, d2 = {"LHr/e;", "", "Landroidx/compose/runtime/l0;", "Lbk/a;", "clippableCouponText", "Lzi/a;", "clippableCouponState", "<init>", "(Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;)V", "LHr/a;", "b", "()LHr/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/runtime/l0;", "getClippableCouponText", "()Landroidx/compose/runtime/l0;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Hr.e, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class CouponCountDownStateDecorator {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC5872l0<AbstractC6392a> clippableCouponText;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC5872l0<EnumC18490a> clippableCouponState;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CouponCountDownStateDecorator)) {
            return false;
        }
        CouponCountDownStateDecorator couponCountDownStateDecorator = (CouponCountDownStateDecorator) other;
        return Intrinsics.e(this.clippableCouponText, couponCountDownStateDecorator.clippableCouponText) && Intrinsics.e(this.clippableCouponState, couponCountDownStateDecorator.clippableCouponState);
    }

    public CouponCountDownStateDecorator(InterfaceC5872l0<AbstractC6392a> clippableCouponText, InterfaceC5872l0<EnumC18490a> clippableCouponState) {
        Intrinsics.j(clippableCouponText, "clippableCouponText");
        Intrinsics.j(clippableCouponState, "clippableCouponState");
        this.clippableCouponText = clippableCouponText;
        this.clippableCouponState = clippableCouponState;
    }

    public final InterfaceC5872l0<EnumC18490a> a() {
        return this.clippableCouponState;
    }

    public final ClippableCouponDecorator b() {
        return new ClippableCouponDecorator(this.clippableCouponText, this.clippableCouponState);
    }

    public int hashCode() {
        return (this.clippableCouponText.hashCode() * 31) + this.clippableCouponState.hashCode();
    }

    public String toString() {
        return "CouponCountDownStateDecorator(clippableCouponText=" + this.clippableCouponText + ", clippableCouponState=" + this.clippableCouponState + ')';
    }
}
