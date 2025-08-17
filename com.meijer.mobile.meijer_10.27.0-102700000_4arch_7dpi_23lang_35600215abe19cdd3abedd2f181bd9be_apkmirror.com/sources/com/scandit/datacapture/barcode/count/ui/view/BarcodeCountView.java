package com.scandit.datacapture.barcode.count.ui.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.barcode.batch.internal.module.data.NativeTrackedBarcode;
import com.scandit.datacapture.barcode.count.capture.BarcodeCount;
import com.scandit.datacapture.barcode.count.capture.map.BarcodeCountMappingFlowSettings;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCount;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayColorScheme;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountNotInListStatus;
import com.scandit.datacapture.barcode.count.serialization.BarcodeCountViewDeserializer;
import com.scandit.datacapture.barcode.count.ui.BarcodeCountViewInternalUiListener;
import com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlay;
import com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayUiListener;
import com.scandit.datacapture.barcode.count.ui.view.status.BarcodeCountStatusProvider;
import com.scandit.datacapture.barcode.count.ui.view.status.InternalBarcodeCountStatusProvider;
import com.scandit.datacapture.barcode.filter.ui.overlay.BarcodeFilterHighlightSettings;
import com.scandit.datacapture.barcode.hardwarebutton.HardwareButtonHelperKt;
import com.scandit.datacapture.barcode.hardwarebutton.HardwareKeyEvent;
import com.scandit.datacapture.barcode.internal.module.count.ui.BarcodeCountViewLayerManager;
import com.scandit.datacapture.barcode.internal.module.count.ui.BarcodeCountViewSettings;
import com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.BarcodeIndicatorPresenter;
import com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountBrushHandler;
import com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountCameraHandler;
import com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter;
import com.scandit.datacapture.barcode.internal.module.count.ui.handlers.s;
import com.scandit.datacapture.barcode.internal.module.count.ui.mode.BarcodeCountInternalMode;
import com.scandit.datacapture.barcode.internal.module.count.ui.mode.BarcodeCountInternalModePresenter;
import com.scandit.datacapture.barcode.internal.module.count.ui.toolbar.BarcodeCountToolbarView;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.BarcodeCountDataCaptureViewHolder;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.BarcodeCountViewUiLayoutHelper;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.BarcodeCountViewDefaults;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.internal.sdk.common.async.MainThreadHelper;
import com.scandit.datacapture.core.internal.sdk.extensions.ViewExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.ProfilingOverlay;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.core.ui.LogoStyle;
import com.scandit.datacapture.core.ui.style.Brush;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 ò\u00012\u00020\u0001:\u0010ó\u0001ô\u0001õ\u0001ö\u0001ò\u0001÷\u0001ø\u0001ù\u0001Bw\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0011\u0010!\u001a\u0004\u0018\u00010\u001eH\u0001¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010#\u001a\u00020\"H\u0014¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020\"H\u0000¢\u0006\u0004\b%\u0010$J\u000f\u0010'\u001a\u00020\"H\u0014¢\u0006\u0004\b'\u0010$J/\u0010-\u001a\u00020\"2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020(2\u0006\u0010+\u001a\u00020(2\u0006\u0010,\u001a\u00020(H\u0014¢\u0006\u0004\b-\u0010.J\u0015\u00101\u001a\u00020\"2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\r\u00103\u001a\u00020/¢\u0006\u0004\b3\u00104J\u0015\u00105\u001a\u00020\"2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b5\u00102J\r\u00106\u001a\u00020/¢\u0006\u0004\b6\u00104J\u0015\u00107\u001a\u00020\"2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b7\u00102J\r\u00108\u001a\u00020/¢\u0006\u0004\b8\u00104J\u0015\u00109\u001a\u00020\"2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b9\u00102J\r\u0010:\u001a\u00020/¢\u0006\u0004\b:\u00104J\u0015\u0010;\u001a\u00020\"2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b;\u00102J\r\u0010<\u001a\u00020/¢\u0006\u0004\b<\u00104J\u0015\u0010=\u001a\u00020\"2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b=\u00102J\r\u0010>\u001a\u00020/¢\u0006\u0004\b>\u00104J\u0015\u0010?\u001a\u00020\"2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b?\u00102J\r\u0010@\u001a\u00020/¢\u0006\u0004\b@\u00104J\u0015\u0010A\u001a\u00020\"2\u0006\u00100\u001a\u00020/¢\u0006\u0004\bA\u00102J\r\u0010B\u001a\u00020/¢\u0006\u0004\bB\u00104J\u0015\u0010C\u001a\u00020\"2\u0006\u00100\u001a\u00020/¢\u0006\u0004\bC\u00102J\r\u0010D\u001a\u00020/¢\u0006\u0004\bD\u00104J\u0015\u0010E\u001a\u00020\"2\u0006\u00100\u001a\u00020/¢\u0006\u0004\bE\u00102J\r\u0010F\u001a\u00020/¢\u0006\u0004\bF\u00104J\u0015\u0010I\u001a\u00020\"2\u0006\u0010H\u001a\u00020G¢\u0006\u0004\bI\u0010JJ\u0015\u0010M\u001a\u00020\"2\u0006\u0010L\u001a\u00020K¢\u0006\u0004\bM\u0010NJ\u001f\u0010S\u001a\u00020\"2\u0006\u0010P\u001a\u00020O2\b\u0010R\u001a\u0004\u0018\u00010Q¢\u0006\u0004\bS\u0010TJ\u001f\u0010U\u001a\u00020\"2\u0006\u0010P\u001a\u00020O2\b\u0010R\u001a\u0004\u0018\u00010Q¢\u0006\u0004\bU\u0010TJ\u001f\u0010V\u001a\u00020\"2\u0006\u0010P\u001a\u00020O2\b\u0010R\u001a\u0004\u0018\u00010Q¢\u0006\u0004\bV\u0010TJ\u001f\u0010W\u001a\u00020\"2\u0006\u0010P\u001a\u00020O2\b\u0010R\u001a\u0004\u0018\u00010Q¢\u0006\u0004\bW\u0010TJ\u0017\u0010Y\u001a\u00020\"2\b\u0010X\u001a\u0004\u0018\u00010(¢\u0006\u0004\bY\u0010ZJ\u0015\u0010[\u001a\u00020\"2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b[\u00102J\r\u0010\\\u001a\u00020/¢\u0006\u0004\b\\\u00104J\u0015\u0010]\u001a\u00020\"2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b]\u00102J\r\u0010^\u001a\u00020/¢\u0006\u0004\b^\u00104J\u0015\u0010_\u001a\u00020\"2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b_\u00102J\r\u0010`\u001a\u00020/¢\u0006\u0004\b`\u00104J\u0015\u0010a\u001a\u00020\"2\u0006\u00100\u001a\u00020/¢\u0006\u0004\ba\u00102J\r\u0010b\u001a\u00020/¢\u0006\u0004\bb\u00104J\u0015\u0010c\u001a\u00020\"2\u0006\u00100\u001a\u00020/¢\u0006\u0004\bc\u00102J\r\u0010d\u001a\u00020/¢\u0006\u0004\bd\u00104J\u0015\u0010e\u001a\u00020\"2\u0006\u00100\u001a\u00020/¢\u0006\u0004\be\u00102J\r\u0010f\u001a\u00020/¢\u0006\u0004\bf\u00104J\u0015\u0010g\u001a\u00020\"2\u0006\u00100\u001a\u00020/¢\u0006\u0004\bg\u00102J\r\u0010h\u001a\u00020/¢\u0006\u0004\bh\u00104J\r\u0010i\u001a\u00020\"¢\u0006\u0004\bi\u0010$J\u0015\u0010k\u001a\u00020\"2\u0006\u0010\u000b\u001a\u00020j¢\u0006\u0004\bk\u0010lR \u0010s\u001a\u00020m8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bn\u0010o\u0012\u0004\br\u0010$\u001a\u0004\bp\u0010qR$\u0010{\u001a\u0004\u0018\u00010t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR&\u0010\u0081\u0001\u001a\u0004\u0018\u00010K8\u0000@\u0000X\u0080\u000e¢\u0006\u0013\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007f\"\u0005\b\u0080\u0001\u0010NR,\u0010\u0088\u0001\u001a\u00030\u0082\u00012\b\u0010\u0083\u0001\u001a\u00030\u0082\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R,\u0010\u008b\u0001\u001a\u00030\u0082\u00012\b\u0010\u0083\u0001\u001a\u00030\u0082\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0089\u0001\u0010\u0085\u0001\"\u0006\b\u008a\u0001\u0010\u0087\u0001R,\u0010\u008e\u0001\u001a\u00030\u0082\u00012\b\u0010\u0083\u0001\u001a\u00030\u0082\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u008c\u0001\u0010\u0085\u0001\"\u0006\b\u008d\u0001\u0010\u0087\u0001R,\u0010\u0091\u0001\u001a\u00030\u0082\u00012\b\u0010\u0083\u0001\u001a\u00030\u0082\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u008f\u0001\u0010\u0085\u0001\"\u0006\b\u0090\u0001\u0010\u0087\u0001R,\u0010\u0094\u0001\u001a\u00030\u0082\u00012\b\u0010\u0083\u0001\u001a\u00030\u0082\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0092\u0001\u0010\u0085\u0001\"\u0006\b\u0093\u0001\u0010\u0087\u0001R,\u0010\u0097\u0001\u001a\u00030\u0082\u00012\b\u0010\u0083\u0001\u001a\u00030\u0082\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0095\u0001\u0010\u0085\u0001\"\u0006\b\u0096\u0001\u0010\u0087\u0001R,\u0010\u009a\u0001\u001a\u00030\u0082\u00012\b\u0010\u0083\u0001\u001a\u00030\u0082\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0098\u0001\u0010\u0085\u0001\"\u0006\b\u0099\u0001\u0010\u0087\u0001R,\u0010\u009d\u0001\u001a\u00030\u0082\u00012\b\u0010\u0083\u0001\u001a\u00030\u0082\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u009b\u0001\u0010\u0085\u0001\"\u0006\b\u009c\u0001\u0010\u0087\u0001R,\u0010 \u0001\u001a\u00030\u0082\u00012\b\u0010\u0083\u0001\u001a\u00030\u0082\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u009e\u0001\u0010\u0085\u0001\"\u0006\b\u009f\u0001\u0010\u0087\u0001R,\u0010£\u0001\u001a\u00030\u0082\u00012\b\u0010\u0083\u0001\u001a\u00030\u0082\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b¡\u0001\u0010\u0085\u0001\"\u0006\b¢\u0001\u0010\u0087\u0001R,\u0010¦\u0001\u001a\u00030\u0082\u00012\b\u0010\u0083\u0001\u001a\u00030\u0082\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b¤\u0001\u0010\u0085\u0001\"\u0006\b¥\u0001\u0010\u0087\u0001R,\u0010©\u0001\u001a\u00030\u0082\u00012\b\u0010\u0083\u0001\u001a\u00030\u0082\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b§\u0001\u0010\u0085\u0001\"\u0006\b¨\u0001\u0010\u0087\u0001R,\u0010¯\u0001\u001a\u00030ª\u00012\b\u0010\u0083\u0001\u001a\u00030ª\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b«\u0001\u0010¬\u0001\"\u0006\b\u00ad\u0001\u0010®\u0001R,\u0010²\u0001\u001a\u00030\u0082\u00012\b\u0010\u0083\u0001\u001a\u00030\u0082\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b°\u0001\u0010\u0085\u0001\"\u0006\b±\u0001\u0010\u0087\u0001R,\u0010¸\u0001\u001a\u00030³\u00012\b\u0010\u0083\u0001\u001a\u00030³\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b´\u0001\u0010µ\u0001\"\u0006\b¶\u0001\u0010·\u0001R0\u0010¾\u0001\u001a\u0005\u0018\u00010¹\u00012\n\u0010\u0083\u0001\u001a\u0005\u0018\u00010¹\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bº\u0001\u0010»\u0001\"\u0006\b¼\u0001\u0010½\u0001R9\u0010Ç\u0001\u001a\u0005\u0018\u00010¿\u00012\n\u0010À\u0001\u001a\u0005\u0018\u00010¿\u00018F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\bÁ\u0001\u0010Â\u0001\"\u0006\bÃ\u0001\u0010Ä\u0001*\u0006\bÅ\u0001\u0010Æ\u0001R3\u0010Í\u0001\u001a\u00020(2\u0007\u0010À\u0001\u001a\u00020(8F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\bÈ\u0001\u0010É\u0001\"\u0006\bÊ\u0001\u0010Ë\u0001*\u0006\bÌ\u0001\u0010Æ\u0001R,\u0010Ð\u0001\u001a\u00030\u0082\u00012\b\u0010\u0083\u0001\u001a\u00030\u0082\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÎ\u0001\u0010\u0085\u0001\"\u0006\bÏ\u0001\u0010\u0087\u0001R\u0015\u0010Ô\u0001\u001a\u00030Ñ\u00018F¢\u0006\b\u001a\u0006\bÒ\u0001\u0010Ó\u0001R,\u0010×\u0001\u001a\u00030\u0082\u00012\b\u0010\u0083\u0001\u001a\u00030\u0082\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÕ\u0001\u0010\u0085\u0001\"\u0006\bÖ\u0001\u0010\u0087\u0001R.\u0010Ü\u0001\u001a\u0004\u0018\u00010Q2\t\u0010\u0083\u0001\u001a\u0004\u0018\u00010Q8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bØ\u0001\u0010Ù\u0001\"\u0006\bÚ\u0001\u0010Û\u0001R.\u0010ß\u0001\u001a\u0004\u0018\u00010Q2\t\u0010\u0083\u0001\u001a\u0004\u0018\u00010Q8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÝ\u0001\u0010Ù\u0001\"\u0006\bÞ\u0001\u0010Û\u0001R.\u0010â\u0001\u001a\u0004\u0018\u00010Q2\t\u0010\u0083\u0001\u001a\u0004\u0018\u00010Q8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bà\u0001\u0010Ù\u0001\"\u0006\bá\u0001\u0010Û\u0001R.\u0010å\u0001\u001a\u0004\u0018\u00010Q2\t\u0010\u0083\u0001\u001a\u0004\u0018\u00010Q8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bã\u0001\u0010Ù\u0001\"\u0006\bä\u0001\u0010Û\u0001R,\u0010è\u0001\u001a\u00030\u0082\u00012\b\u0010\u0083\u0001\u001a\u00030\u0082\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bæ\u0001\u0010\u0085\u0001\"\u0006\bç\u0001\u0010\u0087\u0001R0\u0010î\u0001\u001a\u0005\u0018\u00010é\u00012\n\u0010\u0083\u0001\u001a\u0005\u0018\u00010é\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bê\u0001\u0010ë\u0001\"\u0006\bì\u0001\u0010í\u0001R,\u0010ñ\u0001\u001a\u00030\u0082\u00012\b\u0010\u0083\u0001\u001a\u00030\u0082\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bï\u0001\u0010\u0085\u0001\"\u0006\bð\u0001\u0010\u0087\u0001¨\u0006ú\u0001"}, d2 = {"Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountView;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Lcom/scandit/datacapture/barcode/count/capture/BarcodeCount;", "barcodeCount", "Lcom/scandit/datacapture/barcode/internal/module/count/ui/BarcodeCountViewLayerManager;", "layerManager", "Lcom/scandit/datacapture/barcode/internal/module/count/ui/viewholders/BarcodeCountDataCaptureViewHolder;", "dataCaptureViewWrapper", "Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlay;", "overlay", "Lcom/scandit/datacapture/barcode/internal/module/count/ui/viewholders/BarcodeCountViewUiLayoutHelper;", "layoutHelper", "Lcom/scandit/datacapture/barcode/internal/module/count/ui/handlers/BarcodeCountUiPresenter;", "uiHandler", "Lcom/scandit/datacapture/barcode/internal/module/count/ui/handlers/BarcodeCountBrushHandler;", "brushHandler", "Lcom/scandit/datacapture/barcode/internal/module/count/ui/barcodeindicator/BarcodeIndicatorPresenter;", "indicatorPresenter", "Lcom/scandit/datacapture/barcode/internal/module/count/ui/mode/BarcodeCountInternalModePresenter;", "internalModePresenter", "Lcom/scandit/datacapture/barcode/internal/module/count/ui/mode/BarcodeCountInternalMode;", "internalMode", "Lcom/scandit/datacapture/barcode/internal/module/count/ui/handlers/BarcodeCountCameraHandler;", "cameraHandler", "Lcom/scandit/datacapture/core/internal/sdk/common/async/MainThreadHelper;", "mainThreadHelper", "<init>", "(Landroid/content/Context;Lcom/scandit/datacapture/barcode/count/capture/BarcodeCount;Lcom/scandit/datacapture/barcode/internal/module/count/ui/BarcodeCountViewLayerManager;Lcom/scandit/datacapture/barcode/internal/module/count/ui/viewholders/BarcodeCountDataCaptureViewHolder;Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlay;Lcom/scandit/datacapture/barcode/internal/module/count/ui/viewholders/BarcodeCountViewUiLayoutHelper;Lcom/scandit/datacapture/barcode/internal/module/count/ui/handlers/BarcodeCountUiPresenter;Lcom/scandit/datacapture/barcode/internal/module/count/ui/handlers/BarcodeCountBrushHandler;Lcom/scandit/datacapture/barcode/internal/module/count/ui/barcodeindicator/BarcodeIndicatorPresenter;Lcom/scandit/datacapture/barcode/internal/module/count/ui/mode/BarcodeCountInternalModePresenter;Lcom/scandit/datacapture/barcode/internal/module/count/ui/mode/BarcodeCountInternalMode;Lcom/scandit/datacapture/barcode/internal/module/count/ui/handlers/BarcodeCountCameraHandler;Lcom/scandit/datacapture/core/internal/sdk/common/async/MainThreadHelper;)V", "Lcom/scandit/datacapture/barcode/internal/module/count/ui/toolbar/BarcodeCountToolbarView;", "getToolbar$scandit_barcode_capture", "()Lcom/scandit/datacapture/barcode/internal/module/count/ui/toolbar/BarcodeCountToolbarView;", "getToolbar", "", "onAttachedToWindow", "()V", "disableScanningAndResetBarcodeIndicators$scandit_barcode_capture", "disableScanningAndResetBarcodeIndicators", "onDetachedFromWindow", "", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "", "text", "setClearHighlightsButtonText", "(Ljava/lang/String;)V", "getClearHighlightsButtonText", "()Ljava/lang/String;", "setTextForScreenCleanedUpHint", "getTextForScreenCleanedUpHint", "setExitButtonText", "getExitButtonText", "setClearHighlightsButtonContentDescription", "getClearHighlightsButtonContentDescription", "setExitButtonContentDescription", "getExitButtonContentDescription", "setFloatingShutterButtonContentDescription", "getFloatingShutterButtonContentDescription", "setListButtonContentDescription", "getListButtonContentDescription", "setSingleScanButtonContentDescription", "getSingleScanButtonContentDescription", "setShutterButtonContentDescription", "getShutterButtonContentDescription", "setStatusModeButtonContentDescription", "getStatusModeButtonContentDescription", "Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountToolbarSettings;", "settings", "setToolbarSettings", "(Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountToolbarSettings;)V", "Lcom/scandit/datacapture/barcode/count/ui/view/status/BarcodeCountStatusProvider;", "provider", "setStatusProvider", "(Lcom/scandit/datacapture/barcode/count/ui/view/status/BarcodeCountStatusProvider;)V", "Lcom/scandit/datacapture/barcode/batch/data/TrackedBarcode;", "barcode", "Lcom/scandit/datacapture/core/ui/style/Brush;", "brush", "setBrushForRecognizedBarcode", "(Lcom/scandit/datacapture/barcode/batch/data/TrackedBarcode;Lcom/scandit/datacapture/core/ui/style/Brush;)V", "setBrushForRecognizedBarcodeNotInList", "setBrushForAcceptedBarcode", "setBrushForRejectedBarcode", BarcodeCountViewDeserializer.KEY_HW_TRIGGER_KEY_CODE, "enableHardwareTrigger", "(Ljava/lang/Integer;)V", "setTextForBarcodesNotInListDetectedHint", "getTextForBarcodesNotInListDetectedHint", "setTextForTapShutterToScanHint", "getTextForTapShutterToScanHint", "setTextForScanningHint", "getTextForScanningHint", "setTextForMoveCloserAndRescanHint", "getTextForMoveCloserAndRescanHint", "setTextForMoveFurtherAndRescanHint", "getTextForMoveFurtherAndRescanHint", "setTextForTapToUncountHint", "getTextForTapToUncountHint", "setTextForClusteringGestureHint", "getTextForClusteringGestureHint", "clearHighlights", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/ProfilingOverlay;", "_setProfilingOverlay", "(Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/ProfilingOverlay;)V", "Lcom/scandit/datacapture/barcode/internal/module/count/ui/BarcodeCountViewSettings;", "m", "Lcom/scandit/datacapture/barcode/internal/module/count/ui/BarcodeCountViewSettings;", "getViewSettings$scandit_barcode_capture", "()Lcom/scandit/datacapture/barcode/internal/module/count/ui/BarcodeCountViewSettings;", "getViewSettings$scandit_barcode_capture$annotations", "viewSettings", "Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountViewListener;", "n", "Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountViewListener;", "getListener", "()Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountViewListener;", "setListener", "(Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountViewListener;)V", "listener", "p", "Lcom/scandit/datacapture/barcode/count/ui/view/status/BarcodeCountStatusProvider;", "getStatusProvider$scandit_barcode_capture", "()Lcom/scandit/datacapture/barcode/count/ui/view/status/BarcodeCountStatusProvider;", "setStatusProvider$scandit_barcode_capture", "statusProvider", "", "value", "getShouldDisableModeOnExitButtonTapped", "()Z", "setShouldDisableModeOnExitButtonTapped", "(Z)V", "shouldDisableModeOnExitButtonTapped", "getShouldShowClearHighlightsButton", "setShouldShowClearHighlightsButton", "shouldShowClearHighlightsButton", "getShouldShowExitButton", "setShouldShowExitButton", "shouldShowExitButton", "getShouldShowFloatingShutterButton", "setShouldShowFloatingShutterButton", "shouldShowFloatingShutterButton", "getShouldShowListButton", "setShouldShowListButton", "shouldShowListButton", "getShouldShowShutterButton", "setShouldShowShutterButton", "shouldShowShutterButton", "getShouldShowSingleScanButton", "setShouldShowSingleScanButton", "shouldShowSingleScanButton", "getShouldShowStatusModeButton", "setShouldShowStatusModeButton", "shouldShowStatusModeButton", "getShouldShowToolbar", "setShouldShowToolbar", "shouldShowToolbar", "getShouldShowUserGuidanceView", "setShouldShowUserGuidanceView", "shouldShowUserGuidanceView", "getShouldShowListProgressBar", "setShouldShowListProgressBar", "shouldShowListProgressBar", "getShouldShowTorchControl", "setShouldShowTorchControl", "shouldShowTorchControl", "Lcom/scandit/datacapture/core/common/geometry/Anchor;", "getTorchControlPosition", "()Lcom/scandit/datacapture/core/common/geometry/Anchor;", "setTorchControlPosition", "(Lcom/scandit/datacapture/core/common/geometry/Anchor;)V", "torchControlPosition", "getTapToUncountEnabled", "setTapToUncountEnabled", "tapToUncountEnabled", "Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountNotInListActionSettings;", "getBarcodeNotInListActionSettings", "()Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountNotInListActionSettings;", "setBarcodeNotInListActionSettings", "(Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountNotInListActionSettings;)V", "barcodeNotInListActionSettings", "Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountViewUiListener;", "getUiListener", "()Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountViewUiListener;", "setUiListener", "(Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountViewUiListener;)V", "uiListener", "Lcom/scandit/datacapture/barcode/count/ui/BarcodeCountViewInternalUiListener;", "<set-?>", "get_internalUiListener", "()Lcom/scandit/datacapture/barcode/count/ui/BarcodeCountViewInternalUiListener;", "set_internalUiListener", "(Lcom/scandit/datacapture/barcode/count/ui/BarcodeCountViewInternalUiListener;)V", "get_internalUiListener$delegate", "(Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountView;)Ljava/lang/Object;", "_internalUiListener", "get_scanningDelayMs", "()I", "set_scanningDelayMs", "(I)V", "get_scanningDelayMs$delegate", "_scanningDelayMs", "get_forceAlignCameraPreviewToBottomInPortrait", "set_forceAlignCameraPreviewToBottomInPortrait", "_forceAlignCameraPreviewToBottomInPortrait", "Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountViewStyle;", "getStyle", "()Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountViewStyle;", "style", "getShouldShowScanAreaGuides", "setShouldShowScanAreaGuides", "shouldShowScanAreaGuides", "getRecognizedBrush", "()Lcom/scandit/datacapture/core/ui/style/Brush;", "setRecognizedBrush", "(Lcom/scandit/datacapture/core/ui/style/Brush;)V", "recognizedBrush", "getNotInListBrush", "setNotInListBrush", "notInListBrush", "getAcceptedBrush", "setAcceptedBrush", "acceptedBrush", "getRejectedBrush", "setRejectedBrush", "rejectedBrush", "getShouldShowHints", "setShouldShowHints", "shouldShowHints", "Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightSettings;", "getFilterSettings", "()Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightSettings;", "setFilterSettings", "(Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightSettings;)V", "filterSettings", "getShouldShowStatusIconsOnScan", "setShouldShowStatusIconsOnScan", "shouldShowStatusIconsOnScan", "Companion", "com/scandit/datacapture/barcode/count/ui/view/a", "com/scandit/datacapture/barcode/count/ui/view/b", "com/scandit/datacapture/barcode/count/ui/view/c", "com/scandit/datacapture/barcode/count/ui/view/d", "com/scandit/datacapture/barcode/count/ui/view/e", "com/scandit/datacapture/barcode/count/ui/view/g", "com/scandit/datacapture/barcode/count/ui/view/i", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class BarcodeCountView extends RelativeLayout {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeCountViewLayerManager f120831a;

    /* renamed from: b, reason: collision with root package name */
    private final BarcodeCountDataCaptureViewHolder f120832b;

    /* renamed from: c, reason: collision with root package name */
    private final BarcodeCountBasicOverlay f120833c;

    /* renamed from: d, reason: collision with root package name */
    private final BarcodeCountViewUiLayoutHelper f120834d;

    /* renamed from: e, reason: collision with root package name */
    private final BarcodeCountUiPresenter f120835e;

    /* renamed from: f, reason: collision with root package name */
    private final BarcodeCountBrushHandler f120836f;

    /* renamed from: g, reason: collision with root package name */
    private final BarcodeIndicatorPresenter f120837g;

    /* renamed from: h, reason: collision with root package name */
    private final BarcodeCountInternalModePresenter f120838h;

    /* renamed from: i, reason: collision with root package name */
    private final BarcodeCountCameraHandler f120839i;

    /* renamed from: j, reason: collision with root package name */
    private final MainThreadHelper f120840j;

    /* renamed from: k, reason: collision with root package name */
    private final Handler f120841k;

    /* renamed from: l, reason: collision with root package name */
    private final WeakReference f120842l;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final BarcodeCountViewSettings viewSettings;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private BarcodeCountViewListener listener;

    /* renamed from: o, reason: collision with root package name */
    private boolean f120845o;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private BarcodeCountStatusProvider statusProvider;

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\u0004J)\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u000f\u0010\u0013J'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0016J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u000f\u0010\u0017J9\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ7\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001cR\u001a\u0010\"\u001a\u00020\u001d8FX\u0087\u0004¢\u0006\f\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020#8\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountView$Companion;", "", "Lcom/scandit/datacapture/core/ui/style/Brush;", "defaultRecognizedBrush", "()Lcom/scandit/datacapture/core/ui/style/Brush;", "defaultNotInListBrush", "defaultAcceptedBrush", "defaultRejectedBrush", "Landroid/content/Context;", "context", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "Lcom/scandit/datacapture/barcode/count/capture/BarcodeCount;", "mode", "Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountView;", "newInstance", "(Landroid/content/Context;Lcom/scandit/datacapture/core/capture/DataCaptureContext;Lcom/scandit/datacapture/barcode/count/capture/BarcodeCount;)Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountView;", "Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountViewStyle;", "style", "(Landroid/content/Context;Lcom/scandit/datacapture/core/capture/DataCaptureContext;Lcom/scandit/datacapture/barcode/count/capture/BarcodeCount;Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountViewStyle;)Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountView;", "Lcom/scandit/datacapture/core/ui/DataCaptureView;", "dataCaptureView", "(Landroid/content/Context;Lcom/scandit/datacapture/core/ui/DataCaptureView;Lcom/scandit/datacapture/barcode/count/capture/BarcodeCount;)Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountView;", "(Landroid/content/Context;Lcom/scandit/datacapture/core/ui/DataCaptureView;Lcom/scandit/datacapture/barcode/count/capture/BarcodeCount;Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountViewStyle;)Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountView;", "Lcom/scandit/datacapture/barcode/count/capture/map/BarcodeCountMappingFlowSettings;", "mappingFlowSettings", "newInstanceForMapping", "(Landroid/content/Context;Lcom/scandit/datacapture/core/capture/DataCaptureContext;Lcom/scandit/datacapture/barcode/count/capture/BarcodeCount;Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountViewStyle;Lcom/scandit/datacapture/barcode/count/capture/map/BarcodeCountMappingFlowSettings;)Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountView;", "(Landroid/content/Context;Lcom/scandit/datacapture/core/ui/DataCaptureView;Lcom/scandit/datacapture/barcode/count/capture/BarcodeCount;Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountViewStyle;Lcom/scandit/datacapture/barcode/count/capture/map/BarcodeCountMappingFlowSettings;)Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountView;", "", "getHardwareTriggerSupported", "()Z", "getHardwareTriggerSupported$annotations", "()V", "hardwareTriggerSupported", "", "LIST_COMPLETE_NOTIFICATION_DELAY_MS", "J", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        @JvmStatic
        public static /* synthetic */ void getHardwareTriggerSupported$annotations() {
        }

        @JvmStatic
        public final BarcodeCountView newInstance(Context context, DataCaptureContext dataCaptureContext, BarcodeCount mode) {
            Intrinsics.j(context, "context");
            Intrinsics.j(mode, "mode");
            return newInstance(context, dataCaptureContext, mode, BarcodeCountViewStyle.ICON);
        }

        @JvmStatic
        public final BarcodeCountView newInstanceForMapping(Context context, DataCaptureView dataCaptureView, BarcodeCount mode, BarcodeCountViewStyle style, BarcodeCountMappingFlowSettings mappingFlowSettings) {
            Intrinsics.j(context, "context");
            Intrinsics.j(dataCaptureView, "dataCaptureView");
            Intrinsics.j(mode, "mode");
            Intrinsics.j(style, "style");
            Intrinsics.j(mappingFlowSettings, "mappingFlowSettings");
            return com.scandit.datacapture.barcode.internal.module.count.ui.f.a(context, dataCaptureView, mode, style, new com.scandit.datacapture.barcode.internal.module.count.ui.mode.b(mappingFlowSettings, com.scandit.datacapture.barcode.internal.module.count.ui.mappingflow.a.f121704a));
        }

        @JvmStatic
        public final Brush defaultAcceptedBrush() {
            return BarcodeCountBasicOverlay.INSTANCE.defaultAcceptedNotInListBrush();
        }

        @JvmStatic
        public final Brush defaultNotInListBrush() {
            return BarcodeCountBasicOverlay.INSTANCE.defaultNotInListBrush();
        }

        @JvmStatic
        public final Brush defaultRecognizedBrush() {
            return BarcodeCountBasicOverlay.INSTANCE.defaultRecognizedBrush();
        }

        @JvmStatic
        public final Brush defaultRejectedBrush() {
            return BarcodeCountBasicOverlay.INSTANCE.defaultRejectedNotInListBrush();
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final boolean getHardwareTriggerSupported() {
            return HardwareButtonHelperKt.isHardwareTriggerSupported();
        }

        @JvmStatic
        public final BarcodeCountView newInstance(Context context, DataCaptureView dataCaptureView, BarcodeCount mode) {
            Intrinsics.j(context, "context");
            Intrinsics.j(dataCaptureView, "dataCaptureView");
            Intrinsics.j(mode, "mode");
            return newInstance(context, dataCaptureView, mode, BarcodeCountViewStyle.ICON);
        }

        @JvmStatic
        public final BarcodeCountView newInstance(Context context, DataCaptureView dataCaptureView, BarcodeCount mode, BarcodeCountViewStyle style) {
            Intrinsics.j(context, "context");
            Intrinsics.j(dataCaptureView, "dataCaptureView");
            Intrinsics.j(mode, "mode");
            Intrinsics.j(style, "style");
            return com.scandit.datacapture.barcode.internal.module.count.ui.f.a(context, dataCaptureView, mode, style, com.scandit.datacapture.barcode.internal.module.count.ui.mode.a.f121746a);
        }

        @JvmStatic
        public final BarcodeCountView newInstanceForMapping(Context context, DataCaptureContext dataCaptureContext, BarcodeCount mode, BarcodeCountViewStyle style, BarcodeCountMappingFlowSettings mappingFlowSettings) {
            Intrinsics.j(context, "context");
            Intrinsics.j(mode, "mode");
            Intrinsics.j(style, "style");
            Intrinsics.j(mappingFlowSettings, "mappingFlowSettings");
            DataCaptureView dataCaptureViewNewInstance = DataCaptureView.INSTANCE.newInstance(context, dataCaptureContext);
            dataCaptureViewNewInstance.setLogoStyle(LogoStyle.MINIMAL);
            dataCaptureViewNewInstance.setLogoAnchor(Anchor.BOTTOM_LEFT);
            return com.scandit.datacapture.barcode.internal.module.count.ui.f.a(context, dataCaptureViewNewInstance, mode, style, new com.scandit.datacapture.barcode.internal.module.count.ui.mode.b(mappingFlowSettings, com.scandit.datacapture.barcode.internal.module.count.ui.mappingflow.a.f121704a));
        }

        @JvmStatic
        public final BarcodeCountView newInstance(Context context, DataCaptureContext dataCaptureContext, BarcodeCount mode, BarcodeCountViewStyle style) {
            Intrinsics.j(context, "context");
            Intrinsics.j(mode, "mode");
            Intrinsics.j(style, "style");
            DataCaptureView dataCaptureViewNewInstance = DataCaptureView.INSTANCE.newInstance(context, dataCaptureContext);
            dataCaptureViewNewInstance.setLogoStyle(LogoStyle.MINIMAL);
            dataCaptureViewNewInstance.setLogoAnchor(Anchor.BOTTOM_LEFT);
            return newInstance(context, dataCaptureViewNewInstance, mode, style);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[BarcodeCountScreenRatioForUi.values().length];
            try {
                iArr[BarcodeCountScreenRatioForUi.LARGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[HardwareKeyEvent.values().length];
            try {
                iArr2[HardwareKeyEvent.CLICK.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public /* synthetic */ BarcodeCountView(Context context, BarcodeCount barcodeCount, BarcodeCountViewLayerManager barcodeCountViewLayerManager, BarcodeCountDataCaptureViewHolder barcodeCountDataCaptureViewHolder, BarcodeCountBasicOverlay barcodeCountBasicOverlay, BarcodeCountViewUiLayoutHelper barcodeCountViewUiLayoutHelper, BarcodeCountUiPresenter barcodeCountUiPresenter, BarcodeCountBrushHandler barcodeCountBrushHandler, BarcodeIndicatorPresenter barcodeIndicatorPresenter, BarcodeCountInternalModePresenter barcodeCountInternalModePresenter, BarcodeCountInternalMode barcodeCountInternalMode, BarcodeCountCameraHandler barcodeCountCameraHandler, MainThreadHelper mainThreadHelper, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        BarcodeCount barcodeCount2;
        BarcodeCountCameraHandler sVar;
        BarcodeCountInternalMode barcodeCountInternalMode2 = (i10 & 1024) != 0 ? com.scandit.datacapture.barcode.internal.module.count.ui.mode.a.f121746a : barcodeCountInternalMode;
        if ((i10 & RecyclerView.m.FLAG_MOVED) != 0) {
            barcodeCount2 = barcodeCount;
            sVar = new s(barcodeCount2);
        } else {
            barcodeCount2 = barcodeCount;
            sVar = barcodeCountCameraHandler;
        }
        this(context, barcodeCount2, barcodeCountViewLayerManager, barcodeCountDataCaptureViewHolder, barcodeCountBasicOverlay, barcodeCountViewUiLayoutHelper, barcodeCountUiPresenter, barcodeCountBrushHandler, barcodeIndicatorPresenter, barcodeCountInternalModePresenter, barcodeCountInternalMode2, sVar, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? new MainThreadHelper() : mainThreadHelper);
    }

    private final RelativeLayout.LayoutParams a(Size size) {
        BarcodeCountScreenRatioForUi barcodeCountScreenRatioForUiI = this.f120834d.i();
        Context context = getContext();
        Intrinsics.i(context, "getContext(...)");
        if (com.scandit.datacapture.barcode.internal.module.extensions.b.a(context)) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(size.getWidth(), -1);
            if (WhenMappings.$EnumSwitchMapping$0[barcodeCountScreenRatioForUiI.ordinal()] == 1) {
                layoutParams.addRule(13);
                return layoutParams;
            }
            layoutParams.addRule(20);
            return layoutParams;
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, size.getHeight());
        if (get_forceAlignCameraPreviewToBottomInPortrait()) {
            layoutParams2.addRule(12);
            return layoutParams2;
        }
        if (barcodeCountScreenRatioForUiI == BarcodeCountScreenRatioForUi.LARGE) {
            layoutParams2.addRule(13);
            return layoutParams2;
        }
        layoutParams2.addRule(20);
        return layoutParams2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(BarcodeCountView this$0) {
        Intrinsics.j(this$0, "this$0");
        this$0.d();
        this$0.f120840j.runOnMainThread(new o(this$0));
    }

    @JvmStatic
    public static final Brush defaultAcceptedBrush() {
        return INSTANCE.defaultAcceptedBrush();
    }

    @JvmStatic
    public static final Brush defaultNotInListBrush() {
        return INSTANCE.defaultNotInListBrush();
    }

    @JvmStatic
    public static final Brush defaultRecognizedBrush() {
        return INSTANCE.defaultRecognizedBrush();
    }

    @JvmStatic
    public static final Brush defaultRejectedBrush() {
        return INSTANCE.defaultRejectedBrush();
    }

    public static final boolean getHardwareTriggerSupported() {
        return INSTANCE.getHardwareTriggerSupported();
    }

    public static /* synthetic */ void getViewSettings$scandit_barcode_capture$annotations() {
    }

    @JvmStatic
    public static final BarcodeCountView newInstance(Context context, DataCaptureContext dataCaptureContext, BarcodeCount barcodeCount) {
        return INSTANCE.newInstance(context, dataCaptureContext, barcodeCount);
    }

    @JvmStatic
    public static final BarcodeCountView newInstanceForMapping(Context context, DataCaptureContext dataCaptureContext, BarcodeCount barcodeCount, BarcodeCountViewStyle barcodeCountViewStyle, BarcodeCountMappingFlowSettings barcodeCountMappingFlowSettings) {
        return INSTANCE.newInstanceForMapping(context, dataCaptureContext, barcodeCount, barcodeCountViewStyle, barcodeCountMappingFlowSettings);
    }

    public static final void access$hideActionPopup(BarcodeCountView barcodeCountView, NativeTrackedBarcode nativeTrackedBarcode) {
        if (barcodeCountView.f120837g.b() || nativeTrackedBarcode == null) {
            return;
        }
        barcodeCountView.f120835e.k();
        barcodeCountView.f120837g.a(new TrackedBarcode(nativeTrackedBarcode));
    }

    public static final void access$onBarcodeStatusesLoading(BarcodeCountView barcodeCountView) {
        barcodeCountView.f120837g.b(false, true);
        barcodeCountView.f120837g.a(true, true);
    }

    public static final void access$onToolbarColorSchemeChanged(BarcodeCountView barcodeCountView, NativeBarcodeCountBasicOverlayColorScheme nativeBarcodeCountBasicOverlayColorScheme) {
        barcodeCountView.f120837g.a(nativeBarcodeCountBasicOverlayColorScheme);
        barcodeCountView.f120837g.a(barcodeCountView.viewSettings);
    }

    public static final void access$setListUiEnabled(BarcodeCountView barcodeCountView, boolean z10, int i10) {
        barcodeCountView.f120845o = z10;
        barcodeCountView.f120835e.b(z10);
        BarcodeCountUiPresenter barcodeCountUiPresenter = barcodeCountView.f120835e;
        Context context = barcodeCountView.getContext();
        Intrinsics.i(context, "getContext(...)");
        barcodeCountUiPresenter.a(z10, com.scandit.datacapture.barcode.internal.module.extensions.b.a(context));
        barcodeCountView.f120837g.a(z10);
        if (barcodeCountView.isAttachedToWindow()) {
            barcodeCountView.f120840j.runOnMainThread(new o(barcodeCountView));
            barcodeCountView.f120840j.runOnMainThread(new n(barcodeCountView, i10));
        }
    }

    public static final void access$showActionPopup(BarcodeCountView barcodeCountView, NativeTrackedBarcode nativeTrackedBarcode, NativeBarcodeCountNotInListStatus nativeBarcodeCountNotInListStatus) {
        if (barcodeCountView.f120837g.b() || nativeTrackedBarcode == null || nativeBarcodeCountNotInListStatus == null) {
            return;
        }
        barcodeCountView.f120835e.h();
        barcodeCountView.f120837g.a(new TrackedBarcode(nativeTrackedBarcode), nativeBarcodeCountNotInListStatus);
    }

    public static final void access$updateModeFeedback(BarcodeCountView barcodeCountView) {
        BarcodeCount barcodeCount = (BarcodeCount) barcodeCountView.f120842l.get();
        if (barcodeCount != null) {
            barcodeCountView.f120835e.a(barcodeCount);
        }
    }

    private final void c() {
        post(new Runnable() { // from class: com.scandit.datacapture.barcode.count.ui.view.p
            @Override // java.lang.Runnable
            public final void run() {
                BarcodeCountView.b(this.f120865a);
            }
        });
    }

    private final void d() {
        Size sizeA = a();
        BarcodeCountUiPresenter barcodeCountUiPresenter = this.f120835e;
        Configuration configuration = getContext().getResources().getConfiguration();
        barcodeCountUiPresenter.a(new Size(PixelExtensionsKt.pxFromDp$default(configuration.screenWidthDp, (Context) null, 1, (Object) null), PixelExtensionsKt.pxFromDp$default(configuration.screenHeightDp, (Context) null, 1, (Object) null)), sizeA);
        RelativeLayout.LayoutParams layoutParamsA = a(sizeA);
        this.f120832b.a(layoutParamsA);
        this.f120831a.a(layoutParamsA);
        Context context = getContext();
        Intrinsics.i(context, "getContext(...)");
        if (com.scandit.datacapture.barcode.internal.module.extensions.b.a(context) || this.f120834d.i() == BarcodeCountScreenRatioForUi.SMALL || get_forceAlignCameraPreviewToBottomInPortrait()) {
            this.f120831a.c().setLayoutParams(a(sizeA));
        }
        BarcodeCountUiPresenter barcodeCountUiPresenter2 = this.f120835e;
        boolean z10 = this.f120845o;
        Context context2 = getContext();
        Intrinsics.i(context2, "getContext(...)");
        barcodeCountUiPresenter2.a(z10, com.scandit.datacapture.barcode.internal.module.extensions.b.a(context2));
    }

    private final void e() {
        this.f120835e.a(this.viewSettings);
        this.f120840j.runOnMainThread(new o(this));
    }

    @JvmStatic
    public static final BarcodeCountView newInstance(Context context, DataCaptureContext dataCaptureContext, BarcodeCount barcodeCount, BarcodeCountViewStyle barcodeCountViewStyle) {
        return INSTANCE.newInstance(context, dataCaptureContext, barcodeCount, barcodeCountViewStyle);
    }

    @JvmStatic
    public static final BarcodeCountView newInstanceForMapping(Context context, DataCaptureView dataCaptureView, BarcodeCount barcodeCount, BarcodeCountViewStyle barcodeCountViewStyle, BarcodeCountMappingFlowSettings barcodeCountMappingFlowSettings) {
        return INSTANCE.newInstanceForMapping(context, dataCaptureView, barcodeCount, barcodeCountViewStyle, barcodeCountMappingFlowSettings);
    }

    public final void _setProfilingOverlay(ProfilingOverlay overlay) {
        Intrinsics.j(overlay, "overlay");
        this.f120833c._setProfilingOverlay(overlay);
    }

    public final void clearHighlights() {
        this.f120833c.clearHighlights();
    }

    public final void disableScanningAndResetBarcodeIndicators$scandit_barcode_capture() {
        BarcodeCount barcodeCount = (BarcodeCount) this.f120842l.get();
        if (barcodeCount != null) {
            barcodeCount.endScanningPhase$scandit_barcode_capture(new l(this));
        }
    }

    public final void enableHardwareTrigger(Integer hardwareTriggerKeyCode) {
        HardwareButtonHelperKt.setupHardwareTrigger(this, hardwareTriggerKeyCode, new m(this));
    }

    public final Brush getAcceptedBrush() {
        return this.viewSettings.a();
    }

    public final BarcodeCountNotInListActionSettings getBarcodeNotInListActionSettings() {
        return this.viewSettings.b();
    }

    public final String getClearHighlightsButtonContentDescription() {
        return this.viewSettings.c();
    }

    public final String getClearHighlightsButtonText() {
        return this.viewSettings.d();
    }

    public final String getExitButtonContentDescription() {
        return this.viewSettings.e();
    }

    public final String getExitButtonText() {
        return this.viewSettings.f();
    }

    public final BarcodeFilterHighlightSettings getFilterSettings() {
        return this.viewSettings.g();
    }

    public final String getFloatingShutterButtonContentDescription() {
        return this.viewSettings.h();
    }

    public final String getListButtonContentDescription() {
        return this.viewSettings.i();
    }

    public final BarcodeCountViewListener getListener() {
        return this.listener;
    }

    public final Brush getNotInListBrush() {
        return this.viewSettings.j();
    }

    public final Brush getRecognizedBrush() {
        return this.viewSettings.k();
    }

    public final Brush getRejectedBrush() {
        return this.viewSettings.l();
    }

    public final boolean getShouldDisableModeOnExitButtonTapped() {
        return this.viewSettings.m();
    }

    public final boolean getShouldShowClearHighlightsButton() {
        return this.viewSettings.n();
    }

    public final boolean getShouldShowExitButton() {
        return this.viewSettings.o();
    }

    public final boolean getShouldShowFloatingShutterButton() {
        return this.viewSettings.p();
    }

    public final boolean getShouldShowHints() {
        return this.viewSettings.q();
    }

    public final boolean getShouldShowListButton() {
        return this.viewSettings.r();
    }

    public final boolean getShouldShowListProgressBar() {
        return this.viewSettings.s();
    }

    public final boolean getShouldShowScanAreaGuides() {
        return this.viewSettings.t();
    }

    public final boolean getShouldShowShutterButton() {
        return this.viewSettings.u();
    }

    public final boolean getShouldShowSingleScanButton() {
        return this.viewSettings.v();
    }

    public final boolean getShouldShowStatusIconsOnScan() {
        return this.viewSettings.w();
    }

    public final boolean getShouldShowStatusModeButton() {
        return this.viewSettings.x();
    }

    public final boolean getShouldShowToolbar() {
        return this.viewSettings.y();
    }

    public final boolean getShouldShowTorchControl() {
        return this.viewSettings.z();
    }

    public final boolean getShouldShowUserGuidanceView() {
        return this.viewSettings.A();
    }

    public final String getShutterButtonContentDescription() {
        return this.viewSettings.B();
    }

    public final String getSingleScanButtonContentDescription() {
        return this.viewSettings.C();
    }

    public final String getStatusModeButtonContentDescription() {
        return this.viewSettings.D();
    }

    /* renamed from: getStatusProvider$scandit_barcode_capture, reason: from getter */
    public final BarcodeCountStatusProvider getStatusProvider() {
        return this.statusProvider;
    }

    public final BarcodeCountViewStyle getStyle() {
        return BarcodeCountViewStyleExtensionKt.toViewStyle(this.f120833c.getStyle());
    }

    public final boolean getTapToUncountEnabled() {
        NativeBarcodeCount nativeBarcodeCount_impl;
        BarcodeCount barcodeCount = (BarcodeCount) this.f120842l.get();
        boolean tapToUncountEnabled = (barcodeCount == null || (nativeBarcodeCount_impl = barcodeCount._impl()) == null) ? BarcodeCountViewDefaults.INSTANCE.getTapToUncountEnabled() : nativeBarcodeCount_impl.isTapToUncountEnabled();
        this.viewSettings.getClass();
        return tapToUncountEnabled;
    }

    public final String getTextForBarcodesNotInListDetectedHint() {
        String strE = this.viewSettings.E();
        return strE == null ? BarcodeCountViewDefaults.INSTANCE.getTextForBarcodesNotInListDetectedHint() : strE;
    }

    public final String getTextForClusteringGestureHint() {
        String strF = this.viewSettings.F();
        return strF == null ? BarcodeCountViewDefaults.INSTANCE.getTextForClusteringGestureHint() : strF;
    }

    public final String getTextForMoveCloserAndRescanHint() {
        String strG = this.viewSettings.G();
        return strG == null ? BarcodeCountViewDefaults.INSTANCE.getTextForMoveCloserAndRescanHint() : strG;
    }

    public final String getTextForMoveFurtherAndRescanHint() {
        String strH = this.viewSettings.H();
        return strH == null ? BarcodeCountViewDefaults.INSTANCE.getTextForMoveFurtherAndRescanHint() : strH;
    }

    public final String getTextForScanningHint() {
        String strI = this.viewSettings.I();
        return strI == null ? BarcodeCountViewDefaults.INSTANCE.getTextForScanningHint() : strI;
    }

    public final String getTextForScreenCleanedUpHint() {
        String strJ = this.viewSettings.J();
        return strJ == null ? BarcodeCountViewDefaults.INSTANCE.getTextForScreenCleanedUpHint() : strJ;
    }

    public final String getTextForTapShutterToScanHint() {
        String strK = this.viewSettings.K();
        return strK == null ? BarcodeCountViewDefaults.INSTANCE.getTextForTapShutterToScanHint() : strK;
    }

    public final String getTextForTapToUncountHint() {
        String strL = this.viewSettings.L();
        return strL == null ? BarcodeCountViewDefaults.INSTANCE.getTextForTapToUncountHint() : strL;
    }

    public final BarcodeCountToolbarView getToolbar$scandit_barcode_capture() {
        return this.f120835e.g();
    }

    public final Anchor getTorchControlPosition() {
        return this.viewSettings.N();
    }

    public final BarcodeCountViewUiListener getUiListener() {
        BarcodeCountBasicOverlayUiListener uiListener = this.f120833c.getUiListener();
        d dVar = uiListener instanceof d ? (d) uiListener : null;
        if (dVar != null) {
            return dVar.f120852a;
        }
        return null;
    }

    /* renamed from: getViewSettings$scandit_barcode_capture, reason: from getter */
    public final BarcodeCountViewSettings getViewSettings() {
        return this.viewSettings;
    }

    public final boolean get_forceAlignCameraPreviewToBottomInPortrait() {
        return this.f120835e.b();
    }

    public final BarcodeCountViewInternalUiListener get_internalUiListener() {
        return this.f120835e.c();
    }

    public final int get_scanningDelayMs() {
        return this.f120835e.j();
    }

    public final void setAcceptedBrush(Brush brush) {
        this.viewSettings.a(brush);
        e();
    }

    public final void setBarcodeNotInListActionSettings(BarcodeCountNotInListActionSettings value) {
        Intrinsics.j(value, "value");
        this.viewSettings.a(value);
        this.f120833c.applyNotInListActionSettings$scandit_barcode_capture(value);
        this.f120837g.a(this.viewSettings);
    }

    public final void setBrushForAcceptedBarcode(TrackedBarcode barcode, Brush brush) {
        Intrinsics.j(barcode, "barcode");
        this.f120836f.b(barcode, brush);
        this.f120837g.b(barcode);
    }

    public final void setBrushForRecognizedBarcode(TrackedBarcode barcode, Brush brush) {
        Intrinsics.j(barcode, "barcode");
        this.f120836f.a(barcode, brush);
        this.f120837g.b(barcode);
    }

    public final void setBrushForRecognizedBarcodeNotInList(TrackedBarcode barcode, Brush brush) {
        Intrinsics.j(barcode, "barcode");
        this.f120836f.d(barcode, brush);
        this.f120837g.b(barcode);
    }

    public final void setBrushForRejectedBarcode(TrackedBarcode barcode, Brush brush) {
        Intrinsics.j(barcode, "barcode");
        this.f120836f.c(barcode, brush);
        this.f120837g.b(barcode);
    }

    public final void setClearHighlightsButtonContentDescription(String text) {
        Intrinsics.j(text, "text");
        this.viewSettings.a(text);
        e();
    }

    public final void setClearHighlightsButtonText(String text) {
        Intrinsics.j(text, "text");
        this.viewSettings.b(text);
        e();
    }

    public final void setExitButtonContentDescription(String text) {
        Intrinsics.j(text, "text");
        this.viewSettings.c(text);
        e();
    }

    public final void setExitButtonText(String text) {
        Intrinsics.j(text, "text");
        this.viewSettings.d(text);
        e();
    }

    public final void setFilterSettings(BarcodeFilterHighlightSettings barcodeFilterHighlightSettings) {
        this.viewSettings.a(barcodeFilterHighlightSettings);
        e();
    }

    public final void setFloatingShutterButtonContentDescription(String text) {
        Intrinsics.j(text, "text");
        this.viewSettings.e(text);
        e();
    }

    public final void setListButtonContentDescription(String text) {
        Intrinsics.j(text, "text");
        this.viewSettings.f(text);
        e();
    }

    public final void setListener(BarcodeCountViewListener barcodeCountViewListener) {
        this.listener = barcodeCountViewListener;
    }

    public final void setNotInListBrush(Brush brush) {
        this.viewSettings.b(brush);
        e();
    }

    public final void setRecognizedBrush(Brush brush) {
        this.viewSettings.c(brush);
        e();
    }

    public final void setRejectedBrush(Brush brush) {
        this.viewSettings.d(brush);
        e();
    }

    public final void setShouldDisableModeOnExitButtonTapped(boolean z10) {
        this.viewSettings.a(z10);
        e();
    }

    public final void setShouldShowClearHighlightsButton(boolean z10) {
        this.viewSettings.b(z10);
        e();
    }

    public final void setShouldShowExitButton(boolean z10) {
        this.viewSettings.c(z10);
        e();
    }

    public final void setShouldShowFloatingShutterButton(boolean z10) {
        this.viewSettings.d(z10);
        e();
    }

    public final void setShouldShowHints(boolean z10) {
        this.viewSettings.e(z10);
        e();
    }

    public final void setShouldShowListButton(boolean z10) {
        this.viewSettings.f(z10);
        e();
    }

    public final void setShouldShowListProgressBar(boolean z10) {
        this.viewSettings.g(z10);
        e();
    }

    public final void setShouldShowScanAreaGuides(boolean z10) {
        this.viewSettings.h(z10);
        e();
    }

    public final void setShouldShowShutterButton(boolean z10) {
        this.viewSettings.i(z10);
        e();
    }

    public final void setShouldShowSingleScanButton(boolean z10) {
        this.viewSettings.j(z10);
        e();
    }

    public final void setShouldShowStatusIconsOnScan(boolean z10) {
        this.viewSettings.k(z10);
        this.f120837g.a(this.viewSettings);
        e();
    }

    public final void setShouldShowStatusModeButton(boolean z10) {
        this.viewSettings.l(z10);
        e();
    }

    public final void setShouldShowToolbar(boolean z10) {
        this.viewSettings.m(z10);
        e();
    }

    public final void setShouldShowTorchControl(boolean z10) {
        this.viewSettings.n(z10);
        e();
    }

    public final void setShouldShowUserGuidanceView(boolean z10) {
        this.viewSettings.o(z10);
        e();
    }

    public final void setShutterButtonContentDescription(String text) {
        Intrinsics.j(text, "text");
        this.viewSettings.g(text);
        e();
    }

    public final void setSingleScanButtonContentDescription(String text) {
        Intrinsics.j(text, "text");
        this.viewSettings.h(text);
        e();
    }

    public final void setStatusModeButtonContentDescription(String text) {
        Intrinsics.j(text, "text");
        this.viewSettings.i(text);
        e();
    }

    public final void setStatusProvider(BarcodeCountStatusProvider provider) {
        Intrinsics.j(provider, "provider");
        BarcodeCount barcodeCount = (BarcodeCount) this.f120842l.get();
        if (barcodeCount != null) {
            barcodeCount.setInternalStatusProvider$scandit_barcode_capture(new InternalBarcodeCountStatusProvider(this));
        }
        this.statusProvider = provider;
    }

    public final void setStatusProvider$scandit_barcode_capture(BarcodeCountStatusProvider barcodeCountStatusProvider) {
        this.statusProvider = barcodeCountStatusProvider;
    }

    public final void setTapToUncountEnabled(boolean z10) {
        BarcodeCount barcodeCount = (BarcodeCount) this.f120842l.get();
        if (barcodeCount != null) {
            barcodeCount._impl().setTapToUncountEnabled(z10);
            this.viewSettings.getClass();
        }
    }

    public final void setTextForBarcodesNotInListDetectedHint(String text) {
        Intrinsics.j(text, "text");
        this.viewSettings.j(text);
        e();
    }

    public final void setTextForClusteringGestureHint(String text) {
        Intrinsics.j(text, "text");
        this.viewSettings.k(text);
        e();
    }

    public final void setTextForMoveCloserAndRescanHint(String text) {
        Intrinsics.j(text, "text");
        this.viewSettings.l(text);
        e();
    }

    public final void setTextForMoveFurtherAndRescanHint(String text) {
        Intrinsics.j(text, "text");
        this.viewSettings.m(text);
        e();
    }

    public final void setTextForScanningHint(String text) {
        Intrinsics.j(text, "text");
        this.viewSettings.n(text);
        e();
    }

    public final void setTextForScreenCleanedUpHint(String text) {
        Intrinsics.j(text, "text");
        this.viewSettings.o(text);
        e();
    }

    public final void setTextForTapShutterToScanHint(String text) {
        Intrinsics.j(text, "text");
        this.viewSettings.p(text);
        e();
    }

    public final void setTextForTapToUncountHint(String text) {
        Intrinsics.j(text, "text");
        this.viewSettings.q(text);
        e();
    }

    public final void setToolbarSettings(BarcodeCountToolbarSettings settings) {
        Intrinsics.j(settings, "settings");
        this.viewSettings.a(settings);
        e();
    }

    public final void setTorchControlPosition(Anchor value) {
        Intrinsics.j(value, "value");
        this.viewSettings.a(value);
        e();
    }

    public final void setUiListener(BarcodeCountViewUiListener barcodeCountViewUiListener) {
        this.f120833c.setUiListener(barcodeCountViewUiListener != null ? new d(this, barcodeCountViewUiListener) : null);
    }

    public final void set_forceAlignCameraPreviewToBottomInPortrait(boolean z10) {
        this.f120835e.a(z10);
        c();
    }

    public final void set_internalUiListener(BarcodeCountViewInternalUiListener barcodeCountViewInternalUiListener) {
        this.f120835e.a(barcodeCountViewInternalUiListener);
    }

    public final void set_scanningDelayMs(int i10) {
        this.f120835e.a(i10);
    }

    public static final void access$clearIndicatorsOnMainThread(BarcodeCountView barcodeCountView) {
        barcodeCountView.getClass();
        ViewExtensionsKt.runOnMainThread(barcodeCountView, new j(barcodeCountView));
    }

    public static final void access$onHardwareKeyEvent(BarcodeCountView barcodeCountView, HardwareKeyEvent hardwareKeyEvent) {
        barcodeCountView.getClass();
        if (WhenMappings.$EnumSwitchMapping$1[hardwareKeyEvent.ordinal()] == 1) {
            barcodeCountView.f120835e.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        this.f120841k.post(new Runnable() { // from class: com.scandit.datacapture.barcode.count.ui.view.q
            @Override // java.lang.Runnable
            public final void run() {
                BarcodeCountView.a(this.f120866a);
            }
        });
    }

    @JvmStatic
    public static final BarcodeCountView newInstance(Context context, DataCaptureView dataCaptureView, BarcodeCount barcodeCount) {
        return INSTANCE.newInstance(context, dataCaptureView, barcodeCount);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
        this.f120832b.b(this.f120833c);
        BarcodeCount barcodeCount = (BarcodeCount) this.f120842l.get();
        if (barcodeCount != null) {
            this.f120835e.a(barcodeCount);
        }
        setShouldShowFloatingShutterButton(this.f120835e.e());
        BarcodeIndicatorPresenter barcodeIndicatorPresenter = this.f120837g;
        barcodeIndicatorPresenter.a(this.f120833c.getColorScheme$scandit_barcode_capture());
        barcodeIndicatorPresenter.a(this.f120831a.d());
        barcodeIndicatorPresenter.a(this.viewSettings);
        BarcodeCount barcodeCount2 = (BarcodeCount) this.f120842l.get();
        if (barcodeCount2 != null && barcodeCount2.isCaptureListSet$scandit_barcode_capture()) {
            int captureListTargetQuantity$scandit_barcode_capture = barcodeCount2.getCaptureListTargetQuantity$scandit_barcode_capture();
            this.f120845o = true;
            this.f120835e.b(true);
            BarcodeCountUiPresenter barcodeCountUiPresenter = this.f120835e;
            Context context = getContext();
            Intrinsics.i(context, "getContext(...)");
            barcodeCountUiPresenter.a(true, com.scandit.datacapture.barcode.internal.module.extensions.b.a(context));
            this.f120837g.a(true);
            if (isAttachedToWindow()) {
                this.f120840j.runOnMainThread(new o(this));
                this.f120840j.runOnMainThread(new n(this, captureListTargetQuantity$scandit_barcode_capture));
                return;
            }
            return;
        }
        this.f120840j.runOnMainThread(new o(this));
        this.f120840j.runOnMainThread(new n(this, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f120832b.a(this.f120833c);
        this.f120837g.reset();
    }

    @Override // android.view.View
    protected void onSizeChanged(int w10, int h10, int oldw, int oldh) {
        super.onSizeChanged(w10, h10, oldw, oldh);
        c();
    }

    @JvmStatic
    public static final BarcodeCountView newInstance(Context context, DataCaptureView dataCaptureView, BarcodeCount barcodeCount, BarcodeCountViewStyle barcodeCountViewStyle) {
        return INSTANCE.newInstance(context, dataCaptureView, barcodeCount, barcodeCountViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BarcodeCountView(Context context, BarcodeCount barcodeCount, BarcodeCountViewLayerManager layerManager, BarcodeCountDataCaptureViewHolder dataCaptureViewWrapper, BarcodeCountBasicOverlay overlay, BarcodeCountViewUiLayoutHelper layoutHelper, BarcodeCountUiPresenter uiHandler, BarcodeCountBrushHandler brushHandler, BarcodeIndicatorPresenter indicatorPresenter, BarcodeCountInternalModePresenter internalModePresenter, BarcodeCountInternalMode internalMode, BarcodeCountCameraHandler cameraHandler, MainThreadHelper mainThreadHelper) {
        super(context);
        Intrinsics.j(context, "context");
        Intrinsics.j(barcodeCount, "barcodeCount");
        Intrinsics.j(layerManager, "layerManager");
        Intrinsics.j(dataCaptureViewWrapper, "dataCaptureViewWrapper");
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(layoutHelper, "layoutHelper");
        Intrinsics.j(uiHandler, "uiHandler");
        Intrinsics.j(brushHandler, "brushHandler");
        Intrinsics.j(indicatorPresenter, "indicatorPresenter");
        Intrinsics.j(internalModePresenter, "internalModePresenter");
        Intrinsics.j(internalMode, "internalMode");
        Intrinsics.j(cameraHandler, "cameraHandler");
        Intrinsics.j(mainThreadHelper, "mainThreadHelper");
        this.f120831a = layerManager;
        this.f120832b = dataCaptureViewWrapper;
        this.f120833c = overlay;
        this.f120834d = layoutHelper;
        this.f120835e = uiHandler;
        this.f120836f = brushHandler;
        this.f120837g = indicatorPresenter;
        this.f120838h = internalModePresenter;
        this.f120839i = cameraHandler;
        this.f120840j = mainThreadHelper;
        this.f120841k = new Handler(Looper.getMainLooper());
        a aVar = new a(this);
        WeakReference weakReference = new WeakReference(barcodeCount);
        this.f120842l = weakReference;
        BarcodeCountViewSettings barcodeCountViewSettings = new BarcodeCountViewSettings();
        uiHandler.b(barcodeCountViewSettings);
        this.viewSettings = barcodeCountViewSettings;
        layoutHelper.a(layerManager.f());
        uiHandler.a(layerManager, barcodeCount);
        uiHandler.a(new i(this));
        Configuration configuration = getContext().getResources().getConfiguration();
        uiHandler.a(new Size(PixelExtensionsKt.pxFromDp$default(configuration.screenWidthDp, (Context) null, 1, (Object) null), PixelExtensionsKt.pxFromDp$default(configuration.screenHeightDp, (Context) null, 1, (Object) null)), a());
        dataCaptureViewWrapper.a(this);
        dataCaptureViewWrapper.a(layerManager.i());
        layerManager.a(overlay);
        layerManager.a(this);
        setBackgroundColor(-16777216);
        BarcodeCount barcodeCount2 = (BarcodeCount) weakReference.get();
        if (barcodeCount2 != null) {
            uiHandler.a(barcodeCount2);
        }
        barcodeCount.getListListeners$scandit_barcode_capture().add(0, aVar);
        barcodeCount.setFeedbackChangeListener$scandit_barcode_capture(new e(this));
        overlay.setViewHandler$scandit_barcode_capture(new b(this));
        overlay.setCallback(new g(this));
        overlay.setListener(new c(this));
        internalModePresenter.a(internalMode);
    }

    private final Size a() {
        Configuration configuration = getContext().getResources().getConfiguration();
        Size size = new Size(PixelExtensionsKt.pxFromDp$default(configuration.screenWidthDp, (Context) null, 1, (Object) null), PixelExtensionsKt.pxFromDp$default(configuration.screenHeightDp, (Context) null, 1, (Object) null));
        Context context = getContext();
        Intrinsics.i(context, "getContext(...)");
        if (com.scandit.datacapture.barcode.internal.module.extensions.b.a(context)) {
            int height = getHeight();
            Integer numValueOf = height != 0 ? Integer.valueOf(height) : null;
            int iIntValue = numValueOf != null ? numValueOf.intValue() : size.getHeight();
            return new Size((iIntValue * 4) / 3, iIntValue);
        }
        return new Size(size.getWidth(), (int) ((size.getWidth() * 4) / 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(BarcodeCountView this$0) {
        Intrinsics.j(this$0, "this$0");
        if (this$0.viewSettings.w()) {
            this$0.f120837g.a();
        } else {
            this$0.a(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(boolean z10) {
        if (z10) {
            this.f120835e.d();
            this.f120837g.b(false, true);
            this.f120837g.a(true, true);
        } else if (this.viewSettings.w()) {
            this.f120837g.b(false, true);
            this.f120837g.a(true, true);
            this.f120837g.b(true);
        } else {
            this.f120837g.a(false, true);
            this.f120837g.b(true, true);
            this.f120835e.l();
        }
    }
}
