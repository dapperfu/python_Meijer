package d0;

import V0.AbstractC5480m1;
import V0.D1;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"Ld0/x;", "LV0/D1;", "<init>", "()V", "LU0/k;", "size", "LH1/t;", "layoutDirection", "LH1/d;", "density", "LV0/m1;", "a", "(JLH1/t;LH1/d;)LV0/m1;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: d0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C13589x implements D1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C13589x f127838a = new C13589x();

    private C13589x() {
    }

    @Override // V0.D1
    public AbstractC5480m1 a(long size, H1.t layoutDirection, H1.d density) {
        float fE0 = density.E0(C13579m.b());
        return new AbstractC5480m1.b(new Rect(0.0f, -fE0, Float.intBitsToFloat((int) (size >> 32)), Float.intBitsToFloat((int) (size & 4294967295L)) + fE0));
    }
}
