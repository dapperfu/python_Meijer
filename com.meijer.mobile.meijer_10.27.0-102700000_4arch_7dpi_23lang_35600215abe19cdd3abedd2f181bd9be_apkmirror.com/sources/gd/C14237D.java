package gd;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.fullstory.FS;
import com.google.android.gms.common.internal.w0;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: gd.D, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14237D extends AbstractC15136a {
    public static final Parcelable.Creator<C14237D> CREATOR = new C14238E();

    /* renamed from: a, reason: collision with root package name */
    private final String f133293a;

    /* renamed from: b, reason: collision with root package name */
    private final u f133294b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f133295c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f133296d;

    C14237D(String str, u uVar, boolean z10, boolean z11) {
        this.f133293a = str;
        this.f133294b = uVar;
        this.f133295c = z10;
        this.f133296d = z11;
    }

    C14237D(String str, IBinder iBinder, boolean z10, boolean z11) {
        this.f133293a = str;
        v vVar = null;
        if (iBinder != null) {
            try {
                com.google.android.gms.dynamic.b bVarZzd = w0.a2(iBinder).zzd();
                byte[] bArr = bVarZzd == null ? null : (byte[]) com.google.android.gms.dynamic.d.b2(bVarZzd);
                if (bArr != null) {
                    vVar = new v(bArr);
                } else {
                    FS.log_e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e10) {
                FS.log_e("GoogleCertificatesQuery", "Could not unwrap certificate", e10);
            }
        }
        this.f133294b = vVar;
        this.f133295c = z10;
        this.f133296d = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f133293a;
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 1, str, false);
        u uVar = this.f133294b;
        if (uVar == null) {
            FS.log_w("GoogleCertificatesQuery", "certificate binder is null");
            uVar = null;
        }
        C15137b.m(parcel, 2, uVar, false);
        C15137b.c(parcel, 3, this.f133295c);
        C15137b.c(parcel, 4, this.f133296d);
        C15137b.b(parcel, iA);
    }
}
