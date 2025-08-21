package I9;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class b {
    public static void a(List<?> list, String str) {
        c(list, null);
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            c(it.next(), str);
        }
    }

    public static void b(List<?> list, String str) {
        c(list, null);
        if (list.size() == 0) {
            if (str == null) {
                str = "Argument must not be empty!";
            }
            throw new IllegalArgumentException(str);
        }
    }

    public static void d(Integer num, String str) {
        c(num, null);
        if (num.intValue() < 1) {
            if (str == null) {
                str = "Argument must be greater than zero!";
            }
            throw new IllegalArgumentException(str);
        }
    }

    public static void c(Object obj, String str) {
        if (obj == null) {
            if (str == null) {
                str = "Argument must not be null!";
            }
            throw new IllegalArgumentException(str);
        }
    }
}
