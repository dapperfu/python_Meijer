package androidx.compose.ui.platform;

import V0.AbstractC5480m1;
import android.graphics.Outline;
import android.os.Build;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Canvas;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\"\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J0\u0010\u0019\u001a\u00020\u0018*\u0004\u0018\u00010\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ:\u0010 \u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u0018\u0010#\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u0012ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(R\u0016\u0010*\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00103\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00105\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00102R$\u00108\u001a\u00020\u00182\u0006\u00106\u001a\u00020\u00188\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b#\u0010)\u001a\u0004\b/\u00107R\u0016\u00109\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010)R\u0018\u0010:\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u00102R\u0018\u0010<\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010;R\u0016\u0010>\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010=R\u001c\u0010@\u001a\u00020\u00128\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\b\u0010?R\u001c\u0010A\u001a\u00020\u00148\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\f\u0010?R\u0016\u0010C\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010)R\u0018\u0010E\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u00102R\u0018\u0010G\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u00102R\u0013\u0010I\u001a\u0004\u0018\u00010+8F¢\u0006\u0006\u001a\u0004\b,\u0010HR\u0011\u0010J\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b4\u00107R\u0013\u0010L\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b1\u0010K\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006M"}, d2 = {"Landroidx/compose/ui/platform/Y0;", "", "<init>", "()V", "", "i", "Landroidx/compose/ui/geometry/Rect;", "rect", "k", "(Landroidx/compose/ui/geometry/Rect;)V", "LU0/i;", "roundRect", "l", "(LU0/i;)V", "LV0/q1;", "composePath", "j", "(LV0/q1;)V", "LU0/f;", "offset", "LU0/k;", "size", "", "radius", "", "g", "(LU0/i;JJF)Z", "LV0/m1;", "outline", "alpha", "clipToOutline", "elevation", "h", "(LV0/m1;FZFJ)Z", "position", "f", "(J)Z", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "a", "(Landroidx/compose/ui/graphics/Canvas;)V", "Z", "isSupportedOutline", "Landroid/graphics/Outline;", "b", "Landroid/graphics/Outline;", "cachedOutline", "c", "LV0/m1;", "d", "LV0/q1;", "cachedRrectPath", "e", "outlinePath", "<set-?>", "()Z", "cacheIsDirty", "usePathForClip", "tmpPath", "LU0/i;", "tmpRoundRect", "F", "roundedCornerRadius", "J", "rectTopLeft", "rectSize", "m", "outlineNeeded", "n", "tmpTouchPointPath", "o", "tmpOpPath", "()Landroid/graphics/Outline;", "androidOutline", "outlineClipSupported", "()LV0/q1;", "clipPath", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class Y0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean isSupportedOutline = true;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Outline cachedOutline;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private AbstractC5480m1 outline;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private V0.q1 cachedRrectPath;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private V0.q1 outlinePath;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean cacheIsDirty;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean usePathForClip;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private V0.q1 tmpPath;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private U0.i tmpRoundRect;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private float roundedCornerRadius;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private long rectTopLeft;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private long rectSize;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean outlineNeeded;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private V0.q1 tmpTouchPointPath;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private V0.q1 tmpOpPath;

    private final boolean g(U0.i iVar, long j10, long j11, float f10) {
        if (iVar != null && U0.j.h(iVar)) {
            int i10 = (int) (j10 >> 32);
            if (iVar.getLeft() == Float.intBitsToFloat(i10)) {
                int i11 = (int) (j10 & 4294967295L);
                if (iVar.getTop() == Float.intBitsToFloat(i11) && iVar.getRight() == Float.intBitsToFloat(i10) + Float.intBitsToFloat((int) (j11 >> 32)) && iVar.getBottom() == Float.intBitsToFloat(i11) + Float.intBitsToFloat((int) (j11 & 4294967295L)) && Float.intBitsToFloat((int) (iVar.getTopLeftCornerRadius() >> 32)) == f10) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void i() {
        if (this.cacheIsDirty) {
            this.rectTopLeft = U0.f.INSTANCE.c();
            this.roundedCornerRadius = 0.0f;
            this.outlinePath = null;
            this.cacheIsDirty = false;
            this.usePathForClip = false;
            AbstractC5480m1 abstractC5480m1 = this.outline;
            if (abstractC5480m1 == null || !this.outlineNeeded || Float.intBitsToFloat((int) (this.rectSize >> 32)) <= 0.0f || Float.intBitsToFloat((int) (this.rectSize & 4294967295L)) <= 0.0f) {
                this.cachedOutline.setEmpty();
                return;
            }
            this.isSupportedOutline = true;
            if (abstractC5480m1 instanceof AbstractC5480m1.b) {
                k(((AbstractC5480m1.b) abstractC5480m1).b());
            } else if (abstractC5480m1 instanceof AbstractC5480m1.c) {
                l(((AbstractC5480m1.c) abstractC5480m1).getRoundRect());
            } else if (abstractC5480m1 instanceof AbstractC5480m1.a) {
                j(((AbstractC5480m1.a) abstractC5480m1).getPath());
            }
        }
    }

    private final void j(V0.q1 composePath) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 28 || composePath.a()) {
            if (i10 >= 30) {
                Z0.f52215a.a(this.cachedOutline, composePath);
            } else {
                Outline outline = this.cachedOutline;
                if (!(composePath instanceof V0.Q)) {
                    throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                }
                outline.setConvexPath(((V0.Q) composePath).getInternalPath());
            }
            this.usePathForClip = !this.cachedOutline.canClip();
        } else {
            this.isSupportedOutline = false;
            this.cachedOutline.setEmpty();
            this.usePathForClip = true;
        }
        this.outlinePath = composePath;
    }

    public final void a(Canvas canvas) {
        Y0 y02;
        V0.q1 q1VarD = d();
        if (q1VarD != null) {
            Canvas.j(canvas, q1VarD, 0, 2, null);
            return;
        }
        float f10 = this.roundedCornerRadius;
        if (f10 <= 0.0f) {
            Canvas.m(canvas, Float.intBitsToFloat((int) (this.rectTopLeft >> 32)), Float.intBitsToFloat((int) (this.rectTopLeft & 4294967295L)), Float.intBitsToFloat((int) (this.rectSize >> 32)) + Float.intBitsToFloat((int) (this.rectTopLeft >> 32)), Float.intBitsToFloat((int) (this.rectSize & 4294967295L)) + Float.intBitsToFloat((int) (this.rectTopLeft & 4294967295L)), 0, 16, null);
            return;
        }
        V0.q1 q1VarA = this.tmpPath;
        U0.i iVar = this.tmpRoundRect;
        if (q1VarA != null) {
            y02 = this;
            if (!g(iVar, this.rectTopLeft, this.rectSize, f10)) {
            }
            Canvas.j(canvas, q1VarA, 0, 2, null);
        }
        y02 = this;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (y02.rectTopLeft >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (y02.rectTopLeft & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (y02.rectSize >> 32)) + Float.intBitsToFloat((int) (y02.rectTopLeft >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (y02.rectSize & 4294967295L)) + Float.intBitsToFloat((int) (y02.rectTopLeft & 4294967295L));
        float f11 = y02.roundedCornerRadius;
        U0.i iVarE = U0.j.e(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, U0.a.b((Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L)));
        if (q1VarA == null) {
            q1VarA = V0.W.a();
        } else {
            q1VarA.reset();
        }
        V0.q1.p(q1VarA, iVarE, null, 2, null);
        y02.tmpRoundRect = iVarE;
        y02.tmpPath = q1VarA;
        Canvas.j(canvas, q1VarA, 0, 2, null);
    }

    /* renamed from: c, reason: from getter */
    public final boolean getCacheIsDirty() {
        return this.cacheIsDirty;
    }

    public final boolean e() {
        return !this.usePathForClip;
    }

    public final boolean f(long position) {
        AbstractC5480m1 abstractC5480m1;
        if (this.outlineNeeded && (abstractC5480m1 = this.outline) != null) {
            return C1.b(abstractC5480m1, Float.intBitsToFloat((int) (position >> 32)), Float.intBitsToFloat((int) (position & 4294967295L)), this.tmpTouchPointPath, this.tmpOpPath);
        }
        return true;
    }

    public final boolean h(AbstractC5480m1 outline, float alpha, boolean clipToOutline, float elevation, long size) {
        this.cachedOutline.setAlpha(alpha);
        boolean zE = Intrinsics.e(this.outline, outline);
        boolean z10 = !zE;
        if (!zE) {
            this.outline = outline;
            this.cacheIsDirty = true;
        }
        this.rectSize = size;
        boolean z11 = outline != null && (clipToOutline || elevation > 0.0f);
        if (this.outlineNeeded != z11) {
            this.outlineNeeded = z11;
            this.cacheIsDirty = true;
        }
        return z10;
    }

    public Y0() {
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.cachedOutline = outline;
        this.rectTopLeft = U0.f.INSTANCE.c();
        this.rectSize = U0.k.INSTANCE.b();
    }

    private final void k(Rect rect) {
        float left = rect.getLeft();
        float top = rect.getTop();
        this.rectTopLeft = U0.f.e((Float.floatToRawIntBits(top) & 4294967295L) | (Float.floatToRawIntBits(left) << 32));
        float fL = rect.l() - rect.getLeft();
        float fI = rect.i() - rect.getTop();
        this.rectSize = U0.k.d((Float.floatToRawIntBits(fI) & 4294967295L) | (Float.floatToRawIntBits(fL) << 32));
        this.cachedOutline.setRect(Math.round(rect.getLeft()), Math.round(rect.getTop()), Math.round(rect.l()), Math.round(rect.i()));
    }

    private final void l(U0.i roundRect) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (roundRect.getTopLeftCornerRadius() >> 32));
        float left = roundRect.getLeft();
        float top = roundRect.getTop();
        this.rectTopLeft = U0.f.e((Float.floatToRawIntBits(top) & 4294967295L) | (Float.floatToRawIntBits(left) << 32));
        float fJ = roundRect.j();
        float fD = roundRect.d();
        this.rectSize = U0.k.d((Float.floatToRawIntBits(fD) & 4294967295L) | (Float.floatToRawIntBits(fJ) << 32));
        if (U0.j.h(roundRect)) {
            this.cachedOutline.setRoundRect(Math.round(roundRect.getLeft()), Math.round(roundRect.getTop()), Math.round(roundRect.getRight()), Math.round(roundRect.getBottom()), fIntBitsToFloat);
            this.roundedCornerRadius = fIntBitsToFloat;
            return;
        }
        V0.q1 q1VarA = this.cachedRrectPath;
        if (q1VarA == null) {
            q1VarA = V0.W.a();
            this.cachedRrectPath = q1VarA;
        }
        q1VarA.reset();
        V0.q1.p(q1VarA, roundRect, null, 2, null);
        j(q1VarA);
    }

    public final Outline b() {
        i();
        if (this.outlineNeeded && this.isSupportedOutline) {
            return this.cachedOutline;
        }
        return null;
    }

    public final V0.q1 d() {
        i();
        return this.outlinePath;
    }
}
