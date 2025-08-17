package com.google.android.gms.internal.pal;

import Ic.a;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.pal.x3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10963x3 extends C10979y3 {

    /* renamed from: D, reason: collision with root package name */
    private a.C0217a f84198D;

    public static C10963x3 v(Context context) {
        C10979y3.t(context, true);
        return new C10963x3(context);
    }

    @Override // com.google.android.gms.internal.pal.C10979y3, com.google.android.gms.internal.pal.AbstractC10947w3
    protected final Ya h(Context context, View view, Activity activity) {
        return null;
    }

    @Override // com.google.android.gms.internal.pal.C10979y3, com.google.android.gms.internal.pal.AbstractC10947w3
    protected final Ya j(Context context, View view, Activity activity) {
        return null;
    }

    public final String w(String str, String str2) {
        byte[] bArrE = R2.e(str, str2, true);
        return bArrE != null ? N2.a(bArrE, true) : Integer.toString(7);
    }

    protected C10963x3(Context context) {
        super(context, "");
    }

    @Override // com.google.android.gms.internal.pal.C10979y3
    protected final List o(X3 x32, Context context, Ya ya2, C10679f6 c10679f6) {
        ArrayList arrayList = new ArrayList();
        if (x32.k() == null) {
            return arrayList;
        }
        arrayList.add(new C10853q4(x32, "ysEnh8zkgcN8WwINs5FP7vGybZW2TtVSX36HO6emvdUrcCkVbC9hrF5Pe5ZSZx3i", "3LpdW89cIASEFv5WvS5ZDEWsiVGQitP33SL3WZgJ6zE=", ya2, x32.a(), 24));
        return arrayList;
    }

    @Override // com.google.android.gms.internal.pal.C10979y3
    protected final void p(X3 x32, Context context, Ya ya2, C10679f6 c10679f6) throws InterruptedException {
        if (!x32.f82955m) {
            C10979y3.u(o(x32, context, ya2, c10679f6));
            return;
        }
        a.C0217a c0217a = this.f84198D;
        if (c0217a != null) {
            String strA = c0217a.a();
            if (!TextUtils.isEmpty(strA)) {
                ya2.t0(C10592a4.d(strA));
                ya2.V(6);
                ya2.s0(this.f84198D.b());
            }
            this.f84198D = null;
        }
    }

    public final void x(a.C0217a c0217a) {
        this.f84198D = c0217a;
    }
}
