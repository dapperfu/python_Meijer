package com.scandit.datacapture.barcode.pick.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Paint;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.scandit.datacapture.barcode.hardwarebutton.HardwareButtonHelperKt;
import com.scandit.datacapture.barcode.hardwarebutton.HardwareKeyEvent;
import com.scandit.datacapture.barcode.internal.module.pick.capture.CameraManager;
import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickSession;
import com.scandit.datacapture.barcode.internal.module.pick.ui.BarcodePickBasicOverlay;
import com.scandit.datacapture.barcode.internal.module.pick.ui.datacaptureview.BarcodePickDataCaptureViewWrapper;
import com.scandit.datacapture.barcode.internal.module.pick.ui.guidances.BarcodePickGuidanceHandler;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickHighlightStyleIconsHolder;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.BarcodePickElementsCache;
import com.scandit.datacapture.barcode.internal.module.ui.exitbutton.ExitButtonWrapper;
import com.scandit.datacapture.barcode.internal.module.ui.shutterbutton.ShutterButtonWrapper;
import com.scandit.datacapture.barcode.internal.sdk.pick.ui.BarcodePickViewSettingsDefaults;
import com.scandit.datacapture.barcode.internal.sdk.ui.InternalPropertyManager;
import com.scandit.datacapture.barcode.pick.capture.BarcodePick;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickActionListener;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.common.geometry.Size2;
import com.scandit.datacapture.core.internal.sdk.common.async.MainThreadHelper;
import com.scandit.datacapture.core.internal.sdk.extensions.ViewExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import com.scandit.datacapture.core.source.CameraPosition;
import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 S2\u00020\u0001:\u0001SB\u0081\u0001\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u0014\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010$\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u001eH\u0014¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020#H\u0007¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020#H\u0007¢\u0006\u0004\b(\u0010'J\u000f\u0010)\u001a\u00020#H\u0007¢\u0006\u0004\b)\u0010'J\u000f\u0010*\u001a\u00020#H\u0007¢\u0006\u0004\b*\u0010'J\u000f\u0010+\u001a\u00020#H\u0007¢\u0006\u0004\b+\u0010'J\u000f\u0010,\u001a\u00020#H\u0007¢\u0006\u0004\b,\u0010'J\u000f\u0010-\u001a\u00020#H\u0007¢\u0006\u0004\b-\u0010'J\u0015\u00100\u001a\u00020#2\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J\u0015\u00102\u001a\u00020#2\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b2\u00101J\u0017\u00105\u001a\u00020#2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b3\u00104J\u000f\u00107\u001a\u00020#H\u0000¢\u0006\u0004\b6\u0010'J\u000f\u00109\u001a\u00020#H\u0000¢\u0006\u0004\b8\u0010'J\u000f\u0010;\u001a\u00020#H\u0000¢\u0006\u0004\b:\u0010'J\u000f\u0010=\u001a\u00020#H\u0000¢\u0006\u0004\b<\u0010'R$\u0010/\u001a\u0004\u0018\u00010>8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR$\u0010L\u001a\u0004\u0018\u00010E8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0017\u0010R\u001a\u00020M8\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q¨\u0006T"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickView;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "parentView", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePick;", "mode", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewSettings;", "viewSettings", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/CameraManager;", "cameraManager", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/highlightstyle/elementsprovider/BarcodePickElementsCache;", "elementsHandler", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/highlightdrawer/BarcodePickDrawer;", "drawer", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/datacaptureview/BarcodePickDataCaptureViewWrapper;", "captureViewWrapper", "Lcom/scandit/datacapture/barcode/internal/module/ui/shutterbutton/ShutterButtonWrapper;", "shutterButtonWrapper", "Lcom/scandit/datacapture/barcode/internal/module/ui/exitbutton/ExitButtonWrapper;", "exitButtonWrapper", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/guidances/BarcodePickGuidanceHandler;", "guidanceHandler", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/BarcodePickBasicOverlay;", "barcodePickBasicOverlay", "<init>", "(Landroid/content/Context;Landroid/view/ViewGroup;Lcom/scandit/datacapture/core/capture/DataCaptureContext;Lcom/scandit/datacapture/barcode/pick/capture/BarcodePick;Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewSettings;Lcom/scandit/datacapture/barcode/internal/module/pick/capture/CameraManager;Lcom/scandit/datacapture/barcode/internal/module/pick/ui/highlightstyle/elementsprovider/BarcodePickElementsCache;Lcom/scandit/datacapture/barcode/internal/module/pick/ui/highlightdrawer/BarcodePickDrawer;Lcom/scandit/datacapture/barcode/internal/module/pick/ui/datacaptureview/BarcodePickDataCaptureViewWrapper;Lcom/scandit/datacapture/barcode/internal/module/ui/shutterbutton/ShutterButtonWrapper;Lcom/scandit/datacapture/barcode/internal/module/ui/exitbutton/ExitButtonWrapper;Lcom/scandit/datacapture/barcode/internal/module/pick/ui/guidances/BarcodePickGuidanceHandler;Lcom/scandit/datacapture/barcode/internal/module/pick/ui/BarcodePickBasicOverlay;)V", "", "w", "h", "oldw", "oldh", "", "onSizeChanged", "(IIII)V", "onResume", "()V", "onPause", "onDestroy", "start", "stop", "freeze", "reset", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickActionListener;", "listener", "addActionListener", "(Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickActionListener;)V", "removeActionListener", "_applySettings$scandit_barcode_capture", "(Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewSettings;)V", "_applySettings", "onStatusListenerStarted$scandit_barcode_capture", "onStatusListenerStarted", "onStatusListenerFreezed$scandit_barcode_capture", "onStatusListenerFreezed", "onStatusListenerPaused$scandit_barcode_capture", "onStatusListenerPaused", "onStatusListenerStopped$scandit_barcode_capture", "onStatusListenerStopped", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewListener;", "i", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewListener;", "getListener", "()Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewListener;", "setListener", "(Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewListener;)V", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewUiListener;", "j", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewUiListener;", "getUiListener", "()Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewUiListener;", "setUiListener", "(Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewUiListener;)V", "uiListener", "Lcom/scandit/datacapture/barcode/internal/sdk/ui/InternalPropertyManager;", "k", "Lcom/scandit/datacapture/barcode/internal/sdk/ui/InternalPropertyManager;", "get_internalPropertyManager", "()Lcom/scandit/datacapture/barcode/internal/sdk/ui/InternalPropertyManager;", "_internalPropertyManager", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class BarcodePickView extends RelativeLayout {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final BarcodePick f123653a;

    /* renamed from: b, reason: collision with root package name */
    private final CameraManager f123654b;

    /* renamed from: c, reason: collision with root package name */
    private final BarcodePickDrawer f123655c;

    /* renamed from: d, reason: collision with root package name */
    private final BarcodePickDataCaptureViewWrapper f123656d;

    /* renamed from: e, reason: collision with root package name */
    private final ShutterButtonWrapper f123657e;

    /* renamed from: f, reason: collision with root package name */
    private final ExitButtonWrapper f123658f;

    /* renamed from: g, reason: collision with root package name */
    private final BarcodePickGuidanceHandler f123659g;

    /* renamed from: h, reason: collision with root package name */
    private final BarcodePickBasicOverlay f123660h;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private BarcodePickViewListener listener;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private BarcodePickViewUiListener uiListener;

    /* renamed from: k, reason: collision with root package name */
    private final BarcodePickView$_internalPropertyManager$1 f123663k;

    /* renamed from: l, reason: collision with root package name */
    private final MainThreadHelper f123664l;

    /* renamed from: m, reason: collision with root package name */
    private final com.scandit.datacapture.barcode.internal.module.shared.c f123665m;

    /* renamed from: n, reason: collision with root package name */
    private final com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.f f123666n;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001J9\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickView$Companion;", "", "Landroid/view/ViewGroup;", "parentView", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePick;", "mode", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewSettings;", "settings", "Lcom/scandit/datacapture/core/source/CameraSettings;", "cameraSettings", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickView;", "newInstance", "(Landroid/view/ViewGroup;Lcom/scandit/datacapture/core/capture/DataCaptureContext;Lcom/scandit/datacapture/barcode/pick/capture/BarcodePick;Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewSettings;Lcom/scandit/datacapture/core/source/CameraSettings;)Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickView;", "", "getHardwareTriggerSupported", "()Z", "getHardwareTriggerSupported$annotations", "()V", "hardwareTriggerSupported", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        @JvmStatic
        public static /* synthetic */ void getHardwareTriggerSupported$annotations() {
        }

        @JvmStatic
        @JvmOverloads
        public final BarcodePickView newInstance(ViewGroup parentView, DataCaptureContext dataCaptureContext, BarcodePick mode, BarcodePickViewSettings settings) {
            Intrinsics.j(parentView, "parentView");
            Intrinsics.j(dataCaptureContext, "dataCaptureContext");
            Intrinsics.j(mode, "mode");
            Intrinsics.j(settings, "settings");
            return newInstance$default(this, parentView, dataCaptureContext, mode, settings, null, 16, null);
        }

        public static /* synthetic */ BarcodePickView newInstance$default(Companion companion, ViewGroup viewGroup, DataCaptureContext dataCaptureContext, BarcodePick barcodePick, BarcodePickViewSettings barcodePickViewSettings, CameraSettings cameraSettings, int i10, Object obj) {
            if ((i10 & 16) != 0) {
                cameraSettings = BarcodePick.INSTANCE.createRecommendedCameraSettings();
            }
            return companion.newInstance(viewGroup, dataCaptureContext, barcodePick, barcodePickViewSettings, cameraSettings);
        }

        @JvmStatic
        @JvmOverloads
        public final BarcodePickView newInstance(ViewGroup parentView, DataCaptureContext dataCaptureContext, BarcodePick mode, BarcodePickViewSettings settings, CameraSettings cameraSettings) {
            Intrinsics.j(parentView, "parentView");
            Intrinsics.j(dataCaptureContext, "dataCaptureContext");
            Intrinsics.j(mode, "mode");
            Intrinsics.j(settings, "settings");
            Intrinsics.j(cameraSettings, "cameraSettings");
            Intrinsics.j(parentView, "parentView");
            Intrinsics.j(dataCaptureContext, "dataCaptureContext");
            Intrinsics.j(mode, "mode");
            Intrinsics.j(settings, "viewSettings");
            Intrinsics.j(cameraSettings, "cameraSettings");
            BarcodePickViewHighlightStyle highlightStyle = settings.getHighlightStyle();
            if (highlightStyle instanceof BarcodePickViewHighlightStyle.Dot) {
                BarcodePickViewHighlightStyle.Dot style = (BarcodePickViewHighlightStyle.Dot) highlightStyle;
                Intrinsics.j(parentView, "parentView");
                Intrinsics.j(dataCaptureContext, "dataCaptureContext");
                Intrinsics.j(mode, "mode");
                Intrinsics.j(settings, "viewSettings");
                Intrinsics.j(cameraSettings, "cameraSettings");
                Intrinsics.j(style, "castedStyle");
                Intrinsics.j(style, "style");
                return com.scandit.datacapture.barcode.internal.module.pick.ui.pickviewfactories.e.a(parentView, dataCaptureContext, mode, settings, cameraSettings, style, new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.brushprovider.j(new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.brushprovider.a(style), new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.brushprovider.b(style)));
            }
            if (highlightStyle instanceof BarcodePickViewHighlightStyle.Rectangular) {
                BarcodePickViewHighlightStyle.Rectangular style2 = (BarcodePickViewHighlightStyle.Rectangular) highlightStyle;
                Intrinsics.j(parentView, "parentView");
                Intrinsics.j(dataCaptureContext, "dataCaptureContext");
                Intrinsics.j(mode, "mode");
                Intrinsics.j(settings, "viewSettings");
                Intrinsics.j(cameraSettings, "cameraSettings");
                Intrinsics.j(style2, "castedStyle");
                Intrinsics.j(style2, "style");
                return com.scandit.datacapture.barcode.internal.module.pick.ui.pickviewfactories.e.a(parentView, dataCaptureContext, mode, settings, cameraSettings, style2, new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.brushprovider.j(new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.brushprovider.e(style2), new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.brushprovider.f(style2)));
            }
            if (highlightStyle instanceof BarcodePickViewHighlightStyle.DotWithIcons) {
                BarcodePickViewHighlightStyle.DotWithIcons style3 = (BarcodePickViewHighlightStyle.DotWithIcons) highlightStyle;
                Intrinsics.j(parentView, "parentView");
                Intrinsics.j(dataCaptureContext, "dataCaptureContext");
                Intrinsics.j(mode, "mode");
                Intrinsics.j(settings, "viewSettings");
                Intrinsics.j(cameraSettings, "cameraSettings");
                Intrinsics.j(style3, "castedStyle");
                Context context = parentView.getContext();
                Intrinsics.g(context);
                BarcodePickBasicOverlay barcodePickBasicOverlay = new BarcodePickBasicOverlay(context, mode, settings);
                com.scandit.datacapture.barcode.internal.module.pick.ui.datacaptureview.j jVarA = com.scandit.datacapture.barcode.internal.module.pick.ui.pickviewfactories.a.a(context, settings);
                BarcodePickViewHighlightStyleAsyncProvider asyncStyleProvider = style3.getAsyncStyleProvider();
                boolean styleResponseCacheEnabled = style3.getStyleResponseCacheEnabled();
                Intrinsics.j(style3, "style");
                com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.brushprovider.j brushProvider = new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.brushprovider.j(new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.brushprovider.c(style3), new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.brushprovider.d(style3));
                BarcodePickHighlightStyleIconsHolder overrides = style3.get_iconsHolder();
                com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.iconprovider.c defaults = com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.b.a(style3);
                Intrinsics.j(overrides, "overrides");
                Intrinsics.j(defaults, "defaults");
                com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.iconprovider.d iconProvider = new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.iconprovider.d(overrides, defaults);
                Intrinsics.j(brushProvider, "brushProvider");
                Intrinsics.j(iconProvider, "iconProvider");
                com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.c cVar = new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.c(asyncStyleProvider, brushProvider, iconProvider, styleResponseCacheEnabled);
                com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.behaviour.l lVar = new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.behaviour.l();
                CameraPosition cameraPosition = CameraPosition.WORLD_FACING;
                Intrinsics.j(cameraPosition, "cameraPosition");
                Intrinsics.j(cameraSettings, "cameraSettings");
                com.scandit.datacapture.barcode.internal.module.pick.capture.A a10 = new com.scandit.datacapture.barcode.internal.module.pick.capture.A(cameraPosition, cameraSettings);
                com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.a aVar = com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.a.f122546a;
                com.scandit.datacapture.barcode.internal.module.pick.ui.pickviewfactories.l lVar2 = new com.scandit.datacapture.barcode.internal.module.pick.ui.pickviewfactories.l(mode);
                com.scandit.datacapture.barcode.internal.module.pick.ui.pickviewfactories.m mVar = new com.scandit.datacapture.barcode.internal.module.pick.ui.pickviewfactories.m(jVarA);
                Intrinsics.j(settings, "settings");
                com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush.n nVarA = com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush.s.a(barcodePickBasicOverlay, lVar2, style3, mVar, new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush.j(settings.getDrawDebugInfo(), new Size2(settings.getMinimumHighlightWidthPx$scandit_barcode_capture() * BarcodePickViewSettingsDefaults.getHighlightSizeToTapAreaFactor(), BarcodePickViewSettingsDefaults.getHighlightSizeToTapAreaFactor() * settings.getMinimumHighlightHeightPx$scandit_barcode_capture()), PixelExtensionsKt.pxFromDp$default(settings.maxIconSize$scandit_barcode_capture(), (Context) null, 1, (Object) null), PixelExtensionsKt.pxFromDp$default(settings.minIconSize$scandit_barcode_capture(), (Context) null, 1, (Object) null), PixelExtensionsKt.pxFromDp$default(BarcodePickViewSettingsDefaults.getIconPadding(), (Context) null, 1, (Object) null), new Size2(settings.getMinimumHighlightWidthPx$scandit_barcode_capture(), settings.getMinimumHighlightHeightPx$scandit_barcode_capture())), cVar, new com.scandit.datacapture.barcode.internal.module.pick.ui.pickviewfactories.o(lVar, style3, cVar, context, jVarA), 3968);
                com.scandit.datacapture.barcode.internal.module.pick.ui.pickviewfactories.p pVar = new com.scandit.datacapture.barcode.internal.module.pick.ui.pickviewfactories.p(jVarA);
                Intrinsics.j(settings, "settings");
                BarcodePickDrawer[] drawers = {nVarA, com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.filtered.e.a(barcodePickBasicOverlay, pVar, new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.filtered.f(new Size2(settings.getMinimumHighlightWidthPx$scandit_barcode_capture(), settings.getMinimumHighlightHeightPx$scandit_barcode_capture()), settings.getFilterHighlightSettings()))};
                Intrinsics.j(aVar, "<this>");
                Intrinsics.j(drawers, "drawers");
                com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.combined.a aVar2 = new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.combined.a(ArraysKt.i1(drawers));
                Context context2 = parentView.getContext();
                Intrinsics.i(context2, "getContext(...)");
                Intrinsics.j(context2, "context");
                com.scandit.datacapture.barcode.internal.module.ui.shutterbutton.b factory = new com.scandit.datacapture.barcode.internal.module.ui.shutterbutton.b(context2);
                com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.c cVar2 = com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.c.f123427a;
                Intrinsics.j(cVar2, "<this>");
                Intrinsics.j(settings, "viewSettings");
                com.scandit.datacapture.barcode.internal.module.pick.ui.shutterbutton.d positioner = new com.scandit.datacapture.barcode.internal.module.pick.ui.shutterbutton.d(settings.getUiButtonsOffset());
                Intrinsics.j(factory, "factory");
                Intrinsics.j(positioner, "positioner");
                com.scandit.datacapture.barcode.internal.module.ui.shutterbutton.i iVar = new com.scandit.datacapture.barcode.internal.module.ui.shutterbutton.i(factory, positioner);
                Context context3 = parentView.getContext();
                Intrinsics.i(context3, "getContext(...)");
                Intrinsics.j(context3, "context");
                com.scandit.datacapture.barcode.internal.module.ui.exitbutton.b factory2 = new com.scandit.datacapture.barcode.internal.module.ui.exitbutton.b(context3);
                Intrinsics.j(cVar2, "<this>");
                com.scandit.datacapture.barcode.internal.module.ui.exitbutton.i positioner2 = new com.scandit.datacapture.barcode.internal.module.ui.exitbutton.i();
                Intrinsics.j(factory2, "factory");
                Intrinsics.j(positioner2, "positioner");
                com.scandit.datacapture.barcode.internal.module.ui.exitbutton.f fVar = new com.scandit.datacapture.barcode.internal.module.ui.exitbutton.f(factory2, positioner2);
                Context context4 = parentView.getContext();
                Intrinsics.i(context4, "getContext(...)");
                com.scandit.datacapture.barcode.internal.module.pick.ui.f loadingViewFactory = com.scandit.datacapture.barcode.internal.module.pick.ui.pickviewfactories.a.b(context, settings);
                Context context5 = parentView.getContext();
                Intrinsics.i(context5, "getContext(...)");
                Intrinsics.j(context5, "context");
                com.scandit.datacapture.barcode.internal.module.pick.ui.guidances.k guidanceViewFactory = new com.scandit.datacapture.barcode.internal.module.pick.ui.guidances.k(context5);
                Intrinsics.j(context4, "context");
                Intrinsics.j(loadingViewFactory, "loadingViewFactory");
                Intrinsics.j(guidanceViewFactory, "guidanceViewFactory");
                return new BarcodePickView(context, parentView, dataCaptureContext, mode, settings, a10, cVar, aVar2, jVarA, iVar, fVar, new com.scandit.datacapture.barcode.internal.module.pick.ui.guidances.g(context4, loadingViewFactory, guidanceViewFactory), barcodePickBasicOverlay);
            }
            if (highlightStyle instanceof BarcodePickViewHighlightStyle.RectangularWithIcons) {
                BarcodePickViewHighlightStyle.RectangularWithIcons style4 = (BarcodePickViewHighlightStyle.RectangularWithIcons) highlightStyle;
                Intrinsics.j(parentView, "parentView");
                Intrinsics.j(dataCaptureContext, "dataCaptureContext");
                Intrinsics.j(mode, "mode");
                Intrinsics.j(settings, "viewSettings");
                Intrinsics.j(cameraSettings, "cameraSettings");
                Intrinsics.j(style4, "castedStyle");
                Context context6 = parentView.getContext();
                Intrinsics.g(context6);
                BarcodePickBasicOverlay barcodePickBasicOverlay2 = new BarcodePickBasicOverlay(context6, mode, settings);
                com.scandit.datacapture.barcode.internal.module.pick.ui.datacaptureview.j jVarA2 = com.scandit.datacapture.barcode.internal.module.pick.ui.pickviewfactories.a.a(context6, settings);
                BarcodePickViewHighlightStyleAsyncProvider asyncStyleProvider2 = style4.getAsyncStyleProvider();
                boolean styleResponseCacheEnabled2 = style4.getStyleResponseCacheEnabled();
                Intrinsics.j(style4, "style");
                com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.brushprovider.j brushProvider2 = new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.brushprovider.j(new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.brushprovider.g(style4), new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.brushprovider.h(style4));
                BarcodePickHighlightStyleIconsHolder overrides2 = style4.get_iconsHolder();
                com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.iconprovider.c defaults2 = com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.b.a(style4);
                Intrinsics.j(overrides2, "overrides");
                Intrinsics.j(defaults2, "defaults");
                com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.iconprovider.d iconProvider2 = new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.iconprovider.d(overrides2, defaults2);
                Intrinsics.j(brushProvider2, "brushProvider");
                Intrinsics.j(iconProvider2, "iconProvider");
                com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.c cVar3 = new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.c(asyncStyleProvider2, brushProvider2, iconProvider2, styleResponseCacheEnabled2);
                com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.behaviour.l lVar3 = new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.behaviour.l();
                CameraPosition cameraPosition2 = CameraPosition.WORLD_FACING;
                Intrinsics.j(cameraPosition2, "cameraPosition");
                Intrinsics.j(cameraSettings, "cameraSettings");
                com.scandit.datacapture.barcode.internal.module.pick.capture.A a11 = new com.scandit.datacapture.barcode.internal.module.pick.capture.A(cameraPosition2, cameraSettings);
                com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.a aVar3 = com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.a.f122546a;
                com.scandit.datacapture.barcode.internal.module.pick.ui.pickviewfactories.q qVar = new com.scandit.datacapture.barcode.internal.module.pick.ui.pickviewfactories.q(mode);
                com.scandit.datacapture.barcode.internal.module.pick.ui.pickviewfactories.r rVar = new com.scandit.datacapture.barcode.internal.module.pick.ui.pickviewfactories.r(jVarA2);
                Intrinsics.j(settings, "settings");
                com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush.n nVarA2 = com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush.s.a(barcodePickBasicOverlay2, qVar, style4, rVar, new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush.j(settings.getDrawDebugInfo(), new Size2(BarcodePickViewSettingsDefaults.getHighlightSizeToTapAreaFactor() * settings.getMinimumHighlightWidthPx$scandit_barcode_capture(), BarcodePickViewSettingsDefaults.getHighlightSizeToTapAreaFactor() * settings.getMinimumHighlightHeightPx$scandit_barcode_capture()), PixelExtensionsKt.pxFromDp$default(settings.maxIconSize$scandit_barcode_capture(), (Context) null, 1, (Object) null), PixelExtensionsKt.pxFromDp$default(settings.minIconSize$scandit_barcode_capture(), (Context) null, 1, (Object) null), PixelExtensionsKt.pxFromDp$default(BarcodePickViewSettingsDefaults.getIconPadding(), (Context) null, 1, (Object) null), new Size2(settings.getMinimumHighlightWidthPx$scandit_barcode_capture(), settings.getMinimumHighlightHeightPx$scandit_barcode_capture())), cVar3, new com.scandit.datacapture.barcode.internal.module.pick.ui.pickviewfactories.t(lVar3, style4, cVar3, settings, jVarA2), 3968);
                com.scandit.datacapture.barcode.internal.module.pick.ui.pickviewfactories.u uVar = new com.scandit.datacapture.barcode.internal.module.pick.ui.pickviewfactories.u(jVarA2);
                Intrinsics.j(settings, "settings");
                BarcodePickDrawer[] drawers2 = {nVarA2, com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.filtered.e.a(barcodePickBasicOverlay2, uVar, new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.filtered.f(new Size2(settings.getMinimumHighlightWidthPx$scandit_barcode_capture(), settings.getMinimumHighlightHeightPx$scandit_barcode_capture()), settings.getFilterHighlightSettings()))};
                Intrinsics.j(aVar3, "<this>");
                Intrinsics.j(drawers2, "drawers");
                com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.combined.a aVar4 = new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.combined.a(ArraysKt.i1(drawers2));
                Context context7 = parentView.getContext();
                Intrinsics.i(context7, "getContext(...)");
                Intrinsics.j(context7, "context");
                com.scandit.datacapture.barcode.internal.module.ui.shutterbutton.b factory3 = new com.scandit.datacapture.barcode.internal.module.ui.shutterbutton.b(context7);
                com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.c cVar4 = com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.c.f123427a;
                Intrinsics.j(cVar4, "<this>");
                Intrinsics.j(settings, "viewSettings");
                com.scandit.datacapture.barcode.internal.module.pick.ui.shutterbutton.d positioner3 = new com.scandit.datacapture.barcode.internal.module.pick.ui.shutterbutton.d(settings.getUiButtonsOffset());
                Intrinsics.j(factory3, "factory");
                Intrinsics.j(positioner3, "positioner");
                com.scandit.datacapture.barcode.internal.module.ui.shutterbutton.i iVar2 = new com.scandit.datacapture.barcode.internal.module.ui.shutterbutton.i(factory3, positioner3);
                Context context8 = parentView.getContext();
                Intrinsics.i(context8, "getContext(...)");
                Intrinsics.j(context8, "context");
                com.scandit.datacapture.barcode.internal.module.ui.exitbutton.b factory4 = new com.scandit.datacapture.barcode.internal.module.ui.exitbutton.b(context8);
                Intrinsics.j(cVar4, "<this>");
                com.scandit.datacapture.barcode.internal.module.ui.exitbutton.i positioner4 = new com.scandit.datacapture.barcode.internal.module.ui.exitbutton.i();
                Intrinsics.j(factory4, "factory");
                Intrinsics.j(positioner4, "positioner");
                com.scandit.datacapture.barcode.internal.module.ui.exitbutton.f fVar2 = new com.scandit.datacapture.barcode.internal.module.ui.exitbutton.f(factory4, positioner4);
                Context context9 = parentView.getContext();
                Intrinsics.i(context9, "getContext(...)");
                com.scandit.datacapture.barcode.internal.module.pick.ui.f loadingViewFactory2 = com.scandit.datacapture.barcode.internal.module.pick.ui.pickviewfactories.a.b(context6, settings);
                Context context10 = parentView.getContext();
                Intrinsics.i(context10, "getContext(...)");
                Intrinsics.j(context10, "context");
                com.scandit.datacapture.barcode.internal.module.pick.ui.guidances.k guidanceViewFactory2 = new com.scandit.datacapture.barcode.internal.module.pick.ui.guidances.k(context10);
                Intrinsics.j(context9, "context");
                Intrinsics.j(loadingViewFactory2, "loadingViewFactory");
                Intrinsics.j(guidanceViewFactory2, "guidanceViewFactory");
                return new BarcodePickView(context6, parentView, dataCaptureContext, mode, settings, a11, cVar3, aVar4, jVarA2, iVar2, fVar2, new com.scandit.datacapture.barcode.internal.module.pick.ui.guidances.g(context9, loadingViewFactory2, guidanceViewFactory2), barcodePickBasicOverlay2);
            }
            if (!(highlightStyle instanceof BarcodePickViewHighlightStyle.CustomView)) {
                throw new NoWhenBranchMatchedException();
            }
            BarcodePickViewHighlightStyle.CustomView highlightStyle2 = (BarcodePickViewHighlightStyle.CustomView) highlightStyle;
            Intrinsics.j(parentView, "parentView");
            Intrinsics.j(dataCaptureContext, "dataCaptureContext");
            Intrinsics.j(mode, "mode");
            Intrinsics.j(settings, "viewSettings");
            Intrinsics.j(cameraSettings, "cameraSettings");
            Intrinsics.j(highlightStyle2, "castedStyle");
            Context context11 = parentView.getContext();
            Intrinsics.g(context11);
            BarcodePickBasicOverlay container = new BarcodePickBasicOverlay(context11, mode, settings);
            Intrinsics.j(context11, "context");
            com.scandit.datacapture.barcode.internal.module.pick.ui.datacaptureview.h factory5 = new com.scandit.datacapture.barcode.internal.module.pick.ui.datacaptureview.h(context11);
            Intrinsics.j(context11, "context");
            Intrinsics.j(factory5, "factory");
            Intrinsics.j(settings, "settings");
            com.scandit.datacapture.barcode.internal.module.pick.ui.datacaptureview.j jVar = new com.scandit.datacapture.barcode.internal.module.pick.ui.datacaptureview.j(context11, factory5, settings);
            com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.f cache = new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.f(highlightStyle2.getAsyncCustomViewProvider());
            com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.behaviour.l lVar4 = new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.behaviour.l();
            CameraPosition cameraPosition3 = CameraPosition.WORLD_FACING;
            Intrinsics.j(cameraPosition3, "cameraPosition");
            Intrinsics.j(cameraSettings, "cameraSettings");
            com.scandit.datacapture.barcode.internal.module.pick.capture.A a12 = new com.scandit.datacapture.barcode.internal.module.pick.capture.A(cameraPosition3, cameraSettings);
            com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.a aVar5 = com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.a.f122546a;
            boolean fitViewsToBarcode = highlightStyle2.getFitViewsToBarcode();
            com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.customview.j drawSettings = new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.customview.j(settings);
            Size2 minSize = new Size2(settings.getMinimumHighlightWidthPx$scandit_barcode_capture(), settings.getMinimumHighlightHeightPx$scandit_barcode_capture());
            boolean fitViewsToBarcode2 = highlightStyle2.getFitViewsToBarcode();
            com.scandit.datacapture.barcode.internal.module.pick.ui.pickviewfactories.f quadrilateralMapper = new com.scandit.datacapture.barcode.internal.module.pick.ui.pickviewfactories.f(jVar);
            Intrinsics.j(minSize, "minSize");
            Intrinsics.j(quadrilateralMapper, "quadrilateralMapper");
            Intrinsics.j(settings, "viewSettings");
            com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.customview.c drawDataFactory = new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.customview.c(minSize, fitViewsToBarcode2, quadrilateralMapper, settings);
            com.scandit.datacapture.barcode.internal.module.pick.ui.pickviewfactories.g onTrackTap = new com.scandit.datacapture.barcode.internal.module.pick.ui.pickviewfactories.g(mode);
            com.scandit.datacapture.barcode.internal.module.pick.ui.pickviewfactories.j statusIconViewDrawerProvider = new com.scandit.datacapture.barcode.internal.module.pick.ui.pickviewfactories.j(lVar4, highlightStyle2, cache, settings, jVar);
            HashMap drawingData = new HashMap();
            com.scandit.datacapture.barcode.internal.module.ui.i touchEventHandler = new com.scandit.datacapture.barcode.internal.module.ui.i(new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.customview.g(drawingData), com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.customview.h.f122626a, new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.customview.i(onTrackTap));
            Paint tapPaint = com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.customview.k.f122629a;
            Intrinsics.j(aVar5, "<this>");
            Intrinsics.j(container, "container");
            Intrinsics.j(onTrackTap, "onTrackTap");
            Intrinsics.j(highlightStyle2, "highlightStyle");
            Intrinsics.j(statusIconViewDrawerProvider, "statusIconViewDrawerProvider");
            Intrinsics.j(drawingData, "drawingData");
            Intrinsics.j(touchEventHandler, "touchEventHandler");
            Intrinsics.j(drawSettings, "drawSettings");
            Intrinsics.j(drawDataFactory, "drawDataFactory");
            Intrinsics.j(tapPaint, "tapPaint");
            Intrinsics.j(cache, "cache");
            com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.customview.f fVar3 = new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.customview.f(container, fitViewsToBarcode, touchEventHandler, highlightStyle2, drawSettings, drawDataFactory, cache, statusIconViewDrawerProvider, tapPaint, drawingData);
            com.scandit.datacapture.barcode.internal.module.pick.ui.pickviewfactories.k kVar = new com.scandit.datacapture.barcode.internal.module.pick.ui.pickviewfactories.k(jVar);
            Intrinsics.j(settings, "settings");
            BarcodePickDrawer[] drawers3 = {fVar3, com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.filtered.e.a(container, kVar, new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.filtered.f(new Size2(settings.getMinimumHighlightWidthPx$scandit_barcode_capture(), settings.getMinimumHighlightHeightPx$scandit_barcode_capture()), settings.getFilterHighlightSettings()))};
            Intrinsics.j(aVar5, "<this>");
            Intrinsics.j(drawers3, "drawers");
            com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.combined.a aVar6 = new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.combined.a(ArraysKt.i1(drawers3));
            Context context12 = parentView.getContext();
            Intrinsics.i(context12, "getContext(...)");
            Intrinsics.j(context12, "context");
            com.scandit.datacapture.barcode.internal.module.ui.shutterbutton.b factory6 = new com.scandit.datacapture.barcode.internal.module.ui.shutterbutton.b(context12);
            com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.c cVar5 = com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.c.f123427a;
            Intrinsics.j(cVar5, "<this>");
            Intrinsics.j(settings, "viewSettings");
            com.scandit.datacapture.barcode.internal.module.pick.ui.shutterbutton.d positioner5 = new com.scandit.datacapture.barcode.internal.module.pick.ui.shutterbutton.d(settings.getUiButtonsOffset());
            Intrinsics.j(factory6, "factory");
            Intrinsics.j(positioner5, "positioner");
            com.scandit.datacapture.barcode.internal.module.ui.shutterbutton.i iVar3 = new com.scandit.datacapture.barcode.internal.module.ui.shutterbutton.i(factory6, positioner5);
            Context context13 = parentView.getContext();
            Intrinsics.i(context13, "getContext(...)");
            Intrinsics.j(context13, "context");
            com.scandit.datacapture.barcode.internal.module.ui.exitbutton.b factory7 = new com.scandit.datacapture.barcode.internal.module.ui.exitbutton.b(context13);
            Intrinsics.j(cVar5, "<this>");
            com.scandit.datacapture.barcode.internal.module.ui.exitbutton.i positioner6 = new com.scandit.datacapture.barcode.internal.module.ui.exitbutton.i();
            Intrinsics.j(factory7, "factory");
            Intrinsics.j(positioner6, "positioner");
            com.scandit.datacapture.barcode.internal.module.ui.exitbutton.f fVar4 = new com.scandit.datacapture.barcode.internal.module.ui.exitbutton.f(factory7, positioner6);
            Context context14 = parentView.getContext();
            Intrinsics.i(context14, "getContext(...)");
            com.scandit.datacapture.barcode.internal.module.pick.ui.f loadingViewFactory3 = com.scandit.datacapture.barcode.internal.module.pick.ui.pickviewfactories.a.b(context11, settings);
            Context context15 = parentView.getContext();
            Intrinsics.i(context15, "getContext(...)");
            Intrinsics.j(context15, "context");
            com.scandit.datacapture.barcode.internal.module.pick.ui.guidances.k guidanceViewFactory3 = new com.scandit.datacapture.barcode.internal.module.pick.ui.guidances.k(context15);
            Intrinsics.j(context14, "context");
            Intrinsics.j(loadingViewFactory3, "loadingViewFactory");
            Intrinsics.j(guidanceViewFactory3, "guidanceViewFactory");
            return new BarcodePickView(context11, parentView, dataCaptureContext, mode, settings, a12, cache, aVar6, jVar, iVar3, fVar4, new com.scandit.datacapture.barcode.internal.module.pick.ui.guidances.g(context14, loadingViewFactory3, guidanceViewFactory3), container);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final boolean getHardwareTriggerSupported() {
            return HardwareButtonHelperKt.isHardwareTriggerSupported();
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HardwareKeyEvent.values().length];
            try {
                iArr[HardwareKeyEvent.CLICK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(BarcodePickView this$0) {
        com.scandit.datacapture.barcode.internal.module.shared.b bVar;
        Intrinsics.j(this$0, "this$0");
        this$0.f123654b.a(new l(this$0));
        this$0.f123657e.a();
        this$0.f123658f.a();
        com.scandit.datacapture.barcode.internal.module.shared.c cVar = this$0.f123665m;
        synchronized (cVar) {
            bVar = cVar.f122830g;
        }
        if (bVar == com.scandit.datacapture.barcode.internal.module.shared.b.f122822d) {
            com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.f fVar = this$0.f123666n;
            NativeBarcodePickSession session = fVar.f122636a._impl$scandit_barcode_capture().getSession();
            if (session == null) {
                return;
            }
            fVar.a(new com.scandit.datacapture.barcode.internal.module.pick.capture.v(new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.d(session)));
        }
    }

    public static final boolean getHardwareTriggerSupported() {
        return INSTANCE.getHardwareTriggerSupported();
    }

    @JvmStatic
    @JvmOverloads
    public static final BarcodePickView newInstance(ViewGroup viewGroup, DataCaptureContext dataCaptureContext, BarcodePick barcodePick, BarcodePickViewSettings barcodePickViewSettings) {
        return INSTANCE.newInstance(viewGroup, dataCaptureContext, barcodePick, barcodePickViewSettings);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.scandit.datacapture.barcode.pick.ui.BarcodePickView$_internalPropertyManager$1] */
    public BarcodePickView(Context context, ViewGroup parentView, DataCaptureContext dataCaptureContext, BarcodePick mode, BarcodePickViewSettings viewSettings, CameraManager cameraManager, BarcodePickElementsCache elementsRequestor, BarcodePickDrawer highlightDrawer, BarcodePickDataCaptureViewWrapper captureViewWrapper, ShutterButtonWrapper shutterButtonWrapper, ExitButtonWrapper exitButtonWrapper, BarcodePickGuidanceHandler guidanceHandler, BarcodePickBasicOverlay barcodePickBasicOverlay) {
        super(context);
        Intrinsics.j(context, "context");
        Intrinsics.j(parentView, "parentView");
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        Intrinsics.j(mode, "mode");
        Intrinsics.j(viewSettings, "viewSettings");
        Intrinsics.j(cameraManager, "cameraManager");
        Intrinsics.j(elementsRequestor, "elementsHandler");
        Intrinsics.j(highlightDrawer, "drawer");
        Intrinsics.j(captureViewWrapper, "captureViewWrapper");
        Intrinsics.j(shutterButtonWrapper, "shutterButtonWrapper");
        Intrinsics.j(exitButtonWrapper, "exitButtonWrapper");
        Intrinsics.j(guidanceHandler, "guidanceHandler");
        Intrinsics.j(barcodePickBasicOverlay, "barcodePickBasicOverlay");
        this.f123653a = mode;
        this.f123654b = cameraManager;
        this.f123655c = highlightDrawer;
        this.f123656d = captureViewWrapper;
        this.f123657e = shutterButtonWrapper;
        this.f123658f = exitButtonWrapper;
        this.f123659g = guidanceHandler;
        this.f123660h = barcodePickBasicOverlay;
        this.f123663k = new InternalPropertyManager() { // from class: com.scandit.datacapture.barcode.pick.ui.BarcodePickView$_internalPropertyManager$1
            @Override // com.scandit.datacapture.barcode.internal.sdk.ui.InternalPropertyManager
            public void _setProperty(String key, Object value) {
                Intrinsics.j(key, "key");
                Intrinsics.j(value, "value");
                if (Intrinsics.e(key, "add_overlay") && (value instanceof DataCaptureOverlay)) {
                    this.f123667a.f123656d.b((DataCaptureOverlay) value);
                } else if (Intrinsics.e(key, "remove_overlay") && (value instanceof DataCaptureOverlay)) {
                    this.f123667a.f123656d.a((DataCaptureOverlay) value);
                }
            }
        };
        this.f123664l = new MainThreadHelper();
        v onStartScanning = new v(this);
        w onStopScanning = new w(this);
        x onFreezeScanning = new x(this);
        y onReleaseScanning = new y(this);
        z onResetScanning = new z(this);
        com.scandit.datacapture.barcode.internal.module.shared.b initialScanState = com.scandit.datacapture.barcode.internal.module.shared.b.f122819a;
        Intrinsics.j(onStartScanning, "onStartScanning");
        Intrinsics.j(onStopScanning, "onStopScanning");
        Intrinsics.j(onFreezeScanning, "onFreezeScanning");
        Intrinsics.j(onReleaseScanning, "onReleaseScanning");
        Intrinsics.j(onResetScanning, "onResetScanning");
        Intrinsics.j(initialScanState, "initialScanState");
        this.f123665m = new com.scandit.datacapture.barcode.internal.module.shared.c(onStartScanning, onStopScanning, onFreezeScanning, onReleaseScanning, onResetScanning, initialScanState);
        m onDrawerDataUpdatedWithStatusIconsShown = new m(this);
        o runOnMain = new o(this);
        Intrinsics.j(mode, "mode");
        Intrinsics.j(runOnMain, "runOnMain");
        Intrinsics.j(onDrawerDataUpdatedWithStatusIconsShown, "onDrawerDataUpdatedWithStatusIconsShown");
        Intrinsics.j(elementsRequestor, "elementsRequestor");
        Intrinsics.j(highlightDrawer, "highlightDrawer");
        com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.f fVar = new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.f(mode, runOnMain, onDrawerDataUpdatedWithStatusIconsShown, elementsRequestor, highlightDrawer);
        this.f123666n = fVar;
        mode._addStatusListener$scandit_barcode_capture(new C13265a(this));
        setClipChildren(false);
        setClipToPadding(false);
        setBackgroundColor(-16777216);
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
        parentView.addView(this, new ViewGroup.LayoutParams(-1, -1));
        captureViewWrapper.a(dataCaptureContext);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(0, 0);
        layoutParams.addRule(13);
        Unit unit = Unit.f142422a;
        captureViewWrapper.a(this, layoutParams);
        captureViewWrapper.a(fVar);
        dataCaptureContext.setMode(mode._asDataCaptureMode$scandit_barcode_capture());
        cameraManager.a(dataCaptureContext);
        shutterButtonWrapper.a(new C13266b(this));
        shutterButtonWrapper.a(this, new com.scandit.datacapture.barcode.internal.module.ui.shutterbutton.g(viewSettings.getShowPauseButton()));
        exitButtonWrapper.a(new c(this));
        exitButtonWrapper.a(this, new com.scandit.datacapture.barcode.internal.module.ui.exitbutton.d(viewSettings.getShowFinishButton()));
        if (viewSettings.getHardwareTriggerEnabled()) {
            HardwareButtonHelperKt.setupHardwareTrigger(this, viewSettings.getHardwareTriggerKeyCode(), new d(this));
        }
        barcodePickBasicOverlay.a(guidanceHandler);
    }

    public static final void access$_freezeScanning(BarcodePickView barcodePickView) {
        barcodePickView.f123653a._freeze$scandit_barcode_capture();
        ViewExtensionsKt.runOnMainThread(barcodePickView, new f(barcodePickView));
    }

    public static final void access$_releaseScanning(BarcodePickView barcodePickView) {
        barcodePickView.f123653a._stop$scandit_barcode_capture();
        ViewExtensionsKt.runOnMainThread(barcodePickView, new g(barcodePickView));
    }

    public static final void access$_resetScanning(BarcodePickView barcodePickView) {
        barcodePickView.f123653a._reset$scandit_barcode_capture();
        ViewExtensionsKt.runOnMainThread(barcodePickView, new h(barcodePickView));
    }

    public static final void access$_startScanning(BarcodePickView barcodePickView) {
        barcodePickView.f123653a._start$scandit_barcode_capture();
        ViewExtensionsKt.runOnMainThread(barcodePickView, new i(barcodePickView));
    }

    public static final void access$_stopScanning(BarcodePickView barcodePickView) {
        barcodePickView.f123653a._pause$scandit_barcode_capture();
        ViewExtensionsKt.runOnMainThread(barcodePickView, new j(barcodePickView));
    }

    public static final void access$freezeInternal(BarcodePickView barcodePickView) {
        barcodePickView.f123653a._notifyStatusShownWhilePausedUpdated$scandit_barcode_capture(barcodePickView.f123655c.a());
        barcodePickView.f123656d.a();
        barcodePickView.f123655c.b();
    }

    public static final void access$onDrawerDataUpdated(BarcodePickView barcodePickView, boolean z10) {
        com.scandit.datacapture.barcode.internal.module.shared.b bVar;
        com.scandit.datacapture.barcode.internal.module.shared.c cVar = barcodePickView.f123665m;
        synchronized (cVar) {
            bVar = cVar.f122830g;
        }
        bVar.getClass();
        if (bVar == com.scandit.datacapture.barcode.internal.module.shared.b.f122820b) {
            return;
        }
        barcodePickView.f123653a._notifyStatusShownWhilePausedUpdated$scandit_barcode_capture(z10);
    }

    public static final void access$onExitButtonClick(BarcodePickView barcodePickView) {
        BarcodePickViewUiListener barcodePickViewUiListener = barcodePickView.uiListener;
        if (barcodePickViewUiListener != null) {
            barcodePickViewUiListener.onFinishButtonTapped(barcodePickView);
        }
    }

    public static final void access$releaseInternal(BarcodePickView barcodePickView) {
        barcodePickView.f123655c.stop();
        barcodePickView.removeView(barcodePickView.f123659g.getView());
        barcodePickView.f123656d.a(barcodePickView.f123660h);
        barcodePickView.f123653a._removeListener$scandit_barcode_capture(barcodePickView.f123666n);
        barcodePickView.f123654b.a(com.scandit.datacapture.barcode.internal.module.pick.capture.y.f122458a);
    }

    public static final void access$resetStateInternal(BarcodePickView barcodePickView) {
        com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.f fVar = barcodePickView.f123666n;
        NativeBarcodePickSession session = fVar.f122636a._impl$scandit_barcode_capture().getSession();
        if (session == null) {
            return;
        }
        fVar.a(new com.scandit.datacapture.barcode.internal.module.pick.capture.v(new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.d(session)));
    }

    public static final void access$startInternal(BarcodePickView barcodePickView) {
        barcodePickView.f123656d.b();
        if (barcodePickView.f123659g.getView().getParent() == null) {
            barcodePickView.addView(barcodePickView.f123659g.getView(), new ViewGroup.LayoutParams(-1, -1));
        }
        barcodePickView.f123655c.start();
        barcodePickView.f123653a._notifyStatusShownWhilePausedUpdated$scandit_barcode_capture(false);
        barcodePickView.f123656d.b(barcodePickView.f123660h);
        barcodePickView.f123653a._addListener$scandit_barcode_capture(barcodePickView.f123666n);
    }

    public static final void access$stopInternal(BarcodePickView barcodePickView) {
        barcodePickView.f123655c.stop();
        barcodePickView.removeView(barcodePickView.f123659g.getView());
        barcodePickView.f123656d.a(barcodePickView.f123660h);
        barcodePickView.f123653a._removeListener$scandit_barcode_capture(barcodePickView.f123666n);
    }

    @JvmStatic
    @JvmOverloads
    public static final BarcodePickView newInstance(ViewGroup viewGroup, DataCaptureContext dataCaptureContext, BarcodePick barcodePick, BarcodePickViewSettings barcodePickViewSettings, CameraSettings cameraSettings) {
        return INSTANCE.newInstance(viewGroup, dataCaptureContext, barcodePick, barcodePickViewSettings, cameraSettings);
    }

    public final void _applySettings$scandit_barcode_capture(BarcodePickViewSettings viewSettings) {
        Intrinsics.j(viewSettings, "viewSettings");
        this.f123660h.a(viewSettings);
        ViewExtensionsKt.runOnMainThread(this, new e(this, viewSettings));
    }

    public final void addActionListener(BarcodePickActionListener listener) {
        Intrinsics.j(listener, "listener");
        this.f123653a._addActionListener$scandit_barcode_capture(listener);
    }

    public final void freeze() {
        this.f123665m.a();
    }

    public final BarcodePickViewListener getListener() {
        return this.listener;
    }

    public final BarcodePickViewUiListener getUiListener() {
        return this.uiListener;
    }

    public final InternalPropertyManager get_internalPropertyManager() {
        return this.f123663k;
    }

    public final void onDestroy() {
        com.scandit.datacapture.barcode.internal.module.shared.c cVar = this.f123665m;
        synchronized (cVar) {
            try {
                com.scandit.datacapture.barcode.internal.module.shared.a aVarB = cVar.b();
                com.scandit.datacapture.barcode.internal.module.shared.a aVar = com.scandit.datacapture.barcode.internal.module.shared.a.f122817d;
                if (aVarB == aVar) {
                    return;
                }
                cVar.f122829f = aVar;
                com.scandit.datacapture.barcode.internal.module.shared.b bVarC = cVar.c();
                bVarC.getClass();
                if (bVarC == com.scandit.datacapture.barcode.internal.module.shared.b.f122820b) {
                    cVar.e();
                }
                cVar.f122827d.invoke();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void onPause() {
        com.scandit.datacapture.barcode.internal.module.shared.c cVar = this.f123665m;
        synchronized (cVar) {
            com.scandit.datacapture.barcode.internal.module.shared.a aVarB = cVar.b();
            com.scandit.datacapture.barcode.internal.module.shared.a aVar = com.scandit.datacapture.barcode.internal.module.shared.a.f122816c;
            if (aVarB == aVar) {
                return;
            }
            cVar.f122829f = aVar;
            com.scandit.datacapture.barcode.internal.module.shared.b bVarC = cVar.c();
            bVarC.getClass();
            if (bVarC == com.scandit.datacapture.barcode.internal.module.shared.b.f122820b) {
                cVar.f122825b.invoke();
            }
        }
    }

    public final void onResume() {
        com.scandit.datacapture.barcode.internal.module.shared.c cVar = this.f123665m;
        synchronized (cVar) {
            com.scandit.datacapture.barcode.internal.module.shared.a aVarB = cVar.b();
            com.scandit.datacapture.barcode.internal.module.shared.a aVar = com.scandit.datacapture.barcode.internal.module.shared.a.f122815b;
            if (aVarB == aVar) {
                return;
            }
            cVar.f122829f = aVar;
            com.scandit.datacapture.barcode.internal.module.shared.b bVarC = cVar.c();
            bVarC.getClass();
            if (bVarC == com.scandit.datacapture.barcode.internal.module.shared.b.f122820b) {
                cVar.f122824a.invoke();
            }
        }
    }

    public final void onStatusListenerFreezed$scandit_barcode_capture() {
        this.f123664l.runOnMainThread(new p(this));
        ViewExtensionsKt.runOnMainThread(this, new q(this));
    }

    public final void onStatusListenerPaused$scandit_barcode_capture() {
        this.f123664l.runOnMainThread(new r(this));
    }

    public final void onStatusListenerStarted$scandit_barcode_capture() {
        this.f123664l.runOnMainThread(new s(this));
        ViewExtensionsKt.runOnMainThread(this, new t(this));
    }

    public final void onStatusListenerStopped$scandit_barcode_capture() {
        this.f123664l.runOnMainThread(new u(this));
    }

    public final void removeActionListener(BarcodePickActionListener listener) {
        Intrinsics.j(listener, "listener");
        this.f123653a._removeActionListener$scandit_barcode_capture(listener);
    }

    public final void reset() {
        com.scandit.datacapture.barcode.internal.module.shared.c cVar = this.f123665m;
        synchronized (cVar) {
            cVar.f122828e.invoke();
        }
    }

    public final void setListener(BarcodePickViewListener barcodePickViewListener) {
        this.listener = barcodePickViewListener;
    }

    public final void setUiListener(BarcodePickViewUiListener barcodePickViewUiListener) {
        this.uiListener = barcodePickViewUiListener;
    }

    public final void start() {
        this.f123665m.d();
    }

    public final void stop() {
        this.f123665m.e();
    }

    public static final void access$onHardwareKeyEvent(BarcodePickView barcodePickView, HardwareKeyEvent hardwareKeyEvent) {
        barcodePickView.getClass();
        if (WhenMappings.$EnumSwitchMapping$0[hardwareKeyEvent.ordinal()] == 1) {
            barcodePickView.a();
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int w10, int h10, int oldw, int oldh) {
        super.onSizeChanged(w10, h10, oldw, oldh);
        post(new Runnable() { // from class: com.scandit.datacapture.barcode.pick.ui.B
            @Override // java.lang.Runnable
            public final void run() {
                BarcodePickView.a(this.f123642a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a() {
        com.scandit.datacapture.barcode.internal.module.shared.c cVar = this.f123665m;
        synchronized (cVar) {
            try {
                com.scandit.datacapture.barcode.internal.module.shared.b bVarC = cVar.c();
                bVarC.getClass();
                if (bVarC == com.scandit.datacapture.barcode.internal.module.shared.b.f122820b) {
                    cVar.a();
                } else {
                    cVar.d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
