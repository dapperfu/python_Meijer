package androidx.compose.ui.geometry;

import U0.c;
import U0.f;
import U0.k;
import com.fullstory.instrumentation.frameworks.compose.FSComposeRect;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0001-B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\tH\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010#J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010#J8\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b'\u0010\u0019J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010+\u001a\u00020\u001a2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010.\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010#R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010.\u0012\u0004\b3\u00101\u001a\u0004\b2\u0010#R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010.\u0012\u0004\b5\u00101\u001a\u0004\b4\u0010#R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010.\u0012\u0004\b7\u00101\u001a\u0004\b6\u0010#R\u001b\u0010:\u001a\u00020\u00028Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b9\u00101\u001a\u0004\b8\u0010#R\u001b\u0010=\u001a\u00020\u00028Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b<\u00101\u001a\u0004\b;\u0010#R \u0010B\u001a\u00020>8FX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\bA\u00101\u001a\u0004\b?\u0010@R\u001a\u0010F\u001a\u00020\u001a8FX\u0087\u0004¢\u0006\f\u0012\u0004\bE\u00101\u001a\u0004\bC\u0010DR\u0017\u0010H\u001a\u00020\t8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bG\u0010@R\u0017\u0010J\u001a\u00020\t8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bI\u0010@R\u0017\u0010L\u001a\u00020\t8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bK\u0010@\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006M"}, d2 = {"Landroidx/compose/ui/geometry/Rect;", "", "", "left", "top", "right", "bottom", "<init>", "(FFFF)V", "LU0/f;", "offset", "t", "(J)Landroidx/compose/ui/geometry/Rect;", "translateX", "translateY", "s", "(FF)Landroidx/compose/ui/geometry/Rect;", "other", "p", "(Landroidx/compose/ui/geometry/Rect;)Landroidx/compose/ui/geometry/Rect;", "otherLeft", "otherTop", "otherRight", "otherBottom", "o", "(FFFF)Landroidx/compose/ui/geometry/Rect;", "", "r", "(Landroidx/compose/ui/geometry/Rect;)Z", "f", "(J)Z", "", "toString", "()Ljava/lang/String;", "b", "()F", "c", "d", "e", "g", "", "hashCode", "()I", "equals", "(Ljava/lang/Object;)Z", "a", "F", "getLeft", "getLeft$annotations", "()V", "getTop", "getTop$annotations", "l", "getRight$annotations", "i", "getBottom$annotations", "getWidth", "getWidth$annotations", "width", "getHeight", "getHeight$annotations", "height", "LU0/k;", "m", "()J", "getSize-NH-jbRc$annotations", "size", "q", "()Z", "isEmpty$annotations", "isEmpty", "n", "topLeft", "k", "center", "j", "bottomRight", "ui-geometry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final /* data */ class Rect implements FSComposeRect {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: f, reason: collision with root package name */
    private static final Rect f50920f = new Rect(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float left;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float top;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float right;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float bottom;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/ui/geometry/Rect$a;", "", "<init>", "()V", "Landroidx/compose/ui/geometry/Rect;", "Zero", "Landroidx/compose/ui/geometry/Rect;", "a", "()Landroidx/compose/ui/geometry/Rect;", "getZero$annotations", "ui-geometry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.geometry.Rect$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Rect a() {
            return Rect.f50920f;
        }
    }

    public static /* synthetic */ Rect h(Rect rect, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = rect.left;
        }
        if ((i10 & 2) != 0) {
            f11 = rect.top;
        }
        if ((i10 & 4) != 0) {
            f12 = rect.right;
        }
        if ((i10 & 8) != 0) {
            f13 = rect.bottom;
        }
        return rect.g(f10, f11, f12, f13);
    }

    @Override // com.fullstory.instrumentation.frameworks.compose.FSComposeRect
    public final float _fsGetHeight() {
        return getHeight();
    }

    @Override // com.fullstory.instrumentation.frameworks.compose.FSComposeRect
    public final float _fsGetLeft() {
        return getLeft();
    }

    @Override // com.fullstory.instrumentation.frameworks.compose.FSComposeRect
    public final float _fsGetTop() {
        return getTop();
    }

    @Override // com.fullstory.instrumentation.frameworks.compose.FSComposeRect
    public final float _fsGetWidth() {
        return getWidth();
    }

    /* renamed from: b, reason: from getter */
    public final float getLeft() {
        return this.left;
    }

    /* renamed from: c, reason: from getter */
    public final float getTop() {
        return this.top;
    }

    /* renamed from: d, reason: from getter */
    public final float getRight() {
        return this.right;
    }

    /* renamed from: e, reason: from getter */
    public final float getBottom() {
        return this.bottom;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Rect)) {
            return false;
        }
        Rect rect = (Rect) other;
        return Float.compare(this.left, rect.left) == 0 && Float.compare(this.top, rect.top) == 0 && Float.compare(this.right, rect.right) == 0 && Float.compare(this.bottom, rect.bottom) == 0;
    }

    public final Rect g(float left, float top, float right, float bottom) {
        return new Rect(left, top, right, bottom);
    }

    public int hashCode() {
        return (((((Float.hashCode(this.left) * 31) + Float.hashCode(this.top)) * 31) + Float.hashCode(this.right)) * 31) + Float.hashCode(this.bottom);
    }

    public final boolean f(long offset) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (offset >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (offset & 4294967295L));
        return (fIntBitsToFloat >= this.left) & (fIntBitsToFloat < this.right) & (fIntBitsToFloat2 >= this.top) & (fIntBitsToFloat2 < this.bottom);
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getTop() {
        return this.top;
    }

    public final float i() {
        return this.bottom;
    }

    public final long j() {
        float f10 = this.right;
        float f11 = this.bottom;
        return f.e((Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }

    public final long k() {
        float fL = this.left + ((l() - getLeft()) / 2.0f);
        float fI = this.top + ((i() - getTop()) / 2.0f);
        return f.e((Float.floatToRawIntBits(fI) & 4294967295L) | (Float.floatToRawIntBits(fL) << 32));
    }

    public final float l() {
        return this.right;
    }

    public final long n() {
        float f10 = this.left;
        float f11 = this.top;
        return f.e((Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }

    public final Rect o(float otherLeft, float otherTop, float otherRight, float otherBottom) {
        return new Rect(Math.max(this.left, otherLeft), Math.max(this.top, otherTop), Math.min(this.right, otherRight), Math.min(this.bottom, otherBottom));
    }

    public final Rect p(Rect other) {
        return new Rect(Math.max(this.left, other.left), Math.max(this.top, other.top), Math.min(this.right, other.right), Math.min(this.bottom, other.bottom));
    }

    public final boolean q() {
        return (this.left >= this.right) | (this.top >= this.bottom);
    }

    public final boolean r(Rect other) {
        return (this.left < other.right) & (other.left < this.right) & (this.top < other.bottom) & (other.top < this.bottom);
    }

    public final Rect s(float translateX, float translateY) {
        return new Rect(this.left + translateX, this.top + translateY, this.right + translateX, this.bottom + translateY);
    }

    public final Rect t(long offset) {
        int i10 = (int) (offset >> 32);
        int i11 = (int) (offset & 4294967295L);
        return new Rect(this.left + Float.intBitsToFloat(i10), this.top + Float.intBitsToFloat(i11), this.right + Float.intBitsToFloat(i10), this.bottom + Float.intBitsToFloat(i11));
    }

    public String toString() {
        return "Rect.fromLTRB(" + c.a(this.left, 1) + ", " + c.a(this.top, 1) + ", " + c.a(this.right, 1) + ", " + c.a(this.bottom, 1) + ')';
    }

    public Rect(float f10, float f11, float f12, float f13) {
        this.left = f10;
        this.top = f11;
        this.right = f12;
        this.bottom = f13;
    }

    public final float getHeight() {
        return i() - getTop();
    }

    public final float getWidth() {
        return l() - getLeft();
    }

    public final long m() {
        float fL = l() - getLeft();
        float fI = i() - getTop();
        return k.d((Float.floatToRawIntBits(fI) & 4294967295L) | (Float.floatToRawIntBits(fL) << 32));
    }
}
