package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes.dex */
public interface a extends IInterface {
    void D0(CharSequence charSequence) throws RemoteException;

    void E7(boolean z10) throws RemoteException;

    void F3(MediaMetadataCompat mediaMetadataCompat) throws RemoteException;

    void G0(int i10) throws RemoteException;

    void N0(String str, Bundle bundle) throws RemoteException;

    void T1() throws RemoteException;

    void Z(List<MediaSessionCompat.QueueItem> list) throws RemoteException;

    void b0() throws RemoteException;

    void h7(boolean z10) throws RemoteException;

    void q4(int i10) throws RemoteException;

    void q5(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException;

    void t9(PlaybackStateCompat playbackStateCompat) throws RemoteException;

    void w0(Bundle bundle) throws RemoteException;

    /* renamed from: android.support.v4.media.session.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0964a extends Binder implements a {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public AbstractBinderC0964a() {
            attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 != 1598968902) {
                boolean z10 = false;
                Bundle bundle = null;
                ParcelableVolumeInfo parcelableVolumeInfoCreateFromParcel = null;
                Bundle bundle2 = null;
                CharSequence charSequence = null;
                MediaMetadataCompat mediaMetadataCompatCreateFromParcel = null;
                PlaybackStateCompat playbackStateCompatCreateFromParcel = null;
                switch (i10) {
                    case 1:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        String string = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        N0(string, bundle);
                        return true;
                    case 2:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        b0();
                        return true;
                    case 3:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            playbackStateCompatCreateFromParcel = PlaybackStateCompat.CREATOR.createFromParcel(parcel);
                        }
                        t9(playbackStateCompatCreateFromParcel);
                        return true;
                    case 4:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            mediaMetadataCompatCreateFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(parcel);
                        }
                        F3(mediaMetadataCompatCreateFromParcel);
                        return true;
                    case 5:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        Z(parcel.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR));
                        return true;
                    case 6:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                        }
                        D0(charSequence);
                        return true;
                    case 7:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        w0(bundle2);
                        return true;
                    case 8:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            parcelableVolumeInfoCreateFromParcel = ParcelableVolumeInfo.CREATOR.createFromParcel(parcel);
                        }
                        q5(parcelableVolumeInfoCreateFromParcel);
                        return true;
                    case 9:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        G0(parcel.readInt());
                        return true;
                    case 10:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            z10 = true;
                        }
                        E7(z10);
                        return true;
                    case 11:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            z10 = true;
                        }
                        h7(z10);
                        return true;
                    case 12:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        q4(parcel.readInt());
                        return true;
                    case 13:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        T1();
                        return true;
                    default:
                        return super.onTransact(i10, parcel, parcel2, i11);
                }
            }
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
    }
}
