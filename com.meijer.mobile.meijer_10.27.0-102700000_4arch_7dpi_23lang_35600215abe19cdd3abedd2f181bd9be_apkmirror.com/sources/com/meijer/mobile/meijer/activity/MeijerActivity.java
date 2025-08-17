package com.meijer.mobile.meijer.activity;

import Ic.a;
import Qn.C5145i;
import Tr.CouponActionEvent;
import android.R;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.y;
import androidx.drawerlayout.widget.DrawerLayout;
import com.adobe.marketing.mobile.B;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.material.navigation.NavigationView;
import com.meijer.mobile.meijer.T;
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.serverapi.rxjava.CompletableAction;
import gi.InterfaceC14261a;
import hi.AbstractC14482i;
import hi.C14476c;
import hi.TrackingData;
import java.io.IOException;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import ps.d0;
import um.C17279b;
import vj.C17589b;
import vm.LifecycleEvent;
import wj.C17828d;
import wm.C17838h;
import yj.InterfaceC18215a;
import yl.C18223b;
import yo.C18264a;

@Metadata(d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0004J\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u001f\u0010\u0004J\u000f\u0010 \u001a\u00020\u0007H\u0014¢\u0006\u0004\b \u0010\u0004J\u000f\u0010!\u001a\u00020\u0007H\u0014¢\u0006\u0004\b!\u0010\u0004J\u0017\u0010$\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0007H\u0016¢\u0006\u0004\b&\u0010\u0004J\u000f\u0010'\u001a\u00020\u0018H\u0014¢\u0006\u0004\b'\u0010\u001aJ\u0017\u0010*\u001a\u00020\u00182\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0007H\u0016¢\u0006\u0004\b,\u0010\u0004J\r\u0010-\u001a\u00020\u0018¢\u0006\u0004\b-\u0010\u001aJ\u000f\u0010.\u001a\u00020\u0007H\u0014¢\u0006\u0004\b.\u0010\u0004R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\"\u00103\u001a\u0002028\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010:\u001a\u0002098\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010A\u001a\u00020@8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010H\u001a\u00020G8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010O\u001a\u00020N8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010V\u001a\u00020U8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\"\u0010]\u001a\u00020\\8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\"\u0010d\u001a\u00020c8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\"\u0010k\u001a\u00020j8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\"\u0010r\u001a\u00020q8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR\"\u0010y\u001a\u00020x8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R)\u0010\u0080\u0001\u001a\u00020\u007f8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R*\u0010\u0087\u0001\u001a\u00030\u0086\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001c\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008d\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001c\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u008d\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u008f\u0001R\u001c\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0091\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0019\u0010\u0094\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0019\u0010\u0096\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R#\u0010\u009d\u0001\u001a\u0005\u0018\u00010\u0098\u00018FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001¨\u0006\u009e\u0001"}, d2 = {"Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lps/d0$e;", "<init>", "()V", "LTr/a;", "couponActionEvent", "", "showCouponErrorDialog", "(LTr/a;)V", "Landroid/content/Intent;", "upIntent", "recreateTask", "(Landroid/content/Intent;)V", "onNavigateUpTo", "checkForAppUpdate", "Landroid/content/Context;", "applicationContext", "trackAdvertisingId", "(Landroid/content/Context;)V", "context", "", "getAdvertisingId", "(Landroid/content/Context;)Ljava/lang/String;", "", "shouldMonitorConnectionStatus", "()Z", "Landroid/os/Bundle;", "savedInstanceState", "onPostCreate", "(Landroid/os/Bundle;)V", "onPause", "onResume", "onResumeFragments", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onNavigationDrawerOpen", "hasNetworkConnection", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "openMeijerPlayStorePage", "anyDialogShowing", "onDestroy", "LNu/a;", "disposables", "LNu/a;", "Lyo/a;", "appPrefManager", "Lyo/a;", "getAppPrefManager", "()Lyo/a;", "setAppPrefManager", "(Lyo/a;)V", "LCk/b;", "baseBus", "LCk/b;", "getBaseBus", "()LCk/b;", "setBaseBus", "(LCk/b;)V", "Lum/b;", "appBackgroundManager", "Lum/b;", "getAppBackgroundManager", "()Lum/b;", "setAppBackgroundManager", "(Lum/b;)V", "Lyo/k;", "userManager", "Lyo/k;", "getUserManager", "()Lyo/k;", "setUserManager", "(Lyo/k;)V", "Lwm/h;", "notificationManager", "Lwm/h;", "getNotificationManager", "()Lwm/h;", "setNotificationManager", "(Lwm/h;)V", "Lwj/d;", "firebaseLoggingUtil", "Lwj/d;", "getFirebaseLoggingUtil", "()Lwj/d;", "setFirebaseLoggingUtil", "(Lwj/d;)V", "LQn/i;", "connectionChangeHelper", "LQn/i;", "getConnectionChangeHelper", "()LQn/i;", "setConnectionChangeHelper", "(LQn/i;)V", "Lyl/k;", "featureManager", "Lyl/k;", "getFeatureManager", "()Lyl/k;", "setFeatureManager", "(Lyl/k;)V", "Lyl/b;", "appUpdateConfigManager", "Lyl/b;", "getAppUpdateConfigManager", "()Lyl/b;", "setAppUpdateConfigManager", "(Lyl/b;)V", "LCl/e;", "meijerIntent", "LCl/e;", "getMeijerIntent", "()LCl/e;", "setMeijerIntent", "(LCl/e;)V", "LAl/g;", "featureEntryPoint", "LAl/g;", "getFeatureEntryPoint", "()LAl/g;", "setFeatureEntryPoint", "(LAl/g;)V", "Lgi/a;", "analyticsEngine", "Lgi/a;", "getAnalyticsEngine", "()Lgi/a;", "setAnalyticsEngine", "(Lgi/a;)V", "Lyj/a;", "firebasePerformanceEngine", "Lyj/a;", "getFirebasePerformanceEngine", "()Lyj/a;", "setFirebasePerformanceEngine", "(Lyj/a;)V", "LNu/b;", "autoLogoutDisposable", "LNu/b;", "couponActionDisposable", "Landroidx/appcompat/app/c;", "couponErrorDialog", "Landroidx/appcompat/app/c;", "isShowingUpdatePrompt", "Z", "advertisingId", "Ljava/lang/String;", "Lps/d0;", "navigationHelper$delegate", "Lkotlin/Lazy;", "getNavigationHelper", "()Lps/d0;", "navigationHelper", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public abstract class MeijerActivity extends Hilt_MeijerActivity implements d0.e {
    public static final int $stable = 8;
    public InterfaceC14261a analyticsEngine;
    public C17279b appBackgroundManager;
    public C18264a appPrefManager;
    public C18223b appUpdateConfigManager;
    private Nu.b autoLogoutDisposable;
    public Ck.b baseBus;
    public C5145i connectionChangeHelper;
    private Nu.b couponActionDisposable;
    private androidx.appcompat.app.c couponErrorDialog;
    public Al.g featureEntryPoint;
    public yl.k featureManager;
    public C17828d firebaseLoggingUtil;
    public InterfaceC18215a firebasePerformanceEngine;
    private boolean isShowingUpdatePrompt;
    public Cl.e meijerIntent;
    public C17838h notificationManager;
    public yo.k userManager;
    private final Nu.a disposables = new Nu.a();
    private String advertisingId = "";

    /* renamed from: navigationHelper$delegate, reason: from kotlin metadata */
    private final Lazy navigationHelper = LazyKt.b(new Function0() { // from class: com.meijer.mobile.meijer.activity.d
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MeijerActivity.navigationHelper_delegate$lambda$0(this.f105442a);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkForAppUpdate$lambda$12(final MeijerActivity meijerActivity) {
        meijerActivity.isShowingUpdatePrompt = true;
        new Pj.j(meijerActivity, Y.f99815T, new Object[0]).n().r(Y.f99834U, new Object[0]).o(Y.f99662Kh, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.m
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                this.f109817a.openMeijerPlayStorePage();
            }
        }).q(new DialogInterface.OnDismissListener() { // from class: com.meijer.mobile.meijer.activity.c
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f101003a.isShowingUpdatePrompt = false;
            }
        }).g();
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void trackAdvertisingId$lambda$17(Unit unit) {
    }

    protected boolean shouldMonitorConnectionStatus() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkForAppUpdate$lambda$13(MeijerActivity meijerActivity, C17589b config) {
        Intrinsics.j(config, "config");
        yo.k.b0(meijerActivity.getUserManager(), 0L, 1, null);
        meijerActivity.getNotificationManager().s(config.getUpdateAppMessageTitle(), config.getUpdateAppMessage(), meijerActivity);
        return Unit.f142422a;
    }

    private final String getAdvertisingId(Context context) throws IllegalStateException {
        String str = "";
        try {
            a.C0217a c0217aA = Ic.a.a(context);
            Intrinsics.i(c0217aA, "getAdvertisingIdInfo(...)");
            if (c0217aA.b()) {
                uw.a.INSTANCE.a("Limit Ad Tracking is enabled by the user, cannot process the advertising identifier", new Object[0]);
                return "";
            }
            String strA = c0217aA.a();
            if (strA != null) {
                str = strA;
            }
            uw.a.INSTANCE.k("Successfully retrieved advertisingId", new Object[0]);
            return str;
        } catch (GooglePlayServicesNotAvailableException e10) {
            uw.a.INSTANCE.f(e10, "GooglePlayServicesNotAvailableException while retrieving the advertising identifier ", new Object[0]);
            return "";
        } catch (GooglePlayServicesRepairableException e11) {
            uw.a.INSTANCE.f(e11, "GooglePlayServicesRepairableException while retrieving the advertising identifier ", new Object[0]);
            return "";
        } catch (IOException e12) {
            uw.a.INSTANCE.f(e12, "IOException while retrieving the advertising identifier ", new Object[0]);
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d0 navigationHelper_delegate$lambda$0(MeijerActivity meijerActivity) {
        d0.Companion aVar = d0.INSTANCE;
        Context applicationContext = meijerActivity.getApplicationContext();
        Intrinsics.i(applicationContext, "getApplicationContext(...)");
        return aVar.a(applicationContext, (NavigationView) meijerActivity.findViewById(T.f99150l4), (Toolbar) meijerActivity.findViewById(T.f98874L), meijerActivity, (DrawerLayout) meijerActivity.findViewById(T.f99161m4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$6$lambda$3(List list, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.d(list);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$6$lambda$4(List list, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.d(list);
        track.h("action", "1");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showCouponErrorDialog(final CouponActionEvent couponActionEvent) {
        c.a aVar = new c.a(this);
        aVar.setTitle(getResources().getString(couponActionEvent.getTitleId()));
        aVar.setMessage(getResources().getString(couponActionEvent.getDescriptionId()));
        if (couponActionEvent.getNextIntent() == null) {
            aVar.setPositiveButton(R.string.ok, (DialogInterface.OnClickListener) null);
        } else {
            aVar.setPositiveButton(getResources().getString(Y.f100386vi), new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.g
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    MeijerActivity.showCouponErrorDialog$lambda$8$lambda$7(this.f109074a, couponActionEvent, dialogInterface, i10);
                }
            });
            aVar.setNegativeButton(getResources().getString(Y.f99710N8), (DialogInterface.OnClickListener) null);
        }
        androidx.appcompat.app.c cVarCreate = aVar.create();
        cVarCreate.show();
        this.couponErrorDialog = cVarCreate;
    }

    private final void trackAdvertisingId(final Context applicationContext) {
        new CompletableAction(new Pu.a() { // from class: com.meijer.mobile.meijer.activity.b
            @Override // Pu.a
            public final void run() {
                MeijerActivity.trackAdvertisingId$lambda$16(this.f101001a, applicationContext);
            }
        }).execute(new Pu.g() { // from class: com.meijer.mobile.meijer.activity.e
            @Override // Pu.g
            public final void accept(Object obj) {
                MeijerActivity.trackAdvertisingId$lambda$17((Unit) obj);
            }
        }, new Pu.g() { // from class: com.meijer.mobile.meijer.activity.f
            @Override // Pu.g
            public final void accept(Object obj) {
                MeijerActivity.trackAdvertisingId$lambda$18((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void trackAdvertisingId$lambda$18(Throwable th2) {
        uw.a.INSTANCE.e(th2);
    }

    /* renamed from: anyDialogShowing, reason: from getter */
    public final boolean getIsShowingUpdatePrompt() {
        return this.isShowingUpdatePrompt;
    }

    public final InterfaceC14261a getAnalyticsEngine() {
        InterfaceC14261a interfaceC14261a = this.analyticsEngine;
        if (interfaceC14261a != null) {
            return interfaceC14261a;
        }
        Intrinsics.y("analyticsEngine");
        return null;
    }

    public final C17279b getAppBackgroundManager() {
        C17279b c17279b = this.appBackgroundManager;
        if (c17279b != null) {
            return c17279b;
        }
        Intrinsics.y("appBackgroundManager");
        return null;
    }

    public final C18264a getAppPrefManager() {
        C18264a c18264a = this.appPrefManager;
        if (c18264a != null) {
            return c18264a;
        }
        Intrinsics.y("appPrefManager");
        return null;
    }

    public final C18223b getAppUpdateConfigManager() {
        C18223b c18223b = this.appUpdateConfigManager;
        if (c18223b != null) {
            return c18223b;
        }
        Intrinsics.y("appUpdateConfigManager");
        return null;
    }

    public final Ck.b getBaseBus() {
        Ck.b bVar = this.baseBus;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.y("baseBus");
        return null;
    }

    public final C5145i getConnectionChangeHelper() {
        C5145i c5145i = this.connectionChangeHelper;
        if (c5145i != null) {
            return c5145i;
        }
        Intrinsics.y("connectionChangeHelper");
        return null;
    }

    public final Al.g getFeatureEntryPoint() {
        Al.g gVar = this.featureEntryPoint;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.y("featureEntryPoint");
        return null;
    }

    public final yl.k getFeatureManager() {
        yl.k kVar = this.featureManager;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.y("featureManager");
        return null;
    }

    public final C17828d getFirebaseLoggingUtil() {
        C17828d c17828d = this.firebaseLoggingUtil;
        if (c17828d != null) {
            return c17828d;
        }
        Intrinsics.y("firebaseLoggingUtil");
        return null;
    }

    public final InterfaceC18215a getFirebasePerformanceEngine() {
        InterfaceC18215a interfaceC18215a = this.firebasePerformanceEngine;
        if (interfaceC18215a != null) {
            return interfaceC18215a;
        }
        Intrinsics.y("firebasePerformanceEngine");
        return null;
    }

    public final Cl.e getMeijerIntent() {
        Cl.e eVar = this.meijerIntent;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.y("meijerIntent");
        return null;
    }

    public final d0 getNavigationHelper() {
        return (d0) this.navigationHelper.getValue();
    }

    public final C17838h getNotificationManager() {
        C17838h c17838h = this.notificationManager;
        if (c17838h != null) {
            return c17838h;
        }
        Intrinsics.y("notificationManager");
        return null;
    }

    public final yo.k getUserManager() {
        yo.k kVar = this.userManager;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.y("userManager");
        return null;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.view.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        androidx.appcompat.app.b bVarM;
        Intrinsics.j(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        d0 navigationHelper = getNavigationHelper();
        if (navigationHelper == null || (bVarM = navigationHelper.getActionBarDrawerToggle()) == null) {
            return;
        }
        bVarM.f(newConfig);
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        this.disposables.d();
        super.onDestroy();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        androidx.appcompat.app.b bVarM;
        Intrinsics.j(item, "item");
        d0 navigationHelper = getNavigationHelper();
        if (navigationHelper != null && (bVarM = navigationHelper.getActionBarDrawerToggle()) != null && bVarM.g(item)) {
            Ds.p.d(getWindow());
            return true;
        }
        if (item.getItemId() != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        Intent intentA = androidx.core.app.k.a(this);
        if (intentA == null) {
            finish();
        } else if (shouldUpRecreateTask(intentA)) {
            recreateTask(intentA);
        } else {
            onNavigateUpTo(intentA);
        }
        return true;
    }

    public final void setAnalyticsEngine(InterfaceC14261a interfaceC14261a) {
        Intrinsics.j(interfaceC14261a, "<set-?>");
        this.analyticsEngine = interfaceC14261a;
    }

    public final void setAppBackgroundManager(C17279b c17279b) {
        Intrinsics.j(c17279b, "<set-?>");
        this.appBackgroundManager = c17279b;
    }

    public final void setAppPrefManager(C18264a c18264a) {
        Intrinsics.j(c18264a, "<set-?>");
        this.appPrefManager = c18264a;
    }

    public final void setAppUpdateConfigManager(C18223b c18223b) {
        Intrinsics.j(c18223b, "<set-?>");
        this.appUpdateConfigManager = c18223b;
    }

    public final void setBaseBus(Ck.b bVar) {
        Intrinsics.j(bVar, "<set-?>");
        this.baseBus = bVar;
    }

    public final void setConnectionChangeHelper(C5145i c5145i) {
        Intrinsics.j(c5145i, "<set-?>");
        this.connectionChangeHelper = c5145i;
    }

    public final void setFeatureEntryPoint(Al.g gVar) {
        Intrinsics.j(gVar, "<set-?>");
        this.featureEntryPoint = gVar;
    }

    public final void setFeatureManager(yl.k kVar) {
        Intrinsics.j(kVar, "<set-?>");
        this.featureManager = kVar;
    }

    public final void setFirebaseLoggingUtil(C17828d c17828d) {
        Intrinsics.j(c17828d, "<set-?>");
        this.firebaseLoggingUtil = c17828d;
    }

    public final void setFirebasePerformanceEngine(InterfaceC18215a interfaceC18215a) {
        Intrinsics.j(interfaceC18215a, "<set-?>");
        this.firebasePerformanceEngine = interfaceC18215a;
    }

    public final void setMeijerIntent(Cl.e eVar) {
        Intrinsics.j(eVar, "<set-?>");
        this.meijerIntent = eVar;
    }

    public final void setNotificationManager(C17838h c17838h) {
        Intrinsics.j(c17838h, "<set-?>");
        this.notificationManager = c17838h;
    }

    public final void setUserManager(yo.k kVar) {
        Intrinsics.j(kVar, "<set-?>");
        this.userManager = kVar;
    }

    private final void checkForAppUpdate() {
        getAppUpdateConfigManager().h(new Function0() { // from class: com.meijer.mobile.meijer.activity.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MeijerActivity.checkForAppUpdate$lambda$12(this.f109151a);
            }
        }, new Function1() { // from class: com.meijer.mobile.meijer.activity.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MeijerActivity.checkForAppUpdate$lambda$13(this.f109813a, (C17589b) obj);
            }
        });
    }

    private final void onNavigateUpTo(Intent upIntent) {
        navigateUpTo(upIntent);
    }

    private final void recreateTask(Intent upIntent) {
        y.k(this).a(getMeijerIntent().p(this, getUserManager().b())).e(upIntent).n();
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showCouponErrorDialog$lambda$8$lambda$7(MeijerActivity meijerActivity, CouponActionEvent couponActionEvent, DialogInterface dialogInterface, int i10) {
        meijerActivity.startActivity(couponActionEvent.getNextIntent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void trackAdvertisingId$lambda$16(MeijerActivity meijerActivity, Context context) {
        try {
            String advertisingId = meijerActivity.getAdvertisingId(context);
            if (StringsKt.r0(advertisingId)) {
                advertisingId = null;
            }
            if (advertisingId != null) {
                B.o(advertisingId);
                uw.a.INSTANCE.k("Successfully set advertisingId", new Object[0]);
                if (!Intrinsics.e(advertisingId, meijerActivity.advertisingId)) {
                    meijerActivity.advertisingId = advertisingId;
                }
            }
        } catch (Exception e10) {
            uw.a.INSTANCE.e(e10);
        }
    }

    protected boolean hasNetworkConnection() {
        return getConnectionChangeHelper().i();
    }

    @Override // ps.d0.e
    public void onNavigationDrawerOpen() {
        Ds.p.d(getWindow());
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        B.k();
        getBaseBus().a(new LifecycleEvent(true));
        Nu.b bVar = this.autoLogoutDisposable;
        if (bVar != null) {
            bVar.dispose();
        }
        Nu.b bVar2 = this.couponActionDisposable;
        if (bVar2 != null) {
            bVar2.dispose();
        }
        d0 navigationHelper = getNavigationHelper();
        if (navigationHelper != null) {
            navigationHelper.S();
        }
        if (shouldMonitorConnectionStatus()) {
            getConnectionChangeHelper().q(this);
        }
        Ds.p.d(getWindow());
        androidx.appcompat.app.c cVar = this.couponErrorDialog;
        if (cVar != null) {
            cVar.dismiss();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity
    protected void onPostCreate(Bundle savedInstanceState) {
        androidx.appcompat.app.b bVarM;
        super.onPostCreate(savedInstanceState);
        d0 navigationHelper = getNavigationHelper();
        if (navigationHelper != null && (bVarM = navigationHelper.getActionBarDrawerToggle()) != null) {
            bVarM.k();
            navigationHelper.X(this);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        B.p(getApplication());
        B.l(null);
        d0 navigationHelper = getNavigationHelper();
        if (navigationHelper != null) {
            navigationHelper.T();
        }
        Bundle extras = getIntent().getExtras();
        if (extras != null && extras.containsKey("adobe_push_notification_data_broadlogid_extra") && extras.containsKey("adobe_push_notification_data_deliveryid_extra")) {
            final List<AbstractC14482i.Extra> listU = getFeatureEntryPoint().u(extras);
            getAnalyticsEngine().h(C14476c.a("event: tracking"), new Function1() { // from class: com.meijer.mobile.meijer.activity.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MeijerActivity.onResume$lambda$6$lambda$3(listU, (TrackingData) obj);
                }
            });
            getAnalyticsEngine().h(C14476c.a("event: tracking"), new Function1() { // from class: com.meijer.mobile.meijer.activity.k
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MeijerActivity.onResume$lambda$6$lambda$4(listU, (TrackingData) obj);
                }
            });
            Intent intent = getIntent();
            intent.removeExtra("adobe_push_notification_data_broadlogid_extra");
            intent.removeExtra("adobe_push_notification_data_deliveryid_extra");
        }
        getBaseBus().a(new LifecycleEvent(false));
        this.couponActionDisposable = getBaseBus().b(CouponActionEvent.class, new Pu.g() { // from class: com.meijer.mobile.meijer.activity.l
            @Override // Pu.g
            public final void accept(Object obj) {
                this.f109816a.showCouponErrorDialog((CouponActionEvent) obj);
            }
        });
        if (shouldMonitorConnectionStatus()) {
            getConnectionChangeHelper().k(this);
        }
        if (!this.isShowingUpdatePrompt) {
            checkForAppUpdate();
        }
        if (getAppBackgroundManager().e()) {
            Context applicationContext = getApplicationContext();
            Intrinsics.i(applicationContext, "getApplicationContext(...)");
            trackAdvertisingId(applicationContext);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity
    protected void onResumeFragments() {
        super.onResumeFragments();
        d0 navigationHelper = getNavigationHelper();
        if (navigationHelper != null) {
            navigationHelper.U();
        }
        getConnectionChangeHelper().g();
    }

    public void openMeijerPlayStorePage() {
        try {
            startActivity(getMeijerIntent().W(this));
        } catch (ActivityNotFoundException e10) {
            uw.a.INSTANCE.f(e10, "Play Store not found, opening browser link", new Object[0]);
            startActivity(getMeijerIntent().X(this));
        }
    }
}
