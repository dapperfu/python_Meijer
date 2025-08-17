package com.scandit.datacapture.barcode.spark.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.OrientationEventListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.barcode.hardwarebutton.HardwareButtonHelperKt;
import com.scandit.datacapture.barcode.hardwarebutton.HardwareKeyEvent;
import com.scandit.datacapture.barcode.internal.module.spark.capture.SparkScanEnableDisableListener;
import com.scandit.datacapture.barcode.internal.module.spark.capture.SparkScanModeViewListener;
import com.scandit.datacapture.barcode.internal.module.spark.data.C13194g;
import com.scandit.datacapture.barcode.internal.module.spark.data.O;
import com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanAnalyticsManager;
import com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanStateManager;
import com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanViewCameraManager;
import com.scandit.datacapture.barcode.internal.module.spark.ui.E;
import com.scandit.datacapture.barcode.internal.module.spark.ui.SparkScanViewPresenter;
import com.scandit.datacapture.barcode.internal.module.spark.ui.button.SparkScanViewScanButtonTouchListener;
import com.scandit.datacapture.barcode.internal.module.spark.ui.button.SparkScanViewScanButtonView;
import com.scandit.datacapture.barcode.internal.module.spark.ui.button.h;
import com.scandit.datacapture.barcode.internal.module.spark.ui.feedback.SparkScanFeedbackManager;
import com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.A;
import com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.F;
import com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview;
import com.scandit.datacapture.barcode.internal.module.spark.ui.toast.SparkScanViewToastPresenter;
import com.scandit.datacapture.barcode.internal.module.spark.ui.toast.s;
import com.scandit.datacapture.barcode.spark.capture.SparkScan;
import com.scandit.datacapture.barcode.spark.capture.SparkScanSettings;
import com.scandit.datacapture.barcode.spark.capture.SparkScanViewUiListener;
import com.scandit.datacapture.barcode.spark.feedback.SparkScanBarcodeFeedback;
import com.scandit.datacapture.barcode.spark.feedback.SparkScanFeedbackDelegate;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanStateMachine;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.internal.sdk.battery.BatterySavingManager;
import com.scandit.datacapture.core.internal.sdk.extensions.BitmapExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.extensions.ContextExtensionsKt;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\bm\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 ½\u00012\u00020\u0001:\u0002½\u0001B\u0083\u0001\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u001eH\u0014¢\u0006\u0004\b#\u0010$J\u0019\u0010'\u001a\u00020\"2\b\u0010&\u001a\u0004\u0018\u00010%H\u0014¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\"¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\"¢\u0006\u0004\b+\u0010*J\u0017\u0010.\u001a\u00020\"2\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\"¢\u0006\u0004\b0\u0010*J\r\u00101\u001a\u00020\"¢\u0006\u0004\b1\u0010*J\u0015\u00104\u001a\u00020\"2\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105J\r\u00107\u001a\u000206¢\u0006\u0004\b7\u00108J\u0017\u0010;\u001a\u00020\"2\b\b\u0001\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<R$\u0010D\u001a\u0004\u0018\u00010=8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR$\u0010K\u001a\u00020E2\u0006\u0010F\u001a\u00020E8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR$\u0010N\u001a\u00020E2\u0006\u0010F\u001a\u00020E8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bL\u0010H\"\u0004\bM\u0010JR$\u0010Q\u001a\u00020E2\u0006\u0010F\u001a\u00020E8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bO\u0010H\"\u0004\bP\u0010JR$\u0010T\u001a\u00020E2\u0006\u0010F\u001a\u00020E8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bR\u0010H\"\u0004\bS\u0010JR*\u0010Y\u001a\u00020E2\u0006\u0010U\u001a\u00020E8F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\bX\u0010*\u001a\u0004\bV\u0010H\"\u0004\bW\u0010JR+\u0010_\u001a\u00020E2\u0006\u0010Z\u001a\u00020E8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b[\u0010H\"\u0004\b\\\u0010J*\u0004\b]\u0010^R*\u0010c\u001a\u00020E2\u0006\u0010U\u001a\u00020E8F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\bb\u0010*\u001a\u0004\b`\u0010H\"\u0004\ba\u0010JR+\u0010g\u001a\u00020E2\u0006\u0010Z\u001a\u00020E8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bd\u0010H\"\u0004\be\u0010J*\u0004\bf\u0010^R+\u0010k\u001a\u00020E2\u0006\u0010Z\u001a\u00020E8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bh\u0010H\"\u0004\bi\u0010J*\u0004\bj\u0010^R+\u0010o\u001a\u00020E2\u0006\u0010Z\u001a\u00020E8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bl\u0010H\"\u0004\bm\u0010J*\u0004\bn\u0010^R+\u0010s\u001a\u00020E2\u0006\u0010Z\u001a\u00020E8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bp\u0010H\"\u0004\bq\u0010J*\u0004\br\u0010^R+\u0010w\u001a\u00020E2\u0006\u0010Z\u001a\u00020E8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bt\u0010H\"\u0004\bu\u0010J*\u0004\bv\u0010^R.\u0010|\u001a\u0004\u0018\u0001022\b\u0010U\u001a\u0004\u0018\u0001028F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b{\u0010*\u001a\u0004\bx\u0010y\"\u0004\bz\u00105R/\u0010\u0080\u0001\u001a\u0004\u0018\u0001022\b\u0010U\u001a\u0004\u0018\u0001028F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b\u007f\u0010*\u001a\u0004\b}\u0010y\"\u0004\b~\u00105R2\u0010\u0084\u0001\u001a\u0004\u0018\u0001022\b\u0010U\u001a\u0004\u0018\u0001028F@FX\u0087\u000e¢\u0006\u0015\u0012\u0005\b\u0083\u0001\u0010*\u001a\u0005\b\u0081\u0001\u0010y\"\u0005\b\u0082\u0001\u00105R2\u0010\u0088\u0001\u001a\u0004\u0018\u0001022\b\u0010U\u001a\u0004\u0018\u0001028F@FX\u0087\u000e¢\u0006\u0015\u0012\u0005\b\u0087\u0001\u0010*\u001a\u0005\b\u0085\u0001\u0010y\"\u0005\b\u0086\u0001\u00105R4\u0010\u008e\u0001\u001a\u0004\u0018\u0001092\b\u0010U\u001a\u0004\u0018\u0001098F@FX\u0087\u000e¢\u0006\u0017\u0012\u0005\b\u008d\u0001\u0010*\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R4\u0010\u0092\u0001\u001a\u0004\u0018\u0001092\b\u0010U\u001a\u0004\u0018\u0001098F@FX\u0087\u000e¢\u0006\u0017\u0012\u0005\b\u0091\u0001\u0010*\u001a\u0006\b\u008f\u0001\u0010\u008a\u0001\"\u0006\b\u0090\u0001\u0010\u008c\u0001R4\u0010\u0096\u0001\u001a\u0004\u0018\u0001092\b\u0010U\u001a\u0004\u0018\u0001098F@FX\u0087\u000e¢\u0006\u0017\u0012\u0005\b\u0095\u0001\u0010*\u001a\u0006\b\u0093\u0001\u0010\u008a\u0001\"\u0006\b\u0094\u0001\u0010\u008c\u0001R5\u0010\u009a\u0001\u001a\u0004\u0018\u0001092\b\u0010Z\u001a\u0004\u0018\u0001098F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b\u0097\u0001\u0010\u008a\u0001\"\u0006\b\u0098\u0001\u0010\u008c\u0001*\u0005\b\u0099\u0001\u0010^R5\u0010\u009e\u0001\u001a\u0004\u0018\u0001092\b\u0010Z\u001a\u0004\u0018\u0001098F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b\u009b\u0001\u0010\u008a\u0001\"\u0006\b\u009c\u0001\u0010\u008c\u0001*\u0005\b\u009d\u0001\u0010^R5\u0010¢\u0001\u001a\u0004\u0018\u0001092\b\u0010Z\u001a\u0004\u0018\u0001098F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b\u009f\u0001\u0010\u008a\u0001\"\u0006\b \u0001\u0010\u008c\u0001*\u0005\b¡\u0001\u0010^R5\u0010¦\u0001\u001a\u0004\u0018\u0001092\b\u0010Z\u001a\u0004\u0018\u0001098F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b£\u0001\u0010\u008a\u0001\"\u0006\b¤\u0001\u0010\u008c\u0001*\u0005\b¥\u0001\u0010^R5\u0010ª\u0001\u001a\u0004\u0018\u0001092\b\u0010Z\u001a\u0004\u0018\u0001098F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b§\u0001\u0010\u008a\u0001\"\u0006\b¨\u0001\u0010\u008c\u0001*\u0005\b©\u0001\u0010^R5\u0010®\u0001\u001a\u0004\u0018\u0001092\b\u0010Z\u001a\u0004\u0018\u0001098F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b«\u0001\u0010\u008a\u0001\"\u0006\b¬\u0001\u0010\u008c\u0001*\u0005\b\u00ad\u0001\u0010^R5\u0010²\u0001\u001a\u0004\u0018\u0001092\b\u0010Z\u001a\u0004\u0018\u0001098F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b¯\u0001\u0010\u008a\u0001\"\u0006\b°\u0001\u0010\u008c\u0001*\u0005\b±\u0001\u0010^R6\u0010¸\u0001\u001a\u0005\u0018\u00010³\u00012\t\u0010Z\u001a\u0005\u0018\u00010³\u00018F@FX\u0086\u008e\u0002¢\u0006\u0016\u001a\u0006\b´\u0001\u0010µ\u0001\"\u0005\b;\u0010¶\u0001*\u0005\b·\u0001\u0010^R/\u0010¼\u0001\u001a\u00020E2\u0006\u0010Z\u001a\u00020E8F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b¹\u0001\u0010H\"\u0005\bº\u0001\u0010J*\u0005\b»\u0001\u0010^¨\u0006¾\u0001"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/ui/SparkScanView;", "Landroid/widget/RelativeLayout;", "Landroid/view/View;", "parentView", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "Lcom/scandit/datacapture/barcode/spark/capture/SparkScan;", "sparkScan", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanViewSettings;", "settings", "Lcom/scandit/datacapture/barcode/internal/module/spark/data/SparkScanStateManager;", "stateManager", "Lcom/scandit/datacapture/barcode/internal/module/spark/data/SparkScanViewCameraManager;", "cameraManager", "Lcom/scandit/datacapture/barcode/internal/module/spark/ui/minipreview/SparkScanViewMiniPreview;", "miniPreview", "Lcom/scandit/datacapture/barcode/internal/module/spark/ui/button/SparkScanViewScanButtonTouchListener;", "scanButtonTouchListener", "Lcom/scandit/datacapture/barcode/internal/module/spark/ui/button/SparkScanViewScanButtonView;", "sparkCaptureViewScanButtonView", "Lcom/scandit/datacapture/barcode/internal/module/spark/ui/feedback/SparkScanFeedbackManager;", "feedbackManager", "Lcom/scandit/datacapture/barcode/internal/module/spark/ui/toast/SparkScanViewToastPresenter;", "toastPresenter", "Lcom/scandit/datacapture/barcode/internal/module/spark/data/SparkScanAnalyticsManager;", "analyticsManager", "Lcom/scandit/datacapture/barcode/spark/ui/PropertyPushSource;", "propertyPushSource", "<init>", "(Landroid/view/View;Lcom/scandit/datacapture/core/capture/DataCaptureContext;Lcom/scandit/datacapture/barcode/spark/capture/SparkScan;Lcom/scandit/datacapture/barcode/spark/ui/SparkScanViewSettings;Lcom/scandit/datacapture/barcode/internal/module/spark/data/SparkScanStateManager;Lcom/scandit/datacapture/barcode/internal/module/spark/data/SparkScanViewCameraManager;Lcom/scandit/datacapture/barcode/internal/module/spark/ui/minipreview/SparkScanViewMiniPreview;Lcom/scandit/datacapture/barcode/internal/module/spark/ui/button/SparkScanViewScanButtonTouchListener;Lcom/scandit/datacapture/barcode/internal/module/spark/ui/button/SparkScanViewScanButtonView;Lcom/scandit/datacapture/barcode/internal/module/spark/ui/feedback/SparkScanFeedbackManager;Lcom/scandit/datacapture/barcode/internal/module/spark/ui/toast/SparkScanViewToastPresenter;Lcom/scandit/datacapture/barcode/internal/module/spark/data/SparkScanAnalyticsManager;Lcom/scandit/datacapture/barcode/spark/ui/PropertyPushSource;)V", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", "state", "", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onPause", "()V", "onResume", "Lcom/scandit/datacapture/barcode/spark/capture/SparkScanViewUiListener;", "listener", "setListener", "(Lcom/scandit/datacapture/barcode/spark/capture/SparkScanViewUiListener;)V", "startScanning", "pauseScanning", "", "text", "showToast", "(Ljava/lang/String;)V", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningMode;", "getScanningMode", "()Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningMode;", "", "resourceId", "setTriggerButtonImage", "(I)V", "Lcom/scandit/datacapture/barcode/spark/feedback/SparkScanFeedbackDelegate;", "l", "Lcom/scandit/datacapture/barcode/spark/feedback/SparkScanFeedbackDelegate;", "getFeedbackDelegate", "()Lcom/scandit/datacapture/barcode/spark/feedback/SparkScanFeedbackDelegate;", "setFeedbackDelegate", "(Lcom/scandit/datacapture/barcode/spark/feedback/SparkScanFeedbackDelegate;)V", "feedbackDelegate", "", "value", "getZoomSwitchControlVisible", "()Z", "setZoomSwitchControlVisible", "(Z)V", "zoomSwitchControlVisible", "getPreviewSizeControlVisible", "setPreviewSizeControlVisible", "previewSizeControlVisible", "getPreviewCloseControlVisible", "setPreviewCloseControlVisible", "previewCloseControlVisible", "getTorchControlVisible", "setTorchControlVisible", "torchControlVisible", "<anonymous parameter 0>", "getTorchButtonVisible", "setTorchButtonVisible", "getTorchButtonVisible$annotations", "torchButtonVisible", "<set-?>", "getScanningBehaviorButtonVisible", "setScanningBehaviorButtonVisible", "getScanningBehaviorButtonVisible$delegate", "(Lcom/scandit/datacapture/barcode/spark/ui/SparkScanView;)Ljava/lang/Object;", "scanningBehaviorButtonVisible", "getHandModeButtonVisible", "setHandModeButtonVisible", "getHandModeButtonVisible$annotations", "handModeButtonVisible", "getBarcodeCountButtonVisible", "setBarcodeCountButtonVisible", "getBarcodeCountButtonVisible$delegate", "barcodeCountButtonVisible", "getBarcodeFindButtonVisible", "setBarcodeFindButtonVisible", "getBarcodeFindButtonVisible$delegate", "barcodeFindButtonVisible", "getTargetModeButtonVisible", "setTargetModeButtonVisible", "getTargetModeButtonVisible$delegate", "targetModeButtonVisible", "getLabelCaptureButtonVisible", "setLabelCaptureButtonVisible", "getLabelCaptureButtonVisible$delegate", "labelCaptureButtonVisible", "getCameraSwitchButtonVisible", "setCameraSwitchButtonVisible", "getCameraSwitchButtonVisible$delegate", "cameraSwitchButtonVisible", "getStopCapturingText", "()Ljava/lang/String;", "setStopCapturingText", "getStopCapturingText$annotations", "stopCapturingText", "getStartCapturingText", "setStartCapturingText", "getStartCapturingText$annotations", "startCapturingText", "getResumeCapturingText", "setResumeCapturingText", "getResumeCapturingText$annotations", "resumeCapturingText", "getScanningCapturingText", "setScanningCapturingText", "getScanningCapturingText$annotations", "scanningCapturingText", "getCaptureButtonActiveBackgroundColor", "()Ljava/lang/Integer;", "setCaptureButtonActiveBackgroundColor", "(Ljava/lang/Integer;)V", "getCaptureButtonActiveBackgroundColor$annotations", "captureButtonActiveBackgroundColor", "getCaptureButtonBackgroundColor", "setCaptureButtonBackgroundColor", "getCaptureButtonBackgroundColor$annotations", "captureButtonBackgroundColor", "getCaptureButtonTintColor", "setCaptureButtonTintColor", "getCaptureButtonTintColor$annotations", "captureButtonTintColor", "getTriggerButtonCollapsedColor", "setTriggerButtonCollapsedColor", "getTriggerButtonCollapsedColor$delegate", "triggerButtonCollapsedColor", "getTriggerButtonExpandedColor", "setTriggerButtonExpandedColor", "getTriggerButtonExpandedColor$delegate", "triggerButtonExpandedColor", "getTriggerButtonAnimationColor", "setTriggerButtonAnimationColor", "getTriggerButtonAnimationColor$delegate", "triggerButtonAnimationColor", "getTriggerButtonTintColor", "setTriggerButtonTintColor", "getTriggerButtonTintColor$delegate", "triggerButtonTintColor", "getToolbarBackgroundColor", "setToolbarBackgroundColor", "getToolbarBackgroundColor$delegate", "toolbarBackgroundColor", "getToolbarIconActiveTintColor", "setToolbarIconActiveTintColor", "getToolbarIconActiveTintColor$delegate", "toolbarIconActiveTintColor", "getToolbarIconInactiveTintColor", "setToolbarIconInactiveTintColor", "getToolbarIconInactiveTintColor$delegate", "toolbarIconInactiveTintColor", "Landroid/graphics/Bitmap;", "getTriggerButtonImage", "()Landroid/graphics/Bitmap;", "(Landroid/graphics/Bitmap;)V", "getTriggerButtonImage$delegate", "triggerButtonImage", "getTriggerButtonVisible", "setTriggerButtonVisible", "getTriggerButtonVisible$delegate", "triggerButtonVisible", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"ViewConstructor"})
@Mockable
/* loaded from: classes11.dex */
public final class SparkScanView extends RelativeLayout {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final DataCaptureContext f123945a;

    /* renamed from: b, reason: collision with root package name */
    private final SparkScan f123946b;

    /* renamed from: c, reason: collision with root package name */
    private final SparkScanStateManager f123947c;

    /* renamed from: d, reason: collision with root package name */
    private final SparkScanViewCameraManager f123948d;

    /* renamed from: e, reason: collision with root package name */
    private final SparkScanViewMiniPreview f123949e;

    /* renamed from: f, reason: collision with root package name */
    private final SparkScanViewScanButtonTouchListener f123950f;

    /* renamed from: g, reason: collision with root package name */
    private final SparkScanViewScanButtonView f123951g;

    /* renamed from: h, reason: collision with root package name */
    private final SparkScanFeedbackManager f123952h;

    /* renamed from: i, reason: collision with root package name */
    private final SparkScanViewToastPresenter f123953i;

    /* renamed from: j, reason: collision with root package name */
    private final SparkScanAnalyticsManager f123954j;

    /* renamed from: k, reason: collision with root package name */
    private final PropertyPushSource f123955k;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private SparkScanFeedbackDelegate feedbackDelegate;

    /* renamed from: m, reason: collision with root package name */
    private final SparkScanViewPresenter f123957m;

    /* renamed from: n, reason: collision with root package name */
    private final SparkScanView$sparkScanCameraStartListener$1 f123958n;

    /* renamed from: o, reason: collision with root package name */
    private final SparkScanView$sparkScanEnableListener$1 f123959o;

    /* renamed from: p, reason: collision with root package name */
    private int f123960p;

    /* renamed from: q, reason: collision with root package name */
    private final SparkScanView$orientationEventListener$1 f123961q;

    /* renamed from: r, reason: collision with root package name */
    private final SparkScanView$modeViewListener$1 f123962r;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J1\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/ui/SparkScanView$Companion;", "", "Landroid/view/View;", "parentView", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "Lcom/scandit/datacapture/barcode/spark/capture/SparkScan;", "sparkScan", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanViewSettings;", "settings", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanView;", "newInstance", "(Landroid/view/View;Lcom/scandit/datacapture/core/capture/DataCaptureContext;Lcom/scandit/datacapture/barcode/spark/capture/SparkScan;Lcom/scandit/datacapture/barcode/spark/ui/SparkScanViewSettings;)Lcom/scandit/datacapture/barcode/spark/ui/SparkScanView;", "", "getHardwareTriggerSupported", "()Z", "getHardwareTriggerSupported$annotations", "()V", "hardwareTriggerSupported", "", "SUPER_STATE_KEY", "Ljava/lang/String;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        @JvmStatic
        public static /* synthetic */ void getHardwareTriggerSupported$annotations() {
        }

        @JvmStatic
        @JvmOverloads
        public final SparkScanView newInstance(View parentView, DataCaptureContext dataCaptureContext, SparkScan sparkScan) {
            Intrinsics.j(parentView, "parentView");
            Intrinsics.j(dataCaptureContext, "dataCaptureContext");
            Intrinsics.j(sparkScan, "sparkScan");
            return newInstance$default(this, parentView, dataCaptureContext, sparkScan, null, 8, null);
        }

        public static /* synthetic */ SparkScanView newInstance$default(Companion companion, View view, DataCaptureContext dataCaptureContext, SparkScan sparkScan, SparkScanViewSettings sparkScanViewSettings, int i10, Object obj) {
            if ((i10 & 8) != 0) {
                sparkScanViewSettings = new SparkScanViewSettings();
            }
            return companion.newInstance(view, dataCaptureContext, sparkScan, sparkScanViewSettings);
        }

        @JvmStatic
        @JvmOverloads
        public final SparkScanView newInstance(View parentView, DataCaptureContext dataCaptureContext, SparkScan sparkScan, SparkScanViewSettings settings) {
            Intrinsics.j(parentView, "parentView");
            Intrinsics.j(dataCaptureContext, "dataCaptureContext");
            Intrinsics.j(sparkScan, "sparkScan");
            Intrinsics.j(settings, "settings");
            return new SparkScanView(parentView, dataCaptureContext, sparkScan, settings.clone$scandit_barcode_capture(), null, null, null, null, null, null, null, null, null, 8176, null);
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
            try {
                iArr[HardwareKeyEvent.LONG_PRESS_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HardwareKeyEvent.LONG_PRESS_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ SparkScanView(View view, DataCaptureContext dataCaptureContext, SparkScan sparkScan, SparkScanViewSettings sparkScanViewSettings, SparkScanStateManager sparkScanStateManager, SparkScanViewCameraManager sparkScanViewCameraManager, SparkScanViewMiniPreview sparkScanViewMiniPreview, SparkScanViewScanButtonTouchListener sparkScanViewScanButtonTouchListener, SparkScanViewScanButtonView sparkScanViewScanButtonView, SparkScanFeedbackManager sparkScanFeedbackManager, SparkScanViewToastPresenter sparkScanViewToastPresenter, SparkScanAnalyticsManager sparkScanAnalyticsManager, PropertyPushSource propertyPushSource, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        SparkScanStateManager sparkScanStateManager2;
        SparkScanViewCameraManager o10;
        SparkScanViewMiniPreview f10;
        SparkScanViewScanButtonTouchListener hVar;
        SparkScanViewScanButtonView sparkScanViewScanButtonView2;
        PropertyPushSource propertyPushSource2;
        View view2;
        SparkScan sparkScan2;
        SparkScanStateManager sparkScanStateManager3;
        SparkScanViewCameraManager sparkScanViewCameraManager2;
        SparkScanViewSettings sparkScanViewSettings2 = sparkScanViewSettings;
        if ((i10 & 16) != 0) {
            NativeSparkScanStateMachine stateMachine = sparkScan.get_sparkScanInternal().a().getStateMachine();
            Intrinsics.i(stateMachine, "getStateMachine(...)");
            sparkScanStateManager2 = new SparkScanStateManager(sparkScanViewSettings2, stateMachine);
        } else {
            sparkScanStateManager2 = sparkScanStateManager;
        }
        if ((i10 & 32) != 0) {
            sparkScanViewSettings2 = sparkScanViewSettings;
            o10 = new O(dataCaptureContext, sparkScanStateManager2, BatterySavingManager.INSTANCE.getSharedInstance(), sparkScan.getSparkScanSettings(), sparkScanViewSettings);
        } else {
            o10 = sparkScanViewCameraManager;
        }
        if ((i10 & 64) != 0) {
            Context context = view.getContext();
            Intrinsics.i(context, "getContext(...)");
            f10 = new F(context, dataCaptureContext, sparkScan, sparkScanStateManager2, o10);
        } else {
            f10 = sparkScanViewMiniPreview;
        }
        if ((i10 & 128) != 0) {
            Context context2 = view.getContext();
            Intrinsics.i(context2, "getContext(...)");
            hVar = new h(context2, sparkScanStateManager2);
        } else {
            hVar = sparkScanViewScanButtonTouchListener;
        }
        if ((i10 & 256) != 0) {
            Context context3 = view.getContext();
            Intrinsics.i(context3, "getContext(...)");
            sparkScanViewScanButtonView2 = new SparkScanViewScanButtonView(context3, hVar, sparkScanStateManager2);
        } else {
            sparkScanViewScanButtonView2 = sparkScanViewScanButtonView;
        }
        SparkScanFeedbackManager sparkScanFeedbackManager2 = (i10 & 512) != 0 ? new SparkScanFeedbackManager(sparkScanViewSettings2, sparkScanStateManager2) : sparkScanFeedbackManager;
        SparkScanViewToastPresenter sVar = (i10 & 1024) != 0 ? new s(f10, sparkScanViewSettings2) : sparkScanViewToastPresenter;
        SparkScanAnalyticsManager c13194g = (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? new C13194g(sparkScanStateManager2) : sparkScanAnalyticsManager;
        if ((i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            propertyPushSource2 = new PropertyPushSource(c13194g);
            sparkScan2 = sparkScan;
            sparkScanStateManager3 = sparkScanStateManager2;
            sparkScanViewCameraManager2 = o10;
            view2 = view;
        } else {
            propertyPushSource2 = propertyPushSource;
            view2 = view;
            sparkScan2 = sparkScan;
            sparkScanStateManager3 = sparkScanStateManager2;
            sparkScanViewCameraManager2 = o10;
        }
        this(view2, dataCaptureContext, sparkScan2, sparkScanViewSettings2, sparkScanStateManager3, sparkScanViewCameraManager2, f10, hVar, sparkScanViewScanButtonView2, sparkScanFeedbackManager2, sVar, c13194g, propertyPushSource2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(SparkScanView this$0) {
        Intrinsics.j(this$0, "this$0");
        this$0.f123957m.M();
    }

    @Deprecated
    public static /* synthetic */ void getCaptureButtonActiveBackgroundColor$annotations() {
    }

    @Deprecated
    public static /* synthetic */ void getCaptureButtonBackgroundColor$annotations() {
    }

    @Deprecated
    public static /* synthetic */ void getCaptureButtonTintColor$annotations() {
    }

    @Deprecated
    public static /* synthetic */ void getHandModeButtonVisible$annotations() {
    }

    public static final boolean getHardwareTriggerSupported() {
        return INSTANCE.getHardwareTriggerSupported();
    }

    @Deprecated
    public static /* synthetic */ void getResumeCapturingText$annotations() {
    }

    @Deprecated
    public static /* synthetic */ void getScanningCapturingText$annotations() {
    }

    @Deprecated
    public static /* synthetic */ void getStartCapturingText$annotations() {
    }

    @Deprecated
    public static /* synthetic */ void getStopCapturingText$annotations() {
    }

    @Deprecated
    public static /* synthetic */ void getTorchButtonVisible$annotations() {
    }

    @JvmStatic
    @JvmOverloads
    public static final SparkScanView newInstance(View view, DataCaptureContext dataCaptureContext, SparkScan sparkScan) {
        return INSTANCE.newInstance(view, dataCaptureContext, sparkScan);
    }

    public final Integer getCaptureButtonActiveBackgroundColor() {
        return null;
    }

    public final Integer getCaptureButtonBackgroundColor() {
        return null;
    }

    public final Integer getCaptureButtonTintColor() {
        return null;
    }

    public final boolean getHandModeButtonVisible() {
        return false;
    }

    public final String getResumeCapturingText() {
        return null;
    }

    public final String getScanningCapturingText() {
        return null;
    }

    public final String getStartCapturingText() {
        return null;
    }

    public final String getStopCapturingText() {
        return null;
    }

    public final boolean getTorchButtonVisible() {
        return false;
    }

    public final void setCaptureButtonActiveBackgroundColor(Integer num) {
    }

    public final void setCaptureButtonBackgroundColor(Integer num) {
    }

    public final void setCaptureButtonTintColor(Integer num) {
    }

    public final void setHandModeButtonVisible(boolean z10) {
    }

    public final void setResumeCapturingText(String str) {
    }

    public final void setScanningCapturingText(String str) {
    }

    public final void setStartCapturingText(String str) {
    }

    public final void setStopCapturingText(String str) {
    }

    public final void setTorchButtonVisible(boolean z10) {
    }

    public final void setTriggerButtonImage(Bitmap bitmap) {
        this.f123951g.a(bitmap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(SparkScanView this$0, View view) {
        Intrinsics.j(this$0, "this$0");
        this$0.f123957m.L();
    }

    public static final boolean access$didRotate180Degrees(SparkScanView sparkScanView, int i10) {
        return Math.abs(i10 - sparkScanView.f123960p) == 2;
    }

    @JvmStatic
    @JvmOverloads
    public static final SparkScanView newInstance(View view, DataCaptureContext dataCaptureContext, SparkScan sparkScan, SparkScanViewSettings sparkScanViewSettings) {
        return INSTANCE.newInstance(view, dataCaptureContext, sparkScan, sparkScanViewSettings);
    }

    public final boolean getBarcodeCountButtonVisible() {
        return this.f123949e.v();
    }

    public final boolean getBarcodeFindButtonVisible() {
        return this.f123949e.z();
    }

    public final boolean getCameraSwitchButtonVisible() {
        return this.f123949e.d();
    }

    public final SparkScanFeedbackDelegate getFeedbackDelegate() {
        return this.feedbackDelegate;
    }

    public final boolean getLabelCaptureButtonVisible() {
        return this.f123949e.e();
    }

    public final boolean getPreviewCloseControlVisible() {
        return this.f123949e.w();
    }

    public final boolean getPreviewSizeControlVisible() {
        return this.f123949e.o();
    }

    public final boolean getScanningBehaviorButtonVisible() {
        return this.f123949e.A();
    }

    public final SparkScanScanningMode getScanningMode() {
        return this.f123947c.p();
    }

    public final boolean getTargetModeButtonVisible() {
        return this.f123949e.q();
    }

    public final Integer getToolbarBackgroundColor() {
        return this.f123949e.a();
    }

    public final Integer getToolbarIconActiveTintColor() {
        return this.f123949e.u();
    }

    public final Integer getToolbarIconInactiveTintColor() {
        return this.f123949e.j();
    }

    public final boolean getTorchControlVisible() {
        return this.f123949e.r();
    }

    public final Integer getTriggerButtonAnimationColor() {
        return this.f123951g.b();
    }

    public final Integer getTriggerButtonCollapsedColor() {
        return this.f123951g.c();
    }

    public final Integer getTriggerButtonExpandedColor() {
        return this.f123951g.d();
    }

    public final Bitmap getTriggerButtonImage() {
        return this.f123951g.e();
    }

    public final Integer getTriggerButtonTintColor() {
        return this.f123951g.f();
    }

    public final boolean getTriggerButtonVisible() {
        return this.f123957m.c();
    }

    public final boolean getZoomSwitchControlVisible() {
        return this.f123949e.t();
    }

    public final void onPause() {
        this.f123957m.F();
        disable();
        this.f123946b._removeEnableDisableListener$scandit_barcode_capture(this.f123959o);
        this.f123946b.set_sparkScanModeViewListener$scandit_barcode_capture(null);
        this.f123946b.setDataCaptureContext$scandit_barcode_capture(null);
        this.f123946b.setPropertyPushSource$scandit_barcode_capture(null);
        this.f123948d.a((SparkScanView$sparkScanCameraStartListener$1) null);
        setOnClickListener(null);
        removeAllViews();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        Intrinsics.h(state, "null cannot be cast to non-null type android.os.Bundle");
        Bundle bundle = (Bundle) state;
        this.f123957m.a(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            super.onRestoreInstanceState((Parcelable) bundle.getParcelable("super_state_key", Parcelable.class));
        } else {
            super.onRestoreInstanceState(bundle.getParcelable("super_state_key"));
        }
    }

    public final void onResume() {
        enable();
        this.f123946b.setDataCaptureContext$scandit_barcode_capture(this.f123945a);
        this.f123948d.a(this.f123958n);
        SparkScan sparkScan = this.f123946b;
        sparkScan._addEnableDisableListener$scandit_barcode_capture(this.f123959o);
        sparkScan.set_sparkScanModeViewListener$scandit_barcode_capture(this.f123962r);
        sparkScan._applyNewSettingsForScanningMode$scandit_barcode_capture(this.f123947c.p());
        sparkScan.setPropertyPushSource$scandit_barcode_capture(this.f123955k);
        setOnClickListener(new View.OnClickListener() { // from class: com.scandit.datacapture.barcode.spark.ui.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SparkScanView.a(this.f123995a, view);
            }
        });
        this.f123952h.a(this);
        this.f123951g.a((ViewGroup) this);
        this.f123951g.a(this.f123957m);
        this.f123949e.a(this);
        this.f123949e.a((A) this.f123957m);
        this.f123957m.b(this.f123946b.isEnabled() ? SparkScanViewState.ACTIVE : SparkScanViewState.IDLE);
    }

    public final void pauseScanning() {
        this.f123957m.Q();
    }

    public final void setBarcodeCountButtonVisible(boolean z10) {
        this.f123949e.c(z10);
    }

    public final void setBarcodeFindButtonVisible(boolean z10) {
        this.f123949e.f(z10);
    }

    public final void setCameraSwitchButtonVisible(boolean z10) {
        this.f123949e.j(z10);
    }

    public final void setFeedbackDelegate(SparkScanFeedbackDelegate sparkScanFeedbackDelegate) {
        this.feedbackDelegate = sparkScanFeedbackDelegate;
    }

    public final void setLabelCaptureButtonVisible(boolean z10) {
        this.f123949e.i(z10);
    }

    public final void setListener(SparkScanViewUiListener listener) {
        this.f123957m.a(listener);
    }

    public final void setPreviewCloseControlVisible(boolean z10) {
        this.f123949e.e(z10);
    }

    public final void setPreviewSizeControlVisible(boolean z10) {
        this.f123949e.h(z10);
        this.f123957m.k(z10);
    }

    public final void setScanningBehaviorButtonVisible(boolean z10) {
        this.f123949e.g(z10);
    }

    public final void setTargetModeButtonVisible(boolean z10) {
        this.f123949e.d(z10);
    }

    public final void setToolbarBackgroundColor(Integer num) {
        this.f123949e.a(num);
    }

    public final void setToolbarIconActiveTintColor(Integer num) {
        this.f123949e.c(num);
    }

    public final void setToolbarIconInactiveTintColor(Integer num) {
        this.f123949e.b(num);
    }

    public final void setTorchControlVisible(boolean z10) {
        this.f123949e.k(z10);
        this.f123957m.o(z10);
    }

    public final void setTriggerButtonAnimationColor(Integer num) {
        this.f123951g.a(num);
    }

    public final void setTriggerButtonCollapsedColor(Integer num) {
        this.f123951g.b(num);
    }

    public final void setTriggerButtonExpandedColor(Integer num) {
        this.f123951g.c(num);
    }

    public final void setTriggerButtonImage(int resourceId) {
        SparkScanViewScanButtonView sparkScanViewScanButtonView = this.f123951g;
        sparkScanViewScanButtonView.getClass();
        sparkScanViewScanButtonView.a(BitmapExtensionsKt.bitmapFromResource(resourceId));
    }

    public final void setTriggerButtonTintColor(Integer num) {
        this.f123951g.d(num);
    }

    public final void setTriggerButtonVisible(boolean z10) {
        this.f123957m.l(z10);
    }

    public final void setZoomSwitchControlVisible(boolean z10) {
        this.f123949e.a(z10);
        this.f123957m.p(z10);
    }

    public final void showToast(String text) {
        Intrinsics.j(text, "text");
        this.f123957m.b(text);
    }

    public final void startScanning() {
        this.f123957m.P();
    }

    public static final void access$onHardwareKeyEvent(SparkScanView sparkScanView, HardwareKeyEvent hardwareKeyEvent) {
        sparkScanView.getClass();
        int i10 = WhenMappings.$EnumSwitchMapping$0[hardwareKeyEvent.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    sparkScanView.f123957m.D();
                    return;
                }
                throw new NoWhenBranchMatchedException();
            }
            sparkScanView.f123957m.E();
            return;
        }
        sparkScanView.f123957m.A();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration newConfig) {
        getHandler().post(new Runnable() { // from class: com.scandit.datacapture.barcode.spark.ui.b
            @Override // java.lang.Runnable
            public final void run() {
                SparkScanView.a(this.f123994a);
            }
        });
        super.onConfigurationChanged(newConfig);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("super_state_key", parcelableOnSaveInstanceState);
        bundle.putAll(this.f123957m.G());
        return bundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.scandit.datacapture.barcode.spark.ui.SparkScanView$sparkScanEnableListener$1] */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.scandit.datacapture.barcode.spark.ui.SparkScanView$modeViewListener$1] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.scandit.datacapture.barcode.spark.ui.SparkScanView$orientationEventListener$1] */
    public SparkScanView(View parentView, DataCaptureContext dataCaptureContext, SparkScan sparkScan, SparkScanViewSettings settings, SparkScanStateManager stateManager, SparkScanViewCameraManager cameraManager, SparkScanViewMiniPreview miniPreview, SparkScanViewScanButtonTouchListener scanButtonTouchListener, SparkScanViewScanButtonView sparkCaptureViewScanButtonView, SparkScanFeedbackManager feedbackManager, SparkScanViewToastPresenter toastPresenter, SparkScanAnalyticsManager analyticsManager, PropertyPushSource propertyPushSource) {
        super(parentView.getContext());
        Intrinsics.j(parentView, "parentView");
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        Intrinsics.j(sparkScan, "sparkScan");
        Intrinsics.j(settings, "settings");
        Intrinsics.j(stateManager, "stateManager");
        Intrinsics.j(cameraManager, "cameraManager");
        Intrinsics.j(miniPreview, "miniPreview");
        Intrinsics.j(scanButtonTouchListener, "scanButtonTouchListener");
        Intrinsics.j(sparkCaptureViewScanButtonView, "sparkCaptureViewScanButtonView");
        Intrinsics.j(feedbackManager, "feedbackManager");
        Intrinsics.j(toastPresenter, "toastPresenter");
        Intrinsics.j(analyticsManager, "analyticsManager");
        Intrinsics.j(propertyPushSource, "propertyPushSource");
        this.f123945a = dataCaptureContext;
        this.f123946b = sparkScan;
        this.f123947c = stateManager;
        this.f123948d = cameraManager;
        this.f123949e = miniPreview;
        this.f123950f = scanButtonTouchListener;
        this.f123951g = sparkCaptureViewScanButtonView;
        this.f123952h = feedbackManager;
        this.f123953i = toastPresenter;
        this.f123954j = analyticsManager;
        this.f123955k = propertyPushSource;
        this.feedbackDelegate = new SparkScanFeedbackDelegate() { // from class: com.scandit.datacapture.barcode.spark.ui.SparkScanView$feedbackDelegate$1
            @Override // com.scandit.datacapture.barcode.spark.feedback.SparkScanFeedbackDelegate
            public SparkScanBarcodeFeedback getFeedbackForBarcode(Barcode barcode) {
                Intrinsics.j(barcode, "barcode");
                return new SparkScanBarcodeFeedback.Success(0, null, null, 7, null);
            }
        };
        NativeSparkScanStateMachine stateMachine = sparkScan.get_sparkScanInternal().a().getStateMachine();
        Intrinsics.i(stateMachine, "getStateMachine(...)");
        this.f123957m = new SparkScanViewPresenter(this, stateManager, sparkScan, settings, cameraManager, miniPreview, sparkCaptureViewScanButtonView, feedbackManager, toastPresenter, analyticsManager, stateMachine);
        this.f123958n = new SparkScanView$sparkScanCameraStartListener$1(this);
        this.f123959o = new SparkScanEnableDisableListener() { // from class: com.scandit.datacapture.barcode.spark.ui.SparkScanView$sparkScanEnableListener$1
            @Override // com.scandit.datacapture.barcode.internal.module.spark.capture.SparkScanEnableDisableListener
            public void onEnabledChange(boolean isEnabled) {
                if (isEnabled) {
                    this.f123966a.startScanning();
                } else {
                    this.f123966a.pauseScanning();
                }
            }
        };
        final Context context = getContext();
        this.f123961q = new OrientationEventListener(context) { // from class: com.scandit.datacapture.barcode.spark.ui.SparkScanView$orientationEventListener$1
            @Override // android.view.OrientationEventListener
            public void onOrientationChanged(int orientation) {
                Context context2 = this.f123964a.getContext();
                Intrinsics.i(context2, "getContext(...)");
                int rotation = ContextExtensionsKt.getRotation(context2);
                if (SparkScanView.access$didRotate180Degrees(this.f123964a, rotation)) {
                    this.f123964a.f123957m.M();
                }
                this.f123964a.f123960p = rotation;
            }
        };
        this.f123962r = new SparkScanModeViewListener() { // from class: com.scandit.datacapture.barcode.spark.ui.SparkScanView$modeViewListener$1
            @Override // com.scandit.datacapture.barcode.internal.module.spark.capture.SparkScanModeViewListener
            public SparkScanScanningMode getScanningMode() {
                return this.f123963a.f123947c.p();
            }

            @Override // com.scandit.datacapture.barcode.internal.module.spark.capture.SparkScanModeViewListener
            public void onApplySettings(SparkScanSettings settings2) {
                Intrinsics.j(settings2, "settings");
                this.f123963a.f123948d.setBatterySavingMode(settings2.getBatterySaving());
            }
        };
        ((ViewGroup) parentView).addView(this, new ViewGroup.LayoutParams(-1, -1));
        setElevation(((Number) E.f122980j.getValue()).floatValue());
        setOutlineProvider(null);
        bringToFront();
        if (settings.getCom.scandit.datacapture.barcode.count.serialization.BarcodeCountViewDeserializer.KEY_HW_TRIGGER_ENABLED java.lang.String()) {
            HardwareButtonHelperKt.setupHardwareTrigger(this, settings.getCom.scandit.datacapture.barcode.count.serialization.BarcodeCountViewDeserializer.KEY_HW_TRIGGER_KEY_CODE java.lang.String(), new a(this));
        }
        setId(E.f122973c);
        setClipChildren(false);
    }
}
