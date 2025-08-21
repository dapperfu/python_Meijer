package Ke;

import We.C;
import We.I;
import java.security.GeneralSecurityException;

/* renamed from: Ke.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3890e {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f16583a = new byte[0];

    /* renamed from: Ke.e$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16584a;

        static {
            int[] iArr = new int[I.values().length];
            f16584a = iArr;
            try {
                iArr[I.LEGACY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16584a[I.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16584a[I.TINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16584a[I.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static byte[] a(C.c cVar) throws GeneralSecurityException {
        int i10 = a.f16584a[cVar.e0().ordinal()];
        if (i10 == 1 || i10 == 2) {
            return com.google.crypto.tink.internal.x.a(cVar.d0()).d();
        }
        if (i10 == 3) {
            return com.google.crypto.tink.internal.x.b(cVar.d0()).d();
        }
        if (i10 == 4) {
            return f16583a;
        }
        throw new GeneralSecurityException("unknown output prefix type");
    }
}
