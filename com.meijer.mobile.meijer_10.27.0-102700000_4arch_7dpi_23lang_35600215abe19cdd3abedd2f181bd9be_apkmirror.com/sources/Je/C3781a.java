package Je;

import java.security.GeneralSecurityException;

/* renamed from: Je.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3781a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f14921a = b("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");

    /* renamed from: b, reason: collision with root package name */
    public static final String f14922b = b("type.googleapis.com/google.crypto.tink.AesGcmKey");

    /* renamed from: c, reason: collision with root package name */
    public static final String f14923c = b("type.googleapis.com/google.crypto.tink.AesGcmSivKey");

    /* renamed from: d, reason: collision with root package name */
    public static final String f14924d = b("type.googleapis.com/google.crypto.tink.AesEaxKey");

    /* renamed from: e, reason: collision with root package name */
    public static final String f14925e = b("type.googleapis.com/google.crypto.tink.KmsAeadKey");

    /* renamed from: f, reason: collision with root package name */
    public static final String f14926f = b("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");

    /* renamed from: g, reason: collision with root package name */
    public static final String f14927g = b("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");

    /* renamed from: h, reason: collision with root package name */
    public static final String f14928h = b("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");

    /* renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final Ue.J f14929i;

    /* renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final Ue.J f14930j;

    /* renamed from: k, reason: collision with root package name */
    @Deprecated
    public static final Ue.J f14931k;

    private static String b(String str) {
        return str;
    }

    static {
        Ue.J jY = Ue.J.Y();
        f14929i = jY;
        f14930j = jY;
        f14931k = jY;
        try {
            a();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    @Deprecated
    public static void a() throws GeneralSecurityException {
        c();
    }

    public static void c() throws GeneralSecurityException {
        C3785e.e();
        Re.o.c();
        C3790j.d(true);
        C3799t.e(true);
        if (Me.a.a()) {
            return;
        }
        C3795o.e(true);
        C3804y.e(true);
        D.f(true);
        H.f(true);
        L.f(true);
        t0.f(true);
        o0.d(true);
    }
}
