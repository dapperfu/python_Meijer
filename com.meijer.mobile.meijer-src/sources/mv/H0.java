package mv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import mv.C0;
import rv.C16978o;

@Deprecated
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\f\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0006°\u0001±\u0001\u009a\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001b\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u000fH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\"\u0010#J\u001d\u0010$\u001a\u00020\u0014*\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b$\u0010!J\u0019\u0010&\u001a\u00020%2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020(H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020+H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0004H\u0002¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b0\u00101J\u001b\u00102\u001a\u0004\u0018\u00010\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b2\u00103J\u0019\u00104\u001a\u00020\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b4\u00105J\u001b\u00106\u001a\u0004\u0018\u00010\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b6\u00103J\u0019\u00107\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\t\u001a\u00020\u0017H\u0002¢\u0006\u0004\b7\u00108J\u001f\u00109\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\b9\u0010:J%\u0010;\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b;\u0010<J#\u0010=\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u00172\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b=\u0010>J*\u0010A\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010@\u001a\u00020?2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0082\u0010¢\u0006\u0004\bA\u0010BJ)\u0010D\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010C\u001a\u00020?2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\bD\u0010EJ\u0015\u0010G\u001a\u0004\u0018\u00010?*\u00020FH\u0002¢\u0006\u0004\bG\u0010HJ\u0019\u0010J\u001a\u00020I2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\bJ\u0010KJ\u0012\u0010L\u001a\u0004\u0018\u00010\nH\u0082@¢\u0006\u0004\bL\u00101J\u0019\u0010N\u001a\u00020\u00142\b\u0010M\u001a\u0004\u0018\u00010\u0001H\u0004¢\u0006\u0004\bN\u0010OJ\r\u0010P\u001a\u00020\u0004¢\u0006\u0004\bP\u0010/J\u000f\u0010Q\u001a\u00020\u0014H\u0014¢\u0006\u0004\bQ\u0010RJ\u0011\u0010U\u001a\u00060Sj\u0002`T¢\u0006\u0004\bU\u0010VJ#\u0010X\u001a\u00060Sj\u0002`T*\u00020\u000f2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010IH\u0004¢\u0006\u0004\bX\u0010YJ6\u0010`\u001a\u00020_2'\u0010^\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b[\u0012\b\b\\\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00140Zj\u0002`]¢\u0006\u0004\b`\u0010aJF\u0010d\u001a\u00020_2\u0006\u0010b\u001a\u00020\u00042\u0006\u0010c\u001a\u00020\u00042'\u0010^\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b[\u0012\b\b\\\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00140Zj\u0002`]¢\u0006\u0004\bd\u0010eJ\u001f\u0010g\u001a\u00020_2\u0006\u0010c\u001a\u00020\u00042\u0006\u0010f\u001a\u00020+H\u0000¢\u0006\u0004\bg\u0010hJ\u0010\u0010i\u001a\u00020\u0014H\u0086@¢\u0006\u0004\bi\u00101J\u0017\u0010j\u001a\u00020\u00142\u0006\u0010f\u001a\u00020+H\u0000¢\u0006\u0004\bj\u0010-J\u001f\u0010k\u001a\u00020\u00142\u000e\u0010\u001f\u001a\n\u0018\u00010Sj\u0004\u0018\u0001`TH\u0016¢\u0006\u0004\bk\u0010lJ\u000f\u0010m\u001a\u00020IH\u0014¢\u0006\u0004\bm\u0010nJ\u0017\u0010o\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u000fH\u0016¢\u0006\u0004\bo\u0010pJ\u0015\u0010r\u001a\u00020\u00142\u0006\u0010q\u001a\u00020\u0003¢\u0006\u0004\br\u0010sJ\u0017\u0010t\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u000fH\u0016¢\u0006\u0004\bt\u0010#J\u0017\u0010u\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\bu\u0010#J\u0019\u0010v\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0004\bv\u0010wJ\u0013\u0010x\u001a\u00060Sj\u0002`TH\u0016¢\u0006\u0004\bx\u0010VJ\u0019\u0010y\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0004\by\u0010wJ\u001b\u0010z\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0004\bz\u00103J\u0015\u0010|\u001a\u00020{2\u0006\u0010@\u001a\u00020\u0002¢\u0006\u0004\b|\u0010}J\u0017\u0010\u007f\u001a\u00020\u00142\u0006\u0010~\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\u007f\u0010pJ\u001b\u0010\u0080\u0001\u001a\u00020\u00142\b\u0010\u001f\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0005\b\u0080\u0001\u0010pJ\u0019\u0010\u0081\u0001\u001a\u00020\u00042\u0006\u0010~\u001a\u00020\u000fH\u0014¢\u0006\u0005\b\u0081\u0001\u0010#J\u001c\u0010\u0082\u0001\u001a\u00020\u00142\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u001c\u0010\u0084\u0001\u001a\u00020\u00142\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0006\b\u0084\u0001\u0010\u0083\u0001J\u0011\u0010\u0085\u0001\u001a\u00020IH\u0016¢\u0006\u0005\b\u0085\u0001\u0010nJ\u0011\u0010\u0086\u0001\u001a\u00020IH\u0007¢\u0006\u0005\b\u0086\u0001\u0010nJ\u0011\u0010\u0087\u0001\u001a\u00020IH\u0010¢\u0006\u0005\b\u0087\u0001\u0010nJ\u0014\u0010\u0088\u0001\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u0014\u0010\u008a\u0001\u001a\u0004\u0018\u00010\nH\u0084@¢\u0006\u0005\b\u008a\u0001\u00101R\u001e\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u000f*\u0004\u0018\u00010\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u008b\u0001\u00105R\u0019\u0010\u0090\u0001\u001a\u0007\u0012\u0002\b\u00030\u008d\u00018F¢\u0006\b\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R.\u0010\u0096\u0001\u001a\u0004\u0018\u00010{2\t\u0010\u0091\u0001\u001a\u0004\u0018\u00010{8@@@X\u0080\u000e¢\u0006\u0010\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0018\u0010M\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0099\u0001\u0010\u0089\u0001R\u0016\u0010\u009b\u0001\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u009a\u0001\u0010/R\u0013\u0010\u009d\u0001\u001a\u00020\u00048F¢\u0006\u0007\u001a\u0005\b\u009c\u0001\u0010/R\u0013\u0010\u009e\u0001\u001a\u00020\u00048F¢\u0006\u0007\u001a\u0005\b\u009e\u0001\u0010/R\u0019\u0010¡\u0001\u001a\u0004\u0018\u00010\u000f8DX\u0084\u0004¢\u0006\b\u001a\u0006\b\u009f\u0001\u0010 \u0001R\u0016\u0010£\u0001\u001a\u00020\u00048DX\u0084\u0004¢\u0006\u0007\u001a\u0005\b¢\u0001\u0010/R\u0016\u0010¥\u0001\u001a\u00020\u00048PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b¤\u0001\u0010/R\u001b\u0010©\u0001\u001a\t\u0012\u0004\u0012\u00020\u00010¦\u00018F¢\u0006\b\u001a\u0006\b§\u0001\u0010¨\u0001R\u0016\u0010«\u0001\u001a\u00020\u00048TX\u0094\u0004¢\u0006\u0007\u001a\u0005\bª\u0001\u0010/R\u0016\u0010\u00ad\u0001\u001a\u00020\u00048PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b¬\u0001\u0010/R\u0014\u0010®\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\n8\u0002X\u0082\u0004R\u0014\u0010¯\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010{0\n8\u0002X\u0082\u0004¨\u0006²\u0001"}, d2 = {"Lmv/H0;", "Lmv/C0;", "Lmv/w;", "Lmv/Q0;", "", "active", "<init>", "(Z)V", "Lmv/H0$c;", "state", "", "proposedUpdate", "e0", "(Lmv/H0$c;Ljava/lang/Object;)Ljava/lang/Object;", "", "", "exceptions", "k0", "(Lmv/H0$c;Ljava/util/List;)Ljava/lang/Throwable;", "rootCause", "", "x", "(Ljava/lang/Throwable;Ljava/util/List;)V", "Lmv/x0;", "update", "a1", "(Lmv/x0;Ljava/lang/Object;)Z", "a0", "(Lmv/x0;Ljava/lang/Object;)V", "Lmv/M0;", "list", "cause", "M0", "(Lmv/M0;Ljava/lang/Throwable;)V", "S", "(Ljava/lang/Throwable;)Z", "N0", "", "V0", "(Ljava/lang/Object;)I", "Lmv/k0;", "R0", "(Lmv/k0;)V", "Lmv/G0;", "S0", "(Lmv/G0;)V", "F0", "()Z", "G0", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Q", "(Ljava/lang/Object;)Ljava/lang/Object;", "d0", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "H0", "q0", "(Lmv/x0;)Lmv/M0;", "b1", "(Lmv/x0;Ljava/lang/Throwable;)Z", "c1", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "d1", "(Lmv/x0;Ljava/lang/Object;)Ljava/lang/Object;", "Lmv/v;", "child", "e1", "(Lmv/H0$c;Lmv/v;Ljava/lang/Object;)Z", "lastChild", "c0", "(Lmv/H0$c;Lmv/v;Ljava/lang/Object;)V", "Lrv/o;", "L0", "(Lrv/o;)Lmv/v;", "", "W0", "(Ljava/lang/Object;)Ljava/lang/String;", "E", "parent", "B0", "(Lmv/C0;)V", "start", "Q0", "()V", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "D", "()Ljava/util/concurrent/CancellationException;", "message", "X0", "(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lmv/h0;", "R", "(Lkotlin/jvm/functions/Function1;)Lmv/h0;", "onCancelling", "invokeImmediately", "z", "(ZZLkotlin/jvm/functions/Function1;)Lmv/h0;", "node", "C0", "(ZLmv/G0;)Lmv/h0;", "o0", "T0", "d", "(Ljava/util/concurrent/CancellationException;)V", "V", "()Ljava/lang/String;", "P", "(Ljava/lang/Throwable;)V", "parentJob", "K", "(Lmv/Q0;)V", "Z", "G", "L", "(Ljava/lang/Object;)Z", "j0", "I0", "J0", "Lmv/u;", "u", "(Lmv/w;)Lmv/u;", "exception", "A0", "O0", "z0", "P0", "(Ljava/lang/Object;)V", "y", "toString", "Z0", "K0", "f0", "()Ljava/lang/Object;", "C", "i0", "exceptionOrNull", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "key", "value", "u0", "()Lmv/u;", "U0", "(Lmv/u;)V", "parentHandle", "t0", "()Lmv/C0;", "v0", "a", "isActive", "A", "isCompleted", "isCancelled", "g0", "()Ljava/lang/Throwable;", "completionCause", "h0", "completionCauseHandled", "p0", "onCancelComplete", "Lkotlin/sequences/Sequence;", "p", "()Lkotlin/sequences/Sequence;", "children", "D0", "isScopedCoroutine", "l0", "handlesException", "_state", "_parentHandle", "c", "b", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public class H0 implements C0, InterfaceC15833w, Q0 {

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f151653a = AtomicReferenceFieldUpdater.newUpdater(H0.class, Object.class, "_state$volatile");

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f151654b = AtomicReferenceFieldUpdater.newUpdater(H0.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lmv/H0$a;", "T", "Lmv/p;", "Lkotlin/coroutines/Continuation;", "delegate", "Lmv/H0;", "job", "<init>", "(Lkotlin/coroutines/Continuation;Lmv/H0;)V", "Lmv/C0;", "parent", "", "s", "(Lmv/C0;)Ljava/lang/Throwable;", "", "K", "()Ljava/lang/String;", "i", "Lmv/H0;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    private static final class a<T> extends C15819p<T> {

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final H0 job;

        public a(Continuation<? super T> continuation, H0 h02) {
            super(continuation, 1);
            this.job = h02;
        }

        @Override // mv.C15819p
        protected String K() {
            return "AwaitContinuation";
        }

        @Override // mv.C15819p
        public Throwable s(C0 parent) {
            Throwable thF;
            Object objV0 = this.job.v0();
            return (!(objV0 instanceof c) || (thF = ((c) objV0).f()) == null) ? objV0 instanceof C15771C ? ((C15771C) objV0).cause : parent.D() : thF;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lmv/H0$b;", "Lmv/G0;", "Lmv/H0;", "parent", "Lmv/H0$c;", "state", "Lmv/v;", "child", "", "proposedUpdate", "<init>", "(Lmv/H0;Lmv/H0$c;Lmv/v;Ljava/lang/Object;)V", "", "cause", "", "w", "(Ljava/lang/Throwable;)V", "e", "Lmv/H0;", "f", "Lmv/H0$c;", "g", "Lmv/v;", "h", "Ljava/lang/Object;", "", "v", "()Z", "onCancelling", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class b extends G0 {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final H0 parent;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final c state;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final C15831v child;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final Object proposedUpdate;

        @Override // mv.G0
        public boolean v() {
            return false;
        }

        @Override // mv.G0
        public void w(Throwable cause) {
            this.parent.c0(this.state, this.child, this.proposedUpdate);
        }

        public b(H0 h02, c cVar, C15831v c15831v, Object obj) {
            this.parent = h02;
            this.state = cVar;
            this.child = c15831v;
            this.proposedUpdate = obj;
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001c\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\b0\fj\b\u0012\u0004\u0012\u00020\b`\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR(\u0010$\u001a\u0004\u0018\u00010\u00012\b\u0010\u001f\u001a\u0004\u0018\u00010\u00018B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R(\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010\u0017R\u0011\u0010-\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b,\u0010&R\u0011\u0010/\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b.\u0010&R\u0014\u00100\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010&R\u000b\u00101\u001a\u00020\u00018\u0002X\u0082\u0004R\u0013\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00018\u0002X\u0082\u0004R\u0013\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¨\u00064"}, d2 = {"Lmv/H0$c;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "Lmv/x0;", "Lmv/M0;", "list", "", "isCompleting", "", "rootCause", "<init>", "(Lmv/M0;ZLjava/lang/Throwable;)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "d", "()Ljava/util/ArrayList;", "proposedException", "", "m", "(Ljava/lang/Throwable;)Ljava/util/List;", "exception", "", "b", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "a", "Lmv/M0;", "c", "()Lmv/M0;", "value", "e", "()Ljava/lang/Object;", "o", "(Ljava/lang/Object;)V", "exceptionsHolder", "k", "()Z", "n", "(Z)V", "f", "()Ljava/lang/Throwable;", "p", "l", "isSealed", "j", "isCancelling", "isActive", "_isCompleting", "_rootCause", "_exceptionsHolder", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    private static final class c implements InterfaceC15836x0 {

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f151660b = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting$volatile");

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f151661c = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause$volatile");

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f151662d = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder$volatile");
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile;
        private volatile /* synthetic */ Object _rootCause$volatile;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final M0 list;

        private final ArrayList<Throwable> d() {
            return new ArrayList<>(4);
        }

        @Override // mv.InterfaceC15836x0
        /* renamed from: c, reason: from getter */
        public M0 getList() {
            return this.list;
        }

        public String toString() {
            return "Finishing[cancelling=" + j() + ", completing=" + k() + ", rootCause=" + f() + ", exceptions=" + e() + ", list=" + getList() + ']';
        }

        public c(M0 m02, boolean z10, Throwable th2) {
            this.list = m02;
            this._isCompleting$volatile = z10 ? 1 : 0;
            this._rootCause$volatile = th2;
        }

        private final Object e() {
            return f151662d.get(this);
        }

        private final void o(Object obj) {
            f151662d.set(this, obj);
        }

        @Override // mv.InterfaceC15836x0
        /* renamed from: a */
        public boolean getIsActive() {
            if (f() == null) {
                return true;
            }
            return false;
        }

        public final void b(Throwable exception) {
            Throwable thF = f();
            if (thF == null) {
                p(exception);
                return;
            }
            if (exception != thF) {
                Object objE = e();
                if (objE == null) {
                    o(exception);
                    return;
                }
                if (objE instanceof Throwable) {
                    if (exception == objE) {
                        return;
                    }
                    ArrayList<Throwable> arrayListD = d();
                    arrayListD.add(objE);
                    arrayListD.add(exception);
                    o(arrayListD);
                    return;
                }
                if (objE instanceof ArrayList) {
                    ((ArrayList) objE).add(exception);
                    return;
                }
                throw new IllegalStateException(("State is " + objE).toString());
            }
        }

        public final Throwable f() {
            return (Throwable) f151661c.get(this);
        }

        public final boolean j() {
            if (f() != null) {
                return true;
            }
            return false;
        }

        public final boolean k() {
            if (f151660b.get(this) == 1) {
                return true;
            }
            return false;
        }

        public final boolean l() {
            if (e() == I0.f151673e) {
                return true;
            }
            return false;
        }

        public final List<Throwable> m(Throwable proposedException) {
            ArrayList<Throwable> arrayListD;
            Object objE = e();
            if (objE == null) {
                arrayListD = d();
            } else if (objE instanceof Throwable) {
                ArrayList<Throwable> arrayListD2 = d();
                arrayListD2.add(objE);
                arrayListD = arrayListD2;
            } else if (objE instanceof ArrayList) {
                arrayListD = (ArrayList) objE;
            } else {
                throw new IllegalStateException(("State is " + objE).toString());
            }
            Throwable thF = f();
            if (thF != null) {
                arrayListD.add(0, thF);
            }
            if (proposedException != null && !Intrinsics.e(proposedException, thF)) {
                arrayListD.add(proposedException);
            }
            o(I0.f151673e);
            return arrayListD;
        }

        public final void n(boolean z10) {
            f151660b.set(this, z10 ? 1 : 0);
        }

        public final void p(Throwable th2) {
            f151661c.set(this, th2);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/sequences/SequenceScope;", "Lmv/C0;", "", "<anonymous>", "(Lkotlin/sequences/SequenceScope;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", l = {1003, 1005}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class d extends RestrictedSuspendLambda implements Function2<SequenceScope<? super C0>, Continuation<? super Unit>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f151664b;

        /* renamed from: c, reason: collision with root package name */
        Object f151665c;

        /* renamed from: d, reason: collision with root package name */
        int f151666d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f151667e;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = H0.this.new d(continuation);
            dVar.f151667e = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SequenceScope<? super C0> sequenceScope, Continuation<? super Unit> continuation) {
            return ((d) create(sequenceScope, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
        
            if (r6.c(r1, r5) == r0) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x007e, code lost:
        
            if (r4.c(r6, r5) == r0) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
        
            return r0;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x006b -> B:27:0x0081). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007e -> B:27:0x0081). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r5.f151666d
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2a
                if (r1 == r3) goto L26
                if (r1 != r2) goto L1e
                java.lang.Object r1 = r5.f151665c
                rv.o r1 = (rv.C16978o) r1
                java.lang.Object r3 = r5.f151664b
                rv.n r3 = (rv.C16977n) r3
                java.lang.Object r4 = r5.f151667e
                kotlin.sequences.SequenceScope r4 = (kotlin.sequences.SequenceScope) r4
                kotlin.ResultKt.b(r6)
                goto L81
            L1e:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L26:
                kotlin.ResultKt.b(r6)
                goto L86
            L2a:
                kotlin.ResultKt.b(r6)
                java.lang.Object r6 = r5.f151667e
                kotlin.sequences.SequenceScope r6 = (kotlin.sequences.SequenceScope) r6
                mv.H0 r1 = mv.H0.this
                java.lang.Object r1 = r1.v0()
                boolean r4 = r1 instanceof mv.C15831v
                if (r4 == 0) goto L48
                mv.v r1 = (mv.C15831v) r1
                mv.w r1 = r1.childJob
                r5.f151666d = r3
                java.lang.Object r6 = r6.c(r1, r5)
                if (r6 != r0) goto L86
                goto L80
            L48:
                boolean r3 = r1 instanceof mv.InterfaceC15836x0
                if (r3 == 0) goto L86
                mv.x0 r1 = (mv.InterfaceC15836x0) r1
                mv.M0 r1 = r1.getList()
                if (r1 == 0) goto L86
                java.lang.Object r3 = r1.k()
                java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
                kotlin.jvm.internal.Intrinsics.h(r3, r4)
                rv.o r3 = (rv.C16978o) r3
                r4 = r3
                r3 = r1
                r1 = r4
                r4 = r6
            L63:
                boolean r6 = kotlin.jvm.internal.Intrinsics.e(r1, r3)
                if (r6 != 0) goto L86
                boolean r6 = r1 instanceof mv.C15831v
                if (r6 == 0) goto L81
                r6 = r1
                mv.v r6 = (mv.C15831v) r6
                mv.w r6 = r6.childJob
                r5.f151667e = r4
                r5.f151664b = r3
                r5.f151665c = r1
                r5.f151666d = r2
                java.lang.Object r6 = r4.c(r6, r5)
                if (r6 != r0) goto L81
            L80:
                return r0
            L81:
                rv.o r1 = r1.l()
                goto L63
            L86:
                kotlin.Unit r6 = kotlin.Unit.f143329a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: mv.H0.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private final Object H0(Object cause) throws Throwable {
        Throwable thD0 = null;
        while (true) {
            Object objV0 = v0();
            if (objV0 instanceof c) {
                synchronized (objV0) {
                    if (((c) objV0).l()) {
                        return I0.f151672d;
                    }
                    boolean zJ = ((c) objV0).j();
                    if (cause != null || !zJ) {
                        if (thD0 == null) {
                            thD0 = d0(cause);
                        }
                        ((c) objV0).b(thD0);
                    }
                    Throwable thF = zJ ? null : ((c) objV0).f();
                    if (thF != null) {
                        M0(((c) objV0).getList(), thF);
                    }
                    return I0.f151669a;
                }
            }
            if (!(objV0 instanceof InterfaceC15836x0)) {
                return I0.f151672d;
            }
            if (thD0 == null) {
                thD0 = d0(cause);
            }
            InterfaceC15836x0 interfaceC15836x0 = (InterfaceC15836x0) objV0;
            if (!interfaceC15836x0.getIsActive()) {
                Object objC1 = c1(objV0, new C15771C(thD0, false, 2, null));
                if (objC1 == I0.f151669a) {
                    throw new IllegalStateException(("Cannot happen in " + objV0).toString());
                }
                if (objC1 != I0.f151671c) {
                    return objC1;
                }
            } else if (b1(interfaceC15836x0, thD0)) {
                return I0.f151669a;
            }
        }
    }

    private final void N0(M0 m02, Throwable th2) throws Throwable {
        m02.g(1);
        Object objK = m02.k();
        Intrinsics.h(objK, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        CompletionHandlerException completionHandlerException = null;
        for (C16978o c16978oL = (C16978o) objK; !Intrinsics.e(c16978oL, m02); c16978oL = c16978oL.l()) {
            if (c16978oL instanceof G0) {
                try {
                    ((G0) c16978oL).w(th2);
                } catch (Throwable th3) {
                    if (completionHandlerException != null) {
                        ExceptionsKt.a(completionHandlerException, th3);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + c16978oL + " for " + this, th3);
                        Unit unit = Unit.f143329a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            A0(completionHandlerException);
        }
    }

    public void A0(Throwable exception) throws Throwable {
        throw exception;
    }

    protected boolean D0() {
        return false;
    }

    protected void O0(Throwable cause) {
    }

    protected void P0(Object state) {
    }

    protected void Q0() {
    }

    /* renamed from: l0 */
    public boolean getHandlesException() {
        return true;
    }

    public boolean p0() {
        return false;
    }

    protected void y(Object state) {
    }

    protected boolean z0(Throwable exception) {
        return false;
    }

    private final Object E(Continuation<Object> continuation) {
        a aVar = new a(IntrinsicsKt.c(continuation), this);
        aVar.C();
        C15823r.a(aVar, F0.m(this, false, new R0(aVar), 1, null));
        Object objU = aVar.u();
        if (objU == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objU;
    }

    private final Object G0(Continuation<? super Unit> continuation) {
        C15819p c15819p = new C15819p(IntrinsicsKt.c(continuation), 1);
        c15819p.C();
        C15823r.a(c15819p, F0.m(this, false, new S0(c15819p), 1, null));
        Object objU = c15819p.u();
        if (objU == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objU == IntrinsicsKt.f() ? objU : Unit.f143329a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [mv.w0] */
    private final void R0(C15810k0 state) {
        M0 m02 = new M0();
        if (!state.getIsActive()) {
            m02 = new C15834w0(m02);
        }
        androidx.concurrent.futures.b.a(f151653a, this, state, m02);
    }

    private final void S0(G0 state) {
        state.f(new M0());
        androidx.concurrent.futures.b.a(f151653a, this, state, state.l());
    }

    private final int V0(Object state) {
        if (state instanceof C15810k0) {
            if (((C15810k0) state).getIsActive()) {
                return 0;
            }
            if (!androidx.concurrent.futures.b.a(f151653a, this, state, I0.f151675g)) {
                return -1;
            }
            Q0();
            return 1;
        }
        if (!(state instanceof C15834w0)) {
            return 0;
        }
        if (!androidx.concurrent.futures.b.a(f151653a, this, state, ((C15834w0) state).getList())) {
            return -1;
        }
        Q0();
        return 1;
    }

    private final String W0(Object state) {
        if (!(state instanceof c)) {
            return state instanceof InterfaceC15836x0 ? ((InterfaceC15836x0) state).getIsActive() ? "Active" : "New" : state instanceof C15771C ? "Cancelled" : "Completed";
        }
        c cVar = (c) state;
        return cVar.j() ? "Cancelling" : cVar.k() ? "Completing" : "Active";
    }

    public static /* synthetic */ CancellationException Y0(H0 h02, Throwable th2, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i10 & 1) != 0) {
            str = null;
        }
        return h02.X0(th2, str);
    }

    private final Object c1(Object state, Object proposedUpdate) {
        return !(state instanceof InterfaceC15836x0) ? I0.f151669a : ((!(state instanceof C15810k0) && !(state instanceof G0)) || (state instanceof C15831v) || (proposedUpdate instanceof C15771C)) ? d1((InterfaceC15836x0) state, proposedUpdate) : a1((InterfaceC15836x0) state, proposedUpdate) ? proposedUpdate : I0.f151671c;
    }

    private final Throwable d0(Object cause) {
        if (cause == null ? true : cause instanceof Throwable) {
            Throwable th2 = (Throwable) cause;
            return th2 == null ? new JobCancellationException(V(), null, this) : th2;
        }
        Intrinsics.h(cause, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((Q0) cause).j0();
    }

    private final Object e0(c state, Object proposedUpdate) throws Throwable {
        boolean zJ;
        Throwable thK0;
        C15771C c15771c = proposedUpdate instanceof C15771C ? (C15771C) proposedUpdate : null;
        Throwable th2 = c15771c != null ? c15771c.cause : null;
        synchronized (state) {
            zJ = state.j();
            List<Throwable> listM = state.m(th2);
            thK0 = k0(state, listM);
            if (thK0 != null) {
                x(thK0, listM);
            }
        }
        if (thK0 != null && thK0 != th2) {
            proposedUpdate = new C15771C(thK0, false, 2, null);
        }
        if (thK0 != null && (S(thK0) || z0(thK0))) {
            Intrinsics.h(proposedUpdate, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((C15771C) proposedUpdate).c();
        }
        if (!zJ) {
            O0(thK0);
        }
        P0(proposedUpdate);
        androidx.concurrent.futures.b.a(f151653a, this, state, I0.g(proposedUpdate));
        a0(state, proposedUpdate);
        return proposedUpdate;
    }

    private final boolean e1(c state, C15831v child, Object proposedUpdate) {
        while (E0.l(child.childJob, false, new b(this, state, child, proposedUpdate)) == O0.f151684a) {
            child = L0(child);
            if (child == null) {
                return false;
            }
        }
        return true;
    }

    private final Throwable i0(Object obj) {
        C15771C c15771c = obj instanceof C15771C ? (C15771C) obj : null;
        if (c15771c != null) {
            return c15771c.cause;
        }
        return null;
    }

    protected final void B0(C0 parent) {
        if (parent == null) {
            U0(O0.f151684a);
            return;
        }
        parent.start();
        InterfaceC15829u interfaceC15829uU = parent.u(this);
        U0(interfaceC15829uU);
        if (A()) {
            interfaceC15829uU.dispose();
            U0(O0.f151684a);
        }
    }

    @Override // mv.C0
    public final InterfaceC15804h0 R(Function1<? super Throwable, Unit> handler) {
        return C0(true, new B0(handler));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String V() {
        return "Job was cancelled";
    }

    protected final CancellationException X0(Throwable th2, String str) {
        CancellationException jobCancellationException = th2 instanceof CancellationException ? (CancellationException) th2 : null;
        if (jobCancellationException == null) {
            if (str == null) {
                str = V();
            }
            jobCancellationException = new JobCancellationException(str, th2, this);
        }
        return jobCancellationException;
    }

    public boolean Z(Throwable cause) {
        if (cause instanceof CancellationException) {
            return true;
        }
        return L(cause) && getHandlesException();
    }

    public final String Z0() {
        return K0() + '{' + W0(v0()) + '}';
    }

    @Override // mv.C0
    public void d(CancellationException cause) throws Throwable {
        if (cause == null) {
            cause = new JobCancellationException(V(), null, this);
        }
        P(cause);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final CoroutineContext.Key<?> getKey() {
        return C0.INSTANCE;
    }

    @Override // mv.C0
    public final Sequence<C0> p() {
        return SequencesKt.b(new d(null));
    }

    public String toString() {
        return Z0() + '@' + C15787T.b(this);
    }

    @Override // mv.C0
    public final InterfaceC15829u u(InterfaceC15833w child) {
        C15831v c15831v = new C15831v(child);
        c15831v.x(this);
        while (true) {
            Object objV0 = v0();
            if (objV0 instanceof C15810k0) {
                C15810k0 c15810k0 = (C15810k0) objV0;
                if (!c15810k0.getIsActive()) {
                    R0(c15810k0);
                } else if (androidx.concurrent.futures.b.a(f151653a, this, objV0, c15831v)) {
                    return c15831v;
                }
            } else {
                if (!(objV0 instanceof InterfaceC15836x0)) {
                    Object objV02 = v0();
                    C15771C c15771c = objV02 instanceof C15771C ? (C15771C) objV02 : null;
                    c15831v.w(c15771c != null ? c15771c.cause : null);
                    return O0.f151684a;
                }
                M0 list = ((InterfaceC15836x0) objV0).getList();
                if (list != null) {
                    if (!list.d(c15831v, 7)) {
                        boolean zD = list.d(c15831v, 3);
                        Object objV03 = v0();
                        if (objV03 instanceof c) {
                            thF = ((c) objV03).f();
                        } else {
                            C15771C c15771c2 = objV03 instanceof C15771C ? (C15771C) objV03 : null;
                            if (c15771c2 != null) {
                                thF = c15771c2.cause;
                            }
                        }
                        c15831v.w(thF);
                        if (!zD) {
                            return O0.f151684a;
                        }
                    }
                    return c15831v;
                }
                Intrinsics.h(objV0, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                S0((G0) objV0);
            }
        }
    }

    @Override // mv.C0
    public final InterfaceC15804h0 z(boolean onCancelling, boolean invokeImmediately, Function1<? super Throwable, Unit> handler) {
        return C0(invokeImmediately, onCancelling ? new A0(handler) : new B0(handler));
    }

    public H0(boolean z10) {
        this._state$volatile = z10 ? I0.f151675g : I0.f151674f;
    }

    private final boolean F0() {
        Object objV0;
        do {
            objV0 = v0();
            if (!(objV0 instanceof InterfaceC15836x0)) {
                return false;
            }
        } while (V0(objV0) < 0);
        return true;
    }

    private final C15831v L0(C16978o c16978o) {
        while (c16978o.q()) {
            c16978o = c16978o.m();
        }
        while (true) {
            c16978o = c16978o.l();
            if (!c16978o.q()) {
                if (c16978o instanceof C15831v) {
                    return (C15831v) c16978o;
                }
                if (c16978o instanceof M0) {
                    return null;
                }
            }
        }
    }

    private final void M0(M0 list, Throwable cause) throws Throwable {
        O0(cause);
        list.g(4);
        Object objK = list.k();
        Intrinsics.h(objK, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        CompletionHandlerException completionHandlerException = null;
        for (C16978o c16978oL = (C16978o) objK; !Intrinsics.e(c16978oL, list); c16978oL = c16978oL.l()) {
            if ((c16978oL instanceof G0) && ((G0) c16978oL).v()) {
                try {
                    ((G0) c16978oL).w(cause);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        ExceptionsKt.a(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + c16978oL + " for " + this, th2);
                        Unit unit = Unit.f143329a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            A0(completionHandlerException);
        }
        S(cause);
    }

    private final Object Q(Object cause) {
        Object objC1;
        do {
            Object objV0 = v0();
            if (!(objV0 instanceof InterfaceC15836x0) || ((objV0 instanceof c) && ((c) objV0).k())) {
                return I0.f151669a;
            }
            objC1 = c1(objV0, new C15771C(d0(cause), false, 2, null));
        } while (objC1 == I0.f151671c);
        return objC1;
    }

    private final boolean S(Throwable cause) {
        if (D0()) {
            return true;
        }
        boolean z10 = cause instanceof CancellationException;
        InterfaceC15829u interfaceC15829uU0 = u0();
        if (interfaceC15829uU0 != null && interfaceC15829uU0 != O0.f151684a) {
            if (interfaceC15829uU0.b(cause) || z10) {
                return true;
            }
            return false;
        }
        return z10;
    }

    private final void a0(InterfaceC15836x0 state, Object update) throws Throwable {
        C15771C c15771c;
        InterfaceC15829u interfaceC15829uU0 = u0();
        if (interfaceC15829uU0 != null) {
            interfaceC15829uU0.dispose();
            U0(O0.f151684a);
        }
        Throwable th2 = null;
        if (update instanceof C15771C) {
            c15771c = (C15771C) update;
        } else {
            c15771c = null;
        }
        if (c15771c != null) {
            th2 = c15771c.cause;
        }
        if (state instanceof G0) {
            try {
                ((G0) state).w(th2);
                return;
            } catch (Throwable th3) {
                A0(new CompletionHandlerException("Exception in completion handler " + state + " for " + this, th3));
                return;
            }
        }
        M0 list = state.getList();
        if (list != null) {
            N0(list, th2);
        }
    }

    private final boolean a1(InterfaceC15836x0 state, Object update) throws Throwable {
        if (!androidx.concurrent.futures.b.a(f151653a, this, state, I0.g(update))) {
            return false;
        }
        O0(null);
        P0(update);
        a0(state, update);
        return true;
    }

    private final boolean b1(InterfaceC15836x0 state, Throwable rootCause) throws Throwable {
        M0 m0Q0 = q0(state);
        if (m0Q0 == null) {
            return false;
        }
        if (!androidx.concurrent.futures.b.a(f151653a, this, state, new c(m0Q0, false, rootCause))) {
            return false;
        }
        M0(m0Q0, rootCause);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c0(c state, C15831v lastChild, Object proposedUpdate) {
        C15831v c15831vL0 = L0(lastChild);
        if (c15831vL0 == null || !e1(state, c15831vL0, proposedUpdate)) {
            state.getList().g(2);
            C15831v c15831vL02 = L0(lastChild);
            if (c15831vL02 != null && e1(state, c15831vL02, proposedUpdate)) {
                return;
            }
            y(e0(state, proposedUpdate));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v2 */
    private final Object d1(InterfaceC15836x0 state, Object proposedUpdate) throws Throwable {
        c cVar;
        C15771C c15771c;
        M0 m0Q0 = q0(state);
        if (m0Q0 == null) {
            return I0.f151671c;
        }
        ?? r22 = 0;
        if (state instanceof c) {
            cVar = (c) state;
        } else {
            cVar = null;
        }
        if (cVar == null) {
            cVar = new c(m0Q0, false, null);
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        synchronized (cVar) {
            if (cVar.k()) {
                return I0.f151669a;
            }
            cVar.n(true);
            if (cVar != state && !androidx.concurrent.futures.b.a(f151653a, this, state, cVar)) {
                return I0.f151671c;
            }
            boolean zJ = cVar.j();
            if (proposedUpdate instanceof C15771C) {
                c15771c = (C15771C) proposedUpdate;
            } else {
                c15771c = null;
            }
            if (c15771c != null) {
                cVar.b(c15771c.cause);
            }
            Throwable thF = cVar.f();
            if (!zJ) {
                r22 = thF;
            }
            objectRef.f143742a = r22;
            Unit unit = Unit.f143329a;
            if (r22 != 0) {
                M0(m0Q0, r22);
            }
            C15831v c15831vL0 = L0(m0Q0);
            if (c15831vL0 != null && e1(cVar, c15831vL0, proposedUpdate)) {
                return I0.f151670b;
            }
            m0Q0.g(2);
            C15831v c15831vL02 = L0(m0Q0);
            if (c15831vL02 != null && e1(cVar, c15831vL02, proposedUpdate)) {
                return I0.f151670b;
            }
            return e0(cVar, proposedUpdate);
        }
    }

    private final Throwable k0(c state, List<? extends Throwable> exceptions) {
        Object next;
        Object obj = null;
        if (exceptions.isEmpty()) {
            if (!state.j()) {
                return null;
            }
            return new JobCancellationException(V(), null, this);
        }
        List<? extends Throwable> list = exceptions;
        Iterator<T> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (!(((Throwable) next) instanceof CancellationException)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Throwable th2 = (Throwable) next;
        if (th2 != null) {
            return th2;
        }
        Throwable th3 = exceptions.get(0);
        if (th3 instanceof TimeoutCancellationException) {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                Throwable th4 = (Throwable) next2;
                if (th4 != th3 && (th4 instanceof TimeoutCancellationException)) {
                    obj = next2;
                    break;
                }
            }
            Throwable th5 = (Throwable) obj;
            if (th5 != null) {
                return th5;
            }
        }
        return th3;
    }

    private final M0 q0(InterfaceC15836x0 state) {
        M0 list = state.getList();
        if (list == null) {
            if (state instanceof C15810k0) {
                return new M0();
            }
            if (state instanceof G0) {
                S0((G0) state);
                return null;
            }
            throw new IllegalStateException(("State should have list: " + state).toString());
        }
        return list;
    }

    private final void x(Throwable rootCause, List<? extends Throwable> exceptions) {
        if (exceptions.size() > 1) {
            Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(exceptions.size()));
            for (Throwable th2 : exceptions) {
                if (th2 != rootCause && th2 != rootCause && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                    ExceptionsKt.a(rootCause, th2);
                }
            }
        }
    }

    @Override // mv.C0
    public final boolean A() {
        return !(v0() instanceof InterfaceC15836x0);
    }

    protected final Object C(Continuation<Object> continuation) throws Throwable {
        Object objV0;
        do {
            objV0 = v0();
            if (!(objV0 instanceof InterfaceC15836x0)) {
                if (!(objV0 instanceof C15771C)) {
                    return I0.h(objV0);
                }
                throw ((C15771C) objV0).cause;
            }
        } while (V0(objV0) < 0);
        return E(continuation);
    }

    public final InterfaceC15804h0 C0(boolean invokeImmediately, G0 node) {
        boolean z10;
        Throwable th2;
        C15771C c15771c;
        boolean zD;
        c cVar;
        Throwable thF;
        node.x(this);
        while (true) {
            Object objV0 = v0();
            z10 = true;
            th2 = null;
            if (objV0 instanceof C15810k0) {
                C15810k0 c15810k0 = (C15810k0) objV0;
                if (c15810k0.getIsActive()) {
                    if (androidx.concurrent.futures.b.a(f151653a, this, objV0, node)) {
                        break;
                    }
                } else {
                    R0(c15810k0);
                }
            } else if (objV0 instanceof InterfaceC15836x0) {
                InterfaceC15836x0 interfaceC15836x0 = (InterfaceC15836x0) objV0;
                M0 list = interfaceC15836x0.getList();
                if (list == null) {
                    Intrinsics.h(objV0, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    S0((G0) objV0);
                } else {
                    if (node.v()) {
                        if (interfaceC15836x0 instanceof c) {
                            cVar = (c) interfaceC15836x0;
                        } else {
                            cVar = null;
                        }
                        if (cVar != null) {
                            thF = cVar.f();
                        } else {
                            thF = null;
                        }
                        if (thF == null) {
                            zD = list.d(node, 5);
                        } else {
                            if (invokeImmediately) {
                                node.w(thF);
                            }
                            return O0.f151684a;
                        }
                    } else {
                        zD = list.d(node, 1);
                    }
                    if (zD) {
                        break;
                    }
                }
            } else {
                z10 = false;
                break;
            }
        }
        if (z10) {
            return node;
        }
        if (invokeImmediately) {
            Object objV02 = v0();
            if (objV02 instanceof C15771C) {
                c15771c = (C15771C) objV02;
            } else {
                c15771c = null;
            }
            if (c15771c != null) {
                th2 = c15771c.cause;
            }
            node.w(th2);
        }
        return O0.f151684a;
    }

    @Override // mv.C0
    public final CancellationException D() {
        Object objV0 = v0();
        if (objV0 instanceof c) {
            Throwable thF = ((c) objV0).f();
            if (thF != null) {
                CancellationException cancellationExceptionX0 = X0(thF, C15787T.a(this) + " is cancelling");
                if (cancellationExceptionX0 != null) {
                    return cancellationExceptionX0;
                }
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (!(objV0 instanceof InterfaceC15836x0)) {
            if (objV0 instanceof C15771C) {
                return Y0(this, ((C15771C) objV0).cause, null, 1, null);
            }
            return new JobCancellationException(C15787T.a(this) + " has completed normally", null, this);
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    public final boolean G(Throwable cause) {
        return L(cause);
    }

    public final boolean I0(Object proposedUpdate) {
        Object objC1;
        do {
            objC1 = c1(v0(), proposedUpdate);
            if (objC1 == I0.f151669a) {
                return false;
            }
            if (objC1 == I0.f151670b) {
                return true;
            }
        } while (objC1 == I0.f151671c);
        y(objC1);
        return true;
    }

    public final Object J0(Object proposedUpdate) {
        Object objC1;
        do {
            objC1 = c1(v0(), proposedUpdate);
            if (objC1 == I0.f151669a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + proposedUpdate, i0(proposedUpdate));
            }
        } while (objC1 == I0.f151671c);
        return objC1;
    }

    @Override // mv.InterfaceC15833w
    public final void K(Q0 parentJob) throws Throwable {
        L(parentJob);
    }

    public String K0() {
        return C15787T.a(this);
    }

    public final boolean L(Object cause) throws Throwable {
        Object objH0 = I0.f151669a;
        if (p0() && (objH0 = Q(cause)) == I0.f151670b) {
            return true;
        }
        if (objH0 == I0.f151669a) {
            objH0 = H0(cause);
        }
        if (objH0 == I0.f151669a || objH0 == I0.f151670b) {
            return true;
        }
        if (objH0 == I0.f151672d) {
            return false;
        }
        y(objH0);
        return true;
    }

    public void P(Throwable cause) throws Throwable {
        L(cause);
    }

    public final void T0(G0 node) {
        Object objV0;
        do {
            objV0 = v0();
            if (objV0 instanceof G0) {
                if (objV0 != node) {
                    return;
                }
            } else {
                if ((objV0 instanceof InterfaceC15836x0) && ((InterfaceC15836x0) objV0).getList() != null) {
                    node.r();
                    return;
                }
                return;
            }
        } while (!androidx.concurrent.futures.b.a(f151653a, this, objV0, I0.f151675g));
    }

    public final void U0(InterfaceC15829u interfaceC15829u) {
        f151654b.set(this, interfaceC15829u);
    }

    @Override // mv.C0
    public boolean a() {
        Object objV0 = v0();
        if ((objV0 instanceof InterfaceC15836x0) && ((InterfaceC15836x0) objV0).getIsActive()) {
            return true;
        }
        return false;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R b(R r10, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) C0.a.b(this, r10, function2);
    }

    public final Object f0() throws Throwable {
        Object objV0 = v0();
        if (!(objV0 instanceof InterfaceC15836x0)) {
            if (!(objV0 instanceof C15771C)) {
                return I0.h(objV0);
            }
            throw ((C15771C) objV0).cause;
        }
        throw new IllegalStateException("This job has not completed yet");
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E g(CoroutineContext.Key<E> key) {
        return (E) C0.a.c(this, key);
    }

    protected final Throwable g0() {
        Object objV0 = v0();
        if (objV0 instanceof c) {
            Throwable thF = ((c) objV0).f();
            if (thF != null) {
                return thF;
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (!(objV0 instanceof InterfaceC15836x0)) {
            if (objV0 instanceof C15771C) {
                return ((C15771C) objV0).cause;
            }
            return null;
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    protected final boolean h0() {
        Object objV0 = v0();
        if ((objV0 instanceof C15771C) && ((C15771C) objV0).a()) {
            return true;
        }
        return false;
    }

    @Override // mv.C0
    public final boolean isCancelled() {
        Object objV0 = v0();
        if (!(objV0 instanceof C15771C)) {
            if (!(objV0 instanceof c) || !((c) objV0).j()) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    @Override // mv.Q0
    public CancellationException j0() {
        CancellationException cancellationExceptionF;
        Object objV0 = v0();
        CancellationException cancellationException = null;
        if (objV0 instanceof c) {
            cancellationExceptionF = ((c) objV0).f();
        } else if (objV0 instanceof C15771C) {
            cancellationExceptionF = ((C15771C) objV0).cause;
        } else if (!(objV0 instanceof InterfaceC15836x0)) {
            cancellationExceptionF = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + objV0).toString());
        }
        if (cancellationExceptionF instanceof CancellationException) {
            cancellationException = cancellationExceptionF;
        }
        if (cancellationException == null) {
            return new JobCancellationException("Parent job is " + W0(objV0), cancellationExceptionF, this);
        }
        return cancellationException;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext n0(CoroutineContext coroutineContext) {
        return C0.a.e(this, coroutineContext);
    }

    @Override // mv.C0
    public final Object o0(Continuation<? super Unit> continuation) {
        if (!F0()) {
            E0.i(continuation.getContext());
            return Unit.f143329a;
        }
        Object objG0 = G0(continuation);
        if (objG0 == IntrinsicsKt.f()) {
            return objG0;
        }
        return Unit.f143329a;
    }

    @Override // mv.C0
    public final boolean start() {
        int iV0;
        do {
            iV0 = V0(v0());
            if (iV0 == 0) {
                return false;
            }
        } while (iV0 != 1);
        return true;
    }

    public C0 t0() {
        InterfaceC15829u interfaceC15829uU0 = u0();
        if (interfaceC15829uU0 != null) {
            return interfaceC15829uU0.getParent();
        }
        return null;
    }

    public final InterfaceC15829u u0() {
        return (InterfaceC15829u) f151654b.get(this);
    }

    public final Object v0() {
        return f151653a.get(this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext x0(CoroutineContext.Key<?> key) {
        return C0.a.d(this, key);
    }
}
