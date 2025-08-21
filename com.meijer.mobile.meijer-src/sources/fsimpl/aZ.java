package fsimpl;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Xfermode;
import com.fullstory.instrumentation.CurrentPlatform;
import java.lang.reflect.Method;

/* loaded from: classes15.dex */
public class aZ {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f132810a;

    /* renamed from: b, reason: collision with root package name */
    private static final Method f132811b;

    /* renamed from: c, reason: collision with root package name */
    private static final Method f132812c;

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f132813d;

    /* renamed from: e, reason: collision with root package name */
    private static final Method f132814e;

    /* renamed from: f, reason: collision with root package name */
    private static final Method f132815f;

    static {
        Method methodA = fT.a(-1, 31, PorterDuffColorFilter.class, "getColor", new Class[0]);
        f132811b = methodA;
        Method methodA2 = fT.a(-1, 31, PorterDuffColorFilter.class, "getMode", new Class[0]);
        f132812c = methodA2;
        f132810a = methodA == null || methodA2 == null;
        Method methodA3 = fT.a(31, C14233fz.f133547g, "getColor", new Class[0]);
        f132814e = methodA3;
        Method methodA4 = fT.a(31, C14233fz.f133547g, "getMode", new Class[0]);
        f132815f = methodA4;
        f132813d = methodA3 == null || methodA4 == null || C14100b.f132999a;
    }

    private void b(PorterDuffColorFilter porterDuffColorFilter, dG dGVar) {
        int iIntValue;
        PorterDuff.Mode mode;
        if (CurrentPlatform.SDK_INT_FIXED < 31) {
            iIntValue = porterDuffColorFilter.getColor();
            mode = porterDuffColorFilter.getMode();
        } else {
            try {
                iIntValue = ((Integer) f132811b.invoke(porterDuffColorFilter, new Object[0])).intValue();
                try {
                    mode = (PorterDuff.Mode) f132812c.invoke(porterDuffColorFilter, new Object[0]);
                } catch (Throwable th2) {
                    dI.a("Failed to get ColorFilter's Mode", th2);
                    return;
                }
            } catch (Throwable th3) {
                dI.a("Failed to get ColorFilter's color", th3);
                return;
            }
        }
        dGVar.j(iIntValue);
        dGVar.k(aY.a(mode));
    }

    public void a(PorterDuffColorFilter porterDuffColorFilter, dG dGVar) {
        if (f132810a) {
            return;
        }
        b(porterDuffColorFilter, dGVar);
    }

    public void a(PorterDuffXfermode porterDuffXfermode, dG dGVar) {
        try {
            if (C14127c.a(porterDuffXfermode)) {
                dGVar.n(C14127c.b(porterDuffXfermode));
            }
        } catch (Throwable th2) {
            dI.a("Failed to get Xfermode's PorterDuff Mode", th2);
        }
    }

    public void a(Object obj, dG dGVar) {
        if (!f132813d && C14233fz.f133547g.isInstance(obj)) {
            try {
                dGVar.j(((Integer) f132814e.invoke(obj, new Object[0])).intValue());
                Xfermode xfermodeA = C14100b.a((BlendMode) f132815f.invoke(obj, new Object[0]));
                if (C14127c.a(xfermodeA)) {
                    dGVar.k(C14127c.b(xfermodeA));
                }
            } catch (Throwable th2) {
                dI.a("Failed to serialize BlendModeColorFilter", th2);
            }
        }
    }
}
