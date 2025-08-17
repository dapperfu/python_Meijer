package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: androidx.room.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC6125k extends IInterface {

    /* renamed from: c3, reason: collision with root package name */
    public static final String f58579c3 = "androidx$room$IMultiInstanceInvalidationCallback".replace('$', '.');

    /* renamed from: androidx.room.k$a */
    public static abstract class a extends Binder implements InterfaceC6125k {

        /* renamed from: androidx.room.k$a$a, reason: collision with other inner class name */
        private static class C1145a implements InterfaceC6125k {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f58580a;

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f58580a;
            }

            C1145a(IBinder iBinder) {
                this.f58580a = iBinder;
            }

            @Override // androidx.room.InterfaceC6125k
            public void C1(String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC6125k.f58579c3);
                    parcelObtain.writeStringArray(strArr);
                    this.f58580a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public static InterfaceC6125k A1(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC6125k.f58579c3);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC6125k)) ? new C1145a(iBinder) : (InterfaceC6125k) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            String str = InterfaceC6125k.f58579c3;
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
            C1(parcel.createStringArray());
            return true;
        }

        public a() {
            attachInterface(this, InterfaceC6125k.f58579c3);
        }
    }

    void C1(String[] strArr) throws RemoteException;
}
