package com.scandit.datacapture.core.internal.sdk.utils;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import com.scandit.datacapture.core.internal.sdk.AppAndroidEnvironment;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/utils/ResourceResolver;", "", "", "name", "type", "", "getResIdentifier", "(Ljava/lang/String;Ljava/lang/String;)I", "resId", "Ljava/io/InputStream;", "openRawResource", "(I)Ljava/io/InputStream;", "getStringResIdentifier", "(Ljava/lang/String;)I", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class ResourceResolver {
    public static final ResourceResolver INSTANCE = new ResourceResolver();

    @SuppressLint({"DiscouragedApi"})
    public final int getResIdentifier(String name, String type) {
        Intrinsics.j(name, "name");
        Intrinsics.j(type, "type");
        AppAndroidEnvironment appAndroidEnvironment = AppAndroidEnvironment.INSTANCE;
        return appAndroidEnvironment.getApplicationContext().getResources().getIdentifier(name, type, appAndroidEnvironment.getApplicationContext().getPackageName());
    }

    public final int getStringResIdentifier(String name) {
        Intrinsics.j(name, "name");
        return getResIdentifier(name, "string");
    }

    public final InputStream openRawResource(int resId) throws Resources.NotFoundException {
        InputStream inputStreamOpenRawResource = AppAndroidEnvironment.INSTANCE.getApplicationContext().getResources().openRawResource(resId);
        Intrinsics.i(inputStreamOpenRawResource, "openRawResource(...)");
        return inputStreamOpenRawResource;
    }

    private ResourceResolver() {
    }
}
