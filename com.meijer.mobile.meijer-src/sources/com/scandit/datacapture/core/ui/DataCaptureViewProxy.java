package com.scandit.datacapture.core.ui;

import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.MarginsWithUnit;
import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.internal.module.ui.GestureRecognizer;
import com.scandit.datacapture.core.internal.module.ui.NativeDataCaptureView;
import com.scandit.datacapture.core.internal.sdk.ui.NeedsRedrawListener;
import com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H'J\b\u0010\"\u001a\u00020#H'J\b\u0010$\u001a\u00020\u001fH'J\b\u0010%\u001a\u00020\u001fH'J\u0010\u0010&\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H'J\u0010\u0010'\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020)H'J\b\u0010*\u001a\u00020\u001fH'J\u0010\u0010+\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020-H'R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t8g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u000f8g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t8g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0002\u001a\u00020\u00188g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006."}, d2 = {"Lcom/scandit/datacapture/core/ui/DataCaptureViewProxy;", "", "<set-?>", "Lcom/scandit/datacapture/core/common/geometry/Anchor;", "logoAnchor", "getLogoAnchor", "()Lcom/scandit/datacapture/core/common/geometry/Anchor;", "setLogoAnchor", "(Lcom/scandit/datacapture/core/common/geometry/Anchor;)V", "Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "logoOffset", "getLogoOffset", "()Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "setLogoOffset", "(Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;)V", "Lcom/scandit/datacapture/core/ui/LogoStyle;", "logoStyle", "getLogoStyle", "()Lcom/scandit/datacapture/core/ui/LogoStyle;", "setLogoStyle", "(Lcom/scandit/datacapture/core/ui/LogoStyle;)V", "pointOfInterest", "getPointOfInterest", "setPointOfInterest", "Lcom/scandit/datacapture/core/common/geometry/MarginsWithUnit;", "scanAreaMargins", "getScanAreaMargins", "()Lcom/scandit/datacapture/core/common/geometry/MarginsWithUnit;", "setScanAreaMargins", "(Lcom/scandit/datacapture/core/common/geometry/MarginsWithUnit;)V", "_addOverlay", "", "overlay", "Lcom/scandit/datacapture/core/ui/overlay/DataCaptureOverlay;", "_impl", "Lcom/scandit/datacapture/core/internal/module/ui/NativeDataCaptureView;", "_performUiTriggeredZoomIn", "_performUiTriggeredZoomOut", "_removeOverlay", "_setGestureRecognizer", "recognizer", "Lcom/scandit/datacapture/core/internal/module/ui/GestureRecognizer;", "_setNeedsRedraw", "_setNeedsRedrawListener", "listener", "Lcom/scandit/datacapture/core/internal/sdk/ui/NeedsRedrawListener;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeDataCaptureView.class)
/* loaded from: classes12.dex */
public interface DataCaptureViewProxy {
    @ProxyFunction(nativeName = "addOverlay")
    void _addOverlay(DataCaptureOverlay overlay);

    @NativeImpl
    NativeDataCaptureView _impl();

    @ProxyFunction(nativeName = "performUiTriggeredZoomIn")
    void _performUiTriggeredZoomIn();

    @ProxyFunction(nativeName = "performUiTriggeredZoomOut")
    void _performUiTriggeredZoomOut();

    @ProxyFunction(nativeName = "removeOverlay")
    void _removeOverlay(DataCaptureOverlay overlay);

    @ProxyFunction(nativeName = "setGestureRecognizer")
    void _setGestureRecognizer(GestureRecognizer recognizer);

    @ProxyFunction(nativeName = "setNeedsRedraw")
    void _setNeedsRedraw();

    @ProxyFunction(nativeName = "setNeedsRedrawDelegate")
    void _setNeedsRedrawListener(NeedsRedrawListener listener);

    @ProxyFunction(property = "logoAnchor")
    Anchor getLogoAnchor();

    @ProxyFunction(property = "logoOffset")
    PointWithUnit getLogoOffset();

    @ProxyFunction(property = "logoStyle")
    LogoStyle getLogoStyle();

    @ProxyFunction(property = "pointOfInterest")
    PointWithUnit getPointOfInterest();

    @ProxyFunction(property = "scanAreaMargins")
    MarginsWithUnit getScanAreaMargins();

    @ProxyFunction(property = "logoAnchor")
    void setLogoAnchor(Anchor anchor);

    @ProxyFunction(property = "logoOffset")
    void setLogoOffset(PointWithUnit pointWithUnit);

    @ProxyFunction(property = "logoStyle")
    void setLogoStyle(LogoStyle logoStyle);

    @ProxyFunction(property = "pointOfInterest")
    void setPointOfInterest(PointWithUnit pointWithUnit);

    @ProxyFunction(property = "scanAreaMargins")
    void setScanAreaMargins(MarginsWithUnit marginsWithUnit);
}
