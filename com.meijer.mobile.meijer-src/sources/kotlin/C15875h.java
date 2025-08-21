package kotlin;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.n0;
import kotlin.InterfaceC6419F;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\f*\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR*\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R*\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R*\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015¨\u0006\u001c"}, d2 = {"Ln0/h;", "Landroidx/compose/ui/Modifier$c;", "Landroidx/compose/ui/node/n0;", "Lc0/F;", "", "fadeInSpec", "LH1/n;", "placementSpec", "fadeOutSpec", "<init>", "(Lc0/F;Lc0/F;Lc0/F;)V", "LH1/d;", "", "parentData", "R", "(LH1/d;Ljava/lang/Object;)Ljava/lang/Object;", "o", "Lc0/F;", "K2", "()Lc0/F;", "N2", "(Lc0/F;)V", "p", "M2", "P2", "q", "L2", "O2", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: n0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15875h extends Modifier.c implements n0 {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private InterfaceC6419F<Float> fadeInSpec;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private InterfaceC6419F<H1.n> placementSpec;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private InterfaceC6419F<Float> fadeOutSpec;

    @Override // androidx.compose.ui.node.n0
    public Object R(H1.d dVar, Object obj) {
        return this;
    }

    public final InterfaceC6419F<Float> K2() {
        return this.fadeInSpec;
    }

    public final InterfaceC6419F<Float> L2() {
        return this.fadeOutSpec;
    }

    public final InterfaceC6419F<H1.n> M2() {
        return this.placementSpec;
    }

    public final void N2(InterfaceC6419F<Float> interfaceC6419F) {
        this.fadeInSpec = interfaceC6419F;
    }

    public final void O2(InterfaceC6419F<Float> interfaceC6419F) {
        this.fadeOutSpec = interfaceC6419F;
    }

    public final void P2(InterfaceC6419F<H1.n> interfaceC6419F) {
        this.placementSpec = interfaceC6419F;
    }

    public C15875h(InterfaceC6419F<Float> interfaceC6419F, InterfaceC6419F<H1.n> interfaceC6419F2, InterfaceC6419F<Float> interfaceC6419F3) {
        this.fadeInSpec = interfaceC6419F;
        this.placementSpec = interfaceC6419F2;
        this.fadeOutSpec = interfaceC6419F3;
    }
}
