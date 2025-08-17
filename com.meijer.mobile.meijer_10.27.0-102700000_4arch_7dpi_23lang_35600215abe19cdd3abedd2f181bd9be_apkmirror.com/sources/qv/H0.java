package qv;

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
import qv.C0;
import vv.C17659o;

@Deprecated
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\f\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0006°\u0001±\u0001\u009a\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001b\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u000fH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\"\u0010#J\u001d\u0010$\u001a\u00020\u0014*\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b$\u0010!J\u0019\u0010&\u001a\u00020%2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020(H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020+H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0004H\u0002¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b0\u00101J\u001b\u00102\u001a\u0004\u0018\u00010\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b2\u00103J\u0019\u00104\u001a\u00020\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b4\u00105J\u001b\u00106\u001a\u0004\u0018\u00010\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b6\u00103J\u0019\u00107\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\t\u001a\u00020\u0017H\u0002¢\u0006\u0004\b7\u00108J\u001f\u00109\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\b9\u0010:J%\u0010;\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b;\u0010<J#\u0010=\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u00172\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b=\u0010>J*\u0010A\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010@\u001a\u00020?2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0082\u0010¢\u0006\u0004\bA\u0010BJ)\u0010D\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010C\u001a\u00020?2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\bD\u0010EJ\u0015\u0010G\u001a\u0004\u0018\u00010?*\u00020FH\u0002¢\u0006\u0004\bG\u0010HJ\u0019\u0010J\u001a\u00020I2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\bJ\u0010KJ\u0012\u0010L\u001a\u0004\u0018\u00010\nH\u0082@¢\u0006\u0004\bL\u00101J\u0019\u0010N\u001a\u00020\u00142\b\u0010M\u001a\u0004\u0018\u00010\u0001H\u0004¢\u0006\u0004\bN\u0010OJ\r\u0010P\u001a\u00020\u0004¢\u0006\u0004\bP\u0010/J\u000f\u0010Q\u001a\u00020\u0014H\u0014¢\u0006\u0004\bQ\u0010RJ\u0011\u0010U\u001a\u00060Sj\u0002`T¢\u0006\u0004\bU\u0010VJ#\u0010X\u001a\u00060Sj\u0002`T*\u00020\u000f2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010IH\u0004¢\u0006\u0004\bX\u0010YJ6\u0010`\u001a\u00020_2'\u0010^\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b[\u0012\b\b\\\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00140Zj\u0002`]¢\u0006\u0004\b`\u0010aJF\u0010d\u001a\u00020_2\u0006\u0010b\u001a\u00020\u00042\u0006\u0010c\u001a\u00020\u00042'\u0010^\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b[\u0012\b\b\\\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00140Zj\u0002`]¢\u0006\u0004\bd\u0010eJ\u001f\u0010g\u001a\u00020_2\u0006\u0010c\u001a\u00020\u00042\u0006\u0010f\u001a\u00020+H\u0000¢\u0006\u0004\bg\u0010hJ\u0010\u0010i\u001a\u00020\u0014H\u0086@¢\u0006\u0004\bi\u00101J\u0017\u0010j\u001a\u00020\u00142\u0006\u0010f\u001a\u00020+H\u0000¢\u0006\u0004\bj\u0010-J\u001f\u0010k\u001a\u00020\u00142\u000e\u0010\u001f\u001a\n\u0018\u00010Sj\u0004\u0018\u0001`TH\u0016¢\u0006\u0004\bk\u0010lJ\u000f\u0010m\u001a\u00020IH\u0014¢\u0006\u0004\bm\u0010nJ\u0017\u0010o\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u000fH\u0016¢\u0006\u0004\bo\u0010pJ\u0015\u0010r\u001a\u00020\u00142\u0006\u0010q\u001a\u00020\u0003¢\u0006\u0004\br\u0010sJ\u0017\u0010t\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u000fH\u0016¢\u0006\u0004\bt\u0010#J\u0017\u0010u\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\bu\u0010#J\u0019\u0010v\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0004\bv\u0010wJ\u0013\u0010x\u001a\u00060Sj\u0002`TH\u0016¢\u0006\u0004\bx\u0010VJ\u0019\u0010y\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0004\by\u0010wJ\u001b\u0010z\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0004\bz\u00103J\u0015\u0010|\u001a\u00020{2\u0006\u0010@\u001a\u00020\u0002¢\u0006\u0004\b|\u0010}J\u0017\u0010\u007f\u001a\u00020\u00142\u0006\u0010~\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\u007f\u0010pJ\u001b\u0010\u0080\u0001\u001a\u00020\u00142\b\u0010\u001f\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0005\b\u0080\u0001\u0010pJ\u0019\u0010\u0081\u0001\u001a\u00020\u00042\u0006\u0010~\u001a\u00020\u000fH\u0014¢\u0006\u0005\b\u0081\u0001\u0010#J\u001c\u0010\u0082\u0001\u001a\u00020\u00142\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u001c\u0010\u0084\u0001\u001a\u00020\u00142\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0006\b\u0084\u0001\u0010\u0083\u0001J\u0011\u0010\u0085\u0001\u001a\u00020IH\u0016¢\u0006\u0005\b\u0085\u0001\u0010nJ\u0011\u0010\u0086\u0001\u001a\u00020IH\u0007¢\u0006\u0005\b\u0086\u0001\u0010nJ\u0011\u0010\u0087\u0001\u001a\u00020IH\u0010¢\u0006\u0005\b\u0087\u0001\u0010nJ\u0014\u0010\u0088\u0001\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u0014\u0010\u008a\u0001\u001a\u0004\u0018\u00010\nH\u0084@¢\u0006\u0005\b\u008a\u0001\u00101R\u001e\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u000f*\u0004\u0018\u00010\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u008b\u0001\u00105R\u0019\u0010\u0090\u0001\u001a\u0007\u0012\u0002\b\u00030\u008d\u00018F¢\u0006\b\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R.\u0010\u0096\u0001\u001a\u0004\u0018\u00010{2\t\u0010\u0091\u0001\u001a\u0004\u0018\u00010{8@@@X\u0080\u000e¢\u0006\u0010\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0018\u0010M\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0099\u0001\u0010\u0089\u0001R\u0016\u0010\u009b\u0001\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u009a\u0001\u0010/R\u0013\u0010\u009d\u0001\u001a\u00020\u00048F¢\u0006\u0007\u001a\u0005\b\u009c\u0001\u0010/R\u0013\u0010\u009e\u0001\u001a\u00020\u00048F¢\u0006\u0007\u001a\u0005\b\u009e\u0001\u0010/R\u0019\u0010¡\u0001\u001a\u0004\u0018\u00010\u000f8DX\u0084\u0004¢\u0006\b\u001a\u0006\b\u009f\u0001\u0010 \u0001R\u0016\u0010£\u0001\u001a\u00020\u00048DX\u0084\u0004¢\u0006\u0007\u001a\u0005\b¢\u0001\u0010/R\u0016\u0010¥\u0001\u001a\u00020\u00048PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b¤\u0001\u0010/R\u001b\u0010©\u0001\u001a\t\u0012\u0004\u0012\u00020\u00010¦\u00018F¢\u0006\b\u001a\u0006\b§\u0001\u0010¨\u0001R\u0016\u0010«\u0001\u001a\u00020\u00048TX\u0094\u0004¢\u0006\u0007\u001a\u0005\bª\u0001\u0010/R\u0016\u0010\u00ad\u0001\u001a\u00020\u00048PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b¬\u0001\u0010/R\u0014\u0010®\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\n8\u0002X\u0082\u0004R\u0014\u0010¯\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010{0\n8\u0002X\u0082\u0004¨\u0006²\u0001"}, d2 = {"Lqv/H0;", "Lqv/C0;", "Lqv/w;", "Lqv/Q0;", "", "active", "<init>", "(Z)V", "Lqv/H0$c;", "state", "", "proposedUpdate", "d0", "(Lqv/H0$c;Ljava/lang/Object;)Ljava/lang/Object;", "", "", "exceptions", "j0", "(Lqv/H0$c;Ljava/util/List;)Ljava/lang/Throwable;", "rootCause", "", "x", "(Ljava/lang/Throwable;Ljava/util/List;)V", "Lqv/x0;", "update", "a1", "(Lqv/x0;Ljava/lang/Object;)Z", "a0", "(Lqv/x0;Ljava/lang/Object;)V", "Lqv/M0;", "list", "cause", "M0", "(Lqv/M0;Ljava/lang/Throwable;)V", "S", "(Ljava/lang/Throwable;)Z", "N0", "", "V0", "(Ljava/lang/Object;)I", "Lqv/k0;", "R0", "(Lqv/k0;)V", "Lqv/G0;", "S0", "(Lqv/G0;)V", "D0", "()Z", "E0", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Q", "(Ljava/lang/Object;)Ljava/lang/Object;", "c0", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "G0", "p0", "(Lqv/x0;)Lqv/M0;", "b1", "(Lqv/x0;Ljava/lang/Throwable;)Z", "c1", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "d1", "(Lqv/x0;Ljava/lang/Object;)Ljava/lang/Object;", "Lqv/v;", "child", "e1", "(Lqv/H0$c;Lqv/v;Ljava/lang/Object;)Z", "lastChild", "b0", "(Lqv/H0$c;Lqv/v;Ljava/lang/Object;)V", "Lvv/o;", "L0", "(Lvv/o;)Lqv/v;", "", "W0", "(Ljava/lang/Object;)Ljava/lang/String;", "E", "parent", "A0", "(Lqv/C0;)V", "start", "Q0", "()V", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "z", "()Ljava/util/concurrent/CancellationException;", "message", "X0", "(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lqv/h0;", "K", "(Lkotlin/jvm/functions/Function1;)Lqv/h0;", "onCancelling", "invokeImmediately", "u", "(ZZLkotlin/jvm/functions/Function1;)Lqv/h0;", "node", "B0", "(ZLqv/G0;)Lqv/h0;", "n0", "T0", "d", "(Ljava/util/concurrent/CancellationException;)V", "V", "()Ljava/lang/String;", "P", "(Ljava/lang/Throwable;)V", "parentJob", "H", "(Lqv/Q0;)V", "Y", "G", "L", "(Ljava/lang/Object;)Z", "h0", "H0", "I0", "Lqv/u;", "q0", "(Lqv/w;)Lqv/u;", "exception", "z0", "O0", "y0", "P0", "(Ljava/lang/Object;)V", "y", "toString", "Z0", "K0", "e0", "()Ljava/lang/Object;", "C", "i0", "exceptionOrNull", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "key", "value", "t0", "()Lqv/u;", "U0", "(Lqv/u;)V", "parentHandle", "s0", "()Lqv/C0;", "u0", "a", "isActive", "A", "isCompleted", "isCancelled", "f0", "()Ljava/lang/Throwable;", "completionCause", "g0", "completionCauseHandled", "o0", "onCancelComplete", "Lkotlin/sequences/Sequence;", "p", "()Lkotlin/sequences/Sequence;", "children", "C0", "isScopedCoroutine", "k0", "handlesException", "_state", "_parentHandle", "c", "b", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public class H0 implements C0, InterfaceC16672w, Q0 {

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f157579a = AtomicReferenceFieldUpdater.newUpdater(H0.class, Object.class, "_state$volatile");

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f157580b = AtomicReferenceFieldUpdater.newUpdater(H0.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lqv/H0$a;", "T", "Lqv/p;", "Lkotlin/coroutines/Continuation;", "delegate", "Lqv/H0;", "job", "<init>", "(Lkotlin/coroutines/Continuation;Lqv/H0;)V", "Lqv/C0;", "parent", "", "t", "(Lqv/C0;)Ljava/lang/Throwable;", "", "K", "()Ljava/lang/String;", "i", "Lqv/H0;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    private static final class a<T> extends C16658p<T> {

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final H0 job;

        public a(Continuation<? super T> continuation, H0 h02) {
            super(continuation, 1);
            this.job = h02;
        }

        @Override // qv.C16658p
        protected String K() {
            return "AwaitContinuation";
        }

        @Override // qv.C16658p
        public Throwable t(C0 parent) {
            Throwable thF;
            Object objU0 = this.job.u0();
            return (!(objU0 instanceof c) || (thF = ((c) objU0).f()) == null) ? objU0 instanceof C16610C ? ((C16610C) objU0).cause : parent.z() : thF;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lqv/H0$b;", "Lqv/G0;", "Lqv/H0;", "parent", "Lqv/H0$c;", "state", "Lqv/v;", "child", "", "proposedUpdate", "<init>", "(Lqv/H0;Lqv/H0$c;Lqv/v;Ljava/lang/Object;)V", "", "cause", "", "w", "(Ljava/lang/Throwable;)V", "e", "Lqv/H0;", "f", "Lqv/H0$c;", "g", "Lqv/v;", "h", "Ljava/lang/Object;", "", "v", "()Z", "onCancelling", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class b extends G0 {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final H0 parent;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final c state;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final C16670v child;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final Object proposedUpdate;

        @Override // qv.G0
        public boolean v() {
            return false;
        }

        @Override // qv.G0
        public void w(Throwable cause) {
            this.parent.b0(this.state, this.child, this.proposedUpdate);
        }

        public b(H0 h02, c cVar, C16670v c16670v, Object obj) {
            this.parent = h02;
            this.state = cVar;
            this.child = c16670v;
            this.proposedUpdate = obj;
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001c\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\b0\fj\b\u0012\u0004\u0012\u00020\b`\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR(\u0010$\u001a\u0004\u0018\u00010\u00012\b\u0010\u001f\u001a\u0004\u0018\u00010\u00018B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R(\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010\u0017R\u0011\u0010-\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b,\u0010&R\u0011\u0010/\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b.\u0010&R\u0014\u00100\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010&R\u000b\u00101\u001a\u00020\u00018\u0002X\u0082\u0004R\u0013\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00018\u0002X\u0082\u0004R\u0013\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¨\u00064"}, d2 = {"Lqv/H0$c;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "Lqv/x0;", "Lqv/M0;", "list", "", "isCompleting", "", "rootCause", "<init>", "(Lqv/M0;ZLjava/lang/Throwable;)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "d", "()Ljava/util/ArrayList;", "proposedException", "", "m", "(Ljava/lang/Throwable;)Ljava/util/List;", "exception", "", "b", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "a", "Lqv/M0;", "c", "()Lqv/M0;", "value", "e", "()Ljava/lang/Object;", "o", "(Ljava/lang/Object;)V", "exceptionsHolder", "k", "()Z", "n", "(Z)V", "f", "()Ljava/lang/Throwable;", "p", "l", "isSealed", "j", "isCancelling", "isActive", "_isCompleting", "_rootCause", "_exceptionsHolder", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    private static final class c implements InterfaceC16675x0 {

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f157586b = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting$volatile");

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f157587c = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause$volatile");

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f157588d = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder$volatile");
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile;
        private volatile /* synthetic */ Object _rootCause$volatile;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final M0 list;

        private final ArrayList<Throwable> d() {
            return new ArrayList<>(4);
        }

        @Override // qv.InterfaceC16675x0
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
            return f157588d.get(this);
        }

        private final void o(Object obj) {
            f157588d.set(this, obj);
        }

        @Override // qv.InterfaceC16675x0
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
            return (Throwable) f157587c.get(this);
        }

        public final boolean j() {
            if (f() != null) {
                return true;
            }
            return false;
        }

        public final boolean k() {
            if (f157586b.get(this) == 1) {
                return true;
            }
            return false;
        }

        public final boolean l() {
            if (e() == I0.f157599e) {
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
            o(I0.f157599e);
            return arrayListD;
        }

        public final void n(boolean z10) {
            f157586b.set(this, z10 ? 1 : 0);
        }

        public final void p(Throwable th2) {
            f157587c.set(this, th2);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/sequences/SequenceScope;", "Lqv/C0;", "", "<anonymous>", "(Lkotlin/sequences/SequenceScope;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", l = {1003, 1005}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class d extends RestrictedSuspendLambda implements Function2<SequenceScope<? super C0>, Continuation<? super Unit>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f157590b;

        /* renamed from: c, reason: collision with root package name */
        Object f157591c;

        /* renamed from: d, reason: collision with root package name */
        int f157592d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f157593e;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = H0.this.new d(continuation);
            dVar.f157593e = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SequenceScope<? super C0> sequenceScope, Continuation<? super Unit> continuation) {
            return ((d) create(sequenceScope, continuation)).invokeSuspend(Unit.f142422a);
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
                int r1 = r5.f157592d
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2a
                if (r1 == r3) goto L26
                if (r1 != r2) goto L1e
                java.lang.Object r1 = r5.f157591c
                vv.o r1 = (vv.C17659o) r1
                java.lang.Object r3 = r5.f157590b
                vv.n r3 = (vv.C17658n) r3
                java.lang.Object r4 = r5.f157593e
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
                java.lang.Object r6 = r5.f157593e
                kotlin.sequences.SequenceScope r6 = (kotlin.sequences.SequenceScope) r6
                qv.H0 r1 = qv.H0.this
                java.lang.Object r1 = r1.u0()
                boolean r4 = r1 instanceof qv.C16670v
                if (r4 == 0) goto L48
                qv.v r1 = (qv.C16670v) r1
                qv.w r1 = r1.childJob
                r5.f157592d = r3
                java.lang.Object r6 = r6.c(r1, r5)
                if (r6 != r0) goto L86
                goto L80
            L48:
                boolean r3 = r1 instanceof qv.InterfaceC16675x0
                if (r3 == 0) goto L86
                qv.x0 r1 = (qv.InterfaceC16675x0) r1
                qv.M0 r1 = r1.getList()
                if (r1 == 0) goto L86
                java.lang.Object r3 = r1.k()
                java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
                kotlin.jvm.internal.Intrinsics.h(r3, r4)
                vv.o r3 = (vv.C17659o) r3
                r4 = r3
                r3 = r1
                r1 = r4
                r4 = r6
            L63:
                boolean r6 = kotlin.jvm.internal.Intrinsics.e(r1, r3)
                if (r6 != 0) goto L86
                boolean r6 = r1 instanceof qv.C16670v
                if (r6 == 0) goto L81
                r6 = r1
                qv.v r6 = (qv.C16670v) r6
                qv.w r6 = r6.childJob
                r5.f157593e = r4
                r5.f157590b = r3
                r5.f157591c = r1
                r5.f157592d = r2
                java.lang.Object r6 = r4.c(r6, r5)
                if (r6 != r0) goto L81
            L80:
                return r0
            L81:
                vv.o r1 = r1.l()
                goto L63
            L86:
                kotlin.Unit r6 = kotlin.Unit.f142422a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: qv.H0.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private final Object G0(Object cause) throws Throwable {
        Throwable thC0 = null;
        while (true) {
            Object objU0 = u0();
            if (objU0 instanceof c) {
                synchronized (objU0) {
                    if (((c) objU0).l()) {
                        return I0.f157598d;
                    }
                    boolean zJ = ((c) objU0).j();
                    if (cause != null || !zJ) {
                        if (thC0 == null) {
                            thC0 = c0(cause);
                        }
                        ((c) objU0).b(thC0);
                    }
                    Throwable thF = zJ ? null : ((c) objU0).f();
                    if (thF != null) {
                        M0(((c) objU0).getList(), thF);
                    }
                    return I0.f157595a;
                }
            }
            if (!(objU0 instanceof InterfaceC16675x0)) {
                return I0.f157598d;
            }
            if (thC0 == null) {
                thC0 = c0(cause);
            }
            InterfaceC16675x0 interfaceC16675x0 = (InterfaceC16675x0) objU0;
            if (!interfaceC16675x0.getIsActive()) {
                Object objC1 = c1(objU0, new C16610C(thC0, false, 2, null));
                if (objC1 == I0.f157595a) {
                    throw new IllegalStateException(("Cannot happen in " + objU0).toString());
                }
                if (objC1 != I0.f157597c) {
                    return objC1;
                }
            } else if (b1(interfaceC16675x0, thC0)) {
                return I0.f157595a;
            }
        }
    }

    private final void N0(M0 m02, Throwable th2) throws Throwable {
        m02.g(1);
        Object objK = m02.k();
        Intrinsics.h(objK, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        CompletionHandlerException completionHandlerException = null;
        for (C17659o c17659oL = (C17659o) objK; !Intrinsics.e(c17659oL, m02); c17659oL = c17659oL.l()) {
            if (c17659oL instanceof G0) {
                try {
                    ((G0) c17659oL).w(th2);
                } catch (Throwable th3) {
                    if (completionHandlerException != null) {
                        ExceptionsKt.a(completionHandlerException, th3);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + c17659oL + " for " + this, th3);
                        Unit unit = Unit.f142422a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            z0(completionHandlerException);
        }
    }

    protected boolean C0() {
        return false;
    }

    protected void O0(Throwable cause) {
    }

    protected void P0(Object state) {
    }

    protected void Q0() {
    }

    /* renamed from: k0 */
    public boolean getHandlesException() {
        return true;
    }

    public boolean o0() {
        return false;
    }

    protected void y(Object state) {
    }

    protected boolean y0(Throwable exception) {
        return false;
    }

    public void z0(Throwable exception) throws Throwable {
        throw exception;
    }

    private final Object E(Continuation<Object> continuation) {
        a aVar = new a(IntrinsicsKt.c(continuation), this);
        aVar.C();
        C16662r.a(aVar, F0.m(this, false, new R0(aVar), 1, null));
        Object objV = aVar.v();
        if (objV == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objV;
    }

    private final Object E0(Continuation<? super Unit> continuation) {
        C16658p c16658p = new C16658p(IntrinsicsKt.c(continuation), 1);
        c16658p.C();
        C16662r.a(c16658p, F0.m(this, false, new S0(c16658p), 1, null));
        Object objV = c16658p.v();
        if (objV == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objV == IntrinsicsKt.f() ? objV : Unit.f142422a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [qv.w0] */
    private final void R0(C16649k0 state) {
        M0 m02 = new M0();
        if (!state.getIsActive()) {
            m02 = new C16673w0(m02);
        }
        androidx.concurrent.futures.b.a(f157579a, this, state, m02);
    }

    private final void S0(G0 state) {
        state.f(new M0());
        androidx.concurrent.futures.b.a(f157579a, this, state, state.l());
    }

    private final int V0(Object state) {
        if (state instanceof C16649k0) {
            if (((C16649k0) state).getIsActive()) {
                return 0;
            }
            if (!androidx.concurrent.futures.b.a(f157579a, this, state, I0.f157601g)) {
                return -1;
            }
            Q0();
            return 1;
        }
        if (!(state instanceof C16673w0)) {
            return 0;
        }
        if (!androidx.concurrent.futures.b.a(f157579a, this, state, ((C16673w0) state).getList())) {
            return -1;
        }
        Q0();
        return 1;
    }

    private final String W0(Object state) {
        if (!(state instanceof c)) {
            return state instanceof InterfaceC16675x0 ? ((InterfaceC16675x0) state).getIsActive() ? "Active" : "New" : state instanceof C16610C ? "Cancelled" : "Completed";
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

    private final Throwable c0(Object cause) {
        if (cause == null ? true : cause instanceof Throwable) {
            Throwable th2 = (Throwable) cause;
            return th2 == null ? new JobCancellationException(V(), null, this) : th2;
        }
        Intrinsics.h(cause, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((Q0) cause).h0();
    }

    private final Object c1(Object state, Object proposedUpdate) {
        return !(state instanceof InterfaceC16675x0) ? I0.f157595a : ((!(state instanceof C16649k0) && !(state instanceof G0)) || (state instanceof C16670v) || (proposedUpdate instanceof C16610C)) ? d1((InterfaceC16675x0) state, proposedUpdate) : a1((InterfaceC16675x0) state, proposedUpdate) ? proposedUpdate : I0.f157597c;
    }

    private final Object d0(c state, Object proposedUpdate) throws Throwable {
        boolean zJ;
        Throwable thJ0;
        C16610C c16610c = proposedUpdate instanceof C16610C ? (C16610C) proposedUpdate : null;
        Throwable th2 = c16610c != null ? c16610c.cause : null;
        synchronized (state) {
            zJ = state.j();
            List<Throwable> listM = state.m(th2);
            thJ0 = j0(state, listM);
            if (thJ0 != null) {
                x(thJ0, listM);
            }
        }
        if (thJ0 != null && thJ0 != th2) {
            proposedUpdate = new C16610C(thJ0, false, 2, null);
        }
        if (thJ0 != null && (S(thJ0) || y0(thJ0))) {
            Intrinsics.h(proposedUpdate, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((C16610C) proposedUpdate).c();
        }
        if (!zJ) {
            O0(thJ0);
        }
        P0(proposedUpdate);
        androidx.concurrent.futures.b.a(f157579a, this, state, I0.g(proposedUpdate));
        a0(state, proposedUpdate);
        return proposedUpdate;
    }

    private final boolean e1(c state, C16670v child, Object proposedUpdate) {
        while (E0.l(child.childJob, false, new b(this, state, child, proposedUpdate)) == O0.f157610a) {
            child = L0(child);
            if (child == null) {
                return false;
            }
        }
        return true;
    }

    private final Throwable i0(Object obj) {
        C16610C c16610c = obj instanceof C16610C ? (C16610C) obj : null;
        if (c16610c != null) {
            return c16610c.cause;
        }
        return null;
    }

    protected final void A0(C0 parent) {
        if (parent == null) {
            U0(O0.f157610a);
            return;
        }
        parent.start();
        InterfaceC16668u interfaceC16668uQ0 = parent.q0(this);
        U0(interfaceC16668uQ0);
        if (A()) {
            interfaceC16668uQ0.dispose();
            U0(O0.f157610a);
        }
    }

    @Override // qv.C0
    public final InterfaceC16643h0 K(Function1<? super Throwable, Unit> handler) {
        return B0(true, new B0(handler));
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

    public boolean Y(Throwable cause) {
        if (cause instanceof CancellationException) {
            return true;
        }
        return L(cause) && getHandlesException();
    }

    public final String Z0() {
        return K0() + '{' + W0(u0()) + '}';
    }

    @Override // qv.C0
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

    @Override // qv.C0
    public final Sequence<C0> p() {
        return SequencesKt.b(new d(null));
    }

    @Override // qv.C0
    public final InterfaceC16668u q0(InterfaceC16672w child) {
        C16670v c16670v = new C16670v(child);
        c16670v.x(this);
        while (true) {
            Object objU0 = u0();
            if (objU0 instanceof C16649k0) {
                C16649k0 c16649k0 = (C16649k0) objU0;
                if (!c16649k0.getIsActive()) {
                    R0(c16649k0);
                } else if (androidx.concurrent.futures.b.a(f157579a, this, objU0, c16670v)) {
                    return c16670v;
                }
            } else {
                if (!(objU0 instanceof InterfaceC16675x0)) {
                    Object objU02 = u0();
                    C16610C c16610c = objU02 instanceof C16610C ? (C16610C) objU02 : null;
                    c16670v.w(c16610c != null ? c16610c.cause : null);
                    return O0.f157610a;
                }
                M0 list = ((InterfaceC16675x0) objU0).getList();
                if (list != null) {
                    if (!list.d(c16670v, 7)) {
                        boolean zD = list.d(c16670v, 3);
                        Object objU03 = u0();
                        if (objU03 instanceof c) {
                            thF = ((c) objU03).f();
                        } else {
                            C16610C c16610c2 = objU03 instanceof C16610C ? (C16610C) objU03 : null;
                            if (c16610c2 != null) {
                                thF = c16610c2.cause;
                            }
                        }
                        c16670v.w(thF);
                        if (!zD) {
                            return O0.f157610a;
                        }
                    }
                    return c16670v;
                }
                Intrinsics.h(objU0, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                S0((G0) objU0);
            }
        }
    }

    public String toString() {
        return Z0() + '@' + C16626T.b(this);
    }

    @Override // qv.C0
    public final InterfaceC16643h0 u(boolean onCancelling, boolean invokeImmediately, Function1<? super Throwable, Unit> handler) {
        return B0(invokeImmediately, onCancelling ? new A0(handler) : new B0(handler));
    }

    public H0(boolean z10) {
        this._state$volatile = z10 ? I0.f157601g : I0.f157600f;
    }

    private final boolean D0() {
        Object objU0;
        do {
            objU0 = u0();
            if (!(objU0 instanceof InterfaceC16675x0)) {
                return false;
            }
        } while (V0(objU0) < 0);
        return true;
    }

    private final C16670v L0(C17659o c17659o) {
        while (c17659o.q()) {
            c17659o = c17659o.m();
        }
        while (true) {
            c17659o = c17659o.l();
            if (!c17659o.q()) {
                if (c17659o instanceof C16670v) {
                    return (C16670v) c17659o;
                }
                if (c17659o instanceof M0) {
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
        for (C17659o c17659oL = (C17659o) objK; !Intrinsics.e(c17659oL, list); c17659oL = c17659oL.l()) {
            if ((c17659oL instanceof G0) && ((G0) c17659oL).v()) {
                try {
                    ((G0) c17659oL).w(cause);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        ExceptionsKt.a(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + c17659oL + " for " + this, th2);
                        Unit unit = Unit.f142422a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            z0(completionHandlerException);
        }
        S(cause);
    }

    private final Object Q(Object cause) {
        Object objC1;
        do {
            Object objU0 = u0();
            if (!(objU0 instanceof InterfaceC16675x0) || ((objU0 instanceof c) && ((c) objU0).k())) {
                return I0.f157595a;
            }
            objC1 = c1(objU0, new C16610C(c0(cause), false, 2, null));
        } while (objC1 == I0.f157597c);
        return objC1;
    }

    private final boolean S(Throwable cause) {
        if (C0()) {
            return true;
        }
        boolean z10 = cause instanceof CancellationException;
        InterfaceC16668u interfaceC16668uT0 = t0();
        if (interfaceC16668uT0 != null && interfaceC16668uT0 != O0.f157610a) {
            if (interfaceC16668uT0.b(cause) || z10) {
                return true;
            }
            return false;
        }
        return z10;
    }

    private final void a0(InterfaceC16675x0 state, Object update) throws Throwable {
        C16610C c16610c;
        InterfaceC16668u interfaceC16668uT0 = t0();
        if (interfaceC16668uT0 != null) {
            interfaceC16668uT0.dispose();
            U0(O0.f157610a);
        }
        Throwable th2 = null;
        if (update instanceof C16610C) {
            c16610c = (C16610C) update;
        } else {
            c16610c = null;
        }
        if (c16610c != null) {
            th2 = c16610c.cause;
        }
        if (state instanceof G0) {
            try {
                ((G0) state).w(th2);
                return;
            } catch (Throwable th3) {
                z0(new CompletionHandlerException("Exception in completion handler " + state + " for " + this, th3));
                return;
            }
        }
        M0 list = state.getList();
        if (list != null) {
            N0(list, th2);
        }
    }

    private final boolean a1(InterfaceC16675x0 state, Object update) throws Throwable {
        if (!androidx.concurrent.futures.b.a(f157579a, this, state, I0.g(update))) {
            return false;
        }
        O0(null);
        P0(update);
        a0(state, update);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b0(c state, C16670v lastChild, Object proposedUpdate) {
        C16670v c16670vL0 = L0(lastChild);
        if (c16670vL0 == null || !e1(state, c16670vL0, proposedUpdate)) {
            state.getList().g(2);
            C16670v c16670vL02 = L0(lastChild);
            if (c16670vL02 != null && e1(state, c16670vL02, proposedUpdate)) {
                return;
            }
            y(d0(state, proposedUpdate));
        }
    }

    private final boolean b1(InterfaceC16675x0 state, Throwable rootCause) throws Throwable {
        M0 m0P0 = p0(state);
        if (m0P0 == null) {
            return false;
        }
        if (!androidx.concurrent.futures.b.a(f157579a, this, state, new c(m0P0, false, rootCause))) {
            return false;
        }
        M0(m0P0, rootCause);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v2 */
    private final Object d1(InterfaceC16675x0 state, Object proposedUpdate) throws Throwable {
        c cVar;
        C16610C c16610c;
        M0 m0P0 = p0(state);
        if (m0P0 == null) {
            return I0.f157597c;
        }
        ?? r22 = 0;
        if (state instanceof c) {
            cVar = (c) state;
        } else {
            cVar = null;
        }
        if (cVar == null) {
            cVar = new c(m0P0, false, null);
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        synchronized (cVar) {
            if (cVar.k()) {
                return I0.f157595a;
            }
            cVar.n(true);
            if (cVar != state && !androidx.concurrent.futures.b.a(f157579a, this, state, cVar)) {
                return I0.f157597c;
            }
            boolean zJ = cVar.j();
            if (proposedUpdate instanceof C16610C) {
                c16610c = (C16610C) proposedUpdate;
            } else {
                c16610c = null;
            }
            if (c16610c != null) {
                cVar.b(c16610c.cause);
            }
            Throwable thF = cVar.f();
            if (!zJ) {
                r22 = thF;
            }
            objectRef.f142835a = r22;
            Unit unit = Unit.f142422a;
            if (r22 != 0) {
                M0(m0P0, r22);
            }
            C16670v c16670vL0 = L0(m0P0);
            if (c16670vL0 != null && e1(cVar, c16670vL0, proposedUpdate)) {
                return I0.f157596b;
            }
            m0P0.g(2);
            C16670v c16670vL02 = L0(m0P0);
            if (c16670vL02 != null && e1(cVar, c16670vL02, proposedUpdate)) {
                return I0.f157596b;
            }
            return d0(cVar, proposedUpdate);
        }
    }

    private final Throwable j0(c state, List<? extends Throwable> exceptions) {
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

    private final M0 p0(InterfaceC16675x0 state) {
        M0 list = state.getList();
        if (list == null) {
            if (state instanceof C16649k0) {
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

    @Override // qv.C0
    public final boolean A() {
        return !(u0() instanceof InterfaceC16675x0);
    }

    public final InterfaceC16643h0 B0(boolean invokeImmediately, G0 node) {
        boolean z10;
        Throwable th2;
        C16610C c16610c;
        boolean zD;
        c cVar;
        Throwable thF;
        node.x(this);
        while (true) {
            Object objU0 = u0();
            z10 = true;
            th2 = null;
            if (objU0 instanceof C16649k0) {
                C16649k0 c16649k0 = (C16649k0) objU0;
                if (c16649k0.getIsActive()) {
                    if (androidx.concurrent.futures.b.a(f157579a, this, objU0, node)) {
                        break;
                    }
                } else {
                    R0(c16649k0);
                }
            } else if (objU0 instanceof InterfaceC16675x0) {
                InterfaceC16675x0 interfaceC16675x0 = (InterfaceC16675x0) objU0;
                M0 list = interfaceC16675x0.getList();
                if (list == null) {
                    Intrinsics.h(objU0, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    S0((G0) objU0);
                } else {
                    if (node.v()) {
                        if (interfaceC16675x0 instanceof c) {
                            cVar = (c) interfaceC16675x0;
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
                            return O0.f157610a;
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
            Object objU02 = u0();
            if (objU02 instanceof C16610C) {
                c16610c = (C16610C) objU02;
            } else {
                c16610c = null;
            }
            if (c16610c != null) {
                th2 = c16610c.cause;
            }
            node.w(th2);
        }
        return O0.f157610a;
    }

    protected final Object C(Continuation<Object> continuation) throws Throwable {
        Object objU0;
        do {
            objU0 = u0();
            if (!(objU0 instanceof InterfaceC16675x0)) {
                if (!(objU0 instanceof C16610C)) {
                    return I0.h(objU0);
                }
                throw ((C16610C) objU0).cause;
            }
        } while (V0(objU0) < 0);
        return E(continuation);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext F0(CoroutineContext.Key<?> key) {
        return C0.a.d(this, key);
    }

    public final boolean G(Throwable cause) {
        return L(cause);
    }

    @Override // qv.InterfaceC16672w
    public final void H(Q0 parentJob) throws Throwable {
        L(parentJob);
    }

    public final boolean H0(Object proposedUpdate) {
        Object objC1;
        do {
            objC1 = c1(u0(), proposedUpdate);
            if (objC1 == I0.f157595a) {
                return false;
            }
            if (objC1 == I0.f157596b) {
                return true;
            }
        } while (objC1 == I0.f157597c);
        y(objC1);
        return true;
    }

    public final Object I0(Object proposedUpdate) {
        Object objC1;
        do {
            objC1 = c1(u0(), proposedUpdate);
            if (objC1 == I0.f157595a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + proposedUpdate, i0(proposedUpdate));
            }
        } while (objC1 == I0.f157597c);
        return objC1;
    }

    public String K0() {
        return C16626T.a(this);
    }

    public final boolean L(Object cause) throws Throwable {
        Object objG0 = I0.f157595a;
        if (o0() && (objG0 = Q(cause)) == I0.f157596b) {
            return true;
        }
        if (objG0 == I0.f157595a) {
            objG0 = G0(cause);
        }
        if (objG0 == I0.f157595a || objG0 == I0.f157596b) {
            return true;
        }
        if (objG0 == I0.f157598d) {
            return false;
        }
        y(objG0);
        return true;
    }

    public void P(Throwable cause) throws Throwable {
        L(cause);
    }

    public final void T0(G0 node) {
        Object objU0;
        do {
            objU0 = u0();
            if (objU0 instanceof G0) {
                if (objU0 != node) {
                    return;
                }
            } else {
                if ((objU0 instanceof InterfaceC16675x0) && ((InterfaceC16675x0) objU0).getList() != null) {
                    node.r();
                    return;
                }
                return;
            }
        } while (!androidx.concurrent.futures.b.a(f157579a, this, objU0, I0.f157601g));
    }

    public final void U0(InterfaceC16668u interfaceC16668u) {
        f157580b.set(this, interfaceC16668u);
    }

    @Override // qv.C0
    public boolean a() {
        Object objU0 = u0();
        if ((objU0 instanceof InterfaceC16675x0) && ((InterfaceC16675x0) objU0).getIsActive()) {
            return true;
        }
        return false;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R b(R r10, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) C0.a.b(this, r10, function2);
    }

    public final Object e0() throws Throwable {
        Object objU0 = u0();
        if (!(objU0 instanceof InterfaceC16675x0)) {
            if (!(objU0 instanceof C16610C)) {
                return I0.h(objU0);
            }
            throw ((C16610C) objU0).cause;
        }
        throw new IllegalStateException("This job has not completed yet");
    }

    protected final Throwable f0() {
        Object objU0 = u0();
        if (objU0 instanceof c) {
            Throwable thF = ((c) objU0).f();
            if (thF != null) {
                return thF;
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (!(objU0 instanceof InterfaceC16675x0)) {
            if (objU0 instanceof C16610C) {
                return ((C16610C) objU0).cause;
            }
            return null;
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E g(CoroutineContext.Key<E> key) {
        return (E) C0.a.c(this, key);
    }

    protected final boolean g0() {
        Object objU0 = u0();
        if ((objU0 instanceof C16610C) && ((C16610C) objU0).a()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    @Override // qv.Q0
    public CancellationException h0() {
        CancellationException cancellationExceptionF;
        Object objU0 = u0();
        CancellationException cancellationException = null;
        if (objU0 instanceof c) {
            cancellationExceptionF = ((c) objU0).f();
        } else if (objU0 instanceof C16610C) {
            cancellationExceptionF = ((C16610C) objU0).cause;
        } else if (!(objU0 instanceof InterfaceC16675x0)) {
            cancellationExceptionF = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + objU0).toString());
        }
        if (cancellationExceptionF instanceof CancellationException) {
            cancellationException = cancellationExceptionF;
        }
        if (cancellationException == null) {
            return new JobCancellationException("Parent job is " + W0(objU0), cancellationExceptionF, this);
        }
        return cancellationException;
    }

    @Override // qv.C0
    public final boolean isCancelled() {
        Object objU0 = u0();
        if (!(objU0 instanceof C16610C)) {
            if (!(objU0 instanceof c) || !((c) objU0).j()) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext m0(CoroutineContext coroutineContext) {
        return C0.a.e(this, coroutineContext);
    }

    @Override // qv.C0
    public final Object n0(Continuation<? super Unit> continuation) {
        if (!D0()) {
            E0.i(continuation.getContext());
            return Unit.f142422a;
        }
        Object objE0 = E0(continuation);
        if (objE0 == IntrinsicsKt.f()) {
            return objE0;
        }
        return Unit.f142422a;
    }

    public C0 s0() {
        InterfaceC16668u interfaceC16668uT0 = t0();
        if (interfaceC16668uT0 != null) {
            return interfaceC16668uT0.getParent();
        }
        return null;
    }

    @Override // qv.C0
    public final boolean start() {
        int iV0;
        do {
            iV0 = V0(u0());
            if (iV0 == 0) {
                return false;
            }
        } while (iV0 != 1);
        return true;
    }

    public final InterfaceC16668u t0() {
        return (InterfaceC16668u) f157580b.get(this);
    }

    public final Object u0() {
        return f157579a.get(this);
    }

    @Override // qv.C0
    public final CancellationException z() {
        Object objU0 = u0();
        if (objU0 instanceof c) {
            Throwable thF = ((c) objU0).f();
            if (thF != null) {
                CancellationException cancellationExceptionX0 = X0(thF, C16626T.a(this) + " is cancelling");
                if (cancellationExceptionX0 != null) {
                    return cancellationExceptionX0;
                }
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (!(objU0 instanceof InterfaceC16675x0)) {
            if (objU0 instanceof C16610C) {
                return Y0(this, ((C16610C) objU0).cause, null, 1, null);
            }
            return new JobCancellationException(C16626T.a(this) + " has completed normally", null, this);
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }
}
