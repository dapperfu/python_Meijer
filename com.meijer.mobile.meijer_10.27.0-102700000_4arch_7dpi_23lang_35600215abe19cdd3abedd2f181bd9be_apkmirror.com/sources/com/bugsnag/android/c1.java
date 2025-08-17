package com.bugsnag.android;

import Q6.ImmutableConfig;
import com.bugsnag.android.C6482m0;
import com.bugsnag.android.Z0;
import java.io.IOException;
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

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001\u001bBY\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011¢\u0006\u0004\b\u0013\u0010\u0014B#\b\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0013\u0010\u0017J[\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010!R\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006¢\u0006\f\n\u0004\b\u001b\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcom/bugsnag/android/c1;", "Lcom/bugsnag/android/m0$a;", "", "exc", "", "isUnhandled", "", "maxThreads", "Lcom/bugsnag/android/b1;", "sendThreads", "", "", "projectPackages", "Lcom/bugsnag/android/t0;", "logger", "Ljava/lang/Thread;", "currentThread", "", "allThreads", "<init>", "(Ljava/lang/Throwable;ZILcom/bugsnag/android/b1;Ljava/util/Collection;Lcom/bugsnag/android/t0;Ljava/lang/Thread;Ljava/util/List;)V", "LQ6/f;", "config", "(Ljava/lang/Throwable;ZLQ6/f;)V", "maxThreadCount", "", "Lcom/bugsnag/android/Z0;", "a", "(Ljava/util/List;Ljava/lang/Thread;Ljava/lang/Throwable;ZILjava/util/Collection;Lcom/bugsnag/android/t0;)Ljava/util/List;", "Lcom/bugsnag/android/m0;", "writer", "", "toStream", "(Lcom/bugsnag/android/m0;)V", "Ljava/util/List;", "b", "()Ljava/util/List;", "threads", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class c1 implements C6482m0.a {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<Z0> threads;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/bugsnag/android/c1$a;", "", "<init>", "()V", "Ljava/lang/ThreadGroup;", "b", "()Ljava/lang/ThreadGroup;", "", "Ljava/lang/Thread;", "a", "()Ljava/util/List;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    /* renamed from: com.bugsnag.android.c1$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final ThreadGroup b() {
            Thread threadCurrentThread = Thread.currentThread();
            Intrinsics.f(threadCurrentThread, "JavaThread.currentThread()");
            ThreadGroup threadGroup = threadCurrentThread.getThreadGroup();
            if (threadGroup == null) {
                Intrinsics.t();
            }
            while (threadGroup.getParent() != null) {
                threadGroup = threadGroup.getParent();
                Intrinsics.f(threadGroup, "group.parent");
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 4, 2})
    public static final class b<T> implements Comparator<T> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return ComparisonsKt.d(Long.valueOf(((Thread) t10).getId()), Long.valueOf(((Thread) t11).getId()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 4, 2})
    public static final class c<T> implements Comparator<T> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return ComparisonsKt.d(Long.valueOf(((Thread) t10).getId()), Long.valueOf(((Thread) t11).getId()));
        }
    }

    public c1(Throwable th2, boolean z10, int i10, b1 b1Var, Collection<String> collection, InterfaceC6495t0 interfaceC6495t0, Thread thread, List<? extends Thread> list) {
        this.threads = (b1Var == b1.ALWAYS || (b1Var == b1.UNHANDLED_ONLY && z10)) ? a(list, thread, th2, z10, i10, collection, interfaceC6495t0) : new ArrayList<>();
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/lang/Thread;", "thread", "Lcom/bugsnag/android/Z0;", "a", "(Ljava/lang/Thread;)Lcom/bugsnag/android/Z0;"}, k = 3, mv = {1, 4, 2})
    static final class d extends Lambda implements Function1<Thread, Z0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Thread f63411f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Throwable f63412g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f63413h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Collection f63414i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ InterfaceC6495t0 f63415j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Thread thread, Throwable th2, boolean z10, Collection collection, InterfaceC6495t0 interfaceC6495t0) {
            super(1);
            this.f63411f = thread;
            this.f63412g = th2;
            this.f63413h = z10;
            this.f63414i = collection;
            this.f63415j = interfaceC6495t0;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Z0 invoke(Thread thread) {
            boolean z10;
            StackTraceElement[] stackTrace;
            if (thread.getId() == this.f63411f.getId()) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = z10;
            if (z11) {
                Throwable th2 = this.f63412g;
                if (th2 != null && this.f63413h) {
                    stackTrace = th2.getStackTrace();
                } else {
                    stackTrace = this.f63411f.getStackTrace();
                }
            } else {
                stackTrace = thread.getStackTrace();
            }
            Intrinsics.f(stackTrace, "if (isErrorThread) {\n   …ckTrace\n                }");
            return new Z0(thread.getId(), thread.getName(), d1.ANDROID, z11, Z0.b.a(thread), new S0(stackTrace, this.f63414i, this.f63415j), this.f63415j);
        }
    }

    private final List<Z0> a(List<? extends Thread> allThreads, Thread currentThread, Throwable exc, boolean isUnhandled, int maxThreadCount, Collection<String> projectPackages, InterfaceC6495t0 logger) {
        d dVar = new d(currentThread, exc, isUnhandled, projectPackages, logger);
        List listB1 = CollectionsKt.b1(CollectionsKt.Z0(allThreads, new b()), maxThreadCount);
        if (!listB1.contains(currentThread)) {
            listB1 = CollectionsKt.Z0(CollectionsKt.Q0(CollectionsKt.b1(listB1, Math.max(maxThreadCount - 1, 0)), currentThread), new c());
        }
        List list = listB1;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(dVar.invoke((Thread) it.next()));
        }
        List<Z0> listM1 = CollectionsKt.m1(arrayList);
        if (allThreads.size() > maxThreadCount) {
            listM1.add(new Z0(-1L, '[' + (allThreads.size() - maxThreadCount) + " threads omitted as the maxReportedThreads limit (" + maxThreadCount + ") was exceeded]", d1.EMPTY, false, Z0.b.UNKNOWN, new S0(new StackTraceElement[]{new StackTraceElement("", "", "-", 0)}, projectPackages, logger), logger));
        }
        return listM1;
    }

    public final List<Z0> b() {
        return this.threads;
    }

    @Override // com.bugsnag.android.C6482m0.a
    public void toStream(C6482m0 writer) throws IOException {
        writer.c();
        Iterator<Z0> it = this.threads.iterator();
        while (it.hasNext()) {
            writer.e0(it.next());
        }
        writer.h();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ c1(Throwable th2, boolean z10, int i10, b1 b1Var, Collection collection, InterfaceC6495t0 interfaceC6495t0, Thread thread, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        Thread thread2;
        if ((i11 & 64) != 0) {
            Thread threadCurrentThread = Thread.currentThread();
            Intrinsics.f(threadCurrentThread, "JavaThread.currentThread()");
            thread2 = threadCurrentThread;
        } else {
            thread2 = thread;
        }
        this(th2, z10, i10, b1Var, collection, interfaceC6495t0, thread2, (i11 & 128) != 0 ? INSTANCE.a() : list);
    }

    public c1(Throwable th2, boolean z10, ImmutableConfig immutableConfig) {
        this(th2, z10, immutableConfig.getMaxReportedThreads(), immutableConfig.getSendThreads(), immutableConfig.w(), immutableConfig.getLogger(), null, null, 192, null);
    }
}
