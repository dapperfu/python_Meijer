package androidx.compose.ui.layout;

import androidx.compose.runtime.AbstractC5869k;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5861g;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.Q0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.g;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.layout.q0;
import androidx.compose.ui.layout.s0;
import androidx.compose.ui.node.A0;
import androidx.compose.ui.node.B0;
import androidx.compose.ui.node.C0;
import androidx.compose.ui.node.C5946c0;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.E1;
import j1.C14920a;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0003M:VB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000e\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J?\u0010\u001c\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\"\u001a\u0004\u0018\u00010\t2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u0017H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\fH\u0002¢\u0006\u0004\b'\u0010(J\u0013\u0010)\u001a\u00020\f*\u00020\u0002H\u0002¢\u0006\u0004\b)\u0010*J\u001b\u0010+\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\fH\u0002¢\u0006\u0004\b-\u0010(J\u0017\u0010.\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b.\u0010/J)\u00103\u001a\u00020\f2\u0006\u00100\u001a\u00020 2\u0006\u00101\u001a\u00020 2\b\b\u0002\u00102\u001a\u00020 H\u0002¢\u0006\u0004\b3\u00104J-\u00106\u001a\b\u0012\u0004\u0012\u0002050\u001e2\b\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\fH\u0016¢\u0006\u0004\b8\u0010(J\u000f\u00109\u001a\u00020\fH\u0016¢\u0006\u0004\b9\u0010(J\u000f\u0010:\u001a\u00020\fH\u0016¢\u0006\u0004\b:\u0010(J+\u0010;\u001a\b\u0012\u0004\u0012\u0002050\u001e2\b\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b;\u00107J\u0015\u0010=\u001a\u00020\f2\u0006\u0010<\u001a\u00020 ¢\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020\f¢\u0006\u0004\b?\u0010(J,\u0010G\u001a\u00020F2\u001d\u0010E\u001a\u0019\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020C0@¢\u0006\u0002\bD¢\u0006\u0004\bG\u0010HJ%\u0010J\u001a\u00020I2\b\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\bJ\u0010KJ\r\u0010L\u001a\u00020\f¢\u0006\u0004\bL\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR$\u0010T\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR*\u0010\u0005\u001a\u00020\u00042\u0006\u0010U\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u0016\u0010]\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010ZR\u0016\u0010_\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010ZR \u0010c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\"\u0010e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010bR\u0018\u0010h\u001a\u00060fR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010gR\u0018\u0010l\u001a\u00060iR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\"\u0010n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010bR\u0014\u0010r\u001a\u00020o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\"\u0010s\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020I0`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010bR\u001c\u0010w\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0016\u0010y\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010ZR\u0016\u0010{\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010ZR\u0014\u0010\u007f\u001a\u00020|8\u0002X\u0082D¢\u0006\u0006\n\u0004\b}\u0010~¨\u0006\u0080\u0001"}, d2 = {"Landroidx/compose/ui/layout/E;", "Landroidx/compose/runtime/g;", "Landroidx/compose/ui/node/LayoutNode;", "root", "Landroidx/compose/ui/layout/s0;", "slotReusePolicy", "<init>", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/layout/s0;)V", "node", "", "slotId", "Lkotlin/Function0;", "", "content", "L", "(Landroidx/compose/ui/node/LayoutNode;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "Landroidx/compose/ui/layout/E$b;", "nodeState", "K", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/layout/E$b;)V", "Landroidx/compose/runtime/Q0;", "existing", "container", "", "reuseContent", "Landroidx/compose/runtime/k;", "parent", "composable", "M", "(Landroidx/compose/runtime/Q0;Landroidx/compose/ui/node/LayoutNode;ZLandroidx/compose/runtime/k;Lkotlin/jvm/functions/Function2;)Landroidx/compose/runtime/Q0;", "", "foldedChildren", "", "index", "A", "(Ljava/util/List;I)Ljava/lang/Object;", "deactivate", "C", "(Z)V", "w", "()V", "G", "(Landroidx/compose/ui/node/LayoutNode;)V", "N", "(Ljava/lang/Object;)Landroidx/compose/ui/node/LayoutNode;", "y", "v", "(I)Landroidx/compose/ui/node/LayoutNode;", "from", "to", "count", "D", "(III)V", "Landroidx/compose/ui/layout/I;", "t", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "l", "h", "b", "J", "startIndex", "x", "(I)V", "B", "Lkotlin/Function2;", "Landroidx/compose/ui/layout/r0;", "LH1/b;", "Landroidx/compose/ui/layout/J;", "Lkotlin/ExtensionFunctionType;", "block", "Landroidx/compose/ui/layout/MeasurePolicy;", "u", "(Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/layout/MeasurePolicy;", "Landroidx/compose/ui/layout/q0$a;", "F", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/layout/q0$a;", "z", "a", "Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/runtime/k;", "getCompositionContext", "()Landroidx/compose/runtime/k;", "H", "(Landroidx/compose/runtime/k;)V", "compositionContext", "value", "c", "Landroidx/compose/ui/layout/s0;", "getSlotReusePolicy", "()Landroidx/compose/ui/layout/s0;", "I", "(Landroidx/compose/ui/layout/s0;)V", "d", "currentIndex", "e", "currentApproachIndex", "LZ/W;", "f", "LZ/W;", "nodeToNodeState", "g", "slotIdToNode", "Landroidx/compose/ui/layout/E$c;", "Landroidx/compose/ui/layout/E$c;", "scope", "Landroidx/compose/ui/layout/E$a;", "i", "Landroidx/compose/ui/layout/E$a;", "approachMeasureScope", "j", "precomposeMap", "Landroidx/compose/ui/layout/s0$a;", "k", "Landroidx/compose/ui/layout/s0$a;", "reusableSlotIdsSet", "approachPrecomposeSlotHandleMap", "LD0/c;", "m", "LD0/c;", "approachComposedSlotIds", "n", "reusableCount", "o", "precomposedCount", "", "p", "Ljava/lang/String;", "NoIntrinsicsMessage", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class E implements InterfaceC5861g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final LayoutNode root;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private AbstractC5869k compositionContext;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private s0 slotReusePolicy;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int currentIndex;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int currentApproachIndex;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int reusableCount;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private int precomposedCount;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Z.W<LayoutNode, b> nodeToNodeState = Z.i0.c();

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Z.W<Object, LayoutNode> slotIdToNode = Z.i0.c();

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final c scope = new c();

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final a approachMeasureScope = new a();

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Z.W<Object, LayoutNode> precomposeMap = Z.i0.c();

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final s0.a reusableSlotIdsSet = new s0.a(null, 1, null);

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Z.W<Object, q0.a> approachPrecomposeSlotHandleMap = Z.i0.c();

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final D0.c<Object> approachComposedSlotIds = new D0.c<>(new Object[16], 0);

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final String NoIntrinsicsMessage = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";

    @Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004Jl\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b2\u001b\b\u0002\u0010\u000f\u001a\u0015\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0002\b\u000e2\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014JO\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b2\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u0005*\u00020\u0017H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u0005*\u00020\u001aH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u0017*\u00020\u001aH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u0017*\u00020\u001fH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u001a\u0010\"\u001a\u00020\u0017*\u00020\u0005H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020%*\u00020$H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u001f*\u00020\u0017H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010!J\u0017\u0010)\u001a\u00020\u001f*\u00020\u001aH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010\u001eJ\u0017\u0010*\u001a\u00020$*\u00020%H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b*\u0010'J\u0017\u0010+\u001a\u00020\u001a*\u00020\u0017H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u001a\u0010-\u001a\u00020\u001a*\u00020\u001fH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b-\u0010,J\u001a\u0010.\u001a\u00020\u001a*\u00020\u0005H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b.\u0010/J-\u00106\u001a\b\u0012\u0004\u0012\u000205042\b\u00101\u001a\u0004\u0018\u0001002\f\u00103\u001a\b\u0012\u0004\u0012\u00020\r02H\u0016¢\u0006\u0004\b6\u00107R\u0014\u0010:\u001a\u00020\u001f8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010<\u001a\u00020\u001f8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b;\u00109R\u0014\u0010@\u001a\u00020=8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0014\u0010D\u001a\u00020A8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bB\u0010C\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006E"}, d2 = {"Landroidx/compose/ui/layout/E$a;", "Landroidx/compose/ui/layout/r0;", "Landroidx/compose/ui/layout/K;", "<init>", "(Landroidx/compose/ui/layout/E;)V", "", "width", "height", "", "Landroidx/compose/ui/layout/a;", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/l0;", "", "Lkotlin/ExtensionFunctionType;", "rulers", "Landroidx/compose/ui/layout/f0$a;", "placementBlock", "Landroidx/compose/ui/layout/J;", "O1", "(IILjava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/J;", "g1", "(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/J;", "LH1/h;", "E0", "(F)I", "LH1/v;", "N1", "(J)I", "t", "(J)F", "", "L", "(F)F", "K", "(I)F", "LU0/k;", "LH1/k;", "p", "(J)J", "I1", "N0", "T", "o", "(F)J", "x", "w", "(I)J", "", "slotId", "Lkotlin/Function0;", "content", "", "Landroidx/compose/ui/layout/I;", "Z", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "getDensity", "()F", "density", "F1", "fontScale", "", "v0", "()Z", "isLookingAhead", "LH1/t;", "getLayoutDirection", "()LH1/t;", "layoutDirection", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private final class a implements r0, K {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ c f51209a;

        @Override // H1.d
        public int E0(float f10) {
            return this.f51209a.E0(f10);
        }

        @Override // H1.l
        /* renamed from: F1 */
        public float getFontScale() {
            return this.f51209a.getFontScale();
        }

        @Override // H1.d
        public float I1(float f10) {
            return this.f51209a.I1(f10);
        }

        @Override // H1.d
        public float K(int i10) {
            return this.f51209a.K(i10);
        }

        @Override // H1.d
        public float L(float f10) {
            return this.f51209a.L(f10);
        }

        @Override // H1.d
        public float N0(long j10) {
            return this.f51209a.N0(j10);
        }

        @Override // H1.d
        public int N1(long j10) {
            return this.f51209a.N1(j10);
        }

        @Override // androidx.compose.ui.layout.K
        public J O1(int width, int height, Map<AbstractC5916a, Integer> alignmentLines, Function1<? super l0, Unit> rulers, Function1<? super f0.a, Unit> placementBlock) {
            return this.f51209a.O1(width, height, alignmentLines, rulers, placementBlock);
        }

        @Override // H1.d
        public long T(long j10) {
            return this.f51209a.T(j10);
        }

        @Override // androidx.compose.ui.layout.K
        public J g1(int width, int height, Map<AbstractC5916a, Integer> alignmentLines, Function1<? super f0.a, Unit> placementBlock) {
            return this.f51209a.g1(width, height, alignmentLines, placementBlock);
        }

        @Override // H1.d
        public float getDensity() {
            return this.f51209a.getDensity();
        }

        @Override // H1.l
        public long o(float f10) {
            return this.f51209a.o(f10);
        }

        @Override // H1.d
        public long p(long j10) {
            return this.f51209a.p(j10);
        }

        @Override // H1.l
        public float t(long j10) {
            return this.f51209a.t(j10);
        }

        @Override // androidx.compose.ui.layout.InterfaceC5933s
        public boolean v0() {
            return this.f51209a.v0();
        }

        @Override // H1.d
        public long w(int i10) {
            return this.f51209a.w(i10);
        }

        @Override // H1.d
        public long x(float f10) {
            return this.f51209a.x(f10);
        }

        public a() {
            this.f51209a = E.this.scope;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.compose.ui.layout.r0
        public List<I> Z(Object slotId, Function2<? super Composer, ? super Integer, Unit> content) {
            LayoutNode layoutNode = (LayoutNode) E.this.slotIdToNode.e(slotId);
            return (layoutNode == null || E.this.root.M().indexOf(layoutNode) >= E.this.currentIndex) ? E.this.t(slotId, content) : layoutNode.H();
        }

        @Override // androidx.compose.ui.layout.InterfaceC5933s
        public H1.t getLayoutDirection() {
            return this.f51209a.getLayoutDirection();
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR$\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0016\u001a\u0004\b\u0010\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010 \u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010#\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001c\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR(\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001a0$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010-\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u001d\"\u0004\b,\u0010\u001f¨\u0006."}, d2 = {"Landroidx/compose/ui/layout/E$b;", "", "slotId", "Lkotlin/Function0;", "", "content", "Landroidx/compose/runtime/Q0;", "composition", "<init>", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Q0;)V", "a", "Ljava/lang/Object;", "f", "()Ljava/lang/Object;", "m", "(Ljava/lang/Object;)V", "b", "Lkotlin/jvm/functions/Function2;", "c", "()Lkotlin/jvm/functions/Function2;", "j", "(Lkotlin/jvm/functions/Function2;)V", "Landroidx/compose/runtime/Q0;", "()Landroidx/compose/runtime/Q0;", "i", "(Landroidx/compose/runtime/Q0;)V", "", "d", "Z", "()Z", "k", "(Z)V", "forceRecompose", "e", "l", "forceReuse", "Landroidx/compose/runtime/l0;", "Landroidx/compose/runtime/l0;", "getActiveState", "()Landroidx/compose/runtime/l0;", "h", "(Landroidx/compose/runtime/l0;)V", "activeState", "value", "g", "active", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private Object slotId;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private Function2<? super Composer, ? super Integer, Unit> content;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private Q0 composition;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private boolean forceRecompose;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean forceReuse;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private InterfaceC5872l0<Boolean> activeState;

        public b(Object obj, Function2<? super Composer, ? super Integer, Unit> function2, Q0 q02) {
            this.slotId = obj;
            this.content = function2;
            this.composition = q02;
            this.activeState = t1.e(Boolean.TRUE, null, 2, null);
        }

        public final boolean a() {
            return this.activeState.getValue().booleanValue();
        }

        /* renamed from: b, reason: from getter */
        public final Q0 getComposition() {
            return this.composition;
        }

        public final Function2<Composer, Integer, Unit> c() {
            return this.content;
        }

        /* renamed from: d, reason: from getter */
        public final boolean getForceRecompose() {
            return this.forceRecompose;
        }

        /* renamed from: e, reason: from getter */
        public final boolean getForceReuse() {
            return this.forceReuse;
        }

        /* renamed from: f, reason: from getter */
        public final Object getSlotId() {
            return this.slotId;
        }

        public final void g(boolean z10) {
            this.activeState.setValue(Boolean.valueOf(z10));
        }

        public final void h(InterfaceC5872l0<Boolean> interfaceC5872l0) {
            this.activeState = interfaceC5872l0;
        }

        public final void i(Q0 q02) {
            this.composition = q02;
        }

        public final void j(Function2<? super Composer, ? super Integer, Unit> function2) {
            this.content = function2;
        }

        public final void k(boolean z10) {
            this.forceRecompose = z10;
        }

        public final void l(boolean z10) {
            this.forceReuse = z10;
        }

        public final void m(Object obj) {
            this.slotId = obj;
        }

        public /* synthetic */ b(Object obj, Function2 function2, Q0 q02, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, function2, (i10 & 4) != 0 ? null : q02);
        }
    }

    @Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJg\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0\u00102\u0019\u0010\u0016\u001a\u0015\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0013¢\u0006\u0002\b\u00152\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00070\u0013¢\u0006\u0002\b\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010#\u001a\u00020\u001c8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010*\u001a\u00020$8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b\u001d\u0010)R\"\u0010.\u001a\u00020$8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b+\u0010&\u001a\u0004\b,\u0010(\"\u0004\b-\u0010)R\u0014\u00102\u001a\u00020/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Landroidx/compose/ui/layout/E$c;", "Landroidx/compose/ui/layout/r0;", "<init>", "(Landroidx/compose/ui/layout/E;)V", "", "slotId", "Lkotlin/Function0;", "", "content", "", "Landroidx/compose/ui/layout/I;", "Z", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "", "width", "height", "", "Landroidx/compose/ui/layout/a;", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/l0;", "Lkotlin/ExtensionFunctionType;", "rulers", "Landroidx/compose/ui/layout/f0$a;", "placementBlock", "Landroidx/compose/ui/layout/J;", "O1", "(IILjava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/J;", "LH1/t;", "a", "LH1/t;", "getLayoutDirection", "()LH1/t;", "q", "(LH1/t;)V", "layoutDirection", "", "b", "F", "getDensity", "()F", "(F)V", "density", "c", "F1", "f", "fontScale", "", "v0", "()Z", "isLookingAhead", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    private final class c implements r0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private H1.t layoutDirection = H1.t.f13339b;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private float density;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private float fontScale;

        @Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR'\u0010\u0015\u001a\u0015\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010¢\u0006\u0002\b\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"androidx/compose/ui/layout/E$c$a", "Landroidx/compose/ui/layout/J;", "", "s", "()V", "", "getWidth", "()I", "width", "getHeight", "height", "", "Landroidx/compose/ui/layout/a;", "r", "()Ljava/util/Map;", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/l0;", "Lkotlin/ExtensionFunctionType;", "t", "()Lkotlin/jvm/functions/Function1;", "rulers", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements J {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f51221a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f51222b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Map<AbstractC5916a, Integer> f51223c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function1<l0, Unit> f51224d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ c f51225e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ E f51226f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function1<f0.a, Unit> f51227g;

            /* JADX WARN: Multi-variable type inference failed */
            a(int i10, int i11, Map<AbstractC5916a, Integer> map, Function1<? super l0, Unit> function1, c cVar, E e10, Function1<? super f0.a, Unit> function12) {
                this.f51221a = i10;
                this.f51222b = i11;
                this.f51223c = map;
                this.f51224d = function1;
                this.f51225e = cVar;
                this.f51226f = e10;
                this.f51227g = function12;
            }

            @Override // androidx.compose.ui.layout.J
            public int getHeight() {
                return this.f51222b;
            }

            @Override // androidx.compose.ui.layout.J
            public int getWidth() {
                return this.f51221a;
            }

            @Override // androidx.compose.ui.layout.J
            public Map<AbstractC5916a, Integer> r() {
                return this.f51223c;
            }

            @Override // androidx.compose.ui.layout.J
            public void s() {
                androidx.compose.ui.node.S lookaheadDelegate;
                if (!this.f51225e.v0() || (lookaheadDelegate = this.f51226f.root.P().getLookaheadDelegate()) == null) {
                    this.f51227g.invoke(this.f51226f.root.P().getPlacementScope());
                } else {
                    this.f51227g.invoke(lookaheadDelegate.getPlacementScope());
                }
            }

            @Override // androidx.compose.ui.layout.J
            public Function1<l0, Unit> t() {
                return this.f51224d;
            }
        }

        public c() {
        }

        @Override // H1.l
        /* renamed from: F1, reason: from getter */
        public float getFontScale() {
            return this.fontScale;
        }

        @Override // androidx.compose.ui.layout.K
        public J O1(int width, int height, Map<AbstractC5916a, Integer> alignmentLines, Function1<? super l0, Unit> rulers, Function1<? super f0.a, Unit> placementBlock) {
            if (!((width & (-16777216)) == 0 && ((-16777216) & height) == 0)) {
                C14920a.b("Size(" + width + " x " + height + ") is out of range. Each dimension must be between 0 and 16777215.");
            }
            return new a(width, height, alignmentLines, rulers, this, E.this, placementBlock);
        }

        @Override // androidx.compose.ui.layout.r0
        public List<I> Z(Object slotId, Function2<? super Composer, ? super Integer, Unit> content) {
            return E.this.J(slotId, content);
        }

        public void a(float f10) {
            this.density = f10;
        }

        public void f(float f10) {
            this.fontScale = f10;
        }

        @Override // H1.d
        public float getDensity() {
            return this.density;
        }

        @Override // androidx.compose.ui.layout.InterfaceC5933s
        public H1.t getLayoutDirection() {
            return this.layoutDirection;
        }

        public void q(H1.t tVar) {
            this.layoutDirection = tVar;
        }

        @Override // androidx.compose.ui.layout.InterfaceC5933s
        public boolean v0() {
            return E.this.root.X() == LayoutNode.e.f51468d || E.this.root.X() == LayoutNode.e.f51466b;
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\t\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"androidx/compose/ui/layout/E$d", "Landroidx/compose/ui/node/LayoutNode$f;", "Landroidx/compose/ui/layout/K;", "", "Landroidx/compose/ui/layout/I;", "measurables", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "d", "(Landroidx/compose/ui/layout/K;Ljava/util/List;J)Landroidx/compose/ui/layout/J;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class d extends LayoutNode.f {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<r0, H1.b, J> f51229c;

        @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR'\u0010\u0013\u001a\u0015\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e¢\u0006\u0002\b\u00108VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00078\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\f¨\u0006\u0016"}, d2 = {"androidx/compose/ui/layout/E$d$a", "Landroidx/compose/ui/layout/J;", "", "s", "()V", "", "Landroidx/compose/ui/layout/a;", "", "r", "()Ljava/util/Map;", "alignmentLines", "getHeight", "()I", "height", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/l0;", "Lkotlin/ExtensionFunctionType;", "t", "()Lkotlin/jvm/functions/Function1;", "rulers", "getWidth", "width", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension
        public static final class a implements J {

            /* renamed from: a, reason: collision with root package name */
            private final /* synthetic */ J f51230a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ E f51231b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f51232c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ J f51233d;

            @Override // androidx.compose.ui.layout.J
            public int getHeight() {
                return this.f51230a.getHeight();
            }

            @Override // androidx.compose.ui.layout.J
            public int getWidth() {
                return this.f51230a.getWidth();
            }

            @Override // androidx.compose.ui.layout.J
            public Map<AbstractC5916a, Integer> r() {
                return this.f51230a.r();
            }

            @Override // androidx.compose.ui.layout.J
            public Function1<l0, Unit> t() {
                return this.f51230a.t();
            }

            public a(J j10, E e10, int i10, J j11) {
                this.f51231b = e10;
                this.f51232c = i10;
                this.f51233d = j11;
                this.f51230a = j10;
            }

            @Override // androidx.compose.ui.layout.J
            public void s() {
                this.f51231b.currentApproachIndex = this.f51232c;
                this.f51233d.s();
                this.f51231b.y();
            }
        }

        @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR'\u0010\u0013\u001a\u0015\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e¢\u0006\u0002\b\u00108VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00078\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\f¨\u0006\u0016"}, d2 = {"androidx/compose/ui/layout/E$d$b", "Landroidx/compose/ui/layout/J;", "", "s", "()V", "", "Landroidx/compose/ui/layout/a;", "", "r", "()Ljava/util/Map;", "alignmentLines", "getHeight", "()I", "height", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/l0;", "Lkotlin/ExtensionFunctionType;", "t", "()Lkotlin/jvm/functions/Function1;", "rulers", "getWidth", "width", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension
        public static final class b implements J {

            /* renamed from: a, reason: collision with root package name */
            private final /* synthetic */ J f51234a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ E f51235b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f51236c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ J f51237d;

            @Override // androidx.compose.ui.layout.J
            public int getHeight() {
                return this.f51234a.getHeight();
            }

            @Override // androidx.compose.ui.layout.J
            public int getWidth() {
                return this.f51234a.getWidth();
            }

            @Override // androidx.compose.ui.layout.J
            public Map<AbstractC5916a, Integer> r() {
                return this.f51234a.r();
            }

            @Override // androidx.compose.ui.layout.J
            public Function1<l0, Unit> t() {
                return this.f51234a.t();
            }

            public b(J j10, E e10, int i10, J j11) {
                this.f51235b = e10;
                this.f51236c = i10;
                this.f51237d = j11;
                this.f51234a = j10;
            }

            @Override // androidx.compose.ui.layout.J
            public void s() {
                this.f51235b.currentIndex = this.f51236c;
                this.f51237d.s();
                E e10 = this.f51235b;
                e10.x(e10.currentIndex);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Function2<? super r0, ? super H1.b, ? extends J> function2, String str) {
            super(str);
            this.f51229c = function2;
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public J d(K k10, List<? extends I> list, long j10) {
            E.this.scope.q(k10.getLayoutDirection());
            E.this.scope.a(k10.getDensity());
            E.this.scope.f(k10.getFontScale());
            if (k10.v0() || E.this.root.getLookaheadRoot() == null) {
                E.this.currentIndex = 0;
                J jInvoke = this.f51229c.invoke(E.this.scope, H1.b.a(j10));
                return new b(jInvoke, E.this, E.this.currentIndex, jInvoke);
            }
            E.this.currentApproachIndex = 0;
            J jInvoke2 = this.f51229c.invoke(E.this.approachMeasureScope, H1.b.a(j10));
            return new a(jInvoke2, E.this, E.this.currentApproachIndex, jInvoke2);
        }
    }

    @Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\"\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0011\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"androidx/compose/ui/layout/E$f", "Landroidx/compose/ui/layout/q0$a;", "", "dispose", "()V", "", "index", "LH1/b;", "constraints", "c", "(IJ)V", "", "key", "Lkotlin/Function1;", "Landroidx/compose/ui/node/B0;", "Landroidx/compose/ui/node/A0;", "block", "b", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "a", "()I", "placeablesCount", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class f implements q0.a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f51239b;

        f(Object obj) {
            this.f51239b = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.compose.ui.layout.q0.a
        public int a() {
            List<LayoutNode> listI;
            LayoutNode layoutNode = (LayoutNode) E.this.precomposeMap.e(this.f51239b);
            if (layoutNode == null || (listI = layoutNode.I()) == null) {
                return 0;
            }
            return listI.size();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.compose.ui.layout.q0.a
        public void b(Object key, Function1<? super B0, ? extends A0> block) {
            C5946c0 nodes;
            Modifier.c head;
            LayoutNode layoutNode = (LayoutNode) E.this.precomposeMap.e(this.f51239b);
            if (layoutNode == null || (nodes = layoutNode.getNodes()) == null || (head = nodes.getHead()) == null) {
                return;
            }
            C0.e(head, key, block);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.compose.ui.layout.q0.a
        public void c(int index, long constraints) {
            LayoutNode layoutNode = (LayoutNode) E.this.precomposeMap.e(this.f51239b);
            if (layoutNode == null || !layoutNode.isAttached()) {
                return;
            }
            int size = layoutNode.I().size();
            if (index < 0 || index >= size) {
                C14920a.d("Index (" + index + ") is out of bound of [0, " + size + ')');
            }
            if (layoutNode.f()) {
                C14920a.a("Pre-measure called on node that is not placed");
            }
            LayoutNode layoutNode2 = E.this.root;
            layoutNode2.ignoreRemeasureRequests = true;
            androidx.compose.ui.node.L.b(layoutNode).x(layoutNode.I().get(index), constraints);
            layoutNode2.ignoreRemeasureRequests = false;
        }

        @Override // androidx.compose.ui.layout.q0.a
        public void dispose() {
            E.this.B();
            LayoutNode layoutNode = (LayoutNode) E.this.precomposeMap.u(this.f51239b);
            if (layoutNode != null) {
                if (!(E.this.precomposedCount > 0)) {
                    C14920a.b("No pre-composed items to dispose");
                }
                int iIndexOf = E.this.root.M().indexOf(layoutNode);
                if (!(iIndexOf >= E.this.root.M().size() - E.this.precomposedCount)) {
                    C14920a.b("Item is not in pre-composed item range");
                }
                E.this.reusableCount++;
                E e10 = E.this;
                e10.precomposedCount--;
                int size = (E.this.root.M().size() - E.this.precomposedCount) - E.this.reusableCount;
                E.this.D(iIndexOf, size, 1);
                E.this.x(size);
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ b f51240f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f51241g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(b bVar, Function2<? super Composer, ? super Integer, Unit> function2) {
            super(2);
            this.f51240f = bVar;
            this.f51241g = function2;
        }

        public final void a(Composer composer, int i10) {
            if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1750409193, i10, -1, "androidx.compose.ui.layout.LayoutNodeSubcompositionsState.subcompose.<anonymous>.<anonymous>.<anonymous> (SubcomposeLayout.kt:522)");
            }
            boolean zA = this.f51240f.a();
            Function2<Composer, Integer, Unit> function2 = this.f51241g;
            composer.startReusableGroup(207, Boolean.valueOf(zA));
            boolean zA2 = composer.a(zA);
            if (zA) {
                function2.invoke(composer, 0);
            } else {
                composer.i(zA2);
            }
            composer.A();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    private final void C(boolean deactivate) {
        this.precomposedCount = 0;
        this.precomposeMap.k();
        List<LayoutNode> listM = this.root.M();
        int size = listM.size();
        if (this.reusableCount != size) {
            this.reusableCount = size;
            g.Companion companion = androidx.compose.runtime.snapshots.g.INSTANCE;
            androidx.compose.runtime.snapshots.g gVarD = companion.d();
            Function1<Object, Unit> function1G = gVarD != null ? gVarD.g() : null;
            androidx.compose.runtime.snapshots.g gVarE = companion.e(gVarD);
            for (int i10 = 0; i10 < size; i10++) {
                try {
                    LayoutNode layoutNode = listM.get(i10);
                    b bVarE = this.nodeToNodeState.e(layoutNode);
                    if (bVarE != null && bVarE.a()) {
                        G(layoutNode);
                        if (deactivate) {
                            Q0 composition = bVarE.getComposition();
                            if (composition != null) {
                                composition.deactivate();
                            }
                            bVarE.h(t1.e(Boolean.FALSE, null, 2, null));
                        } else {
                            bVarE.g(false);
                        }
                        bVarE.m(p0.f51346a);
                    }
                } catch (Throwable th2) {
                    companion.l(gVarD, gVarE, function1G);
                    throw th2;
                }
            }
            Unit unit = Unit.f143329a;
            companion.l(gVarD, gVarE, function1G);
            this.slotIdToNode.k();
        }
        B();
    }

    @Override // androidx.compose.runtime.InterfaceC5861g
    public void h() {
        C(true);
    }

    @Override // androidx.compose.runtime.InterfaceC5861g
    public void l() {
        C(false);
    }

    public final void x(int startIndex) {
        boolean z10 = false;
        this.reusableCount = 0;
        List<LayoutNode> listM = this.root.M();
        int size = (listM.size() - this.precomposedCount) - 1;
        if (startIndex <= size) {
            this.reusableSlotIdsSet.clear();
            if (startIndex <= size) {
                int i10 = startIndex;
                while (true) {
                    this.reusableSlotIdsSet.add(A(listM, i10));
                    if (i10 == size) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            this.slotReusePolicy.a(this.reusableSlotIdsSet);
            g.Companion companion = androidx.compose.runtime.snapshots.g.INSTANCE;
            androidx.compose.runtime.snapshots.g gVarD = companion.d();
            Function1<Object, Unit> function1G = gVarD != null ? gVarD.g() : null;
            androidx.compose.runtime.snapshots.g gVarE = companion.e(gVarD);
            boolean z11 = false;
            while (size >= startIndex) {
                try {
                    LayoutNode layoutNode = listM.get(size);
                    b bVarE = this.nodeToNodeState.e(layoutNode);
                    Intrinsics.g(bVarE);
                    b bVar = bVarE;
                    Object slotId = bVar.getSlotId();
                    if (this.reusableSlotIdsSet.contains(slotId)) {
                        this.reusableCount++;
                        if (bVar.a()) {
                            G(layoutNode);
                            bVar.g(false);
                            z11 = true;
                        }
                    } else {
                        LayoutNode layoutNode2 = this.root;
                        layoutNode2.ignoreRemeasureRequests = true;
                        this.nodeToNodeState.u(layoutNode);
                        Q0 composition = bVar.getComposition();
                        if (composition != null) {
                            composition.dispose();
                        }
                        this.root.i1(size, 1);
                        layoutNode2.ignoreRemeasureRequests = false;
                    }
                    this.slotIdToNode.u(slotId);
                    size--;
                } catch (Throwable th2) {
                    companion.l(gVarD, gVarE, function1G);
                    throw th2;
                }
            }
            Unit unit = Unit.f143329a;
            companion.l(gVarD, gVarE, function1G);
            z10 = z11;
        }
        if (z10) {
            androidx.compose.runtime.snapshots.g.INSTANCE.m();
        }
        B();
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/layout/E$e", "Landroidx/compose/ui/layout/q0$a;", "", "dispose", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements q0.a {
        @Override // androidx.compose.ui.layout.q0.a
        public void dispose() {
        }

        e() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(int from, int to2, int count) {
        LayoutNode layoutNode = this.root;
        layoutNode.ignoreRemeasureRequests = true;
        this.root.Y0(from, to2, count);
        layoutNode.ignoreRemeasureRequests = false;
    }

    static /* synthetic */ void E(E e10, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i12 = 1;
        }
        e10.D(i10, i11, i12);
    }

    private final void K(LayoutNode node, b nodeState) {
        g.Companion companion = androidx.compose.runtime.snapshots.g.INSTANCE;
        androidx.compose.runtime.snapshots.g gVarD = companion.d();
        Function1<Object, Unit> function1G = gVarD != null ? gVarD.g() : null;
        androidx.compose.runtime.snapshots.g gVarE = companion.e(gVarD);
        try {
            LayoutNode layoutNode = this.root;
            layoutNode.ignoreRemeasureRequests = true;
            Function2<Composer, Integer, Unit> function2C = nodeState.c();
            Q0 composition = nodeState.getComposition();
            AbstractC5869k abstractC5869k = this.compositionContext;
            if (abstractC5869k == null) {
                C14920a.c("parent composition reference not set");
                throw new KotlinNothingValueException();
            }
            nodeState.i(M(composition, node, nodeState.getForceReuse(), abstractC5869k, ComposableLambdaKt.composableLambdaInstance(-1750409193, true, new g(nodeState, function2C))));
            nodeState.l(false);
            layoutNode.ignoreRemeasureRequests = false;
            Unit unit = Unit.f143329a;
            companion.l(gVarD, gVarE, function1G);
        } catch (Throwable th2) {
            companion.l(gVarD, gVarE, function1G);
            throw th2;
        }
    }

    private final void L(LayoutNode node, Object slotId, Function2<? super Composer, ? super Integer, Unit> content) {
        Z.W<LayoutNode, b> w10 = this.nodeToNodeState;
        b bVarE = w10.e(node);
        if (bVarE == null) {
            b bVar = new b(slotId, C5925j.f51321a.a(), null, 4, null);
            w10.x(node, bVar);
            bVarE = bVar;
        }
        b bVar2 = bVarE;
        Q0 composition = bVar2.getComposition();
        boolean zS = composition != null ? composition.s() : true;
        if (bVar2.c() != content || zS || bVar2.getForceRecompose()) {
            bVar2.j(content);
            K(node, bVar2);
            bVar2.k(false);
        }
    }

    private final Q0 M(Q0 existing, LayoutNode container, boolean reuseContent, AbstractC5869k parent, Function2<? super Composer, ? super Integer, Unit> composable) {
        if (existing == null || existing.getDisposed()) {
            existing = E1.a(container, parent);
        }
        if (reuseContent) {
            existing.q(composable);
            return existing;
        }
        existing.d(composable);
        return existing;
    }

    private final LayoutNode N(Object slotId) {
        int i10;
        if (this.reusableCount == 0) {
            return null;
        }
        List<LayoutNode> listM = this.root.M();
        int size = listM.size() - this.precomposedCount;
        int i11 = size - this.reusableCount;
        int i12 = size - 1;
        int i13 = i12;
        while (true) {
            if (i13 < i11) {
                i10 = -1;
                break;
            }
            if (Intrinsics.e(A(listM, i13), slotId)) {
                i10 = i13;
                break;
            }
            i13--;
        }
        if (i10 == -1) {
            while (i12 >= i11) {
                b bVarE = this.nodeToNodeState.e(listM.get(i12));
                Intrinsics.g(bVarE);
                b bVar = bVarE;
                if (bVar.getSlotId() == p0.f51346a || this.slotReusePolicy.b(slotId, bVar.getSlotId())) {
                    bVar.m(slotId);
                    i13 = i12;
                    i10 = i13;
                    break;
                }
                i12--;
            }
            i13 = i12;
        }
        if (i10 == -1) {
            return null;
        }
        if (i13 != i11) {
            D(i13, i11, 1);
        }
        this.reusableCount--;
        LayoutNode layoutNode = listM.get(i11);
        b bVarE2 = this.nodeToNodeState.e(layoutNode);
        Intrinsics.g(bVarE2);
        b bVar2 = bVarE2;
        bVar2.h(t1.e(Boolean.TRUE, null, 2, null));
        bVar2.l(true);
        bVar2.k(true);
        return layoutNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<I> t(Object slotId, Function2<? super Composer, ? super Integer, Unit> content) {
        if (!(this.approachComposedSlotIds.getSize() >= this.currentApproachIndex)) {
            C14920a.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        int size = this.approachComposedSlotIds.getSize();
        int i10 = this.currentApproachIndex;
        if (size == i10) {
            this.approachComposedSlotIds.c(slotId);
        } else {
            this.approachComposedSlotIds.y(i10, slotId);
        }
        this.currentApproachIndex++;
        if (!this.precomposeMap.b(slotId)) {
            this.approachPrecomposeSlotHandleMap.x(slotId, F(slotId, content));
            if (this.root.X() == LayoutNode.e.f51467c) {
                this.root.l1(true);
            } else {
                LayoutNode.o1(this.root, true, false, false, 6, null);
            }
        }
        LayoutNode layoutNodeE = this.precomposeMap.e(slotId);
        if (layoutNodeE != null) {
            List<androidx.compose.ui.node.V> listU1 = layoutNodeE.d0().u1();
            int size2 = listU1.size();
            for (int i11 = 0; i11 < size2; i11++) {
                listU1.get(i11).Z1();
            }
            if (listU1 != null) {
                return listU1;
            }
        }
        return CollectionsKt.m();
    }

    private final LayoutNode v(int index) {
        LayoutNode layoutNode = new LayoutNode(true, 0, 2, null);
        LayoutNode layoutNode2 = this.root;
        layoutNode2.ignoreRemeasureRequests = true;
        this.root.y0(index, layoutNode);
        layoutNode2.ignoreRemeasureRequests = false;
        return layoutNode;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void w() {
        /*
            r15 = this;
            androidx.compose.ui.node.LayoutNode r0 = r15.root
            r1 = 1
            androidx.compose.ui.node.LayoutNode.t(r0, r1)
            Z.W<androidx.compose.ui.node.LayoutNode, androidx.compose.ui.layout.E$b> r1 = r15.nodeToNodeState
            java.lang.Object[] r2 = r1.values
            long[] r1 = r1.metadata
            int r3 = r1.length
            int r3 = r3 + (-2)
            r4 = 0
            if (r3 < 0) goto L53
            r5 = r4
        L13:
            r6 = r1[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L4e
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L2d:
            if (r10 >= r8) goto L4c
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L48
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r2[r11]
            androidx.compose.ui.layout.E$b r11 = (androidx.compose.ui.layout.E.b) r11
            androidx.compose.runtime.Q0 r11 = r11.getComposition()
            if (r11 == 0) goto L48
            r11.dispose()
        L48:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L2d
        L4c:
            if (r8 != r9) goto L53
        L4e:
            if (r5 == r3) goto L53
            int r5 = r5 + 1
            goto L13
        L53:
            androidx.compose.ui.node.LayoutNode r1 = r15.root
            r1.h1()
            androidx.compose.ui.node.LayoutNode.t(r0, r4)
            Z.W<androidx.compose.ui.node.LayoutNode, androidx.compose.ui.layout.E$b> r0 = r15.nodeToNodeState
            r0.k()
            Z.W<java.lang.Object, androidx.compose.ui.node.LayoutNode> r0 = r15.slotIdToNode
            r0.k()
            r15.precomposedCount = r4
            r15.reusableCount = r4
            Z.W<java.lang.Object, androidx.compose.ui.node.LayoutNode> r0 = r15.precomposeMap
            r0.k()
            r15.B()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.layout.E.w():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y() {
        Z.W<Object, q0.a> w10 = this.approachPrecomposeSlotHandleMap;
        long[] jArr = w10.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj = w10.keys[i13];
                        q0.a aVar = (q0.a) w10.values[i13];
                        int iP = this.approachComposedSlotIds.p(obj);
                        if (iP < 0 || iP >= this.currentApproachIndex) {
                            aVar.dispose();
                            w10.v(i13);
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void B() {
        int size = this.root.M().size();
        if (!(this.nodeToNodeState.get_size() == size)) {
            C14920a.a("Inconsistency between the count of nodes tracked by the state (" + this.nodeToNodeState.get_size() + ") and the children count on the SubcomposeLayout (" + size + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if (!((size - this.reusableCount) - this.precomposedCount >= 0)) {
            C14920a.a("Incorrect state. Total children " + size + ". Reusable children " + this.reusableCount + ". Precomposed children " + this.precomposedCount);
        }
        if (this.precomposeMap.get_size() == this.precomposedCount) {
            return;
        }
        C14920a.a("Incorrect state. Precomposed children " + this.precomposedCount + ". Map size " + this.precomposeMap.get_size());
    }

    public final q0.a F(Object slotId, Function2<? super Composer, ? super Integer, Unit> content) {
        if (!this.root.isAttached()) {
            return new e();
        }
        B();
        if (!this.slotIdToNode.c(slotId)) {
            this.approachPrecomposeSlotHandleMap.u(slotId);
            Z.W<Object, LayoutNode> w10 = this.precomposeMap;
            LayoutNode layoutNodeE = w10.e(slotId);
            if (layoutNodeE == null) {
                layoutNodeE = N(slotId);
                if (layoutNodeE != null) {
                    D(this.root.M().indexOf(layoutNodeE), this.root.M().size(), 1);
                    this.precomposedCount++;
                } else {
                    layoutNodeE = v(this.root.M().size());
                    this.precomposedCount++;
                }
                w10.x(slotId, layoutNodeE);
            }
            L(layoutNodeE, slotId, content);
        }
        return new f(slotId);
    }

    public final void H(AbstractC5869k abstractC5869k) {
        this.compositionContext = abstractC5869k;
    }

    public final void I(s0 s0Var) {
        if (this.slotReusePolicy != s0Var) {
            this.slotReusePolicy = s0Var;
            C(false);
            LayoutNode.s1(this.root, false, false, false, 7, null);
        }
    }

    public final MeasurePolicy u(Function2<? super r0, ? super H1.b, ? extends J> block) {
        return new d(block, this.NoIntrinsicsMessage);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z() {
        /*
            r14 = this;
            androidx.compose.ui.node.LayoutNode r0 = r14.root
            java.util.List r0 = r0.M()
            int r0 = r0.size()
            int r1 = r14.reusableCount
            if (r1 == r0) goto L68
            Z.W<androidx.compose.ui.node.LayoutNode, androidx.compose.ui.layout.E$b> r0 = r14.nodeToNodeState
            java.lang.Object[] r1 = r0.values
            long[] r0 = r0.metadata
            int r2 = r0.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L56
            r3 = 0
            r4 = r3
        L1b:
            r5 = r0[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L51
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L35:
            if (r9 >= r7) goto L4f
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4b
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            androidx.compose.ui.layout.E$b r10 = (androidx.compose.ui.layout.E.b) r10
            r11 = 1
            r10.k(r11)
        L4b:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L35
        L4f:
            if (r7 != r8) goto L56
        L51:
            if (r4 == r2) goto L56
            int r4 = r4 + 1
            goto L1b
        L56:
            androidx.compose.ui.node.LayoutNode r0 = r14.root
            boolean r0 = r0.e0()
            if (r0 != 0) goto L68
            androidx.compose.ui.node.LayoutNode r1 = r14.root
            r5 = 7
            r6 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            androidx.compose.ui.node.LayoutNode.s1(r1, r2, r3, r4, r5, r6)
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.layout.E.z():void");
    }

    public E(LayoutNode layoutNode, s0 s0Var) {
        this.root = layoutNode;
        this.slotReusePolicy = s0Var;
    }

    private final Object A(List<LayoutNode> foldedChildren, int index) {
        b bVarE = this.nodeToNodeState.e(foldedChildren.get(index));
        Intrinsics.g(bVarE);
        return bVarE.getSlotId();
    }

    private final void G(LayoutNode layoutNode) {
        androidx.compose.ui.node.V vD0 = layoutNode.d0();
        LayoutNode.g gVar = LayoutNode.g.f51475c;
        vD0.u2(gVar);
        androidx.compose.ui.node.T tA0 = layoutNode.a0();
        if (tA0 != null) {
            tA0.s2(gVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<androidx.compose.ui.layout.I> J(java.lang.Object r13, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r14) {
        /*
            r12 = this;
            r12.B()
            androidx.compose.ui.node.LayoutNode r0 = r12.root
            androidx.compose.ui.node.LayoutNode$e r0 = r0.X()
            androidx.compose.ui.node.LayoutNode$e r1 = androidx.compose.ui.node.LayoutNode.e.f51465a
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L1e
            androidx.compose.ui.node.LayoutNode$e r4 = androidx.compose.ui.node.LayoutNode.e.f51467c
            if (r0 == r4) goto L1e
            androidx.compose.ui.node.LayoutNode$e r4 = androidx.compose.ui.node.LayoutNode.e.f51466b
            if (r0 == r4) goto L1e
            androidx.compose.ui.node.LayoutNode$e r4 = androidx.compose.ui.node.LayoutNode.e.f51468d
            if (r0 != r4) goto L1c
            goto L1e
        L1c:
            r4 = r2
            goto L1f
        L1e:
            r4 = r3
        L1f:
            if (r4 != 0) goto L26
            java.lang.String r4 = "subcompose can only be used inside the measure or layout blocks"
            j1.C14920a.b(r4)
        L26:
            Z.W<java.lang.Object, androidx.compose.ui.node.LayoutNode> r4 = r12.slotIdToNode
            java.lang.Object r5 = r4.e(r13)
            if (r5 != 0) goto L5c
            Z.W<java.lang.Object, androidx.compose.ui.node.LayoutNode> r5 = r12.precomposeMap
            java.lang.Object r5 = r5.u(r13)
            androidx.compose.ui.node.LayoutNode r5 = (androidx.compose.ui.node.LayoutNode) r5
            if (r5 == 0) goto L4d
            int r6 = r12.precomposedCount
            if (r6 <= 0) goto L3e
            r6 = r3
            goto L3f
        L3e:
            r6 = r2
        L3f:
            if (r6 != 0) goto L46
            java.lang.String r6 = "Check failed."
            j1.C14920a.b(r6)
        L46:
            int r6 = r12.precomposedCount
            int r6 = r6 + (-1)
            r12.precomposedCount = r6
            goto L59
        L4d:
            androidx.compose.ui.node.LayoutNode r5 = r12.N(r13)
            if (r5 != 0) goto L59
            int r5 = r12.currentIndex
            androidx.compose.ui.node.LayoutNode r5 = r12.v(r5)
        L59:
            r4.x(r13, r5)
        L5c:
            androidx.compose.ui.node.LayoutNode r5 = (androidx.compose.ui.node.LayoutNode) r5
            androidx.compose.ui.node.LayoutNode r4 = r12.root
            java.util.List r4 = r4.M()
            int r6 = r12.currentIndex
            java.lang.Object r4 = kotlin.collections.CollectionsKt.v0(r4, r6)
            if (r4 == r5) goto La2
            androidx.compose.ui.node.LayoutNode r4 = r12.root
            java.util.List r4 = r4.M()
            int r7 = r4.indexOf(r5)
            int r4 = r12.currentIndex
            if (r7 < r4) goto L7b
            r2 = r3
        L7b:
            if (r2 != 0) goto L96
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Key \""
            r2.append(r4)
            r2.append(r13)
            java.lang.String r4 = "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item."
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            j1.C14920a.a(r2)
        L96:
            int r8 = r12.currentIndex
            if (r8 == r7) goto La2
            r10 = 4
            r11 = 0
            r9 = 0
            r6 = r12
            E(r6, r7, r8, r9, r10, r11)
            goto La3
        La2:
            r6 = r12
        La3:
            int r2 = r6.currentIndex
            int r2 = r2 + r3
            r6.currentIndex = r2
            r12.L(r5, r13, r14)
            if (r0 == r1) goto Lb7
            androidx.compose.ui.node.LayoutNode$e r13 = androidx.compose.ui.node.LayoutNode.e.f51467c
            if (r0 != r13) goto Lb2
            goto Lb7
        Lb2:
            java.util.List r13 = r5.G()
            return r13
        Lb7:
            java.util.List r13 = r5.H()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.layout.E.J(java.lang.Object, kotlin.jvm.functions.Function2):java.util.List");
    }

    @Override // androidx.compose.runtime.InterfaceC5861g
    public void b() {
        w();
    }
}
