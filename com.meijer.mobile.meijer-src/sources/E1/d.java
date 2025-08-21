package E1;

import V0.F1;
import V0.G1;
import android.graphics.Paint;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0016\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0016\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\b"}, d2 = {"LV0/G1;", "Landroid/graphics/Paint$Join;", "b", "(I)Landroid/graphics/Paint$Join;", "LV0/F1;", "Landroid/graphics/Paint$Cap;", "a", "(I)Landroid/graphics/Paint$Cap;", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d {
    public static final Paint.Cap a(int i10) {
        F1.Companion companion = F1.INSTANCE;
        return F1.e(i10, companion.a()) ? Paint.Cap.BUTT : F1.e(i10, companion.b()) ? Paint.Cap.ROUND : F1.e(i10, companion.c()) ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
    }

    public static final Paint.Join b(int i10) {
        G1.Companion companion = G1.INSTANCE;
        return G1.e(i10, companion.b()) ? Paint.Join.MITER : G1.e(i10, companion.c()) ? Paint.Join.ROUND : G1.e(i10, companion.a()) ? Paint.Join.BEVEL : Paint.Join.MITER;
    }
}
