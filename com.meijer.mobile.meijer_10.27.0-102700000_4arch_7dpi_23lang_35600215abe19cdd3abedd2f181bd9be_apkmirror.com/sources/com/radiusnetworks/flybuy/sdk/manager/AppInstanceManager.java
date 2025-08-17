package com.radiusnetworks.flybuy.sdk.manager;

import android.content.Context;
import com.radiusnetworks.flybuy.api.FlyBuyApi;
import com.radiusnetworks.flybuy.sdk.FlyBuyCore;
import com.radiusnetworks.flybuy.sdk.util.PreferenceExtensionKt;
import java.lang.ref.WeakReference;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C16623P;
import qv.C16639f0;
import qv.C16648k;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0012\u001a\u00020\u0011J\u001c\u0010\u0013\u001a\u00020\u00112\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\n \r*\u0004\u0018\u00010\u00030\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u000e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00100\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/manager/AppInstanceManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "value", "Ljava/util/UUID;", "appInstanceID", "getAppInstanceID", "()Ljava/util/UUID;", "setAppInstanceID", "(Ljava/util/UUID;)V", "applicationContext", "kotlin.jvm.PlatformType", "listenerReference", "Ljava/lang/ref/WeakReference;", "Lkotlin/Function1;", "", "rotateAppInstanceID", "setListener", "callback", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class AppInstanceManager {
    private UUID appInstanceID;
    private Context applicationContext;
    private WeakReference<Function1<UUID, Unit>> listenerReference;

    public AppInstanceManager(Context context) {
        Intrinsics.j(context, "context");
        Context applicationContext = context.getApplicationContext();
        this.applicationContext = applicationContext;
        Intrinsics.i(applicationContext, "applicationContext");
        this.appInstanceID = PreferenceExtensionKt.getAppInstanceId(applicationContext);
        this.listenerReference = new WeakReference<>(null);
    }

    private final void setAppInstanceID(UUID uuid) {
        Function1<UUID, Unit> function1;
        boolean zE = Intrinsics.e(this.appInstanceID, uuid);
        this.appInstanceID = uuid;
        FlyBuyApi.INSTANCE.setAppInstanceId(uuid.toString());
        if (zE || (function1 = this.listenerReference.get()) == null) {
            return;
        }
        function1.invoke(this.appInstanceID);
    }

    public final UUID getAppInstanceID() {
        return this.appInstanceID;
    }

    public final void rotateAppInstanceID() {
        try {
            Context applicationContext = this.applicationContext;
            Intrinsics.i(applicationContext, "applicationContext");
            setAppInstanceID(PreferenceExtensionKt.generateAppInstanceId(applicationContext));
        } catch (Exception e10) {
            FlyBuyCore.INSTANCE.getCrashManager().reportCrash(e10);
            throw e10;
        }
    }

    public final void setListener(Function1<? super UUID, Unit> callback) {
        try {
            this.listenerReference = new WeakReference<>(callback);
            C16648k.d(C16623P.a(C16639f0.c()), null, null, new AppInstanceManager$setListener$1$1(this, null), 3, null);
        } catch (Exception e10) {
            FlyBuyCore.INSTANCE.getCrashManager().reportCrash(e10);
            throw e10;
        }
    }
}
