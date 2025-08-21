package g1;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.A0;
import androidx.compose.ui.node.B0;
import androidx.compose.ui.node.C0;
import androidx.compose.ui.node.C5955i;
import androidx.compose.ui.node.C5957k;
import androidx.compose.ui.node.DpTouchBoundsExpansion;
import androidx.compose.ui.node.InterfaceC5954h;
import androidx.compose.ui.node.q0;
import androidx.compose.ui.node.y0;
import androidx.compose.ui.platform.C6034t0;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import g1.C14316t;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B%\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u000fJ\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u000fJ\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u000fJ*\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\rH\u0016¢\u0006\u0004\b \u0010\u000fJ\u000f\u0010!\u001a\u00020\rH\u0016¢\u0006\u0004\b!\u0010\u000fJ\u001a\u0010$\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\"H&ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u0019\u0010&\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b&\u0010'R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R*\u0010\u0006\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u00058\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u0010'R*\u0010\b\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0016\u0010;\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00105R\u0016\u0010?\u001a\u0004\u0018\u00010<8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u001a\u0010C\u001a\u00020@8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bA\u0010B\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006D"}, d2 = {"Lg1/f;", "Landroidx/compose/ui/Modifier$c;", "Landroidx/compose/ui/node/B0;", "Landroidx/compose/ui/node/q0;", "Landroidx/compose/ui/node/h;", "Lg1/w;", BarcodePickDeserializer.FIELD_ICON, "", "overrideDescendants", "Landroidx/compose/ui/node/s;", "dpTouchBoundsExpansion", "<init>", "(Lg1/w;ZLandroidx/compose/ui/node/s;)V", "", "V2", "()V", "W2", "L2", "P2", "Q2", "()Lg1/f;", "O2", "R2", "N2", "Lg1/q;", "pointerEvent", "Lg1/s;", "pass", "LH1/r;", "bounds", "s1", "(Lg1/q;Lg1/s;J)V", "v1", "u2", "Lg1/O;", "pointerType", "U2", "(I)Z", "M2", "(Lg1/w;)V", "o", "Landroidx/compose/ui/node/s;", "getDpTouchBoundsExpansion", "()Landroidx/compose/ui/node/s;", "X2", "(Landroidx/compose/ui/node/s;)V", "value", "p", "Lg1/w;", "getIcon", "()Lg1/w;", "Y2", "q", "Z", "S2", "()Z", "Z2", "(Z)V", "r", "cursorInBoundsOfNode", "Lg1/y;", "T2", "()Lg1/y;", "pointerIconService", "Landroidx/compose/ui/node/y0;", "b1", "()J", "touchBoundsExpansion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: g1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC14303f extends Modifier.c implements B0, q0, InterfaceC5954h {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private DpTouchBoundsExpansion dpTouchBoundsExpansion;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private InterfaceC14319w icon;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean overrideDescendants;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean cursorInBoundsOfNode;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg1/f;", "it", "", "a", "(Lg1/f;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: g1.f$a */
    static final class a extends Lambda implements Function1<AbstractC14303f, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<AbstractC14303f> f133939f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Ref.ObjectRef<AbstractC14303f> objectRef) {
            super(1);
            this.f133939f = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(AbstractC14303f abstractC14303f) {
            if (this.f133939f.f143742a == null && abstractC14303f.cursorInBoundsOfNode) {
                this.f133939f.f143742a = abstractC14303f;
            } else if (this.f133939f.f143742a != null && abstractC14303f.getOverrideDescendants() && abstractC14303f.cursorInBoundsOfNode) {
                this.f133939f.f143742a = abstractC14303f;
            }
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg1/f;", "it", "Landroidx/compose/ui/node/A0;", "a", "(Lg1/f;)Landroidx/compose/ui/node/A0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: g1.f$b */
    static final class b extends Lambda implements Function1<AbstractC14303f, A0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Ref.BooleanRef f133940f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Ref.BooleanRef booleanRef) {
            super(1);
            this.f133940f = booleanRef;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final A0 invoke(AbstractC14303f abstractC14303f) {
            if (abstractC14303f.cursorInBoundsOfNode) {
                this.f133940f.f143735a = false;
                return A0.f51386c;
            }
            return A0.f51384a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg1/f;", "it", "Landroidx/compose/ui/node/A0;", "a", "(Lg1/f;)Landroidx/compose/ui/node/A0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: g1.f$c */
    static final class c extends Lambda implements Function1<AbstractC14303f, A0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<AbstractC14303f> f133941f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Ref.ObjectRef<AbstractC14303f> objectRef) {
            super(1);
            this.f133941f = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final A0 invoke(AbstractC14303f abstractC14303f) {
            A0 a02 = A0.f51384a;
            if (abstractC14303f.cursorInBoundsOfNode) {
                this.f133941f.f143742a = abstractC14303f;
                if (abstractC14303f.getOverrideDescendants()) {
                    return A0.f51385b;
                }
            }
            return a02;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg1/f;", "it", "", "a", "(Lg1/f;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: g1.f$d */
    static final class d extends Lambda implements Function1<AbstractC14303f, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<AbstractC14303f> f133942f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Ref.ObjectRef<AbstractC14303f> objectRef) {
            super(1);
            this.f133942f = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(AbstractC14303f abstractC14303f) {
            if (abstractC14303f.getOverrideDescendants() && abstractC14303f.cursorInBoundsOfNode) {
                this.f133942f.f143742a = abstractC14303f;
            }
            return Boolean.TRUE;
        }
    }

    public /* synthetic */ AbstractC14303f(InterfaceC14319w interfaceC14319w, boolean z10, DpTouchBoundsExpansion dpTouchBoundsExpansion, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC14319w, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? null : dpTouchBoundsExpansion);
    }

    private final void V2() {
        this.cursorInBoundsOfNode = true;
        P2();
    }

    public abstract void M2(InterfaceC14319w icon);

    public abstract boolean U2(int pointerType);

    public AbstractC14303f(InterfaceC14319w interfaceC14319w, boolean z10, DpTouchBoundsExpansion dpTouchBoundsExpansion) {
        this.dpTouchBoundsExpansion = dpTouchBoundsExpansion;
        this.icon = interfaceC14319w;
        this.overrideDescendants = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void N2() {
        Unit unit;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        C0.d(this, new a(objectRef));
        AbstractC14303f abstractC14303f = (AbstractC14303f) objectRef.f143742a;
        if (abstractC14303f != null) {
            abstractC14303f.L2();
            unit = Unit.f143329a;
        } else {
            unit = null;
        }
        if (unit == null) {
            M2(null);
        }
    }

    private final void O2() {
        AbstractC14303f abstractC14303fQ2;
        if (this.cursorInBoundsOfNode) {
            if (this.overrideDescendants || (abstractC14303fQ2 = Q2()) == null) {
                abstractC14303fQ2 = this;
            }
            abstractC14303fQ2.L2();
        }
    }

    private final void P2() {
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.f143735a = true;
        if (!this.overrideDescendants) {
            C0.f(this, new b(booleanRef));
        }
        if (booleanRef.f143735a) {
            L2();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final AbstractC14303f Q2() {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        C0.f(this, new c(objectRef));
        return (AbstractC14303f) objectRef.f143742a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final AbstractC14303f R2() {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        C0.d(this, new d(objectRef));
        return (AbstractC14303f) objectRef.f143742a;
    }

    private final void W2() {
        if (this.cursorInBoundsOfNode) {
            this.cursorInBoundsOfNode = false;
            if (getIsAttached()) {
                N2();
            }
        }
    }

    /* renamed from: S2, reason: from getter */
    public final boolean getOverrideDescendants() {
        return this.overrideDescendants;
    }

    public final void X2(DpTouchBoundsExpansion dpTouchBoundsExpansion) {
        this.dpTouchBoundsExpansion = dpTouchBoundsExpansion;
    }

    public final void Y2(InterfaceC14319w interfaceC14319w) {
        if (Intrinsics.e(this.icon, interfaceC14319w)) {
            return;
        }
        this.icon = interfaceC14319w;
        if (this.cursorInBoundsOfNode) {
            P2();
        }
    }

    public final void Z2(boolean z10) {
        if (this.overrideDescendants != z10) {
            this.overrideDescendants = z10;
            if (z10) {
                if (this.cursorInBoundsOfNode) {
                    L2();
                }
            } else if (this.cursorInBoundsOfNode) {
                O2();
            }
        }
    }

    @Override // androidx.compose.ui.node.q0
    public long b1() {
        DpTouchBoundsExpansion dpTouchBoundsExpansion = this.dpTouchBoundsExpansion;
        return dpTouchBoundsExpansion != null ? dpTouchBoundsExpansion.a(C5957k.k(this)) : y0.INSTANCE.b();
    }

    @Override // androidx.compose.ui.node.q0
    public void s1(C14314q pointerEvent, EnumC14315s pass, long bounds) {
        if (pass == EnumC14315s.f133969b) {
            List<PointerInputChange> listC = pointerEvent.c();
            int size = listC.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (U2(listC.get(i10).getType())) {
                    int type = pointerEvent.getType();
                    C14316t.Companion companion = C14316t.INSTANCE;
                    if (C14316t.i(type, companion.a())) {
                        V2();
                        return;
                    } else {
                        if (C14316t.i(pointerEvent.getType(), companion.b())) {
                            W2();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    private final void L2() {
        InterfaceC14319w interfaceC14319w;
        AbstractC14303f abstractC14303fR2 = R2();
        if (abstractC14303fR2 == null || (interfaceC14319w = abstractC14303fR2.icon) == null) {
            interfaceC14319w = this.icon;
        }
        M2(interfaceC14319w);
    }

    protected final y T2() {
        return (y) C5955i.a(this, C6034t0.n());
    }

    @Override // androidx.compose.ui.Modifier.c
    public void u2() {
        W2();
        super.u2();
    }

    @Override // androidx.compose.ui.node.q0
    public void v1() {
        W2();
    }
}
