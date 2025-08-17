package De;

import Be.p;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class a extends c {

    /* renamed from: b, reason: collision with root package name */
    private final char[][] f6389b;

    /* renamed from: c, reason: collision with root package name */
    private final int f6390c;

    /* renamed from: d, reason: collision with root package name */
    private final char f6391d;

    /* renamed from: e, reason: collision with root package name */
    private final char f6392e;

    protected a(Map<Character, String> map, char c10, char c11) {
        this(b.a(map), c10, c11);
    }

    protected abstract char[] e(char c10);

    protected a(b bVar, char c10, char c11) {
        p.q(bVar);
        char[][] cArrC = bVar.c();
        this.f6389b = cArrC;
        this.f6390c = cArrC.length;
        if (c11 < c10) {
            c11 = 0;
            c10 = 65535;
        }
        this.f6391d = c10;
        this.f6392e = c11;
    }

    @Override // De.c
    protected final char[] b(char c10) {
        char[] cArr;
        if (c10 < this.f6390c && (cArr = this.f6389b[c10]) != null) {
            return cArr;
        }
        if (c10 < this.f6391d || c10 > this.f6392e) {
            return e(c10);
        }
        return null;
    }

    @Override // De.e
    public final String a(String str) {
        p.q(str);
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if ((cCharAt < this.f6390c && this.f6389b[cCharAt] != null) || cCharAt > this.f6392e || cCharAt < this.f6391d) {
                return c(str, i10);
            }
        }
        return str;
    }
}
