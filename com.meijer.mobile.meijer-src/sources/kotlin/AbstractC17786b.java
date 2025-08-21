package kotlin;

import androidx.compose.foundation.text.H;
import androidx.compose.foundation.text.I;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.y;
import kotlin.AbstractC17786b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import u1.C17334A;
import u1.TextLayoutResult;
import z1.InterfaceC18417E;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010\u000e\n\u0002\b\u0005\b \u0018\u0000 e*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002:\u0001%B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0010J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0019\u001a\u00020\u0017*\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0082\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u001b\u001a\u00020\u0017*\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0082\u0010¢\u0006\u0004\b\u001b\u0010\u001aJ\u001d\u0010\u001c\u001a\u00020\u0017*\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001aJ\u001d\u0010\u001d\u001a\u00020\u0017*\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u001aJ\u001b\u0010\u001f\u001a\u00020\u0017*\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001f\u0010\u001aJ\u000f\u0010 \u001a\u00020\u0017H\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\"\u0010!J\u000f\u0010#\u001a\u00020\u0017H\u0002¢\u0006\u0004\b#\u0010!J\u0017\u0010%\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u0017H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010\u0001\u001a\u00020'2\u0006\u0010$\u001a\u00020\u0017H\u0004¢\u0006\u0004\b\u0001\u0010(J\u001f\u0010+\u001a\u00020'2\u0006\u0010)\u001a\u00020\u00172\u0006\u0010*\u001a\u00020\u0017H\u0004¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00028\u0000¢\u0006\u0004\b-\u0010\u0010J\r\u0010.\u001a\u00028\u0000¢\u0006\u0004\b.\u0010\u0010J\r\u0010/\u001a\u00028\u0000¢\u0006\u0004\b/\u0010\u0010J\r\u00100\u001a\u00028\u0000¢\u0006\u0004\b0\u0010\u0010J&\u00104\u001a\u00028\u00002\u0017\u00103\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020'01¢\u0006\u0002\b2¢\u0006\u0004\b4\u00105J&\u00106\u001a\u00028\u00002\u0017\u00103\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020'01¢\u0006\u0002\b2¢\u0006\u0004\b6\u00105J\r\u00107\u001a\u00020\u0017¢\u0006\u0004\b7\u0010!J\r\u00108\u001a\u00020\u0017¢\u0006\u0004\b8\u0010!J\r\u00109\u001a\u00028\u0000¢\u0006\u0004\b9\u0010\u0010J\r\u0010:\u001a\u00028\u0000¢\u0006\u0004\b:\u0010\u0010J\r\u0010;\u001a\u00028\u0000¢\u0006\u0004\b;\u0010\u0010J\r\u0010<\u001a\u00028\u0000¢\u0006\u0004\b<\u0010\u0010J\u000f\u0010=\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b?\u0010>J\r\u0010@\u001a\u00028\u0000¢\u0006\u0004\b@\u0010\u0010J\r\u0010A\u001a\u00028\u0000¢\u0006\u0004\bA\u0010\u0010J\r\u0010B\u001a\u00028\u0000¢\u0006\u0004\bB\u0010\u0010J\r\u0010C\u001a\u00028\u0000¢\u0006\u0004\bC\u0010\u0010J\u000f\u0010D\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\bD\u0010>J\r\u0010E\u001a\u00028\u0000¢\u0006\u0004\bE\u0010\u0010J\u000f\u0010F\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\bF\u0010>J\r\u0010G\u001a\u00028\u0000¢\u0006\u0004\bG\u0010\u0010J\r\u0010H\u001a\u00028\u0000¢\u0006\u0004\bH\u0010\u0010J\r\u0010I\u001a\u00028\u0000¢\u0006\u0004\bI\u0010\u0010J\r\u0010J\u001a\u00028\u0000¢\u0006\u0004\bJ\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b%\u0010K\u001a\u0004\bL\u0010MR\u001d\u0010\u0006\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b4\u0010<\u001a\u0004\bN\u0010OR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b6\u0010P\u001a\u0004\bQ\u0010RR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b.\u0010S\u001a\u0004\bT\u0010UR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR(\u0010]\u001a\u00020\u00058\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bF\u0010<\u001a\u0004\bZ\u0010O\"\u0004\b[\u0010\\R\"\u0010`\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010K\u001a\u0004\bV\u0010M\"\u0004\b^\u0010_R\u0014\u0010d\u001a\u00020a8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bb\u0010c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006f"}, d2 = {"Lw0/b;", "T", "", "Landroidx/compose/ui/text/AnnotatedString;", "originalText", "Landroidx/compose/ui/text/y;", "originalSelection", "Lu1/v;", "layoutResult", "Lz1/E;", "offsetMapping", "Lw0/U;", "state", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;JLu1/v;Lz1/E;Lw0/U;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "F", "()Lw0/b;", "C", "E", "H", "", "x", "()Z", "", "currentOffset", "n", "(Lu1/v;I)I", "r", "j", "g", "linesAmount", "y", "V", "()I", "X", "W", "offset", "a", "(I)I", "", "(I)V", "start", "end", "U", "(II)V", "R", "d", "A", "I", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "or", "b", "(Lkotlin/jvm/functions/Function1;)Lw0/b;", "c", "q", "l", "L", "K", "B", "J", "m", "()Ljava/lang/Integer;", "t", "G", "D", "Q", "z", "i", "P", "f", "M", "N", "O", "S", "Landroidx/compose/ui/text/AnnotatedString;", "getOriginalText", "()Landroidx/compose/ui/text/AnnotatedString;", "getOriginalSelection-d9O1mEE", "()J", "Lu1/v;", "getLayoutResult", "()Lu1/v;", "Lz1/E;", "p", "()Lz1/E;", "e", "Lw0/U;", "v", "()Lw0/U;", "u", "setSelection-5zc-tL8", "(J)V", "selection", "setAnnotatedString", "(Landroidx/compose/ui/text/AnnotatedString;)V", "annotatedString", "", "w", "()Ljava/lang/String;", "text", "h", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: w0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC17786b<T extends AbstractC17786b<T>> {

    /* renamed from: i, reason: collision with root package name */
    public static final int f166711i = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AnnotatedString originalText;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long originalSelection;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final TextLayoutResult layoutResult;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC18417E offsetMapping;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final C17781U state;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long selection;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private AnnotatedString annotatedString;

    public /* synthetic */ AbstractC17786b(AnnotatedString annotatedString, long j10, TextLayoutResult textLayoutResult, InterfaceC18417E interfaceC18417E, C17781U c17781u, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, j10, textLayoutResult, interfaceC18417E, c17781u);
    }

    private AbstractC17786b(AnnotatedString annotatedString, long j10, TextLayoutResult textLayoutResult, InterfaceC18417E interfaceC18417E, C17781U c17781u) {
        this.originalText = annotatedString;
        this.originalSelection = j10;
        this.layoutResult = textLayoutResult;
        this.offsetMapping = interfaceC18417E;
        this.state = c17781u;
        this.selection = j10;
        this.annotatedString = annotatedString;
    }

    private final int V() {
        return this.offsetMapping.b(y.i(this.selection));
    }

    private final int W() {
        return this.offsetMapping.b(y.k(this.selection));
    }

    private final int X() {
        return this.offsetMapping.b(y.l(this.selection));
    }

    static /* synthetic */ int h(AbstractC17786b abstractC17786b, TextLayoutResult textLayoutResult, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEndByOffsetForLayout");
        }
        if ((i11 & 1) != 0) {
            i10 = abstractC17786b.W();
        }
        return abstractC17786b.g(textLayoutResult, i10);
    }

    static /* synthetic */ int k(AbstractC17786b abstractC17786b, TextLayoutResult textLayoutResult, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineStartByOffsetForLayout");
        }
        if ((i11 & 1) != 0) {
            i10 = abstractC17786b.X();
        }
        return abstractC17786b.j(textLayoutResult, i10);
    }

    private final int n(TextLayoutResult textLayoutResult, int i10) {
        while (i10 < this.originalText.length()) {
            long jC = textLayoutResult.C(a(i10));
            if (y.i(jC) > i10) {
                return this.offsetMapping.a(y.i(jC));
            }
            i10++;
        }
        return this.originalText.length();
    }

    static /* synthetic */ int o(AbstractC17786b abstractC17786b, TextLayoutResult textLayoutResult, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNextWordOffsetForLayout");
        }
        if ((i11 & 1) != 0) {
            i10 = abstractC17786b.V();
        }
        return abstractC17786b.n(textLayoutResult, i10);
    }

    private final int r(TextLayoutResult textLayoutResult, int i10) {
        while (i10 > 0) {
            long jC = textLayoutResult.C(a(i10));
            if (y.n(jC) < i10) {
                return this.offsetMapping.a(y.n(jC));
            }
            i10--;
        }
        return 0;
    }

    static /* synthetic */ int s(AbstractC17786b abstractC17786b, TextLayoutResult textLayoutResult, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPrevWordOffset");
        }
        if ((i11 & 1) != 0) {
            i10 = abstractC17786b.V();
        }
        return abstractC17786b.r(textLayoutResult, i10);
    }

    private final boolean x() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        return (textLayoutResult != null ? textLayoutResult.y(V()) : null) != F1.i.f8931b;
    }

    /* renamed from: e, reason: from getter */
    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    public final Integer f() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult != null) {
            return Integer.valueOf(h(this, textLayoutResult, 0, 1, null));
        }
        return null;
    }

    public final Integer i() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult != null) {
            return Integer.valueOf(k(this, textLayoutResult, 0, 1, null));
        }
        return null;
    }

    public final int l() {
        return I.a(this.annotatedString.getText(), y.i(this.selection));
    }

    public final Integer m() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult != null) {
            return Integer.valueOf(o(this, textLayoutResult, 0, 1, null));
        }
        return null;
    }

    /* renamed from: p, reason: from getter */
    public final InterfaceC18417E getOffsetMapping() {
        return this.offsetMapping;
    }

    public final int q() {
        return I.b(this.annotatedString.getText(), y.i(this.selection));
    }

    public final Integer t() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult != null) {
            return Integer.valueOf(s(this, textLayoutResult, 0, 1, null));
        }
        return null;
    }

    /* renamed from: u, reason: from getter */
    public final long getSelection() {
        return this.selection;
    }

    /* renamed from: v, reason: from getter */
    public final C17781U getState() {
        return this.state;
    }

    public final String w() {
        return this.annotatedString.getText();
    }

    private final T C() {
        int iL;
        getState().b();
        if (w().length() > 0 && (iL = l()) != -1) {
            T(iL);
        }
        Intrinsics.h(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final T E() {
        Integer numM;
        getState().b();
        if (w().length() > 0 && (numM = m()) != null) {
            T(numM.intValue());
        }
        Intrinsics.h(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final T F() {
        int iQ;
        getState().b();
        if (w().length() > 0 && (iQ = q()) != -1) {
            T(iQ);
        }
        Intrinsics.h(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final T H() {
        Integer numT;
        getState().b();
        if (w().length() > 0 && (numT = t()) != null) {
            T(numT.intValue());
        }
        Intrinsics.h(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final int a(int offset) {
        return RangesKt.k(offset, w().length() - 1);
    }

    private final int g(TextLayoutResult textLayoutResult, int i10) {
        return this.offsetMapping.a(textLayoutResult.o(textLayoutResult.q(i10), true));
    }

    private final int j(TextLayoutResult textLayoutResult, int i10) {
        return this.offsetMapping.a(textLayoutResult.u(textLayoutResult.q(i10)));
    }

    private final int y(TextLayoutResult textLayoutResult, int i10) {
        int iV = V();
        if (this.state.getCachedX() == null) {
            this.state.c(Float.valueOf(textLayoutResult.e(iV).getLeft()));
        }
        int iQ = textLayoutResult.q(iV) + i10;
        if (iQ < 0) {
            return 0;
        }
        if (iQ >= textLayoutResult.n()) {
            return w().length();
        }
        float fM = textLayoutResult.m(iQ) - 1;
        Float cachedX = this.state.getCachedX();
        Intrinsics.g(cachedX);
        float fFloatValue = cachedX.floatValue();
        if ((x() && fFloatValue >= textLayoutResult.t(iQ)) || (!x() && fFloatValue <= textLayoutResult.s(iQ))) {
            return textLayoutResult.o(iQ, true);
        }
        return this.offsetMapping.a(textLayoutResult.x(U0.f.e((Float.floatToRawIntBits(cachedX.floatValue()) << 32) | (Float.floatToRawIntBits(fM) & 4294967295L))));
    }

    public final T A() {
        getState().b();
        if (w().length() > 0) {
            if (x()) {
                F();
            } else {
                C();
            }
        }
        Intrinsics.h(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T B() {
        getState().b();
        if (w().length() > 0) {
            if (x()) {
                H();
            } else {
                E();
            }
        }
        Intrinsics.h(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T D() {
        getState().b();
        if (w().length() > 0) {
            int iA = H.a(w(), y.k(this.selection));
            if (iA == y.k(this.selection) && iA != w().length()) {
                iA = H.a(w(), iA + 1);
            }
            T(iA);
        }
        Intrinsics.h(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T G() {
        getState().b();
        if (w().length() > 0) {
            int iB = H.b(w(), y.l(this.selection));
            if (iB == y.l(this.selection) && iB != 0) {
                iB = H.b(w(), iB - 1);
            }
            T(iB);
        }
        Intrinsics.h(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T I() {
        getState().b();
        if (w().length() > 0) {
            if (x()) {
                C();
            } else {
                F();
            }
        }
        Intrinsics.h(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T J() {
        getState().b();
        if (w().length() > 0) {
            if (x()) {
                E();
            } else {
                H();
            }
        }
        Intrinsics.h(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T K() {
        getState().b();
        if (w().length() > 0) {
            T(w().length());
        }
        Intrinsics.h(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T L() {
        getState().b();
        if (w().length() > 0) {
            T(0);
        }
        Intrinsics.h(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T M() {
        Integer numF;
        getState().b();
        if (w().length() > 0 && (numF = f()) != null) {
            T(numF.intValue());
        }
        Intrinsics.h(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T N() {
        getState().b();
        if (w().length() > 0) {
            if (x()) {
                P();
            } else {
                M();
            }
        }
        Intrinsics.h(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T O() {
        getState().b();
        if (w().length() > 0) {
            if (x()) {
                M();
            } else {
                P();
            }
        }
        Intrinsics.h(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T P() {
        Integer numI;
        getState().b();
        if (w().length() > 0 && (numI = i()) != null) {
            T(numI.intValue());
        }
        Intrinsics.h(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T Q() {
        TextLayoutResult textLayoutResult;
        if (w().length() > 0 && (textLayoutResult = this.layoutResult) != null) {
            T(y(textLayoutResult, -1));
        }
        Intrinsics.h(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T R() {
        getState().b();
        if (w().length() > 0) {
            U(0, w().length());
        }
        Intrinsics.h(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T S() {
        if (w().length() > 0) {
            this.selection = C17334A.b(y.n(this.originalSelection), y.i(this.selection));
        }
        Intrinsics.h(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    protected final void T(int offset) {
        U(offset, offset);
    }

    protected final void U(int start, int end) {
        this.selection = C17334A.b(start, end);
    }

    public final T b(Function1<? super T, Unit> or2) {
        getState().b();
        if (w().length() > 0) {
            if (y.h(this.selection)) {
                Intrinsics.h(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
                or2.invoke(this);
            } else if (x()) {
                T(y.l(this.selection));
            } else {
                T(y.k(this.selection));
            }
        }
        Intrinsics.h(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T c(Function1<? super T, Unit> or2) {
        getState().b();
        if (w().length() > 0) {
            if (y.h(this.selection)) {
                Intrinsics.h(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
                or2.invoke(this);
            } else if (x()) {
                T(y.k(this.selection));
            } else {
                T(y.l(this.selection));
            }
        }
        Intrinsics.h(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T d() {
        getState().b();
        if (w().length() > 0) {
            T(y.i(this.selection));
        }
        Intrinsics.h(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T z() {
        TextLayoutResult textLayoutResult;
        if (w().length() > 0 && (textLayoutResult = this.layoutResult) != null) {
            T(y(textLayoutResult, 1));
        }
        Intrinsics.h(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }
}
