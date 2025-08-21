package Le;

import java.security.GeneralSecurityException;

/* renamed from: Le.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4025a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f18258a = b("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");

    /* renamed from: b, reason: collision with root package name */
    public static final String f18259b = b("type.googleapis.com/google.crypto.tink.AesGcmKey");

    /* renamed from: c, reason: collision with root package name */
    public static final String f18260c = b("type.googleapis.com/google.crypto.tink.AesGcmSivKey");

    /* renamed from: d, reason: collision with root package name */
    public static final String f18261d = b("type.googleapis.com/google.crypto.tink.AesEaxKey");

    /* renamed from: e, reason: collision with root package name */
    public static final String f18262e = b("type.googleapis.com/google.crypto.tink.KmsAeadKey");

    /* renamed from: f, reason: collision with root package name */
    public static final String f18263f = b("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");

    /* renamed from: g, reason: collision with root package name */
    public static final String f18264g = b("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");

    /* renamed from: h, reason: collision with root package name */
    public static final String f18265h = b("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");

    /* renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final We.J f18266i;

    /* renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final We.J f18267j;

    /* renamed from: k, reason: collision with root package name */
    @Deprecated
    public static final We.J f18268k;

    private static String b(String str) {
        return str;
    }

    static {
        We.J jY = We.J.Y();
        f18266i = jY;
        f18267j = jY;
        f18268k = jY;
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
        C4029e.e();
        Te.o.c();
        C4034j.d(true);
        C4043t.e(true);
        if (Oe.a.a()) {
            return;
        }
        C4039o.e(true);
        C4048y.e(true);
        D.f(true);
        H.f(true);
        L.f(true);
        t0.f(true);
        o0.d(true);
    }
}
