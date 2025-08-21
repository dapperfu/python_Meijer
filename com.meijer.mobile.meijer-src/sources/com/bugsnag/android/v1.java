package com.bugsnag.android;

import android.util.JsonReader;
import com.bugsnag.android.V;
import com.bugsnag.android.e1;
import com.bugsnag.android.s1;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0004\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001fR\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001fR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001fR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010!R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00100\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010#R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lcom/bugsnag/android/v1;", "", "", "persist", "LS6/d;", "Ljava/io/File;", "persistentDir", "Lcom/bugsnag/android/V$c;", "deviceIdStore", "file", "Lcom/bugsnag/android/b1;", "sharedPrefMigrator", "Lcom/bugsnag/android/D0;", "logger", "<init>", "(ZLS6/d;LS6/d;Ljava/io/File;LS6/d;Lcom/bugsnag/android/D0;)V", "Lcom/bugsnag/android/s1;", "user", "f", "(Lcom/bugsnag/android/s1;)Z", "d", "()Lcom/bugsnag/android/s1;", "initialUser", "Lcom/bugsnag/android/t1;", "b", "(Lcom/bugsnag/android/s1;)Lcom/bugsnag/android/t1;", "", "e", "(Lcom/bugsnag/android/s1;)V", "a", "Z", "LS6/d;", "c", "Lcom/bugsnag/android/D0;", "Lcom/bugsnag/android/h1;", "Lcom/bugsnag/android/h1;", "synchronizedStreamableStore", "Ljava/util/concurrent/atomic/AtomicReference;", "g", "Ljava/util/concurrent/atomic/AtomicReference;", "previousUser", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class v1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean persist;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final S6.d<File> persistentDir;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final S6.d<V.DeviceIds> deviceIdStore;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final S6.d<b1> sharedPrefMigrator;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final D0 logger;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final h1<s1> synchronizedStreamableStore;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final AtomicReference<s1> previousUser;

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* synthetic */ class a extends FunctionReferenceImpl implements Function1<JsonReader, s1> {
        a(Object obj) {
            super(1, obj, s1.Companion.class, "fromReader", "fromReader(Landroid/util/JsonReader;)Lcom/bugsnag/android/User;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s1 invoke(JsonReader jsonReader) {
            return ((s1.Companion) this.receiver).a(jsonReader);
        }
    }

    public v1(boolean z10, S6.d<File> dVar, S6.d<V.DeviceIds> dVar2, File file, S6.d<b1> dVar3, D0 d02) {
        this.persist = z10;
        this.persistentDir = dVar;
        this.deviceIdStore = dVar2;
        this.sharedPrefMigrator = dVar3;
        this.logger = d02;
        this.previousUser = new AtomicReference<>(null);
        this.synchronizedStreamableStore = new h1<>(file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(v1 v1Var, e1 e1Var) {
        if (e1Var instanceof e1.s) {
            v1Var.e(((e1.s) e1Var).user);
        }
    }

    private final s1 d() {
        if (this.sharedPrefMigrator.get().c()) {
            b1 b1Var = this.sharedPrefMigrator.get();
            V.DeviceIds deviceIds = this.deviceIdStore.get();
            s1 s1VarD = b1Var.d(deviceIds != null ? deviceIds.getDeviceId() : null);
            e(s1VarD);
            return s1VarD;
        }
        if (!this.synchronizedStreamableStore.getFile().canRead() || this.synchronizedStreamableStore.getFile().length() <= 0 || !this.persist) {
            return null;
        }
        try {
            return (s1) this.synchronizedStreamableStore.b(new a(s1.INSTANCE));
        } catch (Exception e10) {
            this.logger.b("Failed to load user info", e10);
            return null;
        }
    }

    public final void e(s1 user) {
        if (!this.persist || Intrinsics.e(user, this.previousUser.getAndSet(user))) {
            return;
        }
        try {
            this.synchronizedStreamableStore.c(user);
        } catch (Exception e10) {
            this.logger.b("Failed to persist user info", e10);
        }
    }

    private final boolean f(s1 user) {
        if (user.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String() == null && user.getName() == null && user.getEmail() == null) {
            return false;
        }
        return true;
    }

    public final t1 b(s1 initialUser) {
        t1 t1Var;
        String deviceId;
        if (!f(initialUser)) {
            if (this.persist) {
                initialUser = d();
            } else {
                initialUser = null;
            }
        }
        if (initialUser != null && f(initialUser)) {
            t1Var = new t1(initialUser);
        } else {
            V.DeviceIds deviceIds = this.deviceIdStore.get();
            if (deviceIds == null) {
                deviceId = null;
            } else {
                deviceId = deviceIds.getDeviceId();
            }
            t1Var = new t1(new s1(deviceId, null, null));
        }
        t1Var.addObserver(new R6.r() { // from class: com.bugsnag.android.u1
            @Override // R6.r
            public final void onStateChange(e1 e1Var) {
                v1.c(this.f64413a, e1Var);
            }
        });
        return t1Var;
    }

    public /* synthetic */ v1(boolean z10, S6.d dVar, S6.d dVar2, File file, S6.d dVar3, D0 d02, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, dVar, dVar2, (i10 & 8) != 0 ? new File((File) dVar.get(), "user-info") : file, dVar3, d02);
    }
}
