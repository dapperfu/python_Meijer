package com.radiusnetworks.flybuy.sdk;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.location.LocationManager;
import android.os.Build;
import androidx.annotation.Keep;
import androidx.view.InterfaceC5989E;
import com.radiusnetworks.flybuy.api.FlyBuyApi;
import com.radiusnetworks.flybuy.api.mapbox.MapboxApi;
import com.radiusnetworks.flybuy.sdk.ConfigOptions;
import com.radiusnetworks.flybuy.sdk.data.app.SdkConfig;
import com.radiusnetworks.flybuy.sdk.data.app.SdkConfigKt;
import com.radiusnetworks.flybuy.sdk.data.common.SdkError;
import com.radiusnetworks.flybuy.sdk.data.defaults.SdkDefaultsKt;
import com.radiusnetworks.flybuy.sdk.data.location.LocationPermissionState;
import com.radiusnetworks.flybuy.sdk.data.push.FlybuyPushData;
import com.radiusnetworks.flybuy.sdk.data.push.FlybuyPushDataKt;
import com.radiusnetworks.flybuy.sdk.data.room.domain.Customer;
import com.radiusnetworks.flybuy.sdk.exceptions.FlyBuyInitializationException;
import com.radiusnetworks.flybuy.sdk.exceptions.FlyBuyRuntimeException;
import com.radiusnetworks.flybuy.sdk.logging.FlyBuyLogging;
import com.radiusnetworks.flybuy.sdk.logging.LogExtensionsKt;
import com.radiusnetworks.flybuy.sdk.manager.AppInstanceManager;
import com.radiusnetworks.flybuy.sdk.manager.ConfigManager;
import com.radiusnetworks.flybuy.sdk.manager.CrashManager;
import com.radiusnetworks.flybuy.sdk.manager.CustomerManager;
import com.radiusnetworks.flybuy.sdk.manager.OrdersManager;
import com.radiusnetworks.flybuy.sdk.manager.PlacesManager;
import com.radiusnetworks.flybuy.sdk.manager.SitesManager;
import com.radiusnetworks.flybuy.sdk.manager.locationrequest.LocationRequestManager;
import com.radiusnetworks.flybuy.sdk.util.ContextExtensionsKt;
import com.radiusnetworks.flybuy.sdk.util.PermissionExtensionsKt;
import g2.C14193b;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Keep
@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\b\u0004\n\u0002\b\b*\u0002\u0096\u0001\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\rJ=\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\t\u0010\u0012J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\t\u0010\u0015J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\t\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0018\u0010\u0003J\u000f\u0010\u0019\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0019\u0010\u0003J\u0019\u0010\u001b\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ;\u0010\"\u001a\u00020\b2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u001d2\u0016\u0010!\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0004\u0012\u00020\b\u0018\u00010\u001fH\u0007¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b%\u0010&J\u001d\u0010)\u001a\u00020\b2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00010'H\u0007¢\u0006\u0004\b)\u0010*J\u001d\u0010+\u001a\u00020\b2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00010'H\u0007¢\u0006\u0004\b+\u0010*J#\u0010-\u001a\u00020\b2\u0014\u0010!\u001a\u0010\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\b\u0018\u00010\u001f¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b/\u00100R\"\u00101\u001a\u00020\u00048\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R0\u0010\u0014\u001a\u00020\u00132\u0006\u00107\u001a\u00020\u00138\u0006@@X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0014\u00108\u0012\u0004\b<\u0010\u0003\u001a\u0004\b9\u0010:\"\u0004\b;\u00100R*\u0010>\u001a\u00020=2\u0006\u00107\u001a\u00020=8\u0006@@X\u0087\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0014\u0010D\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\bD\u0010ER\"\u0010G\u001a\u00020F8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR(\u0010N\u001a\u00020M8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\bN\u0010O\u0012\u0004\bT\u0010\u0003\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR(\u0010V\u001a\u00020U8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\bV\u0010W\u0012\u0004\b\\\u0010\u0003\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R(\u0010^\u001a\u00020]8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b^\u0010_\u0012\u0004\bd\u0010\u0003\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR(\u0010f\u001a\u00020e8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\bf\u0010g\u0012\u0004\bl\u0010\u0003\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\"\u0010n\u001a\u00020m8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\"\u0010u\u001a\u00020t8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR$\u0010|\u001a\u00020{8\u0000@\u0000X\u0080.¢\u0006\u0014\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R*\u0010\u0083\u0001\u001a\u00030\u0082\u00018\u0000@\u0000X\u0080.¢\u0006\u0018\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001a\u0010\u008a\u0001\u001a\u00030\u0089\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R*\u0010\u008c\u0001\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0005\b\u008e\u0001\u0010&\"\u0006\b\u008f\u0001\u0010\u0090\u0001R$\u0010\u0092\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010'0\u0091\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R$\u0010\u0094\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010'0\u0091\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0093\u0001R\u001a\u0010\u0095\u0001\u001a\u00030\u0089\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u008b\u0001R\u0018\u0010\u0097\u0001\u001a\u00030\u0096\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u001e\u0010\u009c\u0001\u001a\u00020,8FX\u0087\u0004¢\u0006\u000f\u0012\u0005\b\u009b\u0001\u0010\u0003\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001¨\u0006\u009d\u0001"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/FlyBuyCore;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "appTokenKey", "", "configure", "(Landroid/content/Context;Ljava/lang/String;)V", "Landroid/app/Application;", "application", "(Landroid/app/Application;Ljava/lang/String;)V", "baseUrl", "", "logLevel", "internalLogLevel", "(Landroid/app/Application;Ljava/lang/String;Ljava/lang/String;II)V", "Lcom/radiusnetworks/flybuy/sdk/ConfigOptions;", "configOptions", "(Landroid/app/Application;Lcom/radiusnetworks/flybuy/sdk/ConfigOptions;)V", "withOptions", "(Landroid/content/Context;Lcom/radiusnetworks/flybuy/sdk/ConfigOptions;)V", "onActivityStarted", "onActivityStopped", "token", "onNewPushToken", "(Ljava/lang/String;)V", "", "data", "Lkotlin/Function1;", "Lcom/radiusnetworks/flybuy/sdk/data/common/SdkError;", "callback", "onMessageReceived", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V", "Lcom/radiusnetworks/flybuy/sdk/data/location/LocationPermissionState;", "currentLocationPermissionState", "()Lcom/radiusnetworks/flybuy/sdk/data/location/LocationPermissionState;", "Landroidx/lifecycle/E;", "observer", "addActivityStartedObserver", "(Landroidx/lifecycle/E;)V", "addActivityStoppedObserver", "Ljava/util/UUID;", "setAppInstanceIDUpdateListener", "(Lkotlin/jvm/functions/Function1;)V", "overrideConfigOptionsForTests", "(Lcom/radiusnetworks/flybuy/sdk/ConfigOptions;)V", "applicationContext", "Landroid/content/Context;", "getApplicationContext$core_defaultRelease", "()Landroid/content/Context;", "setApplicationContext$core_defaultRelease", "(Landroid/content/Context;)V", "<set-?>", "Lcom/radiusnetworks/flybuy/sdk/ConfigOptions;", "getConfigOptions", "()Lcom/radiusnetworks/flybuy/sdk/ConfigOptions;", "setConfigOptions$core_defaultRelease", "getConfigOptions$annotations", "Lcom/radiusnetworks/flybuy/sdk/data/app/SdkConfig;", "sdkConfig", "Lcom/radiusnetworks/flybuy/sdk/data/app/SdkConfig;", "getSdkConfig", "()Lcom/radiusnetworks/flybuy/sdk/data/app/SdkConfig;", "setSdkConfig$core_defaultRelease", "(Lcom/radiusnetworks/flybuy/sdk/data/app/SdkConfig;)V", "sdkVersion", "Ljava/lang/String;", "Lcom/radiusnetworks/flybuy/sdk/manager/ConfigManager;", "config", "Lcom/radiusnetworks/flybuy/sdk/manager/ConfigManager;", "getConfig", "()Lcom/radiusnetworks/flybuy/sdk/manager/ConfigManager;", "setConfig", "(Lcom/radiusnetworks/flybuy/sdk/manager/ConfigManager;)V", "Lcom/radiusnetworks/flybuy/sdk/manager/CustomerManager;", "customer", "Lcom/radiusnetworks/flybuy/sdk/manager/CustomerManager;", "getCustomer", "()Lcom/radiusnetworks/flybuy/sdk/manager/CustomerManager;", "setCustomer", "(Lcom/radiusnetworks/flybuy/sdk/manager/CustomerManager;)V", "getCustomer$annotations", "Lcom/radiusnetworks/flybuy/sdk/manager/OrdersManager;", "orders", "Lcom/radiusnetworks/flybuy/sdk/manager/OrdersManager;", "getOrders", "()Lcom/radiusnetworks/flybuy/sdk/manager/OrdersManager;", "setOrders", "(Lcom/radiusnetworks/flybuy/sdk/manager/OrdersManager;)V", "getOrders$annotations", "Lcom/radiusnetworks/flybuy/sdk/manager/SitesManager;", "sites", "Lcom/radiusnetworks/flybuy/sdk/manager/SitesManager;", "getSites", "()Lcom/radiusnetworks/flybuy/sdk/manager/SitesManager;", "setSites", "(Lcom/radiusnetworks/flybuy/sdk/manager/SitesManager;)V", "getSites$annotations", "Lcom/radiusnetworks/flybuy/sdk/manager/PlacesManager;", "places", "Lcom/radiusnetworks/flybuy/sdk/manager/PlacesManager;", "getPlaces", "()Lcom/radiusnetworks/flybuy/sdk/manager/PlacesManager;", "setPlaces", "(Lcom/radiusnetworks/flybuy/sdk/manager/PlacesManager;)V", "getPlaces$annotations", "Lcom/radiusnetworks/flybuy/sdk/manager/locationrequest/LocationRequestManager;", "locationRequestManager", "Lcom/radiusnetworks/flybuy/sdk/manager/locationrequest/LocationRequestManager;", "getLocationRequestManager", "()Lcom/radiusnetworks/flybuy/sdk/manager/locationrequest/LocationRequestManager;", "setLocationRequestManager", "(Lcom/radiusnetworks/flybuy/sdk/manager/locationrequest/LocationRequestManager;)V", "Lcom/radiusnetworks/flybuy/sdk/manager/CrashManager;", "crashManager", "Lcom/radiusnetworks/flybuy/sdk/manager/CrashManager;", "getCrashManager", "()Lcom/radiusnetworks/flybuy/sdk/manager/CrashManager;", "setCrashManager", "(Lcom/radiusnetworks/flybuy/sdk/manager/CrashManager;)V", "Lcom/radiusnetworks/flybuy/sdk/sync/a;", "sync", "Lcom/radiusnetworks/flybuy/sdk/sync/a;", "getSync$core_defaultRelease", "()Lcom/radiusnetworks/flybuy/sdk/sync/a;", "setSync$core_defaultRelease", "(Lcom/radiusnetworks/flybuy/sdk/sync/a;)V", "Lcom/radiusnetworks/flybuy/sdk/manager/AppInstanceManager;", "appInstanceManager", "Lcom/radiusnetworks/flybuy/sdk/manager/AppInstanceManager;", "getAppInstanceManager$core_defaultRelease", "()Lcom/radiusnetworks/flybuy/sdk/manager/AppInstanceManager;", "setAppInstanceManager$core_defaultRelease", "(Lcom/radiusnetworks/flybuy/sdk/manager/AppInstanceManager;)V", "", "initialized", "Z", "lastLocationPermissionState", "Lcom/radiusnetworks/flybuy/sdk/data/location/LocationPermissionState;", "getLastLocationPermissionState", "setLastLocationPermissionState", "(Lcom/radiusnetworks/flybuy/sdk/data/location/LocationPermissionState;)V", "", "onActivityStartedSubscriber", "Ljava/util/Set;", "onActivityStoppedSubscriber", "activityLifecycleCallbacksRegistered", "com/radiusnetworks/flybuy/sdk/b", "activityLifecycleCallbacks", "Lcom/radiusnetworks/flybuy/sdk/b;", "getAppInstanceID", "()Ljava/util/UUID;", "getAppInstanceID$annotations", "appInstanceID", "core_defaultRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class FlyBuyCore {
    private static boolean activityLifecycleCallbacksRegistered = false;
    public static AppInstanceManager appInstanceManager = null;
    public static Context applicationContext = null;
    public static ConfigManager config = null;
    public static CrashManager crashManager = null;
    public static CustomerManager customer = null;
    private static boolean initialized = false;
    private static LocationPermissionState lastLocationPermissionState = null;
    public static LocationRequestManager locationRequestManager = null;
    public static OrdersManager orders = null;
    public static PlacesManager places = null;
    private static final String sdkVersion = "2.13.2";
    public static SitesManager sites;
    public static com.radiusnetworks.flybuy.sdk.sync.a sync;
    public static final FlyBuyCore INSTANCE = new FlyBuyCore();
    private static ConfigOptions configOptions = new ConfigOptions.Builder("").build();
    private static SdkConfig sdkConfig = SdkConfigKt.toSdkConfig(SdkDefaultsKt.getDEFAULT_APP_RESPONSE().getData());
    private static final Set<InterfaceC5989E<Object>> onActivityStartedSubscriber = new LinkedHashSet();
    private static final Set<InterfaceC5989E<Object>> onActivityStoppedSubscriber = new LinkedHashSet();
    private static final b activityLifecycleCallbacks = new b();

    private FlyBuyCore() {
    }

    @Deprecated
    @JvmStatic
    public static final void configure(Context context, String appTokenKey) throws Exception {
        Intrinsics.j(context, "context");
        Intrinsics.j(appTokenKey, "appTokenKey");
        INSTANCE.configure(context, new ConfigOptions.Builder(appTokenKey).build());
    }

    @JvmStatic
    public static /* synthetic */ void getAppInstanceID$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getConfigOptions$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getCustomer$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getOrders$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getPlaces$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getSites$annotations() {
    }

    public static /* synthetic */ void configure$default(Application application, String str, String str2, int i10, int i11, int i12, Object obj) throws Exception {
        if ((i12 & 8) != 0) {
            i10 = 6;
        }
        if ((i12 & 16) != 0) {
            i11 = 8;
        }
        configure(application, str, str2, i10, i11);
    }

    public static final UUID getAppInstanceID() {
        return INSTANCE.getAppInstanceManager$core_defaultRelease().getAppInstanceID();
    }

    public static final ConfigOptions getConfigOptions() {
        return configOptions;
    }

    public static final CustomerManager getCustomer() {
        CustomerManager customerManager = customer;
        if (customerManager != null) {
            return customerManager;
        }
        Intrinsics.y("customer");
        return null;
    }

    public static final OrdersManager getOrders() {
        OrdersManager ordersManager = orders;
        if (ordersManager != null) {
            return ordersManager;
        }
        Intrinsics.y("orders");
        return null;
    }

    public static final PlacesManager getPlaces() {
        PlacesManager placesManager = places;
        if (placesManager != null) {
            return placesManager;
        }
        Intrinsics.y("places");
        return null;
    }

    public static final SitesManager getSites() {
        SitesManager sitesManager = sites;
        if (sitesManager != null) {
            return sitesManager;
        }
        Intrinsics.y("sites");
        return null;
    }

    @Deprecated
    @JvmStatic
    public static final void onActivityStarted() throws Exception {
        try {
            if (activityLifecycleCallbacksRegistered) {
                return;
            }
            getOrders().onActivityStarted$core_defaultRelease();
        } catch (Exception e10) {
            INSTANCE.getCrashManager().reportCrash(e10);
            throw e10;
        }
    }

    @Deprecated
    @JvmStatic
    public static final void onActivityStopped() throws Exception {
        try {
            if (activityLifecycleCallbacksRegistered) {
                return;
            }
            getOrders().onActivityStopped$core_defaultRelease();
        } catch (Exception e10) {
            INSTANCE.getCrashManager().reportCrash(e10);
            throw e10;
        }
    }

    @JvmStatic
    public static final void onMessageReceived(Map<String, String> data, Function1<? super SdkError, Unit> callback) throws Exception {
        Intrinsics.j(data, "data");
        try {
            if (StringsKt.r0(FlyBuyApi.INSTANCE.getAppTokenKey())) {
                String simpleName = INSTANCE.getClass().getSimpleName();
                Intrinsics.i(simpleName, "getSimpleName(...)");
                throw new FlyBuyInitializationException(simpleName, FlyBuyCore.class.getSimpleName().concat(".configure(...)"));
            }
            try {
                FlybuyPushData flybuyPushData = FlybuyPushDataKt.toFlybuyPushData(data);
                if (flybuyPushData != null) {
                    if (Intrinsics.e(flybuyPushData.getMessageType(), FlybuyPushData.MESSAGE_TYPE_ORDER_UPDATE) || flybuyPushData.getOrderId() != null) {
                        getOrders().getOrdersOperation$core_defaultRelease().updateFromPushData(flybuyPushData, callback);
                    } else if (Intrinsics.e(flybuyPushData.getMessageType(), FlybuyPushData.MESSAGE_TYPE_BACKGROUND_SYNC)) {
                        INSTANCE.getConfig().fetch(flybuyPushData, d.f119954f);
                    } else if (Intrinsics.e(flybuyPushData.getMessageType(), FlybuyPushData.MESSAGE_TYPE_APP_INSTANCE_DELETED)) {
                        FlyBuyCore flyBuyCore = INSTANCE;
                        flyBuyCore.getAppInstanceManager$core_defaultRelease().rotateAppInstanceID();
                        flyBuyCore.getConfig().rotateAppInstanceId$core_defaultRelease();
                    }
                    Unit unit = Unit.f142422a;
                }
            } catch (Exception e10) {
                LogExtensionsKt.loge$default(INSTANCE, true, e10, null, new Object[0], 4, null);
                Unit unit2 = Unit.f142422a;
            }
        } catch (Exception e11) {
            INSTANCE.getCrashManager().reportCrash(e11);
            throw e11;
        }
    }

    @JvmStatic
    public static final void onNewPushToken(String token) throws Exception {
        try {
            LogExtensionsKt.logd$default(FlyBuyLogging.INSTANCE, false, "onNewPushToken: token=" + token, 1, null);
            FlyBuyApi flyBuyApi = FlyBuyApi.INSTANCE;
            if (StringsKt.r0(flyBuyApi.getAppTokenKey())) {
                String simpleName = INSTANCE.getClass().getSimpleName();
                Intrinsics.i(simpleName, "getSimpleName(...)");
                throw new FlyBuyInitializationException(simpleName, FlyBuyCore.class.getSimpleName().concat(".configure(...)"));
            }
            if (token != null) {
                INSTANCE.getConfig().updateAppInstance$core_defaultRelease(token);
                if (Intrinsics.e(token, flyBuyApi.getPushToken())) {
                    return;
                }
                flyBuyApi.setPushToken(token);
                getOrders().getOrdersOperation$core_defaultRelease().updatePushToken(token);
            }
        } catch (Exception e10) {
            INSTANCE.getCrashManager().reportCrash(e10);
            throw e10;
        }
    }

    public static final void setConfigOptions$core_defaultRelease(ConfigOptions configOptions2) {
        Intrinsics.j(configOptions2, "<set-?>");
        configOptions = configOptions2;
    }

    public static final void setCustomer(CustomerManager customerManager) {
        Intrinsics.j(customerManager, "<set-?>");
        customer = customerManager;
    }

    public static final void setOrders(OrdersManager ordersManager) {
        Intrinsics.j(ordersManager, "<set-?>");
        orders = ordersManager;
    }

    public static final void setPlaces(PlacesManager placesManager) {
        Intrinsics.j(placesManager, "<set-?>");
        places = placesManager;
    }

    public static final void setSites(SitesManager sitesManager) {
        Intrinsics.j(sitesManager, "<set-?>");
        sites = sitesManager;
    }

    public final void addActivityStartedObserver(InterfaceC5989E<Object> observer) throws Exception {
        Intrinsics.j(observer, "observer");
        try {
            onActivityStartedSubscriber.add(observer);
        } catch (Exception e10) {
            INSTANCE.getCrashManager().reportCrash(e10);
            throw e10;
        }
    }

    public final void addActivityStoppedObserver(InterfaceC5989E<Object> observer) throws Exception {
        Intrinsics.j(observer, "observer");
        try {
            onActivityStoppedSubscriber.add(observer);
        } catch (Exception e10) {
            INSTANCE.getCrashManager().reportCrash(e10);
            throw e10;
        }
    }

    public final LocationPermissionState currentLocationPermissionState() throws Exception {
        try {
            FlyBuyCore flyBuyCore = INSTANCE;
            boolean z10 = PermissionExtensionsKt.hasCoarseLocationPermission(flyBuyCore.getApplicationContext$core_defaultRelease()) || PermissionExtensionsKt.hasFineLocationPermission(flyBuyCore.getApplicationContext$core_defaultRelease());
            Object systemService = flyBuyCore.getApplicationContext$core_defaultRelease().getSystemService("location");
            Intrinsics.h(systemService, "null cannot be cast to non-null type android.location.LocationManager");
            boolean zA = C14193b.a((LocationManager) systemService);
            return z10 ? (Build.VERSION.SDK_INT < 29 || !PermissionExtensionsKt.hasBackgroundLocationPermission(flyBuyCore.getApplicationContext$core_defaultRelease())) ? zA ? LocationPermissionState.AUTHORIZED_WHEN_IN_USE : LocationPermissionState.AUTHORIZED_WHEN_IN_USE_NOT_ENABLED : zA ? LocationPermissionState.AUTHORIZED_ALWAYS : LocationPermissionState.AUTHORIZED_ALWAYS_NOT_ENABLED : LocationPermissionState.DENIED;
        } catch (Exception e10) {
            INSTANCE.getCrashManager().reportCrash(e10);
            throw e10;
        }
    }

    public final AppInstanceManager getAppInstanceManager$core_defaultRelease() {
        AppInstanceManager appInstanceManager2 = appInstanceManager;
        if (appInstanceManager2 != null) {
            return appInstanceManager2;
        }
        Intrinsics.y("appInstanceManager");
        return null;
    }

    public final Context getApplicationContext$core_defaultRelease() {
        Context context = applicationContext;
        if (context != null) {
            return context;
        }
        Intrinsics.y("applicationContext");
        return null;
    }

    public final ConfigManager getConfig() {
        ConfigManager configManager = config;
        if (configManager != null) {
            return configManager;
        }
        Intrinsics.y("config");
        return null;
    }

    public final CrashManager getCrashManager() {
        CrashManager crashManager2 = crashManager;
        if (crashManager2 != null) {
            return crashManager2;
        }
        Intrinsics.y("crashManager");
        return null;
    }

    public final LocationPermissionState getLastLocationPermissionState() {
        return lastLocationPermissionState;
    }

    public final LocationRequestManager getLocationRequestManager() {
        LocationRequestManager locationRequestManager2 = locationRequestManager;
        if (locationRequestManager2 != null) {
            return locationRequestManager2;
        }
        Intrinsics.y("locationRequestManager");
        return null;
    }

    public final SdkConfig getSdkConfig() {
        return sdkConfig;
    }

    public final com.radiusnetworks.flybuy.sdk.sync.a getSync$core_defaultRelease() {
        com.radiusnetworks.flybuy.sdk.sync.a aVar = sync;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.y("sync");
        return null;
    }

    public final void overrideConfigOptionsForTests(ConfigOptions configOptions2) {
        Intrinsics.j(configOptions2, "configOptions");
        configOptions = configOptions2;
    }

    public final void setAppInstanceIDUpdateListener(Function1<? super UUID, Unit> callback) throws Exception {
        try {
            INSTANCE.getAppInstanceManager$core_defaultRelease().setListener(callback);
        } catch (Exception e10) {
            INSTANCE.getCrashManager().reportCrash(e10);
            throw e10;
        }
    }

    public final void setAppInstanceManager$core_defaultRelease(AppInstanceManager appInstanceManager2) {
        Intrinsics.j(appInstanceManager2, "<set-?>");
        appInstanceManager = appInstanceManager2;
    }

    public final void setApplicationContext$core_defaultRelease(Context context) {
        Intrinsics.j(context, "<set-?>");
        applicationContext = context;
    }

    public final void setConfig(ConfigManager configManager) {
        Intrinsics.j(configManager, "<set-?>");
        config = configManager;
    }

    public final void setCrashManager(CrashManager crashManager2) {
        Intrinsics.j(crashManager2, "<set-?>");
        crashManager = crashManager2;
    }

    public final void setLastLocationPermissionState(LocationPermissionState locationPermissionState) {
        lastLocationPermissionState = locationPermissionState;
    }

    public final void setLocationRequestManager(LocationRequestManager locationRequestManager2) {
        Intrinsics.j(locationRequestManager2, "<set-?>");
        locationRequestManager = locationRequestManager2;
    }

    public final void setSdkConfig$core_defaultRelease(SdkConfig sdkConfig2) {
        Intrinsics.j(sdkConfig2, "<set-?>");
        sdkConfig = sdkConfig2;
    }

    public final void setSync$core_defaultRelease(com.radiusnetworks.flybuy.sdk.sync.a aVar) {
        Intrinsics.j(aVar, "<set-?>");
        sync = aVar;
    }

    @Deprecated
    @JvmStatic
    public static final void configure(Application application, String appTokenKey) throws Exception {
        Intrinsics.j(application, "application");
        Intrinsics.j(appTokenKey, "appTokenKey");
        configure$default(application, null, appTokenKey, 0, 0, 24, null);
    }

    @Deprecated
    @JvmStatic
    public static final void configure(Application application, String baseUrl, String appTokenKey, int logLevel, int internalLogLevel) throws Exception {
        Intrinsics.j(application, "application");
        Intrinsics.j(appTokenKey, "appTokenKey");
        configure(application, new ConfigOptions.Builder(appTokenKey).setBaseUrl(baseUrl).setLogLevel(logLevel).setInternalLogLevel(internalLogLevel).build());
    }

    @JvmStatic
    public static final void configure(Application application, ConfigOptions configOptions2) throws Exception {
        Intrinsics.j(application, "application");
        Intrinsics.j(configOptions2, "configOptions");
        if (!initialized) {
            activityLifecycleCallbacksRegistered = true;
            application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
        FlyBuyCore flyBuyCore = INSTANCE;
        Context applicationContext2 = application.getApplicationContext();
        Intrinsics.i(applicationContext2, "getApplicationContext(...)");
        flyBuyCore.configure(applicationContext2, configOptions2);
    }

    private final void configure(Context context, ConfigOptions withOptions) throws Exception {
        Object objB;
        String apiToken;
        Unit unit;
        try {
            configOptions = withOptions;
            FlyBuyLogging flyBuyLogging = FlyBuyLogging.INSTANCE;
            flyBuyLogging.setLogLevel(withOptions.getLogLevel());
            flyBuyLogging.setInternalLogLevel(withOptions.getInternalLogLevel());
            synchronized (this) {
                try {
                    if (!initialized) {
                        initialized = true;
                        FlyBuyCore flyBuyCore = INSTANCE;
                        Context applicationContext2 = context.getApplicationContext();
                        Intrinsics.i(applicationContext2, "getApplicationContext(...)");
                        flyBuyCore.setApplicationContext$core_defaultRelease(applicationContext2);
                        String baseUrl = withOptions.getBaseUrl();
                        int internalLogLevel = withOptions.getInternalLogLevel();
                        File cacheDir = context.getCacheDir();
                        Intrinsics.i(cacheDir, "getCacheDir(...)");
                        FlyBuyApi.initialize(baseUrl, internalLogLevel, cacheDir);
                        FlyBuyApi flyBuyApi = FlyBuyApi.INSTANCE;
                        flyBuyApi.setAppTokenKey(withOptions.getAppTokenKey());
                        MapboxApi.initialize$default(null, 0, 3, null);
                        try {
                            Result.Companion companion = Result.INSTANCE;
                            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                            if (packageInfo != null) {
                                Intrinsics.g(packageInfo);
                                flyBuyApi.setAppVersion(packageInfo.versionName);
                                flyBuyApi.setAppId(packageInfo.packageName);
                                unit = Unit.f142422a;
                            } else {
                                unit = null;
                            }
                            objB = Result.b(unit);
                        } catch (Throwable th2) {
                            Result.Companion companion2 = Result.INSTANCE;
                            objB = Result.b(ResultKt.a(th2));
                        }
                        if (Result.e(objB) != null) {
                            FlyBuyApi flyBuyApi2 = FlyBuyApi.INSTANCE;
                            flyBuyApi2.setAppVersion("");
                            flyBuyApi2.setAppId("");
                        }
                        FlyBuyApi flyBuyApi3 = FlyBuyApi.INSTANCE;
                        flyBuyApi3.setSdkVersion(sdkVersion);
                        flyBuyApi3.setSdkPermissions(ContextExtensionsKt.appPermissions(context));
                        FlyBuyCore flyBuyCore2 = INSTANCE;
                        flyBuyCore2.setCrashManager(new CrashManager(context));
                        flyBuyCore2.getCrashManager().init(withOptions);
                        flyBuyCore2.setAppInstanceManager$core_defaultRelease(new AppInstanceManager(context));
                        flyBuyCore2.setSync$core_defaultRelease(new com.radiusnetworks.flybuy.sdk.sync.a(context));
                        flyBuyCore2.setConfig(new ConfigManager(context));
                        setCustomer(new CustomerManager(context));
                        setOrders(new OrdersManager(context));
                        setSites(new SitesManager(context));
                        setPlaces(new PlacesManager(context));
                        flyBuyCore2.setLocationRequestManager(new LocationRequestManager(context));
                        flyBuyApi3.setAppInstanceId(getAppInstanceID().toString());
                        Customer customerCurrentUser = getCustomer().getCustomerOperation$core_defaultRelease().currentUser();
                        if (customerCurrentUser == null || (apiToken = customerCurrentUser.getApiToken()) == null) {
                            apiToken = "";
                        }
                        flyBuyApi3.setCustomerApiToken(apiToken);
                        ConfigManager.fetch$default(flyBuyCore2.getConfig(), null, c.f119953f, 1, null);
                        flyBuyCore2.getSync$core_defaultRelease().a();
                        LogExtensionsKt.logv(flyBuyCore2, false, "FlyBuyCore configured");
                        Unit unit2 = Unit.f142422a;
                    } else {
                        throw new FlyBuyRuntimeException("FlyBuyCore.configure called more than once.");
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        } catch (Exception e10) {
            INSTANCE.getCrashManager().reportCrash(e10);
            throw e10;
        }
    }
}
