package com.scandit.datacapture.barcode.generator;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.fullstory.FS;
import com.scandit.datacapture.barcode.internal.module.generator.NativeBarcodeGenerator;
import com.scandit.datacapture.barcode.internal.module.generator.NativeBarcodeGeneratorFactoryResult;
import com.scandit.datacapture.barcode.internal.module.generator.NativeBarcodeGeneratorGenerateResult;
import com.scandit.datacapture.barcode.internal.module.generator.NativeBarcodeGeneratorOptions;
import com.scandit.datacapture.barcode.internal.module.generator.NativeBarcodeGeneratorSymbology;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.common.graphic.ImageBuffer;
import com.scandit.datacapture.core.common.graphic.ImagePlane;
import com.scandit.datacapture.core.component.DataCaptureComponent;
import com.scandit.datacapture.core.internal.sdk.common.geometry.NativeImageBuffer;
import com.scandit.datacapture.core.internal.sdk.component.NativeDataCaptureComponent;
import com.scandit.datacapture.core.internal.sdk.extensions.CollectionsExtensionsKt;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import io.constructor.data.local.PreferencesHelper;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\n\u001a\u001b\u001c\u001d\u0019\u001e\u001f !\"B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003H\u0097\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00138WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006#"}, d2 = {"Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator;", "Lcom/scandit/datacapture/core/component/DataCaptureComponent;", "Lcom/scandit/datacapture/barcode/generator/BarcodeGeneratorProxy;", "Lcom/scandit/datacapture/barcode/internal/module/generator/NativeBarcodeGenerator;", "impl", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/generator/NativeBarcodeGenerator;)V", "Lcom/scandit/datacapture/core/internal/sdk/component/NativeDataCaptureComponent;", "_dataCaptureComponentImpl", "()Lcom/scandit/datacapture/core/internal/sdk/component/NativeDataCaptureComponent;", "_impl", "()Lcom/scandit/datacapture/barcode/internal/module/generator/NativeBarcodeGenerator;", "", "data", "", "imageWidth", "Landroid/graphics/Bitmap;", "generate", "([BI)Landroid/graphics/Bitmap;", "", "text", "(Ljava/lang/String;I)Landroid/graphics/Bitmap;", "getId", "()Ljava/lang/String;", PreferencesHelper.PREF_ID, "Companion", "AztecBarcodeGeneratorBuilder", "BarcodeGeneratorBuilder", "Code128BarcodeGeneratorBuilder", "Code39BarcodeGeneratorBuilder", "DataMatrixBarcodeGeneratorBuilder", "Ean13BarcodeGeneratorBuilder", "InterleavedTwoOfFiveBarcodeGeneratorBuilder", "QrCodeBarcodeGeneratorBuilder", "UpcaBarcodeGeneratorBuilder", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class BarcodeGenerator implements DataCaptureComponent, BarcodeGeneratorProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ BarcodeGeneratorProxyAdapter f121972a;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0015\u0010\u0006\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0015\u0010\n\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\t¨\u0006\f"}, d2 = {"Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$AztecBarcodeGeneratorBuilder;", "Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$BarcodeGeneratorBuilder;", "Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$QrCodeBarcodeGeneratorBuilder;", "dataCaptureContext", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;)V", "withLayers", "layers", "", "(Ljava/lang/Integer;)Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$AztecBarcodeGeneratorBuilder;", "withMinimumErrorCorrectionPercent", "minimumErrorCorrectionPercent", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AztecBarcodeGeneratorBuilder extends BarcodeGeneratorBuilder<QrCodeBarcodeGeneratorBuilder> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AztecBarcodeGeneratorBuilder(DataCaptureContext dataCaptureContext) {
            super(dataCaptureContext, NativeBarcodeGeneratorSymbology.AZTEC);
            Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        }

        public final AztecBarcodeGeneratorBuilder withLayers(Integer layers) {
            getOptions().setLayers$scandit_barcode_capture(layers);
            return this;
        }

        public final AztecBarcodeGeneratorBuilder withMinimumErrorCorrectionPercent(Integer minimumErrorCorrectionPercent) {
            getOptions().setMinimumErrorCorrectionPercent$scandit_barcode_capture(minimumErrorCorrectionPercent);
            return this;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\u0010\b\u0000\u0010\u0001 \u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002B\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0017\u001a\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$BarcodeGeneratorBuilder;", "BuilderType", "", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "Lcom/scandit/datacapture/barcode/internal/module/generator/NativeBarcodeGeneratorSymbology;", "symbology", "<init>", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;Lcom/scandit/datacapture/barcode/internal/module/generator/NativeBarcodeGeneratorSymbology;)V", "Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator;", "build", "()Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator;", "", "backgroundColor", "withBackgroundColor", "(I)Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$BarcodeGeneratorBuilder;", "foregroundColor", "withForegroundColor", "Lcom/scandit/datacapture/barcode/generator/BarcodeGeneratorOptions;", "c", "Lcom/scandit/datacapture/barcode/generator/BarcodeGeneratorOptions;", "getOptions$scandit_barcode_capture", "()Lcom/scandit/datacapture/barcode/generator/BarcodeGeneratorOptions;", "options", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
    public static abstract class BarcodeGeneratorBuilder<BuilderType extends BarcodeGeneratorBuilder<? extends BuilderType>> {

        /* renamed from: a, reason: collision with root package name */
        private final DataCaptureContext f121973a;

        /* renamed from: b, reason: collision with root package name */
        private final NativeBarcodeGeneratorSymbology f121974b;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final BarcodeGeneratorOptions options;

        public BarcodeGeneratorBuilder(DataCaptureContext dataCaptureContext, NativeBarcodeGeneratorSymbology symbology) {
            Intrinsics.j(dataCaptureContext, "dataCaptureContext");
            Intrinsics.j(symbology, "symbology");
            this.f121973a = dataCaptureContext;
            this.f121974b = symbology;
            this.options = Companion.access$createDefaultOptions(BarcodeGenerator.INSTANCE, symbology);
        }

        public final BarcodeGenerator build() {
            return Companion.access$create(BarcodeGenerator.INSTANCE, this.f121973a, this.f121974b, this.options);
        }

        /* renamed from: getOptions$scandit_barcode_capture, reason: from getter */
        public final BarcodeGeneratorOptions getOptions() {
            return this.options;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final BuilderType withBackgroundColor(int backgroundColor) {
            this.options.setBackgroundColor$scandit_barcode_capture(Integer.valueOf(backgroundColor));
            Intrinsics.h(this, "null cannot be cast to non-null type BuilderType of com.scandit.datacapture.barcode.generator.BarcodeGenerator.BarcodeGeneratorBuilder");
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final BuilderType withForegroundColor(int foregroundColor) {
            this.options.setForegroundColor$scandit_barcode_capture(Integer.valueOf(foregroundColor));
            Intrinsics.h(this, "null cannot be cast to non-null type BuilderType of com.scandit.datacapture.barcode.generator.BarcodeGenerator.BarcodeGeneratorBuilder");
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$Code128BarcodeGeneratorBuilder;", "Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$BarcodeGeneratorBuilder;", "dataCaptureContext", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Code128BarcodeGeneratorBuilder extends BarcodeGeneratorBuilder<Code128BarcodeGeneratorBuilder> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Code128BarcodeGeneratorBuilder(DataCaptureContext dataCaptureContext) {
            super(dataCaptureContext, NativeBarcodeGeneratorSymbology.CODE128);
            Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$Code39BarcodeGeneratorBuilder;", "Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$BarcodeGeneratorBuilder;", "dataCaptureContext", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Code39BarcodeGeneratorBuilder extends BarcodeGeneratorBuilder<Code39BarcodeGeneratorBuilder> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Code39BarcodeGeneratorBuilder(DataCaptureContext dataCaptureContext) {
            super(dataCaptureContext, NativeBarcodeGeneratorSymbology.CODE39);
            Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$Companion;", "", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$Code39BarcodeGeneratorBuilder;", "code39BarcodeGeneratorBuilder", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;)Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$Code39BarcodeGeneratorBuilder;", "Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$Code128BarcodeGeneratorBuilder;", "code128BarcodeGeneratorBuilder", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;)Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$Code128BarcodeGeneratorBuilder;", "Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$Ean13BarcodeGeneratorBuilder;", "ean13BarcodeGeneratorBuilder", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;)Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$Ean13BarcodeGeneratorBuilder;", "Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$UpcaBarcodeGeneratorBuilder;", "upcaBarcodeGeneratorBuilder", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;)Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$UpcaBarcodeGeneratorBuilder;", "Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$InterleavedTwoOfFiveBarcodeGeneratorBuilder;", "interleavedTwoOfFiveBarcodeGeneratorBuilder", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;)Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$InterleavedTwoOfFiveBarcodeGeneratorBuilder;", "Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$QrCodeBarcodeGeneratorBuilder;", "qrCodeBarcodeGeneratorBuilder", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;)Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$QrCodeBarcodeGeneratorBuilder;", "Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$DataMatrixBarcodeGeneratorBuilder;", "dataMatrixBarcodeGeneratorBuilder", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;)Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$DataMatrixBarcodeGeneratorBuilder;", "Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$AztecBarcodeGeneratorBuilder;", "aztecBarcodeGeneratorBuilder", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;)Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$AztecBarcodeGeneratorBuilder;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        @JvmStatic
        public final AztecBarcodeGeneratorBuilder aztecBarcodeGeneratorBuilder(DataCaptureContext dataCaptureContext) {
            Intrinsics.j(dataCaptureContext, "dataCaptureContext");
            return new AztecBarcodeGeneratorBuilder(dataCaptureContext);
        }

        @JvmStatic
        public final Code128BarcodeGeneratorBuilder code128BarcodeGeneratorBuilder(DataCaptureContext dataCaptureContext) {
            Intrinsics.j(dataCaptureContext, "dataCaptureContext");
            return new Code128BarcodeGeneratorBuilder(dataCaptureContext);
        }

        @JvmStatic
        public final Code39BarcodeGeneratorBuilder code39BarcodeGeneratorBuilder(DataCaptureContext dataCaptureContext) {
            Intrinsics.j(dataCaptureContext, "dataCaptureContext");
            return new Code39BarcodeGeneratorBuilder(dataCaptureContext);
        }

        @JvmStatic
        public final DataMatrixBarcodeGeneratorBuilder dataMatrixBarcodeGeneratorBuilder(DataCaptureContext dataCaptureContext) {
            Intrinsics.j(dataCaptureContext, "dataCaptureContext");
            return new DataMatrixBarcodeGeneratorBuilder(dataCaptureContext);
        }

        @JvmStatic
        public final Ean13BarcodeGeneratorBuilder ean13BarcodeGeneratorBuilder(DataCaptureContext dataCaptureContext) {
            Intrinsics.j(dataCaptureContext, "dataCaptureContext");
            return new Ean13BarcodeGeneratorBuilder(dataCaptureContext);
        }

        @JvmStatic
        public final InterleavedTwoOfFiveBarcodeGeneratorBuilder interleavedTwoOfFiveBarcodeGeneratorBuilder(DataCaptureContext dataCaptureContext) {
            Intrinsics.j(dataCaptureContext, "dataCaptureContext");
            return new InterleavedTwoOfFiveBarcodeGeneratorBuilder(dataCaptureContext);
        }

        @JvmStatic
        public final QrCodeBarcodeGeneratorBuilder qrCodeBarcodeGeneratorBuilder(DataCaptureContext dataCaptureContext) {
            Intrinsics.j(dataCaptureContext, "dataCaptureContext");
            return new QrCodeBarcodeGeneratorBuilder(dataCaptureContext);
        }

        @JvmStatic
        public final UpcaBarcodeGeneratorBuilder upcaBarcodeGeneratorBuilder(DataCaptureContext dataCaptureContext) {
            Intrinsics.j(dataCaptureContext, "dataCaptureContext");
            return new UpcaBarcodeGeneratorBuilder(dataCaptureContext);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static final BarcodeGenerator access$create(Companion companion, DataCaptureContext dataCaptureContext, NativeBarcodeGeneratorSymbology nativeBarcodeGeneratorSymbology, BarcodeGeneratorOptions barcodeGeneratorOptions) {
            companion.getClass();
            NativeBarcodeGeneratorFactoryResult nativeBarcodeGeneratorFactoryResultCreate = NativeBarcodeGenerator.create(dataCaptureContext.getF125005a(), nativeBarcodeGeneratorSymbology, BarcodeGeneratorKt.toNativeOptions(barcodeGeneratorOptions));
            Intrinsics.i(nativeBarcodeGeneratorFactoryResultCreate, "create(...)");
            if (nativeBarcodeGeneratorFactoryResultCreate.ok()) {
                NativeBarcodeGenerator nativeBarcodeGeneratorValue = nativeBarcodeGeneratorFactoryResultCreate.value();
                Intrinsics.i(nativeBarcodeGeneratorValue, "value(...)");
                return new BarcodeGenerator(nativeBarcodeGeneratorValue);
            }
            throw new InvalidParameterException(nativeBarcodeGeneratorFactoryResultCreate.error());
        }

        public static final BarcodeGeneratorOptions access$createDefaultOptions(Companion companion, NativeBarcodeGeneratorSymbology nativeBarcodeGeneratorSymbology) {
            companion.getClass();
            NativeBarcodeGeneratorOptions nativeBarcodeGeneratorOptionsCreateDefaultOptions = NativeBarcodeGenerator.createDefaultOptions(nativeBarcodeGeneratorSymbology);
            Intrinsics.i(nativeBarcodeGeneratorOptionsCreateDefaultOptions, "createDefaultOptions(...)");
            return BarcodeGeneratorKt.access$toApi(nativeBarcodeGeneratorOptionsCreateDefaultOptions);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$DataMatrixBarcodeGeneratorBuilder;", "Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$BarcodeGeneratorBuilder;", "dataCaptureContext", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DataMatrixBarcodeGeneratorBuilder extends BarcodeGeneratorBuilder<DataMatrixBarcodeGeneratorBuilder> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DataMatrixBarcodeGeneratorBuilder(DataCaptureContext dataCaptureContext) {
            super(dataCaptureContext, NativeBarcodeGeneratorSymbology.DATA_MATRIX);
            Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$Ean13BarcodeGeneratorBuilder;", "Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$BarcodeGeneratorBuilder;", "dataCaptureContext", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Ean13BarcodeGeneratorBuilder extends BarcodeGeneratorBuilder<Ean13BarcodeGeneratorBuilder> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ean13BarcodeGeneratorBuilder(DataCaptureContext dataCaptureContext) {
            super(dataCaptureContext, NativeBarcodeGeneratorSymbology.EAN13);
            Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$InterleavedTwoOfFiveBarcodeGeneratorBuilder;", "Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$BarcodeGeneratorBuilder;", "dataCaptureContext", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InterleavedTwoOfFiveBarcodeGeneratorBuilder extends BarcodeGeneratorBuilder<InterleavedTwoOfFiveBarcodeGeneratorBuilder> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InterleavedTwoOfFiveBarcodeGeneratorBuilder(DataCaptureContext dataCaptureContext) {
            super(dataCaptureContext, NativeBarcodeGeneratorSymbology.INTERLEAVED_TWO_OF_FIVE);
            Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$QrCodeBarcodeGeneratorBuilder;", "Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$BarcodeGeneratorBuilder;", "dataCaptureContext", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;)V", "withErrorCorrectionLevel", "errorCorrectionLevel", "Lcom/scandit/datacapture/barcode/generator/QrCodeErrorCorrectionLevel;", "withVersionNumber", "versionNumber", "", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class QrCodeBarcodeGeneratorBuilder extends BarcodeGeneratorBuilder<QrCodeBarcodeGeneratorBuilder> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QrCodeBarcodeGeneratorBuilder(DataCaptureContext dataCaptureContext) {
            super(dataCaptureContext, NativeBarcodeGeneratorSymbology.QR);
            Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        }

        public final QrCodeBarcodeGeneratorBuilder withErrorCorrectionLevel(QrCodeErrorCorrectionLevel errorCorrectionLevel) {
            Intrinsics.j(errorCorrectionLevel, "errorCorrectionLevel");
            getOptions().setErrorCorrectionLevel$scandit_barcode_capture(errorCorrectionLevel);
            return this;
        }

        public final QrCodeBarcodeGeneratorBuilder withVersionNumber(int versionNumber) {
            getOptions().setVersionNumber$scandit_barcode_capture(Integer.valueOf(versionNumber));
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$UpcaBarcodeGeneratorBuilder;", "Lcom/scandit/datacapture/barcode/generator/BarcodeGenerator$BarcodeGeneratorBuilder;", "dataCaptureContext", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UpcaBarcodeGeneratorBuilder extends BarcodeGeneratorBuilder<UpcaBarcodeGeneratorBuilder> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpcaBarcodeGeneratorBuilder(DataCaptureContext dataCaptureContext) {
            super(dataCaptureContext, NativeBarcodeGeneratorSymbology.UPCA);
            Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        }
    }

    @JvmStatic
    public static final AztecBarcodeGeneratorBuilder aztecBarcodeGeneratorBuilder(DataCaptureContext dataCaptureContext) {
        return INSTANCE.aztecBarcodeGeneratorBuilder(dataCaptureContext);
    }

    @JvmStatic
    public static final Code128BarcodeGeneratorBuilder code128BarcodeGeneratorBuilder(DataCaptureContext dataCaptureContext) {
        return INSTANCE.code128BarcodeGeneratorBuilder(dataCaptureContext);
    }

    @JvmStatic
    public static final Code39BarcodeGeneratorBuilder code39BarcodeGeneratorBuilder(DataCaptureContext dataCaptureContext) {
        return INSTANCE.code39BarcodeGeneratorBuilder(dataCaptureContext);
    }

    @JvmStatic
    public static final DataMatrixBarcodeGeneratorBuilder dataMatrixBarcodeGeneratorBuilder(DataCaptureContext dataCaptureContext) {
        return INSTANCE.dataMatrixBarcodeGeneratorBuilder(dataCaptureContext);
    }

    @JvmStatic
    public static final Ean13BarcodeGeneratorBuilder ean13BarcodeGeneratorBuilder(DataCaptureContext dataCaptureContext) {
        return INSTANCE.ean13BarcodeGeneratorBuilder(dataCaptureContext);
    }

    @JvmStatic
    public static final InterleavedTwoOfFiveBarcodeGeneratorBuilder interleavedTwoOfFiveBarcodeGeneratorBuilder(DataCaptureContext dataCaptureContext) {
        return INSTANCE.interleavedTwoOfFiveBarcodeGeneratorBuilder(dataCaptureContext);
    }

    @JvmStatic
    public static final QrCodeBarcodeGeneratorBuilder qrCodeBarcodeGeneratorBuilder(DataCaptureContext dataCaptureContext) {
        return INSTANCE.qrCodeBarcodeGeneratorBuilder(dataCaptureContext);
    }

    @JvmStatic
    public static final UpcaBarcodeGeneratorBuilder upcaBarcodeGeneratorBuilder(DataCaptureContext dataCaptureContext) {
        return INSTANCE.upcaBarcodeGeneratorBuilder(dataCaptureContext);
    }

    @Override // com.scandit.datacapture.core.component.DataCaptureComponent, com.scandit.datacapture.barcode.generator.BarcodeGeneratorProxy
    @NativeImpl
    /* renamed from: _dataCaptureComponentImpl */
    public NativeDataCaptureComponent getF121985c() {
        return this.f121972a.getF121985c();
    }

    @Override // com.scandit.datacapture.barcode.generator.BarcodeGeneratorProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeBarcodeGenerator getF121983a() {
        return this.f121972a.getF121983a();
    }

    public final Bitmap generate(byte[] data, int imageWidth) {
        Intrinsics.j(data, "data");
        NativeBarcodeGeneratorGenerateResult nativeBarcodeGeneratorGenerateResultGenerate = getF121983a().generate(data, CollectionsExtensionsKt.toArrayList(CollectionsKt.m()));
        if (!nativeBarcodeGeneratorGenerateResultGenerate.ok()) {
            String strError = nativeBarcodeGeneratorGenerateResultGenerate.error();
            Intrinsics.g(strError);
            if (StringsKt.b0(strError, "Invalid input", true)) {
                throw new IllegalArgumentException(strError);
            }
            throw new RuntimeException(strError);
        }
        NativeImageBuffer imageBuffer = nativeBarcodeGeneratorGenerateResultGenerate.value().getImageBuffer();
        int width = imageBuffer.getWidth();
        int height = imageBuffer.getHeight();
        ArrayList<ImagePlane> planes = imageBuffer.getPlanes();
        Intrinsics.i(planes, "getPlanes(...)");
        ImageBuffer imageBuffer2 = new ImageBuffer(width, height, planes);
        if (imageWidth == imageBuffer2.getWidth()) {
            return imageBuffer2.toBitmap();
        }
        if (imageWidth <= 0) {
            throw new IllegalStateException("Image width should be bigger than zero!");
        }
        int width2 = (int) (imageWidth / (imageBuffer2.getWidth() / imageBuffer2.getHeight()));
        if (imageWidth < imageBuffer2.getWidth()) {
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(imageBuffer2.toBitmap(), imageWidth, width2, true);
            Intrinsics.i(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
            return bitmapCreateScaledBitmap;
        }
        Bitmap bitmapAccess$toBitmap = BarcodeGeneratorKt.access$toBitmap(imageBuffer2, imageWidth, width2);
        int iCeil = (int) Math.ceil(r2 / imageBuffer2.getWidth());
        Bitmap bitmapCreateScaledBitmap2 = Bitmap.createScaledBitmap(bitmapAccess$toBitmap, imageBuffer2.getWidth() * iCeil, imageBuffer2.getHeight() * iCeil, false);
        Intrinsics.i(bitmapCreateScaledBitmap2, "createScaledBitmap(...)");
        bitmapAccess$toBitmap.reconfigure(imageWidth, width2, Bitmap.Config.ARGB_8888);
        Paint paint = new Paint();
        paint.setFilterBitmap(true);
        new Canvas(bitmapAccess$toBitmap).drawBitmap(bitmapCreateScaledBitmap2, (Rect) null, new RectF(0.0f, 0.0f, bitmapAccess$toBitmap.getWidth(), bitmapAccess$toBitmap.getHeight()), paint);
        FS.bitmap_recycle(bitmapCreateScaledBitmap2);
        return bitmapAccess$toBitmap;
    }

    @Override // com.scandit.datacapture.core.component.DataCaptureComponent, com.scandit.datacapture.barcode.generator.BarcodeGeneratorProxy
    @ProxyFunction(nativeName = "getIdentifier", property = PreferencesHelper.PREF_ID)
    public String getId() {
        return this.f121972a.getId();
    }

    public BarcodeGenerator(NativeBarcodeGenerator impl) {
        Intrinsics.j(impl, "impl");
        this.f121972a = new BarcodeGeneratorProxyAdapter(impl, null, 2, null);
    }

    public final Bitmap generate(String text, int imageWidth) {
        Intrinsics.j(text, "text");
        byte[] bytes = text.getBytes(Charsets.UTF_8);
        Intrinsics.i(bytes, "getBytes(...)");
        return generate(bytes, imageWidth);
    }
}
