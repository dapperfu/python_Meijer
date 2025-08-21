package com.meijer.mobile.meijer.activity.coupons;

import Nn.AbstractC4232f0;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.S;
import com.fullstory.FS;
import com.google.android.material.appbar.MaterialToolbar;
import com.meijer.mobile.meijer.T;
import com.meijer.mobile.meijer.activity.coupons.fragment.CouponsFragment;
import dl.C13702d;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\u0005J\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0010\u0010\u0005R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/meijer/mobile/meijer/activity/coupons/SpecialOffersActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "Lcom/meijer/mobile/meijer/activity/coupons/fragment/CouponsFragment$b;", "LBj/b;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "", "count", "L0", "(I)V", "onBackPressed", "LNn/f0;", "s", "LNn/f0;", "binding", "LVr/e;", "t", "LVr/e;", "viewModel", "Ldl/d;", "u", "Ldl/d;", "D1", "()Ldl/d;", "setCouponsRepository", "(Ldl/d;)V", "couponsRepository", "Landroidx/appcompat/widget/Toolbar;", "y", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SpecialOffersActivity extends Hilt_SpecialOffersActivity implements CouponsFragment.b, Bj.b {

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private AbstractC4232f0 binding;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private Vr.e viewModel;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public C13702d couponsRepository;

    @Override // androidx.view.ComponentActivity, android.app.Activity
    @Deprecated
    public void onBackPressed() {
        setResult(-1);
        finishAfterTransition();
    }

    public final C13702d D1() {
        C13702d c13702d = this.couponsRepository;
        if (c13702d != null) {
            return c13702d;
        }
        Intrinsics.x("couponsRepository");
        return null;
    }

    @Override // com.meijer.mobile.meijer.activity.coupons.fragment.CouponsFragment.b
    public void L0(int count) {
        Vr.e eVar = this.viewModel;
        if (eVar == null) {
            Intrinsics.x("viewModel");
            eVar = null;
        }
        eVar.h0(count);
    }

    @Override // Bj.b
    public Toolbar y() {
        AbstractC4232f0 abstractC4232f0 = this.binding;
        if (abstractC4232f0 == null) {
            Intrinsics.x("binding");
            abstractC4232f0 = null;
        }
        MaterialToolbar toolbar = abstractC4232f0.f21923D;
        Intrinsics.i(toolbar, "toolbar");
        return toolbar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E1(SpecialOffersActivity specialOffersActivity) {
        specialOffersActivity.onBackPressed();
        return Unit.f143329a;
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC4232f0 abstractC4232f0M0 = AbstractC4232f0.M0(getLayoutInflater());
        this.binding = abstractC4232f0M0;
        Vr.e eVar = null;
        if (abstractC4232f0M0 == null) {
            Intrinsics.x("binding");
            abstractC4232f0M0 = null;
        }
        setContentView(Zr.a.j(abstractC4232f0M0.getRoot(), false, 1, null));
        String stringExtra = getIntent().getStringExtra("com.meijer.intent.extra.EXTRA_SPECIAL_OFFERS_URL");
        String stringExtra2 = getIntent().getStringExtra("com.meijer.intent.extra.EXTRA_PREVIOUS_TRACK_ACTION");
        this.viewModel = new Vr.e(stringExtra, D1());
        AbstractC4232f0 abstractC4232f0 = this.binding;
        if (abstractC4232f0 == null) {
            Intrinsics.x("binding");
            abstractC4232f0 = null;
        }
        Vr.e eVar2 = this.viewModel;
        if (eVar2 == null) {
            Intrinsics.x("viewModel");
        } else {
            eVar = eVar2;
        }
        abstractC4232f0.O0(eVar);
        C(getTitle());
        Bj.b.o(this, 0, 0, new Function0() { // from class: com.meijer.mobile.meijer.activity.coupons.q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpecialOffersActivity.E1(this.f106296a);
            }
        }, 3, null);
        S sBeginTransaction = getSupportFragmentManager().beginTransaction();
        sBeginTransaction.r(T.f100113v1, CouponsFragment.INSTANCE.d(stringExtra2));
        sBeginTransaction.h();
    }

    @Override // com.meijer.mobile.meijer.activity.MeijerActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        FS.page("Coupons HPO").start();
    }
}
