package androidx.compose.ui.layout;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\bç\u0080\u0001\u0018\u00002\u00020\u0001J2\u0010\t\u001a\u00020\b*\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00032\u0006\u0010\u0007\u001a\u00020\u0006H&ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ/\u0010\u000f\u001a\u00020\r*\u00020\u000b2\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00030\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0012\u001a\u00020\r*\u00020\u000b2\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00030\u00032\u0006\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J/\u0010\u0013\u001a\u00020\r*\u00020\u000b2\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00030\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J/\u0010\u0014\u001a\u00020\r*\u00020\u000b2\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00030\u00032\u0006\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0010ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/N;", "", "Landroidx/compose/ui/layout/K;", "", "Landroidx/compose/ui/layout/I;", "measurables", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "d", "(Landroidx/compose/ui/layout/K;Ljava/util/List;J)Landroidx/compose/ui/layout/J;", "Landroidx/compose/ui/layout/s;", "Landroidx/compose/ui/layout/r;", "", "height", "i", "(Landroidx/compose/ui/layout/s;Ljava/util/List;I)I", "width", "g", "e", "j", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public interface N {
    J d(K k10, List<? extends List<? extends I>> list, long j10);

    default int e(InterfaceC5791s interfaceC5791s, List<? extends List<? extends r>> list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            List<? extends r> list2 = list.get(i11);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList2.add(new C5786m(list2.get(i12), EnumC5792t.f51144b, EnumC5793u.f51147a));
            }
            arrayList.add(arrayList2);
        }
        return d(new C5794v(interfaceC5791s, interfaceC5791s.getLayoutDirection()), arrayList, H1.c.b(0, 0, 0, i10, 7, null)).getF51153a();
    }

    default int g(InterfaceC5791s interfaceC5791s, List<? extends List<? extends r>> list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            List<? extends r> list2 = list.get(i11);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList2.add(new C5786m(list2.get(i12), EnumC5792t.f51143a, EnumC5793u.f51148b));
            }
            arrayList.add(arrayList2);
        }
        return d(new C5794v(interfaceC5791s, interfaceC5791s.getLayoutDirection()), arrayList, H1.c.b(0, i10, 0, 0, 13, null)).getF51154b();
    }

    default int i(InterfaceC5791s interfaceC5791s, List<? extends List<? extends r>> list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            List<? extends r> list2 = list.get(i11);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList2.add(new C5786m(list2.get(i12), EnumC5792t.f51143a, EnumC5793u.f51147a));
            }
            arrayList.add(arrayList2);
        }
        return d(new C5794v(interfaceC5791s, interfaceC5791s.getLayoutDirection()), arrayList, H1.c.b(0, 0, 0, i10, 7, null)).getF51153a();
    }

    default int j(InterfaceC5791s interfaceC5791s, List<? extends List<? extends r>> list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            List<? extends r> list2 = list.get(i11);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList2.add(new C5786m(list2.get(i12), EnumC5792t.f51144b, EnumC5793u.f51148b));
            }
            arrayList.add(arrayList2);
        }
        return d(new C5794v(interfaceC5791s, interfaceC5791s.getLayoutDirection()), arrayList, H1.c.b(0, i10, 0, 0, 13, null)).getF51154b();
    }
}
