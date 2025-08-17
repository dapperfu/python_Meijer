package com.meijer.mobile.meijer.activity.coupons;

import Mn.AbstractC4227f0;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.S;
import cl.C6412d;
import com.fullstory.FS;
import com.google.android.material.appbar.MaterialToolbar;
import com.meijer.mobile.meijer.T;
import com.meijer.mobile.meijer.activity.coupons.fragment.CouponsFragment;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\u0005J\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0010\u0010\u0005R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/meijer/mobile/meijer/activity/coupons/SpecialOffersActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "Lcom/meijer/mobile/meijer/activity/coupons/fragment/CouponsFragment$b;", "LAj/b;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "", "count", "K0", "(I)V", "onBackPressed", "LMn/f0;", "s", "LMn/f0;", "binding", "LVr/e;", "t", "LVr/e;", "viewModel", "Lcl/d;", "u", "Lcl/d;", "D1", "()Lcl/d;", "setCouponsRepository", "(Lcl/d;)V", "couponsRepository", "Landroidx/appcompat/widget/Toolbar;", "v", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SpecialOffersActivity extends Hilt_SpecialOffersActivity implements CouponsFragment.b, Aj.b {

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private AbstractC4227f0 binding;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private Vr.e viewModel;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public C6412d couponsRepository;

    @Override // androidx.view.ComponentActivity, android.app.Activity
    @Deprecated
    public void onBackPressed() {
        setResult(-1);
        finishAfterTransition();
    }

    public final C6412d D1() {
        C6412d c6412d = this.couponsRepository;
        if (c6412d != null) {
            return c6412d;
        }
        Intrinsics.y("couponsRepository");
        return null;
    }

    @Override // com.meijer.mobile.meijer.activity.coupons.fragment.CouponsFragment.b
    public void K0(int count) {
        Vr.e eVar = this.viewModel;
        if (eVar == null) {
            Intrinsics.y("viewModel");
            eVar = null;
        }
        eVar.h0(count);
    }

    @Override // Aj.b
    public Toolbar v() {
        AbstractC4227f0 abstractC4227f0 = this.binding;
        if (abstractC4227f0 == null) {
            Intrinsics.y("binding");
            abstractC4227f0 = null;
        }
        MaterialToolbar toolbar = abstractC4227f0.f20591D;
        Intrinsics.i(toolbar, "toolbar");
        return toolbar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E1(SpecialOffersActivity specialOffersActivity) {
        specialOffersActivity.onBackPressed();
        return Unit.f142422a;
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC4227f0 abstractC4227f0K0 = AbstractC4227f0.K0(getLayoutInflater());
        this.binding = abstractC4227f0K0;
        Vr.e eVar = null;
        if (abstractC4227f0K0 == null) {
            Intrinsics.y("binding");
            abstractC4227f0K0 = null;
        }
        setContentView(Zr.a.j(abstractC4227f0K0.getRoot(), false, 1, null));
        String stringExtra = getIntent().getStringExtra("com.meijer.intent.extra.EXTRA_SPECIAL_OFFERS_URL");
        String stringExtra2 = getIntent().getStringExtra("com.meijer.intent.extra.EXTRA_PREVIOUS_TRACK_ACTION");
        this.viewModel = new Vr.e(stringExtra, D1());
        AbstractC4227f0 abstractC4227f0 = this.binding;
        if (abstractC4227f0 == null) {
            Intrinsics.y("binding");
            abstractC4227f0 = null;
        }
        Vr.e eVar2 = this.viewModel;
        if (eVar2 == null) {
            Intrinsics.y("viewModel");
        } else {
            eVar = eVar2;
        }
        abstractC4227f0.O0(eVar);
        A(getTitle());
        Aj.b.O0(this, 0, 0, new Function0() { // from class: com.meijer.mobile.meijer.activity.coupons.q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpecialOffersActivity.E1(this.f105441a);
            }
        }, 3, null);
        S sBeginTransaction = getSupportFragmentManager().beginTransaction();
        sBeginTransaction.r(T.f99257v1, CouponsFragment.INSTANCE.d(stringExtra2));
        sBeginTransaction.h();
    }

    @Override // com.meijer.mobile.meijer.activity.MeijerActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        FS.page("Coupons HPO").start();
    }
}
