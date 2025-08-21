package mv;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\r8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lmv/y;", "T", "Lmv/H0;", "Lmv/x;", "Lmv/C0;", "parent", "<init>", "(Lmv/C0;)V", "i", "()Ljava/lang/Object;", "H", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "value", "", "b0", "(Ljava/lang/Object;)Z", "", "exception", "c", "(Ljava/lang/Throwable;)Z", "p0", "()Z", "onCancelComplete", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mv.y, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C15837y<T> extends H0 implements InterfaceC15835x<T> {
    public C15837y(C0 c02) {
        super(true);
        B0(c02);
    }

    @Override // mv.H0
    public boolean p0() {
        return true;
    }

    @Override // mv.InterfaceC15835x
    public boolean c(Throwable exception) {
        return I0(new C15771C(exception, false, 2, null));
    }

    @Override // mv.W
    public Object H(Continuation<? super T> continuation) throws Throwable {
        Object objC = C(continuation);
        IntrinsicsKt.f();
        return objC;
    }

    @Override // mv.InterfaceC15835x
    public boolean b0(T value) {
        return I0(value);
    }

    @Override // mv.W
    public T i() {
        return (T) f0();
    }
}
