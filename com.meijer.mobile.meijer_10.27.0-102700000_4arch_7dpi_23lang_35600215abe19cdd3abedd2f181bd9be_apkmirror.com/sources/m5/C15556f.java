package m5;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010¨\u0006\u0011"}, d2 = {"Lm5/f;", "Lm5/j;", "Lm5/i;", "size", "<init>", "(Lm5/i;)V", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lm5/i;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: m5.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15556f implements InterfaceC15560j {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Size size;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C15556f) && Intrinsics.e(this.size, ((C15556f) other).size);
    }

    @Override // m5.InterfaceC15560j
    public Object b(Continuation<? super Size> continuation) {
        return this.size;
    }

    public int hashCode() {
        return this.size.hashCode();
    }

    public C15556f(Size size) {
        this.size = size;
    }
}
