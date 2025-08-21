package v;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.util.Size;
import android.view.Display;
import z.C18387d;
import z.C18395l;

/* renamed from: v.i1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C17524i1 {

    /* renamed from: e, reason: collision with root package name */
    private static final Size f165095e = new Size(1920, 1080);

    /* renamed from: f, reason: collision with root package name */
    private static final Size f165096f = new Size(320, 240);

    /* renamed from: g, reason: collision with root package name */
    private static final Size f165097g = new Size(640, 480);

    /* renamed from: h, reason: collision with root package name */
    private static final Object f165098h = new Object();

    /* renamed from: i, reason: collision with root package name */
    private static volatile C17524i1 f165099i;

    /* renamed from: a, reason: collision with root package name */
    private final DisplayManager f165100a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Size f165101b = null;

    /* renamed from: c, reason: collision with root package name */
    private final C18395l f165102c = new C18395l();

    /* renamed from: d, reason: collision with root package name */
    private final C18387d f165103d = new C18387d();

    private Display e(Display[] displayArr, boolean z10) {
        Display display = null;
        int i10 = -1;
        for (Display display2 : displayArr) {
            if (!z10 || display2.getState() != 1) {
                Point point = new Point();
                display2.getRealSize(point);
                int i11 = point.x;
                int i12 = point.y;
                if (i11 * i12 > i10) {
                    display = display2;
                    i10 = i11 * i12;
                }
            }
        }
        return display;
    }

    private Size b() {
        Point point = new Point();
        d(false).getRealSize(point);
        Size size = new Size(point.x, point.y);
        if (N.c.c(size, f165096f) && (size = this.f165103d.a()) == null) {
            size = f165097g;
        }
        return size.getHeight() > size.getWidth() ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    public static C17524i1 c(Context context) {
        if (f165099i == null) {
            synchronized (f165098h) {
                try {
                    if (f165099i == null) {
                        f165099i = new C17524i1(context);
                    }
                } finally {
                }
            }
        }
        return f165099i;
    }

    public Display d(boolean z10) {
        Display[] displays = this.f165100a.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        Display displayE = e(displays, z10);
        if (displayE == null && z10) {
            displayE = e(displays, false);
        }
        if (displayE != null) {
            return displayE;
        }
        throw new IllegalArgumentException("No display can be found from the input display manager!");
    }

    Size f() {
        if (this.f165101b != null) {
            return this.f165101b;
        }
        this.f165101b = a();
        return this.f165101b;
    }

    private C17524i1(Context context) {
        this.f165100a = (DisplayManager) context.getSystemService("display");
    }

    private Size a() {
        Size sizeB = b();
        int width = sizeB.getWidth() * sizeB.getHeight();
        Size size = f165095e;
        if (width > size.getWidth() * size.getHeight()) {
            sizeB = size;
        }
        return this.f165102c.a(sizeB);
    }

    void g() {
        this.f165101b = a();
    }
}
