package kotlin;

import H1.t;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.t1;
import j0.C14896Q;
import j0.InterfaceC14894O;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\rR+\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00018F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0004¨\u0006\u0016"}, d2 = {"Lx0/O0;", "Lj0/O;", "initialInsets", "<init>", "(Lj0/O;)V", "LH1/d;", "density", "LH1/t;", "layoutDirection", "", "c", "(LH1/d;LH1/t;)I", "b", "(LH1/d;)I", "a", "d", "<set-?>", "Landroidx/compose/runtime/l0;", "e", "()Lj0/O;", "f", "insets", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: x0.O0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17963O0 implements InterfaceC14894O {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0 insets;

    /* JADX WARN: Multi-variable type inference failed */
    public C17963O0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C17963O0(InterfaceC14894O interfaceC14894O) {
        this.insets = t1.e(interfaceC14894O, null, 2, null);
    }

    public final InterfaceC14894O e() {
        return (InterfaceC14894O) this.insets.getValue();
    }

    public final void f(InterfaceC14894O interfaceC14894O) {
        this.insets.setValue(interfaceC14894O);
    }

    @Override // j0.InterfaceC14894O
    public int a(H1.d density, t layoutDirection) {
        return e().a(density, layoutDirection);
    }

    @Override // j0.InterfaceC14894O
    public int b(H1.d density) {
        return e().b(density);
    }

    @Override // j0.InterfaceC14894O
    public int c(H1.d density, t layoutDirection) {
        return e().c(density, layoutDirection);
    }

    @Override // j0.InterfaceC14894O
    public int d(H1.d density) {
        return e().d(density);
    }

    public /* synthetic */ C17963O0(InterfaceC14894O interfaceC14894O, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C14896Q.a(0, 0, 0, 0) : interfaceC14894O);
    }
}
