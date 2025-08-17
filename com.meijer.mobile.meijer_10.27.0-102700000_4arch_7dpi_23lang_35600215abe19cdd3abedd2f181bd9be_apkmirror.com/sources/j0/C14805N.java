package j0;

import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.t1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001bR+\u0010$\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00028@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lj0/N;", "Lj0/O;", "Lj0/v;", "insets", "", "name", "<init>", "(Lj0/v;Ljava/lang/String;)V", "LH1/d;", "density", "LH1/t;", "layoutDirection", "", "c", "(LH1/d;LH1/t;)I", "b", "(LH1/d;)I", "a", "d", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getName", "<set-?>", "Landroidx/compose/runtime/l0;", "e", "()Lj0/v;", "f", "(Lj0/v;)V", "value", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: j0.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14805N implements InterfaceC14806O {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 value;

    /* JADX WARN: Multi-variable type inference failed */
    public final InsetsValues e() {
        return (InsetsValues) this.value.getValue();
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (other instanceof C14805N) {
            return Intrinsics.e(e(), ((C14805N) other).e());
        }
        return false;
    }

    public final void f(InsetsValues insetsValues) {
        this.value.setValue(insetsValues);
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public String toString() {
        return this.name + "(left=" + e().getLeft() + ", top=" + e().getTop() + ", right=" + e().getRight() + ", bottom=" + e().getBottom() + ')';
    }

    public C14805N(InsetsValues insetsValues, String str) {
        this.name = str;
        this.value = t1.e(insetsValues, null, 2, null);
    }

    @Override // j0.InterfaceC14806O
    public int a(H1.d density, H1.t layoutDirection) {
        return e().getRight();
    }

    @Override // j0.InterfaceC14806O
    public int b(H1.d density) {
        return e().getTop();
    }

    @Override // j0.InterfaceC14806O
    public int c(H1.d density, H1.t layoutDirection) {
        return e().getLeft();
    }

    @Override // j0.InterfaceC14806O
    public int d(H1.d density) {
        return e().getBottom();
    }
}
