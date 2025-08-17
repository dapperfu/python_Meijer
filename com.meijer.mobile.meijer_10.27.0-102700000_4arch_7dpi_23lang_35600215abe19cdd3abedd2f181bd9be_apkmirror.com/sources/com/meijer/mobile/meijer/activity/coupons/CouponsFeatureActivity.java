package com.meijer.mobile.meijer.activity.coupons;

import Mn.AbstractC4258m;
import Rk.CouponOptions;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MenuItem;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.MaterialToolbar;
import com.meijer.mobile.meijer.S;
import com.meijer.mobile.meijer.T;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import com.meijer.mobile.meijer.activity.coupons.fragment.CouponsFragment;
import dk.C13530b;
import java.io.Serializable;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u0004J\u0017\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\u0013\u0010\u0004R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/meijer/mobile/meijer/activity/coupons/CouponsFeatureActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "LAj/b;", "<init>", "()V", "", "isFinished", "", "E1", "(Z)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "finish", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "onBackPressed", "LMn/m;", "r", "LMn/m;", "binding", "LPk/c;", "s", "LPk/c;", "pageType", "Landroidx/appcompat/widget/Toolbar;", "v", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class CouponsFeatureActivity extends MeijerActivity implements Aj.b {

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private AbstractC4258m binding;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private Pk.c pageType;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Pk.c.values().length];
            try {
                iArr[Pk.c.f28338n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Pk.c.f28333i.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Pk.c.f28335k.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Pk.c.f28334j.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void E1(boolean r8) {
        /*
            r7 = this;
            Pk.c r1 = r7.pageType
            if (r1 != 0) goto La
            java.lang.String r1 = "pageType"
            kotlin.jvm.internal.Intrinsics.y(r1)
            r1 = 0
        La:
            Pk.c r2 = Pk.c.f28334j
            if (r1 == r2) goto L1c
            android.content.Intent r1 = r7.getIntent()
            java.lang.String r2 = "com.meijer.intent.extra.OVERRIDE_TRANSITION"
            r3 = 1
            boolean r1 = r1.getBooleanExtra(r2, r3)
            if (r1 == 0) goto L1c
            goto L1d
        L1c:
            r3 = 0
        L1d:
            if (r8 == 0) goto L2e
            if (r3 == 0) goto L2e
            int r3 = Bj.d.f2595d
            r5 = 8
            r6 = 0
            r1 = 1
            r2 = 0
            r4 = 0
            r0 = r7
            bk.c.b(r0, r1, r2, r3, r4, r5, r6)
            return
        L2e:
            if (r3 == 0) goto L3d
            int r2 = com.meijer.mobile.meijer.M.f98602d
            int r3 = Al.m.f674a
            r5 = 8
            r6 = 0
            r1 = 0
            r4 = 0
            r0 = r7
            bk.c.b(r0, r1, r2, r3, r4, r5, r6)
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.coupons.CouponsFeatureActivity.E1(boolean):void");
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) throws Resources.NotFoundException {
        Object serializableExtra;
        Object obj;
        Pk.c cVar;
        String string;
        super.onCreate(savedInstanceState);
        AbstractC4258m abstractC4258mK0 = AbstractC4258m.K0(getLayoutInflater());
        this.binding = abstractC4258mK0;
        Pk.c cVar2 = null;
        if (abstractC4258mK0 == null) {
            Intrinsics.y("binding");
            abstractC4258mK0 = null;
        }
        setContentView(Zr.a.j(abstractC4258mK0.getRoot(), false, 1, null));
        Intent intent = getIntent();
        Intrinsics.i(intent, "getIntent(...)");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            serializableExtra = intent.getSerializableExtra("com.meijer.intent.extra.EXTRA_COUPON_ACTIVE_PAGE", Pk.c.class);
        } else {
            Serializable serializableExtra2 = intent.getSerializableExtra("com.meijer.intent.extra.EXTRA_COUPON_ACTIVE_PAGE");
            if (!(serializableExtra2 instanceof Pk.c)) {
                serializableExtra2 = null;
            }
            serializableExtra = (Pk.c) serializableExtra2;
        }
        Intrinsics.g(serializableExtra);
        this.pageType = (Pk.c) serializableExtra;
        Intent intent2 = getIntent();
        Intrinsics.i(intent2, "getIntent(...)");
        if (i10 >= 33) {
            obj = (Parcelable) intent2.getParcelableExtra("com.meijer.intent.extra.EXTRA_COUPON_OPTIONS", CouponOptions.class);
        } else {
            Parcelable parcelableExtra = intent2.getParcelableExtra("com.meijer.intent.extra.EXTRA_COUPON_OPTIONS");
            if (!(parcelableExtra instanceof CouponOptions)) {
                parcelableExtra = null;
            }
            obj = (CouponOptions) parcelableExtra;
        }
        Intrinsics.g(obj);
        CouponOptions couponOptions = (CouponOptions) obj;
        Pk.c cVar3 = this.pageType;
        if (cVar3 == null) {
            Intrinsics.y("pageType");
            cVar3 = null;
        }
        int i11 = a.$EnumSwitchMapping$0[cVar3.ordinal()];
        if (i11 == 1) {
            String string2 = getResources().getString(Nr.g.f22719Z);
            Intrinsics.i(string2, "getString(...)");
            A(string2);
            Aj.b.O0(this, S.f98708X, 0, new Function0() { // from class: com.meijer.mobile.meijer.activity.coupons.m
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CouponsFeatureActivity.F1(this.f105438a);
                }
            }, 2, null);
        } else if (i11 == 2 || i11 == 3) {
            Pk.c cVar4 = this.pageType;
            if (cVar4 == null) {
                Intrinsics.y("pageType");
                cVar4 = null;
            }
            if (cVar4 == Pk.c.f28335k) {
                string = couponOptions.getBundleName();
                if (string.length() == 0) {
                    string = getResources().getString(Nr.g.f22704K);
                    Intrinsics.i(string, "getString(...)");
                }
            } else {
                string = getResources().getString(Nr.g.f22721a0);
                Intrinsics.g(string);
            }
            AbstractC4258m abstractC4258m = this.binding;
            if (abstractC4258m == null) {
                Intrinsics.y("binding");
                abstractC4258m = null;
            }
            abstractC4258m.f20787B.setVisibility(8);
            A(string);
            Aj.b.O0(this, Bj.i.f2765n0, 0, new Function0() { // from class: com.meijer.mobile.meijer.activity.coupons.n
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CouponsFeatureActivity.G1(this.f105439a);
                }
            }, 2, null);
        } else if (i11 == 4) {
            AbstractC4258m abstractC4258m2 = this.binding;
            if (abstractC4258m2 == null) {
                Intrinsics.y("binding");
                abstractC4258m2 = null;
            }
            abstractC4258m2.f20787B.setVisibility(0);
            AbstractC4258m abstractC4258m3 = this.binding;
            if (abstractC4258m3 == null) {
                Intrinsics.y("binding");
                abstractC4258m3 = null;
            }
            abstractC4258m3.f20788z.setVisibility(8);
            Bundle extras = getIntent().getExtras();
            String string3 = extras != null ? extras.getString("com.meijer.intent.extra.EXTRA_COUPON_AD_PAGE_URL") : null;
            AbstractC4258m abstractC4258m4 = this.binding;
            if (abstractC4258m4 == null) {
                Intrinsics.y("binding");
                abstractC4258m4 = null;
            }
            ImageView headerBanner = abstractC4258m4.f20787B;
            Intrinsics.i(headerBanner, "headerBanner");
            C13530b.f(headerBanner, string3, null, null, 6, null);
            Bundle extras2 = getIntent().getExtras();
            String string4 = extras2 != null ? extras2.getString("com.meijer.intent.extra.EXTRA_COUPON_AD_PAGE_TITLE") : null;
            Bundle extras3 = getIntent().getExtras();
            String string5 = extras3 != null ? extras3.getString("com.meijer.intent.extra.EXTRA_COUPON_AD_PAGE_DESCRIPTION") : null;
            AbstractC4258m abstractC4258m5 = this.binding;
            if (abstractC4258m5 == null) {
                Intrinsics.y("binding");
                abstractC4258m5 = null;
            }
            ImageView imageView = abstractC4258m5.f20787B;
            if (string5 != null) {
                string4 = string5;
            }
            imageView.setContentDescription(string4);
        }
        E1(false);
        androidx.fragment.app.S sBeginTransaction = getSupportFragmentManager().beginTransaction();
        int i12 = T.f98927Q2;
        CouponsFragment.Companion companion = CouponsFragment.INSTANCE;
        Pk.c cVar5 = this.pageType;
        if (cVar5 == null) {
            Intrinsics.y("pageType");
            cVar = null;
        } else {
            cVar = cVar5;
        }
        CouponsFragment couponsFragmentB = CouponsFragment.Companion.b(companion, cVar, couponOptions, null, 4, null);
        Pk.c cVar6 = this.pageType;
        if (cVar6 == null) {
            Intrinsics.y("pageType");
        } else {
            cVar2 = cVar6;
        }
        sBeginTransaction.s(i12, couponsFragmentB, cVar2.name());
        sBeginTransaction.h();
    }

    @Override // com.meijer.mobile.meijer.activity.MeijerActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.j(item, "item");
        if (item.getItemId() != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        onBackPressed();
        return true;
    }

    @Override // Aj.b
    public Toolbar v() {
        AbstractC4258m abstractC4258m = this.binding;
        if (abstractC4258m == null) {
            Intrinsics.y("binding");
            abstractC4258m = null;
        }
        MaterialToolbar appBar = abstractC4258m.f20788z;
        Intrinsics.i(appBar, "appBar");
        return appBar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F1(CouponsFeatureActivity couponsFeatureActivity) {
        if (!couponsFeatureActivity.onNavigateUp()) {
            couponsFeatureActivity.finish();
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G1(CouponsFeatureActivity couponsFeatureActivity) {
        if (!couponsFeatureActivity.onNavigateUp()) {
            couponsFeatureActivity.finish();
        }
        return Unit.f142422a;
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        E1(true);
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    @Deprecated
    public void onBackPressed() {
        Bundle extras = getIntent().getExtras();
        if (extras != null && extras.containsKey("com.meijer.intent.extra.EXTRA_COUPON_IS_LAUNCHED_FROM_DEEPLINK") && extras.getBoolean("com.meijer.intent.extra.EXTRA_COUPON_IS_LAUNCHED_FROM_DEEPLINK")) {
            startActivity(Cl.e.j(getMeijerIntent(), this, Pk.c.f28328d, false, false, 0, 28, null));
            finish();
        } else {
            setResult(-1);
            super.onBackPressed();
        }
    }
}
