package tv;

import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.AbstractC17333a;
import kotlin.C17350r;
import kotlin.InterfaceC17347o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import sv.EnumC17050a;
import vv.C17631E;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u00020\f2\b\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030#2\u0006\u0010\"\u001a\u00020!H\u0014¢\u0006\u0004\b$\u0010%J-\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020!2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b,\u0010-R\u0016\u0010/\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010.R$\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u00008V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u0010\tR\u001a\u00106\u001a\b\u0012\u0004\u0012\u00028\u0000038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0011\u00107\u001a\b\u0012\u0004\u0012\u00020\u00050\u00058\u0002X\u0082\u0004¨\u00068"}, d2 = {"Ltv/Q;", "T", "Luv/a;", "Ltv/T;", "Ltv/B;", "", "Luv/o;", "initialState", "<init>", "(Ljava/lang/Object;)V", "expectedState", "newState", "", "r", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "expect", "update", "e", "value", "b", "(Ljava/lang/Object;)Z", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "f", "()V", "Ltv/g;", "collector", "", "collect", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "o", "()Ltv/T;", "", "size", "", "p", "(I)[Ltv/T;", "Lkotlin/coroutines/CoroutineContext;", "context", "capacity", "Lsv/a;", "onBufferOverflow", "Ltv/f;", "a", "(Lkotlin/coroutines/CoroutineContext;ILsv/a;)Ltv/f;", "I", "sequence", "getValue", "()Ljava/lang/Object;", "setValue", "", "d", "()Ljava/util/List;", "replayCache", "_state", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
final class Q<T> extends AbstractC17333a<T> implements InterfaceC17140B<T>, InterfaceC17152f, InterfaceC17347o<T> {

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f162157f = AtomicReferenceFieldUpdater.newUpdater(Q.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int sequence;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", l = {389, HttpResponseStatus.ERROR_UNAUTHORIZED, HttpResponseStatus.ERROR_NOT_ACCEPTABLE}, m = "collect")
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f162159a;

        /* renamed from: b, reason: collision with root package name */
        Object f162160b;

        /* renamed from: c, reason: collision with root package name */
        Object f162161c;

        /* renamed from: d, reason: collision with root package name */
        Object f162162d;

        /* renamed from: e, reason: collision with root package name */
        Object f162163e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f162164f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Q<T> f162165g;

        /* renamed from: h, reason: collision with root package name */
        int f162166h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Q<T> q10, Continuation<? super a> continuation) {
            super(continuation);
            this.f162165g = q10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f162164f = obj;
            this.f162166h |= Integer.MIN_VALUE;
            return this.f162165g.collect(null, this);
        }
    }

    private final boolean r(Object expectedState, Object newState) {
        int i10;
        T[] tArrN;
        synchronized (this) {
            Object obj = f162157f.get(this);
            if (expectedState != null && !Intrinsics.e(obj, expectedState)) {
                return false;
            }
            if (Intrinsics.e(obj, newState)) {
                return true;
            }
            f162157f.set(this, newState);
            int i11 = this.sequence;
            if ((i11 & 1) != 0) {
                this.sequence = i11 + 2;
                return true;
            }
            int i12 = i11 + 1;
            this.sequence = i12;
            T[] tArrN2 = n();
            Unit unit = Unit.f142422a;
            while (true) {
                T[] tArr = tArrN2;
                if (tArr != null) {
                    for (T t10 : tArr) {
                        if (t10 != null) {
                            t10.g();
                        }
                    }
                }
                synchronized (this) {
                    i10 = this.sequence;
                    if (i10 == i12) {
                        this.sequence = i12 + 1;
                        return true;
                    }
                    tArrN = n();
                    Unit unit2 = Unit.f142422a;
                }
                tArrN2 = tArrN;
                i12 = i10;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0093, code lost:
    
        if (((tv.U) r11).a(r0) == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bf, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.e(r11, r12) == false) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:36:0x00ac, B:52:0x00e2], limit reached: 56 */
    /* JADX WARN: Path cross not found for [B:40:0x00bb, B:42:0x00c1], limit reached: 56 */
    /* JADX WARN: Path cross not found for [B:42:0x00c1, B:40:0x00bb], limit reached: 56 */
    /* JADX WARN: Path cross not found for [B:42:0x00c1, B:50:0x00dc], limit reached: 56 */
    /* JADX WARN: Path cross not found for [B:52:0x00e2, B:36:0x00ac], limit reached: 56 */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b6 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:36:0x00ac, B:38:0x00b6, B:40:0x00bb, B:50:0x00dc, B:52:0x00e2, B:42:0x00c1, B:46:0x00c8, B:21:0x0060, B:24:0x0073, B:35:0x009d), top: B:57:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bb A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:36:0x00ac, B:38:0x00b6, B:40:0x00bb, B:50:0x00dc, B:52:0x00e2, B:42:0x00c1, B:46:0x00c8, B:21:0x0060, B:24:0x0073, B:35:0x009d), top: B:57:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e2 A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:36:0x00ac, B:38:0x00b6, B:40:0x00bb, B:50:0x00dc, B:52:0x00e2, B:42:0x00c1, B:46:0x00c8, B:21:0x0060, B:24:0x0073, B:35:0x009d), top: B:57:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2, types: [uv.c] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00e0 -> B:36:0x00ac). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00f2 -> B:36:0x00ac). Please report as a decompilation issue!!! */
    @Override // tv.InterfaceC17144F, tv.InterfaceC17152f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(tv.InterfaceC17153g<? super T> r11, kotlin.coroutines.Continuation<?> r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.Q.collect(tv.g, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // tv.InterfaceC17140B
    public boolean e(T expect, T update) {
        if (expect == null) {
            expect = (T) C17350r.f163603a;
        }
        if (update == null) {
            update = (T) C17350r.f163603a;
        }
        return r(expect, update);
    }

    @Override // tv.InterfaceC17139A
    public void f() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // tv.InterfaceC17140B, tv.P
    public T getValue() {
        C17631E c17631e = C17350r.f163603a;
        T t10 = (T) f162157f.get(this);
        if (t10 == c17631e) {
            return null;
        }
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.AbstractC17333a
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public T j() {
        return new T();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.AbstractC17333a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public T[] k(int size) {
        return new T[size];
    }

    @Override // tv.InterfaceC17140B
    public void setValue(T t10) {
        if (t10 == null) {
            t10 = (T) C17350r.f163603a;
        }
        r(null, t10);
    }

    public Q(Object obj) {
        this._state$volatile = obj;
    }

    @Override // kotlin.InterfaceC17347o
    public InterfaceC17152f<T> a(CoroutineContext context, int capacity, EnumC17050a onBufferOverflow) {
        return S.d(this, context, capacity, onBufferOverflow);
    }

    @Override // tv.InterfaceC17139A
    public boolean b(T value) {
        setValue(value);
        return true;
    }

    @Override // tv.InterfaceC17144F
    public List<T> d() {
        return CollectionsKt.e(getValue());
    }

    @Override // tv.InterfaceC17139A, tv.InterfaceC17153g
    public Object emit(T t10, Continuation<? super Unit> continuation) {
        setValue(t10);
        return Unit.f142422a;
    }
}
