package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import com.google.android.gms.common.api.a;
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

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 /2\u00020\u0001:\u0001#B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u008a\u0001\u0010 \u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\b2\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00152\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010!Jt\u0010#\u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\"2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010.\u001a\u0004\u0018\u00010+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00060"}, d2 = {"Landroidx/compose/ui/text/w;", "", "Ly1/l$b;", "defaultFontFamilyResolver", "LH1/d;", "defaultDensity", "LH1/t;", "defaultLayoutDirection", "", "cacheSize", "<init>", "(Ly1/l$b;LH1/d;LH1/t;I)V", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/z;", "style", "LF1/t;", "overflow", "", "softWrap", "maxLines", "", "Landroidx/compose/ui/text/AnnotatedString$d;", "Lu1/i;", "placeholders", "LH1/b;", "constraints", "layoutDirection", "density", "fontFamilyResolver", "skipCache", "Lu1/v;", "c", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/z;IZILjava/util/List;JLH1/t;LH1/d;Ly1/l$b;Z)Lu1/v;", "", "a", "(Ljava/lang/String;Landroidx/compose/ui/text/z;IZIJLH1/t;LH1/d;Ly1/l$b;Z)Lu1/v;", "Ly1/l$b;", "b", "LH1/d;", "LH1/t;", "d", "I", "Lu1/u;", "e", "Lu1/u;", "textLayoutCache", "f", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class w {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AbstractC18269l.b defaultFontFamilyResolver;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final H1.d defaultDensity;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final H1.t defaultLayoutDirection;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int cacheSize;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final u1.u textLayoutCache;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/w$a;", "", "<init>", "()V", "Landroidx/compose/ui/text/v;", "textLayoutInput", "Lu1/v;", "b", "(Landroidx/compose/ui/text/v;)Lu1/v;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: androidx.compose.ui.text.w$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final TextLayoutResult b(TextLayoutInput textLayoutInput) {
            int iL;
            int maxLines;
            h hVar = new h(textLayoutInput.getText(), C17335B.d(textLayoutInput.getStyle(), textLayoutInput.getLayoutDirection()), textLayoutInput.g(), textLayoutInput.getDensity(), textLayoutInput.getFontFamilyResolver());
            int iN = H1.b.n(textLayoutInput.getConstraints());
            if ((textLayoutInput.getSoftWrap() || u1.y.b(textLayoutInput.getOverflow())) && H1.b.h(textLayoutInput.getConstraints())) {
                iL = H1.b.l(textLayoutInput.getConstraints());
            } else {
                iL = a.e.API_PRIORITY_OTHER;
            }
            if (!textLayoutInput.getSoftWrap() && u1.y.b(textLayoutInput.getOverflow())) {
                maxLines = 1;
            } else {
                maxLines = textLayoutInput.getMaxLines();
            }
            int i10 = maxLines;
            if (iN != iL) {
                iL = RangesKt.o(m.d(hVar.c()), iN, iL);
            }
            return new TextLayoutResult(textLayoutInput, new g(hVar, H1.b.INSTANCE.b(0, iL, 0, H1.b.k(textLayoutInput.getConstraints())), i10, textLayoutInput.getOverflow(), null), H1.c.d(textLayoutInput.getConstraints(), H1.r.c((((int) Math.ceil(r5.getWidth())) << 32) | (((int) Math.ceil(r5.getHeight())) & 4294967295L))), null);
        }
    }

    public static /* synthetic */ TextLayoutResult b(w wVar, String str, TextStyle textStyle, int i10, boolean z10, int i11, long j10, H1.t tVar, H1.d dVar, AbstractC18269l.b bVar, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            textStyle = TextStyle.INSTANCE.a();
        }
        TextStyle textStyle2 = textStyle;
        if ((i12 & 4) != 0) {
            i10 = F1.t.INSTANCE.a();
        }
        return wVar.a(str, textStyle2, i10, (i12 & 8) != 0 ? true : z10, (i12 & 16) != 0 ? Integer.MAX_VALUE : i11, (i12 & 32) != 0 ? H1.c.b(0, 0, 0, 0, 15, null) : j10, (i12 & 64) != 0 ? wVar.defaultLayoutDirection : tVar, (i12 & 128) != 0 ? wVar.defaultDensity : dVar, (i12 & 256) != 0 ? wVar.defaultFontFamilyResolver : bVar, (i12 & 512) != 0 ? false : z11);
    }

    public static /* synthetic */ TextLayoutResult d(w wVar, AnnotatedString annotatedString, TextStyle textStyle, int i10, boolean z10, int i11, List list, long j10, H1.t tVar, H1.d dVar, AbstractC18269l.b bVar, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            textStyle = TextStyle.INSTANCE.a();
        }
        return wVar.c(annotatedString, textStyle, (i12 & 4) != 0 ? F1.t.INSTANCE.a() : i10, (i12 & 8) != 0 ? true : z10, (i12 & 16) != 0 ? Integer.MAX_VALUE : i11, (i12 & 32) != 0 ? CollectionsKt.m() : list, (i12 & 64) != 0 ? H1.c.b(0, 0, 0, 0, 15, null) : j10, (i12 & 128) != 0 ? wVar.defaultLayoutDirection : tVar, (i12 & 256) != 0 ? wVar.defaultDensity : dVar, (i12 & 512) != 0 ? wVar.defaultFontFamilyResolver : bVar, (i12 & 1024) != 0 ? false : z11);
    }

    public final TextLayoutResult a(String text, TextStyle style, int overflow, boolean softWrap, int maxLines, long constraints, H1.t layoutDirection, H1.d density, AbstractC18269l.b fontFamilyResolver, boolean skipCache) {
        return d(this, new AnnotatedString(text, null, 2, null), style, overflow, softWrap, maxLines, null, constraints, layoutDirection, density, fontFamilyResolver, skipCache, 32, null);
    }

    public final TextLayoutResult c(AnnotatedString text, TextStyle style, int overflow, boolean softWrap, int maxLines, List<AnnotatedString.Range<Placeholder>> placeholders, long constraints, H1.t layoutDirection, H1.d density, AbstractC18269l.b fontFamilyResolver, boolean skipCache) {
        u1.u uVar;
        TextLayoutInput textLayoutInput = new TextLayoutInput(text, style, placeholders, maxLines, softWrap, overflow, density, layoutDirection, fontFamilyResolver, constraints, (DefaultConstructorMarker) null);
        TextLayoutResult textLayoutResultA = (skipCache || (uVar = this.textLayoutCache) == null) ? null : uVar.a(textLayoutInput);
        if (textLayoutResultA != null) {
            return textLayoutResultA.a(textLayoutInput, H1.c.d(constraints, H1.r.c((m.d(textLayoutResultA.getMultiParagraph().getWidth()) << 32) | (m.d(textLayoutResultA.getMultiParagraph().getHeight()) & 4294967295L))));
        }
        TextLayoutResult textLayoutResultB = INSTANCE.b(textLayoutInput);
        u1.u uVar2 = this.textLayoutCache;
        if (uVar2 != null) {
            uVar2.b(textLayoutInput, textLayoutResultB);
        }
        return textLayoutResultB;
    }

    public w(AbstractC18269l.b bVar, H1.d dVar, H1.t tVar, int i10) {
        u1.u uVar;
        this.defaultFontFamilyResolver = bVar;
        this.defaultDensity = dVar;
        this.defaultLayoutDirection = tVar;
        this.cacheSize = i10;
        if (i10 > 0) {
            uVar = new u1.u(i10);
        } else {
            uVar = null;
        }
        this.textLayoutCache = uVar;
    }
}
