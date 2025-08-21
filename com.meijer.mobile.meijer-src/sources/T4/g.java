package T4;

import O4.AbstractC4373v;
import O4.EnumC4374w;
import S4.NetworkState;
import androidx.work.impl.model.WorkSpec;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0014X\u0094D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"LT4/g;", "LT4/a;", "LS4/e;", "LU4/h;", "tracker", "<init>", "(LU4/h;)V", "Landroidx/work/impl/model/WorkSpec;", "workSpec", "", "c", "(Landroidx/work/impl/model/WorkSpec;)Z", "value", "g", "(LS4/e;)Z", "", "b", "I", "e", "()I", "reason", "a", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g extends a<NetworkState> {

    /* renamed from: d, reason: collision with root package name */
    private static final String f35904d;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int reason;

    static {
        String strI = AbstractC4373v.i("NetworkNotRoamingCtrlr");
        Intrinsics.i(strI, "tagWithPrefix(\"NetworkNotRoamingCtrlr\")");
        f35904d = strI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(U4.h<NetworkState> tracker) {
        super(tracker);
        Intrinsics.j(tracker, "tracker");
        this.reason = 7;
    }

    @Override // T4.d
    public boolean c(WorkSpec workSpec) {
        Intrinsics.j(workSpec, "workSpec");
        return workSpec.constraints.getRequiredNetworkType() == EnumC4374w.NOT_ROAMING;
    }

    @Override // T4.a
    /* renamed from: e, reason: from getter */
    protected int getReason() {
        return this.reason;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // T4.a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean f(NetworkState value) {
        Intrinsics.j(value, "value");
        return (value.getIsConnected() && value.getIsNotRoaming()) ? false : true;
    }
}
