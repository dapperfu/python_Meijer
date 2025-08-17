package tv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.AbstractC17333a;
import kotlin.AbstractC17335c;
import kotlin.C17334b;
import kotlin.InterfaceC17347o;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C16658p;
import qv.C16662r;
import qv.InterfaceC16643h0;
import sv.EnumC17050a;
import vv.C17631E;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010 \n\u0002\b\u0013\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006:\u0001-B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010 \u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001f0\u001e2\u0006\u0010\u001d\u001a\u00020\u001aH\u0000¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\"\u0010#J\u001f\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001e2\u0006\u0010$\u001a\u00020\u0007H\u0014¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0017H\u0016¢\u0006\u0004\b'\u0010(J-\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00028\u0000H\u0002¢\u0006\u0004\b/\u0010\u0016J\u0017\u0010\u0001\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0016J\u000f\u00100\u001a\u00020\u0017H\u0002¢\u0006\u0004\b0\u0010(J\u0017\u00102\u001a\u00020\u00172\u0006\u00101\u001a\u00020\u001aH\u0002¢\u0006\u0004\b2\u00103J\u0019\u00105\u001a\u00020\u00172\b\u00104\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b5\u00106J9\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u001e2\u0010\u00107\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u001e2\u0006\u00108\u001a\u00020\u00072\u0006\u00109\u001a\u00020\u0007H\u0002¢\u0006\u0004\b:\u0010;J\u0018\u0010<\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b<\u0010\u0019J\u0017\u0010?\u001a\u00020\u00172\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\b?\u0010@J/\u0010E\u001a\u00020\u00172\u0006\u0010A\u001a\u00020\u001a2\u0006\u0010B\u001a\u00020\u001a2\u0006\u0010C\u001a\u00020\u001a2\u0006\u0010D\u001a\u00020\u001aH\u0002¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u0017H\u0002¢\u0006\u0004\bG\u0010(J\u0019\u0010I\u001a\u0004\u0018\u00010\u00052\u0006\u0010H\u001a\u00020\u0003H\u0002¢\u0006\u0004\bI\u0010JJ\u0017\u0010K\u001a\u00020\u001a2\u0006\u0010H\u001a\u00020\u0003H\u0002¢\u0006\u0004\bK\u0010LJ\u0019\u0010N\u001a\u0004\u0018\u00010\u00052\u0006\u0010M\u001a\u00020\u001aH\u0002¢\u0006\u0004\bN\u0010OJ\u0018\u0010P\u001a\u00020\u00172\u0006\u0010H\u001a\u00020\u0003H\u0082@¢\u0006\u0004\bP\u0010QJ3\u0010S\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001f0\u001e2\u0014\u0010R\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001f0\u001eH\u0002¢\u0006\u0004\bS\u0010TR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u00105R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u00105R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR \u0010Z\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010\\\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010SR\u0016\u0010^\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010SR\u0016\u0010`\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u00105R\u0016\u0010b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u00105R\u001a\u0010f\u001a\b\u0012\u0004\u0012\u00028\u00000c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bd\u0010eR\u001a\u0010j\u001a\u00028\u00008DX\u0084\u0004¢\u0006\f\u0012\u0004\bi\u0010(\u001a\u0004\bg\u0010hR\u0014\u0010l\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bk\u0010\u001cR\u0014\u0010o\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bm\u0010nR\u0014\u0010q\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bp\u0010nR\u0014\u0010s\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\br\u0010\u001cR\u0014\u0010u\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bt\u0010\u001c¨\u0006v"}, d2 = {"Ltv/G;", "T", "Luv/a;", "Ltv/I;", "Ltv/A;", "", "Luv/o;", "", "replay", "bufferCapacity", "Lsv/a;", "onBufferOverflow", "<init>", "(IILsv/a;)V", "Ltv/g;", "collector", "", "collect", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "value", "", "b", "(Ljava/lang/Object;)Z", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Y", "()J", "oldIndex", "", "Lkotlin/coroutines/Continuation;", "X", "(J)[Lkotlin/coroutines/Continuation;", "D", "()Ltv/I;", "size", "E", "(I)[Ltv/I;", "f", "()V", "Lkotlin/coroutines/CoroutineContext;", "context", "capacity", "Ltv/f;", "a", "(Lkotlin/coroutines/CoroutineContext;ILsv/a;)Ltv/f;", "S", "F", "newHead", "C", "(J)V", "item", "I", "(Ljava/lang/Object;)V", "curBuffer", "curSize", "newSize", "R", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "H", "Ltv/G$a;", "emitter", "z", "(Ltv/G$a;)V", "newReplayIndex", "newMinCollectorIndex", "newBufferEndIndex", "newQueueEndIndex", "W", "(JJJJ)V", "A", "slot", "V", "(Ltv/I;)Ljava/lang/Object;", "U", "(Ltv/I;)J", "index", "N", "(J)Ljava/lang/Object;", "y", "(Ltv/I;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resumesIn", "J", "([Lkotlin/coroutines/Continuation;)[Lkotlin/coroutines/Continuation;", "e", "g", "Lsv/a;", "h", "[Ljava/lang/Object;", "buffer", "i", "replayIndex", "j", "minCollectorIndex", "k", "bufferSize", "l", "queueSize", "", "d", "()Ljava/util/List;", "replayCache", "M", "()Ljava/lang/Object;", "getLastReplayedLocked$annotations", "lastReplayedLocked", "L", "head", "P", "()I", "replaySize", "Q", "totalSize", "K", "bufferEndIndex", "O", "queueEndIndex", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: tv.G, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C17145G<T> extends AbstractC17333a<I> implements InterfaceC17139A<T>, InterfaceC17152f, InterfaceC17347o<T> {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int replay;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int bufferCapacity;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final EnumC17050a onBufferOverflow;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Object[] buffer;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private long replayIndex;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private long minCollectorIndex;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int bufferSize;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int queueSize;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B3\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Ltv/G$a;", "Lqv/h0;", "Ltv/G;", "flow", "", "index", "", "value", "Lkotlin/coroutines/Continuation;", "", "cont", "<init>", "(Ltv/G;JLjava/lang/Object;Lkotlin/coroutines/Continuation;)V", "dispose", "()V", "a", "Ltv/G;", "b", "J", "c", "Ljava/lang/Object;", "d", "Lkotlin/coroutines/Continuation;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: tv.G$a */
    private static final class a implements InterfaceC16643h0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final C17145G<?> flow;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public long index;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final Object value;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final Continuation<Unit> cont;

        @Override // qv.InterfaceC16643h0
        public void dispose() {
            this.flow.z(this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(C17145G<?> c17145g, long j10, Object obj, Continuation<? super Unit> continuation) {
            this.flow = c17145g;
            this.index = j10;
            this.value = obj;
            this.cont = continuation;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", l = {387, 394, 397}, m = "collect$suspendImpl")
    /* renamed from: tv.G$c */
    static final class c<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f162118a;

        /* renamed from: b, reason: collision with root package name */
        Object f162119b;

        /* renamed from: c, reason: collision with root package name */
        Object f162120c;

        /* renamed from: d, reason: collision with root package name */
        Object f162121d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f162122e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C17145G<T> f162123f;

        /* renamed from: g, reason: collision with root package name */
        int f162124g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C17145G<T> c17145g, Continuation<? super c> continuation) {
            super(continuation);
            this.f162123f = c17145g;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f162122e = obj;
            this.f162124g |= Integer.MIN_VALUE;
            return C17145G.B(this.f162123f, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.lang.Object[]] */
    public final Continuation<Unit>[] J(Continuation<Unit>[] resumesIn) {
        AbstractC17335c[] abstractC17335cArr;
        I i10;
        Continuation<? super Unit> continuation;
        int length = resumesIn.length;
        if (((AbstractC17333a) this).nCollectors != 0 && (abstractC17335cArr = ((AbstractC17333a) this).slots) != null) {
            int length2 = abstractC17335cArr.length;
            int i11 = 0;
            resumesIn = resumesIn;
            while (i11 < length2) {
                AbstractC17335c abstractC17335c = abstractC17335cArr[i11];
                if (abstractC17335c != null && (continuation = (i10 = (I) abstractC17335c).cont) != null && U(i10) >= 0) {
                    int length3 = resumesIn.length;
                    resumesIn = resumesIn;
                    if (length >= length3) {
                        ?? CopyOf = Arrays.copyOf(resumesIn, Math.max(2, resumesIn.length * 2));
                        Intrinsics.i(CopyOf, "copyOf(...)");
                        resumesIn = CopyOf;
                    }
                    resumesIn[length] = continuation;
                    i10.cont = null;
                    length++;
                }
                i11++;
                resumesIn = resumesIn;
            }
        }
        return resumesIn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(a emitter) {
        synchronized (this) {
            if (emitter.index < L()) {
                return;
            }
            Object[] objArr = this.buffer;
            Intrinsics.g(objArr);
            if (C17146H.f(objArr, emitter.index) != emitter) {
                return;
            }
            C17146H.g(objArr, emitter.index, C17146H.f162125a);
            A();
            Unit unit = Unit.f142422a;
        }
    }

    @Override // tv.InterfaceC17144F
    public List<T> d() {
        synchronized (this) {
            int iP = P();
            if (iP == 0) {
                return CollectionsKt.m();
            }
            ArrayList arrayList = new ArrayList(iP);
            Object[] objArr = this.buffer;
            Intrinsics.g(objArr);
            for (int i10 = 0; i10 < iP; i10++) {
                arrayList.add(C17146H.f(objArr, this.replayIndex + i10));
            }
            return arrayList;
        }
    }

    @Override // tv.InterfaceC17139A
    public void f() throws Throwable {
        synchronized (this) {
            try {
                try {
                    W(K(), this.minCollectorIndex, K(), O());
                    Unit unit = Unit.f142422a;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: tv.G$b */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC17050a.values().length];
            try {
                iArr[EnumC17050a.f161240a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC17050a.f161242c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC17050a.f161241b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void A() {
        if (this.bufferCapacity != 0 || this.queueSize > 1) {
            Object[] objArr = this.buffer;
            Intrinsics.g(objArr);
            while (this.queueSize > 0 && C17146H.f(objArr, (L() + Q()) - 1) == C17146H.f162125a) {
                this.queueSize--;
                C17146H.g(objArr, L() + Q(), null);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0092, code lost:
    
        if (((tv.U) r9).a(r0) == r1) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ <T> java.lang.Object B(tv.C17145G<T> r8, tv.InterfaceC17153g<? super T> r9, kotlin.coroutines.Continuation<?> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.C17145G.B(tv.G, tv.g, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void F() {
        Object[] objArr = this.buffer;
        Intrinsics.g(objArr);
        C17146H.g(objArr, L(), null);
        this.bufferSize--;
        long jL = L() + 1;
        if (this.replayIndex < jL) {
            this.replayIndex = jL;
        }
        if (this.minCollectorIndex < jL) {
            C(jL);
        }
    }

    private final Object H(T t10, Continuation<? super Unit> continuation) throws Throwable {
        Throwable th2;
        Continuation<Unit>[] continuationArrJ;
        a aVar;
        C16658p c16658p = new C16658p(IntrinsicsKt.c(continuation), 1);
        c16658p.C();
        Continuation<Unit>[] continuationArrJ2 = C17334b.f163535a;
        synchronized (this) {
            try {
                if (S(t10)) {
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        c16658p.resumeWith(Result.b(Unit.f142422a));
                        continuationArrJ = J(continuationArrJ2);
                        aVar = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                } else {
                    try {
                        aVar = new a(this, L() + Q(), t10, c16658p);
                        I(aVar);
                        this.queueSize++;
                        if (this.bufferCapacity == 0) {
                            continuationArrJ2 = J(continuationArrJ2);
                        }
                        continuationArrJ = continuationArrJ2;
                    } catch (Throwable th4) {
                        th = th4;
                        th2 = th;
                        throw th2;
                    }
                }
                if (aVar != null) {
                    C16662r.a(c16658p, aVar);
                }
                for (Continuation<Unit> continuation2 : continuationArrJ) {
                    if (continuation2 != null) {
                        Result.Companion companion2 = Result.INSTANCE;
                        continuation2.resumeWith(Result.b(Unit.f142422a));
                    }
                }
                Object objV = c16658p.v();
                if (objV == IntrinsicsKt.f()) {
                    DebugProbesKt.c(continuation);
                }
                return objV == IntrinsicsKt.f() ? objV : Unit.f142422a;
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long L() {
        return Math.min(this.minCollectorIndex, this.replayIndex);
    }

    private final Object N(long index) {
        Object[] objArr = this.buffer;
        Intrinsics.g(objArr);
        Object objF = C17146H.f(objArr, index);
        return objF instanceof a ? ((a) objF).value : objF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int Q() {
        return this.bufferSize + this.queueSize;
    }

    private final Object[] R(Object[] curBuffer, int curSize, int newSize) {
        if (newSize <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr = new Object[newSize];
        this.buffer = objArr;
        if (curBuffer != null) {
            long jL = L();
            for (int i10 = 0; i10 < curSize; i10++) {
                long j10 = i10 + jL;
                C17146H.g(objArr, j10, C17146H.f(curBuffer, j10));
            }
        }
        return objArr;
    }

    private final boolean T(T value) {
        if (this.replay == 0) {
            return true;
        }
        I(value);
        int i10 = this.bufferSize + 1;
        this.bufferSize = i10;
        if (i10 > this.replay) {
            F();
        }
        this.minCollectorIndex = L() + this.bufferSize;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long U(I slot) {
        long j10 = slot.index;
        if (j10 >= K() && (this.bufferCapacity > 0 || j10 > L() || this.queueSize == 0)) {
            return -1L;
        }
        return j10;
    }

    private final Object V(I slot) {
        Object obj;
        Continuation<Unit>[] continuationArrX = C17334b.f163535a;
        synchronized (this) {
            try {
                long jU = U(slot);
                if (jU < 0) {
                    obj = C17146H.f162125a;
                } else {
                    long j10 = slot.index;
                    Object objN = N(jU);
                    slot.index = jU + 1;
                    continuationArrX = X(j10);
                    obj = objN;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (Continuation<Unit> continuation : continuationArrX) {
            if (continuation != null) {
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.b(Unit.f142422a));
            }
        }
        return obj;
    }

    private final Object y(I i10, Continuation<? super Unit> continuation) {
        C16658p c16658p = new C16658p(IntrinsicsKt.c(continuation), 1);
        c16658p.C();
        synchronized (this) {
            try {
                if (U(i10) < 0) {
                    i10.cont = c16658p;
                } else {
                    Result.Companion companion = Result.INSTANCE;
                    c16658p.resumeWith(Result.b(Unit.f142422a));
                }
                Unit unit = Unit.f142422a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Object objV = c16658p.v();
        if (objV == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objV == IntrinsicsKt.f() ? objV : Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.AbstractC17333a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public I j() {
        return new I();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.AbstractC17333a
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public I[] k(int size) {
        return new I[size];
    }

    protected final T M() {
        Object[] objArr = this.buffer;
        Intrinsics.g(objArr);
        return (T) C17146H.f(objArr, (this.replayIndex + P()) - 1);
    }

    public final Continuation<Unit>[] X(long oldIndex) {
        long j10;
        long j11;
        long j12;
        AbstractC17335c[] abstractC17335cArr;
        if (oldIndex > this.minCollectorIndex) {
            return C17334b.f163535a;
        }
        long jL = L();
        long j13 = this.bufferSize + jL;
        if (this.bufferCapacity == 0 && this.queueSize > 0) {
            j13++;
        }
        if (((AbstractC17333a) this).nCollectors != 0 && (abstractC17335cArr = ((AbstractC17333a) this).slots) != null) {
            for (AbstractC17335c abstractC17335c : abstractC17335cArr) {
                if (abstractC17335c != null) {
                    long j14 = ((I) abstractC17335c).index;
                    if (j14 >= 0 && j14 < j13) {
                        j13 = j14;
                    }
                }
            }
        }
        if (j13 <= this.minCollectorIndex) {
            return C17334b.f163535a;
        }
        long jK = K();
        int iMin = getNCollectors() > 0 ? Math.min(this.queueSize, this.bufferCapacity - ((int) (jK - j13))) : this.queueSize;
        Continuation<Unit>[] continuationArr = C17334b.f163535a;
        long j15 = this.queueSize + jK;
        if (iMin > 0) {
            continuationArr = new Continuation[iMin];
            Object[] objArr = this.buffer;
            Intrinsics.g(objArr);
            j12 = 1;
            long j16 = jK;
            int i10 = 0;
            while (true) {
                if (jK >= j15) {
                    j10 = jL;
                    j11 = j13;
                    jK = j16;
                    break;
                }
                Object objF = C17146H.f(objArr, jK);
                j10 = jL;
                C17631E c17631e = C17146H.f162125a;
                if (objF != c17631e) {
                    Intrinsics.h(objF, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    a aVar = (a) objF;
                    int i11 = i10 + 1;
                    j11 = j13;
                    continuationArr[i10] = aVar.cont;
                    C17146H.g(objArr, jK, c17631e);
                    C17146H.g(objArr, j16, aVar.value);
                    long j17 = j16 + 1;
                    if (i11 >= iMin) {
                        jK = j17;
                        break;
                    }
                    i10 = i11;
                    j16 = j17;
                } else {
                    j11 = j13;
                }
                jK++;
                jL = j10;
                j13 = j11;
            }
        } else {
            j10 = jL;
            j11 = j13;
            j12 = 1;
        }
        Continuation<Unit>[] continuationArr2 = continuationArr;
        int i12 = (int) (jK - j10);
        long j18 = getNCollectors() == 0 ? jK : j11;
        long jMax = Math.max(this.replayIndex, jK - Math.min(this.replay, i12));
        if (this.bufferCapacity == 0 && jMax < j15) {
            Object[] objArr2 = this.buffer;
            Intrinsics.g(objArr2);
            if (Intrinsics.e(C17146H.f(objArr2, jMax), C17146H.f162125a)) {
                jK += j12;
                jMax += j12;
            }
        }
        W(jMax, j18, jK, j15);
        A();
        return !(continuationArr2.length == 0) ? J(continuationArr2) : continuationArr2;
    }

    public final long Y() {
        long j10 = this.replayIndex;
        if (j10 < this.minCollectorIndex) {
            this.minCollectorIndex = j10;
        }
        return j10;
    }

    @Override // tv.InterfaceC17139A
    public boolean b(T value) {
        int i10;
        boolean z10;
        Continuation<Unit>[] continuationArrJ = C17334b.f163535a;
        synchronized (this) {
            if (S(value)) {
                continuationArrJ = J(continuationArrJ);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        for (Continuation<Unit> continuation : continuationArrJ) {
            if (continuation != null) {
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.b(Unit.f142422a));
            }
        }
        return z10;
    }

    public C17145G(int i10, int i11, EnumC17050a enumC17050a) {
        this.replay = i10;
        this.bufferCapacity = i11;
        this.onBufferOverflow = enumC17050a;
    }

    private final void C(long newHead) {
        AbstractC17335c[] abstractC17335cArr;
        if (((AbstractC17333a) this).nCollectors != 0 && (abstractC17335cArr = ((AbstractC17333a) this).slots) != null) {
            for (AbstractC17335c abstractC17335c : abstractC17335cArr) {
                if (abstractC17335c != null) {
                    I i10 = (I) abstractC17335c;
                    long j10 = i10.index;
                    if (j10 >= 0 && j10 < newHead) {
                        i10.index = newHead;
                    }
                }
            }
        }
        this.minCollectorIndex = newHead;
    }

    static /* synthetic */ <T> Object G(C17145G<T> c17145g, T t10, Continuation<? super Unit> continuation) throws Throwable {
        if (c17145g.b(t10)) {
            return Unit.f142422a;
        }
        Object objH = c17145g.H(t10, continuation);
        if (objH == IntrinsicsKt.f()) {
            return objH;
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(Object item) {
        int iQ = Q();
        Object[] objArrR = this.buffer;
        if (objArrR == null) {
            objArrR = R(null, 0, 2);
        } else if (iQ >= objArrR.length) {
            objArrR = R(objArrR, iQ, objArrR.length * 2);
        }
        C17146H.g(objArrR, L() + iQ, item);
    }

    private final long K() {
        return L() + this.bufferSize;
    }

    private final long O() {
        return L() + this.bufferSize + this.queueSize;
    }

    private final int P() {
        return (int) ((L() + this.bufferSize) - this.replayIndex);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean S(T value) {
        if (getNCollectors() == 0) {
            return T(value);
        }
        if (this.bufferSize >= this.bufferCapacity && this.minCollectorIndex <= this.replayIndex) {
            int i10 = b.$EnumSwitchMapping$0[this.onBufferOverflow.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    return true;
                }
                if (i10 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                return false;
            }
        }
        I(value);
        int i11 = this.bufferSize + 1;
        this.bufferSize = i11;
        if (i11 > this.bufferCapacity) {
            F();
        }
        if (P() > this.replay) {
            W(this.replayIndex + 1, this.minCollectorIndex, K(), O());
        }
        return true;
    }

    private final void W(long newReplayIndex, long newMinCollectorIndex, long newBufferEndIndex, long newQueueEndIndex) {
        long jMin = Math.min(newMinCollectorIndex, newReplayIndex);
        for (long jL = L(); jL < jMin; jL++) {
            Object[] objArr = this.buffer;
            Intrinsics.g(objArr);
            C17146H.g(objArr, jL, null);
        }
        this.replayIndex = newReplayIndex;
        this.minCollectorIndex = newMinCollectorIndex;
        this.bufferSize = (int) (newBufferEndIndex - jMin);
        this.queueSize = (int) (newQueueEndIndex - newBufferEndIndex);
    }

    @Override // kotlin.InterfaceC17347o
    public InterfaceC17152f<T> a(CoroutineContext context, int capacity, EnumC17050a onBufferOverflow) {
        return C17146H.e(this, context, capacity, onBufferOverflow);
    }

    @Override // tv.InterfaceC17144F, tv.InterfaceC17152f
    public Object collect(InterfaceC17153g<? super T> interfaceC17153g, Continuation<?> continuation) {
        return B(this, interfaceC17153g, continuation);
    }

    @Override // tv.InterfaceC17139A, tv.InterfaceC17153g
    public Object emit(T t10, Continuation<? super Unit> continuation) {
        return G(this, t10, continuation);
    }
}
