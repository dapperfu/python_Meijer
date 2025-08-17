package v1;

import android.graphics.RectF;
import android.text.Layout;
import android.text.SegmentFinder;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import w1.C17741a;
import w1.C17750j;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\nH\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lv1/f;", "", "<init>", "()V", "Lv1/o0;", "layout", "Landroid/graphics/RectF;", "rectF", "", "granularity", "Lkotlin/Function2;", "", "inclusionStrategy", "", "c", "(Lv1/o0;Landroid/graphics/RectF;ILkotlin/jvm/functions/Function2;)[I", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: v1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17465f {

    /* renamed from: a, reason: collision with root package name */
    public static final C17465f f164358a = new C17465f();

    public final int[] c(o0 layout, RectF rectF, int granularity, final Function2<? super RectF, ? super RectF, Boolean> inclusionStrategy) {
        SegmentFinder segmentFinderA;
        if (granularity == 1) {
            segmentFinderA = C17741a.f165637a.a(new C17750j(layout.G(), layout.I()));
        } else {
            C17461b.a();
            segmentFinderA = C17462c.a(C17460a.a(layout.G(), layout.getTextPaint()));
        }
        return layout.getLayout().getRangeForRect(rectF, segmentFinderA, new Layout.TextInclusionStrategy() { // from class: v1.e
            @Override // android.text.Layout.TextInclusionStrategy
            public final boolean isSegmentInside(RectF rectF2, RectF rectF3) {
                return C17465f.b(inclusionStrategy, rectF2, rectF3);
            }
        });
    }

    private C17465f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(Function2 function2, RectF rectF, RectF rectF2) {
        return ((Boolean) function2.invoke(rectF, rectF2)).booleanValue();
    }
}
