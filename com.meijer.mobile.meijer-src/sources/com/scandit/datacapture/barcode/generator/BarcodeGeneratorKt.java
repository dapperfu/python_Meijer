package com.scandit.datacapture.barcode.generator;

import android.graphics.Bitmap;
import com.scandit.datacapture.barcode.internal.module.generator.NativeBarcodeGeneratorOptions;
import com.scandit.datacapture.barcode.internal.module.generator.NativeQrCodeErrorCorrectionLevel;
import com.scandit.datacapture.core.common.graphic.ImageBuffer;
import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeColor;
import com.scandit.datacapture.core.internal.sdk.extensions.NativeColorExtensionsKt;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/scandit/datacapture/barcode/generator/BarcodeGeneratorOptions;", "Lcom/scandit/datacapture/barcode/internal/module/generator/NativeBarcodeGeneratorOptions;", "toNativeOptions", "(Lcom/scandit/datacapture/barcode/generator/BarcodeGeneratorOptions;)Lcom/scandit/datacapture/barcode/internal/module/generator/NativeBarcodeGeneratorOptions;", "scandit-barcode-capture"}, k = 2, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class BarcodeGeneratorKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[QrCodeErrorCorrectionLevel.values().length];
            try {
                iArr[QrCodeErrorCorrectionLevel.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[QrCodeErrorCorrectionLevel.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[QrCodeErrorCorrectionLevel.QUARTILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[QrCodeErrorCorrectionLevel.HIGH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[NativeQrCodeErrorCorrectionLevel.values().length];
            try {
                iArr2[NativeQrCodeErrorCorrectionLevel.L.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[NativeQrCodeErrorCorrectionLevel.M.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[NativeQrCodeErrorCorrectionLevel.Q.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[NativeQrCodeErrorCorrectionLevel.H.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final Bitmap access$toBitmap(ImageBuffer imageBuffer, int i10, int i11) {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, config);
        Intrinsics.i(bitmapCreateBitmap, "createBitmap(...)");
        bitmapCreateBitmap.reconfigure(imageBuffer.getF125096a().getWidth(), imageBuffer.getF125096a().getHeight(), config);
        bitmapCreateBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(imageBuffer.getF125096a().toBitmap()));
        return bitmapCreateBitmap;
    }

    public static final NativeBarcodeGeneratorOptions toNativeOptions(BarcodeGeneratorOptions barcodeGeneratorOptions) {
        Intrinsics.j(barcodeGeneratorOptions, "<this>");
        Integer backgroundColor = barcodeGeneratorOptions.getBackgroundColor();
        NativeQrCodeErrorCorrectionLevel nativeQrCodeErrorCorrectionLevel = null;
        NativeColor nativeColor = backgroundColor != null ? NativeColorExtensionsKt.toNativeColor(backgroundColor.intValue()) : null;
        Integer foregroundColor = barcodeGeneratorOptions.getForegroundColor();
        NativeColor nativeColor2 = foregroundColor != null ? NativeColorExtensionsKt.toNativeColor(foregroundColor.intValue()) : null;
        Integer numValueOf = Integer.valueOf(barcodeGeneratorOptions.getUnitSize());
        QrCodeErrorCorrectionLevel errorCorrectionLevel = barcodeGeneratorOptions.getErrorCorrectionLevel();
        if (errorCorrectionLevel != null) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[errorCorrectionLevel.ordinal()];
            if (i10 == 1) {
                nativeQrCodeErrorCorrectionLevel = NativeQrCodeErrorCorrectionLevel.L;
            } else if (i10 == 2) {
                nativeQrCodeErrorCorrectionLevel = NativeQrCodeErrorCorrectionLevel.M;
            } else if (i10 == 3) {
                nativeQrCodeErrorCorrectionLevel = NativeQrCodeErrorCorrectionLevel.Q;
            } else {
                if (i10 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                nativeQrCodeErrorCorrectionLevel = NativeQrCodeErrorCorrectionLevel.H;
            }
        }
        return new NativeBarcodeGeneratorOptions(nativeColor, nativeColor2, numValueOf, nativeQrCodeErrorCorrectionLevel, barcodeGeneratorOptions.getVersionNumber(), barcodeGeneratorOptions.getMinimumErrorCorrectionPercent(), barcodeGeneratorOptions.getLayers());
    }

    public static final BarcodeGeneratorOptions access$toApi(NativeBarcodeGeneratorOptions nativeBarcodeGeneratorOptions) {
        QrCodeErrorCorrectionLevel qrCodeErrorCorrectionLevel;
        NativeColor backgroundColor = nativeBarcodeGeneratorOptions.getBackgroundColor();
        Intrinsics.i(backgroundColor, "getBackgroundColor(...)");
        int i10 = NativeColorExtensionsKt.toInt(backgroundColor);
        NativeColor foregroundColor = nativeBarcodeGeneratorOptions.getForegroundColor();
        Intrinsics.i(foregroundColor, "getForegroundColor(...)");
        int i11 = NativeColorExtensionsKt.toInt(foregroundColor);
        Integer versionNumber = nativeBarcodeGeneratorOptions.getVersionNumber();
        NativeQrCodeErrorCorrectionLevel errorCorrectionLevel = nativeBarcodeGeneratorOptions.getErrorCorrectionLevel();
        if (errorCorrectionLevel != null) {
            int i12 = WhenMappings.$EnumSwitchMapping$1[errorCorrectionLevel.ordinal()];
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 == 4) {
                            qrCodeErrorCorrectionLevel = QrCodeErrorCorrectionLevel.HIGH;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        qrCodeErrorCorrectionLevel = QrCodeErrorCorrectionLevel.QUARTILE;
                    }
                } else {
                    qrCodeErrorCorrectionLevel = QrCodeErrorCorrectionLevel.MEDIUM;
                }
            } else {
                qrCodeErrorCorrectionLevel = QrCodeErrorCorrectionLevel.LOW;
            }
        } else {
            qrCodeErrorCorrectionLevel = null;
        }
        QrCodeErrorCorrectionLevel qrCodeErrorCorrectionLevel2 = qrCodeErrorCorrectionLevel;
        Integer unitSize = nativeBarcodeGeneratorOptions.getUnitSize();
        Integer minimumErrorCorrectionPercent = nativeBarcodeGeneratorOptions.getMinimumErrorCorrectionPercent();
        Integer layers = nativeBarcodeGeneratorOptions.getLayers();
        Integer numValueOf = Integer.valueOf(i10);
        Integer numValueOf2 = Integer.valueOf(i11);
        Intrinsics.g(unitSize);
        return new BarcodeGeneratorOptions(numValueOf, numValueOf2, unitSize.intValue(), qrCodeErrorCorrectionLevel2, versionNumber, minimumErrorCorrectionPercent, layers);
    }
}
