package Mm;

import Ji.LocalThemeScope;
import X0.Stroke;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import com.meijer.mobile.meijer.activity.find.model.ChartData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C6313a;
import kotlin.C6330m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a3\u0010\t\u001a\u00020\b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "Lcom/meijer/mobile/meijer/activity/find/model/ChartData;", "savingsList", "", "totalSaving", "", "d", "(LJi/M;Landroidx/compose/ui/Modifier;Ljava/util/List;DLandroidx/compose/runtime/Composer;II)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class A {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.digitalreceipts.compose.digitalreceipts.SavingChartSmallKt$SavingsChartSmall$1$1", f = "SavingChartSmall.kt", l = {68, 79}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f19740a;

        /* renamed from: b, reason: collision with root package name */
        Object f19741b;

        /* renamed from: c, reason: collision with root package name */
        Object f19742c;

        /* renamed from: d, reason: collision with root package name */
        Object f19743d;

        /* renamed from: e, reason: collision with root package name */
        Object f19744e;

        /* renamed from: f, reason: collision with root package name */
        Object f19745f;

        /* renamed from: g, reason: collision with root package name */
        int f19746g;

        /* renamed from: h, reason: collision with root package name */
        int f19747h;

        /* renamed from: i, reason: collision with root package name */
        int f19748i;

        /* renamed from: j, reason: collision with root package name */
        int f19749j;

        /* renamed from: k, reason: collision with root package name */
        int f19750k;

        /* renamed from: l, reason: collision with root package name */
        float f19751l;

        /* renamed from: m, reason: collision with root package name */
        int f19752m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ double f19753n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ List<C6313a<Float, C6330m>> f19754o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ List<ChartData> f19755p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(double d10, List<C6313a<Float, C6330m>> list, List<ChartData> list2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f19753n = d10;
            this.f19754o = list;
            this.f19755p = list2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f19753n, this.f19754o, this.f19755p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0098  */
        /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Iterable] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0100 -> B:25:0x0101). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 268
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: Mm.A.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02eb A[LOOP:0: B:132:0x02e5->B:134:0x02eb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final Ji.LocalThemeScope r24, androidx.compose.ui.Modifier r25, final java.util.List<com.meijer.mobile.meijer.activity.find.model.ChartData> r26, final double r27, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 865
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Mm.A.d(Ji.M, androidx.compose.ui.Modifier, java.util.List, double, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(double d10, List list, LocalThemeScope localThemeScope, List list2, X0.f Canvas) {
        Intrinsics.j(Canvas, "$this$Canvas");
        if (d10 == 0.0d) {
            X0.f.k1(Canvas, localThemeScope.getAdsColors().getAdsColorPlaceholder().getColor(), 0.0f, ((Number) ((C6313a) CollectionsKt.s0(list)).m()).floatValue(), false, 0L, 0L, 0.0f, new Stroke(25.0f, 0.0f, 0, 0, null, 30, null), null, 0, 880, null);
        } else {
            List list3 = list2;
            ArrayList arrayList = new ArrayList(CollectionsKt.x(list3, 10));
            Iterator it = list3.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.w();
                }
                Iterator it2 = it;
                ArrayList arrayList2 = arrayList;
                X0.f.k1(Canvas, Tm.g.a(localThemeScope, ((ChartData) next).getType()).getColor(), r3.getStartAngle(), ((Number) ((C6313a) list.get(i10)).m()).floatValue(), false, 0L, 0L, 0.0f, new Stroke(20.0f, 0.0f, 0, 0, null, 30, null), null, 0, 880, null);
                arrayList2.add(Unit.f142422a);
                arrayList = arrayList2;
                i10 = i11;
                it = it2;
            }
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.w(semantics);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, Modifier modifier, List list, double d10, int i10, int i11, Composer composer, int i12) {
        d(localThemeScope, modifier, list, d10, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
