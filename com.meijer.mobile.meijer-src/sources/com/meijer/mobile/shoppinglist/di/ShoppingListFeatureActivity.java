package com.meijer.mobile.shoppinglist.di;

import android.content.Intent;
import android.os.Bundle;
import hi.InterfaceC14523a;
import ii.AbstractC14762i;
import ii.C14756c;
import ii.TrackingData;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yo.k;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b!\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003R\"\u0010\r\u001a\u00020\u00068\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0015\u001a\u00020\u000e8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcom/meijer/mobile/shoppinglist/di/ShoppingListFeatureActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "", "onResume", "Lyo/k;", "v", "Lyo/k;", "t1", "()Lyo/k;", "setUserManager$shoppinglist_release", "(Lyo/k;)V", "userManager", "Lzl/k;", "w", "Lzl/k;", "s1", "()Lzl/k;", "setFeatureManager$shoppinglist_release", "(Lzl/k;)V", "featureManager", "LBl/g;", "x", "LBl/g;", "getFeatureEntryPoint", "()LBl/g;", "setFeatureEntryPoint", "(LBl/g;)V", "featureEntryPoint", "Lhi/a;", "y", "Lhi/a;", "getAnalyticsEngine", "()Lhi/a;", "setAnalyticsEngine", "(Lhi/a;)V", "analyticsEngine", "shoppinglist_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class ShoppingListFeatureActivity extends Hilt_ShoppingListFeatureActivity {

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public k userManager;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public zl.k featureManager;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public Bl.g featureEntryPoint;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public InterfaceC14523a analyticsEngine;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u1(List list, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.d(list);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v1(List list, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.d(list);
        track.h("action", "1");
        return Unit.f143329a;
    }

    public final InterfaceC14523a getAnalyticsEngine() {
        InterfaceC14523a interfaceC14523a = this.analyticsEngine;
        if (interfaceC14523a != null) {
            return interfaceC14523a;
        }
        Intrinsics.x("analyticsEngine");
        return null;
    }

    public final Bl.g getFeatureEntryPoint() {
        Bl.g gVar = this.featureEntryPoint;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.x("featureEntryPoint");
        return null;
    }

    public final zl.k s1() {
        zl.k kVar = this.featureManager;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.x("featureManager");
        return null;
    }

    public final k t1() {
        k kVar = this.userManager;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.x("userManager");
        return null;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        Bundle extras = getIntent().getExtras();
        if (extras != null && extras.containsKey("adobe_push_notification_data_broadlogid_extra") && extras.containsKey("adobe_push_notification_data_deliveryid_extra")) {
            final List<AbstractC14762i.Extra> listU = getFeatureEntryPoint().u(extras);
            getAnalyticsEngine().b(C14756c.a("event: tracking"), new Function1() { // from class: com.meijer.mobile.shoppinglist.di.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ShoppingListFeatureActivity.u1(listU, (TrackingData) obj);
                }
            });
            getAnalyticsEngine().b(C14756c.a("event: tracking"), new Function1() { // from class: com.meijer.mobile.shoppinglist.di.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ShoppingListFeatureActivity.v1(listU, (TrackingData) obj);
                }
            });
            Intent intent = getIntent();
            intent.removeExtra("adobe_push_notification_data_broadlogid_extra");
            intent.removeExtra("adobe_push_notification_data_deliveryid_extra");
        }
    }
}
