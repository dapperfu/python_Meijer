package b;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: b.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC6299a extends IInterface {

    /* renamed from: e3, reason: collision with root package name */
    public static final String f59717e3 = "android$support$customtabs$ICustomTabsCallback".replace('$', '.');

    /* renamed from: b.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC1180a extends Binder implements InterfaceC6299a {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            String str = InterfaceC6299a.f59717e3;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i10) {
                case 2:
                    r8(parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 3:
                    b4(parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 4:
                    i9((Bundle) b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    W8(parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    m9(parcel.readInt(), (Uri) b.c(parcel, Uri.CREATOR), parcel.readInt() != 0, (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 7:
                    Bundle bundleI2 = i2(parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    b.d(parcel2, bundleI2, 1);
                    return true;
                case 8:
                    K7(parcel.readInt(), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 9:
                    p4((Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 10:
                    J1(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 11:
                    p7((Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 12:
                    y7((Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
        }

        public AbstractBinderC1180a() {
            attachInterface(this, InterfaceC6299a.f59717e3);
        }
    }

    /* renamed from: b.a$b */
    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void d(Parcel parcel, T t10, int i10) {
            if (t10 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t10.writeToParcel(parcel, i10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    void J1(int i10, int i11, int i12, int i13, int i14, Bundle bundle) throws RemoteException;

    void K7(int i10, int i11, Bundle bundle) throws RemoteException;

    void W8(String str, Bundle bundle) throws RemoteException;

    void b4(String str, Bundle bundle) throws RemoteException;

    Bundle i2(String str, Bundle bundle) throws RemoteException;

    void i9(Bundle bundle) throws RemoteException;

    void m9(int i10, Uri uri, boolean z10, Bundle bundle) throws RemoteException;

    void p4(Bundle bundle) throws RemoteException;

    void p7(Bundle bundle) throws RemoteException;

    void r8(int i10, Bundle bundle) throws RemoteException;

    void y7(Bundle bundle) throws RemoteException;
}
