package Ji;

import androidx.compose.ui.text.TextStyle;
import kotlin.FontWeight;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001a¨\u0006\u001d"}, d2 = {"LJi/c;", "", "LJi/W;", "transformations", "LJi/I;", "One", "Two", "<init>", "(LJi/W;LJi/I;LJi/I;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LJi/W;", "getTransformations", "()LJi/W;", "b", "LJi/I;", "e", "()LJi/I;", "c", "f", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Ji.c, reason: case insensitive filesystem and from toString */
/* loaded from: classes7.dex */
public final /* data */ class Body {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final W transformations;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final I One;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final I Two;

    public Body(W transformations, I One, I Two) {
        Intrinsics.j(transformations, "transformations");
        Intrinsics.j(One, "One");
        Intrinsics.j(Two, "Two");
        this.transformations = transformations;
        this.One = One;
        this.Two = Two;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Body)) {
            return false;
        }
        Body body = (Body) other;
        return Intrinsics.e(this.transformations, body.transformations) && Intrinsics.e(this.One, body.One) && Intrinsics.e(this.Two, body.Two);
    }

    /* renamed from: e, reason: from getter */
    public final I getOne() {
        return this.One;
    }

    /* renamed from: f, reason: from getter */
    public final I getTwo() {
        return this.Two;
    }

    public int hashCode() {
        return (((this.transformations.hashCode() * 31) + this.One.hashCode()) * 31) + this.Two.hashCode();
    }

    public String toString() {
        return "Body(transformations=" + this.transformations + ", One=" + this.One + ", Two=" + this.Two + ')';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextStyle c(W w10) {
        return new TextStyle(w10.getAdsTextColor01(), w10.getAdsFontSize03(), FontWeight.INSTANCE.e(), null, null, w10.getAdsFontFamilyProduct(), null, w10.getAdsLetterSpacing01(), null, null, null, 0L, null, null, null, 0, 0, w10.getAdsLineHeight02(), null, null, null, 0, 0, null, 16645976, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextStyle d(W w10) {
        return new TextStyle(w10.getAdsTextColor01(), w10.getAdsFontSize02(), FontWeight.INSTANCE.e(), null, null, w10.getAdsFontFamilyProduct(), null, w10.getAdsLetterSpacing01(), null, null, null, 0L, null, null, null, 0, 0, w10.getAdsLineHeight02(), null, null, null, 0, 0, null, 16645976, null);
    }

    public /* synthetic */ Body(final W w10, I i10, I i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(w10, (i12 & 2) != 0 ? new I() { // from class: Ji.a
            @Override // Ji.I
            public final TextStyle getStyle() {
                return Body.c(w10);
            }
        } : i10, (i12 & 4) != 0 ? new I() { // from class: Ji.b
            @Override // Ji.I
            public final TextStyle getStyle() {
                return Body.d(w10);
            }
        } : i11);
    }
}
