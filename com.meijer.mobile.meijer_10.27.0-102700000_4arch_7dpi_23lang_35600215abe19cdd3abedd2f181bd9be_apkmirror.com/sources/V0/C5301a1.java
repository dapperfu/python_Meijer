package V0;

import W0.AbstractC5391c;
import android.graphics.ColorSpace;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LV0/a1;", "", "<init>", "()V", "LW0/c;", "colorSpace", "Landroid/graphics/ColorSpace;", "a", "(LW0/c;)Landroid/graphics/ColorSpace;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: V0.a1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5301a1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C5301a1 f36438a = new C5301a1();

    @JvmStatic
    public static final ColorSpace a(AbstractC5391c colorSpace) {
        W0.k kVar = W0.k.f38267a;
        if (Intrinsics.e(colorSpace, kVar.q())) {
            return ColorSpace.get(ColorSpace.Named.BT2020_HLG);
        }
        if (Intrinsics.e(colorSpace, kVar.r())) {
            return ColorSpace.get(ColorSpace.Named.BT2020_PQ);
        }
        return null;
    }

    private C5301a1() {
    }
}
