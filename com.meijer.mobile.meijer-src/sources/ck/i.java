package ck;

import android.content.res.Resources;
import android.view.View;
import bk.AbstractC6392a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/view/View;", "Lbk/a;", "formattedString", "", "a", "(Landroid/view/View;Lbk/a;)V", "i18n_release"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "com/meijer/mobile/core/i18n/androidx/FormattedStrings")
/* loaded from: classes8.dex */
final /* synthetic */ class i {
    public static final void a(View view, AbstractC6392a abstractC6392a) {
        String strC;
        Intrinsics.j(view, "<this>");
        if (abstractC6392a != null) {
            Resources resources = view.getResources();
            Intrinsics.i(resources, "getResources(...)");
            strC = abstractC6392a.c(resources);
        } else {
            strC = null;
        }
        view.setContentDescription(strC);
    }
}
