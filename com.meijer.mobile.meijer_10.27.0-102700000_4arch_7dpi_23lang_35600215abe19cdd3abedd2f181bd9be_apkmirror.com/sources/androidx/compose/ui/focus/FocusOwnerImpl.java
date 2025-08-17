package androidx.compose.ui.focus;

import Z.T;
import android.view.KeyEvent;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.y;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.AbstractC5817m;
import androidx.compose.ui.node.C5804c0;
import androidx.compose.ui.node.C5810f0;
import androidx.compose.ui.node.C5815k;
import androidx.compose.ui.node.InterfaceC5814j;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Y;
import e1.C13603c;
import e1.C13604d;
import i1.InterfaceC14590a;
import i1.RotaryScrollEvent;
import j1.C14832a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B¬\u0001\u0012\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012:\u0010\u000e\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00010\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0006\u0012!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\r0\u0002\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u0004\u0018\u00010 *\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\r2\u0006\u0010$\u001a\u00020#H\u0002ø\u0001\u0000¢\u0006\u0004\b%\u0010&J&\u0010'\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b'\u0010(J$\u0010)\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0004H\u0016¢\u0006\u0004\b+\u0010\u001bJ\u0017\u0010-\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\rH\u0016¢\u0006\u0004\b-\u0010.J2\u00100\u001a\u00020\r2\u0006\u0010,\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010/\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b0\u00101J\u001a\u00102\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b2\u00103J:\u00106\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\u00072\b\u00104\u001a\u0004\u0018\u00010\u000b2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\r0\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b6\u00107J(\u00109\u001a\u00020\r2\u0006\u0010$\u001a\u00020#2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\r0\u0003H\u0016ø\u0001\u0000¢\u0006\u0004\b9\u0010:J\u001a\u0010;\u001a\u00020\r2\u0006\u0010$\u001a\u00020#H\u0016ø\u0001\u0000¢\u0006\u0004\b;\u0010&J%\u0010>\u001a\u00020\r2\u0006\u0010=\u001a\u00020<2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\r0\u0003H\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010A\u001a\u00020\u00042\u0006\u0010@\u001a\u00020\u001cH\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010D\u001a\u00020\u00042\u0006\u0010@\u001a\u00020CH\u0016¢\u0006\u0004\bD\u0010EJ\u0017\u0010G\u001a\u00020\u00042\u0006\u0010@\u001a\u00020FH\u0016¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\u0004H\u0016¢\u0006\u0004\bI\u0010\u001bJ\u0011\u0010J\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\bJ\u0010KRH\u0010\u000e\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00010\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR/\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\r0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010NR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010OR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010OR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010OR\"\u0010U\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010\u001e\"\u0004\bT\u0010BR\u0014\u0010X\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010WR\u001a\u0010]\u001a\u00020Y8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\bP\u0010\\R\u001a\u0010a\u001a\u00020^8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010_\u001a\u0004\bL\u0010`R\u0018\u0010d\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010cR \u0010j\u001a\b\u0012\u0004\u0012\u00020f0e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010g\u001a\u0004\bh\u0010iR.\u0010n\u001a\u0004\u0018\u00010\u001c2\b\u0010k\u001a\u0004\u0018\u00010\u001c8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bl\u0010R\u001a\u0004\bZ\u0010\u001e\"\u0004\bm\u0010BR*\u0010s\u001a\u00020\r2\u0006\u0010k\u001a\u00020\r8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bo\u0010q\"\u0004\br\u0010.R\u0014\u0010w\u001a\u00020t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bu\u0010v\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006x"}, d2 = {"Landroidx/compose/ui/focus/FocusOwnerImpl;", "Landroidx/compose/ui/focus/s;", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "onRequestApplyChangesListener", "Lkotlin/Function2;", "Landroidx/compose/ui/focus/f;", "Lkotlin/ParameterName;", "name", "focusDirection", "Landroidx/compose/ui/geometry/Rect;", "previouslyFocusedRect", "", "onRequestFocusForOwner", "onMoveFocusInterop", "onClearFocusForOwner", "onFocusRectInterop", "LH1/t;", "onLayoutDirection", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "forced", "refreshFocusEvents", "y", "(ZZ)Z", "B", "()V", "Landroidx/compose/ui/focus/FocusTargetNode;", "z", "()Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/node/j;", "Landroidx/compose/ui/Modifier$c;", "C", "(Landroidx/compose/ui/node/j;)Landroidx/compose/ui/Modifier$c;", "Le1/b;", "keyEvent", "F", "(Landroid/view/KeyEvent;)Z", "u", "(Landroidx/compose/ui/focus/f;Landroidx/compose/ui/geometry/Rect;)Z", "E", "(ILandroidx/compose/ui/geometry/Rect;)Z", "s", "force", "v", "(Z)V", "clearOwnerFocus", "n", "(ZZZI)Z", "e", "(I)Z", "focusedRect", "onFound", "w", "(ILandroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;", "onFocusedItem", "k", "(Landroid/view/KeyEvent;Lkotlin/jvm/functions/Function0;)Z", "g", "Li1/b;", "event", "c", "(Li1/b;Lkotlin/jvm/functions/Function0;)Z", "node", "i", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "Landroidx/compose/ui/focus/i;", "b", "(Landroidx/compose/ui/focus/i;)V", "Landroidx/compose/ui/focus/w;", "p", "(Landroidx/compose/ui/focus/w;)V", "j", "q", "()Landroidx/compose/ui/geometry/Rect;", "a", "Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function0;", "d", "f", "Landroidx/compose/ui/focus/FocusTargetNode;", "A", "setRootFocusNode$ui_release", "rootFocusNode", "Landroidx/compose/ui/focus/m;", "Landroidx/compose/ui/focus/m;", "focusInvalidationManager", "Landroidx/compose/ui/focus/J;", "h", "Landroidx/compose/ui/focus/J;", "()Landroidx/compose/ui/focus/J;", "focusTransactionManager", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/Modifier;", "()Landroidx/compose/ui/Modifier;", "modifier", "LZ/P;", "LZ/P;", "keysCurrentlyDown", "LZ/T;", "Landroidx/compose/ui/focus/n;", "LZ/T;", "t", "()LZ/T;", "listeners", "value", "l", "r", "activeFocusTargetNode", "m", "Z", "()Z", "D", "isFocusCaptured", "Landroidx/compose/ui/focus/E;", "o", "()Landroidx/compose/ui/focus/E;", "rootState", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class FocusOwnerImpl implements s {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function2<C5763f, Rect, Boolean> onRequestFocusForOwner;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function1<C5763f, Boolean> onMoveFocusInterop;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> onClearFocusForOwner;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Function0<Rect> onFocusRectInterop;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Function0<H1.t> onLayoutDirection;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final C5770m focusInvalidationManager;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private Z.P keysCurrentlyDown;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private FocusTargetNode activeFocusTargetNode;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean isFocusCaptured;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private FocusTargetNode rootFocusNode = new FocusTargetNode(M.INSTANCE.b(), null, null, 6, null);

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final J focusTransactionManager = new J();

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Modifier modifier = new Y<FocusTargetNode>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
        public boolean equals(Object other) {
            return other == this;
        }

        @Override // androidx.compose.ui.node.Y
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public void c(FocusTargetNode node) {
        }

        public int hashCode() {
            return this.f50602b.getRootFocusNode().hashCode();
        }

        @Override // androidx.compose.ui.node.Y
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public FocusTargetNode getNode() {
            return this.f50602b.getRootFocusNode();
        }
    };

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final T<InterfaceC5771n> listeners = new T<>(1);

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC5760c.values().length];
            try {
                iArr[EnumC5760c.f50643c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC5760c.f50642b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC5760c.f50644d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC5760c.f50641a.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f50595f = new b();

        b() {
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

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class c extends FunctionReferenceImpl implements Function0<Unit> {
        c(Object obj) {
            super(0, obj, FocusOwnerImpl.class, "invalidateOwnerFocusState", "invalidateOwnerFocusState()V", 0);
        }

        public final void a() {
            ((FocusOwnerImpl) this.receiver).B();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "it", "", "a", "(Landroidx/compose/ui/focus/FocusTargetNode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class f extends Lambda implements Function1<FocusTargetNode, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f50596f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ FocusOwnerImpl f50597g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<FocusTargetNode, Boolean> f50598h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(FocusTargetNode focusTargetNode, FocusOwnerImpl focusOwnerImpl, Function1<? super FocusTargetNode, Boolean> function1) {
            super(1);
            this.f50596f = focusTargetNode;
            this.f50597g = focusOwnerImpl;
            this.f50598h = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            boolean zBooleanValue;
            if (Intrinsics.e(focusTargetNode, this.f50596f)) {
                zBooleanValue = false;
            } else {
                if (Intrinsics.e(focusTargetNode, this.f50597g.getRootFocusNode())) {
                    throw new IllegalStateException("Focus search landed at the root.");
                }
                zBooleanValue = this.f50598h.invoke(focusTargetNode).booleanValue();
            }
            return Boolean.valueOf(zBooleanValue);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "it", "", "a", "(Landroidx/compose/ui/focus/FocusTargetNode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class g extends Lambda implements Function1<FocusTargetNode, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<Boolean> f50599f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f50600g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Ref.ObjectRef<Boolean> objectRef, int i10) {
            super(1);
            this.f50599f = objectRef;
            this.f50600g = i10;
        }

        /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.Boolean] */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            this.f50599f.f142835a = Boolean.valueOf(focusTargetNode.W(this.f50600g));
            Boolean bool = this.f50599f.f142835a;
            return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "it", "", "a", "(Landroidx/compose/ui/focus/FocusTargetNode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class h extends Lambda implements Function1<FocusTargetNode, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f50601f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(int i10) {
            super(1);
            this.f50601f = i10;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            return Boolean.valueOf(focusTargetNode.W(this.f50601f));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B() {
        if ((P0.h.isTrackFocusEnabled && getActiveFocusTargetNode() == null) || this.rootFocusNode.d0() == F.f50579d) {
            this.onClearFocusForOwner.invoke();
        }
    }

    private final Modifier.c C(InterfaceC5814j interfaceC5814j) {
        int iA = C5810f0.a(1024) | C5810f0.a(8192);
        if (!interfaceC5814j.getNode().getIsAttached()) {
            C14832a.b("visitLocalDescendants called on an unattached node");
        }
        Modifier.c node = interfaceC5814j.getNode();
        Modifier.c cVar = null;
        if ((node.getAggregateChildKindSet() & iA) != 0) {
            for (Modifier.c child = node.getChild(); child != null; child = child.getChild()) {
                if ((child.getKindSet() & iA) != 0) {
                    if ((C5810f0.a(1024) & child.getKindSet()) != 0) {
                        return cVar;
                    }
                    cVar = child;
                }
            }
        }
        return cVar;
    }

    private final FocusTargetNode z() {
        return L.b(this.rootFocusNode);
    }

    /* renamed from: A, reason: from getter */
    public final FocusTargetNode getRootFocusNode() {
        return this.rootFocusNode;
    }

    public void D(boolean z10) {
        if (!((z10 && getActiveFocusTargetNode() == null) ? false : true)) {
            C14832a.a("Cannot capture focus when the active focus target node is unset");
        }
        this.isFocusCaptured = z10;
    }

    public boolean E(int focusDirection, Rect previouslyFocusedRect) {
        Boolean boolW = w(focusDirection, previouslyFocusedRect, new h(focusDirection));
        if (boolW != null) {
            return boolW.booleanValue();
        }
        return false;
    }

    @Override // androidx.compose.ui.focus.s
    /* renamed from: a, reason: from getter */
    public Modifier getModifier() {
        return this.modifier;
    }

    @Override // androidx.compose.ui.focus.s
    public void b(InterfaceC5766i node) {
        this.focusInvalidationManager.g(node);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r11v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r4v10, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r4v9, types: [androidx.compose.ui.Modifier$c] */
    @Override // androidx.compose.ui.focus.s
    public boolean c(RotaryScrollEvent event, Function0<Boolean> onFocusedItem) {
        InterfaceC14590a interfaceC14590a;
        int size;
        C5804c0 nodes;
        AbstractC5817m abstractC5817mH;
        C5804c0 nodes2;
        if (this.focusInvalidationManager.b()) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
            return false;
        }
        FocusTargetNode focusTargetNodeZ = z();
        if (focusTargetNodeZ != null) {
            int iA = C5810f0.a(16384);
            if (!focusTargetNodeZ.getNode().getIsAttached()) {
                C14832a.b("visitAncestors called on an unattached node");
            }
            Modifier.c node = focusTargetNodeZ.getNode();
            LayoutNode layoutNodeO = C5815k.o(focusTargetNodeZ);
            loop0: while (true) {
                if (layoutNodeO == null) {
                    abstractC5817mH = 0;
                    break;
                }
                if ((layoutNodeO.getNodes().getHead().getAggregateChildKindSet() & iA) != 0) {
                    while (node != null) {
                        if ((node.getKindSet() & iA) != 0) {
                            D0.c cVar = null;
                            abstractC5817mH = node;
                            while (abstractC5817mH != 0) {
                                if (abstractC5817mH instanceof InterfaceC14590a) {
                                    break loop0;
                                }
                                if ((abstractC5817mH.getKindSet() & iA) != 0 && (abstractC5817mH instanceof AbstractC5817m)) {
                                    Modifier.c delegate = abstractC5817mH.getDelegate();
                                    int i10 = 0;
                                    abstractC5817mH = abstractC5817mH;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & iA) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                abstractC5817mH = delegate;
                                            } else {
                                                if (cVar == null) {
                                                    cVar = new D0.c(new Modifier.c[16], 0);
                                                }
                                                if (abstractC5817mH != 0) {
                                                    cVar.c(abstractC5817mH);
                                                    abstractC5817mH = 0;
                                                }
                                                cVar.c(delegate);
                                            }
                                        }
                                        delegate = delegate.getChild();
                                        abstractC5817mH = abstractC5817mH;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                abstractC5817mH = C5815k.h(cVar);
                            }
                        }
                        node = node.getParent();
                    }
                }
                layoutNodeO = layoutNodeO.getParent$ui_release();
                node = (layoutNodeO == null || (nodes2 = layoutNodeO.getNodes()) == null) ? null : nodes2.getTail();
            }
            interfaceC14590a = (InterfaceC14590a) abstractC5817mH;
        } else {
            interfaceC14590a = null;
        }
        if (interfaceC14590a != null) {
            int iA2 = C5810f0.a(16384);
            if (!interfaceC14590a.getNode().getIsAttached()) {
                C14832a.b("visitAncestors called on an unattached node");
            }
            Modifier.c parent = interfaceC14590a.getNode().getParent();
            LayoutNode layoutNodeO2 = C5815k.o(interfaceC14590a);
            ArrayList arrayList = null;
            while (layoutNodeO2 != null) {
                if ((layoutNodeO2.getNodes().getHead().getAggregateChildKindSet() & iA2) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & iA2) != 0) {
                            Modifier.c cVarH = parent;
                            D0.c cVar2 = null;
                            while (cVarH != null) {
                                if (cVarH instanceof InterfaceC14590a) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(cVarH);
                                } else if ((cVarH.getKindSet() & iA2) != 0 && (cVarH instanceof AbstractC5817m)) {
                                    int i11 = 0;
                                    for (Modifier.c delegate2 = ((AbstractC5817m) cVarH).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                        if ((delegate2.getKindSet() & iA2) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                cVarH = delegate2;
                                            } else {
                                                if (cVar2 == null) {
                                                    cVar2 = new D0.c(new Modifier.c[16], 0);
                                                }
                                                if (cVarH != null) {
                                                    cVar2.c(cVarH);
                                                    cVarH = null;
                                                }
                                                cVar2.c(delegate2);
                                            }
                                        }
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                cVarH = C5815k.h(cVar2);
                            }
                        }
                        parent = parent.getParent();
                    }
                }
                layoutNodeO2 = layoutNodeO2.getParent$ui_release();
                parent = (layoutNodeO2 == null || (nodes = layoutNodeO2.getNodes()) == null) ? null : nodes.getTail();
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i12 = size - 1;
                    if (((InterfaceC14590a) arrayList.get(size)).Y1(event)) {
                        return true;
                    }
                    if (i12 < 0) {
                        break;
                    }
                    size = i12;
                }
            }
            AbstractC5817m node2 = interfaceC14590a.getNode();
            D0.c cVar3 = null;
            while (node2 != 0) {
                if (node2 instanceof InterfaceC14590a) {
                    if (((InterfaceC14590a) node2).Y1(event)) {
                        return true;
                    }
                } else if ((node2.getKindSet() & iA2) != 0 && (node2 instanceof AbstractC5817m)) {
                    Modifier.c delegate3 = node2.getDelegate();
                    int i13 = 0;
                    node2 = node2;
                    while (delegate3 != null) {
                        if ((delegate3.getKindSet() & iA2) != 0) {
                            i13++;
                            if (i13 == 1) {
                                node2 = delegate3;
                            } else {
                                if (cVar3 == null) {
                                    cVar3 = new D0.c(new Modifier.c[16], 0);
                                }
                                if (node2 != 0) {
                                    cVar3.c(node2);
                                    node2 = 0;
                                }
                                cVar3.c(delegate3);
                            }
                        }
                        delegate3 = delegate3.getChild();
                        node2 = node2;
                    }
                    if (i13 == 1) {
                    }
                }
                node2 = C5815k.h(cVar3);
            }
            if (onFocusedItem.invoke().booleanValue()) {
                return true;
            }
            AbstractC5817m node3 = interfaceC14590a.getNode();
            D0.c cVar4 = null;
            while (node3 != 0) {
                if (node3 instanceof InterfaceC14590a) {
                    if (((InterfaceC14590a) node3).X(event)) {
                        return true;
                    }
                } else if ((node3.getKindSet() & iA2) != 0 && (node3 instanceof AbstractC5817m)) {
                    Modifier.c delegate4 = node3.getDelegate();
                    int i14 = 0;
                    node3 = node3;
                    while (delegate4 != null) {
                        if ((delegate4.getKindSet() & iA2) != 0) {
                            i14++;
                            if (i14 == 1) {
                                node3 = delegate4;
                            } else {
                                if (cVar4 == null) {
                                    cVar4 = new D0.c(new Modifier.c[16], 0);
                                }
                                if (node3 != 0) {
                                    cVar4.c(node3);
                                    node3 = 0;
                                }
                                cVar4.c(delegate4);
                            }
                        }
                        delegate4 = delegate4.getChild();
                        node3 = node3;
                    }
                    if (i14 == 1) {
                    }
                }
                node3 = C5815k.h(cVar4);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i15 = 0; i15 < size2; i15++) {
                    if (((InterfaceC14590a) arrayList.get(i15)).X(event)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.focus.s
    /* renamed from: d, reason: from getter */
    public J getFocusTransactionManager() {
        return this.focusTransactionManager;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Boolean] */
    @Override // androidx.compose.ui.focus.InterfaceC5772o
    public boolean e(int focusDirection) {
        if (P0.h.isViewFocusFixEnabled && this.onMoveFocusInterop.invoke(C5763f.i(focusDirection)).booleanValue()) {
            return true;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f142835a = Boolean.FALSE;
        int generation = getFocusTransactionManager().getGeneration();
        FocusTargetNode activeFocusTargetNode = getActiveFocusTargetNode();
        Boolean boolW = w(focusDirection, this.onFocusRectInterop.invoke(), new g(objectRef, focusDirection));
        int generation2 = getFocusTransactionManager().getGeneration();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.e(boolW, bool) && (generation != generation2 || (P0.h.isTrackFocusEnabled && activeFocusTargetNode != getActiveFocusTargetNode()))) {
            return true;
        }
        if (boolW != null && objectRef.f142835a != 0) {
            if (Intrinsics.e(boolW, bool) && Intrinsics.e(objectRef.f142835a, bool)) {
                return true;
            }
            if (t.a(focusDirection)) {
                return n(false, true, false, focusDirection) && E(focusDirection, null);
            }
            if (!P0.h.isViewFocusFixEnabled && this.onMoveFocusInterop.invoke(C5763f.i(focusDirection)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    @Override // androidx.compose.ui.focus.s
    public boolean g(KeyEvent keyEvent) {
        e1.g gVar;
        int size;
        C5804c0 nodes;
        AbstractC5817m abstractC5817mH;
        C5804c0 nodes2;
        if (this.focusInvalidationManager.b()) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            return false;
        }
        FocusTargetNode focusTargetNodeB = L.b(this.rootFocusNode);
        if (focusTargetNodeB != null) {
            int iA = C5810f0.a(131072);
            if (!focusTargetNodeB.getNode().getIsAttached()) {
                C14832a.b("visitAncestors called on an unattached node");
            }
            Modifier.c node = focusTargetNodeB.getNode();
            LayoutNode layoutNodeO = C5815k.o(focusTargetNodeB);
            loop0: while (true) {
                if (layoutNodeO == null) {
                    abstractC5817mH = 0;
                    break;
                }
                if ((layoutNodeO.getNodes().getHead().getAggregateChildKindSet() & iA) != 0) {
                    while (node != null) {
                        if ((node.getKindSet() & iA) != 0) {
                            D0.c cVar = null;
                            abstractC5817mH = node;
                            while (abstractC5817mH != 0) {
                                if (abstractC5817mH instanceof e1.g) {
                                    break loop0;
                                }
                                if ((abstractC5817mH.getKindSet() & iA) != 0 && (abstractC5817mH instanceof AbstractC5817m)) {
                                    Modifier.c delegate = abstractC5817mH.getDelegate();
                                    int i10 = 0;
                                    abstractC5817mH = abstractC5817mH;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & iA) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                abstractC5817mH = delegate;
                                            } else {
                                                if (cVar == null) {
                                                    cVar = new D0.c(new Modifier.c[16], 0);
                                                }
                                                if (abstractC5817mH != 0) {
                                                    cVar.c(abstractC5817mH);
                                                    abstractC5817mH = 0;
                                                }
                                                cVar.c(delegate);
                                            }
                                        }
                                        delegate = delegate.getChild();
                                        abstractC5817mH = abstractC5817mH;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                abstractC5817mH = C5815k.h(cVar);
                            }
                        }
                        node = node.getParent();
                    }
                }
                layoutNodeO = layoutNodeO.getParent$ui_release();
                node = (layoutNodeO == null || (nodes2 = layoutNodeO.getNodes()) == null) ? null : nodes2.getTail();
            }
            gVar = (e1.g) abstractC5817mH;
        } else {
            gVar = null;
        }
        if (gVar != null) {
            int iA2 = C5810f0.a(131072);
            if (!gVar.getNode().getIsAttached()) {
                C14832a.b("visitAncestors called on an unattached node");
            }
            Modifier.c parent = gVar.getNode().getParent();
            LayoutNode layoutNodeO2 = C5815k.o(gVar);
            ArrayList arrayList = null;
            while (layoutNodeO2 != null) {
                if ((layoutNodeO2.getNodes().getHead().getAggregateChildKindSet() & iA2) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & iA2) != 0) {
                            Modifier.c cVarH = parent;
                            D0.c cVar2 = null;
                            while (cVarH != null) {
                                if (cVarH instanceof e1.g) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(cVarH);
                                } else if ((cVarH.getKindSet() & iA2) != 0 && (cVarH instanceof AbstractC5817m)) {
                                    int i11 = 0;
                                    for (Modifier.c delegate2 = ((AbstractC5817m) cVarH).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                        if ((delegate2.getKindSet() & iA2) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                cVarH = delegate2;
                                            } else {
                                                if (cVar2 == null) {
                                                    cVar2 = new D0.c(new Modifier.c[16], 0);
                                                }
                                                if (cVarH != null) {
                                                    cVar2.c(cVarH);
                                                    cVarH = null;
                                                }
                                                cVar2.c(delegate2);
                                            }
                                        }
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                cVarH = C5815k.h(cVar2);
                            }
                        }
                        parent = parent.getParent();
                    }
                }
                layoutNodeO2 = layoutNodeO2.getParent$ui_release();
                parent = (layoutNodeO2 == null || (nodes = layoutNodeO2.getNodes()) == null) ? null : nodes.getTail();
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i12 = size - 1;
                    if (((e1.g) arrayList.get(size)).a0(keyEvent)) {
                        return true;
                    }
                    if (i12 < 0) {
                        break;
                    }
                    size = i12;
                }
            }
            AbstractC5817m node2 = gVar.getNode();
            D0.c cVar3 = null;
            while (node2 != 0) {
                if (node2 instanceof e1.g) {
                    if (((e1.g) node2).a0(keyEvent)) {
                        return true;
                    }
                } else if ((node2.getKindSet() & iA2) != 0 && (node2 instanceof AbstractC5817m)) {
                    Modifier.c delegate3 = node2.getDelegate();
                    int i13 = 0;
                    node2 = node2;
                    while (delegate3 != null) {
                        if ((delegate3.getKindSet() & iA2) != 0) {
                            i13++;
                            if (i13 == 1) {
                                node2 = delegate3;
                            } else {
                                if (cVar3 == null) {
                                    cVar3 = new D0.c(new Modifier.c[16], 0);
                                }
                                if (node2 != 0) {
                                    cVar3.c(node2);
                                    node2 = 0;
                                }
                                cVar3.c(delegate3);
                            }
                        }
                        delegate3 = delegate3.getChild();
                        node2 = node2;
                    }
                    if (i13 == 1) {
                    }
                }
                node2 = C5815k.h(cVar3);
            }
            AbstractC5817m node3 = gVar.getNode();
            D0.c cVar4 = null;
            while (node3 != 0) {
                if (node3 instanceof e1.g) {
                    if (((e1.g) node3).x0(keyEvent)) {
                        return true;
                    }
                } else if ((node3.getKindSet() & iA2) != 0 && (node3 instanceof AbstractC5817m)) {
                    Modifier.c delegate4 = node3.getDelegate();
                    int i14 = 0;
                    node3 = node3;
                    while (delegate4 != null) {
                        if ((delegate4.getKindSet() & iA2) != 0) {
                            i14++;
                            if (i14 == 1) {
                                node3 = delegate4;
                            } else {
                                if (cVar4 == null) {
                                    cVar4 = new D0.c(new Modifier.c[16], 0);
                                }
                                if (node3 != 0) {
                                    cVar4.c(node3);
                                    node3 = 0;
                                }
                                cVar4.c(delegate4);
                            }
                        }
                        delegate4 = delegate4.getChild();
                        node3 = node3;
                    }
                    if (i14 == 1) {
                    }
                }
                node3 = C5815k.h(cVar4);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i15 = 0; i15 < size2; i15++) {
                    if (((e1.g) arrayList.get(i15)).x0(keyEvent)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.focus.s
    /* renamed from: h, reason: from getter */
    public FocusTargetNode getActiveFocusTargetNode() {
        return this.activeFocusTargetNode;
    }

    @Override // androidx.compose.ui.focus.s
    public void i(FocusTargetNode node) {
        this.focusInvalidationManager.i(node);
    }

    @Override // androidx.compose.ui.focus.s
    public void j() {
        this.focusInvalidationManager.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e0 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:3:0x0009, B:5:0x0012, B:10:0x0020, B:14:0x002a, B:17:0x0038, B:114:0x0188, B:116:0x0196, B:117:0x0199, B:119:0x01a8, B:122:0x01b9, B:126:0x01c4, B:129:0x01ca, B:130:0x01cf, B:150:0x020f, B:131:0x01d3, B:133:0x01da, B:135:0x01de, B:137:0x01e8, B:139:0x01ef, B:143:0x01f7, B:145:0x0200, B:146:0x0204, B:147:0x0207, B:151:0x0214, B:152:0x0219, B:154:0x021f, B:156:0x0225, B:159:0x0230, B:161:0x0238, B:168:0x024f, B:169:0x0251, B:170:0x0261, B:172:0x0265, B:174:0x0269, B:201:0x02c6, B:178:0x0275, B:180:0x027e, B:182:0x0284, B:184:0x028d, B:186:0x0294, B:188:0x0298, B:189:0x029b, B:191:0x02a1, B:192:0x02a8, B:194:0x02b0, B:195:0x02b5, B:197:0x02bb, B:198:0x02be, B:202:0x02d1, B:206:0x02e1, B:207:0x02f1, B:209:0x02f5, B:211:0x02f9, B:238:0x0356, B:215:0x0305, B:217:0x030e, B:219:0x0314, B:221:0x031d, B:223:0x0324, B:225:0x0328, B:226:0x032b, B:228:0x0331, B:229:0x0338, B:231:0x0340, B:232:0x0345, B:234:0x034b, B:235:0x034e, B:240:0x0363, B:242:0x036a, B:247:0x037d, B:248:0x037f, B:20:0x0040, B:22:0x004e, B:23:0x0051, B:25:0x005b, B:28:0x006c, B:32:0x0077, B:63:0x00d6, B:65:0x00da, B:35:0x007c, B:37:0x0083, B:39:0x0087, B:41:0x0091, B:43:0x0098, B:47:0x00a0, B:49:0x00a9, B:50:0x00ad, B:51:0x00b0, B:54:0x00b8, B:55:0x00bd, B:56:0x00c2, B:58:0x00c8, B:60:0x00ce, B:66:0x00e0, B:68:0x00f0, B:69:0x00f3, B:71:0x0101, B:74:0x0112, B:78:0x011d, B:109:0x017c, B:111:0x0180, B:81:0x0122, B:83:0x0129, B:85:0x012d, B:87:0x0137, B:89:0x013e, B:93:0x0146, B:95:0x014f, B:96:0x0153, B:97:0x0156, B:100:0x015e, B:101:0x0163, B:102:0x0168, B:104:0x016e, B:106:0x0174), top: B:253:0x0009 }] */
    /* JADX WARN: Type inference failed for: r12v20, types: [D0.c, T] */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r13v25, types: [D0.c, T] */
    /* JADX WARN: Type inference failed for: r13v38 */
    /* JADX WARN: Type inference failed for: r13v39 */
    /* JADX WARN: Type inference failed for: r4v18, types: [T, androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r4v25, types: [T, androidx.compose.ui.Modifier$c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v31, types: [T, androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r4v38, types: [T, androidx.compose.ui.Modifier$c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r4v54 */
    /* JADX WARN: Type inference failed for: r4v55 */
    /* JADX WARN: Type inference failed for: r4v56 */
    /* JADX WARN: Type inference failed for: r4v57 */
    /* JADX WARN: Type inference failed for: r4v9, types: [T, androidx.compose.ui.Modifier$c] */
    @Override // androidx.compose.ui.focus.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean k(android.view.KeyEvent r17, kotlin.jvm.functions.Function0<java.lang.Boolean> r18) {
        /*
            Method dump skipped, instructions count: 905
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl.k(android.view.KeyEvent, kotlin.jvm.functions.Function0):boolean");
    }

    @Override // androidx.compose.ui.focus.s
    /* renamed from: m, reason: from getter */
    public boolean getIsFocusCaptured() {
        return this.isFocusCaptured;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0065 A[Catch: all -> 0x0041, TRY_LEAVE, TryCatch #0 {all -> 0x0041, blocks: (B:16:0x0037, B:18:0x003d, B:21:0x0043, B:23:0x0048, B:25:0x0051, B:29:0x0065), top: B:37:0x0037 }] */
    @Override // androidx.compose.ui.focus.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean n(boolean r8, boolean r9, boolean r10, int r11) {
        /*
            r7 = this;
            boolean r0 = P0.h.isTrackFocusEnabled
            r1 = 0
            r2 = 3
            r3 = 2
            r4 = 1
            if (r0 == 0) goto L31
            if (r8 != 0) goto L2c
            androidx.compose.ui.focus.FocusTargetNode r0 = r7.rootFocusNode
            androidx.compose.ui.focus.c r11 = androidx.compose.ui.focus.K.f(r0, r11)
            int[] r0 = androidx.compose.ui.focus.FocusOwnerImpl.a.$EnumSwitchMapping$0
            int r11 = r11.ordinal()
            r11 = r0[r11]
            if (r11 == r4) goto L6e
            if (r11 == r3) goto L6e
            if (r11 == r2) goto L6e
            r0 = 4
            if (r11 != r0) goto L26
            boolean r1 = r7.y(r8, r9)
            goto L6e
        L26:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L2c:
            boolean r1 = r7.y(r8, r9)
            goto L6e
        L31:
            androidx.compose.ui.focus.J r0 = r7.getFocusTransactionManager()
            androidx.compose.ui.focus.FocusOwnerImpl$b r5 = androidx.compose.ui.focus.FocusOwnerImpl.b.f50595f
            boolean r6 = r0.getOngoingTransaction()     // Catch: java.lang.Throwable -> L41
            if (r6 == 0) goto L43
            androidx.compose.ui.focus.J.b(r0)     // Catch: java.lang.Throwable -> L41
            goto L43
        L41:
            r8 = move-exception
            goto L78
        L43:
            androidx.compose.ui.focus.J.a(r0)     // Catch: java.lang.Throwable -> L41
            if (r5 == 0) goto L4f
            D0.c r6 = androidx.compose.ui.focus.J.d(r0)     // Catch: java.lang.Throwable -> L41
            r6.c(r5)     // Catch: java.lang.Throwable -> L41
        L4f:
            if (r8 != 0) goto L65
            androidx.compose.ui.focus.FocusTargetNode r5 = r7.rootFocusNode     // Catch: java.lang.Throwable -> L41
            androidx.compose.ui.focus.c r11 = androidx.compose.ui.focus.K.f(r5, r11)     // Catch: java.lang.Throwable -> L41
            int[] r5 = androidx.compose.ui.focus.FocusOwnerImpl.a.$EnumSwitchMapping$0     // Catch: java.lang.Throwable -> L41
            int r11 = r11.ordinal()     // Catch: java.lang.Throwable -> L41
            r11 = r5[r11]     // Catch: java.lang.Throwable -> L41
            if (r11 == r4) goto L6b
            if (r11 == r3) goto L6b
            if (r11 == r2) goto L6b
        L65:
            androidx.compose.ui.focus.FocusTargetNode r11 = r7.rootFocusNode     // Catch: java.lang.Throwable -> L41
            boolean r1 = androidx.compose.ui.focus.K.c(r11, r8, r9)     // Catch: java.lang.Throwable -> L41
        L6b:
            androidx.compose.ui.focus.J.c(r0)
        L6e:
            if (r1 == 0) goto L77
            if (r10 == 0) goto L77
            kotlin.jvm.functions.Function0<kotlin.Unit> r8 = r7.onClearFocusForOwner
            r8.invoke()
        L77:
            return r1
        L78:
            androidx.compose.ui.focus.J.c(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl.n(boolean, boolean, boolean, int):boolean");
    }

    @Override // androidx.compose.ui.focus.s
    public E o() {
        return this.rootFocusNode.d0();
    }

    @Override // androidx.compose.ui.focus.s
    public void p(w node) {
        this.focusInvalidationManager.h(node);
    }

    @Override // androidx.compose.ui.focus.s
    public void r(FocusTargetNode focusTargetNode) {
        FocusTargetNode focusTargetNode2 = this.activeFocusTargetNode;
        this.activeFocusTargetNode = focusTargetNode;
        if (focusTargetNode == null || focusTargetNode2 != focusTargetNode) {
            D(false);
        }
        if (P0.h.isSemanticAutofillEnabled) {
            T<InterfaceC5771n> t10 = t();
            Object[] objArr = t10.content;
            int i10 = t10._size;
            for (int i11 = 0; i11 < i10; i11++) {
                ((InterfaceC5771n) objArr[i11]).b(focusTargetNode2, focusTargetNode);
            }
        }
    }

    @Override // androidx.compose.ui.focus.s
    public void s() {
        if (P0.h.isTrackFocusEnabled) {
            K.c(this.rootFocusNode, true, true);
            return;
        }
        J focusTransactionManager = getFocusTransactionManager();
        if (focusTransactionManager.getOngoingTransaction()) {
            K.c(this.rootFocusNode, true, true);
            return;
        }
        try {
            focusTransactionManager.e();
            K.c(this.rootFocusNode, true, true);
        } finally {
            focusTransactionManager.g();
        }
    }

    @Override // androidx.compose.ui.focus.s
    public T<InterfaceC5771n> t() {
        return this.listeners;
    }

    @Override // androidx.compose.ui.focus.s
    public boolean u(C5763f focusDirection, Rect previouslyFocusedRect) {
        return this.onRequestFocusForOwner.invoke(focusDirection, previouslyFocusedRect).booleanValue();
    }

    @Override // androidx.compose.ui.focus.InterfaceC5772o
    public void v(boolean force) {
        n(force, true, true, C5763f.INSTANCE.c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FocusOwnerImpl(Function1<? super Function0<Unit>, Unit> function1, Function2<? super C5763f, ? super Rect, Boolean> function2, Function1<? super C5763f, Boolean> function12, Function0<Unit> function0, Function0<Rect> function02, Function0<? extends H1.t> function03) {
        this.onRequestFocusForOwner = function2;
        this.onMoveFocusInterop = function12;
        this.onClearFocusForOwner = function0;
        this.onFocusRectInterop = function02;
        this.onLayoutDirection = function03;
        this.focusInvalidationManager = new C5770m(function1, new c(this), new PropertyReference0Impl(this) { // from class: androidx.compose.ui.focus.FocusOwnerImpl.d
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((FocusOwnerImpl) this.receiver).o();
            }
        }, new MutablePropertyReference0Impl(this) { // from class: androidx.compose.ui.focus.FocusOwnerImpl.e
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((FocusOwnerImpl) this.receiver).getActiveFocusTargetNode();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl
            public void set(Object obj) {
                ((FocusOwnerImpl) this.receiver).r((FocusTargetNode) obj);
            }
        });
    }

    private final boolean F(KeyEvent keyEvent) {
        long jA = C13604d.a(keyEvent);
        int iB = C13604d.b(keyEvent);
        C13603c.Companion companion = C13603c.INSTANCE;
        if (C13603c.e(iB, companion.a())) {
            Z.P p10 = this.keysCurrentlyDown;
            if (p10 == null) {
                p10 = new Z.P(3);
                this.keysCurrentlyDown = p10;
            }
            p10.l(jA);
        } else if (C13603c.e(iB, companion.b())) {
            Z.P p11 = this.keysCurrentlyDown;
            if (p11 != null && p11.a(jA)) {
                Z.P p12 = this.keysCurrentlyDown;
                if (p12 != null) {
                    p12.m(jA);
                }
            } else {
                return false;
            }
        }
        return true;
    }

    private final boolean y(boolean forced, boolean refreshFocusEvents) {
        F f10;
        C5804c0 nodes;
        if (getActiveFocusTargetNode() == null) {
            return true;
        }
        if (getIsFocusCaptured() && !forced) {
            return false;
        }
        FocusTargetNode activeFocusTargetNode = getActiveFocusTargetNode();
        r(null);
        if (refreshFocusEvents && activeFocusTargetNode != null) {
            if (getIsFocusCaptured()) {
                f10 = F.f50578c;
            } else {
                f10 = F.f50576a;
            }
            activeFocusTargetNode.Q2(f10, F.f50579d);
            int iA = C5810f0.a(1024);
            if (!activeFocusTargetNode.getNode().getIsAttached()) {
                C14832a.b("visitAncestors called on an unattached node");
            }
            Modifier.c parent = activeFocusTargetNode.getNode().getParent();
            LayoutNode layoutNodeO = C5815k.o(activeFocusTargetNode);
            while (layoutNodeO != null) {
                if ((layoutNodeO.getNodes().getHead().getAggregateChildKindSet() & iA) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & iA) != 0) {
                            D0.c cVar = null;
                            Modifier.c cVarH = parent;
                            while (cVarH != null) {
                                if (cVarH instanceof FocusTargetNode) {
                                    ((FocusTargetNode) cVarH).Q2(F.f50577b, F.f50579d);
                                } else if ((cVarH.getKindSet() & iA) != 0 && (cVarH instanceof AbstractC5817m)) {
                                    int i10 = 0;
                                    for (Modifier.c delegate = ((AbstractC5817m) cVarH).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                        if ((delegate.getKindSet() & iA) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                cVarH = delegate;
                                            } else {
                                                if (cVar == null) {
                                                    cVar = new D0.c(new Modifier.c[16], 0);
                                                }
                                                if (cVarH != null) {
                                                    cVar.c(cVarH);
                                                    cVarH = null;
                                                }
                                                cVar.c(delegate);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                cVarH = C5815k.h(cVar);
                            }
                        }
                        parent = parent.getParent();
                    }
                }
                layoutNodeO = layoutNodeO.getParent$ui_release();
                if (layoutNodeO != null && (nodes = layoutNodeO.getNodes()) != null) {
                    parent = nodes.getTail();
                } else {
                    parent = null;
                }
            }
        }
        return true;
    }

    @Override // androidx.compose.ui.focus.s
    public Rect q() {
        FocusTargetNode focusTargetNodeZ = z();
        if (focusTargetNodeZ != null) {
            return L.d(focusTargetNodeZ);
        }
        return null;
    }

    @Override // androidx.compose.ui.focus.s
    public Boolean w(int focusDirection, Rect focusedRect, Function1<? super FocusTargetNode, Boolean> onFound) {
        FocusTargetNode focusTargetNodeZ = z();
        if (focusTargetNodeZ != null) {
            y yVarA = L.a(focusTargetNodeZ, focusDirection, this.onLayoutDirection.invoke());
            y.Companion companion = y.INSTANCE;
            if (Intrinsics.e(yVarA, companion.a())) {
                return null;
            }
            if (Intrinsics.e(yVarA, companion.c())) {
                FocusTargetNode focusTargetNodeZ2 = z();
                if (focusTargetNodeZ2 == null) {
                    return null;
                }
                return onFound.invoke(focusTargetNodeZ2);
            }
            if (!Intrinsics.e(yVarA, companion.b())) {
                return Boolean.valueOf(yVarA.d(onFound));
            }
        } else {
            focusTargetNodeZ = null;
        }
        return L.e(this.rootFocusNode, focusDirection, this.onLayoutDirection.invoke(), focusedRect, new f(focusTargetNodeZ, this, onFound));
    }
}
