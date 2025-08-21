package N;

import android.util.Size;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final Size f20520a = new Size(0, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final Size f20521b = new Size(320, 240);

    /* renamed from: c, reason: collision with root package name */
    public static final Size f20522c = new Size(640, 480);

    /* renamed from: d, reason: collision with root package name */
    public static final Size f20523d = new Size(720, 480);

    /* renamed from: e, reason: collision with root package name */
    public static final Size f20524e = new Size(1280, 720);

    /* renamed from: f, reason: collision with root package name */
    public static final Size f20525f = new Size(1920, 1080);

    /* renamed from: g, reason: collision with root package name */
    public static final Size f20526g = new Size(1920, 1440);

    public static int a(int i10, int i11) {
        return i10 * i11;
    }

    public static int b(Size size) {
        return a(size.getWidth(), size.getHeight());
    }

    public static boolean c(Size size, Size size2) {
        if (b(size) < b(size2)) {
            return true;
        }
        return false;
    }
}
