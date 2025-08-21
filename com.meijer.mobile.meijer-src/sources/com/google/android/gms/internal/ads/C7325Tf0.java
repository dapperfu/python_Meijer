package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.Tf0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7325Tf0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC7291Sf0 f71271a;

    private C7325Tf0(InterfaceC7291Sf0 interfaceC7291Sf0) {
        AbstractC9106of0 abstractC9106of0 = C8999nf0.f77955b;
        this.f71271a = interfaceC7291Sf0;
    }

    public static C7325Tf0 a(int i10) {
        return new C7325Tf0(new C7155Of0(4000));
    }

    public static C7325Tf0 b(AbstractC9106of0 abstractC9106of0) {
        return new C7325Tf0(new C7020Kf0(abstractC9106of0));
    }

    public static C7325Tf0 c(Pattern pattern) {
        C9747uf0 c9747uf0 = new C9747uf0(pattern);
        C6782Df0.i(!((C9640tf0) c9747uf0.a("")).f79448a.matches(), "The pattern may not match the empty string: %s", c9747uf0);
        return new C7325Tf0(new C7087Mf0(c9747uf0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Iterator g(CharSequence charSequence) {
        return this.f71271a.a(this, charSequence);
    }

    public final Iterable d(CharSequence charSequence) {
        charSequence.getClass();
        return new C7189Pf0(this, charSequence);
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
