package Ug;

import com.google.zxing.NotFoundException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
final class r {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, a> f37508a;

    /* renamed from: b, reason: collision with root package name */
    private static final Map<String, a> f37509b;

    /* renamed from: c, reason: collision with root package name */
    private static final Map<String, a> f37510c;

    /* renamed from: d, reason: collision with root package name */
    private static final Map<String, a> f37511d;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        final boolean f37512a;

        /* renamed from: b, reason: collision with root package name */
        final int f37513b;

        static a a(int i10) {
            return new a(false, i10);
        }

        static a b(int i10) {
            return new a(true, i10);
        }

        private a(boolean z10, int i10) {
            this.f37512a = z10;
            this.f37513b = i10;
        }
    }

    static {
        HashMap map = new HashMap();
        f37508a = map;
        map.put("00", a.a(18));
        map.put("01", a.a(14));
        map.put("02", a.a(14));
        map.put("10", a.b(20));
        map.put("11", a.a(6));
        map.put("12", a.a(6));
        map.put("13", a.a(6));
        map.put("15", a.a(6));
        map.put("16", a.a(6));
        map.put("17", a.a(6));
        map.put("20", a.a(2));
        map.put("21", a.b(20));
        map.put("22", a.b(29));
        map.put("30", a.b(8));
        map.put("37", a.b(8));
        for (int i10 = 90; i10 <= 99; i10++) {
            f37508a.put(String.valueOf(i10), a.b(30));
        }
        HashMap map2 = new HashMap();
        f37509b = map2;
        map2.put("235", a.b(28));
        map2.put("240", a.b(30));
        map2.put("241", a.b(30));
        map2.put("242", a.b(6));
        map2.put("243", a.b(20));
        map2.put("250", a.b(30));
        map2.put("251", a.b(30));
        map2.put("253", a.b(30));
        map2.put("254", a.b(20));
        map2.put("255", a.b(25));
        map2.put("400", a.b(30));
        map2.put("401", a.b(30));
        map2.put("402", a.a(17));
        map2.put("403", a.b(30));
        map2.put("410", a.a(13));
        map2.put("411", a.a(13));
        map2.put("412", a.a(13));
        map2.put("413", a.a(13));
        map2.put("414", a.a(13));
        map2.put("415", a.a(13));
        map2.put("416", a.a(13));
        map2.put("417", a.a(13));
        map2.put("420", a.b(20));
        map2.put("421", a.b(15));
        map2.put("422", a.a(3));
        map2.put("423", a.b(15));
        map2.put("424", a.a(3));
        map2.put("425", a.b(15));
        map2.put("426", a.a(3));
        map2.put("427", a.b(3));
        map2.put("710", a.b(20));
        map2.put("711", a.b(20));
        map2.put("712", a.b(20));
        map2.put("713", a.b(20));
        map2.put("714", a.b(20));
        map2.put("715", a.b(20));
        f37510c = new HashMap();
        for (int i11 = 310; i11 <= 316; i11++) {
            f37510c.put(String.valueOf(i11), a.a(6));
        }
        for (int i12 = 320; i12 <= 337; i12++) {
            f37510c.put(String.valueOf(i12), a.a(6));
        }
        for (int i13 = 340; i13 <= 357; i13++) {
            f37510c.put(String.valueOf(i13), a.a(6));
        }
        for (int i14 = 360; i14 <= 369; i14++) {
            f37510c.put(String.valueOf(i14), a.a(6));
        }
        Map<String, a> map3 = f37510c;
        map3.put("390", a.b(15));
        map3.put("391", a.b(18));
        map3.put("392", a.b(15));
        map3.put("393", a.b(18));
        map3.put("394", a.a(4));
        map3.put("395", a.a(6));
        map3.put("703", a.b(30));
        map3.put("723", a.b(30));
        HashMap map4 = new HashMap();
        f37511d = map4;
        map4.put("4300", a.b(35));
        map4.put("4301", a.b(35));
        map4.put("4302", a.b(70));
        map4.put("4303", a.b(70));
        map4.put("4304", a.b(70));
        map4.put("4305", a.b(70));
        map4.put("4306", a.b(70));
        map4.put("4307", a.a(2));
        map4.put("4308", a.b(30));
        map4.put("4309", a.a(20));
        map4.put("4310", a.b(35));
        map4.put("4311", a.b(35));
        map4.put("4312", a.b(70));
        map4.put("4313", a.b(70));
        map4.put("4314", a.b(70));
        map4.put("4315", a.b(70));
        map4.put("4316", a.b(70));
        map4.put("4317", a.a(2));
        map4.put("4318", a.b(20));
        map4.put("4319", a.b(30));
        map4.put("4320", a.b(35));
        map4.put("4321", a.a(1));
        map4.put("4322", a.a(1));
        map4.put("4323", a.a(1));
        map4.put("4324", a.a(10));
        map4.put("4325", a.a(10));
        map4.put("4326", a.a(6));
        map4.put("7001", a.a(13));
        map4.put("7002", a.b(30));
        map4.put("7003", a.a(10));
        map4.put("7004", a.b(4));
        map4.put("7005", a.b(12));
        map4.put("7006", a.a(6));
        map4.put("7007", a.b(12));
        map4.put("7008", a.b(3));
        map4.put("7009", a.b(10));
        map4.put("7010", a.b(2));
        map4.put("7011", a.b(10));
        map4.put("7020", a.b(20));
        map4.put("7021", a.b(20));
        map4.put("7022", a.b(20));
        map4.put("7023", a.b(30));
        map4.put("7040", a.a(4));
        map4.put("7240", a.b(20));
        map4.put("8001", a.a(14));
        map4.put("8002", a.b(20));
        map4.put("8003", a.b(30));
        map4.put("8004", a.b(30));
        map4.put("8005", a.a(6));
        map4.put("8006", a.a(18));
        map4.put("8007", a.b(34));
        map4.put("8008", a.b(12));
        map4.put("8009", a.b(50));
        map4.put("8010", a.b(30));
        map4.put("8011", a.b(12));
        map4.put("8012", a.b(20));
        map4.put("8013", a.b(25));
        map4.put("8017", a.a(18));
        map4.put("8018", a.a(18));
        map4.put("8019", a.b(10));
        map4.put("8020", a.b(25));
        map4.put("8026", a.a(18));
        map4.put("8100", a.a(6));
        map4.put("8101", a.a(10));
        map4.put("8102", a.a(2));
        map4.put("8110", a.b(70));
        map4.put("8111", a.a(4));
        map4.put("8112", a.b(70));
        map4.put("8200", a.b(70));
    }

    private static String c(int i10, int i11, String str) throws NotFoundException {
        String strSubstring = str.substring(0, i10);
        int iMin = Math.min(str.length(), i11 + i10);
        String strSubstring2 = str.substring(i10, iMin);
        String str2 = '(' + strSubstring + ')' + strSubstring2;
        String strA = a(str.substring(iMin));
        if (strA == null) {
            return str2;
        }
        return str2 + strA;
    }

    static String a(String str) throws NotFoundException {
        if (str.isEmpty()) {
            return null;
        }
        if (str.length() >= 2) {
            a aVar = f37508a.get(str.substring(0, 2));
            if (aVar != null) {
                if (aVar.f37512a) {
                    return c(2, aVar.f37513b, str);
                }
                return b(2, aVar.f37513b, str);
            }
            if (str.length() >= 3) {
                String strSubstring = str.substring(0, 3);
                a aVar2 = f37509b.get(strSubstring);
                if (aVar2 != null) {
                    if (aVar2.f37512a) {
                        return c(3, aVar2.f37513b, str);
                    }
                    return b(3, aVar2.f37513b, str);
                }
                if (str.length() >= 4) {
                    a aVar3 = f37510c.get(strSubstring);
                    if (aVar3 != null) {
                        if (aVar3.f37512a) {
                            return c(4, aVar3.f37513b, str);
                        }
                        return b(4, aVar3.f37513b, str);
                    }
                    a aVar4 = f37511d.get(str.substring(0, 4));
                    if (aVar4 != null) {
                        if (aVar4.f37512a) {
                            return c(4, aVar4.f37513b, str);
                        }
                        return b(4, aVar4.f37513b, str);
                    }
                    throw NotFoundException.a();
                }
                throw NotFoundException.a();
            }
            throw NotFoundException.a();
        }
        throw NotFoundException.a();
    }

    private static String b(int i10, int i11, String str) throws NotFoundException {
        if (str.length() >= i10) {
            String strSubstring = str.substring(0, i10);
            int i12 = i11 + i10;
            if (str.length() >= i12) {
                String strSubstring2 = str.substring(i10, i12);
                String str2 = '(' + strSubstring + ')' + strSubstring2;
                String strA = a(str.substring(i12));
                if (strA == null) {
                    return str2;
                }
                return str2 + strA;
            }
            throw NotFoundException.a();
        }
        throw NotFoundException.a();
    }
}
