package m0;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.d;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.snapshots.g;
import androidx.compose.runtime.t1;
import androidx.compose.ui.layout.h0;
import androidx.compose.ui.layout.i0;
import i0.C14589e;
import java.util.ArrayList;
import java.util.List;
import kotlin.C13791I;
import kotlin.C15720F;
import kotlin.C15721G;
import kotlin.C15733T;
import kotlin.C15743c;
import kotlin.C15749i;
import kotlin.InterfaceC13787E;
import kotlin.InterfaceC13790H;
import kotlin.InterfaceC15732S;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.IntRange;

@Metadata(d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u0083\u00012\u00020\u0001:\u00019B'\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001d\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0013\u001a\u00020\u000e2\b\b\u0001\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018JA\u0010!\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192'\u0010 \u001a#\b\u0001\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001b¢\u0006\u0002\b\u001fH\u0096@¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\n2\u0006\u0010%\u001a\u00020\nH\u0000¢\u0006\u0004\b&\u0010$J)\u0010+\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u00152\b\b\u0002\u0010*\u001a\u00020\u0015H\u0000¢\u0006\u0004\b+\u0010,J\u001f\u00100\u001a\u00020\u00022\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\u0002H\u0000¢\u0006\u0004\b0\u00101R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u00102R$\u00108\u001a\u00020\u00152\u0006\u00103\u001a\u00020\u00158\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R(\u0010=\u001a\u0004\u0018\u00010'2\b\u00103\u001a\u0004\u0018\u00010'8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020'0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001a\u0010J\u001a\u00020F8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010G\u001a\u0004\bH\u0010IR$\u0010N\u001a\u00020\n2\u0006\u00103\u001a\u00020\n8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bK\u0010\u0013\u001a\u0004\bL\u0010MR\u0014\u0010Q\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR$\u0010V\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\"\u0010[\u001a\u00020\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bW\u00105\u001a\u0004\bX\u00107\"\u0004\bY\u0010ZR(\u0010`\u001a\u0004\u0018\u00010\\2\b\u00103\u001a\u0004\u0018\u00010\\8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b+\u0010]\u001a\u0004\b^\u0010_R\u001a\u0010f\u001a\u00020a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR\u001a\u0010k\u001a\u00020g8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b;\u0010h\u001a\u0004\bi\u0010jR \u0010q\u001a\b\u0012\u0004\u0012\u00020m0l8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bi\u0010n\u001a\u0004\bo\u0010pR\u001a\u0010v\u001a\u00020r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bs\u0010uR\u001a\u0010|\u001a\u00020w8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{R\u0015\u0010\u0080\u0001\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u001f\u0010\u0085\u0001\u001a\u00030\u0081\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b6\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R$\u0010\u0089\u0001\u001a\u00030\u0086\u00018\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0004\bH\u0010D\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R$\u0010\u008b\u0001\u001a\u00030\u0086\u00018\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0004\bo\u0010D\u001a\u0006\b\u008a\u0001\u0010\u0088\u0001R-\u0010\u008d\u0001\u001a\u00020\u00152\u0006\u00103\u001a\u00020\u00158V@RX\u0096\u008e\u0002¢\u0006\u0013\n\u0005\b\u008c\u0001\u0010D\u001a\u0004\bC\u00107\"\u0004\bS\u0010ZR.\u0010\u008f\u0001\u001a\u00020\u00152\u0006\u00103\u001a\u00020\u00158V@RX\u0096\u008e\u0002¢\u0006\u0014\n\u0005\b\u008a\u0001\u0010D\u001a\u0004\b?\u00107\"\u0005\b\u008e\u0001\u0010ZR\u0018\u0010\u0093\u0001\u001a\u00030\u0090\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0011\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bx\u0010UR\u0011\u0010\u0004\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b~\u0010UR\u0013\u0010\r\u001a\u00020\f8F¢\u0006\b\u001a\u0006\b\u008c\u0001\u0010\u0094\u0001R!\u0010\u0099\u0001\u001a\u00030\u0095\u00018@X\u0080\u0084\u0002¢\u0006\u0010\u001a\u0006\b\u0091\u0001\u0010\u0096\u0001*\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0015\u0010\u009a\u0001\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00107R\u0016\u0010\u009c\u0001\u001a\u00020\n8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u009b\u0001\u0010M\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u009d\u0001"}, d2 = {"Lm0/I;", "Lf0/H;", "", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "Lm0/A;", "prefetchStrategy", "<init>", "(IILm0/A;)V", "(II)V", "", "delta", "Lm0/r;", "layoutInfo", "", "D", "(FLm0/r;)V", "index", "scrollOffset", "F", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "forceRemeasure", "J", "(IIZ)V", "Ld0/E;", "scrollPriority", "Lkotlin/Function2;", "Lf0/E;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "a", "(Ld0/E;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "f", "(F)F", "distance", "E", "Lm0/u;", "result", "isLookingAhead", "visibleItemsStayedTheSame", "k", "(Lm0/u;ZZ)V", "Lm0/k;", "itemProvider", "firstItemIndex", "K", "(Lm0/k;I)I", "Lm0/A;", "<set-?>", "b", "Z", "r", "()Z", "hasLookaheadOccurred", "c", "Lm0/u;", "m", "()Lm0/u;", "approachLayoutInfo", "Lm0/D;", "d", "Lm0/D;", "scrollPosition", "Landroidx/compose/runtime/l0;", "e", "Landroidx/compose/runtime/l0;", "layoutInfoState", "Lh0/l;", "Lh0/l;", "s", "()Lh0/l;", "internalInteractionSource", "g", "C", "()F", "scrollToBeConsumed", "h", "Lf0/H;", "scrollableState", "i", "I", "getNumMeasurePasses$foundation_release", "()I", "numMeasurePasses", "j", "getPrefetchingEnabled$foundation_release", "setPrefetchingEnabled$foundation_release", "(Z)V", "prefetchingEnabled", "Landroidx/compose/ui/layout/h0;", "Landroidx/compose/ui/layout/h0;", "getRemeasurement$foundation_release", "()Landroidx/compose/ui/layout/h0;", "remeasurement", "Landroidx/compose/ui/layout/i0;", "l", "Landroidx/compose/ui/layout/i0;", "A", "()Landroidx/compose/ui/layout/i0;", "remeasurementModifier", "Ln0/c;", "Ln0/c;", "n", "()Ln0/c;", "awaitLayoutModifier", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "Lm0/v;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "t", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "itemAnimator", "Ln0/i;", "o", "Ln0/i;", "()Ln0/i;", "beyondBoundsInfo", "Landroidx/compose/foundation/lazy/layout/d;", "p", "Landroidx/compose/foundation/lazy/layout/d;", "z", "()Landroidx/compose/foundation/lazy/layout/d;", "prefetchState", "Lm0/z;", "q", "Lm0/z;", "prefetchScope", "Ln0/F;", "Ln0/F;", "x", "()Ln0/F;", "pinnedItems", "Ln0/T;", "y", "()Landroidx/compose/runtime/l0;", "placementScopeInvalidator", "v", "measurementScopeInvalidator", "u", "canScrollForward", "H", "canScrollBackward", "Ln0/G;", "w", "Ln0/G;", "_lazyLayoutScrollDeltaBetweenPasses", "()Lm0/r;", "Lkotlin/ranges/IntRange;", "()Lkotlin/ranges/IntRange;", "getNearestRange$foundation_release$delegate", "(Lm0/I;)Ljava/lang/Object;", "nearestRange", "isScrollInProgress", "B", "scrollDeltaBetweenPasses", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: m0.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15512I implements InterfaceC13790H {

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: y, reason: collision with root package name */
    private static final L0.k<C15512I, ?> f149529y = L0.a.a(a.f149553f, b.f149554f);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15504A prefetchStrategy;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean hasLookaheadOccurred;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private C15535u approachLayoutInfo;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C15507D scrollPosition;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0<C15535u> layoutInfoState;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final h0.l internalInteractionSource;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private float scrollToBeConsumed;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC13790H scrollableState;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int numMeasurePasses;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean prefetchingEnabled;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private h0 remeasurement;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final i0 remeasurementModifier;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final C15743c awaitLayoutModifier;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final LazyLayoutItemAnimator<C15536v> itemAnimator;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final C15749i beyondBoundsInfo;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.foundation.lazy.layout.d prefetchState;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15540z prefetchScope;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final C15720F pinnedItems;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0<Unit> placementScopeInvalidator;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0<Unit> measurementScopeInvalidator;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 canScrollForward;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 canScrollBackward;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final C15721G _lazyLayoutScrollDeltaBetweenPasses;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "it", "Lm0/I;", "a", "(Ljava/util/List;)Lm0/I;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: m0.I$b */
    static final class b extends Lambda implements Function1<List<? extends Integer>, C15512I> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f149554f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C15512I invoke(List<Integer> list) {
            return new C15512I(list.get(0).intValue(), list.get(1).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lm0/I$c;", "", "<init>", "()V", "LL0/k;", "Lm0/I;", "Saver", "LL0/k;", "a", "()LL0/k;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: m0.I$c, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final L0.k<C15512I, ?> a() {
            return C15512I.f149529y;
        }
    }

    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"m0/I$d", "Lm0/z;", "", "lineIndex", "", "Landroidx/compose/foundation/lazy/layout/d$b;", "a", "(I)Ljava/util/List;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: m0.I$d */
    public static final class d implements InterfaceC15540z {
        d() {
        }

        @Override // m0.InterfaceC15540z
        public List<d.b> a(int lineIndex) {
            ArrayList arrayList = new ArrayList();
            g.Companion companion = androidx.compose.runtime.snapshots.g.INSTANCE;
            C15512I c15512i = C15512I.this;
            androidx.compose.runtime.snapshots.g gVarD = companion.d();
            Function1<Object, Unit> function1G = gVarD != null ? gVarD.g() : null;
            androidx.compose.runtime.snapshots.g gVarE = companion.e(gVarD);
            try {
                C15535u approachLayoutInfo = c15512i.getHasLookaheadOccurred() ? c15512i.getApproachLayoutInfo() : (C15535u) c15512i.layoutInfoState.getValue();
                if (approachLayoutInfo != null) {
                    List<Pair<Integer, H1.b>> listInvoke = approachLayoutInfo.q().invoke(Integer.valueOf(lineIndex));
                    int size = listInvoke.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        Pair<Integer, H1.b> pair = listInvoke.get(i10);
                        arrayList.add(c15512i.getPrefetchState().e(pair.c().intValue(), pair.d().getValue()));
                    }
                    Unit unit = Unit.f142422a;
                }
                companion.l(gVarD, gVarE, function1G);
                return arrayList;
            } catch (Throwable th2) {
                companion.l(gVarD, gVarE, function1G);
                throw th2;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln0/S;", "", "a", "(Ln0/S;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: m0.I$e */
    static final class e extends Lambda implements Function1<InterfaceC15732S, Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f149557g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i10) {
            super(1);
            this.f149557g = i10;
        }

        public final void a(InterfaceC15732S interfaceC15732S) {
            InterfaceC15504A interfaceC15504A = C15512I.this.prefetchStrategy;
            int i10 = this.f149557g;
            g.Companion companion = androidx.compose.runtime.snapshots.g.INSTANCE;
            androidx.compose.runtime.snapshots.g gVarD = companion.d();
            companion.l(gVarD, companion.e(gVarD), gVarD != null ? gVarD.g() : null);
            interfaceC15504A.a(interfaceC15732S, i10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15732S interfaceC15732S) {
            a(interfaceC15732S);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"m0/I$f", "Landroidx/compose/ui/layout/i0;", "Landroidx/compose/ui/layout/h0;", "remeasurement", "", "m", "(Landroidx/compose/ui/layout/h0;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: m0.I$f */
    public static final class f implements i0 {
        f() {
        }

        @Override // androidx.compose.ui.layout.i0
        public void m(h0 remeasurement) {
            C15512I.this.remeasurement = remeasurement;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.lazy.grid.LazyGridState", f = "LazyGridState.kt", l = {377, 378}, m = "scroll")
    /* renamed from: m0.I$g */
    static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f149559a;

        /* renamed from: b, reason: collision with root package name */
        Object f149560b;

        /* renamed from: c, reason: collision with root package name */
        Object f149561c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f149562d;

        /* renamed from: f, reason: collision with root package name */
        int f149564f;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f149562d = obj;
            this.f149564f |= Integer.MIN_VALUE;
            return C15512I.this.a(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lf0/E;", "", "<anonymous>", "(Lf0/E;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.lazy.grid.LazyGridState$scrollToItem$2", f = "LazyGridState.kt", l = {}, m = "invokeSuspend")
    /* renamed from: m0.I$h */
    static final class h extends SuspendLambda implements Function2<InterfaceC13787E, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f149565a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f149567c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f149568d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(int i10, int i11, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f149567c = i10;
            this.f149568d = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C15512I.this.new h(this.f149567c, this.f149568d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC13787E interfaceC13787E, Continuation<? super Unit> continuation) {
            return ((h) create(interfaceC13787E, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f149565a == 0) {
                ResultKt.b(obj);
                C15512I.this.J(this.f149567c, this.f149568d, true);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "b", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: m0.I$i */
    static final class i extends Lambda implements Function1<Float, Float> {
        i() {
            super(1);
        }

        public final Float b(float f10) {
            return Float.valueOf(-C15512I.this.E(-f10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Float invoke(Float f10) {
            return b(f10.floatValue());
        }
    }

    public C15512I() {
        this(0, 0, null, 7, null);
    }

    public final float E(float distance) {
        C15535u c15535u;
        if ((distance < 0.0f && !e()) || (distance > 0.0f && !d())) {
            return 0.0f;
        }
        if (!(Math.abs(this.scrollToBeConsumed) <= 0.5f)) {
            C14589e.c("entered drag with non-zero pending scroll");
        }
        float f10 = this.scrollToBeConsumed + distance;
        this.scrollToBeConsumed = f10;
        if (Math.abs(f10) > 0.5f) {
            float f11 = this.scrollToBeConsumed;
            int iD = MathKt.d(f11);
            C15535u c15535uI = this.layoutInfoState.getValue().i(iD, !this.hasLookaheadOccurred);
            if (c15535uI != null && (c15535u = this.approachLayoutInfo) != null) {
                C15535u c15535uI2 = c15535u != null ? c15535u.i(iD, true) : null;
                if (c15535uI2 != null) {
                    this.approachLayoutInfo = c15535uI2;
                } else {
                    c15535uI = null;
                }
            }
            if (c15535uI != null) {
                k(c15535uI, this.hasLookaheadOccurred, true);
                C15733T.d(this.placementScopeInvalidator);
                D(f11 - this.scrollToBeConsumed, c15535uI);
            } else {
                h0 h0Var = this.remeasurement;
                if (h0Var != null) {
                    h0Var.c();
                }
                D(f11 - this.scrollToBeConsumed, u());
            }
        }
        if (Math.abs(this.scrollToBeConsumed) <= 0.5f) {
            return distance;
        }
        float f12 = distance - this.scrollToBeConsumed;
        this.scrollToBeConsumed = 0.0f;
        return f12;
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LL0/m;", "Lm0/I;", "it", "", "", "a", "(LL0/m;Lm0/I;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: m0.I$a */
    static final class a extends Lambda implements Function2<L0.m, C15512I, List<? extends Integer>> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f149553f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<Integer> invoke(L0.m mVar, C15512I c15512i) {
            return CollectionsKt.p(Integer.valueOf(c15512i.p()), Integer.valueOf(c15512i.q()));
        }
    }

    public C15512I(int i10, int i11, InterfaceC15504A interfaceC15504A) {
        this.prefetchStrategy = interfaceC15504A;
        C15507D c15507d = new C15507D(i10, i11);
        this.scrollPosition = c15507d;
        this.layoutInfoState = o1.i(C15513J.f149570a, o1.k());
        this.internalInteractionSource = h0.k.a();
        this.scrollableState = C13791I.a(new i());
        this.prefetchingEnabled = true;
        this.remeasurementModifier = new f();
        this.awaitLayoutModifier = new C15743c();
        this.itemAnimator = new LazyLayoutItemAnimator<>();
        this.beyondBoundsInfo = new C15749i();
        this.prefetchState = new androidx.compose.foundation.lazy.layout.d(interfaceC15504A.b(), new e(i10));
        this.prefetchScope = new d();
        this.pinnedItems = new C15720F();
        c15507d.getNearestRangeState();
        this.placementScopeInvalidator = C15733T.c(null, 1, null);
        this.measurementScopeInvalidator = C15733T.c(null, 1, null);
        Boolean bool = Boolean.FALSE;
        this.canScrollForward = t1.e(bool, null, 2, null);
        this.canScrollBackward = t1.e(bool, null, 2, null);
        this._lazyLayoutScrollDeltaBetweenPasses = new C15721G();
    }

    private final void D(float delta, InterfaceC15532r layoutInfo) {
        if (this.prefetchingEnabled) {
            this.prefetchStrategy.c(this.prefetchScope, delta, layoutInfo);
        }
    }

    public static /* synthetic */ Object G(C15512I c15512i, int i10, int i11, Continuation continuation, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return c15512i.F(i10, i11, continuation);
    }

    private void H(boolean z10) {
        this.canScrollBackward.setValue(Boolean.valueOf(z10));
    }

    private void I(boolean z10) {
        this.canScrollForward.setValue(Boolean.valueOf(z10));
    }

    public static /* synthetic */ void l(C15512I c15512i, C15535u c15535u, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        c15512i.k(c15535u, z10, z11);
    }

    /* renamed from: A, reason: from getter */
    public final i0 getRemeasurementModifier() {
        return this.remeasurementModifier;
    }

    public final float B() {
        return this._lazyLayoutScrollDeltaBetweenPasses.b();
    }

    /* renamed from: C, reason: from getter */
    public final float getScrollToBeConsumed() {
        return this.scrollToBeConsumed;
    }

    public final Object F(int i10, int i11, Continuation<? super Unit> continuation) {
        Object objC = InterfaceC13790H.c(this, null, new h(i10, i11, null), continuation, 1, null);
        return objC == IntrinsicsKt.f() ? objC : Unit.f142422a;
    }

    public final void J(int index, int scrollOffset, boolean forceRemeasure) {
        if (this.scrollPosition.a() != index || this.scrollPosition.c() != scrollOffset) {
            this.itemAnimator.p();
        }
        this.scrollPosition.d(index, scrollOffset);
        if (!forceRemeasure) {
            C15733T.d(this.measurementScopeInvalidator);
            return;
        }
        h0 h0Var = this.remeasurement;
        if (h0Var != null) {
            h0Var.c();
        }
    }

    public final int K(InterfaceC15525k itemProvider, int firstItemIndex) {
        return this.scrollPosition.j(itemProvider, firstItemIndex);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        if (r8.a(r6, r7, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlin.InterfaceC13790H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(d0.EnumC13431E r6, kotlin.jvm.functions.Function2<? super kotlin.InterfaceC13787E, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof m0.C15512I.g
            if (r0 == 0) goto L13
            r0 = r8
            m0.I$g r0 = (m0.C15512I.g) r0
            int r1 = r0.f149564f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f149564f = r1
            goto L18
        L13:
            m0.I$g r0 = new m0.I$g
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f149562d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f149564f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.ResultKt.b(r8)
            goto L6c
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.f149561c
            r7 = r6
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            java.lang.Object r6 = r0.f149560b
            d0.E r6 = (d0.EnumC13431E) r6
            java.lang.Object r2 = r0.f149559a
            m0.I r2 = (m0.C15512I) r2
            kotlin.ResultKt.b(r8)
            goto L5a
        L45:
            kotlin.ResultKt.b(r8)
            n0.c r8 = r5.awaitLayoutModifier
            r0.f149559a = r5
            r0.f149560b = r6
            r0.f149561c = r7
            r0.f149564f = r4
            java.lang.Object r8 = r8.c(r0)
            if (r8 != r1) goto L59
            goto L6b
        L59:
            r2 = r5
        L5a:
            f0.H r8 = r2.scrollableState
            r2 = 0
            r0.f149559a = r2
            r0.f149560b = r2
            r0.f149561c = r2
            r0.f149564f = r3
            java.lang.Object r6 = r8.a(r6, r7, r0)
            if (r6 != r1) goto L6c
        L6b:
            return r1
        L6c:
            kotlin.Unit r6 = kotlin.Unit.f142422a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.C15512I.a(d0.E, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlin.InterfaceC13790H
    public boolean b() {
        return this.scrollableState.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.InterfaceC13790H
    public boolean d() {
        return ((Boolean) this.canScrollBackward.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.InterfaceC13790H
    public boolean e() {
        return ((Boolean) this.canScrollForward.getValue()).booleanValue();
    }

    @Override // kotlin.InterfaceC13790H
    public float f(float delta) {
        return this.scrollableState.f(delta);
    }

    public final void k(C15535u result, boolean isLookingAhead, boolean visibleItemsStayedTheSame) {
        if (!isLookingAhead && this.hasLookaheadOccurred) {
            this.approachLayoutInfo = result;
            return;
        }
        if (isLookingAhead) {
            this.hasLookaheadOccurred = true;
        }
        this.scrollToBeConsumed -= result.getConsumedScroll();
        this.layoutInfoState.setValue(result);
        H(result.j());
        I(result.getCanScrollForward());
        if (visibleItemsStayedTheSame) {
            this.scrollPosition.i(result.getFirstVisibleLineScrollOffset());
        } else {
            this.scrollPosition.h(result);
            if (this.prefetchingEnabled) {
                this.prefetchStrategy.d(this.prefetchScope, result);
            }
        }
        if (isLookingAhead) {
            this._lazyLayoutScrollDeltaBetweenPasses.c(result.getScrollBackAmount(), result.getDensity(), result.getCoroutineScope());
        }
        this.numMeasurePasses++;
    }

    /* renamed from: m, reason: from getter */
    public final C15535u getApproachLayoutInfo() {
        return this.approachLayoutInfo;
    }

    /* renamed from: n, reason: from getter */
    public final C15743c getAwaitLayoutModifier() {
        return this.awaitLayoutModifier;
    }

    /* renamed from: o, reason: from getter */
    public final C15749i getBeyondBoundsInfo() {
        return this.beyondBoundsInfo;
    }

    public final int p() {
        return this.scrollPosition.a();
    }

    public final int q() {
        return this.scrollPosition.c();
    }

    /* renamed from: r, reason: from getter */
    public final boolean getHasLookaheadOccurred() {
        return this.hasLookaheadOccurred;
    }

    /* renamed from: s, reason: from getter */
    public final h0.l getInternalInteractionSource() {
        return this.internalInteractionSource;
    }

    public final LazyLayoutItemAnimator<C15536v> t() {
        return this.itemAnimator;
    }

    public final InterfaceC15532r u() {
        return this.layoutInfoState.getValue();
    }

    public final InterfaceC5730l0<Unit> v() {
        return this.measurementScopeInvalidator;
    }

    public final IntRange w() {
        return this.scrollPosition.getNearestRangeState().getValue();
    }

    /* renamed from: x, reason: from getter */
    public final C15720F getPinnedItems() {
        return this.pinnedItems;
    }

    public final InterfaceC5730l0<Unit> y() {
        return this.placementScopeInvalidator;
    }

    /* renamed from: z, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.d getPrefetchState() {
        return this.prefetchState;
    }

    public /* synthetic */ C15512I(int i10, int i11, InterfaceC15504A interfaceC15504A, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? C15505B.b(0, 1, null) : interfaceC15504A);
    }

    public C15512I(int i10, int i11) {
        this(i10, i11, C15505B.b(0, 1, null));
    }
}
