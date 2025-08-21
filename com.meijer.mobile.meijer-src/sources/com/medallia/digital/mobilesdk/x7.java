package com.medallia.digital.mobilesdk;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes8.dex */
class x7<T> {

    /* renamed from: d, reason: collision with root package name */
    private static final long f94347d = 10;

    /* renamed from: e, reason: collision with root package name */
    private static final long f94348e = 10000;

    /* renamed from: a, reason: collision with root package name */
    private final long f94349a;

    /* renamed from: b, reason: collision with root package name */
    private final b<T> f94350b;

    /* renamed from: c, reason: collision with root package name */
    private long f94351c = -1;

    class a extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f94352a;

        /* renamed from: com.medallia.digital.mobilesdk.x7$a$a, reason: collision with other inner class name */
        class C1324a extends v4 {
            C1324a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.medallia.digital.mobilesdk.v4
            public void a() {
                if (x7.this.f94350b != null) {
                    x7.this.f94350b.a(a.this.f94352a);
                }
                x7.this.f94351c = -1L;
            }
        }

        a(Object obj) {
            this.f94352a = obj;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            w7.b().a().execute(new C1324a());
        }
    }

    protected interface b<T> {
        void a(T t10);
    }

    protected x7(long j10, b<T> bVar) {
        this.f94349a = (j10 < 0 || j10 > f94348e) ? 10000L : j10;
        this.f94350b = bVar;
    }

    protected boolean a(T t10) {
        if (this.f94351c != -1) {
            return false;
        }
        this.f94351c = System.currentTimeMillis() + this.f94349a;
        new Handler(Looper.getMainLooper()).postDelayed(new a(t10), this.f94349a);
        return true;
    }
}
