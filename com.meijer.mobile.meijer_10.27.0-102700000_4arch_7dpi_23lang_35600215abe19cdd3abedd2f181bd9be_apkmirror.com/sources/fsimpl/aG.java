package fsimpl;

import android.content.res.Resources;
import android.view.View;
import com.fullstory.instrumentation.frameworks.compose.FSAttribute;
import com.fullstory.instrumentation.frameworks.compose.FSClass;
import com.fullstory.instrumentation.frameworks.compose.FSClickModifier;
import com.fullstory.instrumentation.frameworks.compose.FSComposeFocusChangedElement;
import com.fullstory.instrumentation.frameworks.compose.FSComposeFocusChangedListener;
import com.fullstory.instrumentation.frameworks.compose.FSComposeFocusTargetElement;
import com.fullstory.instrumentation.frameworks.compose.FSComposeImeOptions;
import com.fullstory.instrumentation.frameworks.compose.FSComposeLayoutIdElement;
import com.fullstory.instrumentation.frameworks.compose.FSComposeLayoutNode;
import com.fullstory.instrumentation.frameworks.compose.FSComposeModifier;
import com.fullstory.instrumentation.frameworks.compose.FSComposeRole;
import com.fullstory.instrumentation.frameworks.compose.FSComposeSemanticsConfiguration;
import com.fullstory.instrumentation.frameworks.compose.FSComposeSemanticsModifier;
import com.fullstory.instrumentation.frameworks.compose.FSId;
import com.fullstory.instrumentation.frameworks.compose.FSTag;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes14.dex */
public class aG {

    /* renamed from: a, reason: collision with root package name */
    private static final Map f131468a = new WeakHashMap();

    /* renamed from: b, reason: collision with root package name */
    private static final Set f131469b = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: c, reason: collision with root package name */
    private static final Field f131470c;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f131471d;

    static {
        f131470c = C13993br.e() ? fT.a(C13993br.f131870a, "componentName") : null;
    }

    public static FSClickModifier a(FSComposeModifier fSComposeModifier) {
        final FSClickModifier[] fSClickModifierArr = new FSClickModifier[1];
        bG.a(fSComposeModifier, new bH() { // from class: fsimpl.aG$$ExternalSyntheticLambda0
            @Override // fsimpl.bH
            public final void accept(FSComposeModifier fSComposeModifier2) {
                aG.a(fSClickModifierArr, fSComposeModifier2);
            }
        });
        return fSClickModifierArr[0];
    }

    public static aF a(FSComposeLayoutNode fSComposeLayoutNode, bC bCVar, InterfaceC14000by interfaceC14000by) {
        InterfaceC14001bz interfaceC14001bzA;
        List listA = bCVar.a(fSComposeLayoutNode);
        aF aFVarA = null;
        if (listA != null && !listA.isEmpty()) {
            boolean zB = b(fSComposeLayoutNode, bCVar, interfaceC14000by);
            boolean z10 = true;
            for (int size = listA.size() - 1; size >= 0; size--) {
                Integer num = (Integer) listA.get(size);
                if (num != null && (interfaceC14001bzA = interfaceC14000by.a(num.intValue())) != null) {
                    boolean z11 = false;
                    if (interfaceC14001bzA.e()) {
                        zB = false;
                        z10 = false;
                    } else {
                        boolean zA = a(interfaceC14001bzA);
                        boolean z12 = (z10 && zA && !zB) ? false : true;
                        if (z12 && interfaceC14001bzA.d()) {
                            z11 = true;
                        }
                        if (z12) {
                            aK aKVar = new aK();
                            String strC = interfaceC14001bzA.c();
                            if (strC != null) {
                                strC = strC.toLowerCase();
                            }
                            aKVar.f131485a = strC;
                            aKVar.f131489e = interfaceC14001bzA.a();
                            aKVar.f131490f = interfaceC14001bzA.b();
                            aFVarA = aF.a(fSComposeLayoutNode, aKVar, aFVarA, num.intValue());
                        }
                        z10 = zA;
                        zB = z11;
                    }
                }
            }
        }
        return aFVarA;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x0093. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static fsimpl.aK a(android.view.View r5, fsimpl.aL r6) {
        /*
            fsimpl.aK r0 = new fsimpl.aK
            r0.<init>()
            java.lang.String r1 = c(r5)
            r0.f131485a = r1
            java.lang.String r1 = b(r5)
            r0.f131490f = r1
            java.lang.String r1 = a(r5)
            r0.f131486b = r1
            java.lang.Object r1 = r5.getTag()
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L38
            java.lang.String r1 = (java.lang.String) r1
            r0.a()
            java.util.Map r2 = r0.f131488d
            java.lang.String r3 = "tag"
            r2.put(r3, r1)
            boolean r2 = fsimpl.C13993br.e(r5)
            if (r2 == 0) goto L38
            java.util.Map r2 = r0.f131488d
            java.lang.String r3 = "testid"
            r2.put(r3, r1)
        L38:
            boolean r1 = fsimpl.aG.f131471d
            r2 = 1
            if (r1 != 0) goto L66
            boolean r1 = fsimpl.C13993br.e()
            if (r1 == 0) goto L66
            boolean r1 = fsimpl.C13993br.c(r5)
            if (r1 == 0) goto L66
            java.lang.reflect.Field r1 = fsimpl.aG.f131470c
            if (r1 == 0) goto L66
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L5e
            r0.a()     // Catch: java.lang.Throwable -> L5e
            java.util.Map r3 = r0.f131488d     // Catch: java.lang.Throwable -> L5e
            java.lang.String r4 = "screen-name"
            r3.put(r4, r1)     // Catch: java.lang.Throwable -> L5e
            goto L66
        L5e:
            r1 = move-exception
            fsimpl.aG.f131471d = r2
            java.lang.String r3 = "Failed to retrieve React Native Navigation component information."
            com.fullstory.util.Log.e(r3, r1)
        L66:
            r6.a(r5, r0)
            boolean r6 = r5 instanceof android.widget.TextView
            if (r6 == 0) goto Lb1
            android.widget.TextView r5 = (android.widget.TextView) r5
            android.text.style.URLSpan[] r6 = r5.getUrls()
            int r1 = r6.length
            if (r1 <= 0) goto L7f
            r1 = 0
            r6 = r6[r1]
            java.lang.String r6 = r6.getURL()
            r0.f131491g = r6
        L7f:
            android.text.method.TransformationMethod r6 = r5.getTransformationMethod()
            boolean r6 = r6 instanceof android.text.method.PasswordTransformationMethod
            r1 = 4
            if (r6 == 0) goto L8b
        L88:
            r0.f131492h = r1
            goto Lb1
        L8b:
            int r5 = r5.getInputType()
            r6 = r5 & 15
            r5 = r5 & 4080(0xff0, float:5.717E-42)
            switch(r6) {
                case 0: goto Lac;
                case 1: goto La4;
                case 2: goto L9d;
                case 3: goto L99;
                case 4: goto L97;
                default: goto L96;
            }
        L96:
            goto Lb1
        L97:
            r5 = 5
            goto L9a
        L99:
            r5 = 7
        L9a:
            r0.f131492h = r5
            goto Lb1
        L9d:
            r6 = 16
            if (r5 != r6) goto La2
            goto L88
        La2:
            r5 = 6
            goto L9a
        La4:
            switch(r5) {
                case 16: goto Laa;
                case 32: goto La8;
                case 128: goto L88;
                case 144: goto L88;
                case 208: goto La8;
                case 224: goto L88;
                default: goto La7;
            }
        La7:
            goto Laf
        La8:
            r5 = 2
            goto L9a
        Laa:
            r5 = 3
            goto L9a
        Lac:
            switch(r5) {
                case 16: goto L88;
                case 128: goto L88;
                case 144: goto L88;
                case 224: goto L88;
                default: goto Laf;
            }
        Laf:
            r0.f131492h = r2
        Lb1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: fsimpl.aG.a(android.view.View, fsimpl.aL):fsimpl.aK");
    }

    public static aK a(FSComposeLayoutNode fSComposeLayoutNode, C14013ck c14013ck) {
        aK aKVar = new aK();
        aKVar.f131485a = b(fSComposeLayoutNode);
        aKVar.f131490f = a(fSComposeLayoutNode);
        FSComposeModifier fSComposeModifier_fsGetModifier = fSComposeLayoutNode._fsGetModifier();
        boolean z10 = true;
        if (fSComposeModifier_fsGetModifier != null) {
            String str = null;
            aJ aJVar = new aJ(null);
            if (!a(fSComposeLayoutNode, fSComposeModifier_fsGetModifier, aJVar, c14013ck)) {
                aKVar.a(true);
            }
            int iX = c14013ck.x();
            aKVar.f131492h = aJVar.f131479e;
            aKVar.b(aJVar.f131480f);
            aKVar.c(aJVar.f131481g);
            aKVar.d(!aJVar.f131482h);
            aKVar.e(aJVar.f131483i);
            aKVar.f(aJVar.f131484j);
            if (aJVar.f131478d != null) {
                for (Map.Entry entry : aJVar.f131478d.entrySet()) {
                    aKVar.a();
                    aKVar.f131488d.put(((String) entry.getKey()).toLowerCase(), (String) entry.getValue());
                }
            }
            if (aJVar.f131477c != null) {
                for (String str2 : aJVar.f131477c) {
                    aKVar.b();
                    aKVar.f131487c.add(str2);
                }
            }
            if (aJVar.f131475a != null) {
                boolean z11 = true;
                for (String str3 : aJVar.f131475a) {
                    if (iX < 2) {
                        if (z11) {
                            aKVar.f131486b = str3;
                            z11 = false;
                        } else {
                            str3 = aKVar.f131486b + "__" + str3;
                        }
                    }
                    aKVar.f131486b = str3;
                }
            }
            if (aJVar.f131476b != null) {
                for (String str4 : aJVar.f131476b) {
                    if (iX < 2) {
                        if (z10) {
                            str = str4;
                            z10 = false;
                        } else {
                            str4 = str + "__" + str4;
                        }
                    }
                    str = str4;
                }
                if (str != null) {
                    aKVar.a();
                    if (iX >= 2) {
                        aKVar.f131485a = str.toLowerCase();
                    } else {
                        aKVar.f131488d.put("tag", str);
                    }
                }
            }
        } else {
            aKVar.a(true);
        }
        return aKVar;
    }

    public static String a(View view) {
        int id2 = view != null ? view.getId() : -1;
        String resourceEntryName = null;
        if (id2 == -1 || C13993br.e(view)) {
            return null;
        }
        Map map = f131468a;
        synchronized (map) {
            aI aIVar = (aI) map.get(view);
            if (aIVar != null) {
                if (id2 == aIVar.f131473a) {
                    return aIVar.f131474b;
                }
                map.remove(view);
            }
            try {
                Resources resources = view.getResources();
                if (resources != null) {
                    resourceEntryName = resources.getResourceEntryName(id2);
                }
            } catch (Resources.NotFoundException e10) {
            }
            f131468a.put(view, new aI(id2, resourceEntryName));
            return resourceEntryName;
        }
    }

    public static String a(Object obj) {
        Package r22;
        if (obj == null || (obj instanceof FSComposeLayoutNode) || (r22 = obj.getClass().getPackage()) == null) {
            return null;
        }
        return r22.getName();
    }

    public static void a() {
        Map map = f131468a;
        synchronized (map) {
            map.clear();
        }
    }

    private static void a(FSComposeFocusChangedElement fSComposeFocusChangedElement, aJ aJVar) {
        FSComposeImeOptions fSComposeImeOptions_fsGetImeOptions;
        byte b10;
        FSComposeFocusChangedListener fSComposeFocusChangedListener_fsGetFocusChangedListener = fSComposeFocusChangedElement._fsGetFocusChangedListener();
        if (fSComposeFocusChangedListener_fsGetFocusChangedListener == null || (fSComposeImeOptions_fsGetImeOptions = fSComposeFocusChangedListener_fsGetFocusChangedListener._fsGetImeOptions()) == null) {
            return;
        }
        switch (aH.f131472a[fSComposeImeOptions_fsGetImeOptions._fsGetKeyboardType().ordinal()]) {
            case 1:
            case 2:
                b10 = 6;
                break;
            case 3:
                b10 = 7;
                break;
            case 4:
                b10 = 3;
                break;
            case 5:
                b10 = 2;
                break;
            case 6:
            case 7:
                b10 = 4;
                break;
            case 8:
                return;
            default:
                b10 = 1;
                break;
        }
        aJVar.f131479e = b10;
    }

    private static void a(FSComposeLayoutNode fSComposeLayoutNode, FSComposeSemanticsConfiguration fSComposeSemanticsConfiguration, aJ aJVar, boolean[] zArr, int i10) {
        if (fSComposeSemanticsConfiguration == null) {
            return;
        }
        b(fSComposeLayoutNode, fSComposeSemanticsConfiguration, aJVar, zArr, i10);
        b(fSComposeSemanticsConfiguration, aJVar, zArr, i10);
        a(fSComposeSemanticsConfiguration, aJVar, zArr, i10);
        a(fSComposeSemanticsConfiguration, aJVar);
        b(fSComposeSemanticsConfiguration, aJVar);
        c(fSComposeSemanticsConfiguration, aJVar, zArr, i10);
        d(fSComposeSemanticsConfiguration, aJVar, zArr, i10);
    }

    private static void a(FSComposeSemanticsConfiguration fSComposeSemanticsConfiguration, aJ aJVar) {
        if (aJVar.f131482h) {
            return;
        }
        aJVar.f131482h = fSComposeSemanticsConfiguration._fsIsDisabled();
    }

    private static void a(FSComposeSemanticsConfiguration fSComposeSemanticsConfiguration, aJ aJVar, boolean[] zArr, int i10) {
        if (i10 >= 3 && aJVar.f131479e != 4) {
            if (fSComposeSemanticsConfiguration._fsIsTextField() || fSComposeSemanticsConfiguration._fsGetText() != null) {
                zArr[0] = true;
                if (aJVar.f131479e == 0) {
                    aJVar.f131479e = (byte) 1;
                }
                if (aJVar.f131480f) {
                    return;
                }
                aJVar.f131480f = fSComposeSemanticsConfiguration._fsIsTextField();
            }
        }
    }

    private static void a(aJ aJVar, String str, String str2) {
        if (aJVar.f131478d == null) {
            aJVar.f131478d = new HashMap();
        }
        aJVar.f131478d.put(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(FSClickModifier[] fSClickModifierArr, FSComposeModifier fSComposeModifier) {
        if (fSClickModifierArr[0] == null && (fSComposeModifier instanceof FSClickModifier)) {
            fSClickModifierArr[0] = (FSClickModifier) fSComposeModifier;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(boolean[] zArr, aJ aJVar, FSComposeLayoutNode fSComposeLayoutNode, C14013ck c14013ck, int i10, FSComposeModifier fSComposeModifier) {
        String str_fsGetValue;
        String str_fsGetName;
        String str_fsGetTag;
        List list;
        if (!(fSComposeModifier instanceof FSAttribute)) {
            if (fSComposeModifier instanceof FSClass) {
                zArr[0] = true;
                str_fsGetTag = ((FSClass) fSComposeModifier)._fsGetClass();
                if (str_fsGetTag == null) {
                    return;
                }
                if (aJVar.f131477c == null) {
                    aJVar.f131477c = new ArrayList();
                }
                list = aJVar.f131477c;
            } else if (fSComposeModifier instanceof FSId) {
                zArr[0] = true;
                str_fsGetTag = ((FSId) fSComposeModifier)._fsGetId();
                if (str_fsGetTag == null) {
                    return;
                }
                if (aJVar.f131475a == null) {
                    aJVar.f131475a = new ArrayList();
                }
                list = aJVar.f131475a;
            } else if (fSComposeModifier instanceof FSTag) {
                zArr[0] = true;
                str_fsGetTag = ((FSTag) fSComposeModifier)._fsGetTag();
                if (str_fsGetTag == null) {
                    return;
                }
                if (aJVar.f131476b == null) {
                    aJVar.f131476b = new ArrayList();
                }
                list = aJVar.f131476b;
            } else {
                if (fSComposeModifier instanceof FSClickModifier) {
                    aJVar.f131481g = true;
                    ((FSClickModifier) fSComposeModifier)._fsSetLayoutNode(new WeakReference(fSComposeLayoutNode));
                    return;
                }
                if (fSComposeModifier instanceof FSComposeSemanticsModifier) {
                    if (c14013ck.A()) {
                        return;
                    }
                    a(fSComposeLayoutNode, fSComposeLayoutNode._fsGetSemanticsConfiguration((FSComposeSemanticsModifier) fSComposeModifier), aJVar, zArr, i10);
                    return;
                }
                if (fSComposeModifier instanceof FSComposeFocusChangedElement) {
                    if (aJVar.f131479e != 4) {
                        a((FSComposeFocusChangedElement) fSComposeModifier, aJVar);
                        if (aJVar.f131479e != 0) {
                            if (i10 >= 3) {
                                zArr[0] = true;
                            }
                            if (aJVar.f131479e == 4) {
                                f131469b.add(fSComposeLayoutNode);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (fSComposeModifier instanceof FSComposeFocusTargetElement) {
                    aJVar.f131483i = true;
                    return;
                }
                if (!(fSComposeModifier instanceof FSComposeLayoutIdElement)) {
                    return;
                }
                Object obj_fsGetLayoutId = ((FSComposeLayoutIdElement) fSComposeModifier).getLayoutId();
                if (!(obj_fsGetLayoutId instanceof String)) {
                    return;
                }
                str_fsGetValue = (String) obj_fsGetLayoutId;
                if (fY.b(str_fsGetValue)) {
                    return;
                }
                if (i10 >= 5) {
                    zArr[0] = true;
                }
                str_fsGetName = "layout-id";
            }
            list.add(str_fsGetTag);
            return;
        }
        zArr[0] = true;
        FSAttribute fSAttribute = (FSAttribute) fSComposeModifier;
        str_fsGetName = fSAttribute._fsGetName();
        str_fsGetValue = fSAttribute._fsGetValue();
        if (str_fsGetName == null) {
            return;
        }
        a(aJVar, str_fsGetName, str_fsGetValue);
    }

    public static boolean a(final FSComposeLayoutNode fSComposeLayoutNode, FSComposeModifier fSComposeModifier, final aJ aJVar, final C14013ck c14013ck) {
        final int iX = c14013ck.x();
        final boolean[] zArr = new boolean[1];
        if (f131469b.contains(fSComposeLayoutNode)) {
            if (iX >= 3) {
                zArr[0] = true;
            }
            aJVar.f131479e = (byte) 4;
        }
        bG.a(fSComposeModifier, new bH() { // from class: fsimpl.aG$$ExternalSyntheticLambda1
            @Override // fsimpl.bH
            public final void accept(FSComposeModifier fSComposeModifier2) {
                aG.a(zArr, aJVar, fSComposeLayoutNode, c14013ck, iX, fSComposeModifier2);
            }
        });
        if (c14013ck.A() && fSComposeLayoutNode._fsIsAttached()) {
            a(fSComposeLayoutNode, fSComposeLayoutNode._fsGetCollapsedSemantics(), aJVar, zArr, iX);
        }
        return zArr[0];
    }

    private static boolean a(InterfaceC14001bz interfaceC14001bz) {
        String strA = interfaceC14001bz.a();
        return strA != null && strA.startsWith("androidx.compose.");
    }

    public static String b(View view) {
        return a((Object) view);
    }

    private static String b(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj instanceof FSComposeLayoutNode ? "compose" : obj.getClass().getSimpleName().toLowerCase();
    }

    private static void b(FSComposeLayoutNode fSComposeLayoutNode, FSComposeSemanticsConfiguration fSComposeSemanticsConfiguration, aJ aJVar, boolean[] zArr, int i10) {
        if (aJVar.f131479e == 4 || !fSComposeSemanticsConfiguration._fsIsPassword()) {
            return;
        }
        if (i10 >= 3) {
            zArr[0] = true;
        }
        aJVar.f131479e = (byte) 4;
        f131469b.add(fSComposeLayoutNode);
    }

    private static void b(FSComposeSemanticsConfiguration fSComposeSemanticsConfiguration, aJ aJVar) {
        if (aJVar.f131484j) {
            return;
        }
        aJVar.f131484j = fSComposeSemanticsConfiguration._fsIsFocused();
    }

    private static void b(FSComposeSemanticsConfiguration fSComposeSemanticsConfiguration, aJ aJVar, boolean[] zArr, int i10) {
        FSComposeRole fSComposeRole_fsGetRole;
        if (i10 >= 2 && (fSComposeRole_fsGetRole = fSComposeSemanticsConfiguration._fsGetRole()) != null) {
            zArr[0] = true;
            a(aJVar, i10 < 4 ? "semantic_role" : "semantic-role", fSComposeRole_fsGetRole.toString().toLowerCase(Locale.US));
        }
    }

    private static boolean b(FSComposeLayoutNode fSComposeLayoutNode, bC bCVar, InterfaceC14000by interfaceC14000by) {
        InterfaceC14001bz interfaceC14001bzA;
        while (fSComposeLayoutNode._fsGetParent() != null) {
            fSComposeLayoutNode = fSComposeLayoutNode._fsGetParent();
            List listA = bCVar.a(fSComposeLayoutNode);
            if (listA != null) {
                for (int i10 = 0; i10 < listA.size(); i10++) {
                    Integer num = (Integer) listA.get(i10);
                    if (num != null && (interfaceC14001bzA = interfaceC14000by.a(num.intValue())) != null) {
                        if (!a(interfaceC14001bzA)) {
                            return true;
                        }
                        if (!interfaceC14001bzA.d()) {
                            return false;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static String c(View view) {
        return b((Object) view);
    }

    private static void c(FSComposeSemanticsConfiguration fSComposeSemanticsConfiguration, aJ aJVar, boolean[] zArr, int i10) {
        Object obj_fsGetTestTag = fSComposeSemanticsConfiguration._fsGetTestTag();
        if (obj_fsGetTestTag instanceof String) {
            String str = (String) obj_fsGetTestTag;
            if (fY.b(str)) {
                return;
            }
            if (i10 >= 4) {
                zArr[0] = true;
            }
            a(aJVar, "test-tag", str);
        }
    }

    private static void d(FSComposeSemanticsConfiguration fSComposeSemanticsConfiguration, aJ aJVar, boolean[] zArr, int i10) {
        List list_fsGetContentDescription = fSComposeSemanticsConfiguration._fsGetContentDescription();
        if (list_fsGetContentDescription == null || list_fsGetContentDescription.isEmpty()) {
            return;
        }
        String str = (String) list_fsGetContentDescription.get(0);
        if (fY.b(str)) {
            return;
        }
        if (i10 >= 4) {
            zArr[0] = true;
        }
        a(aJVar, "content-description", str);
    }
}
