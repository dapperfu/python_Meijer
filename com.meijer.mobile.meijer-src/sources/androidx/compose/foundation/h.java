package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lh0/l;", "interactionSource", "", "enabled", "a", "(Landroidx/compose/ui/Modifier;Lh0/l;Z)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h {
    public static final Modifier a(Modifier modifier, h0.l lVar, boolean z10) {
        return modifier.then(z10 ? new HoverableElement(lVar) : Modifier.INSTANCE);
    }

    public static /* synthetic */ Modifier b(Modifier modifier, h0.l lVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return a(modifier, lVar, z10);
    }
}
