package S4;

import N4.EnumC4334w;
import R4.NetworkState;
import android.os.Build;
import androidx.work.impl.model.WorkSpec;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0014X\u0094D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"LS4/e;", "LS4/a;", "LR4/e;", "LT4/h;", "tracker", "<init>", "(LT4/h;)V", "Landroidx/work/impl/model/WorkSpec;", "workSpec", "", "c", "(Landroidx/work/impl/model/WorkSpec;)Z", "value", "g", "(LR4/e;)Z", "", "b", "I", "e", "()I", "reason", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e extends a<NetworkState> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int reason;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(T4.h<NetworkState> tracker) {
        super(tracker);
        Intrinsics.j(tracker, "tracker");
        this.reason = 7;
    }

    @Override // S4.d
    public boolean c(WorkSpec workSpec) {
        Intrinsics.j(workSpec, "workSpec");
        return workSpec.constraints.getRequiredNetworkType() == EnumC4334w.CONNECTED;
    }

    @Override // S4.a
    /* renamed from: e, reason: from getter */
    protected int getReason() {
        return this.reason;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // S4.a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean f(NetworkState value) {
        Intrinsics.j(value, "value");
        return Build.VERSION.SDK_INT >= 26 ? (value.getIsConnected() && value.getIsValidated()) ? false : true : !value.getIsConnected();
    }
}
