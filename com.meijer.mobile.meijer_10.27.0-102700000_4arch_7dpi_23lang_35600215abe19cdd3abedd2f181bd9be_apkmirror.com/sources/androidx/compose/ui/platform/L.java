package androidx.compose.ui.platform;

import V0.C5331k1;
import android.view.View;
import android.view.ViewParent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001e\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a.\u0010\t\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0000H\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a2\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001b\u0010\u0014\u001a\u00020\u0013*\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0016*\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\".\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a0\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"LV0/k1;", "other", "", "i", "([F[F)V", "", "x", "y", "tmpMatrix", "j", "([FFF[F)V", "m1", "", "row", "m2", "column", "f", "([FI[FI)F", "Landroid/view/View;", "", "e", "(Landroid/view/View;Landroid/view/View;)Z", "Ln1/d;", "g", "(Landroid/view/View;)Ln1/d;", "Lkotlin/Function1;", "Lz1/I;", "a", "Lkotlin/jvm/functions/Function1;", "h", "()Lkotlin/jvm/functions/Function1;", "setPlatformTextInputServiceInterceptor", "(Lkotlin/jvm/functions/Function1;)V", "platformTextInputServiceInterceptor", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    private static Function1<? super z1.I, ? extends z1.I> f51837a = a.f51838f;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz1/I;", "it", "a", "(Lz1/I;)Lz1/I;"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function1<z1.I, z1.I> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f51838f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final z1.I invoke(z1.I i10) {
            return i10;
        }
    }

    private static final float f(float[] fArr, int i10, float[] fArr2, int i11) {
        int i12 = i10 * 4;
        return (fArr[i12] * fArr2[i11]) + (fArr[i12 + 1] * fArr2[4 + i11]) + (fArr[i12 + 2] * fArr2[8 + i11]) + (fArr[i12 + 3] * fArr2[12 + i11]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n1.d g(View view) {
        n1.e.c(view, 1);
        return n1.e.b(view);
    }

    public static final Function1<z1.I, z1.I> h() {
        return f51837a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(float[] fArr, float[] fArr2) {
        float f10 = f(fArr2, 0, fArr, 0);
        float f11 = f(fArr2, 0, fArr, 1);
        float f12 = f(fArr2, 0, fArr, 2);
        float f13 = f(fArr2, 0, fArr, 3);
        float f14 = f(fArr2, 1, fArr, 0);
        float f15 = f(fArr2, 1, fArr, 1);
        float f16 = f(fArr2, 1, fArr, 2);
        float f17 = f(fArr2, 1, fArr, 3);
        float f18 = f(fArr2, 2, fArr, 0);
        float f19 = f(fArr2, 2, fArr, 1);
        float f20 = f(fArr2, 2, fArr, 2);
        float f21 = f(fArr2, 2, fArr, 3);
        float f22 = f(fArr2, 3, fArr, 0);
        float f23 = f(fArr2, 3, fArr, 1);
        float f24 = f(fArr2, 3, fArr, 2);
        float f25 = f(fArr2, 3, fArr, 3);
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[2] = f12;
        fArr[3] = f13;
        fArr[4] = f14;
        fArr[5] = f15;
        fArr[6] = f16;
        fArr[7] = f17;
        fArr[8] = f18;
        fArr[9] = f19;
        fArr[10] = f20;
        fArr[11] = f21;
        fArr[12] = f22;
        fArr[13] = f23;
        fArr[14] = f24;
        fArr[15] = f25;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(View view, View view2) {
        if (Intrinsics.e(view2, view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(float[] fArr, float f10, float f11, float[] fArr2) {
        C5331k1.h(fArr2);
        C5331k1.o(fArr2, f10, f11, 0.0f, 4, null);
        i(fArr, fArr2);
    }
}
