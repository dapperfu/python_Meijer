package v5;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroid/content/Context;", "Landroid/app/Activity;", "a", "(Landroid/content/Context;)Landroid/app/Activity;", "assurance_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* renamed from: v5.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17639e {
    public static final Activity a(Context context) {
        Intrinsics.j(context, "<this>");
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            Intrinsics.i(context, "context.baseContext");
        }
        return null;
    }
}
