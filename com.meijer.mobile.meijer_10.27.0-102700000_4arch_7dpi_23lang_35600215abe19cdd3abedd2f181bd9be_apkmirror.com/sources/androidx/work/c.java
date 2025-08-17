package androidx.work;

import N4.C4322j;
import N4.S;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.concurrent.futures.c;
import com.google.common.util.concurrent.q;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public abstract class c {
    private Context mAppContext;
    private final AtomicInteger mStopReason = new AtomicInteger(-256);
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    public static abstract class a {

        /* renamed from: androidx.work.c$a$a, reason: collision with other inner class name */
        public static final class C1161a extends a {

            /* renamed from: a, reason: collision with root package name */
            private final androidx.work.b f59157a;

            public C1161a() {
                this(androidx.work.b.f59153c);
            }

            public C1161a(androidx.work.b bVar) {
                this.f59157a = bVar;
            }

            public androidx.work.b d() {
                return this.f59157a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C1161a.class != obj.getClass()) {
                    return false;
                }
                return this.f59157a.equals(((C1161a) obj).f59157a);
            }

            public int hashCode() {
                return (C1161a.class.getName().hashCode() * 31) + this.f59157a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.f59157a + '}';
            }
        }

        public static final class b extends a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        /* renamed from: androidx.work.c$a$c, reason: collision with other inner class name */
        public static final class C1162c extends a {

            /* renamed from: a, reason: collision with root package name */
            private final androidx.work.b f59158a;

            public C1162c() {
                this(androidx.work.b.f59153c);
            }

            public C1162c(androidx.work.b bVar) {
                this.f59158a = bVar;
            }

            public androidx.work.b d() {
                return this.f59158a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C1162c.class != obj.getClass()) {
                    return false;
                }
                return this.f59158a.equals(((C1162c) obj).f59158a);
            }

            public int hashCode() {
                return (C1162c.class.getName().hashCode() * 31) + this.f59158a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.f59158a + '}';
            }
        }

        public static a a() {
            return new C1161a();
        }

        public static a b() {
            return new b();
        }

        public static a c() {
            return new C1162c();
        }

        a() {
        }
    }

    public void onStopped() {
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract q<a> startWork();

    public static /* synthetic */ Object a(c.a aVar) {
        aVar.f(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for`getForegroundInfoAsync()`"));
        return "default failing getForegroundInfoAsync";
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.a();
    }

    public q<C4322j> getForegroundInfoAsync() {
        return androidx.concurrent.futures.c.a(new c.InterfaceC1088c() { // from class: N4.u
            @Override // androidx.concurrent.futures.c.InterfaceC1088c
            public final Object a(c.a aVar) {
                return androidx.work.c.a(aVar);
            }
        });
    }

    public final UUID getId() {
        return this.mWorkerParams.c();
    }

    public final b getInputData() {
        return this.mWorkerParams.d();
    }

    public final Network getNetwork() {
        return this.mWorkerParams.e();
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.g();
    }

    public final int getStopReason() {
        return this.mStopReason.get();
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.h();
    }

    public X4.b getTaskExecutor() {
        return this.mWorkerParams.i();
    }

    public final List<String> getTriggeredContentAuthorities() {
        return this.mWorkerParams.j();
    }

    public final List<Uri> getTriggeredContentUris() {
        return this.mWorkerParams.k();
    }

    public S getWorkerFactory() {
        return this.mWorkerParams.m();
    }

    public final boolean isStopped() {
        return this.mStopReason.get() != -256;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public final q<Void> setForegroundAsync(C4322j c4322j) {
        return this.mWorkerParams.b().a(getApplicationContext(), getId(), c4322j);
    }

    public q<Void> setProgressAsync(b bVar) {
        return this.mWorkerParams.f().a(getApplicationContext(), getId(), bVar);
    }

    public final void stop(int i10) {
        if (this.mStopReason.compareAndSet(-256, i10)) {
            onStopped();
        }
    }

    public c(Context context, WorkerParameters workerParameters) {
        if (context != null) {
            if (workerParameters != null) {
                this.mAppContext = context;
                this.mWorkerParams = workerParameters;
                return;
            }
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        throw new IllegalArgumentException("Application Context is null");
    }
}
