package com.bugsnag.android;

import R6.ImmutableConfig;
import android.os.SystemClock;
import com.bugsnag.android.C6624v0;
import com.bugsnag.android.k1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u0000 (2\u00020\u0001:\u0001\u001dBa\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0004\b\u0015\u0010\u0016B#\b\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0015\u0010\u0019Jc\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010#R\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010$\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lcom/bugsnag/android/n1;", "Lcom/bugsnag/android/v0$a;", "", "exc", "", "isUnhandled", "", "maxThreads", "", "threadCollectionTimeLimitMillis", "Lcom/bugsnag/android/m1;", "sendThreads", "", "", "projectPackages", "Lcom/bugsnag/android/D0;", "logger", "Ljava/lang/Thread;", "currentThread", "", "allThreads", "<init>", "(Ljava/lang/Throwable;ZIJLcom/bugsnag/android/m1;Ljava/util/Collection;Lcom/bugsnag/android/D0;Ljava/lang/Thread;Ljava/util/List;)V", "LR6/k;", "config", "(Ljava/lang/Throwable;ZLR6/k;)V", "maxThreadCount", "", "Lcom/bugsnag/android/k1;", "a", "(Ljava/util/List;Ljava/lang/Thread;Ljava/lang/Throwable;ZIJLjava/util/Collection;Lcom/bugsnag/android/D0;)Ljava/util/List;", "Lcom/bugsnag/android/v0;", "writer", "", "toStream", "(Lcom/bugsnag/android/v0;)V", "Ljava/util/List;", "c", "()Ljava/util/List;", "threads", "b", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class n1 implements C6624v0.a {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<k1> threads;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/bugsnag/android/n1$a;", "", "<init>", "()V", "Ljava/lang/ThreadGroup;", "b", "()Ljava/lang/ThreadGroup;", "", "Ljava/lang/Thread;", "a", "()Ljava/util/List;", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.bugsnag.android.n1$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final ThreadGroup b() {
            ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
            Intrinsics.g(threadGroup);
            while (threadGroup.getParent() != null) {
                threadGroup = threadGroup.getParent();
            }
            return threadGroup;
        }

        public final List<Thread> a() {
            ThreadGroup threadGroupB = b();
            Thread[] threadArr = new Thread[threadGroupB.activeCount()];
            threadGroupB.enumerate(threadArr);
            return ArraysKt.c0(threadArr);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return ComparisonsKt.d(Long.valueOf(((Thread) t10).getId()), Long.valueOf(((Thread) t11).getId()));
        }
    }

    public n1(Throwable th2, boolean z10, int i10, long j10, m1 m1Var, Collection<String> collection, D0 d02, Thread thread, List<? extends Thread> list) {
        this.threads = (m1Var == m1.ALWAYS || (m1Var == m1.UNHANDLED_ONLY && z10)) ? a(list, thread, th2, z10, i10, j10, collection, d02) : new ArrayList<>();
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/lang/Thread;", "it", "", "a", "(Ljava/lang/Thread;)Ljava/lang/Integer;"}, k = 3, mv = {1, 5, 1})
    static final class c extends Lambda implements Function1<Thread, Integer> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Thread f64322f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Thread thread) {
            super(1);
            this.f64322f = thread;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(Thread thread) {
            return Integer.valueOf(Intrinsics.l(thread.getId(), this.f64322f.getId()));
        }
    }

    private final List<k1> a(List<? extends Thread> allThreads, Thread currentThread, Throwable exc, boolean isUnhandled, int maxThreadCount, long threadCollectionTimeLimitMillis, Collection<String> projectPackages, D0 logger) {
        List listZ0 = CollectionsKt.Z0(allThreads, new b());
        int i10 = CollectionsKt.i(listZ0, 0, Math.min(maxThreadCount, listZ0.size()), new c(currentThread));
        List<Thread> listB1 = CollectionsKt.b1(listZ0, i10 >= 0 ? maxThreadCount : Math.max(maxThreadCount - 1, 0));
        ArrayList arrayList = new ArrayList(maxThreadCount);
        long jElapsedRealtime = SystemClock.elapsedRealtime() + threadCollectionTimeLimitMillis;
        for (Thread thread : listB1) {
            if (SystemClock.elapsedRealtime() >= jElapsedRealtime) {
                break;
            }
            arrayList.add(b(currentThread, exc, isUnhandled, projectPackages, logger, thread));
        }
        if (i10 < 0) {
            int i11 = (-i10) - 1;
            if (i11 >= arrayList.size()) {
                arrayList.add(b(currentThread, exc, isUnhandled, projectPackages, logger, currentThread));
            } else {
                arrayList.add(i11, b(currentThread, exc, isUnhandled, projectPackages, logger, currentThread));
            }
        } else if (i10 >= arrayList.size()) {
            arrayList.add(b(currentThread, exc, isUnhandled, projectPackages, logger, currentThread));
        }
        if (allThreads.size() > maxThreadCount) {
            arrayList.add(new k1("", '[' + (allThreads.size() - maxThreadCount) + " threads omitted as the maxReportedThreads limit (" + maxThreadCount + ") was exceeded]", ErrorType.UNKNOWN, false, k1.b.UNKNOWN, new d1(new StackTraceElement[]{new StackTraceElement("", "", "-", 0)}, projectPackages, logger), logger));
        }
        return arrayList;
    }

    public final List<k1> c() {
        return this.threads;
    }

    private static final k1 b(Thread thread, Throwable th2, boolean z10, Collection<String> collection, D0 d02, Thread thread2) {
        boolean z11;
        StackTraceElement[] stackTrace;
        if (thread2.getId() == thread.getId()) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z12 = z11;
        if (z12) {
            if (th2 != null && z10) {
                stackTrace = th2.getStackTrace();
            } else {
                stackTrace = thread.getStackTrace();
            }
        } else {
            stackTrace = thread2.getStackTrace();
        }
        return new k1(String.valueOf(thread2.getId()), thread2.getName(), ErrorType.ANDROID, z12, k1.b.a(thread2), new d1(stackTrace, collection, d02), d02);
    }

    @Override // com.bugsnag.android.C6624v0.a
    public void toStream(C6624v0 writer) throws Throwable {
        writer.c();
        Iterator<k1> it = this.threads.iterator();
        while (it.hasNext()) {
            writer.e0(it.next());
        }
        writer.h();
    }

    public /* synthetic */ n1(Throwable th2, boolean z10, int i10, long j10, m1 m1Var, Collection collection, D0 d02, Thread thread, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(th2, z10, i10, j10, m1Var, collection, d02, (i11 & 128) != 0 ? Thread.currentThread() : thread, (i11 & 256) != 0 ? INSTANCE.a() : list);
    }

    public n1(Throwable th2, boolean z10, ImmutableConfig immutableConfig) {
        this(th2, z10, immutableConfig.getMaxReportedThreads(), immutableConfig.getThreadCollectionTimeLimitMillis(), immutableConfig.getSendThreads(), immutableConfig.y(), immutableConfig.getLogger(), null, null, 384, null);
    }
}
