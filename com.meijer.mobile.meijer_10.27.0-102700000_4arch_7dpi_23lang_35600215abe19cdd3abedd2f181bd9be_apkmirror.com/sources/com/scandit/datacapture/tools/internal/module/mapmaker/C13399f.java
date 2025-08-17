package com.scandit.datacapture.tools.internal.module.mapmaker;

import java.util.Arrays;

/* renamed from: com.scandit.datacapture.tools.internal.module.mapmaker.f, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13399f {

    /* renamed from: a, reason: collision with root package name */
    public u f126235a;

    /* renamed from: b, reason: collision with root package name */
    public u f126236b;

    public final String toString() {
        O o10;
        String simpleName = C13399f.class.getSimpleName();
        O o11 = new O();
        u uVar = this.f126235a;
        if (uVar != null) {
            String strA = AbstractC13395b.a(uVar.toString());
            o10 = new O();
            o11.f126231c = o10;
            o10.f126230b = strA;
            o10.f126229a = "keyStrength";
        } else {
            o10 = o11;
        }
        u uVar2 = this.f126236b;
        if (uVar2 != null) {
            String strA2 = AbstractC13395b.a(uVar2.toString());
            O o12 = new O();
            o10.f126231c = o12;
            o12.f126230b = strA2;
            o12.f126229a = "valueStrength";
        }
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(simpleName);
        sb2.append('{');
        O o13 = o11.f126231c;
        String str = "";
        while (o13 != null) {
            Object obj = o13.f126230b;
            sb2.append(str);
            String str2 = o13.f126229a;
            if (str2 != null) {
                sb2.append(str2);
                sb2.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                String strDeepToString = Arrays.deepToString(new Object[]{obj});
                sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
            }
            o13 = o13.f126231c;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }
}
