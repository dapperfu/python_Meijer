package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import kd.AbstractC15136a;
import kd.C15137b;
import kd.InterfaceC15138c;

/* renamed from: com.google.android.gms.internal.ads.uo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9639uo extends AbstractC15136a {
    public static final Parcelable.Creator<C9639uo> CREATOR = new C9746vo();

    /* renamed from: a, reason: collision with root package name */
    ParcelFileDescriptor f78915a;

    /* renamed from: b, reason: collision with root package name */
    private Parcelable f78916b = null;

    /* renamed from: c, reason: collision with root package name */
    private boolean f78917c = true;

    public final InterfaceC15138c B(Parcelable.Creator creator) throws IOException {
        if (this.f78917c) {
            if (this.f78915a == null) {
                Qc.p.d("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(this.f78915a));
            try {
                try {
                    int i10 = dataInputStream.readInt();
                    byte[] bArr = new byte[i10];
                    dataInputStream.readFully(bArr, 0, i10);
                    com.google.android.gms.common.util.l.a(dataInputStream);
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.unmarshall(bArr, 0, i10);
                        parcelObtain.setDataPosition(0);
                        this.f78916b = (Parcelable) creator.createFromParcel(parcelObtain);
                        parcelObtain.recycle();
                        this.f78917c = false;
                    } catch (Throwable th2) {
                        parcelObtain.recycle();
                        throw th2;
                    }
                } catch (IOException e10) {
                    Qc.p.e("Could not read from parcel file descriptor", e10);
                    com.google.android.gms.common.util.l.a(dataInputStream);
                    return null;
                }
            } catch (Throwable th3) {
                com.google.android.gms.common.util.l.a(dataInputStream);
                throw th3;
            }
        }
        return (InterfaceC15138c) this.f78916b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) throws IOException {
        final ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe;
        if (this.f78915a == null) {
            Parcel parcelObtain = Parcel.obtain();
            try {
                this.f78916b.writeToParcel(parcelObtain, 0);
                final byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                ParcelFileDescriptor parcelFileDescriptor = null;
                try {
                    parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
                    autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptorArrCreatePipe[1]);
                } catch (IOException e10) {
                    e = e10;
                    autoCloseOutputStream = null;
                }
                try {
                    C6908Kq.f68174a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.to
                        @Override // java.lang.Runnable
                        public final void run() throws Throwable {
                            DataOutputStream dataOutputStream;
                            Parcelable.Creator<C9639uo> creator = C9639uo.CREATOR;
                            OutputStream outputStream = autoCloseOutputStream;
                            byte[] bArr = bArrMarshall;
                            DataOutputStream dataOutputStream2 = null;
                            try {
                                try {
                                    dataOutputStream = new DataOutputStream(outputStream);
                                } catch (IOException e11) {
                                    e = e11;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                            try {
                                dataOutputStream.writeInt(bArr.length);
                                dataOutputStream.write(bArr);
                                com.google.android.gms.common.util.l.a(dataOutputStream);
                            } catch (IOException e12) {
                                e = e12;
                                dataOutputStream2 = dataOutputStream;
                                Qc.p.e("Error transporting the ad response", e);
                                Lc.v.s().x(e, "LargeParcelTeleporter.pipeData.1");
                                if (dataOutputStream2 == null) {
                                    com.google.android.gms.common.util.l.a(outputStream);
                                } else {
                                    com.google.android.gms.common.util.l.a(dataOutputStream2);
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                dataOutputStream2 = dataOutputStream;
                                if (dataOutputStream2 == null) {
                                    com.google.android.gms.common.util.l.a(outputStream);
                                } else {
                                    com.google.android.gms.common.util.l.a(dataOutputStream2);
                                }
                                throw th;
                            }
                        }
                    });
                    parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[0];
                } catch (IOException e11) {
                    e = e11;
                    Qc.p.e("Error transporting the ad response", e);
                    Lc.v.s().x(e, "LargeParcelTeleporter.pipeData.2");
                    com.google.android.gms.common.util.l.a(autoCloseOutputStream);
                    this.f78915a = parcelFileDescriptor;
                    int iA = C15137b.a(parcel);
                    C15137b.u(parcel, 2, this.f78915a, i10, false);
                    C15137b.b(parcel, iA);
                }
                this.f78915a = parcelFileDescriptor;
            } catch (Throwable th2) {
                parcelObtain.recycle();
                throw th2;
            }
        }
        int iA2 = C15137b.a(parcel);
        C15137b.u(parcel, 2, this.f78915a, i10, false);
        C15137b.b(parcel, iA2);
    }

    public C9639uo(ParcelFileDescriptor parcelFileDescriptor) {
        this.f78915a = parcelFileDescriptor;
    }
}
