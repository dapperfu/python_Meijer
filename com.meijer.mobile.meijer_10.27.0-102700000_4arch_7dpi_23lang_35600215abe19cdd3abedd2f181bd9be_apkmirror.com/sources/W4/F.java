package W4;

import N4.AbstractC4333v;
import O4.C4458t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LW4/F;", "Ljava/lang/Runnable;", "LO4/t;", "processor", "LO4/y;", "token", "", "stopInForeground", "", "reason", "<init>", "(LO4/t;LO4/y;ZI)V", "", "run", "()V", "a", "LO4/t;", "b", "LO4/y;", "c", "Z", "d", "I", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class F implements Runnable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C4458t processor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final O4.y token;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean stopInForeground;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int reason;

    public F(C4458t processor, O4.y token, boolean z10, int i10) {
        Intrinsics.j(processor, "processor");
        Intrinsics.j(token, "token");
        this.processor = processor;
        this.token = token;
        this.stopInForeground = z10;
        this.reason = i10;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zS = this.stopInForeground ? this.processor.s(this.token, this.reason) : this.processor.t(this.token, this.reason);
        AbstractC4333v.e().a(AbstractC4333v.i("StopWorkRunnable"), "StopWorkRunnable for " + this.token.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String().getWorkSpecId() + "; Processor.stopWork = " + zS);
    }
}
