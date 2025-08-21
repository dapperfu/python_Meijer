package androidx.compose.runtime.snapshots;

import J0.r;
import M0.q;
import M0.w;
import M0.y;
import Z.X;
import androidx.compose.runtime.snapshots.g;
import androidx.compose.runtime.snapshots.i;
import io.constructor.data.local.PreferencesHelper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0006\u001a\u00020\u00052\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a;\u0010\u0015\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001aS\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\u00102\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\u00102\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001aI\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\u00102\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\u00102\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a@\u0010$\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001e2\u0006\u0010 \u001a\u00020\u001f2!\u0010#\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00028\u00000\u0010H\u0002¢\u0006\u0004\b$\u0010%\u001a8\u0010&\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001e2!\u0010#\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00028\u00000\u0010H\u0002¢\u0006\u0004\b&\u0010'\u001a\u000f\u0010(\u001a\u00020\tH\u0002¢\u0006\u0004\b(\u0010)\u001a<\u0010*\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u00020\f2!\u0010#\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00028\u00000\u0010H\u0002¢\u0006\u0004\b*\u0010+\u001a\u0017\u0010-\u001a\u00020\t2\u0006\u0010,\u001a\u00020\fH\u0002¢\u0006\u0004\b-\u0010.\u001a/\u00101\u001a\u00020\u00132\n\u0010/\u001a\u00060\u0000j\u0002`\u00012\n\u00100\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b1\u00102\u001a+\u00105\u001a\u00020\u00132\u0006\u00104\u001a\u0002032\n\u0010,\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b5\u00106\u001a7\u00109\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u001e*\u0002032\u0006\u00107\u001a\u00028\u00002\n\u00108\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b9\u0010:\u001a#\u0010=\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u000203*\u00028\u00002\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b=\u0010>\u001a\u000f\u0010@\u001a\u00020?H\u0002¢\u0006\u0004\b@\u0010A\u001a\u0019\u0010B\u001a\u0004\u0018\u0001032\u0006\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\bB\u0010C\u001a\u0017\u0010\u001e\u001a\u00020\u00132\u0006\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\b\u001e\u0010D\u001a\u000f\u0010E\u001a\u00020\tH\u0002¢\u0006\u0004\bE\u0010)\u001a\u0017\u0010F\u001a\u00020\t2\u0006\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\bF\u0010G\u001a-\u0010H\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u000203*\u00028\u00002\u0006\u0010<\u001a\u00020;2\u0006\u0010,\u001a\u00020\fH\u0001¢\u0006\u0004\bH\u0010I\u001a5\u0010K\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u000203*\u00028\u00002\u0006\u0010<\u001a\u00020;2\u0006\u0010,\u001a\u00020\f2\u0006\u0010J\u001a\u00028\u0000H\u0000¢\u0006\u0004\bK\u0010L\u001a-\u0010M\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u000203*\u00028\u00002\u0006\u0010<\u001a\u00020;2\u0006\u0010,\u001a\u00020\fH\u0000¢\u0006\u0004\bM\u0010I\u001a-\u0010N\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u000203*\u00028\u00002\u0006\u0010<\u001a\u00020;2\u0006\u0010,\u001a\u00020\fH\u0002¢\u0006\u0004\bN\u0010I\u001a%\u0010O\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u000203*\u00028\u00002\u0006\u0010<\u001a\u00020;H\u0000¢\u0006\u0004\bO\u0010>\u001a\u001f\u0010P\u001a\u00020\t2\u0006\u0010,\u001a\u00020\f2\u0006\u0010<\u001a\u00020;H\u0001¢\u0006\u0004\bP\u0010Q\u001a9\u0010W\u001a\u0010\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u000203\u0018\u00010V2\n\u0010R\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010T\u001a\u00020S2\u0006\u0010U\u001a\u00020\u0003H\u0002¢\u0006\u0004\bW\u0010X\u001a\u000f\u0010Y\u001a\u00020?H\u0002¢\u0006\u0004\bY\u0010A\u001a)\u0010Z\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u0002032\u0006\u00107\u001a\u00028\u00002\u0006\u0010,\u001a\u00020\fH\u0001¢\u0006\u0004\bZ\u0010[\u001a!\u0010\\\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u0002032\u0006\u00107\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\\\u0010]\u001a+\u0010`\u001a\u00020\u0003*\u00020\u00032\n\u0010^\u001a\u00060\u0000j\u0002`\u00012\n\u0010_\u001a\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b`\u0010a\"/\u0010d\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\t0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010c\"\u0018\u0010g\u001a\u00060\u0000j\u0002`\u00018\u0002X\u0082D¢\u0006\u0006\n\u0004\be\u0010f\"\u001a\u0010k\u001a\b\u0012\u0004\u0012\u00020\f0h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010j\" \u0010p\u001a\u00020\u00118\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bl\u0010m\u0012\u0004\bo\u0010)\u001a\u0004\bf\u0010n\"\u0016\u0010s\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010r\"\u0016\u0010u\u001a\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010f\"\u0014\u0010y\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010x\"\u001a\u0010}\u001a\b\u0012\u0004\u0012\u00020;0z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|\"8\u0010\u0083\u0001\u001a!\u0012\u001d\u0012\u001b\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\u00110\u0080\u0001\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u007f0~8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001\"+\u0010\u0085\u0001\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t0\u00100~8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0082\u0001\"\u0016\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001\"%\u0010\u008c\u0001\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0016\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u0012\u0005\b\u008b\u0001\u0010)\u001a\u0005\b\u008a\u0001\u0010\u000e\"\u001a\u0010\u0090\u0001\u001a\u00030\u008d\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001¨\u0006\u0091\u0001"}, d2 = {"", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Landroidx/compose/runtime/snapshots/i;", "invalid", "", "c0", "(JLandroidx/compose/runtime/snapshots/i;)I", "handle", "", "Y", "(I)V", "Landroidx/compose/runtime/snapshots/g;", "I", "()Landroidx/compose/runtime/snapshots/g;", "previousSnapshot", "Lkotlin/Function1;", "", "readObserver", "", "ownsPreviousSnapshot", "E", "(Landroidx/compose/runtime/snapshots/g;Lkotlin/jvm/functions/Function1;Z)Landroidx/compose/runtime/snapshots/g;", "parentObserver", "mergeReadObserver", "K", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Z)Lkotlin/jvm/functions/Function1;", "writeObserver", "M", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "T", "Landroidx/compose/runtime/snapshots/a;", "globalSnapshot", "Lkotlin/ParameterName;", "name", "block", "a0", "(Landroidx/compose/runtime/snapshots/a;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "B", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "C", "()V", "b0", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/g;", "snapshot", "g0", "(Landroidx/compose/runtime/snapshots/g;)V", "currentSnapshot", "candidateSnapshot", "e0", "(JJLandroidx/compose/runtime/snapshots/i;)Z", "LM0/y;", "data", "f0", "(LM0/y;JLandroidx/compose/runtime/snapshots/i;)Z", "r", PreferencesHelper.PREF_ID, "W", "(LM0/y;JLandroidx/compose/runtime/snapshots/i;)LM0/y;", "LM0/w;", "state", "X", "(LM0/y;LM0/w;)LM0/y;", "", "V", "()Ljava/lang/Void;", "d0", "(LM0/w;)LM0/y;", "(LM0/w;)Z", "D", "U", "(LM0/w;)V", "h0", "(LM0/y;LM0/w;Landroidx/compose/runtime/snapshots/g;)LM0/y;", "candidate", "S", "(LM0/y;LM0/w;Landroidx/compose/runtime/snapshots/g;LM0/y;)LM0/y;", "O", "P", "N", "Q", "(Landroidx/compose/runtime/snapshots/g;LM0/w;)V", "currentSnapshotId", "Landroidx/compose/runtime/snapshots/b;", "applyingSnapshot", "invalidSnapshots", "", "R", "(JLandroidx/compose/runtime/snapshots/b;Landroidx/compose/runtime/snapshots/i;)Ljava/util/Map;", "Z", "H", "(LM0/y;Landroidx/compose/runtime/snapshots/g;)LM0/y;", "G", "(LM0/y;)LM0/y;", "from", "until", "A", "(Landroidx/compose/runtime/snapshots/i;JJ)Landroidx/compose/runtime/snapshots/i;", "a", "Lkotlin/jvm/functions/Function1;", "emptyLambda", "b", "J", "INVALID_SNAPSHOT", "LJ0/j;", "c", "LJ0/j;", "threadSnapshot", "d", "Ljava/lang/Object;", "()Ljava/lang/Object;", "getLock$annotations", "lock", "e", "Landroidx/compose/runtime/snapshots/i;", "openSnapshots", "f", "nextSnapshotId", "LM0/e;", "g", "LM0/e;", "pinningTable", "LM0/q;", "h", "LM0/q;", "extraStateObjects", "", "Lkotlin/Function2;", "", "i", "Ljava/util/List;", "applyObservers", "j", "globalWriteObservers", "k", "Landroidx/compose/runtime/snapshots/a;", "l", "Landroidx/compose/runtime/snapshots/g;", "getSnapshotInitializer", "getSnapshotInitializer$annotations", "snapshotInitializer", "LJ0/a;", "m", "LJ0/a;", "pendingApplyObserverCount", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    private static final long f50642b = 0;

    /* renamed from: e, reason: collision with root package name */
    private static i f50645e;

    /* renamed from: f, reason: collision with root package name */
    private static long f50646f;

    /* renamed from: g, reason: collision with root package name */
    private static final M0.e f50647g;

    /* renamed from: h, reason: collision with root package name */
    private static final q<w> f50648h;

    /* renamed from: i, reason: collision with root package name */
    private static List<? extends Function2<? super Set<? extends Object>, ? super g, Unit>> f50649i;

    /* renamed from: j, reason: collision with root package name */
    private static List<? extends Function1<Object, Unit>> f50650j;

    /* renamed from: k, reason: collision with root package name */
    private static final androidx.compose.runtime.snapshots.a f50651k;

    /* renamed from: l, reason: collision with root package name */
    private static final g f50652l;

    /* renamed from: m, reason: collision with root package name */
    private static J0.a f50653m;

    /* renamed from: a, reason: collision with root package name */
    private static final Function1<i, Unit> f50641a = a.f50654f;

    /* renamed from: c, reason: collision with root package name */
    private static final J0.j<g> f50643c = new J0.j<>();

    /* renamed from: d, reason: collision with root package name */
    private static final Object f50644d = new Object();

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/runtime/snapshots/i;", "it", "", "a", "(Landroidx/compose/runtime/snapshots/i;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function1<i, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f50654f = new a();

        a() {
            super(1);
        }

        public final void a(i iVar) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(i iVar) {
            a(iVar);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "state", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b extends Lambda implements Function1<Object, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<Object, Unit> f50655f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<Object, Unit> f50656g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
            super(1);
            this.f50655f = function1;
            this.f50656g = function12;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2(obj);
            return Unit.f143329a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Object obj) {
            this.f50655f.invoke(obj);
            this.f50656g.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "state", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class c extends Lambda implements Function1<Object, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<Object, Unit> f50657f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<Object, Unit> f50658g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
            super(1);
            this.f50657f = function1;
            this.f50658g = function12;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2(obj);
            return Unit.f143329a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Object obj) {
            this.f50657f.invoke(obj);
            this.f50658g.invoke(obj);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/runtime/snapshots/g;", "T", "Landroidx/compose/runtime/snapshots/i;", "invalid", "a", "(Landroidx/compose/runtime/snapshots/i;)Landroidx/compose/runtime/snapshots/g;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class d<T> extends Lambda implements Function1<i, T> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<i, T> f50659f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Function1<? super i, ? extends T> function1) {
            super(1);
            this.f50659f = function1;
        }

        /* JADX WARN: Incorrect return type in method signature: (Landroidx/compose/runtime/snapshots/i;)TT; */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g invoke(i iVar) {
            g gVar = (g) this.f50659f.invoke(iVar);
            synchronized (j.J()) {
                j.f50645e = j.f50645e.t(gVar.getSnapshotId());
                Unit unit = Unit.f143329a;
            }
            return gVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends y> T W(T t10, long j10, i iVar) {
        T t11 = null;
        while (t10 != null) {
            if (f0(t10, j10, iVar) && (t11 == null || t11.getSnapshotId() < t10.getSnapshotId())) {
                t11 = t10;
            }
            t10 = (T) t10.getNext();
        }
        if (t11 != null) {
            return t11;
        }
        return null;
    }

    static {
        i.Companion aVar = i.INSTANCE;
        f50645e = aVar.a();
        f50646f = M0.g.c(1) + 1;
        f50647g = new M0.e();
        f50648h = new q<>();
        f50649i = CollectionsKt.m();
        f50650j = CollectionsKt.m();
        long j10 = f50646f;
        f50646f = 1 + j10;
        androidx.compose.runtime.snapshots.a aVar2 = new androidx.compose.runtime.snapshots.a(j10, aVar.a());
        f50645e = f50645e.t(aVar2.getSnapshotId());
        f50651k = aVar2;
        f50652l = aVar2;
        f50653m = new J0.a(0);
    }

    public static final i A(i iVar, long j10, long j11) {
        while (j10 < j11) {
            iVar = iVar.t(j10);
            j10++;
        }
        return iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> T B(kotlin.jvm.functions.Function1<? super androidx.compose.runtime.snapshots.i, ? extends T> r15) {
        /*
            androidx.compose.runtime.snapshots.a r0 = androidx.compose.runtime.snapshots.j.f50651k
            java.lang.Object r1 = J()
            monitor-enter(r1)
            Z.X r2 = r0.E()     // Catch: java.lang.Throwable -> L14
            if (r2 == 0) goto L17
            J0.a r3 = androidx.compose.runtime.snapshots.j.f50653m     // Catch: java.lang.Throwable -> L14
            r4 = 1
            r3.a(r4)     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r15 = move-exception
            goto La1
        L17:
            java.lang.Object r15 = a0(r0, r15)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r1)
            r1 = 0
            if (r2 == 0) goto L4a
            r3 = -1
            java.util.List<? extends kotlin.jvm.functions.Function2<? super java.util.Set<? extends java.lang.Object>, ? super androidx.compose.runtime.snapshots.g, kotlin.Unit>> r4 = androidx.compose.runtime.snapshots.j.f50649i     // Catch: java.lang.Throwable -> L3c
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5     // Catch: java.lang.Throwable -> L3c
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L3c
            r6 = r1
        L2a:
            if (r6 >= r5) goto L3e
            java.lang.Object r7 = r4.get(r6)     // Catch: java.lang.Throwable -> L3c
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7     // Catch: java.lang.Throwable -> L3c
            java.util.Set r8 = D0.f.a(r2)     // Catch: java.lang.Throwable -> L3c
            r7.invoke(r8, r0)     // Catch: java.lang.Throwable -> L3c
            int r6 = r6 + 1
            goto L2a
        L3c:
            r15 = move-exception
            goto L44
        L3e:
            J0.a r0 = androidx.compose.runtime.snapshots.j.f50653m
            r0.a(r3)
            goto L4a
        L44:
            J0.a r0 = androidx.compose.runtime.snapshots.j.f50653m
            r0.a(r3)
            throw r15
        L4a:
            java.lang.Object r0 = J()
            monitor-enter(r0)
            D()     // Catch: java.lang.Throwable -> L8e
            if (r2 == 0) goto L9d
            java.lang.Object[] r3 = r2.elements     // Catch: java.lang.Throwable -> L8e
            long[] r2 = r2.metadata     // Catch: java.lang.Throwable -> L8e
            int r4 = r2.length     // Catch: java.lang.Throwable -> L8e
            int r4 = r4 + (-2)
            if (r4 < 0) goto L9b
            r5 = r1
        L5e:
            r6 = r2[r5]     // Catch: java.lang.Throwable -> L8e
            long r8 = ~r6     // Catch: java.lang.Throwable -> L8e
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L96
            int r8 = r5 - r4
            int r8 = ~r8     // Catch: java.lang.Throwable -> L8e
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r1
        L78:
            if (r10 >= r8) goto L94
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L90
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r3[r11]     // Catch: java.lang.Throwable -> L8e
            M0.w r11 = (M0.w) r11     // Catch: java.lang.Throwable -> L8e
            U(r11)     // Catch: java.lang.Throwable -> L8e
            goto L90
        L8e:
            r15 = move-exception
            goto L9f
        L90:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L78
        L94:
            if (r8 != r9) goto L9b
        L96:
            if (r5 == r4) goto L9b
            int r5 = r5 + 1
            goto L5e
        L9b:
            kotlin.Unit r1 = kotlin.Unit.f143329a     // Catch: java.lang.Throwable -> L8e
        L9d:
            monitor-exit(r0)
            return r15
        L9f:
            monitor-exit(r0)
            throw r15
        La1:
            monitor-exit(r1)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.j.B(kotlin.jvm.functions.Function1):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C() {
        B(f50641a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D() {
        q<w> qVar = f50648h;
        int iE = qVar.getSize();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= iE) {
                break;
            }
            r<w> rVar = qVar.f()[i10];
            w wVar = rVar != null ? rVar.get() : null;
            if (wVar != null && T(wVar)) {
                if (i11 != i10) {
                    qVar.f()[i11] = rVar;
                    qVar.getHashes()[i11] = qVar.getHashes()[i10];
                }
                i11++;
            }
            i10++;
        }
        for (int i12 = i11; i12 < iE; i12++) {
            qVar.f()[i12] = null;
            qVar.getHashes()[i12] = 0;
        }
        if (i11 != iE) {
            qVar.g(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g E(g gVar, Function1<Object, Unit> function1, boolean z10) {
        boolean z11 = gVar instanceof androidx.compose.runtime.snapshots.b;
        if (z11 || gVar == null) {
            return new l(z11 ? (androidx.compose.runtime.snapshots.b) gVar : null, function1, null, false, z10);
        }
        return new m(gVar, function1, false, z10);
    }

    static /* synthetic */ g F(g gVar, Function1 function1, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return E(gVar, function1, z10);
    }

    @PublishedApi
    public static final <T extends y> T G(T t10) {
        T t11;
        g.Companion companion = g.INSTANCE;
        g gVarC = companion.c();
        T t12 = (T) W(t10, gVarC.getSnapshotId(), gVarC.getInvalid());
        if (t12 != null) {
            return t12;
        }
        synchronized (J()) {
            g gVarC2 = companion.c();
            t11 = (T) W(t10, gVarC2.getSnapshotId(), gVarC2.getInvalid());
        }
        if (t11 != null) {
            return t11;
        }
        V();
        throw new KotlinNothingValueException();
    }

    public static final g I() {
        g gVarA = f50643c.a();
        return gVarA == null ? f50651k : gVarA;
    }

    public static final Object J() {
        return f50644d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1<Object, Unit> K(Function1<Object, Unit> function1, Function1<Object, Unit> function12, boolean z10) {
        if (!z10) {
            function12 = null;
        }
        return (function1 == null || function12 == null || function1 == function12) ? function1 == null ? function12 : function1 : new b(function1, function12);
    }

    static /* synthetic */ Function1 L(Function1 function1, Function1 function12, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return K(function1, function12, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1<Object, Unit> M(Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
        return (function1 == null || function12 == null || function1 == function12) ? function1 == null ? function12 : function1 : new c(function1, function12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<y, y> R(long j10, androidx.compose.runtime.snapshots.b bVar, i iVar) {
        long[] jArr;
        Map<y, y> map;
        i iVar2;
        long[] jArr2;
        Map<y, y> map2;
        i iVar3;
        int i10;
        long j11 = j10;
        X<w> xE = bVar.E();
        Map<y, y> map3 = null;
        if (xE == null) {
            return null;
        }
        i iVarS = bVar.getInvalid().t(bVar.getSnapshotId()).s(bVar.getPreviousIds());
        Object[] objArr = xE.elements;
        long[] jArr3 = xE.metadata;
        int length = jArr3.length - 2;
        if (length < 0) {
            return null;
        }
        HashMap map4 = null;
        int i11 = 0;
        while (true) {
            long j12 = jArr3[i11];
            if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8;
                int i13 = 8 - ((~(i11 - length)) >>> 31);
                int i14 = 0;
                while (i14 < i13) {
                    if ((255 & j12) < 128) {
                        w wVar = (w) objArr[(i11 << 3) + i14];
                        map2 = map3;
                        y yVarT = wVar.getFirstStateRecord();
                        i10 = i12;
                        y yVarW = W(yVarT, j11, iVar);
                        if (yVarW == null) {
                            jArr2 = jArr3;
                        } else {
                            jArr2 = jArr3;
                            y yVarW2 = W(yVarT, j11, iVarS);
                            if (yVarW2 != null && !Intrinsics.e(yVarW, yVarW2)) {
                                iVar3 = iVarS;
                                y yVarW3 = W(yVarT, bVar.getSnapshotId(), bVar.getInvalid());
                                if (yVarW3 == null) {
                                    V();
                                    throw new KotlinNothingValueException();
                                }
                                y yVarK = wVar.k(yVarW2, yVarW, yVarW3);
                                if (yVarK == null) {
                                    return map2;
                                }
                                if (map4 == null) {
                                    map4 = new HashMap();
                                }
                                map4.put(yVarW, yVarK);
                                map4 = map4;
                            }
                        }
                        iVar3 = iVarS;
                    } else {
                        jArr2 = jArr3;
                        map2 = map3;
                        iVar3 = iVarS;
                        i10 = i12;
                    }
                    j12 >>= i10;
                    i14++;
                    j11 = j10;
                    map3 = map2;
                    i12 = i10;
                    jArr3 = jArr2;
                    iVarS = iVar3;
                }
                jArr = jArr3;
                map = map3;
                iVar2 = iVarS;
                if (i13 != i12) {
                    return map4;
                }
            } else {
                jArr = jArr3;
                map = map3;
                iVar2 = iVarS;
            }
            if (i11 == length) {
                return map4;
            }
            i11++;
            j11 = j10;
            map3 = map;
            jArr3 = jArr;
            iVarS = iVar2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void V() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final <T extends y> T X(T t10, w wVar) {
        T t11;
        g.Companion companion = g.INSTANCE;
        g gVarC = companion.c();
        Function1<Object, Unit> function1G = gVarC.g();
        if (function1G != null) {
            function1G.invoke(wVar);
        }
        T t12 = (T) W(t10, gVarC.getSnapshotId(), gVarC.getInvalid());
        if (t12 != null) {
            return t12;
        }
        synchronized (J()) {
            g gVarC2 = companion.c();
            y yVarT = wVar.getFirstStateRecord();
            Intrinsics.h(yVarT, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable");
            t11 = (T) W(yVarT, gVarC2.getSnapshotId(), gVarC2.getInvalid());
            if (t11 == null) {
                V();
                throw new KotlinNothingValueException();
            }
        }
        return t11;
    }

    public static final void Y(int i10) {
        f50647g.f(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void Z() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends g> T b0(Function1<? super i, ? extends T> function1) {
        return (T) B(new d(function1));
    }

    private static final boolean e0(long j10, long j11, i iVar) {
        return (j11 == f50642b || j11 > j10 || iVar.q(j11)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g0(g gVar) {
        long jE;
        if (f50645e.q(gVar.getSnapshotId())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Snapshot is not open: snapshotId=");
        sb2.append(gVar.getSnapshotId());
        sb2.append(", disposed=");
        sb2.append(gVar.getDisposed());
        sb2.append(", applied=");
        androidx.compose.runtime.snapshots.b bVar = gVar instanceof androidx.compose.runtime.snapshots.b ? (androidx.compose.runtime.snapshots.b) gVar : null;
        sb2.append(bVar != null ? Boolean.valueOf(bVar.getApplied()) : "read-only");
        sb2.append(", lowestPin=");
        synchronized (J()) {
            jE = f50647g.e(-1L);
        }
        sb2.append(jE);
        throw new IllegalStateException(sb2.toString().toString());
    }

    @PublishedApi
    public static final <T extends y> T H(T t10, g gVar) {
        T t11;
        T t12 = (T) W(t10, gVar.getSnapshotId(), gVar.getInvalid());
        if (t12 == null) {
            synchronized (J()) {
                t11 = (T) W(t10, gVar.getSnapshotId(), gVar.getInvalid());
            }
            if (t11 != null) {
                return t11;
            }
            V();
            throw new KotlinNothingValueException();
        }
        return t12;
    }

    public static final <T extends y> T N(T t10, w wVar) {
        T t11 = (T) d0(wVar);
        if (t11 != null) {
            t11.i(Long.MAX_VALUE);
            return t11;
        }
        T t12 = (T) t10.e(Long.MAX_VALUE);
        t12.h(wVar.getFirstStateRecord());
        Intrinsics.h(t12, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        wVar.f(t12);
        Intrinsics.h(t12, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        return t12;
    }

    public static final <T extends y> T O(T t10, w wVar, g gVar) {
        T t11;
        synchronized (J()) {
            t11 = (T) P(t10, wVar, gVar);
        }
        return t11;
    }

    private static final <T extends y> T P(T t10, w wVar, g gVar) {
        T t11 = (T) N(t10, wVar);
        t11.c(t10);
        t11.i(gVar.getSnapshotId());
        return t11;
    }

    @PublishedApi
    public static final void Q(g gVar, w wVar) {
        gVar.w(gVar.getWriteCount() + 1);
        Function1<Object, Unit> function1K = gVar.k();
        if (function1K != null) {
            function1K.invoke(wVar);
        }
    }

    public static final <T extends y> T S(T t10, w wVar, g gVar, T t11) {
        T t12;
        if (gVar.h()) {
            gVar.p(wVar);
        }
        long snapshotId = gVar.getSnapshotId();
        if (t11.getSnapshotId() == snapshotId) {
            return t11;
        }
        synchronized (J()) {
            t12 = (T) N(t10, wVar);
        }
        t12.i(snapshotId);
        if (t11.getSnapshotId() != M0.g.c(1)) {
            gVar.p(wVar);
        }
        return t12;
    }

    private static final boolean T(w wVar) {
        y yVar;
        long jE = f50647g.e(f50646f);
        y yVar2 = null;
        y yVarT = null;
        int i10 = 0;
        for (y yVarT2 = wVar.getFirstStateRecord(); yVarT2 != null; yVarT2 = yVarT2.getNext()) {
            long jG = yVarT2.getSnapshotId();
            if (jG != f50642b) {
                if (jG < jE) {
                    if (yVar2 == null) {
                        i10++;
                        yVar2 = yVarT2;
                    } else {
                        if (yVarT2.getSnapshotId() < yVar2.getSnapshotId()) {
                            yVar = yVar2;
                            yVar2 = yVarT2;
                        } else {
                            yVar = yVarT2;
                        }
                        if (yVarT == null) {
                            yVarT = wVar.getFirstStateRecord();
                            y yVar3 = yVarT;
                            while (true) {
                                if (yVarT != null) {
                                    if (yVarT.getSnapshotId() >= jE) {
                                        break;
                                    }
                                    if (yVar3.getSnapshotId() < yVarT.getSnapshotId()) {
                                        yVar3 = yVarT;
                                    }
                                    yVarT = yVarT.getNext();
                                } else {
                                    yVarT = yVar3;
                                    break;
                                }
                            }
                        }
                        yVar2.i(f50642b);
                        yVar2.c(yVarT);
                        yVar2 = yVar;
                    }
                } else {
                    i10++;
                }
            }
        }
        if (i10 <= 1) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(w wVar) {
        if (T(wVar)) {
            f50648h.a(wVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T a0(androidx.compose.runtime.snapshots.a aVar, Function1<? super i, ? extends T> function1) {
        long snapshotId = aVar.getSnapshotId();
        T tInvoke = function1.invoke(f50645e.p(snapshotId));
        long j10 = f50646f;
        f50646f = 1 + j10;
        f50645e = f50645e.p(snapshotId);
        aVar.v(j10);
        aVar.u(f50645e);
        aVar.w(0);
        aVar.Q(null);
        aVar.q();
        f50645e = f50645e.t(j10);
        return tInvoke;
    }

    public static final int c0(long j10, i iVar) {
        int iA;
        long jR = iVar.r(j10);
        synchronized (J()) {
            iA = f50647g.a(jR);
        }
        return iA;
    }

    private static final y d0(w wVar) {
        long jE = f50647g.e(f50646f) - 1;
        i iVarA = i.INSTANCE.a();
        y yVar = null;
        for (y yVarT = wVar.getFirstStateRecord(); yVarT != null; yVarT = yVarT.getNext()) {
            if (yVarT.getSnapshotId() != f50642b) {
                if (f0(yVarT, jE, iVarA)) {
                    if (yVar == null) {
                        yVar = yVarT;
                    } else if (yVarT.getSnapshotId() >= yVar.getSnapshotId()) {
                        return yVar;
                    }
                }
            }
            return yVarT;
        }
        return null;
    }

    private static final boolean f0(y yVar, long j10, i iVar) {
        return e0(j10, yVar.getSnapshotId(), iVar);
    }

    @PublishedApi
    public static final <T extends y> T h0(T t10, w wVar, g gVar) {
        T t11;
        if (gVar.h()) {
            gVar.p(wVar);
        }
        long snapshotId = gVar.getSnapshotId();
        T t12 = (T) W(t10, snapshotId, gVar.getInvalid());
        if (t12 != null) {
            if (t12.getSnapshotId() == gVar.getSnapshotId()) {
                return t12;
            }
            synchronized (J()) {
                t11 = (T) W(wVar.getFirstStateRecord(), snapshotId, gVar.getInvalid());
                if (t11 != null) {
                    if (t11.getSnapshotId() != snapshotId) {
                        t11 = (T) P(t11, wVar, gVar);
                    }
                } else {
                    V();
                    throw new KotlinNothingValueException();
                }
            }
            Intrinsics.h(t11, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.writableRecord");
            if (t12.getSnapshotId() != M0.g.c(1)) {
                gVar.p(wVar);
            }
            return t11;
        }
        V();
        throw new KotlinNothingValueException();
    }
}
