package Ds;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes11.dex */
public class k extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private a f7349a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f7350b;

    /* renamed from: c, reason: collision with root package name */
    private int f7351c;

    private class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private boolean f7352a;

        public void a() {
            this.f7352a = true;
        }

        private a() {
            this.f7352a = false;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f7352a) {
                k.this.f7350b = true;
            }
        }
    }

    private void b() {
        a aVar = this.f7349a;
        if (aVar != null) {
            aVar.a();
            this.f7349a = null;
        }
    }

    public boolean d() {
        return this.f7350b;
    }

    public k(int i10) {
        super(Looper.getMainLooper());
        this.f7350b = true;
        this.f7351c = i10;
    }

    public void c() {
        b();
        this.f7350b = false;
        a aVar = new a();
        this.f7349a = aVar;
        postDelayed(aVar, this.f7351c);
    }

    public void e() {
        b();
        this.f7350b = true;
    }
}
