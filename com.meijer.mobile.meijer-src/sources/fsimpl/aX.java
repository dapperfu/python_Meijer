package fsimpl;

import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes15.dex */
public class aX extends aW {

    /* renamed from: b, reason: collision with root package name */
    private gf f132806b = new gf();

    private int b(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, false);
        return ((Float.floatToIntBits(rectF.top) ^ Integer.rotateLeft(Float.floatToIntBits(rectF.left), 8)) ^ Integer.rotateLeft(Float.floatToIntBits(rectF.bottom), 16)) ^ Integer.rotateLeft(Float.floatToIntBits(rectF.right), 24);
    }

    @Override // fsimpl.aW
    public int a(Path path) {
        int iB = b(path);
        if (this.f132806b.a(path) && this.f132806b.b(path) != iB) {
            this.f132803a.d(path);
        }
        this.f132806b.a(path, iB);
        return super.a((Object) path);
    }
}
