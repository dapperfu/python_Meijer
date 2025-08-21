package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.vh0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9858vh0 {
    public static ArrayList a(int i10) {
        C6682Ag0.a(i10, "initialArraySize");
        return new ArrayList(i10);
    }

    public static List b(List list, InterfaceC9533sf0 interfaceC9533sf0) {
        return list instanceof RandomAccess ? new C9537sh0(list, interfaceC9533sf0) : new C9751uh0(list, interfaceC9533sf0);
    }
}
