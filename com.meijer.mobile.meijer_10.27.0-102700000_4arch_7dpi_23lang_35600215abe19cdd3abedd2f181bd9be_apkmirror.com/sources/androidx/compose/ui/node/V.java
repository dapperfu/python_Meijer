package androidx.compose.ui.node;

import H1.n;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.AbstractC5774a;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.node.LayoutNode;
import com.google.android.gms.common.api.a;
import j1.C14832a;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010$\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000bJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012JG\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0019\u0010\u001a\u001a\u0015\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t\u0018\u00010\u0017¢\u0006\u0002\b\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJG\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0019\u0010\u001a\u001a\u0015\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t\u0018\u00010\u0017¢\u0006\u0002\b\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010 \u001a\u00020\tH\u0002¢\u0006\u0004\b \u0010\u000bJ\u000f\u0010!\u001a\u00020\tH\u0002¢\u0006\u0004\b!\u0010\u000bJ\u000f\u0010\"\u001a\u00020\tH\u0000¢\u0006\u0004\b\"\u0010\u000bJ\u000f\u0010#\u001a\u00020\tH\u0016¢\u0006\u0004\b#\u0010\u000bJ\u000f\u0010$\u001a\u00020\tH\u0000¢\u0006\u0004\b$\u0010\u000bJ\u001a\u0010'\u001a\u00020\t2\u0006\u0010&\u001a\u00020%H\u0000ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u001a\u0010)\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%H\u0016ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u0018\u0010,\u001a\u00020+2\u0006\u0010&\u001a\u00020%ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u0018\u00101\u001a\u0002002\u0006\u0010/\u001a\u00020.H\u0096\u0002¢\u0006\u0004\b1\u00102J=\u00103\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0019\u0010\u001a\u001a\u0015\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t\u0018\u00010\u0017¢\u0006\u0002\b\u0019H\u0014ø\u0001\u0000¢\u0006\u0004\b3\u00104J*\u00105\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001bH\u0014ø\u0001\u0000¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\t2\u0006\u00107\u001a\u00020+H\u0016¢\u0006\u0004\b8\u00109J\r\u0010:\u001a\u00020\t¢\u0006\u0004\b:\u0010\u000bJ\u0017\u0010<\u001a\u0002002\u0006\u0010;\u001a\u000200H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u0002002\u0006\u0010;\u001a\u000200H\u0016¢\u0006\u0004\b>\u0010=J\u0017\u0010@\u001a\u0002002\u0006\u0010?\u001a\u000200H\u0016¢\u0006\u0004\b@\u0010=J\u0017\u0010A\u001a\u0002002\u0006\u0010?\u001a\u000200H\u0016¢\u0006\u0004\bA\u0010=J\r\u0010B\u001a\u00020\t¢\u0006\u0004\bB\u0010\u000bJ\r\u0010C\u001a\u00020+¢\u0006\u0004\bC\u0010DJ\u001b\u0010F\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u0002000EH\u0016¢\u0006\u0004\bF\u0010GJ#\u0010I\u001a\u00020\t2\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0017H\u0016¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\tH\u0016¢\u0006\u0004\bK\u0010\u000bJ\u000f\u0010L\u001a\u00020\tH\u0016¢\u0006\u0004\bL\u0010\u000bJ\r\u0010M\u001a\u00020\t¢\u0006\u0004\bM\u0010\u000bJ\u0015\u0010O\u001a\u00020\t2\u0006\u0010N\u001a\u00020+¢\u0006\u0004\bO\u00109J\r\u0010P\u001a\u00020\t¢\u0006\u0004\bP\u0010\u000bJ\r\u0010Q\u001a\u00020\t¢\u0006\u0004\bQ\u0010\u000bJ\u000f\u0010R\u001a\u00020\tH\u0000¢\u0006\u0004\bR\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010W\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR$\u0010]\u001a\u0002002\u0006\u0010X\u001a\u0002008\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R$\u0010`\u001a\u0002002\u0006\u0010X\u001a\u0002008\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b^\u0010Z\u001a\u0004\b_\u0010\\R\u0016\u0010b\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010VR\u0016\u0010d\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010VR\"\u0010l\u001a\u00020e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\"\u0010p\u001a\u00020+8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bm\u0010V\u001a\u0004\bn\u0010D\"\u0004\bo\u00109R*\u0010u\u001a\u00020\u00132\u0006\u0010X\u001a\u00020\u00138\u0000@BX\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bs\u0010tR)\u0010x\u001a\u0015\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t\u0018\u00010\u0017¢\u0006\u0002\b\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u0018\u0010{\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR\u0016\u0010~\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R\u0017\u0010\u0080\u0001\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u007f\u0010VR/\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0081\u00012\t\u0010X\u001a\u0005\u0018\u00010\u0081\u00018\u0016@RX\u0096\u000e¢\u0006\u0010\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R-\u0010\u0089\u0001\u001a\u00020+2\u0006\u0010X\u001a\u00020+8\u0016@PX\u0096\u000e¢\u0006\u0014\n\u0005\b\u0087\u0001\u0010V\u001a\u0004\bS\u0010D\"\u0005\b\u0088\u0001\u00109R.\u0010\u008d\u0001\u001a\u00020+2\u0006\u0010X\u001a\u00020+8\u0006@@X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008a\u0001\u0010V\u001a\u0005\b\u008b\u0001\u0010D\"\u0005\b\u008c\u0001\u00109R'\u0010\u0090\u0001\u001a\u00020+2\u0006\u0010X\u001a\u00020+8\u0000@BX\u0080\u000e¢\u0006\u000e\n\u0005\b\u008e\u0001\u0010V\u001a\u0005\b\u008f\u0001\u0010DR'\u0010\u0093\u0001\u001a\u00020+2\u0006\u0010X\u001a\u00020+8\u0000@BX\u0080\u000e¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010V\u001a\u0005\b\u0092\u0001\u0010DR\u0018\u0010\u0095\u0001\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0094\u0001\u0010VR\u001f\u0010\u009a\u0001\u001a\u00030\u0096\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0005\b\u007f\u0010\u0099\u0001R\u001e\u0010\u009e\u0001\u001a\t\u0012\u0004\u0012\u00020\u00000\u009b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R%\u0010¡\u0001\u001a\u00020+8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\bA\u0010V\u001a\u0005\b\u009f\u0001\u0010D\"\u0005\b \u0001\u00109R&\u0010£\u0001\u001a\u00020+2\u0006\u0010X\u001a\u00020+8\u0006@BX\u0086\u000e¢\u0006\r\n\u0004\bF\u0010V\u001a\u0005\b¢\u0001\u0010DR\u001e\u0010¥\u0001\u001a\u00020%8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0007\n\u0005\b¤\u0001\u0010rR&\u0010«\u0001\u001a\t\u0012\u0004\u0012\u00020\t0¦\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b§\u0001\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001R\u001e\u0010\u00ad\u0001\u001a\t\u0012\u0004\u0012\u00020\t0¦\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¬\u0001\u0010¨\u0001R&\u0010\u0016\u001a\u00020\u00152\u0006\u0010X\u001a\u00020\u00158\u0000@BX\u0080\u000e¢\u0006\u000e\n\u0004\b}\u0010}\u001a\u0006\b®\u0001\u0010¯\u0001R\u0018\u0010±\u0001\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b°\u0001\u0010VR+\u0010³\u0001\u001a\u0015\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t\u0018\u00010\u0017¢\u0006\u0002\b\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b²\u0001\u0010wR\u0019\u0010´\u0001\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010zR\u001d\u0010µ\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\br\u0010rR\u0018\u0010·\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¶\u0001\u0010}R\u001e\u0010¹\u0001\u001a\t\u0012\u0004\u0012\u00020\t0¦\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¸\u0001\u0010¨\u0001R\u0018\u0010»\u0001\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bº\u0001\u0010VR&\u0010½\u0001\u001a\u00020+8\u0016@\u0016X\u0096\u000e¢\u0006\u0015\n\u0005\b¼\u0001\u0010V\u001a\u0005\b½\u0001\u0010D\"\u0005\b¾\u0001\u00109R\u001a\u0010Â\u0001\u001a\u0005\u0018\u00010¿\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bÀ\u0001\u0010Á\u0001R\u001c\u0010Å\u0001\u001a\u0004\u0018\u00010%8Fø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\bÃ\u0001\u0010Ä\u0001R\u0014\u0010È\u0001\u001a\u00020\u000f8F¢\u0006\b\u001a\u0006\bÆ\u0001\u0010Ç\u0001R,\u0010Ï\u0001\u001a\u00030É\u00012\b\u0010Ê\u0001\u001a\u00030É\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bË\u0001\u0010Ì\u0001\"\u0006\bÍ\u0001\u0010Î\u0001R\u0015\u0010Ó\u0001\u001a\u00030Ð\u00018F¢\u0006\b\u001a\u0006\bÑ\u0001\u0010Ò\u0001R\u0018\u0010Õ\u0001\u001a\u00030Ð\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÔ\u0001\u0010Ò\u0001R\u001e\u0010Ù\u0001\u001a\t\u0012\u0004\u0012\u00020\u00000Ö\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b×\u0001\u0010Ø\u0001R\u0016\u0010Û\u0001\u001a\u0002008VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÚ\u0001\u0010\\R\u0016\u0010Ý\u0001\u001a\u0002008VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÜ\u0001\u0010\\R\u0019\u0010ß\u0001\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\bº\u0001\u0010Þ\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006à\u0001"}, d2 = {"Landroidx/compose/ui/node/V;", "Landroidx/compose/ui/layout/I;", "Landroidx/compose/ui/layout/f0;", "Landroidx/compose/ui/node/b;", "Landroidx/compose/ui/node/Z;", "Landroidx/compose/ui/node/M;", "layoutNodeLayoutDelegate", "<init>", "(Landroidx/compose/ui/node/M;)V", "", "r1", "()V", "h2", "g2", "s1", "Landroidx/compose/ui/node/LayoutNode;", "node", "x2", "(Landroidx/compose/ui/node/LayoutNode;)V", "LH1/n;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/e;", "Lkotlin/ExtensionFunctionType;", "layerBlock", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "p2", "(JFLkotlin/jvm/functions/Function1;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "o2", "k2", "j2", "Z1", "U", "m2", "LH1/b;", "constraints", "n2", "(J)V", "k0", "(J)Landroidx/compose/ui/layout/f0;", "", "q2", "(J)Z", "Landroidx/compose/ui/layout/a;", "alignmentLine", "", "l0", "(Landroidx/compose/ui/layout/a;)I", "V0", "(JFLkotlin/jvm/functions/Function1;)V", "T0", "(JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "newMFR", "R", "(Z)V", "r2", "height", "d0", "(I)I", "j0", "width", "W", "A", "X1", "y2", "()Z", "", "B", "()Ljava/util/Map;", "block", "o0", "(Lkotlin/jvm/functions/Function1;)V", "requestLayout", "t0", "i2", "forceRequest", "V1", "l2", "c2", "e2", "f", "Landroidx/compose/ui/node/M;", "g", "Z", "relayoutWithoutParentInProgress", "<set-?>", "h", "I", "getPreviousPlaceOrder$ui_release", "()I", "previousPlaceOrder", "i", "R1", "placeOrder", "j", "measuredOnce", "k", "placedOnce", "Landroidx/compose/ui/node/LayoutNode$g;", "l", "Landroidx/compose/ui/node/LayoutNode$g;", "J1", "()Landroidx/compose/ui/node/LayoutNode$g;", "u2", "(Landroidx/compose/ui/node/LayoutNode$g;)V", "measuredByParent", "m", "getDuringAlignmentLinesQuery$ui_release", "setDuringAlignmentLinesQuery$ui_release", "duringAlignmentLinesQuery", "n", "J", "w1", "()J", "lastPosition", "o", "Lkotlin/jvm/functions/Function1;", "lastLayerBlock", "p", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "lastExplicitLayer", "q", "F", "lastZIndex", "r", "parentDataDirty", "", "s", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "parentData", "t", "v2", "isPlaced", "u", "Y1", "setPlacedByParent$ui_release", "isPlacedByParent", "v", "E1", "measurePending", "w", "y1", "layoutPending", "x", "layoutPendingForAlignment", "Landroidx/compose/ui/node/a;", "y", "Landroidx/compose/ui/node/a;", "()Landroidx/compose/ui/node/a;", "alignmentLines", "LD0/c;", "z", "LD0/c;", "_childDelegates", "getChildDelegatesDirty$ui_release", "s2", "childDelegatesDirty", "x1", "layingOutChildren", "C", "performMeasureConstraints", "Lkotlin/Function0;", "D", "Lkotlin/jvm/functions/Function0;", "getPerformMeasureBlock$ui_release", "()Lkotlin/jvm/functions/Function0;", "performMeasureBlock", "E", "layoutChildrenBlock", "T1", "()F", "G", "onNodePlacedCalled", "H", "placeOuterCoordinatorLayerBlock", "placeOuterCoordinatorLayer", "placeOuterCoordinatorPosition", "K", "placeOuterCoordinatorZIndex", "L", "placeOuterCoordinatorBlock", "M", "needsCoordinatesUpdate", "N", "isPlacedUnderMotionFrameOfReference", "w2", "Landroidx/compose/ui/node/T;", "A1", "()Landroidx/compose/ui/node/T;", "lookaheadPassDelegate", "v1", "()LH1/b;", "lastConstraints", "S1", "()Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/node/LayoutNode$e;", "value", "z1", "()Landroidx/compose/ui/node/LayoutNode$e;", "t2", "(Landroidx/compose/ui/node/LayoutNode$e;)V", "layoutState", "Landroidx/compose/ui/node/NodeCoordinator;", "M1", "()Landroidx/compose/ui/node/NodeCoordinator;", "outerCoordinator", "Y", "innerCoordinator", "", "u1", "()Ljava/util/List;", "childDelegates", "M0", "measuredWidth", "J0", "measuredHeight", "()Landroidx/compose/ui/node/b;", "parentAlignmentLinesOwner", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class V extends androidx.compose.ui.layout.f0 implements androidx.compose.ui.layout.I, InterfaceC5801b, Z {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private boolean childDelegatesDirty;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private boolean layingOutChildren;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private long performMeasureConstraints;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> performMeasureBlock;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> layoutChildrenBlock;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private float zIndex;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private boolean onNodePlacedCalled;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private Function1<? super androidx.compose.ui.graphics.e, Unit> placeOuterCoordinatorLayerBlock;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private GraphicsLayer placeOuterCoordinatorLayer;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private long placeOuterCoordinatorPosition;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private float placeOuterCoordinatorZIndex;

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> placeOuterCoordinatorBlock;

    /* renamed from: M, reason: collision with root package name and from kotlin metadata */
    private boolean needsCoordinatesUpdate;

    /* renamed from: N, reason: collision with root package name and from kotlin metadata */
    private boolean isPlacedUnderMotionFrameOfReference;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final M layoutNodeLayoutDelegate;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean relayoutWithoutParentInProgress;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean measuredOnce;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean placedOnce;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean duringAlignmentLinesQuery;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private long lastPosition;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private Function1<? super androidx.compose.ui.graphics.e, Unit> lastLayerBlock;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private GraphicsLayer lastExplicitLayer;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private float lastZIndex;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean parentDataDirty;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private Object parentData;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean isPlaced;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private boolean isPlacedByParent;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean measurePending;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private boolean layoutPending;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private boolean layoutPendingForAlignment;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final AbstractC5799a alignmentLines;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final D0.c<V> _childDelegates;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int previousPlaceOrder = a.e.API_PRIORITY_OTHER;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int placeOrder = a.e.API_PRIORITY_OTHER;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private LayoutNode.g measuredByParent = LayoutNode.g.f51251c;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LayoutNode.e.values().length];
            try {
                iArr[LayoutNode.e.f51241a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutNode.e.f51243c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[LayoutNode.g.values().length];
            try {
                iArr2[LayoutNode.g.f51249a.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[LayoutNode.g.f51250b.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b extends Lambda implements Function0<Unit> {

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/b;", "it", "", "a", "(Landroidx/compose/ui/node/b;)V"}, k = 3, mv = {1, 9, 0})
        static final class a extends Lambda implements Function1<InterfaceC5801b, Unit> {

            /* renamed from: f, reason: collision with root package name */
            public static final a f51462f = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5801b interfaceC5801b) {
                a(interfaceC5801b);
                return Unit.f142422a;
            }

            public final void a(InterfaceC5801b interfaceC5801b) {
                interfaceC5801b.getAlignmentLines().t(false);
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/b;", "it", "", "a", "(Landroidx/compose/ui/node/b;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.ui.node.V$b$b, reason: collision with other inner class name */
        static final class C1053b extends Lambda implements Function1<InterfaceC5801b, Unit> {

            /* renamed from: f, reason: collision with root package name */
            public static final C1053b f51463f = new C1053b();

            C1053b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5801b interfaceC5801b) {
                a(interfaceC5801b);
                return Unit.f142422a;
            }

            public final void a(InterfaceC5801b interfaceC5801b) {
                interfaceC5801b.getAlignmentLines().q(interfaceC5801b.getAlignmentLines().getUsedDuringParentLayout());
            }
        }

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            V.this.s1();
            V.this.o0(a.f51462f);
            V.this.Y().s1().s();
            V.this.r1();
            V.this.o0(C1053b.f51463f);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class c extends Lambda implements Function0<Unit> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            V.this.M1().k0(V.this.performMeasureConstraints);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class d extends Lambda implements Function0<Unit> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            f0.a placementScope;
            NodeCoordinator wrappedBy = V.this.M1().getWrappedBy();
            if (wrappedBy == null || (placementScope = wrappedBy.getPlacementScope()) == null) {
                placementScope = L.b(V.this.S1()).getPlacementScope();
            }
            f0.a aVar = placementScope;
            V v10 = V.this;
            Function1<? super androidx.compose.ui.graphics.e, Unit> function1 = v10.placeOuterCoordinatorLayerBlock;
            GraphicsLayer graphicsLayer = v10.placeOuterCoordinatorLayer;
            if (graphicsLayer != null) {
                aVar.x(v10.M1(), v10.placeOuterCoordinatorPosition, graphicsLayer, v10.placeOuterCoordinatorZIndex);
            } else if (function1 == null) {
                aVar.i(v10.M1(), v10.placeOuterCoordinatorPosition, v10.placeOuterCoordinatorZIndex);
            } else {
                aVar.w(v10.M1(), v10.placeOuterCoordinatorPosition, v10.placeOuterCoordinatorZIndex, function1);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/b;", "it", "", "a", "(Landroidx/compose/ui/node/b;)V"}, k = 3, mv = {1, 9, 0})
    static final class e extends Lambda implements Function1<InterfaceC5801b, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final e f51466f = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5801b interfaceC5801b) {
            a(interfaceC5801b);
            return Unit.f142422a;
        }

        public final void a(InterfaceC5801b interfaceC5801b) {
            interfaceC5801b.getAlignmentLines().u(false);
        }
    }

    private final void p2(long position, float zIndex, Function1<? super androidx.compose.ui.graphics.e, Unit> layerBlock, GraphicsLayer layer) {
        f0.a placementScope;
        this.isPlacedByParent = true;
        if (!H1.n.j(position, this.lastPosition) || this.needsCoordinatesUpdate) {
            if (this.layoutNodeLayoutDelegate.getCoordinatesAccessedDuringModifierPlacement() || this.layoutNodeLayoutDelegate.getCoordinatesAccessedDuringPlacement() || this.needsCoordinatesUpdate) {
                this.layoutPending = true;
                this.needsCoordinatesUpdate = false;
            }
            i2();
        }
        T tA1 = A1();
        if (tA1 != null && tA1.E1()) {
            NodeCoordinator wrappedBy = M1().getWrappedBy();
            if (wrappedBy == null || (placementScope = wrappedBy.getPlacementScope()) == null) {
                placementScope = L.b(S1()).getPlacementScope();
            }
            f0.a aVar = placementScope;
            T tA12 = A1();
            Intrinsics.g(tA12);
            LayoutNode parent$ui_release = S1().getParent$ui_release();
            if (parent$ui_release != null) {
                parent$ui_release.getLayoutDelegate().X(0);
            }
            tA12.t2(a.e.API_PRIORITY_OTHER);
            f0.a.h(aVar, tA12, H1.n.k(position), H1.n.l(position), 0.0f, 4, null);
        }
        T tA13 = A1();
        if ((tA13 == null || tA13.getPlacedOnce()) ? false : true) {
            C14832a.b("Error: Placement happened before lookahead.");
        }
        o2(position, zIndex, layerBlock, layer);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.f0
    public void T0(long position, float zIndex, GraphicsLayer layer) {
        p2(position, zIndex, null, layer);
    }

    @Override // androidx.compose.ui.node.InterfaceC5801b
    public void U() {
        this.layingOutChildren = true;
        getAlignmentLines().o();
        if (this.layoutPending) {
            j2();
        }
        if (this.layoutPendingForAlignment || (!this.duringAlignmentLinesQuery && !Y().getIsPlacingForAlignment() && this.layoutPending)) {
            this.layoutPending = false;
            LayoutNode.e eVarZ1 = z1();
            t2(LayoutNode.e.f51243c);
            this.layoutNodeLayoutDelegate.O(false);
            LayoutNode layoutNodeS1 = S1();
            L.b(layoutNodeS1).getSnapshotObserver().e(layoutNodeS1, false, this.layoutChildrenBlock);
            t2(eVarZ1);
            if (Y().getIsPlacingForAlignment() && this.layoutNodeLayoutDelegate.getCoordinatesAccessedDuringPlacement()) {
                requestLayout();
            }
            this.layoutPendingForAlignment = false;
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
        p2(position, zIndex, layerBlock, null);
    }

    public final void X1() {
        this.parentDataDirty = true;
    }

    public final void c2() {
        this.layoutPending = true;
        this.layoutPendingForAlignment = true;
    }

    public final void e2() {
        this.measurePending = true;
    }

    public final void m2() {
        this.onNodePlacedCalled = true;
        LayoutNode parent$ui_release = S1().getParent$ui_release();
        float zIndex = Y().getZIndex();
        LayoutNode layoutNodeS1 = S1();
        NodeCoordinator nodeCoordinatorP = layoutNodeS1.P();
        for (NodeCoordinator outerCoordinator$ui_release = layoutNodeS1.getOuterCoordinator$ui_release(); outerCoordinator$ui_release != nodeCoordinatorP; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped()) {
            Intrinsics.h(outerCoordinator$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            zIndex += ((E) outerCoordinator$ui_release).getZIndex();
        }
        if (zIndex != this.zIndex) {
            this.zIndex = zIndex;
            if (parent$ui_release != null) {
                parent$ui_release.b1();
            }
            if (parent$ui_release != null) {
                parent$ui_release.z0();
            }
        }
        if (getIsPlaced()) {
            S1().P().j3();
        } else {
            if (parent$ui_release != null) {
                parent$ui_release.z0();
            }
            g2();
            if (this.relayoutWithoutParentInProgress && parent$ui_release != null) {
                LayoutNode.q1(parent$ui_release, false, 1, null);
            }
        }
        if (parent$ui_release == null) {
            this.placeOrder = 0;
        } else if (!this.relayoutWithoutParentInProgress && parent$ui_release.X() == LayoutNode.e.f51243c) {
            if (!(this.placeOrder == Integer.MAX_VALUE)) {
                C14832a.b("Place was called on a node which was placed already");
            }
            this.placeOrder = parent$ui_release.getLayoutDelegate().getNextChildPlaceOrder();
            M layoutDelegate = parent$ui_release.getLayoutDelegate();
            layoutDelegate.Y(layoutDelegate.getNextChildPlaceOrder() + 1);
        }
        U();
    }

    public final void r2() {
        V v10;
        LayoutNode parent$ui_release;
        try {
            this.relayoutWithoutParentInProgress = true;
            if (!this.placedOnce) {
                C14832a.b("replace called on unplaced item");
            }
            boolean isPlaced = getIsPlaced();
            v10 = this;
            try {
                v10.o2(this.lastPosition, this.lastZIndex, this.lastLayerBlock, this.lastExplicitLayer);
                if (isPlaced && !v10.onNodePlacedCalled && (parent$ui_release = S1().getParent$ui_release()) != null) {
                    LayoutNode.q1(parent$ui_release, false, 1, null);
                }
                v10.relayoutWithoutParentInProgress = false;
            } catch (Throwable th2) {
                th = th2;
                v10.relayoutWithoutParentInProgress = false;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            v10 = this;
        }
    }

    private final T A1() {
        return this.layoutNodeLayoutDelegate.getLookaheadPassDelegate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s1() {
        this.layoutNodeLayoutDelegate.Y(0);
        D0.c<LayoutNode> cVarT0 = S1().t0();
        LayoutNode[] layoutNodeArr = cVarT0.content;
        int size = cVarT0.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            V vD0 = layoutNodeArr[i10].d0();
            vD0.previousPlaceOrder = vD0.placeOrder;
            vD0.placeOrder = a.e.API_PRIORITY_OTHER;
            vD0.isPlacedByParent = false;
            if (vD0.measuredByParent == LayoutNode.g.f51250b) {
                vD0.measuredByParent = LayoutNode.g.f51251c;
            }
        }
    }

    @Override // androidx.compose.ui.node.InterfaceC5801b
    public Map<AbstractC5774a, Integer> B() {
        if (!this.duringAlignmentLinesQuery) {
            if (z1() == LayoutNode.e.f51241a) {
                getAlignmentLines().s(true);
                if (getAlignmentLines().getDirty()) {
                    c2();
                }
            } else {
                getAlignmentLines().r(true);
            }
        }
        Y().V1(true);
        U();
        Y().V1(false);
        return getAlignmentLines().h();
    }

    /* renamed from: E1, reason: from getter */
    public final boolean getMeasurePending() {
        return this.measurePending;
    }

    /* renamed from: J1, reason: from getter */
    public final LayoutNode.g getMeasuredByParent() {
        return this.measuredByParent;
    }

    public final NodeCoordinator M1() {
        return this.layoutNodeLayoutDelegate.A();
    }

    /* renamed from: R1, reason: from getter */
    public final int getPlaceOrder() {
        return this.placeOrder;
    }

    public final LayoutNode S1() {
        return this.layoutNodeLayoutDelegate.getLayoutNode();
    }

    /* renamed from: T1, reason: from getter */
    public final float getZIndex() {
        return this.zIndex;
    }

    /* renamed from: Y1, reason: from getter */
    public final boolean getIsPlacedByParent() {
        return this.isPlacedByParent;
    }

    public final void Z1() {
        this.layoutNodeLayoutDelegate.P(true);
    }

    @Override // androidx.compose.ui.layout.L, androidx.compose.ui.layout.r
    /* renamed from: a, reason: from getter */
    public Object getParentData() {
        return this.parentData;
    }

    @Override // androidx.compose.ui.node.InterfaceC5801b
    /* renamed from: f, reason: from getter */
    public boolean getIsPlaced() {
        return this.isPlaced;
    }

    public final void i2() {
        if (this.layoutNodeLayoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
            D0.c<LayoutNode> cVarT0 = S1().t0();
            LayoutNode[] layoutNodeArr = cVarT0.content;
            int size = cVarT0.getSize();
            for (int i10 = 0; i10 < size; i10++) {
                LayoutNode layoutNode = layoutNodeArr[i10];
                M layoutDelegate = layoutNode.getLayoutDelegate();
                if ((layoutDelegate.getCoordinatesAccessedDuringPlacement() || layoutDelegate.getCoordinatesAccessedDuringModifierPlacement()) && !layoutDelegate.n()) {
                    LayoutNode.q1(layoutNode, false, 1, null);
                }
                layoutDelegate.getMeasurePassDelegate().i2();
            }
        }
    }

    @Override // androidx.compose.ui.node.InterfaceC5801b
    /* renamed from: r, reason: from getter */
    public AbstractC5799a getAlignmentLines() {
        return this.alignmentLines;
    }

    public final void s2(boolean z10) {
        this.childDelegatesDirty = z10;
    }

    public final void t2(LayoutNode.e eVar) {
        this.layoutNodeLayoutDelegate.R(eVar);
    }

    public final void u2(LayoutNode.g gVar) {
        this.measuredByParent = gVar;
    }

    public final H1.b v1() {
        if (this.measuredOnce) {
            return H1.b.a(getMeasurementConstraints());
        }
        return null;
    }

    public void v2(boolean z10) {
        this.isPlaced = z10;
    }

    /* renamed from: w1, reason: from getter */
    public final long getLastPosition() {
        return this.lastPosition;
    }

    public void w2(boolean z10) {
        this.isPlacedUnderMotionFrameOfReference = z10;
    }

    /* renamed from: x1, reason: from getter */
    public final boolean getLayingOutChildren() {
        return this.layingOutChildren;
    }

    /* renamed from: y1, reason: from getter */
    public final boolean getLayoutPending() {
        return this.layoutPending;
    }

    public final LayoutNode.e z1() {
        return this.layoutNodeLayoutDelegate.getLayoutState();
    }

    public V(M m10) {
        this.layoutNodeLayoutDelegate = m10;
        n.Companion companion = H1.n.INSTANCE;
        this.lastPosition = companion.b();
        this.parentDataDirty = true;
        this.alignmentLines = new I(this);
        this._childDelegates = new D0.c<>(new V[16], 0);
        this.childDelegatesDirty = true;
        this.performMeasureConstraints = H1.c.b(0, 0, 0, 0, 15, null);
        this.performMeasureBlock = new c();
        this.layoutChildrenBlock = new b();
        this.placeOuterCoordinatorPosition = companion.b();
        this.placeOuterCoordinatorBlock = new d();
    }

    private final void g2() {
        boolean isPlaced = getIsPlaced();
        v2(true);
        LayoutNode layoutNodeS1 = S1();
        if (!isPlaced) {
            layoutNodeS1.P().j3();
            if (layoutNodeS1.e0()) {
                LayoutNode.s1(layoutNodeS1, true, false, false, 6, null);
            } else if (layoutNodeS1.Z()) {
                LayoutNode.o1(layoutNodeS1, true, false, false, 6, null);
            }
        }
        NodeCoordinator wrapped = layoutNodeS1.P().getWrapped();
        for (NodeCoordinator outerCoordinator$ui_release = layoutNodeS1.getOuterCoordinator$ui_release(); !Intrinsics.e(outerCoordinator$ui_release, wrapped) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped()) {
            if (outerCoordinator$ui_release.getLastLayerDrawingWasSkipped()) {
                outerCoordinator$ui_release.Y2();
            }
        }
        D0.c<LayoutNode> cVarT0 = layoutNodeS1.t0();
        LayoutNode[] layoutNodeArr = cVarT0.content;
        int size = cVarT0.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            LayoutNode layoutNode = layoutNodeArr[i10];
            if (layoutNode.o0() != Integer.MAX_VALUE) {
                layoutNode.d0().g2();
                layoutNodeS1.t1(layoutNode);
            }
        }
    }

    private final void h2() {
        if (getIsPlaced()) {
            v2(false);
            LayoutNode layoutNodeS1 = S1();
            NodeCoordinator wrapped = layoutNodeS1.P().getWrapped();
            for (NodeCoordinator outerCoordinator$ui_release = layoutNodeS1.getOuterCoordinator$ui_release(); !Intrinsics.e(outerCoordinator$ui_release, wrapped) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped()) {
                outerCoordinator$ui_release.l3();
                outerCoordinator$ui_release.s3();
            }
            D0.c<LayoutNode> cVarT0 = S1().t0();
            LayoutNode[] layoutNodeArr = cVarT0.content;
            int size = cVarT0.getSize();
            for (int i10 = 0; i10 < size; i10++) {
                layoutNodeArr[i10].d0().h2();
            }
        }
    }

    private final void j2() {
        D0.c<LayoutNode> cVarT0 = S1().t0();
        LayoutNode[] layoutNodeArr = cVarT0.content;
        int size = cVarT0.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            LayoutNode layoutNode = layoutNodeArr[i10];
            if (layoutNode.e0() && layoutNode.g0() == LayoutNode.g.f51249a && LayoutNode.g1(layoutNode, null, 1, null)) {
                LayoutNode.s1(S1(), false, false, false, 7, null);
            }
        }
    }

    private final void k2() {
        LayoutNode.g intrinsicsUsageByParent;
        LayoutNode.s1(S1(), false, false, false, 7, null);
        LayoutNode parent$ui_release = S1().getParent$ui_release();
        if (parent$ui_release != null && S1().getIntrinsicsUsageByParent() == LayoutNode.g.f51251c) {
            LayoutNode layoutNodeS1 = S1();
            int i10 = a.$EnumSwitchMapping$0[parent$ui_release.X().ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    intrinsicsUsageByParent = parent$ui_release.getIntrinsicsUsageByParent();
                } else {
                    intrinsicsUsageByParent = LayoutNode.g.f51250b;
                }
            } else {
                intrinsicsUsageByParent = LayoutNode.g.f51249a;
            }
            layoutNodeS1.A1(intrinsicsUsageByParent);
        }
    }

    private final void o2(long position, float zIndex, Function1<? super androidx.compose.ui.graphics.e, Unit> layerBlock, GraphicsLayer layer) {
        if (S1().getIsDeactivated()) {
            C14832a.a("place is called on a deactivated node");
        }
        t2(LayoutNode.e.f51243c);
        boolean z10 = !this.placedOnce;
        this.lastPosition = position;
        this.lastZIndex = zIndex;
        this.lastLayerBlock = layerBlock;
        this.lastExplicitLayer = layer;
        this.placedOnce = true;
        this.onNodePlacedCalled = false;
        Owner ownerB = L.b(S1());
        ownerB.getRectManager().k(S1(), position, z10);
        if (!this.layoutPending && getIsPlaced()) {
            M1().p3(position, zIndex, layerBlock, layer);
            m2();
        } else {
            getAlignmentLines().r(false);
            this.layoutNodeLayoutDelegate.N(false);
            this.placeOuterCoordinatorLayerBlock = layerBlock;
            this.placeOuterCoordinatorPosition = position;
            this.placeOuterCoordinatorZIndex = zIndex;
            this.placeOuterCoordinatorLayer = layer;
            ownerB.getSnapshotObserver().c(S1(), false, this.placeOuterCoordinatorBlock);
        }
        t2(LayoutNode.e.f51245e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r1() {
        LayoutNode layoutNodeS1 = S1();
        D0.c<LayoutNode> cVarT0 = layoutNodeS1.t0();
        LayoutNode[] layoutNodeArr = cVarT0.content;
        int size = cVarT0.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            LayoutNode layoutNode = layoutNodeArr[i10];
            if (layoutNode.d0().previousPlaceOrder != layoutNode.o0()) {
                layoutNodeS1.b1();
                layoutNodeS1.z0();
                if (layoutNode.o0() == Integer.MAX_VALUE) {
                    if (layoutNode.getLayoutDelegate().getDetachedFromParentLookaheadPlacement()) {
                        T tA0 = layoutNode.a0();
                        Intrinsics.g(tA0);
                        tA0.X1(false);
                    }
                    layoutNode.d0().h2();
                }
            }
        }
    }

    private final void x2(LayoutNode node) {
        boolean z10;
        LayoutNode.g gVar;
        LayoutNode parent$ui_release = node.getParent$ui_release();
        if (parent$ui_release != null) {
            if (this.measuredByParent != LayoutNode.g.f51251c && !node.getCanMultiMeasure()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                C14832a.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int i10 = a.$EnumSwitchMapping$0[parent$ui_release.X().ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    gVar = LayoutNode.g.f51250b;
                } else {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + parent$ui_release.X());
                }
            } else {
                gVar = LayoutNode.g.f51249a;
            }
            this.measuredByParent = gVar;
            return;
        }
        this.measuredByParent = LayoutNode.g.f51251c;
    }

    @Override // androidx.compose.ui.layout.r
    public int A(int width) {
        if (N.a(S1())) {
            T tA1 = A1();
            Intrinsics.g(tA1);
            return tA1.A(width);
        }
        k2();
        return M1().A(width);
    }

    @Override // androidx.compose.ui.layout.f0
    public int J0() {
        return M1().J0();
    }

    @Override // androidx.compose.ui.node.InterfaceC5801b
    public InterfaceC5801b M() {
        M layoutDelegate;
        LayoutNode parent$ui_release = S1().getParent$ui_release();
        if (parent$ui_release != null && (layoutDelegate = parent$ui_release.getLayoutDelegate()) != null) {
            return layoutDelegate.c();
        }
        return null;
    }

    @Override // androidx.compose.ui.layout.f0
    public int M0() {
        return M1().M0();
    }

    @Override // androidx.compose.ui.node.Z
    public void R(boolean newMFR) {
        if (newMFR != M1().getIsPlacedUnderMotionFrameOfReference()) {
            M1().T1(newMFR);
            this.needsCoordinatesUpdate = true;
        }
        w2(newMFR);
    }

    public final void V1(boolean forceRequest) {
        LayoutNode layoutNode;
        LayoutNode parent$ui_release = S1().getParent$ui_release();
        LayoutNode.g intrinsicsUsageByParent = S1().getIntrinsicsUsageByParent();
        if (parent$ui_release != null && intrinsicsUsageByParent != LayoutNode.g.f51251c) {
            do {
                layoutNode = parent$ui_release;
                if (layoutNode.getIntrinsicsUsageByParent() != intrinsicsUsageByParent) {
                    break;
                } else {
                    parent$ui_release = layoutNode.getParent$ui_release();
                }
            } while (parent$ui_release != null);
            int i10 = a.$EnumSwitchMapping$1[intrinsicsUsageByParent.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    layoutNode.p1(forceRequest);
                    return;
                }
                throw new IllegalStateException("Intrinsics isn't used by the parent");
            }
            LayoutNode.s1(layoutNode, forceRequest, false, false, 6, null);
        }
    }

    @Override // androidx.compose.ui.layout.r
    public int W(int width) {
        if (N.a(S1())) {
            T tA1 = A1();
            Intrinsics.g(tA1);
            return tA1.W(width);
        }
        k2();
        return M1().W(width);
    }

    @Override // androidx.compose.ui.node.InterfaceC5801b
    public NodeCoordinator Y() {
        return S1().P();
    }

    @Override // androidx.compose.ui.layout.r
    public int d0(int height) {
        if (N.a(S1())) {
            T tA1 = A1();
            Intrinsics.g(tA1);
            return tA1.d0(height);
        }
        k2();
        return M1().d0(height);
    }

    @Override // androidx.compose.ui.layout.r
    public int j0(int height) {
        if (N.a(S1())) {
            T tA1 = A1();
            Intrinsics.g(tA1);
            return tA1.j0(height);
        }
        k2();
        return M1().j0(height);
    }

    @Override // androidx.compose.ui.layout.I
    public androidx.compose.ui.layout.f0 k0(long constraints) {
        LayoutNode.g intrinsicsUsageByParent = S1().getIntrinsicsUsageByParent();
        LayoutNode.g gVar = LayoutNode.g.f51251c;
        if (intrinsicsUsageByParent == gVar) {
            S1().w();
        }
        if (N.a(S1())) {
            T tA1 = A1();
            Intrinsics.g(tA1);
            tA1.s2(gVar);
            tA1.k0(constraints);
        }
        x2(S1());
        q2(constraints);
        return this;
    }

    @Override // androidx.compose.ui.layout.L
    public int l0(AbstractC5774a alignmentLine) {
        LayoutNode.e eVarX;
        LayoutNode parent$ui_release = S1().getParent$ui_release();
        LayoutNode.e eVarX2 = null;
        if (parent$ui_release != null) {
            eVarX = parent$ui_release.X();
        } else {
            eVarX = null;
        }
        if (eVarX == LayoutNode.e.f51241a) {
            getAlignmentLines().u(true);
        } else {
            LayoutNode parent$ui_release2 = S1().getParent$ui_release();
            if (parent$ui_release2 != null) {
                eVarX2 = parent$ui_release2.X();
            }
            if (eVarX2 == LayoutNode.e.f51243c) {
                getAlignmentLines().t(true);
            }
        }
        this.duringAlignmentLinesQuery = true;
        int iL0 = M1().l0(alignmentLine);
        this.duringAlignmentLinesQuery = false;
        return iL0;
    }

    public final void l2() {
        this.placeOrder = a.e.API_PRIORITY_OTHER;
        this.previousPlaceOrder = a.e.API_PRIORITY_OTHER;
        v2(false);
    }

    public final void n2(long constraints) {
        boolean z10;
        LayoutNode.e eVarZ1 = z1();
        LayoutNode.e eVar = LayoutNode.e.f51245e;
        if (eVarZ1 == eVar) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            C14832a.b("layout state is not idle before measure starts");
        }
        this.performMeasureConstraints = constraints;
        LayoutNode.e eVar2 = LayoutNode.e.f51241a;
        t2(eVar2);
        this.measurePending = false;
        L.b(S1()).getSnapshotObserver().g(S1(), false, this.performMeasureBlock);
        if (z1() == eVar2) {
            c2();
            t2(eVar);
        }
    }

    @Override // androidx.compose.ui.node.InterfaceC5801b
    public void o0(Function1<? super InterfaceC5801b, Unit> block) {
        D0.c<LayoutNode> cVarT0 = S1().t0();
        LayoutNode[] layoutNodeArr = cVarT0.content;
        int size = cVarT0.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            block.invoke(layoutNodeArr[i10].getLayoutDelegate().c());
        }
    }

    public final boolean q2(long constraints) {
        boolean z10;
        if (S1().getIsDeactivated()) {
            C14832a.a("measure is called on a deactivated node");
        }
        Owner ownerB = L.b(S1());
        LayoutNode parent$ui_release = S1().getParent$ui_release();
        LayoutNode layoutNodeS1 = S1();
        boolean z11 = true;
        if (!S1().getCanMultiMeasure() && (parent$ui_release == null || !parent$ui_release.getCanMultiMeasure())) {
            z10 = false;
        } else {
            z10 = true;
        }
        layoutNodeS1.w1(z10);
        if (!S1().e0() && H1.b.f(getMeasurementConstraints(), constraints)) {
            Owner.n(ownerB, S1(), false, 2, null);
            S1().v1();
            return false;
        }
        getAlignmentLines().s(false);
        o0(e.f51466f);
        this.measuredOnce = true;
        long jC = M1().c();
        b1(constraints);
        n2(constraints);
        if (H1.r.e(M1().c(), jC) && M1().getWidth() == getWidth() && M1().getHeight() == getHeight()) {
            z11 = false;
        }
        Z0(H1.r.c((M1().getHeight() & 4294967295L) | (M1().getWidth() << 32)));
        return z11;
    }

    @Override // androidx.compose.ui.node.InterfaceC5801b
    public void requestLayout() {
        LayoutNode.q1(S1(), false, 1, null);
    }

    @Override // androidx.compose.ui.node.InterfaceC5801b
    public void t0() {
        LayoutNode.s1(S1(), false, false, false, 7, null);
    }

    public final List<V> u1() {
        S1().M1();
        if (!this.childDelegatesDirty) {
            return this._childDelegates.i();
        }
        LayoutNode layoutNodeS1 = S1();
        D0.c<V> cVar = this._childDelegates;
        D0.c<LayoutNode> cVarT0 = layoutNodeS1.t0();
        LayoutNode[] layoutNodeArr = cVarT0.content;
        int size = cVarT0.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            LayoutNode layoutNode = layoutNodeArr[i10];
            if (cVar.getSize() <= i10) {
                cVar.c(layoutNode.getLayoutDelegate().getMeasurePassDelegate());
            } else {
                cVar.y(i10, layoutNode.getLayoutDelegate().getMeasurePassDelegate());
            }
        }
        cVar.v(layoutNodeS1.I().size(), cVar.getSize());
        this.childDelegatesDirty = false;
        return this._childDelegates.i();
    }

    public final boolean y2() {
        if ((getParentData() == null && M1().getParentData() == null) || !this.parentDataDirty) {
            return false;
        }
        this.parentDataDirty = false;
        this.parentData = M1().getParentData();
        return true;
    }
}
