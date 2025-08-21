package Ki;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Deprecated
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010\u001b\u0012\u0004\b\"\u0010\u001f\u001a\u0004\b!\u0010\u001dR \u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010\u001b\u0012\u0004\b%\u0010\u001f\u001a\u0004\b$\u0010\u001dR \u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010\u001b\u0012\u0004\b(\u0010\u001f\u001a\u0004\b'\u0010\u001dR \u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010\u001b\u0012\u0004\b+\u0010\u001f\u001a\u0004\b*\u0010\u001d¨\u0006,"}, d2 = {"LKi/s;", "", "LKi/W;", "transformations", "LKi/I;", "One", "Two", "Three", "Four", "Five", "<init>", "(LKi/W;LKi/I;LKi/I;LKi/I;LKi/I;LKi/I;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LKi/W;", "getTransformations", "()LKi/W;", "b", "LKi/I;", "getOne", "()LKi/I;", "getOne$annotations", "()V", "c", "getTwo", "getTwo$annotations", "d", "getThree", "getThree$annotations", "e", "getFour", "getFour$annotations", "f", "getFive", "getFive$annotations", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Ki.s, reason: case insensitive filesystem and from toString */
/* loaded from: classes8.dex */
public final /* data */ class Prices {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final W transformations;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final I One;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final I Two;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final I Three;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final I Four;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final I Five;

    public Prices(W transformations, I One, I Two, I Three, I Four, I Five) {
        Intrinsics.j(transformations, "transformations");
        Intrinsics.j(One, "One");
        Intrinsics.j(Two, "Two");
        Intrinsics.j(Three, "Three");
        Intrinsics.j(Four, "Four");
        Intrinsics.j(Five, "Five");
        this.transformations = transformations;
        this.One = One;
        this.Two = Two;
        this.Three = Three;
        this.Four = Four;
        this.Five = Five;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Prices)) {
            return false;
        }
        Prices prices = (Prices) other;
        return Intrinsics.e(this.transformations, prices.transformations) && Intrinsics.e(this.One, prices.One) && Intrinsics.e(this.Two, prices.Two) && Intrinsics.e(this.Three, prices.Three) && Intrinsics.e(this.Four, prices.Four) && Intrinsics.e(this.Five, prices.Five);
    }

    public int hashCode() {
        return (((((((((this.transformations.hashCode() * 31) + this.One.hashCode()) * 31) + this.Two.hashCode()) * 31) + this.Three.hashCode()) * 31) + this.Four.hashCode()) * 31) + this.Five.hashCode();
    }

    public String toString() {
        return "Prices(transformations=" + this.transformations + ", One=" + this.One + ", Two=" + this.Two + ", Three=" + this.Three + ", Four=" + this.Four + ", Five=" + this.Five + ')';
    }

    public /* synthetic */ Prices(W w10, I i10, I i11, I i12, I i13, I i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(w10, (i15 & 2) != 0 ? new Values(w10, null, null, null, null, null, 62, null).getOne() : i10, (i15 & 4) != 0 ? new Values(w10, null, null, null, null, null, 62, null).getTwo() : i11, (i15 & 8) != 0 ? new Values(w10, null, null, null, null, null, 62, null).getThree() : i12, (i15 & 16) != 0 ? new Values(w10, null, null, null, null, null, 62, null).getFour() : i13, (i15 & 32) != 0 ? new Values(w10, null, null, null, null, null, 62, null).getFive() : i14);
    }
}
