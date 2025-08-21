package b;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: b.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC6300b extends IInterface {

    /* renamed from: f3, reason: collision with root package name */
    public static final String f59718f3 = "android$support$customtabs$ICustomTabsService".replace('$', '.');

    /* renamed from: b.b$a */
    public static abstract class a extends Binder implements InterfaceC6300b {

        /* renamed from: b.b$a$a, reason: collision with other inner class name */
        private static class C1182a implements InterfaceC6300b {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f59719a;

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f59719a;
            }

            C1182a(IBinder iBinder) {
                this.f59719a = iBinder;
            }

            @Override // b.InterfaceC6300b
            public boolean G7(InterfaceC6299a interfaceC6299a, Uri uri) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC6300b.f59718f3);
                    parcelObtain.writeStrongInterface(interfaceC6299a);
                    boolean z10 = false;
                    C1183b.b(parcelObtain, uri, 0);
                    this.f59719a.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        z10 = true;
                    }
                    return z10;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // b.InterfaceC6300b
            public boolean h1(InterfaceC6299a interfaceC6299a, Uri uri, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC6300b.f59718f3);
                    parcelObtain.writeStrongInterface(interfaceC6299a);
                    boolean z10 = false;
                    C1183b.b(parcelObtain, uri, 0);
                    C1183b.b(parcelObtain, bundle, 0);
                    this.f59719a.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        z10 = true;
                    }
                    return z10;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // b.InterfaceC6300b
            public boolean i7(long j10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC6300b.f59718f3);
                    parcelObtain.writeLong(j10);
                    boolean z10 = false;
                    this.f59719a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        z10 = true;
                    }
                    return z10;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // b.InterfaceC6300b
            public boolean k4(InterfaceC6299a interfaceC6299a, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC6300b.f59718f3);
                    parcelObtain.writeStrongInterface(interfaceC6299a);
                    boolean z10 = false;
                    C1183b.b(parcelObtain, bundle, 0);
                    this.f59719a.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        z10 = true;
                    }
                    return z10;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // b.InterfaceC6300b
            public int v1(InterfaceC6299a interfaceC6299a, String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC6300b.f59718f3);
                    parcelObtain.writeStrongInterface(interfaceC6299a);
                    parcelObtain.writeString(str);
                    C1183b.b(parcelObtain, bundle, 0);
                    this.f59719a.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // b.InterfaceC6300b
            public boolean v7(InterfaceC6299a interfaceC6299a) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC6300b.f59718f3);
                    parcelObtain.writeStrongInterface(interfaceC6299a);
                    boolean z10 = false;
                    this.f59719a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        z10 = true;
                    }
                    return z10;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static InterfaceC6300b K1(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC6300b.f59718f3);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC6300b)) ? new C1182a(iBinder) : (InterfaceC6300b) iInterfaceQueryLocalInterface;
        }
    }

    /* renamed from: b.b$b, reason: collision with other inner class name */
    public static class C1183b {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void b(Parcel parcel, T t10, int i10) {
            if (t10 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t10.writeToParcel(parcel, i10);
            }
        }
    }

    boolean G7(InterfaceC6299a interfaceC6299a, Uri uri) throws RemoteException;

    boolean h1(InterfaceC6299a interfaceC6299a, Uri uri, Bundle bundle) throws RemoteException;

    boolean i7(long j10) throws RemoteException;

    boolean k4(InterfaceC6299a interfaceC6299a, Bundle bundle) throws RemoteException;

    int v1(InterfaceC6299a interfaceC6299a, String str, Bundle bundle) throws RemoteException;

    boolean v7(InterfaceC6299a interfaceC6299a) throws RemoteException;
}
