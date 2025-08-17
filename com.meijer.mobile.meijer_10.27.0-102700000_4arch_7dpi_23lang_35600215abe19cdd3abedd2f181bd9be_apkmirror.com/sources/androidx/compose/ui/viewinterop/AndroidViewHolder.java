package androidx.compose.ui.viewinterop;

import H1.z;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.compose.runtime.AbstractC5727k;
import androidx.compose.runtime.InterfaceC5719g;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.layout.I;
import androidx.compose.ui.layout.InterfaceC5791s;
import androidx.compose.ui.layout.J;
import androidx.compose.ui.layout.K;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.T;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.OwnerScope;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.W0;
import androidx.compose.ui.platform.b2;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.core.view.ViewCompat;
import androidx.core.view.i;
import androidx.view.C6019i0;
import androidx.view.InterfaceC6030s;
import com.fullstory.instrumentation.frameworks.compose.FSComposeAndroidViewHolder;
import f1.C13829b;
import g1.L;
import j1.C14832a;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import p2.E;
import p2.F;
import p2.G;
import qv.C16648k;
import qv.InterfaceC16622O;
import r1.C16705m;
import r1.u;

@Metadata(d1 = {"\u0000ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000 p2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002\u0080\u0001B9\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001cJ\u001f\u0010!\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\nH\u0014¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u001a¢\u0006\u0004\b#\u0010\u001cJ7\u0010(\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020$2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010&\u001a\u00020\n2\u0006\u0010'\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\nH\u0014¢\u0006\u0004\b(\u0010)J\u0011\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020$H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u001aH\u0014¢\u0006\u0004\b0\u0010\u001cJ\u000f\u00101\u001a\u00020\u001aH\u0014¢\u0006\u0004\b1\u0010\u001cJ%\u00107\u001a\u0004\u0018\u0001062\b\u00103\u001a\u0004\u0018\u0001022\b\u00105\u001a\u0004\u0018\u000104H\u0016¢\u0006\u0004\b7\u00108J\u001f\u0010;\u001a\u00020\u001a2\u0006\u00109\u001a\u00020\u000e2\u0006\u0010:\u001a\u00020\u000eH\u0016¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020\u001a¢\u0006\u0004\b=\u0010\u001cJ\u0017\u0010?\u001a\u00020\u001a2\u0006\u0010>\u001a\u00020\nH\u0014¢\u0006\u0004\b?\u0010@J\u0019\u0010C\u001a\u00020$2\b\u0010B\u001a\u0004\u0018\u00010AH\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020$H\u0016¢\u0006\u0004\bE\u0010FJ/\u0010I\u001a\u00020$2\u0006\u00109\u001a\u00020\u000e2\u0006\u0010:\u001a\u00020\u000e2\u0006\u0010G\u001a\u00020\n2\u0006\u0010H\u001a\u00020\nH\u0016¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\nH\u0016¢\u0006\u0004\bK\u0010LJ/\u0010M\u001a\u00020\u001a2\u0006\u00109\u001a\u00020\u000e2\u0006\u0010:\u001a\u00020\u000e2\u0006\u0010G\u001a\u00020\n2\u0006\u0010H\u001a\u00020\nH\u0016¢\u0006\u0004\bM\u0010NJ\u001f\u0010O\u001a\u00020\u001a2\u0006\u0010:\u001a\u00020\u000e2\u0006\u0010H\u001a\u00020\nH\u0016¢\u0006\u0004\bO\u0010PJG\u0010V\u001a\u00020\u001a2\u0006\u0010:\u001a\u00020\u000e2\u0006\u0010Q\u001a\u00020\n2\u0006\u0010R\u001a\u00020\n2\u0006\u0010S\u001a\u00020\n2\u0006\u0010T\u001a\u00020\n2\u0006\u0010H\u001a\u00020\n2\u0006\u0010U\u001a\u000202H\u0016¢\u0006\u0004\bV\u0010WJ?\u0010X\u001a\u00020\u001a2\u0006\u0010:\u001a\u00020\u000e2\u0006\u0010Q\u001a\u00020\n2\u0006\u0010R\u001a\u00020\n2\u0006\u0010S\u001a\u00020\n2\u0006\u0010T\u001a\u00020\n2\u0006\u0010H\u001a\u00020\nH\u0016¢\u0006\u0004\bX\u0010YJ7\u0010\\\u001a\u00020\u001a2\u0006\u0010:\u001a\u00020\u000e2\u0006\u0010Z\u001a\u00020\n2\u0006\u0010[\u001a\u00020\n2\u0006\u0010U\u001a\u0002022\u0006\u0010H\u001a\u00020\nH\u0016¢\u0006\u0004\b\\\u0010]J/\u0010a\u001a\u00020$2\u0006\u0010:\u001a\u00020\u000e2\u0006\u0010_\u001a\u00020^2\u0006\u0010`\u001a\u00020^2\u0006\u0010U\u001a\u00020$H\u0016¢\u0006\u0004\ba\u0010bJ'\u0010c\u001a\u00020$2\u0006\u0010:\u001a\u00020\u000e2\u0006\u0010_\u001a\u00020^2\u0006\u0010`\u001a\u00020^H\u0016¢\u0006\u0004\bc\u0010dJ\u000f\u0010e\u001a\u00020$H\u0016¢\u0006\u0004\be\u0010FJ\u001f\u0010i\u001a\u00020g2\u0006\u0010f\u001a\u00020\u000e2\u0006\u0010h\u001a\u00020gH\u0016¢\u0006\u0004\bi\u0010jJ'\u0010n\u001a\u00020\n2\u0006\u0010k\u001a\u00020\n2\u0006\u0010l\u001a\u00020\n2\u0006\u0010m\u001a\u00020\nH\u0002¢\u0006\u0004\bn\u0010oJ\u0017\u0010p\u001a\u00020g2\u0006\u0010h\u001a\u00020gH\u0002¢\u0006\u0004\bp\u0010qJ\u0017\u0010t\u001a\u00020r2\u0006\u0010s\u001a\u00020rH\u0002¢\u0006\u0004\bt\u0010uJ3\u0010{\u001a\u00020v*\u00020v2\u0006\u0010w\u001a\u00020\n2\u0006\u0010x\u001a\u00020\n2\u0006\u0010y\u001a\u00020\n2\u0006\u0010z\u001a\u00020\nH\u0002¢\u0006\u0004\b{\u0010|R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u007fR\u001a\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\u000f\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0005\b\u0082\u0001\u0010\u0016R\u0016\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R@\u0010\u008d\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u0085\u00012\u000e\u0010\u0086\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u0085\u00018\u0006@DX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0019\u0010\u0090\u0001\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R@\u0010\u0095\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u0085\u00012\u000e\u0010\u0091\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u0085\u00018\u0006@DX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010\u0088\u0001\u001a\u0006\b\u0093\u0001\u0010\u008a\u0001\"\u0006\b\u0094\u0001\u0010\u008c\u0001R?\u0010\u0098\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u0085\u00012\u000e\u0010\u0091\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u0085\u00018\u0006@DX\u0086\u000e¢\u0006\u0017\n\u0005\b\u001d\u0010\u0088\u0001\u001a\u0006\b\u0096\u0001\u0010\u008a\u0001\"\u0006\b\u0097\u0001\u0010\u008c\u0001R3\u0010\u009f\u0001\u001a\u00030\u0099\u00012\b\u0010\u0086\u0001\u001a\u00030\u0099\u00018\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0005\bM\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001\"\u0006\b\u009d\u0001\u0010\u009e\u0001R8\u0010¦\u0001\u001a\u0012\u0012\u0005\u0012\u00030\u0099\u0001\u0012\u0004\u0012\u00020\u001a\u0018\u00010 \u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bO\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001\"\u0006\b¤\u0001\u0010¥\u0001R3\u0010\u00ad\u0001\u001a\u00030§\u00012\b\u0010\u0086\u0001\u001a\u00030§\u00018\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0005\b\\\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001\"\u0006\b«\u0001\u0010¬\u0001R8\u0010°\u0001\u001a\u0012\u0012\u0005\u0012\u00030§\u0001\u0012\u0004\u0012\u00020\u001a\u0018\u00010 \u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\u001b\u0010¡\u0001\u001a\u0006\b®\u0001\u0010£\u0001\"\u0006\b¯\u0001\u0010¥\u0001R7\u0010·\u0001\u001a\u0005\u0018\u00010±\u00012\n\u0010\u0086\u0001\u001a\u0005\u0018\u00010±\u00018\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0005\bV\u0010²\u0001\u001a\u0006\b³\u0001\u0010´\u0001\"\u0006\bµ\u0001\u0010¶\u0001R7\u0010¾\u0001\u001a\u0005\u0018\u00010¸\u00012\n\u0010\u0086\u0001\u001a\u0005\u0018\u00010¸\u00018\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0005\bX\u0010¹\u0001\u001a\u0006\bº\u0001\u0010»\u0001\"\u0006\b¼\u0001\u0010½\u0001R\u0016\u0010À\u0001\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bI\u0010¿\u0001R \u0010Ä\u0001\u001a\u00030Á\u00018\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0006\bÂ\u0001\u0010Ã\u0001R\u001a\u0010h\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÅ\u0001\u0010Æ\u0001R\u001d\u0010Ç\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u0085\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b'\u0010\u0088\u0001R\u001e\u0010É\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÈ\u0001\u0010\u0088\u0001R7\u0010Ì\u0001\u001a\u0011\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u001a\u0018\u00010 \u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b&\u0010¡\u0001\u001a\u0006\bÊ\u0001\u0010£\u0001\"\u0006\bË\u0001\u0010¥\u0001R\u0016\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÍ\u0001\u0010¿\u0001R\u0017\u0010Î\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010~R\u0018\u0010Ð\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÏ\u0001\u0010~R\u0018\u0010Ô\u0001\u001a\u00030Ñ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÒ\u0001\u0010Ó\u0001R\u0018\u0010Õ\u0001\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b{\u0010\u008f\u0001R\u001c\u0010Ú\u0001\u001a\u00030Ö\u00018\u0006¢\u0006\u000f\n\u0005\bt\u0010×\u0001\u001a\u0006\bØ\u0001\u0010Ù\u0001R\u0016\u0010Ü\u0001\u001a\u00020$8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÛ\u0001\u0010FR\u0018\u0010à\u0001\u001a\u00030Ý\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bÞ\u0001\u0010ß\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006á\u0001"}, d2 = {"Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroid/view/ViewGroup;", "Lp2/E;", "Landroidx/compose/runtime/g;", "Landroidx/compose/ui/node/OwnerScope;", "Lp2/G;", "Landroid/content/Context;", "context", "Landroidx/compose/runtime/k;", "parentContext", "", "compositeKeyHash", "Lf1/b;", "dispatcher", "Landroid/view/View;", "view", "Landroidx/compose/ui/node/Owner;", "owner", "<init>", "(Landroid/content/Context;Landroidx/compose/runtime/k;ILf1/b;Landroid/view/View;Landroidx/compose/ui/node/Owner;)V", "Landroidx/compose/ui/viewinterop/InteropView;", "getInteropView", "()Landroid/view/View;", "", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "", "l", "()V", "h", "b", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "E", "", "changed", "t", "r", "onLayout", "(ZIIII)V", "Landroid/view/ViewGroup$LayoutParams;", "getLayoutParams", "()Landroid/view/ViewGroup$LayoutParams;", "disallowIntercept", "requestDisallowInterceptTouchEvent", "(Z)V", "onAttachedToWindow", "onDetachedFromWindow", "", "location", "Landroid/graphics/Rect;", "dirty", "Landroid/view/ViewParent;", "invalidateChildInParent", "([ILandroid/graphics/Rect;)Landroid/view/ViewParent;", "child", "target", "onDescendantInvalidated", "(Landroid/view/View;Landroid/view/View;)V", "B", "visibility", "onWindowVisibilityChanged", "(I)V", "Landroid/graphics/Region;", "region", "gatherTransparentRegion", "(Landroid/graphics/Region;)Z", "shouldDelayChildPressedState", "()Z", "axes", "type", "o", "(Landroid/view/View;Landroid/view/View;II)Z", "getNestedScrollAxes", "()I", "i", "(Landroid/view/View;Landroid/view/View;II)V", "j", "(Landroid/view/View;I)V", "dxConsumed", "dyConsumed", "dxUnconsumed", "dyUnconsumed", "consumed", "m", "(Landroid/view/View;IIIII[I)V", "n", "(Landroid/view/View;IIIII)V", "dx", "dy", "k", "(Landroid/view/View;II[II)V", "", "velocityX", "velocityY", "onNestedFling", "(Landroid/view/View;FFZ)Z", "onNestedPreFling", "(Landroid/view/View;FF)Z", "isNestedScrollingEnabled", "v", "Landroidx/core/view/j;", "insets", "onApplyWindowInsets", "(Landroid/view/View;Landroidx/core/view/j;)Landroidx/core/view/j;", "min", "max", "preferred", "D", "(III)I", "A", "(Landroidx/core/view/j;)Landroidx/core/view/j;", "Landroidx/core/view/i$a;", "bounds", "z", "(Landroidx/core/view/i$a;)Landroidx/core/view/i$a;", "Lc2/d;", "left", "top", "right", "bottom", "y", "(Lc2/d;IIII)Lc2/d;", "a", "I", "Lf1/b;", "c", "Landroid/view/View;", "getView", "d", "Landroidx/compose/ui/node/Owner;", "Lkotlin/Function0;", "value", "e", "Lkotlin/jvm/functions/Function0;", "getUpdate", "()Lkotlin/jvm/functions/Function0;", "setUpdate", "(Lkotlin/jvm/functions/Function0;)V", "update", "f", "Z", "hasUpdateBlock", "<set-?>", "g", "getReset", "setReset", "reset", "getRelease", "setRelease", "release", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "setModifier", "(Landroidx/compose/ui/Modifier;)V", "modifier", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "getOnModifierChanged$ui_release", "()Lkotlin/jvm/functions/Function1;", "setOnModifierChanged$ui_release", "(Lkotlin/jvm/functions/Function1;)V", "onModifierChanged", "LH1/d;", "LH1/d;", "getDensity", "()LH1/d;", "setDensity", "(LH1/d;)V", "density", "getOnDensityChanged$ui_release", "setOnDensityChanged$ui_release", "onDensityChanged", "Landroidx/lifecycle/s;", "Landroidx/lifecycle/s;", "getLifecycleOwner", "()Landroidx/lifecycle/s;", "setLifecycleOwner", "(Landroidx/lifecycle/s;)V", "lifecycleOwner", "Lx4/i;", "Lx4/i;", "getSavedStateRegistryOwner", "()Lx4/i;", "setSavedStateRegistryOwner", "(Lx4/i;)V", "savedStateRegistryOwner", "[I", "position", "LH1/r;", "p", "J", "size", "q", "Landroidx/core/view/j;", "runUpdate", "s", "runInvalidate", "getOnRequestDisallowInterceptTouchEvent$ui_release", "setOnRequestDisallowInterceptTouchEvent$ui_release", "onRequestDisallowInterceptTouchEvent", "u", "lastWidthMeasureSpec", "w", "lastHeightMeasureSpec", "Lp2/F;", "x", "Lp2/F;", "nestedScrollingParentHelper", "isDrawing", "Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "e1", "isValidOwnerScope", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "snapshotObserver", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public class AndroidViewHolder extends ViewGroup implements E, InterfaceC5719g, OwnerScope, G, FSComposeAndroidViewHolder {

    /* renamed from: B, reason: collision with root package name */
    public static final int f52691B = 8;

    /* renamed from: C, reason: collision with root package name */
    private static final Function1<AndroidViewHolder, Unit> f52692C = b.f52720f;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int compositeKeyHash;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C13829b dispatcher;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final View view;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Owner owner;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Function0<Unit> update;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean hasUpdateBlock;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Function0<Unit> reset;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Function0<Unit> release;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private Modifier modifier;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private Function1<? super Modifier, Unit> onModifierChanged;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private H1.d density;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private Function1<? super H1.d, Unit> onDensityChanged;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private InterfaceC6030s lifecycleOwner;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private x4.i savedStateRegistryOwner;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final int[] position;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private long size;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private androidx.core.view.j insets;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> runUpdate;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> runInvalidate;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private Function1<? super Boolean, Unit> onRequestDisallowInterceptTouchEvent;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final int[] location;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private int lastWidthMeasureSpec;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private int lastHeightMeasureSpec;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final F nestedScrollingParentHelper;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private boolean isDrawing;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final LayoutNode layoutNode;

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"androidx/compose/ui/viewinterop/AndroidViewHolder$a", "Landroidx/core/view/i$b;", "Landroidx/core/view/i;", "animation", "Landroidx/core/view/i$a;", "bounds", "e", "(Landroidx/core/view/i;Landroidx/core/view/i$a;)Landroidx/core/view/i$a;", "Landroidx/core/view/j;", "insets", "", "runningAnimations", "d", "(Landroidx/core/view/j;Ljava/util/List;)Landroidx/core/view/j;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends i.b {
        a() {
            super(1);
        }

        @Override // androidx.core.view.i.b
        public androidx.core.view.j d(androidx.core.view.j insets, List<androidx.core.view.i> runningAnimations) {
            return AndroidViewHolder.this.A(insets);
        }

        @Override // androidx.core.view.i.b
        public i.a e(androidx.core.view.i animation, i.a bounds) {
            return AndroidViewHolder.this.z(bounds);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "it", "", "c", "(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends Lambda implements Function1<AndroidViewHolder, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f52720f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AndroidViewHolder androidViewHolder) {
            c(androidViewHolder);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(Function0 function0) {
            function0.invoke();
        }

        public final void c(AndroidViewHolder androidViewHolder) {
            Handler handler = androidViewHolder.getHandler();
            final Function0 function0 = androidViewHolder.runUpdate;
            handler.post(new Runnable() { // from class: androidx.compose.ui.viewinterop.c
                @Override // java.lang.Runnable
                public final void run() {
                    AndroidViewHolder.b.d(function0);
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/Modifier;", "it", "", "a", "(Landroidx/compose/ui/Modifier;)V"}, k = 3, mv = {1, 9, 0})
    static final class d extends Lambda implements Function1<Modifier, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ LayoutNode f52721f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f52722g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(LayoutNode layoutNode, Modifier modifier) {
            super(1);
            this.f52721f = layoutNode;
            this.f52722g = modifier;
        }

        public final void a(Modifier modifier) {
            this.f52721f.setModifier(modifier.then(this.f52722g));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier) {
            a(modifier);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LH1/d;", "it", "", "a", "(LH1/d;)V"}, k = 3, mv = {1, 9, 0})
    static final class e extends Lambda implements Function1<H1.d, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ LayoutNode f52723f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(LayoutNode layoutNode) {
            super(1);
            this.f52723f = layoutNode;
        }

        public final void a(H1.d dVar) {
            this.f52723f.a(dVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(H1.d dVar) {
            a(dVar);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/Owner;", "owner", "", "a", "(Landroidx/compose/ui/node/Owner;)V"}, k = 3, mv = {1, 9, 0})
    static final class f extends Lambda implements Function1<Owner, Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LayoutNode f52725g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(LayoutNode layoutNode) {
            super(1);
            this.f52725g = layoutNode;
        }

        public final void a(Owner owner) {
            AndroidComposeView androidComposeView = owner instanceof AndroidComposeView ? (AndroidComposeView) owner : null;
            if (androidComposeView != null) {
                androidComposeView.h0(AndroidViewHolder.this, this.f52725g);
            }
            ViewParent parent = AndroidViewHolder.this.getView().getParent();
            AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
            if (parent != androidViewHolder) {
                androidViewHolder.addView(androidViewHolder.getView());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Owner owner) {
            a(owner);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/Owner;", "owner", "", "a", "(Landroidx/compose/ui/node/Owner;)V"}, k = 3, mv = {1, 9, 0})
    static final class g extends Lambda implements Function1<Owner, Unit> {
        g() {
            super(1);
        }

        public final void a(Owner owner) {
            if (P0.h.isViewFocusFixEnabled && AndroidViewHolder.this.hasFocus()) {
                owner.getFocusOwner().v(true);
            }
            AndroidComposeView androidComposeView = owner instanceof AndroidComposeView ? (AndroidComposeView) owner : null;
            if (androidComposeView != null) {
                androidComposeView.Q0(AndroidViewHolder.this);
            }
            AndroidViewHolder.this.removeAllViewsInLayout();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Owner owner) {
            a(owner);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J,\u0010\u000f\u001a\u00020\u000e*\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0013\u001a\u00020\u0002*\u00020\u00112\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00120\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0015\u001a\u00020\u0002*\u00020\u00112\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00120\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J)\u0010\u0016\u001a\u00020\u0002*\u00020\u00112\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00120\t2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J)\u0010\u0017\u001a\u00020\u0002*\u00020\u00112\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00120\t2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"androidx/compose/ui/viewinterop/AndroidViewHolder$h", "Landroidx/compose/ui/layout/MeasurePolicy;", "", "height", "b", "(I)I", "width", "a", "Landroidx/compose/ui/layout/K;", "", "Landroidx/compose/ui/layout/I;", "measurables", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "d", "(Landroidx/compose/ui/layout/K;Ljava/util/List;J)Landroidx/compose/ui/layout/J;", "Landroidx/compose/ui/layout/s;", "Landroidx/compose/ui/layout/r;", "i", "(Landroidx/compose/ui/layout/s;Ljava/util/List;I)I", "e", "g", "j", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class h implements MeasurePolicy {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LayoutNode f52728b;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
        static final class a extends Lambda implements Function1<f0.a, Unit> {

            /* renamed from: f, reason: collision with root package name */
            public static final a f52729f = new a();

            a() {
                super(1);
            }

            public final void a(f0.a aVar) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
                a(aVar);
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
        static final class b extends Lambda implements Function1<f0.a, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ AndroidViewHolder f52730f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ LayoutNode f52731g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(AndroidViewHolder androidViewHolder, LayoutNode layoutNode) {
                super(1);
                this.f52730f = androidViewHolder;
                this.f52731g = layoutNode;
            }

            public final void a(f0.a aVar) {
                androidx.compose.ui.viewinterop.d.f(this.f52730f, this.f52731g);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
                a(aVar);
                return Unit.f142422a;
            }
        }

        h(LayoutNode layoutNode) {
            this.f52728b = layoutNode;
        }

        private final int a(int width) {
            AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
            ViewGroup.LayoutParams layoutParams = androidViewHolder.getLayoutParams();
            Intrinsics.g(layoutParams);
            androidViewHolder.measure(androidViewHolder.D(0, width, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
            return AndroidViewHolder.this.getMeasuredHeight();
        }

        private final int b(int height) {
            AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            AndroidViewHolder androidViewHolder2 = AndroidViewHolder.this;
            ViewGroup.LayoutParams layoutParams = androidViewHolder2.getLayoutParams();
            Intrinsics.g(layoutParams);
            androidViewHolder.measure(iMakeMeasureSpec, androidViewHolder2.D(0, height, layoutParams.height));
            return AndroidViewHolder.this.getMeasuredWidth();
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public J d(K k10, List<? extends I> list, long j10) {
            if (AndroidViewHolder.this.getChildCount() == 0) {
                return K.G0(k10, H1.b.n(j10), H1.b.m(j10), null, a.f52729f, 4, null);
            }
            if (H1.b.n(j10) != 0) {
                AndroidViewHolder.this.getChildAt(0).setMinimumWidth(H1.b.n(j10));
            }
            if (H1.b.m(j10) != 0) {
                AndroidViewHolder.this.getChildAt(0).setMinimumHeight(H1.b.m(j10));
            }
            AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
            int iN = H1.b.n(j10);
            int iL = H1.b.l(j10);
            ViewGroup.LayoutParams layoutParams = AndroidViewHolder.this.getLayoutParams();
            Intrinsics.g(layoutParams);
            int iD = androidViewHolder.D(iN, iL, layoutParams.width);
            AndroidViewHolder androidViewHolder2 = AndroidViewHolder.this;
            int iM = H1.b.m(j10);
            int iK = H1.b.k(j10);
            ViewGroup.LayoutParams layoutParams2 = AndroidViewHolder.this.getLayoutParams();
            Intrinsics.g(layoutParams2);
            androidViewHolder.measure(iD, androidViewHolder2.D(iM, iK, layoutParams2.height));
            return K.G0(k10, AndroidViewHolder.this.getMeasuredWidth(), AndroidViewHolder.this.getMeasuredHeight(), null, new b(AndroidViewHolder.this, this.f52728b), 4, null);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public int e(InterfaceC5791s interfaceC5791s, List<? extends androidx.compose.ui.layout.r> list, int i10) {
            return b(i10);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public int g(InterfaceC5791s interfaceC5791s, List<? extends androidx.compose.ui.layout.r> list, int i10) {
            return a(i10);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public int i(InterfaceC5791s interfaceC5791s, List<? extends androidx.compose.ui.layout.r> list, int i10) {
            return b(i10);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public int j(InterfaceC5791s interfaceC5791s, List<? extends androidx.compose.ui.layout.r> list, int i10) {
            return a(i10);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr1/u;", "", "a", "(Lr1/u;)V"}, k = 3, mv = {1, 9, 0})
    static final class i extends Lambda implements Function1<u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final i f52732f = new i();

        i() {
            super(1);
        }

        public final void a(u uVar) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(u uVar) {
            a(uVar);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LX0/f;", "", "a", "(LX0/f;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class j extends Lambda implements Function1<X0.f, Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LayoutNode f52734g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ AndroidViewHolder f52735h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(LayoutNode layoutNode, AndroidViewHolder androidViewHolder) {
            super(1);
            this.f52734g = layoutNode;
            this.f52735h = androidViewHolder;
        }

        public final void a(X0.f fVar) {
            AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
            LayoutNode layoutNode = this.f52734g;
            AndroidViewHolder androidViewHolder2 = this.f52735h;
            Canvas canvasG = fVar.getDrawContext().g();
            if (androidViewHolder.getView().getVisibility() != 8) {
                androidViewHolder.isDrawing = true;
                Owner owner = layoutNode.getOwner();
                AndroidComposeView androidComposeView = owner instanceof AndroidComposeView ? (AndroidComposeView) owner : null;
                if (androidComposeView != null) {
                    androidComposeView.drawAndroidView(androidViewHolder2, AndroidCanvas_androidKt.getNativeCanvas(canvasG));
                }
                androidViewHolder.isDrawing = false;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(X0.f fVar) {
            a(fVar);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/LayoutCoordinates;", "it", "", "a", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V"}, k = 3, mv = {1, 9, 0})
    static final class k extends Lambda implements Function1<LayoutCoordinates, Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LayoutNode f52737g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(LayoutNode layoutNode) {
            super(1);
            this.f52737g = layoutNode;
        }

        public final void a(LayoutCoordinates layoutCoordinates) {
            WindowInsets windowInsetsA;
            androidx.compose.ui.viewinterop.d.f(AndroidViewHolder.this, this.f52737g);
            AndroidViewHolder.this.owner.j(AndroidViewHolder.this);
            int i10 = AndroidViewHolder.this.position[0];
            int i11 = AndroidViewHolder.this.position[1];
            AndroidViewHolder.this.getView().getLocationOnScreen(AndroidViewHolder.this.position);
            long j10 = AndroidViewHolder.this.size;
            AndroidViewHolder.this.size = layoutCoordinates.c();
            androidx.core.view.j jVar = AndroidViewHolder.this.insets;
            if (jVar != null) {
                if ((i10 == AndroidViewHolder.this.position[0] && i11 == AndroidViewHolder.this.position[1] && H1.r.e(j10, AndroidViewHolder.this.size)) || (windowInsetsA = AndroidViewHolder.this.A(jVar).A()) == null) {
                    return;
                }
                AndroidViewHolder.this.getView().dispatchApplyWindowInsets(windowInsetsA);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
            a(layoutCoordinates);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1", f = "AndroidViewHolder.android.kt", l = {639, 641}, m = "invokeSuspend")
    static final class l extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f52738a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f52739b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AndroidViewHolder f52740c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f52741d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(boolean z10, AndroidViewHolder androidViewHolder, long j10, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f52739b = z10;
            this.f52740c = androidViewHolder;
            this.f52741d = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new l(this.f52739b, this.f52740c, this.f52741d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((l) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
        
            if (r4.a(r5, r7, r10) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
        
            if (r1.a(r2, r4, r10) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r10.f52738a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1f
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.b(r11)
                goto L58
            L12:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1a:
                kotlin.ResultKt.b(r11)
                r6 = r10
                goto L58
            L1f:
                kotlin.ResultKt.b(r11)
                boolean r11 = r10.f52739b
                if (r11 != 0) goto L3f
                androidx.compose.ui.viewinterop.AndroidViewHolder r11 = r10.f52740c
                f1.b r4 = androidx.compose.ui.viewinterop.AndroidViewHolder.c(r11)
                H1.y$a r11 = H1.y.INSTANCE
                long r5 = r11.a()
                long r7 = r10.f52741d
                r10.f52738a = r3
                r9 = r10
                java.lang.Object r11 = r4.a(r5, r7, r9)
                r6 = r9
                if (r11 != r0) goto L58
                goto L57
            L3f:
                r6 = r10
                androidx.compose.ui.viewinterop.AndroidViewHolder r11 = r6.f52740c
                f1.b r1 = androidx.compose.ui.viewinterop.AndroidViewHolder.c(r11)
                r11 = r2
                long r2 = r6.f52741d
                H1.y$a r4 = H1.y.INSTANCE
                long r4 = r4.a()
                r6.f52738a = r11
                java.lang.Object r11 = r1.a(r2, r4, r6)
                if (r11 != r0) goto L58
            L57:
                return r0
            L58:
                kotlin.Unit r11 = kotlin.Unit.f142422a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.viewinterop.AndroidViewHolder.l.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1", f = "AndroidViewHolder.android.kt", l = {650}, m = "invokeSuspend")
    static final class m extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f52742a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f52744c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(long j10, Continuation<? super m> continuation) {
            super(2, continuation);
            this.f52744c = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AndroidViewHolder.this.new m(this.f52744c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((m) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f52742a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C13829b c13829b = AndroidViewHolder.this.dispatcher;
                long j10 = this.f52744c;
                this.f52742a = 1;
                if (c13829b.c(j10, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class n extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final n f52745f = new n();

        n() {
            super(0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class o extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final o f52746f = new o();

        o() {
            super(0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class p extends Lambda implements Function0<Unit> {
        p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AndroidViewHolder.this.getLayoutNode().z0();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class q extends Lambda implements Function0<Unit> {
        q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (AndroidViewHolder.this.hasUpdateBlock && AndroidViewHolder.this.isAttachedToWindow()) {
                ViewParent parent = AndroidViewHolder.this.getView().getParent();
                AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
                if (parent == androidViewHolder) {
                    androidViewHolder.getSnapshotObserver().observeReads$ui_release(AndroidViewHolder.this, AndroidViewHolder.f52692C, AndroidViewHolder.this.getUpdate());
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class r extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final r f52749f = new r();

        r() {
            super(0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(this.location);
        int[] iArr = this.location;
        int i10 = iArr[0];
        region.op(i10, iArr[1], i10 + getWidth(), this.location[1] + getHeight(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // p2.InterfaceC16198D
    public boolean o(View child, View target, int axes, int type) {
        return ((axes & 2) == 0 && (axes & 1) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public AndroidViewHolder(Context context, AbstractC5727k abstractC5727k, int i10, C13829b c13829b, View view, Owner owner) {
        super(context);
        this.compositeKeyHash = i10;
        this.dispatcher = c13829b;
        this.view = view;
        this.owner = owner;
        if (abstractC5727k != null) {
            b2.i(this, abstractC5727k);
        }
        setSaveFromParentEnabled(false);
        addView(view);
        ViewCompat.I0(this, new a());
        ViewCompat.A0(this, this);
        this.update = r.f52749f;
        this.reset = o.f52746f;
        this.release = n.f52745f;
        Modifier.Companion companion = Modifier.INSTANCE;
        this.modifier = companion;
        this.density = H1.f.b(1.0f, 0.0f, 2, null);
        this.position = new int[2];
        this.size = H1.r.INSTANCE.a();
        this.runUpdate = new q();
        this.runInvalidate = new p();
        this.location = new int[2];
        this.lastWidthMeasureSpec = Integer.MIN_VALUE;
        this.lastHeightMeasureSpec = Integer.MIN_VALUE;
        this.nestedScrollingParentHelper = new F(this);
        LayoutNode layoutNode = new LayoutNode(false, 0, 3, null);
        layoutNode.x1(true);
        layoutNode.z1(this);
        Modifier modifierA = T.a(androidx.compose.ui.draw.b.b(androidx.compose.ui.graphics.d.c(L.a(C16705m.c(androidx.compose.ui.input.nestedscroll.a.a(companion, androidx.compose.ui.viewinterop.d.f52790a, c13829b), true, i.f52732f), this), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null), new j(layoutNode, this)), new k(layoutNode));
        layoutNode.e(i10);
        layoutNode.setModifier(this.modifier.then(modifierA));
        this.onModifierChanged = new d(layoutNode, modifierA);
        layoutNode.a(this.density);
        this.onDensityChanged = new e(layoutNode);
        layoutNode.F1(new f(layoutNode));
        layoutNode.G1(new g());
        layoutNode.k(new h(layoutNode));
        this.layoutNode = layoutNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.core.view.j A(androidx.core.view.j insets) {
        if (insets.o()) {
            NodeCoordinator nodeCoordinatorP = this.layoutNode.P();
            if (nodeCoordinatorP.isAttached()) {
                long jD = H1.o.d(LayoutCoordinatesKt.e(nodeCoordinatorP));
                int iK = H1.n.k(jD);
                if (iK < 0) {
                    iK = 0;
                }
                int iL = H1.n.l(jD);
                if (iL < 0) {
                    iL = 0;
                }
                long jC = LayoutCoordinatesKt.c(nodeCoordinatorP).c();
                int i10 = (int) (jC >> 32);
                int i11 = (int) (jC & 4294967295L);
                long jC2 = nodeCoordinatorP.c();
                long jD2 = H1.o.d(nodeCoordinatorP.r0(U0.f.e((Float.floatToRawIntBits((int) (jC2 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (jC2 >> 32)) << 32))));
                int iK2 = i10 - H1.n.k(jD2);
                if (iK2 < 0) {
                    iK2 = 0;
                }
                int iL2 = i11 - H1.n.l(jD2);
                int i12 = iL2 < 0 ? 0 : iL2;
                if (iK != 0 || iL != 0 || iK2 != 0 || i12 != 0) {
                    return insets.q(iK, iL, iK2, i12);
                }
            }
        }
        return insets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int D(int min, int max, int preferred) {
        return (preferred >= 0 || min == max) ? View.MeasureSpec.makeMeasureSpec(RangesKt.o(preferred, min, max), 1073741824) : (preferred != -2 || max == Integer.MAX_VALUE) ? (preferred != -1 || max == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(max, 1073741824) : View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE);
    }

    private final c2.d y(c2.d dVar, int i10, int i11, int i12, int i13) {
        int i14 = dVar.f61362a - i10;
        if (i14 < 0) {
            i14 = 0;
        }
        int i15 = dVar.f61363b - i11;
        if (i15 < 0) {
            i15 = 0;
        }
        int i16 = dVar.f61364c - i12;
        if (i16 < 0) {
            i16 = 0;
        }
        int i17 = dVar.f61365d - i13;
        return c2.d.b(i14, i15, i16, i17 >= 0 ? i17 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i.a z(i.a bounds) {
        NodeCoordinator nodeCoordinatorP = this.layoutNode.P();
        if (nodeCoordinatorP.isAttached()) {
            long jD = H1.o.d(LayoutCoordinatesKt.e(nodeCoordinatorP));
            int iK = H1.n.k(jD);
            if (iK < 0) {
                iK = 0;
            }
            int iL = H1.n.l(jD);
            int i10 = iL < 0 ? 0 : iL;
            long jC = LayoutCoordinatesKt.c(nodeCoordinatorP).c();
            int i11 = (int) (jC >> 32);
            int i12 = (int) (jC & 4294967295L);
            long jC2 = nodeCoordinatorP.c();
            long jD2 = H1.o.d(nodeCoordinatorP.r0(U0.f.e((4294967295L & Float.floatToRawIntBits((int) (jC2 & 4294967295L))) | (Float.floatToRawIntBits((int) (jC2 >> 32)) << 32))));
            int iK2 = i11 - H1.n.k(jD2);
            if (iK2 < 0) {
                iK2 = 0;
            }
            int iL2 = i12 - H1.n.l(jD2);
            int i13 = iL2 >= 0 ? iL2 : 0;
            if (iK != 0 || i10 != 0 || iK2 != 0 || i13 != 0) {
                int i14 = iK;
                int i15 = iK2;
                return new i.a(y(bounds.a(), i14, i10, i15, i13), y(bounds.b(), i14, i10, i15, i13));
            }
        }
        return bounds;
    }

    public final void B() {
        if (!this.isDrawing) {
            this.layoutNode.z0();
            return;
        }
        View view = this.view;
        final Function0<Unit> function0 = this.runInvalidate;
        view.postOnAnimation(new Runnable() { // from class: androidx.compose.ui.viewinterop.b
            @Override // java.lang.Runnable
            public final void run() {
                AndroidViewHolder.C(function0);
            }
        });
    }

    public final void E() {
        int i10;
        int i11 = this.lastWidthMeasureSpec;
        if (i11 == Integer.MIN_VALUE || (i10 = this.lastHeightMeasureSpec) == Integer.MIN_VALUE) {
            return;
        }
        measure(i11, i10);
    }

    @Override // androidx.compose.runtime.InterfaceC5719g
    public void b() {
        this.release.invoke();
    }

    public final H1.d getDensity() {
        return this.density;
    }

    /* renamed from: getInteropView, reason: from getter */
    public final View getView() {
        return this.view;
    }

    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final InterfaceC6030s getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.nestedScrollingParentHelper.a();
    }

    public final Function1<H1.d, Unit> getOnDensityChanged$ui_release() {
        return this.onDensityChanged;
    }

    public final Function1<Modifier, Unit> getOnModifierChanged$ui_release() {
        return this.onModifierChanged;
    }

    public final Function1<Boolean, Unit> getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.onRequestDisallowInterceptTouchEvent;
    }

    public final Function0<Unit> getRelease() {
        return this.release;
    }

    public final Function0<Unit> getReset() {
        return this.reset;
    }

    public final x4.i getSavedStateRegistryOwner() {
        return this.savedStateRegistryOwner;
    }

    public final Function0<Unit> getUpdate() {
        return this.update;
    }

    public final View getView() {
        return this.view;
    }

    @Override // androidx.compose.runtime.InterfaceC5719g
    public void h() {
        this.reset.invoke();
        if (P0.h.isRemoveFocusedViewFixEnabled && hasFocus() && isInTouchMode() && Build.VERSION.SDK_INT > 28) {
            findFocus().clearFocus();
        }
        removeAllViewsInLayout();
    }

    @Override // p2.InterfaceC16198D
    public void i(View child, View target, int axes, int type) {
        this.nestedScrollingParentHelper.c(child, target, axes, type);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.view.isNestedScrollingEnabled();
    }

    @Override // p2.InterfaceC16198D
    public void j(View target, int type) {
        this.nestedScrollingParentHelper.e(target, type);
    }

    @Override // androidx.compose.runtime.InterfaceC5719g
    public void l() {
        if (this.view.getParent() != this) {
            addView(this.view);
        } else {
            this.reset.invoke();
        }
    }

    @Override // p2.G
    public androidx.core.view.j onApplyWindowInsets(View v10, androidx.core.view.j insets) {
        this.insets = new androidx.core.view.j(insets);
        return A(insets);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l10, int t10, int r10, int b10) {
        this.view.layout(0, 0, r10 - l10, b10 - t10);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(widthMeasureSpec), View.MeasureSpec.getSize(heightMeasureSpec));
            return;
        }
        if (this.view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        this.view.measure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(this.view.getMeasuredWidth(), this.view.getMeasuredHeight());
        this.lastWidthMeasureSpec = widthMeasureSpec;
        this.lastHeightMeasureSpec = heightMeasureSpec;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        Function1<? super Boolean, Unit> function1 = this.onRequestDisallowInterceptTouchEvent;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(disallowIntercept));
        }
        super.requestDisallowInterceptTouchEvent(disallowIntercept);
    }

    public final void setDensity(H1.d dVar) {
        if (dVar != this.density) {
            this.density = dVar;
            Function1<? super H1.d, Unit> function1 = this.onDensityChanged;
            if (function1 != null) {
                function1.invoke(dVar);
            }
        }
    }

    public final void setLifecycleOwner(InterfaceC6030s interfaceC6030s) {
        if (interfaceC6030s != this.lifecycleOwner) {
            this.lifecycleOwner = interfaceC6030s;
            C6019i0.b(this, interfaceC6030s);
        }
    }

    public final void setModifier(Modifier modifier) {
        if (modifier != this.modifier) {
            this.modifier = modifier;
            Function1<? super Modifier, Unit> function1 = this.onModifierChanged;
            if (function1 != null) {
                function1.invoke(modifier);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(Function1<? super H1.d, Unit> function1) {
        this.onDensityChanged = function1;
    }

    public final void setOnModifierChanged$ui_release(Function1<? super Modifier, Unit> function1) {
        this.onModifierChanged = function1;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(Function1<? super Boolean, Unit> function1) {
        this.onRequestDisallowInterceptTouchEvent = function1;
    }

    protected final void setRelease(Function0<Unit> function0) {
        this.release = function0;
    }

    protected final void setReset(Function0<Unit> function0) {
        this.reset = function0;
    }

    public final void setSavedStateRegistryOwner(x4.i iVar) {
        if (iVar != this.savedStateRegistryOwner) {
            this.savedStateRegistryOwner = iVar;
            x4.m.b(this, iVar);
        }
    }

    protected final void setUpdate(Function0<Unit> function0) {
        this.update = function0;
        this.hasUpdateBlock = true;
        this.runUpdate.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(Function0 function0) {
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OwnerSnapshotObserver getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            C14832a.b("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return this.owner.getSnapshotObserver();
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean e1() {
        return isAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ViewParent invalidateChildInParent(int[] location, Rect dirty) {
        super.invalidateChildInParent(location, dirty);
        B();
        return null;
    }

    @Override // p2.InterfaceC16198D
    public void k(View target, int dx, int dy, int[] consumed, int type) {
        if (!isNestedScrollingEnabled()) {
            return;
        }
        C13829b c13829b = this.dispatcher;
        float fG = androidx.compose.ui.viewinterop.d.g(dx);
        float fG2 = androidx.compose.ui.viewinterop.d.g(dy);
        long jD = c13829b.d(U0.f.e((Float.floatToRawIntBits(fG2) & 4294967295L) | (Float.floatToRawIntBits(fG) << 32)), androidx.compose.ui.viewinterop.d.i(type));
        consumed[0] = W0.b(Float.intBitsToFloat((int) (jD >> 32)));
        consumed[1] = W0.b(Float.intBitsToFloat((int) (jD & 4294967295L)));
    }

    @Override // p2.E
    public void m(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type, int[] consumed) {
        if (!isNestedScrollingEnabled()) {
            return;
        }
        C13829b c13829b = this.dispatcher;
        float fG = androidx.compose.ui.viewinterop.d.g(dxConsumed);
        float fG2 = androidx.compose.ui.viewinterop.d.g(dyConsumed);
        long jE = U0.f.e((Float.floatToRawIntBits(fG2) & 4294967295L) | (Float.floatToRawIntBits(fG) << 32));
        float fG3 = androidx.compose.ui.viewinterop.d.g(dxUnconsumed);
        float fG4 = androidx.compose.ui.viewinterop.d.g(dyUnconsumed);
        long jB = c13829b.b(jE, U0.f.e((Float.floatToRawIntBits(fG4) & 4294967295L) | (Float.floatToRawIntBits(fG3) << 32)), androidx.compose.ui.viewinterop.d.i(type));
        consumed[0] = W0.b(Float.intBitsToFloat((int) (jB >> 32)));
        consumed[1] = W0.b(Float.intBitsToFloat((int) (jB & 4294967295L)));
    }

    @Override // p2.InterfaceC16198D
    public void n(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
        if (!isNestedScrollingEnabled()) {
            return;
        }
        C13829b c13829b = this.dispatcher;
        float fG = androidx.compose.ui.viewinterop.d.g(dxConsumed);
        float fG2 = androidx.compose.ui.viewinterop.d.g(dyConsumed);
        long jE = U0.f.e((Float.floatToRawIntBits(fG2) & 4294967295L) | (Float.floatToRawIntBits(fG) << 32));
        float fG3 = androidx.compose.ui.viewinterop.d.g(dxUnconsumed);
        float fG4 = androidx.compose.ui.viewinterop.d.g(dyUnconsumed);
        c13829b.b(jE, U0.f.e((Float.floatToRawIntBits(fG4) & 4294967295L) | (Float.floatToRawIntBits(fG3) << 32)), androidx.compose.ui.viewinterop.d.i(type));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.runUpdate.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View child, View target) {
        super.onDescendantInvalidated(child, target);
        B();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().a(this);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View target, float velocityX, float velocityY, boolean consumed) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        C16648k.d(this.dispatcher.e(), null, null, new l(consumed, this, z.a(androidx.compose.ui.viewinterop.d.h(velocityX), androidx.compose.ui.viewinterop.d.h(velocityY)), null), 3, null);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View target, float velocityX, float velocityY) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        C16648k.d(this.dispatcher.e(), null, null, new m(z.a(androidx.compose.ui.viewinterop.d.h(velocityX), androidx.compose.ui.viewinterop.d.h(velocityY)), null), 3, null);
        return false;
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int visibility) {
        super.onWindowVisibilityChanged(visibility);
    }
}
