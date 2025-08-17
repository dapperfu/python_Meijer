package yc;

import android.app.job.JobInfo;
import com.medallia.digital.mobilesdk.l8;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import pc.EnumC16282f;
import yc.C18203c;

/* loaded from: classes4.dex */
public abstract class f {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private Bc.a f170397a;

        /* renamed from: b, reason: collision with root package name */
        private Map<EnumC16282f, b> f170398b = new HashMap();

        public a a(EnumC16282f enumC16282f, b bVar) {
            this.f170398b.put(enumC16282f, bVar);
            return this;
        }

        public f b() {
            if (this.f170397a == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if (this.f170398b.keySet().size() < EnumC16282f.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map<EnumC16282f, b> map = this.f170398b;
            this.f170398b = new HashMap();
            return f.d(this.f170397a, map);
        }

        public a c(Bc.a aVar) {
            this.f170397a = aVar;
            return this;
        }
    }

    public static abstract class b {

        public static abstract class a {
            public abstract b a();

            public abstract a b(long j10);

            public abstract a c(Set<c> set);

            public abstract a d(long j10);
        }

        abstract long b();

        abstract Set<c> c();

        abstract long d();

        public static a a() {
            return new C18203c.b().c(Collections.EMPTY_SET);
        }
    }

    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    abstract Bc.a e();

    abstract Map<EnumC16282f, b> h();

    private long a(int i10, long j10) {
        return (long) (Math.pow(3.0d, i10 - 1) * j10 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j10 > 1 ? j10 : 2L) * r7)));
    }

    public static a b() {
        return new a();
    }

    static f d(Bc.a aVar, Map<EnumC16282f, b> map) {
        return new C18202b(aVar, map);
    }

    private static <T> Set<T> i(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    private void j(JobInfo.Builder builder, Set<c> set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    public static f f(Bc.a aVar) {
        return b().a(EnumC16282f.DEFAULT, b.a().b(30000L).d(l8.b.f92527d).a()).a(EnumC16282f.HIGHEST, b.a().b(1000L).d(l8.b.f92527d).a()).a(EnumC16282f.VERY_LOW, b.a().b(l8.b.f92527d).d(l8.b.f92527d).c(i(c.DEVICE_IDLE)).a()).c(aVar).b();
    }

    public JobInfo.Builder c(JobInfo.Builder builder, EnumC16282f enumC16282f, long j10, int i10) {
        builder.setMinimumLatency(g(enumC16282f, j10, i10));
        j(builder, h().get(enumC16282f).c());
        return builder;
    }

    public long g(EnumC16282f enumC16282f, long j10, int i10) {
        long jA = j10 - e().a();
        b bVar = h().get(enumC16282f);
        return Math.min(Math.max(a(i10, bVar.b()), jA), bVar.d());
    }
}
