package Fe;

import De.p;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes6.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    private static final char[][] f10426b = (char[][]) Array.newInstance((Class<?>) Character.TYPE, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    private final char[][] f10427a;

    public static b a(Map<Character, String> map) {
        return new b(b(map));
    }

    char[][] c() {
        return this.f10427a;
    }

    private b(char[][] cArr) {
        this.f10427a = cArr;
    }

    static char[][] b(Map<Character, String> map) {
        p.q(map);
        if (map.isEmpty()) {
            return f10426b;
        }
        char[][] cArr = new char[((Character) Collections.max(map.keySet())).charValue() + 1][];
        for (Character ch2 : map.keySet()) {
            cArr[ch2.charValue()] = map.get(ch2).toCharArray();
        }
        return cArr;
    }
}
