package Ie;

import Ue.C;
import Ue.I;
import java.security.GeneralSecurityException;

/* renamed from: Ie.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3731e {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f13837a = new byte[0];

    /* renamed from: Ie.e$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f13838a;

        static {
            int[] iArr = new int[I.values().length];
            f13838a = iArr;
            try {
                iArr[I.LEGACY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13838a[I.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13838a[I.TINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13838a[I.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static byte[] a(C.c cVar) throws GeneralSecurityException {
        int i10 = a.f13838a[cVar.e0().ordinal()];
        if (i10 == 1 || i10 == 2) {
            return com.google.crypto.tink.internal.x.a(cVar.d0()).d();
        }
        if (i10 == 3) {
            return com.google.crypto.tink.internal.x.b(cVar.d0()).d();
        }
        if (i10 == 4) {
            return f13837a;
        }
        throw new GeneralSecurityException("unknown output prefix type");
    }
}
