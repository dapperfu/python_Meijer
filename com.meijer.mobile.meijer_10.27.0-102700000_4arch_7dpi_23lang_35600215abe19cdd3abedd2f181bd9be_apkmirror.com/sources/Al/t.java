package Al;

import Co.ProductFullDetails;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import vs.CartProductListDecorator;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ9\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00122\b\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J9\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00122\b\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LAl/t;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "substitutionMode", "LCo/h;", "itemToFindSimilar", "analyticsSourcePageName", "schoolName", "classroomName", "Landroid/content/Intent;", "b", "(Landroid/content/Context;Ljava/lang/String;LCo/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;", "Lvs/b;", "itemToSubstitute", "LPp/c;", "c", "(Landroid/content/Context;Lvs/b;LPp/c;LCo/h;Ljava/lang/String;)Landroid/content/Intent;", "Landroid/content/ComponentName;", "cmp", "a", "(Landroid/content/ComponentName;Lvs/b;LPp/c;LCo/h;Ljava/lang/String;)Landroid/content/Intent;", "featurenavigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final t f694a = new t();

    public static /* synthetic */ Intent d(t tVar, ComponentName componentName, CartProductListDecorator c17606b, Pp.c cVar, ProductFullDetails productFullDetails, String str, int i10, Object obj) {
        CartProductListDecorator c17606b2;
        ProductFullDetails productFullDetails2;
        t tVar2;
        ComponentName componentName2;
        Pp.c cVar2;
        String str2;
        if ((i10 & 2) != 0) {
            c17606b2 = new CartProductListDecorator(0, null, null, null, null, false, false, 0.0d, false, null, null, null, null, 0.0d, null, null, false, 131071, null);
        } else {
            c17606b2 = c17606b;
        }
        if ((i10 & 8) != 0) {
            productFullDetails2 = new ProductFullDetails(null, null, 0, false, false, false, null, null, null, null, false, false, false, false, false, false, false, null, false, null, null, false, null, false, 0, null, 0.0d, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, false, null, 0, -1, 268435455, null);
            tVar2 = tVar;
            componentName2 = componentName;
            str2 = str;
            cVar2 = cVar;
        } else {
            productFullDetails2 = productFullDetails;
            tVar2 = tVar;
            componentName2 = componentName;
            cVar2 = cVar;
            str2 = str;
        }
        return tVar2.a(componentName2, c17606b2, cVar2, productFullDetails2, str2);
    }

    public static /* synthetic */ Intent e(t tVar, Context context, CartProductListDecorator c17606b, Pp.c cVar, ProductFullDetails productFullDetails, String str, int i10, Object obj) {
        CartProductListDecorator c17606b2;
        ProductFullDetails productFullDetails2;
        t tVar2;
        Context context2;
        Pp.c cVar2;
        String str2;
        if ((i10 & 2) != 0) {
            c17606b2 = new CartProductListDecorator(0, null, null, null, null, false, false, 0.0d, false, null, null, null, null, 0.0d, null, null, false, 131071, null);
        } else {
            c17606b2 = c17606b;
        }
        if ((i10 & 8) != 0) {
            productFullDetails2 = new ProductFullDetails(null, null, 0, false, false, false, null, null, null, null, false, false, false, false, false, false, false, null, false, null, null, false, null, false, 0, null, 0.0d, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, false, null, 0, -1, 268435455, null);
            tVar2 = tVar;
            context2 = context;
            str2 = str;
            cVar2 = cVar;
        } else {
            productFullDetails2 = productFullDetails;
            tVar2 = tVar;
            context2 = context;
            cVar2 = cVar;
            str2 = str;
        }
        return tVar2.c(context2, c17606b2, cVar2, productFullDetails2, str2);
    }

    public final Intent a(ComponentName cmp, CartProductListDecorator itemToSubstitute, Pp.c substitutionMode, ProductFullDetails itemToFindSimilar, String analyticsSourcePageName) {
        Intrinsics.j(cmp, "cmp");
        Intrinsics.j(itemToSubstitute, "itemToSubstitute");
        Intrinsics.j(substitutionMode, "substitutionMode");
        Intrinsics.j(itemToFindSimilar, "itemToFindSimilar");
        Intrinsics.j(analyticsSourcePageName, "analyticsSourcePageName");
        Intent intent = new Intent();
        intent.setComponent(cmp);
        intent.putExtra("com.meijer.mobile.meijer.activity.substitution.intent.extra.itemToSubstitute", itemToSubstitute);
        intent.putExtra("com.meijer.mobile.meijer.activity.substitution.intent.extra.itemToFindSimilar", itemToFindSimilar);
        intent.putExtra("com.meijer.mobile.meijer.activity.substitution.intent.extra.substitutionmode", substitutionMode);
        intent.putExtra("com.meijer.mobile.meijer.activity.substitution.intent.extra.sourcePageName", analyticsSourcePageName);
        return intent;
    }

    public final Intent b(Context context, String substitutionMode, ProductFullDetails itemToFindSimilar, String analyticsSourcePageName, String schoolName, String classroomName) {
        Intrinsics.j(context, "context");
        Intrinsics.j(substitutionMode, "substitutionMode");
        Intrinsics.j(itemToFindSimilar, "itemToFindSimilar");
        Intrinsics.j(analyticsSourcePageName, "analyticsSourcePageName");
        Intrinsics.j(schoolName, "schoolName");
        Intrinsics.j(classroomName, "classroomName");
        Intent intentA = j.a(context, "action.com.meijer.mobile.meijer.activity.substitution");
        intentA.putExtra("com.meijer.mobile.meijer.activity.substitution.intent.extra.itemToFindSimilar", itemToFindSimilar);
        intentA.putExtra("com.meijer.mobile.meijer.activity.substitution.intent.extra.substitutionmode", substitutionMode);
        intentA.putExtra("com.meijer.mobile.meijer.activity.substitution.intent.extra.sourcePageName", analyticsSourcePageName);
        intentA.putExtra("com.meijer.mobile.meijer.activity.substitution.intent.extra.schoolName", schoolName);
        intentA.putExtra("com.meijer.mobile.meijer.activity.substitution.intent.extra.classroomName", classroomName);
        return intentA;
    }

    public final Intent c(Context context, CartProductListDecorator itemToSubstitute, Pp.c substitutionMode, ProductFullDetails itemToFindSimilar, String analyticsSourcePageName) {
        Intrinsics.j(context, "context");
        Intrinsics.j(itemToSubstitute, "itemToSubstitute");
        Intrinsics.j(substitutionMode, "substitutionMode");
        Intrinsics.j(itemToFindSimilar, "itemToFindSimilar");
        Intrinsics.j(analyticsSourcePageName, "analyticsSourcePageName");
        Intent intentA = j.a(context, "action.com.meijer.mobile.meijer.activity.substitution");
        intentA.putExtra("com.meijer.mobile.meijer.activity.substitution.intent.extra.itemToSubstitute", itemToSubstitute);
        intentA.putExtra("com.meijer.mobile.meijer.activity.substitution.intent.extra.itemToFindSimilar", itemToFindSimilar);
        intentA.putExtra("com.meijer.mobile.meijer.activity.substitution.intent.extra.substitutionmode", substitutionMode);
        intentA.putExtra("com.meijer.mobile.meijer.activity.substitution.intent.extra.sourcePageName", analyticsSourcePageName);
        return intentA;
    }

    private t() {
    }
}
