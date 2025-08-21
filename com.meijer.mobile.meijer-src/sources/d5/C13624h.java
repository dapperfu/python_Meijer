package d5;

import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Ld5/h;", "", "Landroid/graphics/drawable/Drawable;", "drawable", "", "isSampled", "<init>", "(Landroid/graphics/drawable/Drawable;Z)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Landroid/graphics/drawable/Drawable;", "()Landroid/graphics/drawable/Drawable;", "b", "Z", "()Z", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: d5.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13624h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Drawable drawable;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isSampled;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C13624h)) {
            return false;
        }
        C13624h c13624h = (C13624h) other;
        return Intrinsics.e(this.drawable, c13624h.drawable) && this.isSampled == c13624h.isSampled;
    }

    /* renamed from: a, reason: from getter */
    public final Drawable getDrawable() {
        return this.drawable;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getIsSampled() {
        return this.isSampled;
    }

    public int hashCode() {
        return (this.drawable.hashCode() * 31) + Boolean.hashCode(this.isSampled);
    }

    public C13624h(Drawable drawable, boolean z10) {
        this.drawable = drawable;
        this.isSampled = z10;
    }
}
