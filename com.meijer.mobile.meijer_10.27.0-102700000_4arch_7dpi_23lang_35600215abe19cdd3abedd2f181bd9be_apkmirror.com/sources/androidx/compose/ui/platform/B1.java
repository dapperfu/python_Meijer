package androidx.compose.ui.platform;

import Z.AbstractC5519q;
import android.annotation.SuppressLint;
import android.graphics.Region;
import android.view.View;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.InterfaceC5798z;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import io.constructor.data.local.PreferencesHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import r1.AccessibilityAction;
import r1.C16706n;
import r1.C16708p;
import u1.TextLayoutResult;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\f\u001a\u0004\u0018\u00010\t*\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\u000eH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u0017*\u00020\u00162\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0019\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b*\u00020\u001aH\u0000¢\u0006\u0004\b\u001d\u0010\u001e\"\u001a\u0010#\u001a\u00020\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b!\u0010\"\"\u001e\u0010'\u001a\u00020\u0013*\u00020\u00128@X\u0080\u0004¢\u0006\f\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"Landroidx/compose/ui/semantics/SemanticsConfiguration;", "configuration", "Lu1/v;", "e", "(Landroidx/compose/ui/semantics/SemanticsConfiguration;)Lu1/v;", "", "d", "(Landroidx/compose/ui/semantics/SemanticsConfiguration;)Ljava/lang/Float;", "", "Landroidx/compose/ui/platform/y1;", "", PreferencesHelper.PREF_ID, "a", "(Ljava/util/List;I)Landroidx/compose/ui/platform/y1;", "Landroidx/compose/ui/semantics/Role;", "", "i", "(I)Ljava/lang/String;", "Lr1/n;", "", "g", "(Lr1/n;)Z", "Landroidx/compose/ui/platform/AndroidViewsHandler;", "Landroid/view/View;", "h", "(Landroidx/compose/ui/platform/AndroidViewsHandler;I)Landroid/view/View;", "Lr1/p;", "LZ/q;", "Landroidx/compose/ui/platform/A1;", "b", "(Lr1/p;)LZ/q;", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/geometry/Rect;", "getDefaultFakeNodeBounds", "()Landroidx/compose/ui/geometry/Rect;", "DefaultFakeNodeBounds", "f", "isHidden$annotations", "(Lr1/n;)V", "isHidden", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class B1 {

    /* renamed from: a, reason: collision with root package name */
    private static final Rect f51765a = new Rect(0.0f, 0.0f, 10.0f, 10.0f);

    public static final C5908y1 a(List<C5908y1> list, int i10) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (list.get(i11).getSemanticsNodeId() == i10) {
                return list.get(i11);
            }
        }
        return null;
    }

    @SuppressLint({"PrimitiveInCollection"})
    public static final Float d(SemanticsConfiguration semanticsConfiguration) {
        Function1 function1;
        ArrayList arrayList = new ArrayList();
        AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsActions.INSTANCE.h());
        if (accessibilityAction == null || (function1 = (Function1) accessibilityAction.a()) == null || !((Boolean) function1.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (Float) arrayList.get(0);
    }

    public static final TextLayoutResult e(SemanticsConfiguration semanticsConfiguration) {
        Function1 function1;
        ArrayList arrayList = new ArrayList();
        AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsActions.INSTANCE.i());
        if (accessibilityAction == null || (function1 = (Function1) accessibilityAction.a()) == null || !((Boolean) function1.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (TextLayoutResult) arrayList.get(0);
    }

    public static final String i(int i10) {
        Role.Companion companion = Role.INSTANCE;
        if (Role.m(i10, companion.a())) {
            return "android.widget.Button";
        }
        if (Role.m(i10, companion.c())) {
            return "android.widget.CheckBox";
        }
        if (Role.m(i10, companion.f())) {
            return "android.widget.RadioButton";
        }
        if (Role.m(i10, companion.e())) {
            return "android.widget.ImageView";
        }
        if (Role.m(i10, companion.d())) {
            return "android.widget.Spinner";
        }
        if (Role.m(i10, companion.i())) {
            return "android.widget.NumberPicker";
        }
        return null;
    }

    public static final AbstractC5519q<A1> b(C16708p c16708p) {
        C16706n c16706nD = c16708p.d();
        if (c16706nD.getLayoutNode().f() && c16706nD.getLayoutNode().isAttached()) {
            Z.K k10 = new Z.K(48);
            Rect rectI = c16706nD.i();
            c(new Region(Math.round(rectI.getLeft()), Math.round(rectI.getTop()), Math.round(rectI.l()), Math.round(rectI.i())), c16706nD, k10, c16706nD, new Region());
            return k10;
        }
        return Z.r.a();
    }

    private static final void c(Region region, C16706n c16706n, Z.K<A1> k10, C16706n c16706n2, Region region2) {
        boolean z10;
        int i10;
        Rect rectI;
        InterfaceC5798z interfaceC5798zP;
        if (c16706n2.getLayoutNode().f() && c16706n2.getLayoutNode().isAttached()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!region.isEmpty() || c16706n2.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String() == c16706n.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String()) {
            if (!z10 || c16706n2.getIsFake()) {
                Rect rectV = c16706n2.v();
                int iRound = Math.round(rectV.getLeft());
                int iRound2 = Math.round(rectV.getTop());
                int iRound3 = Math.round(rectV.l());
                int iRound4 = Math.round(rectV.i());
                region2.set(iRound, iRound2, iRound3, iRound4);
                if (c16706n2.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String() == c16706n.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String()) {
                    i10 = -1;
                } else {
                    i10 = c16706n2.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String();
                }
                if (region2.op(region, Region.Op.INTERSECT)) {
                    k10.r(i10, new A1(c16706n2, region2.getBounds()));
                    List<C16706n> listT = c16706n2.t();
                    for (int size = listT.size() - 1; -1 < size; size--) {
                        if (!listT.get(size).n().contains(SemanticsProperties.INSTANCE.s())) {
                            c(region, c16706n, k10, listT.get(size), region2);
                        }
                    }
                    if (g(c16706n2)) {
                        region.op(iRound, iRound2, iRound3, iRound4, Region.Op.DIFFERENCE);
                        return;
                    }
                    return;
                }
                if (c16706n2.getIsFake()) {
                    C16706n c16706nR = c16706n2.r();
                    if (c16706nR != null && (interfaceC5798zP = c16706nR.p()) != null && interfaceC5798zP.f()) {
                        rectI = c16706nR.i();
                    } else {
                        rectI = f51765a;
                    }
                    k10.r(i10, new A1(c16706n2, new android.graphics.Rect(Math.round(rectI.getLeft()), Math.round(rectI.getTop()), Math.round(rectI.l()), Math.round(rectI.i()))));
                    return;
                }
                if (i10 == -1) {
                    k10.r(i10, new A1(c16706n2, region2.getBounds()));
                }
            }
        }
    }

    public static final boolean f(C16706n c16706n) {
        if (!c16706n.z()) {
            SemanticsConfiguration unmergedConfig = c16706n.getUnmergedConfig();
            SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
            if (!unmergedConfig.contains(semanticsProperties.g()) && !c16706n.getUnmergedConfig().contains(semanticsProperties.l())) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static final boolean g(C16706n c16706n) {
        if (!f(c16706n)) {
            if (c16706n.getUnmergedConfig().getIsMergingSemanticsOfDescendants() || c16706n.getUnmergedConfig().h()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final View h(AndroidViewsHandler androidViewsHandler, int i10) {
        Object next;
        Iterator<T> it = androidViewsHandler.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (((LayoutNode) ((Map.Entry) next).getKey()).getSemanticsId() == i10) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return null;
        }
        return (AndroidViewHolder) entry.getValue();
    }
}
