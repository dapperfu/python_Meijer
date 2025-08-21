package Ds;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes12.dex */
public class k extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private a f6656a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f6657b;

    /* renamed from: c, reason: collision with root package name */
    private int f6658c;

    private class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private boolean f6659a;

        public void a() {
            this.f6659a = true;
        }

        private a() {
            this.f6659a = false;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f6659a) {
                k.this.f6657b = true;
            }
        }
    }

    private void b() {
        a aVar = this.f6656a;
        if (aVar != null) {
            aVar.a();
            this.f6656a = null;
        }
    }

    public boolean d() {
        return this.f6657b;
    }

    public k(int i10) {
        super(Looper.getMainLooper());
        this.f6657b = true;
        this.f6658c = i10;
    }

    public void c() {
        b();
        this.f6657b = false;
        a aVar = new a();
        this.f6656a = aVar;
        postDelayed(aVar, this.f6658c);
    }

    public void e() {
        b();
        this.f6657b = true;
    }
}
