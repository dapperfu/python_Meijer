package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import md.AbstractC15707a;
import md.C15708b;
import md.InterfaceC15709c;

/* renamed from: com.google.android.gms.internal.ads.uo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9764uo extends AbstractC15707a {
    public static final Parcelable.Creator<C9764uo> CREATOR = new C9871vo();

    /* renamed from: a, reason: collision with root package name */
    ParcelFileDescriptor f79755a;

    /* renamed from: b, reason: collision with root package name */
    private Parcelable f79756b = null;

    /* renamed from: c, reason: collision with root package name */
    private boolean f79757c = true;

    public final InterfaceC15709c B(Parcelable.Creator creator) throws IOException {
        if (this.f79757c) {
            if (this.f79755a == null) {
                Sc.p.d("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(this.f79755a));
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
                        this.f79756b = (Parcelable) creator.createFromParcel(parcelObtain);
                        parcelObtain.recycle();
                        this.f79757c = false;
                    } catch (Throwable th2) {
                        parcelObtain.recycle();
                        throw th2;
                    }
                } catch (IOException e10) {
                    Sc.p.e("Could not read from parcel file descriptor", e10);
                    com.google.android.gms.common.util.l.a(dataInputStream);
                    return null;
                }
            } catch (Throwable th3) {
                com.google.android.gms.common.util.l.a(dataInputStream);
                throw th3;
            }
        }
        return (InterfaceC15709c) this.f79756b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) throws IOException {
        final ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe;
        if (this.f79755a == null) {
            Parcel parcelObtain = Parcel.obtain();
            try {
                this.f79756b.writeToParcel(parcelObtain, 0);
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
                    C7033Kq.f69014a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.to
                        @Override // java.lang.Runnable
                        public final void run() throws Throwable {
                            DataOutputStream dataOutputStream;
                            Parcelable.Creator<C9764uo> creator = C9764uo.CREATOR;
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
                                Sc.p.e("Error transporting the ad response", e);
                                Nc.v.s().x(e, "LargeParcelTeleporter.pipeData.1");
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
                    Sc.p.e("Error transporting the ad response", e);
                    Nc.v.s().x(e, "LargeParcelTeleporter.pipeData.2");
                    com.google.android.gms.common.util.l.a(autoCloseOutputStream);
                    this.f79755a = parcelFileDescriptor;
                    int iA = C15708b.a(parcel);
                    C15708b.u(parcel, 2, this.f79755a, i10, false);
                    C15708b.b(parcel, iA);
                }
                this.f79755a = parcelFileDescriptor;
            } catch (Throwable th2) {
                parcelObtain.recycle();
                throw th2;
            }
        }
        int iA2 = C15708b.a(parcel);
        C15708b.u(parcel, 2, this.f79755a, i10, false);
        C15708b.b(parcel, iA2);
    }

    public C9764uo(ParcelFileDescriptor parcelFileDescriptor) {
        this.f79755a = parcelFileDescriptor;
    }
}
