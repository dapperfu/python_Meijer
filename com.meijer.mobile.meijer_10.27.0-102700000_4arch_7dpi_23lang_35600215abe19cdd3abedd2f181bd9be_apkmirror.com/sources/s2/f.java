package s2;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final c f159875a;

    private static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        final InputContentInfo f159876a;

        a(Object obj) {
            this.f159876a = (InputContentInfo) obj;
        }

        @Override // s2.f.c
        public Object a() {
            return this.f159876a;
        }

        @Override // s2.f.c
        public Uri b() {
            return this.f159876a.getContentUri();
        }

        @Override // s2.f.c
        public void c() {
            this.f159876a.requestPermission();
        }

        @Override // s2.f.c
        public Uri d() {
            return this.f159876a.getLinkUri();
        }

        @Override // s2.f.c
        public ClipDescription getDescription() {
            return this.f159876a.getDescription();
        }

        a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f159876a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    private static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        private final Uri f159877a;

        /* renamed from: b, reason: collision with root package name */
        private final ClipDescription f159878b;

        /* renamed from: c, reason: collision with root package name */
        private final Uri f159879c;

        @Override // s2.f.c
        public Object a() {
            return null;
        }

        @Override // s2.f.c
        public void c() {
        }

        @Override // s2.f.c
        public Uri b() {
            return this.f159877a;
        }

        @Override // s2.f.c
        public Uri d() {
            return this.f159879c;
        }

        @Override // s2.f.c
        public ClipDescription getDescription() {
            return this.f159878b;
        }

        b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f159877a = uri;
            this.f159878b = clipDescription;
            this.f159879c = uri2;
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
            this.f159875a = new a(uri, clipDescription, uri2);
        } else {
            this.f159875a = new b(uri, clipDescription, uri2);
        }
    }

    public static f f(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new f(new a(obj));
        }
        return null;
    }

    public Uri a() {
        return this.f159875a.b();
    }

    public ClipDescription b() {
        return this.f159875a.getDescription();
    }

    public Uri c() {
        return this.f159875a.d();
    }

    public void d() {
        this.f159875a.c();
    }

    public Object e() {
        return this.f159875a.a();
    }

    private f(c cVar) {
        this.f159875a = cVar;
    }
}
