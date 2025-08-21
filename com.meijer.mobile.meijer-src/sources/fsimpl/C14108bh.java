package fsimpl;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Pair;
import com.fullstory.util.Log;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: fsimpl.bh, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C14108bh {

    /* renamed from: e, reason: collision with root package name */
    private aU f133079e;

    /* renamed from: c, reason: collision with root package name */
    private Map f133077c = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    gf f133075a = new gf();

    /* renamed from: b, reason: collision with root package name */
    WeakHashMap f133076b = new WeakHashMap();

    /* renamed from: d, reason: collision with root package name */
    private fI f133078d = new fI(256, 0.75f);

    public C14108bh(aU aUVar) {
        this.f133079e = aUVar;
    }

    private int a(Drawable drawable, int i10, ga gaVar, boolean z10) {
        int iA = this.f133079e.a();
        if (Build.VERSION.SDK_INT < 26 && (drawable instanceof AnimatedVectorDrawable)) {
            try {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState == null) {
                    Log.d("Could not get AnimatedVectorDrawable state, skipping recording the drawable");
                    return 0;
                }
                Field fieldA = fT.a(28, -1, constantState.getClass(), "mVectorDrawable");
                if (fieldA == null) {
                    Log.d("Could not get underlying VectorDrawable, skipping recording the drawable");
                    return 0;
                }
                drawable = (Drawable) fieldA.get(constantState);
            } catch (Throwable th2) {
                Log.e("Error thrown while trying to avoid drawing AnimatedVectorDrawable", th2);
                return 0;
            }
        }
        this.f133077c.put(Integer.valueOf(iA), Pair.create(drawable, gaVar));
        if (z10) {
            this.f133075a.a(drawable, iA);
            this.f133076b.put(drawable, gaVar);
            if (i10 != 0) {
                this.f133078d.b(i10, iA);
            }
        }
        return iA;
    }

    public int a(Drawable drawable) {
        if (!gb.a(drawable)) {
            Log.e("Only VectorDrawables and AnimatedVectorDrawables are allowed");
            return 0;
        }
        ga gaVarA = ga.a(drawable);
        int iA = C14107bg.a(drawable);
        if (gb.b(drawable)) {
            this.f133075a.d(drawable);
            this.f133076b.remove(drawable);
            if (iA != 0) {
                this.f133078d.b(iA);
            }
            return a(drawable, iA, gaVarA, false);
        }
        if (iA != 0) {
            int iA2 = this.f133078d.a(iA);
            ga gaVarB = C14107bg.b(drawable);
            if (iA2 != 0 && gaVarA.equals(gaVarB)) {
                return iA2;
            }
        }
        int iB = this.f133075a.b(drawable);
        return (iB == 0 || !gaVarA.equals((ga) this.f133076b.get(drawable))) ? a(drawable, iA, gaVarA, true) : iB;
    }

    public Map a() {
        if (this.f133077c.size() == 0) {
            return null;
        }
        Map map = this.f133077c;
        this.f133077c = new HashMap();
        return map;
    }
}
