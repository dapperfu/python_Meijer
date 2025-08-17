package fsimpl;

import android.graphics.drawable.Drawable;
import com.fullstory.util.Log;
import java.util.Arrays;

/* loaded from: classes14.dex */
public class ga {

    /* renamed from: a, reason: collision with root package name */
    public int f132308a;

    private ga(int i10) {
        this.f132308a = i10;
    }

    public static ga a(Drawable drawable) {
        if (!gb.a(drawable)) {
            Log.e("Only VectorDrawables and AnimatedVectorDrawables are allowed");
        }
        return new ga(drawable.getAlpha());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f132308a == ((ga) obj).f132308a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f132308a)});
    }
}
