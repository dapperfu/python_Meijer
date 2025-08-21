package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.g;
import androidx.compose.runtime.snapshots.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C0;
import mv.C15805i;
import mv.C15819p;
import mv.C15822q0;
import mv.InterfaceC15769A;
import mv.InterfaceC15783O;
import mv.InterfaceC15815n;
import pv.C16563h;
import pv.InterfaceC16549B;

@Metadata(d1 = {"\u0000¬\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 Í\u00012\u00020\u0001:\u0004FTgjB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\u001f\u0010 JN\u0010+\u001a\u00020\u00072<\u0010*\u001a8\b\u0001\u0012\u0004\u0012\u00020\"\u0012\u0013\u0012\u00110#¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070'\u0012\u0006\u0012\u0004\u0018\u00010(0!¢\u0006\u0002\b)H\u0082@¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0013H\u0002¢\u0006\u0004\b-\u0010\u001cJ)\u00100\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001a\u001a\u00020\u00132\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010.H\u0002¢\u0006\u0004\b0\u00101J3\u00105\u001a\b\u0012\u0004\u0012\u00020\u0013022\f\u00104\u001a\b\u0012\u0004\u0012\u000203022\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010.H\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0007H\u0002¢\u0006\u0004\b7\u0010\u0019J#\u00109\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u0007082\u0006\u0010\u001a\u001a\u00020\u0013H\u0002¢\u0006\u0004\b9\u0010:J3\u0010;\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u0007082\u0006\u0010\u001a\u001a\u00020\u00132\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010.H\u0002¢\u0006\u0004\b;\u0010<J\u0017\u0010?\u001a\u00020\u00072\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020\u0007H\u0086@¢\u0006\u0004\bA\u0010 J\r\u0010B\u001a\u00020\u0007¢\u0006\u0004\bB\u0010\u0019J\u0010\u0010C\u001a\u00020\u0007H\u0086@¢\u0006\u0004\bC\u0010 J%\u0010F\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00132\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00070DH\u0010¢\u0006\u0004\bF\u0010GJ\r\u0010H\u001a\u00020\u0007¢\u0006\u0004\bH\u0010\u0019J\r\u0010I\u001a\u00020\u0007¢\u0006\u0004\bI\u0010\u0019J\u001d\u0010M\u001a\u00020\u00072\f\u0010L\u001a\b\u0012\u0004\u0012\u00020K0JH\u0010¢\u0006\u0004\bM\u0010NJ\u0017\u0010O\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0013H\u0010¢\u0006\u0004\bO\u0010\u001cJ\u0017\u0010P\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0013H\u0010¢\u0006\u0004\bP\u0010\u001cJ\u0017\u0010R\u001a\u00020\u00072\u0006\u0010Q\u001a\u000203H\u0010¢\u0006\u0004\bR\u0010SJ\u0017\u0010T\u001a\u00020\u00072\u0006\u0010Q\u001a\u000203H\u0010¢\u0006\u0004\bT\u0010SJ+\u0010Y\u001a\u00020\u00072\u0006\u0010Q\u001a\u0002032\u0006\u0010V\u001a\u00020U2\n\u0010X\u001a\u0006\u0012\u0002\b\u00030WH\u0010¢\u0006\u0004\bY\u0010ZJ\u0017\u0010[\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0013H\u0010¢\u0006\u0004\b[\u0010\u001cJ\u0019\u0010\\\u001a\u0004\u0018\u00010U2\u0006\u0010Q\u001a\u000203H\u0010¢\u0006\u0004\b\\\u0010]R$\u0010c\u001a\u00020^2\u0006\u0010_\u001a\u00020^8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bF\u0010`\u001a\u0004\ba\u0010bR\u0014\u0010f\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010eR\u0014\u0010i\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0018\u0010l\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u0018\u0010n\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010mR\u001a\u0010r\u001a\b\u0012\u0004\u0012\u00020\u00130o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u001e\u0010t\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010qR\u001c\u0010w\u001a\b\u0012\u0004\u0012\u00020(0.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u001a\u0010{\u001a\b\u0012\u0004\u0012\u00020\u00130x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u001a\u0010|\u001a\b\u0012\u0004\u0012\u00020\u00130o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010qR\u001a\u0010}\u001a\b\u0012\u0004\u0012\u0002030o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010qR0\u0010\u0081\u0001\u001a\u0016\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u007f\u0012\u0004\u0012\u0002030~8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0007\n\u0005\bY\u0010\u0080\u0001R\u0017\u0010\u0084\u0001\u001a\u00030\u0082\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\\\u0010\u0083\u0001R#\u0010\u0086\u0001\u001a\u000f\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020U0\u0085\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bM\u0010\u0080\u0001R)\u0010\u0088\u0001\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u0002030~8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0080\u0001R\u001f\u0010\u0089\u0001\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010o8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010qR!\u0010\u008c\u0001\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R!\u0010\u008f\u0001\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0019\u0010\u0092\u0001\u001a\u00030\u0090\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bO\u0010\u0091\u0001R\u0018\u0010\u0094\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0093\u0001\u0010BR\u001c\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0095\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0018\u0010\u009a\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0099\u0001\u0010BR\u001f\u0010\u009f\u0001\u001a\n\u0012\u0005\u0012\u00030\u009c\u00010\u009b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R'\u0010¤\u0001\u001a\u0012\u0012\r\u0012\u000b\u0012\u0005\u0012\u00030¡\u0001\u0018\u00010.0 \u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R\u0018\u0010¨\u0001\u001a\u00030¥\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R\u001d\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b©\u0001\u0010ª\u0001\u001a\u0005\bu\u0010«\u0001R*\u0010±\u0001\u001a\f\u0012\u0005\u0012\u00030\u00ad\u0001\u0018\u00010¬\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u000f\n\u0006\b®\u0001\u0010¯\u0001\u0012\u0005\b°\u0001\u0010\u0019R\u001c\u0010µ\u0001\u001a\u00070²\u0001R\u00020\u00008\u0002X\u0082\u0004¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001R\u001d\u0010¸\u0001\u001a\b\u0012\u0004\u0012\u00020\u0013028BX\u0082\u0004¢\u0006\b\u001a\u0006\b¶\u0001\u0010·\u0001R\u0016\u0010º\u0001\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¹\u0001\u0010\fR\u0016\u0010¼\u0001\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b»\u0001\u0010\fR\u0016\u0010¾\u0001\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b½\u0001\u0010\fR\u0016\u0010À\u0001\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¿\u0001\u0010\fR\u0016\u0010Â\u0001\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÁ\u0001\u0010\fR\u001c\u0010Æ\u0001\u001a\n\u0012\u0005\u0012\u00030\u009c\u00010Ã\u00018F¢\u0006\b\u001a\u0006\bÄ\u0001\u0010Å\u0001R\u0017\u0010È\u0001\u001a\u00030\u0090\u00018PX\u0090\u0004¢\u0006\u0007\u001a\u0005\bs\u0010Ç\u0001R\u0015\u0010É\u0001\u001a\u00020\n8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bj\u0010\fR\u0015\u0010Ê\u0001\u001a\u00020\n8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\fR\u0016\u0010Ì\u0001\u001a\u00020\n8PX\u0090\u0004¢\u0006\u0007\u001a\u0005\bË\u0001\u0010\f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Î\u0001"}, d2 = {"Landroidx/compose/runtime/Recomposer;", "Landroidx/compose/runtime/k;", "Lkotlin/coroutines/CoroutineContext;", "effectCoroutineContext", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "Lmv/n;", "", "c0", "()Lmv/n;", "", "w0", "()Z", "Lmv/C0;", "callingJob", "y0", "(Lmv/C0;)V", "", "e", "Landroidx/compose/runtime/z;", "failedInitialComposition", "recoverable", "s0", "(Ljava/lang/Throwable;Landroidx/compose/runtime/z;Z)V", "a0", "()V", "composition", "z0", "(Landroidx/compose/runtime/z;)V", "W", "x0", "Y", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function3;", "Lmv/O;", "Landroidx/compose/runtime/b0;", "Lkotlin/ParameterName;", "name", "parentFrameClock", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "v0", "(Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "o0", "LZ/X;", "modifiedValues", "r0", "(Landroidx/compose/runtime/z;LZ/X;)Landroidx/compose/runtime/z;", "", "Landroidx/compose/runtime/g0;", "references", "q0", "(Ljava/util/List;LZ/X;)Ljava/util/List;", "d0", "Lkotlin/Function1;", "u0", "(Landroidx/compose/runtime/z;)Lkotlin/jvm/functions/Function1;", "C0", "(Landroidx/compose/runtime/z;LZ/X;)Lkotlin/jvm/functions/Function1;", "Landroidx/compose/runtime/snapshots/b;", "snapshot", "X", "(Landroidx/compose/runtime/snapshots/b;)V", "B0", "Z", "m0", "Lkotlin/Function0;", "content", "a", "(Landroidx/compose/runtime/z;Lkotlin/jvm/functions/Function2;)V", "n0", "A0", "", "LO0/a;", "table", "n", "(Ljava/util/Set;)V", "s", "k", "reference", "j", "(Landroidx/compose/runtime/g0;)V", "b", "Landroidx/compose/runtime/f0;", "data", "Landroidx/compose/runtime/Applier;", "applier", "l", "(Landroidx/compose/runtime/g0;Landroidx/compose/runtime/f0;Landroidx/compose/runtime/Applier;)V", "p", "m", "(Landroidx/compose/runtime/g0;)Landroidx/compose/runtime/f0;", "", "<set-?>", "J", "e0", "()J", "changeCount", "Landroidx/compose/runtime/c;", "Landroidx/compose/runtime/c;", "broadcastFrameClock", "c", "Ljava/lang/Object;", "stateLock", "d", "Lmv/C0;", "runnerJob", "Ljava/lang/Throwable;", "closeCause", "", "f", "Ljava/util/List;", "_knownCompositions", "g", "_knownCompositionsCache", "h", "LZ/X;", "snapshotInvalidations", "LD0/c;", "i", "LD0/c;", "compositionInvalidations", "compositionsAwaitingApply", "movableContentAwaitingInsert", "LD0/b;", "Landroidx/compose/runtime/e0;", "LZ/W;", "movableContentRemoved", "Landroidx/compose/runtime/m0;", "Landroidx/compose/runtime/m0;", "movableContentNestedStatesAvailable", "LZ/W;", "movableContentStatesAvailable", "o", "movableContentNestedExtractionsPending", "failedCompositions", "q", "Ljava/util/Set;", "compositionsRemoved", "r", "Lmv/n;", "workContinuation", "", "I", "concurrentCompositionsOutstanding", "t", "isClosed", "Landroidx/compose/runtime/Recomposer$b;", "u", "Landroidx/compose/runtime/Recomposer$b;", "errorState", "v", "frameClockPaused", "Lpv/B;", "Landroidx/compose/runtime/Recomposer$d;", "w", "Lpv/B;", "_state", "LJ0/j;", "Landroidx/compose/runtime/I0;", "x", "LJ0/j;", "pausedScopes", "Lmv/A;", "y", "Lmv/A;", "effectJob", "z", "Lkotlin/coroutines/CoroutineContext;", "()Lkotlin/coroutines/CoroutineContext;", "LZ/T;", "LO0/d;", "A", "LZ/T;", "getRegistrationObservers$annotations", "registrationObservers", "Landroidx/compose/runtime/Recomposer$c;", "B", "Landroidx/compose/runtime/Recomposer$c;", "recomposerInfo", "k0", "()Ljava/util/List;", "knownCompositions", "h0", "hasBroadcastFrameClockAwaitersLocked", "g0", "hasBroadcastFrameClockAwaiters", "l0", "shouldKeepRecomposing", "j0", "hasSchedulingWork", "i0", "hasFrameWorkLocked", "Lpv/P;", "f0", "()Lpv/P;", "currentState", "()I", "compoundHashKey", "collectingCallByInformation", "collectingParameterInformation", "getCollectingSourceInformation$runtime_release", "collectingSourceInformation", "C", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class Recomposer extends AbstractC5869k {

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: D, reason: collision with root package name */
    public static final int f50253D = 8;

    /* renamed from: E, reason: collision with root package name */
    private static final InterfaceC16549B<E0.g<c>> f50254E = pv.S.a(E0.a.c());

    /* renamed from: F, reason: collision with root package name */
    private static final AtomicReference<Boolean> f50255F = new AtomicReference<>(Boolean.FALSE);

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private Z.T<O0.d> registrationObservers;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final c recomposerInfo;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private long changeCount;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C5842c broadcastFrameClock;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Object stateLock;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private mv.C0 runnerJob;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Throwable closeCause;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List<InterfaceC5898z> _knownCompositions;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private List<? extends InterfaceC5898z> _knownCompositionsCache;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Z.X<Object> snapshotInvalidations;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final D0.c<InterfaceC5898z> compositionInvalidations;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final List<InterfaceC5898z> compositionsAwaitingApply;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final List<C5862g0> movableContentAwaitingInsert;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Z.W<Object, Object> movableContentRemoved;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final C5874m0 movableContentNestedStatesAvailable;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Z.W<C5862g0, C5860f0> movableContentStatesAvailable;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Z.W<Object, Object> movableContentNestedExtractionsPending;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private List<InterfaceC5898z> failedCompositions;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private Set<InterfaceC5898z> compositionsRemoved;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private InterfaceC15815n<? super Unit> workContinuation;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private int concurrentCompositionsOutstanding;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean isClosed;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private b errorState;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean frameClockPaused;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<d> _state;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final J0.j<Z.X<I0>> pausedScopes;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15769A effectJob;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext effectCoroutineContext;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004R\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004R\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\tR4\u0010\u000f\u001a\"\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u000bj\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f`\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R$\u0010\u0013\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0004R\u00020\u00050\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/runtime/Recomposer$a;", "", "<init>", "()V", "Landroidx/compose/runtime/Recomposer$c;", "Landroidx/compose/runtime/Recomposer;", "info", "", "c", "(Landroidx/compose/runtime/Recomposer$c;)V", "d", "Ljava/util/concurrent/atomic/AtomicReference;", "", "kotlin.jvm.PlatformType", "Landroidx/compose/runtime/internal/AtomicReference;", "_hotReloadEnabled", "Ljava/util/concurrent/atomic/AtomicReference;", "Lpv/B;", "LE0/g;", "_runningRecomposers", "Lpv/B;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: androidx.compose.runtime.Recomposer$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void c(c info) {
            E0.g gVar;
            E0.g gVarAdd;
            do {
                gVar = (E0.g) Recomposer.f50254E.getValue();
                gVarAdd = gVar.add((E0.g) info);
                if (gVar == gVarAdd) {
                    return;
                }
            } while (!Recomposer.f50254E.e(gVar, gVarAdd));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(c info) {
            E0.g gVar;
            E0.g gVarRemove;
            do {
                gVar = (E0.g) Recomposer.f50254E.getValue();
                gVarRemove = gVar.remove((E0.g) info);
                if (gVar == gVarRemove) {
                    return;
                }
            } while (!Recomposer.f50254E.e(gVar, gVarRemove));
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/runtime/Recomposer$b;", "", "", "recoverable", "", "cause", "<init>", "(ZLjava/lang/Throwable;)V", "a", "Z", "getRecoverable", "()Z", "b", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final boolean recoverable;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Throwable cause;

        /* renamed from: a, reason: from getter */
        public Throwable getCause() {
            return this.cause;
        }

        public b(boolean z10, Throwable th2) {
            this.recoverable = z10;
            this.cause = th2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/Recomposer$c;", "", "<init>", "(Landroidx/compose/runtime/Recomposer;)V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    private final class c {
        public c() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Landroidx/compose/runtime/Recomposer$d;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public static final d f50287a = new d("ShutDown", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final d f50288b = new d("ShuttingDown", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final d f50289c = new d("Inactive", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final d f50290d = new d("InactivePendingWork", 3);

        /* renamed from: e, reason: collision with root package name */
        public static final d f50291e = new d("Idle", 4);

        /* renamed from: f, reason: collision with root package name */
        public static final d f50292f = new d("PendingWork", 5);

        /* renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ d[] f50293g;

        /* renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f50294h;

        private static final /* synthetic */ d[] a() {
            return new d[]{f50287a, f50288b, f50289c, f50290d, f50291e, f50292f};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f50293g.clone();
        }

        static {
            d[] dVarArrA = a();
            f50293g = dVarArrA;
            f50294h = EnumEntriesKt.a(dVarArrA);
        }

        private d(String str, int i10) {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    static final class e extends Lambda implements Function0<Unit> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            InterfaceC15815n interfaceC15815nC0;
            Object obj = Recomposer.this.stateLock;
            Recomposer recomposer = Recomposer.this;
            synchronized (obj) {
                interfaceC15815nC0 = recomposer.c0();
                if (((d) recomposer._state.getValue()).compareTo(d.f50288b) <= 0) {
                    throw C15822q0.a("Recomposer shutdown; frame clock awaiter will never resume", recomposer.closeCause);
                }
            }
            if (interfaceC15815nC0 != null) {
                Result.Companion companion = Result.INSTANCE;
                interfaceC15815nC0.resumeWith(Result.b(Unit.f143329a));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "throwable", "", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class f extends Lambda implements Function1<Throwable, Unit> {

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "runnerJobCause", "", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        static final class a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Recomposer f50297f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Throwable f50298g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Recomposer recomposer, Throwable th2) {
                super(1);
                this.f50297f = recomposer;
                this.f50298g = th2;
            }

            public final void a(Throwable th2) {
                Object obj = this.f50297f.stateLock;
                Recomposer recomposer = this.f50297f;
                Throwable th3 = this.f50298g;
                synchronized (obj) {
                    if (th3 == null) {
                        th3 = null;
                    } else if (th2 != null) {
                        try {
                            if (th2 instanceof CancellationException) {
                                th2 = null;
                            }
                            if (th2 != null) {
                                ExceptionsKt.a(th3, th2);
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    recomposer.closeCause = th3;
                    recomposer._state.setValue(d.f50287a);
                    Unit unit = Unit.f143329a;
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                a(th2);
                return Unit.f143329a;
            }
        }

        f() {
            super(1);
        }

        public final void a(Throwable th2) {
            InterfaceC15815n interfaceC15815n;
            InterfaceC15815n interfaceC15815n2;
            CancellationException cancellationExceptionA = C15822q0.a("Recomposer effect job completed", th2);
            Object obj = Recomposer.this.stateLock;
            Recomposer recomposer = Recomposer.this;
            synchronized (obj) {
                try {
                    mv.C0 c02 = recomposer.runnerJob;
                    interfaceC15815n = null;
                    if (c02 != null) {
                        recomposer._state.setValue(d.f50288b);
                        if (recomposer.isClosed) {
                            if (recomposer.workContinuation != null) {
                                interfaceC15815n2 = recomposer.workContinuation;
                            }
                            recomposer.workContinuation = null;
                            c02.R(new a(recomposer, th2));
                            interfaceC15815n = interfaceC15815n2;
                        } else {
                            c02.d(cancellationExceptionA);
                        }
                        interfaceC15815n2 = null;
                        recomposer.workContinuation = null;
                        c02.R(new a(recomposer, th2));
                        interfaceC15815n = interfaceC15815n2;
                    } else {
                        recomposer.closeCause = cancellationExceptionA;
                        recomposer._state.setValue(d.f50287a);
                        Unit unit = Unit.f143329a;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (interfaceC15815n != null) {
                Result.Companion companion = Result.INSTANCE;
                interfaceC15815n.resumeWith(Result.b(Unit.f143329a));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    static final class h extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Z.X<Object> f50301f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC5898z f50302g;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Z.X<Object> x10, InterfaceC5898z interfaceC5898z) {
            super(0);
            this.f50301f = x10;
            this.f50302g = interfaceC5898z;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Z.X<Object> x10 = this.f50301f;
            InterfaceC5898z interfaceC5898z = this.f50302g;
            Object[] objArr = x10.elements;
            long[] jArr = x10.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            interfaceC5898z.r(objArr[(i10 << 3) + i12]);
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        return;
                    }
                }
                if (i10 == length) {
                    return;
                } else {
                    i10++;
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "value", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class i extends Lambda implements Function1<Object, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC5898z f50303f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(InterfaceC5898z interfaceC5898z) {
            super(1);
            this.f50303f = interfaceC5898z;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2(obj);
            return Unit.f143329a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Object obj) {
            this.f50303f.a(obj);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", f = "Recomposer.kt", l = {1072}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class j extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f50304a;

        /* renamed from: b, reason: collision with root package name */
        int f50305b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f50306c;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC15783O, InterfaceC5840b0, Continuation<? super Unit>, Object> f50308e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC5840b0 f50309f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$3", f = "Recomposer.kt", l = {1072}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f50310a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f50311b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function3<InterfaceC15783O, InterfaceC5840b0, Continuation<? super Unit>, Object> f50312c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5840b0 f50313d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(Function3<? super InterfaceC15783O, ? super InterfaceC5840b0, ? super Continuation<? super Unit>, ? extends Object> function3, InterfaceC5840b0 interfaceC5840b0, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f50312c = function3;
                this.f50313d = interfaceC5840b0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f50312c, this.f50313d, continuation);
                aVar.f50311b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f50310a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f50311b;
                    Function3<InterfaceC15783O, InterfaceC5840b0, Continuation<? super Unit>, Object> function3 = this.f50312c;
                    InterfaceC5840b0 interfaceC5840b0 = this.f50313d;
                    this.f50310a = 1;
                    if (function3.invoke(interfaceC15783O, interfaceC5840b0, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "changed", "Landroidx/compose/runtime/snapshots/g;", "<anonymous parameter 1>", "", "a", "(Ljava/util/Set;Landroidx/compose/runtime/snapshots/g;)V"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        static final class b extends Lambda implements Function2<Set<? extends Object>, androidx.compose.runtime.snapshots.g, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Recomposer f50314f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Recomposer recomposer) {
                super(2);
                this.f50314f = recomposer;
            }

            public final void a(Set<? extends Object> set, androidx.compose.runtime.snapshots.g gVar) {
                InterfaceC15815n interfaceC15815nC0;
                Object obj = this.f50314f.stateLock;
                Recomposer recomposer = this.f50314f;
                synchronized (obj) {
                    try {
                        if (((d) recomposer._state.getValue()).compareTo(d.f50291e) >= 0) {
                            Z.X x10 = recomposer.snapshotInvalidations;
                            if (set instanceof D0.e) {
                                Z.j0 j0VarA = ((D0.e) set).a();
                                Object[] objArr = j0VarA.elements;
                                long[] jArr = j0VarA.metadata;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i10 = 0;
                                    while (true) {
                                        long j10 = jArr[i10];
                                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i11 = 8 - ((~(i10 - length)) >>> 31);
                                            for (int i12 = 0; i12 < i11; i12++) {
                                                if ((255 & j10) < 128) {
                                                    Object obj2 = objArr[(i10 << 3) + i12];
                                                    if (!(obj2 instanceof M0.x) || ((M0.x) obj2).w(androidx.compose.runtime.snapshots.e.a(1))) {
                                                        x10.h(obj2);
                                                    }
                                                }
                                                j10 >>= 8;
                                            }
                                            if (i11 != 8) {
                                                break;
                                            }
                                        }
                                        if (i10 == length) {
                                            break;
                                        } else {
                                            i10++;
                                        }
                                    }
                                }
                            } else {
                                for (Object obj3 : set) {
                                    if (!(obj3 instanceof M0.x) || ((M0.x) obj3).w(androidx.compose.runtime.snapshots.e.a(1))) {
                                        x10.h(obj3);
                                    }
                                }
                            }
                            interfaceC15815nC0 = recomposer.c0();
                        } else {
                            interfaceC15815nC0 = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (interfaceC15815nC0 != null) {
                    Result.Companion companion = Result.INSTANCE;
                    interfaceC15815nC0.resumeWith(Result.b(Unit.f143329a));
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Set<? extends Object> set, androidx.compose.runtime.snapshots.g gVar) {
                a(set, gVar);
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(Function3<? super InterfaceC15783O, ? super InterfaceC5840b0, ? super Continuation<? super Unit>, ? extends Object> function3, InterfaceC5840b0 interfaceC5840b0, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f50308e = function3;
            this.f50309f = interfaceC5840b0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            j jVar = Recomposer.this.new j(this.f50308e, this.f50309f, continuation);
            jVar.f50306c = obj;
            return jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((j) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:56:0x00cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:58:0x009c A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 233
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmv/O;", "Landroidx/compose/runtime/b0;", "parentFrameClock", "", "<anonymous>", "(Lmv/O;Landroidx/compose/runtime/b0;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", l = {580, 591}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class k extends SuspendLambda implements Function3<InterfaceC15783O, InterfaceC5840b0, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f50315a;

        /* renamed from: b, reason: collision with root package name */
        Object f50316b;

        /* renamed from: c, reason: collision with root package name */
        Object f50317c;

        /* renamed from: d, reason: collision with root package name */
        Object f50318d;

        /* renamed from: e, reason: collision with root package name */
        Object f50319e;

        /* renamed from: f, reason: collision with root package name */
        Object f50320f;

        /* renamed from: g, reason: collision with root package name */
        Object f50321g;

        /* renamed from: h, reason: collision with root package name */
        Object f50322h;

        /* renamed from: i, reason: collision with root package name */
        int f50323i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f50324j;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "frameTime", "", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        static final class a extends Lambda implements Function1<Long, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Recomposer f50326f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Z.X<Object> f50327g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Z.X<InterfaceC5898z> f50328h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ List<InterfaceC5898z> f50329i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ List<C5862g0> f50330j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ Z.X<InterfaceC5898z> f50331k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ List<InterfaceC5898z> f50332l;

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ Z.X<InterfaceC5898z> f50333m;

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ Set<Object> f50334n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Recomposer recomposer, Z.X<Object> x10, Z.X<InterfaceC5898z> x11, List<InterfaceC5898z> list, List<C5862g0> list2, Z.X<InterfaceC5898z> x12, List<InterfaceC5898z> list3, Z.X<InterfaceC5898z> x13, Set<? extends Object> set) {
                super(1);
                this.f50326f = recomposer;
                this.f50327g = x10;
                this.f50328h = x11;
                this.f50329i = list;
                this.f50330j = list2;
                this.f50331k = x12;
                this.f50332l = list3;
                this.f50333m = x13;
                this.f50334n = set;
            }

            /* JADX WARN: Removed duplicated region for block: B:132:0x020e A[Catch: all -> 0x00df, TryCatch #18 {all -> 0x00df, blocks: (B:11:0x0049, B:12:0x0050, B:19:0x007d, B:20:0x007e, B:21:0x0084, B:23:0x008d, B:26:0x0098, B:28:0x00a1, B:38:0x00db, B:47:0x00f2, B:54:0x0100, B:55:0x0103, B:56:0x0104, B:90:0x0183, B:94:0x018c, B:95:0x018f, B:83:0x016b, B:97:0x0194, B:119:0x01ed, B:132:0x020e, B:133:0x0212, B:135:0x0216, B:136:0x0217, B:138:0x022b, B:139:0x022c, B:126:0x0201, B:130:0x020a, B:131:0x020d, B:149:0x0256, B:151:0x025f, B:180:0x02ea, B:191:0x0316, B:155:0x026e, B:156:0x0272, B:179:0x02e9, B:192:0x0323, B:193:0x0324, B:198:0x0334, B:203:0x033d, B:204:0x0340, B:205:0x0341, B:206:0x0342, B:29:0x00ac, B:31:0x00b6, B:34:0x00c5, B:36:0x00cf, B:182:0x02f0, B:183:0x02f3, B:185:0x02fc, B:134:0x0213, B:140:0x022d, B:142:0x0237, B:144:0x0243, B:147:0x0250, B:13:0x0051, B:15:0x005e, B:18:0x0074, B:99:0x019a, B:102:0x01a4, B:104:0x01b2, B:106:0x01be, B:108:0x01c4, B:157:0x0273, B:159:0x0281, B:161:0x028d, B:163:0x0293, B:166:0x029d, B:167:0x02a0, B:169:0x02ac, B:171:0x02b8, B:173:0x02be, B:177:0x02d5, B:176:0x02cd, B:178:0x02da), top: B:245:0x0049, inners: #0, #5, #7, #9, #11, #12, #14 }] */
            /* JADX WARN: Removed duplicated region for block: B:211:0x0111 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:223:0x0213 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:233:0x019a A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:77:0x015c  */
            /* JADX WARN: Removed duplicated region for block: B:96:0x0190  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a(long r28) {
                /*
                    Method dump skipped, instructions count: 841
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.k.a.a(long):void");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l10) {
                a(l10.longValue());
                return Unit.f143329a;
            }
        }

        k(Continuation<? super k> continuation) {
            super(3, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0100  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final void l(androidx.compose.runtime.Recomposer r22, java.util.List<androidx.compose.runtime.InterfaceC5898z> r23, java.util.List<androidx.compose.runtime.C5862g0> r24, java.util.List<androidx.compose.runtime.InterfaceC5898z> r25, Z.X<androidx.compose.runtime.InterfaceC5898z> r26, Z.X<androidx.compose.runtime.InterfaceC5898z> r27, Z.X<java.lang.Object> r28, Z.X<androidx.compose.runtime.InterfaceC5898z> r29) {
            /*
                Method dump skipped, instructions count: 270
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.k.l(androidx.compose.runtime.Recomposer, java.util.List, java.util.List, java.util.List, Z.X, Z.X, Z.X, Z.X):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00df  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x010f  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0118  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0101 -> B:24:0x0109). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x010f -> B:12:0x00ac). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 283
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC15783O interfaceC15783O, InterfaceC5840b0 interfaceC5840b0, Continuation<? super Unit> continuation) {
            k kVar = Recomposer.this.new k(continuation);
            kVar.f50324j = interfaceC5840b0;
            return kVar.invokeSuspend(Unit.f143329a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void o(List<C5862g0> list, Recomposer recomposer) {
            list.clear();
            synchronized (recomposer.stateLock) {
                try {
                    List list2 = recomposer.movableContentAwaitingInsert;
                    int size = list2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        list.add((C5862g0) list2.get(i10));
                    }
                    recomposer.movableContentAwaitingInsert.clear();
                    Unit unit = Unit.f143329a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "value", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class l extends Lambda implements Function1<Object, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC5898z f50335f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Z.X<Object> f50336g;

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2(obj);
            return Unit.f143329a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(InterfaceC5898z interfaceC5898z, Z.X<Object> x10) {
            super(1);
            this.f50335f = interfaceC5898z;
            this.f50336g = x10;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Object obj) {
            this.f50335f.r(obj);
            Z.X<Object> x10 = this.f50336g;
            if (x10 != null) {
                x10.h(obj);
            }
        }
    }

    @Override // androidx.compose.runtime.AbstractC5869k
    public boolean e() {
        return false;
    }

    @Override // androidx.compose.runtime.AbstractC5869k
    public int g() {
        return 1000;
    }

    @Override // androidx.compose.runtime.AbstractC5869k
    public boolean getCollectingSourceInformation$runtime_release() {
        return false;
    }

    @Override // androidx.compose.runtime.AbstractC5869k
    public void n(Set<O0.a> table) {
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/runtime/Recomposer$d;", "it", "", "<anonymous>", "(Landroidx/compose/runtime/Recomposer$d;)Z"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.runtime.Recomposer$join$2", f = "Recomposer.kt", l = {}, m = "invokeSuspend")
    static final class g extends SuspendLambda implements Function2<d, Continuation<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f50299a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f50300b;

        g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            g gVar = new g(continuation);
            gVar.f50300b = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(d dVar, Continuation<? super Boolean> continuation) {
            return ((g) create(dVar, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z10;
            IntrinsicsKt.f();
            if (this.f50299a == 0) {
                ResultKt.b(obj);
                if (((d) this.f50300b) == d.f50287a) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boxing.a(z10);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private final Function1<Object, Unit> C0(InterfaceC5898z composition, Z.X<Object> modifiedValues) {
        return new l(composition, modifiedValues);
    }

    private final void W(InterfaceC5898z composition) {
        this._knownCompositions.add(composition);
        this._knownCompositionsCache = null;
        Z.T<O0.d> t10 = this.registrationObservers;
        if (t10 != null) {
            Object[] objArr = t10.content;
            int i10 = t10._size;
            for (int i11 = 0; i11 < i10; i11++) {
                ((O0.d) objArr[i11]).a(this, composition);
            }
        }
    }

    private final void a0() {
        Z.T<O0.d> t10 = this.registrationObservers;
        if (t10 != null) {
            Object[] objArr = t10.content;
            int i10 = t10._size;
            for (int i11 = 0; i11 < i10; i11++) {
                O0.d dVar = (O0.d) objArr[i11];
                Iterator<T> it = k0().iterator();
                while (it.hasNext()) {
                    dVar.b(this, (InterfaceC5898z) it.next());
                }
            }
        }
        this._knownCompositions.clear();
        this._knownCompositionsCache = CollectionsKt.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC15815n<Unit> c0() {
        d dVar;
        int i10 = 0;
        int i11 = 1;
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (this._state.getValue().compareTo(d.f50288b) <= 0) {
            a0();
            this.snapshotInvalidations = new Z.X<>(i10, i11, defaultConstructorMarker);
            this.compositionInvalidations.k();
            this.compositionsAwaitingApply.clear();
            this.movableContentAwaitingInsert.clear();
            this.failedCompositions = null;
            InterfaceC15815n<? super Unit> interfaceC15815n = this.workContinuation;
            if (interfaceC15815n != null) {
                InterfaceC15815n.a.a(interfaceC15815n, null, 1, null);
            }
            this.workContinuation = null;
            this.errorState = null;
            return null;
        }
        if (this.errorState != null) {
            dVar = d.f50289c;
        } else if (this.runnerJob == null) {
            this.snapshotInvalidations = new Z.X<>(i10, i11, defaultConstructorMarker);
            this.compositionInvalidations.k();
            dVar = h0() ? d.f50290d : d.f50289c;
        } else {
            dVar = (this.compositionInvalidations.getSize() == 0 && !this.snapshotInvalidations.e() && this.compositionsAwaitingApply.isEmpty() && this.movableContentAwaitingInsert.isEmpty() && this.concurrentCompositionsOutstanding <= 0 && !h0()) ? d.f50291e : d.f50292f;
        }
        this._state.setValue(dVar);
        if (dVar != d.f50292f) {
            return null;
        }
        InterfaceC15815n interfaceC15815n2 = this.workContinuation;
        this.workContinuation = null;
        return interfaceC15815n2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d0() {
        int i10;
        Z.c0 c0VarF;
        synchronized (this.stateLock) {
            try {
                if (D0.b.k(this.movableContentRemoved)) {
                    Z.c0 c0VarQ = D0.b.q(this.movableContentRemoved);
                    D0.b.c(this.movableContentRemoved);
                    this.movableContentNestedStatesAvailable.b();
                    D0.b.c(this.movableContentNestedExtractionsPending);
                    Z.T t10 = new Z.T(c0VarQ.get_size());
                    Object[] objArr = c0VarQ.content;
                    int i11 = c0VarQ._size;
                    for (int i12 = 0; i12 < i11; i12++) {
                        C5862g0 c5862g0 = (C5862g0) objArr[i12];
                        t10.n(TuplesKt.a(c5862g0, this.movableContentStatesAvailable.e(c5862g0)));
                    }
                    this.movableContentStatesAvailable.k();
                    c0VarF = t10;
                } else {
                    c0VarF = Z.d0.f();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Object[] objArr2 = c0VarF.content;
        int i13 = c0VarF._size;
        for (i10 = 0; i10 < i13; i10++) {
            Pair pair = (Pair) objArr2[i10];
            C5862g0 c5862g02 = (C5862g0) pair.a();
            C5860f0 c5860f0 = (C5860f0) pair.b();
            if (c5860f0 != null) {
                c5862g02.getComposition().e(c5860f0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean g0() {
        boolean zH0;
        synchronized (this.stateLock) {
            zH0 = h0();
        }
        return zH0;
    }

    private final boolean h0() {
        return !this.frameClockPaused && this.broadcastFrameClock.r();
    }

    private final boolean i0() {
        return this.compositionInvalidations.getSize() != 0 || h0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j0() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.stateLock
            monitor-enter(r0)
            Z.X<java.lang.Object> r1 = r2.snapshotInvalidations     // Catch: java.lang.Throwable -> L1d
            boolean r1 = r1.e()     // Catch: java.lang.Throwable -> L1d
            if (r1 != 0) goto L1f
            D0.c<androidx.compose.runtime.z> r1 = r2.compositionInvalidations     // Catch: java.lang.Throwable -> L1d
            int r1 = r1.getSize()     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L14
            goto L1f
        L14:
            boolean r1 = r2.h0()     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L1b
            goto L1f
        L1b:
            r1 = 0
            goto L20
        L1d:
            r1 = move-exception
            goto L22
        L1f:
            r1 = 1
        L20:
            monitor-exit(r0)
            return r1
        L22:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.j0():boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final List<InterfaceC5898z> k0() {
        List list = this._knownCompositionsCache;
        List list2 = list;
        if (list == null) {
            List<InterfaceC5898z> list3 = this._knownCompositions;
            List listM = list3.isEmpty() ? CollectionsKt.m() : new ArrayList(list3);
            this._knownCompositionsCache = listM;
            list2 = listM;
        }
        return list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean l0() {
        boolean z10;
        synchronized (this.stateLock) {
            z10 = this.isClosed;
        }
        if (!z10) {
            return true;
        }
        Iterator<mv.C0> it = this.effectJob.p().iterator();
        while (it.hasNext()) {
            if (it.next().a()) {
                return true;
            }
        }
        return false;
    }

    private final void o0(InterfaceC5898z composition) {
        synchronized (this.stateLock) {
            List<C5862g0> list = this.movableContentAwaitingInsert;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (Intrinsics.e(list.get(i10).getComposition(), composition)) {
                    Unit unit = Unit.f143329a;
                    ArrayList arrayList = new ArrayList();
                    p0(arrayList, this, composition);
                    while (!arrayList.isEmpty()) {
                        q0(arrayList, null);
                        p0(arrayList, this, composition);
                    }
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0147, code lost:
    
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x014c, code lost:
    
        if (r4 >= r3) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0158, code lost:
    
        if (r10.get(r4).d() == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x015a, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x015d, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x016b, code lost:
    
        if (r9 >= r4) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x016d, code lost:
    
        r11 = r10.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0177, code lost:
    
        if (r11.d() != null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0179, code lost:
    
        r11 = r11.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0182, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0183, code lost:
    
        if (r11 == null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0185, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0188, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x018b, code lost:
    
        r4 = r16.stateLock;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x018d, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x018e, code lost:
    
        kotlin.collections.CollectionsKt.C(r16.movableContentAwaitingInsert, r3);
        r3 = kotlin.Unit.f143329a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0197, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0198, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01a6, code lost:
    
        if (r9 >= r4) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01a8, code lost:
    
        r11 = r10.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b3, code lost:
    
        if (r11.d() == null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01b5, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01b8, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01bb, code lost:
    
        r10 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<androidx.compose.runtime.InterfaceC5898z> q0(java.util.List<androidx.compose.runtime.C5862g0> r17, Z.X<java.lang.Object> r18) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.q0(java.util.List, Z.X):java.util.List");
    }

    private final void s0(Throwable e10, InterfaceC5898z failedInitialComposition, boolean recoverable) throws Throwable {
        int i10 = 0;
        if (!f50255F.get().booleanValue() || (e10 instanceof ComposeRuntimeError)) {
            synchronized (this.stateLock) {
                b bVar = this.errorState;
                if (bVar != null) {
                    throw bVar.getCause();
                }
                this.errorState = new b(false, e10);
                Unit unit = Unit.f143329a;
            }
            throw e10;
        }
        synchronized (this.stateLock) {
            try {
                J0.p.a("Error was captured in composition while live edit was enabled.", e10);
                this.compositionsAwaitingApply.clear();
                this.compositionInvalidations.k();
                this.snapshotInvalidations = new Z.X<>(i10, 1, null);
                this.movableContentAwaitingInsert.clear();
                D0.b.c(this.movableContentRemoved);
                this.movableContentStatesAvailable.k();
                this.errorState = new b(recoverable, e10);
                if (failedInitialComposition != null) {
                    x0(failedInitialComposition);
                }
                c0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static /* synthetic */ void t0(Recomposer recomposer, Throwable th2, InterfaceC5898z interfaceC5898z, boolean z10, int i10, Object obj) throws Throwable {
        if ((i10 & 2) != 0) {
            interfaceC5898z = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        recomposer.s0(th2, interfaceC5898z, z10);
    }

    private final Function1<Object, Unit> u0(InterfaceC5898z composition) {
        return new i(composition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean w0() {
        List<InterfaceC5898z> listK0;
        boolean zI0;
        synchronized (this.stateLock) {
            if (this.snapshotInvalidations.d()) {
                return i0();
            }
            Set<? extends Object> setA = D0.f.a(this.snapshotInvalidations);
            DefaultConstructorMarker defaultConstructorMarker = null;
            int i10 = 1;
            int i11 = 0;
            this.snapshotInvalidations = new Z.X<>(i11, i10, defaultConstructorMarker);
            synchronized (this.stateLock) {
                listK0 = k0();
            }
            try {
                int size = listK0.size();
                for (int i12 = 0; i12 < size; i12++) {
                    listK0.get(i12).n(setA);
                    if (this._state.getValue().compareTo(d.f50288b) <= 0) {
                        break;
                    }
                }
                synchronized (this.stateLock) {
                    this.snapshotInvalidations = new Z.X<>(i11, i10, defaultConstructorMarker);
                    Unit unit = Unit.f143329a;
                }
                synchronized (this.stateLock) {
                    if (c0() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    zI0 = i0();
                }
                return zI0;
            } catch (Throwable th2) {
                synchronized (this.stateLock) {
                    this.snapshotInvalidations.j(setA);
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x0(InterfaceC5898z composition) {
        List arrayList = this.failedCompositions;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.failedCompositions = arrayList;
        }
        if (!arrayList.contains(composition)) {
            arrayList.add(composition);
        }
        z0(composition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y0(mv.C0 callingJob) {
        synchronized (this.stateLock) {
            Throwable th2 = this.closeCause;
            if (th2 != null) {
                throw th2;
            }
            if (this._state.getValue().compareTo(d.f50288b) <= 0) {
                throw new IllegalStateException("Recomposer shut down");
            }
            if (this.runnerJob != null) {
                throw new IllegalStateException("Recomposer already running");
            }
            this.runnerJob = callingJob;
            c0();
        }
    }

    private final void z0(InterfaceC5898z composition) {
        if (this._knownCompositions.remove(composition)) {
            this._knownCompositionsCache = null;
            Z.T<O0.d> t10 = this.registrationObservers;
            if (t10 != null) {
                Object[] objArr = t10.content;
                int i10 = t10._size;
                for (int i11 = 0; i11 < i10; i11++) {
                    ((O0.d) objArr[i11]).b(this, composition);
                }
            }
        }
    }

    public final void A0() {
        InterfaceC15815n<Unit> interfaceC15815nC0;
        synchronized (this.stateLock) {
            if (this.frameClockPaused) {
                this.frameClockPaused = false;
                interfaceC15815nC0 = c0();
            } else {
                interfaceC15815nC0 = null;
            }
        }
        if (interfaceC15815nC0 != null) {
            Result.Companion companion = Result.INSTANCE;
            interfaceC15815nC0.resumeWith(Result.b(Unit.f143329a));
        }
    }

    public final Object B0(Continuation<? super Unit> continuation) {
        Object objV0 = v0(new k(null), continuation);
        return objV0 == IntrinsicsKt.f() ? objV0 : Unit.f143329a;
    }

    public final void Z() {
        synchronized (this.stateLock) {
            try {
                if (this._state.getValue().compareTo(d.f50291e) >= 0) {
                    this._state.setValue(d.f50288b);
                }
                Unit unit = Unit.f143329a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C0.a.a(this.effectJob, null, 1, null);
    }

    @Override // androidx.compose.runtime.AbstractC5869k
    public void b(C5862g0 reference) {
        synchronized (this.stateLock) {
            try {
                D0.b.a(this.movableContentRemoved, reference.c(), reference);
                if (reference.f() != null) {
                    b0(this, reference, reference);
                }
                Unit unit = Unit.f143329a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.compose.runtime.AbstractC5869k
    public boolean d() {
        return f50255F.get().booleanValue();
    }

    /* renamed from: e0, reason: from getter */
    public final long getChangeCount() {
        return this.changeCount;
    }

    public final pv.P<d> f0() {
        return this._state;
    }

    @Override // androidx.compose.runtime.AbstractC5869k
    /* renamed from: h, reason: from getter */
    public CoroutineContext getEffectCoroutineContext() {
        return this.effectCoroutineContext;
    }

    @Override // androidx.compose.runtime.AbstractC5869k
    public void j(C5862g0 reference) {
        InterfaceC15815n<Unit> interfaceC15815nC0;
        synchronized (this.stateLock) {
            this.movableContentAwaitingInsert.add(reference);
            interfaceC15815nC0 = c0();
        }
        if (interfaceC15815nC0 != null) {
            Result.Companion companion = Result.INSTANCE;
            interfaceC15815nC0.resumeWith(Result.b(Unit.f143329a));
        }
    }

    @Override // androidx.compose.runtime.AbstractC5869k
    public void k(InterfaceC5898z composition) {
        InterfaceC15815n<Unit> interfaceC15815nC0;
        synchronized (this.stateLock) {
            if (this.compositionInvalidations.l(composition)) {
                interfaceC15815nC0 = null;
            } else {
                this.compositionInvalidations.c(composition);
                interfaceC15815nC0 = c0();
            }
        }
        if (interfaceC15815nC0 != null) {
            Result.Companion companion = Result.INSTANCE;
            interfaceC15815nC0.resumeWith(Result.b(Unit.f143329a));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    @Override // androidx.compose.runtime.AbstractC5869k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(androidx.compose.runtime.C5862g0 r18, androidx.compose.runtime.C5860f0 r19, androidx.compose.runtime.Applier<?> r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            java.lang.Object r3 = r1.stateLock
            monitor-enter(r3)
            Z.W<androidx.compose.runtime.g0, androidx.compose.runtime.f0> r4 = r1.movableContentStatesAvailable     // Catch: java.lang.Throwable -> L63
            r4.x(r0, r2)     // Catch: java.lang.Throwable -> L63
            Z.W<java.lang.Object, java.lang.Object> r4 = r1.movableContentNestedExtractionsPending     // Catch: java.lang.Throwable -> L63
            Z.c0 r0 = D0.b.h(r4, r0)     // Catch: java.lang.Throwable -> L63
            boolean r4 = r0.h()     // Catch: java.lang.Throwable -> L63
            if (r4 == 0) goto L70
            r4 = r20
            Z.h0 r0 = r2.c(r4, r0)     // Catch: java.lang.Throwable -> L63
            java.lang.Object[] r2 = r0.keys     // Catch: java.lang.Throwable -> L63
            java.lang.Object[] r4 = r0.values     // Catch: java.lang.Throwable -> L63
            long[] r0 = r0.metadata     // Catch: java.lang.Throwable -> L63
            int r5 = r0.length     // Catch: java.lang.Throwable -> L63
            int r5 = r5 + (-2)
            if (r5 < 0) goto L70
            r6 = 0
            r7 = r6
        L2d:
            r8 = r0[r7]     // Catch: java.lang.Throwable -> L63
            long r10 = ~r8     // Catch: java.lang.Throwable -> L63
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L6b
            int r10 = r7 - r5
            int r10 = ~r10     // Catch: java.lang.Throwable -> L63
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L47:
            if (r12 >= r10) goto L69
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L65
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r2[r13]     // Catch: java.lang.Throwable -> L63
            r13 = r4[r13]     // Catch: java.lang.Throwable -> L63
            androidx.compose.runtime.f0 r13 = (androidx.compose.runtime.C5860f0) r13     // Catch: java.lang.Throwable -> L63
            androidx.compose.runtime.g0 r14 = (androidx.compose.runtime.C5862g0) r14     // Catch: java.lang.Throwable -> L63
            Z.W<androidx.compose.runtime.g0, androidx.compose.runtime.f0> r15 = r1.movableContentStatesAvailable     // Catch: java.lang.Throwable -> L63
            r15.x(r14, r13)     // Catch: java.lang.Throwable -> L63
            goto L65
        L63:
            r0 = move-exception
            goto L74
        L65:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L47
        L69:
            if (r10 != r11) goto L70
        L6b:
            if (r7 == r5) goto L70
            int r7 = r7 + 1
            goto L2d
        L70:
            kotlin.Unit r0 = kotlin.Unit.f143329a     // Catch: java.lang.Throwable -> L63
            monitor-exit(r3)
            return
        L74:
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.l(androidx.compose.runtime.g0, androidx.compose.runtime.f0, androidx.compose.runtime.Applier):void");
    }

    @Override // androidx.compose.runtime.AbstractC5869k
    public C5860f0 m(C5862g0 reference) {
        C5860f0 c5860f0U;
        synchronized (this.stateLock) {
            c5860f0U = this.movableContentStatesAvailable.u(reference);
        }
        return c5860f0U;
    }

    public final void n0() {
        synchronized (this.stateLock) {
            this.frameClockPaused = true;
            Unit unit = Unit.f143329a;
        }
    }

    @Override // androidx.compose.runtime.AbstractC5869k
    public void p(InterfaceC5898z composition) {
        synchronized (this.stateLock) {
            try {
                Set linkedHashSet = this.compositionsRemoved;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.compositionsRemoved = linkedHashSet;
                }
                linkedHashSet.add(composition);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.compose.runtime.AbstractC5869k
    public void s(InterfaceC5898z composition) {
        synchronized (this.stateLock) {
            z0(composition);
            this.compositionInvalidations.s(composition);
            this.compositionsAwaitingApply.remove(composition);
            Unit unit = Unit.f143329a;
        }
    }

    public Recomposer(CoroutineContext coroutineContext) {
        C5842c c5842c = new C5842c(new e());
        this.broadcastFrameClock = c5842c;
        this.stateLock = new Object();
        this._knownCompositions = new ArrayList();
        this.snapshotInvalidations = new Z.X<>(0, 1, null);
        this.compositionInvalidations = new D0.c<>(new InterfaceC5898z[16], 0);
        this.compositionsAwaitingApply = new ArrayList();
        this.movableContentAwaitingInsert = new ArrayList();
        this.movableContentRemoved = D0.b.e(null, 1, null);
        this.movableContentNestedStatesAvailable = new C5874m0();
        this.movableContentStatesAvailable = Z.i0.c();
        this.movableContentNestedExtractionsPending = D0.b.e(null, 1, null);
        this._state = pv.S.a(d.f50289c);
        this.pausedScopes = new J0.j<>();
        InterfaceC15769A interfaceC15769AA = mv.E0.a((mv.C0) coroutineContext.g(mv.C0.INSTANCE));
        interfaceC15769AA.R(new f());
        this.effectJob = interfaceC15769AA;
        this.effectCoroutineContext = coroutineContext.n0(c5842c).n0(interfaceC15769AA);
        this.recomposerInfo = new c();
    }

    private final void X(androidx.compose.runtime.snapshots.b snapshot) {
        try {
            if (!(snapshot.C() instanceof h.a)) {
            } else {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            snapshot.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object Y(Continuation<? super Unit> continuation) {
        C15819p c15819p;
        if (!j0()) {
            C15819p c15819p2 = new C15819p(IntrinsicsKt.c(continuation), 1);
            c15819p2.C();
            synchronized (this.stateLock) {
                if (!j0()) {
                    this.workContinuation = c15819p2;
                    c15819p = null;
                } else {
                    c15819p = c15819p2;
                }
            }
            if (c15819p != null) {
                Result.Companion companion = Result.INSTANCE;
                c15819p.resumeWith(Result.b(Unit.f143329a));
            }
            Object objU = c15819p2.u();
            if (objU == IntrinsicsKt.f()) {
                DebugProbesKt.c(continuation);
            }
            if (objU == IntrinsicsKt.f()) {
                return objU;
            }
            return Unit.f143329a;
        }
        return Unit.f143329a;
    }

    private static final void b0(Recomposer recomposer, C5862g0 c5862g0, C5862g0 c5862g02) {
        List<C5862g0> listF = c5862g02.f();
        if (listF != null) {
            int size = listF.size();
            for (int i10 = 0; i10 < size; i10++) {
                C5862g0 c5862g03 = listF.get(i10);
                recomposer.movableContentNestedStatesAvailable.a(c5862g03.c(), new C5876n0(c5862g03, c5862g0));
                b0(recomposer, c5862g0, c5862g03);
            }
        }
    }

    private static final void p0(List<C5862g0> list, Recomposer recomposer, InterfaceC5898z interfaceC5898z) {
        list.clear();
        synchronized (recomposer.stateLock) {
            try {
                Iterator<C5862g0> it = recomposer.movableContentAwaitingInsert.iterator();
                while (it.hasNext()) {
                    C5862g0 next = it.next();
                    if (Intrinsics.e(next.getComposition(), interfaceC5898z)) {
                        list.add(next);
                        it.remove();
                    }
                }
                Unit unit = Unit.f143329a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC5898z r0(InterfaceC5898z composition, Z.X<Object> modifiedValues) {
        Set<InterfaceC5898z> set;
        if (composition.p() || composition.getDisposed() || ((set = this.compositionsRemoved) != null && set.contains(composition))) {
            return null;
        }
        androidx.compose.runtime.snapshots.b bVarN = androidx.compose.runtime.snapshots.g.INSTANCE.n(u0(composition), C0(composition, modifiedValues));
        try {
            androidx.compose.runtime.snapshots.g gVarL = bVarN.l();
            if (modifiedValues != null) {
                try {
                    if (modifiedValues.e()) {
                        composition.m(new h(modifiedValues, composition));
                    }
                } catch (Throwable th2) {
                    bVarN.s(gVarL);
                    throw th2;
                }
            }
            boolean zI = composition.i();
            bVarN.s(gVarL);
            if (!zI) {
                return null;
            }
            return composition;
        } finally {
            X(bVarN);
        }
    }

    private final Object v0(Function3<? super InterfaceC15783O, ? super InterfaceC5840b0, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super Unit> continuation) {
        Object objG = C15805i.g(this.broadcastFrameClock, new j(function3, C5854d0.a(continuation.getContext()), null), continuation);
        if (objG == IntrinsicsKt.f()) {
            return objG;
        }
        return Unit.f143329a;
    }

    @Override // androidx.compose.runtime.AbstractC5869k
    public void a(InterfaceC5898z composition, Function2<? super Composer, ? super Integer, Unit> content) throws Throwable {
        Throwable th2;
        boolean zP = composition.p();
        try {
            g.Companion companion = androidx.compose.runtime.snapshots.g.INSTANCE;
            androidx.compose.runtime.snapshots.b bVarN = companion.n(u0(composition), C0(composition, null));
            try {
                androidx.compose.runtime.snapshots.g gVarL = bVarN.l();
                try {
                    composition.b(content);
                    Unit unit = Unit.f143329a;
                    bVarN.s(gVarL);
                    X(bVarN);
                    if (!zP) {
                        companion.f();
                    }
                    synchronized (this.stateLock) {
                        try {
                            if (this._state.getValue().compareTo(d.f50288b) > 0) {
                                try {
                                    if (!k0().contains(composition)) {
                                        W(composition);
                                    }
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    throw th2;
                                }
                            }
                            try {
                                o0(composition);
                                try {
                                    composition.o();
                                    composition.c();
                                    if (!zP) {
                                        companion.f();
                                    }
                                } catch (Throwable th4) {
                                    t0(this, th4, null, false, 6, null);
                                }
                            } catch (Throwable th5) {
                                s0(th5, composition, true);
                            }
                        } catch (Throwable th6) {
                            th2 = th6;
                        }
                    }
                } catch (Throwable th7) {
                    try {
                        bVarN.s(gVarL);
                        throw th7;
                    } catch (Throwable th8) {
                        th = th8;
                        Throwable th9 = th;
                        try {
                            X(bVarN);
                            throw th9;
                        } catch (Throwable th10) {
                            th = th10;
                            s0(th, composition, true);
                        }
                    }
                }
            } catch (Throwable th11) {
                th = th11;
            }
        } catch (Throwable th12) {
            th = th12;
        }
    }

    public final Object m0(Continuation<? super Unit> continuation) {
        Object objB = C16563h.B(f0(), new g(null), continuation);
        if (objB == IntrinsicsKt.f()) {
            return objB;
        }
        return Unit.f143329a;
    }
}
