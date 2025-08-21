package a3;

import android.media.AudioAttributes;
import d3.P;

/* renamed from: a3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5647d {

    /* renamed from: g, reason: collision with root package name */
    public static final C5647d f44629g = new e().a();

    /* renamed from: h, reason: collision with root package name */
    private static final String f44630h = P.y0(0);

    /* renamed from: i, reason: collision with root package name */
    private static final String f44631i = P.y0(1);

    /* renamed from: j, reason: collision with root package name */
    private static final String f44632j = P.y0(2);

    /* renamed from: k, reason: collision with root package name */
    private static final String f44633k = P.y0(3);

    /* renamed from: l, reason: collision with root package name */
    private static final String f44634l = P.y0(4);

    /* renamed from: a, reason: collision with root package name */
    public final int f44635a;

    /* renamed from: b, reason: collision with root package name */
    public final int f44636b;

    /* renamed from: c, reason: collision with root package name */
    public final int f44637c;

    /* renamed from: d, reason: collision with root package name */
    public final int f44638d;

    /* renamed from: e, reason: collision with root package name */
    public final int f44639e;

    /* renamed from: f, reason: collision with root package name */
    private C0940d f44640f;

    /* renamed from: a3.d$d, reason: collision with other inner class name */
    public static final class C0940d {

        /* renamed from: a, reason: collision with root package name */
        public final AudioAttributes f44641a;

        private C0940d(C5647d c5647d) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(c5647d.f44635a).setFlags(c5647d.f44636b).setUsage(c5647d.f44637c);
            int i10 = P.f127888a;
            if (i10 >= 29) {
                b.a(usage, c5647d.f44638d);
            }
            if (i10 >= 32) {
                c.a(usage, c5647d.f44639e);
            }
            this.f44641a = usage.build();
        }
    }

    /* renamed from: a3.d$e */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        private int f44642a = 0;

        /* renamed from: b, reason: collision with root package name */
        private int f44643b = 0;

        /* renamed from: c, reason: collision with root package name */
        private int f44644c = 1;

        /* renamed from: d, reason: collision with root package name */
        private int f44645d = 1;

        /* renamed from: e, reason: collision with root package name */
        private int f44646e = 0;

        public C5647d a() {
            return new C5647d(this.f44642a, this.f44643b, this.f44644c, this.f44645d, this.f44646e);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5647d.class == obj.getClass()) {
            C5647d c5647d = (C5647d) obj;
            if (this.f44635a == c5647d.f44635a && this.f44636b == c5647d.f44636b && this.f44637c == c5647d.f44637c && this.f44638d == c5647d.f44638d && this.f44639e == c5647d.f44639e) {
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

    private C5647d(int i10, int i11, int i12, int i13, int i14) {
        this.f44635a = i10;
        this.f44636b = i11;
        this.f44637c = i12;
        this.f44638d = i13;
        this.f44639e = i14;
    }

    public C0940d a() {
        if (this.f44640f == null) {
            this.f44640f = new C0940d();
        }
        return this.f44640f;
    }

    public int b() {
        if ((this.f44636b & 1) == 1) {
            return 1;
        }
        switch (this.f44637c) {
        }
        return 1;
    }

    public int hashCode() {
        return ((((((((527 + this.f44635a) * 31) + this.f44636b) * 31) + this.f44637c) * 31) + this.f44638d) * 31) + this.f44639e;
    }
}
