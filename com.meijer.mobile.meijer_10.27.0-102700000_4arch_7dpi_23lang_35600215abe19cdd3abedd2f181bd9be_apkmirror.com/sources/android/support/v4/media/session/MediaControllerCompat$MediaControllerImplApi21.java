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
    final Object f45555a;

    /* renamed from: b, reason: collision with root package name */
    private final List<c> f45556b;

    /* renamed from: c, reason: collision with root package name */
    private HashMap<c, a> f45557c;

    /* renamed from: d, reason: collision with root package name */
    final MediaSessionCompat.Token f45558d;

    private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference<MediaControllerCompat$MediaControllerImplApi21> f45559a;

        @Override // android.os.ResultReceiver
        protected void onReceiveResult(int i10, Bundle bundle) {
            MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = this.f45559a.get();
            if (mediaControllerCompat$MediaControllerImplApi21 == null || bundle == null) {
                return;
            }
            synchronized (mediaControllerCompat$MediaControllerImplApi21.f45555a) {
                mediaControllerCompat$MediaControllerImplApi21.f45558d.b(b.a.A1(androidx.core.app.h.a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                mediaControllerCompat$MediaControllerImplApi21.f45558d.c(bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE"));
                mediaControllerCompat$MediaControllerImplApi21.a();
            }
        }
    }

    private static class a extends c.b {
        @Override // android.support.v4.media.session.a
        public void A0(CharSequence charSequence) throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.a
        public void Y(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.a
        public void Z() throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.a
        public void i5(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.a
        public void u3(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.a
        public void v0(Bundle bundle) throws RemoteException {
            throw new AssertionError();
        }

        a(c cVar) {
            super(cVar);
        }
    }

    void a() {
        if (this.f45558d.a() == null) {
            return;
        }
        for (c cVar : this.f45556b) {
            a aVar = new a(cVar);
            this.f45557c.put(cVar, aVar);
            cVar.f45591b = aVar;
            try {
                this.f45558d.a().t5(aVar);
                cVar.i(13, null, null);
            } catch (RemoteException e10) {
                FS.log_e("MediaControllerCompat", "Dead object in registerCallback.", e10);
            }
        }
        this.f45556b.clear();
    }
}
