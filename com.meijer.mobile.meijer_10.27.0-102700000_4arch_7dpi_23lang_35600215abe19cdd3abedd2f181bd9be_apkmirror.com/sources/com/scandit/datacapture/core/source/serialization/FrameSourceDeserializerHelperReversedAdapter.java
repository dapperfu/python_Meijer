package com.scandit.datacapture.core.source.serialization;

import com.fullstory.FS;
import com.scandit.datacapture.core.internal.module.serialization.NativeFrameSourceDeserializerHelper;
import com.scandit.datacapture.core.internal.module.source.NativeAbstractCamera;
import com.scandit.datacapture.core.internal.module.source.NativeCameraSettings;
import com.scandit.datacapture.core.internal.module.source.NativeFrameSource;
import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.core.internal.sdk.source.NativeAndroidCamera;
import com.scandit.datacapture.core.internal.sdk.source.NativeFrameDataCollectionFrameSource;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.source.BitmapFrameSource;
import com.scandit.datacapture.core.source.Camera;
import com.scandit.datacapture.core.source.CameraPosition;
import com.scandit.datacapture.core.source.FrameSource;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001a\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializerHelperReversedAdapter;", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeFrameSourceDeserializerHelper;", "Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializerHelper;", "helper", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializerHelper;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "Lcom/scandit/datacapture/core/source/CameraPosition;", "position", "Lcom/scandit/datacapture/core/internal/module/source/NativeCameraSettings;", "settings", "", "cameraDeviceType", "cameraSubtype", "Lcom/scandit/datacapture/core/internal/module/source/NativeAbstractCamera;", "createCamera", "(Lcom/scandit/datacapture/core/source/CameraPosition;Lcom/scandit/datacapture/core/internal/module/source/NativeCameraSettings;Ljava/lang/String;Ljava/lang/String;)Lcom/scandit/datacapture/core/internal/module/source/NativeAbstractCamera;", "camera", "", "applySettings", "(Lcom/scandit/datacapture/core/internal/module/source/NativeAbstractCamera;Lcom/scandit/datacapture/core/internal/module/source/NativeCameraSettings;)V", "Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;", "json", "updateCameraFromJson", "(Lcom/scandit/datacapture/core/internal/module/source/NativeAbstractCamera;Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;)V", "base64Image", "Lcom/scandit/datacapture/core/internal/module/source/NativeFrameSource;", "createImageFrameSource", "(Ljava/lang/String;)Lcom/scandit/datacapture/core/internal/module/source/NativeFrameSource;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class FrameSourceDeserializerHelperReversedAdapter extends NativeFrameSourceDeserializerHelper {

    /* renamed from: a, reason: collision with root package name */
    private final FrameSourceDeserializerHelper f125922a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    public /* synthetic */ FrameSourceDeserializerHelperReversedAdapter(FrameSourceDeserializerHelper frameSourceDeserializerHelper, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(frameSourceDeserializerHelper, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }

    @Override // com.scandit.datacapture.core.internal.module.serialization.NativeFrameSourceDeserializerHelper
    public void applySettings(NativeAbstractCamera camera, NativeCameraSettings settings) throws Exception {
        Intrinsics.j(camera, "camera");
        Intrinsics.j(settings, "settings");
        try {
            ProxyCache proxyCache = this.proxyCache;
            KClass kClassB = Reflection.b(NativeFrameSource.class);
            NativeFrameSource nativeFrameSourceAsFrameSource = camera.asFrameSource();
            Intrinsics.i(nativeFrameSourceAsFrameSource, "asFrameSource(...)");
            FrameSource frameSource = (FrameSource) proxyCache.require(kClassB, null, nativeFrameSourceAsFrameSource);
            Camera camera2 = frameSource instanceof Camera ? (Camera) frameSource : null;
            if (camera2 != null) {
                this.f125922a.applySettings(camera2, CoreNativeTypeFactory.INSTANCE.convert(settings));
                return;
            }
            throw new IllegalStateException(("No cached kotlin version of Camera (" + camera + ") found (cast failure).").toString());
        } catch (Exception e10) {
            FS.log_e("ScanditDataCapture", "Exception caught in listener method. Rethrowing...", e10);
            throw e10;
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.serialization.NativeFrameSourceDeserializerHelper
    public NativeAbstractCamera createCamera(CameraPosition position, NativeCameraSettings settings, String cameraDeviceType, String cameraSubtype) throws Exception {
        NativeAndroidCamera f125871a;
        Intrinsics.j(position, "position");
        Intrinsics.j(settings, "settings");
        Intrinsics.j(cameraDeviceType, "cameraDeviceType");
        Intrinsics.j(cameraSubtype, "cameraSubtype");
        try {
            Camera cameraCreateCamera = this.f125922a.createCamera(position, CoreNativeTypeFactory.INSTANCE.convert(settings), cameraDeviceType, cameraSubtype);
            if (cameraCreateCamera != null) {
                ProxyCache proxyCache = this.proxyCache;
                KClass kClassB = Reflection.b(NativeFrameSource.class);
                NativeFrameSource nativeFrameSourceAsFrameSource = cameraCreateCamera.getF125871a().asFrameSource();
                Intrinsics.i(nativeFrameSourceAsFrameSource, "asFrameSource(...)");
                proxyCache.put(kClassB, null, nativeFrameSourceAsFrameSource, cameraCreateCamera);
            } else {
                cameraCreateCamera = null;
            }
            if (cameraCreateCamera == null || (f125871a = cameraCreateCamera.getF125871a()) == null) {
                return null;
            }
            return f125871a.asAbstractCamera();
        } catch (Exception e10) {
            FS.log_e("ScanditDataCapture", "Exception caught in listener method. Rethrowing...", e10);
            throw e10;
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.serialization.NativeFrameSourceDeserializerHelper
    public NativeFrameSource createImageFrameSource(String base64Image) throws Exception {
        NativeFrameDataCollectionFrameSource nativeFrameDataCollectionFrameSource_impl;
        Intrinsics.j(base64Image, "base64Image");
        try {
            FrameSource frameSourceCreateImageFrameSource = this.f125922a.createImageFrameSource(base64Image);
            BitmapFrameSource bitmapFrameSource = frameSourceCreateImageFrameSource instanceof BitmapFrameSource ? (BitmapFrameSource) frameSourceCreateImageFrameSource : null;
            if (bitmapFrameSource != null) {
                ProxyCache proxyCache = this.proxyCache;
                KClass kClassB = Reflection.b(NativeFrameSource.class);
                NativeFrameSource nativeFrameSourceAsFrameSource = bitmapFrameSource._impl().asFrameSource();
                Intrinsics.i(nativeFrameSourceAsFrameSource, "asFrameSource(...)");
                proxyCache.put(kClassB, null, nativeFrameSourceAsFrameSource, bitmapFrameSource);
            } else {
                bitmapFrameSource = null;
            }
            if (bitmapFrameSource == null || (nativeFrameDataCollectionFrameSource_impl = bitmapFrameSource._impl()) == null) {
                return null;
            }
            return nativeFrameDataCollectionFrameSource_impl.asFrameSource();
        } catch (Exception e10) {
            FS.log_e("ScanditDataCapture", "Exception caught in listener method. Rethrowing...", e10);
            throw e10;
        }
    }

    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.internal.module.serialization.NativeFrameSourceDeserializerHelper
    public void updateCameraFromJson(NativeAbstractCamera camera, NativeJsonValue json) throws Exception {
        Intrinsics.j(camera, "camera");
        Intrinsics.j(json, "json");
        try {
            ProxyCache proxyCache = this.proxyCache;
            KClass kClassB = Reflection.b(NativeFrameSource.class);
            NativeFrameSource nativeFrameSourceAsFrameSource = camera.asFrameSource();
            Intrinsics.i(nativeFrameSourceAsFrameSource, "asFrameSource(...)");
            FrameSource frameSource = (FrameSource) proxyCache.require(kClassB, null, nativeFrameSourceAsFrameSource);
            Camera camera2 = frameSource instanceof Camera ? (Camera) frameSource : null;
            if (camera2 != null) {
                this.f125922a.updateCameraFromJson(camera2, new JsonValue(json));
                return;
            }
            throw new IllegalStateException(("No cached kotlin version of Camera (" + camera + ") found (cast failure).").toString());
        } catch (Exception e10) {
            FS.log_e("ScanditDataCapture", "Exception caught in listener method. Rethrowing...", e10);
            throw e10;
        }
    }

    public FrameSourceDeserializerHelperReversedAdapter(FrameSourceDeserializerHelper helper, ProxyCache proxyCache) {
        Intrinsics.j(helper, "helper");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f125922a = helper;
        this.proxyCache = proxyCache;
    }
}
