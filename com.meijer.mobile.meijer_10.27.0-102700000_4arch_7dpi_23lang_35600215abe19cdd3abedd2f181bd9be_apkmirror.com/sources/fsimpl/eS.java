package fsimpl;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes14.dex */
public class eS {

    /* renamed from: a, reason: collision with root package name */
    private static final Field f132105a = fT.a(C14108fz.f132296f, "mViews");

    /* renamed from: b, reason: collision with root package name */
    private static final Object f132106b;

    /* renamed from: c, reason: collision with root package name */
    private static final Object f132107c;

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f132108d;

    static {
        Object obj;
        Object objInvoke;
        boolean z10 = false;
        Method methodA = fT.a(C14108fz.f132296f, "getInstance", new Class[0]);
        Field fieldA = fT.a(C14108fz.f132296f, "mLock");
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
        f132107c = obj2;
        f132106b = obj;
        if (f132105a != null && obj2 != null && obj != null) {
            z10 = true;
        }
        f132108d = z10;
    }

    public static boolean a() {
        return f132108d;
    }

    public static List b() {
        ArrayList arrayList;
        if (!a()) {
            return new ArrayList();
        }
        try {
            synchronized (f132106b) {
                arrayList = new ArrayList((List) f132105a.get(f132107c));
            }
            return arrayList;
        } catch (Throwable th2) {
            dI.a(-32761, "Failed to list views", th2);
            return new ArrayList();
        }
    }
}
