package hd;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* loaded from: classes4.dex */
public final class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new j();

    /* renamed from: a, reason: collision with root package name */
    Messenger f135318a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return a().equals(((l) obj).a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final IBinder a() {
        Messenger messenger = this.f135318a;
        messenger.getClass();
        return messenger.getBinder();
    }

    public final void b(Message message) throws RemoteException {
        Messenger messenger = this.f135318a;
        messenger.getClass();
        messenger.send(message);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Messenger messenger = this.f135318a;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }

    public l(IBinder iBinder) {
        this.f135318a = new Messenger(iBinder);
    }

    public final int hashCode() {
        return a().hashCode();
    }
}
