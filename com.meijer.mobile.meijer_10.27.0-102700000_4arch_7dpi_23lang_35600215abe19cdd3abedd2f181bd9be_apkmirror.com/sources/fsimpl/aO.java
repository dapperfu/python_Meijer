package fsimpl;

import android.graphics.BitmapShader;
import android.graphics.Shader;
import com.fullstory.util.Log;
import java.lang.reflect.Field;

/* loaded from: classes14.dex */
public class aO {

    /* renamed from: a, reason: collision with root package name */
    private static final Field f131500a;

    /* renamed from: b, reason: collision with root package name */
    private static final Field f131501b;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f131502c;

    static {
        Field fieldA = fT.a(31, 30, BitmapShader.class, "mTileX");
        f131500a = fieldA;
        Field fieldA2 = fT.a(31, 30, BitmapShader.class, "mTileY");
        f131501b = fieldA2;
        if (fieldA != null && !fieldA.getType().equals(Shader.TileMode.class) && !fieldA.getType().equals(Integer.TYPE)) {
            Log.e("Unexpected type for mTileX: " + fieldA.getType());
        }
        if (fieldA2 != null && !fieldA2.getType().equals(Shader.TileMode.class) && !fieldA2.getType().equals(Integer.TYPE)) {
            Log.e("Unexpected type for mTileY: " + fieldA2.getType());
        }
        boolean z10 = fieldA == null || fieldA2 == null;
        f131502c = z10;
        if (z10) {
            Log.e("Failed to locate BitmapShader bits: tileX=" + fieldA + "; tileY=" + fieldA2);
        }
    }

    private int a(Object obj) {
        return obj instanceof Shader.TileMode ? C13978bc.a((Shader.TileMode) obj) : ((Integer) obj).intValue() + 1;
    }

    private void b(dG dGVar, BitmapShader bitmapShader) {
        try {
            dGVar.o(a(f131500a.get(bitmapShader)));
            dGVar.p(a(f131501b.get(bitmapShader)));
        } catch (Throwable th2) {
            dI.a("Failed to read bitmap shader", th2);
        }
    }

    public void a(dG dGVar, BitmapShader bitmapShader) {
        if (bitmapShader == null || f131502c) {
            return;
        }
        b(dGVar, bitmapShader);
    }
}
