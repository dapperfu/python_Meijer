package bk;

import ak.AbstractC5607a;
import android.content.res.Resources;
import com.google.android.material.tabs.TabLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/google/android/material/tabs/TabLayout$f;", "Lak/a;", "formattedString", "a", "(Lcom/google/android/material/tabs/TabLayout$f;Lak/a;)Lcom/google/android/material/tabs/TabLayout$f;", "i18n_release"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "com/meijer/mobile/core/i18n/androidx/FormattedStrings")
@SourceDebugExtension
/* loaded from: classes7.dex */
final /* synthetic */ class g {
    public static final TabLayout.f a(TabLayout.f fVar, AbstractC5607a abstractC5607a) {
        Resources resources;
        Intrinsics.j(fVar, "<this>");
        TabLayout tabLayout = fVar.f87667h;
        if (tabLayout != null && (resources = tabLayout.getResources()) != null) {
            TabLayout.f fVarM = fVar.m(abstractC5607a != null ? abstractC5607a.c(resources) : null);
            if (fVarM != null) {
                return fVarM;
            }
        }
        throw new IllegalArgumentException("Tab not attached to a TabLayout");
    }
}
