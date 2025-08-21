package v0;

import H1.r;
import H1.t;
import androidx.compose.foundation.text.L;
import androidx.compose.foundation.text.O;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextStyle;
import com.google.android.gms.common.api.a;
import java.util.List;
import kotlin.AbstractC18269l;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import u1.C17335B;
import u1.Placeholder;
import u1.TextLayoutResult;
import v0.C17577c;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u00018Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\"\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ*\u0010!\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u001eH\u0002ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b$\u0010%J\"\u0010&\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b&\u0010'J(\u0010(\u001a\u00020\n*\u0004\u0018\u00010 2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020*H\u0002¢\u0006\u0004\b-\u0010,J \u0010.\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u001d\u00101\u001a\u00020\f2\u0006\u00100\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b1\u00102Jh\u00103\u001a\u00020*2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0014\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0018\u00010\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013ø\u0001\u0000¢\u0006\u0004\b3\u00104J\u0015\u00105\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b5\u00106J\u0015\u00107\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b7\u00106R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u001c\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010>R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010=R\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010=R$\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010?R\u0018\u0010B\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010AR\u001c\u0010E\u001a\u00020C8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b5\u0010DR.\u0010L\u001a\u0004\u0018\u00010F2\b\u0010G\u001a\u0004\u0018\u00010F8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b7\u0010H\u001a\u0004\b8\u0010I\"\u0004\bJ\u0010KR$\u0010\u0005\u001a\u00020\u00042\u0006\u0010G\u001a\u00020\u00048\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b(\u0010M\"\u0004\bN\u0010OR\u0018\u0010Q\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010PR\u0018\u0010S\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010RR\u0018\u0010U\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010TR\u0016\u0010V\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010=R\u0016\u0010W\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010=R\u001c\u0010Z\u001a\b\u0018\u00010XR\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010YR\u0011\u0010\\\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b<\u0010[R\u0013\u0010]\u001a\u0004\u0018\u00010 8F¢\u0006\u0006\u001a\u0004\b:\u0010[\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006^"}, d2 = {"Lv0/e;", "", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/z;", "style", "Ly1/l$b;", "fontFamilyResolver", "LF1/t;", "overflow", "", "softWrap", "", "maxLines", "minLines", "", "Landroidx/compose/ui/text/AnnotatedString$d;", "Lu1/i;", "placeholders", "Landroidx/compose/foundation/text/L;", "autoSize", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/z;Ly1/l$b;IZIILjava/util/List;Landroidx/compose/foundation/text/L;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "LH1/b;", "constraints", "LH1/t;", "layoutDirection", "q", "(JLH1/t;)J", "finalConstraints", "Landroidx/compose/ui/text/g;", "multiParagraph", "Lu1/v;", "o", "(LH1/t;JLandroidx/compose/ui/text/g;)Lu1/v;", "Landroidx/compose/ui/text/h;", "m", "(LH1/t;)Landroidx/compose/ui/text/h;", "e", "(JLH1/t;)Landroidx/compose/ui/text/g;", "k", "(Lu1/v;JLH1/t;)Z", "", "g", "()V", "h", "f", "(JLH1/t;)Z", "width", "d", "(ILH1/t;)I", "p", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/z;Ly1/l$b;IZIILjava/util/List;Landroidx/compose/foundation/text/L;)V", "i", "(LH1/t;)I", "j", "a", "Landroidx/compose/ui/text/AnnotatedString;", "b", "Ly1/l$b;", "c", "I", "Z", "Ljava/util/List;", "Lv0/c;", "Lv0/c;", "mMinLinesConstrainer", "Lv0/a;", "J", "lastDensity", "LH1/d;", "value", "LH1/d;", "()LH1/d;", "l", "(LH1/d;)V", "density", "Landroidx/compose/ui/text/z;", "n", "(Landroidx/compose/ui/text/z;)V", "Landroidx/compose/ui/text/h;", "paragraphIntrinsics", "LH1/t;", "intrinsicsLayoutDirection", "Lu1/v;", "layoutCache", "cachedIntrinsicHeightInputWidth", "cachedIntrinsicHeight", "Lv0/e$a;", "Lv0/e$a;", "_textAutoSizeLayoutScope", "()Lu1/v;", "textLayoutResult", "layoutOrNull", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: v0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17579e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private AnnotatedString text;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private AbstractC18269l.b fontFamilyResolver;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int overflow;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean softWrap;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int maxLines;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int minLines;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private List<AnnotatedString.Range<Placeholder>> placeholders;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private C17577c mMinLinesConstrainer;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private long lastDensity;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private H1.d density;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private TextStyle style;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private androidx.compose.ui.text.h paragraphIntrinsics;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private t intrinsicsLayoutDirection;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private TextLayoutResult layoutCache;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private int cachedIntrinsicHeightInputWidth;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private int cachedIntrinsicHeight;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private a _textAutoSizeLayoutScope;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lv0/e$a;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: v0.e$a */
    private final class a implements H1.d {
    }

    public /* synthetic */ C17579e(AnnotatedString annotatedString, TextStyle textStyle, AbstractC18269l.b bVar, int i10, boolean z10, int i11, int i12, List list, L l10, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, bVar, i10, z10, i11, i12, list, l10);
    }

    private final void g() {
        this.paragraphIntrinsics = null;
        this.layoutCache = null;
        this.cachedIntrinsicHeight = -1;
        this.cachedIntrinsicHeightInputWidth = -1;
        this._textAutoSizeLayoutScope = null;
    }

    private final void h() {
        this.paragraphIntrinsics = null;
        this.layoutCache = null;
        this.cachedIntrinsicHeight = -1;
        this.cachedIntrinsicHeightInputWidth = -1;
    }

    private final boolean k(TextLayoutResult textLayoutResult, long j10, t tVar) {
        if (textLayoutResult == null || textLayoutResult.getMultiParagraph().getIntrinsics().a() || tVar != textLayoutResult.getLayoutInput().getLayoutDirection()) {
            return true;
        }
        if (H1.b.f(j10, textLayoutResult.getLayoutInput().getConstraints())) {
            return false;
        }
        return H1.b.l(j10) != H1.b.l(textLayoutResult.getLayoutInput().getConstraints()) || H1.b.n(j10) != H1.b.n(textLayoutResult.getLayoutInput().getConstraints()) || ((float) H1.b.k(j10)) < textLayoutResult.getMultiParagraph().getHeight() || textLayoutResult.getMultiParagraph().getDidExceedMaxLines();
    }

    private C17579e(AnnotatedString annotatedString, TextStyle textStyle, AbstractC18269l.b bVar, int i10, boolean z10, int i11, int i12, List<AnnotatedString.Range<Placeholder>> list, L l10) {
        this.text = annotatedString;
        this.fontFamilyResolver = bVar;
        this.overflow = i10;
        this.softWrap = z10;
        this.maxLines = i11;
        this.minLines = i12;
        this.placeholders = list;
        this.lastDensity = C17575a.INSTANCE.a();
        this.style = textStyle;
        this.cachedIntrinsicHeightInputWidth = -1;
        this.cachedIntrinsicHeight = -1;
    }

    private final androidx.compose.ui.text.h m(t layoutDirection) {
        androidx.compose.ui.text.h hVar = this.paragraphIntrinsics;
        if (hVar == null || layoutDirection != this.intrinsicsLayoutDirection || hVar.a()) {
            this.intrinsicsLayoutDirection = layoutDirection;
            AnnotatedString annotatedString = this.text;
            TextStyle textStyleD = C17335B.d(this.style, layoutDirection);
            H1.d dVar = this.density;
            Intrinsics.g(dVar);
            AbstractC18269l.b bVar = this.fontFamilyResolver;
            List<AnnotatedString.Range<Placeholder>> listM = this.placeholders;
            if (listM == null) {
                listM = CollectionsKt.m();
            }
            hVar = new androidx.compose.ui.text.h(annotatedString, textStyleD, listM, dVar, bVar);
        }
        this.paragraphIntrinsics = hVar;
        return hVar;
    }

    private final void n(TextStyle textStyle) {
        boolean zG = textStyle.G(this.style);
        this.style = textStyle;
        if (zG) {
            return;
        }
        h();
    }

    private final TextLayoutResult o(t layoutDirection, long finalConstraints, androidx.compose.ui.text.g multiParagraph) {
        float fMin = Math.min(multiParagraph.getIntrinsics().c(), multiParagraph.getWidth());
        AnnotatedString annotatedString = this.text;
        TextStyle textStyle = this.style;
        List<AnnotatedString.Range<Placeholder>> listM = this.placeholders;
        if (listM == null) {
            listM = CollectionsKt.m();
        }
        int i10 = this.maxLines;
        boolean z10 = this.softWrap;
        int i11 = this.overflow;
        H1.d dVar = this.density;
        Intrinsics.g(dVar);
        return new TextLayoutResult(new TextLayoutInput(annotatedString, textStyle, listM, i10, z10, i11, dVar, layoutDirection, this.fontFamilyResolver, finalConstraints, (DefaultConstructorMarker) null), multiParagraph, H1.c.d(finalConstraints, r.c((O.a(fMin) << 32) | (O.a(multiParagraph.getHeight()) & 4294967295L))), null);
    }

    private final long q(long constraints, t layoutDirection) {
        C17577c.Companion companion = C17577c.INSTANCE;
        C17577c c17577c = this.mMinLinesConstrainer;
        TextStyle textStyle = this.style;
        H1.d dVar = this.density;
        Intrinsics.g(dVar);
        C17577c c17577cA = companion.a(c17577c, layoutDirection, textStyle, dVar, this.fontFamilyResolver);
        this.mMinLinesConstrainer = c17577cA;
        return c17577cA.c(constraints, this.minLines);
    }

    /* renamed from: a, reason: from getter */
    public final H1.d getDensity() {
        return this.density;
    }

    /* renamed from: b, reason: from getter */
    public final TextLayoutResult getLayoutCache() {
        return this.layoutCache;
    }

    public final TextLayoutResult c() {
        TextLayoutResult textLayoutResult = this.layoutCache;
        if (textLayoutResult != null) {
            return textLayoutResult;
        }
        throw new IllegalStateException("You must call layoutWithConstraints first");
    }

    public final int d(int width, t layoutDirection) {
        int i10 = this.cachedIntrinsicHeightInputWidth;
        int i11 = this.cachedIntrinsicHeight;
        if (width == i10 && i10 != -1) {
            return i11;
        }
        long jA = H1.c.a(0, width, 0, a.e.API_PRIORITY_OTHER);
        if (this.minLines > 1) {
            jA = q(jA, layoutDirection);
        }
        int iF = RangesKt.f(O.a(e(jA, layoutDirection).getHeight()), H1.b.m(jA));
        this.cachedIntrinsicHeightInputWidth = width;
        this.cachedIntrinsicHeight = iF;
        return iF;
    }

    public final boolean f(long constraints, t layoutDirection) {
        if (this.minLines > 1) {
            constraints = q(constraints, layoutDirection);
        }
        if (k(this.layoutCache, constraints, layoutDirection)) {
            this.layoutCache = o(layoutDirection, constraints, e(constraints, layoutDirection));
            return true;
        }
        TextLayoutResult textLayoutResult = this.layoutCache;
        Intrinsics.g(textLayoutResult);
        if (H1.b.f(constraints, textLayoutResult.getLayoutInput().getConstraints())) {
            return false;
        }
        TextLayoutResult textLayoutResult2 = this.layoutCache;
        Intrinsics.g(textLayoutResult2);
        this.layoutCache = o(layoutDirection, constraints, textLayoutResult2.getMultiParagraph());
        return true;
    }

    public final void l(H1.d dVar) {
        H1.d dVar2 = this.density;
        long jD = dVar != null ? C17575a.d(dVar) : C17575a.INSTANCE.a();
        if (dVar2 == null) {
            this.density = dVar;
            this.lastDensity = jD;
        } else if (dVar == null || !C17575a.e(this.lastDensity, jD)) {
            this.density = dVar;
            this.lastDensity = jD;
            g();
        }
    }

    public final void p(AnnotatedString text, TextStyle style, AbstractC18269l.b fontFamilyResolver, int overflow, boolean softWrap, int maxLines, int minLines, List<AnnotatedString.Range<Placeholder>> placeholders, L autoSize) {
        this.text = text;
        n(style);
        this.fontFamilyResolver = fontFamilyResolver;
        this.overflow = overflow;
        this.softWrap = softWrap;
        this.maxLines = maxLines;
        this.minLines = minLines;
        this.placeholders = placeholders;
        g();
    }

    private final androidx.compose.ui.text.g e(long constraints, t layoutDirection) {
        androidx.compose.ui.text.h hVarM = m(layoutDirection);
        return new androidx.compose.ui.text.g(hVarM, C17576b.a(constraints, this.softWrap, this.overflow, hVarM.c()), C17576b.b(this.softWrap, this.overflow, this.maxLines), this.overflow, null);
    }

    public final int i(t layoutDirection) {
        return O.a(m(layoutDirection).c());
    }

    public final int j(t layoutDirection) {
        return O.a(m(layoutDirection).e());
    }
}
