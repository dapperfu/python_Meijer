package Xb;

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
    final List<ScanFilter> f41842a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    final ScanSettings f41843b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        List<ScanFilter> list = sVar.f41842a;
        List<ScanFilter> list2 = this.f41842a;
        if (!(list2 == null ? list == null : list2.equals(list))) {
            return false;
        }
        ScanSettings scanSettings = sVar.f41843b;
        return this.f41843b.getScanMode() == scanSettings.getScanMode() && this.f41843b.getScanResultType() == scanSettings.getScanResultType() && this.f41843b.getCallbackType() == scanSettings.getCallbackType() && this.f41843b.getReportDelayMillis() == scanSettings.getReportDelayMillis();
    }

    public final int hashCode() {
        List<ScanFilter> list = this.f41842a;
        return ((((((((list != null ? list.hashCode() : 0) * 31) + this.f41843b.getCallbackType()) * 31) + this.f41843b.getScanMode()) * 31) + this.f41843b.getScanResultType()) * 31) + Long.valueOf(this.f41843b.getReportDelayMillis()).hashCode();
    }

    public s(@Nullable List<ScanFilter> list, @NonNull ScanSettings scanSettings) {
        this.f41842a = new ArrayList(list);
        this.f41843b = scanSettings;
    }
}
