package com.medallia.digital.mobilesdk;

import android.annotation.TargetApi;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.util.Base64;
import com.medallia.digital.mobilesdk.d7;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;

/* loaded from: classes8.dex */
final class t4 implements m8 {

    /* renamed from: b, reason: collision with root package name */
    private static final String f93886b = "AndroidKeyStore";

    /* renamed from: c, reason: collision with root package name */
    private static final String f93887c = "AES/GCM/NoPadding";

    /* renamed from: d, reason: collision with root package name */
    private static final String f93888d = "MD_SDK_KEYSTORE_V2";

    /* renamed from: e, reason: collision with root package name */
    private static final String f93889e = "MD_SDK_KEYSTORE";

    /* renamed from: f, reason: collision with root package name */
    private static final int f93890f = 12;

    /* renamed from: g, reason: collision with root package name */
    private static final int f93891g = 128;

    /* renamed from: h, reason: collision with root package name */
    private static t4 f93892h;

    /* renamed from: a, reason: collision with root package name */
    private KeyStore f93893a;

    private t4() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        c();
        h();
    }

    private void c() {
        d7 d7VarB = d7.b();
        d7.a aVar = d7.a.LENNY;
        if (d7VarB.a(aVar, "").isEmpty()) {
            byte[] bArr = new byte[12];
            new SecureRandom().nextBytes(bArr);
            d7.b().b(aVar, Base64.encodeToString(bArr, 0));
        }
    }

    private byte[] d() {
        return Base64.decode(d7.b().a(d7.a.LENNY, ""), 0);
    }

    protected static t4 e() {
        if (f93892h == null) {
            f93892h = new t4();
        }
        return f93892h;
    }

    private Key f() {
        return g();
    }

    private Key g() {
        try {
            return this.f93893a.getKey(f93888d, null);
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return null;
        }
    }

    @TargetApi(23)
    private void h() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        try {
            KeyStore keyStore = KeyStore.getInstance(f93886b);
            this.f93893a = keyStore;
            keyStore.load(null);
            if (this.f93893a.containsAlias(f93888d)) {
                return;
            }
            a();
            b();
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", f93886b);
            try {
                boolean zHasSystemFeature = i4.c().b().getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore");
                a4.b("using Strong Box: " + zHasSystemFeature);
                keyGenerator.init(new KeyGenParameterSpec.Builder(f93888d, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setRandomizedEncryptionRequired(false).setIsStrongBoxBacked(zHasSystemFeature).build());
            } catch (Exception e10) {
                a4.c(e10.getMessage());
                keyGenerator.init(new KeyGenParameterSpec.Builder(f93888d, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setRandomizedEncryptionRequired(false).build());
            }
            keyGenerator.generateKey();
        } catch (Exception e11) {
            a4.c(e11.getMessage());
        }
    }

    protected String a(d7.a aVar) {
        String strA = d7.b().a(aVar, (String) null);
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return a(strA);
    }

    String b(String str) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            Cipher cipher = Cipher.getInstance(f93887c);
            cipher.init(1, f(), new GCMParameterSpec(f93891g, d()));
            return Base64.encodeToString(cipher.doFinal(str.getBytes()), 0);
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }

    @Override // com.medallia.digital.mobilesdk.m8
    public void clearAndDisconnect() {
        f93892h = null;
    }

    private void b() {
        try {
            d7.b().c().edit().remove("MD_KEY_IV").commit();
            d7.b().c().edit().remove("MD_KEY_AES").commit();
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    String a(String str) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            Cipher cipher = Cipher.getInstance(f93887c);
            cipher.init(2, f(), new GCMParameterSpec(f93891g, d()));
            return new String(cipher.doFinal(Base64.decode(str, 0)));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }

    private void a() throws KeyStoreException {
        try {
            if (this.f93893a.containsAlias(f93889e)) {
                this.f93893a.deleteEntry(f93889e);
            }
        } catch (KeyStoreException e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void a(d7.a aVar, String str) {
        d7.b().b(aVar, !TextUtils.isEmpty(str) ? b(str) : null);
    }
}
