package l5;

import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Ll5/f;", "Ll5/i;", "Landroid/graphics/drawable/Drawable;", "drawable", "Ll5/h;", "request", "", "throwable", "<init>", "(Landroid/graphics/drawable/Drawable;Ll5/h;Ljava/lang/Throwable;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Landroid/graphics/drawable/Drawable;", "()Landroid/graphics/drawable/Drawable;", "b", "Ll5/h;", "()Ll5/h;", "c", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: l5.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15370f extends AbstractC15373i {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Drawable drawable;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C15372h request;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Throwable throwable;

    public C15370f(Drawable drawable, C15372h c15372h, Throwable th2) {
        super(null);
        this.drawable = drawable;
        this.request = c15372h;
        this.throwable = th2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C15370f)) {
            return false;
        }
        C15370f c15370f = (C15370f) other;
        return Intrinsics.e(getDrawable(), c15370f.getDrawable()) && Intrinsics.e(getRequest(), c15370f.getRequest()) && Intrinsics.e(this.throwable, c15370f.throwable);
    }

    @Override // l5.AbstractC15373i
    /* renamed from: a, reason: from getter */
    public Drawable getDrawable() {
        return this.drawable;
    }

    @Override // l5.AbstractC15373i
    /* renamed from: b, reason: from getter */
    public C15372h getRequest() {
        return this.request;
    }

    /* renamed from: c, reason: from getter */
    public final Throwable getThrowable() {
        return this.throwable;
    }

    public int hashCode() {
        int iHashCode;
        Drawable drawable = getDrawable();
        if (drawable != null) {
            iHashCode = drawable.hashCode();
        } else {
            iHashCode = 0;
        }
        return (((iHashCode * 31) + getRequest().hashCode()) * 31) + this.throwable.hashCode();
    }
}
