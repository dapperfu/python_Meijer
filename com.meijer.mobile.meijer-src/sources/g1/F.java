package g1;

import androidx.compose.ui.node.C5968w;
import androidx.compose.ui.node.LayoutNode;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"Lg1/F;", "", "Landroidx/compose/ui/node/LayoutNode;", "root", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "Lg1/D;", "pointerEvent", "Lg1/P;", "positionCalculator", "", "isInBounds", "Lg1/Q;", "b", "(Lg1/D;Lg1/P;Z)I", "", "c", "()V", "a", "Landroidx/compose/ui/node/LayoutNode;", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", "Lg1/e;", "Lg1/e;", "hitPathTracker", "Lg1/C;", "Lg1/C;", "pointerInputChangeEventProducer", "Landroidx/compose/ui/node/w;", "d", "Landroidx/compose/ui/node/w;", "hitResult", "e", "Z", "isProcessing", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final LayoutNode root;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C14302e hitPathTracker;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C pointerInputChangeEventProducer = new C();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C5968w hitResult = new C5968w();

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean isProcessing;

    public final void a() {
        this.hitPathTracker.c();
    }

    public final int b(D pointerEvent, P positionCalculator, boolean isInBounds) {
        boolean z10;
        if (this.isProcessing) {
            return G.a(false, false);
        }
        boolean z11 = true;
        try {
            this.isProcessing = true;
            C14304g c14304gB = this.pointerInputChangeEventProducer.b(pointerEvent, positionCalculator);
            int iM = c14304gB.b().m();
            for (int i10 = 0; i10 < iM; i10++) {
                PointerInputChange pointerInputChangeN = c14304gB.b().n(i10);
                if (!pointerInputChangeN.getPressed() && !pointerInputChangeN.getPreviousPressed()) {
                }
                z10 = false;
                break;
            }
            z10 = true;
            int iM2 = c14304gB.b().m();
            for (int i11 = 0; i11 < iM2; i11++) {
                PointerInputChange pointerInputChangeN2 = c14304gB.b().n(i11);
                if (z10 || r.b(pointerInputChangeN2)) {
                    LayoutNode.v0(this.root, pointerInputChangeN2.getPosition(), this.hitResult, pointerInputChangeN2.getType(), false, 8, null);
                    if (!this.hitResult.isEmpty()) {
                        this.hitPathTracker.b(pointerInputChangeN2.getId(), this.hitResult, r.b(pointerInputChangeN2));
                        this.hitResult.clear();
                    }
                }
            }
            boolean zD = this.hitPathTracker.d(c14304gB, isInBounds);
            if (c14304gB.getSuppressMovementConsumption()) {
                z11 = false;
            } else {
                int iM3 = c14304gB.b().m();
                for (int i12 = 0; i12 < iM3; i12++) {
                    PointerInputChange pointerInputChangeN3 = c14304gB.b().n(i12);
                    if (r.k(pointerInputChangeN3) && pointerInputChangeN3.p()) {
                        break;
                    }
                }
                z11 = false;
            }
            int iA = G.a(zD, z11);
            this.isProcessing = false;
            return iA;
        } catch (Throwable th2) {
            this.isProcessing = false;
            throw th2;
        }
    }

    public final void c() {
        if (this.isProcessing) {
            return;
        }
        this.pointerInputChangeEventProducer.a();
        this.hitPathTracker.e();
    }

    public F(LayoutNode layoutNode) {
        this.root = layoutNode;
        this.hitPathTracker = new C14302e(layoutNode.getCoordinates());
    }
}
