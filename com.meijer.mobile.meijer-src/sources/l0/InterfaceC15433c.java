package l0;

import androidx.compose.ui.Modifier;
import kotlin.C6453j;
import kotlin.E0;
import kotlin.InterfaceC6419F;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u0007\u001a\u00020\u0002*\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0007\u0010\u0006J\u001d\u0010\b\u001a\u00020\u0002*\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\b\u0010\u0006JI\u0010\u000e\u001a\u00020\u0002*\u00020\u00022\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0003"}, d2 = {"Ll0/c;", "", "Landroidx/compose/ui/Modifier;", "", "fraction", "g", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "e", "d", "Lc0/F;", "fadeInSpec", "LH1/n;", "placementSpec", "fadeOutSpec", "h", "(Landroidx/compose/ui/Modifier;Lc0/F;Lc0/F;Lc0/F;)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: l0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC15433c {
    Modifier d(Modifier modifier, float f10);

    Modifier e(Modifier modifier, float f10);

    Modifier g(Modifier modifier, float f10);

    default Modifier h(Modifier modifier, InterfaceC6419F<Float> interfaceC6419F, InterfaceC6419F<H1.n> interfaceC6419F2, InterfaceC6419F<Float> interfaceC6419F3) {
        return modifier;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Modifier a(InterfaceC15433c interfaceC15433c, Modifier modifier, InterfaceC6419F interfaceC6419F, InterfaceC6419F interfaceC6419F2, InterfaceC6419F interfaceC6419F3, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateItem");
        }
        if ((i10 & 1) != 0) {
            interfaceC6419F = C6453j.j(0.0f, 400.0f, null, 5, null);
        }
        if ((i10 & 2) != 0) {
            interfaceC6419F2 = C6453j.j(0.0f, 400.0f, H1.n.c(E0.c(H1.n.INSTANCE)), 1, null);
        }
        if ((i10 & 4) != 0) {
            interfaceC6419F3 = C6453j.j(0.0f, 400.0f, null, 5, null);
        }
        return interfaceC15433c.h(modifier, interfaceC6419F, interfaceC6419F2, interfaceC6419F3);
    }

    static /* synthetic */ Modifier b(InterfaceC15433c interfaceC15433c, Modifier modifier, float f10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxWidth");
        }
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        return interfaceC15433c.e(modifier, f10);
    }

    static /* synthetic */ Modifier c(InterfaceC15433c interfaceC15433c, Modifier modifier, float f10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxHeight");
        }
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        return interfaceC15433c.d(modifier, f10);
    }

    static /* synthetic */ Modifier f(InterfaceC15433c interfaceC15433c, Modifier modifier, float f10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxSize");
        }
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        return interfaceC15433c.g(modifier, f10);
    }
}
