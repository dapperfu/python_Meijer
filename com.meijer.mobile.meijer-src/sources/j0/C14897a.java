package j0;

import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.t1;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b\"\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010#R+\u0010+\u001a\u00020$2\u0006\u0010%\u001a\u00020$8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R+\u00100\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u001a8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010&\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00061"}, d2 = {"Lj0/a;", "Lj0/O;", "", "type", "", "name", "<init>", "(ILjava/lang/String;)V", "LH1/d;", "density", "LH1/t;", "layoutDirection", "c", "(LH1/d;LH1/t;)I", "b", "(LH1/d;)I", "a", "d", "Landroidx/core/view/j;", "windowInsetsCompat", "typeMask", "", "i", "(Landroidx/core/view/j;I)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "I", "getType$foundation_layout_release", "Ljava/lang/String;", "Lc2/d;", "<set-?>", "Landroidx/compose/runtime/l0;", "e", "()Lc2/d;", "g", "(Lc2/d;)V", "insets", "f", "()Z", "h", "(Z)V", "isVisible", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: j0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14897a implements InterfaceC14894O {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int type;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0 insets = t1.e(c2.d.f61160e, null, 2, null);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0 isVisible = t1.e(Boolean.TRUE, null, 2, null);

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C14897a) && this.type == ((C14897a) other).type;
    }

    private final void h(boolean z10) {
        this.isVisible.setValue(Boolean.valueOf(z10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final c2.d e() {
        return (c2.d) this.insets.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean f() {
        return ((Boolean) this.isVisible.getValue()).booleanValue();
    }

    public final void g(c2.d dVar) {
        this.insets.setValue(dVar);
    }

    /* renamed from: hashCode, reason: from getter */
    public int getType() {
        return this.type;
    }

    public final void i(androidx.core.view.j windowInsetsCompat, int typeMask) {
        if (typeMask == 0 || (typeMask & this.type) != 0) {
            g(windowInsetsCompat.f(this.type));
            h(windowInsetsCompat.t(this.type));
        }
    }

    public String toString() {
        return this.name + '(' + e().f61161a + ", " + e().f61162b + ", " + e().f61163c + ", " + e().f61164d + ')';
    }

    public C14897a(int i10, String str) {
        this.type = i10;
        this.name = str;
    }

    @Override // j0.InterfaceC14894O
    public int a(H1.d density, H1.t layoutDirection) {
        return e().f61163c;
    }

    @Override // j0.InterfaceC14894O
    public int b(H1.d density) {
        return e().f61162b;
    }

    @Override // j0.InterfaceC14894O
    public int c(H1.d density, H1.t layoutDirection) {
        return e().f61161a;
    }

    @Override // j0.InterfaceC14894O
    public int d(H1.d density) {
        return e().f61164d;
    }
}
