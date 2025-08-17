package re;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: re.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16763k implements InterfaceC16755c {

    /* renamed from: a, reason: collision with root package name */
    private final float f158063a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16763k) && this.f158063a == ((C16763k) obj).f158063a;
    }

    @Override // re.InterfaceC16755c
    public float a(RectF rectF) {
        return this.f158063a * b(rectF);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f158063a)});
    }

    public C16763k(float f10) {
        this.f158063a = f10;
    }

    private static float b(RectF rectF) {
        return Math.min(rectF.width(), rectF.height());
    }
}
