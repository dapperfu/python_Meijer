package sv;

import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.KFunction;
import qv.InterfaceC16654n;
import vv.C17631E;
import vv.C17634H;

@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b$\u001a3\u0010\u0004\u001a \u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0001\"\u0004\b\u0000\u0010\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\b\u0010\t\u001ax\u0010\u0017\u001a\u00020\u0016\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\f\u001a\u00028\u00002O\b\u0002\u0010\u0015\u001aI\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0017\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001f\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001f\u0010 \u001a\u001f\u0010\"\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\"\u0010#\"\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&\"\u0014\u0010*\u001a\u00020\u00198\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b(\u0010)\"\u0014\u0010,\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010)\"\u0014\u00100\u001a\u00020-8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b.\u0010/\"\u0014\u00102\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010/\"\u0014\u00104\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010/\"\u0014\u00106\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010/\"\u0014\u00108\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010/\"\u0014\u0010:\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010/\"\u0014\u0010<\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010/\"\u0014\u0010>\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010/\"\u001a\u0010B\u001a\u00020-8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b?\u0010/\u001a\u0004\b@\u0010A\"\u0014\u0010D\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010/\"\u0014\u0010F\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010/\"\u0014\u0010H\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010/\"\u0014\u0010J\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010/\"\u0014\u0010L\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010/\"\u0014\u0010N\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010/\"\u0014\u0010P\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010/¨\u0006Q"}, d2 = {"E", "Lkotlin/reflect/KFunction2;", "", "Lsv/m;", "y", "()Lkotlin/reflect/KFunction;", PreferencesHelper.PREF_ID, "prev", "x", "(JLsv/m;)Lsv/m;", "T", "Lqv/n;", "value", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "cause", "Lkotlin/coroutines/CoroutineContext;", "context", "", "onCancellation", "", "B", "(Lqv/n;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Z", "", "capacity", "A", "(I)J", "counter", "closeStatus", "w", "(JI)J", "pauseEB", "v", "(JZ)J", "", "a", "Lsv/m;", "NULL_SEGMENT", "b", "I", "SEGMENT_SIZE", "c", "EXPAND_BUFFER_COMPLETION_WAIT_ITERATIONS", "Lvv/E;", "d", "Lvv/E;", "BUFFERED", "e", "IN_BUFFER", "f", "RESUMING_BY_RCV", "g", "RESUMING_BY_EB", "h", "POISONED", "i", "DONE_RCV", "j", "INTERRUPTED_SEND", "k", "INTERRUPTED_RCV", "l", "z", "()Lvv/E;", "CHANNEL_CLOSED", "m", "SUSPEND", "n", "SUSPEND_NO_WAITER", "o", "FAILED", "p", "NO_RECEIVE_RESULT", "q", "CLOSE_HANDLER_CLOSED", "r", "CLOSE_HANDLER_INVOKED", "s", "NO_CLOSE_CAUSE", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static final m<Object> f161280a = new m<>(-1, null, null, 0);

    /* renamed from: b, reason: collision with root package name */
    @JvmField
    public static final int f161281b = C17634H.e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);

    /* renamed from: c, reason: collision with root package name */
    private static final int f161282c = C17634H.e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, null);

    /* renamed from: d, reason: collision with root package name */
    @JvmField
    public static final C17631E f161283d = new C17631E("BUFFERED");

    /* renamed from: e, reason: collision with root package name */
    private static final C17631E f161284e = new C17631E("SHOULD_BUFFER");

    /* renamed from: f, reason: collision with root package name */
    private static final C17631E f161285f = new C17631E("S_RESUMING_BY_RCV");

    /* renamed from: g, reason: collision with root package name */
    private static final C17631E f161286g = new C17631E("RESUMING_BY_EB");

    /* renamed from: h, reason: collision with root package name */
    private static final C17631E f161287h = new C17631E("POISONED");

    /* renamed from: i, reason: collision with root package name */
    private static final C17631E f161288i = new C17631E("DONE_RCV");

    /* renamed from: j, reason: collision with root package name */
    private static final C17631E f161289j = new C17631E("INTERRUPTED_SEND");

    /* renamed from: k, reason: collision with root package name */
    private static final C17631E f161290k = new C17631E("INTERRUPTED_RCV");

    /* renamed from: l, reason: collision with root package name */
    private static final C17631E f161291l = new C17631E("CHANNEL_CLOSED");

    /* renamed from: m, reason: collision with root package name */
    private static final C17631E f161292m = new C17631E("SUSPEND");

    /* renamed from: n, reason: collision with root package name */
    private static final C17631E f161293n = new C17631E("SUSPEND_NO_WAITER");

    /* renamed from: o, reason: collision with root package name */
    private static final C17631E f161294o = new C17631E("FAILED");

    /* renamed from: p, reason: collision with root package name */
    private static final C17631E f161295p = new C17631E("NO_RECEIVE_RESULT");

    /* renamed from: q, reason: collision with root package name */
    private static final C17631E f161296q = new C17631E("CLOSE_HANDLER_CLOSED");

    /* renamed from: r, reason: collision with root package name */
    private static final C17631E f161297r = new C17631E("CLOSE_HANDLER_INVOKED");

    /* renamed from: s, reason: collision with root package name */
    private static final C17631E f161298s = new C17631E("NO_CLOSE_CAUSE");

    /* JADX INFO: Add missing generic type declarations: [E] */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a<E> extends FunctionReferenceImpl implements Function2<Long, m<E>, m<E>> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f161299b = new a();

        a() {
            super(2, f.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Long l10, Object obj) {
            return a(l10.longValue(), (m) obj);
        }

        public final m<E> a(long j10, m<E> mVar) {
            return f.x(j10, mVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean B(InterfaceC16654n<? super T> interfaceC16654n, T t10, Function3<? super Throwable, ? super T, ? super CoroutineContext, Unit> function3) {
        Object objW = interfaceC16654n.W(t10, null, function3);
        if (objW == null) {
            return false;
        }
        interfaceC16654n.X(objW);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long w(long j10, int i10) {
        return (i10 << 60) + j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long A(int i10) {
        if (i10 == 0) {
            return 0L;
        }
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        return Long.MAX_VALUE;
    }

    static /* synthetic */ boolean C(InterfaceC16654n interfaceC16654n, Object obj, Function3 function3, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            function3 = null;
        }
        return B(interfaceC16654n, obj, function3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long v(long j10, boolean z10) {
        return (z10 ? 4611686018427387904L : 0L) + j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E> m<E> x(long j10, m<E> mVar) {
        return new m<>(j10, mVar, mVar.y(), 0);
    }

    public static final <E> KFunction<m<E>> y() {
        return a.f161299b;
    }

    public static final C17631E z() {
        return f161291l;
    }
}
