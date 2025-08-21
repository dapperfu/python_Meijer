package d0;

import android.view.View;
import android.widget.Magnifier;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JR\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Ld0/O;", "Ld0/N;", "<init>", "()V", "Landroid/view/View;", "view", "", "useTextDefault", "LH1/k;", "size", "LH1/h;", "cornerRadius", "elevation", "clippingEnabled", "LH1/d;", "density", "", "initialZoom", "Ld0/O$a;", "c", "(Landroid/view/View;ZJFFZLH1/d;F)Ld0/O$a;", "Z", "b", "()Z", "canUpdateZoom", "a", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class O implements N {

    /* renamed from: b, reason: collision with root package name */
    public static final O f127683b = new O();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final boolean canUpdateZoom = false;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Ld0/O$a;", "Ld0/M;", "Landroid/widget/Magnifier;", "magnifier", "<init>", "(Landroid/widget/Magnifier;)V", "", "b", "()V", "LU0/f;", "sourceCenter", "magnifierCenter", "", "zoom", "a", "(JJF)V", "dismiss", "Landroid/widget/Magnifier;", "d", "()Landroid/widget/Magnifier;", "LH1/r;", "c", "()J", "size", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static class a implements M {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Magnifier magnifier;

        @Override // d0.M
        public void a(long sourceCenter, long magnifierCenter, float zoom) {
            this.magnifier.show(Float.intBitsToFloat((int) (sourceCenter >> 32)), Float.intBitsToFloat((int) (sourceCenter & 4294967295L)));
        }

        @Override // d0.M
        public void b() {
            this.magnifier.update();
        }

        @Override // d0.M
        public long c() {
            return H1.r.c((this.magnifier.getHeight() & 4294967295L) | (this.magnifier.getWidth() << 32));
        }

        /* renamed from: d, reason: from getter */
        public final Magnifier getMagnifier() {
            return this.magnifier;
        }

        @Override // d0.M
        public void dismiss() {
            this.magnifier.dismiss();
        }

        public a(Magnifier magnifier) {
            this.magnifier = magnifier;
        }
    }

    @Override // d0.N
    public boolean b() {
        return canUpdateZoom;
    }

    @Override // d0.N
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public a a(View view, boolean useTextDefault, long size, float cornerRadius, float elevation, boolean clippingEnabled, H1.d density, float initialZoom) {
        return new a(new Magnifier(view));
    }

    private O() {
    }
}
