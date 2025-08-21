package te;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: te.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17237k implements InterfaceC17229c {

    /* renamed from: a, reason: collision with root package name */
    private final float f162553a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17237k) && this.f162553a == ((C17237k) obj).f162553a;
    }

    @Override // te.InterfaceC17229c
    public float a(RectF rectF) {
        return this.f162553a * b(rectF);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f162553a)});
    }

    public C17237k(float f10) {
        this.f162553a = f10;
    }

    private static float b(RectF rectF) {
        return Math.min(rectF.width(), rectF.height());
    }
}
