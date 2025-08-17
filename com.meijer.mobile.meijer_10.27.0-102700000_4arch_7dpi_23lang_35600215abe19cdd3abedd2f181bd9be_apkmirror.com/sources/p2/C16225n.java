package p2;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.google.android.gms.common.api.a;

/* renamed from: p2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C16225n {

    /* renamed from: a, reason: collision with root package name */
    private final Context f155387a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC16227o f155388b;

    /* renamed from: c, reason: collision with root package name */
    private final b f155389c;

    /* renamed from: d, reason: collision with root package name */
    private final a f155390d;

    /* renamed from: e, reason: collision with root package name */
    private VelocityTracker f155391e;

    /* renamed from: f, reason: collision with root package name */
    private float f155392f;

    /* renamed from: g, reason: collision with root package name */
    private int f155393g;

    /* renamed from: h, reason: collision with root package name */
    private int f155394h;

    /* renamed from: i, reason: collision with root package name */
    private int f155395i;

    /* renamed from: j, reason: collision with root package name */
    private final int[] f155396j;

    /* renamed from: p2.n$a */
    interface a {
        float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10);
    }

    /* renamed from: p2.n$b */
    interface b {
        void a(Context context, int[] iArr, MotionEvent motionEvent, int i10);
    }

    public C16225n(Context context, InterfaceC16227o interfaceC16227o) {
        this(context, interfaceC16227o, new b() { // from class: p2.l
            @Override // p2.C16225n.b
            public final void a(Context context2, int[] iArr, MotionEvent motionEvent, int i10) {
                C16225n.c(context2, iArr, motionEvent, i10);
            }
        }, new a() { // from class: p2.m
            @Override // p2.C16225n.a
            public final float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10) {
                return C16225n.f(velocityTracker, motionEvent, i10);
            }
        });
    }

    C16225n(Context context, InterfaceC16227o interfaceC16227o, b bVar, a aVar) {
        this.f155393g = -1;
        this.f155394h = -1;
        this.f155395i = -1;
        this.f155396j = new int[]{a.e.API_PRIORITY_OTHER, 0};
        this.f155387a = context;
        this.f155388b = interfaceC16227o;
        this.f155389c = bVar;
        this.f155390d = aVar;
    }

    private float e(MotionEvent motionEvent, int i10) {
        if (this.f155391e == null) {
            this.f155391e = VelocityTracker.obtain();
        }
        return this.f155390d.a(this.f155391e, motionEvent, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, int[] iArr, MotionEvent motionEvent, int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = C16200a0.i(context, viewConfiguration, motionEvent.getDeviceId(), i10, motionEvent.getSource());
        iArr[1] = C16200a0.h(context, viewConfiguration, motionEvent.getDeviceId(), i10, motionEvent.getSource());
    }

    private boolean d(MotionEvent motionEvent, int i10) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.f155394h == source && this.f155395i == deviceId && this.f155393g == i10) {
            return false;
        }
        this.f155389c.a(this.f155387a, this.f155396j, motionEvent, i10);
        this.f155394h = source;
        this.f155395i = deviceId;
        this.f155393g = i10;
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
        if (this.f155396j[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f155391e;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f155391e = null;
                return;
            }
            return;
        }
        float fE = e(motionEvent, i10) * this.f155388b.b();
        float fSignum = Math.signum(fE);
        float f10 = 0.0f;
        if (zD || (fSignum != Math.signum(this.f155392f) && fSignum != 0.0f)) {
            this.f155388b.c();
        }
        float fAbs = Math.abs(fE);
        int[] iArr = this.f155396j;
        if (fAbs < iArr[0]) {
            return;
        }
        float fMax = Math.max(-r6, Math.min(fE, iArr[1]));
        if (this.f155388b.a(fMax)) {
            f10 = fMax;
        }
        this.f155392f = f10;
    }
}
