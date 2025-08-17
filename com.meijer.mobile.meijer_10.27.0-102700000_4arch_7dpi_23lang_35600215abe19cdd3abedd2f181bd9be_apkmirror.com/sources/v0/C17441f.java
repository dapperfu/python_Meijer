package v0;

import H1.r;
import H1.t;
import androidx.compose.foundation.text.O;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.l;
import androidx.compose.ui.text.m;
import com.google.android.gms.common.api.a;
import com.google.maps.android.BuildConfig;
import java.util.List;
import kotlin.AbstractC18142l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import u1.C17208B;
import u1.InterfaceC17214f;
import u1.InterfaceC17216h;
import u1.TextLayoutResult;
import v0.C17438c;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J,\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\"\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010\u001f\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001bJ\u001d\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b!\u0010\"JH\u0010#\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b#\u0010$J\"\u0010&\u001a\u00020%2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0000ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b+\u0010,J\u0015\u0010-\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b-\u0010,J\u000f\u0010.\u001a\u00020\u0002H\u0016¢\u0006\u0004\b.\u0010/R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u001c\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u00107R\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u00107R\u001c\u0010<\u001a\u00020:8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001f\u0010;R.\u0010C\u001a\u0004\u0018\u00010=2\b\u0010>\u001a\u0004\u0018\u00010=8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010?\u001a\u0004\b0\u0010@\"\u0004\bA\u0010BR$\u0010H\u001a\u0004\u0018\u00010%8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b-\u0010D\u001a\u0004\b8\u0010E\"\u0004\bF\u0010GR\"\u0010L\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u00109\u001a\u0004\b2\u0010I\"\u0004\bJ\u0010KR(\u0010Q\u001a\u00020M8\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001a\u0010;\u001a\u0004\b4\u0010N\"\u0004\bO\u0010PR\u0018\u0010T\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010SR\u0018\u0010V\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010UR\u0018\u0010X\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010WR\u001c\u0010Y\u001a\u00020\u00118\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b#\u0010;R\u0016\u0010Z\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u00107R\u0016\u0010\\\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u00107R\u0014\u0010^\u001a\u00020\u001c8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b6\u0010]\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006_"}, d2 = {"Lv0/f;", "", "", "text", "Landroidx/compose/ui/text/z;", "style", "Ly1/l$b;", "fontFamilyResolver", "LF1/t;", "overflow", "", "softWrap", "", "maxLines", "minLines", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/text/z;Ly1/l$b;IZIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "LH1/b;", "constraints", "LH1/t;", "layoutDirection", "q", "(JLH1/t;Landroidx/compose/ui/text/z;)J", "Lu1/h;", "n", "(LH1/t;)Lu1/h;", "l", "(JLH1/t;)Z", "", "i", "()V", "h", "width", "f", "(ILH1/t;)I", "p", "(Ljava/lang/String;Landroidx/compose/ui/text/z;Ly1/l$b;IZII)V", "Lu1/f;", "g", "(JLH1/t;)Lu1/f;", "Lu1/v;", "o", "(Landroidx/compose/ui/text/z;)Lu1/v;", "k", "(LH1/t;)I", "j", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "Landroidx/compose/ui/text/z;", "c", "Ly1/l$b;", "d", "I", "e", "Z", "Lv0/a;", "J", "lastDensity", "LH1/d;", "value", "LH1/d;", "()LH1/d;", "m", "(LH1/d;)V", "density", "Lu1/f;", "()Lu1/f;", "setParagraph$foundation_release", "(Lu1/f;)V", "paragraph", "()Z", "setDidOverflow$foundation_release", "(Z)V", "didOverflow", "LH1/r;", "()J", "setLayoutSize-ozmzZPI$foundation_release", "(J)V", "layoutSize", "Lv0/c;", "Lv0/c;", "mMinLinesConstrainer", "Lu1/h;", "paragraphIntrinsics", "LH1/t;", "intrinsicsLayoutDirection", "prevConstraints", "cachedIntrinsicHeightInputWidth", "r", "cachedIntrinsicHeight", "()Lkotlin/Unit;", "observeFontChanges", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: v0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17441f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String text;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private TextStyle style;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private AbstractC18142l.b fontFamilyResolver;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int overflow;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean softWrap;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int maxLines;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int minLines;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private long lastDensity;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private H1.d density;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private InterfaceC17214f paragraph;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean didOverflow;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private long layoutSize;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private C17438c mMinLinesConstrainer;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private InterfaceC17216h paragraphIntrinsics;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private t intrinsicsLayoutDirection;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private long prevConstraints;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private int cachedIntrinsicHeightInputWidth;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private int cachedIntrinsicHeight;

    public /* synthetic */ C17441f(String str, TextStyle textStyle, AbstractC18142l.b bVar, int i10, boolean z10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textStyle, bVar, i10, z10, i11, i12);
    }

    private final void i() {
        this.paragraph = null;
        this.paragraphIntrinsics = null;
        this.intrinsicsLayoutDirection = null;
        this.cachedIntrinsicHeightInputWidth = -1;
        this.cachedIntrinsicHeight = -1;
        this.prevConstraints = H1.b.INSTANCE.c(0, 0);
        long j10 = 0;
        this.layoutSize = r.c((j10 & 4294967295L) | (j10 << 32));
        this.didOverflow = false;
    }

    private C17441f(String str, TextStyle textStyle, AbstractC18142l.b bVar, int i10, boolean z10, int i11, int i12) {
        this.text = str;
        this.style = textStyle;
        this.fontFamilyResolver = bVar;
        this.overflow = i10;
        this.softWrap = z10;
        this.maxLines = i11;
        this.minLines = i12;
        this.lastDensity = C17436a.INSTANCE.a();
        long j10 = 0;
        this.layoutSize = r.c((j10 & 4294967295L) | (j10 << 32));
        this.prevConstraints = H1.b.INSTANCE.c(0, 0);
        this.cachedIntrinsicHeightInputWidth = -1;
        this.cachedIntrinsicHeight = -1;
    }

    private final boolean l(long constraints, t layoutDirection) {
        InterfaceC17216h interfaceC17216h;
        InterfaceC17214f interfaceC17214f = this.paragraph;
        if (interfaceC17214f == null || (interfaceC17216h = this.paragraphIntrinsics) == null || interfaceC17216h.a() || layoutDirection != this.intrinsicsLayoutDirection) {
            return true;
        }
        if (H1.b.f(constraints, this.prevConstraints)) {
            return false;
        }
        return H1.b.l(constraints) != H1.b.l(this.prevConstraints) || H1.b.n(constraints) != H1.b.n(this.prevConstraints) || ((float) H1.b.k(constraints)) < interfaceC17214f.getHeight() || interfaceC17214f.r();
    }

    private final InterfaceC17216h n(t layoutDirection) {
        InterfaceC17216h interfaceC17216hA = this.paragraphIntrinsics;
        if (interfaceC17216hA == null || layoutDirection != this.intrinsicsLayoutDirection || interfaceC17216hA.a()) {
            this.intrinsicsLayoutDirection = layoutDirection;
            String str = this.text;
            TextStyle textStyleD = C17208B.d(this.style, layoutDirection);
            List listM = CollectionsKt.m();
            H1.d dVar = this.density;
            Intrinsics.g(dVar);
            interfaceC17216hA = l.a(str, textStyleD, listM, dVar, this.fontFamilyResolver, CollectionsKt.m());
        }
        this.paragraphIntrinsics = interfaceC17216hA;
        return interfaceC17216hA;
    }

    private final long q(long constraints, t layoutDirection, TextStyle style) {
        C17438c.Companion aVar = C17438c.INSTANCE;
        C17438c c17438c = this.mMinLinesConstrainer;
        H1.d dVar = this.density;
        Intrinsics.g(dVar);
        C17438c c17438cA = aVar.a(c17438c, layoutDirection, style, dVar, this.fontFamilyResolver);
        this.mMinLinesConstrainer = c17438cA;
        return c17438cA.c(constraints, this.minLines);
    }

    static /* synthetic */ long r(C17441f c17441f, long j10, t tVar, TextStyle textStyle, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            textStyle = c17441f.style;
        }
        return c17441f.q(j10, tVar, textStyle);
    }

    /* renamed from: a, reason: from getter */
    public final H1.d getDensity() {
        return this.density;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getDidOverflow() {
        return this.didOverflow;
    }

    /* renamed from: c, reason: from getter */
    public final long getLayoutSize() {
        return this.layoutSize;
    }

    public final Unit d() {
        InterfaceC17216h interfaceC17216h = this.paragraphIntrinsics;
        if (interfaceC17216h != null) {
            interfaceC17216h.a();
        }
        return Unit.f142422a;
    }

    /* renamed from: e, reason: from getter */
    public final InterfaceC17214f getParagraph() {
        return this.paragraph;
    }

    public final int f(int width, t layoutDirection) {
        C17441f c17441f;
        t tVar;
        int i10 = this.cachedIntrinsicHeightInputWidth;
        int i11 = this.cachedIntrinsicHeight;
        if (width == i10 && i10 != -1) {
            return i11;
        }
        long jA = H1.c.a(0, width, 0, a.e.API_PRIORITY_OTHER);
        if (this.minLines > 1) {
            c17441f = this;
            tVar = layoutDirection;
            jA = r(c17441f, jA, tVar, null, 4, null);
        } else {
            c17441f = this;
            tVar = layoutDirection;
        }
        int iF = RangesKt.f(O.a(g(jA, tVar).getHeight()), H1.b.m(jA));
        c17441f.cachedIntrinsicHeightInputWidth = width;
        c17441f.cachedIntrinsicHeight = iF;
        return iF;
    }

    public final boolean h(long constraints, t layoutDirection) {
        C17441f c17441f;
        t tVar;
        boolean z10 = true;
        if (this.minLines > 1) {
            c17441f = this;
            tVar = layoutDirection;
            constraints = r(c17441f, constraints, tVar, null, 4, null);
        } else {
            c17441f = this;
            tVar = layoutDirection;
        }
        boolean z11 = false;
        if (l(constraints, tVar)) {
            InterfaceC17214f interfaceC17214fG = g(constraints, tVar);
            c17441f.prevConstraints = constraints;
            c17441f.layoutSize = H1.c.d(constraints, r.c((O.a(interfaceC17214fG.getWidth()) << 32) | (O.a(interfaceC17214fG.getHeight()) & 4294967295L)));
            if (!F1.t.g(c17441f.overflow, F1.t.INSTANCE.e()) && (((int) (r13 >> 32)) < interfaceC17214fG.getWidth() || ((int) (r13 & 4294967295L)) < interfaceC17214fG.getHeight())) {
                z11 = true;
            }
            c17441f.didOverflow = z11;
            c17441f.paragraph = interfaceC17214fG;
            return true;
        }
        if (!H1.b.f(constraints, c17441f.prevConstraints)) {
            InterfaceC17214f interfaceC17214f = c17441f.paragraph;
            Intrinsics.g(interfaceC17214f);
            c17441f.layoutSize = H1.c.d(constraints, r.c((O.a(Math.min(interfaceC17214f.c(), interfaceC17214f.getWidth())) << 32) | (O.a(interfaceC17214f.getHeight()) & 4294967295L)));
            if (F1.t.g(c17441f.overflow, F1.t.INSTANCE.e()) || (((int) (r7 >> 32)) >= interfaceC17214f.getWidth() && ((int) (4294967295L & r7)) >= interfaceC17214f.getHeight())) {
                z10 = false;
            }
            c17441f.didOverflow = z10;
            c17441f.prevConstraints = constraints;
        }
        return false;
    }

    public final void m(H1.d dVar) {
        H1.d dVar2 = this.density;
        long jD = dVar != null ? C17436a.d(dVar) : C17436a.INSTANCE.a();
        if (dVar2 == null) {
            this.density = dVar;
            this.lastDensity = jD;
        } else if (dVar == null || !C17436a.e(this.lastDensity, jD)) {
            this.density = dVar;
            this.lastDensity = jD;
            i();
        }
    }

    public final TextLayoutResult o(TextStyle style) {
        H1.d dVar;
        t tVar = this.intrinsicsLayoutDirection;
        if (tVar == null || (dVar = this.density) == null) {
            return null;
        }
        AnnotatedString annotatedString = new AnnotatedString(this.text, null, 2, null);
        if (this.paragraph == null || this.paragraphIntrinsics == null) {
            return null;
        }
        long jB = H1.b.b(this.prevConstraints & (-8589934589L));
        return new TextLayoutResult(new TextLayoutInput(annotatedString, style, CollectionsKt.m(), this.maxLines, this.softWrap, this.overflow, dVar, tVar, this.fontFamilyResolver, jB, (DefaultConstructorMarker) null), new androidx.compose.ui.text.g(new androidx.compose.ui.text.h(annotatedString, style, CollectionsKt.m(), dVar, this.fontFamilyResolver), jB, this.maxLines, this.overflow, null), this.layoutSize, null);
    }

    public final void p(String text, TextStyle style, AbstractC18142l.b fontFamilyResolver, int overflow, boolean softWrap, int maxLines, int minLines) {
        this.text = text;
        this.style = style;
        this.fontFamilyResolver = fontFamilyResolver;
        this.overflow = overflow;
        this.softWrap = softWrap;
        this.maxLines = maxLines;
        this.minLines = minLines;
        i();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ParagraphLayoutCache(paragraph=");
        sb2.append(this.paragraph != null ? "<paragraph>" : BuildConfig.TRAVIS);
        sb2.append(", lastDensity=");
        sb2.append((Object) C17436a.h(this.lastDensity));
        sb2.append(')');
        return sb2.toString();
    }

    public final InterfaceC17214f g(long constraints, t layoutDirection) {
        InterfaceC17216h interfaceC17216hN = n(layoutDirection);
        return m.c(interfaceC17216hN, C17437b.a(constraints, this.softWrap, this.overflow, interfaceC17216hN.c()), C17437b.b(this.softWrap, this.overflow, this.maxLines), this.overflow);
    }

    public final int j(t layoutDirection) {
        return O.a(n(layoutDirection).c());
    }

    public final int k(t layoutDirection) {
        return O.a(n(layoutDirection).e());
    }
}
