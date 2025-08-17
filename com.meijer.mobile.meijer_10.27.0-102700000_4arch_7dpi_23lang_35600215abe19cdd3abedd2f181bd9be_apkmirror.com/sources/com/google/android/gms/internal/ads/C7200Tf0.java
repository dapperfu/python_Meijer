package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.Tf0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7200Tf0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC7166Sf0 f70431a;

    private C7200Tf0(InterfaceC7166Sf0 interfaceC7166Sf0) {
        AbstractC8981of0 abstractC8981of0 = C8874nf0.f77115b;
        this.f70431a = interfaceC7166Sf0;
    }

    public static C7200Tf0 a(int i10) {
        return new C7200Tf0(new C7030Of0(4000));
    }

    public static C7200Tf0 b(AbstractC8981of0 abstractC8981of0) {
        return new C7200Tf0(new C6895Kf0(abstractC8981of0));
    }

    public static C7200Tf0 c(Pattern pattern) {
        C9622uf0 c9622uf0 = new C9622uf0(pattern);
        C6657Df0.i(!((C9515tf0) c9622uf0.a("")).f78608a.matches(), "The pattern may not match the empty string: %s", c9622uf0);
        return new C7200Tf0(new C6962Mf0(c9622uf0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Iterator g(CharSequence charSequence) {
        return this.f70431a.a(this, charSequence);
    }

    public final Iterable d(CharSequence charSequence) {
        charSequence.getClass();
        return new C7064Pf0(this, charSequence);
    }

    public final List f(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itG = g(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itG.hasNext()) {
            arrayList.add((String) itG.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
