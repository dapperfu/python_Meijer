package V0;

import W0.AbstractC5391c;
import W0.TransferParameters;
import android.graphics.ColorSpace;
import android.os.Build;
import java.util.function.DoubleUnaryOperator;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LV0/X0;", "", "<init>", "()V", "LW0/c;", "Landroid/graphics/ColorSpace;", "c", "(LW0/c;)Landroid/graphics/ColorSpace;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class X0 {

    /* renamed from: a, reason: collision with root package name */
    public static final X0 f36436a = new X0();

    @JvmStatic
    public static final ColorSpace c(AbstractC5391c abstractC5391c) {
        ColorSpace.Rgb.TransferParameters transferParametersA;
        ColorSpace.Rgb rgbA;
        ColorSpace colorSpaceA;
        W0.k kVar = W0.k.f38267a;
        if (Intrinsics.e(abstractC5391c, kVar.G())) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        if (Intrinsics.e(abstractC5391c, kVar.m())) {
            return ColorSpace.get(ColorSpace.Named.ACES);
        }
        if (Intrinsics.e(abstractC5391c, kVar.n())) {
            return ColorSpace.get(ColorSpace.Named.ACESCG);
        }
        if (Intrinsics.e(abstractC5391c, kVar.o())) {
            return ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        }
        if (Intrinsics.e(abstractC5391c, kVar.p())) {
            return ColorSpace.get(ColorSpace.Named.BT2020);
        }
        if (Intrinsics.e(abstractC5391c, kVar.s())) {
            return ColorSpace.get(ColorSpace.Named.BT709);
        }
        if (Intrinsics.e(abstractC5391c, kVar.t())) {
            return ColorSpace.get(ColorSpace.Named.CIE_LAB);
        }
        if (Intrinsics.e(abstractC5391c, kVar.u())) {
            return ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        }
        if (Intrinsics.e(abstractC5391c, kVar.w())) {
            return ColorSpace.get(ColorSpace.Named.DCI_P3);
        }
        if (Intrinsics.e(abstractC5391c, kVar.x())) {
            return ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        }
        if (Intrinsics.e(abstractC5391c, kVar.y())) {
            return ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        }
        if (Intrinsics.e(abstractC5391c, kVar.z())) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        }
        if (Intrinsics.e(abstractC5391c, kVar.A())) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        }
        if (Intrinsics.e(abstractC5391c, kVar.B())) {
            return ColorSpace.get(ColorSpace.Named.NTSC_1953);
        }
        if (Intrinsics.e(abstractC5391c, kVar.E())) {
            return ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        if (Intrinsics.e(abstractC5391c, kVar.F())) {
            return ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        if (Build.VERSION.SDK_INT >= 34 && (colorSpaceA = C5301a1.a(abstractC5391c)) != null) {
            return colorSpaceA;
        }
        if (!(abstractC5391c instanceof W0.F)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        W0.F f10 = (W0.F) abstractC5391c;
        float[] fArrC = f10.getWhitePoint().c();
        TransferParameters transferParameters = f10.getTransferParameters();
        if (transferParameters != null) {
            O0.a();
            transferParametersA = C5361y0.a(transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma());
        } else {
            transferParametersA = null;
        }
        if (transferParametersA != null) {
            P0.a();
            rgbA = J0.a(abstractC5391c.getName(), f10.getPrimaries(), fArrC, transferParametersA);
        } else {
            P0.a();
            String name = abstractC5391c.getName();
            float[] primaries = f10.getPrimaries();
            final Function1<Double, Double> function1D = f10.D();
            DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: V0.V0
                @Override // java.util.function.DoubleUnaryOperator
                public final double applyAsDouble(double d10) {
                    return X0.d(function1D, d10);
                }
            };
            final Function1<Double, Double> function1Z = f10.z();
            rgbA = N0.a(name, primaries, fArrC, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: V0.W0
                @Override // java.util.function.DoubleUnaryOperator
                public final double applyAsDouble(double d10) {
                    return X0.e(function1Z, d10);
                }
            }, abstractC5391c.f(0), abstractC5391c.e(0));
        }
        return I0.a(rgbA);
    }

    private X0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double d(Function1 function1, double d10) {
        return ((Number) function1.invoke(Double.valueOf(d10))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double e(Function1 function1, double d10) {
        return ((Number) function1.invoke(Double.valueOf(d10))).doubleValue();
    }
}
