package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import d0.C13446m;
import d0.J;
import kotlin.EnumC13827z;
import kotlin.InterfaceC13790H;
import kotlin.InterfaceC13808g;
import kotlin.InterfaceC13820s;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ae\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lf0/H;", "state", "Lf0/z;", "orientation", "", "enabled", "reverseScrolling", "Lf0/s;", "flingBehavior", "Lh0/l;", "interactionSource", "useLocalOverscrollFactory", "Ld0/J;", "overscrollEffect", "Lf0/g;", "bringIntoViewSpec", "a", "(Landroidx/compose/ui/Modifier;Lf0/H;Lf0/z;ZZLf0/s;Lh0/l;ZLd0/J;Lf0/g;)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class m {
    public static final Modifier a(Modifier modifier, InterfaceC13790H interfaceC13790H, EnumC13827z enumC13827z, boolean z10, boolean z11, InterfaceC13820s interfaceC13820s, h0.l lVar, boolean z12, J j10, InterfaceC13808g interfaceC13808g) {
        return C13446m.a(modifier, enumC13827z).then(new ScrollingContainerElement(interfaceC13790H, enumC13827z, z10, z11, interfaceC13820s, lVar, interfaceC13808g, z12, j10));
    }
}
