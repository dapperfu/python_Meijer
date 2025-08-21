package j0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.C6034t0;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u001c\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0000H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0019\u0010\u000e\u001a\u00020\t*\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a5\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016\u001a8\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00172\b\b\u0002\u0010\u0012\u001a\u00020\u00172\b\b\u0002\u0010\u0013\u001a\u00020\u00172\b\b\u0002\u0010\u0014\u001a\u00020\u0017ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Lj0/O;", "insets", "h", "(Lj0/O;Lj0/O;)Lj0/O;", "f", "Lj0/U;", "sides", "g", "(Lj0/O;I)Lj0/O;", "Lj0/C;", "e", "(Lj0/O;Landroidx/compose/runtime/Composer;I)Lj0/C;", "LH1/d;", "density", "d", "(Lj0/O;LH1/d;)Lj0/C;", "", "left", "top", "right", "bottom", "a", "(IIII)Lj0/O;", "LH1/h;", "b", "(FFFF)Lj0/O;", "foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: j0.Q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14896Q {
    public static final InterfaceC14894O a(int i10, int i11, int i12, int i13) {
        return new Insets(i10, i11, i12, i13);
    }

    public static final InterfaceC14894O b(float f10, float f11, float f12, float f13) {
        return new Insets(f10, f11, f12, f13, null);
    }

    public static /* synthetic */ InterfaceC14894O c(float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = H1.h.p(0);
        }
        if ((i10 & 2) != 0) {
            f11 = H1.h.p(0);
        }
        if ((i10 & 4) != 0) {
            f12 = H1.h.p(0);
        }
        if ((i10 & 8) != 0) {
            f13 = H1.h.p(0);
        }
        return b(f10, f11, f12, f13);
    }

    public static final InterfaceC14882C d(InterfaceC14894O interfaceC14894O, H1.d dVar) {
        return new InsetsPaddingValues(interfaceC14894O, dVar);
    }

    public static final InterfaceC14894O f(InterfaceC14894O interfaceC14894O, InterfaceC14894O interfaceC14894O2) {
        return new C14908l(interfaceC14894O, interfaceC14894O2);
    }

    public static final InterfaceC14894O g(InterfaceC14894O interfaceC14894O, int i10) {
        return new C14880A(interfaceC14894O, i10, null);
    }

    public static final InterfaceC14894O h(InterfaceC14894O interfaceC14894O, InterfaceC14894O interfaceC14894O2) {
        return new C14892M(interfaceC14894O, interfaceC14894O2);
    }

    public static final InterfaceC14882C e(InterfaceC14894O interfaceC14894O, Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(-1485016250, i10, -1, "androidx.compose.foundation.layout.asPaddingValues (WindowInsets.kt:220)");
        }
        InsetsPaddingValues insetsPaddingValues = new InsetsPaddingValues(interfaceC14894O, (H1.d) composer.o(C6034t0.g()));
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return insetsPaddingValues;
    }
}
