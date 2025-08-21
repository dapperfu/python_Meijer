package androidx.compose.ui.layout;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bç\u0080\u0001\u0018\u00002\u00020\u0001J)\u0010\b\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000b\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\tJ)\u0010\f\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\tJ)\u0010\r\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\tJ,\u0010\u0013\u001a\u00020\u0012*\u00020\u000e2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\u0006\u0010\u0011\u001a\u00020\u0010H&ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/MeasurePolicy;", "", "Landroidx/compose/ui/layout/s;", "", "Landroidx/compose/ui/layout/r;", "measurables", "", "height", "i", "(Landroidx/compose/ui/layout/s;Ljava/util/List;I)I", "width", "g", "e", "j", "Landroidx/compose/ui/layout/K;", "Landroidx/compose/ui/layout/I;", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "measure", "(Landroidx/compose/ui/layout/K;Ljava/util/List;LH1/b;)Landroidx/compose/ui/layout/J;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public interface MeasurePolicy {
    J d(K k10, List<? extends I> list, long j10);

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        @Deprecated
        public static int a(MeasurePolicy measurePolicy, InterfaceC5933s interfaceC5933s, List<? extends r> list, int i10) {
            return MeasurePolicy.super.j(interfaceC5933s, list, i10);
        }

        @Deprecated
        public static int b(MeasurePolicy measurePolicy, InterfaceC5933s interfaceC5933s, List<? extends r> list, int i10) {
            return MeasurePolicy.super.e(interfaceC5933s, list, i10);
        }

        @Deprecated
        public static int c(MeasurePolicy measurePolicy, InterfaceC5933s interfaceC5933s, List<? extends r> list, int i10) {
            return MeasurePolicy.super.g(interfaceC5933s, list, i10);
        }

        @Deprecated
        public static int d(MeasurePolicy measurePolicy, InterfaceC5933s interfaceC5933s, List<? extends r> list, int i10) {
            return MeasurePolicy.super.i(interfaceC5933s, list, i10);
        }
    }

    default int e(InterfaceC5933s interfaceC5933s, List<? extends r> list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new C5928m(list.get(i11), EnumC5934t.f51368b, EnumC5935u.f51371a));
        }
        return d(new C5936v(interfaceC5933s, interfaceC5933s.getLayoutDirection()), arrayList, H1.c.b(0, 0, 0, i10, 7, null)).getF51377a();
    }

    default int g(InterfaceC5933s interfaceC5933s, List<? extends r> list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new C5928m(list.get(i11), EnumC5934t.f51367a, EnumC5935u.f51372b));
        }
        return d(new C5936v(interfaceC5933s, interfaceC5933s.getLayoutDirection()), arrayList, H1.c.b(0, i10, 0, 0, 13, null)).getF51378b();
    }

    default int i(InterfaceC5933s interfaceC5933s, List<? extends r> list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new C5928m(list.get(i11), EnumC5934t.f51367a, EnumC5935u.f51371a));
        }
        return d(new C5936v(interfaceC5933s, interfaceC5933s.getLayoutDirection()), arrayList, H1.c.b(0, 0, 0, i10, 7, null)).getF51377a();
    }

    default int j(InterfaceC5933s interfaceC5933s, List<? extends r> list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new C5928m(list.get(i11), EnumC5934t.f51368b, EnumC5935u.f51372b));
        }
        return d(new C5936v(interfaceC5933s, interfaceC5933s.getLayoutDirection()), arrayList, H1.c.b(0, i10, 0, 0, 13, null)).getF51378b();
    }
}
