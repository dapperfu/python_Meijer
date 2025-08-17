package Eg;

import android.content.Intent;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f8988a = Pattern.compile(",");

    /* renamed from: b, reason: collision with root package name */
    static final Set<com.google.zxing.a> f8989b;

    /* renamed from: c, reason: collision with root package name */
    static final Set<com.google.zxing.a> f8990c;

    /* renamed from: d, reason: collision with root package name */
    private static final Set<com.google.zxing.a> f8991d;

    /* renamed from: e, reason: collision with root package name */
    static final Set<com.google.zxing.a> f8992e;

    /* renamed from: f, reason: collision with root package name */
    static final Set<com.google.zxing.a> f8993f;

    /* renamed from: g, reason: collision with root package name */
    static final Set<com.google.zxing.a> f8994g;

    /* renamed from: h, reason: collision with root package name */
    static final Set<com.google.zxing.a> f8995h;

    /* renamed from: i, reason: collision with root package name */
    private static final Map<String, Set<com.google.zxing.a>> f8996i;

    static {
        EnumSet enumSetOf = EnumSet.of(com.google.zxing.a.QR_CODE);
        f8992e = enumSetOf;
        EnumSet enumSetOf2 = EnumSet.of(com.google.zxing.a.DATA_MATRIX);
        f8993f = enumSetOf2;
        EnumSet enumSetOf3 = EnumSet.of(com.google.zxing.a.AZTEC);
        f8994g = enumSetOf3;
        EnumSet enumSetOf4 = EnumSet.of(com.google.zxing.a.PDF_417);
        f8995h = enumSetOf4;
        EnumSet enumSetOf5 = EnumSet.of(com.google.zxing.a.UPC_A, com.google.zxing.a.UPC_E, com.google.zxing.a.EAN_13, com.google.zxing.a.EAN_8, com.google.zxing.a.RSS_14, com.google.zxing.a.RSS_EXPANDED);
        f8989b = enumSetOf5;
        EnumSet enumSetOf6 = EnumSet.of(com.google.zxing.a.CODE_39, com.google.zxing.a.CODE_93, com.google.zxing.a.CODE_128, com.google.zxing.a.ITF, com.google.zxing.a.CODABAR);
        f8990c = enumSetOf6;
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) enumSetOf5);
        f8991d = enumSetCopyOf;
        enumSetCopyOf.addAll(enumSetOf6);
        HashMap map = new HashMap();
        f8996i = map;
        map.put("ONE_D_MODE", enumSetCopyOf);
        map.put("PRODUCT_MODE", enumSetOf5);
        map.put("QR_CODE_MODE", enumSetOf);
        map.put("DATA_MATRIX_MODE", enumSetOf2);
        map.put("AZTEC_MODE", enumSetOf3);
        map.put("PDF417_MODE", enumSetOf4);
    }

    public static Set<com.google.zxing.a> a(Intent intent) {
        String stringExtra = intent.getStringExtra("SCAN_FORMATS");
        return b(stringExtra != null ? Arrays.asList(f8988a.split(stringExtra)) : null, intent.getStringExtra("SCAN_MODE"));
    }

    private static Set<com.google.zxing.a> b(Iterable<String> iterable, String str) {
        if (iterable != null) {
            EnumSet enumSetNoneOf = EnumSet.noneOf(com.google.zxing.a.class);
            try {
                Iterator<String> it = iterable.iterator();
                while (it.hasNext()) {
                    enumSetNoneOf.add(com.google.zxing.a.valueOf(it.next()));
                }
                return enumSetNoneOf;
            } catch (IllegalArgumentException unused) {
            }
        }
        if (str != null) {
            return f8996i.get(str);
        }
        return null;
    }
}
