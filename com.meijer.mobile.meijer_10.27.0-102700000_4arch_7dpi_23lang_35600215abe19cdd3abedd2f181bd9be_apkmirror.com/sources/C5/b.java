package C5;

import androidx.compose.runtime.InterfaceC5730l0;
import com.adobe.marketing.mobile.assurance.internal.B;
import com.adobe.marketing.mobile.assurance.internal.EnumC6425g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import v5.AbstractC17511c;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000e¨\u0006\u000f"}, d2 = {"LC5/b;", "Lcom/adobe/marketing/mobile/assurance/internal/B;", "Landroidx/compose/runtime/l0;", "Lv5/c;", "quickConnectState", "<init>", "(Landroidx/compose/runtime/l0;)V", "", "a", "()V", "Lcom/adobe/marketing/mobile/assurance/internal/g;", "error", "b", "(Lcom/adobe/marketing/mobile/assurance/internal/g;)V", "Landroidx/compose/runtime/l0;", "assurance_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements B {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0<AbstractC17511c> quickConnectState;

    public b(InterfaceC5730l0<AbstractC17511c> quickConnectState) {
        Intrinsics.j(quickConnectState, "quickConnectState");
        this.quickConnectState = quickConnectState;
    }

    @Override // com.adobe.marketing.mobile.assurance.internal.B
    public void a() {
        this.quickConnectState.setValue(AbstractC17511c.a.f164557a);
    }

    @Override // com.adobe.marketing.mobile.assurance.internal.B
    public void b(EnumC6425g error) {
        this.quickConnectState.setValue(new AbstractC17511c.Disconnected(error));
    }
}
