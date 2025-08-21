package androidx.compose.ui.text;

import B1.LocaleList;
import B1.d;
import F1.LineHeightStyle;
import F1.TextGeometricTransform;
import F1.TextIndent;
import F1.a;
import F1.k;
import H1.v;
import U0.f;
import V0.C5489q0;
import V0.C5492s0;
import V0.Shadow;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.f;
import androidx.compose.ui.text.y;
import java.util.ArrayList;
import java.util.List;
import kotlin.FontWeight;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import u1.C17334A;

@Metadata(d1 = {"\u0000¸\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aK\u0010\t\u001a\u00020\b\"\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0080\u0001\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0012\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\b2.\u0010\u000f\u001a*\u0012\u0004\u0012\u00020\u0006\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0004\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u000b¢\u0006\u0002\b\u000e2#\u0010\u0011\u001a\u001f\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0004\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a!\u0010\u0015\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\"&\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\".\u0010\u001f\u001a\u001c\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u001d0\u001c\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018\".\u0010#\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u001d\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\f\n\u0004\b \u0010\u0018\u0012\u0004\b!\u0010\"\" \u0010&\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0018\"&\u0010*\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\f\n\u0004\b(\u0010\u0018\u0012\u0004\b)\u0010\"\" \u0010-\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0018\" \u00100\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u0018\"&\u00103\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b2\u0010\u001a\"&\u00106\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b2\u0010\u0018\u001a\u0004\b5\u0010\u001a\"&\u0010:\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b8\u0010\u0018\u001a\u0004\b9\u0010\u001a\" \u0010=\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010\u0018\" \u0010@\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010\u0018\" \u0010C\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010\u0018\" \u0010F\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010\u0018\" \u0010I\u001a\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010\u0018\" \u0010L\u001a\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010\u0018\" \u0010O\u001a\u000e\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010\u0018\" \u0010S\u001a\u000e\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020\b0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010R\" \u0010V\u001a\u000e\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020\b0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010R\" \u0010Y\u001a\u000e\u0012\u0004\u0012\u00020W\u0012\u0004\u0012\u00020\b0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010R\" \u0010\\\u001a\u000e\u0012\u0004\u0012\u00020Z\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\u0018\" \u0010_\u001a\u000e\u0012\u0004\u0012\u00020]\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010\u0018\" \u0010a\u001a\u000e\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010\u0018\"$\u0010d\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\b0\u0000*\u00020b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bE\u0010c\"$\u0010d\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\b0\u0000*\u00020e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bH\u0010f\"$\u0010d\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\b0\u0000*\u00020g8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bK\u0010h\"$\u0010d\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\b0\u0000*\u00020i8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b^\u0010j\"$\u0010d\u001a\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\b0\u0000*\u00020k8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b?\u0010l\"$\u0010d\u001a\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020\b0\u0000*\u00020m8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b[\u0010n\"$\u0010d\u001a\u000e\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020\b0\u0000*\u00020o8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bX\u0010p\"$\u0010d\u001a\u000e\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020\b0\u0000*\u00020q8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bU\u0010r\"$\u0010d\u001a\u000e\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020\b0\u0000*\u00020s8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bN\u0010t\"$\u0010d\u001a\u000e\u0012\u0004\u0012\u00020W\u0012\u0004\u0012\u00020\b0\u0000*\u00020u8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010v\"$\u0010d\u001a\u000e\u0012\u0004\u0012\u00020Z\u0012\u0004\u0012\u00020\b0\u0000*\u00020w8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b<\u0010x\"$\u0010d\u001a\u000e\u0012\u0004\u0012\u00020]\u0012\u0004\u0012\u00020\b0\u0000*\u00020y8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b8\u0010z\"$\u0010d\u001a\u000e\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020\b0\u0000*\u00020{8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bB\u0010|¨\u0006}"}, d2 = {"LL0/k;", "T", "Original", "Saveable", "value", "saver", "LL0/m;", "scope", "", "z", "(Ljava/lang/Object;LL0/k;LL0/m;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "Lkotlin/ExtensionFunctionType;", "save", "Lkotlin/Function1;", "restore", "Landroidx/compose/ui/text/j;", "a", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/text/j;", "y", "(Ljava/lang/Object;)Ljava/lang/Object;", "Landroidx/compose/ui/text/AnnotatedString;", "LL0/k;", "h", "()LL0/k;", "AnnotatedStringSaver", "", "Landroidx/compose/ui/text/AnnotatedString$d;", "b", "AnnotationRangeListSaver", "c", "getAnnotationRangeSaver$annotations", "()V", "AnnotationRangeSaver", "Landroidx/compose/ui/text/C;", "d", "VerbatimTtsAnnotationSaver", "Landroidx/compose/ui/text/B;", "e", "getUrlAnnotationSaver$annotations", "UrlAnnotationSaver", "Landroidx/compose/ui/text/f$b;", "f", "LinkSaver", "Landroidx/compose/ui/text/f$a;", "g", "ClickableSaver", "Landroidx/compose/ui/text/n;", "i", "ParagraphStyleSaver", "Landroidx/compose/ui/text/s;", "w", "SpanStyleSaver", "Lu1/w;", "j", "x", "TextLinkStylesSaver", "LF1/k;", "k", "TextDecorationSaver", "LF1/o;", "l", "TextGeometricTransformSaver", "LF1/q;", "m", "TextIndentSaver", "Ly1/B;", "n", "FontWeightSaver", "LF1/a;", "o", "BaselineShiftSaver", "Landroidx/compose/ui/text/y;", "p", "TextRangeSaver", "LV0/B1;", "q", "ShadowSaver", "LV0/q0;", "r", "Landroidx/compose/ui/text/j;", "ColorSaver", "LH1/v;", "s", "TextUnitSaver", "LU0/f;", "t", "OffsetSaver", "LB1/e;", "u", "LocaleListSaver", "LB1/d;", "v", "LocaleSaver", "LF1/h;", "LineHeightStyleSaver", "LF1/k$a;", "(LF1/k$a;)LL0/k;", "Saver", "LF1/o$a;", "(LF1/o$a;)LL0/k;", "LF1/q$a;", "(LF1/q$a;)LL0/k;", "Ly1/B$a;", "(Ly1/B$a;)LL0/k;", "LF1/a$a;", "(LF1/a$a;)LL0/k;", "Landroidx/compose/ui/text/y$a;", "(Landroidx/compose/ui/text/y$a;)LL0/k;", "LV0/B1$a;", "(LV0/B1$a;)LL0/k;", "LV0/q0$a;", "(LV0/q0$a;)LL0/k;", "LH1/v$a;", "(LH1/v$a;)LL0/k;", "LU0/f$a;", "(LU0/f$a;)LL0/k;", "LB1/e$a;", "(LB1/e$a;)LL0/k;", "LB1/d$a;", "(LB1/d$a;)LL0/k;", "LF1/h$b;", "(LF1/h$b;)LL0/k;", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private static final L0.k<AnnotatedString, Object> f52792a = L0.l.a(C6057a.f52836f, C6058b.f52837f);

    /* renamed from: b, reason: collision with root package name */
    private static final L0.k<List<AnnotatedString.Range<? extends Object>>, Object> f52793b = L0.l.a(C6059c.f52838f, C6060d.f52839f);

    /* renamed from: c, reason: collision with root package name */
    private static final L0.k<AnnotatedString.Range<? extends Object>, Object> f52794c = L0.l.a(C6061e.f52840f, C6062f.f52841f);

    /* renamed from: d, reason: collision with root package name */
    private static final L0.k<VerbatimTtsAnnotation, Object> f52795d = L0.l.a(T.f52834f, U.f52835f);

    /* renamed from: e, reason: collision with root package name */
    private static final L0.k<UrlAnnotation, Object> f52796e = L0.l.a(R.f52832f, S.f52833f);

    /* renamed from: f, reason: collision with root package name */
    private static final L0.k<f.b, Object> f52797f = L0.l.a(C1088q.f52852f, C6073r.f52853f);

    /* renamed from: g, reason: collision with root package name */
    private static final L0.k<f.a, Object> f52798g = L0.l.a(C6065i.f52844f, C6066j.f52845f);

    /* renamed from: h, reason: collision with root package name */
    private static final L0.k<ParagraphStyle, Object> f52799h = L0.l.a(z.f52862f, A.f52815f);

    /* renamed from: i, reason: collision with root package name */
    private static final L0.k<SpanStyle, Object> f52800i = L0.l.a(D.f52818f, E.f52819f);

    /* renamed from: j, reason: collision with root package name */
    private static final L0.k<u1.w, Object> f52801j = L0.l.a(L.f52826f, M.f52827f);

    /* renamed from: k, reason: collision with root package name */
    private static final L0.k<F1.k, Object> f52802k = L0.l.a(F.f52820f, G.f52821f);

    /* renamed from: l, reason: collision with root package name */
    private static final L0.k<TextGeometricTransform, Object> f52803l = L0.l.a(H.f52822f, I.f52823f);

    /* renamed from: m, reason: collision with root package name */
    private static final L0.k<TextIndent, Object> f52804m = L0.l.a(J.f52824f, K.f52825f);

    /* renamed from: n, reason: collision with root package name */
    private static final L0.k<FontWeight, Object> f52805n = L0.l.a(C6069m.f52848f, C6070n.f52849f);

    /* renamed from: o, reason: collision with root package name */
    private static final L0.k<F1.a, Object> f52806o = L0.l.a(C6063g.f52842f, C6064h.f52843f);

    /* renamed from: p, reason: collision with root package name */
    private static final L0.k<androidx.compose.ui.text.y, Object> f52807p = L0.l.a(N.f52828f, O.f52829f);

    /* renamed from: q, reason: collision with root package name */
    private static final L0.k<Shadow, Object> f52808q = L0.l.a(B.f52816f, C.f52817f);

    /* renamed from: r, reason: collision with root package name */
    private static final j<C5489q0, Object> f52809r = a(C6067k.f52846f, C6068l.f52847f);

    /* renamed from: s, reason: collision with root package name */
    private static final j<H1.v, Object> f52810s = a(P.f52830f, Q.f52831f);

    /* renamed from: t, reason: collision with root package name */
    private static final j<U0.f, Object> f52811t = a(x.f52860f, y.f52861f);

    /* renamed from: u, reason: collision with root package name */
    private static final L0.k<LocaleList, Object> f52812u = L0.l.a(C6074s.f52854f, C6075t.f52855f);

    /* renamed from: v, reason: collision with root package name */
    private static final L0.k<B1.d, Object> f52813v = L0.l.a(C6076u.f52856f, v.f52857f);

    /* renamed from: w, reason: collision with root package name */
    private static final L0.k<LineHeightStyle, Object> f52814w = L0.l.a(C6071o.f52850f, C6072p.f52851f);

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Landroidx/compose/ui/text/n;", "a", "(Ljava/lang/Object;)Landroidx/compose/ui/text/n;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class A extends Lambda implements Function1<Object, ParagraphStyle> {

        /* renamed from: f, reason: collision with root package name */
        public static final A f52815f = new A();

        A() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ParagraphStyle invoke(Object obj) {
            Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            F1.s sVarB = null;
            F1.j jVar = obj2 != null ? (F1.j) obj2 : null;
            Intrinsics.g(jVar);
            int value = jVar.getValue();
            Object obj3 = list.get(1);
            F1.l lVar = obj3 != null ? (F1.l) obj3 : null;
            Intrinsics.g(lVar);
            int value2 = lVar.getValue();
            Object obj4 = list.get(2);
            L0.k<H1.v, Object> kVarQ = q.q(H1.v.INSTANCE);
            Boolean bool = Boolean.FALSE;
            H1.v vVarB = ((!Intrinsics.e(obj4, bool) || (kVarQ instanceof j)) && obj4 != null) ? kVarQ.b(obj4) : null;
            Intrinsics.g(vVarB);
            long packedValue = vVarB.getPackedValue();
            Object obj5 = list.get(3);
            L0.k<TextIndent, Object> kVarP = q.p(TextIndent.INSTANCE);
            TextIndent textIndentB = ((!Intrinsics.e(obj5, bool) || (kVarP instanceof j)) && obj5 != null) ? kVarP.b(obj5) : null;
            Object obj6 = list.get(4);
            L0.k<PlatformParagraphStyle, Object> kVarC = r.c(PlatformParagraphStyle.INSTANCE);
            PlatformParagraphStyle platformParagraphStyleB = ((!Intrinsics.e(obj6, bool) || (kVarC instanceof j)) && obj6 != null) ? kVarC.b(obj6) : null;
            Object obj7 = list.get(5);
            L0.k<LineHeightStyle, Object> kVarM = q.m(LineHeightStyle.INSTANCE);
            LineHeightStyle lineHeightStyleB = ((!Intrinsics.e(obj7, bool) || (kVarM instanceof j)) && obj7 != null) ? kVarM.b(obj7) : null;
            Object obj8 = list.get(6);
            L0.k<F1.f, Object> kVarA = r.a(F1.f.INSTANCE);
            F1.f fVarB = ((!Intrinsics.e(obj8, bool) || (kVarA instanceof j)) && obj8 != null) ? kVarA.b(obj8) : null;
            Intrinsics.g(fVarB);
            int mask = fVarB.getMask();
            Object obj9 = list.get(7);
            F1.e eVar = obj9 != null ? (F1.e) obj9 : null;
            Intrinsics.g(eVar);
            int value3 = eVar.getValue();
            Object obj10 = list.get(8);
            L0.k<F1.s, Object> kVarB = r.b(F1.s.INSTANCE);
            if ((!Intrinsics.e(obj10, bool) || (kVarB instanceof j)) && obj10 != null) {
                sVarB = kVarB.b(obj10);
            }
            return new ParagraphStyle(value, value2, packedValue, textIndentB, platformParagraphStyleB, lineHeightStyleB, mask, value3, sVarB, null);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LV0/B1;", "a", "(Ljava/lang/Object;)LV0/B1;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class C extends Lambda implements Function1<Object, Shadow> {

        /* renamed from: f, reason: collision with root package name */
        public static final C f52817f = new C();

        C() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Shadow invoke(Object obj) {
            Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            L0.k<C5489q0, Object> kVarS = q.s(C5489q0.INSTANCE);
            Boolean bool = Boolean.FALSE;
            C5489q0 c5489q0B = ((!Intrinsics.e(obj2, bool) || (kVarS instanceof j)) && obj2 != null) ? kVarS.b(obj2) : null;
            Intrinsics.g(c5489q0B);
            long value = c5489q0B.getValue();
            Object obj3 = list.get(1);
            L0.k<U0.f, Object> kVarR = q.r(U0.f.INSTANCE);
            U0.f fVarB = ((!Intrinsics.e(obj3, bool) || (kVarR instanceof j)) && obj3 != null) ? kVarR.b(obj3) : null;
            Intrinsics.g(fVarB);
            long packedValue = fVarB.getPackedValue();
            Object obj4 = list.get(2);
            Float f10 = obj4 != null ? (Float) obj4 : null;
            Intrinsics.g(f10);
            return new Shadow(value, packedValue, f10.floatValue(), null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LL0/m;", "Landroidx/compose/ui/text/s;", "it", "", "a", "(LL0/m;Landroidx/compose/ui/text/s;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    static final class D extends Lambda implements Function2<L0.m, SpanStyle, Object> {

        /* renamed from: f, reason: collision with root package name */
        public static final D f52818f = new D();

        D() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(L0.m mVar, SpanStyle spanStyle) {
            C5489q0 c5489q0M = C5489q0.m(spanStyle.g());
            C5489q0.Companion companion = C5489q0.INSTANCE;
            Object objZ = q.z(c5489q0M, q.s(companion), mVar);
            H1.v vVarB = H1.v.b(spanStyle.getFontSize());
            v.Companion companion2 = H1.v.INSTANCE;
            return CollectionsKt.g(objZ, q.z(vVarB, q.q(companion2), mVar), q.z(spanStyle.getFontWeight(), q.v(FontWeight.INSTANCE), mVar), q.y(spanStyle.getFontStyle()), q.y(spanStyle.getFontSynthesis()), q.y(-1), q.y(spanStyle.getFontFeatureSettings()), q.z(H1.v.b(spanStyle.getLetterSpacing()), q.q(companion2), mVar), q.z(spanStyle.getBaselineShift(), q.l(F1.a.INSTANCE), mVar), q.z(spanStyle.getTextGeometricTransform(), q.o(TextGeometricTransform.INSTANCE), mVar), q.z(spanStyle.getLocaleList(), q.k(LocaleList.INSTANCE), mVar), q.z(C5489q0.m(spanStyle.getBackground()), q.s(companion), mVar), q.z(spanStyle.getTextDecoration(), q.n(F1.k.INSTANCE), mVar), q.z(spanStyle.getShadow(), q.t(Shadow.INSTANCE), mVar));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Landroidx/compose/ui/text/s;", "a", "(Ljava/lang/Object;)Landroidx/compose/ui/text/s;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class E extends Lambda implements Function1<Object, SpanStyle> {

        /* renamed from: f, reason: collision with root package name */
        public static final E f52819f = new E();

        E() {
            super(1);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v1 androidx.compose.ui.text.s, still in use, count: 2, list:
              (r1v1 androidx.compose.ui.text.s) from 0x00d8: MOVE (r16v2 androidx.compose.ui.text.s) = (r1v1 androidx.compose.ui.text.s) (LINE:218)
              (r1v1 androidx.compose.ui.text.s) from 0x00d0: MOVE (r16v7 androidx.compose.ui.text.s) = (r1v1 androidx.compose.ui.text.s) (LINE:210)
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
            	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
            	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
            */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.text.SpanStyle invoke(java.lang.Object r29) {
            /*
                Method dump skipped, instructions count: 450
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.q.E.invoke(java.lang.Object):androidx.compose.ui.text.s");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LF1/k;", "a", "(Ljava/lang/Object;)LF1/k;"}, k = 3, mv = {1, 9, 0})
    static final class G extends Lambda implements Function1<Object, F1.k> {

        /* renamed from: f, reason: collision with root package name */
        public static final G f52821f = new G();

        G() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final F1.k invoke(Object obj) {
            Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Int");
            return new F1.k(((Integer) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LF1/o;", "a", "(Ljava/lang/Object;)LF1/o;"}, k = 3, mv = {1, 9, 0})
    static final class I extends Lambda implements Function1<Object, TextGeometricTransform> {

        /* renamed from: f, reason: collision with root package name */
        public static final I f52823f = new I();

        I() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextGeometricTransform invoke(Object obj) {
            Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
            List list = (List) obj;
            return new TextGeometricTransform(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LF1/q;", "a", "(Ljava/lang/Object;)LF1/q;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class K extends Lambda implements Function1<Object, TextIndent> {

        /* renamed from: f, reason: collision with root package name */
        public static final K f52825f = new K();

        K() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextIndent invoke(Object obj) {
            Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            v.Companion companion = H1.v.INSTANCE;
            L0.k<H1.v, Object> kVarQ = q.q(companion);
            Boolean bool = Boolean.FALSE;
            H1.v vVarB = null;
            H1.v vVarB2 = ((!Intrinsics.e(obj2, bool) || (kVarQ instanceof j)) && obj2 != null) ? kVarQ.b(obj2) : null;
            Intrinsics.g(vVarB2);
            long packedValue = vVarB2.getPackedValue();
            Object obj3 = list.get(1);
            L0.k<H1.v, Object> kVarQ2 = q.q(companion);
            if ((!Intrinsics.e(obj3, bool) || (kVarQ2 instanceof j)) && obj3 != null) {
                vVarB = kVarQ2.b(obj3);
            }
            Intrinsics.g(vVarB);
            return new TextIndent(packedValue, vVarB.getPackedValue(), null);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lu1/w;", "a", "(Ljava/lang/Object;)Lu1/w;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class M extends Lambda implements Function1<Object, u1.w> {

        /* renamed from: f, reason: collision with root package name */
        public static final M f52827f = new M();

        M() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final u1.w invoke(Object obj) {
            Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            L0.k<SpanStyle, Object> kVarW = q.w();
            Boolean bool = Boolean.FALSE;
            SpanStyle spanStyleB = null;
            SpanStyle spanStyleB2 = ((!Intrinsics.e(obj2, bool) || (kVarW instanceof j)) && obj2 != null) ? kVarW.b(obj2) : null;
            Object obj3 = list.get(1);
            L0.k<SpanStyle, Object> kVarW2 = q.w();
            SpanStyle spanStyleB3 = ((!Intrinsics.e(obj3, bool) || (kVarW2 instanceof j)) && obj3 != null) ? kVarW2.b(obj3) : null;
            Object obj4 = list.get(2);
            L0.k<SpanStyle, Object> kVarW3 = q.w();
            SpanStyle spanStyleB4 = ((!Intrinsics.e(obj4, bool) || (kVarW3 instanceof j)) && obj4 != null) ? kVarW3.b(obj4) : null;
            Object obj5 = list.get(3);
            L0.k<SpanStyle, Object> kVarW4 = q.w();
            if ((!Intrinsics.e(obj5, bool) || (kVarW4 instanceof j)) && obj5 != null) {
                spanStyleB = kVarW4.b(obj5);
            }
            return new u1.w(spanStyleB2, spanStyleB3, spanStyleB4, spanStyleB);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LL0/m;", "Landroidx/compose/ui/text/y;", "it", "", "a", "(LL0/m;J)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    static final class N extends Lambda implements Function2<L0.m, androidx.compose.ui.text.y, Object> {

        /* renamed from: f, reason: collision with root package name */
        public static final N f52828f = new N();

        N() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object a(L0.m mVar, long j10) {
            return CollectionsKt.g(q.y(Integer.valueOf(androidx.compose.ui.text.y.n(j10))), q.y(Integer.valueOf(androidx.compose.ui.text.y.i(j10))));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(L0.m mVar, androidx.compose.ui.text.y yVar) {
            return a(mVar, yVar.getPackedValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Landroidx/compose/ui/text/y;", "a", "(Ljava/lang/Object;)Landroidx/compose/ui/text/y;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class O extends Lambda implements Function1<Object, androidx.compose.ui.text.y> {

        /* renamed from: f, reason: collision with root package name */
        public static final O f52829f = new O();

        O() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.text.y invoke(Object obj) {
            Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Integer num = obj2 != null ? (Integer) obj2 : null;
            Intrinsics.g(num);
            int iIntValue = num.intValue();
            Object obj3 = list.get(1);
            Integer num2 = obj3 != null ? (Integer) obj3 : null;
            Intrinsics.g(num2);
            return androidx.compose.ui.text.y.b(C17334A.b(iIntValue, num2.intValue()));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LL0/m;", "LH1/v;", "it", "", "a", "(LL0/m;J)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    static final class P extends Lambda implements Function2<L0.m, H1.v, Object> {

        /* renamed from: f, reason: collision with root package name */
        public static final P f52830f = new P();

        P() {
            super(2);
        }

        public final Object a(L0.m mVar, long j10) {
            return H1.v.e(j10, H1.v.INSTANCE.a()) ? Boolean.FALSE : CollectionsKt.g(q.y(Float.valueOf(H1.v.h(j10))), q.y(H1.x.d(H1.v.g(j10))));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(L0.m mVar, H1.v vVar) {
            return a(mVar, vVar.getPackedValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LH1/v;", "a", "(Ljava/lang/Object;)LH1/v;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class Q extends Lambda implements Function1<Object, H1.v> {

        /* renamed from: f, reason: collision with root package name */
        public static final Q f52831f = new Q();

        Q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final H1.v invoke(Object obj) {
            if (Intrinsics.e(obj, Boolean.FALSE)) {
                return H1.v.b(H1.v.INSTANCE.a());
            }
            Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Float f10 = obj2 != null ? (Float) obj2 : null;
            Intrinsics.g(f10);
            float fFloatValue = f10.floatValue();
            Object obj3 = list.get(1);
            H1.x xVar = obj3 != null ? (H1.x) obj3 : null;
            Intrinsics.g(xVar);
            return H1.v.b(H1.w.a(fFloatValue, xVar.getType()));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Landroidx/compose/ui/text/B;", "a", "(Ljava/lang/Object;)Landroidx/compose/ui/text/B;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class S extends Lambda implements Function1<Object, UrlAnnotation> {

        /* renamed from: f, reason: collision with root package name */
        public static final S f52833f = new S();

        S() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UrlAnnotation invoke(Object obj) {
            String str = obj != null ? (String) obj : null;
            Intrinsics.g(str);
            return new UrlAnnotation(str);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Landroidx/compose/ui/text/C;", "a", "(Ljava/lang/Object;)Landroidx/compose/ui/text/C;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class U extends Lambda implements Function1<Object, VerbatimTtsAnnotation> {

        /* renamed from: f, reason: collision with root package name */
        public static final U f52835f = new U();

        U() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final VerbatimTtsAnnotation invoke(Object obj) {
            String str = obj != null ? (String) obj : null;
            Intrinsics.g(str);
            return new VerbatimTtsAnnotation(str);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Landroidx/compose/ui/text/AnnotatedString;", "a", "(Ljava/lang/Object;)Landroidx/compose/ui/text/AnnotatedString;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: androidx.compose.ui.text.q$b, reason: case insensitive filesystem */
    static final class C6058b extends Lambda implements Function1<Object, AnnotatedString> {

        /* renamed from: f, reason: collision with root package name */
        public static final C6058b f52837f = new C6058b();

        C6058b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AnnotatedString invoke(Object obj) {
            Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(1);
            L0.k kVar = q.f52793b;
            List list2 = ((!Intrinsics.e(obj2, Boolean.FALSE) || (kVar instanceof j)) && obj2 != null) ? (List) kVar.b(obj2) : null;
            Object obj3 = list.get(0);
            String str = obj3 != null ? (String) obj3 : null;
            Intrinsics.g(str);
            return new AnnotatedString((List<? extends AnnotatedString.Range<? extends AnnotatedString.a>>) list2, str);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LL0/m;", "", "Landroidx/compose/ui/text/AnnotatedString$d;", "", "it", "a", "(LL0/m;Ljava/util/List;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: androidx.compose.ui.text.q$c, reason: case insensitive filesystem */
    static final class C6059c extends Lambda implements Function2<L0.m, List<? extends AnnotatedString.Range<? extends Object>>, Object> {

        /* renamed from: f, reason: collision with root package name */
        public static final C6059c f52838f = new C6059c();

        C6059c() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(L0.m mVar, List<? extends AnnotatedString.Range<? extends Object>> list) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(q.z(list.get(i10), q.f52794c, mVar));
            }
            return arrayList;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "it", "", "Landroidx/compose/ui/text/AnnotatedString$d;", "a", "(Ljava/lang/Object;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: androidx.compose.ui.text.q$d, reason: case insensitive filesystem */
    static final class C6060d extends Lambda implements Function1<Object, List<? extends AnnotatedString.Range<? extends Object>>> {

        /* renamed from: f, reason: collision with root package name */
        public static final C6060d f52839f = new C6060d();

        C6060d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<AnnotatedString.Range<? extends Object>> invoke(Object obj) {
            Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj2 = list.get(i10);
                L0.k kVar = q.f52794c;
                AnnotatedString.Range range = null;
                if ((!Intrinsics.e(obj2, Boolean.FALSE) || (kVar instanceof j)) && obj2 != null) {
                    range = (AnnotatedString.Range) kVar.b(obj2);
                }
                Intrinsics.g(range);
                arrayList.add(range);
            }
            return arrayList;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0000\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Landroidx/compose/ui/text/AnnotatedString$d;", "a", "(Ljava/lang/Object;)Landroidx/compose/ui/text/AnnotatedString$d;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: androidx.compose.ui.text.q$f, reason: case insensitive filesystem */
    static final class C6062f extends Lambda implements Function1<Object, AnnotatedString.Range<? extends Object>> {

        /* renamed from: f, reason: collision with root package name */
        public static final C6062f f52841f = new C6062f();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.text.q$f$a */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC6056c.values().length];
                try {
                    iArr[EnumC6056c.f52662a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC6056c.f52663b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC6056c.f52664c.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC6056c.f52665d.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC6056c.f52666e.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[EnumC6056c.f52667f.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[EnumC6056c.f52668g.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        C6062f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AnnotatedString.Range<? extends Object> invoke(Object obj) {
            Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            ParagraphStyle nVarB = null;
            aVar = null;
            f.a aVar = null;
            bVar = null;
            f.b bVar = null;
            b = null;
            UrlAnnotation b10 = null;
            verbatimTtsAnnotation = null;
            VerbatimTtsAnnotation verbatimTtsAnnotation = null;
            spanStyleB = null;
            SpanStyle spanStyleB = null;
            nVarB = null;
            EnumC6056c enumC6056c = obj2 != null ? (EnumC6056c) obj2 : null;
            Intrinsics.g(enumC6056c);
            Object obj3 = list.get(2);
            Integer num = obj3 != null ? (Integer) obj3 : null;
            Intrinsics.g(num);
            int iIntValue = num.intValue();
            Object obj4 = list.get(3);
            Integer num2 = obj4 != null ? (Integer) obj4 : null;
            Intrinsics.g(num2);
            int iIntValue2 = num2.intValue();
            Object obj5 = list.get(4);
            String str = obj5 != null ? (String) obj5 : null;
            Intrinsics.g(str);
            switch (a.$EnumSwitchMapping$0[enumC6056c.ordinal()]) {
                case 1:
                    Object obj6 = list.get(1);
                    L0.k<ParagraphStyle, Object> kVarI = q.i();
                    if ((!Intrinsics.e(obj6, Boolean.FALSE) || (kVarI instanceof j)) && obj6 != null) {
                        nVarB = kVarI.b(obj6);
                    }
                    Intrinsics.g(nVarB);
                    return new AnnotatedString.Range<>(nVarB, iIntValue, iIntValue2, str);
                case 2:
                    Object obj7 = list.get(1);
                    L0.k<SpanStyle, Object> kVarW = q.w();
                    if ((!Intrinsics.e(obj7, Boolean.FALSE) || (kVarW instanceof j)) && obj7 != null) {
                        spanStyleB = kVarW.b(obj7);
                    }
                    Intrinsics.g(spanStyleB);
                    return new AnnotatedString.Range<>(spanStyleB, iIntValue, iIntValue2, str);
                case 3:
                    Object obj8 = list.get(1);
                    L0.k kVar = q.f52795d;
                    if ((!Intrinsics.e(obj8, Boolean.FALSE) || (kVar instanceof j)) && obj8 != null) {
                        verbatimTtsAnnotation = (VerbatimTtsAnnotation) kVar.b(obj8);
                    }
                    Intrinsics.g(verbatimTtsAnnotation);
                    return new AnnotatedString.Range<>(verbatimTtsAnnotation, iIntValue, iIntValue2, str);
                case 4:
                    Object obj9 = list.get(1);
                    L0.k kVar2 = q.f52796e;
                    if ((!Intrinsics.e(obj9, Boolean.FALSE) || (kVar2 instanceof j)) && obj9 != null) {
                        b10 = (UrlAnnotation) kVar2.b(obj9);
                    }
                    Intrinsics.g(b10);
                    return new AnnotatedString.Range<>(b10, iIntValue, iIntValue2, str);
                case 5:
                    Object obj10 = list.get(1);
                    L0.k kVar3 = q.f52797f;
                    if ((!Intrinsics.e(obj10, Boolean.FALSE) || (kVar3 instanceof j)) && obj10 != null) {
                        bVar = (f.b) kVar3.b(obj10);
                    }
                    Intrinsics.g(bVar);
                    return new AnnotatedString.Range<>(bVar, iIntValue, iIntValue2, str);
                case 6:
                    Object obj11 = list.get(1);
                    L0.k kVar4 = q.f52798g;
                    if ((!Intrinsics.e(obj11, Boolean.FALSE) || (kVar4 instanceof j)) && obj11 != null) {
                        aVar = (f.a) kVar4.b(obj11);
                    }
                    Intrinsics.g(aVar);
                    return new AnnotatedString.Range<>(aVar, iIntValue, iIntValue2, str);
                case 7:
                    Object obj12 = list.get(1);
                    String str2 = obj12 != null ? (String) obj12 : null;
                    Intrinsics.g(str2);
                    return new AnnotatedString.Range<>(t.a(t.b(str2)), iIntValue, iIntValue2, str);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LL0/m;", "LF1/a;", "it", "", "a", "(LL0/m;F)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.text.q$g, reason: case insensitive filesystem */
    static final class C6063g extends Lambda implements Function2<L0.m, F1.a, Object> {

        /* renamed from: f, reason: collision with root package name */
        public static final C6063g f52842f = new C6063g();

        C6063g() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(L0.m mVar, F1.a aVar) {
            return a(mVar, aVar.getMultiplier());
        }

        public final Object a(L0.m mVar, float f10) {
            return Float.valueOf(f10);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LF1/a;", "a", "(Ljava/lang/Object;)LF1/a;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.text.q$h, reason: case insensitive filesystem */
    static final class C6064h extends Lambda implements Function1<Object, F1.a> {

        /* renamed from: f, reason: collision with root package name */
        public static final C6064h f52843f = new C6064h();

        C6064h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final F1.a invoke(Object obj) {
            Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Float");
            return F1.a.d(F1.a.e(((Float) obj).floatValue()));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Landroidx/compose/ui/text/f$a;", "a", "(Ljava/lang/Object;)Landroidx/compose/ui/text/f$a;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: androidx.compose.ui.text.q$j, reason: case insensitive filesystem */
    static final class C6066j extends Lambda implements Function1<Object, f.a> {

        /* renamed from: f, reason: collision with root package name */
        public static final C6066j f52845f = new C6066j();

        C6066j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f.a invoke(Object obj) {
            Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            String str = obj2 != null ? (String) obj2 : null;
            Intrinsics.g(str);
            Object obj3 = list.get(1);
            L0.k<u1.w, Object> kVarX = q.x();
            return new f.a(str, ((!Intrinsics.e(obj3, Boolean.FALSE) || (kVarX instanceof j)) && obj3 != null) ? kVarX.b(obj3) : null, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LL0/m;", "LV0/q0;", "it", "", "a", "(LL0/m;J)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: androidx.compose.ui.text.q$k, reason: case insensitive filesystem */
    static final class C6067k extends Lambda implements Function2<L0.m, C5489q0, Object> {

        /* renamed from: f, reason: collision with root package name */
        public static final C6067k f52846f = new C6067k();

        C6067k() {
            super(2);
        }

        public final Object a(L0.m mVar, long j10) {
            return j10 == 16 ? Boolean.FALSE : Integer.valueOf(C5492s0.j(j10));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(L0.m mVar, C5489q0 c5489q0) {
            return a(mVar, c5489q0.getValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LV0/q0;", "a", "(Ljava/lang/Object;)LV0/q0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.text.q$l, reason: case insensitive filesystem */
    static final class C6068l extends Lambda implements Function1<Object, C5489q0> {

        /* renamed from: f, reason: collision with root package name */
        public static final C6068l f52847f = new C6068l();

        C6068l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C5489q0 invoke(Object obj) {
            if (Intrinsics.e(obj, Boolean.FALSE)) {
                return C5489q0.m(C5489q0.INSTANCE.j());
            }
            Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Int");
            return C5489q0.m(C5492s0.b(((Integer) obj).intValue()));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ly1/B;", "a", "(Ljava/lang/Object;)Ly1/B;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.text.q$n, reason: case insensitive filesystem */
    static final class C6070n extends Lambda implements Function1<Object, FontWeight> {

        /* renamed from: f, reason: collision with root package name */
        public static final C6070n f52849f = new C6070n();

        C6070n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FontWeight invoke(Object obj) {
            Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Int");
            return new FontWeight(((Integer) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LF1/h;", "a", "(Ljava/lang/Object;)LF1/h;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: androidx.compose.ui.text.q$p, reason: case insensitive filesystem */
    static final class C6072p extends Lambda implements Function1<Object, LineHeightStyle> {

        /* renamed from: f, reason: collision with root package name */
        public static final C6072p f52851f = new C6072p();

        C6072p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LineHeightStyle invoke(Object obj) {
            Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            LineHeightStyle.a aVar = obj2 != null ? (LineHeightStyle.a) obj2 : null;
            Intrinsics.g(aVar);
            float topRatio = aVar.getTopRatio();
            Object obj3 = list.get(1);
            LineHeightStyle.d dVar = obj3 != null ? (LineHeightStyle.d) obj3 : null;
            Intrinsics.g(dVar);
            int value = dVar.getValue();
            Object obj4 = list.get(2);
            LineHeightStyle.c cVar = obj4 != null ? (LineHeightStyle.c) obj4 : null;
            Intrinsics.g(cVar);
            return new LineHeightStyle(topRatio, value, cVar.getValue(), null);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Landroidx/compose/ui/text/f$b;", "a", "(Ljava/lang/Object;)Landroidx/compose/ui/text/f$b;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: androidx.compose.ui.text.q$r, reason: case insensitive filesystem */
    static final class C6073r extends Lambda implements Function1<Object, f.b> {

        /* renamed from: f, reason: collision with root package name */
        public static final C6073r f52853f = new C6073r();

        C6073r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f.b invoke(Object obj) {
            Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            u1.w wVarB = null;
            String str = obj2 != null ? (String) obj2 : null;
            Intrinsics.g(str);
            Object obj3 = list.get(1);
            L0.k<u1.w, Object> kVarX = q.x();
            if ((!Intrinsics.e(obj3, Boolean.FALSE) || (kVarX instanceof j)) && obj3 != null) {
                wVarB = kVarX.b(obj3);
            }
            return new f.b(str, wVarB, null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LB1/e;", "a", "(Ljava/lang/Object;)LB1/e;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: androidx.compose.ui.text.q$t, reason: case insensitive filesystem */
    static final class C6075t extends Lambda implements Function1<Object, LocaleList> {

        /* renamed from: f, reason: collision with root package name */
        public static final C6075t f52855f = new C6075t();

        C6075t() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LocaleList invoke(Object obj) {
            Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj2 = list.get(i10);
                L0.k<B1.d, Object> kVarJ = q.j(B1.d.INSTANCE);
                B1.d dVarB = null;
                if ((!Intrinsics.e(obj2, Boolean.FALSE) || (kVarJ instanceof j)) && obj2 != null) {
                    dVarB = kVarJ.b(obj2);
                }
                Intrinsics.g(dVarB);
                arrayList.add(dVarB);
            }
            return new LocaleList(arrayList);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LB1/d;", "a", "(Ljava/lang/Object;)LB1/d;"}, k = 3, mv = {1, 9, 0})
    static final class v extends Lambda implements Function1<Object, B1.d> {

        /* renamed from: f, reason: collision with root package name */
        public static final v f52857f = new v();

        v() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final B1.d invoke(Object obj) {
            Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.String");
            return new B1.d((String) obj);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [Saveable, Original] */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u001d\u0010\u0004\u001a\u0004\u0018\u00018\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0006\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"androidx/compose/ui/text/q$w", "Landroidx/compose/ui/text/j;", "LL0/m;", "value", "a", "(LL0/m;Ljava/lang/Object;)Ljava/lang/Object;", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class w<Original, Saveable> implements j<Original, Saveable> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<L0.m, Original, Saveable> f52858a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Saveable, Original> f52859b;

        /* JADX WARN: Multi-variable type inference failed */
        w(Function2<? super L0.m, ? super Original, ? extends Saveable> function2, Function1<? super Saveable, ? extends Original> function1) {
            this.f52858a = function2;
            this.f52859b = function1;
        }

        @Override // L0.k
        public Saveable a(L0.m mVar, Original original) {
            return this.f52858a.invoke(mVar, original);
        }

        @Override // L0.k
        public Original b(Saveable value) {
            return this.f52859b.invoke(value);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LL0/m;", "LU0/f;", "it", "", "a", "(LL0/m;J)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class x extends Lambda implements Function2<L0.m, U0.f, Object> {

        /* renamed from: f, reason: collision with root package name */
        public static final x f52860f = new x();

        x() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object a(L0.m mVar, long j10) {
            return U0.f.j(j10, U0.f.INSTANCE.b()) ? Boolean.FALSE : CollectionsKt.g(q.y(Float.valueOf(Float.intBitsToFloat((int) (j10 >> 32)))), q.y(Float.valueOf(Float.intBitsToFloat((int) (j10 & 4294967295L)))));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(L0.m mVar, U0.f fVar) {
            return a(mVar, fVar.getPackedValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LU0/f;", "a", "(Ljava/lang/Object;)LU0/f;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class y extends Lambda implements Function1<Object, U0.f> {

        /* renamed from: f, reason: collision with root package name */
        public static final y f52861f = new y();

        y() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final U0.f invoke(Object obj) {
            if (Intrinsics.e(obj, Boolean.FALSE)) {
                return U0.f.d(U0.f.INSTANCE.b());
            }
            Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Float f10 = obj2 != null ? (Float) obj2 : null;
            Intrinsics.g(f10);
            float fFloatValue = f10.floatValue();
            Object obj3 = list.get(1);
            Intrinsics.g(obj3 != null ? (Float) obj3 : null);
            return U0.f.d(U0.f.e((Float.floatToRawIntBits(fFloatValue) << 32) | (Float.floatToRawIntBits(r1.floatValue()) & 4294967295L)));
        }
    }

    public static final <T> T y(T t10) {
        return t10;
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LL0/m;", "LV0/B1;", "it", "", "a", "(LL0/m;LV0/B1;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    static final class B extends Lambda implements Function2<L0.m, Shadow, Object> {

        /* renamed from: f, reason: collision with root package name */
        public static final B f52816f = new B();

        B() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(L0.m mVar, Shadow shadow) {
            return CollectionsKt.g(q.z(C5489q0.m(shadow.getColor()), q.s(C5489q0.INSTANCE), mVar), q.z(U0.f.d(shadow.getOffset()), q.r(U0.f.INSTANCE), mVar), q.y(Float.valueOf(shadow.getBlurRadius())));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LL0/m;", "LF1/k;", "it", "", "a", "(LL0/m;LF1/k;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    static final class F extends Lambda implements Function2<L0.m, F1.k, Object> {

        /* renamed from: f, reason: collision with root package name */
        public static final F f52820f = new F();

        F() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(L0.m mVar, F1.k kVar) {
            return Integer.valueOf(kVar.getMask());
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LL0/m;", "LF1/o;", "it", "", "a", "(LL0/m;LF1/o;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    static final class H extends Lambda implements Function2<L0.m, TextGeometricTransform, Object> {

        /* renamed from: f, reason: collision with root package name */
        public static final H f52822f = new H();

        H() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(L0.m mVar, TextGeometricTransform textGeometricTransform) {
            return CollectionsKt.g(Float.valueOf(textGeometricTransform.getScaleX()), Float.valueOf(textGeometricTransform.getSkewX()));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LL0/m;", "LF1/q;", "it", "", "a", "(LL0/m;LF1/q;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    static final class J extends Lambda implements Function2<L0.m, TextIndent, Object> {

        /* renamed from: f, reason: collision with root package name */
        public static final J f52824f = new J();

        J() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(L0.m mVar, TextIndent textIndent) {
            H1.v vVarB = H1.v.b(textIndent.getFirstLine());
            v.Companion companion = H1.v.INSTANCE;
            return CollectionsKt.g(q.z(vVarB, q.q(companion), mVar), q.z(H1.v.b(textIndent.getRestLine()), q.q(companion), mVar));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LL0/m;", "Lu1/w;", "it", "", "a", "(LL0/m;Lu1/w;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    static final class L extends Lambda implements Function2<L0.m, u1.w, Object> {

        /* renamed from: f, reason: collision with root package name */
        public static final L f52826f = new L();

        L() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(L0.m mVar, u1.w wVar) {
            return CollectionsKt.g(q.z(wVar.getStyle(), q.w(), mVar), q.z(wVar.getFocusedStyle(), q.w(), mVar), q.z(wVar.getHoveredStyle(), q.w(), mVar), q.z(wVar.getPressedStyle(), q.w(), mVar));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LL0/m;", "Landroidx/compose/ui/text/B;", "it", "", "a", "(LL0/m;Landroidx/compose/ui/text/B;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    static final class R extends Lambda implements Function2<L0.m, UrlAnnotation, Object> {

        /* renamed from: f, reason: collision with root package name */
        public static final R f52832f = new R();

        R() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(L0.m mVar, UrlAnnotation b10) {
            return q.y(b10.getUrl());
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LL0/m;", "Landroidx/compose/ui/text/C;", "it", "", "a", "(LL0/m;Landroidx/compose/ui/text/C;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    static final class T extends Lambda implements Function2<L0.m, VerbatimTtsAnnotation, Object> {

        /* renamed from: f, reason: collision with root package name */
        public static final T f52834f = new T();

        T() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(L0.m mVar, VerbatimTtsAnnotation verbatimTtsAnnotation) {
            return q.y(verbatimTtsAnnotation.getVerbatim());
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LL0/m;", "Landroidx/compose/ui/text/AnnotatedString;", "it", "", "a", "(LL0/m;Landroidx/compose/ui/text/AnnotatedString;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.text.q$a, reason: case insensitive filesystem */
    static final class C6057a extends Lambda implements Function2<L0.m, AnnotatedString, Object> {

        /* renamed from: f, reason: collision with root package name */
        public static final C6057a f52836f = new C6057a();

        C6057a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(L0.m mVar, AnnotatedString annotatedString) {
            return CollectionsKt.g(q.y(annotatedString.getText()), q.z(annotatedString.c(), q.f52793b, mVar));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002*\u00020\u00002\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LL0/m;", "Landroidx/compose/ui/text/AnnotatedString$d;", "", "it", "a", "(LL0/m;Landroidx/compose/ui/text/AnnotatedString$d;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.text.q$e, reason: case insensitive filesystem */
    static final class C6061e extends Lambda implements Function2<L0.m, AnnotatedString.Range<? extends Object>, Object> {

        /* renamed from: f, reason: collision with root package name */
        public static final C6061e f52840f = new C6061e();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.text.q$e$a */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC6056c.values().length];
                try {
                    iArr[EnumC6056c.f52662a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC6056c.f52663b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC6056c.f52664c.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC6056c.f52665d.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC6056c.f52666e.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[EnumC6056c.f52667f.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[EnumC6056c.f52668g.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        C6061e() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(L0.m mVar, AnnotatedString.Range<? extends Object> range) {
            EnumC6056c enumC6056c;
            Object objZ;
            Object objG = range.g();
            if (objG instanceof ParagraphStyle) {
                enumC6056c = EnumC6056c.f52662a;
            } else if (objG instanceof SpanStyle) {
                enumC6056c = EnumC6056c.f52663b;
            } else if (objG instanceof VerbatimTtsAnnotation) {
                enumC6056c = EnumC6056c.f52664c;
            } else if (objG instanceof UrlAnnotation) {
                enumC6056c = EnumC6056c.f52665d;
            } else if (objG instanceof f.b) {
                enumC6056c = EnumC6056c.f52666e;
            } else if (objG instanceof f.a) {
                enumC6056c = EnumC6056c.f52667f;
            } else if (objG instanceof t) {
                enumC6056c = EnumC6056c.f52668g;
            } else {
                throw new UnsupportedOperationException();
            }
            switch (a.$EnumSwitchMapping$0[enumC6056c.ordinal()]) {
                case 1:
                    Object objG2 = range.g();
                    Intrinsics.h(objG2, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                    objZ = q.z((ParagraphStyle) objG2, q.i(), mVar);
                    break;
                case 2:
                    Object objG3 = range.g();
                    Intrinsics.h(objG3, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                    objZ = q.z((SpanStyle) objG3, q.w(), mVar);
                    break;
                case 3:
                    Object objG4 = range.g();
                    Intrinsics.h(objG4, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                    objZ = q.z((VerbatimTtsAnnotation) objG4, q.f52795d, mVar);
                    break;
                case 4:
                    Object objG5 = range.g();
                    Intrinsics.h(objG5, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                    objZ = q.z((UrlAnnotation) objG5, q.f52796e, mVar);
                    break;
                case 5:
                    Object objG6 = range.g();
                    Intrinsics.h(objG6, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                    objZ = q.z((f.b) objG6, q.f52797f, mVar);
                    break;
                case 6:
                    Object objG7 = range.g();
                    Intrinsics.h(objG7, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                    objZ = q.z((f.a) objG7, q.f52798g, mVar);
                    break;
                case 7:
                    Object objG8 = range.g();
                    Intrinsics.h(objG8, "null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                    objZ = q.y(((t) objG8).getValue());
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            return CollectionsKt.g(q.y(enumC6056c), objZ, q.y(Integer.valueOf(range.h())), q.y(Integer.valueOf(range.f())), q.y(range.getTag()));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LL0/m;", "Landroidx/compose/ui/text/f$a;", "it", "", "a", "(LL0/m;Landroidx/compose/ui/text/f$a;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.text.q$i, reason: case insensitive filesystem */
    static final class C6065i extends Lambda implements Function2<L0.m, f.a, Object> {

        /* renamed from: f, reason: collision with root package name */
        public static final C6065i f52844f = new C6065i();

        C6065i() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(L0.m mVar, f.a aVar) {
            return CollectionsKt.g(q.y(aVar.getTag()), q.z(aVar.getStyles(), q.x(), mVar));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LL0/m;", "Ly1/B;", "it", "", "a", "(LL0/m;Ly1/B;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.text.q$m, reason: case insensitive filesystem */
    static final class C6069m extends Lambda implements Function2<L0.m, FontWeight, Object> {

        /* renamed from: f, reason: collision with root package name */
        public static final C6069m f52848f = new C6069m();

        C6069m() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(L0.m mVar, FontWeight fontWeight) {
            return Integer.valueOf(fontWeight.getWeight());
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LL0/m;", "LF1/h;", "it", "", "a", "(LL0/m;LF1/h;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.text.q$o, reason: case insensitive filesystem */
    static final class C6071o extends Lambda implements Function2<L0.m, LineHeightStyle, Object> {

        /* renamed from: f, reason: collision with root package name */
        public static final C6071o f52850f = new C6071o();

        C6071o() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(L0.m mVar, LineHeightStyle lineHeightStyle) {
            return CollectionsKt.g(q.y(LineHeightStyle.a.c(lineHeightStyle.getAlignment())), q.y(LineHeightStyle.d.c(lineHeightStyle.getTrim())), q.y(LineHeightStyle.c.c(lineHeightStyle.getMode())));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LL0/m;", "Landroidx/compose/ui/text/f$b;", "it", "", "a", "(LL0/m;Landroidx/compose/ui/text/f$b;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.text.q$q, reason: collision with other inner class name */
    static final class C1088q extends Lambda implements Function2<L0.m, f.b, Object> {

        /* renamed from: f, reason: collision with root package name */
        public static final C1088q f52852f = new C1088q();

        C1088q() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(L0.m mVar, f.b bVar) {
            return CollectionsKt.g(q.y(bVar.getUrl()), q.z(bVar.getStyles(), q.x(), mVar));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LL0/m;", "LB1/e;", "it", "", "a", "(LL0/m;LB1/e;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: androidx.compose.ui.text.q$s, reason: case insensitive filesystem */
    static final class C6074s extends Lambda implements Function2<L0.m, LocaleList, Object> {

        /* renamed from: f, reason: collision with root package name */
        public static final C6074s f52854f = new C6074s();

        C6074s() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(L0.m mVar, LocaleList localeList) {
            List<B1.d> listK = localeList.k();
            ArrayList arrayList = new ArrayList(listK.size());
            int size = listK.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(q.z(listK.get(i10), q.j(B1.d.INSTANCE), mVar));
            }
            return arrayList;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LL0/m;", "LB1/d;", "it", "", "a", "(LL0/m;LB1/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.text.q$u, reason: case insensitive filesystem */
    static final class C6076u extends Lambda implements Function2<L0.m, B1.d, Object> {

        /* renamed from: f, reason: collision with root package name */
        public static final C6076u f52856f = new C6076u();

        C6076u() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(L0.m mVar, B1.d dVar) {
            return dVar.b();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LL0/m;", "Landroidx/compose/ui/text/n;", "it", "", "a", "(LL0/m;Landroidx/compose/ui/text/n;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    static final class z extends Lambda implements Function2<L0.m, ParagraphStyle, Object> {

        /* renamed from: f, reason: collision with root package name */
        public static final z f52862f = new z();

        z() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(L0.m mVar, ParagraphStyle nVar) {
            return CollectionsKt.g(q.y(F1.j.h(nVar.getTextAlign())), q.y(F1.l.g(nVar.getTextDirection())), q.z(H1.v.b(nVar.getLineHeight()), q.q(H1.v.INSTANCE), mVar), q.z(nVar.getTextIndent(), q.p(TextIndent.INSTANCE), mVar), q.z(nVar.getPlatformStyle(), r.c(PlatformParagraphStyle.INSTANCE), mVar), q.z(nVar.getLineHeightStyle(), q.m(LineHeightStyle.INSTANCE), mVar), q.z(F1.f.c(nVar.getLineBreak()), r.a(F1.f.INSTANCE), mVar), q.y(F1.e.d(nVar.getHyphens())), q.z(nVar.getTextMotion(), r.b(F1.s.INSTANCE), mVar));
        }
    }

    private static final <Original, Saveable> j<Original, Saveable> a(Function2<? super L0.m, ? super Original, ? extends Saveable> function2, Function1<? super Saveable, ? extends Original> function1) {
        return new w(function2, function1);
    }

    public static final L0.k<AnnotatedString, Object> h() {
        return f52792a;
    }

    public static final L0.k<ParagraphStyle, Object> i() {
        return f52799h;
    }

    public static final L0.k<B1.d, Object> j(d.Companion companion) {
        return f52813v;
    }

    public static final L0.k<LocaleList, Object> k(LocaleList.Companion companion) {
        return f52812u;
    }

    public static final L0.k<F1.a, Object> l(a.Companion companion) {
        return f52806o;
    }

    public static final L0.k<LineHeightStyle, Object> m(LineHeightStyle.Companion companion) {
        return f52814w;
    }

    public static final L0.k<F1.k, Object> n(k.Companion companion) {
        return f52802k;
    }

    public static final L0.k<TextGeometricTransform, Object> o(TextGeometricTransform.Companion companion) {
        return f52803l;
    }

    public static final L0.k<TextIndent, Object> p(TextIndent.Companion companion) {
        return f52804m;
    }

    public static final L0.k<H1.v, Object> q(v.Companion companion) {
        return f52810s;
    }

    public static final L0.k<U0.f, Object> r(f.Companion companion) {
        return f52811t;
    }

    public static final L0.k<C5489q0, Object> s(C5489q0.Companion companion) {
        return f52809r;
    }

    public static final L0.k<Shadow, Object> t(Shadow.Companion companion) {
        return f52808q;
    }

    public static final L0.k<androidx.compose.ui.text.y, Object> u(y.Companion companion) {
        return f52807p;
    }

    public static final L0.k<FontWeight, Object> v(FontWeight.Companion companion) {
        return f52805n;
    }

    public static final L0.k<SpanStyle, Object> w() {
        return f52800i;
    }

    public static final L0.k<u1.w, Object> x() {
        return f52801j;
    }

    public static final <T extends L0.k<Original, Saveable>, Original, Saveable> Object z(Original original, T t10, L0.m mVar) {
        Object objA;
        return (original == null || (objA = t10.a(mVar, original)) == null) ? Boolean.FALSE : objA;
    }
}
