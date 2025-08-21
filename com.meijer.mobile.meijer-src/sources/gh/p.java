package gh;

import android.content.Context;
import android.view.OrientationEventListener;
import android.view.WindowManager;

/* loaded from: classes8.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    private int f134227a;

    /* renamed from: b, reason: collision with root package name */
    private WindowManager f134228b;

    /* renamed from: c, reason: collision with root package name */
    private OrientationEventListener f134229c;

    /* renamed from: d, reason: collision with root package name */
    private o f134230d;

    class a extends OrientationEventListener {
        a(Context context, int i10) {
            super(context, i10);
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i10) {
            int rotation;
            WindowManager windowManager = p.this.f134228b;
            o oVar = p.this.f134230d;
            if (p.this.f134228b == null || oVar == null || (rotation = windowManager.getDefaultDisplay().getRotation()) == p.this.f134227a) {
                return;
            }
            p.this.f134227a = rotation;
            oVar.a(rotation);
        }
    }

    public void f() {
        OrientationEventListener orientationEventListener = this.f134229c;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
        this.f134229c = null;
        this.f134228b = null;
        this.f134230d = null;
    }

    public void e(Context context, o oVar) {
        f();
        Context applicationContext = context.getApplicationContext();
        this.f134230d = oVar;
        this.f134228b = (WindowManager) applicationContext.getSystemService("window");
        a aVar = new a(applicationContext, 3);
        this.f134229c = aVar;
        aVar.enable();
        this.f134227a = this.f134228b.getDefaultDisplay().getRotation();
    }
}
