package com.scandit.datacapture.core.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.view.OrientationEventListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.annotation.Keep;
import com.scandit.datacapture.core.R;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.DataCaptureContextListener;
import com.scandit.datacapture.core.capture.DataCaptureMode;
import com.scandit.datacapture.core.common.ContextStatus;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.FloatWithUnit;
import com.scandit.datacapture.core.common.geometry.MarginsWithUnit;
import com.scandit.datacapture.core.common.geometry.MeasureUnit;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.common.geometry.SizeWithUnit;
import com.scandit.datacapture.core.internal.module.ui.DataCaptureTextureView;
import com.scandit.datacapture.core.internal.module.ui.ErrorOverlay;
import com.scandit.datacapture.core.internal.module.ui.GestureRecognizer;
import com.scandit.datacapture.core.internal.module.ui.NativeContextStatusListener;
import com.scandit.datacapture.core.internal.module.ui.NativeDataCaptureView;
import com.scandit.datacapture.core.internal.module.ui.ViewSizeAndRotation;
import com.scandit.datacapture.core.internal.module.ui.control.layout.ControlLayout;
import com.scandit.datacapture.core.internal.module.ui.hint.j;
import com.scandit.datacapture.core.internal.module.ui.hint.k;
import com.scandit.datacapture.core.internal.module.ui.hint.q;
import com.scandit.datacapture.core.internal.module.ui.hint.z;
import com.scandit.datacapture.core.internal.module.ui.video.NativeVideoPreview;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.common.NativeContextStatus;
import com.scandit.datacapture.core.internal.sdk.common.NativeError;
import com.scandit.datacapture.core.internal.sdk.extensions.AnchorExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.extensions.ContextExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.extensions.RotationExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.extensions.ViewExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.ui.ContextStatusPresenter;
import com.scandit.datacapture.core.internal.sdk.ui.NeedsRedrawListener;
import com.scandit.datacapture.core.internal.sdk.ui.hint.HintHolderV2;
import com.scandit.datacapture.core.internal.sdk.ui.hint.HintPresenterV2;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.ViewBasedDataCaptureOverlay;
import com.scandit.datacapture.core.source.FrameSource;
import com.scandit.datacapture.core.ui.control.CameraSwitchControl;
import com.scandit.datacapture.core.ui.control.Control;
import com.scandit.datacapture.core.ui.control.LinearControlGroup;
import com.scandit.datacapture.core.ui.control.TorchSwitchControl;
import com.scandit.datacapture.core.ui.control.ZoomSwitchControl;
import com.scandit.datacapture.core.ui.gesture.FocusGesture;
import com.scandit.datacapture.core.ui.gesture.SwipeToZoom;
import com.scandit.datacapture.core.ui.gesture.TapToFocus;
import com.scandit.datacapture.core.ui.gesture.ZoomGesture;
import com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

@Metadata(d1 = {"\u0000\u0082\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0006\b\u0007\u0018\u0000 µ\u00012\u00020\u00012\u00020\u0002:\u0002µ\u0001B7\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0097\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H\u0097\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0011H\u0097\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011H\u0097\u0001¢\u0006\u0004\b\u0019\u0010\u0018J\u0018\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0097\u0001¢\u0006\u0004\b\u001a\u0010\u0013J\u0018\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001bH\u0097\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0011H\u0097\u0001¢\u0006\u0004\b\u001f\u0010\u0018J\u0018\u0010\"\u001a\u00020\u00112\u0006\u0010!\u001a\u00020 H\u0097\u0001¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u00020\u00112\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020\u0011H\u0000¢\u0006\u0004\b(\u0010\u0018J\u000f\u0010+\u001a\u00020\u0011H\u0000¢\u0006\u0004\b*\u0010\u0018J\u000f\u0010-\u001a\u00020\u0011H\u0000¢\u0006\u0004\b,\u0010\u0018J\u0015\u0010.\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b.\u0010\u0013J\u0015\u0010/\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b/\u0010\u0013J\u000f\u00100\u001a\u00020\u0011H\u0014¢\u0006\u0004\b0\u0010\u0018J\u000f\u00101\u001a\u00020\u0011H\u0014¢\u0006\u0004\b1\u0010\u0018J\u0015\u00103\u001a\u00020\u00112\u0006\u0010!\u001a\u000202¢\u0006\u0004\b3\u00104J\u0015\u00105\u001a\u00020\u00112\u0006\u0010!\u001a\u000202¢\u0006\u0004\b5\u00104J\u0015\u00103\u001a\u00020\u00112\u0006\u0010!\u001a\u000206¢\u0006\u0004\b3\u00107J\u0015\u00105\u001a\u00020\u00112\u0006\u0010!\u001a\u000206¢\u0006\u0004\b5\u00107J/\u0010=\u001a\u00020\u00112\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u0002082\u0006\u0010;\u001a\u0002082\u0006\u0010<\u001a\u000208H\u0014¢\u0006\u0004\b=\u0010>J\u0015\u0010A\u001a\u00020?2\u0006\u0010@\u001a\u00020?¢\u0006\u0004\bA\u0010BJ\u0015\u0010E\u001a\u00020C2\u0006\u0010D\u001a\u00020C¢\u0006\u0004\bE\u0010FJ\u001d\u0010K\u001a\u00020\u00112\u0006\u0010H\u001a\u00020G2\u0006\u0010J\u001a\u00020I¢\u0006\u0004\bK\u0010LJ\u0015\u0010O\u001a\u00020\u00112\u0006\u0010N\u001a\u00020M¢\u0006\u0004\bO\u0010PJ%\u0010O\u001a\u00020\u00112\u0006\u0010N\u001a\u00020M2\u0006\u0010R\u001a\u00020Q2\u0006\u0010T\u001a\u00020S¢\u0006\u0004\bO\u0010UJ\u0015\u0010V\u001a\u00020\u00112\u0006\u0010N\u001a\u00020M¢\u0006\u0004\bV\u0010PJ\u000f\u0010X\u001a\u00020\u0011H\u0000¢\u0006\u0004\bW\u0010\u0018R&\u0010_\u001a\b\u0012\u0004\u0012\u00020\u000f0Y8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bZ\u0010[\u0012\u0004\b^\u0010\u0018\u001a\u0004\b\\\u0010]R \u0010f\u001a\u00020`8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\ba\u0010b\u0012\u0004\be\u0010\u0018\u001a\u0004\bc\u0010dR\u0014\u0010%\u001a\u00020g8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010hR\u0014\u0010j\u001a\u00020i8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0016\u0010m\u001a\u00020l8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bm\u0010nR1\u0010x\u001a\u00020o2\u0006\u0010p\u001a\u00020o8@@@X\u0081\u008e\u0002¢\u0006\u0018\n\u0004\bq\u0010r\u0012\u0004\bw\u0010\u0018\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR.\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010J\u001a\u0004\u0018\u00010\u00058\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R5\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u007f2\b\u0010J\u001a\u0004\u0018\u00010\u007f8\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R7\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u0087\u00012\t\u0010J\u001a\u0005\u0018\u00010\u0087\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R*\u0010\u0096\u0001\u001a\u00030\u008f\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R)\u0010\u009b\u0001\u001a\u00020Q2\u0006\u0010p\u001a\u00020Q8W@WX\u0096\u000f¢\u0006\u0010\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R)\u0010 \u0001\u001a\u00020S2\u0006\u0010p\u001a\u00020S8W@WX\u0096\u000f¢\u0006\u0010\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R+\u0010¦\u0001\u001a\u00030¡\u00012\u0007\u0010p\u001a\u00030¡\u00018W@WX\u0096\u000f¢\u0006\u0010\u001a\u0006\b¢\u0001\u0010£\u0001\"\u0006\b¤\u0001\u0010¥\u0001R)\u0010©\u0001\u001a\u00020S2\u0006\u0010p\u001a\u00020S8W@WX\u0096\u000f¢\u0006\u0010\u001a\u0006\b§\u0001\u0010\u009d\u0001\"\u0006\b¨\u0001\u0010\u009f\u0001R+\u0010¯\u0001\u001a\u00030ª\u00012\u0007\u0010p\u001a\u00030ª\u00018W@WX\u0096\u000f¢\u0006\u0010\u001a\u0006\b«\u0001\u0010¬\u0001\"\u0006\b\u00ad\u0001\u0010®\u0001R%\u0010´\u0001\u001a\t\u0012\u0004\u0012\u00020M0°\u00018@X\u0081\u0004¢\u0006\u000f\u0012\u0005\b³\u0001\u0010\u0018\u001a\u0006\b±\u0001\u0010²\u0001¨\u0006¶\u0001"}, d2 = {"Lcom/scandit/datacapture/core/ui/DataCaptureView;", "Landroid/widget/RelativeLayout;", "Lcom/scandit/datacapture/core/ui/DataCaptureViewProxy;", "Landroid/content/Context;", "context", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "Lcom/scandit/datacapture/core/internal/module/ui/video/NativeVideoPreview;", "videoPreview", "Lcom/scandit/datacapture/core/internal/sdk/ui/ContextStatusPresenter;", "contextStatusPresenter", "", "pixelsPerDip", "<init>", "(Landroid/content/Context;Lcom/scandit/datacapture/core/capture/DataCaptureContext;Lcom/scandit/datacapture/core/internal/module/ui/video/NativeVideoPreview;Lcom/scandit/datacapture/core/internal/sdk/ui/ContextStatusPresenter;F)V", "Lcom/scandit/datacapture/core/ui/overlay/DataCaptureOverlay;", "overlay", "", "_addOverlay", "(Lcom/scandit/datacapture/core/ui/overlay/DataCaptureOverlay;)V", "Lcom/scandit/datacapture/core/internal/module/ui/NativeDataCaptureView;", "_impl", "()Lcom/scandit/datacapture/core/internal/module/ui/NativeDataCaptureView;", "_performUiTriggeredZoomIn", "()V", "_performUiTriggeredZoomOut", "_removeOverlay", "Lcom/scandit/datacapture/core/internal/module/ui/GestureRecognizer;", "recognizer", "_setGestureRecognizer", "(Lcom/scandit/datacapture/core/internal/module/ui/GestureRecognizer;)V", "_setNeedsRedraw", "Lcom/scandit/datacapture/core/internal/sdk/ui/NeedsRedrawListener;", "listener", "_setNeedsRedrawListener", "(Lcom/scandit/datacapture/core/internal/sdk/ui/NeedsRedrawListener;)V", "Lcom/scandit/datacapture/core/internal/sdk/ui/hint/HintHolderV2;", "hintHolder", "_overrideHintHolderV2", "(Lcom/scandit/datacapture/core/internal/sdk/ui/hint/HintHolderV2;)V", "onSurfaceTextureAvailable$scandit_capture_core", "onSurfaceTextureAvailable", "onSurfaceTextureDestroyed$scandit_capture_core", "onSurfaceTextureDestroyed", "onSurfaceTextureUpdated$scandit_capture_core", "onSurfaceTextureUpdated", "addOverlay", "removeOverlay", "onAttachedToWindow", "onDetachedFromWindow", "Lcom/scandit/datacapture/core/ui/DataCaptureViewListener;", "addListener", "(Lcom/scandit/datacapture/core/ui/DataCaptureViewListener;)V", "removeListener", "Lcom/scandit/datacapture/core/ui/DataCaptureViewSizeListener;", "(Lcom/scandit/datacapture/core/ui/DataCaptureViewSizeListener;)V", "", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Lcom/scandit/datacapture/core/common/geometry/Point;", "point", "mapFramePointToView", "(Lcom/scandit/datacapture/core/common/geometry/Point;)Lcom/scandit/datacapture/core/common/geometry/Point;", "Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;", "quadrilateral", "mapFrameQuadrilateralToView", "(Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;)Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;", "", "name", "", "value", "setProperty", "(Ljava/lang/String;Ljava/lang/Object;)V", "Lcom/scandit/datacapture/core/ui/control/Control;", "control", "addControl", "(Lcom/scandit/datacapture/core/ui/control/Control;)V", "Lcom/scandit/datacapture/core/common/geometry/Anchor;", "anchor", "Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "offset", "(Lcom/scandit/datacapture/core/ui/control/Control;Lcom/scandit/datacapture/core/common/geometry/Anchor;Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;)V", "removeControl", "removeAllControls$scandit_capture_core", "removeAllControls", "", "f", "Ljava/util/Set;", "get_overlays", "()Ljava/util/Set;", "get_overlays$annotations", "_overlays", "Lcom/scandit/datacapture/core/internal/module/ui/control/layout/ControlLayout;", "j", "Lcom/scandit/datacapture/core/internal/module/ui/control/layout/ControlLayout;", "getControlLayout$scandit_capture_core", "()Lcom/scandit/datacapture/core/internal/module/ui/control/layout/ControlLayout;", "getControlLayout$scandit_capture_core$annotations", "controlLayout", "Lcom/scandit/datacapture/core/internal/module/ui/hint/q;", "Lcom/scandit/datacapture/core/internal/module/ui/hint/q;", "Lcom/scandit/datacapture/core/internal/module/ui/hint/z;", "hintPresenter", "Lcom/scandit/datacapture/core/internal/module/ui/hint/z;", "Lcom/scandit/datacapture/core/internal/sdk/ui/hint/HintPresenterV2;", "hintPresenterV2", "Lcom/scandit/datacapture/core/internal/sdk/ui/hint/HintPresenterV2;", "Lcom/scandit/datacapture/core/internal/module/ui/ViewSizeAndRotation;", "<set-?>", "p", "Lkotlin/properties/ReadWriteProperty;", "getCurrentSize$scandit_capture_core", "()Lcom/scandit/datacapture/core/internal/module/ui/ViewSizeAndRotation;", "setCurrentSize$scandit_capture_core", "(Lcom/scandit/datacapture/core/internal/module/ui/ViewSizeAndRotation;)V", "getCurrentSize$scandit_capture_core$annotations", "currentSize", "r", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "getDataCaptureContext", "()Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "setDataCaptureContext", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;)V", "Lcom/scandit/datacapture/core/ui/gesture/FocusGesture;", "s", "Lcom/scandit/datacapture/core/ui/gesture/FocusGesture;", "getFocusGesture", "()Lcom/scandit/datacapture/core/ui/gesture/FocusGesture;", "setFocusGesture", "(Lcom/scandit/datacapture/core/ui/gesture/FocusGesture;)V", "focusGesture", "Lcom/scandit/datacapture/core/ui/gesture/ZoomGesture;", "t", "Lcom/scandit/datacapture/core/ui/gesture/ZoomGesture;", "getZoomGesture", "()Lcom/scandit/datacapture/core/ui/gesture/ZoomGesture;", "setZoomGesture", "(Lcom/scandit/datacapture/core/ui/gesture/ZoomGesture;)V", "zoomGesture", "", "u", "Z", "get_optimizesRendering$scandit_capture_core", "()Z", "set_optimizesRendering$scandit_capture_core", "(Z)V", "_optimizesRendering", "getLogoAnchor", "()Lcom/scandit/datacapture/core/common/geometry/Anchor;", "setLogoAnchor", "(Lcom/scandit/datacapture/core/common/geometry/Anchor;)V", "logoAnchor", "getLogoOffset", "()Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "setLogoOffset", "(Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;)V", "logoOffset", "Lcom/scandit/datacapture/core/ui/LogoStyle;", "getLogoStyle", "()Lcom/scandit/datacapture/core/ui/LogoStyle;", "setLogoStyle", "(Lcom/scandit/datacapture/core/ui/LogoStyle;)V", "logoStyle", "getPointOfInterest", "setPointOfInterest", "pointOfInterest", "Lcom/scandit/datacapture/core/common/geometry/MarginsWithUnit;", "getScanAreaMargins", "()Lcom/scandit/datacapture/core/common/geometry/MarginsWithUnit;", "setScanAreaMargins", "(Lcom/scandit/datacapture/core/common/geometry/MarginsWithUnit;)V", "scanAreaMargins", "", "getControls$scandit_capture_core", "()Ljava/util/Collection;", "getControls$scandit_capture_core$annotations", "controls", "Companion", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"ViewConstructor"})
@Mockable
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class DataCaptureView extends RelativeLayout implements DataCaptureViewProxy {

    /* renamed from: a, reason: collision with root package name */
    private final ContextStatusPresenter f126896a;

    /* renamed from: b, reason: collision with root package name */
    private final float f126897b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ DataCaptureViewProxyAdapter f126898c;

    /* renamed from: d, reason: collision with root package name */
    private final CopyOnWriteArraySet f126899d;

    /* renamed from: e, reason: collision with root package name */
    private final CopyOnWriteArraySet f126900e;

    /* renamed from: f, reason: collision with root package name */
    private final CopyOnWriteArraySet f126901f;

    /* renamed from: g, reason: collision with root package name */
    private final DataCaptureTextureView f126902g;

    /* renamed from: h, reason: collision with root package name */
    private final FrameLayout f126903h;

    @Keep
    private final q hintHolder;

    @Keep
    private final z hintPresenter;

    @Keep
    private HintPresenterV2 hintPresenterV2;

    /* renamed from: i, reason: collision with root package name */
    private boolean f126904i;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final ControlLayout controlLayout;

    /* renamed from: k, reason: collision with root package name */
    private HintHolderV2 f126906k;

    /* renamed from: l, reason: collision with root package name */
    private final ErrorOverlay f126907l;

    /* renamed from: m, reason: collision with root package name */
    private final DataCaptureView$contextStatusView$1 f126908m;

    /* renamed from: n, reason: collision with root package name */
    private final DataCaptureView$orientationEventListener$1 f126909n;

    /* renamed from: o, reason: collision with root package name */
    private int f126910o;

    /* renamed from: p, reason: collision with root package name */
    private final DataCaptureView$special$$inlined$distinctObservable$1 f126911p;

    /* renamed from: q, reason: collision with root package name */
    private final DataCaptureView$dataCaptureContextListener$1 f126912q;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private DataCaptureContext dataCaptureContext;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private FocusGesture focusGesture;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private ZoomGesture zoomGesture;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private boolean _optimizesRendering;

    /* renamed from: v, reason: collision with root package name */
    static final /* synthetic */ KProperty[] f126895v = {Reflection.f(new MutablePropertyReference1Impl(Reflection.b(DataCaptureView.class), "currentSize", "getCurrentSize$scandit_capture_core()Lcom/scandit/datacapture/core/internal/module/ui/ViewSizeAndRotation;"))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/scandit/datacapture/core/ui/DataCaptureView$Companion;", "", "Landroid/content/Context;", "context", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "Lcom/scandit/datacapture/core/ui/DataCaptureView;", "newInstance", "(Landroid/content/Context;Lcom/scandit/datacapture/core/capture/DataCaptureContext;)Lcom/scandit/datacapture/core/ui/DataCaptureView;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        @JvmStatic
        public final DataCaptureView newInstance(Context context, DataCaptureContext dataCaptureContext) {
            Intrinsics.j(context, "context");
            NativeVideoPreview nativeVideoPreviewCreate = NativeVideoPreview.create();
            Intrinsics.i(nativeVideoPreviewCreate, "create(...)");
            return new DataCaptureView(context, dataCaptureContext, nativeVideoPreviewCreate, null, 0.0f, 24, null);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public /* synthetic */ DataCaptureView(Context context, DataCaptureContext dataCaptureContext, NativeVideoPreview nativeVideoPreview, ContextStatusPresenter contextStatusPresenter, float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, dataCaptureContext, nativeVideoPreview, (i10 & 8) != 0 ? new com.scandit.datacapture.core.internal.module.ui.a() : contextStatusPresenter, (i10 & 16) != 0 ? context.getResources().getDisplayMetrics().density : f10);
    }

    public static /* synthetic */ void getControlLayout$scandit_capture_core$annotations() {
    }

    public static /* synthetic */ void getControls$scandit_capture_core$annotations() {
    }

    public static /* synthetic */ void getCurrentSize$scandit_capture_core$annotations() {
    }

    public static /* synthetic */ void get_overlays$annotations() {
    }

    @JvmStatic
    public static final DataCaptureView newInstance(Context context, DataCaptureContext dataCaptureContext) {
        return INSTANCE.newInstance(context, dataCaptureContext);
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewProxy
    @ProxyFunction(nativeName = "addOverlay")
    public void _addOverlay(DataCaptureOverlay overlay) {
        Intrinsics.j(overlay, "overlay");
        this.f126898c._addOverlay(overlay);
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeDataCaptureView getF126923a() {
        return this.f126898c.getF126923a();
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewProxy
    @ProxyFunction(nativeName = "performUiTriggeredZoomIn")
    public void _performUiTriggeredZoomIn() {
        this.f126898c._performUiTriggeredZoomIn();
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewProxy
    @ProxyFunction(nativeName = "performUiTriggeredZoomOut")
    public void _performUiTriggeredZoomOut() {
        this.f126898c._performUiTriggeredZoomOut();
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewProxy
    @ProxyFunction(nativeName = "removeOverlay")
    public void _removeOverlay(DataCaptureOverlay overlay) {
        Intrinsics.j(overlay, "overlay");
        this.f126898c._removeOverlay(overlay);
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewProxy
    @ProxyFunction(nativeName = "setGestureRecognizer")
    public void _setGestureRecognizer(GestureRecognizer recognizer) {
        Intrinsics.j(recognizer, "recognizer");
        this.f126898c._setGestureRecognizer(recognizer);
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewProxy
    @ProxyFunction(nativeName = "setNeedsRedraw")
    public void _setNeedsRedraw() {
        this.f126898c._setNeedsRedraw();
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewProxy
    @ProxyFunction(nativeName = "setNeedsRedrawDelegate")
    public void _setNeedsRedrawListener(NeedsRedrawListener listener) {
        Intrinsics.j(listener, "listener");
        this.f126898c._setNeedsRedrawListener(listener);
    }

    public final void addControl(Control control) {
        Intrinsics.j(control, "control");
        int i10 = ControlLayout.f126145c;
        Intrinsics.j(control, "control");
        Anchor anchor = control instanceof TorchSwitchControl ? Anchor.TOP_LEFT : control instanceof CameraSwitchControl ? Anchor.TOP_RIGHT : ((control instanceof ZoomSwitchControl) || (control instanceof LinearControlGroup)) ? Anchor.BOTTOM_RIGHT : Anchor.TOP_LEFT;
        addControl(control, anchor, AnchorExtensionsKt.getDefaultOffset(anchor));
    }

    public final void addListener(DataCaptureViewListener listener) {
        Intrinsics.j(listener, "listener");
        this.f126899d.add(listener);
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewProxy
    @ProxyFunction(property = "logoAnchor")
    public Anchor getLogoAnchor() {
        return this.f126898c.getLogoAnchor();
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewProxy
    @ProxyFunction(property = "logoOffset")
    public PointWithUnit getLogoOffset() {
        return this.f126898c.getLogoOffset();
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewProxy
    @ProxyFunction(property = "logoStyle")
    public LogoStyle getLogoStyle() {
        return this.f126898c.getLogoStyle();
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewProxy
    @ProxyFunction(property = "pointOfInterest")
    public PointWithUnit getPointOfInterest() {
        return this.f126898c.getPointOfInterest();
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewProxy
    @ProxyFunction(property = "scanAreaMargins")
    public MarginsWithUnit getScanAreaMargins() {
        return this.f126898c.getScanAreaMargins();
    }

    public final synchronized void onSurfaceTextureAvailable$scandit_capture_core() {
        try {
            DataCaptureContext dataCaptureContext = this.dataCaptureContext;
            if (dataCaptureContext != null) {
                if (!this.f126904i) {
                    dataCaptureContext.addListener(this.f126912q);
                }
                getF126923a().setDataCaptureContext(dataCaptureContext.getF125005a());
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                Context context = getContext();
                Intrinsics.i(context, "getContext(...)");
                setCurrentSize$scandit_capture_core(new ViewSizeAndRotation(measuredWidth, measuredHeight, ContextExtensionsKt.getRotation(context)));
            }
            this.f126904i = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void onSurfaceTextureDestroyed$scandit_capture_core() {
        this.f126904i = false;
        DataCaptureContext dataCaptureContext = this.dataCaptureContext;
        if (dataCaptureContext != null) {
            dataCaptureContext.removeListener(this.f126912q);
        }
    }

    public final synchronized void onSurfaceTextureUpdated$scandit_capture_core() {
        try {
            if (getF126923a().isDisplayingViewfinder()) {
                this.f126906k.setViewFinderRect(getF126923a().getViewfinderRect());
            } else {
                this.f126906k.setViewFinderRect(null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void removeListener(DataCaptureViewListener listener) {
        Intrinsics.j(listener, "listener");
        this.f126899d.remove(listener);
    }

    public final void setDataCaptureContext(DataCaptureContext dataCaptureContext) {
        synchronized (this) {
            try {
                DataCaptureContext dataCaptureContext2 = this.dataCaptureContext;
                if (dataCaptureContext2 != null && this.f126904i) {
                    dataCaptureContext2.removeListener(this.f126912q);
                }
                this.dataCaptureContext = dataCaptureContext;
                if (dataCaptureContext != null) {
                    if (this.f126904i) {
                        dataCaptureContext.addListener(this.f126912q);
                        int measuredWidth = getMeasuredWidth();
                        int measuredHeight = getMeasuredHeight();
                        Context context = getContext();
                        Intrinsics.i(context, "getContext(...)");
                        setCurrentSize$scandit_capture_core(new ViewSizeAndRotation(measuredWidth, measuredHeight, ContextExtensionsKt.getRotation(context)));
                    }
                    NativeDataCaptureView nativeDataCaptureView_impl = getF126923a();
                    DataCaptureContext dataCaptureContext3 = this.dataCaptureContext;
                    nativeDataCaptureView_impl.setDataCaptureContext(dataCaptureContext3 != null ? dataCaptureContext3.getF125005a() : null);
                }
                Iterator<T> it = getControls$scandit_capture_core().iterator();
                while (it.hasNext()) {
                    ((Control) it.next())._onDataCaptureContextChanged(this.dataCaptureContext);
                }
                Unit unit = Unit.f143329a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewProxy
    @ProxyFunction(property = "logoAnchor")
    public void setLogoAnchor(Anchor anchor) {
        Intrinsics.j(anchor, "<set-?>");
        this.f126898c.setLogoAnchor(anchor);
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewProxy
    @ProxyFunction(property = "logoOffset")
    public void setLogoOffset(PointWithUnit pointWithUnit) {
        Intrinsics.j(pointWithUnit, "<set-?>");
        this.f126898c.setLogoOffset(pointWithUnit);
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewProxy
    @ProxyFunction(property = "logoStyle")
    public void setLogoStyle(LogoStyle logoStyle) {
        Intrinsics.j(logoStyle, "<set-?>");
        this.f126898c.setLogoStyle(logoStyle);
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewProxy
    @ProxyFunction(property = "pointOfInterest")
    public void setPointOfInterest(PointWithUnit pointWithUnit) {
        Intrinsics.j(pointWithUnit, "<set-?>");
        this.f126898c.setPointOfInterest(pointWithUnit);
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewProxy
    @ProxyFunction(property = "scanAreaMargins")
    public void setScanAreaMargins(MarginsWithUnit marginsWithUnit) {
        Intrinsics.j(marginsWithUnit, "<set-?>");
        this.f126898c.setScanAreaMargins(marginsWithUnit);
    }

    public final void _overrideHintHolderV2(HintHolderV2 hintHolder) {
        Intrinsics.j(hintHolder, "hintHolder");
        ViewExtensionsKt.removeFromSuperview(this.f126906k.asView());
        this.f126906k = hintHolder;
        this.hintPresenterV2 = new HintPresenterV2(hintHolder);
        getF126923a().setHintPresenterV2(this.hintPresenterV2.get_impl());
    }

    public final void addListener(DataCaptureViewSizeListener listener) {
        Intrinsics.j(listener, "listener");
        this.f126900e.add(listener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void addOverlay(DataCaptureOverlay overlay) {
        Intrinsics.j(overlay, "overlay");
        _addOverlay(overlay);
        if (this.f126901f.add(overlay) && (overlay instanceof ViewBasedDataCaptureOverlay)) {
            View view = (View) overlay;
            if (this.f126903h.indexOfChild(view) == -1) {
                this.f126903h.addView(view, new RelativeLayout.LayoutParams(-1, -1));
                ((ViewBasedDataCaptureOverlay) overlay)._setDataCaptureView(this);
            }
        }
    }

    /* renamed from: getControlLayout$scandit_capture_core, reason: from getter */
    public final ControlLayout getControlLayout() {
        return this.controlLayout;
    }

    public final Collection<Control> getControls$scandit_capture_core() {
        return this.controlLayout.a();
    }

    public final ViewSizeAndRotation getCurrentSize$scandit_capture_core() {
        return getValue(this, f126895v[0]);
    }

    public final DataCaptureContext getDataCaptureContext() {
        return this.dataCaptureContext;
    }

    public final FocusGesture getFocusGesture() {
        return this.focusGesture;
    }

    public final ZoomGesture getZoomGesture() {
        return this.zoomGesture;
    }

    /* renamed from: get_optimizesRendering$scandit_capture_core, reason: from getter */
    public final boolean get_optimizesRendering() {
        return this._optimizesRendering;
    }

    public final Set<DataCaptureOverlay> get_overlays() {
        return this.f126901f;
    }

    public final Point mapFramePointToView(Point point) {
        Intrinsics.j(point, "point");
        Point pointMapFramePointToView = getF126923a().mapFramePointToView(point);
        return new Point(pointMapFramePointToView.getX() * this.f126897b, pointMapFramePointToView.getY() * this.f126897b);
    }

    public final Quadrilateral mapFrameQuadrilateralToView(Quadrilateral quadrilateral) {
        Intrinsics.j(quadrilateral, "quadrilateral");
        Point topLeft = quadrilateral.getTopLeft();
        Intrinsics.i(topLeft, "getTopLeft(...)");
        Point pointMapFramePointToView = mapFramePointToView(topLeft);
        Point topRight = quadrilateral.getTopRight();
        Intrinsics.i(topRight, "getTopRight(...)");
        Point pointMapFramePointToView2 = mapFramePointToView(topRight);
        Point bottomRight = quadrilateral.getBottomRight();
        Intrinsics.i(bottomRight, "getBottomRight(...)");
        Point pointMapFramePointToView3 = mapFramePointToView(bottomRight);
        Point bottomLeft = quadrilateral.getBottomLeft();
        Intrinsics.i(bottomLeft, "getBottomLeft(...)");
        return new Quadrilateral(pointMapFramePointToView, pointMapFramePointToView2, pointMapFramePointToView3, mapFramePointToView(bottomLeft));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        disable();
        this.f126896a.setView(null);
        getF126923a().setContextStatusListener(null);
        getF126923a().detachFromWindow();
        super.onDetachedFromWindow();
    }

    public final void removeAllControls$scandit_capture_core() {
        this.controlLayout.c();
    }

    public final void removeControl(Control control) {
        Intrinsics.j(control, "control");
        this.controlLayout.a(control);
    }

    public final void removeListener(DataCaptureViewSizeListener listener) {
        Intrinsics.j(listener, "listener");
        this.f126900e.remove(listener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void removeOverlay(DataCaptureOverlay overlay) {
        Intrinsics.j(overlay, "overlay");
        _removeOverlay(overlay);
        this.f126901f.remove(overlay);
        if (overlay instanceof ViewBasedDataCaptureOverlay) {
            this.f126903h.removeView((View) overlay);
            ((ViewBasedDataCaptureOverlay) overlay)._cleanupViews();
        }
    }

    public final void setCurrentSize$scandit_capture_core(ViewSizeAndRotation viewSizeAndRotation) {
        Intrinsics.j(viewSizeAndRotation, "<set-?>");
        setValue(this, f126895v[0], viewSizeAndRotation);
    }

    public final void setFocusGesture(FocusGesture focusGesture) {
        this.focusGesture = focusGesture;
        getF126923a().setFocusGesture(focusGesture != null ? focusGesture.getF127051c() : null);
    }

    public final void setProperty(String name, Object value) {
        Boolean bool;
        Intrinsics.j(name, "name");
        Intrinsics.j(value, "value");
        if (Intrinsics.e(name, "logoHidden")) {
            bool = value instanceof Boolean ? (Boolean) value : null;
            if (bool != null) {
                getF126923a().setLogoHidden(bool.booleanValue());
                return;
            }
            return;
        }
        if (Intrinsics.e(name, "optimizesRendering")) {
            bool = value instanceof Boolean ? (Boolean) value : null;
            if (bool != null) {
                this._optimizesRendering = bool.booleanValue();
            }
        }
    }

    public final void setZoomGesture(ZoomGesture zoomGesture) {
        this.zoomGesture = zoomGesture;
        getF126923a().setZoomGesture(zoomGesture != null ? zoomGesture.getF127046c() : null);
        Iterator<T> it = getControls$scandit_capture_core().iterator();
        while (it.hasNext()) {
            ((Control) it.next())._onZoomGestureChanged(this.zoomGesture);
        }
    }

    public final void set_optimizesRendering$scandit_capture_core(boolean z10) {
        this._optimizesRendering = z10;
    }

    public static final void access$updateFrameOfReferenceViewSizeAndOrientation(DataCaptureView dataCaptureView, int i10, int i11, int i12) {
        dataCaptureView.getClass();
        int angle = RotationExtensionsKt.toAngle(i12);
        MeasureUnit measureUnit = MeasureUnit.PIXEL;
        SizeWithUnit sizeWithUnit = new SizeWithUnit(new FloatWithUnit(i10, measureUnit), new FloatWithUnit(i11, measureUnit));
        dataCaptureView.getF126923a().setPreviewOrientation(angle);
        NativeDataCaptureContext dataCaptureContext = dataCaptureView.getF126923a().getDataCaptureContext();
        if (dataCaptureContext != null) {
            dataCaptureContext.setFrameOfReferenceViewSizeAndOrientation(sizeWithUnit, dataCaptureView.f126897b, angle);
        }
        Iterator it = dataCaptureView.f126899d.iterator();
        while (it.hasNext()) {
            ((DataCaptureViewListener) it.next()).onSizeChanged(i10, i11, i12);
        }
        Iterator it2 = dataCaptureView.f126900e.iterator();
        while (it2.hasNext()) {
            ((DataCaptureViewSizeListener) it2.next()).onSizeChanged(dataCaptureView, i10, i11, i12);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() throws Resources.NotFoundException {
        super.onAttachedToWindow();
        this.f126896a.setView(this.f126908m);
        enable();
        getF126923a().setContextStatusListener(new NativeContextStatusListener() { // from class: com.scandit.datacapture.core.ui.DataCaptureView.onAttachedToWindow.1
            @Override // com.scandit.datacapture.core.internal.module.ui.NativeContextStatusListener
            public void onStatusChanged(NativeContextStatus status) {
                Intrinsics.j(status, "status");
                DataCaptureView.this.f126896a.onStatusChanged(new ContextStatus(status));
            }

            @Override // com.scandit.datacapture.core.internal.module.ui.NativeContextStatusListener
            public void onWarningsChanged(ArrayList<NativeError> warnings) {
                Intrinsics.j(warnings, "warnings");
                DataCaptureView.this.f126896a.onWarningsChanged(warnings);
            }
        });
        getF126923a().attachToWindow();
        if (!isHardwareAccelerated()) {
            String string = getResources().getString(R.string.sc_hardware_acceleration_required);
            Intrinsics.i(string, "getString(...)");
            Toast.makeText(getContext(), string, 1).show();
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int w10, int h10, int oldw, int oldh) {
        super.onSizeChanged(w10, h10, oldw, oldh);
        Context context = getContext();
        Intrinsics.i(context, "getContext(...)");
        setCurrentSize$scandit_capture_core(new ViewSizeAndRotation(w10, h10, ContextExtensionsKt.getRotation(context)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.scandit.datacapture.core.ui.DataCaptureView$orientationEventListener$1] */
    /* JADX WARN: Type inference failed for: r7v3, types: [com.scandit.datacapture.core.ui.DataCaptureView$special$$inlined$distinctObservable$1] */
    /* JADX WARN: Type inference failed for: r7v4, types: [com.scandit.datacapture.core.ui.DataCaptureView$dataCaptureContextListener$1] */
    public DataCaptureView(final Context context, DataCaptureContext dataCaptureContext, NativeVideoPreview videoPreview, ContextStatusPresenter contextStatusPresenter, float f10) {
        super(context);
        Intrinsics.j(context, "context");
        Intrinsics.j(videoPreview, "videoPreview");
        Intrinsics.j(contextStatusPresenter, "contextStatusPresenter");
        this.f126896a = contextStatusPresenter;
        this.f126897b = f10;
        NativeDataCaptureView nativeDataCaptureViewCreate = NativeDataCaptureView.create(f10, videoPreview.asVideoGeometryListener());
        Intrinsics.i(nativeDataCaptureViewCreate, "create(...)");
        this.f126898c = new DataCaptureViewProxyAdapter(nativeDataCaptureViewCreate, null, 2, 0 == true ? 1 : 0);
        this.f126899d = new CopyOnWriteArraySet();
        this.f126900e = new CopyOnWriteArraySet();
        this.f126901f = new CopyOnWriteArraySet();
        DataCaptureTextureView dataCaptureTextureView = new DataCaptureTextureView(context, this, videoPreview);
        this.f126902g = dataCaptureTextureView;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.sc_overlay_container);
        this.f126903h = frameLayout;
        ControlLayout controlLayout = new ControlLayout(context, new com.scandit.datacapture.core.internal.module.ui.control.layout.d());
        this.controlLayout = controlLayout;
        j jVar = new j(this);
        this.hintHolder = jVar;
        this.hintPresenter = new z(jVar, new k());
        HintHolderV2 hintHolderV2Implementation = HintHolderV2.INSTANCE.implementation(context);
        this.f126906k = hintHolderV2Implementation;
        this.hintPresenterV2 = new HintPresenterV2(hintHolderV2Implementation);
        ErrorOverlay errorOverlay = new ErrorOverlay(context);
        errorOverlay.setVisibility(4);
        this.f126907l = errorOverlay;
        this.f126908m = new DataCaptureView$contextStatusView$1(this);
        this.f126909n = new OrientationEventListener(context, this) { // from class: com.scandit.datacapture.core.ui.DataCaptureView$orientationEventListener$1

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f126921a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ DataCaptureView f126922b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(context);
                this.f126921a = context;
                this.f126922b = this;
            }

            @Override // android.view.OrientationEventListener
            public void onOrientationChanged(int orientation) {
                int rotation = ContextExtensionsKt.getRotation(this.f126921a);
                if (rotation != this.f126922b.f126910o) {
                    DataCaptureView dataCaptureView = this.f126922b;
                    dataCaptureView.setCurrentSize$scandit_capture_core(new ViewSizeAndRotation(dataCaptureView.getMeasuredWidth(), this.f126922b.getMeasuredHeight(), rotation));
                    this.f126922b.f126910o = rotation;
                }
            }
        };
        this.f126910o = ContextExtensionsKt.getRotation(context);
        final ViewSizeAndRotation viewSizeAndRotation = new ViewSizeAndRotation(getMeasuredWidth(), getMeasuredHeight(), ContextExtensionsKt.getRotation(context));
        Delegates delegates = Delegates.f143781a;
        this.f126911p = new ObservableProperty<ViewSizeAndRotation>(viewSizeAndRotation) { // from class: com.scandit.datacapture.core.ui.DataCaptureView$special$$inlined$distinctObservable$1
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, ViewSizeAndRotation oldValue, ViewSizeAndRotation newValue) {
                Intrinsics.j(property, "property");
                if (Intrinsics.e(oldValue, newValue)) {
                    return;
                }
                ViewSizeAndRotation viewSizeAndRotation2 = newValue;
                DataCaptureView.access$updateFrameOfReferenceViewSizeAndOrientation(this, viewSizeAndRotation2.b(), viewSizeAndRotation2.c(), viewSizeAndRotation2.a());
            }
        };
        this.f126912q = new DataCaptureContextListener() { // from class: com.scandit.datacapture.core.ui.DataCaptureView$dataCaptureContextListener$1
            @Override // com.scandit.datacapture.core.capture.DataCaptureContextListener
            public void onFrameSourceChanged(DataCaptureContext dataCaptureContext2, FrameSource frameSource) {
                Intrinsics.j(dataCaptureContext2, "dataCaptureContext");
                this.f126919a.f126902g.a(frameSource);
                Iterator<T> it = this.f126919a.getControls$scandit_capture_core().iterator();
                while (it.hasNext()) {
                    ((Control) it.next())._onFrameSourceChanged(frameSource);
                }
            }

            @Override // com.scandit.datacapture.core.capture.DataCaptureContextListener
            public void onObservationStarted(DataCaptureContext dataCaptureContext2) {
                Intrinsics.j(dataCaptureContext2, "dataCaptureContext");
                this.f126919a.f126902g.a(dataCaptureContext2.get_frameSource());
                Iterator<T> it = this.f126919a.getControls$scandit_capture_core().iterator();
                while (it.hasNext()) {
                    ((Control) it.next())._onFrameSourceChanged(dataCaptureContext2.get_frameSource());
                }
            }

            @Override // com.scandit.datacapture.core.capture.DataCaptureContextListener
            public void onObservationStopped(DataCaptureContext dataCaptureContext2) {
                Intrinsics.j(dataCaptureContext2, "dataCaptureContext");
                this.f126919a.f126902g.a((FrameSource) null);
                Iterator<T> it = this.f126919a.getControls$scandit_capture_core().iterator();
                while (it.hasNext()) {
                    ((Control) it.next())._onFrameSourceChanged(null);
                }
            }

            @Override // com.scandit.datacapture.core.capture.DataCaptureContextListener
            public void onModeAdded(DataCaptureContext dataCaptureContext2, DataCaptureMode dataCaptureMode) {
                DataCaptureContextListener.DefaultImpls.onModeAdded(this, dataCaptureContext2, dataCaptureMode);
            }

            @Override // com.scandit.datacapture.core.capture.DataCaptureContextListener
            public void onModeRemoved(DataCaptureContext dataCaptureContext2, DataCaptureMode dataCaptureMode) {
                DataCaptureContextListener.DefaultImpls.onModeRemoved(this, dataCaptureContext2, dataCaptureMode);
            }

            @Override // com.scandit.datacapture.core.capture.DataCaptureContextListener
            public void onStatusChanged(DataCaptureContext dataCaptureContext2, ContextStatus contextStatus) {
                DataCaptureContextListener.DefaultImpls.onStatusChanged(this, dataCaptureContext2, contextStatus);
            }
        };
        this._optimizesRendering = true;
        setDataCaptureContext(dataCaptureContext);
        setBackgroundColor(-16777216);
        errorOverlay.setVisibility(4);
        ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        addView(dataCaptureTextureView, layoutParams);
        addView(errorOverlay, layoutParams);
        addView(frameLayout, layoutParams);
        addView(controlLayout, layoutParams);
        addView(this.f126906k.asView(), layoutParams);
        for (Control control : getControls$scandit_capture_core()) {
            control._onDataCaptureContextChanged(dataCaptureContext);
            control._onFrameSourceChanged(dataCaptureContext != null ? dataCaptureContext.get_frameSource() : null);
            control._onDataCaptureViewChanged(this);
            control._onZoomGestureChanged(this.zoomGesture);
        }
        getF126923a().setHintPresenter(this.hintPresenter);
        getF126923a().setHintPresenterV2(this.hintPresenterV2.get_impl());
        setFocusGesture(new TapToFocus());
        setZoomGesture(new SwipeToZoom());
    }

    public final void addControl(Control control, Anchor anchor, PointWithUnit offset) {
        Intrinsics.j(control, "control");
        Intrinsics.j(anchor, "anchor");
        Intrinsics.j(offset, "offset");
        this.controlLayout.a(control, anchor, offset);
        control._onDataCaptureContextChanged(this.dataCaptureContext);
        DataCaptureContext dataCaptureContext = this.dataCaptureContext;
        control._onFrameSourceChanged(dataCaptureContext != null ? dataCaptureContext.get_frameSource() : null);
        control._onDataCaptureViewChanged(this);
        control._onZoomGestureChanged(this.zoomGesture);
    }
}
