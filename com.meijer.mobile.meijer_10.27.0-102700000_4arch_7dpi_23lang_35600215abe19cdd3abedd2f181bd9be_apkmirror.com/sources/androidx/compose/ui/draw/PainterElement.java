package androidx.compose.ui.draw;

import U0.k;
import V0.C5347r0;
import androidx.compose.ui.layout.InterfaceC5784k;
import androidx.compose.ui.node.C5824u;
import androidx.compose.ui.node.G;
import androidx.compose.ui.node.Y;
import com.google.android.libraries.places.api.model.PlaceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001c\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108¨\u00069"}, d2 = {"Landroidx/compose/ui/draw/PainterElement;", "Landroidx/compose/ui/node/Y;", "Landroidx/compose/ui/draw/e;", "LZ0/c;", PlaceTypes.PAINTER, "", "sizeToIntrinsics", "LP0/e;", "alignment", "Landroidx/compose/ui/layout/k;", "contentScale", "", "alpha", "LV0/r0;", "colorFilter", "<init>", "(LZ0/c;ZLP0/e;Landroidx/compose/ui/layout/k;FLV0/r0;)V", "n", "()Landroidx/compose/ui/draw/e;", "node", "", "o", "(Landroidx/compose/ui/draw/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "LZ0/c;", "getPainter", "()LZ0/c;", "c", "Z", "getSizeToIntrinsics", "()Z", "d", "LP0/e;", "getAlignment", "()LP0/e;", "e", "Landroidx/compose/ui/layout/k;", "getContentScale", "()Landroidx/compose/ui/layout/k;", "f", "F", "getAlpha", "()F", "g", "LV0/r0;", "getColorFilter", "()LV0/r0;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class PainterElement extends Y<PainterModifier> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Z0.c painter;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean sizeToIntrinsics;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final P0.e alignment;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC5784k contentScale;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final float alpha;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final C5347r0 colorFilter;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) other;
        return Intrinsics.e(this.painter, painterElement.painter) && this.sizeToIntrinsics == painterElement.sizeToIntrinsics && Intrinsics.e(this.alignment, painterElement.alignment) && Intrinsics.e(this.contentScale, painterElement.contentScale) && Float.compare(this.alpha, painterElement.alpha) == 0 && Intrinsics.e(this.colorFilter, painterElement.colorFilter);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.painter.hashCode() * 31) + Boolean.hashCode(this.sizeToIntrinsics)) * 31) + this.alignment.hashCode()) * 31) + this.contentScale.hashCode()) * 31) + Float.hashCode(this.alpha)) * 31;
        C5347r0 c5347r0 = this.colorFilter;
        return iHashCode + (c5347r0 == null ? 0 : c5347r0.hashCode());
    }

    public String toString() {
        return "PainterElement(painter=" + this.painter + ", sizeToIntrinsics=" + this.sizeToIntrinsics + ", alignment=" + this.alignment + ", contentScale=" + this.contentScale + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ')';
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public PainterModifier b() {
        return new PainterModifier(this.painter, this.sizeToIntrinsics, this.alignment, this.contentScale, this.alpha, this.colorFilter);
    }

    public PainterElement(Z0.c cVar, boolean z10, P0.e eVar, InterfaceC5784k interfaceC5784k, float f10, C5347r0 c5347r0) {
        this.painter = cVar;
        this.sizeToIntrinsics = z10;
        this.alignment = eVar;
        this.contentScale = interfaceC5784k;
        this.alpha = f10;
        this.colorFilter = c5347r0;
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void c(PainterModifier node) {
        boolean z10;
        boolean sizeToIntrinsics = node.getSizeToIntrinsics();
        boolean z11 = this.sizeToIntrinsics;
        if (sizeToIntrinsics == z11 && (!z11 || k.f(node.getPainter().k(), this.painter.k()))) {
            z10 = false;
        } else {
            z10 = true;
        }
        node.U2(this.painter);
        node.V2(this.sizeToIntrinsics);
        node.R2(this.alignment);
        node.T2(this.contentScale);
        node.d(this.alpha);
        node.S2(this.colorFilter);
        if (z10) {
            G.b(node);
        }
        C5824u.a(node);
    }
}
