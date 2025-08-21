package mg;

import android.content.Context;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import mg.o;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0001\u0018\u0000 \u000f2\u00020\u0001:\u0001\bB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\r\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lmg/b;", "Lmg/o;", "Landroid/content/Context;", "appContext", "<init>", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "kotlin.jvm.PlatformType", "a", "Landroid/os/Bundle;", "metadata", "", "()Ljava/lang/Boolean;", "sessionEnabled", "Lkotlin/time/Duration;", "b", "()Lkotlin/time/Duration;", "sessionRestartTimeout", "", "c", "()Ljava/lang/Double;", "samplingRate", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: mg.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C15714b implements o {

    /* renamed from: b, reason: collision with root package name */
    private static final a f150997b = new a(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Bundle metadata;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lmg/b$a;", "", "<init>", "()V", "", "SESSIONS_ENABLED", "Ljava/lang/String;", "SESSION_RESTART_TIMEOUT", "SAMPLING_RATE", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: mg.b$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C15714b(Context appContext) {
        Intrinsics.j(appContext, "appContext");
        Bundle bundle = appContext.getPackageManager().getApplicationInfo(appContext.getPackageName(), 128).metaData;
        this.metadata = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // mg.o
    public Boolean a() {
        if (this.metadata.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(this.metadata.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // mg.o
    public Duration b() {
        if (this.metadata.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return Duration.o(DurationKt.s(this.metadata.getInt("firebase_sessions_sessions_restart_timeout"), DurationUnit.f148417e));
        }
        return null;
    }

    @Override // mg.o
    public Double c() {
        if (this.metadata.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(this.metadata.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }

    @Override // mg.o
    public Object d(Continuation<? super Unit> continuation) {
        return o.a.a(this, continuation);
    }
}
