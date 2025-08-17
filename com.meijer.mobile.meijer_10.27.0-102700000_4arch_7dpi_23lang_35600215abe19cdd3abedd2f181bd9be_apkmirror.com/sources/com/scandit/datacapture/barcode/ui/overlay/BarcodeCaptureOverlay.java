package com.scandit.datacapture.barcode.ui.overlay;

import com.scandit.datacapture.barcode.capture.BarcodeCapture;
import com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializer;
import com.scandit.datacapture.barcode.internal.module.ui.NativeBarcodeCaptureOverlay;
import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.internal.sdk.extensions.BrushExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeDataCaptureOverlay;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.OverlayPreconditionsKt;
import com.scandit.datacapture.core.internal.sdk.ui.style.NativeBrush;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay;
import com.scandit.datacapture.core.ui.style.Brush;
import com.scandit.datacapture.core.ui.viewfinder.Viewfinder;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 12\u00020\u00012\u00020\u0002:\u00011B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003H\u0097\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017R.\u0010\u001f\u001a\u0004\u0018\u00010\u00182\b\u0010\u000f\u001a\u0004\u0018\u00010\u00188\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010&\u001a\u00020 2\u0006\u0010!\u001a\u00020 8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010,\u001a\u00020'2\u0006\u0010!\u001a\u00020'8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00062"}, d2 = {"Lcom/scandit/datacapture/barcode/ui/overlay/BarcodeCaptureOverlay;", "Lcom/scandit/datacapture/core/ui/overlay/DataCaptureOverlay;", "Lcom/scandit/datacapture/barcode/ui/overlay/BarcodeCaptureOverlayProxy;", "Lcom/scandit/datacapture/barcode/internal/module/ui/NativeBarcodeCaptureOverlay;", "impl", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/ui/NativeBarcodeCaptureOverlay;)V", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/NativeDataCaptureOverlay;", "_dataCaptureOverlayImpl", "()Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/NativeDataCaptureOverlay;", "_impl", "()Lcom/scandit/datacapture/barcode/internal/module/ui/NativeBarcodeCaptureOverlay;", "", "name", "", "value", "", "setProperty", "(Ljava/lang/String;Ljava/lang/Object;)V", "getProperty", "(Ljava/lang/String;)Ljava/lang/Object;", "jsonData", "updateFromJson", "(Ljava/lang/String;)V", "Lcom/scandit/datacapture/core/ui/viewfinder/Viewfinder;", "c", "Lcom/scandit/datacapture/core/ui/viewfinder/Viewfinder;", "getViewfinder", "()Lcom/scandit/datacapture/core/ui/viewfinder/Viewfinder;", "setViewfinder", "(Lcom/scandit/datacapture/core/ui/viewfinder/Viewfinder;)V", "viewfinder", "Lcom/scandit/datacapture/core/ui/style/Brush;", "<set-?>", "getBrush", "()Lcom/scandit/datacapture/core/ui/style/Brush;", "setBrush", "(Lcom/scandit/datacapture/core/ui/style/Brush;)V", "brush", "", "getShouldShowScanAreaGuides", "()Z", "setShouldShowScanAreaGuides", "(Z)V", "shouldShowScanAreaGuides", "Lcom/scandit/datacapture/barcode/ui/overlay/BarcodeCaptureOverlayStyle;", "getStyle", "()Lcom/scandit/datacapture/barcode/ui/overlay/BarcodeCaptureOverlayStyle;", "style", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
@Mockable
/* loaded from: classes11.dex */
public final class BarcodeCaptureOverlay implements DataCaptureOverlay, BarcodeCaptureOverlayProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ BarcodeCaptureOverlayProxyAdapter f124003a;

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f124004b;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Viewfinder viewfinder;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0007\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/scandit/datacapture/barcode/ui/overlay/BarcodeCaptureOverlay$Companion;", "", "Lcom/scandit/datacapture/barcode/capture/BarcodeCapture;", "mode", "Lcom/scandit/datacapture/core/ui/DataCaptureView;", "view", "Lcom/scandit/datacapture/barcode/ui/overlay/BarcodeCaptureOverlay;", "newInstance", "(Lcom/scandit/datacapture/barcode/capture/BarcodeCapture;Lcom/scandit/datacapture/core/ui/DataCaptureView;)Lcom/scandit/datacapture/barcode/ui/overlay/BarcodeCaptureOverlay;", "Lcom/scandit/datacapture/barcode/ui/overlay/BarcodeCaptureOverlayStyle;", "style", "(Lcom/scandit/datacapture/barcode/capture/BarcodeCapture;Lcom/scandit/datacapture/core/ui/DataCaptureView;Lcom/scandit/datacapture/barcode/ui/overlay/BarcodeCaptureOverlayStyle;)Lcom/scandit/datacapture/barcode/ui/overlay/BarcodeCaptureOverlay;", "", "jsonData", "fromJson", "(Lcom/scandit/datacapture/barcode/capture/BarcodeCapture;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/ui/overlay/BarcodeCaptureOverlay;", "Lcom/scandit/datacapture/core/ui/style/Brush;", "defaultBrush", "(Lcom/scandit/datacapture/barcode/ui/overlay/BarcodeCaptureOverlayStyle;)Lcom/scandit/datacapture/core/ui/style/Brush;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        @JvmStatic
        public final BarcodeCaptureOverlay newInstance(BarcodeCapture mode, DataCaptureView view) {
            Intrinsics.j(mode, "mode");
            OverlayPreconditionsKt.checkAttachedToSameDataCaptureContext(mode, view, a.f124012a);
            BarcodeCaptureOverlay barcodeCaptureOverlay = new BarcodeCaptureOverlay(mode, null);
            if (view != null) {
                view.addOverlay(barcodeCaptureOverlay);
            }
            return barcodeCaptureOverlay;
        }

        @JvmStatic
        public final Brush defaultBrush(BarcodeCaptureOverlayStyle style) {
            Intrinsics.j(style, "style");
            Brush.Companion companion = Brush.INSTANCE;
            NativeBrush defaultBrushForStyle = NativeBarcodeCaptureOverlay.getDefaultBrushForStyle(BarcodeCaptureOverlayStyleKt.toNative(style));
            Intrinsics.i(defaultBrushForStyle, "getDefaultBrushForStyle(...)");
            return BrushExtensionsKt.of(companion, defaultBrushForStyle);
        }

        @JvmStatic
        public final BarcodeCaptureOverlay fromJson(BarcodeCapture mode, String jsonData) {
            Intrinsics.j(mode, "mode");
            Intrinsics.j(jsonData, "jsonData");
            return new BarcodeCaptureDeserializer().overlayFromJson(mode, jsonData);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @JvmStatic
        public final BarcodeCaptureOverlay newInstance(BarcodeCapture mode, DataCaptureView view, BarcodeCaptureOverlayStyle style) {
            Intrinsics.j(mode, "mode");
            Intrinsics.j(style, "style");
            OverlayPreconditionsKt.checkAttachedToSameDataCaptureContext(mode, view, b.f124013a);
            BarcodeCaptureOverlay barcodeCaptureOverlay = new BarcodeCaptureOverlay(mode, style, null);
            if (view != null) {
                view.addOverlay(barcodeCaptureOverlay);
            }
            return barcodeCaptureOverlay;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BarcodeCaptureOverlay(NativeBarcodeCaptureOverlay impl) {
        Intrinsics.j(impl, "impl");
        this.f124003a = new BarcodeCaptureOverlayProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
        this.f124004b = new HashMap();
    }

    @JvmStatic
    public static final Brush defaultBrush(BarcodeCaptureOverlayStyle barcodeCaptureOverlayStyle) {
        return INSTANCE.defaultBrush(barcodeCaptureOverlayStyle);
    }

    @JvmStatic
    public static final BarcodeCaptureOverlay fromJson(BarcodeCapture barcodeCapture, String str) {
        return INSTANCE.fromJson(barcodeCapture, str);
    }

    @JvmStatic
    public static final BarcodeCaptureOverlay newInstance(BarcodeCapture barcodeCapture, DataCaptureView dataCaptureView) {
        return INSTANCE.newInstance(barcodeCapture, dataCaptureView);
    }

    @Override // com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay, com.scandit.datacapture.barcode.batch.ui.overlay.BarcodeBatchAdvancedOverlayProxy
    @NativeImpl
    /* renamed from: _dataCaptureOverlayImpl */
    public NativeDataCaptureOverlay getF124008c() {
        return this.f124003a.getF124008c();
    }

    @Override // com.scandit.datacapture.barcode.ui.overlay.BarcodeCaptureOverlayProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeBarcodeCaptureOverlay getF124006a() {
        return this.f124003a.getF124006a();
    }

    @Override // com.scandit.datacapture.barcode.ui.overlay.BarcodeCaptureOverlayProxy
    @ProxyFunction(nativeName = "getBrushForRecognizedBarcodes", property = "brush")
    public Brush getBrush() {
        return this.f124003a.getBrush();
    }

    @Override // com.scandit.datacapture.barcode.ui.overlay.BarcodeCaptureOverlayProxy
    @ProxyFunction(property = "shouldShowScanAreaGuides")
    public boolean getShouldShowScanAreaGuides() {
        return this.f124003a.getShouldShowScanAreaGuides();
    }

    @Override // com.scandit.datacapture.barcode.ui.overlay.BarcodeCaptureOverlayProxy
    @ProxyFunction(property = "style")
    public BarcodeCaptureOverlayStyle getStyle() {
        return this.f124003a.getStyle();
    }

    @Override // com.scandit.datacapture.barcode.ui.overlay.BarcodeCaptureOverlayProxy
    @ProxyFunction(nativeName = "setBrushForRecognizedBarcodes", property = "brush")
    public void setBrush(Brush brush) {
        Intrinsics.j(brush, "<set-?>");
        this.f124003a.setBrush(brush);
    }

    @Override // com.scandit.datacapture.barcode.ui.overlay.BarcodeCaptureOverlayProxy
    @ProxyFunction(property = "shouldShowScanAreaGuides")
    public void setShouldShowScanAreaGuides(boolean z10) {
        this.f124003a.setShouldShowScanAreaGuides(z10);
    }

    @JvmStatic
    public static final BarcodeCaptureOverlay newInstance(BarcodeCapture barcodeCapture, DataCaptureView dataCaptureView, BarcodeCaptureOverlayStyle barcodeCaptureOverlayStyle) {
        return INSTANCE.newInstance(barcodeCapture, dataCaptureView, barcodeCaptureOverlayStyle);
    }

    public final Object getProperty(String name) {
        Intrinsics.j(name, "name");
        return this.f124004b.get(name);
    }

    public final Viewfinder getViewfinder() {
        return this.viewfinder;
    }

    public final void setProperty(String name, Object value) {
        NativeBrush nativeBrushConvert;
        Intrinsics.j(name, "name");
        this.f124004b.put(name, value);
        if (Intrinsics.e(name, "localizedOnlyBarcodeBrush")) {
            if (value == null) {
                nativeBrushConvert = NativeBarcodeCaptureOverlay.defaultBrushForLocalizedOnlyBarcodes();
                Intrinsics.g(nativeBrushConvert);
            } else {
                nativeBrushConvert = CoreNativeTypeFactory.INSTANCE.convert((Brush) value);
            }
            getF124006a().setBrushForLocalizedOnlyBarcodes(nativeBrushConvert);
            getF124006a().setShouldDrawLocalizedOnlyBarcodes(true);
        }
    }

    public final void setViewfinder(Viewfinder viewfinder) {
        this.viewfinder = viewfinder;
        getF124006a().setViewfinder(viewfinder != null ? viewfinder.getF126190c() : null);
    }

    public final void updateFromJson(String jsonData) {
        Intrinsics.j(jsonData, "jsonData");
        new BarcodeCaptureDeserializer().updateOverlayFromJson(this, jsonData);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BarcodeCaptureOverlay(BarcodeCapture barcodeCapture, DefaultConstructorMarker defaultConstructorMarker) {
        NativeBarcodeCaptureOverlay nativeBarcodeCaptureOverlayCreateWithDefaultStyle = NativeBarcodeCaptureOverlay.createWithDefaultStyle(barcodeCapture.getF120539a());
        Intrinsics.i(nativeBarcodeCaptureOverlayCreateWithDefaultStyle, "createWithDefaultStyle(...)");
        this(nativeBarcodeCaptureOverlayCreateWithDefaultStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BarcodeCaptureOverlay(BarcodeCapture barcodeCapture, BarcodeCaptureOverlayStyle barcodeCaptureOverlayStyle, DefaultConstructorMarker defaultConstructorMarker) {
        NativeBarcodeCaptureOverlay nativeBarcodeCaptureOverlayCreate = NativeBarcodeCaptureOverlay.create(barcodeCapture.getF120539a(), BarcodeCaptureOverlayStyleKt.toNative(barcodeCaptureOverlayStyle));
        Intrinsics.i(nativeBarcodeCaptureOverlayCreate, "create(...)");
        this(nativeBarcodeCaptureOverlayCreate);
    }
}
