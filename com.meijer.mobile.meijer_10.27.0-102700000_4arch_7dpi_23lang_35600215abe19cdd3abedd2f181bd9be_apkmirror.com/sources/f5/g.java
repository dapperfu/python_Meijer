package f5;

import android.graphics.drawable.Drawable;
import c5.EnumC6361g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0011\u0010\u0019¨\u0006\u001a"}, d2 = {"Lf5/g;", "Lf5/h;", "Landroid/graphics/drawable/Drawable;", "drawable", "", "isSampled", "Lc5/g;", "dataSource", "<init>", "(Landroid/graphics/drawable/Drawable;ZLc5/g;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Landroid/graphics/drawable/Drawable;", "b", "()Landroid/graphics/drawable/Drawable;", "Z", "c", "()Z", "Lc5/g;", "()Lc5/g;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g extends h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Drawable drawable;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isSampled;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final EnumC6361g dataSource;

    public g(Drawable drawable, boolean z10, EnumC6361g enumC6361g) {
        super(null);
        this.drawable = drawable;
        this.isSampled = z10;
        this.dataSource = enumC6361g;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof g)) {
            return false;
        }
        g gVar = (g) other;
        return Intrinsics.e(this.drawable, gVar.drawable) && this.isSampled == gVar.isSampled && this.dataSource == gVar.dataSource;
    }

    /* renamed from: a, reason: from getter */
    public final EnumC6361g getDataSource() {
        return this.dataSource;
    }

    /* renamed from: b, reason: from getter */
    public final Drawable getDrawable() {
        return this.drawable;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getIsSampled() {
        return this.isSampled;
    }

    public int hashCode() {
        return (((this.drawable.hashCode() * 31) + Boolean.hashCode(this.isSampled)) * 31) + this.dataSource.hashCode();
    }
}
