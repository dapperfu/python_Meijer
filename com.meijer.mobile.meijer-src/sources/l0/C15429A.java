package l0;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.d;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.snapshots.g;
import androidx.compose.runtime.t1;
import androidx.compose.ui.layout.h0;
import androidx.compose.ui.layout.i0;
import i0.C14592e;
import java.util.List;
import kotlin.C13901I;
import kotlin.C15847F;
import kotlin.C15848G;
import kotlin.C15851J;
import kotlin.C15860T;
import kotlin.C15870c;
import kotlin.C15876i;
import kotlin.InterfaceC13897E;
import kotlin.InterfaceC13900H;
import kotlin.InterfaceC15850I;
import kotlin.InterfaceC15859S;
import kotlin.Metadata;
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
import kotlin.ranges.IntRange;

@Metadata(d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u0095\u00012\u00020\u0001:\u0001:B'\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001d\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0013\u001a\u00020\u000e2\b\b\u0001\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018JA\u0010!\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192'\u0010 \u001a#\b\u0001\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001b¢\u0006\u0002\b\u001fH\u0096@¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\n2\u0006\u0010%\u001a\u00020\nH\u0000¢\u0006\u0004\b&\u0010$J$\u0010'\u001a\u00020\u000e2\b\b\u0001\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b'\u0010\u0014J)\u0010,\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u00152\b\b\u0002\u0010+\u001a\u00020\u0015H\u0000¢\u0006\u0004\b,\u0010-J\u001f\u00101\u001a\u00020\u00022\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\u0002H\u0000¢\u0006\u0004\b1\u00102R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u00103R$\u00109\u001a\u00020\u00152\u0006\u00104\u001a\u00020\u00158\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R(\u0010>\u001a\u0004\u0018\u00010(2\b\u00104\u001a\u0004\u0018\u00010(8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020(0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001a\u0010K\u001a\u00020G8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010H\u001a\u0004\bI\u0010JR$\u0010O\u001a\u00020\n2\u0006\u00104\u001a\u00020\n8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bM\u0010NR\u0014\u0010R\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR$\u0010V\u001a\u00020\u00022\u0006\u00104\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bS\u0010\u0013\u001a\u0004\bT\u0010UR\"\u0010[\u001a\u00020\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bW\u00106\u001a\u0004\bX\u00108\"\u0004\bY\u0010ZR(\u0010`\u001a\u0004\u0018\u00010\\2\b\u00104\u001a\u0004\u0018\u00010\\8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b'\u0010]\u001a\u0004\b^\u0010_R\u001a\u0010f\u001a\u00020a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR\u001a\u0010k\u001a\u00020g8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010h\u001a\u0004\bi\u0010jR \u0010r\u001a\b\u0012\u0004\u0012\u00020m0l8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010qR\u001a\u0010w\u001a\u00020s8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b<\u0010t\u001a\u0004\bu\u0010vR\u001a\u0010|\u001a\u00020x8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bi\u0010y\u001a\u0004\bz\u0010{R\u0014\u0010\u007f\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010~R \u0010\u0085\u0001\u001a\u00030\u0080\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R%\u0010\u008a\u0001\u001a\u00030\u0086\u00018\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000f\n\u0005\b\u0087\u0001\u0010E\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R.\u0010\u008d\u0001\u001a\u00020\u00152\u0006\u00104\u001a\u00020\u00158V@RX\u0096\u008e\u0002¢\u0006\u0014\n\u0005\b\u008b\u0001\u0010E\u001a\u0004\bD\u00108\"\u0005\b\u008c\u0001\u0010ZR-\u0010\u008f\u0001\u001a\u00020\u00152\u0006\u00104\u001a\u00020\u00158V@RX\u0096\u008e\u0002¢\u0006\u0013\n\u0004\b7\u0010E\u001a\u0004\b@\u00108\"\u0005\b\u008e\u0001\u0010ZR$\u0010\u0091\u0001\u001a\u00030\u0086\u00018\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0004\bI\u0010E\u001a\u0006\b\u0090\u0001\u0010\u0089\u0001R\u0017\u0010\u0094\u0001\u001a\u00030\u0092\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bp\u0010\u0093\u0001R\u0012\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b\u0087\u0001\u0010UR\u0012\u0010\u0004\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b\u008b\u0001\u0010UR\u0013\u0010\r\u001a\u00020\f8F¢\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0018\u0010\u0099\u0001\u001a\u00030\u0097\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0098\u0001R!\u0010\u009f\u0001\u001a\u00030\u009a\u00018@X\u0080\u0084\u0002¢\u0006\u0010\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001*\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0015\u0010 \u0001\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00108R\u0016\u0010¢\u0001\u001a\u00020\n8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b¡\u0001\u0010N\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006£\u0001"}, d2 = {"Ll0/A;", "Lf0/H;", "", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "Ll0/u;", "prefetchStrategy", "<init>", "(IILl0/u;)V", "(II)V", "", "delta", "Ll0/n;", "layoutInfo", "", "G", "(FLl0/n;)V", "index", "scrollOffset", "I", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "forceRemeasure", "M", "(IIZ)V", "Ld0/E;", "scrollPriority", "Lkotlin/Function2;", "Lf0/E;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "a", "(Ld0/E;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "f", "(F)F", "distance", "H", "k", "Ll0/q;", "result", "isLookingAhead", "visibleItemsStayedTheSame", "m", "(Ll0/q;ZZ)V", "Ll0/j;", "itemProvider", "firstItemIndex", "N", "(Ll0/j;I)I", "Ll0/u;", "<set-?>", "b", "Z", "u", "()Z", "hasLookaheadOccurred", "c", "Ll0/q;", "o", "()Ll0/q;", "approachLayoutInfo", "Ll0/x;", "d", "Ll0/x;", "scrollPosition", "Landroidx/compose/runtime/l0;", "e", "Landroidx/compose/runtime/l0;", "layoutInfoState", "Lh0/l;", "Lh0/l;", "v", "()Lh0/l;", "internalInteractionSource", "g", "F", "()F", "scrollToBeConsumed", "h", "Lf0/H;", "scrollableState", "i", "getNumMeasurePasses$foundation_release", "()I", "numMeasurePasses", "j", "getPrefetchingEnabled$foundation_release", "setPrefetchingEnabled$foundation_release", "(Z)V", "prefetchingEnabled", "Landroidx/compose/ui/layout/h0;", "Landroidx/compose/ui/layout/h0;", "getRemeasurement$foundation_release", "()Landroidx/compose/ui/layout/h0;", "remeasurement", "Landroidx/compose/ui/layout/i0;", "l", "Landroidx/compose/ui/layout/i0;", "D", "()Landroidx/compose/ui/layout/i0;", "remeasurementModifier", "Ln0/c;", "Ln0/c;", "p", "()Ln0/c;", "awaitLayoutModifier", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "Ll0/r;", "n", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "w", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "itemAnimator", "Ln0/i;", "Ln0/i;", "q", "()Ln0/i;", "beyondBoundsInfo", "Landroidx/compose/foundation/lazy/layout/d;", "Landroidx/compose/foundation/lazy/layout/d;", "C", "()Landroidx/compose/foundation/lazy/layout/d;", "prefetchState", "Ll0/t;", "Ll0/t;", "prefetchScope", "Ln0/F;", "r", "Ln0/F;", "A", "()Ln0/F;", "pinnedItems", "Ln0/T;", "s", "y", "()Landroidx/compose/runtime/l0;", "measurementScopeInvalidator", "t", "L", "canScrollForward", "K", "canScrollBackward", "B", "placementScopeInvalidator", "Ln0/G;", "Ln0/G;", "_lazyLayoutScrollDeltaBetweenPasses", "x", "()Ll0/n;", "LH1/d;", "()LH1/d;", "density", "Lkotlin/ranges/IntRange;", "z", "()Lkotlin/ranges/IntRange;", "getNearestRange$foundation_release$delegate", "(Ll0/A;)Ljava/lang/Object;", "nearestRange", "isScrollInProgress", "E", "scrollDeltaBetweenPasses", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: l0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15429A implements InterfaceC13900H {

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: y, reason: collision with root package name */
    private static final L0.k<C15429A, ?> f148939y = L0.a.a(a.f148963f, b.f148964f);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u prefetchStrategy;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean hasLookaheadOccurred;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private q approachLayoutInfo;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final x scrollPosition;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<q> layoutInfoState;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final h0.l internalInteractionSource;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private float scrollToBeConsumed;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC13900H scrollableState;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int numMeasurePasses;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean prefetchingEnabled;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private h0 remeasurement;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final i0 remeasurementModifier;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final C15870c awaitLayoutModifier;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final LazyLayoutItemAnimator<r> itemAnimator;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final C15876i beyondBoundsInfo;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.foundation.lazy.layout.d prefetchState;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final t prefetchScope;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final C15847F pinnedItems;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<Unit> measurementScopeInvalidator;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0 canScrollForward;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0 canScrollBackward;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<Unit> placementScopeInvalidator;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final C15848G _lazyLayoutScrollDeltaBetweenPasses;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "it", "Ll0/A;", "a", "(Ljava/util/List;)Ll0/A;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: l0.A$b */
    static final class b extends Lambda implements Function1<List<? extends Integer>, C15429A> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f148964f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C15429A invoke(List<Integer> list) {
            return new C15429A(list.get(0).intValue(), list.get(1).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ll0/A$c;", "", "<init>", "()V", "LL0/k;", "Ll0/A;", "Saver", "LL0/k;", "a", "()LL0/k;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: l0.A$c, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final L0.k<C15429A, ?> a() {
            return C15429A.f148939y;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lf0/E;", "", "<anonymous>", "(Lf0/E;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.lazy.LazyListState$animateScrollToItem$2", f = "LazyListState.kt", l = {481}, m = "invokeSuspend")
    /* renamed from: l0.A$d */
    static final class d extends SuspendLambda implements Function2<InterfaceC13897E, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f148965a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f148966b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f148968d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f148969e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i10, int i11, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f148968d = i10;
            this.f148969e = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = C15429A.this.new d(this.f148968d, this.f148969e, continuation);
            dVar.f148966b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC13897E interfaceC13897E, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC13897E, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f148965a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC15850I interfaceC15850IA = y.a(C15429A.this, (InterfaceC13897E) this.f148966b);
                int i11 = this.f148968d;
                int i12 = this.f148969e;
                H1.d dVarR = C15429A.this.r();
                this.f148965a = 1;
                if (C15851J.b(interfaceC15850IA, i11, i12, 100, dVarR, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"l0/A$e", "Ll0/t;", "", "index", "Landroidx/compose/foundation/lazy/layout/d$b;", "a", "(I)Landroidx/compose/foundation/lazy/layout/d$b;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: l0.A$e */
    public static final class e implements t {
        e() {
        }

        @Override // l0.t
        public d.b a(int index) {
            g.Companion companion = androidx.compose.runtime.snapshots.g.INSTANCE;
            C15429A c15429a = C15429A.this;
            androidx.compose.runtime.snapshots.g gVarD = companion.d();
            Function1<Object, Unit> function1G = gVarD != null ? gVarD.g() : null;
            androidx.compose.runtime.snapshots.g gVarE = companion.e(gVarD);
            try {
                long jL = ((q) c15429a.layoutInfoState.getValue()).getChildConstraints();
                companion.l(gVarD, gVarE, function1G);
                return C15429A.this.getPrefetchState().e(index, jL);
            } catch (Throwable th2) {
                companion.l(gVarD, gVarE, function1G);
                throw th2;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln0/S;", "", "a", "(Ln0/S;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: l0.A$f */
    static final class f extends Lambda implements Function1<InterfaceC15859S, Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f148972g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(int i10) {
            super(1);
            this.f148972g = i10;
        }

        public final void a(InterfaceC15859S interfaceC15859S) {
            u uVar = C15429A.this.prefetchStrategy;
            int i10 = this.f148972g;
            g.Companion companion = androidx.compose.runtime.snapshots.g.INSTANCE;
            androidx.compose.runtime.snapshots.g gVarD = companion.d();
            companion.l(gVarD, companion.e(gVarD), gVarD != null ? gVarD.g() : null);
            uVar.a(interfaceC15859S, i10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15859S interfaceC15859S) {
            a(interfaceC15859S);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"l0/A$g", "Landroidx/compose/ui/layout/i0;", "Landroidx/compose/ui/layout/h0;", "remeasurement", "", "o", "(Landroidx/compose/ui/layout/h0;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: l0.A$g */
    public static final class g implements i0 {
        g() {
        }

        @Override // androidx.compose.ui.layout.i0
        public void o(h0 remeasurement) {
            C15429A.this.remeasurement = remeasurement;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.lazy.LazyListState", f = "LazyListState.kt", l = {365, 366}, m = "scroll")
    /* renamed from: l0.A$h */
    static final class h extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f148974a;

        /* renamed from: b, reason: collision with root package name */
        Object f148975b;

        /* renamed from: c, reason: collision with root package name */
        Object f148976c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f148977d;

        /* renamed from: f, reason: collision with root package name */
        int f148979f;

        h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f148977d = obj;
            this.f148979f |= Integer.MIN_VALUE;
            return C15429A.this.a(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lf0/E;", "", "<anonymous>", "(Lf0/E;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.lazy.LazyListState$scrollToItem$2", f = "LazyListState.kt", l = {}, m = "invokeSuspend")
    /* renamed from: l0.A$i */
    static final class i extends SuspendLambda implements Function2<InterfaceC13897E, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f148980a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f148982c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f148983d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(int i10, int i11, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f148982c = i10;
            this.f148983d = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C15429A.this.new i(this.f148982c, this.f148983d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC13897E interfaceC13897E, Continuation<? super Unit> continuation) {
            return ((i) create(interfaceC13897E, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f148980a == 0) {
                ResultKt.b(obj);
                C15429A.this.M(this.f148982c, this.f148983d, true);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "b", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: l0.A$j */
    static final class j extends Lambda implements Function1<Float, Float> {
        j() {
            super(1);
        }

        public final Float b(float f10) {
            return Float.valueOf(-C15429A.this.H(-f10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Float invoke(Float f10) {
            return b(f10.floatValue());
        }
    }

    public C15429A() {
        this(0, 0, null, 7, null);
    }

    public final float H(float distance) {
        q qVar;
        if ((distance < 0.0f && !e()) || (distance > 0.0f && !d())) {
            return 0.0f;
        }
        if (!(Math.abs(this.scrollToBeConsumed) <= 0.5f)) {
            C14592e.c("entered drag with non-zero pending scroll");
        }
        float f10 = this.scrollToBeConsumed + distance;
        this.scrollToBeConsumed = f10;
        if (Math.abs(f10) > 0.5f) {
            float f11 = this.scrollToBeConsumed;
            int iRound = Math.round(f11);
            q qVarI = this.layoutInfoState.getValue().i(iRound, !this.hasLookaheadOccurred);
            if (qVarI != null && (qVar = this.approachLayoutInfo) != null) {
                q qVarI2 = qVar != null ? qVar.i(iRound, true) : null;
                if (qVarI2 != null) {
                    this.approachLayoutInfo = qVarI2;
                } else {
                    qVarI = null;
                }
            }
            if (qVarI != null) {
                m(qVarI, this.hasLookaheadOccurred, true);
                C15860T.d(this.placementScopeInvalidator);
                G(f11 - this.scrollToBeConsumed, qVarI);
            } else {
                h0 h0Var = this.remeasurement;
                if (h0Var != null) {
                    h0Var.c();
                }
                G(f11 - this.scrollToBeConsumed, x());
            }
        }
        if (Math.abs(this.scrollToBeConsumed) <= 0.5f) {
            return distance;
        }
        float f12 = distance - this.scrollToBeConsumed;
        this.scrollToBeConsumed = 0.0f;
        return f12;
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LL0/m;", "Ll0/A;", "it", "", "", "a", "(LL0/m;Ll0/A;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: l0.A$a */
    static final class a extends Lambda implements Function2<L0.m, C15429A, List<? extends Integer>> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f148963f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<Integer> invoke(L0.m mVar, C15429A c15429a) {
            return CollectionsKt.p(Integer.valueOf(c15429a.s()), Integer.valueOf(c15429a.t()));
        }
    }

    public C15429A(int i10, int i11, u uVar) {
        this.prefetchStrategy = uVar;
        x xVar = new x(i10, i11);
        this.scrollPosition = xVar;
        this.layoutInfoState = o1.i(C15430B.f148985a, o1.k());
        this.internalInteractionSource = h0.k.a();
        this.scrollableState = C13901I.a(new j());
        this.prefetchingEnabled = true;
        this.remeasurementModifier = new g();
        this.awaitLayoutModifier = new C15870c();
        this.itemAnimator = new LazyLayoutItemAnimator<>();
        this.beyondBoundsInfo = new C15876i();
        this.prefetchState = new androidx.compose.foundation.lazy.layout.d(uVar.b(), new f(i10));
        this.prefetchScope = new e();
        this.pinnedItems = new C15847F();
        xVar.getNearestRangeState();
        this.measurementScopeInvalidator = C15860T.c(null, 1, null);
        Boolean bool = Boolean.FALSE;
        this.canScrollForward = t1.e(bool, null, 2, null);
        this.canScrollBackward = t1.e(bool, null, 2, null);
        this.placementScopeInvalidator = C15860T.c(null, 1, null);
        this._lazyLayoutScrollDeltaBetweenPasses = new C15848G();
    }

    private final void G(float delta, n layoutInfo) {
        if (this.prefetchingEnabled) {
            this.prefetchStrategy.d(this.prefetchScope, delta, layoutInfo);
        }
    }

    public static /* synthetic */ Object J(C15429A c15429a, int i10, int i11, Continuation continuation, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return c15429a.I(i10, i11, continuation);
    }

    private void K(boolean z10) {
        this.canScrollBackward.setValue(Boolean.valueOf(z10));
    }

    private void L(boolean z10) {
        this.canScrollForward.setValue(Boolean.valueOf(z10));
    }

    public static /* synthetic */ Object l(C15429A c15429a, int i10, int i11, Continuation continuation, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return c15429a.k(i10, i11, continuation);
    }

    public static /* synthetic */ void n(C15429A c15429a, q qVar, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        c15429a.m(qVar, z10, z11);
    }

    /* renamed from: A, reason: from getter */
    public final C15847F getPinnedItems() {
        return this.pinnedItems;
    }

    public final InterfaceC5872l0<Unit> B() {
        return this.placementScopeInvalidator;
    }

    /* renamed from: C, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.d getPrefetchState() {
        return this.prefetchState;
    }

    /* renamed from: D, reason: from getter */
    public final i0 getRemeasurementModifier() {
        return this.remeasurementModifier;
    }

    public final float E() {
        return this._lazyLayoutScrollDeltaBetweenPasses.b();
    }

    /* renamed from: F, reason: from getter */
    public final float getScrollToBeConsumed() {
        return this.scrollToBeConsumed;
    }

    public final Object I(int i10, int i11, Continuation<? super Unit> continuation) {
        Object objC = InterfaceC13900H.c(this, null, new i(i10, i11, null), continuation, 1, null);
        return objC == IntrinsicsKt.f() ? objC : Unit.f143329a;
    }

    public final void M(int index, int scrollOffset, boolean forceRemeasure) {
        if (this.scrollPosition.a() != index || this.scrollPosition.c() != scrollOffset) {
            this.itemAnimator.p();
        }
        this.scrollPosition.d(index, scrollOffset);
        if (!forceRemeasure) {
            C15860T.d(this.measurementScopeInvalidator);
            return;
        }
        h0 h0Var = this.remeasurement;
        if (h0Var != null) {
            h0Var.c();
        }
    }

    public final int N(InterfaceC15440j itemProvider, int firstItemIndex) {
        return this.scrollPosition.j(itemProvider, firstItemIndex);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        if (r8.a(r6, r7, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlin.InterfaceC13900H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(d0.EnumC13564E r6, kotlin.jvm.functions.Function2<? super kotlin.InterfaceC13897E, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof l0.C15429A.h
            if (r0 == 0) goto L13
            r0 = r8
            l0.A$h r0 = (l0.C15429A.h) r0
            int r1 = r0.f148979f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f148979f = r1
            goto L18
        L13:
            l0.A$h r0 = new l0.A$h
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f148977d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f148979f
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
            java.lang.Object r6 = r0.f148976c
            r7 = r6
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            java.lang.Object r6 = r0.f148975b
            d0.E r6 = (d0.EnumC13564E) r6
            java.lang.Object r2 = r0.f148974a
            l0.A r2 = (l0.C15429A) r2
            kotlin.ResultKt.b(r8)
            goto L5a
        L45:
            kotlin.ResultKt.b(r8)
            n0.c r8 = r5.awaitLayoutModifier
            r0.f148974a = r5
            r0.f148975b = r6
            r0.f148976c = r7
            r0.f148979f = r4
            java.lang.Object r8 = r8.e(r0)
            if (r8 != r1) goto L59
            goto L6b
        L59:
            r2 = r5
        L5a:
            f0.H r8 = r2.scrollableState
            r2 = 0
            r0.f148974a = r2
            r0.f148975b = r2
            r0.f148976c = r2
            r0.f148979f = r3
            java.lang.Object r6 = r8.a(r6, r7, r0)
            if (r6 != r1) goto L6c
        L6b:
            return r1
        L6c:
            kotlin.Unit r6 = kotlin.Unit.f143329a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.C15429A.a(d0.E, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlin.InterfaceC13900H
    public boolean b() {
        return this.scrollableState.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.InterfaceC13900H
    public boolean d() {
        return ((Boolean) this.canScrollBackward.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.InterfaceC13900H
    public boolean e() {
        return ((Boolean) this.canScrollForward.getValue()).booleanValue();
    }

    @Override // kotlin.InterfaceC13900H
    public float f(float delta) {
        return this.scrollableState.f(delta);
    }

    public final Object k(int i10, int i11, Continuation<? super Unit> continuation) {
        Object objC = InterfaceC13900H.c(this, null, new d(i10, i11, null), continuation, 1, null);
        return objC == IntrinsicsKt.f() ? objC : Unit.f143329a;
    }

    public final void m(q result, boolean isLookingAhead, boolean visibleItemsStayedTheSame) {
        if (!isLookingAhead && this.hasLookaheadOccurred) {
            this.approachLayoutInfo = result;
            return;
        }
        if (isLookingAhead) {
            this.hasLookaheadOccurred = true;
        }
        K(result.j());
        L(result.getCanScrollForward());
        this.scrollToBeConsumed -= result.getConsumedScroll();
        this.layoutInfoState.setValue(result);
        if (visibleItemsStayedTheSame) {
            this.scrollPosition.i(result.getFirstVisibleItemScrollOffset());
        } else {
            this.scrollPosition.h(result);
            if (this.prefetchingEnabled) {
                this.prefetchStrategy.c(this.prefetchScope, result);
            }
        }
        if (isLookingAhead) {
            this._lazyLayoutScrollDeltaBetweenPasses.c(result.getScrollBackAmount(), result.getDensity(), result.getCoroutineScope());
        }
        this.numMeasurePasses++;
    }

    /* renamed from: o, reason: from getter */
    public final q getApproachLayoutInfo() {
        return this.approachLayoutInfo;
    }

    /* renamed from: p, reason: from getter */
    public final C15870c getAwaitLayoutModifier() {
        return this.awaitLayoutModifier;
    }

    /* renamed from: q, reason: from getter */
    public final C15876i getBeyondBoundsInfo() {
        return this.beyondBoundsInfo;
    }

    public final H1.d r() {
        return this.layoutInfoState.getValue().getDensity();
    }

    public final int s() {
        return this.scrollPosition.a();
    }

    public final int t() {
        return this.scrollPosition.c();
    }

    /* renamed from: u, reason: from getter */
    public final boolean getHasLookaheadOccurred() {
        return this.hasLookaheadOccurred;
    }

    /* renamed from: v, reason: from getter */
    public final h0.l getInternalInteractionSource() {
        return this.internalInteractionSource;
    }

    public final LazyLayoutItemAnimator<r> w() {
        return this.itemAnimator;
    }

    public final n x() {
        return this.layoutInfoState.getValue();
    }

    public final InterfaceC5872l0<Unit> y() {
        return this.measurementScopeInvalidator;
    }

    public final IntRange z() {
        return this.scrollPosition.getNearestRangeState().getValue();
    }

    public /* synthetic */ C15429A(int i10, int i11, u uVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? v.b(0, 1, null) : uVar);
    }

    public /* synthetic */ C15429A(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11);
    }

    public C15429A(int i10, int i11) {
        this(i10, i11, v.b(0, 1, null));
    }
}
