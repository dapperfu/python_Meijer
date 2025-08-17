package tv;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.AbstractC17336d;
import kotlin.C17355x;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.InterfaceC16622O;
import sv.EnumC17050a;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0019\u001a\u00020\u000f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0094@¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0018\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010 \u001a\u00020\u000f2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0096@¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0014¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u000b\u0010*\u001a\u00020)8\u0002X\u0082\u0004¨\u0006+"}, d2 = {"Ltv/c;", "T", "Luv/d;", "Lsv/v;", "channel", "", "consume", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lsv/a;", "onBufferOverflow", "<init>", "(Lsv/v;ZLkotlin/coroutines/CoroutineContext;ILsv/a;)V", "", "p", "()V", "j", "(Lkotlin/coroutines/CoroutineContext;ILsv/a;)Luv/d;", "Ltv/f;", "k", "()Ltv/f;", "Lsv/t;", "scope", "i", "(Lsv/t;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lqv/O;", "n", "(Lqv/O;)Lsv/v;", "Ltv/g;", "collector", "collect", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "g", "()Ljava/lang/String;", "d", "Lsv/v;", "e", "Z", "", "consumed", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: tv.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C17149c<T> extends AbstractC17336d<T> {

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f162192f = AtomicIntegerFieldUpdater.newUpdater(C17149c.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final sv.v<T> channel;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean consume;

    public /* synthetic */ C17149c(sv.v vVar, boolean z10, CoroutineContext coroutineContext, int i10, EnumC17050a enumC17050a, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(vVar, z10, (i11 & 4) != 0 ? EmptyCoroutineContext.f142646a : coroutineContext, (i11 & 8) != 0 ? -3 : i10, (i11 & 16) != 0 ? EnumC17050a.f161240a : enumC17050a);
    }

    private final void p() {
        if (this.consume && f162192f.getAndSet(this, 1) == 1) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
    }

    @Override // kotlin.AbstractC17336d, tv.InterfaceC17152f
    public Object collect(InterfaceC17153g<? super T> interfaceC17153g, Continuation<? super Unit> continuation) {
        if (this.capacity != -3) {
            Object objCollect = super.collect(interfaceC17153g, continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f142422a;
        }
        p();
        Object objD = C17156j.d(interfaceC17153g, this.channel, this.consume, continuation);
        return objD == IntrinsicsKt.f() ? objD : Unit.f142422a;
    }

    @Override // kotlin.AbstractC17336d
    protected String g() {
        return "channel=" + this.channel;
    }

    @Override // kotlin.AbstractC17336d
    protected Object i(sv.t<? super T> tVar, Continuation<? super Unit> continuation) {
        Object objD = C17156j.d(new C17355x(tVar), this.channel, this.consume, continuation);
        return objD == IntrinsicsKt.f() ? objD : Unit.f142422a;
    }

    @Override // kotlin.AbstractC17336d
    protected AbstractC17336d<T> j(CoroutineContext context, int capacity, EnumC17050a onBufferOverflow) {
        return new C17149c(this.channel, this.consume, context, capacity, onBufferOverflow);
    }

    @Override // kotlin.AbstractC17336d
    public InterfaceC17152f<T> k() {
        return new C17149c(this.channel, this.consume, null, 0, null, 28, null);
    }

    @Override // kotlin.AbstractC17336d
    public sv.v<T> n(InterfaceC16622O scope) {
        p();
        if (this.capacity == -3) {
            return this.channel;
        }
        return super.n(scope);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C17149c(sv.v<? extends T> vVar, boolean z10, CoroutineContext coroutineContext, int i10, EnumC17050a enumC17050a) {
        super(coroutineContext, i10, enumC17050a);
        this.channel = vVar;
        this.consume = z10;
    }
}
