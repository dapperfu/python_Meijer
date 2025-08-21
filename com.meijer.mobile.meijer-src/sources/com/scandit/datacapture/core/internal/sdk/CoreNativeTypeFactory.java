package com.scandit.datacapture.core.internal.sdk;

import com.scandit.datacapture.core.area.LocationSelection;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.DataCaptureContextSettings;
import com.scandit.datacapture.core.common.ContextStatus;
import com.scandit.datacapture.core.common.graphic.ImageBuffer;
import com.scandit.datacapture.core.component.DataCaptureComponent;
import com.scandit.datacapture.core.data.FrameData;
import com.scandit.datacapture.core.internal.module.source.NativeAbstractCamera;
import com.scandit.datacapture.core.internal.module.source.NativeCameraSettings;
import com.scandit.datacapture.core.internal.module.ui.GestureListener;
import com.scandit.datacapture.core.internal.module.ui.NativeGestureListener;
import com.scandit.datacapture.core.internal.sdk.area.NativeLocationSelection;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContextSettings;
import com.scandit.datacapture.core.internal.sdk.common.NativeContextStatus;
import com.scandit.datacapture.core.internal.sdk.common.geometry.NativeImageBuffer;
import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeColor;
import com.scandit.datacapture.core.internal.sdk.component.NativeDataCaptureComponent;
import com.scandit.datacapture.core.internal.sdk.data.NativeFrameData;
import com.scandit.datacapture.core.internal.sdk.extensions.NativeColorExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.core.internal.sdk.ui.style.NativeBrush;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeRectangularViewfinderAnimation;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeRectangularViewfinderLineStyle;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeRectangularViewfinderStyle;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.source.Camera;
import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.core.ui.style.Brush;
import com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderAnimation;
import com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderLineStyle;
import com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderLineStyleKt;
import com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderStyle;
import com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderStyleKt;
import com.scandit.datacapture.tools.internal.sdk.ProxyConverter;
import com.scandit.datacapture.tools.internal.sdk.ProxyConverterFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@ProxyConverterFactory
@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u0017\u0010\u0005\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0005\u0010\nJ\u0017\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0005\u0010\rJ\u0017\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0005\u0010\u000eJ\u0017\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0005\u0010\u0011J\u0017\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0005\u0010\u0012J\u0017\u0010\u0005\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0005\u0010\u0015J\u0017\u0010\u0005\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0005\u0010\u0018J\u0017\u0010\u0005\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u0005\u0010\u001bJ\u0017\u0010\u0005\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u0005\u0010\u001dJ\u0017\u0010\u0005\u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u001eH\u0007¢\u0006\u0004\b\u0005\u0010 J\u0017\u0010\u0005\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u001fH\u0007¢\u0006\u0004\b\u0005\u0010!J\u0017\u0010\u0005\u001a\u00020$2\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b\u0005\u0010%J-\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020+0*2\u0016\u0010)\u001a\u0012\u0012\u0004\u0012\u00020'0&j\b\u0012\u0004\u0012\u00020'`(H\u0007¢\u0006\u0004\b\u0005\u0010,J\u0017\u0010\u0005\u001a\u00020.2\u0006\u0010\u0003\u001a\u00020-H\u0007¢\u0006\u0004\b\u0005\u0010/J\u0017\u0010\u0005\u001a\u0002012\u0006\u0010\u0003\u001a\u000200H\u0007¢\u0006\u0004\b\u0005\u00102J\u0017\u0010\u0005\u001a\u0002042\u0006\u0010\u0003\u001a\u000203H\u0007¢\u0006\u0004\b\u0005\u00105J\u0017\u0010\u0005\u001a\u0002072\u0006\u0010\u0003\u001a\u000206H\u0007¢\u0006\u0004\b\u0005\u00108J\u0017\u0010\u0005\u001a\u0002062\u0006\u0010\u0003\u001a\u000207H\u0007¢\u0006\u0004\b\u0005\u00109J\u0017\u0010\u0005\u001a\u00020;2\u0006\u0010\u0003\u001a\u00020:H\u0007¢\u0006\u0004\b\u0005\u0010<J\u0017\u0010\u0005\u001a\u00020:2\u0006\u0010\u0003\u001a\u00020;H\u0007¢\u0006\u0004\b\u0005\u0010=¨\u0006>"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/CoreNativeTypeFactory;", "", "Lcom/scandit/datacapture/core/area/LocationSelection;", "source", "Lcom/scandit/datacapture/core/internal/sdk/area/NativeLocationSelection;", "convert", "(Lcom/scandit/datacapture/core/area/LocationSelection;)Lcom/scandit/datacapture/core/internal/sdk/area/NativeLocationSelection;", "Lcom/scandit/datacapture/core/ui/style/Brush;", "Lcom/scandit/datacapture/core/internal/sdk/ui/style/NativeBrush;", "(Lcom/scandit/datacapture/core/ui/style/Brush;)Lcom/scandit/datacapture/core/internal/sdk/ui/style/NativeBrush;", "(Lcom/scandit/datacapture/core/internal/sdk/ui/style/NativeBrush;)Lcom/scandit/datacapture/core/ui/style/Brush;", "Lcom/scandit/datacapture/core/source/CameraSettings;", "Lcom/scandit/datacapture/core/internal/module/source/NativeCameraSettings;", "(Lcom/scandit/datacapture/core/source/CameraSettings;)Lcom/scandit/datacapture/core/internal/module/source/NativeCameraSettings;", "(Lcom/scandit/datacapture/core/internal/module/source/NativeCameraSettings;)Lcom/scandit/datacapture/core/source/CameraSettings;", "Lcom/scandit/datacapture/core/common/ContextStatus;", "Lcom/scandit/datacapture/core/internal/sdk/common/NativeContextStatus;", "(Lcom/scandit/datacapture/core/common/ContextStatus;)Lcom/scandit/datacapture/core/internal/sdk/common/NativeContextStatus;", "(Lcom/scandit/datacapture/core/internal/sdk/common/NativeContextStatus;)Lcom/scandit/datacapture/core/common/ContextStatus;", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureContext;", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "(Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureContext;)Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;", "Lcom/scandit/datacapture/core/json/JsonValue;", "(Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;)Lcom/scandit/datacapture/core/json/JsonValue;", "Lcom/scandit/datacapture/core/internal/sdk/data/NativeFrameData;", "Lcom/scandit/datacapture/core/data/FrameData;", "(Lcom/scandit/datacapture/core/internal/sdk/data/NativeFrameData;)Lcom/scandit/datacapture/core/data/FrameData;", "", "(Ljava/lang/String;)Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;", "Lcom/scandit/datacapture/core/internal/sdk/common/graphics/NativeColor;", "", "(Lcom/scandit/datacapture/core/internal/sdk/common/graphics/NativeColor;)I", "(I)Lcom/scandit/datacapture/core/internal/sdk/common/graphics/NativeColor;", "Lcom/scandit/datacapture/core/source/Camera;", "camera", "Lcom/scandit/datacapture/core/internal/module/source/NativeAbstractCamera;", "(Lcom/scandit/datacapture/core/source/Camera;)Lcom/scandit/datacapture/core/internal/module/source/NativeAbstractCamera;", "Ljava/util/ArrayList;", "Lcom/scandit/datacapture/core/internal/sdk/component/NativeDataCaptureComponent;", "Lkotlin/collections/ArrayList;", "components", "", "Lcom/scandit/datacapture/core/component/DataCaptureComponent;", "(Ljava/util/ArrayList;)Ljava/util/List;", "Lcom/scandit/datacapture/core/internal/module/ui/NativeGestureListener;", "Lcom/scandit/datacapture/core/internal/module/ui/GestureListener;", "(Lcom/scandit/datacapture/core/internal/module/ui/NativeGestureListener;)Lcom/scandit/datacapture/core/internal/module/ui/GestureListener;", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureContextSettings;", "Lcom/scandit/datacapture/core/capture/DataCaptureContextSettings;", "(Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureContextSettings;)Lcom/scandit/datacapture/core/capture/DataCaptureContextSettings;", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeRectangularViewfinderAnimation;", "Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderAnimation;", "(Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeRectangularViewfinderAnimation;)Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderAnimation;", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeRectangularViewfinderStyle;", "Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderStyle;", "(Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeRectangularViewfinderStyle;)Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderStyle;", "(Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderStyle;)Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeRectangularViewfinderStyle;", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeRectangularViewfinderLineStyle;", "Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderLineStyle;", "(Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeRectangularViewfinderLineStyle;)Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderLineStyle;", "(Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderLineStyle;)Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeRectangularViewfinderLineStyle;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class CoreNativeTypeFactory {
    public static final CoreNativeTypeFactory INSTANCE = new CoreNativeTypeFactory();

    @ProxyConverter
    public final NativeLocationSelection convert(LocationSelection source) {
        Intrinsics.j(source, "source");
        return source.getF124969c();
    }

    @ProxyConverter
    public final NativeBrush convert(Brush source) {
        Intrinsics.j(source, "source");
        return new NativeBrush(NativeColorExtensionsKt.toNativeColor(source.getFillColor()), NativeColorExtensionsKt.toNativeColor(source.getStrokeColor()), source.getStrokeWidth());
    }

    private CoreNativeTypeFactory() {
    }

    @ProxyConverter
    public final Brush convert(NativeBrush source) {
        Intrinsics.j(source, "source");
        NativeColor fillColor = source.getFillColor();
        Intrinsics.i(fillColor, "getFillColor(...)");
        int i10 = NativeColorExtensionsKt.toInt(fillColor);
        NativeColor strokeColor = source.getStrokeColor();
        Intrinsics.i(strokeColor, "getStrokeColor(...)");
        return new Brush(i10, NativeColorExtensionsKt.toInt(strokeColor), source.getStrokeWidth());
    }

    @ProxyConverter
    public final NativeCameraSettings convert(CameraSettings source) {
        Intrinsics.j(source, "source");
        return source._impl$scandit_capture_core();
    }

    @ProxyConverter
    public final CameraSettings convert(NativeCameraSettings source) {
        Intrinsics.j(source, "source");
        return new CameraSettings(source);
    }

    @ProxyConverter
    public final NativeContextStatus convert(ContextStatus source) {
        Intrinsics.j(source, "source");
        return new NativeContextStatus(source.getMessage(), source.getCode());
    }

    @ProxyConverter
    public final ContextStatus convert(NativeContextStatus source) {
        Intrinsics.j(source, "source");
        return new ContextStatus(source);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ProxyConverter
    public final DataCaptureContext convert(NativeDataCaptureContext source) {
        Intrinsics.j(source, "source");
        return new DataCaptureContext(source, null, 2, 0 == true ? 1 : 0);
    }

    @ProxyConverter
    public final JsonValue convert(NativeJsonValue source) {
        Intrinsics.j(source, "source");
        return new JsonValue(source);
    }

    @ProxyConverter
    public final FrameData convert(NativeFrameData source) {
        Intrinsics.j(source, "source");
        return new FrameData(source) { // from class: com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory.convert.1

            /* renamed from: a, reason: collision with root package name */
            private final NativeFrameData f126294a;

            @Override // com.scandit.datacapture.core.data.FrameData
            /* renamed from: _impl, reason: from getter */
            public NativeFrameData getF126294a() {
                return this.f126294a;
            }

            @Override // com.scandit.datacapture.core.data.FrameData
            public boolean equals(Object other) {
                if (other instanceof FrameData) {
                    return Intrinsics.e(this.f126294a, ((FrameData) other).getF126294a());
                }
                return false;
            }

            @Override // com.scandit.datacapture.core.data.FrameData
            public ImageBuffer getImageBuffer() {
                NativeImageBuffer imageBuffer = this.f126294a.getImageBuffer();
                Intrinsics.i(imageBuffer, "getImageBuffer(...)");
                return new ImageBuffer(imageBuffer);
            }

            @Override // com.scandit.datacapture.core.data.FrameData
            public int getOrientation() {
                return this.f126294a.getOrientation();
            }

            @Override // com.scandit.datacapture.core.data.FrameData
            public long getTimestamp() {
                return this.f126294a.getTimestampForAndroid();
            }

            @Override // com.scandit.datacapture.core.data.FrameData
            public int hashCode() {
                return this.f126294a.hashCode();
            }

            @Override // com.scandit.datacapture.core.data.FrameData
            public void release() {
                this.f126294a.release();
            }

            @Override // com.scandit.datacapture.core.data.FrameData
            public void retain() {
                this.f126294a.retain();
            }

            {
                this.f126294a = source;
            }
        };
    }

    @ProxyConverter
    public final NativeJsonValue convert(String source) {
        Intrinsics.j(source, "source");
        NativeJsonValue nativeJsonValueFromString = NativeJsonValue.fromString(source);
        Intrinsics.i(nativeJsonValueFromString, "fromString(...)");
        return nativeJsonValueFromString;
    }

    @ProxyConverter
    public final int convert(NativeColor source) {
        Intrinsics.j(source, "source");
        return NativeColorExtensionsKt.toInt(source);
    }

    @ProxyConverter
    public final NativeColor convert(int source) {
        return NativeColorExtensionsKt.toNativeColor(source);
    }

    @ProxyConverter
    public final NativeAbstractCamera convert(Camera camera) {
        Intrinsics.j(camera, "camera");
        NativeAbstractCamera nativeAbstractCameraAsAbstractCamera = camera.getF126823a().asAbstractCamera();
        Intrinsics.i(nativeAbstractCameraAsAbstractCamera, "asAbstractCamera(...)");
        return nativeAbstractCameraAsAbstractCamera;
    }

    @ProxyConverter
    public final GestureListener convert(NativeGestureListener source) {
        Intrinsics.j(source, "source");
        return new GestureListener(source);
    }

    @ProxyConverter
    public final DataCaptureContextSettings convert(NativeDataCaptureContextSettings source) {
        Intrinsics.j(source, "source");
        return new DataCaptureContextSettings(source);
    }

    @ProxyConverter
    public final RectangularViewfinderAnimation convert(NativeRectangularViewfinderAnimation source) {
        Intrinsics.j(source, "source");
        return new RectangularViewfinderAnimation(source);
    }

    @ProxyConverter
    public final RectangularViewfinderStyle convert(NativeRectangularViewfinderStyle source) {
        Intrinsics.j(source, "source");
        return RectangularViewfinderStyleKt.fromNative(source);
    }

    @ProxyConverter
    public final NativeRectangularViewfinderStyle convert(RectangularViewfinderStyle source) {
        Intrinsics.j(source, "source");
        return RectangularViewfinderStyleKt.toNative(source);
    }

    @ProxyConverter
    public final RectangularViewfinderLineStyle convert(NativeRectangularViewfinderLineStyle source) {
        Intrinsics.j(source, "source");
        return RectangularViewfinderLineStyleKt.fromNative(source);
    }

    @ProxyConverter
    public final NativeRectangularViewfinderLineStyle convert(RectangularViewfinderLineStyle source) {
        Intrinsics.j(source, "source");
        return RectangularViewfinderLineStyleKt.toNative(source);
    }

    @ProxyConverter
    public final List<DataCaptureComponent> convert(ArrayList<NativeDataCaptureComponent> components) {
        Intrinsics.j(components, "components");
        ArrayList arrayList = new ArrayList(CollectionsKt.x(components, 10));
        Iterator<T> it = components.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.scandit.datacapture.core.internal.module.component.a((NativeDataCaptureComponent) it.next()));
        }
        return arrayList;
    }
}
