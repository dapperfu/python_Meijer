package com.scandit.datacapture.core.internal.sdk.battery;

import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011J/\u0010\u0007\u001a\u00020\u00032%\u0010\b\u001a!\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\tj\u0002`\u000eH&J\b\u0010\u000f\u001a\u00020\rH&J/\u0010\u0010\u001a\u00020\u00032%\u0010\b\u001a!\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\tj\u0002`\u000eH&R\u0014\u0010\u0002\u001a\u00020\u00038fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0012\u0010\u0005\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u0012"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/battery/BatterySavingManager;", "", "isListeningToPowerEvents", "", "()Z", "shouldEnableBatterySaving", "getShouldEnableBatterySaving", "addListener", "listener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "shouldSaveBattery", "", "Lcom/scandit/datacapture/core/internal/sdk/battery/BatterySavingListener;", "deregisterContextListeners", "removeListener", "Companion", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface BatterySavingManager {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.f125360a;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\nR\"\u0010\f\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/battery/BatterySavingManager$Companion;", "", "Landroid/content/Context;", "context", "", "makeInstance$scandit_capture_core", "(Landroid/content/Context;)V", "makeInstance", "Lcom/scandit/datacapture/core/internal/sdk/battery/BatterySavingManager;", "forTest$scandit_capture_core", "(Landroid/content/Context;)Lcom/scandit/datacapture/core/internal/sdk/battery/BatterySavingManager;", "forTest", "sharedInstance", "Lcom/scandit/datacapture/core/internal/sdk/battery/BatterySavingManager;", "getSharedInstance", "()Lcom/scandit/datacapture/core/internal/sdk/battery/BatterySavingManager;", "setSharedInstance", "(Lcom/scandit/datacapture/core/internal/sdk/battery/BatterySavingManager;)V", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f125360a = new Companion();
        public static BatterySavingManager sharedInstance;

        public final /* synthetic */ BatterySavingManager forTest$scandit_capture_core(Context context) {
            Intrinsics.j(context, "context");
            return new BatterySavingManagerImpl(context);
        }

        public final BatterySavingManager getSharedInstance() {
            BatterySavingManager batterySavingManager = sharedInstance;
            if (batterySavingManager != null) {
                return batterySavingManager;
            }
            Intrinsics.y("sharedInstance");
            return null;
        }

        public final /* synthetic */ void makeInstance$scandit_capture_core(Context context) {
            Intrinsics.j(context, "context");
            setSharedInstance(new BatterySavingManagerImpl(context));
        }

        public final void setSharedInstance(BatterySavingManager batterySavingManager) {
            Intrinsics.j(batterySavingManager, "<set-?>");
            sharedInstance = batterySavingManager;
        }

        private Companion() {
        }
    }

    boolean addListener(Function1<? super Boolean, Unit> listener);

    void deregisterContextListeners();

    boolean getShouldEnableBatterySaving();

    boolean isListeningToPowerEvents();

    boolean removeListener(Function1<? super Boolean, Unit> listener);
}
