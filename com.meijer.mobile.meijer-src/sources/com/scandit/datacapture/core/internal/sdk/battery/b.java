package com.scandit.datacapture.core.internal.sdk.battery;

import com.scandit.datacapture.core.source.BatterySavingMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class b implements BatterySavingHandler {

    /* renamed from: a, reason: collision with root package name */
    public final BatterySavingManager f126328a;

    /* renamed from: b, reason: collision with root package name */
    public BatterySavingMode f126329b;

    /* renamed from: c, reason: collision with root package name */
    public Function1 f126330c;

    /* renamed from: d, reason: collision with root package name */
    public final a f126331d;

    public b(BatterySavingManager batterySavingManager) {
        Intrinsics.j(batterySavingManager, "batterySavingManager");
        this.f126328a = batterySavingManager;
        this.f126329b = BatterySavingMode.OFF;
        this.f126331d = new a(this);
    }

    @Override // com.scandit.datacapture.core.internal.sdk.battery.BatterySavingHandler
    public final boolean getShouldSaveBattery() {
        int i10 = BatterySavingHandlerImpl$WhenMappings.$EnumSwitchMapping$0[this.f126329b.ordinal()];
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        if (i10 == 3) {
            return this.f126328a.getShouldEnableBatterySaving();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.scandit.datacapture.core.internal.sdk.battery.BatterySavingHandler
    public final void setBatterySavingMode(BatterySavingMode batterySavingMode) {
        Intrinsics.j(batterySavingMode, "batterySavingMode");
        this.f126329b = batterySavingMode;
        int i10 = BatterySavingHandlerImpl$WhenMappings.$EnumSwitchMapping$0[batterySavingMode.ordinal()];
        if (i10 == 1) {
            this.f126328a.removeListener(this.f126331d);
            Function1 function1 = this.f126330c;
            if (function1 != null) {
                function1.invoke(Boolean.TRUE);
                return;
            }
            return;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                return;
            }
            this.f126328a.addListener(this.f126331d);
        } else {
            this.f126328a.removeListener(this.f126331d);
            Function1 function12 = this.f126330c;
            if (function12 != null) {
                function12.invoke(Boolean.FALSE);
            }
        }
    }

    @Override // com.scandit.datacapture.core.internal.sdk.battery.BatterySavingHandler
    public final void setListener(Function1 function1) {
        this.f126330c = function1;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(getShouldSaveBattery()));
        }
    }
}
