package Ig;

import com.google.zxing.FormatException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public enum d {
    Cp437(new int[]{0, 2}, new String[0]),
    ISO8859_1(new int[]{1, 3}, "ISO-8859-1"),
    ISO8859_2(4, "ISO-8859-2"),
    ISO8859_3(5, "ISO-8859-3"),
    ISO8859_4(6, "ISO-8859-4"),
    ISO8859_5(7, "ISO-8859-5"),
    ISO8859_6(8, "ISO-8859-6"),
    ISO8859_7(9, "ISO-8859-7"),
    ISO8859_8(10, "ISO-8859-8"),
    ISO8859_9(11, "ISO-8859-9"),
    ISO8859_10(12, "ISO-8859-10"),
    ISO8859_11(13, "ISO-8859-11"),
    ISO8859_13(15, "ISO-8859-13"),
    ISO8859_14(16, "ISO-8859-14"),
    ISO8859_15(17, "ISO-8859-15"),
    ISO8859_16(18, "ISO-8859-16"),
    SJIS(20, "Shift_JIS"),
    Cp1250(21, "windows-1250"),
    Cp1251(22, "windows-1251"),
    Cp1252(23, "windows-1252"),
    Cp1256(24, "windows-1256"),
    UnicodeBigUnmarked(25, "UTF-16BE", "UnicodeBig"),
    UTF8(26, "UTF-8"),
    ASCII(new int[]{27, 170}, "US-ASCII"),
    Big5(28),
    GB18030(29, "GB2312", "EUC_CN", "GBK"),
    EUC_KR(30, "EUC-KR");


    /* renamed from: D, reason: collision with root package name */
    private static final Map<Integer, d> f14489D = new HashMap();

    /* renamed from: E, reason: collision with root package name */
    private static final Map<String, d> f14490E = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final int[] f14516a;

    /* renamed from: b, reason: collision with root package name */
    private final String[] f14517b;

    static {
        for (d dVar : values()) {
            if (Charset.isSupported(dVar.name())) {
                for (int i10 : dVar.f14516a) {
                    f14489D.put(Integer.valueOf(i10), dVar);
                }
                f14490E.put(dVar.name(), dVar);
                for (String str : dVar.f14517b) {
                    f14490E.put(str, dVar);
                }
            }
        }
    }

    d(int i10) {
        this(new int[]{i10}, new String[0]);
    }

    d(int i10, String... strArr) {
        this.f14516a = new int[]{i10};
        this.f14517b = strArr;
    }

    public static d a(Charset charset) {
        return f14490E.get(charset.name());
    }

    public static d b(String str) {
        return f14490E.get(str);
    }

    public static d e(int i10) throws FormatException {
        if (i10 < 0 || i10 >= 900) {
            throw FormatException.a();
        }
        return f14489D.get(Integer.valueOf(i10));
    }

    public int m() {
        return this.f14516a[0];
    }

    public Charset l() {
        return Charset.forName(name());
    }

    d(int[] iArr, String... strArr) {
        this.f14516a = iArr;
        this.f14517b = strArr;
    }
}
