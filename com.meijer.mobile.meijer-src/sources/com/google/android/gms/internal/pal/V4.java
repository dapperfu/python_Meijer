package com.google.android.gms.internal.pal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;

/* loaded from: classes6.dex */
public abstract class V4 extends P4 implements W4 {
    @Override // com.google.android.gms.internal.pal.P4
    protected final boolean K1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                parcel2.writeNoException();
                parcel2.writeString(zzj());
                return true;
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Q4.b(parcel);
                zzn(string, string2);
                parcel2.writeNoException();
                return true;
            case 3:
                com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcel.readStrongBinder());
                Q4.b(parcel);
                boolean zZzp = zzp(bVarA2);
                parcel2.writeNoException();
                Q4.c(parcel2, zZzp);
                return true;
            case 4:
                com.google.android.gms.dynamic.b bVarA22 = b.a.a2(parcel.readStrongBinder());
                Q4.b(parcel);
                boolean zZzq = zzq(bVarA22);
                parcel2.writeNoException();
                Q4.c(parcel2, zZzq);
                return true;
            case 5:
                String string3 = parcel.readString();
                Q4.b(parcel);
                zzo(string3);
                parcel2.writeNoException();
                return true;
            case 6:
                com.google.android.gms.dynamic.b bVarA23 = b.a.a2(parcel.readStrongBinder());
                com.google.android.gms.dynamic.b bVarA24 = b.a.a2(parcel.readStrongBinder());
                Q4.b(parcel);
                com.google.android.gms.dynamic.b bVarZzd = zzd(bVarA23, bVarA24);
                parcel2.writeNoException();
                Q4.e(parcel2, bVarZzd);
                return true;
            case 7:
                com.google.android.gms.dynamic.b bVarA25 = b.a.a2(parcel.readStrongBinder());
                Q4.b(parcel);
                String strZzf = zzf(bVarA25);
                parcel2.writeNoException();
                parcel2.writeString(strZzf);
                return true;
            case 8:
                com.google.android.gms.dynamic.b bVarA26 = b.a.a2(parcel.readStrongBinder());
                String string4 = parcel.readString();
                Q4.b(parcel);
                String strZze = zze(bVarA26, string4);
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 9:
                com.google.android.gms.dynamic.b bVarA27 = b.a.a2(parcel.readStrongBinder());
                Q4.b(parcel);
                zzl(bVarA27);
                parcel2.writeNoException();
                return true;
            case 10:
                com.google.android.gms.dynamic.b bVarA28 = b.a.a2(parcel.readStrongBinder());
                com.google.android.gms.dynamic.b bVarA29 = b.a.a2(parcel.readStrongBinder());
                Q4.b(parcel);
                com.google.android.gms.dynamic.b bVarZzc = zzc(bVarA28, bVarA29);
                parcel2.writeNoException();
                Q4.e(parcel2, bVarZzc);
                return true;
            case 11:
                String string5 = parcel.readString();
                boolean zF = Q4.f(parcel);
                Q4.b(parcel);
                boolean zO5 = o5(string5, zF);
                parcel2.writeNoException();
                Q4.c(parcel2, zO5);
                return true;
            case 12:
                com.google.android.gms.dynamic.b bVarA210 = b.a.a2(parcel.readStrongBinder());
                byte[] bArrCreateByteArray = parcel.createByteArray();
                Q4.b(parcel);
                String strZzg = zzg(bVarA210, bArrCreateByteArray);
                parcel2.writeNoException();
                parcel2.writeString(strZzg);
                return true;
            case 13:
                com.google.android.gms.dynamic.b bVarA211 = b.a.a2(parcel.readStrongBinder());
                Q4.b(parcel);
                String strZzi = zzi(bVarA211);
                parcel2.writeNoException();
                parcel2.writeString(strZzi);
                return true;
            case 14:
                com.google.android.gms.dynamic.b bVarA212 = b.a.a2(parcel.readStrongBinder());
                com.google.android.gms.dynamic.b bVarA213 = b.a.a2(parcel.readStrongBinder());
                com.google.android.gms.dynamic.b bVarA214 = b.a.a2(parcel.readStrongBinder());
                Q4.b(parcel);
                String strZzk = zzk(bVarA212, bVarA213, bVarA214);
                parcel2.writeNoException();
                parcel2.writeString(strZzk);
                return true;
            case 15:
                com.google.android.gms.dynamic.b bVarA215 = b.a.a2(parcel.readStrongBinder());
                Q4.b(parcel);
                zzm(bVarA215);
                parcel2.writeNoException();
                return true;
            case 16:
            default:
                return false;
            case 17:
                com.google.android.gms.dynamic.b bVarA216 = b.a.a2(parcel.readStrongBinder());
                com.google.android.gms.dynamic.b bVarA217 = b.a.a2(parcel.readStrongBinder());
                com.google.android.gms.dynamic.b bVarA218 = b.a.a2(parcel.readStrongBinder());
                com.google.android.gms.dynamic.b bVarA219 = b.a.a2(parcel.readStrongBinder());
                Q4.b(parcel);
                String strZzh = zzh(bVarA216, bVarA217, bVarA218, bVarA219);
                parcel2.writeNoException();
                parcel2.writeString(strZzh);
                return true;
            case 18:
                parcel2.writeNoException();
                Q4.c(parcel2, true);
                return true;
            case 19:
                parcel2.writeNoException();
                Q4.c(parcel2, true);
                return true;
            case 20:
                int iZzb = zzb();
                parcel2.writeNoException();
                parcel2.writeInt(iZzb);
                return true;
        }
    }

    public V4() {
        super("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
    }
}
