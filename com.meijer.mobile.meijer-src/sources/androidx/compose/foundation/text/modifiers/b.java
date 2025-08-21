package androidx.compose.foundation.text.modifiers;

import F1.t;
import U0.h;
import U0.k;
import V0.AbstractC5467i0;
import V0.C5489q0;
import V0.InterfaceC5502x0;
import V0.Shadow;
import X0.j;
import androidx.compose.foundation.text.L;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.layout.AbstractC5916a;
import androidx.compose.ui.layout.C5917b;
import androidx.compose.ui.layout.I;
import androidx.compose.ui.layout.InterfaceC5933s;
import androidx.compose.ui.layout.J;
import androidx.compose.ui.layout.K;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.layout.r;
import androidx.compose.ui.node.C5966u;
import androidx.compose.ui.node.D;
import androidx.compose.ui.node.G;
import androidx.compose.ui.node.InterfaceC5965t;
import androidx.compose.ui.node.u0;
import androidx.compose.ui.node.v0;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.g;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC18269l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import r1.s;
import r1.u;
import u1.Placeholder;
import u1.TextLayoutResult;
import v0.C17579e;
import v0.C17581g;
import v0.C17584j;

@Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001KBÓ\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u0016\u0012\u001e\b\u0002\u0010\u001b\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\u0016\b\u0002\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b$\u0010%J\u0017\u0010)\u001a\u00020(2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u0005H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\rH\u0002¢\u0006\u0004\b.\u0010/J\u001f\u00101\u001a\u00020\u00112\b\u00100\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b3\u0010-J`\u00104\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0014\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010!\u001a\u0004\u0018\u00010 ø\u0001\u0000¢\u0006\u0004\b4\u00105Ja\u00106\u001a\u00020\u00112\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\u001c\u0010\u001b\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b6\u00107J-\u0010<\u001a\u00020\r2\u0006\u00108\u001a\u00020\u00112\u0006\u00109\u001a\u00020\u00112\u0006\u0010:\u001a\u00020\u00112\u0006\u0010;\u001a\u00020\u0011¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\rH\u0000¢\u0006\u0004\b>\u0010/J\u0013\u0010@\u001a\u00020\r*\u00020?H\u0016¢\u0006\u0004\b@\u0010AJ(\u0010I\u001a\u00020H2\u0006\u0010C\u001a\u00020B2\u0006\u0010E\u001a\u00020D2\u0006\u0010G\u001a\u00020Fø\u0001\u0000¢\u0006\u0004\bI\u0010JJ&\u0010K\u001a\u00020H*\u00020B2\u0006\u0010E\u001a\u00020D2\u0006\u0010G\u001a\u00020FH\u0016ø\u0001\u0000¢\u0006\u0004\bK\u0010JJ%\u0010P\u001a\u00020\u00132\u0006\u0010M\u001a\u00020L2\u0006\u0010E\u001a\u00020N2\u0006\u0010O\u001a\u00020\u0013¢\u0006\u0004\bP\u0010QJ#\u0010R\u001a\u00020\u0013*\u00020L2\u0006\u0010E\u001a\u00020N2\u0006\u0010O\u001a\u00020\u0013H\u0016¢\u0006\u0004\bR\u0010QJ%\u0010T\u001a\u00020\u00132\u0006\u0010M\u001a\u00020L2\u0006\u0010E\u001a\u00020N2\u0006\u0010S\u001a\u00020\u0013¢\u0006\u0004\bT\u0010QJ#\u0010U\u001a\u00020\u0013*\u00020L2\u0006\u0010E\u001a\u00020N2\u0006\u0010S\u001a\u00020\u0013H\u0016¢\u0006\u0004\bU\u0010QJ%\u0010V\u001a\u00020\u00132\u0006\u0010M\u001a\u00020L2\u0006\u0010E\u001a\u00020N2\u0006\u0010O\u001a\u00020\u0013¢\u0006\u0004\bV\u0010QJ#\u0010W\u001a\u00020\u0013*\u00020L2\u0006\u0010E\u001a\u00020N2\u0006\u0010O\u001a\u00020\u0013H\u0016¢\u0006\u0004\bW\u0010QJ%\u0010X\u001a\u00020\u00132\u0006\u0010M\u001a\u00020L2\u0006\u0010E\u001a\u00020N2\u0006\u0010S\u001a\u00020\u0013¢\u0006\u0004\bX\u0010QJ#\u0010Y\u001a\u00020\u0013*\u00020L2\u0006\u0010E\u001a\u00020N2\u0006\u0010S\u001a\u00020\u0013H\u0016¢\u0006\u0004\bY\u0010QJ\u0015\u0010\\\u001a\u00020\r2\u0006\u0010[\u001a\u00020Z¢\u0006\u0004\b\\\u0010]J\u0013\u0010^\u001a\u00020\r*\u00020ZH\u0016¢\u0006\u0004\b^\u0010]R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR$\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010eR\u001c\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bf\u0010^R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010^R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010^R$\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR,\u0010\u001b\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010eR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR$\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010eR*\u0010x\u001a\u0010\u0012\u0004\u0012\u00020t\u0012\u0004\u0012\u00020\u0013\u0018\u00010s8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bu\u0010v\u0012\u0004\bw\u0010/R\u0018\u0010{\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR*\u0010~\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0|\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010eR*\u0010\u0085\u0001\u001a\u0004\u0018\u00010\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0017\u0010\u0088\u0001\u001a\u00020(8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0017\u0010\u008b\u0001\u001a\u00020\u00118VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u008c\u0001"}, d2 = {"Landroidx/compose/foundation/text/modifiers/b;", "Landroidx/compose/ui/Modifier$c;", "Landroidx/compose/ui/node/D;", "Landroidx/compose/ui/node/t;", "Landroidx/compose/ui/node/u0;", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/z;", "style", "Ly1/l$b;", "fontFamilyResolver", "Lkotlin/Function1;", "Lu1/v;", "", "onTextLayout", "LF1/t;", "overflow", "", "softWrap", "", "maxLines", "minLines", "", "Landroidx/compose/ui/text/AnnotatedString$d;", "Lu1/i;", "placeholders", "Landroidx/compose/ui/geometry/Rect;", "onPlaceholderLayout", "Lv0/g;", "selectionController", "LV0/x0;", "overrideColor", "Landroidx/compose/foundation/text/L;", "autoSize", "Landroidx/compose/foundation/text/modifiers/b$a;", "onShowTranslation", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/z;Ly1/l$b;Lkotlin/jvm/functions/Function1;IZIILjava/util/List;Lkotlin/jvm/functions/Function1;Lv0/g;LV0/x0;Landroidx/compose/foundation/text/L;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "LH1/d;", "density", "Lv0/e;", "U2", "(LH1/d;)Lv0/e;", "updatedText", "c3", "(Landroidx/compose/ui/text/AnnotatedString;)Z", "W2", "()V", "color", "e3", "(LV0/x0;Landroidx/compose/ui/text/z;)Z", "g3", "f3", "(Landroidx/compose/ui/text/z;Ljava/util/List;IIZLy1/l$b;ILandroidx/compose/foundation/text/L;)Z", "d3", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lv0/g;Lkotlin/jvm/functions/Function1;)Z", "drawChanged", "textChanged", "layoutChanged", "callbacksChanged", "R2", "(ZZZZ)V", "Q2", "Lr1/u;", "T1", "(Lr1/u;)V", "Landroidx/compose/ui/layout/K;", "measureScope", "Landroidx/compose/ui/layout/I;", "measurable", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "Z2", "(Landroidx/compose/ui/layout/K;Landroidx/compose/ui/layout/I;J)Landroidx/compose/ui/layout/J;", "a", "Landroidx/compose/ui/layout/s;", "intrinsicMeasureScope", "Landroidx/compose/ui/layout/r;", "height", "b3", "(Landroidx/compose/ui/layout/s;Landroidx/compose/ui/layout/r;I)I", "J", "width", "a3", "F", "Y2", "N", "X2", "r", "LX0/c;", "contentDrawScope", "S2", "(LX0/c;)V", "I", "o", "Landroidx/compose/ui/text/AnnotatedString;", "p", "Landroidx/compose/ui/text/z;", "q", "Ly1/l$b;", "Lkotlin/jvm/functions/Function1;", "s", "t", "Z", "u", "v", "w", "Ljava/util/List;", "x", "y", "Lv0/g;", "z", "LV0/x0;", "A", "", "Landroidx/compose/ui/layout/a;", "B", "Ljava/util/Map;", "getBaselineCache$annotations", "baselineCache", "C", "Lv0/e;", "_layoutCache", "", "D", "semanticsTextLayoutResult", "E", "Landroidx/compose/foundation/text/modifiers/b$a;", "V2", "()Landroidx/compose/foundation/text/modifiers/b$a;", "setTextSubstitution$foundation_release", "(Landroidx/compose/foundation/text/modifiers/b$a;)V", "textSubstitution", "T2", "()Lv0/e;", "layoutCache", "o2", "()Z", "shouldAutoInvalidate", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class b extends Modifier.c implements D, InterfaceC5965t, u0 {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private Function1<? super TextSubstitutionValue, Unit> onShowTranslation;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private Map<AbstractC5916a, Integer> baselineCache;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private C17579e _layoutCache;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private Function1<? super List<TextLayoutResult>, Boolean> semanticsTextLayoutResult;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private TextSubstitutionValue textSubstitution;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private AnnotatedString text;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private TextStyle style;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private AbstractC18269l.b fontFamilyResolver;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private Function1<? super TextLayoutResult, Unit> onTextLayout;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private int overflow;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean softWrap;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private int maxLines;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private int minLines;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private List<AnnotatedString.Range<Placeholder>> placeholders;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private Function1<? super List<Rect>, Unit> onPlaceholderLayout;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private C17581g selectionController;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5502x0 overrideColor;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017\"\u0004\b\u0019\u0010\u001aR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010 \u001a\u0004\b\u0014\u0010!\"\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Landroidx/compose/foundation/text/modifiers/b$a;", "", "Landroidx/compose/ui/text/AnnotatedString;", "original", "substitution", "", "isShowingSubstitution", "Lv0/e;", "layoutCache", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/AnnotatedString;ZLv0/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/text/AnnotatedString;", "b", "()Landroidx/compose/ui/text/AnnotatedString;", "c", "g", "(Landroidx/compose/ui/text/AnnotatedString;)V", "Z", "d", "()Z", "f", "(Z)V", "Lv0/e;", "()Lv0/e;", "e", "(Lv0/e;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.modifiers.b$a, reason: from toString */
    public static final /* data */ class TextSubstitutionValue {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final AnnotatedString original;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private AnnotatedString substitution;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private boolean isShowingSubstitution;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private C17579e layoutCache;

        public TextSubstitutionValue(AnnotatedString annotatedString, AnnotatedString annotatedString2, boolean z10, C17579e c17579e) {
            this.original = annotatedString;
            this.substitution = annotatedString2;
            this.isShowingSubstitution = z10;
            this.layoutCache = c17579e;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextSubstitutionValue)) {
                return false;
            }
            TextSubstitutionValue textSubstitutionValue = (TextSubstitutionValue) other;
            return Intrinsics.e(this.original, textSubstitutionValue.original) && Intrinsics.e(this.substitution, textSubstitutionValue.substitution) && this.isShowingSubstitution == textSubstitutionValue.isShowingSubstitution && Intrinsics.e(this.layoutCache, textSubstitutionValue.layoutCache);
        }

        public int hashCode() {
            int iHashCode = ((((this.original.hashCode() * 31) + this.substitution.hashCode()) * 31) + Boolean.hashCode(this.isShowingSubstitution)) * 31;
            C17579e c17579e = this.layoutCache;
            return iHashCode + (c17579e == null ? 0 : c17579e.hashCode());
        }

        public String toString() {
            return "TextSubstitutionValue(original=" + ((Object) this.original) + ", substitution=" + ((Object) this.substitution) + ", isShowingSubstitution=" + this.isShowingSubstitution + ", layoutCache=" + this.layoutCache + ')';
        }

        /* renamed from: a, reason: from getter */
        public final C17579e getLayoutCache() {
            return this.layoutCache;
        }

        /* renamed from: b, reason: from getter */
        public final AnnotatedString getOriginal() {
            return this.original;
        }

        /* renamed from: c, reason: from getter */
        public final AnnotatedString getSubstitution() {
            return this.substitution;
        }

        /* renamed from: d, reason: from getter */
        public final boolean getIsShowingSubstitution() {
            return this.isShowingSubstitution;
        }

        public final void e(C17579e c17579e) {
            this.layoutCache = c17579e;
        }

        public final void f(boolean z10) {
            this.isShowingSubstitution = z10;
        }

        public final void g(AnnotatedString annotatedString) {
            this.substitution = annotatedString;
        }

        public /* synthetic */ TextSubstitutionValue(AnnotatedString annotatedString, AnnotatedString annotatedString2, boolean z10, C17579e c17579e, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(annotatedString, annotatedString2, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? null : c17579e);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lu1/v;", "textLayoutResult", "", "a", "(Ljava/util/List;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: androidx.compose.foundation.text.modifiers.b$b, reason: collision with other inner class name */
    static final class C1044b extends Lambda implements Function1<List<TextLayoutResult>, Boolean> {
        C1044b() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x00b7  */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Boolean invoke(java.util.List<u1.TextLayoutResult> r38) {
            /*
                r37 = this;
                r0 = r37
                androidx.compose.foundation.text.modifiers.b r1 = androidx.compose.foundation.text.modifiers.b.this
                v0.e r1 = androidx.compose.foundation.text.modifiers.b.K2(r1)
                u1.v r2 = r1.getLayoutCache()
                if (r2 == 0) goto Lb7
                androidx.compose.ui.text.v r3 = new androidx.compose.ui.text.v
                androidx.compose.ui.text.v r1 = r2.getLayoutInput()
                androidx.compose.ui.text.AnnotatedString r4 = r1.getText()
                androidx.compose.foundation.text.modifiers.b r1 = androidx.compose.foundation.text.modifiers.b.this
                androidx.compose.ui.text.z r5 = androidx.compose.foundation.text.modifiers.b.N2(r1)
                androidx.compose.foundation.text.modifiers.b r1 = androidx.compose.foundation.text.modifiers.b.this
                V0.x0 r1 = androidx.compose.foundation.text.modifiers.b.M2(r1)
                if (r1 == 0) goto L2b
                long r6 = r1.a()
                goto L31
            L2b:
                V0.q0$a r1 = V0.C5489q0.INSTANCE
                long r6 = r1.j()
            L31:
                r35 = 16777214(0xfffffe, float:2.3509884E-38)
                r36 = 0
                r8 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                r22 = 0
                r23 = 0
                r24 = 0
                r25 = 0
                r26 = 0
                r27 = 0
                r29 = 0
                r30 = 0
                r31 = 0
                r32 = 0
                r33 = 0
                r34 = 0
                androidx.compose.ui.text.z r5 = androidx.compose.ui.text.TextStyle.L(r5, r6, r8, r10, r11, r12, r13, r14, r15, r17, r18, r19, r20, r22, r23, r24, r25, r26, r27, r29, r30, r31, r32, r33, r34, r35, r36)
                androidx.compose.ui.text.v r1 = r2.getLayoutInput()
                java.util.List r6 = r1.g()
                androidx.compose.ui.text.v r1 = r2.getLayoutInput()
                int r7 = r1.getMaxLines()
                androidx.compose.ui.text.v r1 = r2.getLayoutInput()
                boolean r8 = r1.getSoftWrap()
                androidx.compose.ui.text.v r1 = r2.getLayoutInput()
                int r9 = r1.getOverflow()
                androidx.compose.ui.text.v r1 = r2.getLayoutInput()
                H1.d r10 = r1.getDensity()
                androidx.compose.ui.text.v r1 = r2.getLayoutInput()
                H1.t r11 = r1.getLayoutDirection()
                androidx.compose.ui.text.v r1 = r2.getLayoutInput()
                y1.l$b r12 = r1.getFontFamilyResolver()
                androidx.compose.ui.text.v r1 = r2.getLayoutInput()
                long r13 = r1.getConstraints()
                r15 = 0
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15)
                r6 = 2
                r7 = 0
                r4 = 0
                u1.v r1 = u1.TextLayoutResult.b(r2, r3, r4, r6, r7)
                if (r1 == 0) goto Lb7
                r2 = r38
                r2.add(r1)
                goto Lb8
            Lb7:
                r1 = 0
            Lb8:
                if (r1 == 0) goto Lbc
                r1 = 1
                goto Lbd
            Lbc:
                r1 = 0
            Lbd:
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.b.C1044b.invoke(java.util.List):java.lang.Boolean");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "updatedText", "", "a", "(Landroidx/compose/ui/text/AnnotatedString;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class c extends Lambda implements Function1<AnnotatedString, Boolean> {
        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(AnnotatedString annotatedString) {
            b.this.c3(annotatedString);
            b.this.W2();
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(Z)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class d extends Lambda implements Function1<Boolean, Boolean> {
        d() {
            super(1);
        }

        public final Boolean a(boolean z10) {
            if (b.this.getTextSubstitution() == null) {
                return Boolean.FALSE;
            }
            Function1 function1 = b.this.onShowTranslation;
            if (function1 != null) {
                TextSubstitutionValue textSubstitution = b.this.getTextSubstitution();
                Intrinsics.g(textSubstitution);
                function1.invoke(textSubstitution);
            }
            TextSubstitutionValue textSubstitution2 = b.this.getTextSubstitution();
            if (textSubstitution2 != null) {
                textSubstitution2.f(z10);
            }
            b.this.W2();
            return Boolean.TRUE;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
            return a(bool.booleanValue());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class e extends Lambda implements Function0<Boolean> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            b.this.Q2();
            b.this.W2();
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
    static final class f extends Lambda implements Function1<f0.a, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ f0 f49913f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(f0 f0Var) {
            super(1);
            this.f49913f = f0Var;
        }

        public final void a(f0.a aVar) {
            f0.a.h(aVar, this.f49913f, 0, 0, 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
            a(aVar);
            return Unit.f143329a;
        }
    }

    public /* synthetic */ b(AnnotatedString annotatedString, TextStyle textStyle, AbstractC18269l.b bVar, Function1 function1, int i10, boolean z10, int i11, int i12, List list, Function1 function12, C17581g c17581g, InterfaceC5502x0 interfaceC5502x0, L l10, Function1 function13, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, bVar, function1, i10, z10, i11, i12, list, function12, c17581g, interfaceC5502x0, l10, function13);
    }

    public final void Q2() {
        this.textSubstitution = null;
    }

    @Override // androidx.compose.ui.Modifier.c
    /* renamed from: o2 */
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    private b(AnnotatedString annotatedString, TextStyle textStyle, AbstractC18269l.b bVar, Function1<? super TextLayoutResult, Unit> function1, int i10, boolean z10, int i11, int i12, List<AnnotatedString.Range<Placeholder>> list, Function1<? super List<Rect>, Unit> function12, C17581g c17581g, InterfaceC5502x0 interfaceC5502x0, L l10, Function1<? super TextSubstitutionValue, Unit> function13) {
        this.text = annotatedString;
        this.style = textStyle;
        this.fontFamilyResolver = bVar;
        this.onTextLayout = function1;
        this.overflow = i10;
        this.softWrap = z10;
        this.maxLines = i11;
        this.minLines = i12;
        this.placeholders = list;
        this.onPlaceholderLayout = function12;
        this.selectionController = c17581g;
        this.overrideColor = interfaceC5502x0;
        this.onShowTranslation = function13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C17579e T2() {
        if (this._layoutCache == null) {
            this._layoutCache = new C17579e(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, null, null);
        }
        C17579e c17579e = this._layoutCache;
        Intrinsics.g(c17579e);
        return c17579e;
    }

    private final C17579e U2(H1.d density) {
        C17579e layoutCache;
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        if (textSubstitutionValue != null && textSubstitutionValue.getIsShowingSubstitution() && (layoutCache = textSubstitutionValue.getLayoutCache()) != null) {
            layoutCache.l(density);
            return layoutCache;
        }
        C17579e c17579eT2 = T2();
        c17579eT2.l(density);
        return c17579eT2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean c3(AnnotatedString updatedText) {
        Unit unit;
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        if (textSubstitutionValue == null) {
            TextSubstitutionValue textSubstitutionValue2 = new TextSubstitutionValue(this.text, updatedText, false, null, 12, null);
            C17579e c17579e = new C17579e(updatedText, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, CollectionsKt.m(), null, null);
            c17579e.l(T2().getDensity());
            textSubstitutionValue2.e(c17579e);
            this.textSubstitution = textSubstitutionValue2;
            return true;
        }
        if (Intrinsics.e(updatedText, textSubstitutionValue.getSubstitution())) {
            return false;
        }
        textSubstitutionValue.g(updatedText);
        C17579e layoutCache = textSubstitutionValue.getLayoutCache();
        if (layoutCache != null) {
            layoutCache.p(updatedText, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, CollectionsKt.m(), null);
            unit = Unit.f143329a;
        } else {
            unit = null;
        }
        return unit != null;
    }

    @Override // androidx.compose.ui.node.InterfaceC5965t
    public void I(X0.c cVar) {
        if (getIsAttached()) {
            C17581g c17581g = this.selectionController;
            if (c17581g != null) {
                c17581g.c(cVar);
            }
            Canvas canvasG = cVar.getDrawContext().g();
            TextLayoutResult textLayoutResultC = U2(cVar).c();
            g multiParagraph = textLayoutResultC.getMultiParagraph();
            boolean z10 = true;
            boolean z11 = textLayoutResultC.i() && !t.g(this.overflow, t.INSTANCE.e());
            if (z11) {
                Rect rectB = h.b(U0.f.INSTANCE.c(), k.d((Float.floatToRawIntBits((int) (textLayoutResultC.getSize() >> 32)) << 32) | (Float.floatToRawIntBits((int) (textLayoutResultC.getSize() & 4294967295L)) & 4294967295L)));
                canvasG.save();
                Canvas.r(canvasG, rectB, 0, 2, null);
            }
            try {
                F1.k kVarA = this.style.A();
                if (kVarA == null) {
                    kVarA = F1.k.INSTANCE.c();
                }
                F1.k kVar = kVarA;
                Shadow shadowX = this.style.x();
                if (shadowX == null) {
                    shadowX = Shadow.INSTANCE.a();
                }
                Shadow shadow = shadowX;
                X0.g gVarI = this.style.i();
                if (gVarI == null) {
                    gVarI = j.f41494a;
                }
                X0.g gVar = gVarI;
                AbstractC5467i0 abstractC5467i0G = this.style.g();
                if (abstractC5467i0G != null) {
                    g.I(multiParagraph, canvasG, abstractC5467i0G, this.style.d(), shadow, kVar, gVar, 0, 64, null);
                } else {
                    InterfaceC5502x0 interfaceC5502x0 = this.overrideColor;
                    long jA = interfaceC5502x0 != null ? interfaceC5502x0.a() : C5489q0.INSTANCE.j();
                    if (jA == 16) {
                        jA = this.style.h() != 16 ? this.style.h() : C5489q0.INSTANCE.a();
                    }
                    multiParagraph.F(canvasG, (30 & 2) != 0 ? C5489q0.INSTANCE.j() : jA, (30 & 4) != 0 ? null : shadow, (30 & 8) != 0 ? null : kVar, (30 & 16) == 0 ? gVar : null, (30 & 32) != 0 ? X0.f.INSTANCE.a() : 0);
                }
                if (z11) {
                    canvasG.i();
                }
                TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
                if (!((textSubstitutionValue == null || !textSubstitutionValue.getIsShowingSubstitution()) ? C17584j.a(this.text) : false)) {
                    List<AnnotatedString.Range<Placeholder>> list = this.placeholders;
                    if (list != null && !list.isEmpty()) {
                        z10 = false;
                    }
                    if (z10) {
                        return;
                    }
                }
                cVar.a2();
            } catch (Throwable th2) {
                if (z11) {
                    canvasG.i();
                }
                throw th2;
            }
        }
    }

    public final void R2(boolean drawChanged, boolean textChanged, boolean layoutChanged, boolean callbacksChanged) {
        if (textChanged || layoutChanged || callbacksChanged) {
            T2().p(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, null);
        }
        if (getIsAttached()) {
            if (textChanged || (drawChanged && this.semanticsTextLayoutResult != null)) {
                v0.b(this);
            }
            if (textChanged || layoutChanged || callbacksChanged) {
                G.b(this);
                C5966u.a(this);
            }
            if (drawChanged) {
                C5966u.a(this);
            }
        }
    }

    @Override // androidx.compose.ui.node.u0
    public void T1(u uVar) {
        Function1 c1044b = this.semanticsTextLayoutResult;
        if (c1044b == null) {
            c1044b = new C1044b();
            this.semanticsTextLayoutResult = c1044b;
        }
        s.z0(uVar, this.text);
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        if (textSubstitutionValue != null) {
            s.D0(uVar, textSubstitutionValue.getSubstitution());
            s.w0(uVar, textSubstitutionValue.getIsShowingSubstitution());
        }
        s.F0(uVar, null, new c(), 1, null);
        s.K0(uVar, null, new d(), 1, null);
        s.d(uVar, null, new e(), 1, null);
        s.u(uVar, null, c1044b, 1, null);
    }

    /* renamed from: V2, reason: from getter */
    public final TextSubstitutionValue getTextSubstitution() {
        return this.textSubstitution;
    }

    public final boolean d3(Function1<? super TextLayoutResult, Unit> onTextLayout, Function1<? super List<Rect>, Unit> onPlaceholderLayout, C17581g selectionController, Function1<? super TextSubstitutionValue, Unit> onShowTranslation) {
        boolean z10;
        if (this.onTextLayout != onTextLayout) {
            this.onTextLayout = onTextLayout;
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.onPlaceholderLayout != onPlaceholderLayout) {
            this.onPlaceholderLayout = onPlaceholderLayout;
            z10 = true;
        }
        if (!Intrinsics.e(this.selectionController, selectionController)) {
            this.selectionController = selectionController;
            z10 = true;
        }
        if (this.onShowTranslation == onShowTranslation) {
            return z10;
        }
        this.onShowTranslation = onShowTranslation;
        return true;
    }

    public final boolean e3(InterfaceC5502x0 color, TextStyle style) {
        boolean zE = Intrinsics.e(color, this.overrideColor);
        this.overrideColor = color;
        return (zE && style.F(this.style)) ? false : true;
    }

    public final boolean f3(TextStyle style, List<AnnotatedString.Range<Placeholder>> placeholders, int minLines, int maxLines, boolean softWrap, AbstractC18269l.b fontFamilyResolver, int overflow, L autoSize) {
        boolean z10 = !this.style.G(style);
        this.style = style;
        if (!Intrinsics.e(this.placeholders, placeholders)) {
            this.placeholders = placeholders;
            z10 = true;
        }
        if (this.minLines != minLines) {
            this.minLines = minLines;
            z10 = true;
        }
        if (this.maxLines != maxLines) {
            this.maxLines = maxLines;
            z10 = true;
        }
        if (this.softWrap != softWrap) {
            this.softWrap = softWrap;
            z10 = true;
        }
        if (!Intrinsics.e(this.fontFamilyResolver, fontFamilyResolver)) {
            this.fontFamilyResolver = fontFamilyResolver;
            z10 = true;
        }
        if (!t.g(this.overflow, overflow)) {
            this.overflow = overflow;
            z10 = true;
        }
        if (Intrinsics.e(null, autoSize)) {
            return z10;
        }
        return true;
    }

    public final boolean g3(AnnotatedString text) {
        boolean zE = Intrinsics.e(this.text.getText(), text.getText());
        boolean z10 = (zE && this.text.n(text)) ? false : true;
        if (z10) {
            this.text = text;
        }
        if (!zE) {
            Q2();
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W2() {
        v0.b(this);
        G.b(this);
        C5966u.a(this);
    }

    @Override // androidx.compose.ui.node.D
    public int F(InterfaceC5933s interfaceC5933s, r rVar, int i10) {
        return U2(interfaceC5933s).d(i10, interfaceC5933s.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.D
    public int J(InterfaceC5933s interfaceC5933s, r rVar, int i10) {
        return U2(interfaceC5933s).j(interfaceC5933s.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.D
    public int N(InterfaceC5933s interfaceC5933s, r rVar, int i10) {
        return U2(interfaceC5933s).i(interfaceC5933s.getLayoutDirection());
    }

    public final void S2(X0.c contentDrawScope) {
        I(contentDrawScope);
    }

    public final int X2(InterfaceC5933s intrinsicMeasureScope, r measurable, int width) {
        return r(intrinsicMeasureScope, measurable, width);
    }

    public final int Y2(InterfaceC5933s intrinsicMeasureScope, r measurable, int height) {
        return N(intrinsicMeasureScope, measurable, height);
    }

    public final J Z2(K measureScope, I measurable, long constraints) {
        return a(measureScope, measurable, constraints);
    }

    @Override // androidx.compose.ui.node.D
    public J a(K k10, I i10, long j10) {
        C17579e c17579eU2 = U2(k10);
        boolean zF = c17579eU2.f(j10, k10.getLayoutDirection());
        TextLayoutResult textLayoutResultC = c17579eU2.c();
        textLayoutResultC.getMultiParagraph().getIntrinsics().a();
        if (zF) {
            G.a(this);
            Function1<? super TextLayoutResult, Unit> function1 = this.onTextLayout;
            if (function1 != null) {
                function1.invoke(textLayoutResultC);
            }
            C17581g c17581g = this.selectionController;
            if (c17581g != null) {
                c17581g.h(textLayoutResultC);
            }
            Map<AbstractC5916a, Integer> linkedHashMap = this.baselineCache;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap<>(2);
            }
            linkedHashMap.put(C5917b.a(), Integer.valueOf(Math.round(textLayoutResultC.getFirstBaseline())));
            linkedHashMap.put(C5917b.b(), Integer.valueOf(Math.round(textLayoutResultC.getLastBaseline())));
            this.baselineCache = linkedHashMap;
        }
        Function1<? super List<Rect>, Unit> function12 = this.onPlaceholderLayout;
        if (function12 != null) {
            function12.invoke(textLayoutResultC.A());
        }
        f0 f0VarK0 = i10.k0(H1.b.INSTANCE.b((int) (textLayoutResultC.getSize() >> 32), (int) (textLayoutResultC.getSize() >> 32), (int) (textLayoutResultC.getSize() & 4294967295L), (int) (textLayoutResultC.getSize() & 4294967295L)));
        int size = (int) (textLayoutResultC.getSize() >> 32);
        int size2 = (int) (textLayoutResultC.getSize() & 4294967295L);
        Map<AbstractC5916a, Integer> map = this.baselineCache;
        Intrinsics.g(map);
        return k10.g1(size, size2, map, new f(f0VarK0));
    }

    public final int a3(InterfaceC5933s intrinsicMeasureScope, r measurable, int width) {
        return F(intrinsicMeasureScope, measurable, width);
    }

    public final int b3(InterfaceC5933s intrinsicMeasureScope, r measurable, int height) {
        return J(intrinsicMeasureScope, measurable, height);
    }

    @Override // androidx.compose.ui.node.D
    public int r(InterfaceC5933s interfaceC5933s, r rVar, int i10) {
        return U2(interfaceC5933s).d(i10, interfaceC5933s.getLayoutDirection());
    }
}
