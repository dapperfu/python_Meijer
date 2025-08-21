package androidx.compose.foundation.relocation;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p0.InterfaceC16328a;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u0005J\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\bR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/relocation/d;", "Landroidx/compose/ui/Modifier$c;", "Lp0/a;", "requester", "<init>", "(Lp0/a;)V", "", "K2", "()V", "t2", "L2", "u2", "o", "Lp0/a;", "", "p", "Z", "o2", "()Z", "shouldAutoInvalidate", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class d extends Modifier.c {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private InterfaceC16328a requester;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    private final void K2() {
        InterfaceC16328a interfaceC16328a = this.requester;
        if (interfaceC16328a instanceof a) {
            Intrinsics.h(interfaceC16328a, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            ((a) interfaceC16328a).c().s(this);
        }
    }

    @Override // androidx.compose.ui.Modifier.c
    /* renamed from: o2, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.ui.Modifier.c
    public void t2() {
        L2(this.requester);
    }

    public d(InterfaceC16328a interfaceC16328a) {
        this.requester = interfaceC16328a;
    }

    public final void L2(InterfaceC16328a requester) {
        K2();
        if (requester instanceof a) {
            ((a) requester).c().c(this);
        }
        this.requester = requester;
    }

    @Override // androidx.compose.ui.Modifier.c
    public void u2() {
        K2();
    }
}
