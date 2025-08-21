package androidx.camera.camera2.internal.compat.quirk;

import F.g0;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import w.B;

/* loaded from: classes.dex */
public class AeFpsRangeLegacyQuirk implements g0 {

    /* renamed from: a, reason: collision with root package name */
    private final Range<Integer> f47428a;

    private Range<Integer> f(Range<Integer>[] rangeArr) {
        Range<Integer> range = null;
        if (rangeArr != null && rangeArr.length != 0) {
            for (Range<Integer> range2 : rangeArr) {
                Range<Integer> rangeC = c(range2);
                if (((Integer) rangeC.getUpper()).intValue() == 30 && (range == null || ((Integer) rangeC.getLower()).intValue() < ((Integer) range.getLower()).intValue())) {
                    range = rangeC;
                }
            }
        }
        return range;
    }

    static boolean e(B b10) {
        Integer num = (Integer) b10.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }

    public Range<Integer> d() {
        return this.f47428a;
    }

    public AeFpsRangeLegacyQuirk(B b10) {
        this.f47428a = f((Range[]) b10.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
    }

    private Range<Integer> c(Range<Integer> range) {
        int iIntValue = ((Integer) range.getUpper()).intValue();
        int iIntValue2 = ((Integer) range.getLower()).intValue();
        if (((Integer) range.getUpper()).intValue() >= 1000) {
            iIntValue = ((Integer) range.getUpper()).intValue() / 1000;
        }
        if (((Integer) range.getLower()).intValue() >= 1000) {
            iIntValue2 = ((Integer) range.getLower()).intValue() / 1000;
        }
        return new Range<>(Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue));
    }
}
