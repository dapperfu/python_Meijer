package De;

import Be.p;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes6.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    private static final char[][] f6393b = (char[][]) Array.newInstance((Class<?>) Character.TYPE, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    private final char[][] f6394a;

    public static b a(Map<Character, String> map) {
        return new b(b(map));
    }

    char[][] c() {
        return this.f6394a;
    }

    private b(char[][] cArr) {
        this.f6394a = cArr;
    }

    static char[][] b(Map<Character, String> map) {
        p.q(map);
        if (map.isEmpty()) {
            return f6393b;
        }
        char[][] cArr = new char[((Character) Collections.max(map.keySet())).charValue() + 1][];
        for (Character ch2 : map.keySet()) {
            cArr[ch2.charValue()] = map.get(ch2).toCharArray();
        }
        return cArr;
    }
}
