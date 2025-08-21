package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.a;
import android.support.v4.media.session.e;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes.dex */
public abstract class c implements IBinder.DeathRecipient {

    /* renamed from: a, reason: collision with root package name */
    final Object f45814a = e.a(new a(this));

    /* renamed from: b, reason: collision with root package name */
    android.support.v4.media.session.a f45815b;

    private static class a implements e.a {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<c> f45816a;

        @Override // android.support.v4.media.session.e.a
        public void D0(CharSequence charSequence) {
            c cVar = this.f45816a.get();
            if (cVar != null) {
                cVar.f(charSequence);
            }
        }

        @Override // android.support.v4.media.session.e.a
        public void Z(List<?> list) {
            c cVar = this.f45816a.get();
            if (cVar != null) {
                cVar.e(MediaSessionCompat.QueueItem.b(list));
            }
        }

        @Override // android.support.v4.media.session.e.a
        public void a(Object obj) {
            c cVar = this.f45816a.get();
            if (cVar != null) {
                cVar.c(MediaMetadataCompat.a(obj));
            }
        }

        @Override // android.support.v4.media.session.e.a
        public void b(Object obj) {
            c cVar = this.f45816a.get();
            if (cVar == null || cVar.f45815b != null) {
                return;
            }
            cVar.d(PlaybackStateCompat.a(obj));
        }

        @Override // android.support.v4.media.session.e.a
        public void b0() {
            c cVar = this.f45816a.get();
            if (cVar != null) {
                cVar.g();
            }
        }

        @Override // android.support.v4.media.session.e.a
        public void c(String str, Bundle bundle) {
            c cVar = this.f45816a.get();
            if (cVar != null) {
                cVar.h(str, bundle);
            }
        }

        @Override // android.support.v4.media.session.e.a
        public void d(int i10, int i11, int i12, int i13, int i14) {
            c cVar = this.f45816a.get();
            if (cVar != null) {
                cVar.a(new d(i10, i11, i12, i13, i14));
            }
        }

        @Override // android.support.v4.media.session.e.a
        public void w0(Bundle bundle) {
            c cVar = this.f45816a.get();
            if (cVar != null) {
                cVar.b(bundle);
            }
        }

        a(c cVar) {
            this.f45816a = new WeakReference<>(cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b extends a.AbstractBinderC0964a {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<c> f45817a;

        @Override // android.support.v4.media.session.a
        public void E7(boolean z10) throws RemoteException {
        }

        @Override // android.support.v4.media.session.a
        public void G0(int i10) throws RemoteException {
            c cVar = this.f45817a.get();
            if (cVar != null) {
                cVar.i(9, Integer.valueOf(i10), null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void N0(String str, Bundle bundle) throws RemoteException {
            c cVar = this.f45817a.get();
            if (cVar != null) {
                cVar.i(1, str, bundle);
            }
        }

        @Override // android.support.v4.media.session.a
        public void T1() throws RemoteException {
            c cVar = this.f45817a.get();
            if (cVar != null) {
                cVar.i(13, null, null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void h7(boolean z10) throws RemoteException {
            c cVar = this.f45817a.get();
            if (cVar != null) {
                cVar.i(11, Boolean.valueOf(z10), null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void q4(int i10) throws RemoteException {
            c cVar = this.f45817a.get();
            if (cVar != null) {
                cVar.i(12, Integer.valueOf(i10), null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void t9(PlaybackStateCompat playbackStateCompat) throws RemoteException {
            c cVar = this.f45817a.get();
            if (cVar != null) {
                cVar.i(2, playbackStateCompat, null);
            }
        }

        b(c cVar) {
            this.f45817a = new WeakReference<>(cVar);
        }
    }

    public void a(d dVar) {
    }

    public void b(Bundle bundle) {
    }

    public void c(MediaMetadataCompat mediaMetadataCompat) {
    }

    public void d(PlaybackStateCompat playbackStateCompat) {
    }

    public void e(List<MediaSessionCompat.QueueItem> list) {
    }

    public void f(CharSequence charSequence) {
    }

    public void g() {
    }

    public void h(String str, Bundle bundle) {
    }

    void i(int i10, Object obj, Bundle bundle) {
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        i(8, null, null);
    }
}
