package j0;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lj0/h;", "Lk1/d;", "Lkotlin/Function1;", "Lj0/O;", "", "block", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lk1/k;", "scope", "m", "(Lk1/k;)V", "b", "Lkotlin/jvm/functions/Function1;", "c", "Lj0/O;", "oldWindowInsets", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: j0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C14904h implements k1.d {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function1<InterfaceC14894O, Unit> block;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private InterfaceC14894O oldWindowInsets;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C14904h) && ((C14904h) other).block == this.block;
    }

    public int hashCode() {
        return this.block.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C14904h(Function1<? super InterfaceC14894O, Unit> function1) {
        this.block = function1;
    }

    @Override // k1.d
    public void m(k1.k scope) {
        InterfaceC14894O interfaceC14894O = (InterfaceC14894O) scope.q(S.a());
        if (!Intrinsics.e(interfaceC14894O, this.oldWindowInsets)) {
            this.oldWindowInsets = interfaceC14894O;
            this.block.invoke(interfaceC14894O);
        }
    }
}
