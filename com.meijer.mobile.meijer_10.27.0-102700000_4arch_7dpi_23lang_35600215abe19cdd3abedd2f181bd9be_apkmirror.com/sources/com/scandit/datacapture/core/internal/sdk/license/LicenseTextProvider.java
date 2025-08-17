package com.scandit.datacapture.core.internal.sdk.license;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/license/LicenseTextProvider;", "", "Lcom/scandit/datacapture/core/internal/sdk/license/ModuleLicenseTextProvider;", "provider", "", "addLicenseTextProvider", "(Lcom/scandit/datacapture/core/internal/sdk/license/ModuleLicenseTextProvider;)V", "", "getLicenseText", "()Ljava/lang/String;", "licenseText", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class LicenseTextProvider {
    public static final LicenseTextProvider INSTANCE = new LicenseTextProvider();

    /* renamed from: a, reason: collision with root package name */
    private static final LinkedHashMap f125502a = new LinkedHashMap();

    public final void addLicenseTextProvider(ModuleLicenseTextProvider provider) {
        Intrinsics.j(provider, "provider");
        LinkedHashMap linkedHashMap = f125502a;
        linkedHashMap.remove(provider.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String());
        linkedHashMap.put(provider.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), provider);
    }

    public final String getLicenseText() {
        List listY0 = CollectionsKt.Y0(f125502a.keySet());
        ArrayList arrayList = new ArrayList();
        Iterator it = listY0.iterator();
        while (it.hasNext()) {
            ModuleLicenseTextProvider moduleLicenseTextProvider = (ModuleLicenseTextProvider) f125502a.get((String) it.next());
            if (moduleLicenseTextProvider != null) {
                arrayList.add(moduleLicenseTextProvider);
            }
        }
        return CollectionsKt.B0(arrayList, "\n\n", null, null, 0, null, a.f125503a, 30, null);
    }

    private LicenseTextProvider() {
    }
}
