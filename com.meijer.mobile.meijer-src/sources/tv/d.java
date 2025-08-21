package tv;

import kotlin.Metadata;
import mv.C0;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ltv/d;", "LLu/f;", "Lmv/C0;", "job", "<init>", "(Lmv/C0;)V", "", "cancel", "()V", "a", "Lmv/C0;", "kotlinx-coroutines-rx2"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements Lu.f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C0 job;

    @Override // Lu.f
    public void cancel() {
        C0.a.a(this.job, null, 1, null);
    }

    public d(C0 c02) {
        this.job = c02;
    }
}
