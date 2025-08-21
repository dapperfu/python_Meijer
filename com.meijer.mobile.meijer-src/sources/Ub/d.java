package Ub;

import eb.C13786c;
import eb.C13787d;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static final C13786c f37402a = C13787d.a(d.class.getName());

    private static boolean c(String str) {
        if (str == null || str.length() != 32) {
            return false;
        }
        return str.toUpperCase().startsWith(c.a("960c4").toUpperCase()) && str.toUpperCase().endsWith(c.a("-244c-11e2-b299-00a0c60077ad").toUpperCase());
    }

    public static Integer a(String str) {
        int i10 = 0;
        if (c(str)) {
            try {
                i10 = (a.b(str.substring(6, 8))[0] & 255) - 70;
            } catch (com.gimbal.proximity.a.c unused) {
                f37402a.f("unable to parse temperature from service ID", new Object[0]);
            }
        }
        return Integer.valueOf(i10);
    }

    public static Integer b(String str) {
        int iDigit;
        int i10 = 0;
        if (c(str) && (iDigit = Character.digit(str.substring(5, 6).charAt(0), 16)) >= 0) {
            i10 = ((byte) iDigit) & 3;
        }
        return Integer.valueOf(i10);
    }
}
