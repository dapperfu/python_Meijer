package androidx.compose.runtime.snapshots;

import J0.n;
import M0.w;
import M0.x;
import Z.S;
import Z.W;
import Z.X;
import Z.a0;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C;
import androidx.compose.runtime.C5899z0;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.o1;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001*B0\u0012'\u0010\b\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u001c\u001a\u00020\u001b\"\b\b\u0000\u0010\u0019*\u00020\u00012\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJA\u0010!\u001a\u00020\u0004\"\b\b\u0000\u0010\u0019*\u00020\u00012\u0006\u0010\u001e\u001a\u00028\u00002\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0001¢\u0006\u0004\b#\u0010$J0\u0010&\u001a\u00020\u00042!\u0010%\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u000b0\u0002¢\u0006\u0004\b&\u0010\nJ\r\u0010'\u001a\u00020\u0004¢\u0006\u0004\b'\u0010\u000fJ\r\u0010(\u001a\u00020\u0004¢\u0006\u0004\b(\u0010\u000fJ\r\u0010)\u001a\u00020\u0004¢\u0006\u0004\b)\u0010\u000fR5\u0010\b\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R(\u00100\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010,j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001`-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00103\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R,\u00108\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0010\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u0004048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R \u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010+R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u001b0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010A\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010E\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010G\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u00102R\u0018\u0010I\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010HR\u0016\u0010L\u001a\u00020J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010K¨\u0006M"}, d2 = {"Landroidx/compose/runtime/snapshots/k;", "", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "Lkotlin/ParameterName;", "name", "callback", "onChangedExecutor", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "n", "()Z", "s", "()V", "", "set", "j", "(Ljava/util/Set;)V", "q", "()Ljava/util/Set;", "", "r", "()Ljava/lang/Void;", "T", "onChanged", "Landroidx/compose/runtime/snapshots/k$a;", "o", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/k$a;", "scope", "onValueChangedForScope", "block", "p", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "l", "(Ljava/lang/Object;)V", "predicate", "m", "t", "u", "k", "a", "Lkotlin/jvm/functions/Function1;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/internal/AtomicReference;", "b", "Ljava/util/concurrent/atomic/AtomicReference;", "pendingChanges", "c", "Z", "sendingNotifications", "Lkotlin/Function2;", "Landroidx/compose/runtime/snapshots/g;", "d", "Lkotlin/jvm/functions/Function2;", "applyObserver", "e", "readObserver", "LD0/c;", "f", "LD0/c;", "observedScopeMaps", "g", "Ljava/lang/Object;", "observedScopeMapsLock", "LM0/b;", "h", "LM0/b;", "applyUnsubscribe", "i", "isPaused", "Landroidx/compose/runtime/snapshots/k$a;", "currentMap", "", "J", "currentMapThreadId", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class k {

    /* renamed from: l, reason: collision with root package name */
    public static final int f50660l = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function1<Function0<Unit>, Unit> onChangedExecutor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean sendingNotifications;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private M0.b applyUnsubscribe;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean isPaused;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private a currentMap;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AtomicReference<Object> pendingChanges = new AtomicReference<>(null);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Function2<Set<? extends Object>, g, Unit> applyObserver = new b();

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Function1<Object, Unit> readObserver = new c();

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final D0.c<a> observedScopeMaps = new D0.c<>(new a[16], 0);

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Object observedScopeMapsLock = new Object();

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private long currentMapThreadId = -1;

    @Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J5\u0010\r\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\u0014\u0010\u0011J7\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b\u001a\u0010\u0011J0\u0010\u001f\u001a\u00020\u00032!\u0010\u001e\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u001d0\u0002¢\u0006\u0004\b\u001f\u0010\u0006J\r\u0010 \u001a\u00020\u001d¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0003¢\u0006\u0004\b\"\u0010#J\u001b\u0010&\u001a\u00020\u001d2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00010$¢\u0006\u0004\b&\u0010'J\u0019\u0010*\u001a\u00020\u00032\n\u0010)\u001a\u0006\u0012\u0002\b\u00030(¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u0003¢\u0006\u0004\b,\u0010#R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u001e\u00104\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u00103R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u00105R&\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001a\u00107R&\u0010:\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000b098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00107R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00010;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010<R\u001e\u0010@\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030(0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010?R\u0017\u0010E\u001a\u00020A8\u0006¢\u0006\f\n\u0004\b\u0018\u0010B\u001a\u0004\bC\u0010DR\u0016\u0010F\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u00105R*\u0010G\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030(068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0014\u00107R<\u0010K\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030(\u0012\u0006\u0012\u0004\u0018\u00010\u00010Hj\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030(\u0012\u0006\u0012\u0004\u0018\u00010\u0001`I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010J\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006L"}, d2 = {"Landroidx/compose/runtime/snapshots/k$a;", "", "Lkotlin/Function1;", "", "onChanged", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "value", "", "currentToken", "currentScope", "LZ/S;", "recordedValues", "l", "(Ljava/lang/Object;ILjava/lang/Object;LZ/S;)V", "scope", "d", "(Ljava/lang/Object;)V", "m", "(Ljava/lang/Object;Ljava/lang/Object;)V", "k", "readObserver", "Lkotlin/Function0;", "block", "i", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "e", "Lkotlin/ParameterName;", "name", "", "predicate", "n", "g", "()Z", "c", "()V", "", "changes", "j", "(Ljava/util/Set;)Z", "Landroidx/compose/runtime/B;", "derivedState", "o", "(Landroidx/compose/runtime/B;)V", "h", "a", "Lkotlin/jvm/functions/Function1;", "f", "()Lkotlin/jvm/functions/Function1;", "b", "Ljava/lang/Object;", "LZ/S;", "currentScopeReads", "I", "LD0/g;", "LZ/W;", "valueToScopes", "LZ/W;", "scopeToValues", "LZ/X;", "LZ/X;", "invalidated", "LD0/c;", "LD0/c;", "statesToReread", "Landroidx/compose/runtime/C;", "Landroidx/compose/runtime/C;", "getDerivedStateObserver", "()Landroidx/compose/runtime/C;", "derivedStateObserver", "deriveStateScopeCount", "dependencyToDerivedStates", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "recordedDerivedStateValues", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    private static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Function1<Object, Unit> onChanged;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private Object currentScope;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private S<Object> currentScopeReads;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private int deriveStateScopeCount;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private int currentToken = -1;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final W<Object, Object> valueToScopes = D0.g.d(null, 1, null);

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final W<Object, S<Object>> scopeToValues = new W<>(0, 1, null);

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final X<Object> invalidated = new X<>(0, 1, null);

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final D0.c<B<?>> statesToReread = new D0.c<>(new B[16], 0);

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final C derivedStateObserver = new C1057a();

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        private final W<Object, Object> dependencyToDerivedStates = D0.g.d(null, 1, null);

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        private final HashMap<B<?>, Object> recordedDerivedStateValues = new HashMap<>();

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/compose/runtime/snapshots/k$a$a", "Landroidx/compose/runtime/C;", "Landroidx/compose/runtime/B;", "derivedState", "", "b", "(Landroidx/compose/runtime/B;)V", "a", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.runtime.snapshots.k$a$a, reason: collision with other inner class name */
        public static final class C1057a implements C {
            C1057a() {
            }

            @Override // androidx.compose.runtime.C
            public void a(B<?> derivedState) {
                a aVar = a.this;
                aVar.deriveStateScopeCount--;
            }

            @Override // androidx.compose.runtime.C
            public void b(B<?> derivedState) {
                a.this.deriveStateScopeCount++;
            }
        }

        private final void d(Object scope) {
            int i10 = this.currentToken;
            S<Object> s10 = this.currentScopeReads;
            if (s10 == null) {
                return;
            }
            long[] jArr = s10.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i11 = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            int i14 = (i11 << 3) + i13;
                            Object obj = s10.keys[i14];
                            boolean z10 = s10.values[i14] != i10;
                            if (z10) {
                                m(scope, obj);
                            }
                            if (z10) {
                                s10.s(i14);
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i12 != 8) {
                        return;
                    }
                }
                if (i11 == length) {
                    return;
                } else {
                    i11++;
                }
            }
        }

        private final void l(Object value, int currentToken, Object currentScope, S<Object> recordedValues) {
            int i10;
            int i11;
            int i12;
            if (this.deriveStateScopeCount > 0) {
                return;
            }
            int iQ = recordedValues.q(value, currentToken, -1);
            int i13 = 2;
            if (!(value instanceof B) || iQ == currentToken) {
                i10 = 2;
                i11 = -1;
            } else {
                B.a aVarJ = ((B) value).J();
                this.recordedDerivedStateValues.put(value, aVarJ.a());
                a0<w> a0VarB = aVarJ.b();
                W<Object, Object> w10 = this.dependencyToDerivedStates;
                D0.g.h(w10, value);
                Object[] objArr = a0VarB.keys;
                long[] jArr = a0VarB.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i14 = 0;
                    while (true) {
                        long j10 = jArr[i14];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i15 = 8 - ((~(i14 - length)) >>> 31);
                            int i16 = 0;
                            while (i16 < i15) {
                                if ((j10 & 255) < 128) {
                                    i12 = i13;
                                    w wVar = (w) objArr[(i14 << 3) + i16];
                                    if (wVar instanceof x) {
                                        ((x) wVar).L(e.a(i12));
                                    }
                                    D0.g.a(w10, wVar, value);
                                } else {
                                    i12 = i13;
                                }
                                j10 >>= 8;
                                i16++;
                                i13 = i12;
                            }
                            i10 = i13;
                            if (i15 != 8) {
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
                } else {
                    i10 = 2;
                }
                i11 = -1;
            }
            if (iQ == i11) {
                if (value instanceof x) {
                    ((x) value).L(e.a(i10));
                }
                D0.g.a(this.valueToScopes, value, currentScope);
            }
        }

        private final void m(Object scope, Object value) {
            D0.g.g(this.valueToScopes, value, scope);
            if (!(value instanceof B) || D0.g.e(this.valueToScopes, value)) {
                return;
            }
            D0.g.h(this.dependencyToDerivedStates, value);
            this.recordedDerivedStateValues.remove(value);
        }

        public final void c() {
            D0.g.b(this.valueToScopes);
            this.scopeToValues.k();
            D0.g.b(this.dependencyToDerivedStates);
            this.recordedDerivedStateValues.clear();
        }

        public final void e(Object scope) {
            S<Object> sU = this.scopeToValues.u(scope);
            if (sU == null) {
                return;
            }
            Object[] objArr = sU.keys;
            int[] iArr = sU.values;
            long[] jArr = sU.metadata;
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
                            int i13 = (i10 << 3) + i12;
                            Object obj = objArr[i13];
                            int i14 = iArr[i13];
                            m(scope, obj);
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

        public final Function1<Object, Unit> f() {
            return this.onChanged;
        }

        public final boolean g() {
            return this.scopeToValues.i();
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void h() {
            /*
                r17 = this;
                r0 = r17
                Z.X<java.lang.Object> r1 = r0.invalidated
                kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> r2 = r0.onChanged
                java.lang.Object[] r3 = r1.elements
                long[] r4 = r1.metadata
                int r5 = r4.length
                int r5 = r5 + (-2)
                if (r5 < 0) goto L49
                r6 = 0
                r7 = r6
            L11:
                r8 = r4[r7]
                long r10 = ~r8
                r12 = 7
                long r10 = r10 << r12
                long r10 = r10 & r8
                r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r10 = r10 & r12
                int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r10 == 0) goto L44
                int r10 = r7 - r5
                int r10 = ~r10
                int r10 = r10 >>> 31
                r11 = 8
                int r10 = 8 - r10
                r12 = r6
            L2b:
                if (r12 >= r10) goto L42
                r13 = 255(0xff, double:1.26E-321)
                long r13 = r13 & r8
                r15 = 128(0x80, double:6.3E-322)
                int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                if (r13 >= 0) goto L3e
                int r13 = r7 << 3
                int r13 = r13 + r12
                r13 = r3[r13]
                r2.invoke(r13)
            L3e:
                long r8 = r8 >> r11
                int r12 = r12 + 1
                goto L2b
            L42:
                if (r10 != r11) goto L49
            L44:
                if (r7 == r5) goto L49
                int r7 = r7 + 1
                goto L11
            L49:
                r1.m()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.k.a.h():void");
        }

        public final void i(Object scope, Function1<Object, Unit> readObserver, Function0<Unit> block) {
            Object obj = this.currentScope;
            S<Object> s10 = this.currentScopeReads;
            int i10 = this.currentToken;
            this.currentScope = scope;
            this.currentScopeReads = this.scopeToValues.e(scope);
            if (this.currentToken == -1) {
                this.currentToken = Long.hashCode(j.I().getSnapshotId());
            }
            C c10 = this.derivedStateObserver;
            D0.c<C> cVarC = o1.c();
            try {
                cVarC.c(c10);
                g.INSTANCE.g(readObserver, null, block);
                cVarC.u(cVarC.getSize() - 1);
                Object obj2 = this.currentScope;
                Intrinsics.g(obj2);
                d(obj2);
                this.currentScope = obj;
                this.currentScopeReads = s10;
                this.currentToken = i10;
            } catch (Throwable th2) {
                cVarC.u(cVarC.getSize() - 1);
                throw th2;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:100:0x023f  */
        /* JADX WARN: Removed duplicated region for block: B:120:0x02a2 A[PHI: r11
          0x02a2: PHI (r11v42 boolean) = (r11v41 boolean), (r11v43 boolean) binds: [B:111:0x027a, B:119:0x02a0] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:179:0x03fc A[PHI: r13
          0x03fc: PHI (r13v8 boolean) = (r13v7 boolean), (r13v10 boolean) binds: [B:170:0x03d0, B:178:0x03fa] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:216:0x04bf A[PHI: r11
          0x04bf: PHI (r11v14 boolean) = (r11v13 boolean), (r11v15 boolean) binds: [B:207:0x0497, B:215:0x04bd] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:220:0x04cf  */
        /* JADX WARN: Removed duplicated region for block: B:223:0x04d9  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0146 A[PHI: r37
          0x0146: PHI (r37v5 boolean) = (r37v4 boolean), (r37v6 boolean) binds: [B:47:0x011a, B:56:0x0144] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0151  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x022f A[PHI: r11
          0x022f: PHI (r11v52 boolean) = (r11v51 boolean), (r11v53 boolean) binds: [B:87:0x0207, B:95:0x022d] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean j(java.util.Set<? extends java.lang.Object> r44) {
            /*
                Method dump skipped, instructions count: 1364
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.k.a.j(java.util.Set):boolean");
        }

        public final void k(Object value) {
            Object obj = this.currentScope;
            Intrinsics.g(obj);
            int i10 = this.currentToken;
            S<Object> s10 = this.currentScopeReads;
            if (s10 == null) {
                s10 = new S<>(0, 1, null);
                this.currentScopeReads = s10;
                this.scopeToValues.x(obj, s10);
                Unit unit = Unit.f143329a;
            }
            l(value, i10, obj, s10);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void n(kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Boolean> r34) {
            /*
                Method dump skipped, instructions count: 225
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.k.a.n(kotlin.jvm.functions.Function1):void");
        }

        public final void o(B<?> derivedState) {
            long[] jArr;
            long[] jArr2;
            int i10;
            S<Object> s10;
            W<Object, S<Object>> w10 = this.scopeToValues;
            int iHashCode = Long.hashCode(j.I().getSnapshotId());
            Object objE = this.valueToScopes.e(derivedState);
            if (objE == null) {
                return;
            }
            if (!(objE instanceof X)) {
                S<Object> sE = w10.e(objE);
                if (sE == null) {
                    sE = new S<>(0, 1, null);
                    w10.x(objE, sE);
                    Unit unit = Unit.f143329a;
                }
                l(derivedState, iHashCode, objE, sE);
                return;
            }
            X x10 = (X) objE;
            Object[] objArr = x10.elements;
            long[] jArr3 = x10.metadata;
            int length = jArr3.length - 2;
            if (length < 0) {
                return;
            }
            int i11 = 0;
            while (true) {
                long j10 = jArr3[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8;
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((j10 & 255) < 128) {
                            i10 = i12;
                            Object obj = objArr[(i11 << 3) + i14];
                            S<Object> sE2 = w10.e(obj);
                            jArr2 = jArr3;
                            if (sE2 == null) {
                                s10 = new S<>(0, 1, null);
                                w10.x(obj, s10);
                                Unit unit2 = Unit.f143329a;
                            } else {
                                s10 = sE2;
                            }
                            l(derivedState, iHashCode, obj, s10);
                        } else {
                            jArr2 = jArr3;
                            i10 = i12;
                        }
                        j10 >>= i10;
                        i14++;
                        i12 = i10;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i13 != i12) {
                        return;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i11 == length) {
                    return;
                }
                i11++;
                jArr3 = jArr;
            }
        }

        public a(Function1<Object, Unit> function1) {
            this.onChanged = function1;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "applied", "Landroidx/compose/runtime/snapshots/g;", "<anonymous parameter 1>", "", "a", "(Ljava/util/Set;Landroidx/compose/runtime/snapshots/g;)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends Lambda implements Function2<Set<? extends Object>, g, Unit> {
        b() {
            super(2);
        }

        public final void a(Set<? extends Object> set, g gVar) {
            k.this.j(set);
            if (k.this.n()) {
                k.this.s();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Set<? extends Object> set, g gVar) {
            a(set, gVar);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "state", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    static final class c extends Lambda implements Function1<Object, Unit> {
        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2(obj);
            return Unit.f143329a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Object obj) {
            if (k.this.isPaused) {
                return;
            }
            Object obj2 = k.this.observedScopeMapsLock;
            k kVar = k.this;
            synchronized (obj2) {
                a aVar = kVar.currentMap;
                Intrinsics.g(aVar);
                aVar.k(obj);
                Unit unit = Unit.f143329a;
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    static final class d extends Lambda implements Function0<Unit> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            do {
                Object obj = k.this.observedScopeMapsLock;
                k kVar = k.this;
                synchronized (obj) {
                    try {
                        if (!kVar.sendingNotifications) {
                            kVar.sendingNotifications = true;
                            try {
                                D0.c cVar = kVar.observedScopeMaps;
                                Object[] objArr = cVar.content;
                                int size = cVar.getSize();
                                for (int i10 = 0; i10 < size; i10++) {
                                    ((a) objArr[i10]).h();
                                }
                                kVar.sendingNotifications = false;
                            } finally {
                            }
                        }
                        Unit unit = Unit.f143329a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } while (k.this.n());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void j(Set<? extends Object> set) {
        Object obj;
        List listP0;
        do {
            obj = this.pendingChanges.get();
            if (obj == null) {
                listP0 = set;
            } else if (obj instanceof Set) {
                listP0 = CollectionsKt.p(obj, set);
            } else {
                if (!(obj instanceof List)) {
                    r();
                    throw new KotlinNothingValueException();
                }
                listP0 = CollectionsKt.P0((Collection) obj, CollectionsKt.e(set));
            }
        } while (!U.d.a(this.pendingChanges, obj, listP0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean n() {
        boolean z10;
        synchronized (this.observedScopeMapsLock) {
            z10 = this.sendingNotifications;
        }
        if (z10) {
            return false;
        }
        boolean z11 = false;
        while (true) {
            Set<? extends Object> setQ = q();
            if (setQ == null) {
                return z11;
            }
            synchronized (this.observedScopeMapsLock) {
                try {
                    D0.c<a> cVar = this.observedScopeMaps;
                    a[] aVarArr = cVar.content;
                    int size = cVar.getSize();
                    for (int i10 = 0; i10 < size; i10++) {
                        z11 = aVarArr[i10].j(setQ) || z11;
                    }
                    Unit unit = Unit.f143329a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private final <T> a o(Function1<? super T, Unit> onChanged) {
        a aVar;
        D0.c<a> cVar = this.observedScopeMaps;
        a[] aVarArr = cVar.content;
        int size = cVar.getSize();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                aVar = null;
                break;
            }
            aVar = aVarArr[i10];
            if (aVar.f() == onChanged) {
                break;
            }
            i10++;
        }
        a aVar2 = aVar;
        if (aVar2 != null) {
            return aVar2;
        }
        Intrinsics.h(onChanged, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
        a aVar3 = new a((Function1) TypeIntrinsics.f(onChanged, 1));
        this.observedScopeMaps.c(aVar3);
        return aVar3;
    }

    private final Set<Object> q() {
        Object obj;
        Object objSubList;
        Set<Object> set;
        do {
            obj = this.pendingChanges.get();
            objSubList = null;
            if (obj == null) {
                return null;
            }
            if (obj instanceof Set) {
                set = (Set) obj;
            } else {
                if (!(obj instanceof List)) {
                    r();
                    throw new KotlinNothingValueException();
                }
                List list = (List) obj;
                Set<Object> set2 = (Set) list.get(0);
                if (list.size() == 2) {
                    objSubList = list.get(1);
                } else if (list.size() > 2) {
                    objSubList = list.subList(1, list.size());
                }
                set = set2;
            }
        } while (!U.d.a(this.pendingChanges, obj, objSubList));
        return set;
    }

    private final Void r() {
        ComposerKt.u("Unexpected notification");
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s() {
        this.onChangedExecutor.invoke(new d());
    }

    public final void k() {
        synchronized (this.observedScopeMapsLock) {
            try {
                D0.c<a> cVar = this.observedScopeMaps;
                a[] aVarArr = cVar.content;
                int size = cVar.getSize();
                for (int i10 = 0; i10 < size; i10++) {
                    aVarArr[i10].c();
                }
                Unit unit = Unit.f143329a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void l(Object scope) {
        synchronized (this.observedScopeMapsLock) {
            try {
                D0.c<a> cVar = this.observedScopeMaps;
                int size = cVar.getSize();
                int i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    a aVar = cVar.content[i11];
                    aVar.e(scope);
                    if (!aVar.g()) {
                        i10++;
                    } else if (i10 > 0) {
                        a[] aVarArr = cVar.content;
                        aVarArr[i11 - i10] = aVarArr[i11];
                    }
                }
                int i12 = size - i10;
                ArraysKt.B(cVar.content, null, i12, size);
                cVar.z(i12);
                Unit unit = Unit.f143329a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void m(Function1<Object, Boolean> predicate) {
        synchronized (this.observedScopeMapsLock) {
            try {
                D0.c<a> cVar = this.observedScopeMaps;
                int size = cVar.getSize();
                int i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    a aVar = cVar.content[i11];
                    aVar.n(predicate);
                    if (!aVar.g()) {
                        i10++;
                    } else if (i10 > 0) {
                        a[] aVarArr = cVar.content;
                        aVarArr[i11 - i10] = aVarArr[i11];
                    }
                }
                int i12 = size - i10;
                ArraysKt.B(cVar.content, null, i12, size);
                cVar.z(i12);
                Unit unit = Unit.f143329a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final <T> void p(T scope, Function1<? super T, Unit> onValueChangedForScope, Function0<Unit> block) {
        a aVarO;
        synchronized (this.observedScopeMapsLock) {
            aVarO = o(onValueChangedForScope);
        }
        boolean z10 = this.isPaused;
        a aVar = this.currentMap;
        long j10 = this.currentMapThreadId;
        if (j10 != -1) {
            if (!(j10 == n.a())) {
                C5899z0.a("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j10 + "), currentThread={id=" + n.a() + ", name=" + n.b() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            }
        }
        try {
            this.isPaused = false;
            this.currentMap = aVarO;
            this.currentMapThreadId = n.a();
            aVarO.i(scope, this.readObserver, block);
        } finally {
            this.currentMap = aVar;
            this.isPaused = z10;
            this.currentMapThreadId = j10;
        }
    }

    public final void t() {
        this.applyUnsubscribe = g.INSTANCE.h(this.applyObserver);
    }

    public final void u() {
        M0.b bVar = this.applyUnsubscribe;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(Function1<? super Function0<Unit>, Unit> function1) {
        this.onChangedExecutor = function1;
    }
}
