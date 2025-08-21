package s2;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final c f159738a;

    private static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        final InputContentInfo f159739a;

        a(Object obj) {
            this.f159739a = (InputContentInfo) obj;
        }

        @Override // s2.f.c
        public Object a() {
            return this.f159739a;
        }

        @Override // s2.f.c
        public Uri b() {
            return this.f159739a.getContentUri();
        }

        @Override // s2.f.c
        public void c() {
            this.f159739a.requestPermission();
        }

        @Override // s2.f.c
        public Uri d() {
            return this.f159739a.getLinkUri();
        }

        @Override // s2.f.c
        public ClipDescription getDescription() {
            return this.f159739a.getDescription();
        }

        a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f159739a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    private static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        private final Uri f159740a;

        /* renamed from: b, reason: collision with root package name */
        private final ClipDescription f159741b;

        /* renamed from: c, reason: collision with root package name */
        private final Uri f159742c;

        @Override // s2.f.c
        public Object a() {
            return null;
        }

        @Override // s2.f.c
        public void c() {
        }

        @Override // s2.f.c
        public Uri b() {
            return this.f159740a;
        }

        @Override // s2.f.c
        public Uri d() {
            return this.f159742c;
        }

        @Override // s2.f.c
        public ClipDescription getDescription() {
            return this.f159741b;
        }

        b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f159740a = uri;
            this.f159741b = clipDescription;
            this.f159742c = uri2;
        }
    }

    private interface c {
        Object a();

        Uri b();

        void c();

        Uri d();

        ClipDescription getDescription();
    }

    public f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f159738a = new a(uri, clipDescription, uri2);
        } else {
            this.f159738a = new b(uri, clipDescription, uri2);
        }
    }

    public static f f(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new f(new a(obj));
        }
        return null;
    }

    public Uri a() {
        return this.f159738a.b();
    }

    public ClipDescription b() {
        return this.f159738a.getDescription();
    }

    public Uri c() {
        return this.f159738a.d();
    }

    public void d() {
        this.f159738a.c();
    }

    public Object e() {
        return this.f159738a.a();
    }

    private f(c cVar) {
        this.f159738a = cVar;
    }
}
