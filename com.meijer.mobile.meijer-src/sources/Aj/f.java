package Aj;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\u0005¨\u0006\b"}, d2 = {"Landroid/view/View;", "", "isVisible", "", "b", "(Landroid/view/View;Z)V", "isInvisible", "a", "base-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class f {
    public static final void a(View view, boolean z10) {
        Intrinsics.j(view, "<this>");
        view.setVisibility(z10 ? 4 : 0);
    }

    public static final void b(View view, boolean z10) {
        Intrinsics.j(view, "<this>");
        view.setVisibility(z10 ? 0 : 8);
    }
}
