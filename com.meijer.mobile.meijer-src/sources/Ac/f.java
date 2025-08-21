package Ac;

import Ac.c;
import android.app.job.JobInfo;
import com.medallia.digital.mobilesdk.l8;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import rc.EnumC16886f;

/* loaded from: classes4.dex */
public abstract class f {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private Dc.a f246a;

        /* renamed from: b, reason: collision with root package name */
        private Map<EnumC16886f, b> f247b = new HashMap();

        public a a(EnumC16886f enumC16886f, b bVar) {
            this.f247b.put(enumC16886f, bVar);
            return this;
        }

        public f b() {
            if (this.f246a == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if (this.f247b.keySet().size() < EnumC16886f.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map<EnumC16886f, b> map = this.f247b;
            this.f247b = new HashMap();
            return f.d(this.f246a, map);
        }

        public a c(Dc.a aVar) {
            this.f246a = aVar;
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
            return new c.b().c(Collections.EMPTY_SET);
        }
    }

    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    abstract Dc.a e();

    abstract Map<EnumC16886f, b> h();

    private long a(int i10, long j10) {
        return (long) (Math.pow(3.0d, i10 - 1) * j10 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j10 > 1 ? j10 : 2L) * r7)));
    }

    public static a b() {
        return new a();
    }

    static f d(Dc.a aVar, Map<EnumC16886f, b> map) {
        return new Ac.b(aVar, map);
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

    public static f f(Dc.a aVar) {
        return b().a(EnumC16886f.DEFAULT, b.a().b(30000L).d(l8.b.f93366d).a()).a(EnumC16886f.HIGHEST, b.a().b(1000L).d(l8.b.f93366d).a()).a(EnumC16886f.VERY_LOW, b.a().b(l8.b.f93366d).d(l8.b.f93366d).c(i(c.DEVICE_IDLE)).a()).c(aVar).b();
    }

    public JobInfo.Builder c(JobInfo.Builder builder, EnumC16886f enumC16886f, long j10, int i10) {
        builder.setMinimumLatency(g(enumC16886f, j10, i10));
        j(builder, h().get(enumC16886f).c());
        return builder;
    }

    public long g(EnumC16886f enumC16886f, long j10, int i10) {
        long jA = j10 - e().a();
        b bVar = h().get(enumC16886f);
        return Math.min(Math.max(a(i10, bVar.b()), jA), bVar.d());
    }
}
