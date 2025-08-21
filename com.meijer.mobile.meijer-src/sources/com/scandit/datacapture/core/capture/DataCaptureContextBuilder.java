package com.scandit.datacapture.core.capture;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u0007J\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/scandit/datacapture/core/capture/DataCaptureContextBuilder;", "", "", "licenseKey", "<init>", "(Ljava/lang/String;)V", "deviceName", "(Ljava/lang/String;)Lcom/scandit/datacapture/core/capture/DataCaptureContextBuilder;", "externalId", "frameworkName", "frameworkVersion", "Lcom/scandit/datacapture/core/capture/DataCaptureContextSettings;", "settings", "(Lcom/scandit/datacapture/core/capture/DataCaptureContextSettings;)Lcom/scandit/datacapture/core/capture/DataCaptureContextBuilder;", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "build", "()Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class DataCaptureContextBuilder {

    /* renamed from: a, reason: collision with root package name */
    private final String f124993a;

    /* renamed from: b, reason: collision with root package name */
    private String f124994b;

    /* renamed from: c, reason: collision with root package name */
    private String f124995c;

    /* renamed from: d, reason: collision with root package name */
    private String f124996d;

    /* renamed from: e, reason: collision with root package name */
    private String f124997e;

    /* renamed from: f, reason: collision with root package name */
    private DataCaptureContextSettings f124998f;

    public DataCaptureContextBuilder(String licenseKey) {
        Intrinsics.j(licenseKey, "licenseKey");
        this.f124993a = licenseKey;
        this.f124996d = "native";
        this.f124998f = new DataCaptureContextSettings();
    }

    public final DataCaptureContext build() {
        return DataCaptureContext.INSTANCE._forAllProperties$scandit_capture_core(this.f124993a, this.f124996d, this.f124997e, this.f124994b, this.f124995c, this.f124998f);
    }

    public final DataCaptureContextBuilder deviceName(String deviceName) {
        this.f124994b = deviceName;
        return this;
    }

    public final DataCaptureContextBuilder externalId(String externalId) {
        this.f124995c = externalId;
        return this;
    }

    public final DataCaptureContextBuilder frameworkName(String frameworkName) {
        Intrinsics.j(frameworkName, "frameworkName");
        this.f124996d = frameworkName;
        return this;
    }

    public final DataCaptureContextBuilder frameworkVersion(String frameworkVersion) {
        Intrinsics.j(frameworkVersion, "frameworkVersion");
        this.f124997e = frameworkVersion;
        return this;
    }

    public final DataCaptureContextBuilder settings(DataCaptureContextSettings settings) {
        Intrinsics.j(settings, "settings");
        this.f124998f = settings;
        return this;
    }
}
