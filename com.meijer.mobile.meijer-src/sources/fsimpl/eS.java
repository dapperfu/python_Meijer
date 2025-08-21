package fsimpl;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes15.dex */
public class eS {

    /* renamed from: a, reason: collision with root package name */
    private static final Field f133355a = fT.a(C14233fz.f133546f, "mViews");

    /* renamed from: b, reason: collision with root package name */
    private static final Object f133356b;

    /* renamed from: c, reason: collision with root package name */
    private static final Object f133357c;

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f133358d;

    static {
        Object obj;
        Object objInvoke;
        boolean z10 = false;
        Method methodA = fT.a(C14233fz.f133546f, "getInstance", new Class[0]);
        Field fieldA = fT.a(C14233fz.f133546f, "mLock");
        Object obj2 = null;
        if (fieldA == null || methodA == null) {
            obj = null;
        } else {
            try {
                objInvoke = methodA.invoke(null, new Object[0]);
                try {
                    obj2 = fieldA.get(objInvoke);
                } catch (Throwable th2) {
                }
            } catch (Throwable th3) {
                objInvoke = null;
            }
            Object obj3 = obj2;
            obj2 = objInvoke;
            obj = obj3;
        }
        f133357c = obj2;
        f133356b = obj;
        if (f133355a != null && obj2 != null && obj != null) {
            z10 = true;
        }
        f133358d = z10;
    }

    public static boolean a() {
        return f133358d;
    }

    public static List b() {
        ArrayList arrayList;
        if (!a()) {
            return new ArrayList();
        }
        try {
            synchronized (f133356b) {
                arrayList = new ArrayList((List) f133355a.get(f133357c));
            }
            return arrayList;
        } catch (Throwable th2) {
            dI.a(-32761, "Failed to list views", th2);
            return new ArrayList();
        }
    }
}
