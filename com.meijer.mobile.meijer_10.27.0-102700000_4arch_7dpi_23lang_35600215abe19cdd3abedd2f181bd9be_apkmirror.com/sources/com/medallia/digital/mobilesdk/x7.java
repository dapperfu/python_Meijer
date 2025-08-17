package com.medallia.digital.mobilesdk;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes7.dex */
class x7<T> {

    /* renamed from: d, reason: collision with root package name */
    private static final long f93508d = 10;

    /* renamed from: e, reason: collision with root package name */
    private static final long f93509e = 10000;

    /* renamed from: a, reason: collision with root package name */
    private final long f93510a;

    /* renamed from: b, reason: collision with root package name */
    private final b<T> f93511b;

    /* renamed from: c, reason: collision with root package name */
    private long f93512c = -1;

    class a extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f93513a;

        /* renamed from: com.medallia.digital.mobilesdk.x7$a$a, reason: collision with other inner class name */
        class C1315a extends v4 {
            C1315a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.medallia.digital.mobilesdk.v4
            public void a() {
                if (x7.this.f93511b != null) {
                    x7.this.f93511b.a(a.this.f93513a);
                }
                x7.this.f93512c = -1L;
            }
        }

        a(Object obj) {
            this.f93513a = obj;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            w7.b().a().execute(new C1315a());
        }
    }

    protected interface b<T> {
        void a(T t10);
    }

    protected x7(long j10, b<T> bVar) {
        this.f93510a = (j10 < 0 || j10 > f93509e) ? 10000L : j10;
        this.f93511b = bVar;
    }

    protected boolean a(T t10) {
        if (this.f93512c != -1) {
            return false;
        }
        this.f93512c = System.currentTimeMillis() + this.f93510a;
        new Handler(Looper.getMainLooper()).postDelayed(new a(t10), this.f93510a);
        return true;
    }
}
