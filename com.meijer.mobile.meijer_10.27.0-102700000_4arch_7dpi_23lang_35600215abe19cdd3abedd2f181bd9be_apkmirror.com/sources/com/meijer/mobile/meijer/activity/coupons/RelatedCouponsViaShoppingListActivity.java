package com.meijer.mobile.meijer.activity.coupons;

import Mn.AbstractC4217d0;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.S;
import com.google.android.material.appbar.MaterialToolbar;
import com.meijer.mobile.meijer.T;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import com.meijer.mobile.meijer.activity.coupons.fragment.CouponsFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/meijer/mobile/meijer/activity/coupons/RelatedCouponsViaShoppingListActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "LAj/b;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "LMn/d0;", "r", "LMn/d0;", "D1", "()LMn/d0;", "F1", "(LMn/d0;)V", "binding", "Landroidx/appcompat/widget/Toolbar;", "v", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RelatedCouponsViaShoppingListActivity extends MeijerActivity implements Aj.b {

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public AbstractC4217d0 binding;

    public final AbstractC4217d0 D1() {
        AbstractC4217d0 abstractC4217d0 = this.binding;
        if (abstractC4217d0 != null) {
            return abstractC4217d0;
        }
        Intrinsics.y("binding");
        return null;
    }

    public final void F1(AbstractC4217d0 abstractC4217d0) {
        Intrinsics.j(abstractC4217d0, "<set-?>");
        this.binding = abstractC4217d0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E1(RelatedCouponsViaShoppingListActivity relatedCouponsViaShoppingListActivity) {
        if (!relatedCouponsViaShoppingListActivity.onNavigateUp()) {
            relatedCouponsViaShoppingListActivity.finish();
        }
        return Unit.f142422a;
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        F1(AbstractC4217d0.K0(getLayoutInflater()));
        setContentView(Zr.a.j(D1().getRoot(), false, 1, null));
        Aj.b.O0(this, 0, 0, new Function0() { // from class: com.meijer.mobile.meijer.activity.coupons.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RelatedCouponsViaShoppingListActivity.E1(this.f105440a);
            }
        }, 3, null);
        S sBeginTransaction = getSupportFragmentManager().beginTransaction();
        sBeginTransaction.r(T.f98927Q2, CouponsFragment.INSTANCE.c());
        sBeginTransaction.h();
    }

    @Override // Aj.b
    public Toolbar v() {
        MaterialToolbar appBar = D1().f20514z;
        Intrinsics.i(appBar, "appBar");
        return appBar;
    }
}
