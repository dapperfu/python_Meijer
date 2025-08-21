package fsimpl;

import com.fullstory.instrumentation.frameworks.compose.FSComposeCombinedModifier;
import com.fullstory.instrumentation.frameworks.compose.FSComposeModifier;

/* loaded from: classes15.dex */
public class bG {
    public static void a(FSComposeModifier fSComposeModifier, bH bHVar) {
        if (bHVar == null || fSComposeModifier == null) {
            return;
        }
        if (!(fSComposeModifier instanceof FSComposeCombinedModifier)) {
            bHVar.accept(fSComposeModifier);
            return;
        }
        FSComposeCombinedModifier fSComposeCombinedModifier = (FSComposeCombinedModifier) fSComposeModifier;
        a(fSComposeCombinedModifier._fsGetOuter(), bHVar);
        a(fSComposeCombinedModifier._fsGetInner(), bHVar);
    }
}
