package H1;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\bJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0016¨\u0006\u0017"}, d2 = {"LH1/u;", "LI1/a;", "", "fontScale", "<init>", "(F)V", "sp", "b", "(F)F", "dp", "a", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: H1.u, reason: from toString */
/* loaded from: classes.dex */
final /* data */ class LinearFontScaleConverter implements I1.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final float fontScale;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LinearFontScaleConverter) && Float.compare(this.fontScale, ((LinearFontScaleConverter) other).fontScale) == 0;
    }

    @Override // I1.a
    public float a(float dp2) {
        return dp2 / this.fontScale;
    }

    @Override // I1.a
    public float b(float sp2) {
        return sp2 * this.fontScale;
    }

    public int hashCode() {
        return Float.hashCode(this.fontScale);
    }

    public String toString() {
        return "LinearFontScaleConverter(fontScale=" + this.fontScale + ')';
    }

    public LinearFontScaleConverter(float f10) {
        this.fontScale = f10;
    }
}
