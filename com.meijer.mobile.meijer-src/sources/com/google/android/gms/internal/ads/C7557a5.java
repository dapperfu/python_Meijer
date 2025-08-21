package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.ads.a5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7557a5 {

    /* renamed from: c, reason: collision with root package name */
    private static final Comparator f73189c = new Comparator() { // from class: com.google.android.gms.internal.ads.Z4
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Integer.compare(((C7557a5) obj).f73190a.f73552b, ((C7557a5) obj2).f73190a.f73552b);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final C7664b5 f73190a;

    /* renamed from: b, reason: collision with root package name */
    private final int f73191b;

    /* synthetic */ C7557a5(C7664b5 c7664b5, int i10, C7983e5 c7983e5) {
        this.f73190a = c7664b5;
        this.f73191b = i10;
    }
}
