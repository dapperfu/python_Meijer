package p2;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Objects;

/* renamed from: p2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16348c {

    /* renamed from: a, reason: collision with root package name */
    private final f f156036a;

    /* renamed from: p2.c$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC2416c f156037a;

        public C16348c a() {
            return this.f156037a.build();
        }

        public a b(Bundle bundle) {
            this.f156037a.setExtras(bundle);
            return this;
        }

        public a c(int i10) {
            this.f156037a.b(i10);
            return this;
        }

        public a d(Uri uri) {
            this.f156037a.a(uri);
            return this;
        }

        public a(ClipData clipData, int i10) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f156037a = new b(clipData, i10);
            } else {
                this.f156037a = new d(clipData, i10);
            }
        }
    }

    /* renamed from: p2.c$b */
    private static final class b implements InterfaceC2416c {

        /* renamed from: a, reason: collision with root package name */
        private final ContentInfo.Builder f156038a;

        @Override // p2.C16348c.InterfaceC2416c
        public void a(Uri uri) {
            this.f156038a.setLinkUri(uri);
        }

        @Override // p2.C16348c.InterfaceC2416c
        public void b(int i10) {
            this.f156038a.setFlags(i10);
        }

        @Override // p2.C16348c.InterfaceC2416c
        public C16348c build() {
            return new C16348c(new e(this.f156038a.build()));
        }

        @Override // p2.C16348c.InterfaceC2416c
        public void setExtras(Bundle bundle) {
            this.f156038a.setExtras(bundle);
        }

        b(ClipData clipData, int i10) {
            this.f156038a = C16354f.a(clipData, i10);
        }
    }

    /* renamed from: p2.c$c, reason: collision with other inner class name */
    private interface InterfaceC2416c {
        void a(Uri uri);

        void b(int i10);

        C16348c build();

        void setExtras(Bundle bundle);
    }

    /* renamed from: p2.c$d */
    private static final class d implements InterfaceC2416c {

        /* renamed from: a, reason: collision with root package name */
        ClipData f156039a;

        /* renamed from: b, reason: collision with root package name */
        int f156040b;

        /* renamed from: c, reason: collision with root package name */
        int f156041c;

        /* renamed from: d, reason: collision with root package name */
        Uri f156042d;

        /* renamed from: e, reason: collision with root package name */
        Bundle f156043e;

        @Override // p2.C16348c.InterfaceC2416c
        public void a(Uri uri) {
            this.f156042d = uri;
        }

        @Override // p2.C16348c.InterfaceC2416c
        public void b(int i10) {
            this.f156041c = i10;
        }

        @Override // p2.C16348c.InterfaceC2416c
        public C16348c build() {
            return new C16348c(new g(this));
        }

        @Override // p2.C16348c.InterfaceC2416c
        public void setExtras(Bundle bundle) {
            this.f156043e = bundle;
        }

        d(ClipData clipData, int i10) {
            this.f156039a = clipData;
            this.f156040b = i10;
        }
    }

    /* renamed from: p2.c$e */
    private static final class e implements f {

        /* renamed from: a, reason: collision with root package name */
        private final ContentInfo f156044a;

        @Override // p2.C16348c.f
        public ClipData a() {
            return this.f156044a.getClip();
        }

        @Override // p2.C16348c.f
        public ContentInfo b() {
            return this.f156044a;
        }

        @Override // p2.C16348c.f
        public int c() {
            return this.f156044a.getFlags();
        }

        @Override // p2.C16348c.f
        public int g() {
            return this.f156044a.getSource();
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f156044a + "}";
        }

        e(ContentInfo contentInfo) {
            this.f156044a = C16346b.a(o2.i.g(contentInfo));
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
        private final ClipData f156045a;

        /* renamed from: b, reason: collision with root package name */
        private final int f156046b;

        /* renamed from: c, reason: collision with root package name */
        private final int f156047c;

        /* renamed from: d, reason: collision with root package name */
        private final Uri f156048d;

        /* renamed from: e, reason: collision with root package name */
        private final Bundle f156049e;

        @Override // p2.C16348c.f
        public ContentInfo b() {
            return null;
        }

        @Override // p2.C16348c.f
        public ClipData a() {
            return this.f156045a;
        }

        @Override // p2.C16348c.f
        public int c() {
            return this.f156047c;
        }

        @Override // p2.C16348c.f
        public int g() {
            return this.f156046b;
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ContentInfoCompat{clip=");
            sb2.append(this.f156045a.getDescription());
            sb2.append(", source=");
            sb2.append(C16348c.e(this.f156046b));
            sb2.append(", flags=");
            sb2.append(C16348c.a(this.f156047c));
            if (this.f156048d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.f156048d.toString().length() + ")";
            }
            sb2.append(str);
            sb2.append(this.f156049e != null ? ", hasExtras" : "");
            sb2.append("}");
            return sb2.toString();
        }

        g(d dVar) {
            this.f156045a = (ClipData) o2.i.g(dVar.f156039a);
            this.f156046b = o2.i.c(dVar.f156040b, 0, 5, "source");
            this.f156047c = o2.i.f(dVar.f156041c, 1);
            this.f156048d = dVar.f156042d;
            this.f156049e = dVar.f156043e;
        }
    }

    static String a(int i10) {
        return (i10 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i10);
    }

    static String e(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? String.valueOf(i10) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    public static C16348c g(ContentInfo contentInfo) {
        return new C16348c(new e(contentInfo));
    }

    public ClipData b() {
        return this.f156036a.a();
    }

    public int c() {
        return this.f156036a.c();
    }

    public int d() {
        return this.f156036a.g();
    }

    public ContentInfo f() {
        ContentInfo contentInfoB = this.f156036a.b();
        Objects.requireNonNull(contentInfoB);
        return C16346b.a(contentInfoB);
    }

    public String toString() {
        return this.f156036a.toString();
    }

    C16348c(f fVar) {
        this.f156036a = fVar;
    }
}
