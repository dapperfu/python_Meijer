package te;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: te.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17227a implements InterfaceC17229c {

    /* renamed from: a, reason: collision with root package name */
    private final float f162496a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17227a) && this.f162496a == ((C17227a) obj).f162496a;
    }

    @Override // te.InterfaceC17229c
    public float a(RectF rectF) {
        return this.f162496a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f162496a)});
    }

    public C17227a(float f10) {
        this.f162496a = f10;
    }
}
