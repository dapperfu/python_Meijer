package fh;

import android.content.Context;
import android.view.OrientationEventListener;
import android.view.WindowManager;

/* loaded from: classes7.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    private int f131128a;

    /* renamed from: b, reason: collision with root package name */
    private WindowManager f131129b;

    /* renamed from: c, reason: collision with root package name */
    private OrientationEventListener f131130c;

    /* renamed from: d, reason: collision with root package name */
    private o f131131d;

    class a extends OrientationEventListener {
        a(Context context, int i10) {
            super(context, i10);
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i10) {
            int rotation;
            WindowManager windowManager = p.this.f131129b;
            o oVar = p.this.f131131d;
            if (p.this.f131129b == null || oVar == null || (rotation = windowManager.getDefaultDisplay().getRotation()) == p.this.f131128a) {
                return;
            }
            p.this.f131128a = rotation;
            oVar.a(rotation);
        }
    }

    public void f() {
        OrientationEventListener orientationEventListener = this.f131130c;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
        this.f131130c = null;
        this.f131129b = null;
        this.f131131d = null;
    }

    public void e(Context context, o oVar) {
        f();
        Context applicationContext = context.getApplicationContext();
        this.f131131d = oVar;
        this.f131129b = (WindowManager) applicationContext.getSystemService("window");
        a aVar = new a(applicationContext, 3);
        this.f131130c = aVar;
        aVar.enable();
        this.f131128a = this.f131129b.getDefaultDisplay().getRotation();
    }
}
