package p2;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.google.android.gms.common.api.a;

/* renamed from: p2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C16370n {

    /* renamed from: a, reason: collision with root package name */
    private final Context f156061a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC16372o f156062b;

    /* renamed from: c, reason: collision with root package name */
    private final b f156063c;

    /* renamed from: d, reason: collision with root package name */
    private final a f156064d;

    /* renamed from: e, reason: collision with root package name */
    private VelocityTracker f156065e;

    /* renamed from: f, reason: collision with root package name */
    private float f156066f;

    /* renamed from: g, reason: collision with root package name */
    private int f156067g;

    /* renamed from: h, reason: collision with root package name */
    private int f156068h;

    /* renamed from: i, reason: collision with root package name */
    private int f156069i;

    /* renamed from: j, reason: collision with root package name */
    private final int[] f156070j;

    /* renamed from: p2.n$a */
    interface a {
        float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10);
    }

    /* renamed from: p2.n$b */
    interface b {
        void a(Context context, int[] iArr, MotionEvent motionEvent, int i10);
    }

    public C16370n(Context context, InterfaceC16372o interfaceC16372o) {
        this(context, interfaceC16372o, new b() { // from class: p2.l
            @Override // p2.C16370n.b
            public final void a(Context context2, int[] iArr, MotionEvent motionEvent, int i10) {
                C16370n.c(context2, iArr, motionEvent, i10);
            }
        }, new a() { // from class: p2.m
            @Override // p2.C16370n.a
            public final float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10) {
                return C16370n.f(velocityTracker, motionEvent, i10);
            }
        });
    }

    C16370n(Context context, InterfaceC16372o interfaceC16372o, b bVar, a aVar) {
        this.f156067g = -1;
        this.f156068h = -1;
        this.f156069i = -1;
        this.f156070j = new int[]{a.e.API_PRIORITY_OTHER, 0};
        this.f156061a = context;
        this.f156062b = interfaceC16372o;
        this.f156063c = bVar;
        this.f156064d = aVar;
    }

    private float e(MotionEvent motionEvent, int i10) {
        if (this.f156065e == null) {
            this.f156065e = VelocityTracker.obtain();
        }
        return this.f156064d.a(this.f156065e, motionEvent, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, int[] iArr, MotionEvent motionEvent, int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = C16345a0.i(context, viewConfiguration, motionEvent.getDeviceId(), i10, motionEvent.getSource());
        iArr[1] = C16345a0.h(context, viewConfiguration, motionEvent.getDeviceId(), i10, motionEvent.getSource());
    }

    private boolean d(MotionEvent motionEvent, int i10) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.f156068h == source && this.f156069i == deviceId && this.f156067g == i10) {
            return false;
        }
        this.f156063c.a(this.f156061a, this.f156070j, motionEvent, i10);
        this.f156068h = source;
        this.f156069i = deviceId;
        this.f156067g = i10;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float f(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10) {
        V.a(velocityTracker, motionEvent);
        V.b(velocityTracker, 1000);
        return V.d(velocityTracker, i10);
    }

    public void g(MotionEvent motionEvent, int i10) {
        boolean zD = d(motionEvent, i10);
        if (this.f156070j[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f156065e;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f156065e = null;
                return;
            }
            return;
        }
        float fE = e(motionEvent, i10) * this.f156062b.b();
        float fSignum = Math.signum(fE);
        float f10 = 0.0f;
        if (zD || (fSignum != Math.signum(this.f156066f) && fSignum != 0.0f)) {
            this.f156062b.c();
        }
        float fAbs = Math.abs(fE);
        int[] iArr = this.f156070j;
        if (fAbs < iArr[0]) {
            return;
        }
        float fMax = Math.max(-r6, Math.min(fE, iArr[1]));
        if (this.f156062b.a(fMax)) {
            f10 = fMax;
        }
        this.f156066f = f10;
    }
}
