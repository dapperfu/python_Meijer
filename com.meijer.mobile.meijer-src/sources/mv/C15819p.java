package mv;

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
import mv.InterfaceC15813m;
import rv.AbstractC16947B;
import rv.C16950E;
import rv.C16971h;

@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0011\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u00052\u00020\u0006B\u001d\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0017\u001a\u00020\u00162\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u000fJ\u000f\u0010\u001a\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u000fJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J!\u0010#\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\tH\u0002¢\u0006\u0004\b&\u0010'J\u0088\u0001\u0010\u0001\u001a\u0004\u0018\u00010\u001e\"\u0004\b\u0001\u0010(2\u0006\u0010\"\u001a\u00020)2\u0006\u0010*\u001a\u00028\u00012\u0006\u0010\n\u001a\u00020\t2M\u00101\u001aI\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0013\u0012\u00110/¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u0016\u0018\u00010+2\b\u00102\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b\u0001\u00103Jx\u00105\u001a\u0004\u0018\u000104\"\u0004\b\u0001\u0010(2\u0006\u0010*\u001a\u00028\u00012\b\u00102\u001a\u0004\u0018\u00010\u001e2M\u00101\u001aI\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0013\u0012\u00110/¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u0016\u0018\u00010+H\u0002¢\u0006\u0004\b5\u00106J\u0019\u00108\u001a\u0002072\b\u0010*\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u0016H\u0002¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u0016H\u0016¢\u0006\u0004\b<\u0010;J\u000f\u0010=\u001a\u00020\rH\u0001¢\u0006\u0004\b=\u0010\u000fJ\u0011\u0010>\u001a\u0004\u0018\u00010\u001eH\u0010¢\u0006\u0004\b>\u0010?J!\u0010A\u001a\u00020\u00162\b\u0010@\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0010¢\u0006\u0004\bA\u0010BJ\u0019\u0010C\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\bC\u0010\u0013J\u0017\u0010D\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\bD\u0010EJ\u001f\u0010G\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020F2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\bG\u0010HJp\u0010I\u001a\u00020\u0016\"\u0004\b\u0001\u0010(2K\u00101\u001aG\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0013\u0012\u00110/¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u00160+2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010.\u001a\u00028\u0001¢\u0006\u0004\bI\u0010JJ\u0017\u0010M\u001a\u00020\u00102\u0006\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bM\u0010NJ\u0011\u0010O\u001a\u0004\u0018\u00010\u001eH\u0001¢\u0006\u0004\bO\u0010?J\u000f\u0010P\u001a\u00020\u0016H\u0000¢\u0006\u0004\bP\u0010;J\u001d\u0010S\u001a\u00020\u00162\f\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00000QH\u0016¢\u0006\u0004\bS\u0010!J<\u0010U\u001a\u00020\u00162\u0006\u0010.\u001a\u00028\u00002#\u00101\u001a\u001f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0016\u0018\u00010TH\u0016¢\u0006\u0004\bU\u0010VJp\u0010W\u001a\u00020\u0016\"\b\b\u0001\u0010(*\u00028\u00002\u0006\u0010.\u001a\u00028\u00012M\u00101\u001aI\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0013\u0012\u00110/¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u0016\u0018\u00010+H\u0016¢\u0006\u0004\bW\u0010XJ#\u0010Z\u001a\u00020\u00162\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010Y\u001a\u00020\tH\u0016¢\u0006\u0004\bZ\u0010[J8\u0010]\u001a\u00020\u00162'\u0010\u001f\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0010¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00160Tj\u0002`\\H\u0016¢\u0006\u0004\b]\u0010^J\u0017\u0010_\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020FH\u0000¢\u0006\u0004\b_\u0010`Jv\u0010(\u001a\u00020\u0016\"\u0004\b\u0001\u0010(2\u0006\u0010*\u001a\u00028\u00012\u0006\u0010\n\u001a\u00020\t2O\b\u0002\u00101\u001aI\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0013\u0012\u00110/¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u0016\u0018\u00010+H\u0000¢\u0006\u0004\b(\u0010aJ\u000f\u0010b\u001a\u00020\u0016H\u0000¢\u0006\u0004\bb\u0010;J|\u0010c\u001a\u0004\u0018\u00010\u001e\"\b\b\u0001\u0010(*\u00028\u00002\u0006\u0010.\u001a\u00028\u00012\b\u00102\u001a\u0004\u0018\u00010\u001e2M\u00101\u001aI\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0013\u0012\u00110/¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u0016\u0018\u00010+H\u0016¢\u0006\u0004\bc\u0010dJ\u0019\u0010f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010e\u001a\u00020\u0010H\u0016¢\u0006\u0004\bf\u0010gJ\u0017\u0010i\u001a\u00020\u00162\u0006\u0010h\u001a\u00020\u001eH\u0016¢\u0006\u0004\bi\u0010!J\u001b\u0010k\u001a\u00020\u0016*\u00020j2\u0006\u0010.\u001a\u00028\u0000H\u0016¢\u0006\u0004\bk\u0010lJ\u001f\u0010m\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\"\u001a\u0004\u0018\u00010\u001eH\u0010¢\u0006\u0004\bm\u0010nJ\u001b\u0010o\u001a\u0004\u0018\u00010\u00102\b\u0010\"\u001a\u0004\u0018\u00010\u001eH\u0010¢\u0006\u0004\bo\u0010pJ\u000f\u0010r\u001a\u00020qH\u0016¢\u0006\u0004\br\u0010sJ\u000f\u0010t\u001a\u00020qH\u0014¢\u0006\u0004\bt\u0010sR \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010xR\u001a\u00100\u001a\u00020/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bw\u0010y\u001a\u0004\bz\u0010{R\u0016\u0010}\u001a\u0004\u0018\u00010\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b|\u0010\u001dR\u0014\u0010\u007f\u001a\u00020q8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b~\u0010sR\u0017\u0010\"\u001a\u0004\u0018\u00010\u001e8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010?R\u0016\u0010\u0082\u0001\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010\u000fR\u0016\u0010\u0084\u0001\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010\u000fR\u001f\u0010\u0087\u0001\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\f\u0010\u0088\u0001\u001a\u00020\u001e8\u0002X\u0082\u0004R\u0014\u0010\u0089\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001e8\u0002X\u0082\u0004R\u0014\u0010\u008a\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001e8\u0002X\u0082\u0004¨\u0006\u008b\u0001"}, d2 = {"Lmv/p;", "T", "Lmv/c0;", "Lmv/n;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lmv/h1;", "Lkotlin/coroutines/Continuation;", "delegate", "", "resumeMode", "<init>", "(Lkotlin/coroutines/Continuation;I)V", "", "H", "()Z", "", "cause", "o", "(Ljava/lang/Throwable;)Z", "Lrv/B;", "segment", "", "n", "(Lrv/B;Ljava/lang/Throwable;)V", "Z", "V", "Lmv/h0;", "D", "()Lmv/h0;", "", "handler", "E", "(Ljava/lang/Object;)V", "state", "J", "(Ljava/lang/Object;Ljava/lang/Object;)V", "mode", "r", "(I)V", "R", "Lmv/P0;", "proposedUpdate", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "value", "Lkotlin/coroutines/CoroutineContext;", "context", "onCancellation", "idempotent", "(Lmv/P0;Ljava/lang/Object;ILkotlin/jvm/functions/Function3;Ljava/lang/Object;)Ljava/lang/Object;", "Lrv/E;", "Y", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Lrv/E;", "", "k", "(Ljava/lang/Object;)Ljava/lang/Void;", "q", "()V", "C", "P", "i", "()Ljava/lang/Object;", "takenState", "c", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "N", "L", "(Ljava/lang/Throwable;)V", "Lmv/m;", "l", "(Lmv/m;Ljava/lang/Throwable;)V", "m", "(Lkotlin/jvm/functions/Function3;Ljava/lang/Throwable;Ljava/lang/Object;)V", "Lmv/C0;", "parent", "s", "(Lmv/C0;)Ljava/lang/Throwable;", "u", "O", "Lkotlin/Result;", "result", "resumeWith", "Lkotlin/Function1;", "M", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "U", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "index", "b", "(Lrv/B;I)V", "Lkotlinx/coroutines/CompletionHandler;", "F", "(Lkotlin/jvm/functions/Function1;)V", "G", "(Lmv/m;)V", "(Ljava/lang/Object;ILkotlin/jvm/functions/Function3;)V", "p", "W", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "exception", "I", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "token", "X", "Lmv/K;", "B", "(Lmv/K;Ljava/lang/Object;)V", "g", "(Ljava/lang/Object;)Ljava/lang/Object;", "f", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "", "toString", "()Ljava/lang/String;", "K", "d", "Lkotlin/coroutines/Continuation;", "e", "()Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "t", "parentHandle", "w", "stateDebugRepresentation", "v", "a", "isActive", "A", "isCompleted", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "_decisionAndIndex", "_state", "_parentHandle", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@PublishedApi
@SourceDebugExtension
/* renamed from: mv.p, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C15819p<T> extends AbstractC15794c0<T> implements InterfaceC15815n<T>, CoroutineStackFrame, h1 {

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f151760f = AtomicIntegerFieldUpdater.newUpdater(C15819p.class, "_decisionAndIndex$volatile");

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f151761g = AtomicReferenceFieldUpdater.newUpdater(C15819p.class, Object.class, "_state$volatile");

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f151762h = AtomicReferenceFieldUpdater.newUpdater(C15819p.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Continuation<T> delegate;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext context;

    private final boolean H() {
        if (!C15796d0.c(this.resumeMode)) {
            return false;
        }
        Continuation<T> continuation = this.delegate;
        Intrinsics.h(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C16971h) continuation).o();
    }

    private final void J(Object handler, Object state) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + handler + ", already has " + state).toString());
    }

    public static /* synthetic */ void S(C15819p c15819p, Object obj, int i10, Function3 function3, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i11 & 4) != 0) {
            function3 = null;
        }
        c15819p.R(obj, i10, function3);
    }

    private final <R> Object T(P0 state, R proposedUpdate, int resumeMode, Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation, Object idempotent) {
        if (proposedUpdate instanceof C15771C) {
            return proposedUpdate;
        }
        if ((C15796d0.b(resumeMode) || idempotent != null) && !(onCancellation == null && !(state instanceof InterfaceC15813m) && idempotent == null)) {
            return new CompletedContinuation(proposedUpdate, state instanceof InterfaceC15813m ? (InterfaceC15813m) state : null, onCancellation, idempotent, null, 16, null);
        }
        return proposedUpdate;
    }

    private final Void k(Object proposedUpdate) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + proposedUpdate).toString());
    }

    @Override // mv.InterfaceC15815n
    public void B(AbstractC15779K abstractC15779K, T t10) {
        Continuation<T> continuation = this.delegate;
        C16971h c16971h = continuation instanceof C16971h ? (C16971h) continuation : null;
        S(this, t10, (c16971h != null ? c16971h.dispatcher : null) == abstractC15779K ? 4 : this.resumeMode, null, 4, null);
    }

    @Override // mv.InterfaceC15815n
    public void F(Function1<? super Throwable, Unit> handler) {
        C15823r.c(this, new InterfaceC15813m.a(handler));
    }

    @Override // mv.InterfaceC15815n
    public Object I(Throwable exception) {
        return Y(new C15771C(exception, false, 2, null), null, null);
    }

    protected String K() {
        return "CancellableContinuation";
    }

    @Override // mv.InterfaceC15815n
    public void M(T value, final Function1<? super Throwable, Unit> onCancellation) {
        R(value, this.resumeMode, onCancellation != null ? new Function3() { // from class: mv.o
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return C15819p.Q(onCancellation, (Throwable) obj, obj2, (CoroutineContext) obj3);
            }
        } : null);
    }

    public final void O() {
        Throwable thR;
        Continuation<T> continuation = this.delegate;
        C16971h c16971h = continuation instanceof C16971h ? (C16971h) continuation : null;
        if (c16971h == null || (thR = c16971h.r(this)) == null) {
            return;
        }
        p();
        N(thR);
    }

    @Override // mv.InterfaceC15815n
    public <R extends T> void U(R value, Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation) {
        R(value, this.resumeMode, onCancellation);
    }

    @Override // mv.InterfaceC15815n
    public void X(Object token) {
        r(this.resumeMode);
    }

    @Override // mv.AbstractC15794c0
    public final Continuation<T> e() {
        return this.delegate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mv.AbstractC15794c0
    public <T> T g(Object state) {
        return state instanceof CompletedContinuation ? (T) ((CompletedContinuation) state).result : state;
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
    public CoroutineContext getF143270a() {
        return this.context;
    }

    public String toString() {
        return K() + '(' + C15787T.c(this.delegate) + "){" + w() + "}@" + C15787T.b(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C15819p(Continuation<? super T> continuation, int i10) {
        super(i10);
        this.delegate = continuation;
        this.context = continuation.getF143270a();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C15795d.f151710a;
    }

    private final InterfaceC15804h0 D() {
        C0 c02 = (C0) getF143270a().g(C0.INSTANCE);
        if (c02 != null) {
            InterfaceC15804h0 interfaceC15804h0M = F0.m(c02, false, new C15827t(this), 1, null);
            androidx.concurrent.futures.b.a(f151762h, this, null, interfaceC15804h0M);
            return interfaceC15804h0M;
        }
        return null;
    }

    private final void E(Object handler) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f151761g;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C15795d) {
                if (androidx.concurrent.futures.b.a(f151761g, this, obj, handler)) {
                    return;
                }
            } else if (!(obj instanceof InterfaceC15813m) && !(obj instanceof AbstractC16947B)) {
                if (obj instanceof C15771C) {
                    C15771C c15771c = (C15771C) obj;
                    if (!c15771c.c()) {
                        J(handler, obj);
                    }
                    if (obj instanceof C15825s) {
                        Throwable th2 = null;
                        if (obj == null) {
                            c15771c = null;
                        }
                        if (c15771c != null) {
                            th2 = c15771c.cause;
                        }
                        if (handler instanceof InterfaceC15813m) {
                            l((InterfaceC15813m) handler, th2);
                            return;
                        } else {
                            Intrinsics.h(handler, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                            n((AbstractC16947B) handler, th2);
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
                    if (handler instanceof AbstractC16947B) {
                        return;
                    }
                    Intrinsics.h(handler, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    InterfaceC15813m interfaceC15813m = (InterfaceC15813m) handler;
                    if (completedContinuation.c()) {
                        l(interfaceC15813m, completedContinuation.cancelCause);
                        return;
                    } else {
                        if (androidx.concurrent.futures.b.a(f151761g, this, obj, CompletedContinuation.b(completedContinuation, null, interfaceC15813m, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else {
                    if (handler instanceof AbstractC16947B) {
                        return;
                    }
                    Intrinsics.h(handler, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    if (androidx.concurrent.futures.b.a(f151761g, this, obj, new CompletedContinuation(obj, (InterfaceC15813m) handler, null, null, null, 28, null))) {
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
        return Unit.f143329a;
    }

    private final boolean V() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f151760f;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f151760f.compareAndSet(this, i10, 1073741824 + (536870911 & i10)));
        return true;
    }

    private final <R> C16950E Y(R proposedUpdate, Object idempotent, Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f151761g;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof P0) {
                R r10 = proposedUpdate;
                Object obj2 = idempotent;
                Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> function3 = onCancellation;
                if (androidx.concurrent.futures.b.a(f151761g, this, obj, T((P0) obj, r10, this.resumeMode, function3, obj2))) {
                    q();
                    return C15821q.f151767a;
                }
                proposedUpdate = r10;
                onCancellation = function3;
                idempotent = obj2;
            } else {
                Object obj3 = idempotent;
                if (!(obj instanceof CompletedContinuation) || obj3 == null || ((CompletedContinuation) obj).idempotentResume != obj3) {
                    return null;
                }
                return C15821q.f151767a;
            }
        }
    }

    private final boolean Z() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f151760f;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f151760f.compareAndSet(this, i10, 536870912 + (536870911 & i10)));
        return true;
    }

    private final void n(AbstractC16947B<?> segment, Throwable cause) {
        int i10 = f151760f.get(this) & 536870911;
        if (i10 != 536870911) {
            try {
                segment.s(i10, cause, getF143270a());
                return;
            } catch (Throwable th2) {
                C15781M.a(getF143270a(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
                return;
            }
        }
        throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
    }

    private final boolean o(Throwable cause) {
        if (!H()) {
            return false;
        }
        Continuation<T> continuation = this.delegate;
        Intrinsics.h(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C16971h) continuation).p(cause);
    }

    private final void q() {
        if (!H()) {
            p();
        }
    }

    private final void r(int mode) {
        if (V()) {
            return;
        }
        C15796d0.a(this, mode);
    }

    private final InterfaceC15804h0 t() {
        return (InterfaceC15804h0) f151762h.get(this);
    }

    private final String w() {
        Object objV = v();
        if (objV instanceof P0) {
            return "Active";
        }
        if (objV instanceof C15825s) {
            return "Cancelled";
        }
        return "Completed";
    }

    @Override // mv.InterfaceC15815n
    public boolean A() {
        return !(v() instanceof P0);
    }

    public void C() {
        InterfaceC15804h0 interfaceC15804h0D = D();
        if (interfaceC15804h0D != null && A()) {
            interfaceC15804h0D.dispose();
            f151762h.set(this, O0.f151684a);
        }
    }

    public final void G(InterfaceC15813m handler) {
        E(handler);
    }

    public final void L(Throwable cause) {
        if (o(cause)) {
            return;
        }
        N(cause);
        q();
    }

    @Override // mv.InterfaceC15815n
    public boolean N(Throwable cause) {
        Object obj;
        boolean z10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f151761g;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            z10 = false;
            if (!(obj instanceof P0)) {
                return false;
            }
            if ((obj instanceof InterfaceC15813m) || (obj instanceof AbstractC16947B)) {
                z10 = true;
            }
        } while (!androidx.concurrent.futures.b.a(f151761g, this, obj, new C15825s(this, cause, z10)));
        P0 p02 = (P0) obj;
        if (p02 instanceof InterfaceC15813m) {
            l((InterfaceC15813m) obj, cause);
        } else if (p02 instanceof AbstractC16947B) {
            n((AbstractC16947B) obj, cause);
        }
        q();
        r(this.resumeMode);
        return true;
    }

    @JvmName
    public final boolean P() {
        Object obj = f151761g.get(this);
        if ((obj instanceof CompletedContinuation) && ((CompletedContinuation) obj).idempotentResume != null) {
            p();
            return false;
        }
        f151760f.set(this, 536870911);
        f151761g.set(this, C15795d.f151710a);
        return true;
    }

    public final <R> void R(R proposedUpdate, int resumeMode, Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f151761g;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof P0) {
                R r10 = proposedUpdate;
                int i10 = resumeMode;
                Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> function3 = onCancellation;
                if (androidx.concurrent.futures.b.a(f151761g, this, obj, T((P0) obj, r10, i10, function3, null))) {
                    q();
                    r(i10);
                    return;
                } else {
                    proposedUpdate = r10;
                    resumeMode = i10;
                    onCancellation = function3;
                }
            } else {
                R r11 = proposedUpdate;
                Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> function32 = onCancellation;
                if (obj instanceof C15825s) {
                    C15825s c15825s = (C15825s) obj;
                    if (c15825s.e()) {
                        if (function32 != null) {
                            m(function32, c15825s.cause, r11);
                            return;
                        }
                        return;
                    }
                }
                k(r11);
                throw new KotlinNothingValueException();
            }
        }
    }

    @Override // mv.InterfaceC15815n
    public <R extends T> Object W(R value, Object idempotent, Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation) {
        return Y(value, idempotent, onCancellation);
    }

    @Override // mv.InterfaceC15815n
    public boolean a() {
        return v() instanceof P0;
    }

    @Override // mv.h1
    public void b(AbstractC16947B<?> segment, int index) {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f151760f;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if ((i10 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, ((i10 >> 29) << 29) + index));
        E(segment);
    }

    @Override // mv.AbstractC15794c0
    public void c(Object takenState, Throwable cause) {
        Throwable th2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f151761g;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof P0)) {
                if (!(obj instanceof C15771C)) {
                    if (obj instanceof CompletedContinuation) {
                        CompletedContinuation completedContinuation = (CompletedContinuation) obj;
                        if (!completedContinuation.c()) {
                            Throwable th3 = cause;
                            th2 = th3;
                            if (androidx.concurrent.futures.b.a(f151761g, this, obj, CompletedContinuation.b(completedContinuation, null, null, null, null, th3, 15, null))) {
                                completedContinuation.d(this, th2);
                                return;
                            }
                        } else {
                            throw new IllegalStateException("Must be called at most once");
                        }
                    } else {
                        th2 = cause;
                        if (androidx.concurrent.futures.b.a(f151761g, this, obj, new CompletedContinuation(obj, null, null, null, th2, 14, null))) {
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

    @Override // mv.AbstractC15794c0
    public Throwable f(Object state) {
        Throwable thF = super.f(state);
        if (thF != null) {
            return thF;
        }
        return null;
    }

    @Override // mv.AbstractC15794c0
    public Object i() {
        return v();
    }

    public final void l(InterfaceC15813m handler, Throwable cause) {
        try {
            handler.c(cause);
        } catch (Throwable th2) {
            C15781M.a(getF143270a(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> void m(Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation, Throwable cause, R value) {
        try {
            onCancellation.invoke(cause, value, getF143270a());
        } catch (Throwable th2) {
            C15781M.a(getF143270a(), new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void p() {
        InterfaceC15804h0 interfaceC15804h0T = t();
        if (interfaceC15804h0T == null) {
            return;
        }
        interfaceC15804h0T.dispose();
        f151762h.set(this, O0.f151684a);
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object result) {
        S(this, C15772D.c(result, this), this.resumeMode, null, 4, null);
    }

    public Throwable s(C0 parent) {
        return parent.D();
    }

    @PublishedApi
    public final Object u() {
        C0 c02;
        boolean zH = H();
        if (Z()) {
            if (t() == null) {
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
        Object objV = v();
        if (!(objV instanceof C15771C)) {
            if (C15796d0.b(this.resumeMode) && (c02 = (C0) getF143270a().g(C0.INSTANCE)) != null && !c02.a()) {
                CancellationException cancellationExceptionD = c02.D();
                c(objV, cancellationExceptionD);
                throw cancellationExceptionD;
            }
            return g(objV);
        }
        throw ((C15771C) objV).cause;
    }

    public final Object v() {
        return f151761g.get(this);
    }
}
