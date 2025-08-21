package Ki;

import androidx.compose.ui.text.TextStyle;
import kotlin.FontWeight;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LKi/h;", "", "LKi/W;", "transformations", "LKi/I;", "One", "<init>", "(LKi/W;LKi/I;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LKi/W;", "getTransformations", "()LKi/W;", "b", "LKi/I;", "c", "()LKi/I;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Ki.h, reason: case insensitive filesystem and from toString */
/* loaded from: classes8.dex */
public final /* data */ class Detail {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final W transformations;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final I One;

    public Detail(W transformations, I One) {
        Intrinsics.j(transformations, "transformations");
        Intrinsics.j(One, "One");
        this.transformations = transformations;
        this.One = One;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Detail)) {
            return false;
        }
        Detail detail = (Detail) other;
        return Intrinsics.e(this.transformations, detail.transformations) && Intrinsics.e(this.One, detail.One);
    }

    /* renamed from: c, reason: from getter */
    public final I getOne() {
        return this.One;
    }

    public int hashCode() {
        return (this.transformations.hashCode() * 31) + this.One.hashCode();
    }

    public String toString() {
        return "Detail(transformations=" + this.transformations + ", One=" + this.One + ')';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextStyle b(W w10) {
        return new TextStyle(w10.getAdsTextColor01(), w10.getAdsFontSize01(), FontWeight.INSTANCE.e(), null, null, w10.getAdsFontFamilyProduct(), null, w10.getAdsLetterSpacing02(), null, null, null, 0L, null, null, null, 0, 0, w10.getAdsLineHeight02(), null, null, null, 0, 0, null, 16645976, null);
    }

    public /* synthetic */ Detail(final W w10, I i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(w10, (i11 & 2) != 0 ? new I() { // from class: Ki.g
            @Override // Ki.I
            public final TextStyle getStyle() {
                return Detail.b(w10);
            }
        } : i10);
    }
}
