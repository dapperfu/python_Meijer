package c8;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.medallia.digital.mobilesdk.q2;
import d8.C13496c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\b*\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\b*\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0013\u0010\f\u001a\u00020\b*\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\nJ\u0013\u0010\r\u001a\u00020\b*\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\nJ\u0013\u0010\u000e\u001a\u00020\b*\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\nJ1\u0010\u0016\u001a\u0004\u0018\u00010\u00152\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lc8/j;", "", "<init>", "()V", "Landroid/view/View;", "Lc8/k;", "e", "(Landroid/view/View;)Lc8/k;", "", "d", "(Landroid/view/View;)Ljava/lang/String;", "f", "c", "g", "b", "", "Lc8/c;", "touchList", "Landroid/view/ViewGroup;", "rootView", "interactView", "Lc8/e;", "a", "(Ljava/util/List;Landroid/view/ViewGroup;Landroid/view/View;)Lc8/e;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static final a f61658a = new a(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lc8/j$a;", "", "<init>", "()V", "", "DT_MASK_TAG", "Ljava/lang/String;", "MASKED_LABEL", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final UiElement e(View view) {
        return new UiElement(g(view), b(view), d(view));
    }

    private final String f(View view) throws Resources.NotFoundException {
        try {
            String resourceName = view.getResources().getResourceName(view.getId());
            Intrinsics.g(resourceName);
            return StringsKt.c0(resourceName, ":id/", false, 2, null) ? StringsKt.k1(resourceName, ":id/", null, 2, null) : resourceName;
        } catch (Resources.NotFoundException unused) {
            return view.getContentDescription() != null ? view.getContentDescription().toString() : (view.getTag() == null || Intrinsics.e(view.getTag(), "dt_rum_masked")) ? b(view) : view.getTag().toString();
        }
    }

    public final TouchUserInteraction a(List<TouchEvent> touchList, ViewGroup rootView, View interactView) {
        Intrinsics.j(touchList, "touchList");
        Intrinsics.j(rootView, "rootView");
        TouchEvent touchEvent = (TouchEvent) CollectionsKt.F0(touchList);
        if (touchEvent == null) {
            return null;
        }
        View viewA = C13496c.a(rootView, (int) touchEvent.getX(), (int) touchEvent.getY());
        List<TouchEvent> list = touchList;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((TouchEvent) obj).getAction() == EnumC6375b.f61643c) {
                arrayList.add(obj);
            }
        }
        List listB = C6377d.b(arrayList, 0, 1, null);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            TouchEvent touchEvent2 = (TouchEvent) obj2;
            if (touchEvent2.getAction() != EnumC6375b.f61643c || listB.contains(touchEvent2)) {
                arrayList2.add(obj2);
            }
        }
        return new TouchUserInteraction(arrayList2, e(viewA), interactView != null ? e(interactView) : null);
    }

    private final String b(View view) {
        String simpleName = view.getClass().getSimpleName();
        Intrinsics.i(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    private final String c(View view) throws Resources.NotFoundException {
        if (view.getParent() != null && (view.getParent() instanceof ViewGroup)) {
            String strF = f(view);
            if (strF.length() == 0) {
                Object parent = view.getParent();
                Intrinsics.h(parent, "null cannot be cast to non-null type android.view.View");
                return c((View) parent);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strF);
            sb2.append('[');
            ViewParent parent2 = view.getParent();
            Intrinsics.h(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
            sb2.append(((ViewGroup) parent2).indexOfChild(view));
            sb2.append(']');
            String string = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            Object parent3 = view.getParent();
            Intrinsics.h(parent3, "null cannot be cast to non-null type android.view.View");
            sb3.append(c((View) parent3));
            sb3.append('/');
            sb3.append(string);
            return sb3.toString();
        }
        return b(view);
    }

    private final String d(View view) throws Resources.NotFoundException {
        ViewGroup viewGroup;
        Integer numValueOf;
        int iIntValue;
        String strC = c(view);
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            numValueOf = Integer.valueOf(viewGroup.indexOfChild(view));
        } else {
            numValueOf = null;
        }
        String strF = f(view);
        if (strF.length() == 0 || numValueOf == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strC);
            sb2.append('/');
            sb2.append(b(view));
            sb2.append('[');
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            } else {
                iIntValue = 0;
            }
            sb2.append(iIntValue);
            sb2.append(']');
            return sb2.toString();
        }
        return StringsKt.w1(strC, q2.f92724c, null, 2, null) + '/' + strF + '[' + numValueOf + ']';
    }

    private final String g(View view) {
        String string;
        boolean z10;
        if (Intrinsics.e(view.getTag(), "dt_rum_masked")) {
            return "***";
        }
        if (view instanceof TextView) {
            CharSequence text = ((TextView) view).getText();
            String str = null;
            if (text != null) {
                string = text.toString();
            } else {
                string = null;
            }
            if (string != null && string.length() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                str = string;
            }
            if (str == null) {
                return b(view);
            }
            return str;
        }
        return b(view);
    }
}
