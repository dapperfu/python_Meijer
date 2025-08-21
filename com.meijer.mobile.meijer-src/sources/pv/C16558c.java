package pv;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.AbstractC16772d;
import kotlin.C16791x;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.InterfaceC15783O;
import ov.EnumC16325a;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0019\u001a\u00020\u000f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0094@¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0018\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010 \u001a\u00020\u000f2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0096@¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0014¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u000b\u0010*\u001a\u00020)8\u0002X\u0082\u0004¨\u0006+"}, d2 = {"Lpv/c;", "T", "Lqv/d;", "Lov/v;", "channel", "", "consume", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lov/a;", "onBufferOverflow", "<init>", "(Lov/v;ZLkotlin/coroutines/CoroutineContext;ILov/a;)V", "", "p", "()V", "j", "(Lkotlin/coroutines/CoroutineContext;ILov/a;)Lqv/d;", "Lpv/f;", "k", "()Lpv/f;", "Lov/t;", "scope", "i", "(Lov/t;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmv/O;", "n", "(Lmv/O;)Lov/v;", "Lpv/g;", "collector", "collect", "(Lpv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "g", "()Ljava/lang/String;", "d", "Lov/v;", "e", "Z", "", "consumed", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: pv.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C16558c<T> extends AbstractC16772d<T> {

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f157506f = AtomicIntegerFieldUpdater.newUpdater(C16558c.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ov.v<T> channel;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean consume;

    public /* synthetic */ C16558c(ov.v vVar, boolean z10, CoroutineContext coroutineContext, int i10, EnumC16325a enumC16325a, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(vVar, z10, (i11 & 4) != 0 ? EmptyCoroutineContext.f143553a : coroutineContext, (i11 & 8) != 0 ? -3 : i10, (i11 & 16) != 0 ? EnumC16325a.f155824a : enumC16325a);
    }

    private final void p() {
        if (this.consume && f157506f.getAndSet(this, 1) == 1) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
    }

    @Override // kotlin.AbstractC16772d, pv.InterfaceC16561f
    public Object collect(InterfaceC16562g<? super T> interfaceC16562g, Continuation<? super Unit> continuation) {
        if (this.capacity != -3) {
            Object objCollect = super.collect(interfaceC16562g, continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f143329a;
        }
        p();
        Object objD = C16565j.d(interfaceC16562g, this.channel, this.consume, continuation);
        return objD == IntrinsicsKt.f() ? objD : Unit.f143329a;
    }

    @Override // kotlin.AbstractC16772d
    protected String g() {
        return "channel=" + this.channel;
    }

    @Override // kotlin.AbstractC16772d
    protected Object i(ov.t<? super T> tVar, Continuation<? super Unit> continuation) {
        Object objD = C16565j.d(new C16791x(tVar), this.channel, this.consume, continuation);
        return objD == IntrinsicsKt.f() ? objD : Unit.f143329a;
    }

    @Override // kotlin.AbstractC16772d
    protected AbstractC16772d<T> j(CoroutineContext context, int capacity, EnumC16325a onBufferOverflow) {
        return new C16558c(this.channel, this.consume, context, capacity, onBufferOverflow);
    }

    @Override // kotlin.AbstractC16772d
    public InterfaceC16561f<T> k() {
        return new C16558c(this.channel, this.consume, null, 0, null, 28, null);
    }

    @Override // kotlin.AbstractC16772d
    public ov.v<T> n(InterfaceC15783O scope) {
        p();
        if (this.capacity == -3) {
            return this.channel;
        }
        return super.n(scope);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C16558c(ov.v<? extends T> vVar, boolean z10, CoroutineContext coroutineContext, int i10, EnumC16325a enumC16325a) {
        super(coroutineContext, i10, enumC16325a);
        this.channel = vVar;
        this.consume = z10;
    }
}
