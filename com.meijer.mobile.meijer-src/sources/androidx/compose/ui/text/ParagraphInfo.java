package androidx.compose.ui.text;

import V0.q1;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.y;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import u1.C17334A;
import u1.InterfaceC17341f;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001c\b\u0080\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000e\u001a\u00020\u0004*\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0010\u001a\u00020\u0004*\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u000fJ\u0011\u0010\u0011\u001a\u00020\u0004*\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u000fJ\u0011\u0010\u0012\u001a\u00020\u0004*\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u000fJ\u0011\u0010\u0013\u001a\u00020\t*\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0015\u001a\u00020\t*\u00020\t¢\u0006\u0004\b\u0015\u0010\u0014J\u0014\u0010\u0017\u001a\u00020\u0016*\u00020\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u001a\u001a\u00020\u0019*\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001c\u001a\u00020\u0019*\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001bJ\u0011\u0010\u001e\u001a\u00020\u001d*\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u001e\u0010#\u001a\u00020 *\u00020 2\b\b\u0002\u0010\"\u001a\u00020!ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020!2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010)R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b4\u00102\u001a\u0004\b1\u0010)R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00102\u001a\u0004\b6\u0010)\"\u0004\b7\u00108R\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00102\u001a\u0004\b4\u0010)\"\u0004\b9\u00108R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010\u000b\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010:\u001a\u0004\b-\u0010<\"\u0004\b?\u0010>R\u0011\u0010@\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b5\u0010)\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006A"}, d2 = {"Landroidx/compose/ui/text/k;", "", "Lu1/f;", "paragraph", "", "startIndex", "endIndex", "startLineIndex", "endLineIndex", "", "top", "bottom", "<init>", "(Lu1/f;IIIIFF)V", "r", "(I)I", "m", "s", "n", "o", "(F)F", "t", "LU0/f;", "q", "(J)J", "Landroidx/compose/ui/geometry/Rect;", "j", "(Landroidx/compose/ui/geometry/Rect;)Landroidx/compose/ui/geometry/Rect;", "p", "LV0/q1;", "i", "(LV0/q1;)LV0/q1;", "Landroidx/compose/ui/text/y;", "", "treatZeroAsNull", "k", "(JZ)J", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lu1/f;", "e", "()Lu1/f;", "b", "I", "f", "c", "d", "g", "setStartLineIndex", "(I)V", "setEndLineIndex", "F", "h", "()F", "setTop", "(F)V", "setBottom", "length", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.text.k, reason: from toString */
/* loaded from: classes.dex */
public final /* data */ class ParagraphInfo {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC17341f paragraph;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int startIndex;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int endIndex;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private int startLineIndex;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private int endLineIndex;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private float top;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private float bottom;

    public static /* synthetic */ long l(ParagraphInfo paragraphInfo, long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return paragraphInfo.k(j10, z10);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParagraphInfo)) {
            return false;
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) other;
        return Intrinsics.e(this.paragraph, paragraphInfo.paragraph) && this.startIndex == paragraphInfo.startIndex && this.endIndex == paragraphInfo.endIndex && this.startLineIndex == paragraphInfo.startLineIndex && this.endLineIndex == paragraphInfo.endLineIndex && Float.compare(this.top, paragraphInfo.top) == 0 && Float.compare(this.bottom, paragraphInfo.bottom) == 0;
    }

    public int hashCode() {
        return (((((((((((this.paragraph.hashCode() * 31) + Integer.hashCode(this.startIndex)) * 31) + Integer.hashCode(this.endIndex)) * 31) + Integer.hashCode(this.startLineIndex)) * 31) + Integer.hashCode(this.endLineIndex)) * 31) + Float.hashCode(this.top)) * 31) + Float.hashCode(this.bottom);
    }

    public String toString() {
        return "ParagraphInfo(paragraph=" + this.paragraph + ", startIndex=" + this.startIndex + ", endIndex=" + this.endIndex + ", startLineIndex=" + this.startLineIndex + ", endLineIndex=" + this.endLineIndex + ", top=" + this.top + ", bottom=" + this.bottom + ')';
    }

    /* renamed from: a, reason: from getter */
    public final float getBottom() {
        return this.bottom;
    }

    /* renamed from: b, reason: from getter */
    public final int getEndIndex() {
        return this.endIndex;
    }

    /* renamed from: c, reason: from getter */
    public final int getEndLineIndex() {
        return this.endLineIndex;
    }

    public final int d() {
        return this.endIndex - this.startIndex;
    }

    /* renamed from: e, reason: from getter */
    public final InterfaceC17341f getParagraph() {
        return this.paragraph;
    }

    /* renamed from: f, reason: from getter */
    public final int getStartIndex() {
        return this.startIndex;
    }

    /* renamed from: g, reason: from getter */
    public final int getStartLineIndex() {
        return this.startLineIndex;
    }

    /* renamed from: h, reason: from getter */
    public final float getTop() {
        return this.top;
    }

    public final q1 i(q1 q1Var) {
        float f10 = this.top;
        q1Var.k(U0.f.e((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L)));
        return q1Var;
    }

    public final Rect j(Rect rect) {
        float f10 = this.top;
        return rect.t(U0.f.e((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L)));
    }

    public final long k(long j10, boolean z10) {
        if (z10) {
            y.Companion companion = y.INSTANCE;
            if (y.g(j10, companion.a())) {
                return companion.a();
            }
        }
        return C17334A.b(m(y.n(j10)), m(y.i(j10)));
    }

    public final int m(int i10) {
        return i10 + this.startIndex;
    }

    public final int n(int i10) {
        return i10 + this.startLineIndex;
    }

    public final float o(float f10) {
        return f10 + this.top;
    }

    public final Rect p(Rect rect) {
        float f10 = -this.top;
        return rect.t(U0.f.e((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L)));
    }

    public final long q(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) - this.top;
        return U0.f.e((Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
    }

    public final int r(int i10) {
        return RangesKt.o(i10, this.startIndex, this.endIndex) - this.startIndex;
    }

    public final int s(int i10) {
        return i10 - this.startLineIndex;
    }

    public final float t(float f10) {
        return f10 - this.top;
    }

    public ParagraphInfo(InterfaceC17341f interfaceC17341f, int i10, int i11, int i12, int i13, float f10, float f11) {
        this.paragraph = interfaceC17341f;
        this.startIndex = i10;
        this.endIndex = i11;
        this.startLineIndex = i12;
        this.endLineIndex = i13;
        this.top = f10;
        this.bottom = f11;
    }
}
