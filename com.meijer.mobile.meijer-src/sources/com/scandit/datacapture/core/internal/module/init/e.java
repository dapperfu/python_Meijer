package com.scandit.datacapture.core.internal.module.init;

import android.content.Context;
import com.scandit.datacapture.core.internal.sdk.AppAndroidEnvironment;
import com.scandit.datacapture.core.internal.sdk.init.LibraryLoaderInternal;
import com.scandit.datacapture.core.internal.sdk.init.LoadMethod;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes12.dex */
public final class e implements LibraryLoaderInternal {

    /* renamed from: a, reason: collision with root package name */
    public final Context f125706a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f125707b;

    /* renamed from: c, reason: collision with root package name */
    public final StringBuilder f125708c;

    /* renamed from: d, reason: collision with root package name */
    public final List f125709d;

    /* renamed from: e, reason: collision with root package name */
    public final File f125710e;

    /* renamed from: f, reason: collision with root package name */
    public final File f125711f;

    /* renamed from: g, reason: collision with root package name */
    public final String f125712g;

    /* renamed from: h, reason: collision with root package name */
    public final File f125713h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f125714i;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f125715j;

    @Override // com.scandit.datacapture.core.internal.sdk.init.LibraryLoader
    public final synchronized Map getLoadedLibs() {
        return this.f125715j;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.init.LibraryLoader
    public final synchronized boolean getWorkaroundApplied() {
        boolean z10;
        Map loadedLibs = getLoadedLibs();
        if (!loadedLibs.isEmpty()) {
            Iterator it = ((LinkedHashMap) loadedLibs).entrySet().iterator();
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() != LoadMethod.BY_SO_NAME) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        return z10;
    }

    public e(Context context, boolean z10) {
        Intrinsics.j(context, "context");
        this.f125706a = context;
        this.f125707b = z10;
        StringBuilder sb2 = new StringBuilder();
        this.f125708c = sb2;
        AppAndroidEnvironment appAndroidEnvironment = AppAndroidEnvironment.INSTANCE;
        List listH1 = ArraysKt.h1(appAndroidEnvironment.getSupportedAbis());
        this.f125709d = listH1;
        String strA = f.a(context);
        File file = new File(strA);
        this.f125710e = file;
        File file2 = new File(file, "lib");
        this.f125711f = file2;
        this.f125712g = file2.getAbsolutePath();
        File fileB = f.b(context);
        this.f125713h = fileB;
        String absolutePath = fileB.getAbsolutePath();
        this.f125715j = new LinkedHashMap();
        a("----------------------------------------");
        a("Base data");
        a("\tarchs -> " + CollectionsKt.B0(listH1, null, null, null, 0, null, null, 63, null));
        a("\tinstaller info -> " + appAndroidEnvironment.getInstallerInfo(context));
        a("\tinstallPath -> " + strA);
        a("\textractionLibPath -> " + absolutePath);
        a("----------------------------------------");
        a("Installation dir content:");
        StringBuilder sbA = h.a(sb2, file, 0);
        sbA.append('\n');
        Intrinsics.i(sbA, "append(...)");
        a("----------------------------------------");
    }

    public final void a(String str) {
        StringBuilder sb2 = this.f125708c;
        sb2.append(str);
        Intrinsics.i(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.i(sb2, "append(...)");
    }

    @Override // com.scandit.datacapture.core.internal.sdk.init.LibraryLoader
    public final String buildLogs() {
        String string = this.f125708c.toString();
        Intrinsics.i(string, "toString(...)");
        return string;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.init.LibraryLoader
    public final void clearLogs() {
        StringsKt.q(this.f125708c);
    }

    @Override // com.scandit.datacapture.core.internal.sdk.init.LibraryLoaderInternal
    public final boolean getLoadingFailed() {
        return this.f125714i;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0337 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x0005, B:6:0x0014, B:8:0x0020, B:11:0x0027, B:12:0x002a, B:16:0x0032, B:69:0x031a, B:71:0x0337, B:74:0x033e, B:75:0x0382, B:76:0x0383, B:19:0x005d, B:20:0x0061, B:22:0x0067, B:24:0x00ac, B:26:0x00b7, B:28:0x0133, B:53:0x0228, B:55:0x024f, B:56:0x0259, B:58:0x029f, B:59:0x02b6, B:61:0x02bc, B:64:0x02ee, B:66:0x02fa, B:29:0x014b, B:31:0x0151, B:32:0x0167, B:34:0x016b, B:37:0x0173, B:38:0x0177, B:40:0x017d, B:42:0x01a7, B:44:0x01c9, B:46:0x01cf, B:49:0x01fd, B:52:0x020a, B:23:0x0095, B:48:0x01e1, B:63:0x02d1), top: B:81:0x0005, inners: #1, #2, #3 }] */
    @Override // com.scandit.datacapture.core.internal.sdk.init.LibraryLoaderInternal
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean loadLibsIfNeeded(java.lang.String... r17) {
        /*
            Method dump skipped, instructions count: 908
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.core.internal.module.init.e.loadLibsIfNeeded(java.lang.String[]):boolean");
    }
}
