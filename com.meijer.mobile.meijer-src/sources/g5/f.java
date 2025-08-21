package g5;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import d5.EnumC13623g;
import g5.i;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;
import m5.C15673l;
import r5.C16846j;
import r5.C16849m;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lg5/f;", "Lg5/i;", "Landroid/graphics/drawable/Drawable;", "data", "Lm5/l;", "options", "<init>", "(Landroid/graphics/drawable/Drawable;Lm5/l;)V", "Lg5/h;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/graphics/drawable/Drawable;", "b", "Lm5/l;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class f implements i {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Drawable data;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C15673l options;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lg5/f$a;", "Lg5/i$a;", "Landroid/graphics/drawable/Drawable;", "<init>", "()V", "data", "Lm5/l;", "options", "La5/h;", "imageLoader", "Lg5/i;", "b", "(Landroid/graphics/drawable/Drawable;Lm5/l;La5/h;)Lg5/i;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements i.a<Drawable> {
        @Override // g5.i.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(Drawable data, C15673l options, a5.h imageLoader) {
            return new f(data, options);
        }
    }

    @Override // g5.i
    public Object a(Continuation<? super h> continuation) {
        Drawable bitmapDrawable;
        boolean zV = C16846j.v(this.data);
        if (zV) {
            bitmapDrawable = new BitmapDrawable(this.options.getContext().getResources(), C16849m.f159240a.a(this.data, this.options.getConfig(), this.options.getSize(), this.options.getScale(), this.options.getAllowInexactSize()));
        } else {
            bitmapDrawable = this.data;
        }
        return new g(bitmapDrawable, zV, EnumC13623g.f128046b);
    }

    public f(Drawable drawable, C15673l c15673l) {
        this.data = drawable;
        this.options = c15673l;
    }
}
