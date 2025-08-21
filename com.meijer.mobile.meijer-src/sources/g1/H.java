package g1;

import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u0003R$\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u00168VX\u0096\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u0003\u001a\u0004\b\u0019\u0010\u0017\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"Lg1/H;", "", "<init>", "()V", "Lg1/q;", "pointerEvent", "Lg1/s;", "pass", "LH1/r;", "bounds", "", "e", "(Lg1/q;Lg1/s;J)V", "d", "Landroidx/compose/ui/layout/LayoutCoordinates;", "a", "Landroidx/compose/ui/layout/LayoutCoordinates;", "b", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "f", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "layoutCoordinates", "", "()Z", "interceptOutOfBoundsChildEvents", "c", "getShareWithSiblings$annotations", "shareWithSiblings", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class H {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private LayoutCoordinates layoutCoordinates;

    public boolean a() {
        return false;
    }

    public abstract boolean c();

    public abstract void d();

    public abstract void e(C14314q pointerEvent, EnumC14315s pass, long bounds);

    /* renamed from: b, reason: from getter */
    public final LayoutCoordinates getLayoutCoordinates() {
        return this.layoutCoordinates;
    }

    public final void f(LayoutCoordinates layoutCoordinates) {
        this.layoutCoordinates = layoutCoordinates;
    }
}
