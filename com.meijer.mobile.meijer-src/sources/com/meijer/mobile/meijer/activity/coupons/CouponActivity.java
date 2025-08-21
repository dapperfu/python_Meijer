package com.meijer.mobile.meijer.activity.coupons;

import Nn.AbstractC4255k;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.view.F;
import androidx.view.I;
import com.fullstory.FS;
import com.fullstory.FSPage;
import com.google.android.material.tabs.TabLayout;
import com.meijer.mobile.meijer.T;
import com.meijer.mobile.meijer.activity.coupons.fragment.CouponsFragment;
import ii.C14756c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ps.d0;
import zl.AbstractC18503f;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0011\u0010\u0005J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0012\u0010\fJ\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R$\u0010+\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130(0'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001c\u00100\u001a\n -*\u0004\u0018\u00010,0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u0013018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Lcom/meijer/mobile/meijer/activity/coupons/CouponActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "Lcom/meijer/mobile/meijer/activity/coupons/o;", "Lcom/meijer/mobile/meijer/activity/coupons/fragment/CouponsFragment$b;", "<init>", "()V", "", "N1", "M1", "Landroid/content/Intent;", "intent", "G1", "(Landroid/content/Intent;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "onNewIntent", "Landroidx/fragment/app/Fragment;", "fragment", "onAttachFragment", "(Landroidx/fragment/app/Fragment;)V", "", "count", "L0", "(I)V", "LTq/j;", "s", "LTq/j;", "H1", "()LTq/j;", "setStoreProvider", "(LTq/j;)V", "storeProvider", "LNn/k;", "t", "LNn/k;", "binding", "", "Ljava/lang/ref/WeakReference;", "u", "Ljava/util/List;", "fragList", "Lcom/fullstory/FSPage;", "kotlin.jvm.PlatformType", "v", "Lcom/fullstory/FSPage;", "fsPage", "", "I", "()Ljava/util/List;", "activeFragments", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class CouponActivity extends Hilt_CouponActivity implements o, CouponsFragment.b {

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public Tq.j storeProvider;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private AbstractC4255k binding;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private List<WeakReference<Fragment>> fragList = new ArrayList();

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final FSPage fsPage = FS.page("Coupons Home Page");

    private final void G1(Intent intent) throws Resources.NotFoundException {
        Object serializableExtra;
        Qk.c cVar = Qk.c.f31040d;
        AbstractC4255k abstractC4255k = null;
        if (intent.hasExtra("com.meijer.intent.extra.COUPONS_DEFAULT_TAB")) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializableExtra = intent.getSerializableExtra("com.meijer.intent.extra.COUPONS_DEFAULT_TAB", Qk.c.class);
            } else {
                Object serializableExtra2 = intent.getSerializableExtra("com.meijer.intent.extra.COUPONS_DEFAULT_TAB");
                if (!(serializableExtra2 instanceof Qk.c)) {
                    serializableExtra2 = null;
                }
                serializableExtra = (Qk.c) serializableExtra2;
            }
            Intrinsics.g(serializableExtra);
            cVar = (Qk.c) serializableExtra;
        }
        AbstractC4255k abstractC4255k2 = this.binding;
        if (abstractC4255k2 == null) {
            Intrinsics.x("binding");
        } else {
            abstractC4255k = abstractC4255k2;
        }
        abstractC4255k.f22079C.setCurrentItem(cVar.ordinal());
        this.fsPage.updateProperties(MapsKt.g(TuplesKt.a("coupon_tab", cVar.getTrackingName())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L1(CouponActivity couponActivity, F addCallback) {
        Intrinsics.j(addCallback, "$this$addCallback");
        couponActivity.finish();
        ck.c.b(couponActivity, 1, 0, Bl.m.f3134c, 0, 8, null);
        return Unit.f143329a;
    }

    public final Tq.j H1() {
        Tq.j jVar = this.storeProvider;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.x("storeProvider");
        return null;
    }

    @Override // com.meijer.mobile.meijer.activity.coupons.o
    public List<Fragment> I() {
        ArrayList arrayList = new ArrayList();
        Iterator<WeakReference<Fragment>> it = this.fragList.iterator();
        while (it.hasNext()) {
            Fragment fragment = it.next().get();
            if (fragment != null) {
                arrayList.add(fragment);
            }
        }
        return arrayList;
    }

    @Override // com.meijer.mobile.meijer.activity.coupons.fragment.CouponsFragment.b
    public void L0(int count) {
        AbstractC4255k abstractC4255k = this.binding;
        if (abstractC4255k == null) {
            Intrinsics.x("binding");
            abstractC4255k = null;
        }
        androidx.viewpager.widget.a adapter = abstractC4255k.f22079C.getAdapter();
        if (adapter != null) {
            adapter.j();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity
    @Deprecated
    public void onAttachFragment(Fragment fragment) {
        Intrinsics.j(fragment, "fragment");
        this.fragList.add(new WeakReference<>(fragment));
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) throws Resources.NotFoundException {
        Intrinsics.j(intent, "intent");
        super.onNewIntent(intent);
        G1(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I1(CouponActivity couponActivity, View view) {
        couponActivity.N1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J1(CouponActivity couponActivity, View view) {
        couponActivity.M1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K1(CouponActivity couponActivity, View view) {
        couponActivity.N1();
    }

    private final void M1() {
        if (!H1().d()) {
            new Cl.a(this).g();
        } else if (getFeatureManager().e(AbstractC18503f.t0.f172905h)) {
            startActivity(Bl.h.d(this, true));
        } else {
            startActivity(Bl.h.h(this, true));
        }
    }

    private final void N1() {
        getAnalyticsEngine().h(C14756c.a("event: coupons: search icon"), C14756c.c("coupons"), C14756c.g("coupons"));
        if (!H1().d()) {
            new Cl.a(this).g();
        } else if (getFeatureManager().e(AbstractC18503f.t0.f172905h)) {
            startActivity(Bl.h.c(this, Pp.b.f26239b, null, null, false, null, 60, null));
        } else {
            startActivity(Bl.h.g(this, Pp.b.f26239b, null, null, false, null, 60, null));
        }
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) throws Resources.NotFoundException {
        d0 d0VarI0;
        super.onCreate(savedInstanceState);
        AbstractC4255k abstractC4255kM0 = AbstractC4255k.M0(getLayoutInflater());
        this.binding = abstractC4255kM0;
        if (abstractC4255kM0 == null) {
            Intrinsics.x("binding");
            abstractC4255kM0 = null;
        }
        setContentView(Zr.a.j(abstractC4255kM0.getRoot(), false, 1, null));
        AbstractC4255k abstractC4255k = this.binding;
        if (abstractC4255k == null) {
            Intrinsics.x("binding");
            abstractC4255k = null;
        }
        abstractC4255k.f22084H.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.coupons.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CouponActivity.I1(this.f106241a, view);
            }
        });
        AbstractC4255k abstractC4255k2 = this.binding;
        if (abstractC4255k2 == null) {
            Intrinsics.x("binding");
            abstractC4255k2 = null;
        }
        abstractC4255k2.f22081E.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.coupons.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CouponActivity.J1(this.f106242a, view);
            }
        });
        AbstractC4255k abstractC4255k3 = this.binding;
        if (abstractC4255k3 == null) {
            Intrinsics.x("binding");
            abstractC4255k3 = null;
        }
        abstractC4255k3.f22083G.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.coupons.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CouponActivity.K1(this.f106243a, view);
            }
        });
        d0 navigationHelper = getNavigationHelper();
        if (navigationHelper != null && (d0VarI0 = navigationHelper.i0(536871032)) != null) {
            d0VarI0.G(Nr.g.f22660K);
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.i(supportFragmentManager, "getSupportFragmentManager(...)");
        com.meijer.mobile.meijer.activity.coupons.fragment.a aVar = new com.meijer.mobile.meijer.activity.coupons.fragment.a(this, supportFragmentManager);
        AbstractC4255k abstractC4255k4 = this.binding;
        if (abstractC4255k4 == null) {
            Intrinsics.x("binding");
            abstractC4255k4 = null;
        }
        abstractC4255k4.f22079C.setAdapter(aVar);
        AbstractC4255k abstractC4255k5 = this.binding;
        if (abstractC4255k5 == null) {
            Intrinsics.x("binding");
            abstractC4255k5 = null;
        }
        TabLayout tabLayout = abstractC4255k5.f22078B;
        AbstractC4255k abstractC4255k6 = this.binding;
        if (abstractC4255k6 == null) {
            Intrinsics.x("binding");
            abstractC4255k6 = null;
        }
        tabLayout.setupWithViewPager(abstractC4255k6.f22079C);
        Intent intent = getIntent();
        Intrinsics.i(intent, "getIntent(...)");
        G1(intent);
        Zr.a.j(findViewById(T.f100006l4), false, 1, null);
        I.b(getOnBackPressedDispatcher(), null, false, new Function1() { // from class: com.meijer.mobile.meijer.activity.coupons.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CouponActivity.L1(this.f106244a, (F) obj);
            }
        }, 3, null);
    }

    @Override // com.meijer.mobile.meijer.activity.MeijerActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.fsPage.start();
    }
}
