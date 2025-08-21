package Ds;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qw.a;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LDs/e;", "Lqw/a$b;", "<init>", "()V", "", "priority", "", "tag", "message", "", "t", "", "o", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "Lcom/google/firebase/crashlytics/a;", "b", "Lcom/google/firebase/crashlytics/a;", "getCrashlytics", "()Lcom/google/firebase/crashlytics/a;", "crashlytics", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class e extends a.b {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final com.google.firebase.crashlytics.a crashlytics;

    @Override // qw.a.b
    protected void o(int priority, String tag, String message, Throwable t10) {
        Intrinsics.j(message, "message");
        if (priority == 2 || priority == 3) {
            return;
        }
        this.crashlytics.d(message);
        if (t10 != null) {
            this.crashlytics.e(t10);
        }
    }

    public e() {
        com.google.firebase.crashlytics.a aVarB = com.google.firebase.crashlytics.a.b();
        Intrinsics.i(aVarB, "getInstance(...)");
        this.crashlytics = aVarB;
    }
}
