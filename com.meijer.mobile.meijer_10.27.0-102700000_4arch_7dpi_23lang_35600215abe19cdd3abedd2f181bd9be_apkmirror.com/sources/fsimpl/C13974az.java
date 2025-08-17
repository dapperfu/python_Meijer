package fsimpl;

import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.view.View;
import com.fullstory.instrumentation.frameworks.compose.FSComposeAndroidComposeView;
import com.fullstory.instrumentation.frameworks.compose.FSComposeAnnotatedString;
import com.fullstory.instrumentation.frameworks.compose.FSComposeCanvas;
import com.fullstory.instrumentation.frameworks.compose.FSComposeDraw;
import com.fullstory.instrumentation.frameworks.compose.FSComposeLayoutCoordinates;
import com.fullstory.instrumentation.frameworks.compose.FSComposeLayoutNode;
import com.fullstory.instrumentation.frameworks.compose.FSComposeModifier;
import com.fullstory.instrumentation.frameworks.compose.FSComposeNodeCoordinator;
import com.fullstory.instrumentation.frameworks.compose.FSComposeRect;
import com.fullstory.instrumentation.frameworks.compose.FSComposeRenderNodeLayer;
import com.fullstory.instrumentation.frameworks.compose.FSComposeSemanticsConfiguration;
import com.fullstory.instrumentation.frameworks.compose.FSComposeSemanticsModifier;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: fsimpl.az, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C13974az {
    private static int a(aK aKVar) {
        switch (aKVar.f131492h) {
            case 2:
                return 33;
            case 3:
                return 17;
            case 4:
                return 129;
            case 5:
                return 4;
            case 6:
                return 2;
            case 7:
                return 3;
            default:
                return 1;
        }
    }

    private static int a(C13971aw c13971aw, FSComposeAndroidComposeView fSComposeAndroidComposeView, FSComposeLayoutNode fSComposeLayoutNode, FSComposeLayoutNode fSComposeLayoutNode2, boolean z10, boolean z11, C14127y c14127y, int i10, int i11, int i12, RectF rectF, C14013ck c14013ck) {
        c13971aw.a("scanLayoutNode");
        return !c13971aw.a(fSComposeAndroidComposeView, fSComposeLayoutNode, fSComposeLayoutNode2) ? i12 : a(c13971aw, fSComposeAndroidComposeView, fSComposeLayoutNode2, z10, z11, c14127y, i10, i11, i12, rectF, fSComposeLayoutNode2._fsGetOuterCoordinator(), c14013ck);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static int a(C13971aw c13971aw, FSComposeAndroidComposeView fSComposeAndroidComposeView, Object obj, boolean z10, boolean z11, C14127y c14127y, int i10, int i11, int i12, RectF rectF, FSComposeNodeCoordinator fSComposeNodeCoordinator, C14013ck c14013ck) {
        c13971aw.a("scanIntermediateOrLayoutNodeCommon");
        c13971aw.i();
        aK aKVarA = c13971aw.e().a(obj);
        gh ghVarD = c13971aw.d();
        InterfaceC13976ba interfaceC13976baH = c13971aw.h();
        int iA = c13971aw.a(aKVarA);
        int iA2 = a(c13971aw, ghVarD, obj, aKVarA, z10);
        dE.a(ghVarD);
        dE.k(ghVarD, iA);
        dE.n(ghVarD, iA2);
        if (!(fSComposeNodeCoordinator == null ? false : fSComposeNodeCoordinator._fsIsTransparent())) {
            dE.b(ghVarD, (byte) -1);
        }
        dE.a(ghVarD, C14047ds.a(ghVarD, (int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom));
        if (z10) {
            C13973ay.a(c13971aw.b(), (View) fSComposeAndroidComposeView, (int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        }
        String name = c14013ck.y() ? aKVarA.f131489e : null;
        if (name == null) {
            name = obj.getClass().getName();
        }
        dE.c(ghVarD, interfaceC13976baH.a(name));
        if (obj instanceof FSComposeLayoutNode) {
            a(ghVarD, (FSComposeLayoutNode) obj, z10, c14127y, aKVarA, interfaceC13976baH, c14013ck);
        }
        a(ghVarD, z10, z11, aKVarA, c14127y);
        int iB = dE.b(ghVarD);
        dA.a(ghVarD);
        dA.a(ghVarD, gd.c(obj));
        dA.b(ghVarD, i10);
        dA.a(ghVarD, iB);
        dA.c(ghVarD, i11);
        dA.d(ghVarD, i12);
        return dA.b(ghVarD);
    }

    private static int a(C13971aw c13971aw, gh ghVar, Object obj, aK aKVar, boolean z10) {
        c13971aw.f131722a.clear();
        if (!z10 && aKVar.f131492h != 0 && aKVar.f131492h != 4 && aKVar.d()) {
            C14053dy.a(ghVar);
            C14053dy.a(ghVar, true);
            c13971aw.f131722a.add(Integer.valueOf(dD.a(ghVar, (byte) 4, C14053dy.b(ghVar))));
        }
        return C13973ay.a(c13971aw.f131722a, ghVar);
    }

    private static RectF a(RectF rectF) {
        return (rectF.left == 0.0f && rectF.top == 0.0f) ? rectF : new RectF(0.0f, 0.0f, rectF.right - rectF.left, rectF.bottom - rectF.top);
    }

    public static RectF a(FSComposeLayoutNode fSComposeLayoutNode) {
        FSComposeRect fSComposeRect_fsGetBoundsInParent;
        FSComposeLayoutCoordinates fSComposeLayoutCoordinates_fsGetCoordinates = fSComposeLayoutNode._fsGetCoordinates();
        if (fSComposeLayoutCoordinates_fsGetCoordinates == null || (fSComposeRect_fsGetBoundsInParent = fSComposeLayoutCoordinates_fsGetCoordinates._fsGetBoundsInParent()) == null) {
            return null;
        }
        float f_fsGetLeft = fSComposeRect_fsGetBoundsInParent._fsGetLeft();
        float f_fsGetTop = fSComposeRect_fsGetBoundsInParent._fsGetTop();
        return new RectF(f_fsGetLeft, f_fsGetTop, fSComposeRect_fsGetBoundsInParent._fsGetWidth() + f_fsGetLeft, fSComposeRect_fsGetBoundsInParent._fsGetHeight() + f_fsGetTop);
    }

    public static String a(final FSComposeLayoutNode fSComposeLayoutNode, aK aKVar, C14013ck c14013ck) {
        if (!(aKVar.f131492h != 0) || aKVar.f131492h == 4) {
            return null;
        }
        final boolean zD = aKVar.d();
        final StringBuilder[] sbArr = new StringBuilder[1];
        if (c14013ck.A()) {
            a(fSComposeLayoutNode._fsGetCollapsedSemantics(), zD, sbArr);
        } else {
            bG.a(fSComposeLayoutNode._fsGetModifier(), new bH() { // from class: fsimpl.az$$ExternalSyntheticLambda2
                @Override // fsimpl.bH
                public final void accept(FSComposeModifier fSComposeModifier) {
                    C13974az.a(fSComposeLayoutNode, zD, sbArr, fSComposeModifier);
                }
            });
        }
        StringBuilder sb2 = sbArr[0];
        if (sb2 != null) {
            return sb2.toString();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(FSComposeLayoutNode fSComposeLayoutNode, boolean z10, StringBuilder[] sbArr, FSComposeModifier fSComposeModifier) {
        if (fSComposeModifier instanceof FSComposeSemanticsModifier) {
            a(fSComposeLayoutNode._fsGetSemanticsConfiguration((FSComposeSemanticsModifier) fSComposeModifier), z10, sbArr);
        }
    }

    public static void a(FSComposeRenderNodeLayer fSComposeRenderNodeLayer, Object obj, Object obj2, boolean z10) {
        boolean z_fsIsDirty = fSComposeRenderNodeLayer._fsIsDirty();
        if (z10) {
            fSComposeRenderNodeLayer._fsDrawLayer(obj, obj2);
        } else {
            fSComposeRenderNodeLayer._fsDrawLayer(obj);
        }
        if (!z_fsIsDirty || fSComposeRenderNodeLayer._fsIsDirty()) {
            return;
        }
        fSComposeRenderNodeLayer._fsSetDirty(true);
    }

    private static void a(FSComposeSemanticsConfiguration fSComposeSemanticsConfiguration, boolean z10, StringBuilder[] sbArr) {
        if (fSComposeSemanticsConfiguration == null) {
            return;
        }
        if (z10) {
            a(sbArr, fSComposeSemanticsConfiguration._fsGetEditableText());
            return;
        }
        List list_fsGetText = fSComposeSemanticsConfiguration._fsGetText();
        if (list_fsGetText != null) {
            Iterator it = list_fsGetText.iterator();
            while (it.hasNext()) {
                a(sbArr, (FSComposeAnnotatedString) it.next());
            }
        }
    }

    private static void a(final C13971aw c13971aw, final FSComposeAndroidComposeView fSComposeAndroidComposeView, final FSComposeCanvas fSComposeCanvas, final FSComposeLayoutNode fSComposeLayoutNode, final FSComposeLayoutNode fSComposeLayoutNode2, final int i10, final int i11, final C14013ck c14013ck, Object obj, boolean z10, boolean z11, final C13972ax c13972ax) {
        int[] iArr;
        Map map;
        List list;
        List list2;
        C14127y c14127yE;
        int i12;
        Map map2;
        final int[] iArr2;
        c13971aw.a("scanLayoutNodeAndChildren");
        if (fSComposeLayoutNode2 == null || fSComposeCanvas == null) {
            c13972ax.f131748a = i10;
            return;
        }
        if (!(fSComposeLayoutNode2 instanceof FSComposeDraw)) {
            c13972ax.f131748a = i10;
            return;
        }
        if (!c13971aw.a(fSComposeAndroidComposeView, fSComposeLayoutNode, fSComposeLayoutNode2)) {
            c13972ax.f131748a = i10;
            return;
        }
        C14124v c14124vC = c13971aw.c();
        if (c14124vC.a(fSComposeLayoutNode2)) {
            c13972ax.f131748a = i10;
            return;
        }
        RectF rectFA = a(fSComposeLayoutNode2);
        if (rectFA == null) {
            c13972ax.f131748a = i10;
            return;
        }
        RectF rectFA2 = z11 ? a(rectFA) : rectFA;
        int[] iArr3 = new int[1];
        final boolean zB = c14124vC.b(fSComposeLayoutNode2);
        final boolean zD = c14124vC.d(fSComposeLayoutNode2);
        if (zB) {
            iArr = iArr3;
            map = null;
            list = null;
            list2 = null;
            c14127yE = null;
            i12 = 0;
        } else {
            c14127yE = c14124vC.e(fSComposeLayoutNode2);
            C13970av c13970avF = c13971aw.f();
            C13957ai c13957aiG = c13971aw.g();
            iArr = iArr3;
            int iA = c13970avF.a((FSComposeDraw) fSComposeLayoutNode2, c14124vC, fSComposeCanvas, c13957aiG, obj, z10, rectFA, c14013ck);
            List listB = c13957aiG.b();
            List listC = c13957aiG.c();
            Map mapD = c13957aiG.d();
            i12 = iA;
            list2 = listB;
            list = listC;
            map = mapD;
        }
        fN fNVarA = c13971aw.a();
        Map map3 = map;
        final C14127y c14127y = c14127yE;
        Map map4 = map3;
        List list3 = list;
        final int i13 = i12;
        List list4 = list2;
        final int[] iArr4 = iArr;
        List list5 = list3;
        final RectF rectF = rectFA2;
        fNVarA.a(new Runnable() { // from class: fsimpl.az$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                C13974az.a(c13972ax, c13971aw, fSComposeAndroidComposeView, fSComposeLayoutNode, fSComposeLayoutNode2, zB, zD, c14127y, i13, iArr4, i10, rectF, c14013ck);
            }
        });
        if (list5 != null) {
            int size = list5.size() - 1;
            while (size >= 0) {
                List list6 = list5;
                final Object obj2 = list6.get(size);
                if ((obj2 instanceof FSComposeLayoutNode) || (obj2 instanceof aF)) {
                    map2 = map4;
                    C13958aj c13958aj = map4 != null ? (C13958aj) map2.get(obj2) : null;
                    final Object obj3 = c13958aj != null ? c13958aj.f131614a : null;
                    final boolean z12 = c13958aj != null ? c13958aj.f131615b : false;
                    final C13972ax c13972ax2 = new C13972ax();
                    final int[] iArr5 = iArr;
                    list5 = list6;
                    Runnable runnable = new Runnable() { // from class: fsimpl.az$$ExternalSyntheticLambda4
                        @Override // java.lang.Runnable
                        public final void run() {
                            C13974az.a(c13971aw, fSComposeAndroidComposeView, fSComposeCanvas, fSComposeLayoutNode2, obj2, iArr5, i11, c14013ck, obj3, z12, c13972ax2);
                        }
                    };
                    iArr2 = iArr;
                    fNVarA.a(new Runnable() { // from class: fsimpl.az$$ExternalSyntheticLambda5
                        @Override // java.lang.Runnable
                        public final void run() {
                            C13974az.b(iArr2, c13972ax2);
                        }
                    });
                    fNVarA.a(runnable);
                } else {
                    map2 = map4;
                    list5 = list6;
                    iArr2 = iArr;
                }
                size--;
                iArr = iArr2;
                map4 = map2;
            }
        }
        final int[] iArr6 = iArr;
        if (list4 != null) {
            for (int size2 = list4.size() - 1; size2 >= 0; size2--) {
                final Pair pair = (Pair) list4.get(size2);
                final C13972ax c13972ax3 = new C13972ax();
                Runnable runnable2 = new Runnable() { // from class: fsimpl.az$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        C13974az.a(c13971aw, fSComposeLayoutNode2, pair, iArr6, c13972ax3);
                    }
                };
                fNVarA.a(new Runnable() { // from class: fsimpl.az$$ExternalSyntheticLambda7
                    @Override // java.lang.Runnable
                    public final void run() {
                        C13974az.a(iArr6, c13972ax3);
                    }
                });
                fNVarA.a(runnable2);
            }
        }
    }

    private static void a(final C13971aw c13971aw, final FSComposeAndroidComposeView fSComposeAndroidComposeView, final FSComposeCanvas fSComposeCanvas, final FSComposeLayoutNode fSComposeLayoutNode, final FSComposeLayoutNode fSComposeLayoutNode2, final aF aFVar, final int i10, final int i11, final C14013ck c14013ck, final Object obj, final boolean z10, final C13972ax c13972ax) {
        c13971aw.a("scanIntermediateNodeAndChildren");
        boolean z11 = aFVar.f131465c != null;
        if (aFVar.f131466d == null) {
            a(c13971aw, fSComposeAndroidComposeView, fSComposeCanvas, fSComposeLayoutNode, fSComposeLayoutNode2, i10, i11, c14013ck, obj, z10, z11, c13972ax);
            return;
        }
        final C14124v c14124vC = c13971aw.c();
        if (c14124vC.a(aFVar)) {
            c13972ax.f131748a = i10;
            return;
        }
        if (!c13971aw.a(fSComposeAndroidComposeView, fSComposeLayoutNode, fSComposeLayoutNode2)) {
            c13972ax.f131748a = i10;
            return;
        }
        final RectF rectFA = a(fSComposeLayoutNode2);
        if (rectFA == null) {
            c13972ax.f131748a = i10;
            return;
        }
        RectF rectFA2 = z11 ? a(rectFA) : rectFA;
        final C13972ax c13972ax2 = new C13972ax();
        fN fNVarA = c13971aw.a();
        final boolean zB = c14124vC.b(aFVar);
        final boolean zD = c14124vC.d(aFVar);
        final RectF rectF = rectFA2;
        fNVarA.a(new Runnable() { // from class: fsimpl.az$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C13974az.a(zB, c14124vC, aFVar, c13971aw, rectFA, fSComposeLayoutNode2, c13972ax, fSComposeAndroidComposeView, zD, c13972ax2, i10, rectF, c14013ck);
            }
        });
        if (zB) {
            return;
        }
        fNVarA.a(new Runnable() { // from class: fsimpl.az$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C13974az.a(c13971aw, fSComposeAndroidComposeView, fSComposeCanvas, fSComposeLayoutNode, fSComposeLayoutNode2, aFVar, i11, c14013ck, obj, z10, c13972ax2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(C13971aw c13971aw, FSComposeAndroidComposeView fSComposeAndroidComposeView, FSComposeCanvas fSComposeCanvas, FSComposeLayoutNode fSComposeLayoutNode, FSComposeLayoutNode fSComposeLayoutNode2, aF aFVar, int i10, C14013ck c14013ck, Object obj, boolean z10, C13972ax c13972ax) {
        a(c13971aw, fSComposeAndroidComposeView, fSComposeCanvas, fSComposeLayoutNode, fSComposeLayoutNode2, aFVar.f131466d, 0, i10 + 1, c14013ck, obj, z10, c13972ax);
    }

    private static void a(C13971aw c13971aw, FSComposeAndroidComposeView fSComposeAndroidComposeView, FSComposeCanvas fSComposeCanvas, FSComposeLayoutNode fSComposeLayoutNode, Object obj, int i10, int i11, C14013ck c14013ck, Object obj2, boolean z10, C13972ax c13972ax) {
        if (obj instanceof FSComposeLayoutNode) {
            a(c13971aw, fSComposeAndroidComposeView, fSComposeCanvas, fSComposeLayoutNode, (FSComposeLayoutNode) obj, i10, i11, c14013ck, obj2, z10, false, c13972ax);
            return;
        }
        if (obj instanceof aF) {
            aF aFVar = (aF) obj;
            Object obj3 = aFVar.f131463a.get();
            if (obj3 instanceof FSComposeLayoutNode) {
                a(c13971aw, fSComposeAndroidComposeView, fSComposeCanvas, fSComposeLayoutNode, (FSComposeLayoutNode) obj3, aFVar, i10, i11, c14013ck, obj2, z10, c13972ax);
            } else {
                C14103fu.c("scanNodeAndChildren backing field should have been an FSComposeLayoutNode instance for IntermediateNode but was %s", obj3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(C13971aw c13971aw, FSComposeAndroidComposeView fSComposeAndroidComposeView, FSComposeCanvas fSComposeCanvas, FSComposeLayoutNode fSComposeLayoutNode, Object obj, int[] iArr, int i10, C14013ck c14013ck, Object obj2, boolean z10, C13972ax c13972ax) {
        a(c13971aw, fSComposeAndroidComposeView, fSComposeCanvas, fSComposeLayoutNode, obj, iArr[0], i10 + 1, c14013ck, obj2, z10, c13972ax);
    }

    public static void a(C13971aw c13971aw, FSComposeAndroidComposeView fSComposeAndroidComposeView, C14013ck c14013ck, C13972ax c13972ax) {
        c13971aw.a("scanLayoutNodeAndChildren");
        FSComposeLayoutNode fSComposeLayoutNode_fsGetRoot = fSComposeAndroidComposeView._fsGetRoot();
        FSComposeCanvas fSComposeCanvas_fsWrapCanvas = fSComposeLayoutNode_fsGetRoot._fsWrapCanvas(c13971aw.g());
        if (fSComposeCanvas_fsWrapCanvas == null) {
            c13972ax.f131748a = 0;
        } else {
            a(c13971aw, fSComposeAndroidComposeView, fSComposeCanvas_fsWrapCanvas, (FSComposeLayoutNode) null, (Object) fSComposeLayoutNode_fsGetRoot, 0, 0, c14013ck, (Object) null, false, c13972ax);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(C13971aw c13971aw, FSComposeLayoutNode fSComposeLayoutNode, Pair pair, int[] iArr, C13972ax c13972ax) {
        c13971aw.a(fSComposeLayoutNode, (View) pair.first, iArr[0], (Rect) pair.second, c13972ax);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(C13972ax c13972ax, C13971aw c13971aw, FSComposeAndroidComposeView fSComposeAndroidComposeView, FSComposeLayoutNode fSComposeLayoutNode, FSComposeLayoutNode fSComposeLayoutNode2, boolean z10, boolean z11, C14127y c14127y, int i10, int[] iArr, int i11, RectF rectF, C14013ck c14013ck) {
        c13972ax.f131748a = a(c13971aw, fSComposeAndroidComposeView, fSComposeLayoutNode, fSComposeLayoutNode2, z10, z11, c14127y, i10, iArr[0], i11, rectF, c14013ck);
    }

    private static void a(gh ghVar, FSComposeLayoutNode fSComposeLayoutNode, boolean z10, C14127y c14127y, aK aKVar, InterfaceC13976ba interfaceC13976ba, C14013ck c14013ck) {
        if (c14013ck.x() >= 3) {
            if (aKVar.f131492h != 0) {
                String strA = z10 ? null : a(fSComposeLayoutNode, aKVar, c14013ck);
                if (c14013ck.z() || aKVar.f131492h == 4) {
                    C13973ay.a(ghVar, a(aKVar), aKVar.f131492h);
                }
                if (z10 || strA == null || c14127y == null) {
                    return;
                }
                if (!c14127y.b()) {
                    strA = fF.a(fSComposeLayoutNode, strA);
                }
                dE.m(ghVar, interfaceC13976ba.a(strA));
            }
        }
    }

    private static void a(gh ghVar, boolean z10, aK aKVar, C14127y c14127y) {
        int i10 = z10 ? 256 : 0;
        if (c14127y != null && c14127y.a()) {
            i10 |= 32768;
        }
        if (aKVar.e()) {
            i10 |= 1;
        }
        if (aKVar.f()) {
            i10 |= 2;
        }
        if (aKVar.g()) {
            i10 |= 4;
        }
        if (aKVar.h()) {
            i10 |= 8;
        }
        dE.h(ghVar, i10);
    }

    private static void a(gh ghVar, boolean z10, boolean z11, aK aKVar, C14127y c14127y) {
        a(ghVar, z10, aKVar, c14127y);
        C13973ay.a(ghVar, z11, aKVar.c());
    }

    public static void a(Object obj, View view, C13957ai c13957ai) {
        c13957ai.b(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(boolean z10, C14124v c14124v, aF aFVar, C13971aw c13971aw, RectF rectF, FSComposeLayoutNode fSComposeLayoutNode, C13972ax c13972ax, FSComposeAndroidComposeView fSComposeAndroidComposeView, boolean z11, C13972ax c13972ax2, int i10, RectF rectF2, C14013ck c14013ck) {
        C14127y c14127yE;
        int iA;
        if (z10) {
            c14127yE = null;
            iA = 0;
        } else {
            c14127yE = c14124v.e(aFVar);
            iA = c13971aw.f().a(aFVar, c13971aw.g(), a(rectF));
        }
        c13972ax.f131748a = a(c13971aw, fSComposeAndroidComposeView, aFVar, z10, z11, c14127yE, iA, c13972ax2.f131748a, i10, rectF2, fSComposeLayoutNode._fsGetOuterCoordinator(), c14013ck);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(int[] iArr, C13972ax c13972ax) {
        iArr[0] = c13972ax.f131748a;
    }

    private static void a(StringBuilder[] sbArr, FSComposeAnnotatedString fSComposeAnnotatedString) {
        String str_fsGetText;
        if (fSComposeAnnotatedString == null || (str_fsGetText = fSComposeAnnotatedString._fsGetText()) == null) {
            return;
        }
        StringBuilder sb2 = sbArr[0];
        if (sb2 == null) {
            sb2 = new StringBuilder();
            sbArr[0] = sb2;
        } else if (sb2.length() > 0 && !Character.isWhitespace(sb2.charAt(sb2.length() - 1))) {
            sb2.append(" ");
        }
        sb2.append(str_fsGetText);
    }

    public static boolean a(Object obj, C13957ai c13957ai, Object obj2, boolean z10) {
        c13957ai.a(obj, obj2, z10);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(int[] iArr, C13972ax c13972ax) {
        iArr[0] = c13972ax.f131748a;
    }
}
