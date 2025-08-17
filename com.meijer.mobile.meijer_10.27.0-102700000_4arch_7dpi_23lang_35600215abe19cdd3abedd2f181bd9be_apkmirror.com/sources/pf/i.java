package pf;

import android.os.Looper;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import pf.i;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00112\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\t¨\u0006\u0012"}, d2 = {"Lpf/i;", "", "Ljava/util/concurrent/ExecutorService;", "backgroundExecutorService", "blockingExecutorService", "<init>", "(Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;)V", "Lpf/e;", "a", "Lpf/e;", "common", "b", "diskWrite", "c", "dataCollect", "d", "network", "e", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class i {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: f, reason: collision with root package name */
    private static boolean f155739f;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final e common;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final e diskWrite;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final e dataCollect;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final e network;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J+\u0010\u000e\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0012\u0010\u0003R\u001c\u0010\u0016\u001a\n \u0013*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R(\u0010\u0017\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001c\u0010\u0003\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lpf/i$a;", "", "<init>", "()V", "", "r", "()Z", "q", "p", "Lkotlin/Function0;", "isCorrectThread", "", "failureMessage", "", "m", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "k", "i", "g", "kotlin.jvm.PlatformType", "o", "()Ljava/lang/String;", "threadName", "enforcement", "Z", "n", "s", "(Z)V", "getEnforcement$annotations", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: pf.i$a, reason: from kotlin metadata */
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: pf.i$a$a, reason: collision with other inner class name */
        /* synthetic */ class C2418a extends FunctionReferenceImpl implements Function0<Boolean> {
            C2418a(Object obj) {
                super(0, obj, Companion.class, "isBackgroundThread", "isBackgroundThread()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((Companion) this.receiver).p());
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: pf.i$a$b */
        /* synthetic */ class b extends FunctionReferenceImpl implements Function0<Boolean> {
            b(Object obj) {
                super(0, obj, Companion.class, "isBlockingThread", "isBlockingThread()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((Companion) this.receiver).q());
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: pf.i$a$c */
        /* synthetic */ class c extends FunctionReferenceImpl implements Function0<Boolean> {
            c(Object obj) {
                super(0, obj, Companion.class, "isNotMainThread", "isNotMainThread()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((Companion) this.receiver).r());
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String h() {
            return "Must be called on a background thread, was called on " + i.INSTANCE.o() + '.';
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String j() {
            return "Must be called on a blocking thread, was called on " + i.INSTANCE.o() + '.';
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String l() {
            return "Must not be called on a main thread, was called on " + i.INSTANCE.o() + '.';
        }

        @JvmStatic
        public final void g() {
            m(new C2418a(this), new Function0() { // from class: pf.f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return i.Companion.h();
                }
            });
        }

        @JvmStatic
        public final void i() {
            m(new b(this), new Function0() { // from class: pf.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return i.Companion.j();
                }
            });
        }

        @JvmStatic
        public final void k() {
            m(new c(this), new Function0() { // from class: pf.g
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return i.Companion.l();
                }
            });
        }

        private final void m(Function0<Boolean> isCorrectThread, Function0<String> failureMessage) {
            if (!isCorrectThread.invoke().booleanValue()) {
                lf.g.f().b(failureMessage.invoke());
                n();
            }
        }

        private final String o() {
            return Thread.currentThread().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean p() {
            String strO = o();
            Intrinsics.i(strO, "<get-threadName>(...)");
            return StringsKt.c0(strO, "Firebase Background Thread #", false, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean q() {
            String strO = o();
            Intrinsics.i(strO, "<get-threadName>(...)");
            return StringsKt.c0(strO, "Firebase Blocking Thread #", false, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean r() {
            if (!Looper.getMainLooper().isCurrentThread()) {
                return true;
            }
            return false;
        }

        public final boolean n() {
            return i.f155739f;
        }

        public final void s(boolean z10) {
            i.f155739f = z10;
        }
    }

    @JvmStatic
    public static final void c() {
        INSTANCE.g();
    }

    @JvmStatic
    public static final void d() {
        INSTANCE.i();
    }

    @JvmStatic
    public static final void e() {
        INSTANCE.k();
    }

    public static final void f(boolean z10) {
        INSTANCE.s(z10);
    }

    public i(ExecutorService backgroundExecutorService, ExecutorService blockingExecutorService) {
        Intrinsics.j(backgroundExecutorService, "backgroundExecutorService");
        Intrinsics.j(blockingExecutorService, "blockingExecutorService");
        this.common = new e(backgroundExecutorService);
        this.diskWrite = new e(backgroundExecutorService);
        this.dataCollect = new e(backgroundExecutorService);
        this.network = new e(blockingExecutorService);
    }
}
