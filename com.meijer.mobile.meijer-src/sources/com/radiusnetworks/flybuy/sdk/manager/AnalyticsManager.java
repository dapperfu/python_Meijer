package com.radiusnetworks.flybuy.sdk.manager;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.view.InterfaceC6131E;
import com.radiusnetworks.flybuy.sdk.FlyBuyCore;
import com.radiusnetworks.flybuy.sdk.data.analytics.LocalEventsDataStore;
import com.radiusnetworks.flybuy.sdk.data.analytics.RemoteEventsDataStore;
import com.radiusnetworks.flybuy.sdk.data.app.SdkConfig;
import com.radiusnetworks.flybuy.sdk.data.common.SdkError;
import com.radiusnetworks.flybuy.sdk.data.operations.AnalyticsEventOperation;
import com.radiusnetworks.flybuy.sdk.data.push.FlybuyPushData;
import com.radiusnetworks.flybuy.sdk.data.room.database.AppDatabase;
import com.radiusnetworks.flybuy.sdk.logging.LogExtensionsKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15784P;
import mv.C15800f0;
import mv.C15809k;

@Keep
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000f\u001a\u00020\u00062\u0018\b\u0002\u0010\f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nH\u0001¢\u0006\u0004\b\r\u0010\u000eJ=\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR(\u0010\u001f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020!8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/manager/AnalyticsManager;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "init$core_defaultRelease", "()V", "init", "Lkotlin/Function1;", "Lcom/radiusnetworks/flybuy/sdk/data/common/SdkError;", "callback", "sync$core_defaultRelease", "(Lkotlin/jvm/functions/Function1;)V", "sync", "", "eventName", "", "projectId", "orderId", "promotionId", "siteId", "sendEvent", "(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "applicationContext", "Landroid/content/Context;", "Landroidx/lifecycle/E;", "Lkotlin/Pair;", "Lcom/radiusnetworks/flybuy/sdk/data/app/SdkConfig;", "Lcom/radiusnetworks/flybuy/sdk/data/push/FlybuyPushData;", "configObserver", "Landroidx/lifecycle/E;", "Lcom/radiusnetworks/flybuy/sdk/data/operations/AnalyticsEventOperation;", "getAnalyticsEventOperation$core_defaultRelease", "()Lcom/radiusnetworks/flybuy/sdk/data/operations/AnalyticsEventOperation;", "analyticsEventOperation", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class AnalyticsManager {
    private final Context applicationContext;
    private final InterfaceC6131E<Pair<SdkConfig, FlybuyPushData>> configObserver;

    public final void init$core_defaultRelease() throws Exception {
        try {
            synchronized (this) {
                FlyBuyCore.INSTANCE.getConfig().addConfigChangeListener(this.configObserver);
                LogExtensionsKt.logd(this, false, "AnalyticsManager initialized");
                Unit unit = Unit.f143329a;
            }
        } catch (Exception e10) {
            LogExtensionsKt.logd(this, true, e10, "catchAndThrow caught exception", new Object[0]);
            com.radiusnetworks.flybuy.sdk.b.a(FlyBuyCore.INSTANCE, "catchAndThrow caught exception", e10);
            throw e10;
        }
    }

    public AnalyticsManager(Context context) {
        Intrinsics.j(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.i(applicationContext, "getApplicationContext(...)");
        this.applicationContext = applicationContext;
        this.configObserver = new InterfaceC6131E() { // from class: com.radiusnetworks.flybuy.sdk.manager.a
            @Override // androidx.view.InterfaceC6131E
            public final void onChanged(Object obj) {
                AnalyticsManager.configObserver$lambda$0(this.f120954a, (Pair) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configObserver$lambda$0(AnalyticsManager this$0, Pair pair) {
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(pair, "<anonymous parameter 0>");
        sync$core_defaultRelease$default(this$0, null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void sync$core_defaultRelease$default(AnalyticsManager analyticsManager, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = null;
        }
        analyticsManager.sync$core_defaultRelease(function1);
    }

    public final AnalyticsEventOperation getAnalyticsEventOperation$core_defaultRelease() {
        Context context = this.applicationContext;
        Intrinsics.j(context, "context");
        AppDatabase.Companion companion = AppDatabase.INSTANCE;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.i(applicationContext, "getApplicationContext(...)");
        LocalEventsDataStore localEventsRepository = new LocalEventsDataStore(companion.getInstance(applicationContext));
        Context context2 = this.applicationContext;
        Intrinsics.j(context2, "context");
        Context applicationContext2 = context2.getApplicationContext();
        Intrinsics.i(applicationContext2, "getApplicationContext(...)");
        RemoteEventsDataStore remoteEventsRepository = new RemoteEventsDataStore(applicationContext2);
        Intrinsics.j(localEventsRepository, "localEventsRepository");
        Intrinsics.j(remoteEventsRepository, "remoteEventsRepository");
        return new AnalyticsEventOperation(localEventsRepository, remoteEventsRepository);
    }

    public final void sendEvent(String eventName, int projectId, Integer orderId, Integer promotionId, Integer siteId) {
        Intrinsics.j(eventName, "eventName");
        getAnalyticsEventOperation$core_defaultRelease().sendEvent(eventName, projectId, orderId, promotionId, siteId);
    }

    @SuppressLint({"MissingPermission"})
    public final void sync$core_defaultRelease(Function1<? super SdkError, Unit> callback) {
        C15809k.d(C15784P.a(C15800f0.b()), null, null, new AnalyticsManager$sync$1(this, callback, null), 3, null);
    }
}
