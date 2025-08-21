package Fe;

import De.p;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class a extends c {

    /* renamed from: b, reason: collision with root package name */
    private final char[][] f10422b;

    /* renamed from: c, reason: collision with root package name */
    private final int f10423c;

    /* renamed from: d, reason: collision with root package name */
    private final char f10424d;

    /* renamed from: e, reason: collision with root package name */
    private final char f10425e;

    protected a(Map<Character, String> map, char c10, char c11) {
        this(b.a(map), c10, c11);
    }

    protected abstract char[] e(char c10);

    protected a(b bVar, char c10, char c11) {
        p.q(bVar);
        char[][] cArrC = bVar.c();
        this.f10422b = cArrC;
        this.f10423c = cArrC.length;
        if (c11 < c10) {
            c11 = 0;
            c10 = 65535;
        }
        this.f10424d = c10;
        this.f10425e = c11;
    }

    @Override // Fe.c
    protected final char[] b(char c10) {
        char[] cArr;
        if (c10 < this.f10423c && (cArr = this.f10422b[c10]) != null) {
            return cArr;
        }
        if (c10 < this.f10424d || c10 > this.f10425e) {
            return e(c10);
        }
        return null;
    }

    @Override // Fe.e
    public final String a(String str) {
        p.q(str);
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if ((cCharAt < this.f10423c && this.f10422b[cCharAt] != null) || cCharAt > this.f10425e || cCharAt < this.f10424d) {
                return c(str, i10);
            }
        }
        return str;
    }
}
