package d0;

import V0.InterfaceC5316f1;
import V0.q1;
import androidx.compose.ui.graphics.Canvas;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Ld0/e;", "", "LV0/f1;", "imageBitmap", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "LX0/a;", "canvasDrawScope", "LV0/q1;", "borderPath", "<init>", "(LV0/f1;Landroidx/compose/ui/graphics/Canvas;LX0/a;LV0/q1;)V", "g", "()LV0/q1;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LV0/f1;", "b", "Landroidx/compose/ui/graphics/Canvas;", "c", "LX0/a;", "d", "LV0/q1;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: d0.e, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
final /* data */ class BorderCache {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private InterfaceC5316f1 imageBitmap;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private Canvas canvas;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private X0.a canvasDrawScope;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private q1 borderPath;

    public BorderCache() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BorderCache)) {
            return false;
        }
        BorderCache borderCache = (BorderCache) other;
        return Intrinsics.e(this.imageBitmap, borderCache.imageBitmap) && Intrinsics.e(this.canvas, borderCache.canvas) && Intrinsics.e(this.canvasDrawScope, borderCache.canvasDrawScope) && Intrinsics.e(this.borderPath, borderCache.borderPath);
    }

    public BorderCache(InterfaceC5316f1 interfaceC5316f1, Canvas canvas, X0.a aVar, q1 q1Var) {
        this.imageBitmap = interfaceC5316f1;
        this.canvas = canvas;
        this.canvasDrawScope = aVar;
        this.borderPath = q1Var;
    }

    public final q1 g() {
        q1 q1Var = this.borderPath;
        if (q1Var != null) {
            return q1Var;
        }
        q1 q1VarA = V0.W.a();
        this.borderPath = q1VarA;
        return q1VarA;
    }

    public int hashCode() {
        InterfaceC5316f1 interfaceC5316f1 = this.imageBitmap;
        int iHashCode = (interfaceC5316f1 == null ? 0 : interfaceC5316f1.hashCode()) * 31;
        Canvas canvas = this.canvas;
        int iHashCode2 = (iHashCode + (canvas == null ? 0 : canvas.hashCode())) * 31;
        X0.a aVar = this.canvasDrawScope;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        q1 q1Var = this.borderPath;
        return iHashCode3 + (q1Var != null ? q1Var.hashCode() : 0);
    }

    public String toString() {
        return "BorderCache(imageBitmap=" + this.imageBitmap + ", canvas=" + this.canvas + ", canvasDrawScope=" + this.canvasDrawScope + ", borderPath=" + this.borderPath + ')';
    }

    public /* synthetic */ BorderCache(InterfaceC5316f1 interfaceC5316f1, Canvas canvas, X0.a aVar, q1 q1Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : interfaceC5316f1, (i10 & 2) != 0 ? null : canvas, (i10 & 4) != 0 ? null : aVar, (i10 & 8) != 0 ? null : q1Var);
    }
}
