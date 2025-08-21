package androidx.compose.ui.semantics;

import androidx.compose.ui.Modifier;
import com.fullstory.instrumentation.frameworks.compose.FSComposeSemanticsModifier;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsModifier;", "Landroidx/compose/ui/Modifier$b;", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "getSemanticsConfiguration", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "semanticsConfiguration", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface SemanticsModifier extends Modifier.b, FSComposeSemanticsModifier {
    SemanticsConfiguration getSemanticsConfiguration();
}
