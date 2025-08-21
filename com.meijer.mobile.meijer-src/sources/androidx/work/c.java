package androidx.work;

import O4.C4362j;
import O4.S;
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
        public static final class C1171a extends a {

            /* renamed from: a, reason: collision with root package name */
            private final androidx.work.b f59343a;

            public C1171a() {
                this(androidx.work.b.f59339c);
            }

            public C1171a(androidx.work.b bVar) {
                this.f59343a = bVar;
            }

            public androidx.work.b d() {
                return this.f59343a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C1171a.class != obj.getClass()) {
                    return false;
                }
                return this.f59343a.equals(((C1171a) obj).f59343a);
            }

            public int hashCode() {
                return (C1171a.class.getName().hashCode() * 31) + this.f59343a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.f59343a + '}';
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
        public static final class C1172c extends a {

            /* renamed from: a, reason: collision with root package name */
            private final androidx.work.b f59344a;

            public C1172c() {
                this(androidx.work.b.f59339c);
            }

            public C1172c(androidx.work.b bVar) {
                this.f59344a = bVar;
            }

            public androidx.work.b d() {
                return this.f59344a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C1172c.class != obj.getClass()) {
                    return false;
                }
                return this.f59344a.equals(((C1172c) obj).f59344a);
            }

            public int hashCode() {
                return (C1172c.class.getName().hashCode() * 31) + this.f59344a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.f59344a + '}';
            }
        }

        public static a a() {
            return new C1171a();
        }

        public static a b() {
            return new b();
        }

        public static a c() {
            return new C1172c();
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

    public q<C4362j> getForegroundInfoAsync() {
        return androidx.concurrent.futures.c.a(new c.InterfaceC1101c() { // from class: O4.u
            @Override // androidx.concurrent.futures.c.InterfaceC1101c
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

    public Y4.b getTaskExecutor() {
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

    public final q<Void> setForegroundAsync(C4362j c4362j) {
        return this.mWorkerParams.b().a(getApplicationContext(), getId(), c4362j);
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
