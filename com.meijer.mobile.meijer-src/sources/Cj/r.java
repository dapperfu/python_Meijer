package Cj;

import android.content.Context;
import android.util.TypedValue;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a1\u0010\u0007\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroid/content/Context;", "", "attrColor", "Landroid/util/TypedValue;", "typedValue", "", "resolveRefs", "a", "(Landroid/content/Context;ILandroid/util/TypedValue;Z)I", "design_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class r {
    @JvmOverloads
    public static final int a(Context context, int i10, TypedValue typedValue, boolean z10) {
        Intrinsics.j(context, "<this>");
        Intrinsics.j(typedValue, "typedValue");
        context.getTheme().resolveAttribute(i10, typedValue, z10);
        return typedValue.data;
    }

    public static /* synthetic */ int b(Context context, int i10, TypedValue typedValue, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            typedValue = new TypedValue();
        }
        if ((i11 & 4) != 0) {
            z10 = true;
        }
        return a(context, i10, typedValue, z10);
    }
}
