package androidx.compose.ui.window;

import androidx.compose.ui.layout.I;
import androidx.compose.ui.layout.J;
import androidx.compose.ui.layout.K;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.f0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/K;", "", "Landroidx/compose/ui/layout/I;", "measurables", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "d", "(Landroidx/compose/ui/layout/K;Ljava/util/List;J)Landroidx/compose/ui/layout/J;"}, k = 3, mv = {1, 9, 0})
@SourceDebugExtension
/* loaded from: classes.dex */
public final class c implements MeasurePolicy {

    /* renamed from: a, reason: collision with root package name */
    public static final c f52919a = new c();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
    public static final class a extends Lambda implements Function1<f0.a, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f52920f = new a();

        public a() {
            super(1);
        }

        public final void a(f0.a aVar) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
            a(aVar);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
    public static final class b extends Lambda implements Function1<f0.a, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ f0 f52921f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f0 f0Var) {
            super(1);
            this.f52921f = f0Var;
        }

        public final void a(f0.a aVar) {
            f0.a.l(aVar, this.f52921f, 0, 0, 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
            a(aVar);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.window.c$c, reason: collision with other inner class name */
    public static final class C1085c extends Lambda implements Function1<f0.a, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List<f0> f52922f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C1085c(List<? extends f0> list) {
            super(1);
            this.f52922f = list;
        }

        public final void a(f0.a aVar) {
            int iO = CollectionsKt.o(this.f52922f);
            if (iO < 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                f0.a aVar2 = aVar;
                f0.a.l(aVar2, this.f52922f.get(i10), 0, 0, 0.0f, 4, null);
                if (i10 == iO) {
                    return;
                }
                i10++;
                aVar = aVar2;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
            a(aVar);
            return Unit.f142422a;
        }
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final J d(K k10, List<? extends I> list, long j10) {
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                int iMax = 0;
                int iMax2 = 0;
                for (int i10 = 0; i10 < size2; i10++) {
                    f0 f0VarK0 = list.get(i10).k0(j10);
                    iMax = Math.max(iMax, f0VarK0.getWidth());
                    iMax2 = Math.max(iMax2, f0VarK0.getHeight());
                    arrayList.add(f0VarK0);
                }
                return K.G0(k10, iMax, iMax2, null, new C1085c(arrayList), 4, null);
            }
            f0 f0VarK02 = list.get(0).k0(j10);
            return K.G0(k10, f0VarK02.getWidth(), f0VarK02.getHeight(), null, new b(f0VarK02), 4, null);
        }
        return K.G0(k10, 0, 0, null, a.f52920f, 4, null);
    }
}
