package fsimpl;

/* loaded from: classes14.dex */
class dT {
    static Object a(C14060ee c14060ee, Object obj) {
        while (obj != null && c14060ee.a(obj).c()) {
            obj = gd.a(c14060ee, obj);
        }
        return obj;
    }

    static String a(String str, String str2) {
        return str == null ? str2 : str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:58:0x00e1. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static boolean a(fsimpl.dW r10, fsimpl.aK r11) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fsimpl.dT.a(fsimpl.dW, fsimpl.aK):boolean");
    }

    private static boolean a(String str, String str2, Byte b10) {
        if (str == null || b10 == null) {
            return false;
        }
        switch (b10.byteValue()) {
            case 5:
                if (!str.equals(str2) && !str.startsWith(str2 + " ") && !str.endsWith(" " + str2)) {
                    break;
                }
                break;
            case 6:
                if (str.startsWith(str2 + "-") || str.equals(str2)) {
                }
                break;
        }
        return false;
    }
}
