package d0;

import android.view.View;
import android.widget.Magnifier;
import d0.O;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JR\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Ld0/P;", "Ld0/N;", "<init>", "()V", "Landroid/view/View;", "view", "", "useTextDefault", "LH1/k;", "size", "LH1/h;", "cornerRadius", "elevation", "clippingEnabled", "LH1/d;", "density", "", "initialZoom", "Ld0/P$a;", "c", "(Landroid/view/View;ZJFFZLH1/d;F)Ld0/P$a;", "Z", "b", "()Z", "canUpdateZoom", "a", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class P implements N {

    /* renamed from: b, reason: collision with root package name */
    public static final P f126884b = new P();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final boolean canUpdateZoom = true;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"Ld0/P$a;", "Ld0/O$a;", "Landroid/widget/Magnifier;", "magnifier", "<init>", "(Landroid/widget/Magnifier;)V", "LU0/f;", "sourceCenter", "magnifierCenter", "", "zoom", "", "a", "(JJF)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a extends O.a {
        public a(Magnifier magnifier) {
            super(magnifier);
        }

        @Override // d0.O.a, d0.M
        public void a(long sourceCenter, long magnifierCenter, float zoom) {
            if (!Float.isNaN(zoom)) {
                getMagnifier().setZoom(zoom);
            }
            if ((9223372034707292159L & magnifierCenter) != 9205357640488583168L) {
                getMagnifier().show(Float.intBitsToFloat((int) (sourceCenter >> 32)), Float.intBitsToFloat((int) (sourceCenter & 4294967295L)), Float.intBitsToFloat((int) (magnifierCenter >> 32)), Float.intBitsToFloat((int) (magnifierCenter & 4294967295L)));
            } else {
                getMagnifier().show(Float.intBitsToFloat((int) (sourceCenter >> 32)), Float.intBitsToFloat((int) (sourceCenter & 4294967295L)));
            }
        }
    }

    @Override // d0.N
    public boolean b() {
        return canUpdateZoom;
    }

    @Override // d0.N
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public a a(View view, boolean useTextDefault, long size, float cornerRadius, float elevation, boolean clippingEnabled, H1.d density, float initialZoom) {
        if (useTextDefault) {
            return new a(new Magnifier(view));
        }
        long jT = density.T(size);
        float fI1 = density.I1(cornerRadius);
        float fI12 = density.I1(elevation);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (jT != 9205357640488583168L) {
            builder.setSize(MathKt.d(Float.intBitsToFloat((int) (jT >> 32))), MathKt.d(Float.intBitsToFloat((int) (jT & 4294967295L))));
        }
        if (!Float.isNaN(fI1)) {
            builder.setCornerRadius(fI1);
        }
        if (!Float.isNaN(fI12)) {
            builder.setElevation(fI12);
        }
        if (!Float.isNaN(initialZoom)) {
            builder.setInitialZoom(initialZoom);
        }
        builder.setClippingEnabled(clippingEnabled);
        return new a(builder.build());
    }

    private P() {
    }
}
