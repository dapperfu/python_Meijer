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

/* loaded from: classes12.dex */
public final class BatterySavingManagerImpl implements BatterySavingManager {

    /* renamed from: j, reason: collision with root package name */
    static final /* synthetic */ KProperty[] f126313j = {Reflection.f(new MutablePropertyReference1Impl(Reflection.b(BatterySavingManagerImpl.class), "isBatterySavingEnabled", "isBatterySavingEnabled()Z")), Reflection.f(new MutablePropertyReference1Impl(Reflection.b(BatterySavingManagerImpl.class), "isPowerSaveEnabled", "isPowerSaveEnabled()Z")), Reflection.f(new MutablePropertyReference1Impl(Reflection.b(BatterySavingManagerImpl.class), "isRunningHot", "isRunningHot()Z"))};

    /* renamed from: a, reason: collision with root package name */
    private final Context f126314a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f126315b;

    /* renamed from: c, reason: collision with root package name */
    private final BatterySavingManagerImpl$special$$inlined$distinctObservable$1 f126316c;

    /* renamed from: d, reason: collision with root package name */
    private final BatterySavingManagerImpl$special$$inlined$distinctObservable$2 f126317d;

    /* renamed from: e, reason: collision with root package name */
    private final BatterySavingManagerImpl$special$$inlined$distinctObservable$3 f126318e;

    /* renamed from: f, reason: collision with root package name */
    private final Set f126319f;

    /* renamed from: g, reason: collision with root package name */
    private final PowerManager f126320g;

    /* renamed from: h, reason: collision with root package name */
    private final BatterySavingManagerImpl$powerReceiver$1 f126321h;

    /* renamed from: i, reason: collision with root package name */
    private final PowerManager.OnThermalStatusChangedListener f126322i;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(BatterySavingManagerImpl this$0, int i10) {
        Intrinsics.j(this$0, "this$0");
        this$0.f126318e.setValue(this$0, f126313j[2], Boolean.valueOf(i10 >= 3));
        if (this$0.f126319f.isEmpty()) {
            this$0.deregisterContextListeners();
        }
    }

    public static final boolean c(BatterySavingManagerImpl batterySavingManagerImpl) {
        return batterySavingManagerImpl.f126317d.getValue(batterySavingManagerImpl, f126313j[1]).booleanValue();
    }

    @Override // com.scandit.datacapture.core.internal.sdk.battery.BatterySavingManager
    public final synchronized void deregisterContextListeners() {
        PowerManager.OnThermalStatusChangedListener onThermalStatusChangedListener;
        PowerManager powerManager;
        try {
            if (this.f126315b) {
                this.f126314a.unregisterReceiver(this.f126321h);
                if (Build.VERSION.SDK_INT >= 29 && (onThermalStatusChangedListener = this.f126322i) != null && (powerManager = this.f126320g) != null) {
                    powerManager.removeThermalStatusListener(onThermalStatusChangedListener);
                }
                this.f126315b = false;
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
        this.f126314a = context;
        final Boolean bool = Boolean.FALSE;
        Delegates delegates = Delegates.f143781a;
        this.f126316c = new ObservableProperty<Boolean>(bool) { // from class: com.scandit.datacapture.core.internal.sdk.battery.BatterySavingManagerImpl$special$$inlined$distinctObservable$1
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, Boolean oldValue, Boolean newValue) {
                Intrinsics.j(property, "property");
                if (Intrinsics.e(oldValue, newValue)) {
                    return;
                }
                BatterySavingManagerImpl.a(this, newValue.booleanValue());
            }
        };
        this.f126317d = new ObservableProperty<Boolean>(bool) { // from class: com.scandit.datacapture.core.internal.sdk.battery.BatterySavingManagerImpl$special$$inlined$distinctObservable$2
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
        this.f126318e = new ObservableProperty<Boolean>(bool) { // from class: com.scandit.datacapture.core.internal.sdk.battery.BatterySavingManagerImpl$special$$inlined$distinctObservable$3
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
        this.f126319f = setNewSetFromMap;
        this.f126320g = (PowerManager) context.getSystemService(PowerManager.class);
        this.f126321h = new BroadcastReceiver() { // from class: com.scandit.datacapture.core.internal.sdk.battery.BatterySavingManagerImpl$powerReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                BatterySavingManagerImpl batterySavingManagerImpl = this.f126326a;
                PowerManager powerManager = batterySavingManagerImpl.f126320g;
                BatterySavingManagerImpl.c(batterySavingManagerImpl, powerManager != null ? powerManager.isPowerSaveMode() : false);
                BatterySavingManagerImpl.a(this.f126326a);
            }
        };
        this.f126322i = Build.VERSION.SDK_INT >= 29 ? new PowerManager.OnThermalStatusChangedListener() { // from class: com.scandit.datacapture.core.internal.sdk.battery.f
            @Override // android.os.PowerManager.OnThermalStatusChangedListener
            public final void onThermalStatusChanged(int i10) {
                BatterySavingManagerImpl.a(this.f126332a, i10);
            }
        } : null;
    }

    public static final boolean d(BatterySavingManagerImpl batterySavingManagerImpl) {
        return batterySavingManagerImpl.f126318e.getValue(batterySavingManagerImpl, f126313j[2]).booleanValue();
    }

    @Override // com.scandit.datacapture.core.internal.sdk.battery.BatterySavingManager
    public final boolean addListener(Function1 listener) {
        PowerManager.OnThermalStatusChangedListener onThermalStatusChangedListener;
        PowerManager powerManager;
        PowerManager powerManager2;
        Intrinsics.j(listener, "listener");
        if (!this.f126319f.add(listener)) {
            return false;
        }
        if (this.f126319f.size() == 1) {
            synchronized (this) {
                try {
                    if (!this.f126315b) {
                        PowerManager powerManager3 = this.f126320g;
                        boolean zIsPowerSaveMode = powerManager3 != null ? powerManager3.isPowerSaveMode() : false;
                        BatterySavingManagerImpl$special$$inlined$distinctObservable$2 batterySavingManagerImpl$special$$inlined$distinctObservable$2 = this.f126317d;
                        KProperty<?>[] kPropertyArr = f126313j;
                        batterySavingManagerImpl$special$$inlined$distinctObservable$2.setValue(this, kPropertyArr[1], Boolean.valueOf(zIsPowerSaveMode));
                        int i10 = Build.VERSION.SDK_INT;
                        if (i10 >= 29 && (powerManager2 = this.f126320g) != null) {
                            setValue(this, kPropertyArr[2], Boolean.valueOf(powerManager2.getCurrentThermalStatus() >= 3));
                        }
                        if (i10 >= 33) {
                            this.f126314a.registerReceiver(this.f126321h, new IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED"), 2);
                        } else {
                            this.f126314a.registerReceiver(this.f126321h, new IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED"));
                        }
                        if (i10 >= 29 && (onThermalStatusChangedListener = this.f126322i) != null && (powerManager = this.f126320g) != null) {
                            powerManager.addThermalStatusListener(onThermalStatusChangedListener);
                        }
                        this.f126315b = true;
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
        return getValue(this, f126313j[0]).booleanValue();
    }

    @Override // com.scandit.datacapture.core.internal.sdk.battery.BatterySavingManager
    public final boolean isListeningToPowerEvents() {
        return this.f126315b;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.battery.BatterySavingManager
    public final boolean removeListener(Function1 listener) {
        Intrinsics.j(listener, "listener");
        boolean zRemove = this.f126319f.remove(listener);
        if (zRemove && this.f126319f.isEmpty()) {
            deregisterContextListeners();
        }
        return zRemove;
    }

    public static final void b(BatterySavingManagerImpl batterySavingManagerImpl, boolean z10) {
        batterySavingManagerImpl.f126316c.setValue(batterySavingManagerImpl, f126313j[0], Boolean.valueOf(z10));
    }

    public static final void c(BatterySavingManagerImpl batterySavingManagerImpl, boolean z10) {
        batterySavingManagerImpl.f126317d.setValue(batterySavingManagerImpl, f126313j[1], Boolean.valueOf(z10));
    }

    public static final void a(BatterySavingManagerImpl batterySavingManagerImpl, boolean z10) {
        Iterator it = batterySavingManagerImpl.f126319f.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(Boolean.valueOf(z10));
        }
    }

    public static final void a(BatterySavingManagerImpl batterySavingManagerImpl) {
        if (batterySavingManagerImpl.f126319f.isEmpty()) {
            batterySavingManagerImpl.deregisterContextListeners();
        }
    }
}
