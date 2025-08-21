package com.scandit.datacapture.core.capture;

import com.scandit.datacapture.core.internal.sdk.analytics.AnalyticsSettings;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContextSettings;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0004H\u0097\u0001J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\b¨\u0006\u0010"}, d2 = {"Lcom/scandit/datacapture/core/capture/DataCaptureContextSettings;", "Lcom/scandit/datacapture/core/capture/DataCaptureContextSettingsProxy;", "()V", "impl", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureContextSettings;", "(Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureContextSettings;)V", "_impl", "getProperty", "", "key", "", "setProperty", "", "name", "value", "Companion", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DataCaptureContextSettings implements DataCaptureContextSettingsProxy {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ DataCaptureContextSettingsProxyAdapter f125008a;

    public DataCaptureContextSettings(NativeDataCaptureContextSettings impl) {
        Intrinsics.j(impl, "impl");
        this.f125008a = new DataCaptureContextSettingsProxyAdapter(impl, null, 2, null);
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextSettingsProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeDataCaptureContextSettings getF125009a() {
        return this.f125008a.getF125009a();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getProperty(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.j(r3, r0)
            int r0 = r3.hashCode()
            r1 = -1988438583(0xffffffff897ad5c9, float:-3.0193177E-33)
            if (r0 == r1) goto L41
            r1 = -1918698521(0xffffffff8da2fbe7, float:-1.0044664E-30)
            if (r0 == r1) goto L2b
            r1 = -1785958911(0xffffffff958c6e01, float:-5.6719105E-26)
            if (r0 == r1) goto L19
            goto L49
        L19:
            java.lang.String r0 = "enabledCpusBitset"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L22
            goto L49
        L22:
            com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContextSettings r3 = r2.getF125009a()
            java.lang.String r3 = r3.getEnabledCpusBitset()
            goto L57
        L2b:
            java.lang.String r0 = "numberOfEngineThreads"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L34
            goto L49
        L34:
            com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContextSettings r3 = r2.getF125009a()
            int r3 = r3.getNumberOfEngineThreads()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L57
        L41:
            java.lang.String r0 = "analyticsSettings"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L4f
        L49:
            r3 = -1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L57
        L4f:
            com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContextSettings r3 = r2.getF125009a()
            com.scandit.datacapture.core.internal.sdk.analytics.NativeAnalyticsSettings r3 = r3.getAnalyticsSettings()
        L57:
            kotlin.jvm.internal.Intrinsics.g(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.core.capture.DataCaptureContextSettings.getProperty(java.lang.String):java.lang.Object");
    }

    public final void setProperty(String name, Object value) {
        Intrinsics.j(name, "name");
        Intrinsics.j(value, "value");
        if (Intrinsics.e(name, "analyticsSettings") && (value instanceof AnalyticsSettings)) {
            getF125009a().setAnalyticsSettings(((AnalyticsSettings) value).getF126299a());
            return;
        }
        if (Intrinsics.e(name, "numberOfEngineThreads") && (value instanceof Integer)) {
            getF125009a().setNumberOfEngineThreads(((Number) value).intValue());
            return;
        }
        if (Intrinsics.e(name, "enabledCpusBitset") && (value instanceof String)) {
            getF125009a().setEnabledCpusBitset((String) value);
            return;
        }
        if (value instanceof Boolean) {
            getF125009a().setBoolProperty(name, ((Boolean) value).booleanValue());
            return;
        }
        if (value instanceof Integer) {
            getF125009a().setIntProperty(name, ((Number) value).intValue());
        } else if (value instanceof Float) {
            getF125009a().setFloatProperty(name, ((Number) value).floatValue());
        } else if (value instanceof String) {
            getF125009a().setStringProperty(name, (String) value);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DataCaptureContextSettings() {
        NativeDataCaptureContextSettings nativeDataCaptureContextSettingsCreate = NativeDataCaptureContextSettings.create();
        Intrinsics.i(nativeDataCaptureContextSettingsCreate, "create(...)");
        this(nativeDataCaptureContextSettingsCreate);
    }
}
