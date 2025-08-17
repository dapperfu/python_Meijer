package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.gf0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8127gf0 {

    /* renamed from: a, reason: collision with root package name */
    private static final C7913ef0 f74366a = new C7913ef0("PhoneskyVerificationUtils");

    public static boolean a(Context context) throws NoSuchAlgorithmException {
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                try {
                    Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                    if (signatureArr == null || (signatureArr.length) == 0) {
                        f74366a.d("Play Store package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (Signature signature : signatureArr) {
                            String strA = C8020ff0.a(signature.toByteArray());
                            arrayList.add(strA);
                            if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strA)) {
                                return true;
                            }
                            String str = Build.TAGS;
                            if ((str.contains("dev-keys") || str.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strA)) {
                                return true;
                            }
                        }
                        C7913ef0 c7913ef0 = f74366a;
                        StringBuilder sb2 = new StringBuilder();
                        Iterator it = arrayList.iterator();
                        if (it.hasNext()) {
                            while (true) {
                                sb2.append((CharSequence) it.next());
                                if (!it.hasNext()) {
                                    break;
                                }
                                sb2.append((CharSequence) ", ");
                            }
                        }
                        c7913ef0.d(String.format("Play Store package certs are not valid. Found these sha256 certs: [%s].", sb2.toString()), new Object[0]);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    f74366a.d("Play Store package is not found.", new Object[0]);
                }
            } else {
                f74366a.d("Play Store package is disabled.", new Object[0]);
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            f74366a.d("Play Store package is not found.", new Object[0]);
        }
        return false;
    }
}
