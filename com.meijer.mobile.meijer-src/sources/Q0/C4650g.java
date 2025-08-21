package Q0;

import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsConfiguration;", "", "d", "(Landroidx/compose/ui/semantics/SemanticsConfiguration;)Z", "e", "f", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: Q0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4650g {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(SemanticsConfiguration semanticsConfiguration) {
        return semanticsConfiguration.q().b(SemanticsActions.INSTANCE.k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(SemanticsConfiguration semanticsConfiguration) {
        return semanticsConfiguration.q().b(SemanticsProperties.INSTANCE.d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(SemanticsConfiguration semanticsConfiguration) {
        if (!semanticsConfiguration.q().b(SemanticsActions.INSTANCE.k())) {
            Z.W<SemanticsPropertyKey<?>, Object> wQ = semanticsConfiguration.q();
            SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
            if (!wQ.b(semanticsProperties.d()) && !semanticsConfiguration.q().b(semanticsProperties.c())) {
                return false;
            }
            return true;
        }
        return true;
    }
}
