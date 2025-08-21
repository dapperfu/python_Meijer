package l6;

import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Typeface;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import w6.C17848d;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\u0006R \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR \u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000bR \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000bR \u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000bR \u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u000bR$\u0010\u001a\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00180\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u000bR \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u000bR \u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u000bR \u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u000bR \u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u000b¨\u0006'"}, d2 = {"Ll6/n;", "", "Lcom/airbnb/lottie/o;", "drawable", "", "a", "(Lcom/airbnb/lottie/o;)V", "b", "", "Ll6/p;", "", "Ljava/util/List;", "intProperties", "Landroid/graphics/PointF;", "pointFProperties", "", "c", "floatProperties", "Lw6/d;", "d", "scaleProperties", "Landroid/graphics/ColorFilter;", "e", "colorFilterProperties", "", "f", "intArrayProperties", "Landroid/graphics/Typeface;", "g", "typefaceProperties", "Landroid/graphics/Bitmap;", "h", "bitmapProperties", "", "i", "charSequenceProperties", "Landroid/graphics/Path;", "j", "pathProperties", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<p<Integer>> intProperties;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<p<PointF>> pointFProperties;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<p<Float>> floatProperties;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<p<C17848d>> scaleProperties;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List<p<ColorFilter>> colorFilterProperties;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List<p<Object[]>> intArrayProperties;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final List<p<Typeface>> typefaceProperties;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final List<p<Bitmap>> bitmapProperties;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final List<p<CharSequence>> charSequenceProperties;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final List<p<Path>> pathProperties;

    public final void a(com.airbnb.lottie.o drawable) {
        Intrinsics.j(drawable, "drawable");
        Iterator<T> it = this.intProperties.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            drawable.q(pVar.getKeyPath(), pVar.c(), o.b(pVar.a()));
        }
        Iterator<T> it2 = this.pointFProperties.iterator();
        while (it2.hasNext()) {
            p pVar2 = (p) it2.next();
            drawable.q(pVar2.getKeyPath(), pVar2.c(), o.b(pVar2.a()));
        }
        Iterator<T> it3 = this.floatProperties.iterator();
        while (it3.hasNext()) {
            p pVar3 = (p) it3.next();
            drawable.q(pVar3.getKeyPath(), pVar3.c(), o.b(pVar3.a()));
        }
        Iterator<T> it4 = this.scaleProperties.iterator();
        while (it4.hasNext()) {
            p pVar4 = (p) it4.next();
            drawable.q(pVar4.getKeyPath(), pVar4.c(), o.b(pVar4.a()));
        }
        Iterator<T> it5 = this.colorFilterProperties.iterator();
        while (it5.hasNext()) {
            p pVar5 = (p) it5.next();
            drawable.q(pVar5.getKeyPath(), pVar5.c(), o.b(pVar5.a()));
        }
        Iterator<T> it6 = this.intArrayProperties.iterator();
        while (it6.hasNext()) {
            p pVar6 = (p) it6.next();
            drawable.q(pVar6.getKeyPath(), pVar6.c(), o.b(pVar6.a()));
        }
        Iterator<T> it7 = this.typefaceProperties.iterator();
        while (it7.hasNext()) {
            p pVar7 = (p) it7.next();
            drawable.q(pVar7.getKeyPath(), pVar7.c(), o.b(pVar7.a()));
        }
        Iterator<T> it8 = this.bitmapProperties.iterator();
        while (it8.hasNext()) {
            p pVar8 = (p) it8.next();
            drawable.q(pVar8.getKeyPath(), pVar8.c(), o.b(pVar8.a()));
        }
        Iterator<T> it9 = this.charSequenceProperties.iterator();
        while (it9.hasNext()) {
            p pVar9 = (p) it9.next();
            drawable.q(pVar9.getKeyPath(), pVar9.c(), o.b(pVar9.a()));
        }
        Iterator<T> it10 = this.pathProperties.iterator();
        while (it10.hasNext()) {
            p pVar10 = (p) it10.next();
            drawable.q(pVar10.getKeyPath(), pVar10.c(), o.b(pVar10.a()));
        }
    }

    public final void b(com.airbnb.lottie.o drawable) {
        Intrinsics.j(drawable, "drawable");
        Iterator<T> it = this.intProperties.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            drawable.q(pVar.getKeyPath(), pVar.c(), null);
        }
        Iterator<T> it2 = this.pointFProperties.iterator();
        while (it2.hasNext()) {
            p pVar2 = (p) it2.next();
            drawable.q(pVar2.getKeyPath(), pVar2.c(), null);
        }
        Iterator<T> it3 = this.floatProperties.iterator();
        while (it3.hasNext()) {
            p pVar3 = (p) it3.next();
            drawable.q(pVar3.getKeyPath(), pVar3.c(), null);
        }
        Iterator<T> it4 = this.scaleProperties.iterator();
        while (it4.hasNext()) {
            p pVar4 = (p) it4.next();
            drawable.q(pVar4.getKeyPath(), pVar4.c(), null);
        }
        Iterator<T> it5 = this.colorFilterProperties.iterator();
        while (it5.hasNext()) {
            p pVar5 = (p) it5.next();
            drawable.q(pVar5.getKeyPath(), pVar5.c(), null);
        }
        Iterator<T> it6 = this.intArrayProperties.iterator();
        while (it6.hasNext()) {
            p pVar6 = (p) it6.next();
            drawable.q(pVar6.getKeyPath(), pVar6.c(), null);
        }
        Iterator<T> it7 = this.typefaceProperties.iterator();
        while (it7.hasNext()) {
            p pVar7 = (p) it7.next();
            drawable.q(pVar7.getKeyPath(), pVar7.c(), null);
        }
        Iterator<T> it8 = this.bitmapProperties.iterator();
        while (it8.hasNext()) {
            p pVar8 = (p) it8.next();
            drawable.q(pVar8.getKeyPath(), pVar8.c(), null);
        }
        Iterator<T> it9 = this.charSequenceProperties.iterator();
        while (it9.hasNext()) {
            p pVar9 = (p) it9.next();
            drawable.q(pVar9.getKeyPath(), pVar9.c(), null);
        }
        Iterator<T> it10 = this.pathProperties.iterator();
        while (it10.hasNext()) {
            p pVar10 = (p) it10.next();
            drawable.q(pVar10.getKeyPath(), pVar10.c(), null);
        }
    }
}
