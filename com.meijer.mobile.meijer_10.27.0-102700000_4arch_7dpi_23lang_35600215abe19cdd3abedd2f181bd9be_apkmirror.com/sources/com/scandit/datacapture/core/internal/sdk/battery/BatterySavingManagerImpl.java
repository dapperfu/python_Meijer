package com.scandit.datacapture.core.internal.sdk.battery;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

/* loaded from: classes11.dex */
public final class BatterySavingManagerImpl implements BatterySavingManager {

    /* renamed from: j, reason: collision with root package name */
    static final /* synthetic */ KProperty[] f125361j = {Reflection.f(new MutablePropertyReference1Impl(Reflection.b(BatterySavingManagerImpl.class), "isBatterySavingEnabled", "isBatterySavingEnabled()Z")), Reflection.f(new MutablePropertyReference1Impl(Reflection.b(BatterySavingManagerImpl.class), "isPowerSaveEnabled", "isPowerSaveEnabled()Z")), Reflection.f(new MutablePropertyReference1Impl(Reflection.b(BatterySavingManagerImpl.class), "isRunningHot", "isRunningHot()Z"))};

    /* renamed from: a, reason: collision with root package name */
    private final Context f125362a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f125363b;

    /* renamed from: c, reason: collision with root package name */
    private final BatterySavingManagerImpl$special$$inlined$distinctObservable$1 f125364c;

    /* renamed from: d, reason: collision with root package name */
    private final BatterySavingManagerImpl$special$$inlined$distinctObservable$2 f125365d;

    /* renamed from: e, reason: collision with root package name */
    private final BatterySavingManagerImpl$special$$inlined$distinctObservable$3 f125366e;

    /* renamed from: f, reason: collision with root package name */
    private final Set f125367f;

    /* renamed from: g, reason: collision with root package name */
    private final PowerManager f125368g;

    /* renamed from: h, reason: collision with root package name */
    private final BatterySavingManagerImpl$powerReceiver$1 f125369h;

    /* renamed from: i, reason: collision with root package name */
    private final PowerManager.OnThermalStatusChangedListener f125370i;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(BatterySavingManagerImpl this$0, int i10) {
        Intrinsics.j(this$0, "this$0");
        this$0.f125366e.setValue(this$0, f125361j[2], Boolean.valueOf(i10 >= 3));
        if (this$0.f125367f.isEmpty()) {
            this$0.deregisterContextListeners();
        }
    }

    public static final boolean c(BatterySavingManagerImpl batterySavingManagerImpl) {
        return batterySavingManagerImpl.f125365d.getValue(batterySavingManagerImpl, f125361j[1]).booleanValue();
    }

    @Override // com.scandit.datacapture.core.internal.sdk.battery.BatterySavingManager
    public final synchronized void deregisterContextListeners() {
        PowerManager.OnThermalStatusChangedListener onThermalStatusChangedListener;
        PowerManager powerManager;
        try {
            if (this.f125363b) {
                this.f125362a.unregisterReceiver(this.f125369h);
                if (Build.VERSION.SDK_INT >= 29 && (onThermalStatusChangedListener = this.f125370i) != null && (powerManager = this.f125368g) != null) {
                    powerManager.removeThermalStatusListener(onThermalStatusChangedListener);
                }
                this.f125363b = false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.scandit.datacapture.core.internal.sdk.battery.BatterySavingManagerImpl$special$$inlined$distinctObservable$1] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.scandit.datacapture.core.internal.sdk.battery.BatterySavingManagerImpl$special$$inlined$distinctObservable$2] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.scandit.datacapture.core.internal.sdk.battery.BatterySavingManagerImpl$special$$inlined$distinctObservable$3] */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.scandit.datacapture.core.internal.sdk.battery.BatterySavingManagerImpl$powerReceiver$1] */
    public BatterySavingManagerImpl(Context context) {
        Intrinsics.j(context, "context");
        this.f125362a = context;
        final Boolean bool = Boolean.FALSE;
        Delegates delegates = Delegates.f142874a;
        this.f125364c = new ObservableProperty<Boolean>(bool) { // from class: com.scandit.datacapture.core.internal.sdk.battery.BatterySavingManagerImpl$special$$inlined$distinctObservable$1
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, Boolean oldValue, Boolean newValue) {
                Intrinsics.j(property, "property");
                if (Intrinsics.e(oldValue, newValue)) {
                    return;
                }
                BatterySavingManagerImpl.a(this, newValue.booleanValue());
            }
        };
        this.f125365d = new ObservableProperty<Boolean>(bool) { // from class: com.scandit.datacapture.core.internal.sdk.battery.BatterySavingManagerImpl$special$$inlined$distinctObservable$2
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, Boolean oldValue, Boolean newValue) {
                Intrinsics.j(property, "property");
                if (Intrinsics.e(oldValue, newValue)) {
                    return;
                }
                boolean zBooleanValue = newValue.booleanValue();
                BatterySavingManagerImpl batterySavingManagerImpl = this;
                BatterySavingManagerImpl.b(batterySavingManagerImpl, zBooleanValue | BatterySavingManagerImpl.d(batterySavingManagerImpl));
            }
        };
        this.f125366e = new ObservableProperty<Boolean>(bool) { // from class: com.scandit.datacapture.core.internal.sdk.battery.BatterySavingManagerImpl$special$$inlined$distinctObservable$3
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, Boolean oldValue, Boolean newValue) {
                Intrinsics.j(property, "property");
                if (Intrinsics.e(oldValue, newValue)) {
                    return;
                }
                boolean zBooleanValue = newValue.booleanValue();
                BatterySavingManagerImpl batterySavingManagerImpl = this;
                BatterySavingManagerImpl.b(batterySavingManagerImpl, zBooleanValue | BatterySavingManagerImpl.c(batterySavingManagerImpl));
            }
        };
        Set setNewSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        Intrinsics.i(setNewSetFromMap, "newSetFromMap(...)");
        this.f125367f = setNewSetFromMap;
        this.f125368g = (PowerManager) context.getSystemService(PowerManager.class);
        this.f125369h = new BroadcastReceiver() { // from class: com.scandit.datacapture.core.internal.sdk.battery.BatterySavingManagerImpl$powerReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                BatterySavingManagerImpl batterySavingManagerImpl = this.f125374a;
                PowerManager powerManager = batterySavingManagerImpl.f125368g;
                BatterySavingManagerImpl.c(batterySavingManagerImpl, powerManager != null ? powerManager.isPowerSaveMode() : false);
                BatterySavingManagerImpl.a(this.f125374a);
            }
        };
        this.f125370i = Build.VERSION.SDK_INT >= 29 ? new PowerManager.OnThermalStatusChangedListener() { // from class: com.scandit.datacapture.core.internal.sdk.battery.f
            @Override // android.os.PowerManager.OnThermalStatusChangedListener
            public final void onThermalStatusChanged(int i10) {
                BatterySavingManagerImpl.a(this.f125380a, i10);
            }
        } : null;
    }

    public static final boolean d(BatterySavingManagerImpl batterySavingManagerImpl) {
        return batterySavingManagerImpl.f125366e.getValue(batterySavingManagerImpl, f125361j[2]).booleanValue();
    }

    @Override // com.scandit.datacapture.core.internal.sdk.battery.BatterySavingManager
    public final boolean addListener(Function1 listener) {
        PowerManager.OnThermalStatusChangedListener onThermalStatusChangedListener;
        PowerManager powerManager;
        PowerManager powerManager2;
        Intrinsics.j(listener, "listener");
        if (!this.f125367f.add(listener)) {
            return false;
        }
        if (this.f125367f.size() == 1) {
            synchronized (this) {
                try {
                    if (!this.f125363b) {
                        PowerManager powerManager3 = this.f125368g;
                        boolean zIsPowerSaveMode = powerManager3 != null ? powerManager3.isPowerSaveMode() : false;
                        BatterySavingManagerImpl$special$$inlined$distinctObservable$2 batterySavingManagerImpl$special$$inlined$distinctObservable$2 = this.f125365d;
                        KProperty<?>[] kPropertyArr = f125361j;
                        batterySavingManagerImpl$special$$inlined$distinctObservable$2.setValue(this, kPropertyArr[1], Boolean.valueOf(zIsPowerSaveMode));
                        int i10 = Build.VERSION.SDK_INT;
                        if (i10 >= 29 && (powerManager2 = this.f125368g) != null) {
                            setValue(this, kPropertyArr[2], Boolean.valueOf(powerManager2.getCurrentThermalStatus() >= 3));
                        }
                        if (i10 >= 33) {
                            this.f125362a.registerReceiver(this.f125369h, new IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED"), 2);
                        } else {
                            this.f125362a.registerReceiver(this.f125369h, new IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED"));
                        }
                        if (i10 >= 29 && (onThermalStatusChangedListener = this.f125370i) != null && (powerManager = this.f125368g) != null) {
                            powerManager.addThermalStatusListener(onThermalStatusChangedListener);
                        }
                        this.f125363b = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        listener.invoke(Boolean.valueOf(getShouldEnableBatterySaving()));
        return true;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.battery.BatterySavingManager
    public final boolean getShouldEnableBatterySaving() {
        return getValue(this, f125361j[0]).booleanValue();
    }

    @Override // com.scandit.datacapture.core.internal.sdk.battery.BatterySavingManager
    public final boolean isListeningToPowerEvents() {
        return this.f125363b;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.battery.BatterySavingManager
    public final boolean removeListener(Function1 listener) {
        Intrinsics.j(listener, "listener");
        boolean zRemove = this.f125367f.remove(listener);
        if (zRemove && this.f125367f.isEmpty()) {
            deregisterContextListeners();
        }
        return zRemove;
    }

    public static final void b(BatterySavingManagerImpl batterySavingManagerImpl, boolean z10) {
        batterySavingManagerImpl.f125364c.setValue(batterySavingManagerImpl, f125361j[0], Boolean.valueOf(z10));
    }

    public static final void c(BatterySavingManagerImpl batterySavingManagerImpl, boolean z10) {
        batterySavingManagerImpl.f125365d.setValue(batterySavingManagerImpl, f125361j[1], Boolean.valueOf(z10));
    }

    public static final void a(BatterySavingManagerImpl batterySavingManagerImpl, boolean z10) {
        Iterator it = batterySavingManagerImpl.f125367f.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(Boolean.valueOf(z10));
        }
    }

    public static final void a(BatterySavingManagerImpl batterySavingManagerImpl) {
        if (batterySavingManagerImpl.f125367f.isEmpty()) {
            batterySavingManagerImpl.deregisterContextListeners();
        }
    }
}
