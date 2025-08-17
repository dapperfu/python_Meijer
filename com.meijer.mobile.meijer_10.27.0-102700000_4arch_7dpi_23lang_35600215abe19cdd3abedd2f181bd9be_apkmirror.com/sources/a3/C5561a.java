package a3;

import android.view.View;

/* renamed from: a3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5561a {

    /* renamed from: a, reason: collision with root package name */
    public final View f43771a;

    /* renamed from: b, reason: collision with root package name */
    public final int f43772b;

    /* renamed from: c, reason: collision with root package name */
    public final String f43773c;

    /* renamed from: a3.a$a, reason: collision with other inner class name */
    public static final class C0937a {

        /* renamed from: a, reason: collision with root package name */
        private final View f43774a;

        /* renamed from: b, reason: collision with root package name */
        private final int f43775b;

        /* renamed from: c, reason: collision with root package name */
        private String f43776c;

        public C5561a a() {
            return new C5561a(this.f43774a, this.f43775b, this.f43776c);
        }

        public C0937a b(String str) {
            this.f43776c = str;
            return this;
        }

        public C0937a(View view, int i10) {
            this.f43774a = view;
            this.f43775b = i10;
        }
    }

    @Deprecated
    public C5561a(View view, int i10, String str) {
        this.f43771a = view;
        this.f43772b = i10;
        this.f43773c = str;
    }
}
