package a3;

import android.media.AudioAttributes;
import d3.P;

/* renamed from: a3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5564d {

    /* renamed from: g, reason: collision with root package name */
    public static final C5564d f43811g = new e().a();

    /* renamed from: h, reason: collision with root package name */
    private static final String f43812h = P.y0(0);

    /* renamed from: i, reason: collision with root package name */
    private static final String f43813i = P.y0(1);

    /* renamed from: j, reason: collision with root package name */
    private static final String f43814j = P.y0(2);

    /* renamed from: k, reason: collision with root package name */
    private static final String f43815k = P.y0(3);

    /* renamed from: l, reason: collision with root package name */
    private static final String f43816l = P.y0(4);

    /* renamed from: a, reason: collision with root package name */
    public final int f43817a;

    /* renamed from: b, reason: collision with root package name */
    public final int f43818b;

    /* renamed from: c, reason: collision with root package name */
    public final int f43819c;

    /* renamed from: d, reason: collision with root package name */
    public final int f43820d;

    /* renamed from: e, reason: collision with root package name */
    public final int f43821e;

    /* renamed from: f, reason: collision with root package name */
    private C0938d f43822f;

    /* renamed from: a3.d$d, reason: collision with other inner class name */
    public static final class C0938d {

        /* renamed from: a, reason: collision with root package name */
        public final AudioAttributes f43823a;

        private C0938d(C5564d c5564d) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(c5564d.f43817a).setFlags(c5564d.f43818b).setUsage(c5564d.f43819c);
            int i10 = P.f127086a;
            if (i10 >= 29) {
                b.a(usage, c5564d.f43820d);
            }
            if (i10 >= 32) {
                c.a(usage, c5564d.f43821e);
            }
            this.f43823a = usage.build();
        }
    }

    /* renamed from: a3.d$e */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        private int f43824a = 0;

        /* renamed from: b, reason: collision with root package name */
        private int f43825b = 0;

        /* renamed from: c, reason: collision with root package name */
        private int f43826c = 1;

        /* renamed from: d, reason: collision with root package name */
        private int f43827d = 1;

        /* renamed from: e, reason: collision with root package name */
        private int f43828e = 0;

        public C5564d a() {
            return new C5564d(this.f43824a, this.f43825b, this.f43826c, this.f43827d, this.f43828e);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5564d.class == obj.getClass()) {
            C5564d c5564d = (C5564d) obj;
            if (this.f43817a == c5564d.f43817a && this.f43818b == c5564d.f43818b && this.f43819c == c5564d.f43819c && this.f43820d == c5564d.f43820d && this.f43821e == c5564d.f43821e) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a3.d$b */
    private static final class b {
        public static void a(AudioAttributes.Builder builder, int i10) {
            builder.setAllowedCapturePolicy(i10);
        }
    }

    /* renamed from: a3.d$c */
    private static final class c {
        public static void a(AudioAttributes.Builder builder, int i10) {
            builder.setSpatializationBehavior(i10);
        }
    }

    private C5564d(int i10, int i11, int i12, int i13, int i14) {
        this.f43817a = i10;
        this.f43818b = i11;
        this.f43819c = i12;
        this.f43820d = i13;
        this.f43821e = i14;
    }

    public C0938d a() {
        if (this.f43822f == null) {
            this.f43822f = new C0938d();
        }
        return this.f43822f;
    }

    public int b() {
        if ((this.f43818b & 1) == 1) {
            return 1;
        }
        switch (this.f43819c) {
        }
        return 1;
    }

    public int hashCode() {
        return ((((((((527 + this.f43817a) * 31) + this.f43818b) * 31) + this.f43819c) * 31) + this.f43820d) * 31) + this.f43821e;
    }
}
