package androidx.compose.ui.node;

import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u0016\u0010\u0017\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010R\u0016\u0010\u0019\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0010R\u0016\u0010\u001b\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0010R\u0016\u0010\u001d\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0010R\u001c\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001f\u0010 \u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"Landroidx/compose/ui/node/B;", "", "<init>", "()V", "other", "", "b", "(Landroidx/compose/ui/node/B;)V", "Landroidx/compose/ui/graphics/e;", "scope", "a", "(Landroidx/compose/ui/graphics/e;)V", "", "c", "(Landroidx/compose/ui/node/B;)Z", "", "F", "scaleX", "scaleY", "translationX", "d", "translationY", "e", "rotationX", "f", "rotationY", "g", "rotationZ", "h", "cameraDistance", "Landroidx/compose/ui/graphics/i;", "i", "J", "transformOrigin", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class B {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private float translationX;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float translationY;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private float rotationX;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private float rotationY;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private float rotationZ;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private float scaleX = 1.0f;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private float scaleY = 1.0f;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private float cameraDistance = 8.0f;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private long transformOrigin = androidx.compose.ui.graphics.i.INSTANCE.a();

    public final void b(B other) {
        this.scaleX = other.scaleX;
        this.scaleY = other.scaleY;
        this.translationX = other.translationX;
        this.translationY = other.translationY;
        this.rotationX = other.rotationX;
        this.rotationY = other.rotationY;
        this.rotationZ = other.rotationZ;
        this.cameraDistance = other.cameraDistance;
        this.transformOrigin = other.transformOrigin;
    }

    public final boolean c(B other) {
        return this.scaleX == other.scaleX && this.scaleY == other.scaleY && this.translationX == other.translationX && this.translationY == other.translationY && this.rotationX == other.rotationX && this.rotationY == other.rotationY && this.rotationZ == other.rotationZ && this.cameraDistance == other.cameraDistance && androidx.compose.ui.graphics.i.e(this.transformOrigin, other.transformOrigin);
    }

    public final void a(androidx.compose.ui.graphics.e scope) {
        this.scaleX = scope.G();
        this.scaleY = scope.V();
        this.translationX = scope.Q();
        this.translationY = scope.P();
        this.rotationX = scope.S();
        this.rotationY = scope.v();
        this.rotationZ = scope.y();
        this.cameraDistance = scope.C();
        this.transformOrigin = scope.D0();
    }
}
