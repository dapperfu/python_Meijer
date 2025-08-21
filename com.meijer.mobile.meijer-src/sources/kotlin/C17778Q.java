package kotlin;

import U0.f;
import androidx.compose.foundation.text.B;
import androidx.compose.foundation.text.EnumC5824n;
import androidx.compose.foundation.text.EnumC5825o;
import androidx.compose.foundation.text.P;
import androidx.compose.foundation.text.S;
import androidx.compose.foundation.text.g0;
import androidx.compose.foundation.text.h0;
import androidx.compose.foundation.text.s0;
import androidx.compose.foundation.text.w0;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.t1;
import androidx.compose.ui.focus.y;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.C6023p0;
import androidx.compose.ui.platform.H1;
import androidx.compose.ui.platform.InterfaceC6026q0;
import androidx.compose.ui.platform.J1;
import androidx.compose.ui.text.AnnotatedString;
import c1.C6471b;
import c1.InterfaceC6470a;
import i0.C14589b;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import mv.C0;
import mv.C15809k;
import mv.EnumC15785Q;
import mv.InterfaceC15783O;
import u1.C17334A;
import u1.TextLayoutResult;
import z1.InterfaceC18417E;
import z1.N;
import z1.TextFieldValue;
import z1.W;

@Metadata(d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJB\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\"\u0010!\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0017H\u0002ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020#2\u0006\u0010\u0013\u001a\u00020\u0006H\u0000¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020#H\u0000¢\u0006\u0004\b&\u0010'J\u0019\u0010)\u001a\u00020\b2\b\b\u0002\u0010(\u001a\u00020\u0006H\u0000¢\u0006\u0004\b)\u0010\nJ\u000f\u0010*\u001a\u00020\bH\u0000¢\u0006\u0004\b*\u0010+J\u001e\u0010-\u001a\u00020\b2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0010H\u0000ø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u001a\u00100\u001a\u00020\b2\u0006\u0010/\u001a\u00020\u0017H\u0000ø\u0001\u0000¢\u0006\u0004\b0\u00101J\u001a\u00102\u001a\u00020\b2\u0006\u0010/\u001a\u00020\u0017H\u0000ø\u0001\u0000¢\u0006\u0004\b2\u00101J\u000f\u00103\u001a\u00020\bH\u0000¢\u0006\u0004\b3\u0010+J\u001b\u00106\u001a\u0004\u0018\u0001052\b\b\u0002\u00104\u001a\u00020\u0006H\u0000¢\u0006\u0004\b6\u00107J\u0011\u00108\u001a\u0004\u0018\u000105H\u0000¢\u0006\u0004\b8\u00109J\u0011\u0010:\u001a\u0004\u0018\u000105H\u0000¢\u0006\u0004\b:\u00109J\u000f\u0010;\u001a\u00020\bH\u0000¢\u0006\u0004\b;\u0010+J\u000f\u0010<\u001a\u00020\bH\u0000¢\u0006\u0004\b<\u0010+J\u001d\u0010=\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0006H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020?2\u0006\u0010\u0013\u001a\u00020\u0006H\u0000¢\u0006\u0004\b@\u0010AJ\u001d\u0010D\u001a\u00020\u00102\u0006\u0010C\u001a\u00020BH\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bD\u0010EJ\u0011\u0010F\u001a\u0004\u0018\u000105H\u0000¢\u0006\u0004\bF\u00109J\u000f\u0010G\u001a\u00020\bH\u0000¢\u0006\u0004\bG\u0010+J\u000f\u0010H\u001a\u00020\u0006H\u0000¢\u0006\u0004\bH\u0010IR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\"\u0010U\u001a\u00020N8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR.\u0010]\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0V8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R$\u0010e\u001a\u0004\u0018\u00010^8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010f\u001a\u00020\u000e8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\"\u0010t\u001a\u00020m8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR*\u0010|\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010u8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R)\u0010\u0084\u0001\u001a\u0004\u0018\u00010}8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R,\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u0085\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R,\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u008d\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001R,\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u0095\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0006\b\u009a\u0001\u0010\u009b\u0001R,\u0010¤\u0001\u001a\u0005\u0018\u00010\u009d\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u009e\u0001\u0010\u009f\u0001\u001a\u0006\b \u0001\u0010¡\u0001\"\u0006\b¢\u0001\u0010£\u0001R/\u0010¨\u0001\u001a\u00020\u00062\u0006\u0010f\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b¥\u0001\u0010h\u001a\u0005\b¦\u0001\u0010I\"\u0005\b§\u0001\u0010\nR/\u0010¬\u0001\u001a\u00020\u00062\u0006\u0010f\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b©\u0001\u0010h\u001a\u0005\bª\u0001\u0010I\"\u0005\b«\u0001\u0010\nR\u001d\u0010\u00ad\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b<\u0010@R\u001b\u0010°\u0001\u001a\u0005\u0018\u00010®\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b3\u0010¯\u0001R\u001d\u0010±\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b6\u0010@R7\u0010¸\u0001\u001a\u0005\u0018\u00010²\u00012\t\u0010f\u001a\u0005\u0018\u00010²\u00018F@BX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\b³\u0001\u0010h\u001a\u0006\b´\u0001\u0010µ\u0001\"\u0006\b¶\u0001\u0010·\u0001R9\u0010¼\u0001\u001a\u0004\u0018\u00010\u00102\b\u0010f\u001a\u0004\u0018\u00010\u00108F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0015\n\u0004\b!\u0010h\u001a\u0006\b¹\u0001\u0010º\u0001\"\u0005\b»\u0001\u0010.R\u0019\u0010½\u0001\u001a\u00030®\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b&\u0010 \u0001R\u0018\u0010¿\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b:\u0010¾\u0001R\u001b\u0010Â\u0001\u001a\u0005\u0018\u00010À\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b-\u0010Á\u0001R\u001e\u0010Æ\u0001\u001a\u00020#8\u0000X\u0080\u0004¢\u0006\u000f\n\u0006\bÃ\u0001\u0010Ä\u0001\u001a\u0005\bÅ\u0001\u0010'R\u001f\u0010Ë\u0001\u001a\u00030Ç\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b)\u0010È\u0001\u001a\u0006\bÉ\u0001\u0010Ê\u0001R\u0019\u0010Î\u0001\u001a\u0004\u0018\u00010\u001e8@X\u0080\u0004¢\u0006\b\u001a\u0006\bÌ\u0001\u0010Í\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Ï\u0001"}, d2 = {"Lw0/Q;", "", "Landroidx/compose/foundation/text/s0;", "undoManager", "<init>", "(Landroidx/compose/foundation/text/s0;)V", "", "show", "", "u0", "(Z)V", "Landroidx/compose/ui/geometry/Rect;", "B", "()Landroidx/compose/ui/geometry/Rect;", "Lz1/M;", "value", "LU0/f;", "currentPosition", "isStartOfSelection", "isStartHandle", "Lw0/v;", "adjustment", "isTouchBasedSelection", "Landroidx/compose/ui/text/y;", "v0", "(Lz1/M;JZZLw0/v;Z)J", "Landroidx/compose/foundation/text/o;", "handleState", "j0", "(Landroidx/compose/foundation/text/o;)V", "Landroidx/compose/ui/text/AnnotatedString;", "annotatedString", "selection", "s", "(Landroidx/compose/ui/text/AnnotatedString;J)Lz1/M;", "Landroidx/compose/foundation/text/P;", "W", "(Z)Landroidx/compose/foundation/text/P;", "t", "()Landroidx/compose/foundation/text/P;", "showFloatingToolbar", "x", "z", "()V", "position", "v", "(LU0/f;)V", "range", "o0", "(J)V", "e0", "p", "cancelSelection", "Lmv/C0;", "q", "(Z)Lmv/C0;", "Z", "()Lmv/C0;", "u", "a0", "o", "K", "(Z)J", "", "J", "(Z)F", "LH1/d;", "density", "E", "(LH1/d;)J", "t0", "X", "Y", "()Z", "a", "Landroidx/compose/foundation/text/s0;", "T", "()Landroidx/compose/foundation/text/s0;", "Lz1/E;", "b", "Lz1/E;", "N", "()Lz1/E;", "l0", "(Lz1/E;)V", "offsetMapping", "Lkotlin/Function1;", "c", "Lkotlin/jvm/functions/Function1;", "O", "()Lkotlin/jvm/functions/Function1;", "m0", "(Lkotlin/jvm/functions/Function1;)V", "onValueChange", "Landroidx/compose/foundation/text/B;", "d", "Landroidx/compose/foundation/text/B;", "P", "()Landroidx/compose/foundation/text/B;", "p0", "(Landroidx/compose/foundation/text/B;)V", "state", "<set-?>", "e", "Landroidx/compose/runtime/l0;", "U", "()Lz1/M;", "r0", "(Lz1/M;)V", "Lz1/W;", "f", "Lz1/W;", "V", "()Lz1/W;", "s0", "(Lz1/W;)V", "visualTransformation", "Lkotlin/Function0;", "g", "Lkotlin/jvm/functions/Function0;", "getRequestAutofillAction$foundation_release", "()Lkotlin/jvm/functions/Function0;", "n0", "(Lkotlin/jvm/functions/Function0;)V", "requestAutofillAction", "Landroidx/compose/ui/platform/q0;", "h", "Landroidx/compose/ui/platform/q0;", "A", "()Landroidx/compose/ui/platform/q0;", "b0", "(Landroidx/compose/ui/platform/q0;)V", "clipboard", "Lmv/O;", "i", "Lmv/O;", "C", "()Lmv/O;", "c0", "(Lmv/O;)V", "coroutineScope", "Landroidx/compose/ui/platform/H1;", "j", "Landroidx/compose/ui/platform/H1;", "Q", "()Landroidx/compose/ui/platform/H1;", "q0", "(Landroidx/compose/ui/platform/H1;)V", "textToolbar", "Lc1/a;", "k", "Lc1/a;", "L", "()Lc1/a;", "k0", "(Lc1/a;)V", "hapticFeedBack", "Landroidx/compose/ui/focus/y;", "l", "Landroidx/compose/ui/focus/y;", "I", "()Landroidx/compose/ui/focus/y;", "i0", "(Landroidx/compose/ui/focus/y;)V", "focusRequester", "m", "G", "g0", "editable", "n", "H", "h0", "enabled", "dragBeginPosition", "", "Ljava/lang/Integer;", "dragBeginOffsetInText", "dragTotalDistance", "Landroidx/compose/foundation/text/n;", "r", "F", "()Landroidx/compose/foundation/text/n;", "f0", "(Landroidx/compose/foundation/text/n;)V", "draggingHandle", "D", "()LU0/f;", "d0", "currentDragPosition", "previousRawDragOffset", "Lz1/M;", "oldValue", "Lw0/C;", "Lw0/C;", "previousSelectionLayout", "w", "Landroidx/compose/foundation/text/P;", "R", "touchSelectionObserver", "Lw0/i;", "Lw0/i;", "M", "()Lw0/i;", "mouseSelectionObserver", "S", "()Landroidx/compose/ui/text/AnnotatedString;", "transformedText", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: w0.Q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17778Q {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final s0 undoManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private InterfaceC18417E offsetMapping;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Function1<? super TextFieldValue, Unit> onValueChange;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private B state;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0 value;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private W visualTransformation;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Function0<Unit> requestAutofillAction;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private InterfaceC6026q0 clipboard;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private InterfaceC15783O coroutineScope;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private H1 textToolbar;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private InterfaceC6470a hapticFeedBack;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private y focusRequester;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0 editable;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0 enabled;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private long dragBeginPosition;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private Integer dragBeginOffsetInText;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private long dragTotalDistance;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0 draggingHandle;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0 currentDragPosition;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int previousRawDragOffset;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private TextFieldValue oldValue;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private InterfaceC17764C previousSelectionLayout;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final P touchSelectionObserver;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17793i mouseSelectionObserver;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$copy$1", f = "TextFieldSelectionManager.kt", l = {623}, m = "invokeSuspend")
    /* renamed from: w0.Q$a */
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f166607a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f166609c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z10, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f166609c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C17778Q.this.new a(this.f166609c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f166607a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                if (androidx.compose.ui.text.y.h(C17778Q.this.U().getSelection())) {
                    return Unit.f143329a;
                }
                InterfaceC6026q0 clipboard = C17778Q.this.getClipboard();
                if (clipboard != null) {
                    C6023p0 c6023p0E = C14589b.e(N.a(C17778Q.this.U()));
                    this.f166607a = 1;
                    if (clipboard.b(c6023p0E, this) == objF) {
                        return objF;
                    }
                }
            }
            if (!this.f166609c) {
                return Unit.f143329a;
            }
            int iK = androidx.compose.ui.text.y.k(C17778Q.this.U().getSelection());
            C17778Q c17778q = C17778Q.this;
            C17778Q.this.O().invoke(c17778q.s(c17778q.U().getText(), C17334A.b(iK, iK)));
            C17778Q.this.j0(EnumC5825o.f49921a);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0006J\u001a\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"w0/Q$b", "Landroidx/compose/foundation/text/P;", "LU0/f;", "point", "", "a", "(J)V", "c", "()V", "startPoint", "b", "delta", "d", "onStop", "onCancel", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: w0.Q$b */
    public static final class b implements P {
        @Override // androidx.compose.foundation.text.P
        public void a(long point) {
        }

        @Override // androidx.compose.foundation.text.P
        public void onCancel() {
        }

        b() {
        }

        @Override // androidx.compose.foundation.text.P
        public void b(long startPoint) {
            h0 h0VarL;
            long jA = C17763B.a(C17778Q.this.K(true));
            B state = C17778Q.this.getState();
            if (state == null || (h0VarL = state.l()) == null) {
                return;
            }
            long jK = h0VarL.k(jA);
            C17778Q.this.dragBeginPosition = jK;
            C17778Q.this.d0(U0.f.d(jK));
            C17778Q.this.dragTotalDistance = U0.f.INSTANCE.c();
            C17778Q.this.f0(EnumC5824n.f49914a);
            C17778Q.this.u0(false);
        }

        @Override // androidx.compose.foundation.text.P
        public void c() {
            C17778Q.this.f0(null);
            C17778Q.this.d0(null);
        }

        @Override // androidx.compose.foundation.text.P
        public void d(long delta) {
            h0 h0VarL;
            InterfaceC6470a hapticFeedBack;
            C17778Q c17778q = C17778Q.this;
            c17778q.dragTotalDistance = U0.f.q(c17778q.dragTotalDistance, delta);
            B state = C17778Q.this.getState();
            if (state == null || (h0VarL = state.l()) == null) {
                return;
            }
            C17778Q c17778q2 = C17778Q.this;
            c17778q2.d0(U0.f.d(U0.f.q(c17778q2.dragBeginPosition, c17778q2.dragTotalDistance)));
            InterfaceC18417E offsetMapping = c17778q2.getOffsetMapping();
            U0.f fVarD = c17778q2.D();
            Intrinsics.g(fVarD);
            int iA = offsetMapping.a(h0.e(h0VarL, fVarD.getPackedValue(), false, 2, null));
            long jB = C17334A.b(iA, iA);
            if (androidx.compose.ui.text.y.g(jB, c17778q2.U().getSelection())) {
                return;
            }
            B state2 = c17778q2.getState();
            if ((state2 == null || state2.A()) && (hapticFeedBack = c17778q2.getHapticFeedBack()) != null) {
                hapticFeedBack.a(C6471b.INSTANCE.i());
            }
            c17778q2.O().invoke(c17778q2.s(c17778q2.U().getText(), jB));
        }

        @Override // androidx.compose.foundation.text.P
        public void onStop() {
            C17778Q.this.f0(null);
            C17778Q.this.d0(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$cut$1", f = "TextFieldSelectionManager.kt", l = {677}, m = "invokeSuspend")
    /* renamed from: w0.Q$c */
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f166611a;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C17778Q.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f166611a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                if (androidx.compose.ui.text.y.h(C17778Q.this.U().getSelection())) {
                    return Unit.f143329a;
                }
                InterfaceC6026q0 clipboard = C17778Q.this.getClipboard();
                if (clipboard != null) {
                    C6023p0 c6023p0E = C14589b.e(N.a(C17778Q.this.U()));
                    this.f166611a = 1;
                    if (clipboard.b(c6023p0E, this) == objF) {
                        return objF;
                    }
                }
            }
            AnnotatedString annotatedStringR = N.c(C17778Q.this.U(), C17778Q.this.U().h().length()).r(N.b(C17778Q.this.U(), C17778Q.this.U().h().length()));
            int iL = androidx.compose.ui.text.y.l(C17778Q.this.U().getSelection());
            C17778Q.this.O().invoke(C17778Q.this.s(annotatedStringR, C17334A.b(iL, iL)));
            C17778Q.this.j0(EnumC5825o.f49921a);
            s0 undoManager = C17778Q.this.getUndoManager();
            if (undoManager != null) {
                undoManager.a();
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0006J\u001a\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"w0/Q$d", "Landroidx/compose/foundation/text/P;", "LU0/f;", "point", "", "a", "(J)V", "c", "()V", "startPoint", "b", "delta", "d", "onStop", "onCancel", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: w0.Q$d */
    public static final class d implements P {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f166614b;

        @Override // androidx.compose.foundation.text.P
        public void b(long startPoint) {
        }

        @Override // androidx.compose.foundation.text.P
        public void onCancel() {
        }

        d(boolean z10) {
            this.f166614b = z10;
        }

        @Override // androidx.compose.foundation.text.P
        public void a(long point) {
            h0 h0VarL;
            C17778Q.this.f0(this.f166614b ? EnumC5824n.f49915b : EnumC5824n.f49916c);
            long jA = C17763B.a(C17778Q.this.K(this.f166614b));
            B state = C17778Q.this.getState();
            if (state == null || (h0VarL = state.l()) == null) {
                return;
            }
            long jK = h0VarL.k(jA);
            C17778Q.this.dragBeginPosition = jK;
            C17778Q.this.d0(U0.f.d(jK));
            C17778Q.this.dragTotalDistance = U0.f.INSTANCE.c();
            C17778Q.this.previousRawDragOffset = -1;
            B state2 = C17778Q.this.getState();
            if (state2 != null) {
                state2.G(true);
            }
            C17778Q.this.u0(false);
        }

        @Override // androidx.compose.foundation.text.P
        public void c() {
            C17778Q.this.f0(null);
            C17778Q.this.d0(null);
            C17778Q.this.u0(true);
        }

        @Override // androidx.compose.foundation.text.P
        public void d(long delta) {
            C17778Q c17778q = C17778Q.this;
            c17778q.dragTotalDistance = U0.f.q(c17778q.dragTotalDistance, delta);
            C17778Q c17778q2 = C17778Q.this;
            c17778q2.d0(U0.f.d(U0.f.q(c17778q2.dragBeginPosition, C17778Q.this.dragTotalDistance)));
            C17778Q c17778q3 = C17778Q.this;
            TextFieldValue textFieldValueU = c17778q3.U();
            U0.f fVarD = C17778Q.this.D();
            Intrinsics.g(fVarD);
            c17778q3.v0(textFieldValueU, fVarD.getPackedValue(), false, this.f166614b, InterfaceC17806v.INSTANCE.k(), true);
            C17778Q.this.u0(false);
        }

        @Override // androidx.compose.foundation.text.P
        public void onStop() {
            C17778Q.this.f0(null);
            C17778Q.this.d0(null);
            C17778Q.this.u0(true);
        }
    }

    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0006J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\fJ0\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"w0/Q$e", "Lw0/i;", "LU0/f;", "downPosition", "", "e", "(J)Z", "dragPosition", "d", "Lw0/v;", "adjustment", "c", "(JLw0/v;)Z", "a", "Lz1/M;", "value", "currentPosition", "isStartOfSelection", "", "f", "(Lz1/M;JZLw0/v;)V", "b", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: w0.Q$e */
    public static final class e implements InterfaceC17793i {
        @Override // kotlin.InterfaceC17793i
        public void b() {
        }

        e() {
        }

        @Override // kotlin.InterfaceC17793i
        public boolean a(long dragPosition, InterfaceC17806v adjustment) {
            B state;
            if (!C17778Q.this.H() || C17778Q.this.U().h().length() == 0 || (state = C17778Q.this.getState()) == null || state.l() == null) {
                return false;
            }
            f(C17778Q.this.U(), dragPosition, false, adjustment);
            return true;
        }

        @Override // kotlin.InterfaceC17793i
        public boolean c(long downPosition, InterfaceC17806v adjustment) {
            B state;
            if (!C17778Q.this.H() || C17778Q.this.U().h().length() == 0 || (state = C17778Q.this.getState()) == null || state.l() == null) {
                return false;
            }
            y focusRequester = C17778Q.this.getFocusRequester();
            if (focusRequester != null) {
                y.h(focusRequester, 0, 1, null);
            }
            C17778Q.this.dragBeginPosition = downPosition;
            C17778Q.this.previousRawDragOffset = -1;
            C17778Q.y(C17778Q.this, false, 1, null);
            f(C17778Q.this.U(), C17778Q.this.dragBeginPosition, true, adjustment);
            return true;
        }

        @Override // kotlin.InterfaceC17793i
        public boolean d(long dragPosition) {
            B state;
            if (!C17778Q.this.H() || C17778Q.this.U().h().length() == 0 || (state = C17778Q.this.getState()) == null || state.l() == null) {
                return false;
            }
            f(C17778Q.this.U(), dragPosition, false, InterfaceC17806v.INSTANCE.l());
            return true;
        }

        @Override // kotlin.InterfaceC17793i
        public boolean e(long downPosition) {
            B state = C17778Q.this.getState();
            if (state == null || state.l() == null || !C17778Q.this.H()) {
                return false;
            }
            C17778Q.this.previousRawDragOffset = -1;
            f(C17778Q.this.U(), downPosition, false, InterfaceC17806v.INSTANCE.l());
            return true;
        }

        public final void f(TextFieldValue value, long currentPosition, boolean isStartOfSelection, InterfaceC17806v adjustment) {
            C17778Q.this.j0(androidx.compose.ui.text.y.h(C17778Q.this.v0(value, currentPosition, isStartOfSelection, false, adjustment, false)) ? EnumC5825o.f49923c : EnumC5825o.f49922b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lz1/M;", "it", "", "a", "(Lz1/M;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: w0.Q$f */
    static final class f extends Lambda implements Function1<TextFieldValue, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final f f166616f = new f();

        f() {
            super(1);
        }

        public final void a(TextFieldValue textFieldValue) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
            a(textFieldValue);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$paste$1", f = "TextFieldSelectionManager.kt", l = {647}, m = "invokeSuspend")
    /* renamed from: w0.Q$g */
    static final class g extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f166617a;

        g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C17778Q.this.new g(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((g) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AnnotatedString annotatedStringD;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f166617a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC6026q0 clipboard = C17778Q.this.getClipboard();
                if (clipboard != null) {
                    this.f166617a = 1;
                    obj = clipboard.a(this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
            C6023p0 c6023p0 = (C6023p0) obj;
            if (c6023p0 != null && (annotatedStringD = C14589b.d(c6023p0)) != null) {
                AnnotatedString annotatedStringR = N.c(C17778Q.this.U(), C17778Q.this.U().h().length()).r(annotatedStringD).r(N.b(C17778Q.this.U(), C17778Q.this.U().h().length()));
                int iL = androidx.compose.ui.text.y.l(C17778Q.this.U().getSelection()) + annotatedStringD.length();
                C17778Q.this.O().invoke(C17778Q.this.s(annotatedStringR, C17334A.b(iL, iL)));
                C17778Q.this.j0(EnumC5825o.f49921a);
                s0 undoManager = C17778Q.this.getUndoManager();
                if (undoManager != null) {
                    undoManager.a();
                }
                return Unit.f143329a;
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1", f = "TextFieldSelectionManager.kt", l = {781}, m = "invokeSuspend")
    /* renamed from: w0.Q$h */
    static final class h extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f166619a;

        /* renamed from: b, reason: collision with root package name */
        Object f166620b;

        /* renamed from: c, reason: collision with root package name */
        int f166621c;

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: w0.Q$h$a */
        static final class a extends Lambda implements Function0<Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C17778Q f166623f;

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f143329a;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C17778Q c17778q) {
                super(0);
                this.f166623f = c17778q;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f166623f.o();
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: w0.Q$h$b */
        static final class b extends Lambda implements Function0<Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C17778Q f166624f;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1$copy$1$1", f = "TextFieldSelectionManager.kt", l = {}, m = "invokeSuspend")
            /* renamed from: w0.Q$h$b$a */
            static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f166625a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C17778Q f166626b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(C17778Q c17778q, Continuation<? super a> continuation) {
                    super(2, continuation);
                    this.f166626b = c17778q;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new a(this.f166626b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f166625a == 0) {
                        ResultKt.b(obj);
                        C17778Q.r(this.f166626b, false, 1, null);
                        return Unit.f143329a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f143329a;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C17778Q c17778q) {
                super(0);
                this.f166624f = c17778q;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                InterfaceC15783O coroutineScope = this.f166624f.getCoroutineScope();
                if (coroutineScope != null) {
                    C15809k.d(coroutineScope, null, EnumC15785Q.f151688d, new a(this.f166624f, null), 1, null);
                }
                this.f166624f.X();
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: w0.Q$h$c */
        static final class c extends Lambda implements Function0<Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C17778Q f166627f;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1$cut$1$1", f = "TextFieldSelectionManager.kt", l = {}, m = "invokeSuspend")
            /* renamed from: w0.Q$h$c$a */
            static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f166628a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C17778Q f166629b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(C17778Q c17778q, Continuation<? super a> continuation) {
                    super(2, continuation);
                    this.f166629b = c17778q;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new a(this.f166629b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f166628a == 0) {
                        ResultKt.b(obj);
                        this.f166629b.u();
                        return Unit.f143329a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f143329a;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(C17778Q c17778q) {
                super(0);
                this.f166627f = c17778q;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                InterfaceC15783O coroutineScope = this.f166627f.getCoroutineScope();
                if (coroutineScope != null) {
                    C15809k.d(coroutineScope, null, EnumC15785Q.f151688d, new a(this.f166627f, null), 1, null);
                }
                this.f166627f.X();
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: w0.Q$h$d */
        static final class d extends Lambda implements Function0<Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C17778Q f166630f;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1$paste$1$1", f = "TextFieldSelectionManager.kt", l = {}, m = "invokeSuspend")
            /* renamed from: w0.Q$h$d$a */
            static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f166631a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C17778Q f166632b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(C17778Q c17778q, Continuation<? super a> continuation) {
                    super(2, continuation);
                    this.f166632b = c17778q;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new a(this.f166632b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f166631a == 0) {
                        ResultKt.b(obj);
                        this.f166632b.Z();
                        return Unit.f143329a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f143329a;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(C17778Q c17778q) {
                super(0);
                this.f166630f = c17778q;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                InterfaceC15783O coroutineScope = this.f166630f.getCoroutineScope();
                if (coroutineScope != null) {
                    C15809k.d(coroutineScope, null, EnumC15785Q.f151688d, new a(this.f166630f, null), 1, null);
                }
                this.f166630f.X();
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: w0.Q$h$e */
        static final class e extends Lambda implements Function0<Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C17778Q f166633f;

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f143329a;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(C17778Q c17778q) {
                super(0);
                this.f166633f = c17778q;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f166633f.a0();
            }
        }

        h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C17778Q.this.new h(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((h) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00b2  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00dd  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00e6  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00ef  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x010f  */
        /* JADX WARN: Type inference failed for: r0v13, types: [kotlin.jvm.functions.Function0] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 286
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.C17778Q.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0004J\u001a\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\bJ\u001a\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"w0/Q$i", "Landroidx/compose/foundation/text/P;", "", "e", "()V", "LU0/f;", "point", "a", "(J)V", "c", "startPoint", "b", "delta", "d", "onStop", "onCancel", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: w0.Q$i */
    public static final class i implements P {
        @Override // androidx.compose.foundation.text.P
        public void a(long point) {
        }

        @Override // androidx.compose.foundation.text.P
        public void c() {
        }

        i() {
        }

        private final void e() {
            C17778Q.this.f0(null);
            C17778Q.this.d0(null);
            C17778Q.this.u0(true);
            C17778Q.this.dragBeginOffsetInText = null;
            boolean zH = androidx.compose.ui.text.y.h(C17778Q.this.U().getSelection());
            C17778Q.this.j0(zH ? EnumC5825o.f49923c : EnumC5825o.f49922b);
            B state = C17778Q.this.getState();
            if (state != null) {
                state.Q(!zH && C17779S.c(C17778Q.this, true));
            }
            B state2 = C17778Q.this.getState();
            if (state2 != null) {
                state2.P(!zH && C17779S.c(C17778Q.this, false));
            }
            B state3 = C17778Q.this.getState();
            if (state3 == null) {
                return;
            }
            state3.N(zH && C17779S.c(C17778Q.this, true));
        }

        @Override // androidx.compose.foundation.text.P
        public void b(long startPoint) {
            long j10;
            h0 h0VarL;
            h0 h0VarL2;
            if (C17778Q.this.H() && C17778Q.this.F() == null) {
                C17778Q.this.f0(EnumC5824n.f49916c);
                C17778Q.this.previousRawDragOffset = -1;
                C17778Q.this.X();
                B state = C17778Q.this.getState();
                if (state == null || (h0VarL2 = state.l()) == null || !h0VarL2.g(startPoint)) {
                    j10 = startPoint;
                    B state2 = C17778Q.this.getState();
                    if (state2 != null && (h0VarL = state2.l()) != null) {
                        C17778Q c17778q = C17778Q.this;
                        int iA = c17778q.getOffsetMapping().a(h0.e(h0VarL, j10, false, 2, null));
                        TextFieldValue textFieldValueS = c17778q.s(c17778q.U().getText(), C17334A.b(iA, iA));
                        c17778q.x(false);
                        InterfaceC6470a hapticFeedBack = c17778q.getHapticFeedBack();
                        if (hapticFeedBack != null) {
                            hapticFeedBack.a(C6471b.INSTANCE.i());
                        }
                        c17778q.O().invoke(textFieldValueS);
                    }
                } else {
                    if (C17778Q.this.U().h().length() == 0) {
                        return;
                    }
                    C17778Q.this.x(false);
                    C17778Q c17778q2 = C17778Q.this;
                    j10 = startPoint;
                    C17778Q.this.dragBeginOffsetInText = Integer.valueOf(androidx.compose.ui.text.y.n(c17778q2.v0(TextFieldValue.c(c17778q2.U(), null, androidx.compose.ui.text.y.INSTANCE.a(), null, 5, null), startPoint, true, false, InterfaceC17806v.INSTANCE.n(), true)));
                }
                C17778Q.this.j0(EnumC5825o.f49921a);
                C17778Q.this.dragBeginPosition = j10;
                C17778Q c17778q3 = C17778Q.this;
                c17778q3.d0(U0.f.d(c17778q3.dragBeginPosition));
                C17778Q.this.dragTotalDistance = U0.f.INSTANCE.c();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x00b4  */
        @Override // androidx.compose.foundation.text.P
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void d(long r10) {
            /*
                r9 = this;
                w0.Q r0 = kotlin.C17778Q.this
                boolean r0 = r0.H()
                if (r0 == 0) goto L104
                w0.Q r0 = kotlin.C17778Q.this
                z1.M r0 = r0.U()
                java.lang.String r0 = r0.h()
                int r0 = r0.length()
                if (r0 != 0) goto L19
                return
            L19:
                w0.Q r0 = kotlin.C17778Q.this
                long r1 = kotlin.C17778Q.e(r0)
                long r10 = U0.f.q(r1, r10)
                kotlin.C17778Q.i(r0, r10)
                w0.Q r10 = kotlin.C17778Q.this
                androidx.compose.foundation.text.B r10 = r10.getState()
                r11 = 0
                if (r10 == 0) goto Lff
                androidx.compose.foundation.text.h0 r0 = r10.l()
                if (r0 == 0) goto Lff
                w0.Q r10 = kotlin.C17778Q.this
                long r1 = kotlin.C17778Q.d(r10)
                long r3 = kotlin.C17778Q.e(r10)
                long r1 = U0.f.q(r1, r3)
                U0.f r1 = U0.f.d(r1)
                kotlin.C17778Q.f(r10, r1)
                java.lang.Integer r1 = kotlin.C17778Q.c(r10)
                if (r1 != 0) goto Lb4
                U0.f r1 = r10.D()
                kotlin.jvm.internal.Intrinsics.g(r1)
                long r1 = r1.getPackedValue()
                boolean r1 = r0.g(r1)
                if (r1 != 0) goto Lb4
                z1.E r6 = r10.getOffsetMapping()
                long r1 = kotlin.C17778Q.d(r10)
                r4 = 2
                r5 = 0
                r3 = 0
                int r1 = androidx.compose.foundation.text.h0.e(r0, r1, r3, r4, r5)
                int r6 = r6.a(r1)
                z1.E r7 = r10.getOffsetMapping()
                U0.f r1 = r10.D()
                kotlin.jvm.internal.Intrinsics.g(r1)
                long r1 = r1.getPackedValue()
                int r0 = androidx.compose.foundation.text.h0.e(r0, r1, r3, r4, r5)
                int r0 = r7.a(r0)
                if (r6 != r0) goto L95
                w0.v$a r0 = kotlin.InterfaceC17806v.INSTANCE
                w0.v r0 = r0.l()
            L93:
                r7 = r0
                goto L9c
            L95:
                w0.v$a r0 = kotlin.InterfaceC17806v.INSTANCE
                w0.v r0 = r0.n()
                goto L93
            L9c:
                z1.M r2 = r10.U()
                U0.f r0 = r10.D()
                kotlin.jvm.internal.Intrinsics.g(r0)
                long r3 = r0.getPackedValue()
                r6 = 0
                r8 = 1
                r5 = 0
                r1 = r10
                long r0 = kotlin.C17778Q.n(r1, r2, r3, r5, r6, r7, r8)
                goto Lfc
            Lb4:
                r1 = r10
                java.lang.Integer r10 = kotlin.C17778Q.c(r1)
                if (r10 == 0) goto Lc0
                int r10 = r10.intValue()
                goto Lc8
            Lc0:
                long r2 = kotlin.C17778Q.d(r1)
                int r10 = r0.d(r2, r11)
            Lc8:
                U0.f r2 = r1.D()
                kotlin.jvm.internal.Intrinsics.g(r2)
                long r2 = r2.getPackedValue()
                int r0 = r0.d(r2, r11)
                java.lang.Integer r2 = kotlin.C17778Q.c(r1)
                if (r2 != 0) goto Le0
                if (r10 != r0) goto Le0
                goto L104
            Le0:
                z1.M r2 = r1.U()
                U0.f r10 = r1.D()
                kotlin.jvm.internal.Intrinsics.g(r10)
                long r3 = r10.getPackedValue()
                w0.v$a r10 = kotlin.InterfaceC17806v.INSTANCE
                w0.v r7 = r10.n()
                r8 = 1
                r5 = 0
                r6 = 0
                long r0 = kotlin.C17778Q.n(r1, r2, r3, r5, r6, r7, r8)
            Lfc:
                androidx.compose.ui.text.y.b(r0)
            Lff:
                w0.Q r10 = kotlin.C17778Q.this
                kotlin.C17778Q.m(r10, r11)
            L104:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.C17778Q.i.d(long):void");
        }

        @Override // androidx.compose.foundation.text.P
        public void onCancel() {
            e();
        }

        @Override // androidx.compose.foundation.text.P
        public void onStop() {
            e();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C17778Q() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ C0 r(C17778Q c17778q, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return c17778q.q(z10);
    }

    public static /* synthetic */ void y(C17778Q c17778q, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        c17778q.x(z10);
    }

    public final void z() {
        u0(false);
        j0(EnumC5825o.f49921a);
    }

    public C17778Q(s0 s0Var) {
        this.undoManager = s0Var;
        this.offsetMapping = w0.d();
        this.onValueChange = f.f166616f;
        this.value = t1.e(new TextFieldValue((String) null, 0L, (androidx.compose.ui.text.y) null, 7, (DefaultConstructorMarker) null), null, 2, null);
        this.visualTransformation = W.INSTANCE.c();
        Boolean bool = Boolean.TRUE;
        this.editable = t1.e(bool, null, 2, null);
        this.enabled = t1.e(bool, null, 2, null);
        f.Companion companion = U0.f.INSTANCE;
        this.dragBeginPosition = companion.c();
        this.dragTotalDistance = companion.c();
        this.draggingHandle = t1.e(null, null, 2, null);
        this.currentDragPosition = t1.e(null, null, 2, null);
        this.previousRawDragOffset = -1;
        this.oldValue = new TextFieldValue((String) null, 0L, (androidx.compose.ui.text.y) null, 7, (DefaultConstructorMarker) null);
        this.touchSelectionObserver = new i();
        this.mouseSelectionObserver = new e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect B() {
        char c10;
        long j10;
        float fIntBitsToFloat;
        LayoutCoordinates layoutCoordinatesK;
        TextLayoutResult value;
        Rect rectE;
        LayoutCoordinates layoutCoordinatesK2;
        TextLayoutResult value2;
        Rect rectE2;
        LayoutCoordinates layoutCoordinatesK3;
        LayoutCoordinates layoutCoordinatesK4;
        B b10 = this.state;
        if (b10 != null) {
            if (b10.getIsLayoutResultStale()) {
                b10 = null;
            }
            if (b10 != null) {
                int iB = this.offsetMapping.b(androidx.compose.ui.text.y.n(U().getSelection()));
                int iB2 = this.offsetMapping.b(androidx.compose.ui.text.y.i(U().getSelection()));
                B b11 = this.state;
                long jC = (b11 == null || (layoutCoordinatesK4 = b11.k()) == null) ? U0.f.INSTANCE.c() : layoutCoordinatesK4.r0(K(true));
                B b12 = this.state;
                long jC2 = (b12 == null || (layoutCoordinatesK3 = b12.k()) == null) ? U0.f.INSTANCE.c() : layoutCoordinatesK3.r0(K(false));
                B b13 = this.state;
                float fIntBitsToFloat2 = 0.0f;
                if (b13 == null || (layoutCoordinatesK2 = b13.k()) == null) {
                    c10 = ' ';
                    j10 = 4294967295L;
                    fIntBitsToFloat = 0.0f;
                } else {
                    h0 h0VarL = b10.l();
                    c10 = ' ';
                    j10 = 4294967295L;
                    fIntBitsToFloat = Float.intBitsToFloat((int) (layoutCoordinatesK2.r0(U0.f.e((Float.floatToRawIntBits((h0VarL == null || (value2 = h0VarL.getValue()) == null || (rectE2 = value2.e(iB)) == null) ? 0.0f : rectE2.getTop()) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32))) & 4294967295L));
                }
                B b14 = this.state;
                if (b14 != null && (layoutCoordinatesK = b14.k()) != null) {
                    h0 h0VarL2 = b10.l();
                    fIntBitsToFloat2 = Float.intBitsToFloat((int) (layoutCoordinatesK.r0(U0.f.e((Float.floatToRawIntBits(0.0f) << c10) | (Float.floatToRawIntBits((h0VarL2 == null || (value = h0VarL2.getValue()) == null || (rectE = value.e(iB2)) == null) ? 0.0f : rectE.getTop()) & j10))) & j10));
                }
                int i10 = (int) (jC >> c10);
                int i11 = (int) (jC2 >> c10);
                return new Rect(Math.min(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), Math.min(fIntBitsToFloat, fIntBitsToFloat2), Math.max(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), Math.max(Float.intBitsToFloat((int) (jC & j10)), Float.intBitsToFloat((int) (jC2 & j10))) + (H1.h.p(25) * b10.getTextDelegate().getDensity().getDensity()));
            }
        }
        return Rect.INSTANCE.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d0(U0.f fVar) {
        this.currentDragPosition.setValue(fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f0(EnumC5824n enumC5824n) {
        this.draggingHandle.setValue(enumC5824n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j0(EnumC5825o handleState) {
        B b10 = this.state;
        if (b10 != null) {
            if (b10.e() == handleState) {
                b10 = null;
            }
            if (b10 != null) {
                b10.E(handleState);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextFieldValue s(AnnotatedString annotatedString, long selection) {
        return new TextFieldValue(annotatedString, selection, (androidx.compose.ui.text.y) null, 4, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u0(boolean show) {
        B b10 = this.state;
        if (b10 != null) {
            b10.O(show);
        }
        if (show) {
            t0();
        } else {
            X();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long v0(TextFieldValue value, long currentPosition, boolean isStartOfSelection, boolean isStartHandle, InterfaceC17806v adjustment, boolean isTouchBasedSelection) {
        h0 h0VarL;
        int i10;
        InterfaceC6470a interfaceC6470a;
        B b10 = this.state;
        if (b10 == null || (h0VarL = b10.l()) == null) {
            return androidx.compose.ui.text.y.INSTANCE.a();
        }
        long jB = C17334A.b(this.offsetMapping.b(androidx.compose.ui.text.y.n(value.getSelection())), this.offsetMapping.b(androidx.compose.ui.text.y.i(value.getSelection())));
        boolean z10 = false;
        int iD = h0VarL.d(currentPosition, false);
        int iN = (isStartHandle || isStartOfSelection) ? iD : androidx.compose.ui.text.y.n(jB);
        int i11 = (!isStartHandle || isStartOfSelection) ? iD : androidx.compose.ui.text.y.i(jB);
        InterfaceC17764C interfaceC17764C = this.previousSelectionLayout;
        if (isStartOfSelection || interfaceC17764C == null || (i10 = this.previousRawDragOffset) == -1) {
            i10 = -1;
        }
        InterfaceC17764C interfaceC17764CC = C17766E.c(h0VarL.getValue(), iN, i11, i10, jB, isStartOfSelection, isStartHandle);
        if (!interfaceC17764CC.l(interfaceC17764C)) {
            return value.getSelection();
        }
        this.previousSelectionLayout = interfaceC17764CC;
        this.previousRawDragOffset = iD;
        Selection selectionA = adjustment.a(interfaceC17764CC);
        long jB2 = C17334A.b(this.offsetMapping.a(selectionA.getStart().getOffset()), this.offsetMapping.a(selectionA.getEnd().getOffset()));
        if (androidx.compose.ui.text.y.g(jB2, value.getSelection())) {
            return value.getSelection();
        }
        boolean z11 = androidx.compose.ui.text.y.m(jB2) != androidx.compose.ui.text.y.m(value.getSelection()) && androidx.compose.ui.text.y.g(C17334A.b(androidx.compose.ui.text.y.i(jB2), androidx.compose.ui.text.y.n(jB2)), value.getSelection());
        boolean z12 = androidx.compose.ui.text.y.h(jB2) && androidx.compose.ui.text.y.h(value.getSelection());
        if (isTouchBasedSelection && value.h().length() > 0 && !z11 && !z12 && (interfaceC6470a = this.hapticFeedBack) != null) {
            interfaceC6470a.a(C6471b.INSTANCE.i());
        }
        this.onValueChange.invoke(s(value.getText(), jB2));
        if (!isTouchBasedSelection) {
            u0(!androidx.compose.ui.text.y.h(jB2));
        }
        B b11 = this.state;
        if (b11 != null) {
            b11.G(isTouchBasedSelection);
        }
        B b12 = this.state;
        if (b12 != null) {
            b12.Q(!androidx.compose.ui.text.y.h(jB2) && C17779S.c(this, true));
        }
        B b13 = this.state;
        if (b13 != null) {
            b13.P(!androidx.compose.ui.text.y.h(jB2) && C17779S.c(this, false));
        }
        B b14 = this.state;
        if (b14 == null) {
            return jB2;
        }
        if (androidx.compose.ui.text.y.h(jB2) && C17779S.c(this, true)) {
            z10 = true;
        }
        b14.N(z10);
        return jB2;
    }

    public static /* synthetic */ void w(C17778Q c17778q, U0.f fVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fVar = null;
        }
        c17778q.v(fVar);
    }

    /* renamed from: A, reason: from getter */
    public final InterfaceC6026q0 getClipboard() {
        return this.clipboard;
    }

    /* renamed from: C, reason: from getter */
    public final InterfaceC15783O getCoroutineScope() {
        return this.coroutineScope;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final U0.f D() {
        return (U0.f) this.currentDragPosition.getValue();
    }

    public final long E(H1.d density) {
        int iB = this.offsetMapping.b(androidx.compose.ui.text.y.n(U().getSelection()));
        B b10 = this.state;
        h0 h0VarL = b10 != null ? b10.l() : null;
        Intrinsics.g(h0VarL);
        TextLayoutResult value = h0VarL.getValue();
        Rect rectE = value.e(RangesKt.o(iB, 0, value.getLayoutInput().getText().length()));
        return U0.f.e((Float.floatToRawIntBits(rectE.getLeft() + (density.I1(S.a()) / 2)) << 32) | (Float.floatToRawIntBits(rectE.i()) & 4294967295L));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final EnumC5824n F() {
        return (EnumC5824n) this.draggingHandle.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean G() {
        return ((Boolean) this.editable.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean H() {
        return ((Boolean) this.enabled.getValue()).booleanValue();
    }

    /* renamed from: I, reason: from getter */
    public final y getFocusRequester() {
        return this.focusRequester;
    }

    public final float J(boolean isStartHandle) {
        h0 h0VarL;
        TextLayoutResult value;
        int iN = isStartHandle ? androidx.compose.ui.text.y.n(U().getSelection()) : androidx.compose.ui.text.y.i(U().getSelection());
        B b10 = this.state;
        if (b10 == null || (h0VarL = b10.l()) == null || (value = h0VarL.getValue()) == null) {
            return 0.0f;
        }
        return g0.b(value, iN);
    }

    public final long K(boolean isStartHandle) {
        h0 h0VarL;
        TextLayoutResult value;
        B b10 = this.state;
        if (b10 == null || (h0VarL = b10.l()) == null || (value = h0VarL.getValue()) == null) {
            return U0.f.INSTANCE.b();
        }
        AnnotatedString annotatedStringS = S();
        if (annotatedStringS == null) {
            return U0.f.INSTANCE.b();
        }
        if (!Intrinsics.e(annotatedStringS.getText(), value.getLayoutInput().getText().getText())) {
            return U0.f.INSTANCE.b();
        }
        long selection = U().getSelection();
        return C17784X.b(value, this.offsetMapping.b(isStartHandle ? androidx.compose.ui.text.y.n(selection) : androidx.compose.ui.text.y.i(selection)), isStartHandle, androidx.compose.ui.text.y.m(U().getSelection()));
    }

    /* renamed from: L, reason: from getter */
    public final InterfaceC6470a getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    /* renamed from: M, reason: from getter */
    public final InterfaceC17793i getMouseSelectionObserver() {
        return this.mouseSelectionObserver;
    }

    /* renamed from: N, reason: from getter */
    public final InterfaceC18417E getOffsetMapping() {
        return this.offsetMapping;
    }

    public final Function1<TextFieldValue, Unit> O() {
        return this.onValueChange;
    }

    /* renamed from: P, reason: from getter */
    public final B getState() {
        return this.state;
    }

    /* renamed from: Q, reason: from getter */
    public final H1 getTextToolbar() {
        return this.textToolbar;
    }

    /* renamed from: R, reason: from getter */
    public final P getTouchSelectionObserver() {
        return this.touchSelectionObserver;
    }

    public final AnnotatedString S() {
        androidx.compose.foundation.text.N textDelegate;
        B b10 = this.state;
        if (b10 == null || (textDelegate = b10.getTextDelegate()) == null) {
            return null;
        }
        return textDelegate.getText();
    }

    /* renamed from: T, reason: from getter */
    public final s0 getUndoManager() {
        return this.undoManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TextFieldValue U() {
        return (TextFieldValue) this.value.getValue();
    }

    /* renamed from: V, reason: from getter */
    public final W getVisualTransformation() {
        return this.visualTransformation;
    }

    public final P W(boolean isStartHandle) {
        return new d(isStartHandle);
    }

    public final void X() {
        H1 h12;
        H1 h13 = this.textToolbar;
        if ((h13 != null ? h13.getStatus() : null) != J1.f52049a || (h12 = this.textToolbar) == null) {
            return;
        }
        h12.b();
    }

    public final boolean Y() {
        return !Intrinsics.e(this.oldValue.h(), U().h());
    }

    public final C0 Z() {
        InterfaceC15783O interfaceC15783O = this.coroutineScope;
        if (interfaceC15783O != null) {
            return C15809k.d(interfaceC15783O, null, EnumC15785Q.f151688d, new g(null), 1, null);
        }
        return null;
    }

    public final void b0(InterfaceC6026q0 interfaceC6026q0) {
        this.clipboard = interfaceC6026q0;
    }

    public final void c0(InterfaceC15783O interfaceC15783O) {
        this.coroutineScope = interfaceC15783O;
    }

    public final void e0(long range) {
        B b10 = this.state;
        if (b10 != null) {
            b10.D(range);
        }
        B b11 = this.state;
        if (b11 != null) {
            b11.M(androidx.compose.ui.text.y.INSTANCE.a());
        }
        if (androidx.compose.ui.text.y.h(range)) {
            return;
        }
        z();
    }

    public final void g0(boolean z10) {
        this.editable.setValue(Boolean.valueOf(z10));
    }

    public final void h0(boolean z10) {
        this.enabled.setValue(Boolean.valueOf(z10));
    }

    public final void i0(y yVar) {
        this.focusRequester = yVar;
    }

    public final void k0(InterfaceC6470a interfaceC6470a) {
        this.hapticFeedBack = interfaceC6470a;
    }

    public final void l0(InterfaceC18417E interfaceC18417E) {
        this.offsetMapping = interfaceC18417E;
    }

    public final void m0(Function1<? super TextFieldValue, Unit> function1) {
        this.onValueChange = function1;
    }

    public final void n0(Function0<Unit> function0) {
        this.requestAutofillAction = function0;
    }

    public final void o() {
        Function0<Unit> function0 = this.requestAutofillAction;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void o0(long range) {
        B b10 = this.state;
        if (b10 != null) {
            b10.M(range);
        }
        B b11 = this.state;
        if (b11 != null) {
            b11.D(androidx.compose.ui.text.y.INSTANCE.a());
        }
        if (androidx.compose.ui.text.y.h(range)) {
            return;
        }
        z();
    }

    public final void p() {
        B b10 = this.state;
        if (b10 != null) {
            b10.D(androidx.compose.ui.text.y.INSTANCE.a());
        }
        B b11 = this.state;
        if (b11 == null) {
            return;
        }
        b11.M(androidx.compose.ui.text.y.INSTANCE.a());
    }

    public final void p0(B b10) {
        this.state = b10;
    }

    public final C0 q(boolean cancelSelection) {
        InterfaceC15783O interfaceC15783O = this.coroutineScope;
        if (interfaceC15783O != null) {
            return C15809k.d(interfaceC15783O, null, EnumC15785Q.f151688d, new a(cancelSelection, null), 1, null);
        }
        return null;
    }

    public final void q0(H1 h12) {
        this.textToolbar = h12;
    }

    public final void r0(TextFieldValue textFieldValue) {
        this.value.setValue(textFieldValue);
    }

    public final void s0(W w10) {
        this.visualTransformation = w10;
    }

    public final P t() {
        return new b();
    }

    public final C0 t0() {
        InterfaceC15783O interfaceC15783O = this.coroutineScope;
        if (interfaceC15783O != null) {
            return C15809k.d(interfaceC15783O, null, EnumC15785Q.f151688d, new h(null), 1, null);
        }
        return null;
    }

    public final C0 u() {
        InterfaceC15783O interfaceC15783O = this.coroutineScope;
        if (interfaceC15783O != null) {
            return C15809k.d(interfaceC15783O, null, EnumC15785Q.f151688d, new c(null), 1, null);
        }
        return null;
    }

    public final void x(boolean showFloatingToolbar) {
        y yVar;
        B b10 = this.state;
        if (b10 != null && !b10.f() && (yVar = this.focusRequester) != null) {
            y.h(yVar, 0, 1, null);
        }
        this.oldValue = U();
        u0(showFloatingToolbar);
        j0(EnumC5825o.f49922b);
    }

    public final void a0() {
        TextFieldValue textFieldValueS = s(U().getText(), C17334A.b(0, U().h().length()));
        this.onValueChange.invoke(textFieldValueS);
        this.oldValue = TextFieldValue.c(this.oldValue, null, textFieldValueS.getSelection(), null, 5, null);
        x(true);
    }

    public final void v(U0.f position) {
        EnumC5825o enumC5825o;
        h0 h0VarL;
        int iK;
        if (!androidx.compose.ui.text.y.h(U().getSelection())) {
            B b10 = this.state;
            if (b10 != null) {
                h0VarL = b10.l();
            } else {
                h0VarL = null;
            }
            h0 h0Var = h0VarL;
            if (position != null && h0Var != null) {
                iK = this.offsetMapping.a(h0.e(h0Var, position.getPackedValue(), false, 2, null));
            } else {
                iK = androidx.compose.ui.text.y.k(U().getSelection());
            }
            this.onValueChange.invoke(TextFieldValue.c(U(), null, C17334A.a(iK), null, 5, null));
        }
        if (position != null && U().h().length() > 0) {
            enumC5825o = EnumC5825o.f49923c;
        } else {
            enumC5825o = EnumC5825o.f49921a;
        }
        j0(enumC5825o);
        u0(false);
    }

    public /* synthetic */ C17778Q(s0 s0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : s0Var);
    }
}
