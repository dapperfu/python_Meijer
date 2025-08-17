package kotlin;

import B0.RippleAlpha;
import V0.C5346q0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Lx0/W0;", "", "LV0/q0;", "color", "LB0/b;", "rippleAlpha", "<init>", "(JLB0/b;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "J", "()J", "b", "LB0/b;", "()LB0/b;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: x0.W0, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
public final class RippleConfiguration {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long color;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final RippleAlpha rippleAlpha;

    public /* synthetic */ RippleConfiguration(long j10, RippleAlpha rippleAlpha, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, rippleAlpha);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RippleConfiguration)) {
            return false;
        }
        RippleConfiguration rippleConfiguration = (RippleConfiguration) other;
        return C5346q0.s(this.color, rippleConfiguration.color) && Intrinsics.e(this.rippleAlpha, rippleConfiguration.rippleAlpha);
    }

    private RippleConfiguration(long j10, RippleAlpha rippleAlpha) {
        this.color = j10;
        this.rippleAlpha = rippleAlpha;
    }

    /* renamed from: a, reason: from getter */
    public final long getColor() {
        return this.color;
    }

    /* renamed from: b, reason: from getter */
    public final RippleAlpha getRippleAlpha() {
        return this.rippleAlpha;
    }

    public int hashCode() {
        int iY = C5346q0.y(this.color) * 31;
        RippleAlpha rippleAlpha = this.rippleAlpha;
        return iY + (rippleAlpha != null ? rippleAlpha.hashCode() : 0);
    }

    public String toString() {
        return "RippleConfiguration(color=" + ((Object) C5346q0.z(this.color)) + ", rippleAlpha=" + this.rippleAlpha + ')';
    }

    public /* synthetic */ RippleConfiguration(long j10, RippleAlpha rippleAlpha, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C5346q0.INSTANCE.j() : j10, (i10 & 2) != 0 ? null : rippleAlpha, null);
    }
}
