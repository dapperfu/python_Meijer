package fsimpl;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Xfermode;
import com.fullstory.instrumentation.CurrentPlatform;
import java.lang.reflect.Method;

/* loaded from: classes14.dex */
public class aZ {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f131560a;

    /* renamed from: b, reason: collision with root package name */
    private static final Method f131561b;

    /* renamed from: c, reason: collision with root package name */
    private static final Method f131562c;

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f131563d;

    /* renamed from: e, reason: collision with root package name */
    private static final Method f131564e;

    /* renamed from: f, reason: collision with root package name */
    private static final Method f131565f;

    static {
        Method methodA = fT.a(-1, 31, PorterDuffColorFilter.class, "getColor", new Class[0]);
        f131561b = methodA;
        Method methodA2 = fT.a(-1, 31, PorterDuffColorFilter.class, "getMode", new Class[0]);
        f131562c = methodA2;
        f131560a = methodA == null || methodA2 == null;
        Method methodA3 = fT.a(31, C14108fz.f132297g, "getColor", new Class[0]);
        f131564e = methodA3;
        Method methodA4 = fT.a(31, C14108fz.f132297g, "getMode", new Class[0]);
        f131565f = methodA4;
        f131563d = methodA3 == null || methodA4 == null || C13975b.f131749a;
    }

    private void b(PorterDuffColorFilter porterDuffColorFilter, dG dGVar) {
        int iIntValue;
        PorterDuff.Mode mode;
        if (CurrentPlatform.SDK_INT_FIXED < 31) {
            iIntValue = porterDuffColorFilter.getColor();
            mode = porterDuffColorFilter.getMode();
        } else {
            try {
                iIntValue = ((Integer) f131561b.invoke(porterDuffColorFilter, new Object[0])).intValue();
                try {
                    mode = (PorterDuff.Mode) f131562c.invoke(porterDuffColorFilter, new Object[0]);
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
        if (f131560a) {
            return;
        }
        b(porterDuffColorFilter, dGVar);
    }

    public void a(PorterDuffXfermode porterDuffXfermode, dG dGVar) {
        try {
            if (C14002c.a(porterDuffXfermode)) {
                dGVar.n(C14002c.b(porterDuffXfermode));
            }
        } catch (Throwable th2) {
            dI.a("Failed to get Xfermode's PorterDuff Mode", th2);
        }
    }

    public void a(Object obj, dG dGVar) {
        if (!f131563d && C14108fz.f132297g.isInstance(obj)) {
            try {
                dGVar.j(((Integer) f131564e.invoke(obj, new Object[0])).intValue());
                Xfermode xfermodeA = C13975b.a((BlendMode) f131565f.invoke(obj, new Object[0]));
                if (C14002c.a(xfermodeA)) {
                    dGVar.k(C14002c.b(xfermodeA));
                }
            } catch (Throwable th2) {
                dI.a("Failed to serialize BlendModeColorFilter", th2);
            }
        }
    }
}
