package Vb;

import android.annotation.TargetApi;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanSettings;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

@TargetApi(21)
/* loaded from: classes4.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    final List<ScanFilter> f37130a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    final ScanSettings f37131b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        List<ScanFilter> list = sVar.f37130a;
        List<ScanFilter> list2 = this.f37130a;
        if (!(list2 == null ? list == null : list2.equals(list))) {
            return false;
        }
        ScanSettings scanSettings = sVar.f37131b;
        return this.f37131b.getScanMode() == scanSettings.getScanMode() && this.f37131b.getScanResultType() == scanSettings.getScanResultType() && this.f37131b.getCallbackType() == scanSettings.getCallbackType() && this.f37131b.getReportDelayMillis() == scanSettings.getReportDelayMillis();
    }

    public final int hashCode() {
        List<ScanFilter> list = this.f37130a;
        return ((((((((list != null ? list.hashCode() : 0) * 31) + this.f37131b.getCallbackType()) * 31) + this.f37131b.getScanMode()) * 31) + this.f37131b.getScanResultType()) * 31) + Long.valueOf(this.f37131b.getReportDelayMillis()).hashCode();
    }

    public s(@Nullable List<ScanFilter> list, @NonNull ScanSettings scanSettings) {
        this.f37130a = new ArrayList(list);
        this.f37131b = scanSettings;
    }
}
