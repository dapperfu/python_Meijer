package U4;

import S4.NetworkState;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001BS\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0016R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0017\u001a\u0004\b\u0014\u0010\u0018R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0019\u0010\u0016R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001a\u0010\u0016¨\u0006\u001b"}, d2 = {"LU4/n;", "", "Landroid/content/Context;", "context", "LY4/b;", "taskExecutor", "LU4/h;", "", "batteryChargingTracker", "LU4/c;", "batteryNotLowTracker", "LS4/e;", "networkStateTracker", "storageNotLowTracker", "<init>", "(Landroid/content/Context;LY4/b;LU4/h;LU4/c;LU4/h;LU4/h;)V", "a", "Landroid/content/Context;", "c", "()Landroid/content/Context;", "b", "LU4/h;", "()LU4/h;", "LU4/c;", "()LU4/c;", "d", "e", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h<Boolean> batteryChargingTracker;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c batteryNotLowTracker;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final h<NetworkState> networkStateTracker;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final h<Boolean> storageNotLowTracker;

    @JvmOverloads
    public n(Context context, Y4.b taskExecutor, h<Boolean> batteryChargingTracker, c batteryNotLowTracker, h<NetworkState> networkStateTracker, h<Boolean> storageNotLowTracker) {
        Intrinsics.j(context, "context");
        Intrinsics.j(taskExecutor, "taskExecutor");
        Intrinsics.j(batteryChargingTracker, "batteryChargingTracker");
        Intrinsics.j(batteryNotLowTracker, "batteryNotLowTracker");
        Intrinsics.j(networkStateTracker, "networkStateTracker");
        Intrinsics.j(storageNotLowTracker, "storageNotLowTracker");
        this.context = context;
        this.batteryChargingTracker = batteryChargingTracker;
        this.batteryNotLowTracker = batteryNotLowTracker;
        this.networkStateTracker = networkStateTracker;
        this.storageNotLowTracker = storageNotLowTracker;
    }

    public final h<Boolean> a() {
        return this.batteryChargingTracker;
    }

    /* renamed from: b, reason: from getter */
    public final c getBatteryNotLowTracker() {
        return this.batteryNotLowTracker;
    }

    /* renamed from: c, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    public final h<NetworkState> d() {
        return this.networkStateTracker;
    }

    public final h<Boolean> e() {
        return this.storageNotLowTracker;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ n(android.content.Context r8, Y4.b r9, U4.h r10, U4.c r11, U4.h r12, U4.h r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r7 = this;
            r0 = r14 & 4
            java.lang.String r1 = "context.applicationContext"
            if (r0 == 0) goto L14
            U4.a r0 = new U4.a
            android.content.Context r3 = r8.getApplicationContext()
            kotlin.jvm.internal.Intrinsics.i(r3, r1)
            r0.<init>(r3, r9)
            r3 = r0
            goto L15
        L14:
            r3 = r10
        L15:
            r0 = r14 & 8
            if (r0 == 0) goto L27
            U4.c r0 = new U4.c
            android.content.Context r4 = r8.getApplicationContext()
            kotlin.jvm.internal.Intrinsics.i(r4, r1)
            r0.<init>(r4, r9)
            r4 = r0
            goto L28
        L27:
            r4 = r11
        L28:
            r0 = r14 & 16
            if (r0 == 0) goto L39
            android.content.Context r0 = r8.getApplicationContext()
            kotlin.jvm.internal.Intrinsics.i(r0, r1)
            U4.h r0 = U4.k.a(r0, r9)
            r5 = r0
            goto L3a
        L39:
            r5 = r12
        L3a:
            r0 = r14 & 32
            if (r0 == 0) goto L4f
            U4.l r0 = new U4.l
            android.content.Context r6 = r8.getApplicationContext()
            kotlin.jvm.internal.Intrinsics.i(r6, r1)
            r0.<init>(r6, r9)
            r6 = r0
            r1 = r8
            r2 = r9
            r0 = r7
            goto L53
        L4f:
            r6 = r13
            r0 = r7
            r1 = r8
            r2 = r9
        L53:
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: U4.n.<init>(android.content.Context, Y4.b, U4.h, U4.c, U4.h, U4.h, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
