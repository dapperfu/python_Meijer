package com.google.crypto.tink.internal;

import Ue.y;
import java.security.GeneralSecurityException;

/* renamed from: com.google.crypto.tink.internal.j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C11301j extends Ie.j {

    /* renamed from: a, reason: collision with root package name */
    private final G f88208a;

    /* renamed from: b, reason: collision with root package name */
    private final We.a f88209b;

    /* renamed from: com.google.crypto.tink.internal.j$b */
    private static class b extends Ie.x {

        /* renamed from: a, reason: collision with root package name */
        private final String f88212a;

        /* renamed from: b, reason: collision with root package name */
        private final Ue.I f88213b;

        /* synthetic */ b(String str, Ue.I i10, a aVar) {
            this(str, i10);
        }

        private b(String str, Ue.I i10) {
            this.f88212a = str;
            this.f88213b = i10;
        }

        private static String b(Ue.I i10) {
            int i11 = a.f88210a[i10.ordinal()];
            return i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK";
        }

        @Override // Ie.x
        public boolean a() {
            return this.f88213b != Ue.I.RAW;
        }

        public String toString() {
            return String.format("(typeUrl=%s, outputPrefixType=%s)", this.f88212a, b(this.f88213b));
        }
    }

    /* renamed from: com.google.crypto.tink.internal.j$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f88210a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f88211b;

        static {
            int[] iArr = new int[y.c.values().length];
            f88211b = iArr;
            try {
                iArr[y.c.SYMMETRIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f88211b[y.c.ASYMMETRIC_PRIVATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[Ue.I.values().length];
            f88210a = iArr2;
            try {
                iArr2[Ue.I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f88210a[Ue.I.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f88210a[Ue.I.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f88210a[Ue.I.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private static void f(G g10, Ie.C c10) throws GeneralSecurityException {
        int i10 = a.f88211b[g10.d().ordinal()];
        if (i10 == 1 || i10 == 2) {
            Ie.C.b(c10);
        }
    }

    @Override // Ie.j
    public Ie.x a() {
        return new b(this.f88208a.f(), this.f88208a.e(), null);
    }

    public Integer c() {
        return this.f88208a.c();
    }

    public We.a d() {
        return this.f88209b;
    }

    public G e(Ie.C c10) throws GeneralSecurityException {
        f(this.f88208a, c10);
        return this.f88208a;
    }

    public C11301j(G g10, Ie.C c10) throws GeneralSecurityException {
        f(g10, c10);
        this.f88208a = g10;
        this.f88209b = b(g10);
    }

    private static We.a b(G g10) throws GeneralSecurityException {
        if (g10.e().equals(Ue.I.RAW)) {
            return We.a.a(new byte[0]);
        }
        if (g10.e().equals(Ue.I.TINK)) {
            return x.b(g10.c().intValue());
        }
        if (!g10.e().equals(Ue.I.LEGACY) && !g10.e().equals(Ue.I.CRUNCHY)) {
            throw new GeneralSecurityException("Unknown output prefix type");
        }
        return x.a(g10.c().intValue());
    }
}
