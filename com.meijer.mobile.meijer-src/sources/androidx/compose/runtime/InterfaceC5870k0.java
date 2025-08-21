package androidx.compose.runtime;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\n\bg\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00038W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\f\u001a\u00020\u00038&@&X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/k0;", "Landroidx/compose/runtime/a0;", "Landroidx/compose/runtime/l0;", "", "value", "getValue", "()Ljava/lang/Long;", "n", "(J)V", "c", "()J", "I", "longValue", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.runtime.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC5870k0 extends InterfaceC5837a0, InterfaceC5872l0<Long> {
    void I(long j10);

    @Override // androidx.compose.runtime.InterfaceC5837a0
    long c();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.z1
    default Long getValue() {
        return Long.valueOf(c());
    }

    @Override // androidx.compose.runtime.InterfaceC5872l0
    /* bridge */ /* synthetic */ default void setValue(Long l10) {
        n(l10.longValue());
    }

    default void n(long j10) {
        I(j10);
    }
}
