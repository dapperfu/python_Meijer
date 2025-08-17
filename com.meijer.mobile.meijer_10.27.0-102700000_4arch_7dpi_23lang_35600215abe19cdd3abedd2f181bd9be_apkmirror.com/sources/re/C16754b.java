package re;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: re.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16754b implements InterfaceC16755c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC16755c f158007a;

    /* renamed from: b, reason: collision with root package name */
    private final float f158008b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16754b)) {
            return false;
        }
        C16754b c16754b = (C16754b) obj;
        return this.f158007a.equals(c16754b.f158007a) && this.f158008b == c16754b.f158008b;
    }

    @Override // re.InterfaceC16755c
    public float a(RectF rectF) {
        return Math.max(0.0f, this.f158007a.a(rectF) + this.f158008b);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f158007a, Float.valueOf(this.f158008b)});
    }

    public C16754b(float f10, InterfaceC16755c interfaceC16755c) {
        while (interfaceC16755c instanceof C16754b) {
            interfaceC16755c = ((C16754b) interfaceC16755c).f158007a;
            f10 += ((C16754b) interfaceC16755c).f158008b;
        }
        this.f158007a = interfaceC16755c;
        this.f158008b = f10;
    }
}
