package com.radiusnetworks.flybuy.sdk.manager;

import android.content.Context;
import androidx.view.InterfaceC5989E;
import com.radiusnetworks.flybuy.api.model.AppData;
import com.radiusnetworks.flybuy.api.model.AppResponse;
import com.radiusnetworks.flybuy.sdk.FlyBuyCore;
import com.radiusnetworks.flybuy.sdk.data.app.SdkConfig;
import com.radiusnetworks.flybuy.sdk.data.app.SdkConfigKt;
import com.radiusnetworks.flybuy.sdk.data.common.SdkError;
import com.radiusnetworks.flybuy.sdk.data.operations.ConfigOperation;
import com.radiusnetworks.flybuy.sdk.data.order.StatesKt;
import com.radiusnetworks.flybuy.sdk.data.push.FlybuyPushData;
import j$.time.Clock;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\f\u001a\u00020\u000b2\u001a\u0010\n\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00070\u0006H\u0007¢\u0006\u0004\b\f\u0010\rJ+\u0010\u000e\u001a\u00020\u000b2\u001a\u0010\n\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00070\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\rJ9\u0010\u0013\u001a\u00020\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\u001e\u0010\u0012\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001c\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R.\u0010#\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00070\u00060\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/manager/ConfigManager;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/lifecycle/E;", "Lkotlin/Pair;", "Lcom/radiusnetworks/flybuy/sdk/data/app/SdkConfig;", "Lcom/radiusnetworks/flybuy/sdk/data/push/FlybuyPushData;", "observer", "", "addConfigChangeListener", "(Landroidx/lifecycle/E;)V", "removeConfigChangeListener", "pushData", "Lkotlin/Function2;", "Lcom/radiusnetworks/flybuy/sdk/data/common/SdkError;", "callback", "fetch", "(Lcom/radiusnetworks/flybuy/sdk/data/push/FlybuyPushData;Lkotlin/jvm/functions/Function2;)V", "", "pushToken", "updateAppInstance$core_defaultRelease", "(Ljava/lang/String;)V", "updateAppInstance", "rotateAppInstanceId$core_defaultRelease", "()V", "rotateAppInstanceId", "applicationContext", "Landroid/content/Context;", "Lcom/radiusnetworks/flybuy/sdk/data/operations/ConfigOperation;", "configOperation", "Lcom/radiusnetworks/flybuy/sdk/data/operations/ConfigOperation;", "", "configSubscribers", "Ljava/util/Set;", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class ConfigManager {
    private final Context applicationContext;
    private final ConfigOperation configOperation;
    private final Set<InterfaceC5989E<Pair<SdkConfig, FlybuyPushData>>> configSubscribers;

    public ConfigManager(Context context) {
        Intrinsics.j(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.i(applicationContext, "getApplicationContext(...)");
        this.applicationContext = applicationContext;
        Clock clockSystemDefaultZone = Clock.systemDefaultZone();
        Intrinsics.i(clockSystemDefaultZone, "systemDefaultZone(...)");
        this.configOperation = new ConfigOperation(applicationContext, clockSystemDefaultZone);
        this.configSubscribers = new LinkedHashSet();
    }

    public static /* synthetic */ void fetch$default(ConfigManager configManager, FlybuyPushData flybuyPushData, Function2 function2, int i10, Object obj) throws Exception {
        if ((i10 & 1) != 0) {
            flybuyPushData = null;
        }
        configManager.fetch(flybuyPushData, function2);
    }

    public final void addConfigChangeListener(InterfaceC5989E<Pair<SdkConfig, FlybuyPushData>> observer) throws Exception {
        Intrinsics.j(observer, "observer");
        try {
            synchronized (this.configSubscribers) {
                this.configSubscribers.add(observer);
                observer.onChanged(new Pair<>(FlyBuyCore.INSTANCE.getSdkConfig(), null));
                Unit unit = Unit.f142422a;
            }
        } catch (Exception e10) {
            FlyBuyCore.INSTANCE.getCrashManager().reportCrash(e10);
            throw e10;
        }
    }

    public final void fetch(final FlybuyPushData pushData, final Function2<? super SdkConfig, ? super SdkError, Unit> callback) throws Exception {
        String messageType;
        if (pushData != null) {
            try {
                messageType = pushData.getMessageType();
            } catch (Exception e10) {
                FlyBuyCore.INSTANCE.getCrashManager().reportCrash(e10);
                throw e10;
            }
        } else {
            messageType = null;
        }
        this.configOperation.getAppResponse$core_defaultRelease(Intrinsics.e(messageType, FlybuyPushData.MESSAGE_TYPE_BACKGROUND_SYNC) && Intrinsics.e(pushData.getForceSyncAppConfig(), Boolean.TRUE), new Function2<AppResponse, SdkError, Unit>() { // from class: com.radiusnetworks.flybuy.sdk.manager.ConfigManager$fetch$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(AppResponse appResponse, SdkError sdkError) {
                invoke2(appResponse, sdkError);
                return Unit.f142422a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(AppResponse appResponse, SdkError sdkError) {
                AppData data;
                FlyBuyCore flyBuyCore = FlyBuyCore.INSTANCE;
                SdkConfig sdkConfig = flyBuyCore.getSdkConfig();
                ConfigManager configManager = this;
                FlybuyPushData flybuyPushData = pushData;
                synchronized (sdkConfig) {
                    if (sdkError == null && appResponse != null) {
                        try {
                            flyBuyCore.setSdkConfig$core_defaultRelease(SdkConfigKt.toSdkConfig(appResponse.getData()));
                            FlyBuyCore.getOrders().setPickupStates$core_defaultRelease(StatesKt.toStates(flyBuyCore.getSdkConfig().getPickupStates()));
                            FlyBuyCore.getPlaces().setPlacesConfig$core_defaultRelease(flyBuyCore.getSdkConfig().getPlacesConfig());
                            synchronized (configManager.configSubscribers) {
                                try {
                                    Iterator it = configManager.configSubscribers.iterator();
                                    while (it.hasNext()) {
                                        ((InterfaceC5989E) it.next()).onChanged(new Pair(FlyBuyCore.INSTANCE.getSdkConfig(), flybuyPushData));
                                    }
                                    Unit unit = Unit.f142422a;
                                } finally {
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    Unit unit2 = Unit.f142422a;
                }
                Function2<SdkConfig, SdkError, Unit> function2 = callback;
                if (function2 != null) {
                    function2.invoke((appResponse == null || (data = appResponse.getData()) == null) ? null : SdkConfigKt.toSdkConfig(data), sdkError);
                }
            }
        });
    }

    public final void removeConfigChangeListener(InterfaceC5989E<Pair<SdkConfig, FlybuyPushData>> observer) throws Exception {
        Intrinsics.j(observer, "observer");
        try {
            synchronized (this.configSubscribers) {
                this.configSubscribers.remove(observer);
            }
        } catch (Exception e10) {
            FlyBuyCore.INSTANCE.getCrashManager().reportCrash(e10);
            throw e10;
        }
    }

    public final void rotateAppInstanceId$core_defaultRelease() throws Exception {
        try {
            this.configOperation.rotateAppInstanceId$core_defaultRelease();
        } catch (Exception e10) {
            FlyBuyCore.INSTANCE.getCrashManager().reportCrash(e10);
            throw e10;
        }
    }

    public final void updateAppInstance$core_defaultRelease(String pushToken) throws Exception {
        Intrinsics.j(pushToken, "pushToken");
        try {
            this.configOperation.updateAppInstance$core_defaultRelease(pushToken);
        } catch (Exception e10) {
            FlyBuyCore.INSTANCE.getCrashManager().reportCrash(e10);
            throw e10;
        }
    }
}
