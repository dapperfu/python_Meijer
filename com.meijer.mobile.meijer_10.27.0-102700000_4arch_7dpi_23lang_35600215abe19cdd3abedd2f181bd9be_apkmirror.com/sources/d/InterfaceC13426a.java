package d;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: d.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC13426a extends IInterface {

    /* renamed from: q3, reason: collision with root package name */
    public static final String f126811q3 = "android$support$v4$os$IResultReceiver".replace('$', '.');

    /* renamed from: d.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC1991a extends Binder implements InterfaceC13426a {

        /* renamed from: d.a$a$a, reason: collision with other inner class name */
        private static class C1992a implements InterfaceC13426a {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f126812a;

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f126812a;
            }

            C1992a(IBinder iBinder) {
                this.f126812a = iBinder;
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public static InterfaceC13426a A1(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC13426a.f126811q3);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC13426a)) ? new C1992a(iBinder) : (InterfaceC13426a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            String str = InterfaceC13426a.f126811q3;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            d5(parcel.readInt(), (Bundle) b.b(parcel, Bundle.CREATOR));
            return true;
        }

        public AbstractBinderC1991a() {
            attachInterface(this, InterfaceC13426a.f126811q3);
        }
    }

    void d5(int i10, Bundle bundle) throws RemoteException;

    /* renamed from: d.a$b */
    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T b(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }
}
