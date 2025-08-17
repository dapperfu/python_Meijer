package com.meijer.mobile.meijer.activity.shoppinglist;

import Fq.ShoppingListItem;
import Gn.g0;
import Js.WeeklyAdItem;
import Mn.Z;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.S;
import com.fullstory.FS;
import com.google.android.material.appbar.MaterialToolbar;
import com.meijer.mobile.meijer.T;
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.meijer.activity.shoppinglist.fragment.ShoppingListAuthenticatedFragment;
import com.meijer.mobile.meijer.activity.shoppinglist.fragment.ShoppingListUnauthenticatedFragment;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import hi.C14476c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ps.d0;
import yl.AbstractC18227f;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 02\u00020\u00012\u00020\u0002:\u00011B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u0019\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010#\u001a\u00020\u001f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010\u0004\u001a\u0004\b \u0010!R\u0011\u0010'\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010+\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0011\u0010/\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00062"}, d2 = {"Lcom/meijer/mobile/meijer/activity/shoppinglist/LegacyShoppingListActivity;", "Lcom/meijer/mobile/meijer/activity/shoppinglist/ShoppingListBaseActivity;", "LGn/g0$c;", "<init>", "()V", "", "I1", "K1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "", "hasNetworkConnection", "()Z", "", "LFq/c;", "shoppingList", "C", "(Ljava/util/List;)V", "Lcom/meijer/mobile/meijer/activity/shoppinglist/fragment/ShoppingListAuthenticatedFragment;", "w", "Lcom/meijer/mobile/meijer/activity/shoppinglist/fragment/ShoppingListAuthenticatedFragment;", "listAuthenticatedFragment", "LMn/Z;", "x", "LMn/Z;", "binding", "y", "Ljava/util/List;", "Landroid/widget/EditText;", "F1", "()Landroid/widget/EditText;", "getAddItemEditText$annotations", "addItemEditText", "Landroidx/constraintlayout/widget/Group;", "H1", "()Landroidx/constraintlayout/widget/Group;", "relatedCouponButtonContainer", "Landroidx/constraintlayout/widget/ConstraintLayout;", "E1", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "addItemBar", "Lcom/google/android/material/appbar/MaterialToolbar;", "G1", "()Lcom/google/android/material/appbar/MaterialToolbar;", "appBar", "z", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class LegacyShoppingListActivity extends Hilt_LegacyShoppingListActivity implements g0.c {

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private ShoppingListAuthenticatedFragment listAuthenticatedFragment;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private Z binding;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private List<ShoppingListItem> shoppingList;

    /* renamed from: A, reason: collision with root package name */
    public static final int f112364A = 8;

    @Override // Gn.g0.c
    public void C(List<ShoppingListItem> shoppingList) {
        Intrinsics.j(shoppingList, "shoppingList");
        this.shoppingList = shoppingList;
    }

    public final ConstraintLayout E1() {
        Z z10 = this.binding;
        if (z10 == null) {
            Intrinsics.y("binding");
            z10 = null;
        }
        ConstraintLayout addItemBar = z10.f20418A;
        Intrinsics.i(addItemBar, "addItemBar");
        return addItemBar;
    }

    public final EditText F1() {
        Z z10 = this.binding;
        if (z10 == null) {
            Intrinsics.y("binding");
            z10 = null;
        }
        EditText addItem = z10.f20431z;
        Intrinsics.i(addItem, "addItem");
        return addItem;
    }

    public final MaterialToolbar G1() {
        Z z10 = this.binding;
        if (z10 == null) {
            Intrinsics.y("binding");
            z10 = null;
        }
        MaterialToolbar appBar = z10.f20420C;
        Intrinsics.i(appBar, "appBar");
        return appBar;
    }

    public final Group H1() {
        Z z10 = this.binding;
        if (z10 == null) {
            Intrinsics.y("binding");
            z10 = null;
        }
        Group relatedCouponButtonContainer = z10.f20424G;
        Intrinsics.i(relatedCouponButtonContainer, "relatedCouponButtonContainer");
        return relatedCouponButtonContainer;
    }

    private final void I1() {
        if (getIntent().getBooleanExtra("com.meijer.intent.extra.SHOPPING_LIST_FROM_SHOP_AND_SCAN", false)) {
            d0 navigationHelper = getNavigationHelper();
            Intrinsics.g(navigationHelper);
            navigationHelper.j0();
        } else {
            d0 navigationHelper2 = getNavigationHelper();
            Intrinsics.g(navigationHelper2);
            navigationHelper2.i0(HttpResponseStatus.SUCCESS_OK);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J1(LegacyShoppingListActivity legacyShoppingListActivity, View view) {
        legacyShoppingListActivity.K1();
    }

    private final void K1() {
        getAnalyticsEngine().b(C14476c.a("event: shopping list: related coupons"), C14476c.c("Shopping List"), C14476c.g("shopping list"));
        boolean zE = getFeatureManager().e(AbstractC18227f.M.f170552h);
        List<ShoppingListItem> list = this.shoppingList;
        if (list == null) {
            Intrinsics.y("shoppingList");
            list = null;
        }
        startActivity(Al.c.c(this, zE, list));
    }

    @Override // com.meijer.mobile.meijer.activity.MeijerActivity
    public boolean hasNetworkConnection() {
        return super.hasNetworkConnection();
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Parcelable parcelable;
        Parcelable parcelable2;
        Parcelable parcelable3;
        super.onCreate(savedInstanceState);
        Z zK0 = Z.K0(getLayoutInflater());
        this.binding = zK0;
        if (zK0 == null) {
            Intrinsics.y("binding");
            zK0 = null;
        }
        setContentView(Zr.a.j(zK0.getRoot(), false, 1, null));
        Z z10 = this.binding;
        if (z10 == null) {
            Intrinsics.y("binding");
            z10 = null;
        }
        EditText addItem = z10.f20431z;
        Intrinsics.i(addItem, "addItem");
        zj.c.a(addItem, true);
        I1();
        Z z11 = this.binding;
        if (z11 == null) {
            Intrinsics.y("binding");
            z11 = null;
        }
        z11.f20426I.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.shoppinglist.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LegacyShoppingListActivity.J1(this.f112456a, view);
            }
        });
        if (getSupportFragmentManager().findFragmentByTag("shoppinglist_fragment_tag") == null) {
            if (getUserManager().b()) {
                Z z12 = this.binding;
                if (z12 == null) {
                    Intrinsics.y("binding");
                    z12 = null;
                }
                z12.f20418A.setVisibility(0);
                ShoppingListAuthenticatedFragment.Companion companion = ShoppingListAuthenticatedFragment.INSTANCE;
                Intent intent = getIntent();
                Intrinsics.i(intent, "getIntent(...)");
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 33) {
                    parcelable = (Parcelable) intent.getParcelableExtra("com.meijer.intent.extra.SHOPPING_LIST_PRODUCT", mk.f.class);
                } else {
                    Parcelable parcelableExtra = intent.getParcelableExtra("com.meijer.intent.extra.SHOPPING_LIST_PRODUCT");
                    if (!(parcelableExtra instanceof mk.f)) {
                        parcelableExtra = null;
                    }
                    parcelable = (mk.f) parcelableExtra;
                }
                mk.f fVar = (mk.f) parcelable;
                Intent intent2 = getIntent();
                Intrinsics.i(intent2, "getIntent(...)");
                if (i10 >= 33) {
                    parcelable2 = (Parcelable) intent2.getParcelableExtra("com.meijer.intent.extra.SHOPPING_LIST_COUPON", Ok.c.class);
                } else {
                    Parcelable parcelableExtra2 = intent2.getParcelableExtra("com.meijer.intent.extra.SHOPPING_LIST_COUPON");
                    if (!(parcelableExtra2 instanceof Ok.c)) {
                        parcelableExtra2 = null;
                    }
                    parcelable2 = (Ok.c) parcelableExtra2;
                }
                Ok.c cVar = (Ok.c) parcelable2;
                Intent intent3 = getIntent();
                Intrinsics.i(intent3, "getIntent(...)");
                if (i10 >= 33) {
                    parcelable3 = (Parcelable) intent3.getParcelableExtra("com.meijer.intent.extra.SHOPPING_LIST_AD", WeeklyAdItem.class);
                } else {
                    Parcelable parcelableExtra3 = intent3.getParcelableExtra("com.meijer.intent.extra.SHOPPING_LIST_AD");
                    if (!(parcelableExtra3 instanceof WeeklyAdItem)) {
                        parcelableExtra3 = null;
                    }
                    parcelable3 = (WeeklyAdItem) parcelableExtra3;
                }
                this.listAuthenticatedFragment = companion.a(fVar, cVar, (WeeklyAdItem) parcelable3);
                S sBeginTransaction = getSupportFragmentManager().beginTransaction();
                int i11 = T.f98872K7;
                ShoppingListAuthenticatedFragment shoppingListAuthenticatedFragment = this.listAuthenticatedFragment;
                if (shoppingListAuthenticatedFragment == null) {
                    Intrinsics.y("listAuthenticatedFragment");
                    shoppingListAuthenticatedFragment = null;
                }
                sBeginTransaction.s(i11, shoppingListAuthenticatedFragment, "shoppinglist_fragment_tag");
                sBeginTransaction.h();
                if (!hasNetworkConnection()) {
                    new Pj.j(this, Y.f99545Ee, new Object[0]).n().l().g();
                }
            } else {
                Z z13 = this.binding;
                if (z13 == null) {
                    Intrinsics.y("binding");
                    z13 = null;
                }
                ConstraintLayout addItemBar = z13.f20418A;
                Intrinsics.i(addItemBar, "addItemBar");
                addItemBar.setVisibility(8);
                Z z14 = this.binding;
                if (z14 == null) {
                    Intrinsics.y("binding");
                    z14 = null;
                }
                Group relatedCouponButtonContainer = z14.f20424G;
                Intrinsics.i(relatedCouponButtonContainer, "relatedCouponButtonContainer");
                relatedCouponButtonContainer.setVisibility(8);
                S sBeginTransaction2 = getSupportFragmentManager().beginTransaction();
                sBeginTransaction2.s(T.f98872K7, ShoppingListUnauthenticatedFragment.INSTANCE.a(), "shoppinglist_fragment_tag");
                sBeginTransaction2.h();
            }
        }
        Zr.a.j(findViewById(T.f99150l4), false, 1, null);
    }

    @Override // com.meijer.mobile.meijer.activity.MeijerActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        FS.page("Shopping List").start();
    }
}
