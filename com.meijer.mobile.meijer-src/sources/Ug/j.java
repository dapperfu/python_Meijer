package Ug;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;

/* loaded from: classes8.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    private final Ig.a f37491a;

    /* renamed from: b, reason: collision with root package name */
    private final s f37492b;

    public static j a(Ig.a aVar) {
        if (aVar.g(1)) {
            return new g(aVar);
        }
        if (!aVar.g(2)) {
            return new k(aVar);
        }
        int iG = s.g(aVar, 1, 4);
        if (iG == 4) {
            return new a(aVar);
        }
        if (iG == 5) {
            return new b(aVar);
        }
        int iG2 = s.g(aVar, 1, 5);
        if (iG2 == 12) {
            return new c(aVar);
        }
        if (iG2 == 13) {
            return new d(aVar);
        }
        switch (s.g(aVar, 1, 7)) {
            case 56:
                return new e(aVar, "310", "11");
            case 57:
                return new e(aVar, "320", "11");
            case 58:
                return new e(aVar, "310", "13");
            case 59:
                return new e(aVar, "320", "13");
            case 60:
                return new e(aVar, "310", "15");
            case 61:
                return new e(aVar, "320", "15");
            case 62:
                return new e(aVar, "310", "17");
            case 63:
                return new e(aVar, "320", "17");
            default:
                throw new IllegalStateException("unknown decoder: " + aVar);
        }
    }

    public abstract String d() throws NotFoundException, FormatException;

    protected final s b() {
        return this.f37492b;
    }

    protected final Ig.a c() {
        return this.f37491a;
    }

    j(Ig.a aVar) {
        this.f37491a = aVar;
        this.f37492b = new s(aVar);
    }
}
