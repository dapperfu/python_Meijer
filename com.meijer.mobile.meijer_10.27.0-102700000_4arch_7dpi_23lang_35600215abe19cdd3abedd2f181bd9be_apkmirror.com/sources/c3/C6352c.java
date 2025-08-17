package c3;

import android.os.Bundle;
import android.text.Spannable;
import android.text.Spanned;
import d3.C13466a;
import d3.P;
import java.util.ArrayList;

/* renamed from: c3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6352c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f61430a = P.y0(0);

    /* renamed from: b, reason: collision with root package name */
    private static final String f61431b = P.y0(1);

    /* renamed from: c, reason: collision with root package name */
    private static final String f61432c = P.y0(2);

    /* renamed from: d, reason: collision with root package name */
    private static final String f61433d = P.y0(3);

    /* renamed from: e, reason: collision with root package name */
    private static final String f61434e = P.y0(4);

    public static ArrayList<Bundle> a(Spanned spanned) {
        ArrayList<Bundle> arrayList = new ArrayList<>();
        for (f fVar : (f[]) spanned.getSpans(0, spanned.length(), f.class)) {
            arrayList.add(b(spanned, fVar, 1, fVar.b()));
        }
        for (h hVar : (h[]) spanned.getSpans(0, spanned.length(), h.class)) {
            arrayList.add(b(spanned, hVar, 2, hVar.b()));
        }
        for (C6353d c6353d : (C6353d[]) spanned.getSpans(0, spanned.length(), C6353d.class)) {
            arrayList.add(b(spanned, c6353d, 3, null));
        }
        for (i iVar : (i[]) spanned.getSpans(0, spanned.length(), i.class)) {
            arrayList.add(b(spanned, iVar, 4, iVar.b()));
        }
        return arrayList;
    }

    private static Bundle b(Spanned spanned, Object obj, int i10, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f61430a, spanned.getSpanStart(obj));
        bundle2.putInt(f61431b, spanned.getSpanEnd(obj));
        bundle2.putInt(f61432c, spanned.getSpanFlags(obj));
        bundle2.putInt(f61433d, i10);
        if (bundle != null) {
            bundle2.putBundle(f61434e, bundle);
        }
        return bundle2;
    }

    public static void c(Bundle bundle, Spannable spannable) {
        int i10 = bundle.getInt(f61430a);
        int i11 = bundle.getInt(f61431b);
        int i12 = bundle.getInt(f61432c);
        int i13 = bundle.getInt(f61433d, -1);
        Bundle bundle2 = bundle.getBundle(f61434e);
        if (i13 == 1) {
            spannable.setSpan(f.a((Bundle) C13466a.e(bundle2)), i10, i11, i12);
            return;
        }
        if (i13 == 2) {
            spannable.setSpan(h.a((Bundle) C13466a.e(bundle2)), i10, i11, i12);
        } else if (i13 == 3) {
            spannable.setSpan(new C6353d(), i10, i11, i12);
        } else {
            if (i13 != 4) {
                return;
            }
            spannable.setSpan(i.a((Bundle) C13466a.e(bundle2)), i10, i11, i12);
        }
    }
}
