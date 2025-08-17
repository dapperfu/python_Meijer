package com.scandit.datacapture.barcode.internal.sdk;

import com.scandit.datacapture.barcode.ar.capture.BarcodeAr;
import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.barcode.batch.data.TrackedObject;
import com.scandit.datacapture.barcode.batch.internal.module.data.NativeTrackedBarcode;
import com.scandit.datacapture.barcode.batch.internal.module.data.NativeTrackedObject;
import com.scandit.datacapture.barcode.batch.internal.module.ui.overlay.NativeBarcodeTrackingBasicOverlayStyle;
import com.scandit.datacapture.barcode.batch.ui.overlay.BarcodeBatchBasicOverlayStyle;
import com.scandit.datacapture.barcode.batch.ui.overlay.BarcodeBatchBasicOverlayStyleKt;
import com.scandit.datacapture.barcode.capture.BarcodeCapture;
import com.scandit.datacapture.barcode.capture.BarcodeCaptureSettings;
import com.scandit.datacapture.barcode.capture.SymbologySettings;
import com.scandit.datacapture.barcode.count.capture.BarcodeClusterEditor;
import com.scandit.datacapture.barcode.count.capture.list.TargetBarcode;
import com.scandit.datacapture.barcode.count.capture.map.BarcodeSpatialGridElement;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeClusterEditor;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayStyle;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeSpatialGridElement;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeTargetBarcode;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountViewStyle;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountViewStyleExtensionKt;
import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.barcode.data.Cluster;
import com.scandit.datacapture.barcode.data.LocalizedOnlyBarcode;
import com.scandit.datacapture.barcode.data.StructuredAppendData;
import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.barcode.filter.capture.BarcodeFilterSettings;
import com.scandit.datacapture.barcode.filter.capture.NativeBarcodeFilterSettings;
import com.scandit.datacapture.barcode.filter.ui.overlay.BarcodeFilterHighlightSettings;
import com.scandit.datacapture.barcode.filter.ui.overlay.BarcodeFilterHighlightType;
import com.scandit.datacapture.barcode.filter.ui.overlay.NativeBarcodeFilterHighlightType;
import com.scandit.datacapture.barcode.filter.ui.overlay.NativeBarcodeFilterOverlaySettings;
import com.scandit.datacapture.barcode.internal.module.ar.capture.BarcodeArInternal;
import com.scandit.datacapture.barcode.internal.module.ar.capture.NativeBarcodeAr;
import com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCapture;
import com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureSettings;
import com.scandit.datacapture.barcode.internal.module.capture.NativeSymbologySettings;
import com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickInternal;
import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePick;
import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickState;
import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeProductProviderCallbackItem;
import com.scandit.datacapture.barcode.internal.module.pick.data.NativeBarcodePickProduct;
import com.scandit.datacapture.barcode.internal.sdk.data.NativeAbstractStructuredAppendData;
import com.scandit.datacapture.barcode.internal.sdk.data.NativeBarcode;
import com.scandit.datacapture.barcode.internal.sdk.data.NativeLocalizedOnlyBarcode;
import com.scandit.datacapture.barcode.pick.capture.BarcodePick;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.barcode.pick.data.BarcodePickProduct;
import com.scandit.datacapture.barcode.pick.data.BarcodePickProductProviderCallbackItem;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanScanningMode;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanScanningModeDefault;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanScanningModeTarget;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanScanningModeType;
import com.scandit.datacapture.barcode.spark.ui.SparkScanPreviewBehavior;
import com.scandit.datacapture.barcode.spark.ui.SparkScanScanningBehavior;
import com.scandit.datacapture.barcode.spark.ui.SparkScanScanningMode;
import com.scandit.datacapture.barcode.tracking.internal.module.data.NativeCluster;
import com.scandit.datacapture.barcode.ui.overlay.BarcodeCaptureOverlayStyle;
import com.scandit.datacapture.barcode.ui.overlay.BarcodeCaptureOverlayStyleKt;
import com.scandit.datacapture.barcode.ui.overlay.NativeBarcodeCaptureOverlayStyle;
import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.battery.BatterySavingHandler;
import com.scandit.datacapture.core.internal.sdk.extensions.CollectionsExtensionsKt;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import com.scandit.datacapture.tools.internal.sdk.ProxyConverter;
import com.scandit.datacapture.tools.internal.sdk.ProxyConverterFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

@ProxyConverterFactory(includes = {CoreNativeTypeFactory.class})
@Metadata(d1 = {"\u0000Ú\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001J-\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ-\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0002j\b\u0012\u0004\u0012\u00020\f`\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\tJ\u0017\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00062\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0002j\b\u0012\u0004\u0012\u00020\u0011`\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\tJ-\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0002j\b\u0012\u0004\u0012\u00020\u0011`\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00120\u0006H\u0007¢\u0006\u0004\b\u0014\u0010\u000bJ-\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00062\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00150\u0002j\b\u0012\u0004\u0012\u00020\u0015`\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\tJ-\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00150\u0002j\b\u0012\u0004\u0012\u00020\u0015`\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00160\u0006H\u0007¢\u0006\u0004\b\u0018\u0010\u000bJ?\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00160\u001c2\"\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00150\u0019j\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0015`\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ-\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00160!2\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00150\u001fj\b\u0012\u0004\u0012\u00020\u0015` H\u0007¢\u0006\u0004\b\"\u0010#J-\u0010&\u001a\u0012\u0012\u0004\u0012\u00020$0\u001fj\b\u0012\u0004\u0012\u00020$` 2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0!H\u0007¢\u0006\u0004\b&\u0010'J\u0017\u0010\u000f\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u000f\u0010(J\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u000f\u0010)J\u0017\u0010\u000f\u001a\u00020+2\u0006\u0010\u0005\u001a\u00020*H\u0007¢\u0006\u0004\b\u000f\u0010,J\u0017\u0010\u000f\u001a\u00020.2\u0006\u0010\u0005\u001a\u00020-H\u0007¢\u0006\u0004\b\u000f\u0010/J?\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00120\u001c2\"\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00110\u0019j\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0011`\u001bH\u0007¢\u0006\u0004\b\u000f\u0010\u001eJ\u0017\u0010\u000f\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u000f\u00100J\u0017\u0010\u000f\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u000f\u00101J\u0017\u0010\u000f\u001a\u0002032\u0006\u0010\u0005\u001a\u000202H\u0007¢\u0006\u0004\b\u000f\u00104J\u0017\u0010\u000f\u001a\u0002062\u0006\u0010\u0005\u001a\u000205H\u0007¢\u0006\u0004\b\u000f\u00107J-\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u0002080\u001fj\b\u0012\u0004\u0012\u000208` 2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002080!H\u0007¢\u0006\u0004\b\u000f\u0010'J-\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020:0\u00062\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u0002090\u0002j\b\u0012\u0004\u0012\u000209`\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\tJ\u0017\u0010\u000f\u001a\u00020:2\u0006\u0010\u0005\u001a\u000209H\u0007¢\u0006\u0004\b\u000f\u0010;J\u0017\u0010\u000f\u001a\u00020=2\u0006\u0010\u0005\u001a\u00020<H\u0007¢\u0006\u0004\b\u000f\u0010>J[\u0010\u000f\u001a4\u0012\u0004\u0012\u00020$\u0012\n\u0012\b\u0012\u0004\u0012\u0002080\u001f0\u0019j\u001e\u0012\u0004\u0012\u00020$\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u0002080\u001fj\b\u0012\u0004\u0012\u000208` `\u001b2\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020$\u0012\n\u0012\b\u0012\u0004\u0012\u0002080!0\u001cH\u0007¢\u0006\u0004\b\u000f\u0010?J-\u0010B\u001a\b\u0012\u0004\u0012\u00020A0\u00062\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020@0\u0002j\b\u0012\u0004\u0012\u00020@`\u0004H\u0007¢\u0006\u0004\bB\u0010\tJ-\u0010C\u001a\u0012\u0012\u0004\u0012\u00020@0\u0002j\b\u0012\u0004\u0012\u00020@`\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020A0\u0006H\u0007¢\u0006\u0004\bC\u0010\u000bJ-\u0010F\u001a\b\u0012\u0004\u0012\u00020E0\u00062\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020D0\u0002j\b\u0012\u0004\u0012\u00020D`\u0004H\u0007¢\u0006\u0004\bF\u0010\tJ-\u0010G\u001a\u0012\u0012\u0004\u0012\u00020D0\u0002j\b\u0012\u0004\u0012\u00020D`\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020E0\u0006H\u0007¢\u0006\u0004\bG\u0010\u000bJ[\u0010H\u001a\u0014\u0012\u0004\u0012\u00020$\u0012\n\u0012\b\u0012\u0004\u0012\u0002080!0\u001c28\u0010\u0005\u001a4\u0012\u0004\u0012\u00020$\u0012\n\u0012\b\u0012\u0004\u0012\u0002080\u001f0\u0019j\u001e\u0012\u0004\u0012\u00020$\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u0002080\u001fj\b\u0012\u0004\u0012\u000208` `\u001bH\u0007¢\u0006\u0004\bH\u0010\u001eJ\u0017\u0010\u000f\u001a\u00020J2\u0006\u0010\u0005\u001a\u00020IH\u0007¢\u0006\u0004\b\u000f\u0010KJ\u0017\u0010\u000f\u001a\u00020M2\u0006\u0010\u0005\u001a\u00020LH\u0007¢\u0006\u0004\b\u000f\u0010NJ\u0017\u0010\u000f\u001a\u00020L2\u0006\u0010\u0005\u001a\u00020MH\u0007¢\u0006\u0004\b\u000f\u0010OJ\u0017\u0010\u000f\u001a\u00020Q2\u0006\u0010\u0005\u001a\u00020PH\u0007¢\u0006\u0004\b\u000f\u0010RJ\u0017\u0010\u000f\u001a\u00020P2\u0006\u0010\u0005\u001a\u00020QH\u0007¢\u0006\u0004\b\u000f\u0010SJ\u0017\u0010\u000f\u001a\u00020U2\u0006\u0010\u0005\u001a\u00020TH\u0007¢\u0006\u0004\b\u000f\u0010VJ\u0017\u0010\u000f\u001a\u00020T2\u0006\u0010\u0005\u001a\u00020UH\u0007¢\u0006\u0004\b\u000f\u0010WJ\u0017\u0010\u000f\u001a\u00020Y2\u0006\u0010\u0005\u001a\u00020XH\u0007¢\u0006\u0004\b\u000f\u0010ZJ\u0017\u0010\u000f\u001a\u00020X2\u0006\u0010\u0005\u001a\u00020YH\u0007¢\u0006\u0004\b\u000f\u0010[J\u0017\u0010\u000f\u001a\u00020]2\u0006\u0010\u0005\u001a\u00020\\H\u0007¢\u0006\u0004\b\u000f\u0010^J\u0017\u0010\u000f\u001a\u00020\\2\u0006\u0010\u0005\u001a\u00020]H\u0007¢\u0006\u0004\b\u000f\u0010_J\u0017\u0010\u000f\u001a\u00020a2\u0006\u0010\u0005\u001a\u00020`H\u0007¢\u0006\u0004\b\u000f\u0010bJ\u0017\u0010\u000f\u001a\u00020`2\u0006\u0010\u0005\u001a\u00020aH\u0007¢\u0006\u0004\b\u000f\u0010cJ\u0017\u0010\u000f\u001a\u00020e2\u0006\u0010\u0005\u001a\u00020dH\u0007¢\u0006\u0004\b\u000f\u0010fJ\u0017\u0010\u000f\u001a\u00020d2\u0006\u0010\u0005\u001a\u00020eH\u0007¢\u0006\u0004\b\u000f\u0010gJ\u0017\u0010\u000f\u001a\u00020i2\u0006\u0010\u0005\u001a\u00020hH\u0007¢\u0006\u0004\b\u000f\u0010jJ\u0017\u0010\u000f\u001a\u00020h2\u0006\u0010\u0005\u001a\u00020iH\u0007¢\u0006\u0004\b\u000f\u0010kJ\u0017\u0010\u000f\u001a\u00020m2\u0006\u0010\u0005\u001a\u00020lH\u0007¢\u0006\u0004\b\u000f\u0010nJ?\u0010o\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00070\u001c2\"\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00030\u0019j\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0003`\u001bH\u0007¢\u0006\u0004\bo\u0010\u001eJ\u0017\u0010\u000f\u001a\u00020q2\u0006\u0010\u0005\u001a\u00020pH\u0007¢\u0006\u0004\b\u000f\u0010rJ\u0017\u0010\u000f\u001a\u00020t2\u0006\u0010\u0005\u001a\u00020sH\u0007¢\u0006\u0004\b\u000f\u0010u¨\u0006v"}, d2 = {"Lcom/scandit/datacapture/barcode/internal/sdk/BarcodeNativeTypeFactory;", "", "Ljava/util/ArrayList;", "Lcom/scandit/datacapture/barcode/internal/sdk/data/NativeBarcode;", "Lkotlin/collections/ArrayList;", "source", "", "Lcom/scandit/datacapture/barcode/data/Barcode;", "convertNativeBarcodeList", "(Ljava/util/ArrayList;)Ljava/util/List;", "convertBarcodeList", "(Ljava/util/List;)Ljava/util/ArrayList;", "Lcom/scandit/datacapture/barcode/internal/sdk/data/NativeLocalizedOnlyBarcode;", "Lcom/scandit/datacapture/barcode/data/LocalizedOnlyBarcode;", "convertNativeLocalizedOnlyBarcode", "convert", "(Lcom/scandit/datacapture/barcode/internal/sdk/data/NativeLocalizedOnlyBarcode;)Lcom/scandit/datacapture/barcode/data/LocalizedOnlyBarcode;", "Lcom/scandit/datacapture/barcode/batch/internal/module/data/NativeTrackedBarcode;", "Lcom/scandit/datacapture/barcode/batch/data/TrackedBarcode;", "convertNativeTrackedBarcodeList", "convertTrackedBarcodeList", "Lcom/scandit/datacapture/barcode/batch/internal/module/data/NativeTrackedObject;", "Lcom/scandit/datacapture/barcode/batch/data/TrackedObject;", "convertNativeTrackedObjectList", "convertTrackedObjectList", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "", "convertTrackedObjectNativeMap", "(Ljava/util/HashMap;)Ljava/util/Map;", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "", "convertTrackedObjectNativeSet", "(Ljava/util/HashSet;)Ljava/util/Set;", "Lcom/scandit/datacapture/barcode/data/Symbology;", "src", "convertSymbologySetToHashSet", "(Ljava/util/Set;)Ljava/util/HashSet;", "(Lcom/scandit/datacapture/barcode/batch/internal/module/data/NativeTrackedObject;)Lcom/scandit/datacapture/barcode/batch/data/TrackedObject;", "(Lcom/scandit/datacapture/barcode/internal/sdk/data/NativeBarcode;)Lcom/scandit/datacapture/barcode/data/Barcode;", "Lcom/scandit/datacapture/barcode/internal/module/capture/NativeBarcodeCaptureSettings;", "Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureSettings;", "(Lcom/scandit/datacapture/barcode/internal/module/capture/NativeBarcodeCaptureSettings;)Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureSettings;", "Lcom/scandit/datacapture/barcode/internal/module/capture/NativeBarcodeCapture;", "Lcom/scandit/datacapture/barcode/capture/BarcodeCapture;", "(Lcom/scandit/datacapture/barcode/internal/module/capture/NativeBarcodeCapture;)Lcom/scandit/datacapture/barcode/capture/BarcodeCapture;", "(Lcom/scandit/datacapture/barcode/batch/data/TrackedBarcode;)Lcom/scandit/datacapture/barcode/batch/internal/module/data/NativeTrackedBarcode;", "(Lcom/scandit/datacapture/barcode/batch/internal/module/data/NativeTrackedBarcode;)Lcom/scandit/datacapture/barcode/batch/data/TrackedBarcode;", "Lcom/scandit/datacapture/barcode/internal/module/capture/NativeSymbologySettings;", "Lcom/scandit/datacapture/barcode/capture/SymbologySettings;", "(Lcom/scandit/datacapture/barcode/internal/module/capture/NativeSymbologySettings;)Lcom/scandit/datacapture/barcode/capture/SymbologySettings;", "Lcom/scandit/datacapture/barcode/internal/sdk/data/NativeAbstractStructuredAppendData;", "Lcom/scandit/datacapture/barcode/data/StructuredAppendData;", "(Lcom/scandit/datacapture/barcode/internal/sdk/data/NativeAbstractStructuredAppendData;)Lcom/scandit/datacapture/barcode/data/StructuredAppendData;", "", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeTargetBarcode;", "Lcom/scandit/datacapture/barcode/count/capture/list/TargetBarcode;", "(Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeTargetBarcode;)Lcom/scandit/datacapture/barcode/count/capture/list/TargetBarcode;", "Lcom/scandit/datacapture/barcode/filter/capture/NativeBarcodeFilterSettings;", "Lcom/scandit/datacapture/barcode/filter/capture/BarcodeFilterSettings;", "(Lcom/scandit/datacapture/barcode/filter/capture/NativeBarcodeFilterSettings;)Lcom/scandit/datacapture/barcode/filter/capture/BarcodeFilterSettings;", "(Ljava/util/Map;)Ljava/util/HashMap;", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeProductProviderCallbackItem;", "Lcom/scandit/datacapture/barcode/pick/data/BarcodePickProductProviderCallbackItem;", "convertProductProviderCallbackItemFromNativeImpl", "convertProductProviderCallbackItemToNativeImpl", "Lcom/scandit/datacapture/barcode/internal/module/pick/data/NativeBarcodePickProduct;", "Lcom/scandit/datacapture/barcode/pick/data/BarcodePickProduct;", "convertBarcodePickProductFromNativeImpl", "convertBarcodePickProductToNativeImpl", "convertMapOfSymbologyToSetOfInt", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountBasicOverlayStyle;", "Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountViewStyle;", "(Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountBasicOverlayStyle;)Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountViewStyle;", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePickState;", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickState;", "(Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePickState;)Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickState;", "(Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickState;)Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePickState;", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePick;", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePick;", "(Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePick;)Lcom/scandit/datacapture/barcode/pick/capture/BarcodePick;", "(Lcom/scandit/datacapture/barcode/pick/capture/BarcodePick;)Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePick;", "Lcom/scandit/datacapture/barcode/internal/module/ar/capture/NativeBarcodeAr;", "Lcom/scandit/datacapture/barcode/ar/capture/BarcodeAr;", "(Lcom/scandit/datacapture/barcode/internal/module/ar/capture/NativeBarcodeAr;)Lcom/scandit/datacapture/barcode/ar/capture/BarcodeAr;", "(Lcom/scandit/datacapture/barcode/ar/capture/BarcodeAr;)Lcom/scandit/datacapture/barcode/internal/module/ar/capture/NativeBarcodeAr;", "Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightSettings;", "Lcom/scandit/datacapture/barcode/filter/ui/overlay/NativeBarcodeFilterOverlaySettings;", "(Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightSettings;)Lcom/scandit/datacapture/barcode/filter/ui/overlay/NativeBarcodeFilterOverlaySettings;", "(Lcom/scandit/datacapture/barcode/filter/ui/overlay/NativeBarcodeFilterOverlaySettings;)Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightSettings;", "Lcom/scandit/datacapture/barcode/filter/ui/overlay/NativeBarcodeFilterHighlightType;", "Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightType;", "(Lcom/scandit/datacapture/barcode/filter/ui/overlay/NativeBarcodeFilterHighlightType;)Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightType;", "(Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightType;)Lcom/scandit/datacapture/barcode/filter/ui/overlay/NativeBarcodeFilterHighlightType;", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningMode;", "Lcom/scandit/datacapture/barcode/spark/internal/module/capture/NativeSparkScanScanningMode;", "(Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningMode;)Lcom/scandit/datacapture/barcode/spark/internal/module/capture/NativeSparkScanScanningMode;", "(Lcom/scandit/datacapture/barcode/spark/internal/module/capture/NativeSparkScanScanningMode;)Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningMode;", "Lcom/scandit/datacapture/barcode/batch/internal/module/ui/overlay/NativeBarcodeTrackingBasicOverlayStyle;", "Lcom/scandit/datacapture/barcode/batch/ui/overlay/BarcodeBatchBasicOverlayStyle;", "(Lcom/scandit/datacapture/barcode/batch/internal/module/ui/overlay/NativeBarcodeTrackingBasicOverlayStyle;)Lcom/scandit/datacapture/barcode/batch/ui/overlay/BarcodeBatchBasicOverlayStyle;", "(Lcom/scandit/datacapture/barcode/batch/ui/overlay/BarcodeBatchBasicOverlayStyle;)Lcom/scandit/datacapture/barcode/batch/internal/module/ui/overlay/NativeBarcodeTrackingBasicOverlayStyle;", "Lcom/scandit/datacapture/barcode/ui/overlay/NativeBarcodeCaptureOverlayStyle;", "Lcom/scandit/datacapture/barcode/ui/overlay/BarcodeCaptureOverlayStyle;", "(Lcom/scandit/datacapture/barcode/ui/overlay/NativeBarcodeCaptureOverlayStyle;)Lcom/scandit/datacapture/barcode/ui/overlay/BarcodeCaptureOverlayStyle;", "(Lcom/scandit/datacapture/barcode/ui/overlay/BarcodeCaptureOverlayStyle;)Lcom/scandit/datacapture/barcode/ui/overlay/NativeBarcodeCaptureOverlayStyle;", "Lcom/scandit/datacapture/barcode/data/Cluster;", "Lcom/scandit/datacapture/barcode/tracking/internal/module/data/NativeCluster;", "(Lcom/scandit/datacapture/barcode/data/Cluster;)Lcom/scandit/datacapture/barcode/tracking/internal/module/data/NativeCluster;", "convertBarcodeMap", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeClusterEditor;", "Lcom/scandit/datacapture/barcode/count/capture/BarcodeClusterEditor;", "(Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeClusterEditor;)Lcom/scandit/datacapture/barcode/count/capture/BarcodeClusterEditor;", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeSpatialGridElement;", "Lcom/scandit/datacapture/barcode/count/capture/map/BarcodeSpatialGridElement;", "(Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeSpatialGridElement;)Lcom/scandit/datacapture/barcode/count/capture/map/BarcodeSpatialGridElement;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class BarcodeNativeTypeFactory {
    public static final BarcodeNativeTypeFactory INSTANCE = new BarcodeNativeTypeFactory();

    @ProxyConverter
    public final LocalizedOnlyBarcode convert(NativeLocalizedOnlyBarcode source) {
        Intrinsics.j(source, "source");
        return (LocalizedOnlyBarcode) ProxyCacheKt.getGlobalProxyCache().getOrPut(Reflection.b(NativeLocalizedOnlyBarcode.class), null, source, new a(source));
    }

    @ProxyConverter
    public final ArrayList<NativeBarcode> convertBarcodeList(List<Barcode> source) {
        Intrinsics.j(source, "source");
        ArrayList arrayList = new ArrayList(CollectionsKt.x(source, 10));
        Iterator<T> it = source.iterator();
        while (it.hasNext()) {
            arrayList.add(((Barcode) it.next()).getF120890a());
        }
        return CollectionsExtensionsKt.toArrayList(arrayList);
    }

    @ProxyConverter
    public final Map<Integer, Barcode> convertBarcodeMap(HashMap<Integer, NativeBarcode> source) {
        Intrinsics.j(source, "source");
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.f(source.size()));
        Iterator<T> it = source.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), INSTANCE.convert((NativeBarcode) entry.getValue()));
        }
        return linkedHashMap;
    }

    @ProxyConverter
    public final List<BarcodePickProduct> convertBarcodePickProductFromNativeImpl(ArrayList<NativeBarcodePickProduct> source) {
        Intrinsics.j(source, "source");
        ArrayList arrayList = new ArrayList(CollectionsKt.x(source, 10));
        Iterator<T> it = source.iterator();
        while (it.hasNext()) {
            arrayList.add(new BarcodePickProduct((NativeBarcodePickProduct) it.next()));
        }
        return arrayList;
    }

    @ProxyConverter
    public final ArrayList<NativeBarcodePickProduct> convertBarcodePickProductToNativeImpl(List<BarcodePickProduct> source) {
        Intrinsics.j(source, "source");
        ArrayList<NativeBarcodePickProduct> arrayList = new ArrayList<>();
        Iterator<T> it = source.iterator();
        while (it.hasNext()) {
            arrayList.add(((BarcodePickProduct) it.next()).get_impl());
        }
        return arrayList;
    }

    @ProxyConverter
    public final Map<Symbology, Set<Short>> convertMapOfSymbologyToSetOfInt(HashMap<Symbology, HashSet<Short>> source) {
        Intrinsics.j(source, "source");
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.f(source.size()));
        Iterator<T> it = source.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), CollectionsKt.o1((Iterable) entry.getValue()));
        }
        return linkedHashMap;
    }

    @ProxyConverter
    public final List<Barcode> convertNativeBarcodeList(ArrayList<NativeBarcode> source) {
        Intrinsics.j(source, "source");
        ArrayList arrayList = new ArrayList(CollectionsKt.x(source, 10));
        Iterator<T> it = source.iterator();
        while (it.hasNext()) {
            arrayList.add(INSTANCE.convert((NativeBarcode) it.next()));
        }
        return arrayList;
    }

    @ProxyConverter
    public final List<LocalizedOnlyBarcode> convertNativeLocalizedOnlyBarcode(ArrayList<NativeLocalizedOnlyBarcode> source) {
        Intrinsics.j(source, "source");
        ArrayList arrayList = new ArrayList(CollectionsKt.x(source, 10));
        Iterator<T> it = source.iterator();
        while (it.hasNext()) {
            arrayList.add(INSTANCE.convert((NativeLocalizedOnlyBarcode) it.next()));
        }
        return arrayList;
    }

    @ProxyConverter
    public final List<TrackedBarcode> convertNativeTrackedBarcodeList(ArrayList<NativeTrackedBarcode> source) {
        Intrinsics.j(source, "source");
        ArrayList arrayList = new ArrayList(CollectionsKt.x(source, 10));
        Iterator<T> it = source.iterator();
        while (it.hasNext()) {
            arrayList.add(INSTANCE.convert((NativeTrackedBarcode) it.next()));
        }
        return arrayList;
    }

    @ProxyConverter
    public final List<TrackedObject> convertNativeTrackedObjectList(ArrayList<NativeTrackedObject> source) {
        Intrinsics.j(source, "source");
        ArrayList arrayList = new ArrayList(CollectionsKt.x(source, 10));
        Iterator<T> it = source.iterator();
        while (it.hasNext()) {
            arrayList.add(INSTANCE.convert((NativeTrackedObject) it.next()));
        }
        return arrayList;
    }

    @ProxyConverter
    public final List<BarcodePickProductProviderCallbackItem> convertProductProviderCallbackItemFromNativeImpl(ArrayList<NativeProductProviderCallbackItem> source) {
        Intrinsics.j(source, "source");
        ArrayList arrayList = new ArrayList(CollectionsKt.x(source, 10));
        Iterator<T> it = source.iterator();
        while (it.hasNext()) {
            arrayList.add(new BarcodePickProductProviderCallbackItem((NativeProductProviderCallbackItem) it.next()));
        }
        return arrayList;
    }

    @ProxyConverter
    public final ArrayList<NativeProductProviderCallbackItem> convertProductProviderCallbackItemToNativeImpl(List<BarcodePickProductProviderCallbackItem> source) {
        Intrinsics.j(source, "source");
        ArrayList<NativeProductProviderCallbackItem> arrayList = new ArrayList<>();
        Iterator<T> it = source.iterator();
        while (it.hasNext()) {
            arrayList.add(((BarcodePickProductProviderCallbackItem) it.next()).getF123604a());
        }
        return arrayList;
    }

    @ProxyConverter
    public final HashSet<Symbology> convertSymbologySetToHashSet(Set<? extends Symbology> src) {
        Intrinsics.j(src, "src");
        return CollectionsKt.h1(src);
    }

    @ProxyConverter
    public final ArrayList<NativeTrackedBarcode> convertTrackedBarcodeList(List<TrackedBarcode> source) {
        Intrinsics.j(source, "source");
        ArrayList arrayList = new ArrayList(CollectionsKt.x(source, 10));
        Iterator<T> it = source.iterator();
        while (it.hasNext()) {
            arrayList.add(INSTANCE.convert((TrackedBarcode) it.next()));
        }
        return CollectionsExtensionsKt.toArrayList(arrayList);
    }

    @ProxyConverter
    public final ArrayList<NativeTrackedObject> convertTrackedObjectList(List<TrackedObject> source) {
        Intrinsics.j(source, "source");
        ArrayList arrayList = new ArrayList(CollectionsKt.x(source, 10));
        Iterator<T> it = source.iterator();
        while (it.hasNext()) {
            arrayList.add(((TrackedObject) it.next()).getF120473a());
        }
        return CollectionsExtensionsKt.toArrayList(arrayList);
    }

    @ProxyConverter
    public final Map<Integer, TrackedObject> convertTrackedObjectNativeMap(HashMap<Integer, NativeTrackedObject> source) {
        Intrinsics.j(source, "source");
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.f(source.size()));
        Iterator<T> it = source.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), INSTANCE.convert((NativeTrackedObject) entry.getValue()));
        }
        return linkedHashMap;
    }

    @ProxyConverter
    public final Set<TrackedObject> convertTrackedObjectNativeSet(HashSet<NativeTrackedObject> source) {
        Intrinsics.j(source, "source");
        ArrayList arrayList = new ArrayList(CollectionsKt.x(source, 10));
        Iterator<T> it = source.iterator();
        while (it.hasNext()) {
            arrayList.add(INSTANCE.convert((NativeTrackedObject) it.next()));
        }
        return CollectionsKt.o1(arrayList);
    }

    private BarcodeNativeTypeFactory() {
    }

    @ProxyConverter
    public final TrackedObject convert(NativeTrackedObject source) {
        Intrinsics.j(source, "source");
        return (TrackedObject) ProxyCacheKt.getGlobalProxyCache().getOrPut(Reflection.b(NativeTrackedObject.class), null, source, new b(source));
    }

    @ProxyConverter
    public final Barcode convert(NativeBarcode source) {
        Intrinsics.j(source, "source");
        return (Barcode) ProxyCacheKt.getGlobalProxyCache().getOrPut(Reflection.b(NativeBarcode.class), null, source, new c(source));
    }

    @ProxyConverter
    public final BarcodeCaptureSettings convert(NativeBarcodeCaptureSettings source) {
        Intrinsics.j(source, "source");
        return new BarcodeCaptureSettings(source);
    }

    @ProxyConverter
    public final BarcodeCapture convert(NativeBarcodeCapture source) {
        Intrinsics.j(source, "source");
        return new BarcodeCapture(source, BatterySavingHandler.Companion.impl$default(BatterySavingHandler.INSTANCE, null, 1, null));
    }

    @ProxyConverter
    public final NativeTrackedBarcode convert(TrackedBarcode source) {
        Intrinsics.j(source, "source");
        return source.getF120470a();
    }

    @ProxyConverter
    public final TrackedBarcode convert(NativeTrackedBarcode source) {
        Intrinsics.j(source, "source");
        return (TrackedBarcode) ProxyCacheKt.getGlobalProxyCache().getOrPut(Reflection.b(NativeTrackedBarcode.class), null, source, new d(source));
    }

    @ProxyConverter
    public final SymbologySettings convert(NativeSymbologySettings source) {
        Intrinsics.j(source, "source");
        return new SymbologySettings(source);
    }

    @ProxyConverter
    public final StructuredAppendData convert(NativeAbstractStructuredAppendData source) {
        Intrinsics.j(source, "source");
        return new StructuredAppendData(source);
    }

    @ProxyConverter
    public final HashSet<Short> convert(Set<Short> source) {
        Intrinsics.j(source, "source");
        return CollectionsKt.h1(source);
    }

    @ProxyConverter
    public final TargetBarcode convert(NativeTargetBarcode source) {
        Intrinsics.j(source, "source");
        return (TargetBarcode) ProxyCacheKt.getGlobalProxyCache().getOrPut(Reflection.b(NativeTargetBarcode.class), null, source, new e(source));
    }

    @ProxyConverter
    public final BarcodeFilterSettings convert(NativeBarcodeFilterSettings source) {
        Intrinsics.j(source, "source");
        return new BarcodeFilterSettings(source);
    }

    @ProxyConverter
    public final BarcodeCountViewStyle convert(NativeBarcodeCountBasicOverlayStyle source) {
        Intrinsics.j(source, "source");
        return BarcodeCountViewStyleExtensionKt.toViewStyle(source);
    }

    @ProxyConverter
    public final BarcodePickState convert(NativeBarcodePickState source) {
        Intrinsics.j(source, "source");
        return BarcodePickState.INSTANCE._fromNativeEnum$scandit_barcode_capture(source);
    }

    @ProxyConverter
    public final NativeBarcodePickState convert(BarcodePickState source) {
        Intrinsics.j(source, "source");
        return source._toNativeEnum$scandit_barcode_capture();
    }

    @ProxyConverter
    public final BarcodePick convert(NativeBarcodePick source) {
        Intrinsics.j(source, "source");
        return ((BarcodePickInternal) ProxyCacheKt.getGlobalProxyCache().getOrPut(Reflection.b(NativeBarcodePick.class), null, source, new g(source))).d();
    }

    @ProxyConverter
    public final NativeBarcodePick convert(BarcodePick source) {
        Intrinsics.j(source, "source");
        return source._impl$scandit_barcode_capture();
    }

    @ProxyConverter
    public final BarcodeAr convert(NativeBarcodeAr source) {
        Intrinsics.j(source, "source");
        return ((BarcodeArInternal) ProxyCacheKt.getGlobalProxyCache().getOrPut(Reflection.b(NativeBarcodeAr.class), null, source, new f(source))).c();
    }

    @ProxyConverter
    public final NativeBarcodeAr convert(BarcodeAr source) {
        Intrinsics.j(source, "source");
        return source._impl$scandit_barcode_capture();
    }

    @ProxyConverter
    public final NativeBarcodeFilterOverlaySettings convert(BarcodeFilterHighlightSettings source) {
        Intrinsics.j(source, "source");
        return source.getF120929a();
    }

    @ProxyConverter
    public final BarcodeFilterHighlightSettings convert(NativeBarcodeFilterOverlaySettings source) {
        Intrinsics.j(source, "source");
        return new BarcodeFilterHighlightSettings(source);
    }

    @ProxyConverter
    public final BarcodeFilterHighlightType convert(NativeBarcodeFilterHighlightType source) {
        Intrinsics.j(source, "source");
        return BarcodeFilterHighlightType.INSTANCE._fromNativeEnum$scandit_barcode_capture(source);
    }

    @ProxyConverter
    public final NativeBarcodeFilterHighlightType convert(BarcodeFilterHighlightType source) {
        Intrinsics.j(source, "source");
        return source._toNativeEnum$scandit_barcode_capture();
    }

    @ProxyConverter
    public final NativeSparkScanScanningMode convert(SparkScanScanningMode source) {
        Intrinsics.j(source, "source");
        if (source instanceof SparkScanScanningMode.Target) {
            SparkScanScanningMode.Target target = (SparkScanScanningMode.Target) source;
            NativeSparkScanScanningMode nativeSparkScanScanningModeAsScanningMode = NativeSparkScanScanningModeTarget.create(target.getScanningBehavior(), target.getPreviewBehavior()).asScanningMode();
            Intrinsics.i(nativeSparkScanScanningModeAsScanningMode, "asScanningMode(...)");
            return nativeSparkScanScanningModeAsScanningMode;
        }
        if (source instanceof SparkScanScanningMode.Default) {
            SparkScanScanningMode.Default r32 = (SparkScanScanningMode.Default) source;
            NativeSparkScanScanningMode nativeSparkScanScanningModeAsScanningMode2 = NativeSparkScanScanningModeDefault.create(r32.getScanningBehavior(), r32.getPreviewBehavior()).asScanningMode();
            Intrinsics.i(nativeSparkScanScanningModeAsScanningMode2, "asScanningMode(...)");
            return nativeSparkScanScanningModeAsScanningMode2;
        }
        throw new NoWhenBranchMatchedException();
    }

    @ProxyConverter
    public final SparkScanScanningMode convert(NativeSparkScanScanningMode source) {
        Intrinsics.j(source, "source");
        if (source.getType() == NativeSparkScanScanningModeType.DEFAULT) {
            SparkScanScanningBehavior scanningBehavior = source.getScanningBehavior();
            Intrinsics.i(scanningBehavior, "getScanningBehavior(...)");
            SparkScanPreviewBehavior previewBehavior = source.getPreviewBehavior();
            Intrinsics.i(previewBehavior, "getPreviewBehavior(...)");
            return new SparkScanScanningMode.Default(scanningBehavior, previewBehavior);
        }
        SparkScanScanningBehavior scanningBehavior2 = source.getScanningBehavior();
        Intrinsics.i(scanningBehavior2, "getScanningBehavior(...)");
        SparkScanPreviewBehavior previewBehavior2 = source.getPreviewBehavior();
        Intrinsics.i(previewBehavior2, "getPreviewBehavior(...)");
        return new SparkScanScanningMode.Target(scanningBehavior2, previewBehavior2);
    }

    @ProxyConverter
    public final BarcodeBatchBasicOverlayStyle convert(NativeBarcodeTrackingBasicOverlayStyle source) {
        Intrinsics.j(source, "source");
        return BarcodeBatchBasicOverlayStyleKt.fromNative(source);
    }

    @ProxyConverter
    public final NativeBarcodeTrackingBasicOverlayStyle convert(BarcodeBatchBasicOverlayStyle source) {
        Intrinsics.j(source, "source");
        return BarcodeBatchBasicOverlayStyleKt.toNative(source);
    }

    @ProxyConverter
    public final BarcodeCaptureOverlayStyle convert(NativeBarcodeCaptureOverlayStyle source) {
        Intrinsics.j(source, "source");
        return BarcodeCaptureOverlayStyleKt.fromNative(source);
    }

    @ProxyConverter
    public final NativeBarcodeCaptureOverlayStyle convert(BarcodeCaptureOverlayStyle source) {
        Intrinsics.j(source, "source");
        return BarcodeCaptureOverlayStyleKt.toNative(source);
    }

    @ProxyConverter
    public final NativeCluster convert(Cluster source) {
        Intrinsics.j(source, "source");
        return source.getNative();
    }

    @ProxyConverter
    public final BarcodeClusterEditor convert(NativeBarcodeClusterEditor source) {
        Intrinsics.j(source, "source");
        return new BarcodeClusterEditor(source);
    }

    @ProxyConverter
    public final BarcodeSpatialGridElement convert(NativeBarcodeSpatialGridElement source) {
        Intrinsics.j(source, "source");
        return new BarcodeSpatialGridElement(source);
    }

    @ProxyConverter
    public final Map<Integer, TrackedBarcode> convert(HashMap<Integer, NativeTrackedBarcode> source) {
        Intrinsics.j(source, "source");
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.f(source.size()));
        Iterator<T> it = source.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), INSTANCE.convert((NativeTrackedBarcode) entry.getValue()));
        }
        return linkedHashMap;
    }

    @ProxyConverter
    public final List<TargetBarcode> convert(ArrayList<NativeTargetBarcode> source) {
        Intrinsics.j(source, "source");
        ArrayList arrayList = new ArrayList(CollectionsKt.x(source, 10));
        Iterator<T> it = source.iterator();
        while (it.hasNext()) {
            arrayList.add(INSTANCE.convert((NativeTargetBarcode) it.next()));
        }
        return arrayList;
    }

    @ProxyConverter
    public final HashMap<Symbology, HashSet<Short>> convert(Map<Symbology, ? extends Set<Short>> source) {
        Intrinsics.j(source, "source");
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.f(source.size()));
        Iterator<T> it = source.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), CollectionsKt.h1((Iterable) entry.getValue()));
        }
        return linkedHashMap;
    }
}
