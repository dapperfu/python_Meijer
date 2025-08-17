package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.f20, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7960f20 implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final Xj0 f74018a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f74019b;

    public C7960f20(Xj0 xj0, Context context) {
        this.f74018a = xj0;
        this.f74019b = context;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 38;
    }

    private static ResolveInfo b(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final /* synthetic */ com.google.android.gms.internal.ads.C7747d20 a() throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7960f20.a():com.google.android.gms.internal.ads.d20");
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        return this.f74018a.i0(new Callable() { // from class: com.google.android.gms.internal.ads.e20
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f73745a.a();
            }
        });
    }
}
