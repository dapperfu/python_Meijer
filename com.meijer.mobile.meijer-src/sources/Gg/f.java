package Gg;

import android.content.Intent;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f12540a = Pattern.compile(",");

    /* renamed from: b, reason: collision with root package name */
    static final Set<com.google.zxing.a> f12541b;

    /* renamed from: c, reason: collision with root package name */
    static final Set<com.google.zxing.a> f12542c;

    /* renamed from: d, reason: collision with root package name */
    private static final Set<com.google.zxing.a> f12543d;

    /* renamed from: e, reason: collision with root package name */
    static final Set<com.google.zxing.a> f12544e;

    /* renamed from: f, reason: collision with root package name */
    static final Set<com.google.zxing.a> f12545f;

    /* renamed from: g, reason: collision with root package name */
    static final Set<com.google.zxing.a> f12546g;

    /* renamed from: h, reason: collision with root package name */
    static final Set<com.google.zxing.a> f12547h;

    /* renamed from: i, reason: collision with root package name */
    private static final Map<String, Set<com.google.zxing.a>> f12548i;

    static {
        EnumSet enumSetOf = EnumSet.of(com.google.zxing.a.QR_CODE);
        f12544e = enumSetOf;
        EnumSet enumSetOf2 = EnumSet.of(com.google.zxing.a.DATA_MATRIX);
        f12545f = enumSetOf2;
        EnumSet enumSetOf3 = EnumSet.of(com.google.zxing.a.AZTEC);
        f12546g = enumSetOf3;
        EnumSet enumSetOf4 = EnumSet.of(com.google.zxing.a.PDF_417);
        f12547h = enumSetOf4;
        EnumSet enumSetOf5 = EnumSet.of(com.google.zxing.a.UPC_A, com.google.zxing.a.UPC_E, com.google.zxing.a.EAN_13, com.google.zxing.a.EAN_8, com.google.zxing.a.RSS_14, com.google.zxing.a.RSS_EXPANDED);
        f12541b = enumSetOf5;
        EnumSet enumSetOf6 = EnumSet.of(com.google.zxing.a.CODE_39, com.google.zxing.a.CODE_93, com.google.zxing.a.CODE_128, com.google.zxing.a.ITF, com.google.zxing.a.CODABAR);
        f12542c = enumSetOf6;
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) enumSetOf5);
        f12543d = enumSetCopyOf;
        enumSetCopyOf.addAll(enumSetOf6);
        HashMap map = new HashMap();
        f12548i = map;
        map.put("ONE_D_MODE", enumSetCopyOf);
        map.put("PRODUCT_MODE", enumSetOf5);
        map.put("QR_CODE_MODE", enumSetOf);
        map.put("DATA_MATRIX_MODE", enumSetOf2);
        map.put("AZTEC_MODE", enumSetOf3);
        map.put("PDF417_MODE", enumSetOf4);
    }

    public static Set<com.google.zxing.a> a(Intent intent) {
        String stringExtra = intent.getStringExtra("SCAN_FORMATS");
        return b(stringExtra != null ? Arrays.asList(f12540a.split(stringExtra)) : null, intent.getStringExtra("SCAN_MODE"));
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
            return f12548i.get(str);
        }
        return null;
    }
}
