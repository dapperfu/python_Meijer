package Hr;

import ak.AbstractC5607a;
import androidx.compose.runtime.InterfaceC5730l0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yi.EnumC18214a;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u0017"}, d2 = {"LHr/a;", "", "Landroidx/compose/runtime/l0;", "Lak/a;", "clippableCouponText", "Lyi/a;", "clippableCouponState", "<init>", "(Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/runtime/l0;", "b", "()Landroidx/compose/runtime/l0;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Hr.a, reason: from toString */
/* loaded from: classes11.dex */
public final /* data */ class ClippableCouponDecorator {

    /* renamed from: c, reason: collision with root package name */
    public static final int f13160c = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC5730l0<AbstractC5607a> clippableCouponText;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC5730l0<EnumC18214a> clippableCouponState;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClippableCouponDecorator)) {
            return false;
        }
        ClippableCouponDecorator clippableCouponDecorator = (ClippableCouponDecorator) other;
        return Intrinsics.e(this.clippableCouponText, clippableCouponDecorator.clippableCouponText) && Intrinsics.e(this.clippableCouponState, clippableCouponDecorator.clippableCouponState);
    }

    public ClippableCouponDecorator(InterfaceC5730l0<AbstractC5607a> clippableCouponText, InterfaceC5730l0<EnumC18214a> clippableCouponState) {
        Intrinsics.j(clippableCouponText, "clippableCouponText");
        Intrinsics.j(clippableCouponState, "clippableCouponState");
        this.clippableCouponText = clippableCouponText;
        this.clippableCouponState = clippableCouponState;
    }

    public final InterfaceC5730l0<EnumC18214a> a() {
        return this.clippableCouponState;
    }

    public final InterfaceC5730l0<AbstractC5607a> b() {
        return this.clippableCouponText;
    }

    public int hashCode() {
        return (this.clippableCouponText.hashCode() * 31) + this.clippableCouponState.hashCode();
    }

    public String toString() {
        return "ClippableCouponDecorator(clippableCouponText=" + this.clippableCouponText + ", clippableCouponState=" + this.clippableCouponState + ')';
    }
}
