package kotlin;

import com.google.android.gms.common.api.a;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import sv.EnumC17050a;
import tv.C17145G;
import tv.P;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Luv/z;", "Ltv/P;", "", "Ltv/G;", "initialValue", "<init>", "(I)V", "delta", "", "a0", "(I)Z", "Z", "()Ljava/lang/Integer;", "value", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: uv.z, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C17357z extends C17145G<Integer> implements P<Integer> {
    @Override // tv.P
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public Integer getValue() {
        Integer numValueOf;
        synchronized (this) {
            numValueOf = Integer.valueOf(M().intValue());
        }
        return numValueOf;
    }

    public final boolean a0(int delta) {
        boolean zB;
        synchronized (this) {
            zB = b(Integer.valueOf(M().intValue() + delta));
        }
        return zB;
    }

    public C17357z(int i10) {
        super(1, a.e.API_PRIORITY_OTHER, EnumC17050a.f161241b);
        b(Integer.valueOf(i10));
    }
}
