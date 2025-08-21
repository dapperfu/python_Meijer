package androidx.fragment.app;

import I4.C3824e;
import Z.C5603a;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\n\u001a\u0004\u0018\u00010\b*\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\u000f\u001a\u00020\u000e*\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007¢\u0006\u0004\b\u000f\u0010\u0010JC\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f0\u00072\u0006\u0010\u0017\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001e\u001a\u00020\u000e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010 R\u0016\u0010\"\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 ¨\u0006#"}, d2 = {"Landroidx/fragment/app/T;", "", "<init>", "()V", "Landroidx/fragment/app/V;", "c", "()Landroidx/fragment/app/V;", "LZ/a;", "", "value", "b", "(LZ/a;Ljava/lang/String;)Ljava/lang/String;", "Landroid/view/View;", "namedViews", "", "d", "(LZ/a;LZ/a;)V", "Landroidx/fragment/app/Fragment;", "inFragment", "outFragment", "", "isPop", "sharedElements", "isStart", "a", "(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;ZLZ/a;Z)V", "", "views", "", "visibility", "e", "(Ljava/util/List;I)V", "Landroidx/fragment/app/V;", "PLATFORM_IMPL", "SUPPORT_IMPL", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    public static final T f55157a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public static final V PLATFORM_IMPL;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public static final V SUPPORT_IMPL;

    private final V c() {
        try {
            Intrinsics.h(C3824e.class, "null cannot be cast to non-null type java.lang.Class<androidx.fragment.app.FragmentTransitionImpl>");
            return (V) C3824e.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }

    static {
        T t10 = new T();
        f55157a = t10;
        PLATFORM_IMPL = new U();
        SUPPORT_IMPL = t10.c();
    }

    @JvmStatic
    public static final void a(Fragment inFragment, Fragment outFragment, boolean isPop, C5603a<String, View> sharedElements, boolean isStart) {
        Intrinsics.j(inFragment, "inFragment");
        Intrinsics.j(outFragment, "outFragment");
        Intrinsics.j(sharedElements, "sharedElements");
        androidx.core.app.x enterTransitionCallback = isPop ? outFragment.getEnterTransitionCallback() : inFragment.getEnterTransitionCallback();
        if (enterTransitionCallback != null) {
            ArrayList arrayList = new ArrayList(sharedElements.size());
            Iterator<Map.Entry<String, View>> it = sharedElements.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getValue());
            }
            ArrayList arrayList2 = new ArrayList(sharedElements.size());
            Iterator<Map.Entry<String, View>> it2 = sharedElements.entrySet().iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next().getKey());
            }
            if (isStart) {
                enterTransitionCallback.g(arrayList2, arrayList, null);
            } else {
                enterTransitionCallback.f(arrayList2, arrayList, null);
            }
        }
    }

    @JvmStatic
    public static final String b(C5603a<String, String> c5603a, String value) {
        Intrinsics.j(c5603a, "<this>");
        Intrinsics.j(value, "value");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : c5603a.entrySet()) {
            if (Intrinsics.e(entry.getValue(), value)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getKey());
        }
        return (String) CollectionsKt.u0(arrayList);
    }

    @JvmStatic
    public static final void d(C5603a<String, String> c5603a, C5603a<String, View> namedViews) {
        Intrinsics.j(c5603a, "<this>");
        Intrinsics.j(namedViews, "namedViews");
        int size = c5603a.getSize();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (!namedViews.containsKey(c5603a.k(size))) {
                c5603a.i(size);
            }
        }
    }

    @JvmStatic
    public static final void e(List<? extends View> views, int visibility) {
        Intrinsics.j(views, "views");
        Iterator<T> it = views.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(visibility);
        }
    }

    private T() {
    }
}
