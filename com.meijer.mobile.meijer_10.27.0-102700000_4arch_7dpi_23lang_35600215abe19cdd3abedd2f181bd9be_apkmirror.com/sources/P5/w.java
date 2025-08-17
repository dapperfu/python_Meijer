package P5;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    private static final d f24816a = new d("{{", "}}");

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f24817a;

        static {
            int[] iArr = new int[u.values().length];
            f24817a = iArr;
            try {
                iArr[u.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24817a[u.TEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24817a[u.TAG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static List<r> a(String str) {
        return b(str, f24816a);
    }

    static List<r> b(String str, d dVar) {
        int iIndexOf;
        ArrayList arrayList = new ArrayList();
        if (str != null && !str.isEmpty()) {
            if (dVar == null) {
                dVar = f24816a;
            }
            int length = str.length();
            int i10 = 0;
            n nVar = new n(0, u.START);
            while (i10 < length) {
                int i11 = a.f24817a[nVar.f24794b.ordinal()];
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3 && str.substring(i10).startsWith(dVar.a())) {
                            arrayList.add(new t(str.substring(nVar.f24793a + dVar.b(), i10)));
                            nVar.f24794b = u.START;
                            iIndexOf = str.indexOf(dVar.a(), i10);
                            i10 = iIndexOf + 1;
                        }
                    } else if (str.substring(i10).startsWith(dVar.c())) {
                        int i12 = nVar.f24793a;
                        if (i12 != i10) {
                            arrayList.add(new s(str.substring(i12, i10)));
                        }
                        nVar.a(i10, u.TAG);
                        iIndexOf = str.indexOf(dVar.c(), i10);
                        i10 = iIndexOf + 1;
                    }
                } else if (str.substring(i10).startsWith(dVar.c())) {
                    nVar.a(i10, u.TAG);
                    iIndexOf = str.indexOf(dVar.c(), i10);
                    i10 = iIndexOf + 1;
                } else {
                    nVar.a(i10, u.TEXT);
                }
                i10++;
            }
            int i13 = a.f24817a[nVar.f24794b.ordinal()];
            if (i13 == 2) {
                arrayList.add(new s(str.substring(nVar.f24793a, i10)));
            } else if (i13 == 3) {
                return new ArrayList();
            }
        }
        return arrayList;
    }
}
