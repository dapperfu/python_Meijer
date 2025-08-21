package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.Modifier;
import kotlin.C15876i;
import kotlin.EnumC13937z;
import kotlin.InterfaceC15878k;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a3\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/Modifier;", "Ln0/k;", "state", "Ln0/i;", "beyondBoundsInfo", "", "reverseLayout", "Lf0/z;", "orientation", "b", "(Landroidx/compose/ui/Modifier;Ln0/k;Ln0/i;ZLf0/z;)Landroidx/compose/ui/Modifier;", "", "c", "()Ljava/lang/Void;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {
    public static final Modifier b(Modifier modifier, InterfaceC15878k interfaceC15878k, C15876i c15876i, boolean z10, EnumC13937z enumC13937z) {
        return modifier.then(new LazyLayoutBeyondBoundsModifierElement(interfaceC15878k, c15876i, z10, enumC13937z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void c() {
        throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
    }
}
