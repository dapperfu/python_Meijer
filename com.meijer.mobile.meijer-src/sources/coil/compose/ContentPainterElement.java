package coil.compose;

import P0.e;
import U0.k;
import V0.C5490r0;
import Z0.c;
import androidx.compose.ui.layout.InterfaceC5926k;
import androidx.compose.ui.node.C5966u;
import androidx.compose.ui.node.G;
import androidx.compose.ui.node.Y;
import c5.n;
import com.google.android.libraries.places.api.model.PlaceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H×\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018H×\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH×\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lcoil/compose/ContentPainterElement;", "Landroidx/compose/ui/node/Y;", "Lc5/n;", "LZ0/c;", PlaceTypes.PAINTER, "LP0/e;", "alignment", "Landroidx/compose/ui/layout/k;", "contentScale", "", "alpha", "LV0/r0;", "colorFilter", "<init>", "(LZ0/c;LP0/e;Landroidx/compose/ui/layout/k;FLV0/r0;)V", "k", "()Lc5/n;", "node", "", "n", "(Lc5/n;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LZ0/c;", "c", "LP0/e;", "d", "Landroidx/compose/ui/layout/k;", "e", "F", "f", "LV0/r0;", "coil-compose-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ContentPainterElement extends Y<n> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final c painter;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final e alignment;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC5926k contentScale;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final float alpha;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final C5490r0 colorFilter;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContentPainterElement)) {
            return false;
        }
        ContentPainterElement contentPainterElement = (ContentPainterElement) other;
        return Intrinsics.e(this.painter, contentPainterElement.painter) && Intrinsics.e(this.alignment, contentPainterElement.alignment) && Intrinsics.e(this.contentScale, contentPainterElement.contentScale) && Float.compare(this.alpha, contentPainterElement.alpha) == 0 && Intrinsics.e(this.colorFilter, contentPainterElement.colorFilter);
    }

    public int hashCode() {
        int iHashCode = ((((((this.painter.hashCode() * 31) + this.alignment.hashCode()) * 31) + this.contentScale.hashCode()) * 31) + Float.hashCode(this.alpha)) * 31;
        C5490r0 c5490r0 = this.colorFilter;
        return iHashCode + (c5490r0 == null ? 0 : c5490r0.hashCode());
    }

    public String toString() {
        return "ContentPainterElement(painter=" + this.painter + ", alignment=" + this.alignment + ", contentScale=" + this.contentScale + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ')';
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public n b() {
        return new n(this.painter, this.alignment, this.contentScale, this.alpha, this.colorFilter);
    }

    public ContentPainterElement(c cVar, e eVar, InterfaceC5926k interfaceC5926k, float f10, C5490r0 c5490r0) {
        this.painter = cVar;
        this.alignment = eVar;
        this.contentScale = interfaceC5926k;
        this.alpha = f10;
        this.colorFilter = c5490r0;
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void e(n node) {
        boolean zF = k.f(node.getCom.google.android.libraries.places.api.model.PlaceTypes.PAINTER java.lang.String().k(), this.painter.k());
        node.S2(this.painter);
        node.P2(this.alignment);
        node.R2(this.contentScale);
        node.d(this.alpha);
        node.Q2(this.colorFilter);
        if (!zF) {
            G.b(node);
        }
        C5966u.a(node);
    }
}
