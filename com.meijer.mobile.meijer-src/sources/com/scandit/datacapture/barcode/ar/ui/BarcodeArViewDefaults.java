package com.scandit.datacapture.barcode.ar.ui;

import android.graphics.Color;
import android.graphics.Typeface;
import com.medallia.digital.mobilesdk.l3;
import com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArAnnotationTrigger;
import com.scandit.datacapture.barcode.ar.ui.annotations.info.BarcodeArInfoAnnotationAnchor;
import com.scandit.datacapture.barcode.ar.ui.annotations.info.BarcodeArInfoAnnotationWidthPreset;
import com.scandit.datacapture.barcode.ar.ui.annotations.popover.BarcodeArPopoverAnnotationAnchor;
import com.scandit.datacapture.barcode.ar.ui.annotations.statusicon.BarcodeArStatusIconAnnotationAnchor;
import com.scandit.datacapture.barcode.ar.ui.highlight.BarcodeArCircleHighlightPreset;
import com.scandit.datacapture.barcode.internal.module.ar.ui.NativeBarcodeArViewDefaults;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.source.CameraPosition;
import com.scandit.datacapture.core.ui.icon.ScanditIcon;
import com.scandit.datacapture.core.ui.icon.ScanditIconShape;
import com.scandit.datacapture.core.ui.icon.ScanditIconType;
import com.scandit.datacapture.core.ui.style.Brush;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\bE\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\r\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u0014\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R \u0010\u001b\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001f\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u0017\u0012\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001d\u0010\u0019R \u0010&\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b%\u0010\u0013\u001a\u0004\b#\u0010$R \u0010*\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010\"\u0012\u0004\b)\u0010\u0013\u001a\u0004\b(\u0010$R \u0010.\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010\"\u0012\u0004\b-\u0010\u0013\u001a\u0004\b,\u0010$R \u00102\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b/\u0010\u0017\u0012\u0004\b1\u0010\u0013\u001a\u0004\b0\u0010\u0019R \u00106\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b3\u0010\u0017\u0012\u0004\b5\u0010\u0013\u001a\u0004\b4\u0010\u0019R \u0010:\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b7\u0010\u0017\u0012\u0004\b9\u0010\u0013\u001a\u0004\b8\u0010\u0019R \u0010@\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b;\u0010<\u0012\u0004\b?\u0010\u0013\u001a\u0004\b=\u0010>R \u0010G\u001a\u00020A8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bB\u0010C\u0012\u0004\bF\u0010\u0013\u001a\u0004\bD\u0010ER \u0010M\u001a\u00020\u00078\u0006X\u0087D¢\u0006\u0012\n\u0004\bH\u0010I\u0012\u0004\bL\u0010\u0013\u001a\u0004\bJ\u0010KR \u0010T\u001a\u00020N8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bO\u0010P\u0012\u0004\bS\u0010\u0013\u001a\u0004\bQ\u0010RR \u0010[\u001a\u00020U8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bV\u0010W\u0012\u0004\bZ\u0010\u0013\u001a\u0004\bX\u0010YR \u0010_\u001a\u00020\u00158\u0006X\u0087D¢\u0006\u0012\n\u0004\b\\\u0010\u0017\u0012\u0004\b^\u0010\u0013\u001a\u0004\b]\u0010\u0019R \u0010f\u001a\u00020`8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\ba\u0010b\u0012\u0004\be\u0010\u0013\u001a\u0004\bc\u0010dR \u0010j\u001a\u00020A8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bg\u0010C\u0012\u0004\bi\u0010\u0013\u001a\u0004\bh\u0010ER \u0010n\u001a\u00020\u00158\u0006X\u0087D¢\u0006\u0012\n\u0004\bk\u0010\u0017\u0012\u0004\bm\u0010\u0013\u001a\u0004\bl\u0010\u0019R \u0010u\u001a\u00020o8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bp\u0010q\u0012\u0004\bt\u0010\u0013\u001a\u0004\br\u0010sR \u0010y\u001a\u00020U8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bv\u0010W\u0012\u0004\bx\u0010\u0013\u001a\u0004\bw\u0010YR \u0010}\u001a\u00020U8\u0006X\u0087D¢\u0006\u0012\n\u0004\bz\u0010W\u0012\u0004\b|\u0010\u0013\u001a\u0004\b{\u0010YR%\u0010\u0084\u0001\u001a\u00020~8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u007f\u0010\u0080\u0001\u0012\u0005\b\u0083\u0001\u0010\u0013\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R'\u0010\u008b\u0001\u001a\u00030\u0085\u00018\u0006X\u0087\u0004¢\u0006\u0017\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u0012\u0005\b\u008a\u0001\u0010\u0013\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R$\u0010\u008f\u0001\u001a\u00020U8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u008c\u0001\u0010W\u0012\u0005\b\u008e\u0001\u0010\u0013\u001a\u0005\b\u008d\u0001\u0010YR$\u0010\u0093\u0001\u001a\u00020\u00158\u0006X\u0087D¢\u0006\u0015\n\u0005\b\u0090\u0001\u0010\u0017\u0012\u0005\b\u0092\u0001\u0010\u0013\u001a\u0005\b\u0091\u0001\u0010\u0019R'\u0010\u009a\u0001\u001a\u00030\u0094\u00018\u0006X\u0087\u0004¢\u0006\u0017\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u0012\u0005\b\u0099\u0001\u0010\u0013\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R$\u0010\u009e\u0001\u001a\u00020A8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u009b\u0001\u0010C\u0012\u0005\b\u009d\u0001\u0010\u0013\u001a\u0005\b\u009c\u0001\u0010ER$\u0010¢\u0001\u001a\u00020U8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u009f\u0001\u0010W\u0012\u0005\b¡\u0001\u0010\u0013\u001a\u0005\b \u0001\u0010YR$\u0010¦\u0001\u001a\u00020N8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b£\u0001\u0010P\u0012\u0005\b¥\u0001\u0010\u0013\u001a\u0005\b¤\u0001\u0010RR$\u0010ª\u0001\u001a\u00020\u00078\u0006X\u0087D¢\u0006\u0015\n\u0005\b§\u0001\u0010I\u0012\u0005\b©\u0001\u0010\u0013\u001a\u0005\b¨\u0001\u0010KR$\u0010®\u0001\u001a\u00020U8\u0006X\u0087D¢\u0006\u0015\n\u0005\b«\u0001\u0010W\u0012\u0005\b\u00ad\u0001\u0010\u0013\u001a\u0005\b¬\u0001\u0010YR#\u0010±\u0001\u001a\u00020U8\u0006X\u0087D¢\u0006\u0014\n\u0004\bI\u0010W\u0012\u0005\b°\u0001\u0010\u0013\u001a\u0005\b¯\u0001\u0010YR$\u0010µ\u0001\u001a\u00020N8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b²\u0001\u0010P\u0012\u0005\b´\u0001\u0010\u0013\u001a\u0005\b³\u0001\u0010RR$\u0010¹\u0001\u001a\u00020\u00078\u0006X\u0087D¢\u0006\u0015\n\u0005\b¶\u0001\u0010I\u0012\u0005\b¸\u0001\u0010\u0013\u001a\u0005\b·\u0001\u0010KR#\u0010¼\u0001\u001a\u00020U8\u0006X\u0087D¢\u0006\u0014\n\u0004\bW\u0010W\u0012\u0005\b»\u0001\u0010\u0013\u001a\u0005\bº\u0001\u0010YR#\u0010¿\u0001\u001a\u00020N8\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\f\u0010P\u0012\u0005\b¾\u0001\u0010\u0013\u001a\u0005\b½\u0001\u0010RR$\u0010Ã\u0001\u001a\u00020\u00078\u0006X\u0087D¢\u0006\u0015\n\u0005\bÀ\u0001\u0010I\u0012\u0005\bÂ\u0001\u0010\u0013\u001a\u0005\bÁ\u0001\u0010KR$\u0010Ç\u0001\u001a\u00020U8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\bÄ\u0001\u0010W\u0012\u0005\bÆ\u0001\u0010\u0013\u001a\u0005\bÅ\u0001\u0010YR$\u0010Ë\u0001\u001a\u00020\u00158\u0006X\u0087D¢\u0006\u0015\n\u0005\bÈ\u0001\u0010\u0017\u0012\u0005\bÊ\u0001\u0010\u0013\u001a\u0005\bÉ\u0001\u0010\u0019R$\u0010Ï\u0001\u001a\u00020\u00158\u0006X\u0087D¢\u0006\u0015\n\u0005\bÌ\u0001\u0010\u0017\u0012\u0005\bÎ\u0001\u0010\u0013\u001a\u0005\bÍ\u0001\u0010\u0019R$\u0010Ó\u0001\u001a\u00020U8\u0006X\u0087D¢\u0006\u0015\n\u0005\bÐ\u0001\u0010W\u0012\u0005\bÒ\u0001\u0010\u0013\u001a\u0005\bÑ\u0001\u0010YR&\u0010Ô\u0001\u001a\u0004\u0018\u00010o8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\bÔ\u0001\u0010q\u0012\u0005\bÖ\u0001\u0010\u0013\u001a\u0005\bÕ\u0001\u0010sR$\u0010×\u0001\u001a\u00020\u00158\u0006X\u0087D¢\u0006\u0015\n\u0005\b×\u0001\u0010\u0017\u0012\u0005\bÙ\u0001\u0010\u0013\u001a\u0005\bØ\u0001\u0010\u0019R)\u0010Û\u0001\u001a\u0005\u0018\u00010Ú\u00018\u0006X\u0087\u0004¢\u0006\u0017\n\u0006\bÛ\u0001\u0010Ü\u0001\u0012\u0005\bß\u0001\u0010\u0013\u001a\u0006\bÝ\u0001\u0010Þ\u0001R$\u0010à\u0001\u001a\u00020\u00158\u0006X\u0087D¢\u0006\u0015\n\u0005\bà\u0001\u0010\u0017\u0012\u0005\bâ\u0001\u0010\u0013\u001a\u0005\bá\u0001\u0010\u0019R&\u0010ã\u0001\u001a\u0004\u0018\u00010o8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\bã\u0001\u0010q\u0012\u0005\bå\u0001\u0010\u0013\u001a\u0005\bä\u0001\u0010sR)\u0010æ\u0001\u001a\u0005\u0018\u00010Ú\u00018\u0006X\u0087\u0004¢\u0006\u0017\n\u0006\bæ\u0001\u0010Ü\u0001\u0012\u0005\bè\u0001\u0010\u0013\u001a\u0006\bç\u0001\u0010Þ\u0001R&\u0010é\u0001\u001a\u0004\u0018\u00010o8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\bé\u0001\u0010q\u0012\u0005\bë\u0001\u0010\u0013\u001a\u0005\bê\u0001\u0010sR)\u0010ì\u0001\u001a\u0005\u0018\u00010Ú\u00018\u0006X\u0087\u0004¢\u0006\u0017\n\u0006\bì\u0001\u0010Ü\u0001\u0012\u0005\bî\u0001\u0010\u0013\u001a\u0006\bí\u0001\u0010Þ\u0001R)\u0010ï\u0001\u001a\u0005\u0018\u00010Ú\u00018\u0006X\u0087\u0004¢\u0006\u0017\n\u0006\bï\u0001\u0010Ü\u0001\u0012\u0005\bñ\u0001\u0010\u0013\u001a\u0006\bð\u0001\u0010Þ\u0001R)\u0010ó\u0001\u001a\u0005\u0018\u00010ò\u00018\u0006X\u0087\u0004¢\u0006\u0017\n\u0006\bó\u0001\u0010ô\u0001\u0012\u0005\b÷\u0001\u0010\u0013\u001a\u0006\bõ\u0001\u0010ö\u0001R&\u0010ø\u0001\u001a\u0004\u0018\u00010o8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\bø\u0001\u0010q\u0012\u0005\bú\u0001\u0010\u0013\u001a\u0005\bù\u0001\u0010sR&\u0010û\u0001\u001a\u0004\u0018\u00010o8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\bû\u0001\u0010q\u0012\u0005\bý\u0001\u0010\u0013\u001a\u0005\bü\u0001\u0010sR$\u0010þ\u0001\u001a\u00020\u00158\u0006X\u0087D¢\u0006\u0015\n\u0005\bþ\u0001\u0010\u0017\u0012\u0005\b\u0080\u0002\u0010\u0013\u001a\u0005\bÿ\u0001\u0010\u0019¨\u0006\u0081\u0002"}, d2 = {"Lcom/scandit/datacapture/barcode/ar/ui/BarcodeArViewDefaults;", "", "Lcom/scandit/datacapture/barcode/ar/ui/highlight/BarcodeArCircleHighlightPreset;", "preset", "Lcom/scandit/datacapture/core/ui/style/Brush;", "getDefaultCircleHighlightBrushFromPreset", "(Lcom/scandit/datacapture/barcode/ar/ui/highlight/BarcodeArCircleHighlightPreset;)Lcom/scandit/datacapture/core/ui/style/Brush;", "", "getDefaultCircleHighlightSizeFromPreset", "(Lcom/scandit/datacapture/barcode/ar/ui/highlight/BarcodeArCircleHighlightPreset;)F", "", "CLEANUP_PENDING_DELETION_AFTER_MILLIS", "J", "Lcom/scandit/datacapture/core/source/CameraPosition;", "a", "Lcom/scandit/datacapture/core/source/CameraPosition;", "getDefaultCameraPosition", "()Lcom/scandit/datacapture/core/source/CameraPosition;", "getDefaultCameraPosition$annotations", "()V", "defaultCameraPosition", "", "b", "Z", "getDefaultSoundEnabled", "()Z", "getDefaultSoundEnabled$annotations", "defaultSoundEnabled", "c", "getDefaultHapticsEnabled", "getDefaultHapticsEnabled$annotations", "defaultHapticsEnabled", "Lcom/scandit/datacapture/core/common/geometry/Anchor;", "d", "Lcom/scandit/datacapture/core/common/geometry/Anchor;", "getDefaultTorchControlPosition", "()Lcom/scandit/datacapture/core/common/geometry/Anchor;", "getDefaultTorchControlPosition$annotations", "defaultTorchControlPosition", "e", "getDefaultZoomControlPosition", "getDefaultZoomControlPosition$annotations", "defaultZoomControlPosition", "f", "getDefaultCameraSwitchControlPosition", "getDefaultCameraSwitchControlPosition$annotations", "defaultCameraSwitchControlPosition", "g", "getDefaultShouldShowTorchControl", "getDefaultShouldShowTorchControl$annotations", "defaultShouldShowTorchControl", "h", "getDefaultShouldShowZoomControl", "getDefaultShouldShowZoomControl$annotations", "defaultShouldShowZoomControl", "i", "getDefaultShouldShowCameraSwitchControl", "getDefaultShouldShowCameraSwitchControl$annotations", "defaultShouldShowCameraSwitchControl", "j", "Lcom/scandit/datacapture/core/ui/style/Brush;", "getDefaultRectangleHighlightBrush", "()Lcom/scandit/datacapture/core/ui/style/Brush;", "getDefaultRectangleHighlightBrush$annotations", "defaultRectangleHighlightBrush", "Lcom/scandit/datacapture/barcode/ar/ui/annotations/BarcodeArAnnotationTrigger;", "k", "Lcom/scandit/datacapture/barcode/ar/ui/annotations/BarcodeArAnnotationTrigger;", "getDefaultPopoverAnnotationTrigger", "()Lcom/scandit/datacapture/barcode/ar/ui/annotations/BarcodeArAnnotationTrigger;", "getDefaultPopoverAnnotationTrigger$annotations", "defaultPopoverAnnotationTrigger", "l", "F", "getDefaultBarcodeArPopoverAnnotationButtonTextSize", "()F", "getDefaultBarcodeArPopoverAnnotationButtonTextSize$annotations", "defaultBarcodeArPopoverAnnotationButtonTextSize", "Landroid/graphics/Typeface;", "m", "Landroid/graphics/Typeface;", "getDefaultBarcodeArPopoverAnnotationButtonTypeFace", "()Landroid/graphics/Typeface;", "getDefaultBarcodeArPopoverAnnotationButtonTypeFace$annotations", "defaultBarcodeArPopoverAnnotationButtonTypeFace", "", "n", "I", "getDefaultBarcodeArPopoverAnnotationButtonTextColor", "()I", "getDefaultBarcodeArPopoverAnnotationButtonTextColor$annotations", "defaultBarcodeArPopoverAnnotationButtonTextColor", "o", "getDefaultBarcodeArPopoverAnnotationButtonEnabled", "getDefaultBarcodeArPopoverAnnotationButtonEnabled$annotations", "defaultBarcodeArPopoverAnnotationButtonEnabled", "Lcom/scandit/datacapture/barcode/ar/ui/annotations/popover/BarcodeArPopoverAnnotationAnchor;", "p", "Lcom/scandit/datacapture/barcode/ar/ui/annotations/popover/BarcodeArPopoverAnnotationAnchor;", "getDefaultPopoverAnnotationAnchor", "()Lcom/scandit/datacapture/barcode/ar/ui/annotations/popover/BarcodeArPopoverAnnotationAnchor;", "getDefaultPopoverAnnotationAnchor$annotations", "defaultPopoverAnnotationAnchor", "q", "getDefaultStatusIconAnnotationTrigger", "getDefaultStatusIconAnnotationTrigger$annotations", "defaultStatusIconAnnotationTrigger", "r", "getDefaultStatusIconAnnotationHasTip", "getDefaultStatusIconAnnotationHasTip$annotations", "defaultStatusIconAnnotationHasTip", "Lcom/scandit/datacapture/core/ui/icon/ScanditIcon;", "s", "Lcom/scandit/datacapture/core/ui/icon/ScanditIcon;", "getDefaultStatusIconAnnotationIcon", "()Lcom/scandit/datacapture/core/ui/icon/ScanditIcon;", "getDefaultStatusIconAnnotationIcon$annotations", "defaultStatusIconAnnotationIcon", "t", "getDefaultStatusIconAnnotationTextColor", "getDefaultStatusIconAnnotationTextColor$annotations", "defaultStatusIconAnnotationTextColor", "u", "getDefaultStatusIconAnnotationBackgroundColor", "getDefaultStatusIconAnnotationBackgroundColor$annotations", "defaultStatusIconAnnotationBackgroundColor", "Lcom/scandit/datacapture/barcode/ar/ui/annotations/statusicon/BarcodeArStatusIconAnnotationAnchor;", "v", "Lcom/scandit/datacapture/barcode/ar/ui/annotations/statusicon/BarcodeArStatusIconAnnotationAnchor;", "getDefaultStatusIconAnnotationAnchor", "()Lcom/scandit/datacapture/barcode/ar/ui/annotations/statusicon/BarcodeArStatusIconAnnotationAnchor;", "getDefaultStatusIconAnnotationAnchor$annotations", "defaultStatusIconAnnotationAnchor", "Lcom/scandit/datacapture/barcode/ar/ui/annotations/info/BarcodeArInfoAnnotationWidthPreset;", "w", "Lcom/scandit/datacapture/barcode/ar/ui/annotations/info/BarcodeArInfoAnnotationWidthPreset;", "getDefaultInfoAnnotationWidth", "()Lcom/scandit/datacapture/barcode/ar/ui/annotations/info/BarcodeArInfoAnnotationWidthPreset;", "getDefaultInfoAnnotationWidth$annotations", "defaultInfoAnnotationWidth", "x", "getDefaultInfoAnnotationBackgroundColor", "getDefaultInfoAnnotationBackgroundColor$annotations", "defaultInfoAnnotationBackgroundColor", "y", "getDefaultInfoAnnotationHasTip", "getDefaultInfoAnnotationHasTip$annotations", "defaultInfoAnnotationHasTip", "Lcom/scandit/datacapture/barcode/ar/ui/annotations/info/BarcodeArInfoAnnotationAnchor;", "z", "Lcom/scandit/datacapture/barcode/ar/ui/annotations/info/BarcodeArInfoAnnotationAnchor;", "getDefaultInfoAnnotationAnchor", "()Lcom/scandit/datacapture/barcode/ar/ui/annotations/info/BarcodeArInfoAnnotationAnchor;", "getDefaultInfoAnnotationAnchor$annotations", "defaultInfoAnnotationAnchor", "A", "getDefaultInfoAnnotationTrigger", "getDefaultInfoAnnotationTrigger$annotations", "defaultInfoAnnotationTrigger", "B", "getDefaultInfoAnnotationHeaderBackgroundColor", "getDefaultInfoAnnotationHeaderBackgroundColor$annotations", "defaultInfoAnnotationHeaderBackgroundColor", "C", "getDefaultInfoAnnotationHeaderTypeface", "getDefaultInfoAnnotationHeaderTypeface$annotations", "defaultInfoAnnotationHeaderTypeface", "D", "getDefaultInfoAnnotationHeaderTextSize", "getDefaultInfoAnnotationHeaderTextSize$annotations", "defaultInfoAnnotationHeaderTextSize", "E", "getDefaultInfoAnnotationHeaderTextColor", "getDefaultInfoAnnotationHeaderTextColor$annotations", "defaultInfoAnnotationHeaderTextColor", "getDefaultInfoAnnotationFooterBackgroundColor", "getDefaultInfoAnnotationFooterBackgroundColor$annotations", "defaultInfoAnnotationFooterBackgroundColor", "G", "getDefaultInfoAnnotationFooterTypeface", "getDefaultInfoAnnotationFooterTypeface$annotations", "defaultInfoAnnotationFooterTypeface", "H", "getDefaultInfoAnnotationFooterTextSize", "getDefaultInfoAnnotationFooterTextSize$annotations", "defaultInfoAnnotationFooterTextSize", "getDefaultInfoAnnotationFooterTextColor", "getDefaultInfoAnnotationFooterTextColor$annotations", "defaultInfoAnnotationFooterTextColor", "getDefaultInfoAnnotationBodyElementTypeface", "getDefaultInfoAnnotationBodyElementTypeface$annotations", "defaultInfoAnnotationBodyElementTypeface", "K", "getDefaultInfoAnnotationBodyElementTextSize", "getDefaultInfoAnnotationBodyElementTextSize$annotations", "defaultInfoAnnotationBodyElementTextSize", "L", "getDefaultInfoAnnotationBodyElementTextColor", "getDefaultInfoAnnotationBodyElementTextColor$annotations", "defaultInfoAnnotationBodyElementTextColor", "M", "getDefaultInfoAnnotationBodyElementLeftIconTappable", "getDefaultInfoAnnotationBodyElementLeftIconTappable$annotations", "defaultInfoAnnotationBodyElementLeftIconTappable", "N", "getDefaultInfoAnnotationBodyElementRightIconTappable", "getDefaultInfoAnnotationBodyElementRightIconTappable$annotations", "defaultInfoAnnotationBodyElementRightIconTappable", "O", "getDefaultInfoAnnotationBodyElementTextAlignment", "getDefaultInfoAnnotationBodyElementTextAlignment$annotations", "defaultInfoAnnotationBodyElementTextAlignment", "defaultHighlightIcon", "getDefaultHighlightIcon", "getDefaultHighlightIcon$annotations", "defaultIsEntirePopoverTappable", "getDefaultIsEntirePopoverTappable", "getDefaultIsEntirePopoverTappable$annotations", "", "defaultStatusIconAnnotationText", "Ljava/lang/String;", "getDefaultStatusIconAnnotationText", "()Ljava/lang/String;", "getDefaultStatusIconAnnotationText$annotations", "defaultInfoAnnotationEntireAnnotationTappable", "getDefaultInfoAnnotationEntireAnnotationTappable", "getDefaultInfoAnnotationEntireAnnotationTappable$annotations", "defaultInfoAnnotationHeaderIcon", "getDefaultInfoAnnotationHeaderIcon", "getDefaultInfoAnnotationHeaderIcon$annotations", "defaultInfoAnnotationHeaderText", "getDefaultInfoAnnotationHeaderText", "getDefaultInfoAnnotationHeaderText$annotations", "defaultInfoAnnotationFooterIcon", "getDefaultInfoAnnotationFooterIcon", "getDefaultInfoAnnotationFooterIcon$annotations", "defaultInfoAnnotationFooterText", "getDefaultInfoAnnotationFooterText", "getDefaultInfoAnnotationFooterText$annotations", "defaultInfoAnnotationBodyElementText", "getDefaultInfoAnnotationBodyElementText", "getDefaultInfoAnnotationBodyElementText$annotations", "", "defaultInfoAnnotationBodyElementStyledText", "Ljava/lang/CharSequence;", "getDefaultInfoAnnotationBodyElementStyledText", "()Ljava/lang/CharSequence;", "getDefaultInfoAnnotationBodyElementStyledText$annotations", "defaultInfoAnnotationBodyElementLeftIcon", "getDefaultInfoAnnotationBodyElementLeftIcon", "getDefaultInfoAnnotationBodyElementLeftIcon$annotations", "defaultInfoAnnotationBodyElementRightIcon", "getDefaultInfoAnnotationBodyElementRightIcon", "getDefaultInfoAnnotationBodyElementRightIcon$annotations", "defaultHighlightIsPulsing", "getDefaultHighlightIsPulsing", "getDefaultHighlightIsPulsing$annotations", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class BarcodeArViewDefaults {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private static final BarcodeArAnnotationTrigger defaultInfoAnnotationTrigger;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private static final int defaultInfoAnnotationHeaderBackgroundColor;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private static final Typeface defaultInfoAnnotationHeaderTypeface;
    public static final /* synthetic */ long CLEANUP_PENDING_DELETION_AFTER_MILLIS = 1000;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private static final float defaultInfoAnnotationHeaderTextSize;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private static final int defaultInfoAnnotationHeaderTextColor;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private static final int defaultInfoAnnotationFooterBackgroundColor;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private static final Typeface defaultInfoAnnotationFooterTypeface;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private static final float defaultInfoAnnotationFooterTextSize;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private static final int defaultInfoAnnotationFooterTextColor;
    public static final BarcodeArViewDefaults INSTANCE = new BarcodeArViewDefaults();

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private static final Typeface defaultInfoAnnotationBodyElementTypeface;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private static final float defaultInfoAnnotationBodyElementTextSize;

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    private static final int defaultInfoAnnotationBodyElementTextColor;

    /* renamed from: M, reason: collision with root package name and from kotlin metadata */
    private static final boolean defaultInfoAnnotationBodyElementLeftIconTappable;

    /* renamed from: N, reason: collision with root package name and from kotlin metadata */
    private static final boolean defaultInfoAnnotationBodyElementRightIconTappable;

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private static final int defaultInfoAnnotationBodyElementTextAlignment;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static final CameraPosition defaultCameraPosition;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final boolean defaultSoundEnabled;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final boolean defaultHapticsEnabled;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final Anchor defaultTorchControlPosition;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final Anchor defaultZoomControlPosition;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final Anchor defaultCameraSwitchControlPosition;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final boolean defaultShouldShowTorchControl;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final boolean defaultShouldShowZoomControl;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final boolean defaultShouldShowCameraSwitchControl;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final Brush defaultRectangleHighlightBrush;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final BarcodeArAnnotationTrigger defaultPopoverAnnotationTrigger;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static final float defaultBarcodeArPopoverAnnotationButtonTextSize;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static final Typeface defaultBarcodeArPopoverAnnotationButtonTypeFace;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private static final int defaultBarcodeArPopoverAnnotationButtonTextColor;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private static final boolean defaultBarcodeArPopoverAnnotationButtonEnabled;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private static final BarcodeArPopoverAnnotationAnchor defaultPopoverAnnotationAnchor;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private static final BarcodeArAnnotationTrigger defaultStatusIconAnnotationTrigger;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private static final boolean defaultStatusIconAnnotationHasTip;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private static final ScanditIcon defaultStatusIconAnnotationIcon;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final int defaultStatusIconAnnotationTextColor;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private static final int defaultStatusIconAnnotationBackgroundColor;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private static final BarcodeArStatusIconAnnotationAnchor defaultStatusIconAnnotationAnchor;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private static final BarcodeArInfoAnnotationWidthPreset defaultInfoAnnotationWidth;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private static final int defaultInfoAnnotationBackgroundColor;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private static final boolean defaultInfoAnnotationHasTip;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private static final BarcodeArInfoAnnotationAnchor defaultInfoAnnotationAnchor;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BarcodeArCircleHighlightPreset.values().length];
            try {
                iArr[BarcodeArCircleHighlightPreset.DOT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BarcodeArCircleHighlightPreset.ICON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultBarcodeArPopoverAnnotationButtonEnabled$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultBarcodeArPopoverAnnotationButtonTextColor$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultBarcodeArPopoverAnnotationButtonTextSize$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultBarcodeArPopoverAnnotationButtonTypeFace$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultCameraPosition$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultCameraSwitchControlPosition$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultHapticsEnabled$annotations() {
    }

    public static final ScanditIcon getDefaultHighlightIcon() {
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultHighlightIcon$annotations() {
    }

    public static final boolean getDefaultHighlightIsPulsing() {
        return false;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultHighlightIsPulsing$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultInfoAnnotationAnchor$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultInfoAnnotationBackgroundColor$annotations() {
    }

    public static final ScanditIcon getDefaultInfoAnnotationBodyElementLeftIcon() {
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultInfoAnnotationBodyElementLeftIcon$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultInfoAnnotationBodyElementLeftIconTappable$annotations() {
    }

    public static final ScanditIcon getDefaultInfoAnnotationBodyElementRightIcon() {
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultInfoAnnotationBodyElementRightIcon$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultInfoAnnotationBodyElementRightIconTappable$annotations() {
    }

    public static final CharSequence getDefaultInfoAnnotationBodyElementStyledText() {
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultInfoAnnotationBodyElementStyledText$annotations() {
    }

    public static final String getDefaultInfoAnnotationBodyElementText() {
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultInfoAnnotationBodyElementText$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultInfoAnnotationBodyElementTextAlignment$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultInfoAnnotationBodyElementTextColor$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultInfoAnnotationBodyElementTextSize$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultInfoAnnotationBodyElementTypeface$annotations() {
    }

    public static final boolean getDefaultInfoAnnotationEntireAnnotationTappable() {
        return false;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultInfoAnnotationEntireAnnotationTappable$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultInfoAnnotationFooterBackgroundColor$annotations() {
    }

    public static final ScanditIcon getDefaultInfoAnnotationFooterIcon() {
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultInfoAnnotationFooterIcon$annotations() {
    }

    public static final String getDefaultInfoAnnotationFooterText() {
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultInfoAnnotationFooterText$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultInfoAnnotationFooterTextColor$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultInfoAnnotationFooterTextSize$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultInfoAnnotationFooterTypeface$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultInfoAnnotationHasTip$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultInfoAnnotationHeaderBackgroundColor$annotations() {
    }

    public static final ScanditIcon getDefaultInfoAnnotationHeaderIcon() {
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultInfoAnnotationHeaderIcon$annotations() {
    }

    public static final String getDefaultInfoAnnotationHeaderText() {
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultInfoAnnotationHeaderText$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultInfoAnnotationHeaderTextColor$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultInfoAnnotationHeaderTextSize$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultInfoAnnotationHeaderTypeface$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultInfoAnnotationTrigger$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultInfoAnnotationWidth$annotations() {
    }

    public static final boolean getDefaultIsEntirePopoverTappable() {
        return false;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultIsEntirePopoverTappable$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultPopoverAnnotationAnchor$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultPopoverAnnotationTrigger$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultRectangleHighlightBrush$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultShouldShowCameraSwitchControl$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultShouldShowTorchControl$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultShouldShowZoomControl$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultSoundEnabled$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultStatusIconAnnotationAnchor$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultStatusIconAnnotationBackgroundColor$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultStatusIconAnnotationHasTip$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultStatusIconAnnotationIcon$annotations() {
    }

    public static final String getDefaultStatusIconAnnotationText() {
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultStatusIconAnnotationText$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultStatusIconAnnotationTextColor$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultStatusIconAnnotationTrigger$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultTorchControlPosition$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultZoomControlPosition$annotations() {
    }

    static {
        BarcodeArViewSettings barcodeArViewSettings = new BarcodeArViewSettings();
        defaultCameraPosition = barcodeArViewSettings.getDefaultCameraPosition();
        defaultSoundEnabled = barcodeArViewSettings.getSoundEnabled();
        defaultHapticsEnabled = barcodeArViewSettings.getHapticEnabled();
        Anchor anchorDefaultTorchControlPosition = NativeBarcodeArViewDefaults.defaultTorchControlPosition();
        Intrinsics.i(anchorDefaultTorchControlPosition, "defaultTorchControlPosition(...)");
        defaultTorchControlPosition = anchorDefaultTorchControlPosition;
        Anchor anchorDefaultZoomControlPosition = NativeBarcodeArViewDefaults.defaultZoomControlPosition();
        Intrinsics.i(anchorDefaultZoomControlPosition, "defaultZoomControlPosition(...)");
        defaultZoomControlPosition = anchorDefaultZoomControlPosition;
        Anchor anchorDefaultCameraSwitchControlPosition = NativeBarcodeArViewDefaults.defaultCameraSwitchControlPosition();
        Intrinsics.i(anchorDefaultCameraSwitchControlPosition, "defaultCameraSwitchControlPosition(...)");
        defaultCameraSwitchControlPosition = anchorDefaultCameraSwitchControlPosition;
        defaultShouldShowTorchControl = NativeBarcodeArViewDefaults.defaultShouldShowTorchControl();
        defaultShouldShowZoomControl = NativeBarcodeArViewDefaults.defaultShouldShowZoomControl();
        defaultShouldShowCameraSwitchControl = NativeBarcodeArViewDefaults.defaultShouldShowCameraSwitchControl();
        defaultRectangleHighlightBrush = new Brush(Color.parseColor("#7300FFFF"), Color.parseColor("#00FFFF"), 2.0f);
        defaultPopoverAnnotationTrigger = BarcodeArAnnotationTrigger.HIGHLIGHT_TAP;
        defaultBarcodeArPopoverAnnotationButtonTextSize = 10.0f;
        Typeface DEFAULT = Typeface.DEFAULT;
        Intrinsics.i(DEFAULT, "DEFAULT");
        defaultBarcodeArPopoverAnnotationButtonTypeFace = DEFAULT;
        defaultBarcodeArPopoverAnnotationButtonTextColor = Color.parseColor("#3D4852");
        defaultBarcodeArPopoverAnnotationButtonEnabled = true;
        defaultPopoverAnnotationAnchor = BarcodeArPopoverAnnotationAnchor.BOTTOM;
        BarcodeArAnnotationTrigger barcodeArAnnotationTrigger = BarcodeArAnnotationTrigger.HIGHLIGHT_TAP_AND_BARCODE_SCAN;
        defaultStatusIconAnnotationTrigger = barcodeArAnnotationTrigger;
        defaultStatusIconAnnotationHasTip = true;
        defaultStatusIconAnnotationIcon = ScanditIcon.INSTANCE.builder().withIcon(ScanditIconType.EXCLAMATION_MARK).withIconColor(-16777216).withBackgroundColor(Integer.valueOf(Color.parseColor("#FBC02C"))).withBackgroundShape(ScanditIconShape.CIRCLE).build();
        defaultStatusIconAnnotationTextColor = Color.parseColor("#121619");
        defaultStatusIconAnnotationBackgroundColor = -1;
        defaultStatusIconAnnotationAnchor = BarcodeArStatusIconAnnotationAnchor.BOTTOM;
        defaultInfoAnnotationWidth = BarcodeArInfoAnnotationWidthPreset.SMALL;
        defaultInfoAnnotationBackgroundColor = com.scandit.datacapture.barcode.internal.module.extensions.a.a(-1, (int) (RangesKt.n(0.8f, 0.0f, 1.0f) * l3.f93323c));
        defaultInfoAnnotationHasTip = true;
        defaultInfoAnnotationAnchor = BarcodeArInfoAnnotationAnchor.BOTTOM;
        defaultInfoAnnotationTrigger = barcodeArAnnotationTrigger;
        defaultInfoAnnotationHeaderBackgroundColor = Color.parseColor("#00FFFF");
        Typeface DEFAULT_BOLD = Typeface.DEFAULT_BOLD;
        Intrinsics.i(DEFAULT_BOLD, "DEFAULT_BOLD");
        defaultInfoAnnotationHeaderTypeface = DEFAULT_BOLD;
        defaultInfoAnnotationHeaderTextSize = 16.0f;
        defaultInfoAnnotationHeaderTextColor = -16777216;
        defaultInfoAnnotationFooterBackgroundColor = -16777216;
        Intrinsics.i(DEFAULT_BOLD, "DEFAULT_BOLD");
        defaultInfoAnnotationFooterTypeface = DEFAULT_BOLD;
        defaultInfoAnnotationFooterTextSize = 16.0f;
        defaultInfoAnnotationFooterTextColor = -1;
        Intrinsics.i(DEFAULT, "DEFAULT");
        defaultInfoAnnotationBodyElementTypeface = DEFAULT;
        defaultInfoAnnotationBodyElementTextSize = 14.0f;
        defaultInfoAnnotationBodyElementTextColor = Color.parseColor("#121619");
        defaultInfoAnnotationBodyElementLeftIconTappable = true;
        defaultInfoAnnotationBodyElementRightIconTappable = true;
        defaultInfoAnnotationBodyElementTextAlignment = 4;
    }

    public static final boolean getDefaultBarcodeArPopoverAnnotationButtonEnabled() {
        return defaultBarcodeArPopoverAnnotationButtonEnabled;
    }

    public static final int getDefaultBarcodeArPopoverAnnotationButtonTextColor() {
        return defaultBarcodeArPopoverAnnotationButtonTextColor;
    }

    public static final float getDefaultBarcodeArPopoverAnnotationButtonTextSize() {
        return defaultBarcodeArPopoverAnnotationButtonTextSize;
    }

    public static final Typeface getDefaultBarcodeArPopoverAnnotationButtonTypeFace() {
        return defaultBarcodeArPopoverAnnotationButtonTypeFace;
    }

    public static final CameraPosition getDefaultCameraPosition() {
        return defaultCameraPosition;
    }

    public static final Anchor getDefaultCameraSwitchControlPosition() {
        return defaultCameraSwitchControlPosition;
    }

    @JvmStatic
    public static final Brush getDefaultCircleHighlightBrushFromPreset(BarcodeArCircleHighlightPreset preset) {
        Intrinsics.j(preset, "preset");
        int i10 = WhenMappings.$EnumSwitchMapping$0[preset.ordinal()];
        if (i10 == 1 || i10 == 2) {
            return new Brush(Color.parseColor("#7300FFFF"), Color.parseColor("#00FFFF"), 2.0f);
        }
        throw new NoWhenBranchMatchedException();
    }

    @JvmStatic
    public static final float getDefaultCircleHighlightSizeFromPreset(BarcodeArCircleHighlightPreset preset) {
        Intrinsics.j(preset, "preset");
        int i10 = WhenMappings.$EnumSwitchMapping$0[preset.ordinal()];
        if (i10 == 1) {
            return 18.0f;
        }
        if (i10 == 2) {
            return 32.0f;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean getDefaultHapticsEnabled() {
        return defaultHapticsEnabled;
    }

    public static final BarcodeArInfoAnnotationAnchor getDefaultInfoAnnotationAnchor() {
        return defaultInfoAnnotationAnchor;
    }

    public static final int getDefaultInfoAnnotationBackgroundColor() {
        return defaultInfoAnnotationBackgroundColor;
    }

    public static final boolean getDefaultInfoAnnotationBodyElementLeftIconTappable() {
        return defaultInfoAnnotationBodyElementLeftIconTappable;
    }

    public static final boolean getDefaultInfoAnnotationBodyElementRightIconTappable() {
        return defaultInfoAnnotationBodyElementRightIconTappable;
    }

    public static final int getDefaultInfoAnnotationBodyElementTextAlignment() {
        return defaultInfoAnnotationBodyElementTextAlignment;
    }

    public static final int getDefaultInfoAnnotationBodyElementTextColor() {
        return defaultInfoAnnotationBodyElementTextColor;
    }

    public static final float getDefaultInfoAnnotationBodyElementTextSize() {
        return defaultInfoAnnotationBodyElementTextSize;
    }

    public static final Typeface getDefaultInfoAnnotationBodyElementTypeface() {
        return defaultInfoAnnotationBodyElementTypeface;
    }

    public static final int getDefaultInfoAnnotationFooterBackgroundColor() {
        return defaultInfoAnnotationFooterBackgroundColor;
    }

    public static final int getDefaultInfoAnnotationFooterTextColor() {
        return defaultInfoAnnotationFooterTextColor;
    }

    public static final float getDefaultInfoAnnotationFooterTextSize() {
        return defaultInfoAnnotationFooterTextSize;
    }

    public static final Typeface getDefaultInfoAnnotationFooterTypeface() {
        return defaultInfoAnnotationFooterTypeface;
    }

    public static final boolean getDefaultInfoAnnotationHasTip() {
        return defaultInfoAnnotationHasTip;
    }

    public static final int getDefaultInfoAnnotationHeaderBackgroundColor() {
        return defaultInfoAnnotationHeaderBackgroundColor;
    }

    public static final int getDefaultInfoAnnotationHeaderTextColor() {
        return defaultInfoAnnotationHeaderTextColor;
    }

    public static final float getDefaultInfoAnnotationHeaderTextSize() {
        return defaultInfoAnnotationHeaderTextSize;
    }

    public static final Typeface getDefaultInfoAnnotationHeaderTypeface() {
        return defaultInfoAnnotationHeaderTypeface;
    }

    public static final BarcodeArAnnotationTrigger getDefaultInfoAnnotationTrigger() {
        return defaultInfoAnnotationTrigger;
    }

    public static final BarcodeArInfoAnnotationWidthPreset getDefaultInfoAnnotationWidth() {
        return defaultInfoAnnotationWidth;
    }

    public static final BarcodeArPopoverAnnotationAnchor getDefaultPopoverAnnotationAnchor() {
        return defaultPopoverAnnotationAnchor;
    }

    public static final BarcodeArAnnotationTrigger getDefaultPopoverAnnotationTrigger() {
        return defaultPopoverAnnotationTrigger;
    }

    public static final Brush getDefaultRectangleHighlightBrush() {
        return defaultRectangleHighlightBrush;
    }

    public static final boolean getDefaultShouldShowCameraSwitchControl() {
        return defaultShouldShowCameraSwitchControl;
    }

    public static final boolean getDefaultShouldShowTorchControl() {
        return defaultShouldShowTorchControl;
    }

    public static final boolean getDefaultShouldShowZoomControl() {
        return defaultShouldShowZoomControl;
    }

    public static final boolean getDefaultSoundEnabled() {
        return defaultSoundEnabled;
    }

    public static final BarcodeArStatusIconAnnotationAnchor getDefaultStatusIconAnnotationAnchor() {
        return defaultStatusIconAnnotationAnchor;
    }

    public static final int getDefaultStatusIconAnnotationBackgroundColor() {
        return defaultStatusIconAnnotationBackgroundColor;
    }

    public static final boolean getDefaultStatusIconAnnotationHasTip() {
        return defaultStatusIconAnnotationHasTip;
    }

    public static final ScanditIcon getDefaultStatusIconAnnotationIcon() {
        return defaultStatusIconAnnotationIcon;
    }

    public static final int getDefaultStatusIconAnnotationTextColor() {
        return defaultStatusIconAnnotationTextColor;
    }

    public static final BarcodeArAnnotationTrigger getDefaultStatusIconAnnotationTrigger() {
        return defaultStatusIconAnnotationTrigger;
    }

    public static final Anchor getDefaultTorchControlPosition() {
        return defaultTorchControlPosition;
    }

    public static final Anchor getDefaultZoomControlPosition() {
        return defaultZoomControlPosition;
    }

    private BarcodeArViewDefaults() {
    }
}
