package d0;

import android.view.ViewConfiguration;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0005\u001a\u001f\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\n\"\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u000e"}, d2 = {"LH1/d;", "density", "", "velocity", "b", "(LH1/d;F)F", "a", "F", "PlatformFlingScrollFriction", "", "D", "DecelerationRate", "c", "DecelMinusOne", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private static final float f127794a = ViewConfiguration.getScrollFriction();

    /* renamed from: b, reason: collision with root package name */
    private static final double f127795b;

    /* renamed from: c, reason: collision with root package name */
    private static final double f127796c;

    static {
        double dLog = Math.log(0.78d) / Math.log(0.9d);
        f127795b = dLog;
        f127796c = dLog - 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float b(H1.d dVar, float f10) {
        double density = dVar.getDensity() * 386.0878f * 160.0f * 0.84f;
        double dAbs = Math.abs(f10) * 0.35f;
        float f11 = f127794a;
        return (float) (f11 * density * Math.exp((f127795b / f127796c) * Math.log(dAbs / (f11 * density))));
    }
}
