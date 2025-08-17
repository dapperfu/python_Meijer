package androidx.compose.runtime;

import androidx.compose.runtime.B;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0004B'\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u001f\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001d\u001a\u00020\u000e2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u001b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001f\u0010\u0013J\u0017\u0010 \u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J!\u0010)\u001a\u00020\u00172\u0006\u0010'\u001a\u00020&2\b\u0010(\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b)\u0010*J)\u0010.\u001a\u00020-2\u0006\u0010'\u001a\u00020&2\u0006\u0010,\u001a\u00020+2\b\u0010(\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b.\u0010/J!\u00101\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u000400H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u00102J\u0011\u00104\u001a\u0004\u0018\u000103H\u0002¢\u0006\u0004\b4\u00105J\u001d\u00106\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b6\u0010\u0011J\u001d\u00107\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b7\u0010\u0011J\u001d\u00108\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b8\u0010\u0011J\u000f\u00109\u001a\u00020\u000eH\u0000¢\u0006\u0004\b9\u0010\u0013J\u000f\u0010:\u001a\u00020\u000eH\u0016¢\u0006\u0004\b:\u0010\u0013J\u001d\u0010;\u001a\u00020\u000e2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u001bH\u0016¢\u0006\u0004\b;\u0010<J\u001d\u0010=\u001a\u00020\u00172\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u001bH\u0016¢\u0006\u0004\b=\u0010>J\u001d\u0010@\u001a\u00020\u000e2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\bB\u0010!J\u0017\u0010C\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\bC\u0010!J\u000f\u0010D\u001a\u00020\u0017H\u0016¢\u0006\u0004\bD\u0010EJ+\u0010J\u001a\u00020\u000e2\u001a\u0010I\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020H\u0012\u0006\u0012\u0004\u0018\u00010H0G0FH\u0016¢\u0006\u0004\bJ\u0010KJ\u0017\u0010N\u001a\u00020\u000e2\u0006\u0010M\u001a\u00020LH\u0016¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\u000eH\u0016¢\u0006\u0004\bP\u0010\u0013J\u000f\u0010Q\u001a\u00020\u000eH\u0016¢\u0006\u0004\bQ\u0010\u0013J\u000f\u0010R\u001a\u00020\u000eH\u0016¢\u0006\u0004\bR\u0010\u0013J\u000f\u0010S\u001a\u00020\u000eH\u0016¢\u0006\u0004\bS\u0010\u0013J\u000f\u0010T\u001a\u00020\u000eH\u0016¢\u0006\u0004\bT\u0010\u0013J5\u0010Y\u001a\u00028\u0000\"\u0004\b\u0000\u0010U2\b\u0010V\u001a\u0004\u0018\u00010\u00012\u0006\u0010X\u001a\u00020W2\f\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\bY\u0010ZJ!\u0010[\u001a\u00020-2\u0006\u0010'\u001a\u00020&2\b\u0010(\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b[\u0010\\J\u0017\u0010]\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b]\u0010^J\u001f\u0010_\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u00042\u0006\u0010'\u001a\u00020&H\u0000¢\u0006\u0004\b_\u0010`J\u001b\u0010b\u001a\u00020\u000e2\n\u0010M\u001a\u0006\u0012\u0002\b\u00030aH\u0000¢\u0006\u0004\bb\u0010cJ\u000f\u0010d\u001a\u00020\u000eH\u0016¢\u0006\u0004\bd\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\bB\u0010e\u001a\u0004\bf\u0010gR\u0018\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010hR(\u0010l\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00040ij\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004`j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010kR\u0014\u0010n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010mR \u0010s\u001a\b\u0012\u0004\u0012\u00020p0o8\u0002X\u0082\u0004¢\u0006\f\n\u0004\bN\u0010q\u0012\u0004\br\u0010\u0013R \u0010y\u001a\u00020t8\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\bJ\u0010u\u0012\u0004\bx\u0010\u0013\u001a\u0004\bv\u0010wR&\u0010{\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020&008\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\bY\u0010zR\u001a\u0010~\u001a\b\u0012\u0004\u0012\u00020&0|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010}R\u001a\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020&0|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010}R+\u0010\u0080\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030a008\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b=\u0010zR\u0015\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b[\u0010\u0081\u0001R\u0017\u0010\u0083\u0001\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0081\u0001R'\u0010\u0084\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020&008\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b@\u0010zR)\u0010\u0085\u0001\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0004008\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b;\u0010zR.\u0010\u008b\u0001\u001a\u00020\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u001d\n\u0005\bP\u0010\u0086\u0001\u0012\u0005\b\u008a\u0001\u0010\u0013\u001a\u0005\b\u0087\u0001\u0010E\"\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001b\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0017\u0010\u008f\u0001\u001a\u00020W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00104R\u001f\u0010\u0094\u0001\u001a\u00030\u0090\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\bC\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0018\u0010\u0098\u0001\u001a\u00030\u0095\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0018\u0010\u009a\u0001\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bS\u0010\u0099\u0001R\u001a\u0010\u009b\u0001\u001a\u00020\u00178\u0006¢\u0006\u000e\n\u0005\bR\u0010\u0086\u0001\u001a\u0005\b\u009b\u0001\u0010ER\u0018\u0010\u009c\u0001\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bT\u0010\u0086\u0001R-\u0010¡\u0001\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u0019\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001\"\u0005\b \u0001\u0010\u0011R\u0016\u0010£\u0001\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¢\u0001\u0010ER\u0016\u0010¤\u0001\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u008c\u0001\u0010ER\u0016\u0010¥\u0001\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¥\u0001\u0010ER\u0016\u0010¦\u0001\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0096\u0001\u0010E\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006§\u0001"}, d2 = {"Landroidx/compose/runtime/n;", "Landroidx/compose/runtime/z;", "Landroidx/compose/runtime/Q0;", "Landroidx/compose/runtime/K0;", "", "Landroidx/compose/runtime/k;", "parent", "Landroidx/compose/runtime/Applier;", "applier", "Lkotlin/coroutines/CoroutineContext;", "recomposeContext", "<init>", "(Landroidx/compose/runtime/k;Landroidx/compose/runtime/Applier;Lkotlin/coroutines/CoroutineContext;)V", "Lkotlin/Function0;", "", "content", "A", "(Lkotlin/jvm/functions/Function2;)V", "B", "()V", "C", "D", "value", "", "forgetConditionalScopes", "w", "(Ljava/lang/Object;Z)V", "", "values", "x", "(Ljava/util/Set;Z)V", "z", "H", "(Ljava/lang/Object;)V", "Landroidx/compose/runtime/changelist/a;", "changes", "y", "(Landroidx/compose/runtime/changelist/a;)V", "Landroidx/compose/runtime/I0;", "scope", "instance", "M", "(Landroidx/compose/runtime/I0;Ljava/lang/Object;)Z", "Landroidx/compose/runtime/Anchor;", "anchor", "Landroidx/compose/runtime/T;", "G", "(Landroidx/compose/runtime/I0;Landroidx/compose/runtime/Anchor;Ljava/lang/Object;)Landroidx/compose/runtime/T;", "LD0/g;", "L", "()LZ/W;", "LO0/c;", "I", "()LO0/c;", "d", "q", "b", "N", "dispose", "n", "(Ljava/util/Set;)V", "j", "(Ljava/util/Set;)Z", "block", "m", "(Lkotlin/jvm/functions/Function0;)V", "a", "r", "i", "()Z", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/g0;", "references", "f", "(Ljava/util/List;)V", "Landroidx/compose/runtime/f0;", "state", "e", "(Landroidx/compose/runtime/f0;)V", "o", "c", "u", "t", "v", "R", "to", "", "groupIndex", "g", "(Landroidx/compose/runtime/z;ILkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "k", "(Landroidx/compose/runtime/I0;Ljava/lang/Object;)Landroidx/compose/runtime/T;", "h", "(Landroidx/compose/runtime/I0;)V", "K", "(Ljava/lang/Object;Landroidx/compose/runtime/I0;)V", "Landroidx/compose/runtime/B;", "J", "(Landroidx/compose/runtime/B;)V", "deactivate", "Landroidx/compose/runtime/k;", "getParent", "()Landroidx/compose/runtime/k;", "Landroidx/compose/runtime/Applier;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/internal/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "pendingModifications", "Ljava/lang/Object;", "lock", "", "Landroidx/compose/runtime/N0;", "Ljava/util/Set;", "getAbandonSet$annotations", "abandonSet", "Landroidx/compose/runtime/SlotTable;", "Landroidx/compose/runtime/SlotTable;", "getSlotTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "getSlotTable$runtime_release$annotations", "slotTable", "LZ/W;", "observations", "LZ/X;", "LZ/X;", "invalidatedScopes", "conditionallyInvalidatedScopes", "derivedStates", "Landroidx/compose/runtime/changelist/a;", "l", "lateChanges", "observationsProcessed", "invalidations", "Z", "getPendingInvalidScopes$runtime_release", "setPendingInvalidScopes$runtime_release", "(Z)V", "getPendingInvalidScopes$runtime_release$annotations", "pendingInvalidScopes", "p", "Landroidx/compose/runtime/n;", "invalidationDelegate", "invalidationDelegateGroup", "Landroidx/compose/runtime/u;", "Landroidx/compose/runtime/u;", "F", "()Landroidx/compose/runtime/u;", "observerHolder", "Landroidx/compose/runtime/ComposerImpl;", "s", "Landroidx/compose/runtime/ComposerImpl;", "composer", "Lkotlin/coroutines/CoroutineContext;", "_recomposeContext", "isRoot", "disposed", "Lkotlin/jvm/functions/Function2;", "getComposable", "()Lkotlin/jvm/functions/Function2;", "setComposable", "composable", "E", "areChildrenComposing", "isComposing", "isDisposed", "hasInvalidations", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.runtime.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5733n implements InterfaceC5756z, Q0, K0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AbstractC5727k parent;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Applier<?> applier;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AtomicReference<Object> pendingModifications;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Object lock;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Set<N0> abandonSet;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final SlotTable slotTable;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Z.W<Object, Object> observations;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Z.X<I0> invalidatedScopes;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Z.X<I0> conditionallyInvalidatedScopes;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Z.W<Object, Object> derivedStates;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.runtime.changelist.a changes;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.runtime.changelist.a lateChanges;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Z.W<Object, Object> observationsProcessed;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private Z.W<Object, Object> invalidations;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean pendingInvalidScopes;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private C5733n invalidationDelegate;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private int invalidationDelegateGroup;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final C5746u observerHolder;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final ComposerImpl composer;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext _recomposeContext;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final boolean isRoot;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean disposed;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private Function2<? super Composer, ? super Integer, Unit> composable;

    public C5733n(AbstractC5727k abstractC5727k, Applier<?> applier, CoroutineContext coroutineContext) {
        this.parent = abstractC5727k;
        this.applier = applier;
        this.pendingModifications = new AtomicReference<>(null);
        this.lock = new Object();
        Set<N0> setL = new Z.X(0, 1, null).l();
        this.abandonSet = setL;
        SlotTable slotTable = new SlotTable();
        if (abstractC5727k.d()) {
            slotTable.n();
        }
        if (abstractC5727k.getCollectingSourceInformation()) {
            slotTable.o();
        }
        this.slotTable = slotTable;
        this.observations = D0.g.d(null, 1, null);
        this.invalidatedScopes = new Z.X<>(0, 1, null);
        this.conditionallyInvalidatedScopes = new Z.X<>(0, 1, null);
        this.derivedStates = D0.g.d(null, 1, null);
        androidx.compose.runtime.changelist.a aVar = new androidx.compose.runtime.changelist.a();
        this.changes = aVar;
        androidx.compose.runtime.changelist.a aVar2 = new androidx.compose.runtime.changelist.a();
        this.lateChanges = aVar2;
        this.observationsProcessed = D0.g.d(null, 1, null);
        this.invalidations = D0.g.d(null, 1, null);
        this.observerHolder = new C5746u(null, false, 3, null);
        ComposerImpl composerImpl = new ComposerImpl(applier, abstractC5727k, slotTable, setL, aVar, aVar2, this);
        abstractC5727k.o(composerImpl);
        this.composer = composerImpl;
        this._recomposeContext = coroutineContext;
        this.isRoot = abstractC5727k instanceof Recomposer;
        this.composable = C5714e.f50260a.a();
    }

    @Override // androidx.compose.runtime.InterfaceC5756z
    public void f(List<Pair<C5720g0, C5720g0>> references) {
        int size = references.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z10 = true;
                break;
            } else if (!Intrinsics.e(references.get(i10).c().getComposition(), this)) {
                break;
            } else {
                i10++;
            }
        }
        if (!z10) {
            ComposerKt.t("Check failed");
        }
        try {
            this.composer.M0(references);
            Unit unit = Unit.f142422a;
        } finally {
        }
    }

    @Override // androidx.compose.runtime.K0
    public void h(I0 scope) {
        this.pendingInvalidScopes = true;
    }

    private final void A(Function2<? super Composer, ? super Integer, Unit> content) {
        if (this.disposed) {
            C5757z0.b("The composition is disposed");
        }
        this.composable = content;
        this.parent.a(this, content);
    }

    private final void B() {
        Object andSet = this.pendingModifications.getAndSet(C5735o.f50321a);
        if (andSet != null) {
            if (Intrinsics.e(andSet, C5735o.f50321a)) {
                ComposerKt.u("pending composition has not been applied");
                throw new KotlinNothingValueException();
            }
            if (andSet instanceof Set) {
                x((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                ComposerKt.u("corrupt pendingModifications drain: " + this.pendingModifications);
                throw new KotlinNothingValueException();
            }
            for (Set<? extends Object> set : (Set[]) andSet) {
                x(set, true);
            }
        }
    }

    private final void C() {
        Object andSet = this.pendingModifications.getAndSet(null);
        if (Intrinsics.e(andSet, C5735o.f50321a)) {
            return;
        }
        if (andSet instanceof Set) {
            x((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set<? extends Object> set : (Set[]) andSet) {
                x(set, false);
            }
            return;
        }
        if (andSet == null) {
            ComposerKt.u("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw new KotlinNothingValueException();
        }
        ComposerKt.u("corrupt pendingModifications drain: " + this.pendingModifications);
        throw new KotlinNothingValueException();
    }

    private final void D() {
        Object andSet = this.pendingModifications.getAndSet(SetsKt.e());
        if (Intrinsics.e(andSet, C5735o.f50321a) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            x((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            ComposerKt.u("corrupt pendingModifications drain: " + this.pendingModifications);
            throw new KotlinNothingValueException();
        }
        for (Set<? extends Object> set : (Set[]) andSet) {
            x(set, false);
        }
    }

    private final boolean E() {
        return this.composer.E0();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a9 A[Catch: all -> 0x001e, EDGE_INSN: B:65:0x00a9->B:50:0x00a9 BREAK  A[LOOP:0: B:32:0x0060->B:46:0x00a1], EDGE_INSN: B:66:0x00a9->B:50:0x00a9 BREAK  A[LOOP:0: B:32:0x0060->B:46:0x00a1], TRY_LEAVE, TryCatch #0 {all -> 0x001e, blocks: (B:4:0x000b, B:6:0x0010, B:14:0x0023, B:16:0x0029, B:19:0x002d, B:21:0x0032, B:22:0x003b, B:24:0x003f, B:25:0x0048, B:27:0x0050, B:29:0x0054, B:32:0x0060, B:34:0x0070, B:36:0x007c, B:38:0x0086, B:42:0x0095, B:46:0x00a1, B:47:0x00a4, B:50:0x00a9), top: B:63:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final androidx.compose.runtime.T G(androidx.compose.runtime.I0 r21, androidx.compose.runtime.Anchor r22, java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C5733n.G(androidx.compose.runtime.I0, androidx.compose.runtime.Anchor, java.lang.Object):androidx.compose.runtime.T");
    }

    private final void H(Object value) {
        Object objE = this.observations.e(value);
        if (objE == null) {
            return;
        }
        if (!(objE instanceof Z.X)) {
            I0 i02 = (I0) objE;
            if (i02.v(value) == T.f50155d) {
                D0.g.a(this.observationsProcessed, value, i02);
                return;
            }
            return;
        }
        Z.X x10 = (Z.X) objE;
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
                        I0 i03 = (I0) objArr[(i10 << 3) + i12];
                        if (i03.v(value) == T.f50155d) {
                            D0.g.a(this.observationsProcessed, value, i03);
                        }
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

    private final O0.c I() {
        C5746u c5746u = this.observerHolder;
        if (c5746u.getRoot()) {
            c5746u.a();
            return null;
        }
        C5746u c5746uI = this.parent.getObserverHolder();
        if (c5746uI != null) {
            c5746uI.a();
        }
        c5746u.a();
        if (!Intrinsics.e(null, null)) {
            c5746u.c(null);
        }
        return null;
    }

    private final Z.W<Object, Object> L() {
        Z.W<Object, Object> w10 = this.invalidations;
        this.invalidations = D0.g.d(null, 1, null);
        return w10;
    }

    private final void w(Object value, boolean forgetConditionalScopes) {
        Object objE = this.observations.e(value);
        if (objE == null) {
            return;
        }
        if (!(objE instanceof Z.X)) {
            I0 i02 = (I0) objE;
            if (D0.g.g(this.observationsProcessed, value, i02) || i02.v(value) == T.f50152a) {
                return;
            }
            if (!i02.w() || forgetConditionalScopes) {
                this.invalidatedScopes.h(i02);
                return;
            } else {
                this.conditionallyInvalidatedScopes.h(i02);
                return;
            }
        }
        Z.X x10 = (Z.X) objE;
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
                        I0 i03 = (I0) objArr[(i10 << 3) + i12];
                        if (!D0.g.g(this.observationsProcessed, value, i03) && i03.v(value) != T.f50152a) {
                            if (!i03.w() || forgetConditionalScopes) {
                                this.invalidatedScopes.h(i03);
                            } else {
                                this.conditionallyInvalidatedScopes.h(i03);
                            }
                        }
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

    /* JADX WARN: Removed duplicated region for block: B:107:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0176 A[EDGE_INSN: B:70:0x0176->B:219:0x0113 BREAK  A[LOOP:13: B:60:0x0144->B:71:0x0178]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void x(java.util.Set<? extends java.lang.Object> r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 925
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C5733n.x(java.util.Set, boolean):void");
    }

    private final void y(androidx.compose.runtime.changelist.a changes) throws Throwable {
        J0.h hVar;
        long[] jArr;
        J0.h hVar2;
        long[] jArr2;
        int i10;
        long j10;
        char c10;
        long j11;
        int i11;
        boolean zD;
        long[] jArr3;
        J0.h hVar3 = new J0.h(this.abandonSet);
        try {
            if (changes.c()) {
                if (this.lateChanges.c()) {
                    hVar3.h();
                    return;
                }
                return;
            }
            try {
                J0.o oVar = J0.o.f14530a;
                Object objA = oVar.a("Compose:applyChanges");
                try {
                    Applier<?> applier = this.applier;
                    applier.onBeginChanges();
                    SlotWriter slotWriterC = this.slotTable.C();
                    int i12 = 0;
                    try {
                        changes.b(applier, slotWriterC, hVar3);
                        Unit unit = Unit.f142422a;
                        slotWriterC.L(true);
                        applier.onEndChanges();
                        oVar.b(objA);
                        hVar3.j();
                        hVar3.k();
                        if (this.pendingInvalidScopes) {
                            Object objA2 = oVar.a("Compose:unobserve");
                            try {
                                this.pendingInvalidScopes = false;
                                Z.W<Object, Object> w10 = this.observations;
                                long[] jArr4 = w10.metadata;
                                int length = jArr4.length - 2;
                                if (length >= 0) {
                                    int i13 = 0;
                                    while (true) {
                                        long j12 = jArr4[i13];
                                        char c11 = 7;
                                        long j13 = -9187201950435737472L;
                                        if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i14 = 8;
                                            int i15 = 8 - ((~(i13 - length)) >>> 31);
                                            int i16 = i12;
                                            while (i16 < i15) {
                                                if ((j12 & 255) < 128) {
                                                    c10 = c11;
                                                    int i17 = (i13 << 3) + i16;
                                                    j11 = j13;
                                                    Object obj = w10.keys[i17];
                                                    Object obj2 = w10.values[i17];
                                                    if (obj2 instanceof Z.X) {
                                                        Intrinsics.h(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                                        Z.X x10 = (Z.X) obj2;
                                                        Object[] objArr = x10.elements;
                                                        long[] jArr5 = x10.metadata;
                                                        int i18 = i14;
                                                        int length2 = jArr5.length - 2;
                                                        hVar2 = hVar3;
                                                        if (length2 >= 0) {
                                                            j10 = j12;
                                                            int i19 = 0;
                                                            while (true) {
                                                                try {
                                                                    long j14 = jArr5[i19];
                                                                    long[] jArr6 = jArr5;
                                                                    i10 = i16;
                                                                    if ((((~j14) << c10) & j14 & j11) != j11) {
                                                                        int i20 = 8 - ((~(i19 - length2)) >>> 31);
                                                                        int i21 = 0;
                                                                        while (i21 < i20) {
                                                                            if ((j14 & 255) < 128) {
                                                                                jArr3 = jArr4;
                                                                                int i22 = (i19 << 3) + i21;
                                                                                if (!((I0) objArr[i22]).u()) {
                                                                                    x10.A(i22);
                                                                                }
                                                                            } else {
                                                                                jArr3 = jArr4;
                                                                            }
                                                                            j14 >>= i18;
                                                                            i21++;
                                                                            jArr4 = jArr3;
                                                                        }
                                                                        jArr2 = jArr4;
                                                                        if (i20 != i18) {
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        jArr2 = jArr4;
                                                                    }
                                                                    if (i19 == length2) {
                                                                        break;
                                                                    }
                                                                    i19++;
                                                                    i16 = i10;
                                                                    jArr5 = jArr6;
                                                                    jArr4 = jArr2;
                                                                    i18 = 8;
                                                                } catch (Throwable th2) {
                                                                    th = th2;
                                                                    J0.o.f14530a.b(objA2);
                                                                    throw th;
                                                                }
                                                            }
                                                        } else {
                                                            jArr2 = jArr4;
                                                            i10 = i16;
                                                            j10 = j12;
                                                        }
                                                        zD = x10.d();
                                                    } else {
                                                        hVar2 = hVar3;
                                                        jArr2 = jArr4;
                                                        i10 = i16;
                                                        j10 = j12;
                                                        Intrinsics.h(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                                        zD = !((I0) obj2).u();
                                                    }
                                                    if (zD) {
                                                        w10.v(i17);
                                                    }
                                                    i11 = 8;
                                                } else {
                                                    hVar2 = hVar3;
                                                    jArr2 = jArr4;
                                                    i10 = i16;
                                                    j10 = j12;
                                                    c10 = c11;
                                                    j11 = j13;
                                                    i11 = i14;
                                                }
                                                j12 = j10 >> i11;
                                                i16 = i10 + 1;
                                                i14 = i11;
                                                c11 = c10;
                                                j13 = j11;
                                                hVar3 = hVar2;
                                                jArr4 = jArr2;
                                            }
                                            hVar = hVar3;
                                            jArr = jArr4;
                                            if (i15 != i14) {
                                                break;
                                            }
                                        } else {
                                            hVar = hVar3;
                                            jArr = jArr4;
                                        }
                                        if (i13 == length) {
                                            break;
                                        }
                                        i13++;
                                        hVar3 = hVar;
                                        jArr4 = jArr;
                                        i12 = 0;
                                    }
                                } else {
                                    hVar = hVar3;
                                }
                                z();
                                Unit unit2 = Unit.f142422a;
                                J0.o.f14530a.b(objA2);
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } else {
                            hVar = hVar3;
                        }
                        if (this.lateChanges.c()) {
                            hVar.h();
                        }
                    } catch (Throwable th4) {
                        try {
                            slotWriterC.L(false);
                            throw th4;
                        } catch (Throwable th5) {
                            th = th5;
                            J0.o.f14530a.b(objA);
                            throw th;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (Throwable th7) {
                th = th7;
                if (this.lateChanges.c()) {
                    hVar3.h();
                }
                throw th;
            }
        } catch (Throwable th8) {
            th = th8;
        }
    }

    private final void z() {
        char c10;
        long j10;
        long j11;
        long j12;
        long[] jArr;
        long[] jArr2;
        long j13;
        int i10;
        char c11;
        long j14;
        long j15;
        int i11;
        boolean zD;
        long[] jArr3;
        int i12;
        int i13;
        Z.W<Object, Object> w10 = this.derivedStates;
        long[] jArr4 = w10.metadata;
        int length = jArr4.length - 2;
        char c12 = 7;
        long j16 = -9187201950435737472L;
        int i14 = 8;
        if (length >= 0) {
            int i15 = 0;
            long j17 = 128;
            while (true) {
                long j18 = jArr4[i15];
                j11 = 255;
                if ((((~j18) << c12) & j18 & j16) != j16) {
                    int i16 = 8 - ((~(i15 - length)) >>> 31);
                    int i17 = 0;
                    while (i17 < i16) {
                        if ((j18 & 255) < j17) {
                            c11 = c12;
                            int i18 = (i15 << 3) + i17;
                            j14 = j16;
                            Object obj = w10.keys[i18];
                            Object obj2 = w10.values[i18];
                            if (obj2 instanceof Z.X) {
                                Intrinsics.h(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                Z.X x10 = (Z.X) obj2;
                                Object[] objArr = x10.elements;
                                long[] jArr5 = x10.metadata;
                                int length2 = jArr5.length - 2;
                                if (length2 >= 0) {
                                    j15 = j17;
                                    int i19 = 0;
                                    int i20 = i14;
                                    while (true) {
                                        int i21 = length2;
                                        long j19 = jArr5[i19];
                                        j13 = j18;
                                        if ((((~j19) << c11) & j19 & j14) != j14) {
                                            int i22 = 8 - ((~(i19 - i21)) >>> 31);
                                            int i23 = 0;
                                            while (i23 < i22) {
                                                if ((j19 & 255) < j15) {
                                                    jArr3 = jArr4;
                                                    int i24 = (i19 << 3) + i23;
                                                    i12 = i23;
                                                    i13 = i17;
                                                    if (!D0.g.e(this.observations, (B) objArr[i24])) {
                                                        x10.A(i24);
                                                    }
                                                } else {
                                                    jArr3 = jArr4;
                                                    i12 = i23;
                                                    i13 = i17;
                                                }
                                                j19 >>= i20;
                                                i23 = i12 + 1;
                                                i17 = i13;
                                                jArr4 = jArr3;
                                            }
                                            jArr2 = jArr4;
                                            i10 = i17;
                                            if (i22 != i20) {
                                                break;
                                            }
                                        } else {
                                            jArr2 = jArr4;
                                            i10 = i17;
                                        }
                                        length2 = i21;
                                        if (i19 == length2) {
                                            break;
                                        }
                                        i19++;
                                        j18 = j13;
                                        i17 = i10;
                                        jArr4 = jArr2;
                                        i20 = 8;
                                    }
                                } else {
                                    jArr2 = jArr4;
                                    j13 = j18;
                                    i10 = i17;
                                    j15 = j17;
                                }
                                zD = x10.d();
                            } else {
                                jArr2 = jArr4;
                                j13 = j18;
                                i10 = i17;
                                j15 = j17;
                                Intrinsics.h(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                zD = !D0.g.e(this.observations, (B) obj2);
                            }
                            if (zD) {
                                w10.v(i18);
                            }
                            i11 = 8;
                        } else {
                            jArr2 = jArr4;
                            j13 = j18;
                            i10 = i17;
                            c11 = c12;
                            j14 = j16;
                            j15 = j17;
                            i11 = i14;
                        }
                        j18 = j13 >> i11;
                        i17 = i10 + 1;
                        i14 = i11;
                        c12 = c11;
                        j16 = j14;
                        j17 = j15;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    c10 = c12;
                    j10 = j16;
                    j12 = j17;
                    if (i16 != i14) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                    c10 = c12;
                    j10 = j16;
                    j12 = j17;
                }
                if (i15 == length) {
                    break;
                }
                i15++;
                c12 = c10;
                j16 = j10;
                j17 = j12;
                jArr4 = jArr;
                i14 = 8;
            }
        } else {
            c10 = 7;
            j10 = -9187201950435737472L;
            j11 = 255;
            j12 = 128;
        }
        if (!this.conditionallyInvalidatedScopes.e()) {
            return;
        }
        Z.X<I0> x11 = this.conditionallyInvalidatedScopes;
        Object[] objArr2 = x11.elements;
        long[] jArr6 = x11.metadata;
        int length3 = jArr6.length - 2;
        if (length3 < 0) {
            return;
        }
        int i25 = 0;
        while (true) {
            long j20 = jArr6[i25];
            if ((((~j20) << c10) & j20 & j10) != j10) {
                int i26 = 8 - ((~(i25 - length3)) >>> 31);
                for (int i27 = 0; i27 < i26; i27++) {
                    if ((j20 & j11) < j12) {
                        int i28 = (i25 << 3) + i27;
                        if (!((I0) objArr2[i28]).w()) {
                            x11.A(i28);
                        }
                    }
                    j20 >>= 8;
                }
                if (i26 != 8) {
                    return;
                }
            }
            if (i25 == length3) {
                return;
            } else {
                i25++;
            }
        }
    }

    /* renamed from: F, reason: from getter */
    public final C5746u getObserverHolder() {
        return this.observerHolder;
    }

    public final void J(B<?> state) {
        if (D0.g.e(this.observations, state)) {
            return;
        }
        D0.g.h(this.derivedStates, state);
    }

    public final void K(Object instance, I0 scope) {
        D0.g.g(this.observations, instance, scope);
    }

    public final void N() {
        synchronized (this.lock) {
            D();
            Z.W<Object, Object> wL = L();
            try {
                this.composer.x1(wL);
                Unit unit = Unit.f142422a;
            } catch (Exception e10) {
                this.invalidations = wL;
                throw e10;
            }
        }
    }

    @Override // androidx.compose.runtime.InterfaceC5756z, androidx.compose.runtime.K0
    public void a(Object value) {
        I0 i0G0;
        int i10;
        int i11;
        int i12;
        if (E() || (i0G0 = this.composer.G0()) == null) {
            return;
        }
        int i13 = 1;
        i0G0.M(true);
        if (i0G0.z(value)) {
            return;
        }
        if (value instanceof M0.x) {
            ((M0.x) value).L(androidx.compose.runtime.snapshots.e.a(1));
        }
        D0.g.a(this.observations, value, i0G0);
        if (value instanceof B) {
            B<?> b10 = (B) value;
            B.a<?> aVarJ = b10.J();
            D0.g.h(this.derivedStates, value);
            Z.a0<M0.w> a0VarB = aVarJ.b();
            Object[] objArr = a0VarB.keys;
            long[] jArr = a0VarB.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i14 = 0;
                while (true) {
                    long j10 = jArr[i14];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i15 = 8;
                        int i16 = 8 - ((~(i14 - length)) >>> 31);
                        int i17 = 0;
                        while (i17 < i16) {
                            if ((j10 & 255) < 128) {
                                i11 = i13;
                                M0.w wVar = (M0.w) objArr[(i14 << 3) + i17];
                                if (wVar instanceof M0.x) {
                                    i12 = i15;
                                    ((M0.x) wVar).L(androidx.compose.runtime.snapshots.e.a(i11));
                                } else {
                                    i12 = i15;
                                }
                                D0.g.a(this.derivedStates, wVar, value);
                            } else {
                                i11 = i13;
                                i12 = i15;
                            }
                            j10 >>= i12;
                            i17++;
                            i13 = i11;
                            i15 = i12;
                        }
                        i10 = i13;
                        if (i16 != i15) {
                            break;
                        }
                    } else {
                        i10 = i13;
                    }
                    if (i14 == length) {
                        break;
                    }
                    i14++;
                    i13 = i10;
                }
            }
            i0G0.y(b10, aVarJ.a());
        }
    }

    @Override // androidx.compose.runtime.InterfaceC5756z
    public void b(Function2<? super Composer, ? super Integer, Unit> content) {
        try {
            synchronized (this.lock) {
                B();
                Z.W<Object, Object> wL = L();
                try {
                    I();
                    this.composer.m0(wL, content, null);
                } catch (Exception e10) {
                    this.invalidations = wL;
                    throw e10;
                }
            }
        } finally {
        }
    }

    @Override // androidx.compose.runtime.InterfaceC5756z
    public void c() {
        synchronized (this.lock) {
            try {
                if (this.lateChanges.d()) {
                    y(this.lateChanges);
                }
                Unit unit = Unit.f142422a;
            } catch (Throwable th2) {
                try {
                    try {
                        if (!this.abandonSet.isEmpty()) {
                            new J0.h(this.abandonSet).h();
                        }
                        throw th2;
                    } catch (Exception e10) {
                        t();
                        throw e10;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.Q0
    public void deactivate() {
        synchronized (this.lock) {
            try {
                boolean z10 = this.slotTable.getGroupsSize() > 0;
                if (z10 || !this.abandonSet.isEmpty()) {
                    J0.o oVar = J0.o.f14530a;
                    Object objA = oVar.a("Compose:deactivate");
                    try {
                        J0.h hVar = new J0.h(this.abandonSet);
                        if (z10) {
                            this.applier.onBeginChanges();
                            SlotWriter slotWriterC = this.slotTable.C();
                            try {
                                ComposerKt.v(slotWriterC, hVar);
                                Unit unit = Unit.f142422a;
                                slotWriterC.L(true);
                                this.applier.onEndChanges();
                                hVar.j();
                            } catch (Throwable th2) {
                                slotWriterC.L(false);
                                throw th2;
                            }
                        }
                        hVar.h();
                        Unit unit2 = Unit.f142422a;
                        oVar.b(objA);
                    } catch (Throwable th3) {
                        J0.o.f14530a.b(objA);
                        throw th3;
                    }
                }
                D0.g.b(this.observations);
                D0.g.b(this.derivedStates);
                D0.g.b(this.invalidations);
                this.changes.a();
                this.lateChanges.a();
                this.composer.r0();
                Unit unit3 = Unit.f142422a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // androidx.compose.runtime.InterfaceC5725j
    public void dispose() {
        synchronized (this.lock) {
            try {
                if (this.composer.getIsComposing()) {
                    C5757z0.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (!this.disposed) {
                    this.disposed = true;
                    this.composable = C5714e.f50260a.b();
                    androidx.compose.runtime.changelist.a aVarH0 = this.composer.getDeferredChanges();
                    if (aVarH0 != null) {
                        y(aVarH0);
                    }
                    boolean z10 = this.slotTable.getGroupsSize() > 0;
                    if (z10 || !this.abandonSet.isEmpty()) {
                        J0.h hVar = new J0.h(this.abandonSet);
                        if (z10) {
                            this.applier.onBeginChanges();
                            SlotWriter slotWriterC = this.slotTable.C();
                            try {
                                ComposerKt.P(slotWriterC, hVar);
                                Unit unit = Unit.f142422a;
                                slotWriterC.L(true);
                                this.applier.clear();
                                this.applier.onEndChanges();
                                hVar.j();
                            } catch (Throwable th2) {
                                slotWriterC.L(false);
                                throw th2;
                            }
                        }
                        hVar.h();
                    }
                    this.composer.s0();
                }
                Unit unit2 = Unit.f142422a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.parent.s(this);
    }

    @Override // androidx.compose.runtime.InterfaceC5756z
    public void e(C5718f0 state) {
        J0.h hVar = new J0.h(this.abandonSet);
        SlotWriter slotWriterC = state.getSlotTable().C();
        try {
            ComposerKt.P(slotWriterC, hVar);
            Unit unit = Unit.f142422a;
            slotWriterC.L(true);
            hVar.j();
        } catch (Throwable th2) {
            slotWriterC.L(false);
            throw th2;
        }
    }

    @Override // androidx.compose.runtime.InterfaceC5756z
    public <R> R g(InterfaceC5756z to2, int groupIndex, Function0<? extends R> block) {
        if (to2 == null || Intrinsics.e(to2, this) || groupIndex < 0) {
            return block.invoke();
        }
        this.invalidationDelegate = (C5733n) to2;
        this.invalidationDelegateGroup = groupIndex;
        try {
            return block.invoke();
        } finally {
            this.invalidationDelegate = null;
            this.invalidationDelegateGroup = 0;
        }
    }

    @Override // androidx.compose.runtime.InterfaceC5756z
    public boolean i() {
        boolean zW0;
        synchronized (this.lock) {
            try {
                B();
                try {
                    Z.W<Object, Object> wL = L();
                    try {
                        I();
                        zW0 = this.composer.W0(wL, null);
                        if (!zW0) {
                            C();
                        }
                    } catch (Exception e10) {
                        this.invalidations = wL;
                        throw e10;
                    }
                } finally {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zW0;
    }

    @Override // androidx.compose.runtime.InterfaceC5725j
    /* renamed from: isDisposed, reason: from getter */
    public boolean getDisposed() {
        return this.disposed;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    @Override // androidx.compose.runtime.InterfaceC5756z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean j(java.util.Set<? extends java.lang.Object> r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof D0.e
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L5c
            D0.e r15 = (D0.e) r15
            Z.j0 r15 = r15.a()
            java.lang.Object[] r0 = r15.elements
            long[] r15 = r15.metadata
            int r3 = r15.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L7d
            r4 = r1
        L16:
            r5 = r15[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L57
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r1
        L30:
            if (r9 >= r7) goto L55
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L51
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r0[r10]
            Z.W<java.lang.Object, java.lang.Object> r11 = r14.observations
            boolean r11 = D0.g.e(r11, r10)
            if (r11 != 0) goto L50
            Z.W<java.lang.Object, java.lang.Object> r11 = r14.derivedStates
            boolean r10 = D0.g.e(r11, r10)
            if (r10 == 0) goto L51
        L50:
            return r2
        L51:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L30
        L55:
            if (r7 != r8) goto L7d
        L57:
            if (r4 == r3) goto L7d
            int r4 = r4 + 1
            goto L16
        L5c:
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.Iterator r15 = r15.iterator()
        L62:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L7d
            java.lang.Object r0 = r15.next()
            Z.W<java.lang.Object, java.lang.Object> r3 = r14.observations
            boolean r3 = D0.g.e(r3, r0)
            if (r3 != 0) goto L7c
            Z.W<java.lang.Object, java.lang.Object> r3 = r14.derivedStates
            boolean r0 = D0.g.e(r3, r0)
            if (r0 == 0) goto L62
        L7c:
            return r2
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C5733n.j(java.util.Set):boolean");
    }

    @Override // androidx.compose.runtime.InterfaceC5756z
    public void m(Function0<Unit> block) {
        this.composer.U0(block);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.Set[]] */
    @Override // androidx.compose.runtime.InterfaceC5756z
    public void n(Set<? extends Object> values) {
        Object obj;
        Set<? extends Object> setJ;
        do {
            obj = this.pendingModifications.get();
            if (obj == null ? true : Intrinsics.e(obj, C5735o.f50321a)) {
                setJ = values;
            } else if (obj instanceof Set) {
                setJ = new Set[]{obj, values};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.pendingModifications).toString());
                }
                Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                setJ = ArraysKt.J((Set[]) obj, values);
            }
        } while (!U.d.a(this.pendingModifications, obj, setJ));
        if (obj == null) {
            synchronized (this.lock) {
                C();
                Unit unit = Unit.f142422a;
            }
        }
    }

    @Override // androidx.compose.runtime.InterfaceC5756z
    public void o() {
        synchronized (this.lock) {
            try {
                y(this.changes);
                C();
                Unit unit = Unit.f142422a;
            } catch (Throwable th2) {
                try {
                    try {
                        if (!this.abandonSet.isEmpty()) {
                            new J0.h(this.abandonSet).h();
                        }
                        throw th2;
                    } catch (Exception e10) {
                        t();
                        throw e10;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.InterfaceC5756z
    public boolean p() {
        return this.composer.getIsComposing();
    }

    @Override // androidx.compose.runtime.Q0
    public void q(Function2<? super Composer, ? super Integer, Unit> content) {
        this.composer.t1();
        A(content);
        this.composer.x0();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    @Override // androidx.compose.runtime.InterfaceC5756z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void r(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.lock
            monitor-enter(r0)
            r14.H(r15)     // Catch: java.lang.Throwable -> L4f
            Z.W<java.lang.Object, java.lang.Object> r1 = r14.derivedStates     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r15 = r1.e(r15)     // Catch: java.lang.Throwable -> L4f
            if (r15 == 0) goto L61
            boolean r1 = r15 instanceof Z.X     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L5c
            Z.X r15 = (Z.X) r15     // Catch: java.lang.Throwable -> L4f
            java.lang.Object[] r1 = r15.elements     // Catch: java.lang.Throwable -> L4f
            long[] r15 = r15.metadata     // Catch: java.lang.Throwable -> L4f
            int r2 = r15.length     // Catch: java.lang.Throwable -> L4f
            int r2 = r2 + (-2)
            if (r2 < 0) goto L61
            r3 = 0
            r4 = r3
        L1f:
            r5 = r15[r4]     // Catch: java.lang.Throwable -> L4f
            long r7 = ~r5     // Catch: java.lang.Throwable -> L4f
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L57
            int r7 = r4 - r2
            int r7 = ~r7     // Catch: java.lang.Throwable -> L4f
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L39:
            if (r9 >= r7) goto L55
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L51
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]     // Catch: java.lang.Throwable -> L4f
            androidx.compose.runtime.B r10 = (androidx.compose.runtime.B) r10     // Catch: java.lang.Throwable -> L4f
            r14.H(r10)     // Catch: java.lang.Throwable -> L4f
            goto L51
        L4f:
            r15 = move-exception
            goto L65
        L51:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L39
        L55:
            if (r7 != r8) goto L61
        L57:
            if (r4 == r2) goto L61
            int r4 = r4 + 1
            goto L1f
        L5c:
            androidx.compose.runtime.B r15 = (androidx.compose.runtime.B) r15     // Catch: java.lang.Throwable -> L4f
            r14.H(r15)     // Catch: java.lang.Throwable -> L4f
        L61:
            kotlin.Unit r15 = kotlin.Unit.f142422a     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r0)
            return
        L65:
            monitor-exit(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C5733n.r(java.lang.Object):void");
    }

    @Override // androidx.compose.runtime.InterfaceC5725j
    public boolean s() {
        boolean z10;
        synchronized (this.lock) {
            z10 = D0.g.f(this.invalidations) > 0;
        }
        return z10;
    }

    @Override // androidx.compose.runtime.InterfaceC5756z
    public void t() {
        this.pendingModifications.set(null);
        this.changes.a();
        this.lateChanges.a();
        if (this.abandonSet.isEmpty()) {
            return;
        }
        new J0.h(this.abandonSet).h();
    }

    @Override // androidx.compose.runtime.InterfaceC5756z
    public void u() {
        synchronized (this.lock) {
            try {
                this.composer.j0();
                if (!this.abandonSet.isEmpty()) {
                    new J0.h(this.abandonSet).h();
                }
                Unit unit = Unit.f142422a;
            } catch (Throwable th2) {
                try {
                    try {
                        if (!this.abandonSet.isEmpty()) {
                            new J0.h(this.abandonSet).h();
                        }
                        throw th2;
                    } catch (Exception e10) {
                        t();
                        throw e10;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.InterfaceC5756z
    public void v() {
        synchronized (this.lock) {
            try {
                for (Object obj : this.slotTable.getSlots()) {
                    I0 i02 = obj instanceof I0 ? (I0) obj : null;
                    if (i02 != null) {
                        i02.invalidate();
                    }
                }
                Unit unit = Unit.f142422a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final boolean M(I0 scope, Object instance) {
        if (p() && this.composer.v1(scope, instance)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.runtime.InterfaceC5725j
    public void d(Function2<? super Composer, ? super Integer, Unit> content) {
        A(content);
    }

    @Override // androidx.compose.runtime.K0
    public T k(I0 scope, Object instance) {
        C5733n c5733n;
        if (scope.k()) {
            scope.F(true);
        }
        Anchor anchor = scope.getAnchor();
        if (anchor != null && anchor.b()) {
            if (!this.slotTable.D(anchor)) {
                synchronized (this.lock) {
                    c5733n = this.invalidationDelegate;
                }
                if (c5733n != null && c5733n.M(scope, instance)) {
                    return T.f50155d;
                }
                return T.f50152a;
            }
            if (!scope.j()) {
                return T.f50152a;
            }
            return G(scope, anchor, instance);
        }
        return T.f50152a;
    }

    public /* synthetic */ C5733n(AbstractC5727k abstractC5727k, Applier applier, CoroutineContext coroutineContext, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC5727k, applier, (i10 & 4) != 0 ? null : coroutineContext);
    }
}
