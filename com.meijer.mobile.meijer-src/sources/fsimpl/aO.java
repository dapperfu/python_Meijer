package fsimpl;

import android.graphics.BitmapShader;
import android.graphics.Shader;
import com.fullstory.util.Log;
import java.lang.reflect.Field;

/* loaded from: classes15.dex */
public class aO {

    /* renamed from: a, reason: collision with root package name */
    private static final Field f132750a;

    /* renamed from: b, reason: collision with root package name */
    private static final Field f132751b;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f132752c;

    static {
        Field fieldA = fT.a(31, 30, BitmapShader.class, "mTileX");
        f132750a = fieldA;
        Field fieldA2 = fT.a(31, 30, BitmapShader.class, "mTileY");
        f132751b = fieldA2;
        if (fieldA != null && !fieldA.getType().equals(Shader.TileMode.class) && !fieldA.getType().equals(Integer.TYPE)) {
            Log.e("Unexpected type for mTileX: " + fieldA.getType());
        }
        if (fieldA2 != null && !fieldA2.getType().equals(Shader.TileMode.class) && !fieldA2.getType().equals(Integer.TYPE)) {
            Log.e("Unexpected type for mTileY: " + fieldA2.getType());
        }
        boolean z10 = fieldA == null || fieldA2 == null;
        f132752c = z10;
        if (z10) {
            Log.e("Failed to locate BitmapShader bits: tileX=" + fieldA + "; tileY=" + fieldA2);
        }
    }

    private int a(Object obj) {
        return obj instanceof Shader.TileMode ? C14103bc.a((Shader.TileMode) obj) : ((Integer) obj).intValue() + 1;
    }

    private void b(dG dGVar, BitmapShader bitmapShader) {
        try {
            dGVar.o(a(f132750a.get(bitmapShader)));
            dGVar.p(a(f132751b.get(bitmapShader)));
        } catch (Throwable th2) {
            dI.a("Failed to read bitmap shader", th2);
        }
    }

    public void a(dG dGVar, BitmapShader bitmapShader) {
        if (bitmapShader == null || f132752c) {
            return;
        }
        b(dGVar, bitmapShader);
    }
}
