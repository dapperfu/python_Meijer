package com.scandit.datacapture.core.capture.serialization;

import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.DataCaptureContextBuilder;
import com.scandit.datacapture.core.capture.DataCaptureContextSettings;
import com.scandit.datacapture.core.capture.DataCaptureMode;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.source.FrameSource;
import com.scandit.datacapture.core.source.serialization.FrameSourceDeserializer;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class b implements DataCaptureContextDeserializerHelper, DataCaptureDeserializerHelper {

    /* renamed from: a, reason: collision with root package name */
    public DataCaptureContext f124097a;

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureDeserializerHelper
    public final void clear() {
        this.f124097a = null;
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureContextDeserializerHelper
    public final void updateContextFromJson(DataCaptureContext dataCaptureContext, JsonValue json) {
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        Intrinsics.j(json, "json");
    }

    public b(FrameSourceDeserializer fsDeserializer) {
        Intrinsics.j(fsDeserializer, "fsDeserializer");
        new WeakReference(fsDeserializer);
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureContextDeserializerHelper
    public final DataCaptureContext createContext(String licenseKey, String deviceName, String externalId, String frameworkName, String str, DataCaptureContextSettings settings, String str2, String str3, String str4) {
        Intrinsics.j(licenseKey, "licenseKey");
        Intrinsics.j(deviceName, "deviceName");
        Intrinsics.j(externalId, "externalId");
        Intrinsics.j(frameworkName, "frameworkName");
        Intrinsics.j(settings, "settings");
        DataCaptureContextBuilder dataCaptureContextBuilderFrameworkName = DataCaptureContext.INSTANCE.builder(licenseKey).deviceName(deviceName).externalId(externalId).frameworkName(frameworkName);
        if (str != null) {
            dataCaptureContextBuilderFrameworkName.frameworkVersion(str);
        }
        DataCaptureContext dataCaptureContextBuild = dataCaptureContextBuilderFrameworkName.build();
        this.f124097a = dataCaptureContextBuild;
        return dataCaptureContextBuild;
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureContextDeserializerHelper
    public final void removeModeFromContext(DataCaptureContext dataCaptureContext, DataCaptureMode mode) {
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        Intrinsics.j(mode, "mode");
        dataCaptureContext.removeMode(mode);
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureContextDeserializerHelper
    public final void setFrameSourceOnContext(DataCaptureContext context, FrameSource frameSource) {
        Intrinsics.j(context, "context");
        DataCaptureContext.setFrameSource$default(context, frameSource, null, 2, null);
    }
}
