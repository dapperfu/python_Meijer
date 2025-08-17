package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import bf.C6245c;
import cg.h;
import com.google.firebase.components.ComponentRegistrar;
import com.scandit.datacapture.core.source.CameraSettings;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static /* synthetic */ String d(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? CameraSettings.FOCUS_STRATEGY_AUTO : (Build.VERSION.SDK_INT < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded";
    }

    private static String e(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C6245c<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(cg.c.c());
        arrayList.add(Gf.f.g());
        arrayList.add(cg.h.b("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(cg.h.b("fire-core", "22.0.0"));
        arrayList.add(cg.h.b("device-name", e(Build.PRODUCT)));
        arrayList.add(cg.h.b("device-model", e(Build.DEVICE)));
        arrayList.add(cg.h.b("device-brand", e(Build.BRAND)));
        arrayList.add(cg.h.c("android-target-sdk", new h.a() { // from class: com.google.firebase.h
            @Override // cg.h.a
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.c((Context) obj);
            }
        }));
        arrayList.add(cg.h.c("android-min-sdk", new h.a() { // from class: com.google.firebase.i
            @Override // cg.h.a
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.b((Context) obj);
            }
        }));
        arrayList.add(cg.h.c("android-platform", new h.a() { // from class: com.google.firebase.j
            @Override // cg.h.a
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.d((Context) obj);
            }
        }));
        arrayList.add(cg.h.c("android-installer", new h.a() { // from class: com.google.firebase.k
            @Override // cg.h.a
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.a((Context) obj);
            }
        }));
        String strA = cg.e.a();
        if (strA != null) {
            arrayList.add(cg.h.b("kotlin", strA));
        }
        return arrayList;
    }

    public static /* synthetic */ String a(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        if (installerPackageName != null) {
            return e(installerPackageName);
        }
        return "";
    }

    public static /* synthetic */ String b(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo != null) {
            return String.valueOf(applicationInfo.minSdkVersion);
        }
        return "";
    }

    public static /* synthetic */ String c(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo != null) {
            return String.valueOf(applicationInfo.targetSdkVersion);
        }
        return "";
    }
}
