package androidx.compose.ui.node;

import Q0.InterfaceC4655l;
import V0.InterfaceC5453d1;
import android.view.View;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.platform.D1;
import androidx.compose.ui.platform.H1;
import androidx.compose.ui.platform.InterfaceC5994f1;
import androidx.compose.ui.platform.InterfaceC5998h;
import androidx.compose.ui.platform.InterfaceC6026q0;
import androidx.compose.ui.platform.InterfaceC6028r0;
import androidx.compose.ui.platform.Q1;
import androidx.compose.ui.platform.W1;
import c1.InterfaceC6470a;
import d1.InterfaceC13593b;
import kotlin.AbstractC18269l;
import kotlin.InterfaceC18268k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import r1.C16822p;

@Metadata(d1 = {"\u0000ê\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u0000 È\u00012\u00020\u0001:\u0003\u001bÉ\u0001J5\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u000eJ\u001a\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H&ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0013H&ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0019\u0010\u000eJ\u0019\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\u0004H&¢\u0006\u0004\b\u001b\u0010\u001cJ\"\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001dH&ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J!\u0010!\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b!\u0010\"Jm\u00100\u001a\u00020/28\u0010*\u001a4\u0012\u0013\u0012\u00110$¢\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b('\u0012\u0015\u0012\u0013\u0018\u00010(¢\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b()\u0012\u0004\u0012\u00020\b0#2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\b0+2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010(2\b\b\u0002\u0010.\u001a\u00020\u0004H&¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\bH&¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b4\u0010\u000eJ\u0017\u00105\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b5\u0010\u000eJ\u001f\u00108\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b8\u00109J\u001f\u0010:\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b:\u00109J\u001b\u0010>\u001a\u00020\b2\n\u0010=\u001a\u00060;j\u0002`<H'¢\u0006\u0004\b>\u0010?J\u001d\u0010A\u001a\u00020\b2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\b0+H&¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\bH&¢\u0006\u0004\bC\u00103J\u0017\u0010E\u001a\u00020\b2\u0006\u0010@\u001a\u00020DH&¢\u0006\u0004\bE\u0010FJ9\u0010M\u001a\u00020I2'\u0010L\u001a#\b\u0001\u0012\u0004\u0012\u00020G\u0012\n\u0012\b\u0012\u0004\u0012\u00020I0H\u0012\u0006\u0012\u0004\u0018\u00010J0#¢\u0006\u0002\bKH¦@¢\u0006\u0004\bM\u0010NR\u0014\u0010Q\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0014\u0010U\u001a\u00020R8&X¦\u0004¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0014\u0010Y\u001a\u00020V8&X¦\u0004¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0014\u0010]\u001a\u00020Z8&X¦\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0014\u0010a\u001a\u00020^8&X¦\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`R\u0014\u0010e\u001a\u00020b8&X¦\u0004¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0014\u0010i\u001a\u00020f8&X¦\u0004¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0014\u0010m\u001a\u00020j8&X¦\u0004¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0014\u0010q\u001a\u00020n8&X¦\u0004¢\u0006\u0006\u001a\u0004\bo\u0010pR\u0014\u0010u\u001a\u00020r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bs\u0010tR\u0016\u0010y\u001a\u0004\u0018\u00010v8&X¦\u0004¢\u0006\u0006\u001a\u0004\bw\u0010xR\u0016\u0010}\u001a\u0004\u0018\u00010z8&X¦\u0004¢\u0006\u0006\u001a\u0004\b{\u0010|R\u0016\u0010\u0081\u0001\u001a\u00020~8&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0018\u0010\u0085\u0001\u001a\u00030\u0082\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0018\u0010\u0089\u0001\u001a\u00030\u0086\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u008d\u0001\u001a\u00030\u008a\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0018\u0010\u0091\u0001\u001a\u00030\u008e\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0018\u0010\u0095\u0001\u001a\u00030\u0092\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0018\u0010\u0099\u0001\u001a\u00030\u0096\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0018\u0010\u009d\u0001\u001a\u00030\u009a\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\u001f\u0010¢\u0001\u001a\u00030\u009e\u00018&X§\u0004¢\u0006\u000f\u0012\u0005\b¡\u0001\u00103\u001a\u0006\b\u009f\u0001\u0010 \u0001R\u0018\u0010¦\u0001\u001a\u00030£\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b¤\u0001\u0010¥\u0001R\u0018\u0010ª\u0001\u001a\u00030§\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b¨\u0001\u0010©\u0001R)\u0010¯\u0001\u001a\u00020\u00042\u0007\u0010«\u0001\u001a\u00020\u00048&@gX¦\u000e¢\u0006\u000f\u001a\u0006\b¬\u0001\u0010\u00ad\u0001\"\u0005\b®\u0001\u0010\u001cR\u0018\u0010³\u0001\u001a\u00030°\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b±\u0001\u0010²\u0001R\u0018\u0010·\u0001\u001a\u00030´\u00018&X¦\u0004¢\u0006\b\u001a\u0006\bµ\u0001\u0010¶\u0001R\u0018\u0010»\u0001\u001a\u00030¸\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b¹\u0001\u0010º\u0001R\u0018\u0010¿\u0001\u001a\u00030¼\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b½\u0001\u0010¾\u0001R\u0018\u0010Ã\u0001\u001a\u00030À\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÁ\u0001\u0010Â\u0001R\u0018\u0010Ç\u0001\u001a\u00030Ä\u00018&X¦\u0004¢\u0006\b\u001a\u0006\bÅ\u0001\u0010Æ\u0001ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006Ê\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/Owner;", "Lg1/P;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "", "affectsLookahead", "forceRequest", "scheduleMeasureAndLayout", "", "A", "(Landroidx/compose/ui/node/LayoutNode;ZZZ)V", "c", "(Landroidx/compose/ui/node/LayoutNode;ZZ)V", "f", "(Landroidx/compose/ui/node/LayoutNode;)V", "node", "v", "o", "B", "LU0/f;", "localPosition", "e", "(J)J", "positionInWindow", "y", "r", "sendPointerUpdate", "a", "(Z)V", "LH1/b;", "constraints", "x", "(Landroidx/compose/ui/node/LayoutNode;J)V", "k", "(Landroidx/compose/ui/node/LayoutNode;Z)V", "Lkotlin/Function2;", "Landroidx/compose/ui/graphics/Canvas;", "Lkotlin/ParameterName;", "name", "canvas", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "parentLayer", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "explicitLayer", "forceUseOldLayers", "Landroidx/compose/ui/node/OwnedLayer;", "u", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/graphics/layer/GraphicsLayer;Z)Landroidx/compose/ui/node/OwnedLayer;", "E", "()V", "i", "F", "", "oldSemanticsId", "h", "(Landroidx/compose/ui/node/LayoutNode;I)V", "g", "Landroid/view/View;", "Landroidx/compose/ui/viewinterop/InteropView;", "view", "j", "(Landroid/view/View;)V", "listener", "C", "(Lkotlin/jvm/functions/Function0;)V", "D", "Landroidx/compose/ui/node/Owner$b;", "t", "(Landroidx/compose/ui/node/Owner$b;)V", "Landroidx/compose/ui/platform/f1;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "session", "w", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", "root", "Landroidx/compose/ui/node/J;", "getSharedDrawScope", "()Landroidx/compose/ui/node/J;", "sharedDrawScope", "Lc1/a;", "getHapticFeedBack", "()Lc1/a;", "hapticFeedBack", "Ld1/b;", "getInputModeManager", "()Ld1/b;", "inputModeManager", "Landroidx/compose/ui/platform/r0;", "getClipboardManager", "()Landroidx/compose/ui/platform/r0;", "clipboardManager", "Landroidx/compose/ui/platform/q0;", "getClipboard", "()Landroidx/compose/ui/platform/q0;", "clipboard", "Landroidx/compose/ui/platform/h;", "getAccessibilityManager", "()Landroidx/compose/ui/platform/h;", "accessibilityManager", "LV0/d1;", "getGraphicsContext", "()LV0/d1;", "graphicsContext", "Landroidx/compose/ui/platform/H1;", "getTextToolbar", "()Landroidx/compose/ui/platform/H1;", "textToolbar", "LQ0/J;", "getAutofillTree", "()LQ0/J;", "autofillTree", "LQ0/l;", "getAutofill", "()LQ0/l;", "autofill", "LQ0/H;", "getAutofillManager", "()LQ0/H;", "autofillManager", "LH1/d;", "getDensity", "()LH1/d;", "density", "Lz1/O;", "getTextInputService", "()Lz1/O;", "textInputService", "Landroidx/compose/ui/platform/D1;", "getSoftwareKeyboardController", "()Landroidx/compose/ui/platform/D1;", "softwareKeyboardController", "Lg1/y;", "getPointerIconService", "()Lg1/y;", "pointerIconService", "Lr1/p;", "getSemanticsOwner", "()Lr1/p;", "semanticsOwner", "Landroidx/compose/ui/focus/s;", "getFocusOwner", "()Landroidx/compose/ui/focus/s;", "focusOwner", "Landroidx/compose/ui/platform/W1;", "getWindowInfo", "()Landroidx/compose/ui/platform/W1;", "windowInfo", "Ls1/b;", "getRectManager", "()Ls1/b;", "rectManager", "Ly1/k$b;", "getFontLoader", "()Ly1/k$b;", "getFontLoader$annotations", "fontLoader", "Ly1/l$b;", "getFontFamilyResolver", "()Ly1/l$b;", "fontFamilyResolver", "LH1/t;", "getLayoutDirection", "()LH1/t;", "layoutDirection", "<set-?>", "getShowLayoutBounds", "()Z", "setShowLayoutBounds", "showLayoutBounds", "Landroidx/compose/ui/platform/Q1;", "getViewConfiguration", "()Landroidx/compose/ui/platform/Q1;", "viewConfiguration", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "snapshotObserver", "Lk1/f;", "getModifierLocalManager", "()Lk1/f;", "modifierLocalManager", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Landroidx/compose/ui/layout/f0$a;", "getPlacementScope", "()Landroidx/compose/ui/layout/f0$a;", "placementScope", "LS0/c;", "getDragAndDropManager", "()LS0/c;", "dragAndDropManager", "Z2", "b", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Owner extends g1.P {

    /* renamed from: Z2, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f51555a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Landroidx/compose/ui/node/Owner$a;", "", "<init>", "()V", "", "b", "Z", "a", "()Z", "setEnableExtraAssertions", "(Z)V", "enableExtraAssertions", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.node.Owner$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f51555a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static boolean enableExtraAssertions;

        public final boolean a() {
            return enableExtraAssertions;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/Owner$b;", "", "", "j", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
        void j();
    }

    void A(LayoutNode layoutNode, boolean affectsLookahead, boolean forceRequest, boolean scheduleMeasureAndLayout);

    void B(LayoutNode node);

    void C(Function0<Unit> listener);

    void D();

    void E();

    void F(LayoutNode layoutNode);

    void a(boolean sendPointerUpdate);

    void c(LayoutNode layoutNode, boolean affectsLookahead, boolean forceRequest);

    long e(long localPosition);

    void f(LayoutNode layoutNode);

    default void g(LayoutNode layoutNode, int oldSemanticsId) {
    }

    InterfaceC5998h getAccessibilityManager();

    InterfaceC4655l getAutofill();

    Q0.H getAutofillManager();

    Q0.J getAutofillTree();

    InterfaceC6026q0 getClipboard();

    InterfaceC6028r0 getClipboardManager();

    CoroutineContext getCoroutineContext();

    H1.d getDensity();

    S0.c getDragAndDropManager();

    androidx.compose.ui.focus.s getFocusOwner();

    AbstractC18269l.b getFontFamilyResolver();

    InterfaceC18268k.b getFontLoader();

    InterfaceC5453d1 getGraphicsContext();

    InterfaceC6470a getHapticFeedBack();

    InterfaceC13593b getInputModeManager();

    H1.t getLayoutDirection();

    k1.f getModifierLocalManager();

    g1.y getPointerIconService();

    s1.b getRectManager();

    LayoutNode getRoot();

    C16822p getSemanticsOwner();

    J getSharedDrawScope();

    boolean getShowLayoutBounds();

    OwnerSnapshotObserver getSnapshotObserver();

    D1 getSoftwareKeyboardController();

    z1.O getTextInputService();

    H1 getTextToolbar();

    Q1 getViewConfiguration();

    W1 getWindowInfo();

    default void h(LayoutNode layoutNode, int oldSemanticsId) {
    }

    void i(LayoutNode layoutNode);

    void j(View view);

    void k(LayoutNode layoutNode, boolean affectsLookahead);

    void o(LayoutNode node);

    void r(LayoutNode node);

    void setShowLayoutBounds(boolean z10);

    void t(b listener);

    OwnedLayer u(Function2<? super Canvas, ? super GraphicsLayer, Unit> drawBlock, Function0<Unit> invalidateParentLayer, GraphicsLayer explicitLayer, boolean forceUseOldLayers);

    void v(LayoutNode node);

    Object w(Function2<? super InterfaceC5994f1, ? super Continuation<?>, ? extends Object> function2, Continuation<?> continuation);

    void x(LayoutNode layoutNode, long constraints);

    long y(long positionInWindow);

    static /* synthetic */ void G(Owner owner, LayoutNode layoutNode, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestMeasure");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        if ((i10 & 8) != 0) {
            z12 = true;
        }
        owner.A(layoutNode, z10, z11, z12);
    }

    static /* synthetic */ void b(Owner owner, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: measureAndLayout");
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        owner.a(z10);
    }

    static /* synthetic */ void d(Owner owner, LayoutNode layoutNode, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestRelayout");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        owner.c(layoutNode, z10, z11);
    }

    static /* synthetic */ OwnedLayer m(Owner owner, Function2 function2, Function0 function0, GraphicsLayer graphicsLayer, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLayer");
        }
        if ((i10 & 4) != 0) {
            graphicsLayer = null;
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return owner.u(function2, function0, graphicsLayer, z10);
    }

    static /* synthetic */ void n(Owner owner, LayoutNode layoutNode, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forceMeasureTheSubtree");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        owner.k(layoutNode, z10);
    }

    default f0.a getPlacementScope() {
        return androidx.compose.ui.layout.g0.b(this);
    }
}
