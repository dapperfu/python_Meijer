package kotlin;

import java.util.ArrayList;
import java.util.List;
import kotlin.FontWeight;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"Ly1/v;", "", "<init>", "()V", "", "Ly1/k;", "fontList", "Ly1/B;", "fontWeight", "Ly1/w;", "fontStyle", "a", "(Ljava/util/List;Ly1/B;I)Ljava/util/List;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: y1.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C18279v {
    public final List<InterfaceC18268k> a(List<? extends InterfaceC18268k> fontList, FontWeight fontWeight, int fontStyle) {
        ArrayList arrayList = new ArrayList(fontList.size());
        List<? extends InterfaceC18268k> list = fontList;
        int size = list.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            InterfaceC18268k interfaceC18268k = fontList.get(i11);
            InterfaceC18268k interfaceC18268k2 = interfaceC18268k;
            if (Intrinsics.e(interfaceC18268k2.a(), fontWeight) && C18280w.f(interfaceC18268k2.c(), fontStyle)) {
                arrayList.add(interfaceC18268k);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(fontList.size());
        int size2 = list.size();
        for (int i12 = 0; i12 < size2; i12++) {
            InterfaceC18268k interfaceC18268k3 = fontList.get(i12);
            if (C18280w.f(interfaceC18268k3.c(), fontStyle)) {
                arrayList2.add(interfaceC18268k3);
            }
        }
        if (!arrayList2.isEmpty()) {
            fontList = arrayList2;
        }
        List<? extends InterfaceC18268k> list2 = fontList;
        FontWeight.Companion companion = FontWeight.INSTANCE;
        FontWeight fontWeight2 = null;
        if (fontWeight.compareTo(companion.h()) < 0) {
            List<? extends InterfaceC18268k> list3 = list2;
            int size3 = list3.size();
            FontWeight fontWeight3 = null;
            int i13 = 0;
            while (true) {
                if (i13 >= size3) {
                    break;
                }
                FontWeight fontWeightA = list2.get(i13).a();
                if (fontWeightA.compareTo(fontWeight) >= 0) {
                    if (fontWeightA.compareTo(fontWeight) <= 0) {
                        fontWeight2 = fontWeightA;
                        fontWeight3 = fontWeight2;
                        break;
                    }
                    if (fontWeight3 == null || fontWeightA.compareTo(fontWeight3) < 0) {
                        fontWeight3 = fontWeightA;
                    }
                } else if (fontWeight2 == null || fontWeightA.compareTo(fontWeight2) > 0) {
                    fontWeight2 = fontWeightA;
                }
                i13++;
            }
            if (fontWeight2 == null) {
                fontWeight2 = fontWeight3;
            }
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size4 = list3.size();
            while (i10 < size4) {
                InterfaceC18268k interfaceC18268k4 = list2.get(i10);
                if (Intrinsics.e(interfaceC18268k4.a(), fontWeight2)) {
                    arrayList3.add(interfaceC18268k4);
                }
                i10++;
            }
            return arrayList3;
        }
        if (fontWeight.compareTo(companion.i()) > 0) {
            List<? extends InterfaceC18268k> list4 = list2;
            int size5 = list4.size();
            FontWeight fontWeight4 = null;
            int i14 = 0;
            while (true) {
                if (i14 >= size5) {
                    break;
                }
                FontWeight fontWeightA2 = list2.get(i14).a();
                if (fontWeightA2.compareTo(fontWeight) >= 0) {
                    if (fontWeightA2.compareTo(fontWeight) <= 0) {
                        fontWeight2 = fontWeightA2;
                        fontWeight4 = fontWeight2;
                        break;
                    }
                    if (fontWeight4 == null || fontWeightA2.compareTo(fontWeight4) < 0) {
                        fontWeight4 = fontWeightA2;
                    }
                } else if (fontWeight2 == null || fontWeightA2.compareTo(fontWeight2) > 0) {
                    fontWeight2 = fontWeightA2;
                }
                i14++;
            }
            if (fontWeight4 != null) {
                fontWeight2 = fontWeight4;
            }
            ArrayList arrayList4 = new ArrayList(list2.size());
            int size6 = list4.size();
            while (i10 < size6) {
                InterfaceC18268k interfaceC18268k5 = list2.get(i10);
                if (Intrinsics.e(interfaceC18268k5.a(), fontWeight2)) {
                    arrayList4.add(interfaceC18268k5);
                }
                i10++;
            }
            return arrayList4;
        }
        FontWeight fontWeightI = companion.i();
        List<? extends InterfaceC18268k> list5 = list2;
        int size7 = list5.size();
        FontWeight fontWeight5 = null;
        FontWeight fontWeight6 = null;
        int i15 = 0;
        while (true) {
            if (i15 >= size7) {
                break;
            }
            FontWeight fontWeightA3 = list2.get(i15).a();
            if (fontWeightI == null || fontWeightA3.compareTo(fontWeightI) <= 0) {
                if (fontWeightA3.compareTo(fontWeight) >= 0) {
                    if (fontWeightA3.compareTo(fontWeight) <= 0) {
                        fontWeight5 = fontWeightA3;
                        fontWeight6 = fontWeight5;
                        break;
                    }
                    if (fontWeight6 == null || fontWeightA3.compareTo(fontWeight6) < 0) {
                        fontWeight6 = fontWeightA3;
                    }
                } else if (fontWeight5 == null || fontWeightA3.compareTo(fontWeight5) > 0) {
                    fontWeight5 = fontWeightA3;
                }
            }
            i15++;
        }
        if (fontWeight6 != null) {
            fontWeight5 = fontWeight6;
        }
        ArrayList arrayList5 = new ArrayList(list2.size());
        int size8 = list5.size();
        for (int i16 = 0; i16 < size8; i16++) {
            InterfaceC18268k interfaceC18268k6 = list2.get(i16);
            if (Intrinsics.e(interfaceC18268k6.a(), fontWeight5)) {
                arrayList5.add(interfaceC18268k6);
            }
        }
        if (!arrayList5.isEmpty()) {
            return arrayList5;
        }
        FontWeight fontWeightI2 = FontWeight.INSTANCE.i();
        int size9 = list5.size();
        FontWeight fontWeight7 = null;
        int i17 = 0;
        while (true) {
            if (i17 >= size9) {
                break;
            }
            FontWeight fontWeightA4 = list2.get(i17).a();
            if (fontWeightI2 == null || fontWeightA4.compareTo(fontWeightI2) >= 0) {
                if (fontWeightA4.compareTo(fontWeight) >= 0) {
                    if (fontWeightA4.compareTo(fontWeight) <= 0) {
                        fontWeight2 = fontWeightA4;
                        fontWeight7 = fontWeight2;
                        break;
                    }
                    if (fontWeight7 == null || fontWeightA4.compareTo(fontWeight7) < 0) {
                        fontWeight7 = fontWeightA4;
                    }
                } else if (fontWeight2 == null || fontWeightA4.compareTo(fontWeight2) > 0) {
                    fontWeight2 = fontWeightA4;
                }
            }
            i17++;
        }
        if (fontWeight7 != null) {
            fontWeight2 = fontWeight7;
        }
        ArrayList arrayList6 = new ArrayList(list2.size());
        int size10 = list5.size();
        while (i10 < size10) {
            InterfaceC18268k interfaceC18268k7 = list2.get(i10);
            if (Intrinsics.e(interfaceC18268k7.a(), fontWeight2)) {
                arrayList6.add(interfaceC18268k7);
            }
            i10++;
        }
        return arrayList6;
    }
}
