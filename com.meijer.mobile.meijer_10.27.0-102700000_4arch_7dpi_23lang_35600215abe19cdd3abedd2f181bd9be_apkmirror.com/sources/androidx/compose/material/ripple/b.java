package androidx.compose.material.ripple;

import V0.C5346q0;
import V0.C5349s0;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0002\u0018\u0000 \u001f2\u00020\u0001:\u0002\n\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ \u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0018R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\r\u0010\u0019R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/compose/material/ripple/b;", "Landroid/graphics/drawable/RippleDrawable;", "", "bounded", "<init>", "(Z)V", "LV0/q0;", "color", "", "alpha", "a", "(JF)J", "", "b", "(JF)V", "isProjected", "()Z", "Landroid/graphics/Rect;", "getDirtyBounds", "()Landroid/graphics/Rect;", "", "radius", "c", "(I)V", "Z", "LV0/q0;", "rippleColor", "Ljava/lang/Integer;", "rippleRadius", "d", "projected", "e", "material-ripple_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class b extends RippleDrawable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean bounded;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private C5346q0 rippleColor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Integer rippleRadius;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean projected;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/material/ripple/b$b;", "", "<init>", "()V", "Landroid/graphics/drawable/RippleDrawable;", "ripple", "", "radius", "", "a", "(Landroid/graphics/drawable/RippleDrawable;I)V", "material-ripple_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.material.ripple.b$b, reason: collision with other inner class name */
    private static final class C1037b {

        /* renamed from: a, reason: collision with root package name */
        public static final C1037b f49877a = new C1037b();

        private C1037b() {
        }

        public final void a(RippleDrawable ripple, int radius) {
            ripple.setRadius(radius);
        }
    }

    public b(boolean z10) {
        super(ColorStateList.valueOf(-16777216), null, z10 ? new ColorDrawable(-1) : null);
        this.bounded = z10;
    }

    private final long a(long color, float alpha) {
        if (Build.VERSION.SDK_INT < 28) {
            alpha *= 2;
        }
        return C5346q0.q(color, RangesKt.j(alpha, 1.0f), 0.0f, 0.0f, 0.0f, 14, null);
    }

    public final void c(int radius) {
        Integer num = this.rippleRadius;
        if (num != null && num.intValue() == radius) {
            return;
        }
        this.rippleRadius = Integer.valueOf(radius);
        C1037b.f49877a.a(this, radius);
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        if (!this.bounded) {
            this.projected = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.projected = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public boolean isProjected() {
        return this.projected;
    }

    public final void b(long color, float alpha) {
        boolean zS;
        long jA = a(color, alpha);
        C5346q0 c5346q0 = this.rippleColor;
        if (c5346q0 == null) {
            zS = false;
        } else {
            zS = C5346q0.s(c5346q0.getValue(), jA);
        }
        if (!zS) {
            this.rippleColor = C5346q0.m(jA);
            setColor(ColorStateList.valueOf(C5349s0.j(jA)));
        }
    }
}
