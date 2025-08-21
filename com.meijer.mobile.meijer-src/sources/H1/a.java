package H1;

import android.content.Context;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroid/content/Context;", "context", "LH1/d;", "a", "(Landroid/content/Context;)LH1/d;", "ui-unit_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a {
    public static final d a(Context context) {
        float f10 = context.getResources().getConfiguration().fontScale;
        float f11 = context.getResources().getDisplayMetrics().density;
        I1.a aVarB = I1.b.f14120a.b(f10);
        if (aVarB == null) {
            aVarB = new LinearFontScaleConverter(f10);
        }
        return new DensityWithConverter(f11, f10, aVarB);
    }
}
