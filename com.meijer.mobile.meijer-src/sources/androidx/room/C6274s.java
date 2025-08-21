package androidx.room;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0018\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0012R\u0018\u0010\u0017\u001a\u00060\u0014j\u0002`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001e¨\u0006 "}, d2 = {"Landroidx/room/s;", "", "", "size", "<init>", "(I)V", "", "Landroidx/room/s$a;", "b", "()[Landroidx/room/s$a;", "", "tableIds", "", "c", "([I)Z", "d", "", "e", "()V", "a", "Ljava/util/concurrent/locks/ReentrantLock;", "Landroidx/room/concurrent/ReentrantLock;", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "", "[J", "tableObserversCount", "", "[Z", "tableObservedState", "Z", "needsSync", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.room.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6274s {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ReentrantLock lock = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long[] tableObserversCount;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean[] tableObservedState;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean needsSync;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/room/s$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: androidx.room.s$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f58863a = new a("NO_OP", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f58864b = new a("ADD", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final a f58865c = new a("REMOVE", 2);

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ a[] f58866d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f58867e;

        private static final /* synthetic */ a[] a() {
            return new a[]{f58863a, f58864b, f58865c};
        }

        static {
            a[] aVarArrA = a();
            f58866d = aVarArrA;
            f58867e = EnumEntriesKt.a(aVarArrA);
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f58866d.clone();
        }

        private a(String str, int i10) {
        }
    }

    public final void a() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.needsSync = true;
            Unit unit = Unit.f143329a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final a[] b() {
        a aVar;
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (!this.needsSync) {
                reentrantLock.unlock();
                return null;
            }
            this.needsSync = false;
            int length = this.tableObserversCount.length;
            a[] aVarArr = new a[length];
            int i10 = 0;
            boolean z10 = false;
            while (i10 < length) {
                boolean z11 = true;
                boolean z12 = this.tableObserversCount[i10] > 0;
                boolean[] zArr = this.tableObservedState;
                if (z12 != zArr[i10]) {
                    zArr[i10] = z12;
                    aVar = z12 ? a.f58864b : a.f58865c;
                } else {
                    z11 = z10;
                    aVar = a.f58863a;
                }
                aVarArr[i10] = aVar;
                i10++;
                z10 = z11;
            }
            a[] aVarArr2 = z10 ? aVarArr : null;
            reentrantLock.unlock();
            return aVarArr2;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final boolean c(int[] tableIds) {
        Intrinsics.j(tableIds, "tableIds");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            boolean z10 = false;
            for (int i10 : tableIds) {
                long[] jArr = this.tableObserversCount;
                long j10 = jArr[i10];
                jArr[i10] = 1 + j10;
                if (j10 == 0) {
                    z10 = true;
                    this.needsSync = true;
                }
            }
            return z10;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean d(int[] tableIds) {
        Intrinsics.j(tableIds, "tableIds");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            boolean z10 = false;
            for (int i10 : tableIds) {
                long[] jArr = this.tableObserversCount;
                long j10 = jArr[i10];
                jArr[i10] = j10 - 1;
                if (j10 == 1) {
                    z10 = true;
                    this.needsSync = true;
                }
            }
            return z10;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void e() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            ArraysKt.G(this.tableObservedState, false, 0, 0, 6, null);
            this.needsSync = true;
            Unit unit = Unit.f143329a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public C6274s(int i10) {
        this.tableObserversCount = new long[i10];
        this.tableObservedState = new boolean[i10];
    }
}
