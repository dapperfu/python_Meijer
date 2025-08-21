package com.meijer.mobile.widget;

import Nn.AbstractC4291t0;
import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.material.appbar.AppBarLayout;
import com.meijer.mobile.meijer.activity.home.legacy.viewmodel.NavBarItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0018\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/widget/HomeSearchAppBar;", "Lcom/google/android/material/appbar/AppBarLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "", "H", "(Landroid/util/AttributeSet;I)V", "Lcom/meijer/mobile/meijer/activity/home/legacy/viewmodel/NavBarItem;", "navBarItem", "setData", "(Lcom/meijer/mobile/meijer/activity/home/legacy/viewmodel/NavBarItem;)V", "LNn/t0;", "A", "LNn/t0;", "binding", "Landroidx/compose/ui/platform/ComposeView;", "getFulfillmentBar", "()Landroidx/compose/ui/platform/ComposeView;", "fulfillmentBar", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class HomeSearchAppBar extends AppBarLayout {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private AbstractC4291t0 binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeSearchAppBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.j(context, "context");
        I(this, attributeSet, 0, 2, null);
    }

    static /* synthetic */ void I(HomeSearchAppBar homeSearchAppBar, AttributeSet attributeSet, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        homeSearchAppBar.H(attributeSet, i10);
    }

    public final ComposeView getFulfillmentBar() {
        AbstractC4291t0 abstractC4291t0 = this.binding;
        if (abstractC4291t0 == null) {
            Intrinsics.x("binding");
            abstractC4291t0 = null;
        }
        ComposeView fulfillmentBarContainer = abstractC4291t0.f22296B;
        Intrinsics.i(fulfillmentBarContainer, "fulfillmentBarContainer");
        return fulfillmentBarContainer;
    }

    public final void setData(NavBarItem navBarItem) {
        AbstractC4291t0 abstractC4291t0 = this.binding;
        if (abstractC4291t0 == null) {
            Intrinsics.x("binding");
            abstractC4291t0 = null;
        }
        abstractC4291t0.O0(navBarItem);
    }

    private final void H(AttributeSet attrs, int defStyleAttr) {
        AbstractC4291t0 abstractC4291t0M0 = AbstractC4291t0.M0(ej.c.b(this), this, true);
        this.binding = abstractC4291t0M0;
        if (abstractC4291t0M0 == null) {
            Intrinsics.x("binding");
            abstractC4291t0M0 = null;
        }
        Zr.a.g(abstractC4291t0M0.f22297C, false, 1, null);
    }
}
