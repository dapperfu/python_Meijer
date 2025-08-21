package a3;

import android.view.View;

/* renamed from: a3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5644a {

    /* renamed from: a, reason: collision with root package name */
    public final View f44589a;

    /* renamed from: b, reason: collision with root package name */
    public final int f44590b;

    /* renamed from: c, reason: collision with root package name */
    public final String f44591c;

    /* renamed from: a3.a$a, reason: collision with other inner class name */
    public static final class C0939a {

        /* renamed from: a, reason: collision with root package name */
        private final View f44592a;

        /* renamed from: b, reason: collision with root package name */
        private final int f44593b;

        /* renamed from: c, reason: collision with root package name */
        private String f44594c;

        public C5644a a() {
            return new C5644a(this.f44592a, this.f44593b, this.f44594c);
        }

        public C0939a b(String str) {
            this.f44594c = str;
            return this;
        }

        public C0939a(View view, int i10) {
            this.f44592a = view;
            this.f44593b = i10;
        }
    }

    @Deprecated
    public C5644a(View view, int i10, String str) {
        this.f44589a = view;
        this.f44590b = i10;
        this.f44591c = str;
    }
}
