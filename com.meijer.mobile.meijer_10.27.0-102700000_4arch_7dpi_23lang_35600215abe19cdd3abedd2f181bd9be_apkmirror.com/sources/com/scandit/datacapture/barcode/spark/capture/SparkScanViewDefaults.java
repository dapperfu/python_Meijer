package com.scandit.datacapture.barcode.spark.capture;

import android.graphics.Bitmap;
import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanViewDefaults;
import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeColor;
import com.scandit.datacapture.core.internal.sdk.extensions.BitmapExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.extensions.BrushExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.extensions.NativeColorExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.ui.style.NativeBrush;
import com.scandit.datacapture.core.ui.style.Brush;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\bV\bÆ\u0002\u0018\u00002\u00020\u0001R \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u0012\u0004\b\f\u0010\b\u001a\u0004\b\u000b\u0010\u0006R \u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u0004\u0012\u0004\b\u0010\u0010\b\u001a\u0004\b\u000f\u0010\u0006R \u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u0012\u0004\b\u0014\u0010\b\u001a\u0004\b\u0013\u0010\u0006R \u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0004\u0012\u0004\b\u0018\u0010\b\u001a\u0004\b\u0017\u0010\u0006R \u0010\u001d\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u0004\u0012\u0004\b\u001c\u0010\b\u001a\u0004\b\u001b\u0010\u0006R \u0010!\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u0004\u0012\u0004\b \u0010\b\u001a\u0004\b\u001f\u0010\u0006R \u0010(\u001a\u00020\"8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b'\u0010\b\u001a\u0004\b%\u0010&R \u0010,\u001a\u00020\"8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010$\u0012\u0004\b+\u0010\b\u001a\u0004\b*\u0010&R \u00100\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010\u0004\u0012\u0004\b/\u0010\b\u001a\u0004\b.\u0010\u0006R \u00104\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b1\u0010\u0004\u0012\u0004\b3\u0010\b\u001a\u0004\b2\u0010\u0006R \u00108\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b5\u0010\u0004\u0012\u0004\b7\u0010\b\u001a\u0004\b6\u0010\u0006R \u0010<\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b9\u0010\u0004\u0012\u0004\b;\u0010\b\u001a\u0004\b:\u0010\u0006R \u0010@\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b=\u0010\u0004\u0012\u0004\b?\u0010\b\u001a\u0004\b>\u0010\u0006R \u0010G\u001a\u00020A8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bB\u0010C\u0012\u0004\bF\u0010\b\u001a\u0004\bD\u0010ER \u0010K\u001a\u00020A8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bH\u0010C\u0012\u0004\bJ\u0010\b\u001a\u0004\bI\u0010ER \u0010R\u001a\u00020L8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bM\u0010N\u0012\u0004\bQ\u0010\b\u001a\u0004\bO\u0010PR \u0010S\u001a\u00020\u00028\u0006X\u0087D¢\u0006\u0012\n\u0004\bS\u0010\u0004\u0012\u0004\bU\u0010\b\u001a\u0004\bT\u0010\u0006R \u0010V\u001a\u00020\u00028\u0006X\u0087D¢\u0006\u0012\n\u0004\bV\u0010\u0004\u0012\u0004\bX\u0010\b\u001a\u0004\bW\u0010\u0006R \u0010Y\u001a\u00020\u00028\u0006X\u0087D¢\u0006\u0012\n\u0004\bY\u0010\u0004\u0012\u0004\b[\u0010\b\u001a\u0004\bZ\u0010\u0006R \u0010\\\u001a\u00020\u00028\u0006X\u0087D¢\u0006\u0012\n\u0004\b\\\u0010\u0004\u0012\u0004\b^\u0010\b\u001a\u0004\b]\u0010\u0006R\"\u0010`\u001a\u0004\u0018\u00010_8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b`\u0010a\u0012\u0004\bd\u0010\b\u001a\u0004\bb\u0010cR\"\u0010e\u001a\u0004\u0018\u00010_8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\be\u0010a\u0012\u0004\bg\u0010\b\u001a\u0004\bf\u0010cR\"\u0010h\u001a\u0004\u0018\u00010_8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bh\u0010a\u0012\u0004\bj\u0010\b\u001a\u0004\bi\u0010cR\"\u0010k\u001a\u0004\u0018\u00010_8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bk\u0010a\u0012\u0004\bm\u0010\b\u001a\u0004\bl\u0010cR\"\u0010n\u001a\u0004\u0018\u00010A8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bn\u0010o\u0012\u0004\br\u0010\b\u001a\u0004\bp\u0010qR\"\u0010s\u001a\u0004\u0018\u00010A8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bs\u0010o\u0012\u0004\bu\u0010\b\u001a\u0004\bt\u0010qR\"\u0010v\u001a\u0004\u0018\u00010A8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bv\u0010o\u0012\u0004\bx\u0010\b\u001a\u0004\bw\u0010qR\"\u0010y\u001a\u0004\u0018\u00010A8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\by\u0010o\u0012\u0004\b{\u0010\b\u001a\u0004\bz\u0010qR\"\u0010|\u001a\u0004\u0018\u00010A8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b|\u0010o\u0012\u0004\b~\u0010\b\u001a\u0004\b}\u0010qR$\u0010\u007f\u001a\u0004\u0018\u00010A8\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u007f\u0010o\u0012\u0005\b\u0081\u0001\u0010\b\u001a\u0005\b\u0080\u0001\u0010qR&\u0010\u0082\u0001\u001a\u0004\u0018\u00010A8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0082\u0001\u0010o\u0012\u0005\b\u0084\u0001\u0010\b\u001a\u0005\b\u0083\u0001\u0010qR&\u0010\u0085\u0001\u001a\u0004\u0018\u00010A8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0085\u0001\u0010o\u0012\u0005\b\u0087\u0001\u0010\b\u001a\u0005\b\u0086\u0001\u0010qR&\u0010\u0088\u0001\u001a\u0004\u0018\u00010A8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0088\u0001\u0010o\u0012\u0005\b\u008a\u0001\u0010\b\u001a\u0005\b\u0089\u0001\u0010qR&\u0010\u008b\u0001\u001a\u0004\u0018\u00010A8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u008b\u0001\u0010o\u0012\u0005\b\u008d\u0001\u0010\b\u001a\u0005\b\u008c\u0001\u0010qR&\u0010\u008e\u0001\u001a\u0004\u0018\u00010A8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u008e\u0001\u0010o\u0012\u0005\b\u0090\u0001\u0010\b\u001a\u0005\b\u008f\u0001\u0010qR&\u0010\u0091\u0001\u001a\u0004\u0018\u00010A8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0091\u0001\u0010o\u0012\u0005\b\u0093\u0001\u0010\b\u001a\u0005\b\u0092\u0001\u0010qR&\u0010\u0094\u0001\u001a\u0004\u0018\u00010_8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0094\u0001\u0010a\u0012\u0005\b\u0096\u0001\u0010\b\u001a\u0005\b\u0095\u0001\u0010cR&\u0010\u0097\u0001\u001a\u0004\u0018\u00010_8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0097\u0001\u0010a\u0012\u0005\b\u0099\u0001\u0010\b\u001a\u0005\b\u0098\u0001\u0010cR&\u0010\u009a\u0001\u001a\u0004\u0018\u00010_8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u009a\u0001\u0010a\u0012\u0005\b\u009c\u0001\u0010\b\u001a\u0005\b\u009b\u0001\u0010cR&\u0010\u009d\u0001\u001a\u0004\u0018\u00010_8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u009d\u0001\u0010a\u0012\u0005\b\u009f\u0001\u0010\b\u001a\u0005\b\u009e\u0001\u0010cR&\u0010 \u0001\u001a\u0004\u0018\u00010_8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b \u0001\u0010a\u0012\u0005\b¢\u0001\u0010\b\u001a\u0005\b¡\u0001\u0010cR&\u0010£\u0001\u001a\u0004\u0018\u00010_8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b£\u0001\u0010a\u0012\u0005\b¥\u0001\u0010\b\u001a\u0005\b¤\u0001\u0010cR&\u0010¦\u0001\u001a\u0004\u0018\u00010_8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b¦\u0001\u0010a\u0012\u0005\b¨\u0001\u0010\b\u001a\u0005\b§\u0001\u0010cR&\u0010©\u0001\u001a\u0004\u0018\u00010_8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b©\u0001\u0010a\u0012\u0005\b«\u0001\u0010\b\u001a\u0005\bª\u0001\u0010cR&\u0010¬\u0001\u001a\u0004\u0018\u00010_8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b¬\u0001\u0010a\u0012\u0005\b®\u0001\u0010\b\u001a\u0005\b\u00ad\u0001\u0010cR&\u0010¯\u0001\u001a\u0004\u0018\u00010_8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b¯\u0001\u0010a\u0012\u0005\b±\u0001\u0010\b\u001a\u0005\b°\u0001\u0010cR&\u0010²\u0001\u001a\u0004\u0018\u00010_8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b²\u0001\u0010a\u0012\u0005\b´\u0001\u0010\b\u001a\u0005\b³\u0001\u0010c¨\u0006µ\u0001"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/capture/SparkScanViewDefaults;", "", "", "a", "Z", "getDefaultScanningBehaviorButtonVisible", "()Z", "getDefaultScanningBehaviorButtonVisible$annotations", "()V", "defaultScanningBehaviorButtonVisible", "b", "getDefaultBarcodeCountButtonVisible", "getDefaultBarcodeCountButtonVisible$annotations", "defaultBarcodeCountButtonVisible", "c", "getDefaultBarcodeFindButtonVisible", "getDefaultBarcodeFindButtonVisible$annotations", "defaultBarcodeFindButtonVisible", "d", "getDefaultLabelCaptureButtonVisible", "getDefaultLabelCaptureButtonVisible$annotations", "defaultLabelCaptureButtonVisible", "e", "getDefaultTargetModeButtonVisible", "getDefaultTargetModeButtonVisible$annotations", "defaultTargetModeButtonVisible", "f", "getDefaultCameraSwitchButtonVisible", "getDefaultCameraSwitchButtonVisible$annotations", "defaultCameraSwitchButtonVisible", "g", "getDefaultTriggerButtonVisible", "getDefaultTriggerButtonVisible$annotations", "defaultTriggerButtonVisible", "Lcom/scandit/datacapture/core/ui/style/Brush;", "h", "Lcom/scandit/datacapture/core/ui/style/Brush;", "getDefaultBrush", "()Lcom/scandit/datacapture/core/ui/style/Brush;", "getDefaultBrush$annotations", "defaultBrush", "i", "getDefaultErrorBrush", "getDefaultErrorBrush$annotations", "defaultErrorBrush", "j", "getDefaultToastEnabled", "getDefaultToastEnabled$annotations", "defaultToastEnabled", "k", "getDefaultZoomSwitchControlVisible", "getDefaultZoomSwitchControlVisible$annotations", "defaultZoomSwitchControlVisible", "l", "getDefaultPreviewSizeControlVisible", "getDefaultPreviewSizeControlVisible$annotations", "defaultPreviewSizeControlVisible", "m", "getDefaultTorchControlVisible", "getDefaultTorchControlVisible$annotations", "defaultTorchControlVisible", "n", "getDefaultPreviewCloseControlVisible", "getDefaultPreviewCloseControlVisible$annotations", "defaultPreviewCloseControlVisible", "", "o", "I", "getDefaultVisualFeedbackSuccessColor", "()I", "getDefaultVisualFeedbackSuccessColor$annotations", "defaultVisualFeedbackSuccessColor", "p", "getDefaultVisualFeedbackErrorColor", "getDefaultVisualFeedbackErrorColor$annotations", "defaultVisualFeedbackErrorColor", "Landroid/graphics/Bitmap;", "q", "Landroid/graphics/Bitmap;", "getDefaultTriggerButtonImage", "()Landroid/graphics/Bitmap;", "getDefaultTriggerButtonImage$annotations", "defaultTriggerButtonImage", "defaultHandModeButtonVisible", "getDefaultHandModeButtonVisible", "getDefaultHandModeButtonVisible$annotations", "defaultTorchButtonVisible", "getDefaultTorchButtonVisible", "getDefaultTorchButtonVisible$annotations", "defaultSoundModeButtonVisible", "getDefaultSoundModeButtonVisible", "getDefaultSoundModeButtonVisible$annotations", "defaultHapticModeButtonVisible", "getDefaultHapticModeButtonVisible", "getDefaultHapticModeButtonVisible$annotations", "", "defaultStopCapturingText", "Ljava/lang/String;", "getDefaultStopCapturingText", "()Ljava/lang/String;", "getDefaultStopCapturingText$annotations", "defaultStartCapturingText", "getDefaultStartCapturingText", "getDefaultStartCapturingText$annotations", "defaultResumeCapturingText", "getDefaultResumeCapturingText", "getDefaultResumeCapturingText$annotations", "defaultScanningCapturingText", "getDefaultScanningCapturingText", "getDefaultScanningCapturingText$annotations", "defaultCaptureButtonActiveBackgroundColor", "Ljava/lang/Integer;", "getDefaultCaptureButtonActiveBackgroundColor", "()Ljava/lang/Integer;", "getDefaultCaptureButtonActiveBackgroundColor$annotations", "defaultCaptureButtonBackgroundColor", "getDefaultCaptureButtonBackgroundColor", "getDefaultCaptureButtonBackgroundColor$annotations", "defaultCaptureButtonTintColor", "getDefaultCaptureButtonTintColor", "getDefaultCaptureButtonTintColor$annotations", "defaultTriggerButtonCollapsedColor", "getDefaultTriggerButtonCollapsedColor", "getDefaultTriggerButtonCollapsedColor$annotations", "defaultTriggerButtonExpandedColor", "getDefaultTriggerButtonExpandedColor", "getDefaultTriggerButtonExpandedColor$annotations", "defaultTriggerButtonAnimationColor", "getDefaultTriggerButtonAnimationColor", "getDefaultTriggerButtonAnimationColor$annotations", "defaultTriggerButtonTintColor", "getDefaultTriggerButtonTintColor", "getDefaultTriggerButtonTintColor$annotations", "defaultToolbarBackgroundColor", "getDefaultToolbarBackgroundColor", "getDefaultToolbarBackgroundColor$annotations", "defaultToolbarIconActiveTintColor", "getDefaultToolbarIconActiveTintColor", "getDefaultToolbarIconActiveTintColor$annotations", "defaultToolbarIconInactiveTintColor", "getDefaultToolbarIconInactiveTintColor", "getDefaultToolbarIconInactiveTintColor$annotations", "defaultToastBackgroundColor", "getDefaultToastBackgroundColor", "getDefaultToastBackgroundColor$annotations", "defaultToastTextColor", "getDefaultToastTextColor", "getDefaultToastTextColor$annotations", "defaultTargetModeEnabledMessage", "getDefaultTargetModeEnabledMessage", "getDefaultTargetModeEnabledMessage$annotations", "defaultTargetModeDisabledMessage", "getDefaultTargetModeDisabledMessage", "getDefaultTargetModeDisabledMessage$annotations", "defaultContinuousModeEnabledMessage", "getDefaultContinuousModeEnabledMessage", "getDefaultContinuousModeEnabledMessage$annotations", "defaultContinuousModeDisabledMessage", "getDefaultContinuousModeDisabledMessage", "getDefaultContinuousModeDisabledMessage$annotations", "defaultZoomedInMessage", "getDefaultZoomedInMessage", "getDefaultZoomedInMessage$annotations", "defaultZoomedOutMessage", "getDefaultZoomedOutMessage", "getDefaultZoomedOutMessage$annotations", "defaultTorchEnabledMessage", "getDefaultTorchEnabledMessage", "getDefaultTorchEnabledMessage$annotations", "defaultTorchDisabledMessage", "getDefaultTorchDisabledMessage", "getDefaultTorchDisabledMessage$annotations", "defaultWorldFacingCameraEnabledMessage", "getDefaultWorldFacingCameraEnabledMessage", "getDefaultWorldFacingCameraEnabledMessage$annotations", "defaultUserFacingCameraEnabledMessage", "getDefaultUserFacingCameraEnabledMessage", "getDefaultUserFacingCameraEnabledMessage$annotations", "defaultScanPausedMessage", "getDefaultScanPausedMessage", "getDefaultScanPausedMessage$annotations", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class SparkScanViewDefaults {
    public static final SparkScanViewDefaults INSTANCE = new SparkScanViewDefaults();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static final boolean defaultScanningBehaviorButtonVisible = NativeSparkScanViewDefaults.defaultScanningBehaviorButtonVisible();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final boolean defaultBarcodeCountButtonVisible = NativeSparkScanViewDefaults.defaultBarcodeCountButtonVisible();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final boolean defaultBarcodeFindButtonVisible = NativeSparkScanViewDefaults.defaultBarcodeFindButtonVisible();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final boolean defaultLabelCaptureButtonVisible = NativeSparkScanViewDefaults.defaultLabelCaptureButtonVisible();

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final boolean defaultTargetModeButtonVisible = NativeSparkScanViewDefaults.defaultTargetModeButtonVisible();

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final boolean defaultCameraSwitchButtonVisible = NativeSparkScanViewDefaults.defaultCameraSwitchButtonVisible();

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final boolean defaultTriggerButtonVisible = NativeSparkScanViewDefaults.defaultTriggerButtonVisible();

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final Brush defaultBrush;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final Brush defaultErrorBrush;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final boolean defaultToastEnabled;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final boolean defaultZoomSwitchControlVisible;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static final boolean defaultPreviewSizeControlVisible;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static final boolean defaultTorchControlVisible;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private static final boolean defaultPreviewCloseControlVisible;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private static final int defaultVisualFeedbackSuccessColor;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private static final int defaultVisualFeedbackErrorColor;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private static final Bitmap defaultTriggerButtonImage;

    @JvmStatic
    public static /* synthetic */ void getDefaultBarcodeCountButtonVisible$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultBarcodeFindButtonVisible$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultBrush$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultCameraSwitchButtonVisible$annotations() {
    }

    public static final Integer getDefaultCaptureButtonActiveBackgroundColor() {
        return null;
    }

    @Deprecated
    @JvmStatic
    public static /* synthetic */ void getDefaultCaptureButtonActiveBackgroundColor$annotations() {
    }

    public static final Integer getDefaultCaptureButtonBackgroundColor() {
        return null;
    }

    @Deprecated
    @JvmStatic
    public static /* synthetic */ void getDefaultCaptureButtonBackgroundColor$annotations() {
    }

    public static final Integer getDefaultCaptureButtonTintColor() {
        return null;
    }

    @Deprecated
    @JvmStatic
    public static /* synthetic */ void getDefaultCaptureButtonTintColor$annotations() {
    }

    public static final String getDefaultContinuousModeDisabledMessage() {
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultContinuousModeDisabledMessage$annotations() {
    }

    public static final String getDefaultContinuousModeEnabledMessage() {
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultContinuousModeEnabledMessage$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultErrorBrush$annotations() {
    }

    public static final boolean getDefaultHandModeButtonVisible() {
        return false;
    }

    @Deprecated
    @JvmStatic
    public static /* synthetic */ void getDefaultHandModeButtonVisible$annotations() {
    }

    public static final boolean getDefaultHapticModeButtonVisible() {
        return false;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultHapticModeButtonVisible$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultLabelCaptureButtonVisible$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultPreviewCloseControlVisible$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultPreviewSizeControlVisible$annotations() {
    }

    public static final String getDefaultResumeCapturingText() {
        return null;
    }

    @Deprecated
    @JvmStatic
    public static /* synthetic */ void getDefaultResumeCapturingText$annotations() {
    }

    public static final String getDefaultScanPausedMessage() {
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultScanPausedMessage$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultScanningBehaviorButtonVisible$annotations() {
    }

    public static final String getDefaultScanningCapturingText() {
        return null;
    }

    @Deprecated
    @JvmStatic
    public static /* synthetic */ void getDefaultScanningCapturingText$annotations() {
    }

    public static final boolean getDefaultSoundModeButtonVisible() {
        return false;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultSoundModeButtonVisible$annotations() {
    }

    public static final String getDefaultStartCapturingText() {
        return null;
    }

    @Deprecated
    @JvmStatic
    public static /* synthetic */ void getDefaultStartCapturingText$annotations() {
    }

    public static final String getDefaultStopCapturingText() {
        return null;
    }

    @Deprecated
    @JvmStatic
    public static /* synthetic */ void getDefaultStopCapturingText$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultTargetModeButtonVisible$annotations() {
    }

    public static final String getDefaultTargetModeDisabledMessage() {
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultTargetModeDisabledMessage$annotations() {
    }

    public static final String getDefaultTargetModeEnabledMessage() {
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultTargetModeEnabledMessage$annotations() {
    }

    public static final Integer getDefaultToastBackgroundColor() {
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultToastBackgroundColor$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultToastEnabled$annotations() {
    }

    public static final Integer getDefaultToastTextColor() {
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultToastTextColor$annotations() {
    }

    public static final Integer getDefaultToolbarBackgroundColor() {
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultToolbarBackgroundColor$annotations() {
    }

    public static final Integer getDefaultToolbarIconActiveTintColor() {
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultToolbarIconActiveTintColor$annotations() {
    }

    public static final Integer getDefaultToolbarIconInactiveTintColor() {
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultToolbarIconInactiveTintColor$annotations() {
    }

    public static final boolean getDefaultTorchButtonVisible() {
        return false;
    }

    @Deprecated
    @JvmStatic
    public static /* synthetic */ void getDefaultTorchButtonVisible$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultTorchControlVisible$annotations() {
    }

    public static final String getDefaultTorchDisabledMessage() {
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultTorchDisabledMessage$annotations() {
    }

    public static final String getDefaultTorchEnabledMessage() {
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultTorchEnabledMessage$annotations() {
    }

    public static final Integer getDefaultTriggerButtonAnimationColor() {
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultTriggerButtonAnimationColor$annotations() {
    }

    public static final Integer getDefaultTriggerButtonCollapsedColor() {
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultTriggerButtonCollapsedColor$annotations() {
    }

    public static final Integer getDefaultTriggerButtonExpandedColor() {
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultTriggerButtonExpandedColor$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultTriggerButtonImage$annotations() {
    }

    public static final Integer getDefaultTriggerButtonTintColor() {
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultTriggerButtonTintColor$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultTriggerButtonVisible$annotations() {
    }

    public static final String getDefaultUserFacingCameraEnabledMessage() {
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultUserFacingCameraEnabledMessage$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultVisualFeedbackErrorColor$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultVisualFeedbackSuccessColor$annotations() {
    }

    public static final String getDefaultWorldFacingCameraEnabledMessage() {
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultWorldFacingCameraEnabledMessage$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultZoomSwitchControlVisible$annotations() {
    }

    public static final String getDefaultZoomedInMessage() {
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultZoomedInMessage$annotations() {
    }

    public static final String getDefaultZoomedOutMessage() {
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultZoomedOutMessage$annotations() {
    }

    static {
        Brush.Companion companion = Brush.INSTANCE;
        NativeBrush nativeBrushDefaultFeedbackSuccessBrush = NativeSparkScanViewDefaults.defaultFeedbackSuccessBrush();
        Intrinsics.i(nativeBrushDefaultFeedbackSuccessBrush, "defaultFeedbackSuccessBrush(...)");
        defaultBrush = BrushExtensionsKt.of(companion, nativeBrushDefaultFeedbackSuccessBrush);
        NativeBrush nativeBrushDefaultFeedbackErrorBrush = NativeSparkScanViewDefaults.defaultFeedbackErrorBrush();
        Intrinsics.i(nativeBrushDefaultFeedbackErrorBrush, "defaultFeedbackErrorBrush(...)");
        defaultErrorBrush = BrushExtensionsKt.of(companion, nativeBrushDefaultFeedbackErrorBrush);
        defaultToastEnabled = NativeSparkScanViewDefaults.defaultToastEnabled();
        defaultZoomSwitchControlVisible = NativeSparkScanViewDefaults.defaultZoomSwitchControlVisible();
        defaultPreviewSizeControlVisible = NativeSparkScanViewDefaults.defaultPreviewSizeControlVisible();
        defaultTorchControlVisible = NativeSparkScanViewDefaults.defaultTorchControlVisible();
        defaultPreviewCloseControlVisible = NativeSparkScanViewDefaults.defaultPreviewCloseControlVisible();
        NativeColor nativeColorDefaultVisualFeedbackSuccessColor = NativeSparkScanViewDefaults.defaultVisualFeedbackSuccessColor();
        Intrinsics.i(nativeColorDefaultVisualFeedbackSuccessColor, "defaultVisualFeedbackSuccessColor(...)");
        defaultVisualFeedbackSuccessColor = NativeColorExtensionsKt.toInt(nativeColorDefaultVisualFeedbackSuccessColor);
        NativeColor nativeColorDefaultVisualFeedbackErrorColor = NativeSparkScanViewDefaults.defaultVisualFeedbackErrorColor();
        Intrinsics.i(nativeColorDefaultVisualFeedbackErrorColor, "defaultVisualFeedbackErrorColor(...)");
        defaultVisualFeedbackErrorColor = NativeColorExtensionsKt.toInt(nativeColorDefaultVisualFeedbackErrorColor);
        defaultTriggerButtonImage = BitmapExtensionsKt.bitmapFromResource(R.drawable.sc_ic_spark_scan_view_button);
    }

    public static final boolean getDefaultBarcodeCountButtonVisible() {
        return defaultBarcodeCountButtonVisible;
    }

    public static final boolean getDefaultBarcodeFindButtonVisible() {
        return defaultBarcodeFindButtonVisible;
    }

    public static final Brush getDefaultBrush() {
        return defaultBrush;
    }

    public static final boolean getDefaultCameraSwitchButtonVisible() {
        return defaultCameraSwitchButtonVisible;
    }

    public static final Brush getDefaultErrorBrush() {
        return defaultErrorBrush;
    }

    public static final boolean getDefaultLabelCaptureButtonVisible() {
        return defaultLabelCaptureButtonVisible;
    }

    public static final boolean getDefaultPreviewCloseControlVisible() {
        return defaultPreviewCloseControlVisible;
    }

    public static final boolean getDefaultPreviewSizeControlVisible() {
        return defaultPreviewSizeControlVisible;
    }

    public static final boolean getDefaultScanningBehaviorButtonVisible() {
        return defaultScanningBehaviorButtonVisible;
    }

    public static final boolean getDefaultTargetModeButtonVisible() {
        return defaultTargetModeButtonVisible;
    }

    public static final boolean getDefaultToastEnabled() {
        return defaultToastEnabled;
    }

    public static final boolean getDefaultTorchControlVisible() {
        return defaultTorchControlVisible;
    }

    public static final Bitmap getDefaultTriggerButtonImage() {
        return defaultTriggerButtonImage;
    }

    public static final boolean getDefaultTriggerButtonVisible() {
        return defaultTriggerButtonVisible;
    }

    public static final int getDefaultVisualFeedbackErrorColor() {
        return defaultVisualFeedbackErrorColor;
    }

    public static final int getDefaultVisualFeedbackSuccessColor() {
        return defaultVisualFeedbackSuccessColor;
    }

    public static final boolean getDefaultZoomSwitchControlVisible() {
        return defaultZoomSwitchControlVisible;
    }

    private SparkScanViewDefaults() {
    }
}
