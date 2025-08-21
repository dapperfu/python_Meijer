package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.d7;
import com.medallia.digital.mobilesdk.o8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import org.json.JSONException;

@SourceDebugExtension
/* loaded from: classes8.dex */
public final class e1 implements m8 {

    /* renamed from: c, reason: collision with root package name */
    private static boolean f92700c;

    /* renamed from: a, reason: collision with root package name */
    public static final e1 f92698a = new e1();

    /* renamed from: b, reason: collision with root package name */
    private static final ArrayList<CustomParameter> f92699b = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    private static List<? extends c1> f92701d = new ArrayList();

    private e1() {
    }

    private final CustomParameter b(String str, Object obj) {
        CustomParameter customParameter = new CustomParameter();
        if (!customParameter.a(str)) {
            a4.c("name can't be empty");
            return null;
        }
        if (!customParameter.a(obj)) {
            a4.c("Object is not a valid type(String, int, long, double, float, bool)");
            return null;
        }
        if (!f92700c || b(customParameter)) {
            return customParameter;
        }
        Intrinsics.g(str);
        a(str);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void c() {
        /*
            r7 = this;
            java.util.ArrayList<com.medallia.digital.mobilesdk.CustomParameter> r0 = com.medallia.digital.mobilesdk.e1.f92699b
            java.util.Iterator r0 = r0.iterator()
            java.lang.String r1 = "iterator(...)"
            kotlin.jvm.internal.Intrinsics.i(r0, r1)
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L80
            java.lang.Object r1 = r0.next()
            java.lang.String r2 = "next(...)"
            kotlin.jvm.internal.Intrinsics.i(r1, r2)
            com.medallia.digital.mobilesdk.CustomParameter r1 = (com.medallia.digital.mobilesdk.CustomParameter) r1
            com.medallia.digital.mobilesdk.CollectorsInfrastructure r2 = com.medallia.digital.mobilesdk.CollectorsInfrastructure.getInstance()
            java.lang.String r3 = "getName(...)"
            r4 = 1
            if (r2 == 0) goto L63
            java.util.HashMap r2 = r2.getCustomParametersMap()
            if (r2 == 0) goto L63
            java.lang.String r5 = r1.b()
            boolean r5 = r2.containsKey(r5)
            if (r5 == 0) goto L63
            java.lang.String r5 = r1.b()
            java.lang.Object r2 = r2.get(r5)
            com.medallia.digital.mobilesdk.CustomParameter r2 = (com.medallia.digital.mobilesdk.CustomParameter) r2
            if (r2 == 0) goto L46
            java.lang.Object r2 = r2.c()
            goto L47
        L46:
            r2 = 0
        L47:
            java.lang.Object r5 = r1.c()
            boolean r2 = kotlin.jvm.internal.Intrinsics.e(r5, r2)
            if (r2 == 0) goto L63
            com.medallia.digital.mobilesdk.e1 r2 = com.medallia.digital.mobilesdk.e1.f92698a
            java.lang.String r5 = r1.b()
            kotlin.jvm.internal.Intrinsics.i(r5, r3)
            java.lang.Object r6 = r1.c()
            r2.a(r5, r6)
            r2 = r4
            goto L64
        L63:
            r2 = 0
        L64:
            boolean r5 = com.medallia.digital.mobilesdk.e1.f92700c
            if (r5 == 0) goto L79
            boolean r5 = r7.b(r1)
            if (r5 != 0) goto L79
            java.lang.String r1 = r1.b()
            kotlin.jvm.internal.Intrinsics.i(r1, r3)
            r7.a(r1)
            goto L7a
        L79:
            r4 = r2
        L7a:
            if (r4 == 0) goto Lb
            r0.remove()
            goto Lb
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.e1.c():void");
    }

    private final void d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Set ");
        ArrayList<CustomParameter> arrayList = f92699b;
        sb2.append(arrayList.size());
        sb2.append(" custom parameters successfully\n");
        StringBuilder sb3 = new StringBuilder(sb2.toString());
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb3.append(f92699b.get(i10).e());
            sb3.append("\n");
        }
        a4.e(sb3.toString());
    }

    public final void a() {
        if (CollectorsInfrastructure.getInstance() != null && CollectorsInfrastructure.getInstance().isInitialized()) {
            CollectorsInfrastructure.getInstance().customParametersCollector.j();
            a4.e("Cleared custom parameters");
        }
        if (d7.b().a(d7.a.CUSTOM_PARAMETERS)) {
            a4.e("Cleared custom parameters from storage");
        } else {
            a4.c("Failed to clear custom parameters - storage is not initiated");
        }
    }

    @Override // com.medallia.digital.mobilesdk.m8
    public void clearAndDisconnect() {
        a4.a("CustomParameters");
        a();
        f92699b.clear();
    }

    private final void a(CustomParameter customParameter) {
        Object next;
        Iterator<T> it = f92699b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.e(((CustomParameter) next).b(), customParameter.b())) {
                    break;
                }
            }
        }
        CustomParameter customParameter2 = (CustomParameter) next;
        if (customParameter2 != null) {
            customParameter2.a(customParameter.c());
        } else {
            f92699b.add(customParameter);
        }
    }

    @JvmStatic
    public static final e1 b() {
        return f92698a;
    }

    private final void a(o8 o8Var) throws JSONException {
        if (o8Var instanceof o8.b) {
            CustomParameter customParameter = (CustomParameter) CollectionsKt.u0(f92699b);
            if (customParameter != null) {
                AnalyticsBridge.getInstance().reportSetCustomParameterEvent(customParameter.b());
                return;
            }
            return;
        }
        if (o8Var instanceof o8.c ? true : Intrinsics.e(o8Var, o8.a.f93527a)) {
            ArrayList<CustomParameter> arrayList = f92699b;
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.f(MapsKt.f(CollectionsKt.x(arrayList, 10)), 16));
            for (CustomParameter customParameter2 : arrayList) {
                Pair pairA = TuplesKt.a(customParameter2.b(), customParameter2.c());
                linkedHashMap.put(pairA.c(), pairA.d());
            }
            AnalyticsBridge.getInstance().reportSetCustomParametersEvent(linkedHashMap, Intrinsics.e(o8Var, o8.a.f93527a));
        }
    }

    private final boolean b(CustomParameter customParameter) {
        Object next;
        Iterator<T> it = f92701d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            c1 c1Var = (c1) next;
            if (Intrinsics.e(c1Var.a(), customParameter.b()) && c1Var.a(customParameter)) {
                break;
            }
        }
        return ((c1) next) != null;
    }

    private final void a(String str) {
        a4.c("Custom Parameter '" + str + "' is not attached to any form in the Command Center and cannot be set. Please make sure the parameter is attached to a form and try again.");
    }

    private final void a(String str, Object obj) {
        a4.c("Custom Parameter '" + str + "' with the value '" + obj + "' was already set in this session.");
    }

    public final void a(String str, Object obj, boolean z10) {
        CustomParameter customParameterB = b(str, obj);
        if (customParameterB != null) {
            e1 e1Var = f92698a;
            e1Var.a(customParameterB);
            e1Var.a(z10, o8.b.f93528a);
        }
    }

    public final void a(HashMap<String, Object> map, boolean z10) {
        if (map == null || map.isEmpty()) {
            a4.c("Hashmap is not valid");
            return;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            CustomParameter customParameterB = b(entry.getKey(), entry.getValue());
            if (customParameterB != null) {
                f92698a.a(customParameterB);
            }
        }
        a(z10, o8.c.f93529a);
    }

    public final void a(boolean z10, o8 caller) {
        Intrinsics.j(caller, "caller");
        ArrayList<CustomParameter> arrayList = f92699b;
        if (arrayList.isEmpty() || CollectorsInfrastructure.getInstance() == null || !CollectorsInfrastructure.getInstance().isInitialized() || !z10) {
            return;
        }
        c();
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator<CustomParameter> it = arrayList.iterator();
        while (it.hasNext()) {
            CollectorsInfrastructure.getInstance().customParametersCollector.a(it.next());
        }
        a(caller);
        d();
        f92699b.clear();
    }

    public final void a(boolean z10, List<? extends c1> attachedCustomParams) {
        Intrinsics.j(attachedCustomParams, "attachedCustomParams");
        f92700c = z10;
        f92701d = attachedCustomParams;
    }
}
