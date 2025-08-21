package te;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: te.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17228b implements InterfaceC17229c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC17229c f162497a;

    /* renamed from: b, reason: collision with root package name */
    private final float f162498b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17228b)) {
            return false;
        }
        C17228b c17228b = (C17228b) obj;
        return this.f162497a.equals(c17228b.f162497a) && this.f162498b == c17228b.f162498b;
    }

    @Override // te.InterfaceC17229c
    public float a(RectF rectF) {
        return Math.max(0.0f, this.f162497a.a(rectF) + this.f162498b);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f162497a, Float.valueOf(this.f162498b)});
    }

    public C17228b(float f10, InterfaceC17229c interfaceC17229c) {
        while (interfaceC17229c instanceof C17228b) {
            interfaceC17229c = ((C17228b) interfaceC17229c).f162497a;
            f10 += ((C17228b) interfaceC17229c).f162498b;
        }
        this.f162497a = interfaceC17229c;
        this.f162498b = f10;
    }
}
