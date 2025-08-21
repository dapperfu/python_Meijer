package N2;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import su.c;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/content/Context;", "context", "Landroidx/lifecycle/f0$c;", "delegateFactory", "a", "(Landroid/content/Context;Landroidx/lifecycle/f0$c;)Landroidx/lifecycle/f0$c;", "hilt-navigation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@JvmName
/* loaded from: classes.dex */
public final class a {
    @JvmName
    public static final f0.c a(Context context, f0.c delegateFactory) {
        Intrinsics.j(context, "context");
        Intrinsics.j(delegateFactory, "delegateFactory");
        while (context instanceof ContextWrapper) {
            if (context instanceof ComponentActivity) {
                f0.c cVarA = c.a((ComponentActivity) context, delegateFactory);
                Intrinsics.i(cVarA, "createInternal(\n        … */ delegateFactory\n    )");
                return cVarA;
            }
            context = ((ContextWrapper) context).getBaseContext();
            Intrinsics.i(context, "ctx.baseContext");
        }
        throw new IllegalStateException("Expected an activity context for creating a HiltViewModelFactory but instead found: " + context);
    }
}
