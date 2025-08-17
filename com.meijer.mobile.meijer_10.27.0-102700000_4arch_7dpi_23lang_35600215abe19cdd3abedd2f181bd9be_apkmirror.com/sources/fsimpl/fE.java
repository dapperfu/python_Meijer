package fsimpl;

import com.fullstory.util.Log;
import java.util.Date;

/* loaded from: classes14.dex */
class fE {
    public static int a(gh ghVar) {
        b(ghVar);
        try {
            ghVar.c(true);
            cY.b(ghVar, true);
            ghVar.c(false);
            return c(ghVar);
        } catch (Throwable th2) {
            ghVar.c(false);
            throw th2;
        }
    }

    private static int a(gh ghVar, double d10) {
        b(ghVar);
        try {
            ghVar.c(true);
            cY.a(ghVar, d10);
            ghVar.c(false);
            return c(ghVar);
        } catch (Throwable th2) {
            ghVar.c(false);
            throw th2;
        }
    }

    private static int a(gh ghVar, float f10) {
        b(ghVar);
        try {
            ghVar.c(true);
            cY.a(ghVar, f10);
            ghVar.c(false);
            return c(ghVar);
        } catch (Throwable th2) {
            ghVar.c(false);
            throw th2;
        }
    }

    private static int a(gh ghVar, int i10) {
        b(ghVar);
        try {
            ghVar.c(true);
            cY.b(ghVar, i10);
            ghVar.c(false);
            return c(ghVar);
        } catch (Throwable th2) {
            ghVar.c(false);
            throw th2;
        }
    }

    private static int a(gh ghVar, long j10) {
        b(ghVar);
        try {
            ghVar.c(true);
            cY.a(ghVar, j10);
            ghVar.c(false);
            return c(ghVar);
        } catch (Throwable th2) {
            ghVar.c(false);
            throw th2;
        }
    }

    static int a(gh ghVar, Object obj) {
        if (obj instanceof Boolean) {
            return a(ghVar, ((Boolean) obj).booleanValue());
        }
        if (obj instanceof Number) {
            if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer)) {
                return a(ghVar, ((Number) obj).intValue());
            }
            if (obj instanceof Long) {
                return a(ghVar, ((Number) obj).longValue());
            }
            if (obj instanceof Float) {
                return a(ghVar, ((Number) obj).floatValue());
            }
            if (obj instanceof Double) {
                return a(ghVar, ((Number) obj).doubleValue());
            }
        } else {
            if (obj instanceof Date) {
                return a(ghVar, (Date) obj);
            }
            if (obj instanceof CharSequence) {
                return a(ghVar, fY.c((CharSequence) obj));
            }
        }
        a((Class) obj.getClass());
        return 0;
    }

    private static int a(gh ghVar, String str) {
        int iA = ghVar.a(str);
        b(ghVar);
        try {
            ghVar.c(true);
            cY.a(ghVar, iA);
            ghVar.c(false);
            return c(ghVar);
        } catch (Throwable th2) {
            ghVar.c(false);
            throw th2;
        }
    }

    private static int a(gh ghVar, Date date) {
        int iA = ghVar.a(fB.a(date));
        b(ghVar);
        try {
            ghVar.c(true);
            cY.c(ghVar, iA);
            ghVar.c(false);
            return c(ghVar);
        } catch (Throwable th2) {
            ghVar.c(false);
            throw th2;
        }
    }

    private static int a(gh ghVar, boolean z10) {
        b(ghVar);
        try {
            ghVar.c(true);
            cY.a(ghVar, z10);
            ghVar.c(false);
            return c(ghVar);
        } catch (Throwable th2) {
            ghVar.c(false);
            throw th2;
        }
    }

    static Object a(Object obj) {
        if (obj instanceof Boolean) {
            return obj;
        }
        if (obj instanceof Number) {
            if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer)) {
                return Integer.valueOf(((Number) obj).intValue());
            }
            if (obj instanceof Long) {
                return Long.valueOf(((Number) obj).longValue());
            }
            if (obj instanceof Float) {
                return Float.valueOf(((Number) obj).floatValue());
            }
            if (obj instanceof Double) {
                return Double.valueOf(((Number) obj).doubleValue());
            }
        } else {
            if (obj instanceof Date) {
                return ((Date) obj).clone();
            }
            if (obj instanceof CharSequence) {
                return ((CharSequence) obj).toString();
            }
        }
        a((Class) obj.getClass());
        return null;
    }

    public static void a(Class cls) {
        Log.e(String.format("Encountered unsupported property type: %s", cls.getName()));
    }

    private static void b(gh ghVar) {
        cY.a(ghVar);
    }

    private static int c(gh ghVar) {
        return cV.a(ghVar, (byte) 3, cY.b(ghVar));
    }
}
