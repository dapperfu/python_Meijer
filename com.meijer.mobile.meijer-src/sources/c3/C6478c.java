package c3;

import android.os.Bundle;
import android.text.Spannable;
import android.text.Spanned;
import d3.C13599a;
import d3.P;
import java.util.ArrayList;

/* renamed from: c3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6478c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f61229a = P.y0(0);

    /* renamed from: b, reason: collision with root package name */
    private static final String f61230b = P.y0(1);

    /* renamed from: c, reason: collision with root package name */
    private static final String f61231c = P.y0(2);

    /* renamed from: d, reason: collision with root package name */
    private static final String f61232d = P.y0(3);

    /* renamed from: e, reason: collision with root package name */
    private static final String f61233e = P.y0(4);

    public static ArrayList<Bundle> a(Spanned spanned) {
        ArrayList<Bundle> arrayList = new ArrayList<>();
        for (f fVar : (f[]) spanned.getSpans(0, spanned.length(), f.class)) {
            arrayList.add(b(spanned, fVar, 1, fVar.b()));
        }
        for (h hVar : (h[]) spanned.getSpans(0, spanned.length(), h.class)) {
            arrayList.add(b(spanned, hVar, 2, hVar.b()));
        }
        for (C6479d c6479d : (C6479d[]) spanned.getSpans(0, spanned.length(), C6479d.class)) {
            arrayList.add(b(spanned, c6479d, 3, null));
        }
        for (i iVar : (i[]) spanned.getSpans(0, spanned.length(), i.class)) {
            arrayList.add(b(spanned, iVar, 4, iVar.b()));
        }
        return arrayList;
    }

    private static Bundle b(Spanned spanned, Object obj, int i10, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f61229a, spanned.getSpanStart(obj));
        bundle2.putInt(f61230b, spanned.getSpanEnd(obj));
        bundle2.putInt(f61231c, spanned.getSpanFlags(obj));
        bundle2.putInt(f61232d, i10);
        if (bundle != null) {
            bundle2.putBundle(f61233e, bundle);
        }
        return bundle2;
    }

    public static void c(Bundle bundle, Spannable spannable) {
        int i10 = bundle.getInt(f61229a);
        int i11 = bundle.getInt(f61230b);
        int i12 = bundle.getInt(f61231c);
        int i13 = bundle.getInt(f61232d, -1);
        Bundle bundle2 = bundle.getBundle(f61233e);
        if (i13 == 1) {
            spannable.setSpan(f.a((Bundle) C13599a.e(bundle2)), i10, i11, i12);
            return;
        }
        if (i13 == 2) {
            spannable.setSpan(h.a((Bundle) C13599a.e(bundle2)), i10, i11, i12);
        } else if (i13 == 3) {
            spannable.setSpan(new C6479d(), i10, i11, i12);
        } else {
            if (i13 != 4) {
                return;
            }
            spannable.setSpan(i.a((Bundle) C13599a.e(bundle2)), i10, i11, i12);
        }
    }
}
