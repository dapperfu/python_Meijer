package androidx.compose.ui.text;

import V0.AbstractC5324i0;
import V0.Shadow;
import V0.W;
import V0.q1;
import V0.w1;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import u1.C17207A;
import u1.C17209a;
import u1.InterfaceC17214f;
import v1.o0;
import w1.C17748h;
import w1.C17749i;

@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010 \n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r*\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u0014*\u00020\u00112\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ[\u0010&\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00042\b\b\u0002\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,H\u0016ø\u0001\u0000¢\u0006\u0004\b.\u0010/J*\u00107\u001a\u0002062\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0016ø\u0001\u0000¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u0002002\u0006\u00109\u001a\u00020\u0004H\u0016¢\u0006\u0004\b:\u0010;J,\u0010@\u001a\u00020\u00192\u0006\u0010<\u001a\u0002062\u0006\u0010>\u001a\u00020=2\b\b\u0001\u0010?\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b@\u0010AJ\u001f\u0010E\u001a\u00020D2\u0006\u0010B\u001a\u00020\u00042\u0006\u0010C\u001a\u00020\u0004H\u0016¢\u0006\u0004\bE\u0010FJ\u0017\u0010G\u001a\u0002002\u0006\u00109\u001a\u00020\u0004H\u0016¢\u0006\u0004\bG\u0010;J\u001d\u0010H\u001a\u0002062\u0006\u00109\u001a\u00020\u0004H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bH\u0010IJ\u0017\u0010K\u001a\u00020(2\u0006\u0010J\u001a\u00020\u0004H\u0016¢\u0006\u0004\bK\u0010LJ\u0017\u0010M\u001a\u00020(2\u0006\u0010J\u001a\u00020\u0004H\u0016¢\u0006\u0004\bM\u0010LJ\u0017\u0010N\u001a\u00020(2\u0006\u0010J\u001a\u00020\u0004H\u0016¢\u0006\u0004\bN\u0010LJ\u0017\u0010O\u001a\u00020(2\u0006\u0010J\u001a\u00020\u0004H\u0016¢\u0006\u0004\bO\u0010LJ\u0017\u0010P\u001a\u00020(2\u0006\u0010J\u001a\u00020\u0004H\u0016¢\u0006\u0004\bP\u0010LJ\u0017\u0010Q\u001a\u00020(2\u0006\u0010J\u001a\u00020\u0004H\u0016¢\u0006\u0004\bQ\u0010LJ\u0017\u0010R\u001a\u00020\u00042\u0006\u0010J\u001a\u00020\u0004H\u0016¢\u0006\u0004\bR\u0010SJ\u001f\u0010U\u001a\u00020\u00042\u0006\u0010J\u001a\u00020\u00042\u0006\u0010T\u001a\u00020\u0014H\u0016¢\u0006\u0004\bU\u0010VJ\u0017\u0010W\u001a\u00020\u00042\u0006\u00109\u001a\u00020\u0004H\u0016¢\u0006\u0004\bW\u0010SJ\u001f\u0010Y\u001a\u00020(2\u0006\u00109\u001a\u00020\u00042\u0006\u0010X\u001a\u00020\u0014H\u0016¢\u0006\u0004\bY\u0010ZJ\u0017\u0010\\\u001a\u00020[2\u0006\u00109\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\\\u0010]J\u0017\u0010^\u001a\u00020[2\u0006\u00109\u001a\u00020\u0004H\u0016¢\u0006\u0004\b^\u0010]JH\u0010i\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010`\u001a\u00020_2\b\u0010b\u001a\u0004\u0018\u00010a2\b\u0010d\u001a\u0004\u0018\u00010c2\b\u0010f\u001a\u0004\u0018\u00010e2\u0006\u0010h\u001a\u00020gH\u0016ø\u0001\u0000¢\u0006\u0004\bi\u0010jJP\u0010n\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010l\u001a\u00020k2\u0006\u0010m\u001a\u00020(2\b\u0010b\u001a\u0004\u0018\u00010a2\b\u0010d\u001a\u0004\u0018\u00010c2\b\u0010f\u001a\u0004\u0018\u00010e2\u0006\u0010h\u001a\u00020gH\u0016ø\u0001\u0000¢\u0006\u0004\bn\u0010oR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bM\u0010p\u001a\u0004\bq\u0010rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bQ\u0010s\u001a\u0004\bt\u0010uR\u001d\u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bv\u0010s\u001a\u0004\bw\u0010uR\u001d\u0010\t\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bK\u0010\u0015\u001a\u0004\bx\u0010yR\u0014\u0010|\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R\"\u0010%\u001a\u00020$8\u0000X\u0081\u0004¢\u0006\u0014\n\u0004\b:\u0010}\u0012\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0004\b~\u0010\u007fR'\u0010\u0086\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u0001000\u0082\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b7\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0017\u0010\u0089\u0001\u001a\u00020(8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0017\u0010\u008b\u0001\u001a\u00020(8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008a\u0001\u0010\u0088\u0001R\u0016\u0010\u008c\u0001\u001a\u00020(8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bv\u0010\u0088\u0001R\u0016\u0010\u008d\u0001\u001a\u00020(8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bz\u0010\u0088\u0001R\u0017\u0010\u008f\u0001\u001a\u00020(8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008e\u0001\u0010\u0088\u0001R\u0017\u0010\u0091\u0001\u001a\u00020(8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0090\u0001\u0010\u0088\u0001R\u0017\u0010\u0094\u0001\u001a\u00020\u00148VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0016\u0010\u0096\u0001\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0095\u0001\u0010uR\u001f\u0010\u009a\u0001\u001a\u00030\u0097\u00018@X\u0081\u0004¢\u0006\u000f\u0012\u0006\b\u0099\u0001\u0010\u0081\u0001\u001a\u0005\bs\u0010\u0098\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u009b\u0001"}, d2 = {"Landroidx/compose/ui/text/a;", "Lu1/f;", "LC1/d;", "paragraphIntrinsics", "", "maxLines", "LF1/t;", "overflow", "LH1/b;", "constraints", "<init>", "(LC1/d;IIJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lv1/o0;", "", "LE1/e;", "H", "(Lv1/o0;)[LE1/e;", "Landroid/text/Spanned;", "Ljava/lang/Class;", "clazz", "", "J", "(Landroid/text/Spanned;Ljava/lang/Class;)Z", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "", "K", "(Landroidx/compose/ui/graphics/Canvas;)V", "alignment", "justificationMode", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "hyphens", "breakStrategy", "lineBreakStyle", "lineBreakWordStyle", "", "charSequence", "E", "(IILandroid/text/TextUtils$TruncateAt;IIIIILjava/lang/CharSequence;)Lv1/o0;", "", "vertical", "s", "(F)I", "LU0/f;", "position", "m", "(J)I", "Landroidx/compose/ui/geometry/Rect;", "rect", "Lu1/p;", "granularity", "Lu1/t;", "inclusionStrategy", "Landroidx/compose/ui/text/y;", "g", "(Landroidx/compose/ui/geometry/Rect;ILu1/t;)J", "offset", "f", "(I)Landroidx/compose/ui/geometry/Rect;", "range", "", "array", "arrayStart", "v", "(J[FI)V", "start", "end", "LV0/q1;", "t", "(II)LV0/q1;", "j", "k", "(I)J", "lineIndex", "d", "(I)F", "a", "i", "G", "A", "b", "n", "(I)I", "visibleEnd", "o", "(IZ)I", "x", "usePrimaryDirection", "u", "(IZ)F", "LF1/i;", "h", "(I)LF1/i;", "z", "LV0/q0;", "color", "LV0/B1;", "shadow", "LF1/k;", "textDecoration", "LX0/g;", "drawStyle", "LV0/c0;", "blendMode", "B", "(Landroidx/compose/ui/graphics/Canvas;JLV0/B1;LF1/k;LX0/g;I)V", "LV0/i0;", "brush", "alpha", "y", "(Landroidx/compose/ui/graphics/Canvas;LV0/i0;FLV0/B1;LF1/k;LX0/g;I)V", "LC1/d;", "getParagraphIntrinsics", "()LC1/d;", "I", "getMaxLines", "()I", "c", "getOverflow-gIe3tQ8", "getConstraints-msEJaDk", "()J", "e", "Lv1/o0;", "layout", "Ljava/lang/CharSequence;", "getCharSequence$ui_text_release", "()Ljava/lang/CharSequence;", "getCharSequence$ui_text_release$annotations", "()V", "", "Ljava/util/List;", "D", "()Ljava/util/List;", "placeholderRects", "getWidth", "()F", "width", "getHeight", "height", "maxIntrinsicWidth", "minIntrinsicWidth", "l", "firstBaseline", "w", "lastBaseline", "r", "()Z", "didExceedMaxLines", "p", "lineCount", "LC1/i;", "()LC1/i;", "getTextPaint$ui_text_release$annotations", "textPaint", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.text.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5912a implements InterfaceC17214f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C1.d paragraphIntrinsics;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int maxLines;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int overflow;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long constraints;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final o0 layout;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final CharSequence charSequence;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final List<Rect> placeholderRects;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.text.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C1071a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[F1.i.values().length];
            try {
                iArr[F1.i.f10163a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[F1.i.f10164b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/graphics/RectF;", "segmentBounds", "area", "", "a", "(Landroid/graphics/RectF;Landroid/graphics/RectF;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.text.a$b */
    static final class b extends Lambda implements Function2<RectF, RectF, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ u1.t f52435f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(u1.t tVar) {
            super(2);
            this.f52435f = tVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(RectF rectF, RectF rectF2) {
            return Boolean.valueOf(this.f52435f.a(w1.f(rectF), w1.f(rectF2)));
        }
    }

    public /* synthetic */ C5912a(C1.d dVar, int i10, int i11, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, i10, i11, j10);
    }

    private final boolean J(Spanned spanned, Class<?> cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    @Override // u1.InterfaceC17214f
    public Rect f(int offset) {
        boolean z10 = false;
        if (offset >= 0 && offset < this.charSequence.length()) {
            z10 = true;
        }
        if (!z10) {
            A1.a.a("offset(" + offset + ") is out of bounds [0," + this.charSequence.length() + ')');
        }
        RectF rectFC = this.layout.c(offset);
        return new Rect(rectFC.left, rectFC.top, rectFC.right, rectFC.bottom);
    }

    @Override // u1.InterfaceC17214f
    public Rect j(int offset) {
        if (!(offset >= 0 && offset <= this.charSequence.length())) {
            A1.a.a("offset(" + offset + ") is out of bounds [0," + this.charSequence.length() + ']');
        }
        float fB = o0.B(this.layout, offset, false, 2, null);
        int iQ = this.layout.q(offset);
        return new Rect(fB, this.layout.w(iQ), fB, this.layout.l(iQ));
    }

    @Override // u1.InterfaceC17214f
    public float l() {
        return G(0);
    }

    @Override // u1.InterfaceC17214f
    public float u(int offset, boolean usePrimaryDirection) {
        return usePrimaryDirection ? o0.B(this.layout, offset, false, 2, null) : o0.E(this.layout, offset, false, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private C5912a(C1.d r23, int r24, int r25, long r26) {
        /*
            Method dump skipped, instructions count: 796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.C5912a.<init>(C1.d, int, int, long):void");
    }

    private final o0 E(int alignment, int justificationMode, TextUtils.TruncateAt ellipsize, int maxLines, int hyphens, int breakStrategy, int lineBreakStyle, int lineBreakWordStyle, CharSequence charSequence) {
        return new o0(charSequence, getWidth(), I(), alignment, ellipsize, this.paragraphIntrinsics.getTextDirectionHeuristic(), 1.0f, 0.0f, C1.c.b(this.paragraphIntrinsics.getStyle()), true, maxLines, breakStrategy, lineBreakStyle, lineBreakWordStyle, hyphens, justificationMode, null, null, this.paragraphIntrinsics.getLayoutIntrinsics(), 196736, null);
    }

    static /* synthetic */ o0 F(C5912a c5912a, int i10, int i11, TextUtils.TruncateAt truncateAt, int i12, int i13, int i14, int i15, int i16, CharSequence charSequence, int i17, Object obj) {
        return c5912a.E(i10, i11, truncateAt, i12, i13, i14, i15, i16, (i17 & 256) != 0 ? c5912a.charSequence : charSequence);
    }

    @Override // u1.InterfaceC17214f
    public float A(int lineIndex) {
        return this.layout.l(lineIndex);
    }

    @Override // u1.InterfaceC17214f
    public List<Rect> D() {
        return this.placeholderRects;
    }

    public float G(int lineIndex) {
        return this.layout.k(lineIndex);
    }

    public final C1.i I() {
        return this.paragraphIntrinsics.getTextPaint();
    }

    @Override // u1.InterfaceC17214f
    public float a(int lineIndex) {
        return this.layout.u(lineIndex);
    }

    @Override // u1.InterfaceC17214f
    public float b(int lineIndex) {
        return this.layout.s(lineIndex);
    }

    @Override // u1.InterfaceC17214f
    public float c() {
        return this.paragraphIntrinsics.c();
    }

    @Override // u1.InterfaceC17214f
    public float d(int lineIndex) {
        return this.layout.t(lineIndex);
    }

    @Override // u1.InterfaceC17214f
    public float e() {
        return this.paragraphIntrinsics.e();
    }

    @Override // u1.InterfaceC17214f
    public long g(Rect rect, int granularity, u1.t inclusionStrategy) {
        int[] iArrC = this.layout.C(w1.c(rect), C17209a.r(granularity), new b(inclusionStrategy));
        return iArrC == null ? y.INSTANCE.a() : C17207A.b(iArrC[0], iArrC[1]);
    }

    @Override // u1.InterfaceC17214f
    public float getHeight() {
        return this.layout.f();
    }

    @Override // u1.InterfaceC17214f
    public float getWidth() {
        return H1.b.l(this.constraints);
    }

    @Override // u1.InterfaceC17214f
    public F1.i h(int offset) {
        return this.layout.z(this.layout.q(offset)) == 1 ? F1.i.f10163a : F1.i.f10164b;
    }

    @Override // u1.InterfaceC17214f
    public float i(int lineIndex) {
        return this.layout.w(lineIndex);
    }

    @Override // u1.InterfaceC17214f
    public long k(int offset) {
        C17749i c17749iI = this.layout.I();
        return C17207A.b(C17748h.b(c17749iI, offset), C17748h.a(c17749iI, offset));
    }

    @Override // u1.InterfaceC17214f
    public int m(long position) {
        return this.layout.y(this.layout.r((int) Float.intBitsToFloat((int) (4294967295L & position))), Float.intBitsToFloat((int) (position >> 32)));
    }

    @Override // u1.InterfaceC17214f
    public int n(int lineIndex) {
        return this.layout.v(lineIndex);
    }

    @Override // u1.InterfaceC17214f
    public int o(int lineIndex, boolean visibleEnd) {
        return visibleEnd ? this.layout.x(lineIndex) : this.layout.p(lineIndex);
    }

    @Override // u1.InterfaceC17214f
    public int p() {
        return this.layout.getLineCount();
    }

    @Override // u1.InterfaceC17214f
    public boolean r() {
        return this.layout.getDidExceedMaxLines();
    }

    @Override // u1.InterfaceC17214f
    public int s(float vertical) {
        return this.layout.r((int) vertical);
    }

    @Override // u1.InterfaceC17214f
    public q1 t(int start, int end) {
        if (!(start >= 0 && start <= end && end <= this.charSequence.length())) {
            A1.a.a("start(" + start + ") or end(" + end + ") is out of range [0.." + this.charSequence.length() + "], or start > end!");
        }
        Path path = new Path();
        this.layout.F(start, end, path);
        return W.c(path);
    }

    @Override // u1.InterfaceC17214f
    public void v(long range, float[] array, int arrayStart) {
        this.layout.a(y.l(range), y.k(range), array, arrayStart);
    }

    @Override // u1.InterfaceC17214f
    public int x(int offset) {
        return this.layout.q(offset);
    }

    @Override // u1.InterfaceC17214f
    public F1.i z(int offset) {
        return this.layout.K(offset) ? F1.i.f10164b : F1.i.f10163a;
    }

    private final E1.e[] H(o0 o0Var) {
        if (!(o0Var.G() instanceof Spanned)) {
            return null;
        }
        CharSequence charSequenceG = o0Var.G();
        Intrinsics.h(charSequenceG, "null cannot be cast to non-null type android.text.Spanned");
        if (!J((Spanned) charSequenceG, E1.e.class)) {
            return null;
        }
        CharSequence charSequenceG2 = o0Var.G();
        Intrinsics.h(charSequenceG2, "null cannot be cast to non-null type android.text.Spanned");
        return (E1.e[]) ((Spanned) charSequenceG2).getSpans(0, o0Var.G().length(), E1.e.class);
    }

    private final void K(Canvas canvas) {
        android.graphics.Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        if (r()) {
            nativeCanvas.save();
            nativeCanvas.clipRect(0.0f, 0.0f, getWidth(), getHeight());
        }
        this.layout.L(nativeCanvas);
        if (r()) {
            nativeCanvas.restore();
        }
    }

    @Override // u1.InterfaceC17214f
    public void B(Canvas canvas, long color, Shadow shadow, F1.k textDecoration, X0.g drawStyle, int blendMode) {
        int backingBlendMode = I().getBackingBlendMode();
        C1.i iVarI = I();
        iVarI.f(color);
        iVarI.h(shadow);
        iVarI.i(textDecoration);
        iVarI.g(drawStyle);
        iVarI.d(blendMode);
        K(canvas);
        I().d(backingBlendMode);
    }

    @Override // u1.InterfaceC17214f
    public float w() {
        return G(p() - 1);
    }

    @Override // u1.InterfaceC17214f
    public void y(Canvas canvas, AbstractC5324i0 brush, float alpha, Shadow shadow, F1.k textDecoration, X0.g drawStyle, int blendMode) {
        int backingBlendMode = I().getBackingBlendMode();
        C1.i iVarI = I();
        float width = getWidth();
        float height = getHeight();
        iVarI.e(brush, U0.k.d((Float.floatToRawIntBits(height) & 4294967295L) | (Float.floatToRawIntBits(width) << 32)), alpha);
        iVarI.h(shadow);
        iVarI.i(textDecoration);
        iVarI.g(drawStyle);
        iVarI.d(blendMode);
        K(canvas);
        I().d(backingBlendMode);
    }
}
