package re;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: re.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16753a implements InterfaceC16755c {

    /* renamed from: a, reason: collision with root package name */
    private final float f158006a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16753a) && this.f158006a == ((C16753a) obj).f158006a;
    }

    @Override // re.InterfaceC16755c
    public float a(RectF rectF) {
        return this.f158006a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f158006a)});
    }

    public C16753a(float f10) {
        this.f158006a = f10;
    }
}
