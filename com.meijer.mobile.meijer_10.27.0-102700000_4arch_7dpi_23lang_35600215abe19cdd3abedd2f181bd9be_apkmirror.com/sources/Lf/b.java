package Lf;

import android.content.SharedPreferences;
import android.util.Base64;
import com.fullstory.FS;
import com.google.firebase.f;
import com.medallia.digital.mobilesdk.l3;
import fsimpl.C14045dq;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f18088c = {"*", "FCM", "GCM", ""};

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f18089a;

    /* renamed from: b, reason: collision with root package name */
    private final String f18090b;

    private String a(String str, String str2) {
        return "|T|" + str + "|" + str2;
    }

    private String d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    private PublicKey e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e10) {
            FS.log_w("ContentValues", "Invalid key stored " + e10);
            return null;
        }
    }

    private String g() {
        String string;
        synchronized (this.f18089a) {
            string = this.f18089a.getString("|S|id", null);
        }
        return string;
    }

    private String h() {
        synchronized (this.f18089a) {
            try {
                String string = this.f18089a.getString("|S||P|", null);
                if (string == null) {
                    return null;
                }
                PublicKey publicKeyE = e(string);
                if (publicKeyE == null) {
                    return null;
                }
                return c(publicKeyE);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String f() {
        synchronized (this.f18089a) {
            try {
                String strG = g();
                if (strG != null) {
                    return strG;
                }
                return h();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String i() {
        synchronized (this.f18089a) {
            try {
                for (String str : f18088c) {
                    String string = this.f18089a.getString(a(this.f18090b, str), null);
                    if (string != null && !string.isEmpty()) {
                        if (string.startsWith("{")) {
                            string = d(string);
                        }
                        return string;
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public b(f fVar) {
        this.f18089a = fVar.k().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f18090b = b(fVar);
    }

    private static String b(f fVar) {
        String strD = fVar.n().d();
        if (strD != null) {
            return strD;
        }
        String strC = fVar.n().c();
        if (!strC.startsWith("1:") && !strC.startsWith("2:")) {
            return strC;
        }
        String[] strArrSplit = strC.split(":");
        if (strArrSplit.length != 4) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private static String c(PublicKey publicKey) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            bArrDigest[0] = (byte) (((bArrDigest[0] & C14045dq.MULTIPLY) + 112) & l3.f92484c);
            return Base64.encodeToString(bArrDigest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            FS.log_w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }
}
