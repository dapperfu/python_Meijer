package p2;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Objects;

/* renamed from: p2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16203c {

    /* renamed from: a, reason: collision with root package name */
    private final f f155362a;

    /* renamed from: p2.c$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC2412c f155363a;

        public C16203c a() {
            return this.f155363a.build();
        }

        public a b(Bundle bundle) {
            this.f155363a.setExtras(bundle);
            return this;
        }

        public a c(int i10) {
            this.f155363a.b(i10);
            return this;
        }

        public a d(Uri uri) {
            this.f155363a.a(uri);
            return this;
        }

        public a(ClipData clipData, int i10) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f155363a = new b(clipData, i10);
            } else {
                this.f155363a = new d(clipData, i10);
            }
        }
    }

    /* renamed from: p2.c$b */
    private static final class b implements InterfaceC2412c {

        /* renamed from: a, reason: collision with root package name */
        private final ContentInfo.Builder f155364a;

        @Override // p2.C16203c.InterfaceC2412c
        public void a(Uri uri) {
            this.f155364a.setLinkUri(uri);
        }

        @Override // p2.C16203c.InterfaceC2412c
        public void b(int i10) {
            this.f155364a.setFlags(i10);
        }

        @Override // p2.C16203c.InterfaceC2412c
        public C16203c build() {
            return new C16203c(new e(this.f155364a.build()));
        }

        @Override // p2.C16203c.InterfaceC2412c
        public void setExtras(Bundle bundle) {
            this.f155364a.setExtras(bundle);
        }

        b(ClipData clipData, int i10) {
            this.f155364a = C16209f.a(clipData, i10);
        }
    }

    /* renamed from: p2.c$c, reason: collision with other inner class name */
    private interface InterfaceC2412c {
        void a(Uri uri);

        void b(int i10);

        C16203c build();

        void setExtras(Bundle bundle);
    }

    /* renamed from: p2.c$d */
    private static final class d implements InterfaceC2412c {

        /* renamed from: a, reason: collision with root package name */
        ClipData f155365a;

        /* renamed from: b, reason: collision with root package name */
        int f155366b;

        /* renamed from: c, reason: collision with root package name */
        int f155367c;

        /* renamed from: d, reason: collision with root package name */
        Uri f155368d;

        /* renamed from: e, reason: collision with root package name */
        Bundle f155369e;

        @Override // p2.C16203c.InterfaceC2412c
        public void a(Uri uri) {
            this.f155368d = uri;
        }

        @Override // p2.C16203c.InterfaceC2412c
        public void b(int i10) {
            this.f155367c = i10;
        }

        @Override // p2.C16203c.InterfaceC2412c
        public C16203c build() {
            return new C16203c(new g(this));
        }

        @Override // p2.C16203c.InterfaceC2412c
        public void setExtras(Bundle bundle) {
            this.f155369e = bundle;
        }

        d(ClipData clipData, int i10) {
            this.f155365a = clipData;
            this.f155366b = i10;
        }
    }

    /* renamed from: p2.c$e */
    private static final class e implements f {

        /* renamed from: a, reason: collision with root package name */
        private final ContentInfo f155370a;

        @Override // p2.C16203c.f
        public ClipData a() {
            return this.f155370a.getClip();
        }

        @Override // p2.C16203c.f
        public ContentInfo b() {
            return this.f155370a;
        }

        @Override // p2.C16203c.f
        public int c() {
            return this.f155370a.getFlags();
        }

        @Override // p2.C16203c.f
        public int g() {
            return this.f155370a.getSource();
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f155370a + "}";
        }

        e(ContentInfo contentInfo) {
            this.f155370a = C16201b.a(o2.i.g(contentInfo));
        }
    }

    /* renamed from: p2.c$f */
    private interface f {
        ClipData a();

        ContentInfo b();

        int c();

        int g();
    }

    /* renamed from: p2.c$g */
    private static final class g implements f {

        /* renamed from: a, reason: collision with root package name */
        private final ClipData f155371a;

        /* renamed from: b, reason: collision with root package name */
        private final int f155372b;

        /* renamed from: c, reason: collision with root package name */
        private final int f155373c;

        /* renamed from: d, reason: collision with root package name */
        private final Uri f155374d;

        /* renamed from: e, reason: collision with root package name */
        private final Bundle f155375e;

        @Override // p2.C16203c.f
        public ContentInfo b() {
            return null;
        }

        @Override // p2.C16203c.f
        public ClipData a() {
            return this.f155371a;
        }

        @Override // p2.C16203c.f
        public int c() {
            return this.f155373c;
        }

        @Override // p2.C16203c.f
        public int g() {
            return this.f155372b;
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ContentInfoCompat{clip=");
            sb2.append(this.f155371a.getDescription());
            sb2.append(", source=");
            sb2.append(C16203c.e(this.f155372b));
            sb2.append(", flags=");
            sb2.append(C16203c.a(this.f155373c));
            if (this.f155374d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.f155374d.toString().length() + ")";
            }
            sb2.append(str);
            sb2.append(this.f155375e != null ? ", hasExtras" : "");
            sb2.append("}");
            return sb2.toString();
        }

        g(d dVar) {
            this.f155371a = (ClipData) o2.i.g(dVar.f155365a);
            this.f155372b = o2.i.c(dVar.f155366b, 0, 5, "source");
            this.f155373c = o2.i.f(dVar.f155367c, 1);
            this.f155374d = dVar.f155368d;
            this.f155375e = dVar.f155369e;
        }
    }

    static String a(int i10) {
        return (i10 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i10);
    }

    static String e(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? String.valueOf(i10) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    public static C16203c g(ContentInfo contentInfo) {
        return new C16203c(new e(contentInfo));
    }

    public ClipData b() {
        return this.f155362a.a();
    }

    public int c() {
        return this.f155362a.c();
    }

    public int d() {
        return this.f155362a.g();
    }

    public ContentInfo f() {
        ContentInfo contentInfoB = this.f155362a.b();
        Objects.requireNonNull(contentInfoB);
        return C16201b.a(contentInfoB);
    }

    public String toString() {
        return this.f155362a.toString();
    }

    C16203c(f fVar) {
        this.f155362a = fVar;
    }
}
