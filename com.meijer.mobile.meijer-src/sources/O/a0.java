package O;

import F.k0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public class a0 {
    public static int d(int i10) {
        int i11 = 0;
        while (i10 != 0) {
            i11 += i10 & 1;
            i10 >>= 1;
        }
        return i11;
    }

    public static boolean e(int i10, int i11) {
        return (i10 & i11) == i11;
    }

    public static String b(int i10) {
        ArrayList arrayList = new ArrayList();
        if ((i10 & 4) != 0) {
            arrayList.add("IMAGE_CAPTURE");
        }
        if ((i10 & 1) != 0) {
            arrayList.add("PREVIEW");
        }
        if ((i10 & 2) != 0) {
            arrayList.add("VIDEO_CAPTURE");
        }
        return k0.a("|", arrayList);
    }

    private static String c(Collection<Integer> collection) {
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(b(it.next().intValue()));
        }
        return "[" + k0.a(", ", arrayList) + "]";
    }

    public static void a(Collection<Integer> collection, int i10) {
        o2.i.b(collection.contains(Integer.valueOf(i10)), String.format(Locale.US, "Effects target %s is not in the supported list %s.", b(i10), c(collection)));
    }
}
