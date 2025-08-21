package androidx.compose.ui.node;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.AbstractC5916a;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.node.LayoutNode;
import com.google.android.gms.common.api.a;
import j1.C14920a;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0099\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJG\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0019\u0010\u0017\u001a\u0015\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\t\u0018\u00010\u0014¢\u0006\u0002\b\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001c\u0010\u000bJ\u000f\u0010\u001d\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001d\u0010\u000bJ\u000f\u0010\u001e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001e\u0010\u000bJ\u000f\u0010\u001f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001f\u0010\u000bJ\u000f\u0010 \u001a\u00020\tH\u0000¢\u0006\u0004\b \u0010\u000bJ\u000f\u0010!\u001a\u00020\tH\u0016¢\u0006\u0004\b!\u0010\u000bJ\u0017\u0010$\u001a\u00020\t2\u0006\u0010#\u001a\u00020\"H\u0000¢\u0006\u0004\b$\u0010%J\u001b\u0010)\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0&H\u0016¢\u0006\u0004\b)\u0010*J#\u0010,\u001a\u00020\t2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0014H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\tH\u0016¢\u0006\u0004\b.\u0010\u000bJ\u000f\u0010/\u001a\u00020\tH\u0016¢\u0006\u0004\b/\u0010\u000bJ\r\u00100\u001a\u00020\t¢\u0006\u0004\b0\u0010\u000bJ\u001a\u00103\u001a\u00020\u00012\u0006\u00102\u001a\u000201H\u0016ø\u0001\u0000¢\u0006\u0004\b3\u00104J\u001a\u00105\u001a\u00020\t2\u0006\u00102\u001a\u000201H\u0000ø\u0001\u0000¢\u0006\u0004\b5\u00106J\u0018\u00107\u001a\u00020\"2\u0006\u00102\u001a\u000201ø\u0001\u0000¢\u0006\u0004\b7\u00108J=\u00109\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0019\u0010\u0017\u001a\u0015\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\t\u0018\u00010\u0014¢\u0006\u0002\b\u0016H\u0014ø\u0001\u0000¢\u0006\u0004\b9\u0010:J*\u0010;\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0018H\u0014ø\u0001\u0000¢\u0006\u0004\b;\u0010<J\u0017\u0010>\u001a\u00020\t2\u0006\u0010=\u001a\u00020\"H\u0016¢\u0006\u0004\b>\u0010%J\u0018\u0010@\u001a\u00020(2\u0006\u0010?\u001a\u00020'H\u0096\u0002¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020(2\u0006\u0010B\u001a\u00020(H\u0016¢\u0006\u0004\bC\u0010DJ\u0017\u0010E\u001a\u00020(2\u0006\u0010B\u001a\u00020(H\u0016¢\u0006\u0004\bE\u0010DJ\u0017\u0010G\u001a\u00020(2\u0006\u0010F\u001a\u00020(H\u0016¢\u0006\u0004\bG\u0010DJ\u0017\u0010H\u001a\u00020(2\u0006\u0010F\u001a\u00020(H\u0016¢\u0006\u0004\bH\u0010DJ\u0015\u0010J\u001a\u00020\t2\u0006\u0010I\u001a\u00020\"¢\u0006\u0004\bJ\u0010%J\r\u0010K\u001a\u00020\t¢\u0006\u0004\bK\u0010\u000bJ\r\u0010L\u001a\u00020\"¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020\tH\u0000¢\u0006\u0004\bN\u0010\u000bJ\r\u0010O\u001a\u00020\t¢\u0006\u0004\bO\u0010\u000bJ\r\u0010P\u001a\u00020\t¢\u0006\u0004\bP\u0010\u000bJ\r\u0010Q\u001a\u00020\t¢\u0006\u0004\bQ\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010V\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010Y\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\"\u0010_\u001a\u00020(8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bZ\u0010X\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010g\u001a\u00020`8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\u0016\u0010i\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010UR\"\u0010m\u001a\u00020\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bj\u0010U\u001a\u0004\bk\u0010M\"\u0004\bl\u0010%R\u0016\u0010o\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010UR\u001e\u0010r\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bp\u0010qR\u001c\u0010u\u001a\u00020\u00108\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bs\u0010tR\u0016\u0010x\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR)\u0010{\u001a\u0015\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\t\u0018\u00010\u0014¢\u0006\u0002\b\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR\u0018\u0010~\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R\u0019\u0010\u0082\u0001\u001a\u00020\u007f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001f\u0010\u0087\u0001\u001a\u00030\u0083\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0005\b|\u0010\u0086\u0001R\u001e\u0010\u008b\u0001\u001a\t\u0012\u0004\u0012\u00020\u00000\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R&\u0010\u008f\u0001\u001a\u00020\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b\u008c\u0001\u0010U\u001a\u0005\b\u008d\u0001\u0010M\"\u0005\b\u008e\u0001\u0010%R(\u0010\u0093\u0001\u001a\u00020\"2\u0007\u0010\u0090\u0001\u001a\u00020\"8\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010U\u001a\u0005\b\u0092\u0001\u0010MR\u0018\u0010\u0095\u0001\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0094\u0001\u0010UR0\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u0096\u00012\n\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u0096\u00018\u0016@RX\u0096\u000e¢\u0006\u0010\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R&\u0010\u009d\u0001\u001a\u00020\"8\u0016@\u0016X\u0096\u000e¢\u0006\u0015\n\u0005\b\u009c\u0001\u0010U\u001a\u0005\b\u009d\u0001\u0010M\"\u0005\b\u009e\u0001\u0010%R\u0017\u0010\u009f\u0001\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010UR(\u0010£\u0001\u001a\u00020\"2\u0007\u0010 \u0001\u001a\u00020\"8B@BX\u0082\u000e¢\u0006\u000e\u001a\u0005\b¡\u0001\u0010M\"\u0005\b¢\u0001\u0010%R(\u0010¦\u0001\u001a\u00020\"2\u0007\u0010 \u0001\u001a\u00020\"8B@BX\u0082\u000e¢\u0006\u000e\u001a\u0005\b¤\u0001\u0010M\"\u0005\b¥\u0001\u0010%R(\u0010©\u0001\u001a\u00020\"2\u0007\u0010 \u0001\u001a\u00020\"8B@BX\u0082\u000e¢\u0006\u000e\u001a\u0005\b§\u0001\u0010M\"\u0005\b¨\u0001\u0010%R\u0017\u0010¬\u0001\u001a\u00020\f8BX\u0082\u0004¢\u0006\b\u001a\u0006\bª\u0001\u0010«\u0001R\u0018\u0010°\u0001\u001a\u00030\u00ad\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b®\u0001\u0010¯\u0001R,\u0010¶\u0001\u001a\u00030±\u00012\b\u0010 \u0001\u001a\u00030±\u00018B@BX\u0082\u000e¢\u0006\u0010\u001a\u0006\b²\u0001\u0010³\u0001\"\u0006\b´\u0001\u0010µ\u0001R\u0016\u0010¸\u0001\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b·\u0001\u0010MR\u0018\u0010¼\u0001\u001a\u00030¹\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bº\u0001\u0010»\u0001R\u001c\u0010¿\u0001\u001a\u0004\u0018\u0001018Fø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\b½\u0001\u0010¾\u0001R\u0015\u0010À\u0001\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010MR\u0018\u0010Â\u0001\u001a\u00030\u00ad\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÁ\u0001\u0010¯\u0001R\u0013\u0010Ä\u0001\u001a\u00020\"8F¢\u0006\u0007\u001a\u0005\bÃ\u0001\u0010MR\u001e\u0010È\u0001\u001a\t\u0012\u0004\u0012\u00020\u00000Å\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bÆ\u0001\u0010Ç\u0001R\u0019\u0010Ë\u0001\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\bÉ\u0001\u0010Ê\u0001R\u0016\u0010Í\u0001\u001a\u00020(8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÌ\u0001\u0010\\R\u0016\u0010Ï\u0001\u001a\u00020(8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÎ\u0001\u0010\\\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Ð\u0001"}, d2 = {"Landroidx/compose/ui/node/T;", "Landroidx/compose/ui/layout/f0;", "Landroidx/compose/ui/layout/I;", "Landroidx/compose/ui/node/b;", "Landroidx/compose/ui/node/Z;", "Landroidx/compose/ui/node/M;", "layoutNodeLayoutDelegate", "<init>", "(Landroidx/compose/ui/node/M;)V", "", "m1", "()V", "Landroidx/compose/ui/node/LayoutNode;", "node", "v2", "(Landroidx/compose/ui/node/LayoutNode;)V", "LH1/n;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/e;", "Lkotlin/ExtensionFunctionType;", "layerBlock", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "k2", "(JFLkotlin/jvm/functions/Function1;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "g2", "q1", "Y1", "e2", "V1", "U", "", "inLookahead", "X1", "(Z)V", "", "Landroidx/compose/ui/layout/a;", "", "B", "()Ljava/util/Map;", "block", "o0", "(Lkotlin/jvm/functions/Function1;)V", "requestLayout", "t0", "Z1", "LH1/b;", "constraints", "k0", "(J)Landroidx/compose/ui/layout/f0;", "j2", "(J)V", "l2", "(J)Z", "V0", "(JFLkotlin/jvm/functions/Function1;)V", "T0", "(JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "newMFR", "R", "alignmentLine", "l0", "(Landroidx/compose/ui/layout/a;)I", "height", "d0", "(I)I", "j0", "width", "W", "A", "forceRequest", "R1", "T1", "w2", "()Z", "i2", "m2", "h2", "c2", "f", "Landroidx/compose/ui/node/M;", "g", "Z", "relayoutWithoutParentInProgress", "h", "I", "previousPlaceOrder", "i", "getPlaceOrder$ui_release", "()I", "t2", "(I)V", "placeOrder", "Landroidx/compose/ui/node/LayoutNode$g;", "j", "Landroidx/compose/ui/node/LayoutNode$g;", "A1", "()Landroidx/compose/ui/node/LayoutNode$g;", "s2", "(Landroidx/compose/ui/node/LayoutNode$g;)V", "measuredByParent", "k", "duringAlignmentLinesQuery", "l", "M1", "setPlacedOnce$ui_release", "placedOnce", "m", "measuredOnce", "n", "LH1/b;", "lookaheadConstraints", "o", "J", "lastPosition", "p", "F", "lastZIndex", "q", "Lkotlin/jvm/functions/Function1;", "lastLayerBlock", "r", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "lastExplicitLayer", "Landroidx/compose/ui/node/T$a;", "s", "Landroidx/compose/ui/node/T$a;", "_placedState", "Landroidx/compose/ui/node/a;", "t", "Landroidx/compose/ui/node/a;", "()Landroidx/compose/ui/node/a;", "alignmentLines", "LD0/c;", "u", "LD0/c;", "_childDelegates", "v", "getChildDelegatesDirty$ui_release", "n2", "childDelegatesDirty", "<set-?>", "w", "v1", "layingOutChildren", "x", "parentDataDirty", "", "y", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "parentData", "z", "isPlacedUnderMotionFrameOfReference", "u2", "onNodePlacedCalled", "value", "getMeasurePending", "r2", "measurePending", "w1", "o2", "layoutPending", "x1", "p2", "layoutPendingForAlignment", "S1", "()Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/node/NodeCoordinator;", "J1", "()Landroidx/compose/ui/node/NodeCoordinator;", "outerCoordinator", "Landroidx/compose/ui/node/LayoutNode$e;", "y1", "()Landroidx/compose/ui/node/LayoutNode$e;", "q2", "(Landroidx/compose/ui/node/LayoutNode$e;)V", "layoutState", "s1", "detachedFromParentLookaheadPlacement", "Landroidx/compose/ui/node/V;", "z1", "()Landroidx/compose/ui/node/V;", "measurePassDelegate", "u1", "()LH1/b;", "lastConstraints", "isPlaced", "Y", "innerCoordinator", "E1", "needsToBePlacedInApproach", "", "r1", "()Ljava/util/List;", "childDelegates", "M", "()Landroidx/compose/ui/node/b;", "parentAlignmentLinesOwner", "M0", "measuredWidth", "J0", "measuredHeight", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class T extends androidx.compose.ui.layout.f0 implements androidx.compose.ui.layout.I, InterfaceC5943b, Z {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private boolean onNodePlacedCalled;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final M layoutNodeLayoutDelegate;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean relayoutWithoutParentInProgress;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean duringAlignmentLinesQuery;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private boolean placedOnce;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean measuredOnce;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private H1.b lookaheadConstraints;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private float lastZIndex;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private Function1<? super androidx.compose.ui.graphics.e, Unit> lastLayerBlock;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private GraphicsLayer lastExplicitLayer;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private boolean layingOutChildren;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private boolean isPlacedUnderMotionFrameOfReference;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int previousPlaceOrder = a.e.API_PRIORITY_OTHER;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int placeOrder = a.e.API_PRIORITY_OTHER;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private LayoutNode.g measuredByParent = LayoutNode.g.f51475c;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private long lastPosition = H1.n.INSTANCE.b();

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private a _placedState = a.f51624c;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final AbstractC5941a alignmentLines = new P(this);

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final D0.c<T> _childDelegates = new D0.c<>(new T[16], 0);

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean childDelegatesDirty = true;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private boolean parentDataDirty = true;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private Object parentData = z1().getParentData();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/node/T$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f51622a = new a("IsPlacedInLookahead", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f51623b = new a("IsPlacedInApproach", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final a f51624c = new a("IsNotPlaced", 2);

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ a[] f51625d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f51626e;

        private static final /* synthetic */ a[] a() {
            return new a[]{f51622a, f51623b, f51624c};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f51625d.clone();
        }

        static {
            a[] aVarArrA = a();
            f51625d = aVarArrA;
            f51626e = EnumEntriesKt.a(aVarArrA);
        }

        private a(String str, int i10) {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LayoutNode.e.values().length];
            try {
                iArr[LayoutNode.e.f51466b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutNode.e.f51465a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LayoutNode.e.f51467c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LayoutNode.e.f51468d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[LayoutNode.g.values().length];
            try {
                iArr2[LayoutNode.g.f51473a.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[LayoutNode.g.f51474b.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    static final class c extends Lambda implements Function0<Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ S f51628g;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/b;", "child", "", "a", "(Landroidx/compose/ui/node/b;)V"}, k = 3, mv = {1, 9, 0})
        static final class a extends Lambda implements Function1<InterfaceC5943b, Unit> {

            /* renamed from: f, reason: collision with root package name */
            public static final a f51629f = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5943b interfaceC5943b) {
                a(interfaceC5943b);
                return Unit.f143329a;
            }

            public final void a(InterfaceC5943b interfaceC5943b) {
                interfaceC5943b.getAlignmentLines().t(false);
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/b;", "child", "", "a", "(Landroidx/compose/ui/node/b;)V"}, k = 3, mv = {1, 9, 0})
        static final class b extends Lambda implements Function1<InterfaceC5943b, Unit> {

            /* renamed from: f, reason: collision with root package name */
            public static final b f51630f = new b();

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5943b interfaceC5943b) {
                a(interfaceC5943b);
                return Unit.f143329a;
            }

            public final void a(InterfaceC5943b interfaceC5943b) {
                interfaceC5943b.getAlignmentLines().q(interfaceC5943b.getAlignmentLines().getUsedDuringParentLayout());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(S s10) {
            super(0);
            this.f51628g = s10;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            T.this.q1();
            T.this.o0(a.f51629f);
            S lookaheadDelegate = T.this.Y().getLookaheadDelegate();
            if (lookaheadDelegate != null) {
                boolean isPlacingForAlignment = lookaheadDelegate.getIsPlacingForAlignment();
                List<LayoutNode> listI = T.this.S1().I();
                int size = listI.size();
                for (int i10 = 0; i10 < size; i10++) {
                    S lookaheadDelegate2 = listI.get(i10).getOuterCoordinator$ui_release().getLookaheadDelegate();
                    if (lookaheadDelegate2 != null) {
                        lookaheadDelegate2.V1(isPlacingForAlignment);
                    }
                }
            }
            this.f51628g.s1().s();
            S lookaheadDelegate3 = T.this.Y().getLookaheadDelegate();
            if (lookaheadDelegate3 != null) {
                lookaheadDelegate3.getIsPlacingForAlignment();
                List<LayoutNode> listI2 = T.this.S1().I();
                int size2 = listI2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    S lookaheadDelegate4 = listI2.get(i11).getOuterCoordinator$ui_release().getLookaheadDelegate();
                    if (lookaheadDelegate4 != null) {
                        lookaheadDelegate4.V1(false);
                    }
                }
            }
            T.this.m1();
            T.this.o0(b.f51630f);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class d extends Lambda implements Function0<Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f51632g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(long j10) {
            super(0);
            this.f51632g = j10;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            S lookaheadDelegate = T.this.J1().getLookaheadDelegate();
            Intrinsics.g(lookaheadDelegate);
            lookaheadDelegate.k0(this.f51632g);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    static final class e extends Lambda implements Function0<Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Owner f51634g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f51635h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Owner owner, long j10) {
            super(0);
            this.f51634g = owner;
            this.f51635h = j10;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            S lookaheadDelegate;
            f0.a placementScope = null;
            if (N.a(T.this.S1()) || T.this.layoutNodeLayoutDelegate.getDetachedFromParentLookaheadPlacement()) {
                NodeCoordinator wrappedBy = T.this.J1().getWrappedBy();
                if (wrappedBy != null) {
                    placementScope = wrappedBy.getPlacementScope();
                }
            } else {
                NodeCoordinator wrappedBy2 = T.this.J1().getWrappedBy();
                if (wrappedBy2 != null && (lookaheadDelegate = wrappedBy2.getLookaheadDelegate()) != null) {
                    placementScope = lookaheadDelegate.getPlacementScope();
                }
            }
            if (placementScope == null) {
                placementScope = this.f51634g.getPlacementScope();
            }
            T t10 = T.this;
            long j10 = this.f51635h;
            S lookaheadDelegate2 = t10.J1().getLookaheadDelegate();
            Intrinsics.g(lookaheadDelegate2);
            f0.a.j(placementScope, lookaheadDelegate2, j10, 0.0f, 2, null);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/b;", "it", "", "a", "(Landroidx/compose/ui/node/b;)V"}, k = 3, mv = {1, 9, 0})
    static final class f extends Lambda implements Function1<InterfaceC5943b, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final f f51636f = new f();

        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5943b interfaceC5943b) {
            a(interfaceC5943b);
            return Unit.f143329a;
        }

        public final void a(InterfaceC5943b interfaceC5943b) {
            interfaceC5943b.getAlignmentLines().u(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.f0
    public void T0(long position, float zIndex, GraphicsLayer layer) {
        k2(position, zIndex, null, layer);
    }

    public final void T1() {
        this.parentDataDirty = true;
    }

    @Override // androidx.compose.ui.node.InterfaceC5943b
    public void U() {
        this.layingOutChildren = true;
        getAlignmentLines().o();
        if (w1()) {
            e2();
        }
        S lookaheadDelegate = Y().getLookaheadDelegate();
        Intrinsics.g(lookaheadDelegate);
        if (x1() || (!this.duringAlignmentLinesQuery && !lookaheadDelegate.getIsPlacingForAlignment() && w1())) {
            o2(false);
            LayoutNode.e eVarY1 = y1();
            q2(LayoutNode.e.f51468d);
            Owner ownerB = L.b(S1());
            this.layoutNodeLayoutDelegate.T(false);
            OwnerSnapshotObserver.f(ownerB.getSnapshotObserver(), S1(), false, new c(lookaheadDelegate), 2, null);
            q2(eVarY1);
            if (this.layoutNodeLayoutDelegate.getLookaheadCoordinatesAccessedDuringPlacement() && lookaheadDelegate.getIsPlacingForAlignment()) {
                requestLayout();
            }
            p2(false);
        }
        if (getAlignmentLines().getUsedDuringParentLayout()) {
            getAlignmentLines().q(true);
        }
        if (getAlignmentLines().getDirty() && getAlignmentLines().k()) {
            getAlignmentLines().n();
        }
        this.layingOutChildren = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.f0
    public void V0(long position, float zIndex, Function1<? super androidx.compose.ui.graphics.e, Unit> layerBlock) {
        k2(position, zIndex, layerBlock, null);
    }

    public final void V1() {
        o2(true);
        p2(true);
    }

    public final void i2() {
        this.onNodePlacedCalled = true;
        LayoutNode parent$ui_release = S1().getParent$ui_release();
        if ((this._placedState != a.f51622a && !s1()) || (this._placedState != a.f51623b && s1())) {
            Y1();
            if (this.relayoutWithoutParentInProgress && parent$ui_release != null) {
                LayoutNode.m1(parent$ui_release, false, 1, null);
            }
        }
        if (parent$ui_release == null) {
            this.placeOrder = 0;
        } else if (!this.relayoutWithoutParentInProgress && (parent$ui_release.X() == LayoutNode.e.f51467c || parent$ui_release.X() == LayoutNode.e.f51468d)) {
            if (!(this.placeOrder == Integer.MAX_VALUE)) {
                C14920a.b("Place was called on a node which was placed already");
            }
            this.placeOrder = parent$ui_release.getLayoutDelegate().getNextChildLookaheadPlaceOrder();
            M layoutDelegate = parent$ui_release.getLayoutDelegate();
            layoutDelegate.X(layoutDelegate.getNextChildLookaheadPlaceOrder() + 1);
        }
        U();
    }

    public final void m2() {
        T t10;
        LayoutNode parent$ui_release;
        try {
            this.relayoutWithoutParentInProgress = true;
            if (!this.placedOnce) {
                C14920a.b("replace() called on item that was not placed");
            }
            this.onNodePlacedCalled = false;
            boolean zF = getIsPlaced();
            t10 = this;
            try {
                t10.k2(this.lastPosition, 0.0f, this.lastLayerBlock, this.lastExplicitLayer);
                if (zF && !t10.onNodePlacedCalled && (parent$ui_release = S1().getParent$ui_release()) != null) {
                    LayoutNode.m1(parent$ui_release, false, 1, null);
                }
                t10.relayoutWithoutParentInProgress = false;
            } catch (Throwable th2) {
                th = th2;
                t10.relayoutWithoutParentInProgress = false;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            t10 = this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NodeCoordinator J1() {
        return this.layoutNodeLayoutDelegate.A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutNode S1() {
        return this.layoutNodeLayoutDelegate.getLayoutNode();
    }

    private final void Y1() {
        a aVar = this._placedState;
        if (s1()) {
            this._placedState = a.f51623b;
        } else {
            this._placedState = a.f51622a;
        }
        if (aVar != a.f51622a && this.layoutNodeLayoutDelegate.getLookaheadMeasurePending()) {
            LayoutNode.o1(S1(), true, false, false, 6, null);
        }
        D0.c<LayoutNode> cVarT0 = S1().t0();
        LayoutNode[] layoutNodeArr = cVarT0.content;
        int size = cVarT0.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            LayoutNode layoutNode = layoutNodeArr[i10];
            T tA0 = layoutNode.a0();
            if (tA0 == null) {
                throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
            }
            if (tA0.placeOrder != Integer.MAX_VALUE) {
                tA0.Y1();
                layoutNode.t1(layoutNode);
            }
        }
    }

    private final void o2(boolean z10) {
        this.layoutNodeLayoutDelegate.U(z10);
    }

    private final void p2(boolean z10) {
        this.layoutNodeLayoutDelegate.V(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q1() {
        this.layoutNodeLayoutDelegate.X(0);
        D0.c<LayoutNode> cVarT0 = S1().t0();
        LayoutNode[] layoutNodeArr = cVarT0.content;
        int size = cVarT0.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            T tV = layoutNodeArr[i10].getLayoutDelegate().getLookaheadPassDelegate();
            Intrinsics.g(tV);
            tV.previousPlaceOrder = tV.placeOrder;
            tV.placeOrder = a.e.API_PRIORITY_OTHER;
            if (tV.measuredByParent == LayoutNode.g.f51474b) {
                tV.measuredByParent = LayoutNode.g.f51475c;
            }
        }
    }

    private final void q2(LayoutNode.e eVar) {
        this.layoutNodeLayoutDelegate.R(eVar);
    }

    private final void r2(boolean z10) {
        this.layoutNodeLayoutDelegate.W(z10);
    }

    private final boolean s1() {
        return this.layoutNodeLayoutDelegate.getDetachedFromParentLookaheadPlacement();
    }

    private final boolean w1() {
        return this.layoutNodeLayoutDelegate.getLookaheadLayoutPending();
    }

    private final boolean x1() {
        return this.layoutNodeLayoutDelegate.getLookaheadLayoutPendingForAlignment();
    }

    private final LayoutNode.e y1() {
        return this.layoutNodeLayoutDelegate.getLayoutState();
    }

    /* renamed from: A1, reason: from getter */
    public final LayoutNode.g getMeasuredByParent() {
        return this.measuredByParent;
    }

    @Override // androidx.compose.ui.node.InterfaceC5943b
    public Map<AbstractC5916a, Integer> B() {
        if (!this.duringAlignmentLinesQuery) {
            if (y1() == LayoutNode.e.f51466b) {
                getAlignmentLines().s(true);
                if (getAlignmentLines().getDirty()) {
                    this.layoutNodeLayoutDelegate.F();
                }
            } else {
                getAlignmentLines().r(true);
            }
        }
        S lookaheadDelegate = Y().getLookaheadDelegate();
        if (lookaheadDelegate != null) {
            lookaheadDelegate.V1(true);
        }
        U();
        S lookaheadDelegate2 = Y().getLookaheadDelegate();
        if (lookaheadDelegate2 != null) {
            lookaheadDelegate2.V1(false);
        }
        return getAlignmentLines().h();
    }

    /* renamed from: M1, reason: from getter */
    public final boolean getPlacedOnce() {
        return this.placedOnce;
    }

    public final void X1(boolean inLookahead) {
        if (inLookahead && s1()) {
            return;
        }
        if (inLookahead || s1()) {
            this._placedState = a.f51624c;
            D0.c<LayoutNode> cVarT0 = S1().t0();
            LayoutNode[] layoutNodeArr = cVarT0.content;
            int size = cVarT0.getSize();
            for (int i10 = 0; i10 < size; i10++) {
                T tV = layoutNodeArr[i10].getLayoutDelegate().getLookaheadPassDelegate();
                Intrinsics.g(tV);
                tV.X1(true);
            }
        }
    }

    public final void Z1() {
        if (this.layoutNodeLayoutDelegate.getChildrenAccessingLookaheadCoordinatesDuringPlacement() > 0) {
            D0.c<LayoutNode> cVarT0 = S1().t0();
            LayoutNode[] layoutNodeArr = cVarT0.content;
            int size = cVarT0.getSize();
            for (int i10 = 0; i10 < size; i10++) {
                LayoutNode layoutNode = layoutNodeArr[i10];
                M layoutDelegate = layoutNode.getLayoutDelegate();
                if ((layoutDelegate.getLookaheadCoordinatesAccessedDuringPlacement() || layoutDelegate.getLookaheadCoordinatesAccessedDuringModifierPlacement()) && !layoutDelegate.getLookaheadLayoutPending()) {
                    LayoutNode.m1(layoutNode, false, 1, null);
                }
                T tV = layoutDelegate.getLookaheadPassDelegate();
                if (tV != null) {
                    tV.Z1();
                }
            }
        }
    }

    @Override // androidx.compose.ui.layout.L, androidx.compose.ui.layout.r
    /* renamed from: a, reason: from getter */
    public Object getParentData() {
        return this.parentData;
    }

    public final void c2() {
        this._placedState = a.f51622a;
    }

    @Override // androidx.compose.ui.node.InterfaceC5943b
    /* renamed from: f */
    public boolean getIsPlaced() {
        return this._placedState != a.f51624c;
    }

    public final void j2(long constraints) {
        q2(LayoutNode.e.f51466b);
        r2(false);
        OwnerSnapshotObserver.h(L.b(S1()).getSnapshotObserver(), S1(), false, new d(constraints), 2, null);
        V1();
        if (N.a(S1())) {
            z1().c2();
        } else {
            z1().e2();
        }
        q2(LayoutNode.e.f51469e);
    }

    public final void n2(boolean z10) {
        this.childDelegatesDirty = z10;
    }

    @Override // androidx.compose.ui.node.InterfaceC5943b
    /* renamed from: r, reason: from getter */
    public AbstractC5941a getAlignmentLines() {
        return this.alignmentLines;
    }

    public final void s2(LayoutNode.g gVar) {
        this.measuredByParent = gVar;
    }

    public final void t2(int i10) {
        this.placeOrder = i10;
    }

    /* renamed from: u1, reason: from getter */
    public final H1.b getLookaheadConstraints() {
        return this.lookaheadConstraints;
    }

    public void u2(boolean z10) {
        this.isPlacedUnderMotionFrameOfReference = z10;
    }

    /* renamed from: v1, reason: from getter */
    public final boolean getLayingOutChildren() {
        return this.layingOutChildren;
    }

    public final V z1() {
        return this.layoutNodeLayoutDelegate.getMeasurePassDelegate();
    }

    public T(M m10) {
        this.layoutNodeLayoutDelegate = m10;
    }

    private final void e2() {
        D0.c<LayoutNode> cVarT0 = S1().t0();
        LayoutNode[] layoutNodeArr = cVarT0.content;
        int size = cVarT0.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            LayoutNode layoutNode = layoutNodeArr[i10];
            if (layoutNode.Z() && layoutNode.h0() == LayoutNode.g.f51473a) {
                T tV = layoutNode.getLayoutDelegate().getLookaheadPassDelegate();
                Intrinsics.g(tV);
                H1.b bVarL = layoutNode.getLayoutDelegate().l();
                Intrinsics.g(bVarL);
                if (tV.l2(bVarL.getValue())) {
                    LayoutNode.o1(S1(), false, false, false, 7, null);
                }
            }
        }
    }

    private final void g2() {
        LayoutNode.g intrinsicsUsageByParent;
        LayoutNode.o1(S1(), false, false, false, 7, null);
        LayoutNode parent$ui_release = S1().getParent$ui_release();
        if (parent$ui_release != null && S1().getIntrinsicsUsageByParent() == LayoutNode.g.f51475c) {
            LayoutNode layoutNodeS1 = S1();
            int i10 = b.$EnumSwitchMapping$0[parent$ui_release.X().ordinal()];
            if (i10 != 2) {
                if (i10 != 3) {
                    intrinsicsUsageByParent = parent$ui_release.getIntrinsicsUsageByParent();
                } else {
                    intrinsicsUsageByParent = LayoutNode.g.f51474b;
                }
            } else {
                intrinsicsUsageByParent = LayoutNode.g.f51473a;
            }
            layoutNodeS1.A1(intrinsicsUsageByParent);
        }
    }

    private final void k2(long position, float zIndex, Function1<? super androidx.compose.ui.graphics.e, Unit> layerBlock, GraphicsLayer layer) {
        LayoutNode.e eVarX;
        LayoutNode parent$ui_release = S1().getParent$ui_release();
        if (parent$ui_release != null) {
            eVarX = parent$ui_release.X();
        } else {
            eVarX = null;
        }
        LayoutNode.e eVar = LayoutNode.e.f51468d;
        if (eVarX == eVar) {
            this.layoutNodeLayoutDelegate.Q(false);
        }
        if (S1().getIsDeactivated()) {
            C14920a.a("place is called on a deactivated node");
        }
        q2(eVar);
        this.placedOnce = true;
        this.onNodePlacedCalled = false;
        if (!H1.n.j(position, this.lastPosition)) {
            if (this.layoutNodeLayoutDelegate.getLookaheadCoordinatesAccessedDuringModifierPlacement() || this.layoutNodeLayoutDelegate.getLookaheadCoordinatesAccessedDuringPlacement()) {
                o2(true);
            }
            Z1();
        }
        Owner ownerB = L.b(S1());
        if (!w1() && getIsPlaced()) {
            S lookaheadDelegate = J1().getLookaheadDelegate();
            Intrinsics.g(lookaheadDelegate);
            lookaheadDelegate.n2(position);
            i2();
        } else {
            this.layoutNodeLayoutDelegate.S(false);
            getAlignmentLines().r(false);
            OwnerSnapshotObserver.d(ownerB.getSnapshotObserver(), S1(), false, new e(ownerB, position), 2, null);
        }
        this.lastPosition = position;
        this.lastZIndex = zIndex;
        this.lastLayerBlock = layerBlock;
        this.lastExplicitLayer = layer;
        q2(LayoutNode.e.f51469e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m1() {
        D0.c<LayoutNode> cVarT0 = S1().t0();
        LayoutNode[] layoutNodeArr = cVarT0.content;
        int size = cVarT0.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            T tV = layoutNodeArr[i10].getLayoutDelegate().getLookaheadPassDelegate();
            Intrinsics.g(tV);
            int i11 = tV.previousPlaceOrder;
            int i12 = tV.placeOrder;
            if (i11 != i12 && i12 == Integer.MAX_VALUE) {
                tV.X1(true);
            }
        }
    }

    private final void v2(LayoutNode node) {
        boolean z10;
        LayoutNode.g gVar;
        LayoutNode parent$ui_release = node.getParent$ui_release();
        if (parent$ui_release != null) {
            if (this.measuredByParent != LayoutNode.g.f51475c && !node.getCanMultiMeasure()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                C14920a.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int i10 = b.$EnumSwitchMapping$0[parent$ui_release.X().ordinal()];
            if (i10 != 1 && i10 != 2) {
                if (i10 != 3 && i10 != 4) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + parent$ui_release.X());
                }
                gVar = LayoutNode.g.f51474b;
            } else {
                gVar = LayoutNode.g.f51473a;
            }
            this.measuredByParent = gVar;
            return;
        }
        this.measuredByParent = LayoutNode.g.f51475c;
    }

    @Override // androidx.compose.ui.layout.r
    public int A(int width) {
        g2();
        S lookaheadDelegate = J1().getLookaheadDelegate();
        Intrinsics.g(lookaheadDelegate);
        return lookaheadDelegate.A(width);
    }

    public final boolean E1() {
        if (N.a(S1())) {
            return true;
        }
        if (this._placedState == a.f51624c && !this.layoutNodeLayoutDelegate.getDetachedFromParentLookaheadPass()) {
            this.layoutNodeLayoutDelegate.Q(true);
        }
        return s1();
    }

    @Override // androidx.compose.ui.layout.f0
    public int J0() {
        S lookaheadDelegate = J1().getLookaheadDelegate();
        Intrinsics.g(lookaheadDelegate);
        return lookaheadDelegate.J0();
    }

    @Override // androidx.compose.ui.node.InterfaceC5943b
    public InterfaceC5943b M() {
        M layoutDelegate;
        LayoutNode parent$ui_release = S1().getParent$ui_release();
        if (parent$ui_release != null && (layoutDelegate = parent$ui_release.getLayoutDelegate()) != null) {
            return layoutDelegate.p();
        }
        return null;
    }

    @Override // androidx.compose.ui.layout.f0
    public int M0() {
        S lookaheadDelegate = J1().getLookaheadDelegate();
        Intrinsics.g(lookaheadDelegate);
        return lookaheadDelegate.M0();
    }

    @Override // androidx.compose.ui.node.Z
    public void R(boolean newMFR) {
        Boolean boolValueOf;
        S lookaheadDelegate;
        S lookaheadDelegate2 = J1().getLookaheadDelegate();
        if (lookaheadDelegate2 != null) {
            boolValueOf = Boolean.valueOf(lookaheadDelegate2.getIsPlacedUnderMotionFrameOfReference());
        } else {
            boolValueOf = null;
        }
        if (!Intrinsics.e(Boolean.valueOf(newMFR), boolValueOf) && (lookaheadDelegate = J1().getLookaheadDelegate()) != null) {
            lookaheadDelegate.T1(newMFR);
        }
        u2(newMFR);
    }

    public final void R1(boolean forceRequest) {
        LayoutNode layoutNode;
        LayoutNode parent$ui_release = S1().getParent$ui_release();
        LayoutNode.g intrinsicsUsageByParent = S1().getIntrinsicsUsageByParent();
        if (parent$ui_release != null && intrinsicsUsageByParent != LayoutNode.g.f51475c) {
            do {
                layoutNode = parent$ui_release;
                if (layoutNode.getIntrinsicsUsageByParent() != intrinsicsUsageByParent) {
                    break;
                } else {
                    parent$ui_release = layoutNode.getParent$ui_release();
                }
            } while (parent$ui_release != null);
            int i10 = b.$EnumSwitchMapping$1[intrinsicsUsageByParent.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    if (layoutNode.getLookaheadRoot() != null) {
                        layoutNode.l1(forceRequest);
                        return;
                    } else {
                        layoutNode.p1(forceRequest);
                        return;
                    }
                }
                throw new IllegalStateException("Intrinsics isn't used by the parent");
            }
            if (layoutNode.getLookaheadRoot() != null) {
                LayoutNode.o1(layoutNode, forceRequest, false, false, 6, null);
            } else {
                LayoutNode.s1(layoutNode, forceRequest, false, false, 6, null);
            }
        }
    }

    @Override // androidx.compose.ui.layout.r
    public int W(int width) {
        g2();
        S lookaheadDelegate = J1().getLookaheadDelegate();
        Intrinsics.g(lookaheadDelegate);
        return lookaheadDelegate.W(width);
    }

    @Override // androidx.compose.ui.node.InterfaceC5943b
    public NodeCoordinator Y() {
        return S1().P();
    }

    @Override // androidx.compose.ui.layout.r
    public int d0(int height) {
        g2();
        S lookaheadDelegate = J1().getLookaheadDelegate();
        Intrinsics.g(lookaheadDelegate);
        return lookaheadDelegate.d0(height);
    }

    public final void h2() {
        this.placeOrder = a.e.API_PRIORITY_OTHER;
        this.previousPlaceOrder = a.e.API_PRIORITY_OTHER;
        this._placedState = a.f51624c;
    }

    @Override // androidx.compose.ui.layout.r
    public int j0(int height) {
        g2();
        S lookaheadDelegate = J1().getLookaheadDelegate();
        Intrinsics.g(lookaheadDelegate);
        return lookaheadDelegate.j0(height);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    @Override // androidx.compose.ui.layout.I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.compose.ui.layout.f0 k0(long r4) {
        /*
            r3 = this;
            androidx.compose.ui.node.LayoutNode r0 = r3.S1()
            androidx.compose.ui.node.LayoutNode r0 = r0.getParent$ui_release()
            r1 = 0
            if (r0 == 0) goto L10
            androidx.compose.ui.node.LayoutNode$e r0 = r0.X()
            goto L11
        L10:
            r0 = r1
        L11:
            androidx.compose.ui.node.LayoutNode$e r2 = androidx.compose.ui.node.LayoutNode.e.f51466b
            if (r0 == r2) goto L27
            androidx.compose.ui.node.LayoutNode r0 = r3.S1()
            androidx.compose.ui.node.LayoutNode r0 = r0.getParent$ui_release()
            if (r0 == 0) goto L23
            androidx.compose.ui.node.LayoutNode$e r1 = r0.X()
        L23:
            androidx.compose.ui.node.LayoutNode$e r0 = androidx.compose.ui.node.LayoutNode.e.f51468d
            if (r1 != r0) goto L2d
        L27:
            androidx.compose.ui.node.M r0 = r3.layoutNodeLayoutDelegate
            r1 = 0
            r0.P(r1)
        L2d:
            androidx.compose.ui.node.LayoutNode r0 = r3.S1()
            r3.v2(r0)
            androidx.compose.ui.node.LayoutNode r0 = r3.S1()
            androidx.compose.ui.node.LayoutNode$g r0 = r0.getIntrinsicsUsageByParent()
            androidx.compose.ui.node.LayoutNode$g r1 = androidx.compose.ui.node.LayoutNode.g.f51475c
            if (r0 != r1) goto L47
            androidx.compose.ui.node.LayoutNode r0 = r3.S1()
            r0.w()
        L47:
            r3.l2(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.T.k0(long):androidx.compose.ui.layout.f0");
    }

    @Override // androidx.compose.ui.layout.L
    public int l0(AbstractC5916a alignmentLine) {
        LayoutNode.e eVarX;
        LayoutNode parent$ui_release = S1().getParent$ui_release();
        LayoutNode.e eVarX2 = null;
        if (parent$ui_release != null) {
            eVarX = parent$ui_release.X();
        } else {
            eVarX = null;
        }
        if (eVarX == LayoutNode.e.f51466b) {
            getAlignmentLines().u(true);
        } else {
            LayoutNode parent$ui_release2 = S1().getParent$ui_release();
            if (parent$ui_release2 != null) {
                eVarX2 = parent$ui_release2.X();
            }
            if (eVarX2 == LayoutNode.e.f51468d) {
                getAlignmentLines().t(true);
            }
        }
        this.duringAlignmentLinesQuery = true;
        S lookaheadDelegate = J1().getLookaheadDelegate();
        Intrinsics.g(lookaheadDelegate);
        int iL0 = lookaheadDelegate.l0(alignmentLine);
        this.duringAlignmentLinesQuery = false;
        return iL0;
    }

    public final boolean l2(long constraints) {
        boolean z10;
        long jC;
        boolean z11;
        boolean zF;
        if (S1().getIsDeactivated()) {
            C14920a.a("measure is called on a deactivated node");
        }
        LayoutNode parent$ui_release = S1().getParent$ui_release();
        LayoutNode layoutNodeS1 = S1();
        if (!S1().getCanMultiMeasure() && (parent$ui_release == null || !parent$ui_release.getCanMultiMeasure())) {
            z10 = false;
        } else {
            z10 = true;
        }
        layoutNodeS1.w1(z10);
        if (!S1().Z()) {
            H1.b bVar = this.lookaheadConstraints;
            if (bVar == null) {
                zF = false;
            } else {
                zF = H1.b.f(bVar.getValue(), constraints);
            }
            if (zF) {
                Owner owner = S1().getOwner();
                if (owner != null) {
                    owner.k(S1(), true);
                }
                S1().v1();
                return false;
            }
        }
        this.lookaheadConstraints = H1.b.a(constraints);
        b1(constraints);
        getAlignmentLines().s(false);
        o0(f.f51636f);
        if (this.measuredOnce) {
            jC = getMeasuredSize();
        } else {
            long j10 = Integer.MIN_VALUE;
            jC = H1.r.c((j10 & 4294967295L) | (j10 << 32));
        }
        this.measuredOnce = true;
        S lookaheadDelegate = J1().getLookaheadDelegate();
        if (lookaheadDelegate != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            C14920a.b("Lookahead result from lookaheadRemeasure cannot be null");
        }
        this.layoutNodeLayoutDelegate.J(constraints);
        Z0(H1.r.c((lookaheadDelegate.getHeight() & 4294967295L) | (lookaheadDelegate.getWidth() << 32)));
        if (((int) (jC >> 32)) != lookaheadDelegate.getWidth() || ((int) (jC & 4294967295L)) != lookaheadDelegate.getHeight()) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.InterfaceC5943b
    public void o0(Function1<? super InterfaceC5943b, Unit> block) {
        D0.c<LayoutNode> cVarT0 = S1().t0();
        LayoutNode[] layoutNodeArr = cVarT0.content;
        int size = cVarT0.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC5943b interfaceC5943bP = layoutNodeArr[i10].getLayoutDelegate().p();
            Intrinsics.g(interfaceC5943bP);
            block.invoke(interfaceC5943bP);
        }
    }

    public final List<T> r1() {
        S1().I();
        if (!this.childDelegatesDirty) {
            return this._childDelegates.i();
        }
        LayoutNode layoutNodeS1 = S1();
        D0.c<T> cVar = this._childDelegates;
        D0.c<LayoutNode> cVarT0 = layoutNodeS1.t0();
        LayoutNode[] layoutNodeArr = cVarT0.content;
        int size = cVarT0.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            LayoutNode layoutNode = layoutNodeArr[i10];
            if (cVar.getSize() <= i10) {
                T tV = layoutNode.getLayoutDelegate().getLookaheadPassDelegate();
                Intrinsics.g(tV);
                cVar.c(tV);
            } else {
                T tV2 = layoutNode.getLayoutDelegate().getLookaheadPassDelegate();
                Intrinsics.g(tV2);
                cVar.y(i10, tV2);
            }
        }
        cVar.v(layoutNodeS1.I().size(), cVar.getSize());
        this.childDelegatesDirty = false;
        return this._childDelegates.i();
    }

    @Override // androidx.compose.ui.node.InterfaceC5943b
    public void requestLayout() {
        LayoutNode.m1(S1(), false, 1, null);
    }

    @Override // androidx.compose.ui.node.InterfaceC5943b
    public void t0() {
        LayoutNode.o1(S1(), false, false, false, 7, null);
    }

    public final boolean w2() {
        if (getParentData() == null) {
            S lookaheadDelegate = J1().getLookaheadDelegate();
            Intrinsics.g(lookaheadDelegate);
            if (lookaheadDelegate.getParentData() == null) {
                return false;
            }
        }
        if (!this.parentDataDirty) {
            return false;
        }
        this.parentDataDirty = false;
        S lookaheadDelegate2 = J1().getLookaheadDelegate();
        Intrinsics.g(lookaheadDelegate2);
        this.parentData = lookaheadDelegate2.getParentData();
        return true;
    }
}
