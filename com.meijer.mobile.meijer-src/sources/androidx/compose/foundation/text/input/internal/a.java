package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.B;
import androidx.compose.ui.Modifier;
import kotlin.C17778Q;
import kotlin.Metadata;
import u0.q0;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lu0/q0;", "serviceAdapter", "Landroidx/compose/foundation/text/B;", "legacyTextFieldState", "Lw0/Q;", "textFieldSelectionManager", "a", "(Landroidx/compose/ui/Modifier;Lu0/q0;Landroidx/compose/foundation/text/B;Lw0/Q;)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a {
    public static final Modifier a(Modifier modifier, q0 q0Var, B b10, C17778Q c17778q) {
        return modifier.then(new LegacyAdaptingPlatformTextInputModifier(q0Var, b10, c17778q));
    }
}
