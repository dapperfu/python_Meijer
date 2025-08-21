package id;

import android.os.RemoteException;
import com.fullstory.FS;
import com.google.android.gms.common.internal.S;
import com.google.android.gms.common.internal.w0;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* loaded from: classes4.dex */
abstract class u extends w0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f137550a;

    abstract byte[] I2();

    public final boolean equals(Object obj) {
        com.google.android.gms.dynamic.b bVarZzd;
        if (obj != null && (obj instanceof S)) {
            try {
                S s10 = (S) obj;
                if (s10.zzc() == this.f137550a && (bVarZzd = s10.zzd()) != null) {
                    return Arrays.equals(I2(), (byte[]) com.google.android.gms.dynamic.d.c2(bVarZzd));
                }
                return false;
            } catch (RemoteException e10) {
                FS.log_e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            }
        }
        return false;
    }

    protected static byte[] c2(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    public final int hashCode() {
        return this.f137550a;
    }

    @Override // com.google.android.gms.common.internal.S
    public final int zzc() {
        return this.f137550a;
    }

    protected u(byte[] bArr) {
        boolean z10;
        if (bArr.length == 25) {
            z10 = true;
        } else {
            z10 = false;
        }
        com.google.android.gms.common.internal.r.a(z10);
        this.f137550a = Arrays.hashCode(bArr);
    }

    @Override // com.google.android.gms.common.internal.S
    public final com.google.android.gms.dynamic.b zzd() {
        return com.google.android.gms.dynamic.d.I2(I2());
    }
}
