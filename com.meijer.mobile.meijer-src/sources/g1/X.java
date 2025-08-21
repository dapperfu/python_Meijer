package g1;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputResetException;
import androidx.compose.ui.node.C5957k;
import androidx.compose.ui.platform.Q1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C0;
import mv.C15809k;
import mv.C15819p;
import mv.EnumC15785Q;
import mv.InterfaceC15783O;
import mv.InterfaceC15815n;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001]B=\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0005\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u0016J?\u0010\u001a\u001a\u00020\u00122\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0012\u0010\t\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0005\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u001a\u0010\rJ*\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001f\u0010\u0016J?\u0010&\u001a\u00028\u0000\"\u0004\b\u0000\u0010 2'\u0010%\u001a#\b\u0001\u0012\u0004\u0012\u00020\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000#\u0012\u0006\u0012\u0004\u0018\u00010\u00050!¢\u0006\u0002\b$H\u0096@¢\u0006\u0004\b&\u0010'R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010)R\"\u0010\t\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0005\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R9\u0010/\u001a%\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120#\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010!¢\u0006\u0002\b$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00102\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00106\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00109\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\"\u0010>\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u00030;R\u00020\u00000:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010@\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010)R\"\u0010B\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u00030;R\u00020\u00000:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010=R\u0018\u0010D\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u00108R\u001c\u0010G\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bE\u0010FR$\u0010\u000b\u001a\u00020\n2\u0006\u0010H\u001a\u00020\n8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u0014\u0010P\u001a\u00020M8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0014\u0010R\u001a\u00020M8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010OR\u0014\u0010V\u001a\u00020S8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u001a\u0010Y\u001a\u00020\u001b8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bW\u0010XR\u001a\u0010\\\u001a\u00020Z8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b[\u0010X\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006^"}, d2 = {"Lg1/X;", "Landroidx/compose/ui/Modifier$c;", "Lg1/W;", "Lg1/J;", "LH1/d;", "", "key1", "key2", "", "keys", "Landroidx/compose/ui/input/pointer/PointerInputEventHandler;", "pointerInputEventHandler", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)V", "Lg1/q;", "pointerEvent", "Lg1/s;", "pass", "", "P2", "(Lg1/q;Lg1/s;)V", "u2", "()V", "M", "V1", "S0", "R2", "LH1/r;", "bounds", "s1", "(Lg1/q;Lg1/s;J)V", "v1", "R", "Lkotlin/Function2;", "Lg1/c;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "block", "g0", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "o", "Ljava/lang/Object;", "p", "q", "[Ljava/lang/Object;", "r", "Lkotlin/jvm/functions/Function2;", "_deprecatedPointerInputHandler", "s", "Landroidx/compose/ui/input/pointer/PointerInputEventHandler;", "_pointerInputEventHandler", "Lmv/C0;", "t", "Lmv/C0;", "pointerInputJob", "u", "Lg1/q;", "currentEvent", "LD0/c;", "Lg1/X$a;", "v", "LD0/c;", "pointerHandlers", "w", "pointerHandlersLock", "x", "dispatchingPointerHandlers", "y", "lastPointerEvent", "z", "J", "boundsSize", "value", "Q2", "()Landroidx/compose/ui/input/pointer/PointerInputEventHandler;", "setPointerInputEventHandler", "(Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)V", "", "getDensity", "()F", "density", "F1", "fontScale", "Landroidx/compose/ui/platform/Q1;", "getViewConfiguration", "()Landroidx/compose/ui/platform/Q1;", "viewConfiguration", "c", "()J", "size", "LU0/k;", "A0", "extendedTouchPadding", "a", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class X extends Modifier.c implements W, J, H1.d {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private Object key1;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private Object key2;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private Object[] keys;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private Function2<? super J, ? super Continuation<? super Unit>, ? extends Object> _deprecatedPointerInputHandler;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private PointerInputEventHandler _pointerInputEventHandler;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private C0 pointerInputJob;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private C14314q currentEvent = U.f133886a;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final D0.c<a<?>> pointerHandlers;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final Object pointerHandlersLock;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final D0.c<a<?>> dispatchingPointerHandlers;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private C14314q lastPointerEvent;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private long boundsSize;

    @Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t*\u00020\bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t*\u00020\fH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b*\u00020\fH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\b*\u00020\u0011H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\b*\u00020\tH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u0017*\u00020\u0016H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u0011*\u00020\bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0013J\u0017\u0010\u001b\u001a\u00020\u0011*\u00020\fH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0010J\u0017\u0010\u001c\u001a\u00020\u0016*\u00020\u0017H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\f*\u00020\bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\u001f\u001a\u00020\f*\u00020\u0011H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001eJ\u001a\u0010 \u001a\u00020\f*\u00020\tH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u001d\u0010'\u001a\u00020&2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020&2\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b+\u0010,J\u001d\u0010/\u001a\u00020&2\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0016¢\u0006\u0004\b/\u00100J\u0018\u00101\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0096@¢\u0006\u0004\b1\u00102JI\u00109\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0001\u0010\u001c2\u0006\u00104\u001a\u0002032'\u00108\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010605¢\u0006\u0002\b7H\u0096@¢\u0006\u0004\b9\u0010:JG\u0010;\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u001c2\u0006\u00104\u001a\u0002032'\u00108\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010605¢\u0006\u0002\b7H\u0096@¢\u0006\u0004\b;\u0010:R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001e\u0010A\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010D\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u001a\u0010J\u001a\u00020E8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0014\u0010M\u001a\u00020\u00118\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0014\u0010O\u001a\u00020\u00118\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bN\u0010LR\u0014\u0010R\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u001a\u0010U\u001a\u00020S8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b?\u0010TR\u0014\u0010Y\u001a\u00020V8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010XR\u001a\u0010[\u001a\u00020\u00168VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bZ\u0010T\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\\"}, d2 = {"Lg1/X$a;", "R", "Lg1/c;", "LH1/d;", "Lkotlin/coroutines/Continuation;", "completion", "<init>", "(Lg1/X;Lkotlin/coroutines/Continuation;)V", "LH1/h;", "", "E0", "(F)I", "LH1/v;", "N1", "(J)I", "t", "(J)F", "", "L", "(F)F", "K", "(I)F", "LU0/k;", "LH1/k;", "p", "(J)J", "I1", "N0", "T", "o", "(F)J", "x", "w", "(I)J", "Lg1/q;", "event", "Lg1/s;", "pass", "", "J", "(Lg1/q;Lg1/s;)V", "", "cause", "s", "(Ljava/lang/Throwable;)V", "Lkotlin/Result;", "result", "resumeWith", "(Ljava/lang/Object;)V", "K0", "(Lg1/s;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "timeMillis", "Lkotlin/Function2;", "", "Lkotlin/ExtensionFunctionType;", "block", "i0", "(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "H0", "a", "Lkotlin/coroutines/Continuation;", "Lmv/n;", "c", "Lmv/n;", "pointerAwaiter", "d", "Lg1/s;", "awaitPass", "Lkotlin/coroutines/CoroutineContext;", "e", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "getDensity", "()F", "density", "F1", "fontScale", "a1", "()Lg1/q;", "currentEvent", "LH1/r;", "()J", "size", "Landroidx/compose/ui/platform/Q1;", "getViewConfiguration", "()Landroidx/compose/ui/platform/Q1;", "viewConfiguration", "A0", "extendedTouchPadding", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    private final class a<R> implements InterfaceC14300c, H1.d, Continuation<R> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Continuation<R> completion;

        /* renamed from: b, reason: collision with root package name */
        private final /* synthetic */ X f133902b;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private InterfaceC15815n<? super C14314q> pointerAwaiter;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private EnumC14315s awaitPass = EnumC14315s.f133969b;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final CoroutineContext context = EmptyCoroutineContext.f143553a;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine", f = "SuspendingPointerInputFilter.kt", l = {891}, m = "withTimeout")
        /* renamed from: g1.X$a$a, reason: collision with other inner class name */
        static final class C2115a<T> extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            Object f133907a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f133908b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ a<R> f133909c;

            /* renamed from: d, reason: collision with root package name */
            int f133910d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2115a(a<R> aVar, Continuation<? super C2115a> continuation) {
                super(continuation);
                this.f133909c = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f133908b = obj;
                this.f133910d |= Integer.MIN_VALUE;
                return this.f133909c.H0(0L, null, this);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1", f = "SuspendingPointerInputFilter.kt", l = {883, 884}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f133911a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f133912b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ a<R> f133913c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(long j10, a<R> aVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f133912b = j10;
                this.f133913c = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f133912b, this.f133913c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
            
                if (mv.Z.b(8, r8) == r0) goto L15;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    r8 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r1 = r8.f133911a
                    r2 = 8
                    r4 = 2
                    r5 = 1
                    if (r1 == 0) goto L20
                    if (r1 == r5) goto L1c
                    if (r1 != r4) goto L14
                    kotlin.ResultKt.b(r9)
                    goto L38
                L14:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                L1c:
                    kotlin.ResultKt.b(r9)
                    goto L2f
                L20:
                    kotlin.ResultKt.b(r9)
                    long r6 = r8.f133912b
                    long r6 = r6 - r2
                    r8.f133911a = r5
                    java.lang.Object r9 = mv.Z.b(r6, r8)
                    if (r9 != r0) goto L2f
                    goto L37
                L2f:
                    r8.f133911a = r4
                    java.lang.Object r9 = mv.Z.b(r2, r8)
                    if (r9 != r0) goto L38
                L37:
                    return r0
                L38:
                    g1.X$a<R> r9 = r8.f133913c
                    mv.n r9 = g1.X.a.f(r9)
                    if (r9 == 0) goto L54
                    kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
                    androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r0 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
                    long r1 = r8.f133912b
                    r0.<init>(r1)
                    java.lang.Object r0 = kotlin.ResultKt.a(r0)
                    java.lang.Object r0 = kotlin.Result.b(r0)
                    r9.resumeWith(r0)
                L54:
                    kotlin.Unit r9 = kotlin.Unit.f143329a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: g1.X.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine", f = "SuspendingPointerInputFilter.kt", l = {861}, m = "withTimeoutOrNull")
        static final class c<T> extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f133914a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ a<R> f133915b;

            /* renamed from: c, reason: collision with root package name */
            int f133916c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(a<R> aVar, Continuation<? super c> continuation) {
                super(continuation);
                this.f133915b = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f133914a = obj;
                this.f133916c |= Integer.MIN_VALUE;
                return this.f133915b.i0(0L, null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(Continuation<? super R> continuation) {
            this.completion = continuation;
            this.f133902b = X.this;
        }

        @Override // g1.InterfaceC14300c
        public long A0() {
            return X.this.A0();
        }

        @Override // H1.d
        public int E0(float f10) {
            return this.f133902b.E0(f10);
        }

        @Override // H1.l
        /* renamed from: F1 */
        public float getFontScale() {
            return this.f133902b.getFontScale();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r11v0, types: [long] */
        /* JADX WARN: Type inference failed for: r11v1, types: [mv.C0] */
        /* JADX WARN: Type inference failed for: r11v3, types: [mv.C0] */
        /* JADX WARN: Type inference failed for: r11v7 */
        /* JADX WARN: Type inference failed for: r11v8 */
        @Override // g1.InterfaceC14300c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public <T> java.lang.Object H0(long r11, kotlin.jvm.functions.Function2<? super g1.InterfaceC14300c, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r13, kotlin.coroutines.Continuation<? super T> r14) {
            /*
                r10 = this;
                boolean r0 = r14 instanceof g1.X.a.C2115a
                if (r0 == 0) goto L13
                r0 = r14
                g1.X$a$a r0 = (g1.X.a.C2115a) r0
                int r1 = r0.f133910d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f133910d = r1
                goto L18
            L13:
                g1.X$a$a r0 = new g1.X$a$a
                r0.<init>(r10, r14)
            L18:
                java.lang.Object r14 = r0.f133908b
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r2 = r0.f133910d
                r3 = 1
                if (r2 == 0) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r11 = r0.f133907a
                mv.C0 r11 = (mv.C0) r11
                kotlin.ResultKt.b(r14)     // Catch: java.lang.Throwable -> L2d
                goto L76
            L2d:
                r0 = move-exception
                r12 = r0
                goto L7c
            L30:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L38:
                kotlin.ResultKt.b(r14)
                r4 = 0
                int r14 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r14 > 0) goto L57
                mv.n<? super g1.q> r14 = r10.pointerAwaiter
                if (r14 == 0) goto L57
                kotlin.Result$Companion r2 = kotlin.Result.INSTANCE
                androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r2 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
                r2.<init>(r11)
                java.lang.Object r2 = kotlin.ResultKt.a(r2)
                java.lang.Object r2 = kotlin.Result.b(r2)
                r14.resumeWith(r2)
            L57:
                g1.X r14 = g1.X.this
                mv.O r4 = r14.j2()
                g1.X$a$b r7 = new g1.X$a$b
                r14 = 0
                r7.<init>(r11, r10, r14)
                r8 = 3
                r9 = 0
                r5 = 0
                r6 = 0
                mv.C0 r11 = mv.C15805i.d(r4, r5, r6, r7, r8, r9)
                r0.f133907a = r11     // Catch: java.lang.Throwable -> L2d
                r0.f133910d = r3     // Catch: java.lang.Throwable -> L2d
                java.lang.Object r14 = r13.invoke(r10, r0)     // Catch: java.lang.Throwable -> L2d
                if (r14 != r1) goto L76
                return r1
            L76:
                androidx.compose.ui.input.pointer.CancelTimeoutCancellationException r12 = androidx.compose.ui.input.pointer.CancelTimeoutCancellationException.f51169a
                r11.d(r12)
                return r14
            L7c:
                androidx.compose.ui.input.pointer.CancelTimeoutCancellationException r13 = androidx.compose.ui.input.pointer.CancelTimeoutCancellationException.f51169a
                r11.d(r13)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: g1.X.a.H0(long, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
        }

        @Override // H1.d
        public float I1(float f10) {
            return this.f133902b.I1(f10);
        }

        public final void J(C14314q event, EnumC14315s pass) {
            InterfaceC15815n<? super C14314q> interfaceC15815n;
            if (pass != this.awaitPass || (interfaceC15815n = this.pointerAwaiter) == null) {
                return;
            }
            this.pointerAwaiter = null;
            interfaceC15815n.resumeWith(Result.b(event));
        }

        @Override // H1.d
        public float K(int i10) {
            return this.f133902b.K(i10);
        }

        @Override // g1.InterfaceC14300c
        public Object K0(EnumC14315s enumC14315s, Continuation<? super C14314q> continuation) {
            C15819p c15819p = new C15819p(IntrinsicsKt.c(continuation), 1);
            c15819p.C();
            this.awaitPass = enumC14315s;
            this.pointerAwaiter = c15819p;
            Object objU = c15819p.u();
            if (objU == IntrinsicsKt.f()) {
                DebugProbesKt.c(continuation);
            }
            return objU;
        }

        @Override // H1.d
        public float L(float f10) {
            return this.f133902b.L(f10);
        }

        @Override // H1.d
        public float N0(long j10) {
            return this.f133902b.N0(j10);
        }

        @Override // H1.d
        public int N1(long j10) {
            return this.f133902b.N1(j10);
        }

        @Override // H1.d
        public long T(long j10) {
            return this.f133902b.T(j10);
        }

        @Override // g1.InterfaceC14300c
        public C14314q a1() {
            return X.this.currentEvent;
        }

        @Override // g1.InterfaceC14300c
        public long c() {
            return X.this.boundsSize;
        }

        @Override // kotlin.coroutines.Continuation
        public CoroutineContext getContext() {
            return this.context;
        }

        @Override // H1.d
        public float getDensity() {
            return this.f133902b.getDensity();
        }

        @Override // g1.InterfaceC14300c
        public Q1 getViewConfiguration() {
            return X.this.getViewConfiguration();
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // g1.InterfaceC14300c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public <T> java.lang.Object i0(long r5, kotlin.jvm.functions.Function2<? super g1.InterfaceC14300c, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r7, kotlin.coroutines.Continuation<? super T> r8) {
            /*
                r4 = this;
                boolean r0 = r8 instanceof g1.X.a.c
                if (r0 == 0) goto L13
                r0 = r8
                g1.X$a$c r0 = (g1.X.a.c) r0
                int r1 = r0.f133916c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f133916c = r1
                goto L18
            L13:
                g1.X$a$c r0 = new g1.X$a$c
                r0.<init>(r4, r8)
            L18:
                java.lang.Object r8 = r0.f133914a
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r2 = r0.f133916c
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.ResultKt.b(r8)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3e
                return r8
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                kotlin.ResultKt.b(r8)
                r0.f133916c = r3     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3e
                java.lang.Object r5 = r4.H0(r5, r7, r0)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3e
                if (r5 != r1) goto L3d
                return r1
            L3d:
                return r5
            L3e:
                r5 = 0
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: g1.X.a.i0(long, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
        }

        @Override // H1.l
        public long o(float f10) {
            return this.f133902b.o(f10);
        }

        @Override // H1.d
        public long p(long j10) {
            return this.f133902b.p(j10);
        }

        @Override // kotlin.coroutines.Continuation
        public void resumeWith(Object result) {
            Object obj = X.this.pointerHandlersLock;
            X x10 = X.this;
            synchronized (obj) {
                x10.pointerHandlers.s(this);
                Unit unit = Unit.f143329a;
            }
            this.completion.resumeWith(result);
        }

        public final void s(Throwable cause) {
            InterfaceC15815n<? super C14314q> interfaceC15815n = this.pointerAwaiter;
            if (interfaceC15815n != null) {
                interfaceC15815n.N(cause);
            }
            this.pointerAwaiter = null;
        }

        @Override // H1.l
        public float t(long j10) {
            return this.f133902b.t(j10);
        }

        @Override // H1.d
        public long w(int i10) {
            return this.f133902b.w(i10);
        }

        @Override // H1.d
        public long x(float f10) {
            return this.f133902b.x(f10);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "it", "", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    static final class c extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ a<R> f133917f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(a<R> aVar) {
            super(1);
            this.f133917f = aVar;
        }

        public final void a(Throwable th2) {
            this.f133917f.s(th2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$onPointerEvent$1", f = "SuspendingPointerInputFilter.kt", l = {717, 719}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f133918a;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return X.this.new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
        
            if (r5.invoke(r1, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
        
            if (r5.invoke(r1, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r4.f133918a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L17:
                kotlin.ResultKt.b(r5)
                goto L4b
            L1b:
                kotlin.ResultKt.b(r5)
                g1.X r5 = g1.X.this
                kotlin.jvm.functions.Function2 r5 = g1.X.O2(r5)
                if (r5 == 0) goto L3a
                g1.X r5 = g1.X.this
                kotlin.jvm.functions.Function2 r5 = g1.X.O2(r5)
                kotlin.jvm.internal.Intrinsics.g(r5)
                g1.X r1 = g1.X.this
                r4.f133918a = r3
                java.lang.Object r5 = r5.invoke(r1, r4)
                if (r5 != r0) goto L4b
                goto L4a
            L3a:
                g1.X r5 = g1.X.this
                androidx.compose.ui.input.pointer.PointerInputEventHandler r5 = r5.get_pointerInputEventHandler()
                g1.X r1 = g1.X.this
                r4.f133918a = r2
                java.lang.Object r5 = r5.invoke(r1, r4)
                if (r5 != r0) goto L4b
            L4a:
                return r0
            L4b:
                kotlin.Unit r5 = kotlin.Unit.f143329a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: g1.X.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC14315s.values().length];
            try {
                iArr[EnumC14315s.f133968a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC14315s.f133970c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC14315s.f133969b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void P2(C14314q pointerEvent, EnumC14315s pass) {
        synchronized (this.pointerHandlersLock) {
            D0.c<a<?>> cVar = this.dispatchingPointerHandlers;
            cVar.e(cVar.getSize(), this.pointerHandlers);
        }
        try {
            int i10 = b.$EnumSwitchMapping$0[pass.ordinal()];
            if (i10 == 1 || i10 == 2) {
                D0.c<a<?>> cVar2 = this.dispatchingPointerHandlers;
                a<?>[] aVarArr = cVar2.content;
                int size = cVar2.getSize();
                for (int i11 = 0; i11 < size; i11++) {
                    aVarArr[i11].J(pointerEvent, pass);
                }
            } else if (i10 == 3) {
                D0.c<a<?>> cVar3 = this.dispatchingPointerHandlers;
                int size2 = cVar3.getSize() - 1;
                a<?>[] aVarArr2 = cVar3.content;
                if (size2 < aVarArr2.length) {
                    while (size2 >= 0) {
                        aVarArr2[size2].J(pointerEvent, pass);
                        size2--;
                    }
                }
            }
        } finally {
            this.dispatchingPointerHandlers.k();
        }
    }

    /* renamed from: Q2, reason: from getter */
    public PointerInputEventHandler get_pointerInputEventHandler() {
        return this._pointerInputEventHandler;
    }

    public final void R2(Object key1, Object key2, Object[] keys, PointerInputEventHandler pointerInputEventHandler) {
        boolean z10 = !Intrinsics.e(this.key1, key1);
        this.key1 = key1;
        if (!Intrinsics.e(this.key2, key2)) {
            z10 = true;
        }
        this.key2 = key2;
        Object[] objArr = this.keys;
        if (objArr != null && keys == null) {
            z10 = true;
        }
        if (objArr == null && keys != null) {
            z10 = true;
        }
        if (objArr != null && keys != null && !Arrays.equals(keys, objArr)) {
            z10 = true;
        }
        this.keys = keys;
        if (get_pointerInputEventHandler().getClass() == pointerInputEventHandler.getClass() ? z10 : true) {
            S0();
        }
        this._pointerInputEventHandler = pointerInputEventHandler;
    }

    @Override // g1.W
    public void S0() {
        C0 c02 = this.pointerInputJob;
        if (c02 != null) {
            c02.d(new PointerInputResetException());
            this.pointerInputJob = null;
        }
    }

    /* renamed from: c, reason: from getter */
    public long getBoundsSize() {
        return this.boundsSize;
    }

    @Override // g1.J
    public <R> Object g0(Function2<? super InterfaceC14300c, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation) {
        C15819p c15819p = new C15819p(IntrinsicsKt.c(continuation), 1);
        c15819p.C();
        a aVar = new a(c15819p);
        synchronized (this.pointerHandlersLock) {
            this.pointerHandlers.c(aVar);
            Continuation<Unit> continuationA = ContinuationKt.a(function2, aVar, aVar);
            Result.Companion companion = Result.INSTANCE;
            continuationA.resumeWith(Result.b(Unit.f143329a));
        }
        c15819p.F(new c(aVar));
        Object objU = c15819p.u();
        if (objU == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objU;
    }

    @Override // androidx.compose.ui.node.q0
    public void s1(C14314q pointerEvent, EnumC14315s pass, long bounds) {
        this.boundsSize = bounds;
        if (pass == EnumC14315s.f133968a) {
            this.currentEvent = pointerEvent;
        }
        if (this.pointerInputJob == null) {
            this.pointerInputJob = C15809k.d(j2(), null, EnumC15785Q.f151688d, new d(null), 1, null);
        }
        P2(pointerEvent, pass);
        List<PointerInputChange> listC = pointerEvent.c();
        int size = listC.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z10 = true;
                break;
            } else if (!r.d(listC.get(i10))) {
                break;
            } else {
                i10++;
            }
        }
        if (z10) {
            pointerEvent = null;
        }
        this.lastPointerEvent = pointerEvent;
    }

    @Override // androidx.compose.ui.node.q0
    public void v1() {
        C14314q c14314q = this.lastPointerEvent;
        if (c14314q == null) {
            return;
        }
        List<PointerInputChange> listC = c14314q.c();
        int size = listC.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (listC.get(i10).getPressed()) {
                List<PointerInputChange> listC2 = c14314q.c();
                ArrayList arrayList = new ArrayList(listC2.size());
                int size2 = listC2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    PointerInputChange pointerInputChange = listC2.get(i11);
                    arrayList.add(new PointerInputChange(pointerInputChange.getId(), pointerInputChange.getUptimeMillis(), pointerInputChange.getPosition(), false, pointerInputChange.getPressure(), pointerInputChange.getUptimeMillis(), pointerInputChange.getPosition(), pointerInputChange.getPressed(), pointerInputChange.getPressed(), pointerInputChange.getType(), 0L, 1024, (DefaultConstructorMarker) null));
                }
                C14314q c14314q2 = new C14314q(arrayList);
                this.currentEvent = c14314q2;
                P2(c14314q2, EnumC14315s.f133968a);
                P2(c14314q2, EnumC14315s.f133969b);
                P2(c14314q2, EnumC14315s.f133970c);
                this.lastPointerEvent = null;
                return;
            }
        }
    }

    public X(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        this.key1 = obj;
        this.key2 = obj2;
        this.keys = objArr;
        this._pointerInputEventHandler = pointerInputEventHandler;
        D0.c<a<?>> cVar = new D0.c<>(new a[16], 0);
        this.pointerHandlers = cVar;
        this.pointerHandlersLock = cVar;
        this.dispatchingPointerHandlers = new D0.c<>(new a[16], 0);
        this.boundsSize = H1.r.INSTANCE.a();
    }

    public long A0() {
        long jT = T(getViewConfiguration().e());
        long boundsSize = getBoundsSize();
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (jT >> 32)) - ((int) (boundsSize >> 32))) / 2.0f;
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (jT & 4294967295L)) - ((int) (boundsSize & 4294967295L))) / 2.0f;
        return U0.k.d((Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(fMax2) & 4294967295L));
    }

    @Override // H1.l
    /* renamed from: F1 */
    public float getFontScale() {
        return C5957k.o(this).getDensity().getFontScale();
    }

    @Override // androidx.compose.ui.node.InterfaceC5956j, androidx.compose.ui.node.q0
    public void M() {
        S0();
    }

    @Override // androidx.compose.ui.node.q0
    public void V1() {
        S0();
    }

    @Override // H1.d
    public float getDensity() {
        return C5957k.o(this).getDensity().getDensity();
    }

    @Override // g1.J
    public Q1 getViewConfiguration() {
        return C5957k.o(this).getViewConfiguration();
    }

    @Override // androidx.compose.ui.Modifier.c
    public void u2() {
        S0();
        super.u2();
    }
}
