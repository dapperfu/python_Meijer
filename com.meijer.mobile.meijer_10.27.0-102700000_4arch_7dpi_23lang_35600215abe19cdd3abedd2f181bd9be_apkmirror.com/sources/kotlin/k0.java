package kotlin;

import M0.SnapshotStateList;
import androidx.compose.runtime.A0;
import androidx.compose.runtime.C5712d0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.E;
import androidx.compose.runtime.F;
import androidx.compose.runtime.InterfaceC5724i0;
import androidx.compose.runtime.InterfaceC5728k0;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.J;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.f1;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.t1;
import androidx.compose.runtime.z1;
import java.util.List;
import kotlin.C6312Z;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import qv.C16623P;
import qv.C16648k;
import qv.EnumC16624Q;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010 \n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0004:<+&B1\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB#\b\u0011\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\nB\u001b\b\u0010\u0012\u0006\u0010\u000b\u001a\u00028\u0000\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\rH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u001f\u0010\u0012J\u000f\u0010 \u001a\u00020\u0010H\u0000¢\u0006\u0004\b \u0010\u0012J'\u0010#\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010!\u001a\u00028\u00002\u0006\u0010\"\u001a\u00020\rH\u0007¢\u0006\u0004\b#\u0010$J\u001b\u0010&\u001a\u00020\u00192\n\u0010%\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b&\u0010'J\u001b\u0010(\u001a\u00020\u00192\n\u0010%\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b(\u0010'J)\u0010+\u001a\u00020\u00192\u0018\u0010*\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030)R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0004\b+\u0010,J)\u0010-\u001a\u00020\u00102\u0018\u0010*\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030)R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u00102\u0006\u0010!\u001a\u00028\u0000H\u0000¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u00102\u0006\u0010!\u001a\u00028\u0000H\u0001¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\rH\u0000¢\u0006\u0004\b3\u0010\u001eJ\u000f\u00104\u001a\u00020\u0006H\u0016¢\u0006\u0004\b4\u00105J)\u00108\u001a\u00020\u00102\u0018\u00107\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u000306R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0004\b8\u00109R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001d\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b+\u0010@\u001a\u0004\bA\u00105R+\u0010!\u001a\u00028\u00002\u0006\u0010B\u001a\u00028\u00008F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u00100R7\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00000G2\f\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000G8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b1\u0010C\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR+\u0010P\u001a\u00020\r2\u0006\u0010B\u001a\u00020\r8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010M\u001a\u0004\bN\u0010\u000f\"\u0004\bO\u0010\u001eR+\u0010T\u001a\u00020\r2\u0006\u0010B\u001a\u00020\r8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bQ\u0010M\u001a\u0004\bR\u0010\u000f\"\u0004\bS\u0010\u001eR+\u0010Z\u001a\u00020\u00192\u0006\u0010B\u001a\u00020\u00198B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bU\u0010C\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR,\u0010^\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030)R\b\u0012\u0004\u0012\u00028\u00000\u00000[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u001e\u0010_\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010]R+\u0010c\u001a\u00020\u00192\u0006\u0010B\u001a\u00020\u00198G@AX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b`\u0010C\u001a\u0004\ba\u0010W\"\u0004\bb\u0010YR\"\u0010f\u001a\u00020\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bd\u0010F\u001a\u0004\b`\u0010\u000f\"\u0004\be\u0010\u001eR\u001b\u0010i\u001a\u00020\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bH\u0010g\u001a\u0004\bh\u0010\u000fR\u0011\u0010j\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\bU\u0010ER\u0011\u0010l\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bk\u0010WR$\u0010\"\u001a\u00020\r2\u0006\u0010m\u001a\u00020\r8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bd\u0010\u000f\"\u0004\bn\u0010\u001eR)\u0010q\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030)R\b\u0012\u0004\u0012\u00028\u00000\u00000o8F¢\u0006\u0006\u001a\u0004\bQ\u0010pR\u001a\u0010s\u001a\u00020\u00198GX\u0087\u0004¢\u0006\f\u0012\u0004\br\u0010\u0012\u001a\u0004\b\\\u0010W¨\u0006t"}, d2 = {"Lc0/k0;", "S", "", "Lc0/m0;", "transitionState", "parentTransition", "", "label", "<init>", "(Lc0/m0;Lc0/k0;Ljava/lang/String;)V", "(Lc0/m0;Ljava/lang/String;)V", "initialState", "(Ljava/lang/Object;Ljava/lang/String;)V", "", "f", "()J", "", "u", "()V", "frameTimeNanos", "", "durationScale", "w", "(JF)V", "scaledPlayTimeNanos", "", "scaleToEnd", "x", "(JZ)V", "z", "(J)V", "v", "y", "targetState", "playTimeNanos", "D", "(Ljava/lang/Object;Ljava/lang/Object;J)V", "transition", "d", "(Lc0/k0;)Z", "C", "Lc0/k0$d;", "animation", "c", "(Lc0/k0$d;)Z", "B", "(Lc0/k0$d;)V", "M", "(Ljava/lang/Object;)V", "e", "(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)V", "E", "toString", "()Ljava/lang/String;", "Lc0/k0$a;", "deferredAnimation", "A", "(Lc0/k0$a;)V", "a", "Lc0/m0;", "b", "Lc0/k0;", "getParentTransition", "()Lc0/k0;", "Ljava/lang/String;", "j", "<set-?>", "Landroidx/compose/runtime/l0;", "o", "()Ljava/lang/Object;", "J", "Lc0/k0$b;", "m", "()Lc0/k0$b;", "H", "(Lc0/k0$b;)V", "segment", "Landroidx/compose/runtime/k0;", "r", "L", "_playTimeNanos", "g", "n", "I", "startTimeNanos", "h", "q", "()Z", "K", "(Z)V", "updateChildrenNeeded", "LM0/m;", "i", "LM0/m;", "_animations", "_transitions", "k", "t", "G", "isSeeking", "l", "setLastSeekedTimeNanos$animation_core_release", "lastSeekedTimeNanos", "Landroidx/compose/runtime/z1;", "p", "totalDurationNanos", "currentState", "s", "isRunning", "value", "F", "", "()Ljava/util/List;", "animations", "getHasInitialValueAnimations$annotations", "hasInitialValueAnimations", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class k0<S> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final m0<S> transitionState;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k0<?> parentTransition;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String label;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 targetState;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 segment;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5728k0 _playTimeNanos;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5728k0 startTimeNanos;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 updateChildrenNeeded;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final SnapshotStateList<k0<S>.d<?, ?>> _animations;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final SnapshotStateList<k0<?>> _transitions;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 isSeeking;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private long lastSeekedTimeNanos;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final z1 totalDurationNanos;

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\u0004\u0018\u0000*\u0004\b\u0001\u0010\u0001*\b\b\u0002\u0010\u0003*\u00020\u00022\u00020\u0004:\u0001\u0015B%\b\u0000\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ[\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u00142#\u0010\u000f\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r0\u000b¢\u0006\u0002\b\u000e2!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00028\u00010\u000b¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u0018\u0010\u0019R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R{\u0010(\u001a*\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010!R\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000R\b\u0012\u0004\u0012\u00028\u00000\"2.\u0010#\u001a*\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010!R\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000R\b\u0012\u0004\u0012\u00028\u00000\"8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b\u001d\u0010&\"\u0004\b$\u0010'¨\u0006)"}, d2 = {"Lc0/k0$a;", "T", "Lc0/q;", "V", "", "Lc0/o0;", "typeConverter", "", "label", "<init>", "(Lc0/k0;Lc0/o0;Ljava/lang/String;)V", "Lkotlin/Function1;", "Lc0/k0$b;", "Lc0/F;", "Lkotlin/ExtensionFunctionType;", "transitionSpec", "Lkotlin/ParameterName;", "name", "state", "targetValueByState", "Landroidx/compose/runtime/z1;", "a", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/z1;", "", "d", "()V", "Lc0/o0;", "getTypeConverter", "()Lc0/o0;", "b", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "Lc0/k0$a$a;", "Lc0/k0;", "<set-?>", "c", "Landroidx/compose/runtime/l0;", "()Lc0/k0$a$a;", "(Lc0/k0$a$a;)V", "data", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public final class a<T, V extends AbstractC6334q> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final o0<T, V> typeConverter;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String label;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5730l0 data = t1.e(null, null, 2, null);

        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0080\u0004\u0018\u0000*\u0004\b\u0003\u0010\u0001*\b\b\u0004\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00030\u0004Bm\u0012\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u0005R\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012#\u0010\f\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\n0\b¢\u0006\u0002\b\u000b\u0012!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00028\u00030\b¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0015\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u0015\u0010\u0016R-\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u0005R\b\u0012\u0004\u0012\u00028\u00000\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR?\u0010\f\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\n0\b¢\u0006\u0002\b\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R=\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00028\u00030\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R\u0014\u0010&\u001a\u00028\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lc0/k0$a$a;", "T", "Lc0/q;", "V", "Landroidx/compose/runtime/z1;", "Lc0/k0$d;", "Lc0/k0;", "animation", "Lkotlin/Function1;", "Lc0/k0$b;", "Lc0/F;", "Lkotlin/ExtensionFunctionType;", "transitionSpec", "Lkotlin/ParameterName;", "name", "state", "targetValueByState", "<init>", "(Lc0/k0$a;Lc0/k0$d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "segment", "", "u", "(Lc0/k0$b;)V", "a", "Lc0/k0$d;", "f", "()Lc0/k0$d;", "b", "Lkotlin/jvm/functions/Function1;", "l", "()Lkotlin/jvm/functions/Function1;", "p", "(Lkotlin/jvm/functions/Function1;)V", "c", "k", "m", "getValue", "()Ljava/lang/Object;", "value", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: c0.k0$a$a, reason: collision with other inner class name */
        public final class C1201a<T, V extends AbstractC6334q> implements z1<T> {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final k0<S>.d<T, V> animation;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private Function1<? super b<S>, ? extends InterfaceC6293F<T>> transitionSpec;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            private Function1<? super S, ? extends T> targetValueByState;

            public C1201a(k0<S>.d<T, V> dVar, Function1<? super b<S>, ? extends InterfaceC6293F<T>> function1, Function1<? super S, ? extends T> function12) {
                this.animation = dVar;
                this.transitionSpec = function1;
                this.targetValueByState = function12;
            }

            public final k0<S>.d<T, V> f() {
                return this.animation;
            }

            @Override // androidx.compose.runtime.z1
            public T getValue() {
                u(k0.this.m());
                return this.animation.getValue();
            }

            public final Function1<S, T> k() {
                return this.targetValueByState;
            }

            public final Function1<b<S>, InterfaceC6293F<T>> l() {
                return this.transitionSpec;
            }

            public final void m(Function1<? super S, ? extends T> function1) {
                this.targetValueByState = function1;
            }

            public final void p(Function1<? super b<S>, ? extends InterfaceC6293F<T>> function1) {
                this.transitionSpec = function1;
            }

            public final void u(b<S> segment) {
                T tInvoke = this.targetValueByState.invoke(segment.a());
                if (!k0.this.t()) {
                    this.animation.T(tInvoke, this.transitionSpec.invoke(segment));
                } else {
                    this.animation.S(this.targetValueByState.invoke(segment.b()), tInvoke, this.transitionSpec.invoke(segment));
                }
            }
        }

        public a(o0<T, V> o0Var, String str) {
            this.typeConverter = o0Var;
            this.label = str;
        }

        public final k0<S>.C1201a<T, V>.C0933a<T, V> b() {
            return (C1201a) this.data.getValue();
        }

        public final void c(k0<S>.C1201a<T, V>.C0933a<T, V> c1201a) {
            this.data.setValue(c1201a);
        }

        public final z1<T> a(Function1<? super b<S>, ? extends InterfaceC6293F<T>> transitionSpec, Function1<? super S, ? extends T> targetValueByState) {
            k0<S>.C1201a<T, V>.C0933a<T, V> c1201aB = b();
            if (c1201aB == null) {
                k0<S> k0Var = k0.this;
                c1201aB = new C1201a<>(k0Var.new d(targetValueByState.invoke(k0Var.h()), C6329l.i(this.typeConverter, targetValueByState.invoke(k0.this.h())), this.typeConverter, this.label), transitionSpec, targetValueByState);
                k0<S> k0Var2 = k0.this;
                c(c1201aB);
                k0Var2.c(c1201aB.f());
            }
            k0<S> k0Var3 = k0.this;
            c1201aB.m(targetValueByState);
            c1201aB.p(transitionSpec);
            c1201aB.u(k0Var3.m());
            return c1201aB;
        }

        public final void d() {
            k0<S>.C1201a<T, V>.C0933a<T, V> c1201aB = b();
            if (c1201aB != null) {
                k0<S> k0Var = k0.this;
                c1201aB.f().S(c1201aB.k().invoke(k0Var.m().b()), c1201aB.k().invoke(k0Var.m().a()), c1201aB.l().invoke(k0Var.m()));
            }
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u0012\u0006\u0010\u0004\u001a\u00028\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00028\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00028\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u000f\u0010\u0012¨\u0006\u0013"}, d2 = {"Lc0/k0$c;", "S", "Lc0/k0$b;", "initialState", "targetState", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class c<S> implements b<S> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final S initialState;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final S targetState;

        @Override // c0.k0.b
        public S a() {
            return this.targetState;
        }

        @Override // c0.k0.b
        public S b() {
            return this.initialState;
        }

        public boolean equals(Object other) {
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return Intrinsics.e(b(), bVar.b()) && Intrinsics.e(a(), bVar.a());
        }

        public c(S s10, S s11) {
            this.initialState = s10;
            this.targetState = s11;
        }

        public int hashCode() {
            int iHashCode;
            S sB = b();
            int iHashCode2 = 0;
            if (sB != null) {
                iHashCode = sB.hashCode();
            } else {
                iHashCode = 0;
            }
            int i10 = iHashCode * 31;
            S sA = a();
            if (sA != null) {
                iHashCode2 = sA.hashCode();
            }
            return i10 + iHashCode2;
        }
    }

    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0004\u0018\u0000*\u0004\b\u0001\u0010\u0001*\b\b\u0002\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00010\u0004B5\b\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0001\u0012\u0006\u0010\u0006\u001a\u00028\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0005\u001a\u00028\u00012\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u0001\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00028\u00012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u001eH\u0000¢\u0006\u0004\b\u0001\u0010 J-\u0010!\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u001d\u001a\u00028\u00012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u001eH\u0000¢\u0006\u0004\b!\u0010\"R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00078\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u001cR+\u0010\u001d\u001a\u00028\u00012\u0006\u0010*\u001a\u00028\u00018B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00028\u0001018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R7\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u001e2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010\u001e8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b5\u0010,\u001a\u0004\b6\u00107\"\u0004\b8\u00109RC\u0010?\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020:2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020:8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b;\u0010,\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010B\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR+\u0010H\u001a\u00020\r2\u0006\u0010*\u001a\u00020\r8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bC\u0010,\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR+\u0010P\u001a\u00020I2\u0006\u0010*\u001a\u00020I8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u0016\u0010S\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR+\u0010V\u001a\u00028\u00012\u0006\u0010*\u001a\u00028\u00018V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b6\u0010,\u001a\u0004\bT\u0010.\"\u0004\bU\u00100R\u0016\u0010Y\u001a\u00028\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR+\u0010^\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00128@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\bW\u0010\\\"\u0004\b]\u0010\u0018R\u0016\u0010`\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010RR\u001a\u0010c\u001a\b\u0012\u0004\u0012\u00028\u00010\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR$\u0010e\u001a\u0004\u0018\u00010d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bZ\u0010g\"\u0004\bh\u0010i¨\u0006j"}, d2 = {"Lc0/k0$d;", "T", "Lc0/q;", "V", "Landroidx/compose/runtime/z1;", "initialValue", "initialVelocityVector", "Lc0/o0;", "typeConverter", "", "label", "<init>", "(Lc0/k0;Ljava/lang/Object;Lc0/q;Lc0/o0;Ljava/lang/String;)V", "", "isInterrupted", "", "Q", "(Ljava/lang/Object;Z)V", "", "playTimeNanos", "scaleToEnd", "w", "(JZ)V", "D", "(J)V", "z", "()V", "toString", "()Ljava/lang/String;", "targetValue", "Lc0/F;", "animationSpec", "(Ljava/lang/Object;Lc0/F;)V", "S", "(Ljava/lang/Object;Ljava/lang/Object;Lc0/F;)V", "a", "Lc0/o0;", "getTypeConverter", "()Lc0/o0;", "b", "Ljava/lang/String;", "getLabel", "<set-?>", "c", "Landroidx/compose/runtime/l0;", "u", "()Ljava/lang/Object;", "O", "(Ljava/lang/Object;)V", "Lc0/d0;", "d", "Lc0/d0;", "defaultSpring", "e", "k", "()Lc0/F;", "K", "(Lc0/F;)V", "Lc0/j0;", "f", "()Lc0/j0;", "H", "(Lc0/j0;)V", "animation", "g", "Lc0/j0;", "initialValueAnimation", "h", "v", "()Z", "M", "(Z)V", "isFinished", "", "i", "Landroidx/compose/runtime/i0;", "p", "()F", "N", "(F)V", "resetSnapValue", "j", "Z", "useOnlyInitialValue", "getValue", "P", "value", "l", "Lc0/q;", "velocityVector", "m", "Landroidx/compose/runtime/k0;", "()J", "L", "durationNanos", "n", "isSeeking", "o", "Lc0/F;", "interruptionSpec", "Lc0/Z$b;", "initialValueState", "Lc0/Z$b;", "()Lc0/Z$b;", "setInitialValueState$animation_core_release", "(Lc0/Z$b;)V", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public final class d<T, V extends AbstractC6334q> implements z1<T> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final o0<T, V> typeConverter;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String label;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5730l0 targetValue;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final C6320d0<T> defaultSpring;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5730l0 animationSpec;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5730l0 animation;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private j0<T, V> initialValueAnimation;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5730l0 isFinished;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5724i0 resetSnapValue;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private boolean useOnlyInitialValue;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5730l0 value;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        private V velocityVector;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5728k0 durationNanos;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata */
        private boolean isSeeking;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC6293F<T> interruptionSpec;

        public final C6312Z.b m() {
            return null;
        }

        public d(T t10, V v10, o0<T, V> o0Var, String str) {
            T tInvoke;
            this.typeConverter = o0Var;
            this.label = str;
            this.targetValue = t1.e(t10, null, 2, null);
            C6320d0<T> c6320d0J = C6327j.j(0.0f, 0.0f, null, 7, null);
            this.defaultSpring = c6320d0J;
            this.animationSpec = t1.e(c6320d0J, null, 2, null);
            this.animation = t1.e(new j0(k(), o0Var, t10, u(), v10), null, 2, null);
            this.isFinished = t1.e(Boolean.TRUE, null, 2, null);
            this.resetSnapValue = A0.a(-1.0f);
            this.value = t1.e(t10, null, 2, null);
            this.velocityVector = v10;
            this.durationNanos = f1.a(f().getDurationNanos());
            Float f10 = E0.h().get(o0Var);
            if (f10 != null) {
                float fFloatValue = f10.floatValue();
                V vInvoke = o0Var.a().invoke(t10);
                int size = vInvoke.getSize();
                for (int i10 = 0; i10 < size; i10++) {
                    vInvoke.e(i10, fFloatValue);
                }
                tInvoke = this.typeConverter.b().invoke(vInvoke);
            } else {
                tInvoke = null;
            }
            this.interruptionSpec = C6327j.j(0.0f, 0.0f, tInvoke, 3, null);
        }

        private final void H(j0<T, V> j0Var) {
            this.animation.setValue(j0Var);
        }

        private final void K(InterfaceC6293F<T> interfaceC6293F) {
            this.animationSpec.setValue(interfaceC6293F);
        }

        private final void O(T t10) {
            this.targetValue.setValue(t10);
        }

        private final void Q(T initialValue, boolean isInterrupted) {
            j0<T, V> j0Var = this.initialValueAnimation;
            if (Intrinsics.e(j0Var != null ? j0Var.g() : null, u())) {
                H(new j0<>(this.interruptionSpec, this.typeConverter, initialValue, initialValue, C6335r.g(this.velocityVector)));
                this.useOnlyInitialValue = true;
                L(f().getDurationNanos());
                return;
            }
            InterfaceC6326i interfaceC6326iK = (!isInterrupted || this.isSeeking || (k() instanceof C6320d0)) ? k() : this.interruptionSpec;
            if (k0.this.l() > 0) {
                interfaceC6326iK = C6327j.c(interfaceC6326iK, k0.this.l());
            }
            H(new j0<>(interfaceC6326iK, this.typeConverter, initialValue, u(), this.velocityVector));
            L(f().getDurationNanos());
            this.useOnlyInitialValue = false;
            k0.this.u();
        }

        /* JADX WARN: Multi-variable type inference failed */
        static /* synthetic */ void R(d dVar, Object obj, boolean z10, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                obj = dVar.getValue();
            }
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            dVar.Q(obj, z10);
        }

        private final T u() {
            return this.targetValue.getValue();
        }

        public final void L(long j10) {
            this.durationNanos.I(j10);
        }

        public final void M(boolean z10) {
            this.isFinished.setValue(Boolean.valueOf(z10));
        }

        public final void N(float f10) {
            this.resetSnapValue.B(f10);
        }

        public void P(T t10) {
            this.value.setValue(t10);
        }

        public final void T(T targetValue, InterfaceC6293F<T> animationSpec) {
            if (this.useOnlyInitialValue) {
                j0<T, V> j0Var = this.initialValueAnimation;
                if (Intrinsics.e(targetValue, j0Var != null ? j0Var.g() : null)) {
                    return;
                }
            }
            if (Intrinsics.e(u(), targetValue) && p() == -1.0f) {
                return;
            }
            O(targetValue);
            K(animationSpec);
            Q(p() == -3.0f ? targetValue : getValue(), !v());
            M(p() == -3.0f);
            if (p() >= 0.0f) {
                P(f().f((long) (f().getDurationNanos() * p())));
            } else if (p() == -3.0f) {
                P(targetValue);
            }
            this.useOnlyInitialValue = false;
            N(-1.0f);
        }

        public final j0<T, V> f() {
            return (j0) this.animation.getValue();
        }

        @Override // androidx.compose.runtime.z1
        public T getValue() {
            return this.value.getValue();
        }

        public final InterfaceC6293F<T> k() {
            return (InterfaceC6293F) this.animationSpec.getValue();
        }

        public final long l() {
            return this.durationNanos.c();
        }

        public final float p() {
            return this.resetSnapValue.b();
        }

        public String toString() {
            return "current value: " + getValue() + ", target: " + u() + ", spec: " + k();
        }

        public final boolean v() {
            return ((Boolean) this.isFinished.getValue()).booleanValue();
        }

        public final void w(long playTimeNanos, boolean scaleToEnd) {
            if (scaleToEnd) {
                playTimeNanos = f().getDurationNanos();
            }
            P(f().f(playTimeNanos));
            this.velocityVector = (V) f().b(playTimeNanos);
            if (f().c(playTimeNanos)) {
                M(true);
            }
        }

        public final void z() {
            N(-2.0f);
        }

        public final void D(long playTimeNanos) {
            if (p() == -1.0f) {
                this.isSeeking = true;
                if (Intrinsics.e(f().g(), f().i())) {
                    P(f().g());
                } else {
                    P(f().f(playTimeNanos));
                    this.velocityVector = (V) f().b(playTimeNanos);
                }
            }
        }

        public final void S(T initialValue, T targetValue, InterfaceC6293F<T> animationSpec) {
            O(targetValue);
            K(animationSpec);
            if (Intrinsics.e(f().i(), initialValue) && Intrinsics.e(f().g(), targetValue)) {
                return;
            }
            R(this, initialValue, false, 2, null);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "Landroidx/compose/runtime/F;", "Landroidx/compose/runtime/E;", "a", "(Landroidx/compose/runtime/F;)Landroidx/compose/runtime/E;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class e extends Lambda implements Function1<F, E> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC16622O f61161f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ k0<S> f61162g;

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.animation.core.Transition$animateTo$1$1$1", f = "Transition.kt", l = {1192}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            float f61163a;

            /* renamed from: b, reason: collision with root package name */
            int f61164b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f61165c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ k0<S> f61166d;

            @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"S", "", "it", "", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
            /* renamed from: c0.k0$e$a$a, reason: collision with other inner class name */
            static final class C1202a extends Lambda implements Function1<Long, Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ k0<S> f61167f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ float f61168g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1202a(k0<S> k0Var, float f10) {
                    super(1);
                    this.f61167f = k0Var;
                    this.f61168g = f10;
                }

                public final void a(long j10) {
                    if (this.f61167f.t()) {
                        return;
                    }
                    this.f61167f.w(j10, this.f61168g);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Long l10) {
                    a(l10.longValue());
                    return Unit.f142422a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k0<S> k0Var, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f61166d = k0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f61166d, continuation);
                aVar.f61165c = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                float fN;
                InterfaceC16622O interfaceC16622O;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f61164b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        fN = this.f61163a;
                        interfaceC16622O = (InterfaceC16622O) this.f61165c;
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O2 = (InterfaceC16622O) this.f61165c;
                    fN = i0.n(interfaceC16622O2.getCoroutineContext());
                    interfaceC16622O = interfaceC16622O2;
                }
                while (C16623P.i(interfaceC16622O)) {
                    C1202a c1202a = new C1202a(this.f61166d, fN);
                    this.f61165c = interfaceC16622O;
                    this.f61163a = fN;
                    this.f61164b = 1;
                    if (C5712d0.c(c1202a, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"c0/k0$e$b", "Landroidx/compose/runtime/E;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension
        public static final class b implements E {
            @Override // androidx.compose.runtime.E
            public void dispose() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(InterfaceC16622O interfaceC16622O, k0<S> k0Var) {
            super(1);
            this.f61161f = interfaceC16622O;
            this.f61162g = k0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final E invoke(F f10) {
            C16648k.d(this.f61161f, null, EnumC16624Q.f157614d, new a(this.f61162g, null), 1, null);
            return new b();
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ k0<S> f61169f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ S f61170g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f61171h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(k0<S> k0Var, S s10, int i10) {
            super(2);
            this.f61169f = k0Var;
            this.f61170g = s10;
            this.f61171h = i10;
        }

        public final void a(Composer composer, int i10) {
            this.f61169f.e(this.f61170g, composer, J0.a(this.f61171h | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"S", "", "c", "()Ljava/lang/Long;"}, k = 3, mv = {1, 9, 0})
    static final class g extends Lambda implements Function0<Long> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ k0<S> f61172f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(k0<S> k0Var) {
            super(0);
            this.f61172f = k0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            return Long.valueOf(this.f61172f.f());
        }
    }

    public k0(m0<S> m0Var, k0<?> k0Var, String str) {
        this.transitionState = m0Var;
        this.parentTransition = k0Var;
        this.label = str;
        this.targetState = t1.e(h(), null, 2, null);
        this.segment = t1.e(new c(h(), h()), null, 2, null);
        this._playTimeNanos = f1.a(0L);
        this.startTimeNanos = f1.a(Long.MIN_VALUE);
        Boolean bool = Boolean.FALSE;
        this.updateChildrenNeeded = t1.e(bool, null, 2, null);
        this._animations = o1.f();
        this._transitions = o1.f();
        this.isSeeking = t1.e(bool, null, 2, null);
        this.totalDurationNanos = o1.e(new g(this));
        m0Var.f(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u() {
        K(true);
        if (t()) {
            SnapshotStateList<k0<S>.d<?, ?>> snapshotStateList = this._animations;
            int size = snapshotStateList.size();
            long jMax = 0;
            for (int i10 = 0; i10 < size; i10++) {
                k0<S>.d<?, ?> dVar = snapshotStateList.get(i10);
                jMax = Math.max(jMax, dVar.l());
                dVar.D(this.lastSeekedTimeNanos);
            }
            K(false);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\u001c\u0010\u0005\u001a\u00020\u0004*\u00028\u00012\u0006\u0010\u0003\u001a\u00028\u0001H\u0096\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00028\u00018&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00028\u00018&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lc0/k0$b;", "S", "", "targetState", "", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "b", "()Ljava/lang/Object;", "initialState", "a", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b<S> {
        S a();

        S b();

        default boolean c(S s10, S s11) {
            if (Intrinsics.e(s10, b()) && Intrinsics.e(s11, a())) {
                return true;
            }
            return false;
        }
    }

    private final void H(b<S> bVar) {
        this.segment.setValue(bVar);
    }

    private final void K(boolean z10) {
        this.updateChildrenNeeded.setValue(Boolean.valueOf(z10));
    }

    private final void L(long j10) {
        this._playTimeNanos.I(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long f() {
        SnapshotStateList<k0<S>.d<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        long jMax = 0;
        for (int i10 = 0; i10 < size; i10++) {
            jMax = Math.max(jMax, snapshotStateList.get(i10).l());
        }
        SnapshotStateList<k0<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            jMax = Math.max(jMax, snapshotStateList2.get(i11).f());
        }
        return jMax;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean q() {
        return ((Boolean) this.updateChildrenNeeded.getValue()).booleanValue();
    }

    private final long r() {
        return this._playTimeNanos.c();
    }

    public final void B(k0<S>.d<?, ?> animation) {
        this._animations.remove(animation);
    }

    public final boolean C(k0<?> transition) {
        return this._transitions.remove(transition);
    }

    @JvmName
    public final void D(S initialState, S targetState, long playTimeNanos) {
        I(Long.MIN_VALUE);
        this.transitionState.e(false);
        if (!t() || !Intrinsics.e(h(), initialState) || !Intrinsics.e(o(), targetState)) {
            if (!Intrinsics.e(h(), initialState)) {
                m0<S> m0Var = this.transitionState;
                if (m0Var instanceof C6307U) {
                    m0Var.d(initialState);
                }
            }
            J(targetState);
            G(true);
            H(new c(initialState, targetState));
        }
        SnapshotStateList<k0<?>> snapshotStateList = this._transitions;
        int size = snapshotStateList.size();
        for (int i10 = 0; i10 < size; i10++) {
            k0<?> k0Var = snapshotStateList.get(i10);
            Intrinsics.h(k0Var, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (k0Var.t()) {
                k0Var.D(k0Var.h(), k0Var.o(), playTimeNanos);
            }
        }
        SnapshotStateList<k0<S>.d<?, ?>> snapshotStateList2 = this._animations;
        int size2 = snapshotStateList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            snapshotStateList2.get(i11).D(playTimeNanos);
        }
        this.lastSeekedTimeNanos = playTimeNanos;
    }

    public final void F(long j10) {
        if (this.parentTransition == null) {
            L(j10);
        }
    }

    public final void G(boolean z10) {
        this.isSeeking.setValue(Boolean.valueOf(z10));
    }

    public final void I(long j10) {
        this.startTimeNanos.I(j10);
    }

    public final void J(S s10) {
        this.targetState.setValue(s10);
    }

    public final boolean c(k0<S>.d<?, ?> animation) {
        return this._animations.add(animation);
    }

    public final boolean d(k0<?> transition) {
        return this._transitions.add(transition);
    }

    public final List<k0<S>.d<?, ?>> g() {
        return this._animations;
    }

    public final S h() {
        return this.transitionState.a();
    }

    public final boolean i() {
        SnapshotStateList<k0<S>.d<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i10 = 0; i10 < size; i10++) {
            snapshotStateList.get(i10).m();
        }
        SnapshotStateList<k0<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            if (snapshotStateList2.get(i11).i()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: k, reason: from getter */
    public final long getLastSeekedTimeNanos() {
        return this.lastSeekedTimeNanos;
    }

    public final long l() {
        k0<?> k0Var = this.parentTransition;
        return k0Var != null ? k0Var.l() : r();
    }

    public final b<S> m() {
        return (b) this.segment.getValue();
    }

    public final long n() {
        return this.startTimeNanos.c();
    }

    public final S o() {
        return (S) this.targetState.getValue();
    }

    public final long p() {
        return ((Number) this.totalDurationNanos.getValue()).longValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean t() {
        return ((Boolean) this.isSeeking.getValue()).booleanValue();
    }

    public final void y() {
        I(Long.MIN_VALUE);
        m0<S> m0Var = this.transitionState;
        if (m0Var instanceof C6307U) {
            m0Var.d(o());
        }
        F(0L);
        this.transitionState.e(false);
        SnapshotStateList<k0<?>> snapshotStateList = this._transitions;
        int size = snapshotStateList.size();
        for (int i10 = 0; i10 < size; i10++) {
            snapshotStateList.get(i10).y();
        }
    }

    public final void A(k0<S>.a<?, ?> deferredAnimation) {
        k0<S>.d<?, ?> dVarF;
        k0<S>.C1201a<?, ?>.C0933a<?, V> c1201aB = deferredAnimation.b();
        if (c1201aB != 0 && (dVarF = c1201aB.f()) != null) {
            B(dVarF);
        }
    }

    public final void E(long playTimeNanos) {
        if (n() == Long.MIN_VALUE) {
            I(playTimeNanos);
        }
        F(playTimeNanos);
        K(false);
        SnapshotStateList<k0<S>.d<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i10 = 0; i10 < size; i10++) {
            snapshotStateList.get(i10).D(playTimeNanos);
        }
        SnapshotStateList<k0<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            k0<?> k0Var = snapshotStateList2.get(i11);
            if (!Intrinsics.e(k0Var.o(), k0Var.h())) {
                k0Var.E(playTimeNanos);
            }
        }
    }

    public final void M(S targetState) {
        if (!Intrinsics.e(o(), targetState)) {
            H(new c(o(), targetState));
            if (!Intrinsics.e(h(), o())) {
                this.transitionState.d(o());
            }
            J(targetState);
            if (!s()) {
                K(true);
            }
            SnapshotStateList<k0<S>.d<?, ?>> snapshotStateList = this._animations;
            int size = snapshotStateList.size();
            for (int i10 = 0; i10 < size; i10++) {
                snapshotStateList.get(i10).z();
            }
        }
    }

    public final void e(S s10, Composer composer, int i10) {
        int i11;
        boolean z10;
        int i12;
        boolean zD;
        int i13;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1493585151);
        if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                zD = composerStartRestartGroup.V(s10);
            } else {
                zD = composerStartRestartGroup.D(s10);
            }
            if (zD) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.V(this)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        boolean z11 = false;
        if ((i11 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (composerStartRestartGroup.p(z10, i11 & 1)) {
            if (ComposerKt.M()) {
                ComposerKt.U(-1493585151, i11, -1, "androidx.compose.animation.core.Transition.animateTo (Transition.kt:1176)");
            }
            if (!t()) {
                composerStartRestartGroup.startReplaceGroup(1822801203);
                M(s10);
                if (Intrinsics.e(s10, h()) && !s() && !q()) {
                    composerStartRestartGroup.startReplaceGroup(1824275067);
                    composerStartRestartGroup.P();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1823032494);
                    Object objB = composerStartRestartGroup.B();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objB == companion.a()) {
                        objB = J.k(EmptyCoroutineContext.f142646a, composerStartRestartGroup);
                        composerStartRestartGroup.t(objB);
                    }
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) objB;
                    boolean zD2 = composerStartRestartGroup.D(interfaceC16622O);
                    int i14 = i11 & 112;
                    if (i14 == 32) {
                        z11 = true;
                    }
                    boolean z12 = zD2 | z11;
                    Object objB2 = composerStartRestartGroup.B();
                    if (z12 || objB2 == companion.a()) {
                        objB2 = new e(interfaceC16622O, this);
                        composerStartRestartGroup.t(objB2);
                    }
                    J.b(interfaceC16622O, this, (Function1) objB2, composerStartRestartGroup, i14);
                    composerStartRestartGroup.P();
                }
                composerStartRestartGroup.P();
            } else {
                composerStartRestartGroup.startReplaceGroup(1824284987);
                composerStartRestartGroup.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        } else {
            composerStartRestartGroup.K();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new f(this, s10, i10));
        }
    }

    public final boolean s() {
        if (n() != Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public String toString() {
        List<k0<S>.d<?, ?>> listG = g();
        int size = listG.size();
        String str = "Transition animation values: ";
        for (int i10 = 0; i10 < size; i10++) {
            str = str + listG.get(i10) + ", ";
        }
        return str;
    }

    public final void v() {
        y();
        this.transitionState.g();
    }

    public final void w(long frameTimeNanos, float durationScale) {
        boolean z10;
        if (n() == Long.MIN_VALUE) {
            z(frameTimeNanos);
        }
        long jN = frameTimeNanos - n();
        if (durationScale != 0.0f) {
            jN = MathKt.e(jN / durationScale);
        }
        F(jN);
        if (durationScale == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        x(jN, z10);
    }

    public final void x(long scaledPlayTimeNanos, boolean scaleToEnd) {
        boolean z10 = true;
        if (n() == Long.MIN_VALUE) {
            z(scaledPlayTimeNanos);
        } else if (!this.transitionState.c()) {
            this.transitionState.e(true);
        }
        K(false);
        SnapshotStateList<k0<S>.d<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i10 = 0; i10 < size; i10++) {
            k0<S>.d<?, ?> dVar = snapshotStateList.get(i10);
            if (!dVar.v()) {
                dVar.w(scaledPlayTimeNanos, scaleToEnd);
            }
            if (!dVar.v()) {
                z10 = false;
            }
        }
        SnapshotStateList<k0<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            k0<?> k0Var = snapshotStateList2.get(i11);
            if (!Intrinsics.e(k0Var.o(), k0Var.h())) {
                k0Var.x(scaledPlayTimeNanos, scaleToEnd);
            }
            if (!Intrinsics.e(k0Var.o(), k0Var.h())) {
                z10 = false;
            }
        }
        if (z10) {
            y();
        }
    }

    public final void z(long frameTimeNanos) {
        I(frameTimeNanos);
        this.transitionState.e(true);
    }

    @PublishedApi
    public k0(m0<S> m0Var, String str) {
        this(m0Var, null, str);
    }

    public k0(S s10, String str) {
        this(new C6307U(s10), null, str);
    }
}
