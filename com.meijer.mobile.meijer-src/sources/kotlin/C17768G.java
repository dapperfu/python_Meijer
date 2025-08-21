package kotlin;

import U0.f;
import Z.AbstractC5626y;
import Z.C5624w;
import Z.C5627z;
import Z.M;
import Z.O;
import android.view.KeyEvent;
import androidx.compose.foundation.text.EnumC5824n;
import androidx.compose.foundation.text.P;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.A;
import androidx.compose.ui.focus.C5903d;
import androidx.compose.ui.focus.E;
import androidx.compose.ui.focus.y;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.T;
import androidx.compose.ui.platform.H1;
import androidx.compose.ui.platform.J1;
import androidx.compose.ui.text.AnnotatedString;
import c1.C6471b;
import c1.InterfaceC6470a;
import e1.C13750b;
import g1.InterfaceC14300c;
import g1.J;
import g1.U;
import i0.C14592e;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.C13931t;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Selection;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import u0.w0;

@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0011\u001a\u00020\u000e*\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J*\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ,\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001aH\u0002ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u001f\u0010'\u001a\u00020\u00062\u0006\u0010$\u001a\u00020!2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u0019\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010*\u001a\u00020)H\u0000¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0013H\u0000¢\u0006\u0004\b.\u0010/J5\u00105\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\n\u0012\b\u0012\u0004\u0012\u00020%04032\u0006\u00101\u001a\u0002002\b\u00102\u001a\u0004\u0018\u00010%H\u0000¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u001aH\u0000¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0006H\u0000¢\u0006\u0004\b9\u0010\bJ\u000f\u0010:\u001a\u00020\u001aH\u0000¢\u0006\u0004\b:\u00108J\u000f\u0010;\u001a\u00020\u001aH\u0000¢\u0006\u0004\b;\u00108J\u0011\u0010=\u001a\u0004\u0018\u00010<H\u0000¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u0006H\u0000¢\u0006\u0004\b?\u0010\bJ\r\u0010@\u001a\u00020\u0006¢\u0006\u0004\b@\u0010\bJ\u0015\u0010B\u001a\u00020A2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\bB\u0010CJ4\u0010F\u001a\u00020\u001a2\b\u0010D\u001a\u0004\u0018\u00010\u00152\u0006\u0010E\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0000ø\u0001\u0000¢\u0006\u0004\bF\u0010GJ2\u0010H\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0000ø\u0001\u0000¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\u001aH\u0001¢\u0006\u0004\bJ\u00108R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u001c\u0010P\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020\u001a0M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010ORF\u0010[\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0004\u0012\u00020\u00060S2\u0014\u0010T\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0004\u0012\u00020\u00060S8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR$\u0010c\u001a\u0004\u0018\u00010\\8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR0\u0010g\u001a\u0010\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\u0006\u0018\u00010S8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bd\u0010V\u001a\u0004\be\u0010X\"\u0004\bf\u0010ZR$\u0010o\u001a\u0004\u0018\u00010h8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\"\u0010w\u001a\u00020p8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR+\u0010}\u001a\u00020\u001a2\u0006\u0010x\u001a\u00020\u001a8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\by\u0010O\u001a\u0004\bz\u00108\"\u0004\b{\u0010|R\u001e\u0010E\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b~\u0010\u007fR5\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u00132\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u00138\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0005\b\u0083\u0001\u0010/\"\u0006\b\u0084\u0001\u0010\u0085\u0001R7\u0010\u008c\u0001\u001a\u00020\u00152\u0006\u0010x\u001a\u00020\u00158@@BX\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0017\n\u0005\b\u0087\u0001\u0010O\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R7\u0010\u0090\u0001\u001a\u00020\u00152\u0006\u0010x\u001a\u00020\u00158@@BX\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0017\n\u0005\b\u008d\u0001\u0010O\u001a\u0006\b\u008e\u0001\u0010\u0089\u0001\"\u0006\b\u008f\u0001\u0010\u008b\u0001R:\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u00152\b\u0010x\u001a\u0004\u0018\u00010\u00158F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0016\n\u0004\b\u0017\u0010O\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001R:\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u00152\b\u0010x\u001a\u0004\u0018\u00010\u00158F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0016\n\u0004\b?\u0010O\u001a\u0006\b\u0096\u0001\u0010\u0092\u0001\"\u0006\b\u0097\u0001\u0010\u0094\u0001R6\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u0099\u00012\t\u0010x\u001a\u0005\u0018\u00010\u0099\u00018F@BX\u0086\u008e\u0002¢\u0006\u0016\n\u0004\b,\u0010O\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R;\u0010¡\u0001\u001a\u0004\u0018\u00010\u00152\b\u0010x\u001a\u0004\u0018\u00010\u00158F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0017\n\u0005\b\u0083\u0001\u0010O\u001a\u0006\b\u009f\u0001\u0010\u0092\u0001\"\u0006\b \u0001\u0010\u0094\u0001R1\u0010¨\u0001\u001a\u0004\u0018\u00010!8\u0000@\u0000X\u0081\u000e¢\u0006\u001e\n\u0005\b\f\u0010¢\u0001\u0012\u0005\b§\u0001\u0010\b\u001a\u0006\b£\u0001\u0010¤\u0001\"\u0006\b¥\u0001\u0010¦\u0001R0\u0010«\u0001\u001a\u00020\u001a2\u0007\u0010\u0080\u0001\u001a\u00020\u001a8\u0000@@X\u0080\u000e¢\u0006\u0016\n\u0006\b\u009f\u0001\u0010\u0097\u0001\u001a\u0005\b©\u0001\u00108\"\u0005\bª\u0001\u0010|R\u0016\u0010\u00ad\u0001\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¬\u0001\u00108R\u0016\u0010¯\u0001\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b®\u0001\u00108R.\u0010´\u0001\u001a\u0004\u0018\u00010%2\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010%8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b°\u0001\u0010±\u0001\"\u0006\b²\u0001\u0010³\u0001R(\u0010·\u0001\u001a\u00020\u001a2\u0007\u0010\u0080\u0001\u001a\u00020\u001a8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\bµ\u0001\u00108\"\u0005\b¶\u0001\u0010|R\u0014\u0010º\u0001\u001a\u00020\u000e8F¢\u0006\b\u001a\u0006\b¸\u0001\u0010¹\u0001R\u0015\u0010¾\u0001\u001a\u00030»\u00018F¢\u0006\b\u001a\u0006\b¼\u0001\u0010½\u0001R\u0015\u0010À\u0001\u001a\u00030»\u00018F¢\u0006\b\u001a\u0006\b¿\u0001\u0010½\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Á\u0001"}, d2 = {"Lw0/G;", "", "Lw0/L;", "selectionRegistrar", "<init>", "(Lw0/L;)V", "", "m0", "()V", "l0", "p0", "Landroidx/compose/ui/geometry/Rect;", "r", "()Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/Modifier;", "Lkotlin/Function0;", "block", "O", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "layoutCoordinates", "LU0/f;", "offset", "n", "(Landroidx/compose/ui/layout/LayoutCoordinates;J)J", "position", "", "isStartHandle", "Lw0/v;", "adjustment", "k0", "(JZLw0/v;)V", "previousHandlePosition", "Lw0/C;", "E", "(JJZ)Lw0/C;", "selectionLayout", "Lw0/p;", "newSelection", "T", "(Lw0/C;Lw0/p;)V", "Lw0/p$a;", "anchor", "Lw0/n;", "p", "(Lw0/p$a;)Lw0/n;", "Q", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "", "selectableId", "previousSelection", "Lkotlin/Pair;", "LZ/y;", "S", "(JLw0/p;)Lkotlin/Pair;", "K", "()Z", "R", "N", "M", "Landroidx/compose/ui/text/AnnotatedString;", "C", "()Landroidx/compose/ui/text/AnnotatedString;", "o", "P", "Landroidx/compose/foundation/text/P;", "I", "(Z)Landroidx/compose/foundation/text/P;", "newPosition", "previousPosition", "o0", "(LU0/f;JZLw0/v;)Z", "n0", "(JJZLw0/v;)Z", "j0", "a", "Lw0/L;", "Landroidx/compose/runtime/l0;", "b", "Landroidx/compose/runtime/l0;", "_selection", "c", "_isInTouchMode", "Lkotlin/Function1;", "newOnSelectionChange", "d", "Lkotlin/jvm/functions/Function1;", "B", "()Lkotlin/jvm/functions/Function1;", "e0", "(Lkotlin/jvm/functions/Function1;)V", "onSelectionChange", "Lc1/a;", "e", "Lc1/a;", "getHapticFeedBack", "()Lc1/a;", "a0", "(Lc1/a;)V", "hapticFeedBack", "f", "getOnCopyHandler", "d0", "onCopyHandler", "Landroidx/compose/ui/platform/H1;", "g", "Landroidx/compose/ui/platform/H1;", "getTextToolbar", "()Landroidx/compose/ui/platform/H1;", "i0", "(Landroidx/compose/ui/platform/H1;)V", "textToolbar", "Landroidx/compose/ui/focus/y;", "h", "Landroidx/compose/ui/focus/y;", "y", "()Landroidx/compose/ui/focus/y;", "setFocusRequester", "(Landroidx/compose/ui/focus/y;)V", "focusRequester", "<set-?>", "i", "z", "b0", "(Z)V", "hasFocus", "j", "LU0/f;", "value", "k", "Landroidx/compose/ui/layout/LayoutCoordinates;", "q", "U", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "containerLayoutCoordinates", "l", "t", "()J", "W", "(J)V", "dragBeginPosition", "m", "u", "X", "dragTotalDistance", "H", "()LU0/f;", "h0", "(LU0/f;)V", "startHandlePosition", "x", "Z", "endHandlePosition", "Landroidx/compose/foundation/text/n;", "v", "()Landroidx/compose/foundation/text/n;", "Y", "(Landroidx/compose/foundation/text/n;)V", "draggingHandle", "s", "V", "currentDragPosition", "Lw0/C;", "getPreviousSelectionLayout$foundation_release", "()Lw0/C;", "setPreviousSelectionLayout$foundation_release", "(Lw0/C;)V", "getPreviousSelectionLayout$foundation_release$annotations", "previousSelectionLayout", "getShowToolbar$foundation_release", "g0", "showToolbar", "J", "isDraggingInProgress", "F", "shouldShowMagnifier", "D", "()Lw0/p;", "f0", "(Lw0/p;)V", "selection", "L", "c0", "isInTouchMode", "A", "()Landroidx/compose/ui/Modifier;", "modifier", "", "G", "()F", "startHandleLineHeight", "w", "endHandleLineHeight", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: w0.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17768G {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C17773L selectionRegistrar;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private InterfaceC6470a hapticFeedBack;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Function1<? super AnnotatedString, Unit> onCopyHandler;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private H1 textToolbar;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private U0.f previousPosition;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private LayoutCoordinates containerLayoutCoordinates;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0 dragBeginPosition;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0 dragTotalDistance;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0 startHandlePosition;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0 endHandlePosition;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0 draggingHandle;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0 currentDragPosition;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private InterfaceC17764C previousSelectionLayout;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean showToolbar;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<Selection> _selection = t1.e(null, null, 2, null);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<Boolean> _isInTouchMode = t1.e(Boolean.TRUE, null, 2, null);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Function1<? super Selection, Unit> onSelectionChange = new p();

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private y focusRequester = new y();

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0 hasFocus = t1.e(Boolean.FALSE, null, 2, null);

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "selectableId", "", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: w0.G$a */
    static final class a extends Lambda implements Function1<Long, Unit> {
        a() {
            super(1);
        }

        public final void a(long j10) {
            if (C17768G.this.selectionRegistrar.d().a(j10)) {
                C17768G.this.m0();
                C17768G.this.p0();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l10) {
            a(l10.longValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "isInTouchMode", "Landroidx/compose/ui/layout/LayoutCoordinates;", "layoutCoordinates", "LU0/f;", "rawPosition", "Lw0/v;", "selectionMode", "", "a", "(ZLandroidx/compose/ui/layout/LayoutCoordinates;JLw0/v;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: w0.G$b */
    static final class b extends Lambda implements Function4<Boolean, LayoutCoordinates, U0.f, InterfaceC17806v, Unit> {
        b() {
            super(4);
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, LayoutCoordinates layoutCoordinates, U0.f fVar, InterfaceC17806v interfaceC17806v) {
            a(bool.booleanValue(), layoutCoordinates, fVar.getPackedValue(), interfaceC17806v);
            return Unit.f143329a;
        }

        public final void a(boolean z10, LayoutCoordinates layoutCoordinates, long j10, InterfaceC17806v interfaceC17806v) {
            long jC = layoutCoordinates.c();
            Rect rect = new Rect(0.0f, 0.0f, (int) (jC >> 32), (int) (jC & 4294967295L));
            if (!C17769H.d(rect, j10)) {
                j10 = w0.a(j10, rect);
            }
            long jN = C17768G.this.n(layoutCoordinates, j10);
            if ((9223372034707292159L & jN) != 9205357640488583168L) {
                C17768G.this.c0(z10);
                C17768G.this.k0(jN, false, interfaceC17806v);
                y.h(C17768G.this.getFocusRequester(), 0, 1, null);
                C17768G.this.g0(false);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "isInTouchMode", "", "selectableId", "", "a", "(ZJ)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: w0.G$c */
    static final class c extends Lambda implements Function2<Boolean, Long, Unit> {
        c() {
            super(2);
        }

        public final void a(boolean z10, long j10) {
            C17768G c17768g = C17768G.this;
            Pair<Selection, AbstractC5626y<Selection>> pairS = c17768g.S(j10, c17768g.D());
            Selection selectionA = pairS.a();
            AbstractC5626y<Selection> abstractC5626yB = pairS.b();
            if (!Intrinsics.e(selectionA, C17768G.this.D())) {
                C17768G.this.selectionRegistrar.v(abstractC5626yB);
                C17768G.this.B().invoke(selectionA);
            }
            C17768G.this.c0(z10);
            y.h(C17768G.this.getFocusRequester(), 0, 1, null);
            C17768G.this.g0(false);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Long l10) {
            a(bool.booleanValue(), l10.longValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "isInTouchMode", "Landroidx/compose/ui/layout/LayoutCoordinates;", "layoutCoordinates", "LU0/f;", "newPosition", "previousPosition", "isStartHandle", "Lw0/v;", "selectionMode", "a", "(ZLandroidx/compose/ui/layout/LayoutCoordinates;JJZLw0/v;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: w0.G$d */
    static final class d extends Lambda implements Function6<Boolean, LayoutCoordinates, U0.f, U0.f, Boolean, InterfaceC17806v, Boolean> {
        d() {
            super(6);
        }

        public final Boolean a(boolean z10, LayoutCoordinates layoutCoordinates, long j10, long j11, boolean z11, InterfaceC17806v interfaceC17806v) {
            long jN = C17768G.this.n(layoutCoordinates, j10);
            long jN2 = C17768G.this.n(layoutCoordinates, j11);
            C17768G.this.c0(z10);
            return Boolean.valueOf(C17768G.this.o0(U0.f.d(jN), jN2, z11, interfaceC17806v));
        }

        @Override // kotlin.jvm.functions.Function6
        public /* bridge */ /* synthetic */ Boolean h(Boolean bool, LayoutCoordinates layoutCoordinates, U0.f fVar, U0.f fVar2, Boolean bool2, InterfaceC17806v interfaceC17806v) {
            return a(bool.booleanValue(), layoutCoordinates, fVar.getPackedValue(), fVar2.getPackedValue(), bool2.booleanValue(), interfaceC17806v);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: w0.G$e */
    static final class e extends Lambda implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        e() {
            super(0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C17768G.this.g0(true);
            C17768G.this.Y(null);
            C17768G.this.V(null);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "selectableKey", "", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: w0.G$f */
    static final class f extends Lambda implements Function1<Long, Unit> {
        f() {
            super(1);
        }

        public final void a(long j10) {
            if (C17768G.this.selectionRegistrar.d().a(j10)) {
                C17768G.this.P();
                C17768G.this.f0(null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l10) {
            a(l10.longValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "selectableId", "", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: w0.G$g */
    static final class g extends Lambda implements Function1<Long, Unit> {
        g() {
            super(1);
        }

        public final void a(long j10) {
            Selection.AnchorInfo end;
            Selection.AnchorInfo start;
            Selection selectionD = C17768G.this.D();
            if (selectionD != null && (start = selectionD.getStart()) != null && j10 == start.getSelectableId()) {
                C17768G.this.h0(null);
            }
            Selection selectionD2 = C17768G.this.D();
            if (selectionD2 != null && (end = selectionD2.getEnd()) != null && j10 == end.getSelectableId()) {
                C17768G.this.Z(null);
            }
            if (C17768G.this.selectionRegistrar.d().a(j10)) {
                C17768G.this.p0();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l10) {
            a(l10.longValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: w0.G$h */
    public static final class h<T> implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ M f166516a;

        public h(M m10) {
            this.f166516a = m10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return ComparisonsKt.d(Integer.valueOf(this.f166516a.b(((Number) t10).longValue())), Integer.valueOf(this.f166516a.b(((Number) t11).longValue())));
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\bJ\u001a\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"w0/G$i", "Landroidx/compose/foundation/text/P;", "", "e", "()V", "LU0/f;", "point", "a", "(J)V", "startPoint", "b", "delta", "d", "c", "onStop", "onCancel", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: w0.G$i */
    public static final class i implements P {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f166517a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C17768G f166518b;

        i(boolean z10, C17768G c17768g) {
            this.f166517a = z10;
            this.f166518b = c17768g;
        }

        private final void e() {
            this.f166518b.g0(true);
            this.f166518b.Y(null);
            this.f166518b.V(null);
        }

        @Override // androidx.compose.foundation.text.P
        public void a(long point) {
            LayoutCoordinates layoutCoordinatesB;
            U0.f fVarH = this.f166517a ? this.f166518b.H() : this.f166518b.x();
            if (fVarH != null) {
                fVarH.getPackedValue();
                Selection selectionD = this.f166518b.D();
                if (selectionD == null) {
                    return;
                }
                InterfaceC17798n interfaceC17798nP = this.f166518b.p(this.f166517a ? selectionD.getStart() : selectionD.getEnd());
                if (interfaceC17798nP == null || (layoutCoordinatesB = interfaceC17798nP.B()) == null) {
                    return;
                }
                long jC = interfaceC17798nP.c(selectionD, this.f166517a);
                if ((9223372034707292159L & jC) == 9205357640488583168L) {
                    return;
                }
                long jA = C17763B.a(jC);
                C17768G c17768g = this.f166518b;
                c17768g.V(U0.f.d(c17768g.Q().J(layoutCoordinatesB, jA)));
                this.f166518b.Y(this.f166517a ? EnumC5824n.f49915b : EnumC5824n.f49916c);
                this.f166518b.g0(false);
            }
        }

        @Override // androidx.compose.foundation.text.P
        public void b(long startPoint) {
            if (this.f166518b.v() == null) {
                return;
            }
            Selection selectionD = this.f166518b.D();
            Intrinsics.g(selectionD);
            InterfaceC17798n interfaceC17798nB = this.f166518b.selectionRegistrar.m().b((this.f166517a ? selectionD.getStart() : selectionD.getEnd()).getSelectableId());
            if (interfaceC17798nB == null) {
                C14592e.d("SelectionRegistrar should contain the current selection's selectableIds");
                throw new KotlinNothingValueException();
            }
            InterfaceC17798n interfaceC17798n = interfaceC17798nB;
            LayoutCoordinates layoutCoordinatesB = interfaceC17798n.B();
            if (layoutCoordinatesB == null) {
                C14592e.d("Current selectable should have layout coordinates.");
                throw new KotlinNothingValueException();
            }
            long jC = interfaceC17798n.c(selectionD, this.f166517a);
            if ((9223372034707292159L & jC) == 9205357640488583168L) {
                return;
            }
            long jA = C17763B.a(jC);
            C17768G c17768g = this.f166518b;
            c17768g.W(c17768g.Q().J(layoutCoordinatesB, jA));
            this.f166518b.X(U0.f.INSTANCE.c());
        }

        @Override // androidx.compose.foundation.text.P
        public void d(long delta) {
            if (this.f166518b.v() == null) {
                return;
            }
            C17768G c17768g = this.f166518b;
            c17768g.X(U0.f.q(c17768g.u(), delta));
            long jQ = U0.f.q(this.f166518b.t(), this.f166518b.u());
            if (this.f166518b.o0(U0.f.d(jQ), this.f166518b.t(), this.f166517a, InterfaceC17806v.INSTANCE.k())) {
                this.f166518b.W(jQ);
                this.f166518b.X(U0.f.INSTANCE.c());
            }
        }

        @Override // androidx.compose.foundation.text.P
        public void c() {
            e();
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

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: w0.G$j */
    static final class j extends Lambda implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        j() {
            super(0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C17768G.this.P();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/LayoutCoordinates;", "it", "", "a", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: w0.G$k */
    static final class k extends Lambda implements Function1<LayoutCoordinates, Unit> {
        k() {
            super(1);
        }

        public final void a(LayoutCoordinates layoutCoordinates) {
            C17768G.this.U(layoutCoordinates);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
            a(layoutCoordinates);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/E;", "focusState", "", "a", "(Landroidx/compose/ui/focus/E;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: w0.G$l */
    static final class l extends Lambda implements Function1<E, Unit> {
        l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(E e10) {
            a(e10);
            return Unit.f143329a;
        }

        public final void a(E e10) {
            if (!e10.b() && C17768G.this.z()) {
                C17768G.this.P();
            }
            C17768G.this.b0(e10.b());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Z)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: w0.G$m */
    static final class m extends Lambda implements Function1<Boolean, Unit> {
        m() {
            super(1);
        }

        public final void a(boolean z10) {
            C17768G.this.c0(z10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            a(bool.booleanValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Le1/b;", "it", "", "a", "(Landroid/view/KeyEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: w0.G$n */
    static final class n extends Lambda implements Function1<C13750b, Boolean> {
        n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(C13750b c13750b) {
            return a(c13750b.getNativeKeyEvent());
        }

        public final Boolean a(KeyEvent keyEvent) {
            boolean z10;
            if (C17770I.b(keyEvent)) {
                C17768G.this.o();
                z10 = true;
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg1/J;", "", "invoke", "(Lg1/J;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: w0.G$o */
    static final class o implements PointerInputEventHandler {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f166525b;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg1/c;", "", "<anonymous>", "(Lg1/c;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1$1", f = "SelectionManager.kt", l = {754, 760}, m = "invokeSuspend")
        /* renamed from: w0.G$o$a */
        static final class a extends RestrictedSuspendLambda implements Function2<InterfaceC14300c, Continuation<? super Unit>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f166526b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f166527c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C17768G f166528d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f166529e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C17768G c17768g, Function0<Unit> function0, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f166528d = c17768g;
                this.f166529e = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f166528d, this.f166529e, continuation);
                aVar.f166527c = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC14300c interfaceC14300c, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC14300c, continuation)).invokeSuspend(Unit.f143329a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
            
                if (r11 == r0) goto L16;
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
                    int r1 = r10.f166526b
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L24
                    if (r1 == r3) goto L1b
                    if (r1 != r2) goto L13
                    kotlin.ResultKt.b(r11)
                    r7 = r10
                    goto L4d
                L13:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
                L1b:
                    java.lang.Object r1 = r10.f166527c
                    g1.c r1 = (g1.InterfaceC14300c) r1
                    kotlin.ResultKt.b(r11)
                    r7 = r10
                    goto L3d
                L24:
                    kotlin.ResultKt.b(r11)
                    java.lang.Object r11 = r10.f166527c
                    r4 = r11
                    g1.c r4 = (g1.InterfaceC14300c) r4
                    r10.f166527c = r4
                    r10.f166526b = r3
                    r5 = 0
                    r6 = 0
                    r8 = 2
                    r9 = 0
                    r7 = r10
                    java.lang.Object r11 = kotlin.C13904L.h(r4, r5, r6, r7, r8, r9)
                    if (r11 != r0) goto L3c
                    goto L4c
                L3c:
                    r1 = r4
                L3d:
                    g1.B r11 = (g1.PointerInputChange) r11
                    g1.s r3 = g1.EnumC14315s.f133968a
                    r4 = 0
                    r7.f166527c = r4
                    r7.f166526b = r2
                    java.lang.Object r11 = kotlin.C13924m.b(r1, r11, r3, r10)
                    if (r11 != r0) goto L4d
                L4c:
                    return r0
                L4d:
                    java.lang.Boolean r11 = (java.lang.Boolean) r11
                    boolean r11 = r11.booleanValue()
                    if (r11 != 0) goto L62
                    w0.G r11 = r7.f166528d
                    boolean r11 = kotlin.C17768G.c(r11)
                    if (r11 != 0) goto L62
                    kotlin.jvm.functions.Function0<kotlin.Unit> r11 = r7.f166529e
                    r11.invoke()
                L62:
                    kotlin.Unit r11 = kotlin.Unit.f143329a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.C17768G.o.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        o(Function0<Unit> function0) {
            this.f166525b = function0;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(J j10, Continuation<? super Unit> continuation) {
            Object objD = C13931t.d(j10, new a(C17768G.this, this.f166525b, null), continuation);
            return objD == IntrinsicsKt.f() ? objD : Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lw0/p;", "it", "", "a", "(Lw0/p;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: w0.G$p */
    static final class p extends Lambda implements Function1<Selection, Unit> {
        p() {
            super(1);
        }

        public final void a(Selection selection) {
            C17768G.this.f0(selection);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Selection selection) {
            a(selection);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lw0/p;", "newSelection", "", "a", "(Lw0/p;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: w0.G$q */
    static final class q extends Lambda implements Function1<Selection, Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<Selection, Unit> f166532g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        q(Function1<? super Selection, Unit> function1) {
            super(1);
            this.f166532g = function1;
        }

        public final void a(Selection selection) {
            C17768G.this.f0(selection);
            this.f166532g.invoke(selection);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Selection selection) {
            a(selection);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: w0.G$r */
    /* synthetic */ class r extends FunctionReferenceImpl implements Function0<Unit> {
        r(Object obj) {
            super(0, obj, C17768G.class, "toolbarCopy", "toolbarCopy()V", 0);
        }

        public final void a() {
            ((C17768G) this.receiver).l0();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: w0.G$s */
    /* synthetic */ class s extends FunctionReferenceImpl implements Function0<Unit> {
        s(Object obj) {
            super(0, obj, C17768G.class, "selectAll", "selectAll$foundation_release()V", 0);
        }

        public final void a() {
            ((C17768G) this.receiver).R();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f143329a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k0(long position, boolean isStartHandle, InterfaceC17806v adjustment) {
        this.previousSelectionLayout = null;
        n0(position, U0.f.INSTANCE.b(), isStartHandle, adjustment);
    }

    private final Modifier O(Modifier modifier, Function0<Unit> function0) {
        return U.c(modifier, Unit.f143329a, new o(function0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V(U0.f fVar) {
        this.currentDragPosition.setValue(fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W(long j10) {
        this.dragBeginPosition.setValue(U0.f.d(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X(long j10) {
        this.dragTotalDistance.setValue(U0.f.d(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y(EnumC5824n enumC5824n) {
        this.draggingHandle.setValue(enumC5824n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z(U0.f fVar) {
        this.endHandlePosition.setValue(fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h0(U0.f fVar) {
        this.startHandlePosition.setValue(fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m0() {
        /*
            r17 = this;
            r0 = r17
            w0.p r1 = r0.D()
            androidx.compose.ui.layout.LayoutCoordinates r2 = r0.containerLayoutCoordinates
            r3 = 0
            if (r1 == 0) goto L16
            w0.p$a r4 = r1.getStart()
            if (r4 == 0) goto L16
            w0.n r4 = r0.p(r4)
            goto L17
        L16:
            r4 = r3
        L17:
            if (r1 == 0) goto L24
            w0.p$a r5 = r1.getEnd()
            if (r5 == 0) goto L24
            w0.n r5 = r0.p(r5)
            goto L25
        L24:
            r5 = r3
        L25:
            if (r4 == 0) goto L2c
            androidx.compose.ui.layout.LayoutCoordinates r6 = r4.B()
            goto L2d
        L2c:
            r6 = r3
        L2d:
            if (r5 == 0) goto L34
            androidx.compose.ui.layout.LayoutCoordinates r7 = r5.B()
            goto L35
        L34:
            r7 = r3
        L35:
            if (r1 == 0) goto Lab
            if (r2 == 0) goto Lab
            boolean r8 = r2.isAttached()
            if (r8 == 0) goto Lab
            if (r6 != 0) goto L44
            if (r7 != 0) goto L44
            goto Lab
        L44:
            androidx.compose.ui.geometry.Rect r8 = kotlin.C17769H.i(r2)
            r9 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r11 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            if (r6 == 0) goto L7b
            r13 = 1
            long r13 = r4.c(r1, r13)
            long r15 = r13 & r11
            int r4 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r4 != 0) goto L60
            goto L7b
        L60:
            long r13 = r2.J(r6, r13)
            U0.f r4 = U0.f.d(r13)
            long r13 = r4.getPackedValue()
            androidx.compose.foundation.text.n r6 = r0.v()
            androidx.compose.foundation.text.n r15 = androidx.compose.foundation.text.EnumC5824n.f49915b
            if (r6 == r15) goto L7c
            boolean r6 = kotlin.C17769H.d(r8, r13)
            if (r6 == 0) goto L7b
            goto L7c
        L7b:
            r4 = r3
        L7c:
            r0.h0(r4)
            if (r7 == 0) goto La7
            r4 = 0
            long r4 = r5.c(r1, r4)
            long r11 = r11 & r4
            int r1 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r1 != 0) goto L8c
            goto La7
        L8c:
            long r1 = r2.J(r7, r4)
            U0.f r1 = U0.f.d(r1)
            long r4 = r1.getPackedValue()
            androidx.compose.foundation.text.n r2 = r0.v()
            androidx.compose.foundation.text.n r6 = androidx.compose.foundation.text.EnumC5824n.f49916c
            if (r2 == r6) goto La6
            boolean r2 = kotlin.C17769H.d(r8, r4)
            if (r2 == 0) goto La7
        La6:
            r3 = r1
        La7:
            r0.Z(r3)
            return
        Lab:
            r0.h0(r3)
            r0.Z(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C17768G.m0():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long n(LayoutCoordinates layoutCoordinates, long offset) {
        LayoutCoordinates layoutCoordinates2 = this.containerLayoutCoordinates;
        return (layoutCoordinates2 == null || !layoutCoordinates2.isAttached()) ? U0.f.INSTANCE.b() : Q().J(layoutCoordinates, offset);
    }

    public final Modifier A() {
        Modifier modifierC = Modifier.INSTANCE;
        Modifier modifierA = androidx.compose.ui.input.key.b.a(C17809y.k(androidx.compose.foundation.g.b(C5903d.a(A.a(T.a(O(modifierC, new j()), new k()), this.focusRequester), new l()), false, null, 3, null), new m()), new n());
        if (F()) {
            modifierC = C17770I.c(modifierC, this);
        }
        return modifierA.then(modifierC);
    }

    public final Function1<Selection, Unit> B() {
        return this.onSelectionChange;
    }

    public final Selection D() {
        return this._selection.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final U0.f H() {
        return (U0.f) this.startHandlePosition.getValue();
    }

    public final P I(boolean isStartHandle) {
        return new i(isStartHandle, this);
    }

    public final boolean K() {
        Selection selectionB;
        List<InterfaceC17798n> listW = this.selectionRegistrar.w(Q());
        if (listW.isEmpty()) {
            return true;
        }
        int size = listW.size();
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC17798n interfaceC17798n = listW.get(i10);
            AnnotatedString text = interfaceC17798n.getText();
            if (text.length() != 0 && ((selectionB = this.selectionRegistrar.d().b(interfaceC17798n.getSelectableId())) == null || Math.abs(selectionB.getStart().getOffset() - selectionB.getEnd().getOffset()) != text.length())) {
                return false;
            }
        }
        return true;
    }

    public final boolean L() {
        return this._isInTouchMode.getValue().booleanValue();
    }

    public final void P() {
        InterfaceC6470a interfaceC6470a;
        this.selectionRegistrar.v(C5627z.a());
        g0(false);
        if (D() != null) {
            this.onSelectionChange.invoke(null);
            if (!L() || (interfaceC6470a = this.hapticFeedBack) == null) {
                return;
            }
            interfaceC6470a.a(C6471b.INSTANCE.i());
        }
    }

    public final LayoutCoordinates Q() {
        LayoutCoordinates layoutCoordinates = this.containerLayoutCoordinates;
        if (layoutCoordinates == null) {
            C14592e.b("null coordinates");
            throw new KotlinNothingValueException();
        }
        if (!layoutCoordinates.isAttached()) {
            C14592e.a("unattached coordinates");
        }
        return layoutCoordinates;
    }

    public final void R() {
        List<InterfaceC17798n> listW = this.selectionRegistrar.w(Q());
        if (listW.isEmpty()) {
            return;
        }
        O oC = C5627z.c();
        int size = listW.size();
        Selection selection = null;
        Selection selection2 = null;
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC17798n interfaceC17798n = listW.get(i10);
            Selection selectionJ = interfaceC17798n.j();
            if (selectionJ != null) {
                if (selection == null) {
                    selection = selectionJ;
                }
                oC.n(interfaceC17798n.getSelectableId(), selectionJ);
                selection2 = selectionJ;
            }
        }
        if (oC.e()) {
            return;
        }
        if (selection != selection2) {
            Intrinsics.g(selection);
            Selection.AnchorInfo start = selection.getStart();
            Intrinsics.g(selection2);
            selection = new Selection(start, selection2.getEnd(), false);
        }
        this.selectionRegistrar.v(oC);
        this.onSelectionChange.invoke(selection);
        this.previousSelectionLayout = null;
    }

    public final void U(LayoutCoordinates layoutCoordinates) {
        this.containerLayoutCoordinates = layoutCoordinates;
        if (!z() || D() == null) {
            return;
        }
        U0.f fVarD = layoutCoordinates != null ? U0.f.d(LayoutCoordinatesKt.f(layoutCoordinates)) : null;
        if (Intrinsics.e(this.previousPosition, fVarD)) {
            return;
        }
        this.previousPosition = fVarD;
        m0();
        p0();
    }

    public final void a0(InterfaceC6470a interfaceC6470a) {
        this.hapticFeedBack = interfaceC6470a;
    }

    public final void b0(boolean z10) {
        this.hasFocus.setValue(Boolean.valueOf(z10));
    }

    public final void c0(boolean z10) {
        if (this._isInTouchMode.getValue().booleanValue() != z10) {
            this._isInTouchMode.setValue(Boolean.valueOf(z10));
            p0();
        }
    }

    public final void d0(Function1<? super AnnotatedString, Unit> function1) {
        this.onCopyHandler = function1;
    }

    public final void e0(Function1<? super Selection, Unit> function1) {
        this.onSelectionChange = new q(function1);
    }

    public final void f0(Selection selection) {
        this._selection.setValue(selection);
        if (selection != null) {
            m0();
        }
    }

    public final void g0(boolean z10) {
        this.showToolbar = z10;
        p0();
    }

    public final void i0(H1 h12) {
        this.textToolbar = h12;
    }

    public final boolean n0(long position, long previousHandlePosition, boolean isStartHandle, InterfaceC17806v adjustment) {
        Y(isStartHandle ? EnumC5824n.f49915b : EnumC5824n.f49916c);
        V(U0.f.d(position));
        InterfaceC17764C interfaceC17764CE = E(position, previousHandlePosition, isStartHandle);
        if (interfaceC17764CE == null || !interfaceC17764CE.l(this.previousSelectionLayout)) {
            return false;
        }
        Selection selectionA = adjustment.a(interfaceC17764CE);
        if (!Intrinsics.e(selectionA, D())) {
            T(interfaceC17764CE, selectionA);
        }
        this.previousSelectionLayout = interfaceC17764CE;
        return true;
    }

    public final boolean o0(U0.f newPosition, long previousPosition, boolean isStartHandle, InterfaceC17806v adjustment) {
        if (newPosition == null) {
            return false;
        }
        return n0(newPosition.getPackedValue(), previousPosition, isStartHandle, adjustment);
    }

    public final InterfaceC17798n p(Selection.AnchorInfo anchor) {
        return this.selectionRegistrar.m().b(anchor.getSelectableId());
    }

    /* renamed from: q, reason: from getter */
    public final LayoutCoordinates getContainerLayoutCoordinates() {
        return this.containerLayoutCoordinates;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final U0.f s() {
        return (U0.f) this.currentDragPosition.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long t() {
        return ((U0.f) this.dragBeginPosition.getValue()).getPackedValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long u() {
        return ((U0.f) this.dragTotalDistance.getValue()).getPackedValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final EnumC5824n v() {
        return (EnumC5824n) this.draggingHandle.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final U0.f x() {
        return (U0.f) this.endHandlePosition.getValue();
    }

    /* renamed from: y, reason: from getter */
    public final y getFocusRequester() {
        return this.focusRequester;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean z() {
        return ((Boolean) this.hasFocus.getValue()).booleanValue();
    }

    public C17768G(C17773L c17773l) {
        this.selectionRegistrar = c17773l;
        f.Companion companion = U0.f.INSTANCE;
        this.dragBeginPosition = t1.e(U0.f.d(companion.c()), null, 2, null);
        this.dragTotalDistance = t1.e(U0.f.d(companion.c()), null, 2, null);
        this.startHandlePosition = t1.e(null, null, 2, null);
        this.endHandlePosition = t1.e(null, null, 2, null);
        this.draggingHandle = t1.e(null, null, 2, null);
        this.currentDragPosition = t1.e(null, null, 2, null);
        c17773l.p(new a());
        c17773l.u(new b());
        c17773l.t(new c());
        c17773l.r(new d());
        c17773l.s(new e());
        c17773l.q(new f());
        c17773l.o(new g());
    }

    private final InterfaceC17764C E(long position, long previousHandlePosition, boolean isStartHandle) {
        Selection selectionD;
        LayoutCoordinates layoutCoordinatesQ = Q();
        List<InterfaceC17798n> listW = this.selectionRegistrar.w(layoutCoordinatesQ);
        M mA = C5624w.a();
        List<InterfaceC17798n> list = listW;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            mA.n(listW.get(i10).getSelectableId(), i10);
        }
        h hVar = new h(mA);
        if ((previousHandlePosition & 9223372034707292159L) == 9205357640488583168L) {
            selectionD = null;
        } else {
            selectionD = D();
        }
        C17765D c17765d = new C17765D(position, previousHandlePosition, layoutCoordinatesQ, isStartHandle, selectionD, hVar, null);
        int size2 = list.size();
        for (int i11 = 0; i11 < size2; i11++) {
            listW.get(i11).e(c17765d);
        }
        return c17765d.b();
    }

    private final boolean F() {
        if (J() && L() && !N()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean J() {
        if (v() != null) {
            return true;
        }
        return false;
    }

    private final void T(InterfaceC17764C selectionLayout, Selection newSelection) {
        InterfaceC6470a interfaceC6470a;
        if (j0() && (interfaceC6470a = this.hapticFeedBack) != null) {
            interfaceC6470a.a(C6471b.INSTANCE.i());
        }
        this.selectionRegistrar.v(selectionLayout.d(newSelection));
        this.onSelectionChange.invoke(newSelection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l0() {
        o();
        P();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p0() {
        H1 h12;
        r rVar;
        if (z() && (h12 = this.textToolbar) != null) {
            if (this.showToolbar && L()) {
                Rect rectR = r();
                if (rectR != null) {
                    s sVar = null;
                    if (M()) {
                        rVar = new r(this);
                    } else {
                        rVar = null;
                    }
                    if (!K()) {
                        sVar = new s(this);
                    }
                    H1.d(h12, rectR, rVar, null, null, sVar, null, 12, null);
                    return;
                }
                return;
            }
            if (h12.getStatus() == J1.f52049a) {
                h12.b();
            }
        }
    }

    private final Rect r() {
        LayoutCoordinates layoutCoordinates;
        Pair pairA;
        if (D() == null || (layoutCoordinates = this.containerLayoutCoordinates) == null || !layoutCoordinates.isAttached()) {
            return null;
        }
        List<InterfaceC17798n> listW = this.selectionRegistrar.w(Q());
        ArrayList arrayList = new ArrayList(listW.size());
        int size = listW.size();
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC17798n interfaceC17798n = listW.get(i10);
            Selection selectionB = this.selectionRegistrar.d().b(interfaceC17798n.getSelectableId());
            if (selectionB != null) {
                pairA = TuplesKt.a(interfaceC17798n, selectionB);
            } else {
                pairA = null;
            }
            if (pairA != null) {
                arrayList.add(pairA);
            }
        }
        List listE = C17769H.e(arrayList);
        if (listE.isEmpty()) {
            return null;
        }
        Rect rectG = C17769H.g(listE, layoutCoordinates);
        if (Intrinsics.e(rectG, C17769H.f166533a)) {
            return null;
        }
        Rect rectP = C17769H.i(layoutCoordinates).p(rectG);
        if (rectP.l() - rectP.getLeft() < 0.0f || rectP.i() - rectP.getTop() < 0.0f) {
            return null;
        }
        Rect rectT = rectP.t(LayoutCoordinatesKt.e(layoutCoordinates));
        return Rect.h(rectT, 0.0f, 0.0f, 0.0f, rectT.i() + (C17763B.b() * 4), 7, null);
    }

    public final AnnotatedString C() {
        AnnotatedString annotatedStringSubSequence;
        if (D() == null || this.selectionRegistrar.d().e()) {
            return null;
        }
        AnnotatedString.b bVar = new AnnotatedString.b(0, 1, null);
        List<InterfaceC17798n> listW = this.selectionRegistrar.w(Q());
        int size = listW.size();
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC17798n interfaceC17798n = listW.get(i10);
            Selection selectionB = this.selectionRegistrar.d().b(interfaceC17798n.getSelectableId());
            if (selectionB != null) {
                AnnotatedString text = interfaceC17798n.getText();
                if (selectionB.getHandlesCrossed()) {
                    annotatedStringSubSequence = text.subSequence(selectionB.getEnd().getOffset(), selectionB.getStart().getOffset());
                } else {
                    annotatedStringSubSequence = text.subSequence(selectionB.getStart().getOffset(), selectionB.getEnd().getOffset());
                }
                bVar.e(annotatedStringSubSequence);
            }
        }
        return bVar.q();
    }

    public final float G() {
        InterfaceC17798n interfaceC17798nP;
        Selection selectionD = D();
        if (selectionD == null || (interfaceC17798nP = p(selectionD.getStart())) == null) {
            return 0.0f;
        }
        return interfaceC17798nP.b(selectionD.getStart().getOffset());
    }

    public final boolean M() {
        Selection selectionD = D();
        if (selectionD == null || Intrinsics.e(selectionD.getStart(), selectionD.getEnd())) {
            return false;
        }
        if (selectionD.getStart().getSelectableId() == selectionD.getEnd().getSelectableId()) {
            return true;
        }
        List<InterfaceC17798n> listW = this.selectionRegistrar.w(Q());
        int size = listW.size();
        for (int i10 = 0; i10 < size; i10++) {
            Selection selectionB = this.selectionRegistrar.d().b(listW.get(i10).getSelectableId());
            if (selectionB != null && selectionB.getStart().getOffset() != selectionB.getEnd().getOffset()) {
                return true;
            }
        }
        return false;
    }

    public final boolean N() {
        Selection selectionD = D();
        if (selectionD == null) {
            return true;
        }
        return Intrinsics.e(selectionD.getStart(), selectionD.getEnd());
    }

    public final Pair<Selection, AbstractC5626y<Selection>> S(long selectableId, Selection previousSelection) {
        InterfaceC6470a interfaceC6470a;
        Selection selectionJ;
        O oC = C5627z.c();
        List<InterfaceC17798n> listW = this.selectionRegistrar.w(Q());
        int size = listW.size();
        Selection selectionH = null;
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC17798n interfaceC17798n = listW.get(i10);
            if (interfaceC17798n.getSelectableId() == selectableId) {
                selectionJ = interfaceC17798n.j();
            } else {
                selectionJ = null;
            }
            if (selectionJ != null) {
                oC.r(interfaceC17798n.getSelectableId(), selectionJ);
            }
            selectionH = C17769H.h(selectionH, selectionJ);
        }
        if (L() && !Intrinsics.e(selectionH, previousSelection) && (interfaceC6470a = this.hapticFeedBack) != null) {
            interfaceC6470a.a(C6471b.INSTANCE.i());
        }
        return new Pair<>(selectionH, oC);
    }

    public final boolean j0() {
        if (L()) {
            List<InterfaceC17798n> listN = this.selectionRegistrar.n();
            int size = listN.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (listN.get(i10).getText().length() > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void o() {
        Function1<? super AnnotatedString, Unit> function1;
        AnnotatedString annotatedStringC = C();
        if (annotatedStringC != null) {
            if (annotatedStringC.length() <= 0) {
                annotatedStringC = null;
            }
            if (annotatedStringC != null && (function1 = this.onCopyHandler) != null) {
                function1.invoke(annotatedStringC);
            }
        }
    }

    public final float w() {
        InterfaceC17798n interfaceC17798nP;
        Selection selectionD = D();
        if (selectionD == null || (interfaceC17798nP = p(selectionD.getEnd())) == null) {
            return 0.0f;
        }
        return interfaceC17798nP.b(selectionD.getEnd().getOffset());
    }
}
