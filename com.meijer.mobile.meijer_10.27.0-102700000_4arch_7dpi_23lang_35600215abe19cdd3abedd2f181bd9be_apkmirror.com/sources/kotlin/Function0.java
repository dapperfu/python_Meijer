package kotlin;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.J0;
import androidx.compose.ui.layout.C5795w;
import androidx.compose.ui.layout.I;
import androidx.compose.ui.layout.J;
import androidx.compose.ui.layout.K;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.f0;
import java.util.Iterator;
import java.util.List;
import kotlin.Function0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a=\u0010\b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/Function0;", "", "quantityInput", "inlineNotification", "", "shouldShowNotification", "LH1/h;", "marginBetweenBoth", "b", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLandroidx/compose/runtime/Composer;II)V", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Ki.p, reason: from Kotlin metadata */
/* loaded from: classes7.dex */
public final class Function0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Ki.p$a */
    static final class a implements MeasurePolicy {

        /* renamed from: a, reason: collision with root package name */
        public static final a f17162a = new a();

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit b(f0 f0Var, f0 f0Var2, f0 f0Var3, f0.a layout) {
            f0.a aVar;
            Intrinsics.j(layout, "$this$layout");
            int iJ0 = 0;
            if (f0Var != null) {
                f0.a.l(layout, f0Var, 0, 0, 0.0f, 4, null);
                aVar = layout;
                iJ0 = f0Var.J0();
            } else {
                aVar = layout;
            }
            int iJ02 = iJ0;
            if (f0Var2 != null) {
                f0.a.l(aVar, f0Var2, 0, iJ02, 0.0f, 4, null);
                iJ02 += f0Var2.J0();
            }
            if (f0Var3 != null) {
                f0.a.l(aVar, f0Var3, 0, iJ02, 0.0f, 4, null);
            }
            return Unit.f142422a;
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final J d(K Layout, List<? extends I> measurables, long j10) {
            final f0 f0Var;
            Object next;
            int iJ0;
            int iM0;
            final f0 f0Var2;
            Object next2;
            final f0 f0Var3;
            Object next3;
            int i10;
            f0 f0VarK0;
            f0 f0VarK02;
            Intrinsics.j(Layout, "$this$Layout");
            Intrinsics.j(measurables, "measurables");
            List<? extends I> list = measurables;
            Iterator<T> it = list.iterator();
            while (true) {
                f0Var = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.e(C5795w.a((I) next), "QuantityInput")) {
                    break;
                }
            }
            I i11 = (I) next;
            if (i11 == null || (f0VarK02 = i11.k0(j10)) == null) {
                iJ0 = 0;
                iM0 = 0;
                f0Var2 = null;
            } else {
                iJ0 = f0VarK02.J0();
                iM0 = f0VarK02.M0();
                f0Var2 = f0VarK02;
            }
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                if (Intrinsics.e(C5795w.a((I) next2), "Margin")) {
                    break;
                }
            }
            I i12 = (I) next2;
            if (i12 == null || (f0VarK0 = i12.k0(j10)) == null) {
                f0Var3 = null;
            } else {
                iJ0 += f0VarK0.J0();
                f0Var3 = f0VarK0;
            }
            int iJ02 = iJ0;
            Iterator<T> it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it3.next();
                if (Intrinsics.e(C5795w.a((I) next3), "InlineNotification")) {
                    break;
                }
            }
            I i13 = (I) next3;
            if (i13 != null) {
                i10 = iM0;
                f0 f0VarK03 = i13.k0(H1.b.d(j10, i10, i10, 0, 0, 12, null));
                if (f0VarK03 != null) {
                    iJ02 += f0VarK03.J0();
                    f0Var = f0VarK03;
                }
            } else {
                i10 = iM0;
            }
            return K.G0(Layout, i10, iJ02, null, new Function1() { // from class: Ki.o
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Function0.a.b(f0Var2, f0Var3, f0Var, (f0.a) obj);
                }
            }, 4, null);
        }

        a() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r18, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r19, final boolean r20, float r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 627
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.Function0.b(kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(Function2 function2, Function2 function22, boolean z10, float f10, int i10, int i11, Composer composer, int i12) {
        b(function2, function22, z10, f10, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
