package qv;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CompletionHandlerException;
import qv.InterfaceC16652m;
import vv.AbstractC17628B;
import vv.C17631E;
import vv.C17652h;

@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0011\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u00052\u00020\u0006B\u001d\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0017\u001a\u00020\u00162\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u000fJ\u000f\u0010\u001a\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u000fJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J!\u0010#\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\tH\u0002¢\u0006\u0004\b&\u0010'J\u0088\u0001\u00103\u001a\u0004\u0018\u00010\u001e\"\u0004\b\u0001\u0010(2\u0006\u0010\"\u001a\u00020)2\u0006\u0010*\u001a\u00028\u00012\u0006\u0010\n\u001a\u00020\t2M\u00101\u001aI\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0013\u0012\u00110/¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u0016\u0018\u00010+2\b\u00102\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b3\u00104Jx\u00106\u001a\u0004\u0018\u000105\"\u0004\b\u0001\u0010(2\u0006\u0010*\u001a\u00028\u00012\b\u00102\u001a\u0004\u0018\u00010\u001e2M\u00101\u001aI\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0013\u0012\u00110/¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u0016\u0018\u00010+H\u0002¢\u0006\u0004\b6\u00107J\u0019\u00109\u001a\u0002082\b\u0010*\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0016H\u0002¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u0016H\u0016¢\u0006\u0004\b=\u0010<J\u000f\u0010>\u001a\u00020\rH\u0001¢\u0006\u0004\b>\u0010\u000fJ\u0011\u0010?\u001a\u0004\u0018\u00010\u001eH\u0010¢\u0006\u0004\b?\u0010@J!\u0010B\u001a\u00020\u00162\b\u0010A\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0010¢\u0006\u0004\bB\u0010CJ\u0019\u0010D\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\bD\u0010\u0013J\u0017\u0010E\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\bE\u0010FJ\u001f\u0010H\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020G2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\bH\u0010IJp\u0010J\u001a\u00020\u0016\"\u0004\b\u0001\u0010(2K\u00101\u001aG\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0013\u0012\u00110/¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u00160+2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010.\u001a\u00028\u0001¢\u0006\u0004\bJ\u0010KJ\u0017\u0010N\u001a\u00020\u00102\u0006\u0010M\u001a\u00020LH\u0016¢\u0006\u0004\bN\u0010OJ\u0011\u0010P\u001a\u0004\u0018\u00010\u001eH\u0001¢\u0006\u0004\bP\u0010@J\u000f\u0010Q\u001a\u00020\u0016H\u0000¢\u0006\u0004\bQ\u0010<J\u001d\u0010T\u001a\u00020\u00162\f\u0010S\u001a\b\u0012\u0004\u0012\u00028\u00000RH\u0016¢\u0006\u0004\bT\u0010!J<\u0010V\u001a\u00020\u00162\u0006\u0010.\u001a\u00028\u00002#\u00101\u001a\u001f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0016\u0018\u00010UH\u0016¢\u0006\u0004\bV\u0010WJp\u0010X\u001a\u00020\u0016\"\b\b\u0001\u0010(*\u00028\u00002\u0006\u0010.\u001a\u00028\u00012M\u00101\u001aI\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0013\u0012\u00110/¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u0016\u0018\u00010+H\u0016¢\u0006\u0004\bX\u0010YJ#\u0010[\u001a\u00020\u00162\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010Z\u001a\u00020\tH\u0016¢\u0006\u0004\b[\u0010\\J8\u0010^\u001a\u00020\u00162'\u0010\u001f\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0010¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00160Uj\u0002`]H\u0016¢\u0006\u0004\b^\u0010_J\u0017\u0010`\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020GH\u0000¢\u0006\u0004\b`\u0010aJv\u0010b\u001a\u00020\u0016\"\u0004\b\u0001\u0010(2\u0006\u0010*\u001a\u00028\u00012\u0006\u0010\n\u001a\u00020\t2O\b\u0002\u00101\u001aI\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0013\u0012\u00110/¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u0016\u0018\u00010+H\u0000¢\u0006\u0004\bb\u0010cJ\u000f\u0010d\u001a\u00020\u0016H\u0000¢\u0006\u0004\bd\u0010<J|\u0010e\u001a\u0004\u0018\u00010\u001e\"\b\b\u0001\u0010(*\u00028\u00002\u0006\u0010.\u001a\u00028\u00012\b\u00102\u001a\u0004\u0018\u00010\u001e2M\u00101\u001aI\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0013\u0012\u00110/¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u0016\u0018\u00010+H\u0016¢\u0006\u0004\be\u0010fJ\u0019\u0010h\u001a\u0004\u0018\u00010\u001e2\u0006\u0010g\u001a\u00020\u0010H\u0016¢\u0006\u0004\bh\u0010iJ\u0017\u0010k\u001a\u00020\u00162\u0006\u0010j\u001a\u00020\u001eH\u0016¢\u0006\u0004\bk\u0010!J\u001b\u0010(\u001a\u00020\u0016*\u00020l2\u0006\u0010.\u001a\u00028\u0000H\u0016¢\u0006\u0004\b(\u0010mJ\u001f\u0010n\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\"\u001a\u0004\u0018\u00010\u001eH\u0010¢\u0006\u0004\bn\u0010oJ\u001b\u0010p\u001a\u0004\u0018\u00010\u00102\b\u0010\"\u001a\u0004\u0018\u00010\u001eH\u0010¢\u0006\u0004\bp\u0010qJ\u000f\u0010s\u001a\u00020rH\u0016¢\u0006\u0004\bs\u0010tJ\u000f\u0010u\u001a\u00020rH\u0014¢\u0006\u0004\bu\u0010tR \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bx\u0010yR\u001a\u00100\u001a\u00020/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bx\u0010z\u001a\u0004\b{\u0010|R\u0016\u0010~\u001a\u0004\u0018\u00010\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b}\u0010\u001dR\u0015\u0010\u0080\u0001\u001a\u00020r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u007f\u0010tR\u0017\u0010\"\u001a\u0004\u0018\u00010\u001e8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010@R\u0016\u0010\u0083\u0001\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010\u000fR\u0016\u0010\u0085\u0001\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0084\u0001\u0010\u000fR\u001f\u0010\u0088\u0001\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\f\u0010\u0089\u0001\u001a\u00020\u001e8\u0002X\u0082\u0004R\u0014\u0010\u008a\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001e8\u0002X\u0082\u0004R\u0014\u0010\u008b\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001e8\u0002X\u0082\u0004¨\u0006\u008c\u0001"}, d2 = {"Lqv/p;", "T", "Lqv/c0;", "Lqv/n;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lqv/h1;", "Lkotlin/coroutines/Continuation;", "delegate", "", "resumeMode", "<init>", "(Lkotlin/coroutines/Continuation;I)V", "", "H", "()Z", "", "cause", "p", "(Ljava/lang/Throwable;)Z", "Lvv/B;", "segment", "", "o", "(Lvv/B;Ljava/lang/Throwable;)V", "a0", "Y", "Lqv/h0;", "D", "()Lqv/h0;", "", "handler", "E", "(Ljava/lang/Object;)V", "state", "J", "(Ljava/lang/Object;Ljava/lang/Object;)V", "mode", "s", "(I)V", "R", "Lqv/P0;", "proposedUpdate", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "value", "Lkotlin/coroutines/CoroutineContext;", "context", "onCancellation", "idempotent", "V", "(Lqv/P0;Ljava/lang/Object;ILkotlin/jvm/functions/Function3;Ljava/lang/Object;)Ljava/lang/Object;", "Lvv/E;", "Z", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Lvv/E;", "", "l", "(Ljava/lang/Object;)Ljava/lang/Void;", "r", "()V", "C", "P", "j", "()Ljava/lang/Object;", "takenState", "b", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "N", "L", "(Ljava/lang/Throwable;)V", "Lqv/m;", "m", "(Lqv/m;Ljava/lang/Throwable;)V", "n", "(Lkotlin/jvm/functions/Function3;Ljava/lang/Throwable;Ljava/lang/Object;)V", "Lqv/C0;", "parent", "t", "(Lqv/C0;)Ljava/lang/Throwable;", "v", "O", "Lkotlin/Result;", "result", "resumeWith", "Lkotlin/Function1;", "M", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "U", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "index", "f", "(Lvv/B;I)V", "Lkotlinx/coroutines/CompletionHandler;", "F", "(Lkotlin/jvm/functions/Function1;)V", "G", "(Lqv/m;)V", "S", "(Ljava/lang/Object;ILkotlin/jvm/functions/Function3;)V", "q", "W", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "exception", "I", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "token", "X", "Lqv/K;", "(Lqv/K;Ljava/lang/Object;)V", "h", "(Ljava/lang/Object;)Ljava/lang/Object;", "g", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "", "toString", "()Ljava/lang/String;", "K", "d", "Lkotlin/coroutines/Continuation;", "e", "()Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "u", "parentHandle", "x", "stateDebugRepresentation", "w", "a", "isActive", "A", "isCompleted", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "_decisionAndIndex", "_state", "_parentHandle", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@PublishedApi
@SourceDebugExtension
/* renamed from: qv.p, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C16658p<T> extends AbstractC16633c0<T> implements InterfaceC16654n<T>, CoroutineStackFrame, h1 {

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f157686f = AtomicIntegerFieldUpdater.newUpdater(C16658p.class, "_decisionAndIndex$volatile");

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f157687g = AtomicReferenceFieldUpdater.newUpdater(C16658p.class, Object.class, "_state$volatile");

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f157688h = AtomicReferenceFieldUpdater.newUpdater(C16658p.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Continuation<T> delegate;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext context;

    private final boolean H() {
        if (!C16635d0.c(this.resumeMode)) {
            return false;
        }
        Continuation<T> continuation = this.delegate;
        Intrinsics.h(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C17652h) continuation).p();
    }

    private final void J(Object handler, Object state) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + handler + ", already has " + state).toString());
    }

    public static /* synthetic */ void T(C16658p c16658p, Object obj, int i10, Function3 function3, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i11 & 4) != 0) {
            function3 = null;
        }
        c16658p.S(obj, i10, function3);
    }

    private final <R> Object V(P0 state, R proposedUpdate, int resumeMode, Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation, Object idempotent) {
        if (proposedUpdate instanceof C16610C) {
            return proposedUpdate;
        }
        if ((C16635d0.b(resumeMode) || idempotent != null) && !(onCancellation == null && !(state instanceof InterfaceC16652m) && idempotent == null)) {
            return new CompletedContinuation(proposedUpdate, state instanceof InterfaceC16652m ? (InterfaceC16652m) state : null, onCancellation, idempotent, null, 16, null);
        }
        return proposedUpdate;
    }

    private final Void l(Object proposedUpdate) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + proposedUpdate).toString());
    }

    @Override // qv.InterfaceC16654n
    public void F(Function1<? super Throwable, Unit> handler) {
        C16662r.c(this, new InterfaceC16652m.a(handler));
    }

    @Override // qv.InterfaceC16654n
    public Object I(Throwable exception) {
        return Z(new C16610C(exception, false, 2, null), null, null);
    }

    protected String K() {
        return "CancellableContinuation";
    }

    @Override // qv.InterfaceC16654n
    public void M(T value, final Function1<? super Throwable, Unit> onCancellation) {
        S(value, this.resumeMode, onCancellation != null ? new Function3() { // from class: qv.o
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return C16658p.Q(onCancellation, (Throwable) obj, obj2, (CoroutineContext) obj3);
            }
        } : null);
    }

    public final void O() {
        Throwable thS;
        Continuation<T> continuation = this.delegate;
        C17652h c17652h = continuation instanceof C17652h ? (C17652h) continuation : null;
        if (c17652h == null || (thS = c17652h.s(this)) == null) {
            return;
        }
        q();
        N(thS);
    }

    @Override // qv.InterfaceC16654n
    public void R(AbstractC16618K abstractC16618K, T t10) {
        Continuation<T> continuation = this.delegate;
        C17652h c17652h = continuation instanceof C17652h ? (C17652h) continuation : null;
        T(this, t10, (c17652h != null ? c17652h.dispatcher : null) == abstractC16618K ? 4 : this.resumeMode, null, 4, null);
    }

    @Override // qv.InterfaceC16654n
    public <R extends T> void U(R value, Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation) {
        S(value, this.resumeMode, onCancellation);
    }

    @Override // qv.InterfaceC16654n
    public void X(Object token) {
        s(this.resumeMode);
    }

    @Override // qv.AbstractC16633c0
    public final Continuation<T> e() {
        return this.delegate;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.delegate;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    /* renamed from: getContext, reason: from getter */
    public CoroutineContext getF142363a() {
        return this.context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qv.AbstractC16633c0
    public <T> T h(Object state) {
        return state instanceof CompletedContinuation ? (T) ((CompletedContinuation) state).result : state;
    }

    public String toString() {
        return K() + '(' + C16626T.c(this.delegate) + "){" + x() + "}@" + C16626T.b(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C16658p(Continuation<? super T> continuation, int i10) {
        super(i10);
        this.delegate = continuation;
        this.context = continuation.getF142363a();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C16634d.f157636a;
    }

    private final InterfaceC16643h0 D() {
        C0 c02 = (C0) getF142363a().g(C0.INSTANCE);
        if (c02 != null) {
            InterfaceC16643h0 interfaceC16643h0M = F0.m(c02, false, new C16666t(this), 1, null);
            androidx.concurrent.futures.b.a(f157688h, this, null, interfaceC16643h0M);
            return interfaceC16643h0M;
        }
        return null;
    }

    private final void E(Object handler) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f157687g;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C16634d) {
                if (androidx.concurrent.futures.b.a(f157687g, this, obj, handler)) {
                    return;
                }
            } else if (!(obj instanceof InterfaceC16652m) && !(obj instanceof AbstractC17628B)) {
                if (obj instanceof C16610C) {
                    C16610C c16610c = (C16610C) obj;
                    if (!c16610c.c()) {
                        J(handler, obj);
                    }
                    if (obj instanceof C16664s) {
                        Throwable th2 = null;
                        if (obj == null) {
                            c16610c = null;
                        }
                        if (c16610c != null) {
                            th2 = c16610c.cause;
                        }
                        if (handler instanceof InterfaceC16652m) {
                            m((InterfaceC16652m) handler, th2);
                            return;
                        } else {
                            Intrinsics.h(handler, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                            o((AbstractC17628B) handler, th2);
                            return;
                        }
                    }
                    return;
                }
                if (obj instanceof CompletedContinuation) {
                    CompletedContinuation completedContinuation = (CompletedContinuation) obj;
                    if (completedContinuation.cancelHandler != null) {
                        J(handler, obj);
                    }
                    if (handler instanceof AbstractC17628B) {
                        return;
                    }
                    Intrinsics.h(handler, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    InterfaceC16652m interfaceC16652m = (InterfaceC16652m) handler;
                    if (completedContinuation.c()) {
                        m(interfaceC16652m, completedContinuation.cancelCause);
                        return;
                    } else {
                        if (androidx.concurrent.futures.b.a(f157687g, this, obj, CompletedContinuation.b(completedContinuation, null, interfaceC16652m, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else {
                    if (handler instanceof AbstractC17628B) {
                        return;
                    }
                    Intrinsics.h(handler, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    if (androidx.concurrent.futures.b.a(f157687g, this, obj, new CompletedContinuation(obj, (InterfaceC16652m) handler, null, null, null, 28, null))) {
                        return;
                    }
                }
            } else {
                J(handler, obj);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q(Function1 function1, Throwable th2, Object obj, CoroutineContext coroutineContext) {
        function1.invoke(th2);
        return Unit.f142422a;
    }

    private final boolean Y() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f157686f;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f157686f.compareAndSet(this, i10, 1073741824 + (536870911 & i10)));
        return true;
    }

    private final <R> C17631E Z(R proposedUpdate, Object idempotent, Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f157687g;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof P0) {
                R r10 = proposedUpdate;
                Object obj2 = idempotent;
                Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> function3 = onCancellation;
                if (androidx.concurrent.futures.b.a(f157687g, this, obj, V((P0) obj, r10, this.resumeMode, function3, obj2))) {
                    r();
                    return C16660q.f157693a;
                }
                proposedUpdate = r10;
                onCancellation = function3;
                idempotent = obj2;
            } else {
                Object obj3 = idempotent;
                if (!(obj instanceof CompletedContinuation) || obj3 == null || ((CompletedContinuation) obj).idempotentResume != obj3) {
                    return null;
                }
                return C16660q.f157693a;
            }
        }
    }

    private final boolean a0() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f157686f;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f157686f.compareAndSet(this, i10, 536870912 + (536870911 & i10)));
        return true;
    }

    private final void o(AbstractC17628B<?> segment, Throwable cause) {
        int i10 = f157686f.get(this) & 536870911;
        if (i10 != 536870911) {
            try {
                segment.s(i10, cause, getF142363a());
                return;
            } catch (Throwable th2) {
                C16620M.a(getF142363a(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
                return;
            }
        }
        throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
    }

    private final boolean p(Throwable cause) {
        if (!H()) {
            return false;
        }
        Continuation<T> continuation = this.delegate;
        Intrinsics.h(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C17652h) continuation).q(cause);
    }

    private final void r() {
        if (!H()) {
            q();
        }
    }

    private final void s(int mode) {
        if (Y()) {
            return;
        }
        C16635d0.a(this, mode);
    }

    private final InterfaceC16643h0 u() {
        return (InterfaceC16643h0) f157688h.get(this);
    }

    private final String x() {
        Object objW = w();
        if (objW instanceof P0) {
            return "Active";
        }
        if (objW instanceof C16664s) {
            return "Cancelled";
        }
        return "Completed";
    }

    @Override // qv.InterfaceC16654n
    public boolean A() {
        return !(w() instanceof P0);
    }

    public void C() {
        InterfaceC16643h0 interfaceC16643h0D = D();
        if (interfaceC16643h0D != null && A()) {
            interfaceC16643h0D.dispose();
            f157688h.set(this, O0.f157610a);
        }
    }

    public final void G(InterfaceC16652m handler) {
        E(handler);
    }

    public final void L(Throwable cause) {
        if (p(cause)) {
            return;
        }
        N(cause);
        r();
    }

    @Override // qv.InterfaceC16654n
    public boolean N(Throwable cause) {
        Object obj;
        boolean z10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f157687g;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            z10 = false;
            if (!(obj instanceof P0)) {
                return false;
            }
            if ((obj instanceof InterfaceC16652m) || (obj instanceof AbstractC17628B)) {
                z10 = true;
            }
        } while (!androidx.concurrent.futures.b.a(f157687g, this, obj, new C16664s(this, cause, z10)));
        P0 p02 = (P0) obj;
        if (p02 instanceof InterfaceC16652m) {
            m((InterfaceC16652m) obj, cause);
        } else if (p02 instanceof AbstractC17628B) {
            o((AbstractC17628B) obj, cause);
        }
        r();
        s(this.resumeMode);
        return true;
    }

    @JvmName
    public final boolean P() {
        Object obj = f157687g.get(this);
        if ((obj instanceof CompletedContinuation) && ((CompletedContinuation) obj).idempotentResume != null) {
            q();
            return false;
        }
        f157686f.set(this, 536870911);
        f157687g.set(this, C16634d.f157636a);
        return true;
    }

    public final <R> void S(R proposedUpdate, int resumeMode, Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f157687g;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof P0) {
                R r10 = proposedUpdate;
                int i10 = resumeMode;
                Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> function3 = onCancellation;
                if (androidx.concurrent.futures.b.a(f157687g, this, obj, V((P0) obj, r10, i10, function3, null))) {
                    r();
                    s(i10);
                    return;
                } else {
                    proposedUpdate = r10;
                    resumeMode = i10;
                    onCancellation = function3;
                }
            } else {
                R r11 = proposedUpdate;
                Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> function32 = onCancellation;
                if (obj instanceof C16664s) {
                    C16664s c16664s = (C16664s) obj;
                    if (c16664s.e()) {
                        if (function32 != null) {
                            n(function32, c16664s.cause, r11);
                            return;
                        }
                        return;
                    }
                }
                l(r11);
                throw new KotlinNothingValueException();
            }
        }
    }

    @Override // qv.InterfaceC16654n
    public <R extends T> Object W(R value, Object idempotent, Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation) {
        return Z(value, idempotent, onCancellation);
    }

    @Override // qv.InterfaceC16654n
    public boolean a() {
        return w() instanceof P0;
    }

    @Override // qv.AbstractC16633c0
    public void b(Object takenState, Throwable cause) {
        Throwable th2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f157687g;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof P0)) {
                if (!(obj instanceof C16610C)) {
                    if (obj instanceof CompletedContinuation) {
                        CompletedContinuation completedContinuation = (CompletedContinuation) obj;
                        if (!completedContinuation.c()) {
                            Throwable th3 = cause;
                            th2 = th3;
                            if (androidx.concurrent.futures.b.a(f157687g, this, obj, CompletedContinuation.b(completedContinuation, null, null, null, null, th3, 15, null))) {
                                completedContinuation.d(this, th2);
                                return;
                            }
                        } else {
                            throw new IllegalStateException("Must be called at most once");
                        }
                    } else {
                        th2 = cause;
                        if (androidx.concurrent.futures.b.a(f157687g, this, obj, new CompletedContinuation(obj, null, null, null, th2, 14, null))) {
                            return;
                        }
                    }
                    cause = th2;
                } else {
                    return;
                }
            } else {
                throw new IllegalStateException("Not completed");
            }
        }
    }

    @Override // qv.h1
    public void f(AbstractC17628B<?> segment, int index) {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f157686f;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if ((i10 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, ((i10 >> 29) << 29) + index));
        E(segment);
    }

    @Override // qv.AbstractC16633c0
    public Throwable g(Object state) {
        Throwable thG = super.g(state);
        if (thG != null) {
            return thG;
        }
        return null;
    }

    @Override // qv.AbstractC16633c0
    public Object j() {
        return w();
    }

    public final void m(InterfaceC16652m handler, Throwable cause) {
        try {
            handler.c(cause);
        } catch (Throwable th2) {
            C16620M.a(getF142363a(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> void n(Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation, Throwable cause, R value) {
        try {
            onCancellation.invoke(cause, value, getF142363a());
        } catch (Throwable th2) {
            C16620M.a(getF142363a(), new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void q() {
        InterfaceC16643h0 interfaceC16643h0U = u();
        if (interfaceC16643h0U == null) {
            return;
        }
        interfaceC16643h0U.dispose();
        f157688h.set(this, O0.f157610a);
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object result) {
        T(this, C16611D.c(result, this), this.resumeMode, null, 4, null);
    }

    public Throwable t(C0 parent) {
        return parent.z();
    }

    @PublishedApi
    public final Object v() {
        C0 c02;
        boolean zH = H();
        if (a0()) {
            if (u() == null) {
                D();
            }
            if (zH) {
                O();
            }
            return IntrinsicsKt.f();
        }
        if (zH) {
            O();
        }
        Object objW = w();
        if (!(objW instanceof C16610C)) {
            if (C16635d0.b(this.resumeMode) && (c02 = (C0) getF142363a().g(C0.INSTANCE)) != null && !c02.a()) {
                CancellationException cancellationExceptionZ = c02.z();
                b(objW, cancellationExceptionZ);
                throw cancellationExceptionZ;
            }
            return h(objW);
        }
        throw ((C16610C) objW).cause;
    }

    public final Object w() {
        return f157687g.get(this);
    }
}
