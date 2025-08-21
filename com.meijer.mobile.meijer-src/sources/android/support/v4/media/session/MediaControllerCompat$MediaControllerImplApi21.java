package android.support.v4.media.session;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.b;
import android.support.v4.media.session.c;
import com.fullstory.FS;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
class MediaControllerCompat$MediaControllerImplApi21 {

    /* renamed from: a, reason: collision with root package name */
    final Object f45779a;

    /* renamed from: b, reason: collision with root package name */
    private final List<c> f45780b;

    /* renamed from: c, reason: collision with root package name */
    private HashMap<c, a> f45781c;

    /* renamed from: d, reason: collision with root package name */
    final MediaSessionCompat.Token f45782d;

    private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference<MediaControllerCompat$MediaControllerImplApi21> f45783a;

        @Override // android.os.ResultReceiver
        protected void onReceiveResult(int i10, Bundle bundle) {
            MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = this.f45783a.get();
            if (mediaControllerCompat$MediaControllerImplApi21 == null || bundle == null) {
                return;
            }
            synchronized (mediaControllerCompat$MediaControllerImplApi21.f45779a) {
                mediaControllerCompat$MediaControllerImplApi21.f45782d.b(b.a.K1(androidx.core.app.h.a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                mediaControllerCompat$MediaControllerImplApi21.f45782d.c(bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE"));
                mediaControllerCompat$MediaControllerImplApi21.a();
            }
        }
    }

    private static class a extends c.b {
        @Override // android.support.v4.media.session.a
        public void D0(CharSequence charSequence) throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.a
        public void F3(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.a
        public void Z(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.a
        public void b0() throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.a
        public void q5(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.a
        public void w0(Bundle bundle) throws RemoteException {
            throw new AssertionError();
        }

        a(c cVar) {
            super(cVar);
        }
    }

    void a() {
        if (this.f45782d.a() == null) {
            return;
        }
        for (c cVar : this.f45780b) {
            a aVar = new a(cVar);
            this.f45781c.put(cVar, aVar);
            cVar.f45815b = aVar;
            try {
                this.f45782d.a().z5(aVar);
                cVar.i(13, null, null);
            } catch (RemoteException e10) {
                FS.log_e("MediaControllerCompat", "Dead object in registerCallback.", e10);
            }
        }
        this.f45780b.clear();
    }
}
