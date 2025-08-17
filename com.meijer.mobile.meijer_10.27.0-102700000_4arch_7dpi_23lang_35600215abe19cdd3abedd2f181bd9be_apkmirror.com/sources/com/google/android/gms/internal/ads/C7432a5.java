package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.ads.a5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7432a5 {

    /* renamed from: c, reason: collision with root package name */
    private static final Comparator f72349c = new Comparator() { // from class: com.google.android.gms.internal.ads.Z4
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Integer.compare(((C7432a5) obj).f72350a.f72712b, ((C7432a5) obj2).f72350a.f72712b);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final C7539b5 f72350a;

    /* renamed from: b, reason: collision with root package name */
    private final int f72351b;

    /* synthetic */ C7432a5(C7539b5 c7539b5, int i10, C7858e5 c7858e5) {
        this.f72350a = c7539b5;
        this.f72351b = i10;
    }
}
