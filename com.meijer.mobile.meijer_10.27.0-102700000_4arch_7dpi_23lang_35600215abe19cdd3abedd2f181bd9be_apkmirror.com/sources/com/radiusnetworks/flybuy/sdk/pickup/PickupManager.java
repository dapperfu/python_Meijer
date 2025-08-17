package com.radiusnetworks.flybuy.sdk.pickup;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import androidx.annotation.Keep;
import androidx.core.app.m;
import androidx.view.InterfaceC5989E;
import com.radiusnetworks.flybuy.sdk.FlyBuyCore;
import com.radiusnetworks.flybuy.sdk.data.room.domain.Order;
import com.radiusnetworks.flybuy.sdk.exceptions.FlyBuyInitializationException;
import com.radiusnetworks.flybuy.sdk.exceptions.FlyBuyRuntimeException;
import com.radiusnetworks.flybuy.sdk.logging.LogExtensionsKt;
import com.radiusnetworks.flybuy.sdk.util.ContextExtensionsKt;
import com.radiusnetworks.flybuy.sdk.util.SingletonHolder;
import j$.time.Clock;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Keep
@Metadata(d1 = {"\u0000S\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\n*\u0001)\b\u0007\u0018\u0000 12\u00020\u0001:\u00011B\u0013\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u000bJG\u0010\u0015\u001a\u00020\u000228\u0010\u0014\u001a4\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00020\r¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\u001a\u001a\u00020\u00068\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\tR \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00010\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010\"R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00010\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\"R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+RV\u0010,\u001a6\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u0010\u0016¨\u00062"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/pickup/PickupManager;", "", "", "arg", "<init>", "(Lkotlin/Unit;)V", "Landroid/content/Context;", "context", "configure", "(Landroid/content/Context;)V", "onLocationPermissionChanged", "()V", "onPermissionChanged", "Lkotlin/Function2;", "Landroidx/core/app/m$e;", "Lkotlin/ParameterName;", "name", "notificationBuilder", "Lcom/radiusnetworks/flybuy/sdk/data/room/domain/Order;", "order", "updater", "configureLiveStatusNotificationUpdater", "(Lkotlin/jvm/functions/Function2;)V", "", "initialized", "Z", "applicationContext", "Landroid/content/Context;", "getApplicationContext$pickup_defaultRelease", "()Landroid/content/Context;", "setApplicationContext$pickup_defaultRelease", "Landroidx/lifecycle/E;", "", "ordersObserver", "Landroidx/lifecycle/E;", "locationServicesReceiverRegistered", "Landroid/content/BroadcastReceiver;", "locationServicesStateReceiver", "Landroid/content/BroadcastReceiver;", "locationPermissionRegisterObserver", "locationPermissionUnregisterObserver", "com/radiusnetworks/flybuy/sdk/pickup/k", "locationProvider", "Lcom/radiusnetworks/flybuy/sdk/pickup/k;", "liveStatusNotificationUpdater", "Lkotlin/jvm/functions/Function2;", "getLiveStatusNotificationUpdater", "()Lkotlin/jvm/functions/Function2;", "setLiveStatusNotificationUpdater", "Companion", "pickup_defaultRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class PickupManager {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public Context applicationContext;
    private boolean initialized;
    private Function2<? super m.e, ? super Order, Unit> liveStatusNotificationUpdater;

    @SuppressLint({"UnspecifiedRegisterReceiverFlag"})
    private final InterfaceC5989E<Object> locationPermissionRegisterObserver;
    private final InterfaceC5989E<Object> locationPermissionUnregisterObserver;
    private final k locationProvider;
    private boolean locationServicesReceiverRegistered;
    private final BroadcastReceiver locationServicesStateReceiver;
    private final InterfaceC5989E<List<Order>> ordersObserver;

    @Keep
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/pickup/PickupManager$Companion;", "Lcom/radiusnetworks/flybuy/sdk/util/SingletonHolder;", "Lcom/radiusnetworks/flybuy/sdk/pickup/PickupManager;", "", "()V", "pickup_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion extends SingletonHolder<PickupManager, Unit> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
            super(g.f120009b);
        }
    }

    public /* synthetic */ PickupManager(Unit unit, DefaultConstructorMarker defaultConstructorMarker) {
        this(unit);
    }

    private PickupManager(Unit unit) {
        this.ordersObserver = new InterfaceC5989E() { // from class: com.radiusnetworks.flybuy.sdk.pickup.a
            @Override // androidx.view.InterfaceC5989E
            public final void onChanged(Object obj) {
                PickupManager.ordersObserver$lambda$0(this.f119984a, (List) obj);
            }
        };
        this.locationServicesStateReceiver = new l(this);
        this.locationPermissionRegisterObserver = new InterfaceC5989E() { // from class: com.radiusnetworks.flybuy.sdk.pickup.b
            @Override // androidx.view.InterfaceC5989E
            public final void onChanged(Object obj) {
                PickupManager.locationPermissionRegisterObserver$lambda$2(this.f119985a, obj);
            }
        };
        this.locationPermissionUnregisterObserver = new InterfaceC5989E() { // from class: com.radiusnetworks.flybuy.sdk.pickup.c
            @Override // androidx.view.InterfaceC5989E
            public final void onChanged(Object obj) {
                PickupManager.locationPermissionUnregisterObserver$lambda$4(this.f119986a, obj);
            }
        };
        this.locationProvider = new k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void locationPermissionRegisterObserver$lambda$2(PickupManager this$0, Object it) {
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(it, "it");
        synchronized (this$0.locationServicesStateReceiver) {
            try {
                if (!this$0.locationServicesReceiverRegistered) {
                    try {
                        IntentFilter intentFilter = new IntentFilter("android.location.PROVIDERS_CHANGED");
                        if (ContextExtensionsKt.targetSdkVersion(this$0.getApplicationContext$pickup_defaultRelease()) < 33 || Build.VERSION.SDK_INT < 33) {
                            this$0.getApplicationContext$pickup_defaultRelease().registerReceiver(this$0.locationServicesStateReceiver, intentFilter);
                        } else {
                            this$0.getApplicationContext$pickup_defaultRelease().registerReceiver(this$0.locationServicesStateReceiver, intentFilter, 2);
                        }
                        this$0.locationServicesReceiverRegistered = true;
                    } catch (Throwable th2) {
                        this$0.locationServicesReceiverRegistered = true;
                        throw th2;
                    }
                }
                Unit unit = Unit.f142422a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void locationPermissionUnregisterObserver$lambda$4(PickupManager this$0, Object it) {
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(it, "it");
        synchronized (this$0.locationServicesStateReceiver) {
            try {
                if (this$0.locationServicesReceiverRegistered) {
                    try {
                        this$0.getApplicationContext$pickup_defaultRelease().unregisterReceiver(this$0.locationServicesStateReceiver);
                        this$0.locationServicesReceiverRegistered = false;
                    } catch (Throwable th2) {
                        this$0.locationServicesReceiverRegistered = false;
                        throw th2;
                    }
                }
                Unit unit = Unit.f142422a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ordersObserver$lambda$0(PickupManager this$0, List it) {
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(it, "it");
        m.a(this$0);
    }

    public final void configure(Context context) throws Exception {
        Intrinsics.j(context, "context");
        try {
            synchronized (this) {
                try {
                    if (this.initialized) {
                        throw new FlyBuyRuntimeException("PickupManager.configure called more than once.");
                    }
                    Context applicationContext = context.getApplicationContext();
                    Intrinsics.i(applicationContext, "getApplicationContext(...)");
                    setApplicationContext$pickup_defaultRelease(applicationContext);
                    FlyBuyCore flyBuyCore = FlyBuyCore.INSTANCE;
                    flyBuyCore.addActivityStartedObserver(this.locationPermissionRegisterObserver);
                    flyBuyCore.addActivityStoppedObserver(this.locationPermissionUnregisterObserver);
                    flyBuyCore.getLocationRequestManager().addLocationProvider(this.locationProvider);
                    ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                    Intrinsics.i(applicationInfo, "getApplicationInfo(...)");
                    Object obj = applicationInfo.metaData.get("com.google.android.geo.API_KEY");
                    String string = obj != null ? obj.toString() : null;
                    com.radiusnetworks.flybuy.sdk.pickup.eta.a aVar = com.radiusnetworks.flybuy.sdk.pickup.eta.a.f119994a;
                    com.radiusnetworks.flybuy.sdk.pickup.eta.a.a(string, Clock.systemDefaultZone());
                    FlyBuyCore.getOrders().addOpenOrdersChangeListener(this.ordersObserver);
                    this.initialized = true;
                    LogExtensionsKt.logv(this, false, "PickupManager configured");
                    Unit unit = Unit.f142422a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e10) {
            FlyBuyCore.INSTANCE.getCrashManager().reportCrash(e10);
            throw e10;
        }
    }

    public final void configureLiveStatusNotificationUpdater(Function2<? super m.e, ? super Order, Unit> updater) throws Exception {
        Intrinsics.j(updater, "updater");
        try {
            if (this.initialized) {
                this.liveStatusNotificationUpdater = updater;
            } else {
                Intrinsics.i("PickupManager", "getSimpleName(...)");
                throw new FlyBuyInitializationException("PickupManager", "PickupManager.getInstance().configure(context)");
            }
        } catch (Exception e10) {
            FlyBuyCore.INSTANCE.getCrashManager().reportCrash(e10);
            throw e10;
        }
    }

    public final Context getApplicationContext$pickup_defaultRelease() {
        Context context = this.applicationContext;
        if (context != null) {
            return context;
        }
        Intrinsics.y("applicationContext");
        return null;
    }

    public final Function2<m.e, Order, Unit> getLiveStatusNotificationUpdater() {
        return this.liveStatusNotificationUpdater;
    }

    @Deprecated
    public final void onLocationPermissionChanged() throws Exception {
        try {
            if (this.initialized) {
                m.a(this);
            } else {
                Intrinsics.i("PickupManager", "getSimpleName(...)");
                throw new FlyBuyInitializationException("PickupManager", "PickupManager.getInstance().configure(context)");
            }
        } catch (Exception e10) {
            FlyBuyCore.INSTANCE.getCrashManager().reportCrash(e10);
            throw e10;
        }
    }

    public final void onPermissionChanged() throws Exception {
        try {
            if (this.initialized) {
                m.a(this);
            } else {
                Intrinsics.i("PickupManager", "getSimpleName(...)");
                throw new FlyBuyInitializationException("PickupManager", "PickupManager.getInstance().configure(context)");
            }
        } catch (Exception e10) {
            FlyBuyCore.INSTANCE.getCrashManager().reportCrash(e10);
            throw e10;
        }
    }

    public final void setApplicationContext$pickup_defaultRelease(Context context) {
        Intrinsics.j(context, "<set-?>");
        this.applicationContext = context;
    }

    public final void setLiveStatusNotificationUpdater(Function2<? super m.e, ? super Order, Unit> function2) {
        this.liveStatusNotificationUpdater = function2;
    }
}
