package ck;

import android.content.res.Resources;
import android.text.Spanned;
import android.widget.TextView;
import bk.AbstractC6392a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u001d\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\u0005\u001a%\u0010\n\u001a\u00020\u0003*\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u00012\b\u0010\t\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroid/widget/TextView;", "Lbk/a;", "formattedString", "", "d", "(Landroid/widget/TextView;Lbk/a;)V", "c", "b", "visualText", "accessibleText", "a", "(Landroid/widget/TextView;Lbk/a;Lbk/a;)V", "i18n_release"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "com/meijer/mobile/core/i18n/androidx/FormattedStrings")
@SourceDebugExtension
/* loaded from: classes8.dex */
final /* synthetic */ class h {
    public static final void a(TextView textView, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2) {
        Intrinsics.j(textView, "<this>");
        d.g(textView, abstractC6392a);
        b(textView, abstractC6392a2);
    }

    private static final void b(TextView textView, AbstractC6392a abstractC6392a) {
        String strC;
        if (abstractC6392a != null) {
            Resources resources = textView.getResources();
            Intrinsics.i(resources, "getResources(...)");
            strC = abstractC6392a.c(resources);
        } else {
            strC = null;
        }
        textView.setContentDescription(strC);
    }

    public static final void c(TextView textView, AbstractC6392a abstractC6392a) {
        Intrinsics.j(textView, "<this>");
        Spanned spannedA = null;
        if (abstractC6392a != null) {
            Resources resources = textView.getResources();
            Intrinsics.i(resources, "getResources(...)");
            String strC = abstractC6392a.c(resources);
            if (strC != null) {
                spannedA = m2.b.a(strC, 0, null, null);
            }
        }
        textView.setText(spannedA);
    }

    public static final void d(TextView textView, AbstractC6392a abstractC6392a) {
        String strC;
        Intrinsics.j(textView, "<this>");
        if (abstractC6392a != null) {
            Resources resources = textView.getResources();
            Intrinsics.i(resources, "getResources(...)");
            strC = abstractC6392a.c(resources);
        } else {
            strC = null;
        }
        textView.setText(strC);
    }
}
