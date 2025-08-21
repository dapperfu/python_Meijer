package com.google.crypto.tink.internal;

import We.y;
import java.security.GeneralSecurityException;

/* renamed from: com.google.crypto.tink.internal.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C11426j extends Ke.j {

    /* renamed from: a, reason: collision with root package name */
    private final G f89048a;

    /* renamed from: b, reason: collision with root package name */
    private final Ye.a f89049b;

    /* renamed from: com.google.crypto.tink.internal.j$b */
    private static class b extends Ke.x {

        /* renamed from: a, reason: collision with root package name */
        private final String f89052a;

        /* renamed from: b, reason: collision with root package name */
        private final We.I f89053b;

        /* synthetic */ b(String str, We.I i10, a aVar) {
            this(str, i10);
        }

        private b(String str, We.I i10) {
            this.f89052a = str;
            this.f89053b = i10;
        }

        private static String b(We.I i10) {
            int i11 = a.f89050a[i10.ordinal()];
            return i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK";
        }

        @Override // Ke.x
        public boolean a() {
            return this.f89053b != We.I.RAW;
        }

        public String toString() {
            return String.format("(typeUrl=%s, outputPrefixType=%s)", this.f89052a, b(this.f89053b));
        }
    }

    /* renamed from: com.google.crypto.tink.internal.j$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f89050a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f89051b;

        static {
            int[] iArr = new int[y.c.values().length];
            f89051b = iArr;
            try {
                iArr[y.c.SYMMETRIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f89051b[y.c.ASYMMETRIC_PRIVATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[We.I.values().length];
            f89050a = iArr2;
            try {
                iArr2[We.I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f89050a[We.I.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f89050a[We.I.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f89050a[We.I.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private static void f(G g10, Ke.C c10) throws GeneralSecurityException {
        int i10 = a.f89051b[g10.d().ordinal()];
        if (i10 == 1 || i10 == 2) {
            Ke.C.b(c10);
        }
    }

    @Override // Ke.j
    public Ke.x a() {
        return new b(this.f89048a.f(), this.f89048a.e(), null);
    }

    public Integer c() {
        return this.f89048a.c();
    }

    public Ye.a d() {
        return this.f89049b;
    }

    public G e(Ke.C c10) throws GeneralSecurityException {
        f(this.f89048a, c10);
        return this.f89048a;
    }

    public C11426j(G g10, Ke.C c10) throws GeneralSecurityException {
        f(g10, c10);
        this.f89048a = g10;
        this.f89049b = b(g10);
    }

    private static Ye.a b(G g10) throws GeneralSecurityException {
        if (g10.e().equals(We.I.RAW)) {
            return Ye.a.a(new byte[0]);
        }
        if (g10.e().equals(We.I.TINK)) {
            return x.b(g10.c().intValue());
        }
        if (!g10.e().equals(We.I.LEGACY) && !g10.e().equals(We.I.CRUNCHY)) {
            throw new GeneralSecurityException("Unknown output prefix type");
        }
        return x.a(g10.c().intValue());
    }
}
