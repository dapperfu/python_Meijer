package androidx.compose.foundation.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextStyle;
import com.google.android.gms.common.api.a;
import i0.C14592e;
import java.util.List;
import kotlin.AbstractC18269l;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import u1.C17335B;
import u1.Placeholder;
import u1.TextLayoutResult;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u0000 #2\u00020\u0001:\u0001%Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\"\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001f\u0010 J,\u0010#\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!ø\u0001\u0000¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b/\u0010.\u001a\u0004\b1\u00100R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001d\u0010\f\u001a\u00020\u000b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b5\u0010.\u001a\u0004\b6\u00100R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b%\u00108R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b)\u0010;R#\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00118\u0006¢\u0006\f\n\u0004\b3\u0010<\u001a\u0004\b9\u0010=R$\u0010D\u001a\u0004\u0018\u00010>8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR$\u0010I\u001a\u0004\u0018\u00010\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010 R\u0014\u0010J\u001a\u00020>8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u0010AR\u0011\u0010K\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b-\u00100\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006L"}, d2 = {"Landroidx/compose/foundation/text/N;", "", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/z;", "style", "", "maxLines", "minLines", "", "softWrap", "LF1/t;", "overflow", "LH1/d;", "density", "Ly1/l$b;", "fontFamilyResolver", "", "Landroidx/compose/ui/text/AnnotatedString$d;", "Lu1/i;", "placeholders", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/z;IIZILH1/d;Ly1/l$b;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "LH1/b;", "constraints", "LH1/t;", "layoutDirection", "Landroidx/compose/ui/text/g;", "n", "(JLH1/t;)Landroidx/compose/ui/text/g;", "", "m", "(LH1/t;)V", "Lu1/v;", "prevResult", "l", "(JLH1/t;Lu1/v;)Lu1/v;", "a", "Landroidx/compose/ui/text/AnnotatedString;", "k", "()Landroidx/compose/ui/text/AnnotatedString;", "b", "Landroidx/compose/ui/text/z;", "j", "()Landroidx/compose/ui/text/z;", "c", "I", "d", "()I", "e", "Z", "i", "()Z", "f", "g", "LH1/d;", "()LH1/d;", "h", "Ly1/l$b;", "()Ly1/l$b;", "Ljava/util/List;", "()Ljava/util/List;", "Landroidx/compose/ui/text/h;", "Landroidx/compose/ui/text/h;", "getParagraphIntrinsics$foundation_release", "()Landroidx/compose/ui/text/h;", "setParagraphIntrinsics$foundation_release", "(Landroidx/compose/ui/text/h;)V", "paragraphIntrinsics", "LH1/t;", "getIntrinsicsLayoutDirection$foundation_release", "()LH1/t;", "setIntrinsicsLayoutDirection$foundation_release", "intrinsicsLayoutDirection", "nonNullIntrinsics", "maxIntrinsicWidth", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AnnotatedString text;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final TextStyle style;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int maxLines;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int minLines;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean softWrap;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int overflow;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final H1.d density;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final AbstractC18269l.b fontFamilyResolver;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final List<AnnotatedString.Range<Placeholder>> placeholders;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private androidx.compose.ui.text.h paragraphIntrinsics;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private H1.t intrinsicsLayoutDirection;

    public /* synthetic */ N(AnnotatedString annotatedString, TextStyle textStyle, int i10, int i11, boolean z10, int i12, H1.d dVar, AbstractC18269l.b bVar, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, i10, i11, z10, i12, dVar, bVar, list);
    }

    private N(AnnotatedString annotatedString, TextStyle textStyle, int i10, int i11, boolean z10, int i12, H1.d dVar, AbstractC18269l.b bVar, List<AnnotatedString.Range<Placeholder>> list) {
        this.text = annotatedString;
        this.style = textStyle;
        this.maxLines = i10;
        this.minLines = i11;
        this.softWrap = z10;
        this.overflow = i12;
        this.density = dVar;
        this.fontFamilyResolver = bVar;
        this.placeholders = list;
        if (!(i10 > 0)) {
            C14592e.a("no maxLines");
        }
        if (!(i11 > 0)) {
            C14592e.a("no minLines");
        }
        if (i11 <= i10) {
            return;
        }
        C14592e.a("minLines greater than maxLines");
    }

    private final androidx.compose.ui.text.h f() {
        androidx.compose.ui.text.h hVar = this.paragraphIntrinsics;
        if (hVar != null) {
            return hVar;
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }

    /* renamed from: a, reason: from getter */
    public final H1.d getDensity() {
        return this.density;
    }

    /* renamed from: b, reason: from getter */
    public final AbstractC18269l.b getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    /* renamed from: d, reason: from getter */
    public final int getMaxLines() {
        return this.maxLines;
    }

    /* renamed from: e, reason: from getter */
    public final int getMinLines() {
        return this.minLines;
    }

    /* renamed from: g, reason: from getter */
    public final int getOverflow() {
        return this.overflow;
    }

    public final List<AnnotatedString.Range<Placeholder>> h() {
        return this.placeholders;
    }

    /* renamed from: i, reason: from getter */
    public final boolean getSoftWrap() {
        return this.softWrap;
    }

    /* renamed from: j, reason: from getter */
    public final TextStyle getStyle() {
        return this.style;
    }

    /* renamed from: k, reason: from getter */
    public final AnnotatedString getText() {
        return this.text;
    }

    public final TextLayoutResult l(long constraints, H1.t layoutDirection, TextLayoutResult prevResult) {
        if (prevResult != null && g0.a(prevResult, this.text, this.style, this.placeholders, this.maxLines, this.softWrap, this.overflow, this.density, layoutDirection, this.fontFamilyResolver, constraints)) {
            return prevResult.a(new TextLayoutInput(prevResult.getLayoutInput().getText(), this.style, prevResult.getLayoutInput().g(), prevResult.getLayoutInput().getMaxLines(), prevResult.getLayoutInput().getSoftWrap(), prevResult.getLayoutInput().getOverflow(), prevResult.getLayoutInput().getDensity(), prevResult.getLayoutInput().getLayoutDirection(), prevResult.getLayoutInput().getFontFamilyResolver(), constraints, (DefaultConstructorMarker) null), H1.c.d(constraints, H1.r.c((O.a(prevResult.getMultiParagraph().getHeight()) & 4294967295L) | (O.a(prevResult.getMultiParagraph().getWidth()) << 32))));
        }
        return new TextLayoutResult(new TextLayoutInput(this.text, this.style, this.placeholders, this.maxLines, this.softWrap, this.overflow, this.density, layoutDirection, this.fontFamilyResolver, constraints, (DefaultConstructorMarker) null), n(constraints, layoutDirection), H1.c.d(constraints, H1.r.c((O.a(r14.getHeight()) & 4294967295L) | (O.a(r14.getWidth()) << 32))), null);
    }

    public final void m(H1.t layoutDirection) {
        androidx.compose.ui.text.h hVar = this.paragraphIntrinsics;
        if (hVar == null || layoutDirection != this.intrinsicsLayoutDirection || hVar.a()) {
            this.intrinsicsLayoutDirection = layoutDirection;
            hVar = new androidx.compose.ui.text.h(this.text, C17335B.d(this.style, layoutDirection), this.placeholders, this.density, this.fontFamilyResolver);
        }
        this.paragraphIntrinsics = hVar;
    }

    private final androidx.compose.ui.text.g n(long constraints, H1.t layoutDirection) {
        int iL;
        int i10;
        m(layoutDirection);
        int iN = H1.b.n(constraints);
        if ((this.softWrap || F1.t.g(this.overflow, F1.t.INSTANCE.b())) && H1.b.h(constraints)) {
            iL = H1.b.l(constraints);
        } else {
            iL = a.e.API_PRIORITY_OTHER;
        }
        if (!this.softWrap && F1.t.g(this.overflow, F1.t.INSTANCE.b())) {
            i10 = 1;
        } else {
            i10 = this.maxLines;
        }
        int i11 = i10;
        if (iN != iL) {
            iL = RangesKt.o(c(), iN, iL);
        }
        return new androidx.compose.ui.text.g(f(), H1.b.INSTANCE.b(0, iL, 0, H1.b.k(constraints)), i11, this.overflow, null);
    }

    public final int c() {
        return O.a(f().c());
    }

    public /* synthetic */ N(AnnotatedString annotatedString, TextStyle textStyle, int i10, int i11, boolean z10, int i12, H1.d dVar, AbstractC18269l.b bVar, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, (i13 & 4) != 0 ? Integer.MAX_VALUE : i10, (i13 & 8) != 0 ? 1 : i11, (i13 & 16) != 0 ? true : z10, (i13 & 32) != 0 ? F1.t.INSTANCE.a() : i12, dVar, bVar, (i13 & 256) != 0 ? CollectionsKt.m() : list, null);
    }
}
