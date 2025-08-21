package id;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.fullstory.FS;
import com.google.android.gms.common.internal.w0;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: id.D, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14713D extends AbstractC15707a {
    public static final Parcelable.Creator<C14713D> CREATOR = new C14714E();

    /* renamed from: a, reason: collision with root package name */
    private final String f137509a;

    /* renamed from: b, reason: collision with root package name */
    private final u f137510b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f137511c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f137512d;

    C14713D(String str, u uVar, boolean z10, boolean z11) {
        this.f137509a = str;
        this.f137510b = uVar;
        this.f137511c = z10;
        this.f137512d = z11;
    }

    C14713D(String str, IBinder iBinder, boolean z10, boolean z11) {
        this.f137509a = str;
        v vVar = null;
        if (iBinder != null) {
            try {
                com.google.android.gms.dynamic.b bVarZzd = w0.a2(iBinder).zzd();
                byte[] bArr = bVarZzd == null ? null : (byte[]) com.google.android.gms.dynamic.d.c2(bVarZzd);
                if (bArr != null) {
                    vVar = new v(bArr);
                } else {
                    FS.log_e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e10) {
                FS.log_e("GoogleCertificatesQuery", "Could not unwrap certificate", e10);
            }
        }
        this.f137510b = vVar;
        this.f137511c = z10;
        this.f137512d = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f137509a;
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 1, str, false);
        u uVar = this.f137510b;
        if (uVar == null) {
            FS.log_w("GoogleCertificatesQuery", "certificate binder is null");
            uVar = null;
        }
        C15708b.m(parcel, 2, uVar, false);
        C15708b.c(parcel, 3, this.f137511c);
        C15708b.c(parcel, 4, this.f137512d);
        C15708b.b(parcel, iA);
    }
}
