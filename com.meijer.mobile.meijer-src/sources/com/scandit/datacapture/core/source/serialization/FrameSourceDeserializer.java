package com.scandit.datacapture.core.source.serialization;

import android.graphics.Bitmap;
import androidx.annotation.Keep;
import com.scandit.datacapture.core.capture.serialization.DataCaptureDeserializerHelper;
import com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer;
import com.scandit.datacapture.core.internal.module.serialization.NativeFrameSourceDeserializer;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.internal.sdk.extensions.BitmapExtensionsKt;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.source.BitmapFrameSource;
import com.scandit.datacapture.core.source.Camera;
import com.scandit.datacapture.core.source.CameraPosition;
import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.core.source.FrameSource;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyGetter;
import com.scandit.datacapture.tools.internal.sdk.ProxyGetterKind;
import com.scandit.datacapture.tools.internal.sdk.ProxySetter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001:\u0002@AB\u001f\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0017\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u0010\u0010\n\u001a\u00020\u0000H\u0097\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0097\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0097\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005H\u0097\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0000H\u0097\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0097\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00182\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0097\u0001¢\u0006\u0004\b!\u0010\"J\u0018\u0010$\u001a\u00020#2\u0006\u0010\r\u001a\u00020\fH\u0097\u0001¢\u0006\u0004\b$\u0010%J \u0010'\u001a\u00020#2\u0006\u0010&\u001a\u00020#2\u0006\u0010\r\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b'\u0010(J \u0010*\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0097\u0001¢\u0006\u0004\b*\u0010+J \u0010,\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0097\u0001¢\u0006\u0004\b,\u0010-J\u0015\u0010.\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b.\u0010\u0010J\u0017\u00100\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b/\u0010\u0014R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0004\u00101R\u0017\u00107\u001a\u0002028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R$\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010\"R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020\f0\u00028WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006B"}, d2 = {"Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializer;", "Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializerProxy;", "", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureModeDeserializer;", "modeDeserializers", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeFrameSourceDeserializer;", "impl", "<init>", "(Ljava/util/List;Lcom/scandit/datacapture/core/internal/module/serialization/NativeFrameSourceDeserializer;)V", "(Ljava/util/List;)V", "_deserializer", "()Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializer;", "", "jsonData", "Lcom/scandit/datacapture/core/source/FrameSource;", "_frameSourceFromJson", "(Ljava/lang/String;)Lcom/scandit/datacapture/core/source/FrameSource;", "Lcom/scandit/datacapture/core/json/JsonValue;", "json", "_frameSourceFromJsonValue", "(Lcom/scandit/datacapture/core/json/JsonValue;)Lcom/scandit/datacapture/core/source/FrameSource;", "_impl", "()Lcom/scandit/datacapture/core/internal/module/serialization/NativeFrameSourceDeserializer;", "deserializer", "", "_setDeserializer", "(Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializer;)V", "Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializerHelper;", "helper", "_setHelper", "(Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializerHelper;)V", "Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializerListener;", "listener", "_setListener", "(Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializerListener;)V", "Lcom/scandit/datacapture/core/source/CameraSettings;", "cameraSettingsFromJson", "(Ljava/lang/String;)Lcom/scandit/datacapture/core/source/CameraSettings;", "settings", "updateCameraSettingsFromJson", "(Lcom/scandit/datacapture/core/source/CameraSettings;Ljava/lang/String;)Lcom/scandit/datacapture/core/source/CameraSettings;", "frameSource", "updateFrameSourceFromJson", "(Lcom/scandit/datacapture/core/source/FrameSource;Ljava/lang/String;)Lcom/scandit/datacapture/core/source/FrameSource;", "updateFrameSourceFromJsonValue", "(Lcom/scandit/datacapture/core/source/FrameSource;Lcom/scandit/datacapture/core/json/JsonValue;)Lcom/scandit/datacapture/core/source/FrameSource;", "frameSourceFromJson", "frameSourceFromJsonValue$scandit_capture_core", "frameSourceFromJsonValue", "Ljava/util/List;", "Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializer$Helper;", "b", "Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializer$Helper;", "get_helper", "()Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializer$Helper;", "_helper", "c", "Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializerListener;", "getListener", "()Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializerListener;", "setListener", "getWarnings", "()Ljava/util/List;", "warnings", "com/scandit/datacapture/core/source/serialization/a", "Helper", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
@Mockable
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class FrameSourceDeserializer implements FrameSourceDeserializerProxy {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ FrameSourceDeserializerProxyAdapter f126870a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Helper _helper;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private FrameSourceDeserializerListener listener;

    @Keep
    private final List<DataCaptureModeDeserializer> modeDeserializers;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J1\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010\"\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializer$Helper;", "Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializerHelper;", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureDeserializerHelper;", "<init>", "()V", "", "clear", "Lcom/scandit/datacapture/core/source/CameraPosition;", "position", "Lcom/scandit/datacapture/core/source/CameraSettings;", "settings", "", "cameraDeviceType", "cameraSubtype", "Lcom/scandit/datacapture/core/source/Camera;", "createCamera", "(Lcom/scandit/datacapture/core/source/CameraPosition;Lcom/scandit/datacapture/core/source/CameraSettings;Ljava/lang/String;Ljava/lang/String;)Lcom/scandit/datacapture/core/source/Camera;", "camera", "applySettings", "(Lcom/scandit/datacapture/core/source/Camera;Lcom/scandit/datacapture/core/source/CameraSettings;)V", "base64Image", "Lcom/scandit/datacapture/core/source/FrameSource;", "createImageFrameSource", "(Ljava/lang/String;)Lcom/scandit/datacapture/core/source/FrameSource;", "Lcom/scandit/datacapture/core/json/JsonValue;", "json", "updateCameraFromJson", "(Lcom/scandit/datacapture/core/source/Camera;Lcom/scandit/datacapture/core/json/JsonValue;)V", "a", "Lcom/scandit/datacapture/core/source/FrameSource;", "getDeserializedFrameSource", "()Lcom/scandit/datacapture/core/source/FrameSource;", "setDeserializedFrameSource", "(Lcom/scandit/datacapture/core/source/FrameSource;)V", "deserializedFrameSource", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
    public static final class Helper implements FrameSourceDeserializerHelper, DataCaptureDeserializerHelper {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private FrameSource deserializedFrameSource;

        @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureDeserializerHelper
        public void clear() {
            this.deserializedFrameSource = null;
        }

        @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerHelper
        public void updateCameraFromJson(Camera camera, JsonValue json) {
            Intrinsics.j(camera, "camera");
            Intrinsics.j(json, "json");
        }

        @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerHelper
        public void applySettings(Camera camera, CameraSettings settings) {
            Intrinsics.j(camera, "camera");
            Intrinsics.j(settings, "settings");
            Camera.applySettings$default(camera, settings, null, 2, null);
        }

        @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerHelper
        public Camera createCamera(CameraPosition position, CameraSettings settings, String cameraDeviceType, String cameraSubtype) {
            Intrinsics.j(position, "position");
            Intrinsics.j(settings, "settings");
            Intrinsics.j(cameraDeviceType, "cameraDeviceType");
            Intrinsics.j(cameraSubtype, "cameraSubtype");
            Camera camera = Camera.INSTANCE.getCamera(position, settings);
            this.deserializedFrameSource = camera;
            return camera;
        }

        @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerHelper
        public FrameSource createImageFrameSource(String base64Image) {
            Intrinsics.j(base64Image, "base64Image");
            Bitmap bitmapBitmapFromBase64 = BitmapExtensionsKt.bitmapFromBase64(base64Image);
            if (bitmapBitmapFromBase64 == null) {
                return null;
            }
            BitmapFrameSource bitmapFrameSourceOf = BitmapFrameSource.INSTANCE.of(bitmapBitmapFromBase64);
            this.deserializedFrameSource = bitmapFrameSourceOf;
            return bitmapFrameSourceOf;
        }

        public final FrameSource getDeserializedFrameSource() {
            return this.deserializedFrameSource;
        }

        public final void setDeserializedFrameSource(FrameSource frameSource) {
            this.deserializedFrameSource = frameSource;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FrameSourceDeserializer(List<? extends DataCaptureModeDeserializer> modeDeserializers, NativeFrameSourceDeserializer impl) {
        Intrinsics.j(modeDeserializers, "modeDeserializers");
        Intrinsics.j(impl, "impl");
        this.modeDeserializers = modeDeserializers;
        this.f126870a = new FrameSourceDeserializerProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
        Helper helper = new Helper();
        this._helper = helper;
        _setDeserializer(this);
        _setHelper(helper);
        impl.setListener(new FrameSourceDeserializerListenerReversedAdapter(new a(this), this, null, 4, null));
    }

    @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerProxy
    @ProxyGetter(ProxyGetterKind.WITH_SETTER)
    public FrameSourceDeserializer _deserializer() {
        return this.f126870a._deserializer();
    }

    @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerProxy
    @ProxyFunction(nativeName = "frameSourceFromJson")
    public FrameSource _frameSourceFromJson(String jsonData) {
        Intrinsics.j(jsonData, "jsonData");
        return this.f126870a._frameSourceFromJson(jsonData);
    }

    @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerProxy
    @ProxyFunction(nativeName = "frameSourceFromJson")
    public FrameSource _frameSourceFromJsonValue(JsonValue json) {
        Intrinsics.j(json, "json");
        return this.f126870a._frameSourceFromJsonValue(json);
    }

    @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeFrameSourceDeserializer getF126879a() {
        return this.f126870a.getF126879a();
    }

    @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerProxy
    @ProxySetter
    public void _setDeserializer(FrameSourceDeserializer deserializer) {
        Intrinsics.j(deserializer, "deserializer");
        this.f126870a._setDeserializer(deserializer);
    }

    @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerProxy
    @ProxyFunction(nativeName = "setHelper")
    public void _setHelper(FrameSourceDeserializerHelper helper) {
        this.f126870a._setHelper(helper);
    }

    @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerProxy
    @ProxyFunction(nativeName = "setListener")
    public void _setListener(FrameSourceDeserializerListener listener) {
        this.f126870a._setListener(listener);
    }

    @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerProxy
    @ProxyFunction
    public CameraSettings cameraSettingsFromJson(String jsonData) {
        Intrinsics.j(jsonData, "jsonData");
        return this.f126870a.cameraSettingsFromJson(jsonData);
    }

    @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerProxy
    @ProxyFunction(property = "warnings")
    public List<String> getWarnings() {
        return this.f126870a.getWarnings();
    }

    @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerProxy
    public CameraSettings updateCameraSettingsFromJson(CameraSettings settings, String jsonData) {
        Intrinsics.j(settings, "settings");
        Intrinsics.j(jsonData, "jsonData");
        return this.f126870a.updateCameraSettingsFromJson(settings, jsonData);
    }

    @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerProxy
    @ProxyFunction
    public FrameSource updateFrameSourceFromJson(FrameSource frameSource, String jsonData) {
        Intrinsics.j(frameSource, "frameSource");
        Intrinsics.j(jsonData, "jsonData");
        return this.f126870a.updateFrameSourceFromJson(frameSource, jsonData);
    }

    @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerProxy
    @ProxyFunction(nativeName = "updateFrameSourceFromJson")
    public FrameSource updateFrameSourceFromJsonValue(FrameSource frameSource, JsonValue json) {
        Intrinsics.j(frameSource, "frameSource");
        Intrinsics.j(json, "json");
        return this.f126870a.updateFrameSourceFromJsonValue(frameSource, json);
    }

    public final FrameSource frameSourceFromJson(String jsonData) {
        Intrinsics.j(jsonData, "jsonData");
        FrameSource frameSource_frameSourceFromJson = _frameSourceFromJson(jsonData);
        this._helper.clear();
        return frameSource_frameSourceFromJson;
    }

    public final FrameSource frameSourceFromJsonValue$scandit_capture_core(JsonValue json) {
        Intrinsics.j(json, "json");
        FrameSource frameSource_frameSourceFromJsonValue = _frameSourceFromJsonValue(json);
        this._helper.clear();
        return frameSource_frameSourceFromJsonValue;
    }

    public final FrameSourceDeserializerListener getListener() {
        return this.listener;
    }

    public final Helper get_helper() {
        return this._helper;
    }

    public final void setListener(FrameSourceDeserializerListener frameSourceDeserializerListener) {
        this.listener = frameSourceDeserializerListener;
    }

    public FrameSourceDeserializer(List<? extends DataCaptureModeDeserializer> modeDeserializers) {
        Intrinsics.j(modeDeserializers, "modeDeserializers");
        ArrayList arrayList = new ArrayList(CollectionsKt.x(modeDeserializers, 10));
        Iterator<T> it = modeDeserializers.iterator();
        while (it.hasNext()) {
            arrayList.add(((DataCaptureModeDeserializer) it.next()).getF121068c());
        }
        NativeFrameSourceDeserializer nativeFrameSourceDeserializerCreate = NativeFrameSourceDeserializer.create(new ArrayList(arrayList));
        Intrinsics.i(nativeFrameSourceDeserializerCreate, "create(...)");
        this(modeDeserializers, nativeFrameSourceDeserializerCreate);
    }
}
