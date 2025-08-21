package com.meijer.mobile.widget;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import bk.AbstractC6392a;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.tabs.TabLayout;
import com.meijer.mobile.core.design.widget.howTo.WalkThroughType;
import com.meijer.mobile.meijer.P;
import com.meijer.mobile.meijer.Y;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0001\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001a\u0010\u0003R\u0014\u0010\u001d\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/meijer/mobile/widget/AppWalkThroughView;", "Lcom/meijer/mobile/widget/WalkThroughView;", "<init>", "()V", "Lcom/google/android/material/tabs/TabLayout;", "tabs", "", "u1", "(Lcom/google/android/material/tabs/TabLayout;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lcom/google/android/material/tabs/TabLayout$f;", "tab", "C", "(Lcom/google/android/material/tabs/TabLayout$f;)V", "", "position", "i1", "(I)V", "n1", "q", "I", "walkthroughCount", "r", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class AppWalkThroughView extends WalkThroughView {

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: s, reason: collision with root package name */
    public static final int f120438s = 8;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final int walkthroughCount = Tn.a.a().size();

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/meijer/mobile/widget/AppWalkThroughView$a;", "", "<init>", "()V", "Lcom/meijer/mobile/core/design/widget/howTo/WalkThroughType;", "walkThroughType", "", "forceShow", "fromSectionWalkthrough", "Lcom/meijer/mobile/widget/AppWalkThroughView;", "a", "(Lcom/meijer/mobile/core/design/widget/howTo/WalkThroughType;ZZ)Lcom/meijer/mobile/widget/AppWalkThroughView;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.widget.AppWalkThroughView$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AppWalkThroughView a(WalkThroughType walkThroughType, boolean forceShow, boolean fromSectionWalkthrough) {
            Intrinsics.j(walkThroughType, "walkThroughType");
            AppWalkThroughView appWalkThroughView = new AppWalkThroughView();
            appWalkThroughView.setArguments(WalkThroughView.INSTANCE.a(walkThroughType, forceShow, fromSectionWalkthrough, true, false));
            return appWalkThroughView;
        }
    }

    private final void u1(TabLayout tabs) {
        if (tabs == null || this.walkthroughCount != tabs.getTabCount()) {
            return;
        }
        int tabCount = tabs.getTabCount();
        for (int i10 = 0; i10 < tabCount; i10++) {
            String string = getString(Tn.a.a().get(i10).getTitle());
            Intrinsics.i(string, "getString(...)");
            TabLayout.f fVarB = tabs.B(i10);
            if (fVarB != null) {
                ck.d.d(fVarB, AbstractC6392a.INSTANCE.d(Y.f100790Yh, string, Integer.valueOf(i10 + 1), Integer.valueOf(tabs.getTabCount())));
            }
        }
    }

    @Override // com.meijer.mobile.widget.WalkThroughView, com.google.android.material.tabs.TabLayout.c
    public void C(TabLayout.f tab) {
        Intrinsics.j(tab, "tab");
        super.C(tab);
        boolean z10 = tab.g() == CollectionsKt.o(Tn.a.a());
        MaterialButton nextActionButton = N0().f24444A;
        Intrinsics.i(nextActionButton, "nextActionButton");
        nextActionButton.setVisibility(!z10 ? 4 : 0);
        TextView swipeToContinue = N0().f24445B;
        Intrinsics.i(swipeToContinue, "swipeToContinue");
        swipeToContinue.setVisibility(z10 ? 4 : 0);
    }

    @Override // com.meijer.mobile.widget.WalkThroughView
    protected void n1() throws Resources.NotFoundException {
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.i(childFragmentManager, "getChildFragmentManager(...)");
        m1(new Dn.a(childFragmentManager, Tn.a.a()));
        N0().f24448E.setAdapter(Y0());
        N0().f24447D.setupWithViewPager(N0().f24448E);
    }

    @Override // com.meijer.mobile.widget.WalkThroughView, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) throws Resources.NotFoundException {
        Intrinsics.j(inflater, "inflater");
        View viewOnCreateView = super.onCreateView(inflater, container, savedInstanceState);
        u1(N0().f24447D);
        return viewOnCreateView;
    }

    @Override // com.meijer.mobile.widget.WalkThroughView
    protected void i1(int position) {
        MaterialButton nextActionButton = N0().f24444A;
        Intrinsics.i(nextActionButton, "nextActionButton");
        ck.d.g(nextActionButton, AbstractC6392a.INSTANCE.d(Cj.o.f5100z, new Object[0]));
        N0().f24444A.setTextColor(Z1.b.c(requireContext(), P.f99511g));
    }
}
