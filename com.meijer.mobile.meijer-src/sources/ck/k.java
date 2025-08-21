package ck;

import android.content.res.Resources;
import androidx.appcompat.widget.Toolbar;
import bk.AbstractC6392a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/appcompat/widget/Toolbar;", "Lbk/a;", "title", "", "a", "(Landroidx/appcompat/widget/Toolbar;Lbk/a;)V", "i18n_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class k {
    public static final void a(Toolbar toolbar, AbstractC6392a abstractC6392a) {
        String strC;
        Intrinsics.j(toolbar, "<this>");
        if (abstractC6392a instanceof AbstractC6392a.Res) {
            AbstractC6392a.Res res = (AbstractC6392a.Res) abstractC6392a;
            if (res.g().isEmpty()) {
                toolbar.setTitle(res.getStringResId());
                return;
            }
        }
        if (abstractC6392a != null) {
            Resources resources = toolbar.getResources();
            Intrinsics.i(resources, "getResources(...)");
            strC = abstractC6392a.c(resources);
        } else {
            strC = null;
        }
        toolbar.setTitle(strC);
    }
}
