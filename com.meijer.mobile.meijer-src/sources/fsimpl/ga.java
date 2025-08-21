package fsimpl;

import android.graphics.drawable.Drawable;
import com.fullstory.util.Log;
import java.util.Arrays;

/* loaded from: classes15.dex */
public class ga {

    /* renamed from: a, reason: collision with root package name */
    public int f133558a;

    private ga(int i10) {
        this.f133558a = i10;
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
        return obj != null && getClass() == obj.getClass() && this.f133558a == ((ga) obj).f133558a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f133558a)});
    }
}
