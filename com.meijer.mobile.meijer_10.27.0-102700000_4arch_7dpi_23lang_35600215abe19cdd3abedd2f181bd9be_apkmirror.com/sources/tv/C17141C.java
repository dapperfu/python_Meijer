package tv;

import kotlin.InterfaceC17347o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import qv.C0;
import sv.EnumC17050a;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u001f\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ-\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0016\u001a\u00020\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0096A¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Ltv/C;", "T", "Ltv/F;", "", "Luv/o;", "flow", "Lqv/C0;", "job", "<init>", "(Ltv/F;Lqv/C0;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lsv/a;", "onBufferOverflow", "Ltv/f;", "a", "(Lkotlin/coroutines/CoroutineContext;ILsv/a;)Ltv/f;", "Ltv/g;", "collector", "", "collect", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "Lqv/C0;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: tv.C, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C17141C<T> implements InterfaceC17144F<T>, InterfaceC17152f, InterfaceC17347o<T> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ InterfaceC17144F<T> f162101a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C0 job;

    @Override // tv.InterfaceC17144F, tv.InterfaceC17152f
    public Object collect(InterfaceC17153g<? super T> interfaceC17153g, Continuation<?> continuation) {
        return this.f162101a.collect(interfaceC17153g, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C17141C(InterfaceC17144F<? extends T> interfaceC17144F, C0 c02) {
        this.f162101a = interfaceC17144F;
        this.job = c02;
    }

    @Override // kotlin.InterfaceC17347o
    public InterfaceC17152f<T> a(CoroutineContext context, int capacity, EnumC17050a onBufferOverflow) {
        return C17146H.e(this, context, capacity, onBufferOverflow);
    }
}
