package v;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.util.Size;
import android.view.Display;
import z.C18324d;
import z.C18332l;

/* renamed from: v.i1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C17385i1 {

    /* renamed from: e, reason: collision with root package name */
    private static final Size f164061e = new Size(1920, 1080);

    /* renamed from: f, reason: collision with root package name */
    private static final Size f164062f = new Size(320, 240);

    /* renamed from: g, reason: collision with root package name */
    private static final Size f164063g = new Size(640, 480);

    /* renamed from: h, reason: collision with root package name */
    private static final Object f164064h = new Object();

    /* renamed from: i, reason: collision with root package name */
    private static volatile C17385i1 f164065i;

    /* renamed from: a, reason: collision with root package name */
    private final DisplayManager f164066a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Size f164067b = null;

    /* renamed from: c, reason: collision with root package name */
    private final C18332l f164068c = new C18332l();

    /* renamed from: d, reason: collision with root package name */
    private final C18324d f164069d = new C18324d();

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
        if (N.c.c(size, f164062f) && (size = this.f164069d.a()) == null) {
            size = f164063g;
        }
        return size.getHeight() > size.getWidth() ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    public static C17385i1 c(Context context) {
        if (f164065i == null) {
            synchronized (f164064h) {
                try {
                    if (f164065i == null) {
                        f164065i = new C17385i1(context);
                    }
                } finally {
                }
            }
        }
        return f164065i;
    }

    public Display d(boolean z10) {
        Display[] displays = this.f164066a.getDisplays();
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
        if (this.f164067b != null) {
            return this.f164067b;
        }
        this.f164067b = a();
        return this.f164067b;
    }

    private C17385i1(Context context) {
        this.f164066a = (DisplayManager) context.getSystemService("display");
    }

    private Size a() {
        Size sizeB = b();
        int width = sizeB.getWidth() * sizeB.getHeight();
        Size size = f164061e;
        if (width > size.getWidth() * size.getHeight()) {
            sizeB = size;
        }
        return this.f164068c.a(sizeB);
    }

    void g() {
        this.f164067b = a();
    }
}
