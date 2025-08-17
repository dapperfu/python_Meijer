package u1;

import V0.q1;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutInput;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0014J\u0015\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\rJ\u0015\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0012¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u000e¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020 2\u0006\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020 2\u0006\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b#\u0010\"J\u0018\u0010&\u001a\u00020\n2\u0006\u0010%\u001a\u00020$ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\u00020(2\u0006\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b)\u0010*J\u001b\u0010,\u001a\u00020+2\u0006\u0010\u0018\u001a\u00020\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u0015\u0010.\u001a\u00020(2\u0006\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b.\u0010*J\u001d\u00102\u001a\u0002012\u0006\u0010/\u001a\u00020\n2\u0006\u00100\u001a\u00020\n¢\u0006\u0004\b2\u00103J$\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b4\u00105J\u001a\u00107\u001a\u00020\u000e2\b\u00106\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\nH\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b<\u0010=R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u001d\u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b#\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010K\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b)\u0010H\u001a\u0004\bI\u0010JR\u0017\u0010M\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b.\u0010H\u001a\u0004\bL\u0010JR\u001f\u0010S\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0N8\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0011\u0010U\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bO\u0010TR\u0011\u0010W\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bV\u0010TR\u0011\u0010Y\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bX\u0010TR\u0011\u0010[\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bZ\u0010:\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\\"}, d2 = {"Lu1/v;", "", "Landroidx/compose/ui/text/v;", "layoutInput", "Landroidx/compose/ui/text/g;", "multiParagraph", "LH1/r;", "size", "<init>", "(Landroidx/compose/ui/text/v;Landroidx/compose/ui/text/g;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "lineIndex", "u", "(I)I", "", "visibleEnd", "o", "(IZ)I", "", "v", "(I)F", "m", "s", "t", "offset", "q", "vertical", "r", "(F)I", "usePrimaryDirection", "j", "(IZ)F", "LF1/i;", "y", "(I)LF1/i;", "c", "LU0/f;", "position", "x", "(J)I", "Landroidx/compose/ui/geometry/Rect;", "d", "(I)Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/text/y;", "C", "(I)J", "e", "start", "end", "LV0/q1;", "z", "(II)LV0/q1;", "a", "(Landroidx/compose/ui/text/v;J)Lu1/v;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/text/v;", "l", "()Landroidx/compose/ui/text/v;", "b", "Landroidx/compose/ui/text/g;", "w", "()Landroidx/compose/ui/text/g;", "J", "B", "()J", "F", "h", "()F", "firstBaseline", "k", "lastBaseline", "", "f", "Ljava/util/List;", "A", "()Ljava/util/List;", "placeholderRects", "()Z", "didOverflowHeight", "g", "didOverflowWidth", "i", "hasVisualOverflow", "n", "lineCount", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: u1.v, reason: from toString */
/* loaded from: classes.dex */
public final class TextLayoutResult {

    /* renamed from: g, reason: collision with root package name */
    public static final int f162630g = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextLayoutInput layoutInput;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final androidx.compose.ui.text.g multiParagraph;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long size;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final float firstBaseline;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final float lastBaseline;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Rect> placeholderRects;

    public /* synthetic */ TextLayoutResult(TextLayoutInput textLayoutInput, androidx.compose.ui.text.g gVar, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(textLayoutInput, gVar, j10);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextLayoutResult)) {
            return false;
        }
        TextLayoutResult textLayoutResult = (TextLayoutResult) other;
        return Intrinsics.e(this.layoutInput, textLayoutResult.layoutInput) && Intrinsics.e(this.multiParagraph, textLayoutResult.multiParagraph) && H1.r.e(this.size, textLayoutResult.size) && this.firstBaseline == textLayoutResult.firstBaseline && this.lastBaseline == textLayoutResult.lastBaseline && Intrinsics.e(this.placeholderRects, textLayoutResult.placeholderRects);
    }

    private TextLayoutResult(TextLayoutInput textLayoutInput, androidx.compose.ui.text.g gVar, long j10) {
        this.layoutInput = textLayoutInput;
        this.multiParagraph = gVar;
        this.size = j10;
        this.firstBaseline = gVar.g();
        this.lastBaseline = gVar.k();
        this.placeholderRects = gVar.B();
    }

    public static /* synthetic */ TextLayoutResult b(TextLayoutResult textLayoutResult, TextLayoutInput textLayoutInput, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            textLayoutInput = textLayoutResult.layoutInput;
        }
        if ((i10 & 2) != 0) {
            j10 = textLayoutResult.size;
        }
        return textLayoutResult.a(textLayoutInput, j10);
    }

    public static /* synthetic */ int p(TextLayoutResult textLayoutResult, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return textLayoutResult.o(i10, z10);
    }

    public final List<Rect> A() {
        return this.placeholderRects;
    }

    /* renamed from: B, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    public final long C(int offset) {
        return this.multiParagraph.E(offset);
    }

    public final TextLayoutResult a(TextLayoutInput layoutInput, long size) {
        return new TextLayoutResult(layoutInput, this.multiParagraph, size, null);
    }

    public final F1.i c(int offset) {
        return this.multiParagraph.c(offset);
    }

    public final Rect d(int offset) {
        return this.multiParagraph.d(offset);
    }

    public final Rect e(int offset) {
        return this.multiParagraph.e(offset);
    }

    public final boolean f() {
        return this.multiParagraph.getDidExceedMaxLines() || ((float) ((int) (this.size & 4294967295L))) < this.multiParagraph.getHeight();
    }

    public final boolean g() {
        return ((float) ((int) (this.size >> 32))) < this.multiParagraph.getWidth();
    }

    /* renamed from: h, reason: from getter */
    public final float getFirstBaseline() {
        return this.firstBaseline;
    }

    public int hashCode() {
        return (((((((((this.layoutInput.hashCode() * 31) + this.multiParagraph.hashCode()) * 31) + H1.r.h(this.size)) * 31) + Float.hashCode(this.firstBaseline)) * 31) + Float.hashCode(this.lastBaseline)) * 31) + this.placeholderRects.hashCode();
    }

    public final float j(int offset, boolean usePrimaryDirection) {
        return this.multiParagraph.i(offset, usePrimaryDirection);
    }

    /* renamed from: k, reason: from getter */
    public final float getLastBaseline() {
        return this.lastBaseline;
    }

    /* renamed from: l, reason: from getter */
    public final TextLayoutInput getLayoutInput() {
        return this.layoutInput;
    }

    public final float m(int lineIndex) {
        return this.multiParagraph.l(lineIndex);
    }

    public final int n() {
        return this.multiParagraph.getLineCount();
    }

    public final int o(int lineIndex, boolean visibleEnd) {
        return this.multiParagraph.n(lineIndex, visibleEnd);
    }

    public final int q(int offset) {
        return this.multiParagraph.p(offset);
    }

    public final int r(float vertical) {
        return this.multiParagraph.q(vertical);
    }

    public final float s(int lineIndex) {
        return this.multiParagraph.s(lineIndex);
    }

    public final float t(int lineIndex) {
        return this.multiParagraph.t(lineIndex);
    }

    public String toString() {
        return "TextLayoutResult(layoutInput=" + this.layoutInput + ", multiParagraph=" + this.multiParagraph + ", size=" + ((Object) H1.r.i(this.size)) + ", firstBaseline=" + this.firstBaseline + ", lastBaseline=" + this.lastBaseline + ", placeholderRects=" + this.placeholderRects + ')';
    }

    public final int u(int lineIndex) {
        return this.multiParagraph.u(lineIndex);
    }

    public final float v(int lineIndex) {
        return this.multiParagraph.v(lineIndex);
    }

    /* renamed from: w, reason: from getter */
    public final androidx.compose.ui.text.g getMultiParagraph() {
        return this.multiParagraph;
    }

    public final int x(long position) {
        return this.multiParagraph.x(position);
    }

    public final F1.i y(int offset) {
        return this.multiParagraph.y(offset);
    }

    public final q1 z(int start, int end) {
        return this.multiParagraph.A(start, end);
    }

    public final boolean i() {
        if (!g() && !f()) {
            return false;
        }
        return true;
    }
}
