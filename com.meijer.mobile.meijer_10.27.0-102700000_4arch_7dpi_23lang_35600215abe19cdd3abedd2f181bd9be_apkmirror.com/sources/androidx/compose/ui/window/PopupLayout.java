package androidx.compose.ui.window;

import H1.t;
import android.R;
import android.annotation.SuppressLint;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.WindowManager;
import androidx.compose.runtime.AbstractC5727k;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.t1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.T1;
import androidx.compose.ui.window.PopupLayout;
import androidx.view.C6019i0;
import androidx.view.C6021j0;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\u0015\n\u0002\b\t\b\u0001\u0018\u0000 \u009b\u00012\u00020\u00012\u00020\u0002:\u0002\u009c\u0001BQ\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u0004¢\u0006\u0004\b%\u0010\u0017J#\u0010)\u001a\u00020\u00042\u0006\u0010'\u001a\u00020&2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0004H\u0017¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0004H\u0014¢\u0006\u0004\b-\u0010\u0017J\u000f\u0010.\u001a\u00020\u0004H\u0014¢\u0006\u0004\b.\u0010\u0017J\u001f\u00102\u001a\u00020\u00042\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020/H\u0010¢\u0006\u0004\b2\u00103J7\u0010:\u001a\u00020\u00042\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020/2\u0006\u00107\u001a\u00020/2\u0006\u00108\u001a\u00020/2\u0006\u00109\u001a\u00020/H\u0010¢\u0006\u0004\b:\u0010;J\u0017\u0010>\u001a\u0002042\u0006\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\b>\u0010?J5\u0010@\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b@\u0010AJ\u0015\u0010D\u001a\u00020\u00042\u0006\u0010C\u001a\u00020B¢\u0006\u0004\bD\u0010EJ\r\u0010F\u001a\u00020\u0004¢\u0006\u0004\bF\u0010\u0017J\u000f\u0010G\u001a\u00020\u0004H\u0001¢\u0006\u0004\bG\u0010\u0017J\r\u0010H\u001a\u00020\u0004¢\u0006\u0004\bH\u0010\u0017J\r\u0010I\u001a\u00020\u0004¢\u0006\u0004\bI\u0010\u0017J\u0019\u0010K\u001a\u0002042\b\u0010=\u001a\u0004\u0018\u00010JH\u0016¢\u0006\u0004\bK\u0010LJ\u0017\u0010M\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020/H\u0016¢\u0006\u0004\bM\u0010NR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010YR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010ZR\u0014\u0010]\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\\R \u0010a\u001a\u00020\u001f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010^\u0012\u0004\b`\u0010\u0017\u001a\u0004\b_\u0010!R\"\u0010g\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010l\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010\u001eR5\u0010t\u001a\u0004\u0018\u00010m2\b\u0010n\u001a\u0004\u0018\u00010m8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b%\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR/\u0010C\u001a\u0004\u0018\u00010B2\b\u0010n\u001a\u0004\u0018\u00010B8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010o\u001a\u0004\bu\u0010v\"\u0004\bw\u0010ER\u0018\u0010y\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010xR\u001b\u0010}\u001a\u0002048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bG\u0010z\u001a\u0004\b{\u0010|R\u001b\u0010\u0080\u0001\u001a\u00020~8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bD\u0010\u007fR\u0017\u0010\u0083\u0001\u001a\u00030\u0081\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0019\u0010\u0082\u0001R\u0017\u0010\u0086\u0001\u001a\u00030\u0084\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bH\u0010\u0085\u0001R\u001c\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0087\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R<\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038B@BX\u0082\u008e\u0002¢\u0006\u0017\n\u0005\b\u008b\u0001\u0010o\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R(\u0010\u0093\u0001\u001a\u0002042\u0006\u0010n\u001a\u0002048\u0014@RX\u0094\u000e¢\u0006\u000f\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0005\b\u0092\u0001\u0010|R\u0018\u0010\u0097\u0001\u001a\u00030\u0094\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0017\u0010\u009a\u0001\u001a\u00020\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u009d\u0001"}, d2 = {"Landroidx/compose/ui/window/PopupLayout;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroidx/compose/ui/platform/T1;", "Lkotlin/Function0;", "", "onDismissRequest", "Landroidx/compose/ui/window/q;", "properties", "", "testTag", "Landroid/view/View;", "composeView", "LH1/d;", "density", "Landroidx/compose/ui/window/p;", "initialPositionProvider", "Ljava/util/UUID;", "popupId", "Landroidx/compose/ui/window/l;", "popupLayoutHelper", "<init>", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/q;Ljava/lang/String;Landroid/view/View;LH1/d;Landroidx/compose/ui/window/p;Ljava/util/UUID;Landroidx/compose/ui/window/l;)V", "n", "()V", "o", "w", "(Landroidx/compose/ui/window/q;)V", "LH1/t;", "layoutDirection", "s", "(LH1/t;)V", "Landroid/view/WindowManager$LayoutParams;", "l", "()Landroid/view/WindowManager$LayoutParams;", "LH1/p;", "getVisibleDisplayBounds", "()LH1/p;", "r", "Landroidx/compose/runtime/k;", "parent", "content", "q", "(Landroidx/compose/runtime/k;Lkotlin/jvm/functions/Function2;)V", "a", "(Landroidx/compose/runtime/Composer;I)V", "onAttachedToWindow", "onDetachedFromWindow", "", "widthMeasureSpec", "heightMeasureSpec", "h", "(II)V", "", "changed", "left", "top", "right", "bottom", "g", "(ZIIII)V", "Landroid/view/KeyEvent;", "event", "dispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "t", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/q;Ljava/lang/String;LH1/t;)V", "Landroidx/compose/ui/layout/LayoutCoordinates;", "parentLayoutCoordinates", "v", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "p", "u", "x", "m", "Landroid/view/MotionEvent;", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "setLayoutDirection", "(I)V", "i", "Lkotlin/jvm/functions/Function0;", "j", "Landroidx/compose/ui/window/q;", "k", "Ljava/lang/String;", "getTestTag", "()Ljava/lang/String;", "setTestTag", "(Ljava/lang/String;)V", "Landroid/view/View;", "Landroidx/compose/ui/window/l;", "Landroid/view/WindowManager;", "Landroid/view/WindowManager;", "windowManager", "Landroid/view/WindowManager$LayoutParams;", "getParams$ui_release", "getParams$ui_release$annotations", "params", "Landroidx/compose/ui/window/p;", "getPositionProvider", "()Landroidx/compose/ui/window/p;", "setPositionProvider", "(Landroidx/compose/ui/window/p;)V", "positionProvider", "LH1/t;", "getParentLayoutDirection", "()LH1/t;", "setParentLayoutDirection", "parentLayoutDirection", "LH1/r;", "<set-?>", "Landroidx/compose/runtime/l0;", "getPopupContentSize-bOM6tXw", "()LH1/r;", "setPopupContentSize-fhxjrPA", "(LH1/r;)V", "popupContentSize", "getParentLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setParentLayoutCoordinates", "LH1/p;", "parentBounds", "Landroidx/compose/runtime/z1;", "getCanCalculatePosition", "()Z", "canCalculatePosition", "LH1/h;", "F", "maxSupportedElevation", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "previousWindowVisibleFrame", "Landroidx/compose/runtime/snapshots/k;", "Landroidx/compose/runtime/snapshots/k;", "snapshotStateObserver", "", "y", "Ljava/lang/Object;", "backCallback", "z", "getContent", "()Lkotlin/jvm/functions/Function2;", "setContent", "(Lkotlin/jvm/functions/Function2;)V", "A", "Z", "getShouldCreateCompositionOnAttachedToWindow", "shouldCreateCompositionOnAttachedToWindow", "", "B", "[I", "locationOnScreen", "getSubCompositionView", "()Landroidx/compose/ui/platform/AbstractComposeView;", "subCompositionView", "C", "c", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension
/* loaded from: classes.dex */
public final class PopupLayout extends AbstractComposeView implements T1 {

    /* renamed from: C, reason: collision with root package name */
    private static final c f52834C = new c(null);

    /* renamed from: D, reason: collision with root package name */
    public static final int f52835D = 8;

    /* renamed from: E, reason: collision with root package name */
    private static final Function1<PopupLayout, Unit> f52836E = b.f52857f;

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private boolean shouldCreateCompositionOnAttachedToWindow;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final int[] locationOnScreen;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private Function0<Unit> onDismissRequest;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private q properties;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private String testTag;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final View composeView;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final l popupLayoutHelper;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final WindowManager windowManager;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final WindowManager.LayoutParams params;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private p positionProvider;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private t parentLayoutDirection;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 popupContentSize;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 parentLayoutCoordinates;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private H1.p parentBounds;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final z1 canCalculatePosition;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final float maxSupportedElevation;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final Rect previousWindowVisibleFrame;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.runtime.snapshots.k snapshotStateObserver;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private Object backCallback;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 content;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/window/PopupLayout;", "popupLayout", "", "a", "(Landroidx/compose/ui/window/PopupLayout;)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends Lambda implements Function1<PopupLayout, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f52857f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PopupLayout popupLayout) {
            a(popupLayout);
            return Unit.f142422a;
        }

        public final void a(PopupLayout popupLayout) {
            if (popupLayout.isAttachedToWindow()) {
                popupLayout.x();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/window/PopupLayout$c;", "", "<init>", "()V", "Lkotlin/Function1;", "Landroidx/compose/ui/window/PopupLayout;", "", "onCommitAffectingPopupPosition", "Lkotlin/jvm/functions/Function1;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.f12006a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.f12007b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class e extends Lambda implements Function0<Boolean> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            LayoutCoordinates parentLayoutCoordinates = PopupLayout.this.getParentLayoutCoordinates();
            if (parentLayoutCoordinates == null || !parentLayoutCoordinates.isAttached()) {
                parentLayoutCoordinates = null;
            }
            return Boolean.valueOf((parentLayoutCoordinates == null || PopupLayout.this.m15getPopupContentSizebOM6tXw() == null) ? false : true);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "", "command", "c", "(Lkotlin/jvm/functions/Function0;)V"}, k = 3, mv = {1, 9, 0})
    static final class f extends Lambda implements Function1<Function0<? extends Unit>, Unit> {
        f() {
            super(1);
        }

        public final void c(final Function0<Unit> function0) {
            Handler handler = PopupLayout.this.getHandler();
            if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                function0.invoke();
                return;
            }
            Handler handler2 = PopupLayout.this.getHandler();
            if (handler2 != null) {
                handler2.post(new Runnable() { // from class: androidx.compose.ui.window.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        PopupLayout.f.d(function0);
                    }
                });
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Function0<? extends Unit> function0) {
            c(function0);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(Function0 function0) {
            function0.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class g extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Ref.LongRef f52860f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ PopupLayout f52861g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ H1.p f52862h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f52863i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ long f52864j;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Ref.LongRef longRef, PopupLayout popupLayout, H1.p pVar, long j10, long j11) {
            super(0);
            this.f52860f = longRef;
            this.f52861g = popupLayout;
            this.f52862h = pVar;
            this.f52863i = j10;
            this.f52864j = j11;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f52860f.f142834a = this.f52861g.getPositionProvider().a(this.f52862h, this.f52863i, this.f52861g.getParentLayoutDirection(), this.f52864j);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PopupLayout(Function0 function0, q qVar, String str, View view, H1.d dVar, p pVar, UUID uuid, l lVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        l nVar;
        if ((i10 & 128) != 0) {
            nVar = Build.VERSION.SDK_INT >= 29 ? new n() : new o();
        } else {
            nVar = lVar;
        }
        this(function0, qVar, str, view, dVar, pVar, uuid, nVar);
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    @Override // androidx.compose.ui.platform.T1
    public AbstractComposeView getSubCompositionView() {
        return this;
    }

    @Override // androidx.compose.ui.platform.T1
    public /* bridge */ /* synthetic */ View getViewRoot() {
        return super.getViewRoot();
    }

    public final void m() {
        C6019i0.b(this, null);
        this.windowManager.removeViewImmediate(this);
    }

    @Override // android.view.View
    public void setLayoutDirection(int layoutDirection) {
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/compose/ui/window/PopupLayout$a", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", "view", "Landroid/graphics/Outline;", "result", "", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline result) {
            result.setRect(0, 0, view.getWidth(), view.getHeight());
            result.setAlpha(0.0f);
        }
    }

    private final Function2<Composer, Integer, Unit> getContent() {
        return (Function2) this.content.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutCoordinates getParentLayoutCoordinates() {
        return (LayoutCoordinates) this.parentLayoutCoordinates.getValue();
    }

    private final H1.p getVisibleDisplayBounds() {
        Rect rect = this.previousWindowVisibleFrame;
        this.popupLayoutHelper.a(this.composeView, rect);
        return androidx.compose.ui.window.b.j(rect);
    }

    private final WindowManager.LayoutParams l() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = androidx.compose.ui.window.b.h(this.properties, androidx.compose.ui.window.b.i(this.composeView));
        layoutParams.type = 1002;
        layoutParams.token = this.composeView.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(this.composeView.getContext().getResources().getString(P0.l.f24559e));
        return layoutParams;
    }

    private final void n() {
        if (!this.properties.getDismissOnBackPress() || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.backCallback == null) {
            this.backCallback = androidx.compose.ui.window.e.b(this.onDismissRequest);
        }
        androidx.compose.ui.window.e.d(this, this.backCallback);
    }

    private final void o() {
        if (Build.VERSION.SDK_INT >= 33) {
            androidx.compose.ui.window.e.e(this, this.backCallback);
        }
        this.backCallback = null;
    }

    private final void s(t layoutDirection) {
        int i10 = d.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        int i11 = 1;
        if (i10 == 1) {
            i11 = 0;
        } else if (i10 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        super.setLayoutDirection(i11);
    }

    private final void setContent(Function2<? super Composer, ? super Integer, Unit> function2) {
        this.content.setValue(function2);
    }

    private final void setParentLayoutCoordinates(LayoutCoordinates layoutCoordinates) {
        this.parentLayoutCoordinates.setValue(layoutCoordinates);
    }

    private final void w(q properties) {
        if (Intrinsics.e(this.properties, properties)) {
            return;
        }
        if (properties.getUsePlatformDefaultWidth() && !this.properties.getUsePlatformDefaultWidth()) {
            WindowManager.LayoutParams layoutParams = this.params;
            layoutParams.width = -2;
            layoutParams.height = -2;
        }
        this.properties = properties;
        this.params.flags = androidx.compose.ui.window.b.h(properties, androidx.compose.ui.window.b.i(this.composeView));
        this.popupLayoutHelper.b(this.windowManager, this, this.params);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent event) {
        if (!this.properties.getDismissOnBackPress()) {
            return super.dispatchKeyEvent(event);
        }
        if (event.getKeyCode() == 4 || event.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(event);
            }
            if (event.getAction() == 0 && event.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(event, this);
                return true;
            }
            if (event.getAction() == 1 && keyDispatcherState.isTracking(event) && !event.isCanceled()) {
                Function0<Unit> function0 = this.onDismissRequest;
                if (function0 != null) {
                    function0.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(event);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.canCalculatePosition.getValue()).booleanValue();
    }

    /* renamed from: getParams$ui_release, reason: from getter */
    public final WindowManager.LayoutParams getParams() {
        return this.params;
    }

    public final t getParentLayoutDirection() {
        return this.parentLayoutDirection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final H1.r m15getPopupContentSizebOM6tXw() {
        return (H1.r) this.popupContentSize.getValue();
    }

    public final p getPositionProvider() {
        return this.positionProvider;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    public final String getTestTag() {
        return this.testTag;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void h(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.properties.getUsePlatformDefaultWidth()) {
            super.h(widthMeasureSpec, heightMeasureSpec);
        } else {
            H1.p visibleDisplayBounds = getVisibleDisplayBounds();
            super.h(View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.j(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.e(), Integer.MIN_VALUE));
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (!this.properties.getDismissOnClickOutside()) {
            return super.onTouchEvent(event);
        }
        if (event != null && event.getAction() == 0 && (event.getX() < 0.0f || event.getX() >= getWidth() || event.getY() < 0.0f || event.getY() >= getHeight())) {
            Function0<Unit> function0 = this.onDismissRequest;
            if (function0 != null) {
                function0.invoke();
            }
            return true;
        }
        if (event == null || event.getAction() != 4) {
            return super.onTouchEvent(event);
        }
        Function0<Unit> function02 = this.onDismissRequest;
        if (function02 != null) {
            function02.invoke();
        }
        return true;
    }

    public final void p() {
        int[] iArr = this.locationOnScreen;
        int i10 = iArr[0];
        int i11 = iArr[1];
        this.composeView.getLocationOnScreen(iArr);
        int[] iArr2 = this.locationOnScreen;
        if (i10 == iArr2[0] && i11 == iArr2[1]) {
            return;
        }
        u();
    }

    public final void r() {
        this.windowManager.addView(this, this.params);
    }

    public final void setParentLayoutDirection(t tVar) {
        this.parentLayoutDirection = tVar;
    }

    /* renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m16setPopupContentSizefhxjrPA(H1.r rVar) {
        this.popupContentSize.setValue(rVar);
    }

    public final void setPositionProvider(p pVar) {
        this.positionProvider = pVar;
    }

    public final void setTestTag(String str) {
        this.testTag = str;
    }

    public final void t(Function0<Unit> onDismissRequest, q properties, String testTag, t layoutDirection) {
        this.onDismissRequest = onDismissRequest;
        this.testTag = testTag;
        w(properties);
        s(layoutDirection);
    }

    public final void x() {
        H1.r rVarM15getPopupContentSizebOM6tXw;
        H1.p pVar = this.parentBounds;
        if (pVar == null || (rVarM15getPopupContentSizebOM6tXw = m15getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long packedValue = rVarM15getPopupContentSizebOM6tXw.getPackedValue();
        H1.p visibleDisplayBounds = getVisibleDisplayBounds();
        long jC = H1.r.c((visibleDisplayBounds.j() << 32) | (visibleDisplayBounds.e() & 4294967295L));
        Ref.LongRef longRef = new Ref.LongRef();
        longRef.f142834a = H1.n.INSTANCE.b();
        this.snapshotStateObserver.p(this, f52836E, new g(longRef, this, pVar, jC, packedValue));
        this.params.x = H1.n.k(longRef.f142834a);
        this.params.y = H1.n.l(longRef.f142834a);
        if (this.properties.getExcludeFromSystemGesture()) {
            this.popupLayoutHelper.c(this, (int) (jC >> 32), (int) (jC & 4294967295L));
        }
        this.popupLayoutHelper.b(this.windowManager, this, this.params);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void a(Composer composer, int i10) {
        composer.startReplaceGroup(-857613600);
        if (ComposerKt.M()) {
            ComposerKt.U(-857613600, i10, -1, "androidx.compose.ui.window.PopupLayout.Content (AndroidPopup.android.kt:572)");
        }
        getContent().invoke(composer, 0);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void g(boolean changed, int left, int top, int right, int bottom) {
        View childAt;
        super.g(changed, left, top, right, bottom);
        if (!this.properties.getUsePlatformDefaultWidth() && (childAt = getChildAt(0)) != null) {
            this.params.width = childAt.getMeasuredWidth();
            this.params.height = childAt.getMeasuredHeight();
            this.popupLayoutHelper.b(this.windowManager, this, this.params);
        }
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.snapshotStateObserver.t();
        n();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.snapshotStateObserver.u();
        this.snapshotStateObserver.k();
        o();
    }

    public final void q(AbstractC5727k parent, Function2<? super Composer, ? super Integer, Unit> content) {
        setParentCompositionContext(parent);
        setContent(content);
        this.shouldCreateCompositionOnAttachedToWindow = true;
    }

    public final void u() {
        LayoutCoordinates parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.isAttached()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates != null) {
                long jC = parentLayoutCoordinates.c();
                long jF = LayoutCoordinatesKt.f(parentLayoutCoordinates);
                H1.p pVarA = H1.q.a(H1.n.f((Math.round(Float.intBitsToFloat((int) (jF >> 32))) << 32) | (4294967295L & Math.round(Float.intBitsToFloat((int) (jF & 4294967295L))))), jC);
                if (!Intrinsics.e(pVarA, this.parentBounds)) {
                    this.parentBounds = pVarA;
                    x();
                }
            }
        }
    }

    public final void v(LayoutCoordinates parentLayoutCoordinates) {
        setParentLayoutCoordinates(parentLayoutCoordinates);
        u();
    }

    public PopupLayout(Function0<Unit> function0, q qVar, String str, View view, H1.d dVar, p pVar, UUID uuid, l lVar) {
        super(view.getContext(), null, 0, 6, null);
        this.onDismissRequest = function0;
        this.properties = qVar;
        this.testTag = str;
        this.composeView = view;
        this.popupLayoutHelper = lVar;
        Object systemService = view.getContext().getSystemService("window");
        Intrinsics.h(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.windowManager = (WindowManager) systemService;
        this.params = l();
        this.positionProvider = pVar;
        this.parentLayoutDirection = t.f12006a;
        this.popupContentSize = t1.e(null, null, 2, null);
        this.parentLayoutCoordinates = t1.e(null, null, 2, null);
        this.canCalculatePosition = o1.e(new e());
        float fP = H1.h.p(8);
        this.maxSupportedElevation = fP;
        this.previousWindowVisibleFrame = new Rect();
        this.snapshotStateObserver = new androidx.compose.runtime.snapshots.k(new f());
        setId(R.id.content);
        C6019i0.b(this, C6019i0.a(view));
        C6021j0.b(this, C6021j0.a(view));
        x4.m.b(this, x4.m.a(view));
        setTag(P0.k.f24524H, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(dVar.I1(fP));
        setOutlineProvider(new a());
        this.content = t1.e(androidx.compose.ui.window.g.f52928a.a(), null, 2, null);
        this.locationOnScreen = new int[2];
    }
}
